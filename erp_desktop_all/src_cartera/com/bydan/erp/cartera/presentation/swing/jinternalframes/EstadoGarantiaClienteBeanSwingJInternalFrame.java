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

import com.bydan.erp.cartera.util.EstadoGarantiaClienteConstantesFunciones;
import com.bydan.erp.cartera.util.EstadoGarantiaClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.EstadoGarantiaClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.EstadoGarantiaClienteBean;
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
public class EstadoGarantiaClienteBeanSwingJInternalFrame extends EstadoGarantiaClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoGarantiaClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoGarantiaCliente> estadogarantiaclienteValidator = new ClassValidator<EstadoGarantiaCliente>(EstadoGarantiaCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoGarantiaCliente estadogarantiacliente;	
	public EstadoGarantiaCliente estadogarantiaclienteAux;
	public EstadoGarantiaCliente estadogarantiaclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoGarantiaCliente estadogarantiaclienteTotales;
	public Long idEstadoGarantiaClienteActual;
	public Long iIdNuevoEstadoGarantiaCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosGarantiaCliente=false;

	public Boolean getIsTienePermisosGarantiaCliente() {
		return isTienePermisosGarantiaCliente;
	}

	public void setIsTienePermisosGarantiaCliente(Boolean isTienePermisosGarantiaCliente) {
		this.isTienePermisosGarantiaCliente= isTienePermisosGarantiaCliente;
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
	
	public Boolean isPermisoTodoEstadoGarantiaCliente;
	public Boolean isPermisoNuevoEstadoGarantiaCliente;
	public Boolean isPermisoActualizarEstadoGarantiaCliente;
	public Boolean isPermisoActualizarOriginalEstadoGarantiaCliente;
	public Boolean isPermisoEliminarEstadoGarantiaCliente;
	public Boolean isPermisoGuardarCambiosEstadoGarantiaCliente;
	public Boolean isPermisoConsultaEstadoGarantiaCliente;
	public Boolean isPermisoBusquedaEstadoGarantiaCliente;
	public Boolean isPermisoReporteEstadoGarantiaCliente;
	public Boolean isPermisoPaginacionMedioEstadoGarantiaCliente;
	public Boolean isPermisoPaginacionAltoEstadoGarantiaCliente;
	public Boolean isPermisoPaginacionTodoEstadoGarantiaCliente;
	public Boolean isPermisoCopiarEstadoGarantiaCliente;
	public Boolean isPermisoVerFormEstadoGarantiaCliente;
	public Boolean isPermisoDuplicarEstadoGarantiaCliente;
	public Boolean isPermisoOrdenEstadoGarantiaCliente;
	
	
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
	
	public EstadoGarantiaClienteParameterReturnGeneral estadogarantiaclienteReturnGeneral;
	public EstadoGarantiaClienteParameterReturnGeneral estadogarantiaclienteParameterGeneral;
	
	

	public GarantiaClienteLogic garantiaclienteLogic=null;

	public GarantiaClienteLogic getGarantiaClienteLogic() {
		return garantiaclienteLogic;
	}

	public void setGarantiaClienteLogic(GarantiaClienteLogic garantiaclienteLogic) {
		this.garantiaclienteLogic = garantiaclienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoGarantiaCliente=false;
	public Boolean esParaAccionDesdeFormularioEstadoGarantiaCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoGarantiaClienteSessionBeanAdditional estadogarantiaclienteSessionBeanAdditional=null;
	
	public EstadoGarantiaClienteSessionBeanAdditional getEstadoGarantiaClienteSessionBeanAdditional() {
		return this.estadogarantiaclienteSessionBeanAdditional;
	}
	
	public void setEstadoGarantiaClienteSessionBeanAdditional(EstadoGarantiaClienteSessionBeanAdditional estadogarantiaclienteSessionBeanAdditional) {
		try {
			this.estadogarantiaclienteSessionBeanAdditional=estadogarantiaclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoGarantiaClienteBeanSwingJInternalFrameAdditional estadogarantiaclienteBeanSwingJInternalFrameAdditional=null;
	//public class EstadoGarantiaClienteBeanSwingJInternalFrame
	
	public EstadoGarantiaClienteBeanSwingJInternalFrameAdditional getEstadoGarantiaClienteBeanSwingJInternalFrameAdditional() {
		return this.estadogarantiaclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoGarantiaClienteBeanSwingJInternalFrameAdditional(EstadoGarantiaClienteBeanSwingJInternalFrameAdditional estadogarantiaclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.estadogarantiaclienteBeanSwingJInternalFrameAdditional=estadogarantiaclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoGarantiaClienteLogic estadogarantiaclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoGarantiaCliente estadogarantiaclienteBean;
	public EstadoGarantiaClienteConstantesFunciones estadogarantiaclienteConstantesFunciones;
	//public EstadoGarantiaClienteParameterReturnGeneral estadogarantiaclienteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoGarantiaCliente> estadogarantiaclientes;	
	//public List<EstadoGarantiaCliente> estadogarantiaclientesEliminados;
	//public List<EstadoGarantiaCliente> estadogarantiaclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoGarantiaCliente=true;
	public Boolean isVisibilidadCeldaCopiarEstadoGarantiaCliente=true;
	public Boolean isVisibilidadCeldaVerFormEstadoGarantiaCliente=true;
	public Boolean isVisibilidadCeldaOrdenEstadoGarantiaCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
	public Boolean isVisibilidadCeldaModificarEstadoGarantiaCliente=false;
	public Boolean isVisibilidadCeldaActualizarEstadoGarantiaCliente=false;
	public Boolean isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
	public Boolean isVisibilidadCeldaCancelarEstadoGarantiaCliente=false;
	public Boolean isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;	
	
	
	
	public Long getiIdNuevoEstadoGarantiaCliente() {
		return this.iIdNuevoEstadoGarantiaCliente;
	}

	public void setiIdNuevoEstadoGarantiaCliente(Long iIdNuevoEstadoGarantiaCliente) {
		this.iIdNuevoEstadoGarantiaCliente = iIdNuevoEstadoGarantiaCliente;
	}
	
	public Long getidEstadoGarantiaClienteActual() {
		return this.idEstadoGarantiaClienteActual;
	}

	public void setidEstadoGarantiaClienteActual(Long idEstadoGarantiaClienteActual) {
		this.idEstadoGarantiaClienteActual = idEstadoGarantiaClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoGarantiaCliente getestadogarantiacliente() {
		return this.estadogarantiacliente;
	}

	public void setestadogarantiacliente(EstadoGarantiaCliente estadogarantiacliente) {
		this.estadogarantiacliente = estadogarantiacliente;
	}
	
	public EstadoGarantiaCliente getestadogarantiaclienteAux() {
		return this.estadogarantiaclienteAux;
	}

	public void setestadogarantiaclienteAux(EstadoGarantiaCliente estadogarantiaclienteAux) {
		this.estadogarantiaclienteAux = estadogarantiaclienteAux;
	}				
	
	public EstadoGarantiaCliente getestadogarantiaclienteAnterior() {
		return this.estadogarantiaclienteAnterior;
	}

	public void setestadogarantiaclienteAnterior(EstadoGarantiaCliente estadogarantiaclienteAnterior) {
		this.estadogarantiaclienteAnterior = estadogarantiaclienteAnterior;
	}	
	
	public EstadoGarantiaCliente getestadogarantiaclienteTotales() {
		return this.estadogarantiaclienteTotales;
	}

	public void setestadogarantiaclienteTotales(EstadoGarantiaCliente estadogarantiaclienteTotales) {
		this.estadogarantiaclienteTotales = estadogarantiaclienteTotales;
	}	
	
	public EstadoGarantiaCliente getestadogarantiaclienteBean() {
		return this.estadogarantiaclienteBean;
	}

	public void setestadogarantiaclienteBean(EstadoGarantiaCliente estadogarantiaclienteBean) {
		this.estadogarantiaclienteBean = estadogarantiaclienteBean;
	}	
	
	public EstadoGarantiaClienteParameterReturnGeneral getestadogarantiaclienteReturnGeneral() {
		return this.estadogarantiaclienteReturnGeneral;
	}

	public void setestadogarantiaclienteReturnGeneral(EstadoGarantiaClienteParameterReturnGeneral estadogarantiaclienteReturnGeneral) {
		this.estadogarantiaclienteReturnGeneral = estadogarantiaclienteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoGarantiaClienteLogic getEstadoGarantiaClienteLogic()	{		
		return estadogarantiaclienteLogic;
	}

	public void setEstadoGarantiaClienteLogic(EstadoGarantiaClienteLogic estadogarantiaclienteLogic) {
		this.estadogarantiaclienteLogic = estadogarantiaclienteLogic;
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
	
	public Boolean getIsEsNuevoEstadoGarantiaCliente() {
		return isEsNuevoEstadoGarantiaCliente;
	}

	public void setIsEsNuevoEstadoGarantiaCliente(Boolean isEsNuevoEstadoGarantiaCliente) {
		this.isEsNuevoEstadoGarantiaCliente = isEsNuevoEstadoGarantiaCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoGarantiaCliente() {
		return esParaAccionDesdeFormularioEstadoGarantiaCliente;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoGarantiaCliente(Boolean esParaAccionDesdeFormularioEstadoGarantiaCliente) {
		this.esParaAccionDesdeFormularioEstadoGarantiaCliente = esParaAccionDesdeFormularioEstadoGarantiaCliente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoGarantiaCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoGarantiaClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoGarantiaCliente(this.estadogarantiaclienteLogic.getEstadoGarantiaClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoGarantiaClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoGarantiaCliente(this.estadogarantiaclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadogarantiaclienteLogic.setEstadoGarantiaClientes(this.estadogarantiaclientes);
			estadogarantiaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoGarantiaClienteParameterReturnGeneral getEstadoGarantiaClienteParameterGeneral() {
		return this.estadogarantiaclienteParameterGeneral;
	}
	
	public void setEstadoGarantiaClienteParameterGeneral(EstadoGarantiaClienteParameterReturnGeneral estadogarantiaclienteParameterGeneral) {
		this.estadogarantiaclienteParameterGeneral = estadogarantiaclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoGarantiaCliente() {
		return isPermisoTodoEstadoGarantiaCliente;
	}

	public void setIsPermisoTodoEstadoGarantiaCliente(Boolean isPermisoTodoEstadoGarantiaCliente) {
		this.isPermisoTodoEstadoGarantiaCliente = isPermisoTodoEstadoGarantiaCliente;
	}

	public Boolean getIsPermisoNuevoEstadoGarantiaCliente() {
		return isPermisoNuevoEstadoGarantiaCliente;
	}

	public void setIsPermisoNuevoEstadoGarantiaCliente(Boolean isPermisoNuevoEstadoGarantiaCliente) {
		this.isPermisoNuevoEstadoGarantiaCliente = isPermisoNuevoEstadoGarantiaCliente;
	}

	public Boolean getIsPermisoActualizarEstadoGarantiaCliente() {
		return isPermisoActualizarEstadoGarantiaCliente;
	}

	public void setIsPermisoActualizarEstadoGarantiaCliente(Boolean isPermisoActualizarEstadoGarantiaCliente) {
		this.isPermisoActualizarEstadoGarantiaCliente = isPermisoActualizarEstadoGarantiaCliente;
	}

	public Boolean getIsPermisoEliminarEstadoGarantiaCliente() {
		return isPermisoEliminarEstadoGarantiaCliente;
	}

	public void setIsPermisoEliminarEstadoGarantiaCliente(Boolean isPermisoEliminarEstadoGarantiaCliente) {
		this.isPermisoEliminarEstadoGarantiaCliente = isPermisoEliminarEstadoGarantiaCliente;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoGarantiaCliente() {
		return isPermisoGuardarCambiosEstadoGarantiaCliente;
	}

	public void setIsPermisoGuardarCambiosEstadoGarantiaCliente(Boolean isPermisoGuardarCambiosEstadoGarantiaCliente) {
		this.isPermisoGuardarCambiosEstadoGarantiaCliente = isPermisoGuardarCambiosEstadoGarantiaCliente;
	}
	
	public Boolean getIsPermisoConsultaEstadoGarantiaCliente() {
		return isPermisoConsultaEstadoGarantiaCliente;
	}

	public void setIsPermisoConsultaEstadoGarantiaCliente(Boolean isPermisoConsultaEstadoGarantiaCliente) {
		this.isPermisoConsultaEstadoGarantiaCliente = isPermisoConsultaEstadoGarantiaCliente;
	}

	public Boolean getIsPermisoBusquedaEstadoGarantiaCliente() {
		return isPermisoBusquedaEstadoGarantiaCliente;
	}

	public void setIsPermisoBusquedaEstadoGarantiaCliente(Boolean isPermisoBusquedaEstadoGarantiaCliente) {
		this.isPermisoBusquedaEstadoGarantiaCliente = isPermisoBusquedaEstadoGarantiaCliente;
	}

	public Boolean getIsPermisoReporteEstadoGarantiaCliente() {
		return isPermisoReporteEstadoGarantiaCliente;
	}

	public void setIsPermisoReporteEstadoGarantiaCliente(Boolean isPermisoReporteEstadoGarantiaCliente) {
		this.isPermisoReporteEstadoGarantiaCliente = isPermisoReporteEstadoGarantiaCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoGarantiaCliente() {
		return isPermisoPaginacionMedioEstadoGarantiaCliente;
	}

	public void setIsPermisoPaginacionMedioEstadoGarantiaCliente(Boolean isPermisoPaginacionMedioEstadoGarantiaCliente) {
		this.isPermisoPaginacionMedioEstadoGarantiaCliente = isPermisoPaginacionMedioEstadoGarantiaCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoGarantiaCliente() {
		return isPermisoPaginacionTodoEstadoGarantiaCliente;
	}

	public void setIsPermisoPaginacionTodoEstadoGarantiaCliente(Boolean isPermisoPaginacionTodoEstadoGarantiaCliente) {
		this.isPermisoPaginacionTodoEstadoGarantiaCliente = isPermisoPaginacionTodoEstadoGarantiaCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoGarantiaCliente() {
		return isPermisoPaginacionAltoEstadoGarantiaCliente;
	}

	public void setIsPermisoPaginacionAltoEstadoGarantiaCliente(Boolean isPermisoPaginacionAltoEstadoGarantiaCliente) {
		this.isPermisoPaginacionAltoEstadoGarantiaCliente = isPermisoPaginacionAltoEstadoGarantiaCliente;
	}
	
	public Boolean getIsPermisoCopiarEstadoGarantiaCliente() {
		return isPermisoCopiarEstadoGarantiaCliente;
	}

	public void setIsPermisoCopiarEstadoGarantiaCliente(Boolean isPermisoCopiarEstadoGarantiaCliente) {
		this.isPermisoCopiarEstadoGarantiaCliente = isPermisoCopiarEstadoGarantiaCliente;
	}
	
	public Boolean getIsPermisoVerFormEstadoGarantiaCliente() {
		return isPermisoVerFormEstadoGarantiaCliente;
	}

	public void setIsPermisoVerFormEstadoGarantiaCliente(Boolean isPermisoVerFormEstadoGarantiaCliente) {
		this.isPermisoVerFormEstadoGarantiaCliente = isPermisoVerFormEstadoGarantiaCliente;
	}
	
	public Boolean getIsPermisoDuplicarEstadoGarantiaCliente() {
		return isPermisoDuplicarEstadoGarantiaCliente;
	}

	public void setIsPermisoDuplicarEstadoGarantiaCliente(Boolean isPermisoDuplicarEstadoGarantiaCliente) {
		this.isPermisoDuplicarEstadoGarantiaCliente = isPermisoDuplicarEstadoGarantiaCliente;
	}
	
	public Boolean getIsPermisoOrdenEstadoGarantiaCliente() {
		return isPermisoOrdenEstadoGarantiaCliente;
	}

	public void setIsPermisoOrdenEstadoGarantiaCliente(Boolean isPermisoOrdenEstadoGarantiaCliente) {
		this.isPermisoOrdenEstadoGarantiaCliente = isPermisoOrdenEstadoGarantiaCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoGarantiaCliente() {
		return isVisibilidadCeldaNuevoEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaNuevoEstadoGarantiaCliente(Boolean isVisibilidadCeldaNuevoEstadoGarantiaCliente) {
		this.isVisibilidadCeldaNuevoEstadoGarantiaCliente = isVisibilidadCeldaNuevoEstadoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoGarantiaCliente() {
		return isVisibilidadCeldaDuplicarEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoGarantiaCliente(Boolean isVisibilidadCeldaDuplicarEstadoGarantiaCliente) {
		this.isVisibilidadCeldaDuplicarEstadoGarantiaCliente = isVisibilidadCeldaDuplicarEstadoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoGarantiaCliente() {
		return isVisibilidadCeldaCopiarEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaCopiarEstadoGarantiaCliente(Boolean isVisibilidadCeldaCopiarEstadoGarantiaCliente) {
		this.isVisibilidadCeldaCopiarEstadoGarantiaCliente = isVisibilidadCeldaCopiarEstadoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoGarantiaCliente() {
		return isVisibilidadCeldaVerFormEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaVerFormEstadoGarantiaCliente(Boolean isVisibilidadCeldaVerFormEstadoGarantiaCliente) {
		this.isVisibilidadCeldaVerFormEstadoGarantiaCliente = isVisibilidadCeldaVerFormEstadoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoGarantiaCliente() {
		return isVisibilidadCeldaOrdenEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaOrdenEstadoGarantiaCliente(Boolean isVisibilidadCeldaOrdenEstadoGarantiaCliente) {
		this.isVisibilidadCeldaOrdenEstadoGarantiaCliente = isVisibilidadCeldaOrdenEstadoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente() {
		return isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente(Boolean isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente = isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoGarantiaCliente() {
		return isVisibilidadCeldaModificarEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaModificarEstadoGarantiaCliente(Boolean isVisibilidadCeldaModificarEstadoGarantiaCliente) {
		this.isVisibilidadCeldaModificarEstadoGarantiaCliente = isVisibilidadCeldaModificarEstadoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoGarantiaCliente() {
		return isVisibilidadCeldaActualizarEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaActualizarEstadoGarantiaCliente(Boolean isVisibilidadCeldaActualizarEstadoGarantiaCliente) {
		this.isVisibilidadCeldaActualizarEstadoGarantiaCliente = isVisibilidadCeldaActualizarEstadoGarantiaCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoGarantiaCliente() {
		return isVisibilidadCeldaEliminarEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaEliminarEstadoGarantiaCliente(Boolean isVisibilidadCeldaEliminarEstadoGarantiaCliente) {
		this.isVisibilidadCeldaEliminarEstadoGarantiaCliente = isVisibilidadCeldaEliminarEstadoGarantiaCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoGarantiaCliente() {
		return isVisibilidadCeldaCancelarEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaCancelarEstadoGarantiaCliente(Boolean isVisibilidadCeldaCancelarEstadoGarantiaCliente) {
		this.isVisibilidadCeldaCancelarEstadoGarantiaCliente = isVisibilidadCeldaCancelarEstadoGarantiaCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoGarantiaCliente() {
		return isVisibilidadCeldaGuardarEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaGuardarEstadoGarantiaCliente(Boolean isVisibilidadCeldaGuardarEstadoGarantiaCliente) {
		this.isVisibilidadCeldaGuardarEstadoGarantiaCliente = isVisibilidadCeldaGuardarEstadoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente() {
		return isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente(Boolean isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente) {
		this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente = isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente;
	}
		
	public EstadoGarantiaClienteSessionBean getestadogarantiaclienteSessionBean() {
		return this.estadogarantiaclienteSessionBean;
	}
	
	public void setestadogarantiaclienteSessionBean(EstadoGarantiaClienteSessionBean estadogarantiaclienteSessionBean) {
		this.estadogarantiaclienteSessionBean=estadogarantiaclienteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoGarantiaCliente estadogarantiacliente,EstadoGarantiaCliente estadogarantiaclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoGarantiaCliente(estadogarantiacliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadogarantiaclienteAux.setId(estadogarantiacliente.getId());
		estadogarantiaclienteAux.setVersionRow(estadogarantiacliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoGarantiaCliente();
		
			int intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadogarantiaclienteValidator.getInvalidValues(this.estadogarantiacliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadogarantiaclienteLogic.setDatosCliente(datosCliente);
			estadogarantiaclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadogarantiaclienteAux=new  EstadoGarantiaCliente();
				
				estadogarantiaclienteAux.setIsNew(true);
				estadogarantiaclienteAux.setIsChanged(true);
				
				estadogarantiaclienteAux.setEstadoGarantiaClienteOriginal(this.estadogarantiacliente);
				
				estadogarantiaclienteAux.setId(this.estadogarantiacliente.getId());	
				estadogarantiaclienteAux.setVersionRow(this.estadogarantiacliente.getVersionRow());	
				estadogarantiaclienteAux.setcodigo(this.estadogarantiacliente.getcodigo());	
				estadogarantiaclienteAux.setnombre(this.estadogarantiacliente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadogarantiaclienteAux,estadogarantiaclienteLogic.getEstadoGarantiaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadogarantiaclienteAux,estadogarantiaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogarantiaclienteLogic.saveEstadoGarantiaClientes();//WithConnection
						//estadogarantiaclienteLogic.getSetVersionRowEstadoGarantiaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadogarantiacliente,estadogarantiaclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes().addAll(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientes.addAll(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadogarantiaclienteLogic.saveEstadoGarantiaClienteRelaciones(estadogarantiaclienteAux,this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());//WithConnection
								//estadogarantiaclienteLogic.getSetVersionRowEstadoGarantiaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadogarantiacliente,estadogarantiaclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientes= new ArrayList<GarantiaCliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadogarantiaclienteAux.setGarantiaClientes(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadogarantiaclienteAux,estadogarantiaclienteLogic.getEstadoGarantiaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadogarantiaclienteAux,estadogarantiaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadogarantiacliente,estadogarantiaclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadogarantiaclienteAux=new  EstadoGarantiaCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado() && this.estadogarantiacliente.getId()>=0)) {
						
					estadogarantiaclienteAux.setIsNew(false);
				}
				
				estadogarantiaclienteAux.setIsDeleted(false);
			
				estadogarantiaclienteAux.setId(this.estadogarantiacliente.getId());	
				estadogarantiaclienteAux.setVersionRow(this.estadogarantiacliente.getVersionRow());	
				estadogarantiaclienteAux.setcodigo(this.estadogarantiacliente.getcodigo());	
				estadogarantiaclienteAux.setnombre(this.estadogarantiacliente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadogarantiaclienteAux,estadogarantiaclienteLogic.getEstadoGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadogarantiaclienteAux,estadogarantiaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogarantiaclienteLogic.saveEstadoGarantiaClientes();//WithConnection
						//estadogarantiaclienteLogic.getSetVersionRowEstadoGarantiaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadogarantiacliente,estadogarantiaclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes().addAll(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientes.addAll(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadogarantiaclienteLogic.saveEstadoGarantiaClienteRelaciones(estadogarantiaclienteAux,this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());//WithConnection
								//estadogarantiaclienteLogic.getSetVersionRowEstadoGarantiaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadogarantiacliente,estadogarantiaclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientes= new ArrayList<GarantiaCliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadogarantiaclienteAux.setGarantiaClientes(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadogarantiaclienteAux,estadogarantiaclienteLogic.getEstadoGarantiaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadogarantiaclienteAux,estadogarantiaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadogarantiacliente,estadogarantiaclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadogarantiaclienteAux=new  EstadoGarantiaCliente();
				
				estadogarantiaclienteAux.setIsNew(false);
				estadogarantiaclienteAux.setIsChanged(false);
				
				estadogarantiaclienteAux.setIsDeleted(true);
				
				estadogarantiaclienteAux.setId(this.estadogarantiacliente.getId());	
				estadogarantiaclienteAux.setVersionRow(this.estadogarantiacliente.getVersionRow());	
				estadogarantiaclienteAux.setcodigo(this.estadogarantiacliente.getcodigo());	
				estadogarantiaclienteAux.setnombre(this.estadogarantiacliente.getnombre());	
				
				if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadogarantiaclienteAux.getId()>=0) {	
						this.estadogarantiaclientesEliminados.add(estadogarantiaclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadogarantiaclienteAux,estadogarantiaclienteLogic.getEstadoGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadogarantiaclienteAux,estadogarantiaclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogarantiaclienteLogic.saveEstadoGarantiaClientes();//WithConnection
						//estadogarantiaclienteLogic.getSetVersionRowEstadoGarantiaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes().addAll(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientes.addAll(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadogarantiaclienteLogic.saveEstadoGarantiaClienteRelaciones(estadogarantiaclienteAux,this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());//WithConnection
								//estadogarantiaclienteLogic.getSetVersionRowEstadoGarantiaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientes= new ArrayList<GarantiaCliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadogarantiaclienteAux.setGarantiaClientes(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadogarantiaclienteAux,estadogarantiaclienteLogic.getEstadoGarantiaClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadogarantiaclienteAux,estadogarantiaclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().addAll(this.estadogarantiaclientesEliminados);
					
					estadogarantiaclienteLogic.saveEstadoGarantiaClientes();//WithConnection
					//estadogarantiaclienteLogic.getSetVersionRowEstadoGarantiaClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadogarantiaclientesEliminados= new ArrayList<EstadoGarantiaCliente>();		
			}
			
			if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Garantia Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadogarantiacliente=estadogarantiaclienteAux;
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
      		//this.finishProcessEstadoGarantiaCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoGarantiaCliente estadogarantiaclienteLocal) throws Exception {
		
		if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadogarantiaclienteLocal.setGarantiaClientes(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
			
			} else {
			
				estadogarantiaclienteLocal.setGarantiaClientes(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoGarantiaCliente estadogarantiaclienteLocal) throws Exception {	
		if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoGarantiaClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadogarantiaclienteValidator.getInvalidValues(this.estadogarantiacliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoGarantiaCliente estadogarantiacliente,List<EstadoGarantiaCliente> estadogarantiaclientes) throws Exception {
		try	{		
			EstadoGarantiaClienteConstantesFunciones.actualizarLista(estadogarantiacliente,estadogarantiaclientes,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoGarantiaCliente estadogarantiacliente,List<EstadoGarantiaCliente> estadogarantiaclientes) throws Exception {
		try	{			
			EstadoGarantiaClienteConstantesFunciones.actualizarSelectedLista(estadogarantiacliente,estadogarantiaclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoGarantiaCliente> estadogarantiaclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadogarantiaclientesLocal=this.estadogarantiaclienteLogic.getEstadoGarantiaClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadogarantiaclientesLocal=this.estadogarantiaclientes;
			}
			//ARCHITECTURE
		
			for(EstadoGarantiaCliente estadogarantiaclienteLocal:estadogarantiaclientesLocal) {
				if(this.permiteMantenimiento(estadogarantiaclienteLocal) && estadogarantiaclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoGarantiaClienteConstantesFunciones.getEstadoGarantiaClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoGarantiaClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGarantiaCliente.jLabelcodigoEstadoGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoGarantiaClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGarantiaCliente.jLabelnombreEstadoGarantiaCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoGarantiaCliente.jLabelcodigoEstadoGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoGarantiaCliente.jLabelnombreEstadoGarantiaCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("GarantiaCliente")) {
			if(this.estadogarantiacliente==null) {
				this.estadogarantiacliente= new EstadoGarantiaCliente();
			}

			if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoGarantiaCliente
				this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);

				this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.getgarantiacliente().setEstadoGarantiaCliente(this.estadogarantiacliente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoGarantiaCliente--;	
		
		
		this.estadogarantiaclienteAux=new EstadoGarantiaCliente();
		
		this.estadogarantiaclienteAux.setId(this.iIdNuevoEstadoGarantiaCliente);
		this.estadogarantiaclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().add(this.estadogarantiaclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadogarantiaclientes.add(this.estadogarantiaclienteAux);
		}
		//ARCHITECTURE
		
		this.estadogarantiacliente=this.estadogarantiaclienteAux;
		
		if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoGarantiaCliente(this.estadogarantiacliente);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoGarantiaCliente(this.estadogarantiacliente);
		}
				
		//this.setDefaultControlesEstadoGarantiaCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoGarantiaCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoGarantiaCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoGarantiaCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoGarantiaCliente(this.estadogarantiaclienteBean,this.estadogarantiacliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
			classes=EstadoGarantiaClienteConstantesFunciones.getClassesRelationshipsOfEstadoGarantiaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadogarantiaclienteReturnGeneral=estadogarantiaclienteLogic.procesarEventosEstadoGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadogarantiaclienteLogic.getEstadoGarantiaClientes(),this.estadogarantiacliente,this.estadogarantiaclienteParameterGeneral,this.isEsNuevoEstadoGarantiaCliente,classes);//this.estadogarantiaclienteLogic.getEstadoGarantiaCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral,this.estadogarantiaclienteBean,false);
		
		if(this.estadogarantiaclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente());
		}
		
		if(this.estadogarantiaclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente(),classes);//this.estadogarantiaclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoGarantiaCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoGarantiaCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.RecargarFormEstadoGarantiaCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoGarantiaCliente(false);
						
			if(estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.getEsGuardarRelacionado() && GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGarantiaClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoGarantiaCliente();
			}
			
			this.actualizarVisualTableDatosEstadoGarantiaCliente();
			
			this.jTableDatosEstadoGarantiaCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoGarantiaCliente(), this.getIndiceNuevoEstadoGarantiaCliente());
			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
						
			this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoGarantiaCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldcodigoEstadoGarantiaCliente.setEnabled(isHabilitar && this.estadogarantiaclienteConstantesFunciones.activarcodigoEstadoGarantiaCliente);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextAreanombreEstadoGarantiaCliente.setEnabled(isHabilitar && this.estadogarantiaclienteConstantesFunciones.activarnombreEstadoGarantiaCliente);	
		
	};
	
	public void setDefaultControlesEstadoGarantiaCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoGarantiaCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadogarantiaclienteSessionBean.setConGuardarRelaciones(true);			
			this.estadogarantiaclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadogarantiaclienteSessionBean.setConGuardarRelaciones(false);			
			this.estadogarantiaclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoGarantiaCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
				if(estadogarantiaclienteAux.getId().equals(this.iIdNuevoEstadoGarantiaCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclientes) {
				if(estadogarantiaclienteAux.getId().equals(this.iIdNuevoEstadoGarantiaCliente)) {
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
	
	public int getIndiceActualEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
				if(estadogarantiaclienteAux.getId().equals(estadogarantiacliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclientes) {
				if(estadogarantiaclienteAux.getId().equals(estadogarantiacliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiaclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
				if(estadogarantiaclienteAux.getEstadoGarantiaClienteOriginal().getId().equals(estadogarantiaclienteOriginal.getId())) {
					existe=true;
					estadogarantiaclienteOriginal.setId(estadogarantiaclienteAux.getId());
					estadogarantiaclienteOriginal.setVersionRow(estadogarantiaclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclientes) {
				if(estadogarantiaclienteAux.getEstadoGarantiaClienteOriginal().getId().equals(estadogarantiaclienteOriginal.getId())) {
					existe=true;
					estadogarantiaclienteOriginal.setId(estadogarantiaclienteAux.getId());
					estadogarantiaclienteOriginal.setVersionRow(estadogarantiaclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoGarantiaCliente(Boolean esParaCancelar) throws Exception {
		estadogarantiaclientesAux=new ArrayList<EstadoGarantiaCliente>();
		estadogarantiaclienteAux=new EstadoGarantiaCliente();
		
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
					if(estadogarantiaclienteAux.getId()<0) {
						estadogarantiaclientesAux.add(estadogarantiaclienteAux);
					}		
				}
				this.iIdNuevoEstadoGarantiaCliente=0L;
				this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().removeAll(estadogarantiaclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclientes) {
					if(estadogarantiaclienteAux.getId()<0) {
						estadogarantiaclientesAux.add(estadogarantiaclienteAux);
					}		
				}
				this.iIdNuevoEstadoGarantiaCliente=0L;
				this.estadogarantiaclientes.removeAll(estadogarantiaclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoGarantiaCliente 
					&& this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().size()>0
					) {
					estadogarantiaclienteAux=this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().get(this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().size() - 1);
				
					if(estadogarantiaclienteAux.getId()<0) {
						this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().remove(estadogarantiaclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoGarantiaCliente && this.estadogarantiaclientes.size()>0) {
					estadogarantiaclienteAux=this.estadogarantiaclientes.get(this.estadogarantiaclientes.size() - 1);
				
					if(estadogarantiaclienteAux.getId()<0) {
						this.estadogarantiaclientes.remove(estadogarantiaclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoGarantiaCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadogarantiacliente.getId()<0) {
				this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().remove(this.estadogarantiacliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadogarantiacliente.getId()<0) {
				this.estadogarantiaclientes.remove(this.estadogarantiacliente);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoGarantiaCliente(List<EstadoGarantiaCliente> estadogarantiaclientesAux) throws Exception {
		EstadoGarantiaClienteConstantesFunciones.setEstadosInicialesEstadoGarantiaCliente(estadogarantiaclientesAux);
	}
	
	public void setEstadosInicialesEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiaclienteAux) throws Exception {
		EstadoGarantiaClienteConstantesFunciones.setEstadosInicialesEstadoGarantiaCliente(estadogarantiaclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoGarantiaClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoGarantiaClienteActual()) {
				if(!this.isEsNuevoEstadoGarantiaCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoGarantiaCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoGarantiaClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Garantia Cliente ?", "MANTENIMIENTO DE Estado Garantia Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoGarantiaCliente estadogarantiacliente) throws Exception {
		EstadoGarantiaClienteConstantesFunciones.seleccionarAsignar(this.estadogarantiacliente,estadogarantiacliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoGarantiaCliente=this.isPermisoActualizarOriginalEstadoGarantiaCliente;
			
			
			this.seleccionarAsignar(estadogarantiacliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoGarantiaClienteConstantesFunciones.quitarEspaciosEstadoGarantiaCliente(this.estadogarantiacliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadogarantiaclienteSessionBean.setsFuncionBusquedaRapida(this.estadogarantiaclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoGarantiaCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoGarantiaCliente(esParaCancelar);				
				this.cancelarNuevoEstadoGarantiaCliente(esParaCancelar);								
			}
			
			this.estadogarantiacliente=new EstadoGarantiaCliente();
			
			this.inicializarEstadoGarantiaCliente();
			
			this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoGarantiaCliente() throws Exception {
		try {
			EstadoGarantiaClienteConstantesFunciones.inicializarEstadoGarantiaCliente(this.estadogarantiacliente);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoGarantiaClientes(String sAccionBusqueda,List<EstadoGarantiaCliente> estadogarantiaclientesParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoGarantiaCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoGarantiaClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoGarantiaClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoGarantiaCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Garantia Clientes");		
		parameters.put("busquedapor", EstadoGarantiaClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(GarantiaCliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoGarantiaClienteLogic estadogarantiaclienteLogicAuxiliar=new EstadoGarantiaClienteLogic();
					estadogarantiaclienteLogicAuxiliar.setDatosCliente(estadogarantiaclienteLogic.getDatosCliente());				
					estadogarantiaclienteLogicAuxiliar.setEstadoGarantiaClientes(estadogarantiaclientesParaReportes);
					
					estadogarantiaclienteLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoGarantiaClienteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadogarantiaclientesParaReportes=estadogarantiaclienteLogicAuxiliar.getEstadoGarantiaClientes();
					
					//estadogarantiaclienteLogic.getNewConnexionToDeep();
					
					//for (EstadoGarantiaCliente estadogarantiacliente:estadogarantiaclientesParaReportes) {
					//	estadogarantiaclienteLogic.deepLoad(estadogarantiacliente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadogarantiaclienteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadogarantiaclienteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileGarantiaCliente = AuxiliarReportes.class.getResourceAsStream("GarantiaClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_garantiacliente", reportFileGarantiaCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoGarantiaCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoGarantiaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoGarantiaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoGarantiaCliente=new JRBeanArrayDataSource(EstadoGarantiaClienteJInternalFrame.TraerEstadoGarantiaClienteBeans(estadogarantiaclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoGarantiaCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoGarantiaClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoGarantiaClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoGarantiaClienteBean.TraerEstadoGarantiaClienteBeans(estadogarantiaclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,estadogarantiaclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,estadogarantiaclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoGarantiaClienteActionPerformed(null);
					//this.generarExcelReporteEstadoGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,estadogarantiaclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,estadogarantiaclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,estadogarantiaclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,estadogarantiaclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoGarantiaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoGarantiaCliente> estadogarantiaclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogarantiacliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoGarantiaClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoGarantiaCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoGarantiaCliente estadogarantiacliente : estadogarantiaclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoGarantiaClienteConstantesFunciones.generarExcelReporteDataEstadoGarantiaCliente("NORMAL",row,workbook,estadogarantiacliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoGarantiaCliente(String sTipo,Row row,Workbook workbook) {
		
		EstadoGarantiaClienteConstantesFunciones.generarExcelReporteHeaderEstadoGarantiaCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoGarantiaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoGarantiaCliente> estadogarantiaclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogarantiacliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoGarantiaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoGarantiaCliente estadogarantiacliente : estadogarantiaclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.getEstadoGarantiaClienteDescripcion(estadogarantiacliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadogarantiacliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadogarantiacliente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoGarantiaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoGarantiaCliente> estadogarantiaclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoGarantiaCliente> estadogarantiaclientesRespaldo=null;
		
		classes=EstadoGarantiaClienteConstantesFunciones.getClassesRelationshipsOfEstadoGarantiaCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadogarantiaclienteLogic.setDatosCliente(this.datosCliente);
		this.estadogarantiaclienteLogic.setDatosDeep(this.datosDeep);
		this.estadogarantiaclienteLogic.setIsConDeep(true);
		
		estadogarantiaclientesRespaldo=this.estadogarantiaclienteLogic.getEstadoGarantiaClientes();
		
		this.estadogarantiaclienteLogic.setEstadoGarantiaClientes(estadogarantiaclientesParaReportes);	
		this.estadogarantiaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadogarantiaclientesParaReportes=this.estadogarantiaclienteLogic.getEstadoGarantiaClientes();
		this.estadogarantiaclienteLogic.setEstadoGarantiaClientes(estadogarantiaclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogarantiacliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoGarantiaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoGarantiaCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoGarantiaCliente estadogarantiacliente : estadogarantiaclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoGarantiaCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoGarantiaClienteConstantesFunciones.generarExcelReporteDataEstadoGarantiaCliente("NORMAL",row,workbook,estadogarantiacliente,cellStyleDataAux);
		
			
			


				//GarantiaCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadogarantiacliente.getGarantiaClientes()!=null && estadogarantiacliente.getGarantiaClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					GarantiaClienteConstantesFunciones.generarExcelReporteHeaderGarantiaCliente("RELACIONADO",row,workbook);
				}

				if(estadogarantiacliente.getGarantiaClientes()!=null) {
					i2=0;
					for(GarantiaCliente garantiacliente : estadogarantiacliente.getGarantiaClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						GarantiaClienteConstantesFunciones.generarExcelReporteDataGarantiaCliente("RELACIONADO",row,workbook,garantiacliente,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.getEstadoGarantiaClienteDescripcion(estadogarantiacliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoGarantiaCliente() throws Exception {		
		this.startProcessEstadoGarantiaCliente(true);
	}
	
	public void startProcessEstadoGarantiaCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoGarantiaCliente, this.jScrollPanelDatosEstadoGarantiaCliente,this.jPanelPaginacionEstadoGarantiaCliente, this.jScrollPanelDatosEdicionEstadoGarantiaCliente, this.jPanelAccionesEstadoGarantiaCliente,this.jPanelAccionesFormularioEstadoGarantiaCliente,this.jmenuBarEstadoGarantiaCliente,this.jmenuBarDetalleEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,this.jTtoolBarDetalleEstadoGarantiaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoGarantiaCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoGarantiaCliente=this.jPanelParametrosReportesEstadoGarantiaCliente;
		//final JScrollPane jScrollPanelDatosEstadoGarantiaCliente=this.jScrollPanelDatosEstadoGarantiaCliente;
		final JTable jTableDatosEstadoGarantiaCliente=this.jTableDatosEstadoGarantiaCliente;		
		final JPanel jPanelPaginacionEstadoGarantiaCliente=this.jPanelPaginacionEstadoGarantiaCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoGarantiaCliente=this.jScrollPanelDatosEdicionEstadoGarantiaCliente;
		final JPanel jPanelAccionesEstadoGarantiaCliente=this.jPanelAccionesEstadoGarantiaCliente;
		
		JPanel jPanelCamposAuxiliarEstadoGarantiaCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoGarantiaCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			jPanelCamposAuxiliarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jPanelCamposEstadoGarantiaCliente;
			jPanelAccionesFormularioAuxiliarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jPanelAccionesFormularioEstadoGarantiaCliente;
		}
		
		final JPanel jPanelCamposEstadoGarantiaCliente=jPanelCamposAuxiliarEstadoGarantiaCliente;
		final JPanel jPanelAccionesFormularioEstadoGarantiaCliente=jPanelAccionesFormularioAuxiliarEstadoGarantiaCliente;
		
		
		final JMenuBar jmenuBarEstadoGarantiaCliente=this.jmenuBarEstadoGarantiaCliente;
		final JToolBar jTtoolBarEstadoGarantiaCliente=this.jTtoolBarEstadoGarantiaCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoGarantiaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoGarantiaCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jmenuBarDetalleEstadoGarantiaCliente;
			jTtoolBarDetalleAuxiliarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTtoolBarDetalleEstadoGarantiaCliente;
		}
		
		final JMenuBar jmenuBarDetalleEstadoGarantiaCliente=jmenuBarDetalleAuxiliarEstadoGarantiaCliente;
		final JToolBar jTtoolBarDetalleEstadoGarantiaCliente=jTtoolBarDetalleAuxiliarEstadoGarantiaCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoGarantiaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoGarantiaCliente;
			processRunnable.jTableDatos=jTableDatosEstadoGarantiaCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoGarantiaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoGarantiaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoGarantiaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoGarantiaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoGarantiaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoGarantiaCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoGarantiaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoGarantiaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoGarantiaCliente ,jPanelParametrosReportesEstadoGarantiaCliente,jTableDatosEstadoGarantiaCliente, /*jScrollPanelDatosEstadoGarantiaCliente,*/jPanelCamposEstadoGarantiaCliente,jPanelPaginacionEstadoGarantiaCliente, /*jScrollPanelDatosEdicionEstadoGarantiaCliente,*/ jPanelAccionesEstadoGarantiaCliente,jPanelAccionesFormularioEstadoGarantiaCliente,jmenuBarEstadoGarantiaCliente,jmenuBarDetalleEstadoGarantiaCliente,jTtoolBarEstadoGarantiaCliente,jTtoolBarDetalleEstadoGarantiaCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoGarantiaCliente, jScrollPanelDatosEstadoGarantiaCliente,jPanelPaginacionEstadoGarantiaCliente, jScrollPanelDatosEdicionEstadoGarantiaCliente, jPanelAccionesEstadoGarantiaCliente,jPanelAccionesFormularioEstadoGarantiaCliente,jmenuBarEstadoGarantiaCliente,jmenuBarDetalleEstadoGarantiaCliente,jTtoolBarEstadoGarantiaCliente,jTtoolBarDetalleEstadoGarantiaCliente);
						
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
	
	public void finishProcessEstadoGarantiaCliente() {// throws Exception 
		this.finishProcessEstadoGarantiaCliente(true);
	}
	
	public void finishProcessEstadoGarantiaCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoGarantiaCliente, this.jScrollPanelDatosEstadoGarantiaCliente,this.jPanelPaginacionEstadoGarantiaCliente, this.jScrollPanelDatosEdicionEstadoGarantiaCliente, this.jPanelAccionesEstadoGarantiaCliente,this.jPanelAccionesFormularioEstadoGarantiaCliente,this.jmenuBarEstadoGarantiaCliente,this.jmenuBarDetalleEstadoGarantiaCliente,this.jTtoolBarEstadoGarantiaCliente,this.jTtoolBarDetalleEstadoGarantiaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoGarantiaCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoGarantiaCliente=this.jPanelParametrosReportesEstadoGarantiaCliente;
		//final JScrollPane jScrollPanelDatosEstadoGarantiaCliente=this.jScrollPanelDatosEstadoGarantiaCliente;
		final JTable jTableDatosEstadoGarantiaCliente=this.jTableDatosEstadoGarantiaCliente;		
		final JPanel jPanelPaginacionEstadoGarantiaCliente=this.jPanelPaginacionEstadoGarantiaCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoGarantiaCliente=this.jScrollPanelDatosEdicionEstadoGarantiaCliente;
		final JPanel jPanelAccionesEstadoGarantiaCliente=this.jPanelAccionesEstadoGarantiaCliente;
		
		JPanel jPanelCamposAuxiliarEstadoGarantiaCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoGarantiaCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			jPanelCamposAuxiliarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jPanelCamposEstadoGarantiaCliente;
			jPanelAccionesFormularioAuxiliarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jPanelAccionesFormularioEstadoGarantiaCliente;
		}
		
		final JPanel jPanelCamposEstadoGarantiaCliente=jPanelCamposAuxiliarEstadoGarantiaCliente;
		final JPanel jPanelAccionesFormularioEstadoGarantiaCliente=jPanelAccionesFormularioAuxiliarEstadoGarantiaCliente;
		
		
		final JMenuBar jmenuBarEstadoGarantiaCliente=this.jmenuBarEstadoGarantiaCliente;		
		final JToolBar jTtoolBarEstadoGarantiaCliente=this.jTtoolBarEstadoGarantiaCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoGarantiaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoGarantiaCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jmenuBarDetalleEstadoGarantiaCliente;
			jTtoolBarDetalleAuxiliarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTtoolBarDetalleEstadoGarantiaCliente;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoGarantiaCliente=jmenuBarDetalleAuxiliarEstadoGarantiaCliente;
		final JToolBar jTtoolBarDetalleEstadoGarantiaCliente=jTtoolBarDetalleAuxiliarEstadoGarantiaCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoGarantiaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoGarantiaCliente;
			processRunnable.jTableDatos=jTableDatosEstadoGarantiaCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoGarantiaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoGarantiaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoGarantiaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoGarantiaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoGarantiaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoGarantiaCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoGarantiaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoGarantiaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoGarantiaCliente ,jPanelParametrosReportesEstadoGarantiaCliente, jTableDatosEstadoGarantiaCliente,/*jScrollPanelDatosEstadoGarantiaCliente,*/jPanelCamposEstadoGarantiaCliente,jPanelPaginacionEstadoGarantiaCliente, /*jScrollPanelDatosEdicionEstadoGarantiaCliente,*/ jPanelAccionesEstadoGarantiaCliente,jPanelAccionesFormularioEstadoGarantiaCliente,jmenuBarEstadoGarantiaCliente,jmenuBarDetalleEstadoGarantiaCliente,jTtoolBarEstadoGarantiaCliente,jTtoolBarDetalleEstadoGarantiaCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoGarantiaCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoGarantiaCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoGarantiaCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoGarantiaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoGarantiaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoGarantiaCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoGarantiaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoGarantiaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoGarantiaCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadogarantiaclienteConstantesFunciones.getsFinalQueryEstadoGarantiaCliente();
		String  finalQueryPaginacionTodos=this.estadogarantiaclienteConstantesFunciones.getsFinalQueryEstadoGarantiaCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoGarantiaClienteConstantesFunciones.getArrayColumnasGlobalesNoEstadoGarantiaCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoGarantiaClienteConstantesFunciones.getArrayColumnasGlobalesEstadoGarantiaCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoGarantiaClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadogarantiaclientesEliminados= new ArrayList<EstadoGarantiaCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoGarantiaCliente();
		
				///*EstadoGarantiaClienteSessionBean*/this.estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
			
			if(this.estadogarantiaclienteSessionBean==null) {
				this.estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
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
					this.iNumeroPaginacion=EstadoGarantiaClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoGarantiaClienteConstantesFunciones.getClassesForeignKeysOfEstadoGarantiaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadogarantiacliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadogarantiaclientesAux= new ArrayList<EstadoGarantiaCliente>();
			
				
			estadogarantiaclienteLogic.setDatosCliente(this.datosCliente);
			estadogarantiaclienteLogic.setDatosDeep(this.datosDeep);
			estadogarantiaclienteLogic.setIsConDeep(true);
			
			
			estadogarantiaclienteLogic.getEstadoGarantiaClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadogarantiaclienteLogic.getTodosEstadoGarantiaClientes(finalQueryGlobal,pagination);
					
					//estadogarantiaclienteLogic.getTodosEstadoGarantiaClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadogarantiaclienteLogic.getEstadoGarantiaClientes()==null|| estadogarantiaclienteLogic.getEstadoGarantiaClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadogarantiaclientesAux= new ArrayList<EstadoGarantiaCliente>();
							estadogarantiaclientesAux.addAll(estadogarantiaclienteLogic.getEstadoGarantiaClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadogarantiaclientesAux= new ArrayList<EstadoGarantiaCliente>();
							estadogarantiaclientesAux.addAll(estadogarantiaclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadogarantiaclienteLogic.getTodosEstadoGarantiaClientes(finalQueryGlobal+"",this.pagination);												
							
							//estadogarantiaclienteLogic.getTodosEstadoGarantiaClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoGarantiaClientes("Todos",estadogarantiaclienteLogic.getEstadoGarantiaClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadogarantiaclienteLogic.setEstadoGarantiaClientes(new ArrayList<EstadoGarantiaCliente>());					
							estadogarantiaclienteLogic.getEstadoGarantiaClientes().addAll(estadogarantiaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadogarantiaclientes=new ArrayList<EstadoGarantiaCliente>();
							estadogarantiaclientes.addAll(estadogarantiaclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoGarantiaCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoGarantiaCliente=this.idActual;
				
				} else if(this.idEstadoGarantiaClienteActual!=null && this.idEstadoGarantiaClienteActual!=0L) {
					idEstadoGarantiaCliente=idEstadoGarantiaClienteActual;
				}
				
					
				this.sDetalleReporte=EstadoGarantiaClienteConstantesFunciones.getDetalleIndicePorId(idEstadoGarantiaCliente);
				
				this.estadogarantiaclientes=new ArrayList<EstadoGarantiaCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadogarantiaclienteLogic.getEntity(idEstadoGarantiaCliente);
					
					//estadogarantiaclienteLogic.getEntityWithConnection(idEstadoGarantiaCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadogarantiaclienteLogic.setEstadoGarantiaClientes(new ArrayList<EstadoGarantiaCliente>());
					estadogarantiaclienteLogic.getEstadoGarantiaClientes().add(estadogarantiaclienteLogic.getEstadoGarantiaCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadogarantiaclientes=new ArrayList<EstadoGarantiaCliente>();
					this.estadogarantiaclientes.add(estadogarantiacliente);
				}
				
				if(estadogarantiaclienteLogic.getEstadoGarantiaCliente()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoGarantiaCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoGarantiaCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadogarantiaclienteLogic.getEstadoGarantiaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadogarantiaclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadogarantiaclienteLogic.getEstadoGarantiaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadogarantiaclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoGarantiaCliente estadogarantiacliente) {
		Boolean permite=true;
		
		if(this.estadogarantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoGarantiaClienteConstantesFunciones.getOrderByListaEstadoGarantiaCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoGarantiaClienteConstantesFunciones.getOrderByListaEstadoGarantiaCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGarantiaCliente estadogarantiacliente:estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
				if(estadogarantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadogarantiaclienteTotales=estadogarantiacliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGarantiaCliente estadogarantiacliente:this.estadogarantiaclientes) {
				if(estadogarantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadogarantiaclienteTotales=estadogarantiacliente;
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
			this.estadogarantiaclienteAux=new EstadoGarantiaCliente();
			this.estadogarantiaclienteAux.setsType(Constantes2.S_TOTALES);
			this.estadogarantiaclienteAux.setIsNew(false);
			this.estadogarantiaclienteAux.setIsChanged(false);
			this.estadogarantiaclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoGarantiaClienteConstantesFunciones.TotalizarValoresFilaEstadoGarantiaCliente(this.estadogarantiaclienteLogic.getEstadoGarantiaClientes(),this.estadogarantiaclienteAux);
				
				this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().add(this.estadogarantiaclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoGarantiaClienteConstantesFunciones.TotalizarValoresFilaEstadoGarantiaCliente(this.estadogarantiaclientes,this.estadogarantiaclienteAux);
				
				this.estadogarantiaclientes.add(this.estadogarantiaclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadogarantiaclienteTotales=new EstadoGarantiaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().remove(estadogarantiaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadogarantiaclientes.remove(estadogarantiaclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadogarantiaclienteTotales=new EstadoGarantiaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoGarantiaCliente estadogarantiacliente:estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
				if(estadogarantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadogarantiaclienteTotales=estadogarantiacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoGarantiaClienteConstantesFunciones.TotalizarValoresFilaEstadoGarantiaCliente(this.estadogarantiaclienteLogic.getEstadoGarantiaClientes(),estadogarantiaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoGarantiaCliente estadogarantiacliente:this.estadogarantiaclientes) {
				if(estadogarantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadogarantiaclienteTotales=estadogarantiacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoGarantiaClienteConstantesFunciones.TotalizarValoresFilaEstadoGarantiaCliente(this.estadogarantiaclientes,estadogarantiaclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoGarantiaCliente() {
		this.isPermisoTodoEstadoGarantiaCliente=false;
		this.isPermisoNuevoEstadoGarantiaCliente=false;
		this.isPermisoActualizarEstadoGarantiaCliente=false;
		this.isPermisoActualizarOriginalEstadoGarantiaCliente=false;
		this.isPermisoEliminarEstadoGarantiaCliente=false;
		this.isPermisoGuardarCambiosEstadoGarantiaCliente=false;
		this.isPermisoConsultaEstadoGarantiaCliente=false;
		this.isPermisoBusquedaEstadoGarantiaCliente=false;
		this.isPermisoReporteEstadoGarantiaCliente=false;		
		this.isPermisoOrdenEstadoGarantiaCliente=false;		
		this.isPermisoPaginacionMedioEstadoGarantiaCliente=false;		
		this.isPermisoPaginacionAltoEstadoGarantiaCliente=false;
		this.isPermisoPaginacionTodoEstadoGarantiaCliente=false;
		this.isPermisoCopiarEstadoGarantiaCliente=false;		
		this.isPermisoVerFormEstadoGarantiaCliente=false;		
		this.isPermisoDuplicarEstadoGarantiaCliente=false;		
		this.isPermisoOrdenEstadoGarantiaCliente=false;		
	}
	
	public void setPermisosUsuarioEstadoGarantiaCliente(Boolean isPermiso) {
		this.isPermisoTodoEstadoGarantiaCliente=isPermiso;
		this.isPermisoNuevoEstadoGarantiaCliente=isPermiso;
		this.isPermisoActualizarEstadoGarantiaCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoGarantiaCliente=isPermiso;
		this.isPermisoEliminarEstadoGarantiaCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoGarantiaCliente=isPermiso;
		this.isPermisoConsultaEstadoGarantiaCliente=isPermiso;
		this.isPermisoBusquedaEstadoGarantiaCliente=isPermiso;
		this.isPermisoReporteEstadoGarantiaCliente=isPermiso;
		this.isPermisoOrdenEstadoGarantiaCliente=isPermiso;		
		this.isPermisoPaginacionMedioEstadoGarantiaCliente=isPermiso;		
		this.isPermisoPaginacionAltoEstadoGarantiaCliente=isPermiso;		
		this.isPermisoPaginacionTodoEstadoGarantiaCliente=isPermiso;		
		this.isPermisoCopiarEstadoGarantiaCliente=isPermiso;		
		this.isPermisoVerFormEstadoGarantiaCliente=isPermiso;		
		this.isPermisoDuplicarEstadoGarantiaCliente=isPermiso;
		this.isPermisoOrdenEstadoGarantiaCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoGarantiaCliente(Boolean isPermiso) {
		//this.isPermisoTodoEstadoGarantiaCliente=isPermiso;
		this.isPermisoNuevoEstadoGarantiaCliente=isPermiso;
		this.isPermisoActualizarEstadoGarantiaCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoGarantiaCliente=isPermiso;
		this.isPermisoEliminarEstadoGarantiaCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoGarantiaCliente=isPermiso;
		//this.isPermisoConsultaEstadoGarantiaCliente=isPermiso;
		//this.isPermisoBusquedaEstadoGarantiaCliente=isPermiso;
		//this.isPermisoReporteEstadoGarantiaCliente=isPermiso;
		//this.isPermisoOrdenEstadoGarantiaCliente=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoGarantiaCliente=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoGarantiaCliente=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoGarantiaCliente=isPermiso;		
		//this.isPermisoCopiarEstadoGarantiaCliente=isPermiso;		
		//this.isPermisoDuplicarEstadoGarantiaCliente=isPermiso;
		//this.isPermisoOrdenEstadoGarantiaCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoGarantiaClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(GarantiaClienteConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoGarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosGarantiaCliente=false;
		this.isTienePermisosGarantiaCliente=this.verificarGetPermisosUsuarioOpcionEstadoGarantiaClienteClaseRelacionada(this.opcionsRelacionadas,GarantiaClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoGarantiaCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoGarantiaClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosGarantiaCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoGarantiaClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoGarantiaClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoGarantiaClienteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosGarantiaCliente && this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.remove(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoGarantiaCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoGarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoGarantiaClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoGarantiaCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoGarantiaCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoGarantiaCliente=this.isPermisoActualizarEstadoGarantiaCliente;
			this.isPermisoEliminarEstadoGarantiaCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoGarantiaCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoGarantiaCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoGarantiaCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoGarantiaCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoGarantiaCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoGarantiaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoGarantiaCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoGarantiaCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoGarantiaCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoGarantiaCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoGarantiaCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoGarantiaCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoGarantiaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoGarantiaCliente.setToolTipText(this.jTableDatosEstadoGarantiaCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoGarantiaCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoGarantiaCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoGarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoGarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoGarantiaCliente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosGarantiaCliente && this.estadogarantiaclienteConstantesFunciones.mostrarGarantiaClienteEstadoGarantiaCliente && !EstadoGarantiaClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Garantia Cliente");
			reporte.setsDescripcion("Garantia Cliente");
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
	
		
	public void inicializarCombosForeignKeyEstadoGarantiaClienteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoGarantiaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoGarantiaClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoGarantiaClienteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoGarantiaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoGarantiaCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoGarantiaCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoGarantiaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoGarantiaCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoGarantiaCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoGarantiaCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoGarantiaCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoGarantiaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoGarantiaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoGarantiaCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoGarantiaCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoGarantiaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoGarantiaCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoGarantiaClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoGarantiaClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoGarantiaClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean(); 
		this.estadogarantiaclienteConstantesFunciones=new EstadoGarantiaClienteConstantesFunciones(); 
		this.estadogarantiaclienteBean=new EstadoGarantiaCliente();//(this.estadogarantiaclienteConstantesFunciones); 		
		this.estadogarantiaclienteReturnGeneral=new EstadoGarantiaClienteParameterReturnGeneral(); 
		
		this.estadogarantiaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadogarantiaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoGarantiaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoGarantiaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoGarantiaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoGarantiaCliente(true);
			
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
			
			this.estadogarantiaclienteConstantesFunciones=new EstadoGarantiaClienteConstantesFunciones(); 
			this.estadogarantiaclienteBean=new EstadoGarantiaCliente();//this.estadogarantiaclienteConstantesFunciones); 			
			this.estadogarantiaclienteReturnGeneral=new EstadoGarantiaClienteParameterReturnGeneral(); 
		
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Garantia Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadogarantiacliente=new EstadoGarantiaCliente();
			this.estadogarantiaclientes = new ArrayList<EstadoGarantiaCliente>();
			this.estadogarantiaclientesAux = new ArrayList<EstadoGarantiaCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic=new EstadoGarantiaClienteLogic();
				this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estadogarantiaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadogarantiaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoGarantiaCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoGarantiaCliente);	
					}
					
					if(this.jInternalFrameImportacionEstadoGarantiaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoGarantiaCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoGarantiaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoGarantiaCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoGarantiaCliente);
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.setVisible(false);
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente);
					this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoGarantiaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoGarantiaCliente);
					this.jInternalFrameImportacionEstadoGarantiaCliente.setVisible(false);
					this.jInternalFrameImportacionEstadoGarantiaCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoGarantiaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoGarantiaCliente);
					this.jInternalFrameOrderByEstadoGarantiaCliente.setVisible(false);
					this.jInternalFrameOrderByEstadoGarantiaCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoGarantiaClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoGarantiaClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadogarantiaclienteReturnGeneral=new EstadoGarantiaClienteParameterReturnGeneral();
			
			this.estadogarantiaclienteParameterGeneral=new EstadoGarantiaClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadogarantiaclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoGarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(GarantiaClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoGarantiaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado(),this.estadogarantiaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoGarantiaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado(),this.estadogarantiaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaCopiarEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaVerFormEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaOrdenEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoGarantiaCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoGarantiaCliente(false);
			
			this.setPermisosUsuarioEstadoGarantiaCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado() && this.estadogarantiaclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoGarantiaClienteClasesRelacionadas();
			}
			
			if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoGarantiaClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoGarantiaCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoGarantiaCliente();
			}
			
			if(!this.isPermisoBusquedaEstadoGarantiaCliente) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoGarantiaCliente,this.isPermisoPaginacionMedioEstadoGarantiaCliente,this.isPermisoPaginacionTodoEstadoGarantiaCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoGarantiaClienteConstantesFunciones.getTiposSeleccionarEstadoGarantiaCliente());
				
				this.tiposColumnasSelect=EstadoGarantiaClienteConstantesFunciones.getTiposSeleccionarEstadoGarantiaCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoGarantiaCliente();				
				//this.tiposRelacionesSelect=EstadoGarantiaClienteConstantesFunciones.getTiposRelacionesEstadoGarantiaCliente(true);
				
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
			//if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoGarantiaCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoGarantiaCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoGarantiaCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoGarantiaCliente() ;
			
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
			
			
			this.garantiaclienteLogic=new GarantiaClienteLogic(); 
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
				estadogarantiaclienteImplementable= (EstadoGarantiaClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoGarantiaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadogarantiaclienteImplementableHome= (EstadoGarantiaClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoGarantiaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadogarantiaclientes= new ArrayList<EstadoGarantiaCliente>();
			this.estadogarantiaclientesEliminados= new ArrayList<EstadoGarantiaCliente>();
						
			this.isEsNuevoEstadoGarantiaCliente=false;
			this.esParaAccionDesdeFormularioEstadoGarantiaCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoGarantiaCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoGarantiaCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoGarantiaClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoGarantiaCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoGarantiaCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoGarantiaCliente();
			}
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoGarantiaCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoGarantiaCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoGarantiaCliente() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoGarantiaCliente")) {
				iIndex=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();	
				
				

				if(sTitle.equals("Garantia Clientes")) {
					if(!GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoGarantiaCliente();

						this.cargarParteTabPanelRelacionadaGarantiaCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoGarantiaCliente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaGarantiaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.cargarSessionConBeanSwingJInternalFrameGarantiaCliente(false,true,iIndex);
		this.jButtonGarantiaClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaGarantiaCliente();

		//this.jTabbedPaneRelacionesEstadoGarantiaCliente.updateUI();
		//this.jTabbedPaneRelacionesEstadoGarantiaCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoGarantiaCliente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("GarantiaCliente")) {
				int row=this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
				jButtonGarantiaClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Garantia Cliente")) {

					if(this.isTienePermisosGarantiaCliente && this.estadogarantiaclienteConstantesFunciones.mostrarGarantiaClienteEstadoGarantiaCliente && !EstadoGarantiaClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Garantia Clientes"+"("+GarantiaClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Garantia Clientes");

						if(estadogarantiaclienteConstantesFunciones.resaltarGarantiaClienteEstadoGarantiaCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadogarantiaclienteConstantesFunciones.resaltarGarantiaClienteEstadoGarantiaCliente);
						}

						jmenuItem.setEnabled(this.estadogarantiaclienteConstantesFunciones.activarGarantiaClienteEstadoGarantiaCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"GarantiaCliente"));

						

						this.jInternalFrameDetalleFormEstadoGarantiaCliente.jmenuDetalleEstadoGarantiaCliente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoGarantiaCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoGarantiaCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoGarantiaCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoGarantiaClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoGarantiaCliente();
		
		this.cargarCombosFrameForeignKeyEstadoGarantiaCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoGarantiaCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoGarantiaCliente();
		}
	}
	
	
	
	public void jButtonNuevoEstadoGarantiaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
			
			if(jTableDatosEstadoGarantiaCliente.getRowCount()>=1) {
				jTableDatosEstadoGarantiaCliente.removeRowSelectionInterval(0, jTableDatosEstadoGarantiaCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoGarantiaCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoGarantiaCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoGarantiaCliente(true);			
			//this.estadogarantiacliente=new EstadoGarantiaCliente();
			//this.estadogarantiacliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoGarantiaCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente() ;
			
			if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoGarantiaCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadogarantiacliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);				
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
			if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoGarantiaCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoGarantiaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoGarantiaCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoGarantiaCliente.getSelectedRows().length;			
			}
			
			estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoGarantiaCliente--;			
				//EstadoGarantiaCliente estadogarantiaclienteAux= new EstadoGarantiaCliente();			
				//estadogarantiaclienteAux.setId(this.iIdNuevoEstadoGarantiaCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoGarantiaCliente estadogarantiaclienteOrigen=new EstadoGarantiaCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoGarantiaCliente estadogarantiaclienteOrigen : estadogarantiaclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadogarantiaclienteOrigen =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadogarantiaclienteOrigen =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoGarantiaCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadogarantiacliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoGarantiaCliente(estadogarantiaclienteOrigen,this.estadogarantiacliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().add(this.estadogarantiaclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadogarantiaclientes.add(this.estadogarantiaclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
				
				this.jTableDatosEstadoGarantiaCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoGarantiaCliente(), this.getIndiceNuevoEstadoGarantiaCliente());
				
				int iLastRow =  this.jTableDatosEstadoGarantiaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoGarantiaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoGarantiaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();									
		
			EstadoGarantiaCliente estadogarantiaclienteOrigen=new EstadoGarantiaCliente();
			EstadoGarantiaCliente estadogarantiaclienteDestino=new EstadoGarantiaCliente();
				
			estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoGarantiaCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadogarantiaclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoGarantiaCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogarantiaclienteOrigen =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadogarantiaclienteOrigen =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadogarantiaclienteDestino =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadogarantiaclienteDestino =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadogarantiaclienteOrigen =estadogarantiaclientesSeleccionados.get(0);
				estadogarantiaclienteDestino =estadogarantiaclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoGarantiaCliente(estadogarantiaclienteOrigen,estadogarantiaclienteDestino,true,false);
				
				estadogarantiaclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadogarantiaclienteDestino,estadogarantiaclienteLogic.getEstadoGarantiaClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadogarantiaclienteDestino,estadogarantiaclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
				
				//this.jTableDatosEstadoGarantiaCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoGarantiaCliente(), this.getIndiceNuevoEstadoGarantiaCliente());
				
				int iLastRow =  this.jTableDatosEstadoGarantiaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoGarantiaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoGarantiaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoGarantiaCliente.isVisible();
			
			
			this.jPanelParametrosReportesEstadoGarantiaCliente.setVisible(!isVisible);
			this.jPanelPaginacionEstadoGarantiaCliente.setVisible(!isVisible);
			this.jPanelAccionesEstadoGarantiaCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoGarantiaCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoGarantiaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoGarantiaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoGarantiaCliente();
			
			this.abrirFrameOrderByEstadoGarantiaCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoGarantiaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoGarantiaCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoGarantiaCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoGarantiaCliente.setSize(this.jInternalFrameDetalleFormEstadoGarantiaCliente.iWidthFormulario,this.jInternalFrameDetalleFormEstadoGarantiaCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoGarantiaCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoGarantiaCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoGarantiaCliente.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoGarantiaCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jContentPaneDetalleEstadoGarantiaCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jContentPaneDetalleEstadoGarantiaCliente.getWidth(),EstadoGarantiaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jContentPaneDetalleEstadoGarantiaCliente.getWidth(),EstadoGarantiaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jContentPaneDetalleEstadoGarantiaCliente.getWidth(),EstadoGarantiaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaGarantiaCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoGarantiaCliente.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoGarantiaCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoGarantiaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoGarantiaCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoGarantiaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoGarantiaCliente,false,this);
				} else {
					this.jInternalFrameOrderByEstadoGarantiaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoGarantiaCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoGarantiaCliente);
				this.jInternalFrameOrderByEstadoGarantiaCliente.setVisible(false);
				this.jInternalFrameOrderByEstadoGarantiaCliente.setSelected(false);
				
				this.jInternalFrameOrderByEstadoGarantiaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoGarantiaCliente"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoGarantiaCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoGarantiaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoGarantiaCliente==null) {
				
				this.jInternalFrameImportacionEstadoGarantiaCliente=new ImportacionJInternalFrame(EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoGarantiaCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoGarantiaCliente);
				this.jInternalFrameImportacionEstadoGarantiaCliente.setVisible(false);
				this.jInternalFrameImportacionEstadoGarantiaCliente.setSelected(false);


				this.jInternalFrameImportacionEstadoGarantiaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoGarantiaCliente"));
				this.jInternalFrameImportacionEstadoGarantiaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoGarantiaCliente"));
				this.jInternalFrameImportacionEstadoGarantiaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoGarantiaCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoGarantiaCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente==null) {
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente=new ReporteDinamicoJInternalFrame(EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoGarantiaCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente);
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoGarantiaCliente"));
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoGarantiaCliente"));
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoGarantiaCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoGarantiaCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaGarantiaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jContentPaneDetalleEstadoGarantiaCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoGarantiaCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoGarantiaCliente);
			
	       	this.jInternalFrameDetalleFormEstadoGarantiaCliente.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoGarantiaCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoGarantiaCliente.dispose();
			//this.jInternalFrameDetalleFormEstadoGarantiaCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoGarantiaCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoGarantiaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoGarantiaCliente.setVisible(true);
	        this.jInternalFrameImportacionEstadoGarantiaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoGarantiaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoGarantiaCliente.setVisible(true);
	        this.jInternalFrameOrderByEstadoGarantiaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoGarantiaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoGarantiaCliente.setVisible(false);
	        this.jInternalFrameOrderByEstadoGarantiaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoGarantiaCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoGarantiaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoGarantiaCliente.setVisible(false);
	        this.jInternalFrameImportacionEstadoGarantiaCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoGarantiaCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoGarantiaCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoGarantiaCliente(true);
			//this.isEsNuevoEstadoGarantiaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoGarantiaCliente(false) ;
			
			if(estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.getEsGuardarRelacionado() && GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonGarantiaClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoGarantiaCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoGarantiaClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoGarantiaCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoGarantiaCliente(true);
			//this.isEsNuevoEstadoGarantiaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadogarantiacliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoGarantiaCliente(false) ;
			
			if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoGarantiaCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoGarantiaCliente(false);
			
			//if(!this.isEsNuevoEstadoGarantiaCliente) {								
				int intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
				
			}
			
			if(this.permiteMantenimiento(this.estadogarantiacliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoGarantiaCliente=true;
					this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
					this.isEsNuevoEstadoGarantiaCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoGarantiaCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoGarantiaCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoGarantiaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoGarantiaCliente(false);
			
												
				
				if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoGarantiaCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,estadogarantiaclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoGarantiaCliente(this.estadogarantiacliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoGarantiaCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadogarantiaclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadogarantiacliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadogarantiacliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadogarantiacliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadogarantiacliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoGarantiaClienteModel) this.jTableDatosEstadoGarantiaCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoGarantiaCliente=true;
				this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
				this.isEsNuevoEstadoGarantiaCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoGarantiaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoGarantiaCliente(false);
				
				
				
				if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoGarantiaCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoGarantiaCliente.getRowCount()>=1) {
				jTableDatosEstadoGarantiaCliente.removeRowSelectionInterval(0, jTableDatosEstadoGarantiaCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoGarantiaCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoGarantiaCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente(false) ;
			
			this.isEsNuevoEstadoGarantiaCliente=false;
			
			if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoGarantiaCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoGarantiaCliente(false);
				
				//SI ES MANUAL
				if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoGarantiaCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoGarantiaCliente--;			
			//EstadoGarantiaCliente estadogarantiaclienteAux= new EstadoGarantiaCliente();			
			//estadogarantiaclienteAux.setId(this.iIdNuevoEstadoGarantiaCliente);
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoGarantiaCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
			
			this.estadogarantiacliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().add(this.estadogarantiaclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadogarantiaclientes.add(this.estadogarantiaclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
			
			this.jTableDatosEstadoGarantiaCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoGarantiaCliente(), this.getIndiceNuevoEstadoGarantiaCliente());
			
			int iLastRow =  this.jTableDatosEstadoGarantiaCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoGarantiaCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoGarantiaCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoGarantiaCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoGarantiaCliente(false);
			
			//SI ES MANUAL
			if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoGarantiaCliente();
			}
			
			//this.abrirFrameTreeEstadoGarantiaCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Garantia ClienteS ?", "MANTENIMIENTO DE Estado Garantia Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoGarantiaCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoGarantiaCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadogarantiaclienteReturnGeneral=estadogarantiaclienteLogic.procesarImportacionEstadoGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadogarantiaclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoGarantiaClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoGarantiaCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoGarantiaCliente.setFileImportacion(this.jInternalFrameImportacionEstadoGarantiaCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoGarantiaCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoGarantiaCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoGarantiaCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoGarantiaCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		

		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoGarantiaClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoGarantiaClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoGarantiaClientes("Todos",estadogarantiaclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogarantiacliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoGarantiaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoGarantiaCliente estadogarantiacliente:estadogarantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadogarantiacliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoGarantiaCliente estadogarantiacliente:estadogarantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadogarantiacliente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoGarantiaCliente(row);				
			//	iRow++;
			//}				
			
			//for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoGarantiaCliente(estadogarantiaclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoGarantiaCliente(false);
			
			//SI ES MANUAL
			if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoGarantiaCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoGarantiaCliente(false);
			
			//SI ES MANUAL
			if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoGarantiaCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoGarantiaCliente(false);
			
			//SI ES MANUAL
			if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoGarantiaCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoGarantiaCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoGarantiaCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoGarantiaCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoGarantiaCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoGarantiaCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoGarantiaCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoGarantiaCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoGarantiaCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoGarantiaCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoGarantiaCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoGarantiaCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoGarantiaCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoGarantiaCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoGarantiaCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoGarantiaCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoGarantiaCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoGarantiaCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoGarantiaCliente();
		
		this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoGarantiaCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoGarantiaCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoGarantiaCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoGarantiaCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoGarantiaCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoGarantiaCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jCheckBoxPostAccionNuevoEstadoGarantiaCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jCheckBoxPostAccionSinCerrarEstadoGarantiaCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jCheckBoxPostAccionSinMensajeEstadoGarantiaCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoGarantiaCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoGarantiaCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.jCheckBoxPostAccionNuevoEstadoGarantiaCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.jCheckBoxPostAccionSinCerrarEstadoGarantiaCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.jCheckBoxPostAccionSinMensajeEstadoGarantiaCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoGarantiaCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoGarantiaCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoGarantiaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoGarantiaCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoGarantiaCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoGarantiaCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoGarantiaCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoGarantiaCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoGarantiaCliente() throws Exception {
		try	{
			if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoGarantiaCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoGarantiaCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoGarantiaCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoGarantiaCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoGarantiaCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoGarantiaCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoGarantiaCliente.addItem(reporte);
			}
			
			
			if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoGarantiaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoGarantiaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoGarantiaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoGarantiaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoGarantiaCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoGarantiaCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoGarantiaCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoGarantiaCliente(Boolean esInicializar) throws Exception {				
		if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoGarantiaCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoGarantiaCliente() throws Exception {
		this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoGarantiaCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoGarantiaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoGarantiaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoGarantiaClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGarantiaClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoGarantiaClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoGarantiaClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoGarantiaCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadogarantiaclienteLogic.getEstadoGarantiaClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadogarantiaclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoGarantiaCliente.setModel(new EstadoGarantiaClienteModel(this.estadogarantiaclienteLogic.getEstadoGarantiaClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoGarantiaCliente.setModel(new EstadoGarantiaClienteModel(this.estadogarantiaclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoGarantiaCliente!=null && this.jInternalFrameOrderByEstadoGarantiaCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoGarantiaCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGarantiaCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoGarantiaClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO,estadogarantiaclienteConstantesFunciones.resaltarSeleccionarEstadoGarantiaCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoGarantiaClienteConstantesFunciones.SCLASSWEBTITULO,estadogarantiaclienteConstantesFunciones.resaltarSeleccionarEstadoGarantiaCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGarantiaCliente,EstadoGarantiaClienteConstantesFunciones.LABEL_ID));

		if(this.estadogarantiaclienteConstantesFunciones.mostraridEstadoGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoGarantiaClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadogarantiaclienteConstantesFunciones.resaltaridEstadoGarantiaCliente,this.estadogarantiaclienteConstantesFunciones.activaridEstadoGarantiaCliente,this,true,"idEstadoGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadogarantiaclienteConstantesFunciones.resaltaridEstadoGarantiaCliente,this.estadogarantiaclienteConstantesFunciones.activaridEstadoGarantiaCliente,this,true,"idEstadoGarantiaCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGarantiaCliente,EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO));

		if(this.estadogarantiaclienteConstantesFunciones.mostrarcodigoEstadoGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadogarantiaclienteConstantesFunciones.resaltarcodigoEstadoGarantiaCliente,this.estadogarantiaclienteConstantesFunciones.activarcodigoEstadoGarantiaCliente,this,true,"codigoEstadoGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadogarantiaclienteConstantesFunciones.resaltarcodigoEstadoGarantiaCliente,this.estadogarantiaclienteConstantesFunciones.activarcodigoEstadoGarantiaCliente,this,true,"codigoEstadoGarantiaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoGarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoGarantiaCliente,EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.estadogarantiaclienteConstantesFunciones.mostrarnombreEstadoGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadogarantiaclienteConstantesFunciones.resaltarnombreEstadoGarantiaCliente,this.estadogarantiaclienteConstantesFunciones.activarnombreEstadoGarantiaCliente,this,true,"nombreEstadoGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadogarantiaclienteConstantesFunciones.resaltarnombreEstadoGarantiaCliente,this.estadogarantiaclienteConstantesFunciones.activarnombreEstadoGarantiaCliente,this,true,"nombreEstadoGarantiaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoGarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosGarantiaCliente && this.estadogarantiaclienteConstantesFunciones.mostrarGarantiaClienteEstadoGarantiaCliente && !EstadoGarantiaClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Garantia Clientes");
				tableColumn.setHeaderValue("Garantia Clientes");
				tableColumn.setCellRenderer(new GarantiaClienteTableCell(estadogarantiaclienteConstantesFunciones.resaltarGarantiaClienteEstadoGarantiaCliente,this,this.estadogarantiaclienteConstantesFunciones.activarGarantiaClienteEstadoGarantiaCliente));
				tableColumn.setCellEditor(new GarantiaClienteTableCell(estadogarantiaclienteConstantesFunciones.resaltarGarantiaClienteEstadoGarantiaCliente,this,this.estadogarantiaclienteConstantesFunciones.activarGarantiaClienteEstadoGarantiaCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoGarantiaCliente.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoGarantiaCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoGarantiaCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoGarantiaCliente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoGarantiaCliente.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoGarantiaCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoGarantiaCliente.moveColumn(this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoGarantiaCliente.moveColumn(this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoGarantiaCliente.moveColumn(this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoGarantiaCliente.moveColumn(this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoGarantiaCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoGarantiaCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoGarantiaCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoGarantiaCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoGarantiaCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoGarantiaCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadogarantiaclienteLogic.getEstadoGarantiaClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadogarantiaclientes.size()-1;
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
		//this.jTableDatosEstadoGarantiaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoGarantiaCliente();
			
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
				
				//this.isEsNuevoEstadoGarantiaCliente=false;
					
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
				if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoGarantiaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoGarantiaCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadogarantiacliente.getsType().equals("DUPLICADO")
				   || this.estadogarantiacliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoGarantiaCliente=true;
				
				} else {
					this.isEsNuevoEstadoGarantiaCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.estadogarantiacliente.getId()>=0 && !this.estadogarantiacliente.getIsNew()) {						
						this.isEsNuevoEstadoGarantiaCliente=false;
						
					} else {
						this.isEsNuevoEstadoGarantiaCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoGarantiaCliente(esRelaciones);						
				
				this.seleccionarEstadoGarantiaCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadogarantiacliente.getId()<0) {
					this.isEsNuevoEstadoGarantiaCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoGarantiaCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoGarantiaCliente(evt,rowIndex);
				}	
				
				if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoGarantiaCliente: " + this.dDif); 
					}
				}								
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoGarantiaCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadogarantiacliente)) {
					if(this.estadogarantiacliente.getId()>0) {
						this.estadogarantiacliente.setIsDeleted(true);
						
						this.estadogarantiaclientesEliminados.add(this.estadogarantiacliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().remove(this.estadogarantiacliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadogarantiaclientes.remove(this.estadogarantiacliente);				
					}
					
					
					((EstadoGarantiaClienteModel) this.jTableDatosEstadoGarantiaCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoGarantiaCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoGarantiaCliente) {
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoGarantiaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoGarantiaCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoGarantiaCliente(this.estadogarantiacliente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoGarantiaCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoGarantiaCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoGarantiaCliente(estadogarantiacliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoGarantiaCliente(estadogarantiacliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoGarantiaCliente(estadogarantiacliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoGarantiaCliente(estadogarantiacliente);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.setText(estadogarantiacliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldcodigoEstadoGarantiaCliente.setText(estadogarantiacliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextAreanombreEstadoGarantiaCliente.setText(estadogarantiacliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoGarantiaCliente estadogarantiaclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadogarantiaclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoGarantiaCliente estadogarantiaclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadogarantiaclienteLocal=this.estadogarantiacliente;
			} else {
				estadogarantiaclienteLocal=this.estadogarantiaclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadogarantiaclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoGarantiaCliente(estadogarantiaclienteLocal,true);
					
					if(estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadogarantiaclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadogarantiaclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(estadogarantiacliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(estadogarantiacliente);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(estadogarantiacliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.getText()==null || this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.getText()=="" || this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.setText("0");
			}

			if(conColumnasBase) {estadogarantiacliente.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoGarantiaClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGarantiaCliente.jLabelIdEstadoGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadogarantiacliente.setcodigo(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldcodigoEstadoGarantiaCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGarantiaCliente.jLabelcodigoEstadoGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadogarantiacliente.setnombre(this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextAreanombreEstadoGarantiaCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoGarantiaCliente.jLabelnombreEstadoGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiaclienteBean,EstadoGarantiaCliente estadogarantiacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiaclienteOrigen,EstadoGarantiaCliente estadogarantiacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadogarantiaclienteOrigen.getId()!=null && !estadogarantiaclienteOrigen.getId().equals(0L))) {estadogarantiacliente.setId(estadogarantiaclienteOrigen.getId());}}
			if(conDefault || (!conDefault && estadogarantiaclienteOrigen.getcodigo()!=null && !estadogarantiaclienteOrigen.getcodigo().equals(""))) {estadogarantiacliente.setcodigo(estadogarantiaclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadogarantiaclienteOrigen.getnombre()!=null && !estadogarantiaclienteOrigen.getnombre().equals(""))) {estadogarantiacliente.setnombre(estadogarantiaclienteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.setText(estadogarantiacliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldcodigoEstadoGarantiaCliente.setText(estadogarantiacliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextAreanombreEstadoGarantiaCliente.setText(estadogarantiacliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoGarantiaCliente(EstadoGarantiaClienteBean estadogarantiaclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.setText(estadogarantiaclienteBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldcodigoEstadoGarantiaCliente.setText(estadogarantiaclienteBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextAreanombreEstadoGarantiaCliente.setText(estadogarantiaclienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoGarantiaCliente(EstadoGarantiaClienteParameterReturnGeneral estadogarantiaclienteReturnGeneral,EstadoGarantiaClienteBean estadogarantiaclienteBean,Boolean conDefault) throws Exception { 
		try {
			EstadoGarantiaCliente estadogarantiaclienteLocal=new EstadoGarantiaCliente();
			
			estadogarantiaclienteLocal=estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadogarantiaclienteLocal.getId()!=null && !estadogarantiaclienteLocal.getId().equals(0L))) {estadogarantiaclienteBean.setId(estadogarantiaclienteLocal.getId());}}
			if(conDefault || (!conDefault && estadogarantiaclienteLocal.getcodigo()!=null && !estadogarantiaclienteLocal.getcodigo().equals(""))) {estadogarantiaclienteBean.setcodigo(estadogarantiaclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && estadogarantiaclienteLocal.getnombre()!=null && !estadogarantiaclienteLocal.getnombre().equals(""))) {estadogarantiaclienteBean.setnombre(estadogarantiaclienteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoGarantiaClienteGenerico(Long idEstadoGarantiaClienteSeleccionado,JComboBox jComboBoxEstadoGarantiaCliente,List<EstadoGarantiaCliente> estadogarantiaclientesLocal)throws Exception {
		try {
			EstadoGarantiaCliente  estadogarantiaclienteTemp=null;

			for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesLocal) {
				if(estadogarantiaclienteAux.getId()!=null && estadogarantiaclienteAux.getId().equals(idEstadoGarantiaClienteSeleccionado)) {
					estadogarantiaclienteTemp=estadogarantiaclienteAux;
					break;
				}
			}

			jComboBoxEstadoGarantiaCliente.setSelectedItem(estadogarantiaclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoGarantiaClienteGenerico(JComboBox jComboBoxEstadoGarantiaCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoGarantiaCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoGarantiaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoGarantiaCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoGarantiaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("GarantiaCliente")) {
			jButtonGarantiaClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadogarantiacliente=(EstadoGarantiaCliente) estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadogarantiacliente =(EstadoGarantiaCliente) estadogarantiaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoGarantiaCliente estadogarantiaclienteRow=new EstadoGarantiaCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadogarantiaclienteRow=(EstadoGarantiaCliente) estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadogarantiaclienteRow=(EstadoGarantiaCliente) estadogarantiaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonGarantiaClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoGarantiaCliente estadogarantiacliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogarantiacliente = (EstadoGarantiaCliente)this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadogarantiacliente = (EstadoGarantiaCliente)this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadogarantiacliente!=null) {
						this.estadogarantiacliente = estadogarantiacliente;
					} else {
						this.estadogarantiacliente = new EstadoGarantiaCliente();
					}
				}

				if(this.isTienePermisosGarantiaCliente && this.permiteMantenimiento(this.estadogarantiacliente)) {
					GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFramePopup=new GarantiaClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						garantiaclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFramePopup;
					} else {
						garantiaclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame;
					}

					List<EstadoGarantiaCliente> estadogarantiaclientes=new ArrayList<EstadoGarantiaCliente>();
					estadogarantiaclientes.add(this.estadogarantiacliente);
					if(!esRelacionado) {
						//garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setConGuardarRelaciones(false);
						//garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					garantiaclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.cargarGarantiaClienteBeanSwingJInternalFrame(estadogarantiaclientes,this.estadogarantiacliente,garantiaclienteBeanSwingJInternalFrame,/*conInicializar,*/garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.getConGuardarRelaciones(),garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.getEsGuardarRelacionado());
					garantiaclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						garantiaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsGarantiaCliente("no_relacionado");

						garantiaclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(GarantiaClienteConstantesFunciones.ITAMANIOFILATABLA + (GarantiaClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						garantiaclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoGarantiaCliente=(TitledBorder)this.jScrollPanelDatosEstadoGarantiaCliente.getBorder();
						TitledBorder titledBorderGarantiaCliente=(TitledBorder)garantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosGarantiaCliente.getBorder();

						titledBorderGarantiaCliente.setTitle(titledBorderEstadoGarantiaCliente.getTitle() + " -> Garantia Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,garantiaclienteBeanSwingJInternalFrame);
						}

						garantiaclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(garantiaclienteBeanSwingJInternalFrame);

						garantiaclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Garantia Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoGarantiaCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente));			
			this.jButtonDuplicarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoGarantiaCliente && this.isPermisoDuplicarEstadoGarantiaCliente));			
			this.jButtonCopiarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoGarantiaCliente && this.isPermisoCopiarEstadoGarantiaCliente));
			this.jButtonVerFormEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoGarantiaCliente && this.isPermisoVerFormEstadoGarantiaCliente));
			
			this.jButtonAbrirOrderByEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoGarantiaCliente && this.isPermisoOrdenEstadoGarantiaCliente));			
			
			this.jButtonNuevoRelacionesEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente));			
			this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaModificarEstadoGarantiaCliente && this.isPermisoActualizarEstadoGarantiaCliente));	
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoGarantiaCliente && this.isPermisoActualizarEstadoGarantiaCliente));	
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoGarantiaCliente && this.isPermisoEliminarEstadoGarantiaCliente));
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarEstadoGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoGarantiaCliente);							
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente));						
			this.jButtonDuplicarToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoGarantiaCliente && this.isPermisoDuplicarEstadoGarantiaCliente));						
			this.jButtonCopiarToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoGarantiaCliente && this.isPermisoCopiarEstadoGarantiaCliente));			
			this.jButtonVerFormToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoGarantiaCliente && this.isPermisoVerFormEstadoGarantiaCliente));			
			this.jButtonAbrirOrderByToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoGarantiaCliente && this.isPermisoOrdenEstadoGarantiaCliente));
			this.jButtonNuevoRelacionesToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));			
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaModificarEstadoGarantiaCliente && this.isPermisoActualizarEstadoGarantiaCliente));	
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoGarantiaCliente  && this.isPermisoActualizarEstadoGarantiaCliente));	
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoGarantiaCliente && this.isPermisoEliminarEstadoGarantiaCliente));
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarToolBarEstadoGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoGarantiaCliente);				
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente));			
			this.jMenuItemDuplicarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoGarantiaCliente && this.isPermisoDuplicarEstadoGarantiaCliente));			
			this.jMenuItemCopiarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoGarantiaCliente && this.isPermisoCopiarEstadoGarantiaCliente));			
			this.jMenuItemVerFormEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoGarantiaCliente && this.isPermisoVerFormEstadoGarantiaCliente));			
			this.jMenuItemAbrirOrderByEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoGarantiaCliente && this.isPermisoOrdenEstadoGarantiaCliente));			
			//this.jMenuItemMostrarOcultarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoGarantiaCliente && this.isPermisoOrdenEstadoGarantiaCliente));
			this.jMenuItemDetalleAbrirOrderByEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoGarantiaCliente && this.isPermisoOrdenEstadoGarantiaCliente));			
			//this.jMenuItemDetalleMostrarOcultarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoGarantiaCliente && this.isPermisoOrdenEstadoGarantiaCliente));			
			this.jMenuItemNuevoRelacionesEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente));			
			this.jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoGarantiaCliente && this.isPermisoNuevoEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));									
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemModificarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaModificarEstadoGarantiaCliente && this.isPermisoActualizarEstadoGarantiaCliente));	
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemActualizarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoGarantiaCliente && this.isPermisoActualizarEstadoGarantiaCliente));	
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemEliminarEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoGarantiaCliente && this.isPermisoEliminarEstadoGarantiaCliente));
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemCancelarEstadoGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoGarantiaCliente);				
			}
			
			this.jMenuItemGuardarCambiosEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));						
			this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=this.jButtonNuevoEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoGarantiaCliente=this.jButtonDuplicarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaCopiarEstadoGarantiaCliente=this.jButtonCopiarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaVerFormEstadoGarantiaCliente=this.jButtonVerFormEstadoGarantiaCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoGarantiaCliente=this.jButtonAbrirOrderByEstadoGarantiaCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=this.jButtonNuevoRelacionesEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=this.jButtonModificarEstadoGarantiaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosEstadoGarantiaCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=this.jButtonNuevoToolBarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=this.jButtonNuevoRelacionesToolBarEstadoGarantiaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarToolBarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarToolBarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarToolBarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarToolBarEstadoGarantiaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=this.jButtonGuardarCambiosToolBarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=this.jButtonGuardarCambiosTablaToolBarEstadoGarantiaCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=this.jMenuItemNuevoEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=this.jMenuItemNuevoRelacionesEstadoGarantiaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemModificarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemActualizarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemEliminarEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemCancelarEstadoGarantiaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=this.jMenuItemGuardarCambiosEstadoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoGarantiaCliente(Boolean esInicializar) {
		if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoGarantiaCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoGarantiaCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoGarantiaCliente() {
		this.jButtonNuevoEstadoGarantiaCliente.setVisible(this.isPermisoNuevoEstadoGarantiaCliente);			
		this.jButtonDuplicarEstadoGarantiaCliente.setVisible(this.isPermisoDuplicarEstadoGarantiaCliente);			
		this.jButtonCopiarEstadoGarantiaCliente.setVisible(this.isPermisoCopiarEstadoGarantiaCliente);			
		this.jButtonVerFormEstadoGarantiaCliente.setVisible(this.isPermisoVerFormEstadoGarantiaCliente);			
		
		this.jButtonAbrirOrderByEstadoGarantiaCliente.setVisible(this.isPermisoOrdenEstadoGarantiaCliente);					
		
		this.jButtonNuevoRelacionesEstadoGarantiaCliente.setVisible(this.isPermisoNuevoEstadoGarantiaCliente);			
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarEstadoGarantiaCliente.setVisible(this.isPermisoActualizarEstadoGarantiaCliente);	
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarEstadoGarantiaCliente.setVisible(this.isPermisoActualizarEstadoGarantiaCliente);	
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarEstadoGarantiaCliente.setVisible(this.isPermisoEliminarEstadoGarantiaCliente);
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarEstadoGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoGarantiaCliente);						
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosEstadoGarantiaCliente.setVisible(this.isPermisoGuardarCambiosEstadoGarantiaCliente);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.setVisible(this.isPermisoActualizarEstadoGarantiaCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoGarantiaCliente() {
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarEstadoGarantiaCliente.setVisible(this.isPermisoActualizarEstadoGarantiaCliente);	
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarEstadoGarantiaCliente.setVisible(this.isPermisoActualizarEstadoGarantiaCliente);	
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarEstadoGarantiaCliente.setVisible(this.isPermisoEliminarEstadoGarantiaCliente);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarEstadoGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoGarantiaCliente);							
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosEstadoGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoGarantiaCliente && this.isPermisoGuardarCambiosEstadoGarantiaCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoGarantiaCliente() {
		if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoGarantiaCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoGarantiaCliente() {
	}
	
	public void jTableDatosEstadoGarantiaClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoGarantiaCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.getestadogarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadogarantiacliente==null) {
						this.estadogarantiacliente = new EstadoGarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
				}

				if(this.estadogarantiacliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadogarantiacliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.getestadogarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadogarantiacliente==null) {
						this.estadogarantiacliente = new EstadoGarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
				}

				if(this.estadogarantiacliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadogarantiacliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.getestadogarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadogarantiacliente==null) {
						this.estadogarantiacliente = new EstadoGarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);
				}

				if(this.estadogarantiacliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadogarantiacliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoGarantiaCliente() {
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.dispose();
			this.jInternalFrameDetalleFormEstadoGarantiaCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
			this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.dispose();
			this.jInternalFrameReporteDinamicoEstadoGarantiaCliente=null;
		}
		
		if(this.jInternalFrameImportacionEstadoGarantiaCliente!=null) {
			this.jInternalFrameImportacionEstadoGarantiaCliente.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoGarantiaCliente.dispose();
			this.jInternalFrameImportacionEstadoGarantiaCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoGarantiaCliente();
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoGarantiaCliente")) {
				jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoGarantiaCliente")) {
				jButtonDuplicarEstadoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoGarantiaCliente")) {
				jButtonCopiarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoGarantiaCliente")) {
				jButtonVerFormEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoGarantiaCliente")) {
				jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoGarantiaCliente")) {
				jButtonDuplicarEstadoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoGarantiaCliente")) {
				jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoGarantiaCliente")) {
				jButtonDuplicarEstadoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoGarantiaCliente")) {
				jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoGarantiaCliente")) {
				jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoGarantiaCliente")) {
				jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoGarantiaCliente")) {
				jButtonModificarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoGarantiaCliente")) {
				jButtonModificarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoGarantiaCliente")) {
				jButtonModificarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoGarantiaCliente")) {
				jButtonActualizarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoGarantiaCliente")) {
				jButtonActualizarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoGarantiaCliente")) {
				jButtonActualizarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoGarantiaCliente")) {
				jButtonEliminarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoGarantiaCliente")) {
				jButtonEliminarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoGarantiaCliente")) {
				jButtonEliminarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoGarantiaCliente")) {
				jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoGarantiaCliente")) {
				jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoGarantiaCliente")) {
				jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoGarantiaCliente")) {
				jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoGarantiaCliente")) {
				jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoGarantiaCliente")) {
				jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoGarantiaCliente")) {
				jButtonMostrarOcultarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoGarantiaCliente")) {
				jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoGarantiaCliente")) {
				jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoGarantiaCliente")) {
				jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoGarantiaCliente")) {
				jButtonCopiarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoGarantiaCliente")) {
				jButtonVerFormEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoGarantiaCliente")) {
				jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoGarantiaCliente")) {
				jButtonCopiarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoGarantiaCliente")) {
				jButtonVerFormEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoGarantiaCliente")) {
				jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoGarantiaCliente")) {
				jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoGarantiaCliente")) {
				jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoGarantiaCliente")) {
				jButtonRecargarInformacionEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoGarantiaCliente")) {
				jButtonRecargarInformacionEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoGarantiaCliente")) {
				jButtonRecargarInformacionEstadoGarantiaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoGarantiaCliente")) {
				jButtonAnterioresEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoGarantiaCliente")) {
				jButtonAnterioresEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoGarantiaCliente")) {
				jButtonAnterioresEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoGarantiaCliente")) {
				jButtonSiguientesEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoGarantiaCliente")) {
				jButtonSiguientesEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoGarantiaCliente")) {
				jButtonSiguientesEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoGarantiaCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoGarantiaCliente")) {
				jButtonAbrirOrderByEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoGarantiaCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoGarantiaCliente")) {
				jButtonMostrarOcultarEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoGarantiaCliente")) {
				jButtonNuevoGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoGarantiaCliente")) {
				jButtonNuevoGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoGarantiaCliente")) {
				jButtonNuevoGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoGarantiaCliente")) {
				jButtonCerrarReporteDinamicoEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoGarantiaCliente")) {
				jButtonGenerarReporteDinamicoEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoGarantiaCliente")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoGarantiaCliente")) {
				jButtonCerrarImportacionEstadoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoGarantiaCliente")) {
				
				jButtonGenerarImportacionEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoGarantiaCliente")) {
				
				jButtonAbrirImportacionEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoGarantiaCliente")) {
				jComboBoxTiposAccionesEstadoGarantiaClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoGarantiaCliente")) {
				jComboBoxTiposRelacionesEstadoGarantiaClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoGarantiaCliente")) {
				jComboBoxTiposAccionesEstadoGarantiaClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoGarantiaCliente")) {
				
				jComboBoxTiposSeleccionarEstadoGarantiaClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoGarantiaCliente")) {
				jTextFieldValorCampoGeneralEstadoGarantiaClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoGarantiaCliente")) {
				jButtonAbrirOrderByEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoGarantiaCliente")) {
				jButtonAbrirOrderByEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoGarantiaCliente")) {
				jButtonCerrarOrderByEstadoGarantiaClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoGarantiaClienteBusqueda")) {
				this.jButtonidEstadoGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoGarantiaClienteBusqueda")) {
				this.jButtoncodigoEstadoGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoGarantiaClienteBusqueda")) {
				this.jButtonnombreEstadoGarantiaClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoGarantiaCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				


				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoGarantiaCliente estadogarantiaclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadogarantiaclienteLocal=this.estadogarantiacliente;
			} else {
				estadogarantiaclienteLocal=this.estadogarantiaclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
							
				
				


				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
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
			
			


			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGarantiaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
								
						
				


				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
								
				
				


				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
							
				
				


				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
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
			
			


			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
								
				
				


				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGarantiaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoGarantiaCliente")) {
					jCheckBoxSeleccionarTodosEstadoGarantiaClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoGarantiaCliente")) {
					jCheckBoxSeleccionadosEstadoGarantiaClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoGarantiaCliente")) {
					
				}
				
				


				
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
												
				
				


				
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGarantiaClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
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
			
			


			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadogarantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadogarantiacliente);
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
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
				
				


				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoGarantiaCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoGarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadogarantiaclienteAnterior =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoGarantiaCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoGarantiaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoGarantiaCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadogarantiacliente =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadogarantiacliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoGarantiaCliente")) {
				
				}
				
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoGarantiaCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoGarantiaCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoGarantiaCliente")) {
			
			}
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoGarantiaCliente();
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoGarantiaCliente")) {
				jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoGarantiaCliente")) {
				jButtonDuplicarEstadoGarantiaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoGarantiaCliente")) {
				jButtonCopiarEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoGarantiaCliente")) {
				jButtonVerFormEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoGarantiaCliente")) {
				jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoGarantiaCliente")) {
				jButtonModificarEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoGarantiaCliente")) {
				jButtonActualizarEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoGarantiaCliente")) {
				jButtonEliminarEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoGarantiaCliente")) {
				jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoGarantiaCliente")) {
				jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoGarantiaCliente")) {
				jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoGarantiaCliente")) {
				jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoGarantiaCliente")) {
				jButtonNuevoGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoGarantiaCliente")) {
				jButtonAbrirOrderByEstadoGarantiaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoGarantiaCliente")) {
				jButtonRecargarInformacionEstadoGarantiaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoGarantiaCliente")) {
				jButtonAnterioresEstadoGarantiaClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoGarantiaCliente")) {
				jButtonSiguientesEstadoGarantiaClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoGarantiaClienteBusqueda")) {
				this.jButtonidEstadoGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoGarantiaClienteBusqueda")) {
				this.jButtoncodigoEstadoGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoGarantiaClienteBusqueda")) {
				this.jButtonnombreEstadoGarantiaClienteBusquedaActionPerformed(evt);
			}
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoGarantiaCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoGarantiaCliente")) {
				closingInternalFrameEstadoGarantiaCliente();
				
			} else if(sTipo.equals("jButtonCancelarEstadoGarantiaCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoGarantiaCliente = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoGarantiaClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoGarantiaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoGarantiaCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoGarantiaClienteActionPerformed(null);
			}
			
			EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadogarantiacliente,new Object(),this.estadogarantiaclienteParameterGeneral,this.estadogarantiaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoGarantiaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoGarantiaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoGarantiaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadogarantiacliente)) {
			if(!esControlTabla) {
				if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);			
				}
				
				if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadogarantiaclienteReturnGeneral=estadogarantiaclienteLogic.procesarEventosEstadoGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadogarantiaclienteLogic.getEstadoGarantiaClientes(),this.estadogarantiacliente,this.estadogarantiaclienteParameterGeneral,this.isEsNuevoEstadoGarantiaCliente,classes);//this.estadogarantiaclienteLogic.getEstadoGarantiaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral,this.estadogarantiaclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoGarantiaCliente(classes,this.estadogarantiaclienteReturnGeneral,this.estadogarantiaclienteBean,false);
					}
						
					if(this.estadogarantiaclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente());	
					}
						
					if(this.estadogarantiaclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente(),classes);//this.estadogarantiaclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoGarantiaCliente(this.estadogarantiacliente,classes);//this.estadogarantiaclienteBean);									
				}
			
				if(EstadoGarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoGarantiaCliente(this.estadogarantiacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoGarantiaCliente(this.estadogarantiacliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadogarantiaclienteAnterior!=null) {
						this.estadogarantiacliente=this.estadogarantiaclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadogarantiaclienteReturnGeneral=estadogarantiaclienteLogic.procesarEventosEstadoGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadogarantiaclienteLogic.getEstadoGarantiaClientes(),this.estadogarantiacliente,this.estadogarantiaclienteParameterGeneral,this.isEsNuevoEstadoGarantiaCliente,classes);//this.estadogarantiaclienteLogic.getEstadoGarantiaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadogarantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente(),estadogarantiaclienteLogic.getEstadoGarantiaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente(),this.estadogarantiaclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoGarantiaCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoGarantiaCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoGarantiaCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoGarantiaCliente() throws Exception {
		
		EstadoGarantiaClienteModel estadogarantiaclienteModel=(EstadoGarantiaClienteModel)this.jTableDatosEstadoGarantiaCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadogarantiaclienteModel.estadogarantiaclientes=this.estadogarantiaclienteLogic.getEstadoGarantiaClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadogarantiaclienteModel.estadogarantiaclientes=this.estadogarantiaclientes;
		}
		
		
		((EstadoGarantiaClienteModel) this.jTableDatosEstadoGarantiaCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoGarantiaCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadogarantiaclienteAnterior(),this.estadogarantiaclienteLogic.getEstadoGarantiaClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadogarantiaclienteAnterior(),this.estadogarantiaclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoGarantiaCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(GarantiaCliente.class)) {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(estadogarantiacliente.getGarantiaClientes());
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGarantiaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
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
										
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadogarantiacliente,new Object(),generalEntityParameterGeneral,this.estadogarantiaclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoGarantiaClienteConstantesFunciones.getClassesRelationshipsOfEstadoGarantiaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoGarantiaClienteConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoGarantiaCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoGarantiaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadogarantiacliente,new Object(),generalEntityParameterGeneral,this.estadogarantiaclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoGarantiaCliente(EstadoGarantiaClienteBean estadogarantiaclienteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(GarantiaCliente.class)) {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.setGarantiaClientes(estadogarantiacliente.getGarantiaClientes());
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGarantiaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoGarantiaCliente(ArrayList<Classe> classes,EstadoGarantiaClienteReturnGeneral estadogarantiaclienteReturnGeneral,EstadoGarantiaClienteBean estadogarantiaclienteBean,Boolean conDefault) throws Exception {
		
			this.estadogarantiaclienteBean.setGarantiaClientes(estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente().getGarantiaClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(GarantiaCliente.class)) {
					estadogarantiacliente.setGarantiaClientes(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteBeanSwingJInternalFrame.garantiaclienteLogic.getGarantiaClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadogarantiacliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente = new EstadoGarantiaClienteDetalleFormJInternalFrame(jDesktopPane,this.estadogarantiaclienteSessionBean.getConGuardarRelaciones(),this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoGarantiaCliente);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.setVisible(false);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.estadogarantiaclienteLogic=this.estadogarantiaclienteLogic;
		
		this.cargarCombosFrameForeignKeyEstadoGarantiaCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoGarantiaCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoGarantiaCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoGarantiaCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoGarantiaCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoGarantiaCliente"));
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoGarantiaCliente"));

		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarToolBarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoGarantiaCliente"));
					
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemModificarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoGarantiaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoGarantiaCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarToolBarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoGarantiaCliente"));
						
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemActualizarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoGarantiaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoGarantiaCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoGarantiaCliente"));
								
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemEliminarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoGarantiaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoGarantiaCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoGarantiaCliente"));
					
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemCancelarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoGarantiaCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemDetalleCerrarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoGarantiaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoGarantiaCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoGarantiaCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoGarantiaCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonidEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtoncodigoEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonnombreEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoGarantiaClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoGarantiaCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoGarantiaCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoGarantiaCliente"));
		}
		
		this.jTableDatosEstadoGarantiaCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoGarantiaCliente"));
		
		this.jTableDatosEstadoGarantiaCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoGarantiaCliente"));
		
		this.jButtonNuevoEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"NuevoEstadoGarantiaCliente"));
		
		this.jButtonDuplicarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"DuplicarEstadoGarantiaCliente"));
		
		this.jButtonCopiarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"CopiarEstadoGarantiaCliente"));
		
		this.jButtonVerFormEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"VerFormEstadoGarantiaCliente"));
		
		
		this.jButtonNuevoToolBarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoGarantiaCliente"));
			
		this.jButtonDuplicarToolBarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoGarantiaCliente"));
			
		this.jMenuItemNuevoEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoGarantiaCliente"));
			
		this.jMenuItemDuplicarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoGarantiaCliente"));		
		
		
		this.jButtonNuevoRelacionesEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoGarantiaCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoGarantiaCliente"));
			
		this.jMenuItemNuevoRelacionesEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoGarantiaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonModificarToolBarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoGarantiaCliente"));
			
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemModificarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoGarantiaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonActualizarToolBarEstadoGarantiaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoGarantiaCliente"));
				
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemActualizarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoGarantiaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonEliminarToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoGarantiaCliente"));
						
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemEliminarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoGarantiaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonCancelarToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoGarantiaCliente"));
			
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemCancelarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoGarantiaCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoGarantiaCliente"));		
		
		
		this.jButtonCerrarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CerrarEstadoGarantiaCliente"));
		
		
		this.jButtonCerrarToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoGarantiaCliente"));
			
		this.jMenuItemCerrarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoGarantiaCliente"));
			
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jMenuItemDetalleCerrarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoGarantiaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoGarantiaCliente"));
		}
		
		this.jButtonCopiarToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoGarantiaCliente"));
			
		this.jButtonVerFormToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoGarantiaCliente"));
		
		this.jMenuItemGuardarCambiosEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoGarantiaCliente"));
			
		this.jMenuItemCopiarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoGarantiaCliente"));		
		
		this.jMenuItemVerFormEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoGarantiaCliente"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoGarantiaCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoGarantiaCliente"));
			
		this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoGarantiaCliente"));		
		
		
		
		this.jButtonRecargarInformacionEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoGarantiaCliente"));
					
		this.jButtonRecargarInformacionToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoGarantiaCliente"));
		
		this.jMenuItemRecargarInformacionEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoGarantiaCliente"));		
		
		
		
		this.jButtonAnterioresEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"AnterioresEstadoGarantiaCliente"));
		
		
		this.jButtonAnterioresToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoGarantiaCliente"));
		
		this.jMenuItemAnterioresEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoGarantiaCliente"));		
		
		
		this.jButtonSiguientesEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"SiguientesEstadoGarantiaCliente"));
		
		
		this.jButtonSiguientesToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoGarantiaCliente"));
			
		this.jMenuItemSiguientesEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoGarantiaCliente"));
			
		this.jMenuItemAbrirOrderByEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoGarantiaCliente"));
			
		this.jMenuItemMostrarOcultarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoGarantiaCliente"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoGarantiaCliente"));
			
		this.jMenuItemDetalleMostarOcultarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoGarantiaCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoGarantiaCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoGarantiaCliente"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoGarantiaCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoGarantiaCliente"));

		this.jCheckBoxSeleccionadosEstadoGarantiaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoGarantiaCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoGarantiaCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoGarantiaCliente"));
			
		this.jComboBoxTiposAccionesEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoGarantiaCliente"));
					
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoGarantiaCliente"));
			
		this.jTextFieldValorCampoGeneralEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoGarantiaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonidEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtoncodigoEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonnombreEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoGarantiaClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoGarantiaCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoGarantiaCliente"));
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoGarantiaCliente"));
				this.jInternalFrameReporteDinamicoEstadoGarantiaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoGarantiaCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoGarantiaCliente"));				
			//this.jButtonGenerarReporteDinamicoEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoGarantiaCliente"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoGarantiaCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoGarantiaCliente!=null) {
				this.jInternalFrameImportacionEstadoGarantiaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoGarantiaCliente"));
				this.jInternalFrameImportacionEstadoGarantiaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoGarantiaCliente"));
				this.jInternalFrameImportacionEstadoGarantiaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoGarantiaCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoGarantiaCliente"));
			
			this.jButtonAbrirOrderByToolBarEstadoGarantiaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoGarantiaCliente"));			
			
			if(this.jInternalFrameOrderByEstadoGarantiaCliente!=null) {
				this.jInternalFrameOrderByEstadoGarantiaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoGarantiaCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTabbedPaneRelacionesEstadoGarantiaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoGarantiaCliente"));
		
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
            		closingInternalFrameEstadoGarantiaCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoGarantiaCliente = (JInternalFrameBase)event.getSource();
	            	
	            EstadoGarantiaClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoGarantiaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoGarantiaCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoGarantiaClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoGarantiaCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoGarantiaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoGarantiaCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoGarantiaCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoGarantiaCliente";
		inputMap = this.jButtonNuevoEstadoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoGarantiaCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoGarantiaClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoGarantiaCliente";
		inputMap = this.jButtonModificarEstadoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoGarantiaCliente";
		inputMap = this.jButtonActualizarEstadoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoGarantiaCliente";
		inputMap = this.jButtonEliminarEstadoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoGarantiaCliente";
		inputMap = this.jButtonCancelarEstadoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoGarantiaCliente";
		inputMap = this.jButtonCerrarEstadoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoGarantiaCliente";
		inputMap = this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosEstadoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonGuardarCambiosEstadoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoGarantiaCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoGarantiaClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoGarantiaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoGarantiaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoGarantiaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoGarantiaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoGarantiaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonidEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtoncodigoEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jButtonnombreEstadoGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoGarantiaClienteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoGarantiaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoGarantiaCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoGarantiaCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
					estadogarantiaclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientes) {
					estadogarantiaclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoGarantiaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoGarantiaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
						estadogarantiaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientes) {
						estadogarantiaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoGarantiaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoGarantiaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoGarantiaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoGarantiaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoGarantiaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoGarantiaCliente.getSelectedRows();
			
			EstadoGarantiaCliente estadogarantiaclienteLocal=new EstadoGarantiaCliente();
			
			//this.seleccionarTodosEstadoGarantiaCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadogarantiaclienteLocal =(EstadoGarantiaCliente) this.estadogarantiaclienteLogic.getEstadoGarantiaClientes().toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadogarantiaclienteLocal =(EstadoGarantiaCliente) this.estadogarantiaclientes.toArray()[this.jTableDatosEstadoGarantiaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadogarantiaclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
						estadogarantiaclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientes) {
						estadogarantiaclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoGarantiaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoGarantiaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoGarantiaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoGarantiaClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoGarantiaClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoGarantiaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoGarantiaCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoGarantiaCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
				
						if(sTipoSeleccionar.equals(EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadogarantiaclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadogarantiaclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientes) {
					
						if(sTipoSeleccionar.equals(EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadogarantiaclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadogarantiaclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoGarantiaClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoGarantiaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoGarantiaCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoGarantiaCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoGarantiaCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoGarantiaCliente(conSplash);
				
					this.generarReporteEstadoGarantiaClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoGarantiaClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoGarantiaClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoGarantiaClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoGarantiaCliente();
				
				this.exportarEstadoGarantiaClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoGarantiaClientes();
				//this.importarEstadoGarantiaClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoGarantiaCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoGarantiaClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Garantia Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoGarantiaCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoGarantiaCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoGarantiaCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoGarantiaClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoGarantiaCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoGarantiaCliente(conSplash);
					
						//this.actualizarParametrosGeneralEstadoGarantiaCliente();
						
						this.generarReporteProcesoAccionEstadoGarantiaClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Garantia ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Estado Garantia Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoGarantiaCliente();
				
						this.actualizarParametrosGeneralEstadoGarantiaCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadogarantiaclienteReturnGeneral=estadogarantiaclienteLogic.procesarAccionEstadoGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadogarantiaclienteLogic.getEstadoGarantiaClientes(),this.estadogarantiaclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoGarantiaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoGarantiaCliente();
					
					EstadoGarantiaClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoGarantiaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoGarantiaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoGarantiaCliente.jComboBoxTiposAccionesFormularioEstadoGarantiaCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoGarantiaCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoGarantiaClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoGarantiaCliente();
			
			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		
			EstadoGarantiaCliente estadogarantiacliente=new EstadoGarantiaCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoGarantiaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoGarantiaCliente.getSelectedItem();
			
			
			
			
			estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadogarantiaclientesSeleccionados.size()==1) {
				for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesSeleccionados) {
					estadogarantiacliente=estadogarantiaclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Garantia Cliente")) {
					jButtonGarantiaClienteActionPerformed(null,rowIndex,true,false,estadogarantiacliente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoGarantiaCliente();
			
      		//this.finishProcessEstadoGarantiaCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoGarantiaClienteReturnGeneral() throws Exception {
		if(this.estadogarantiaclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadogarantiaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadogarantiaclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadogarantiaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadogarantiaclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadogarantiaclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoGarantiaCliente(false);
		}
		
		if(this.estadogarantiaclienteReturnGeneral.getConRetornoLista() || this.estadogarantiaclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.estadogarantiaclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadogarantiaclienteLogic.setEstadoGarantiaClientes(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadogarantiaclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadogarantiaclienteLogic.setEstadoGarantiaCliente(this.estadogarantiaclienteReturnGeneral.getEstadoGarantiaCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoGarantiaCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoGarantiaCliente() throws Exception {
		
		
	}
	
	public ArrayList<EstadoGarantiaCliente> getEstadoGarantiaClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoGarantiaCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclienteLogic.getEstadoGarantiaClientes()) {
					if(estadogarantiaclienteAux.getIsSelected()) {
						estadogarantiaclientesSeleccionados.add(estadogarantiaclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoGarantiaCliente estadogarantiaclienteAux:this.estadogarantiaclientes) {
					if(estadogarantiaclienteAux.getIsSelected()) {
						estadogarantiaclientesSeleccionados.add(estadogarantiaclienteAux);				
					}
				}
			}
			
			if(estadogarantiaclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadogarantiaclientesSeleccionados.addAll(this.estadogarantiaclienteLogic.getEstadoGarantiaClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadogarantiaclientesSeleccionados.addAll(this.estadogarantiaclientes);				
					}
				}
			}
		} else {
			estadogarantiaclientesSeleccionados.add(this.estadogarantiacliente);
		}
		
		return estadogarantiaclientesSeleccionados;
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
	
	public void generarReporteEstadoGarantiaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoGarantiaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoGarantiaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoGarantiaClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoGarantiaClientesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoGarantiaClientesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Garantia Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoGarantiaClientesSeleccionados() throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoGarantiaClientes("Todos",estadogarantiaclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoGarantiaClientesSeleccionados() throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoGarantiaClientes("Todos",estadogarantiaclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoGarantiaClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoGarantiaClientes("Todos",estadogarantiaclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoGarantiaClientesSeleccionados() throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoGarantiaCliente();
		
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoGarantiaCliente();
		
		
		//this.generarReporteEstadoGarantiaClientes("Todos",estadogarantiaclientesSeleccionados ,estadogarantiaclienteImplementable,estadogarantiaclienteImplementableHome);
	}
	
	public void mostrarImportacionEstadoGarantiaClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoGarantiaCliente();
		
		this.abrirFrameImportacionEstadoGarantiaCliente();		
		
			
		//this.generarReporteEstadoGarantiaClientes("Todos",estadogarantiaclientesSeleccionados ,estadogarantiaclienteImplementable,estadogarantiaclienteImplementableHome);
	}
	
	public void importarEstadoGarantiaClientes() throws Exception {		
	
	}
	
	public void exportarEstadoGarantiaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoGarantiaClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoGarantiaClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoGarantiaClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Garantia Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoGarantiaClientesSeleccionados() throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogarantiacliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoGarantiaCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoGarantiaCliente(estadogarantiaclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadogarantiaclienteAux.setsDetalleGeneralEntityReporte(estadogarantiaclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoGarantiaCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoGarantiaClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoGarantiaClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadogarantiacliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadogarantiacliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadogarantiacliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadogarantiacliente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoGarantiaClientesSeleccionados() throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogarantiacliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoGarantiaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoGarantiaCliente(row);				
				iRow++;
			}				
			
			for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoGarantiaCliente(estadogarantiaclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoGarantiaClientesSeleccionados() throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();		
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadogarantiacliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadogarantiaclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadogarantiacliente");
			//elementRoot.appendChild(element);
		
			for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesSeleccionados) {
				element = document.createElement("estadogarantiacliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoGarantiaCliente(estadogarantiaclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoGarantiaCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadogarantiacliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadogarantiacliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadogarantiacliente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoGarantiaCliente(EstadoGarantiaCliente estadogarantiacliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoGarantiaClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadogarantiacliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoGarantiaClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadogarantiacliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoGarantiaClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadogarantiacliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoGarantiaClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadogarantiacliente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoGarantiaClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados=new ArrayList<EstadoGarantiaCliente>();
		
		estadogarantiaclientesSeleccionados=this.getEstadoGarantiaClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoGarantiaCliente(estadogarantiaclientesSeleccionados);
		
		this.generarReporteEstadoGarantiaClientes("Todos",estadogarantiaclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoGarantiaCliente(ArrayList<EstadoGarantiaCliente> estadogarantiaclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesSeleccionados) {
				estadogarantiaclienteAux.setsDetalleGeneralEntityReporte(estadogarantiaclienteAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoGarantiaClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadogarantiaclienteAux.setsDescripcionGeneralEntityReporte1(estadogarantiaclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoGarantiaClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadogarantiaclienteAux.setsDescripcionGeneralEntityReporte1(estadogarantiaclienteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoGarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoGarantiaCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaModificarEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarEstadoGarantiaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoGarantiaCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoGarantiaClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=true;
		} else {
			this.actualizarEstadoPanelsEstadoGarantiaCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoGarantiaCliente=false;
			//this.isVisibilidadCeldaVerFormEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoGarantiaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!estadogarantiaclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;												
			}
			
			this.jButtonCerrarEstadoGarantiaCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoGarantiaCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.estadogarantiacliente)) {
			this.isVisibilidadCeldaActualizarEstadoGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarEstadoGarantiaCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoGarantiaCliente() {
		this.isVisibilidadCeldaNuevoEstadoGarantiaCliente=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoGarantiaCliente=false;
	}
	
	public void actualizarEstadoPanelsEstadoGarantiaCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEstadoGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoGarantiaCliente!=null) {
				this.jPanelPaginacionEstadoGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoGarantiaCliente!=null) {
				this.jPanelParametrosReportesEstadoGarantiaCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEstadoGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoGarantiaCliente!=null) {
				this.jPanelPaginacionEstadoGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoGarantiaCliente!=null) {
				this.jPanelParametrosReportesEstadoGarantiaCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEstadoGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoGarantiaCliente!=null) {
				this.jPanelPaginacionEstadoGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoGarantiaCliente!=null) {
				this.jPanelParametrosReportesEstadoGarantiaCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEstadoGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoGarantiaCliente!=null) {
				this.jPanelPaginacionEstadoGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoGarantiaCliente!=null) {
				this.jPanelParametrosReportesEstadoGarantiaCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEstadoGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoGarantiaCliente!=null) {
				this.jPanelPaginacionEstadoGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoGarantiaCliente!=null) {
				this.jPanelParametrosReportesEstadoGarantiaCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEstadoGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoGarantiaCliente!=null) {
				this.jPanelPaginacionEstadoGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoGarantiaCliente!=null) {
				this.jPanelParametrosReportesEstadoGarantiaCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoGarantiaCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoGarantiaCliente!=null) {
				this.jScrollPanelDatosEstadoGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoGarantiaCliente!=null) {
				this.jPanelPaginacionEstadoGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoGarantiaCliente!=null) {
				this.jPanelParametrosReportesEstadoGarantiaCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadogarantiaclienteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoGarantiaClienteParaGarantiaClientes() throws Exception {
		Boolean isPaginaPopupGarantiaCliente=false;

		try {

			if(this.estadogarantiaclienteSessionBean==null) {
				this.estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean.setsPathNavegacionActual(estadogarantiaclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupGarantiaCliente=this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeGarantiaCliente(true);
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeGarantiaCliente(EstadoGarantiaClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoGarantiaCliente(true);
			this.jInternalFrameDetalleFormEstadoGarantiaCliente.garantiaclienteSessionBean.setlidEstadoGarantiaClienteActual(this.idEstadoGarantiaClienteActual);

			estadogarantiaclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoGarantiaCliente(true);
			estadogarantiaclienteSessionBean.setlIdEstadoGarantiaClienteActualForeignKey(this.idEstadoGarantiaClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoGarantiaClienteSessionBean estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
		
		if(this.estadogarantiaclienteSessionBean==null) {
			this.estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
		}
		
		this.estadogarantiaclienteSessionBean.setsUltimaBusquedaEstadoGarantiaCliente(this.getsAccionBusqueda());
		this.estadogarantiaclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadogarantiaclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoGarantiaClienteSessionBean estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
		
		if(this.estadogarantiaclienteSessionBean==null) {
			this.estadogarantiaclienteSessionBean=new EstadoGarantiaClienteSessionBean();
		}
		
		if(this.estadogarantiaclienteSessionBean.getsUltimaBusquedaEstadoGarantiaCliente()!=null&&!this.estadogarantiaclienteSessionBean.getsUltimaBusquedaEstadoGarantiaCliente().equals("")) {
			this.setsAccionBusqueda(estadogarantiaclienteSessionBean.getsUltimaBusquedaEstadoGarantiaCliente());
			this.setiNumeroPaginacion(estadogarantiaclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadogarantiaclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadogarantiaclienteSessionBean.setsUltimaBusquedaEstadoGarantiaCliente("");
		this.estadogarantiaclienteSessionBean.setiNumeroPaginacion(EstadoGarantiaClienteConstantesFunciones.INUMEROPAGINACION);
		this.estadogarantiaclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoGarantiaCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoGarantiaCliente() {
		this.updateBorderResaltarBusquedasFormularioEstadoGarantiaCliente();
		this.updateVisibilidadBusquedasFormularioEstadoGarantiaCliente();
		this.updateHabilitarBusquedasFormularioEstadoGarantiaCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoGarantiaCliente() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoGarantiaCliente() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoGarantiaCliente() {
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
	
	public void updateControlesFormularioEstadoGarantiaCliente() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoGarantiaCliente();
		this.updateVisibilidadResaltarControlesFormularioEstadoGarantiaCliente();
		this.updateHabilitarResaltarControlesFormularioEstadoGarantiaCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoGarantiaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadogarantiaclienteConstantesFunciones.resaltaridEstadoGarantiaCliente!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.setBorder(this.estadogarantiaclienteConstantesFunciones.resaltaridEstadoGarantiaCliente);}
		if(this.estadogarantiaclienteConstantesFunciones.resaltarcodigoEstadoGarantiaCliente!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldcodigoEstadoGarantiaCliente.setBorder(this.estadogarantiaclienteConstantesFunciones.resaltarcodigoEstadoGarantiaCliente);}
		if(this.estadogarantiaclienteConstantesFunciones.resaltarnombreEstadoGarantiaCliente!=null && this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextAreanombreEstadoGarantiaCliente.setBorder(this.estadogarantiaclienteConstantesFunciones.resaltarnombreEstadoGarantiaCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoGarantiaCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
	
		//this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.setVisible(this.estadogarantiaclienteConstantesFunciones.mostraridEstadoGarantiaCliente);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jPanelidEstadoGarantiaCliente.setVisible(this.estadogarantiaclienteConstantesFunciones.mostraridEstadoGarantiaCliente);
		//this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldcodigoEstadoGarantiaCliente.setVisible(this.estadogarantiaclienteConstantesFunciones.mostrarcodigoEstadoGarantiaCliente);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jPanelcodigoEstadoGarantiaCliente.setVisible(this.estadogarantiaclienteConstantesFunciones.mostrarcodigoEstadoGarantiaCliente);
		//this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextAreanombreEstadoGarantiaCliente.setVisible(this.estadogarantiaclienteConstantesFunciones.mostrarnombreEstadoGarantiaCliente);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jPanelnombreEstadoGarantiaCliente.setVisible(this.estadogarantiaclienteConstantesFunciones.mostrarnombreEstadoGarantiaCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoGarantiaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoGarantiaCliente!=null) {
	
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldidEstadoGarantiaCliente.setEnabled(this.estadogarantiaclienteConstantesFunciones.activaridEstadoGarantiaCliente);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextFieldcodigoEstadoGarantiaCliente.setEnabled(this.estadogarantiaclienteConstantesFunciones.activarcodigoEstadoGarantiaCliente);
		this.jInternalFrameDetalleFormEstadoGarantiaCliente.jTextAreanombreEstadoGarantiaCliente.setEnabled(this.estadogarantiaclienteConstantesFunciones.activarnombreEstadoGarantiaCliente);
		}
	}
	
		
}