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


import java.sql.Timestamp;


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

import com.bydan.erp.seguridad.util.HistorialCambioClaveConstantesFunciones;
import com.bydan.erp.seguridad.util.HistorialCambioClaveParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.HistorialCambioClaveParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.HistorialCambioClaveBean;
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
public class HistorialCambioClaveBeanSwingJInternalFrame extends HistorialCambioClaveJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HistorialCambioClaveBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<HistorialCambioClave> historialcambioclaveValidator = new ClassValidator<HistorialCambioClave>(HistorialCambioClave.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public HistorialCambioClave historialcambioclave;	
	public HistorialCambioClave historialcambioclaveAux;
	public HistorialCambioClave historialcambioclaveAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public HistorialCambioClave historialcambioclaveTotales;
	public Long idHistorialCambioClaveActual;
	public Long iIdNuevoHistorialCambioClave=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
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
	
	public Boolean isPermisoTodoHistorialCambioClave;
	public Boolean isPermisoNuevoHistorialCambioClave;
	public Boolean isPermisoActualizarHistorialCambioClave;
	public Boolean isPermisoActualizarOriginalHistorialCambioClave;
	public Boolean isPermisoEliminarHistorialCambioClave;
	public Boolean isPermisoGuardarCambiosHistorialCambioClave;
	public Boolean isPermisoConsultaHistorialCambioClave;
	public Boolean isPermisoBusquedaHistorialCambioClave;
	public Boolean isPermisoReporteHistorialCambioClave;
	public Boolean isPermisoPaginacionMedioHistorialCambioClave;
	public Boolean isPermisoPaginacionAltoHistorialCambioClave;
	public Boolean isPermisoPaginacionTodoHistorialCambioClave;
	public Boolean isPermisoCopiarHistorialCambioClave;
	public Boolean isPermisoVerFormHistorialCambioClave;
	public Boolean isPermisoDuplicarHistorialCambioClave;
	public Boolean isPermisoOrdenHistorialCambioClave;
	
	
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
	
	public HistorialCambioClaveParameterReturnGeneral historialcambioclaveReturnGeneral;
	public HistorialCambioClaveParameterReturnGeneral historialcambioclaveParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHistorialCambioClave=false;
	public Boolean esParaAccionDesdeFormularioHistorialCambioClave=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HistorialCambioClaveSessionBeanAdditional historialcambioclaveSessionBeanAdditional=null;
	
	public HistorialCambioClaveSessionBeanAdditional getHistorialCambioClaveSessionBeanAdditional() {
		return this.historialcambioclaveSessionBeanAdditional;
	}
	
	public void setHistorialCambioClaveSessionBeanAdditional(HistorialCambioClaveSessionBeanAdditional historialcambioclaveSessionBeanAdditional) {
		try {
			this.historialcambioclaveSessionBeanAdditional=historialcambioclaveSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HistorialCambioClaveBeanSwingJInternalFrameAdditional historialcambioclaveBeanSwingJInternalFrameAdditional=null;
	//public class HistorialCambioClaveBeanSwingJInternalFrame
	
	public HistorialCambioClaveBeanSwingJInternalFrameAdditional getHistorialCambioClaveBeanSwingJInternalFrameAdditional() {
		return this.historialcambioclaveBeanSwingJInternalFrameAdditional;
	}
	
	public void setHistorialCambioClaveBeanSwingJInternalFrameAdditional(HistorialCambioClaveBeanSwingJInternalFrameAdditional historialcambioclaveBeanSwingJInternalFrameAdditional) {
		try {
			this.historialcambioclaveBeanSwingJInternalFrameAdditional=historialcambioclaveBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HistorialCambioClaveLogic historialcambioclaveLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public HistorialCambioClave historialcambioclaveBean;
	public HistorialCambioClaveConstantesFunciones historialcambioclaveConstantesFunciones;
	//public HistorialCambioClaveParameterReturnGeneral historialcambioclaveReturnGeneral;
	
	//FK
	
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<HistorialCambioClave> historialcambioclaves;	
	//public List<HistorialCambioClave> historialcambioclavesEliminados;
	//public List<HistorialCambioClave> historialcambioclavesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHistorialCambioClave=false;
	public Boolean isVisibilidadCeldaDuplicarHistorialCambioClave=true;
	public Boolean isVisibilidadCeldaCopiarHistorialCambioClave=true;
	public Boolean isVisibilidadCeldaVerFormHistorialCambioClave=true;
	public Boolean isVisibilidadCeldaOrdenHistorialCambioClave=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
	public Boolean isVisibilidadCeldaModificarHistorialCambioClave=false;
	public Boolean isVisibilidadCeldaActualizarHistorialCambioClave=false;
	public Boolean isVisibilidadCeldaEliminarHistorialCambioClave=false;
	public Boolean isVisibilidadCeldaCancelarHistorialCambioClave=false;
	public Boolean isVisibilidadCeldaGuardarHistorialCambioClave=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHistorialCambioClave=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdUsuarioPorFechaHora=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoHistorialCambioClave() {
		return this.iIdNuevoHistorialCambioClave;
	}

	public void setiIdNuevoHistorialCambioClave(Long iIdNuevoHistorialCambioClave) {
		this.iIdNuevoHistorialCambioClave = iIdNuevoHistorialCambioClave;
	}
	
	public Long getidHistorialCambioClaveActual() {
		return this.idHistorialCambioClaveActual;
	}

	public void setidHistorialCambioClaveActual(Long idHistorialCambioClaveActual) {
		this.idHistorialCambioClaveActual = idHistorialCambioClaveActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public HistorialCambioClave gethistorialcambioclave() {
		return this.historialcambioclave;
	}

	public void sethistorialcambioclave(HistorialCambioClave historialcambioclave) {
		this.historialcambioclave = historialcambioclave;
	}
	
	public HistorialCambioClave gethistorialcambioclaveAux() {
		return this.historialcambioclaveAux;
	}

	public void sethistorialcambioclaveAux(HistorialCambioClave historialcambioclaveAux) {
		this.historialcambioclaveAux = historialcambioclaveAux;
	}				
	
	public HistorialCambioClave gethistorialcambioclaveAnterior() {
		return this.historialcambioclaveAnterior;
	}

	public void sethistorialcambioclaveAnterior(HistorialCambioClave historialcambioclaveAnterior) {
		this.historialcambioclaveAnterior = historialcambioclaveAnterior;
	}	
	
	public HistorialCambioClave gethistorialcambioclaveTotales() {
		return this.historialcambioclaveTotales;
	}

	public void sethistorialcambioclaveTotales(HistorialCambioClave historialcambioclaveTotales) {
		this.historialcambioclaveTotales = historialcambioclaveTotales;
	}	
	
	public HistorialCambioClave gethistorialcambioclaveBean() {
		return this.historialcambioclaveBean;
	}

	public void sethistorialcambioclaveBean(HistorialCambioClave historialcambioclaveBean) {
		this.historialcambioclaveBean = historialcambioclaveBean;
	}	
	
	public HistorialCambioClaveParameterReturnGeneral gethistorialcambioclaveReturnGeneral() {
		return this.historialcambioclaveReturnGeneral;
	}

	public void sethistorialcambioclaveReturnGeneral(HistorialCambioClaveParameterReturnGeneral historialcambioclaveReturnGeneral) {
		this.historialcambioclaveReturnGeneral = historialcambioclaveReturnGeneral;
	}	
	
	
	public Long id_usuarioBusquedaPorIdUsuarioPorFechaHora=-1L;

	public Long getid_usuarioBusquedaPorIdUsuarioPorFechaHora() {
		return this.id_usuarioBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setid_usuarioBusquedaPorIdUsuarioPorFechaHora(Long id_usuarioBusquedaPorIdUsuarioPorFechaHora) {
		this.id_usuarioBusquedaPorIdUsuarioPorFechaHora = id_usuarioBusquedaPorIdUsuarioPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorIdUsuarioPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorIdUsuarioPorFechaHora() {
		return this.fecha_horaBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setfecha_horaBusquedaPorIdUsuarioPorFechaHora(Timestamp fecha_horaBusquedaPorIdUsuarioPorFechaHora) {
		this.fecha_horaBusquedaPorIdUsuarioPorFechaHora = fecha_horaBusquedaPorIdUsuarioPorFechaHora;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public HistorialCambioClaveLogic getHistorialCambioClaveLogic()	{		
		return historialcambioclaveLogic;
	}

	public void setHistorialCambioClaveLogic(HistorialCambioClaveLogic historialcambioclaveLogic) {
		this.historialcambioclaveLogic = historialcambioclaveLogic;
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
	
	public Boolean getIsEsNuevoHistorialCambioClave() {
		return isEsNuevoHistorialCambioClave;
	}

	public void setIsEsNuevoHistorialCambioClave(Boolean isEsNuevoHistorialCambioClave) {
		this.isEsNuevoHistorialCambioClave = isEsNuevoHistorialCambioClave;
	}

	public Boolean getEsParaAccionDesdeFormularioHistorialCambioClave() {
		return esParaAccionDesdeFormularioHistorialCambioClave;
	}
	
	public void setEsParaAccionDesdeFormularioHistorialCambioClave(Boolean esParaAccionDesdeFormularioHistorialCambioClave) {
		this.esParaAccionDesdeFormularioHistorialCambioClave = esParaAccionDesdeFormularioHistorialCambioClave;
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
	
	
	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.historialcambioclaveSessionBean==null) {
				this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
			}

			if(!this.historialcambioclaveSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(historialcambioclaveSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.historialcambioclave!=null) {
						this.historialcambioclave.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
						this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioHistorialCambioClave.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
						if(this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave!=null) {
						jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave!=null) {
							//jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.getItemCount()>0) {
								jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioHistorialCambioClaveGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioHistorialCambioClaveGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioHistorialCambioClaveGenerico!=null && jComboBoxid_usuarioHistorialCambioClaveGenerico.getItemCount()>0) {
					jComboBoxid_usuarioHistorialCambioClaveGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(HistorialCambioClave historialcambioclave,JComboBox jComboBoxid_usuarioHistorialCambioClaveGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioHistorialCambioClaveGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioHistorialCambioClaveGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				historialcambioclave.setid_usuario(usuarioAux.getId());
				historialcambioclave.setusuario_descripcion(HistorialCambioClaveConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				historialcambioclave.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { 
							this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { 
					}

					if(!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.addItem(usuario);
							}
						}

						if(!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
							this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
							this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesHistorialCambioClave() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			HistorialCambioClaveConstantesFunciones.refrescarForeignKeysDescripcionesHistorialCambioClave(this.historialcambioclaveLogic.getHistorialCambioClaves());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			HistorialCambioClaveConstantesFunciones.refrescarForeignKeysDescripcionesHistorialCambioClave(this.historialcambioclaves);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//historialcambioclaveLogic.setHistorialCambioClaves(this.historialcambioclaves);
			historialcambioclaveLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public HistorialCambioClaveParameterReturnGeneral getHistorialCambioClaveParameterGeneral() {
		return this.historialcambioclaveParameterGeneral;
	}
	
	public void setHistorialCambioClaveParameterGeneral(HistorialCambioClaveParameterReturnGeneral historialcambioclaveParameterGeneral) {
		this.historialcambioclaveParameterGeneral = historialcambioclaveParameterGeneral;
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
	
	public Boolean getIsPermisoTodoHistorialCambioClave() {
		return isPermisoTodoHistorialCambioClave;
	}

	public void setIsPermisoTodoHistorialCambioClave(Boolean isPermisoTodoHistorialCambioClave) {
		this.isPermisoTodoHistorialCambioClave = isPermisoTodoHistorialCambioClave;
	}

	public Boolean getIsPermisoNuevoHistorialCambioClave() {
		return isPermisoNuevoHistorialCambioClave;
	}

	public void setIsPermisoNuevoHistorialCambioClave(Boolean isPermisoNuevoHistorialCambioClave) {
		this.isPermisoNuevoHistorialCambioClave = isPermisoNuevoHistorialCambioClave;
	}

	public Boolean getIsPermisoActualizarHistorialCambioClave() {
		return isPermisoActualizarHistorialCambioClave;
	}

	public void setIsPermisoActualizarHistorialCambioClave(Boolean isPermisoActualizarHistorialCambioClave) {
		this.isPermisoActualizarHistorialCambioClave = isPermisoActualizarHistorialCambioClave;
	}

	public Boolean getIsPermisoEliminarHistorialCambioClave() {
		return isPermisoEliminarHistorialCambioClave;
	}

	public void setIsPermisoEliminarHistorialCambioClave(Boolean isPermisoEliminarHistorialCambioClave) {
		this.isPermisoEliminarHistorialCambioClave = isPermisoEliminarHistorialCambioClave;
	}

	public Boolean getIsPermisoGuardarCambiosHistorialCambioClave() {
		return isPermisoGuardarCambiosHistorialCambioClave;
	}

	public void setIsPermisoGuardarCambiosHistorialCambioClave(Boolean isPermisoGuardarCambiosHistorialCambioClave) {
		this.isPermisoGuardarCambiosHistorialCambioClave = isPermisoGuardarCambiosHistorialCambioClave;
	}
	
	public Boolean getIsPermisoConsultaHistorialCambioClave() {
		return isPermisoConsultaHistorialCambioClave;
	}

	public void setIsPermisoConsultaHistorialCambioClave(Boolean isPermisoConsultaHistorialCambioClave) {
		this.isPermisoConsultaHistorialCambioClave = isPermisoConsultaHistorialCambioClave;
	}

	public Boolean getIsPermisoBusquedaHistorialCambioClave() {
		return isPermisoBusquedaHistorialCambioClave;
	}

	public void setIsPermisoBusquedaHistorialCambioClave(Boolean isPermisoBusquedaHistorialCambioClave) {
		this.isPermisoBusquedaHistorialCambioClave = isPermisoBusquedaHistorialCambioClave;
	}

	public Boolean getIsPermisoReporteHistorialCambioClave() {
		return isPermisoReporteHistorialCambioClave;
	}

	public void setIsPermisoReporteHistorialCambioClave(Boolean isPermisoReporteHistorialCambioClave) {
		this.isPermisoReporteHistorialCambioClave = isPermisoReporteHistorialCambioClave;
	}
	
	public Boolean getIsPermisoPaginacionMedioHistorialCambioClave() {
		return isPermisoPaginacionMedioHistorialCambioClave;
	}

	public void setIsPermisoPaginacionMedioHistorialCambioClave(Boolean isPermisoPaginacionMedioHistorialCambioClave) {
		this.isPermisoPaginacionMedioHistorialCambioClave = isPermisoPaginacionMedioHistorialCambioClave;
	}
	
	public Boolean getIsPermisoPaginacionTodoHistorialCambioClave() {
		return isPermisoPaginacionTodoHistorialCambioClave;
	}

	public void setIsPermisoPaginacionTodoHistorialCambioClave(Boolean isPermisoPaginacionTodoHistorialCambioClave) {
		this.isPermisoPaginacionTodoHistorialCambioClave = isPermisoPaginacionTodoHistorialCambioClave;
	}
	
	public Boolean getIsPermisoPaginacionAltoHistorialCambioClave() {
		return isPermisoPaginacionAltoHistorialCambioClave;
	}

	public void setIsPermisoPaginacionAltoHistorialCambioClave(Boolean isPermisoPaginacionAltoHistorialCambioClave) {
		this.isPermisoPaginacionAltoHistorialCambioClave = isPermisoPaginacionAltoHistorialCambioClave;
	}
	
	public Boolean getIsPermisoCopiarHistorialCambioClave() {
		return isPermisoCopiarHistorialCambioClave;
	}

	public void setIsPermisoCopiarHistorialCambioClave(Boolean isPermisoCopiarHistorialCambioClave) {
		this.isPermisoCopiarHistorialCambioClave = isPermisoCopiarHistorialCambioClave;
	}
	
	public Boolean getIsPermisoVerFormHistorialCambioClave() {
		return isPermisoVerFormHistorialCambioClave;
	}

	public void setIsPermisoVerFormHistorialCambioClave(Boolean isPermisoVerFormHistorialCambioClave) {
		this.isPermisoVerFormHistorialCambioClave = isPermisoVerFormHistorialCambioClave;
	}
	
	public Boolean getIsPermisoDuplicarHistorialCambioClave() {
		return isPermisoDuplicarHistorialCambioClave;
	}

	public void setIsPermisoDuplicarHistorialCambioClave(Boolean isPermisoDuplicarHistorialCambioClave) {
		this.isPermisoDuplicarHistorialCambioClave = isPermisoDuplicarHistorialCambioClave;
	}
	
	public Boolean getIsPermisoOrdenHistorialCambioClave() {
		return isPermisoOrdenHistorialCambioClave;
	}

	public void setIsPermisoOrdenHistorialCambioClave(Boolean isPermisoOrdenHistorialCambioClave) {
		this.isPermisoOrdenHistorialCambioClave = isPermisoOrdenHistorialCambioClave;
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
	
	public Boolean getIsVisibilidadCeldaNuevoHistorialCambioClave() {
		return isVisibilidadCeldaNuevoHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaNuevoHistorialCambioClave(Boolean isVisibilidadCeldaNuevoHistorialCambioClave) {
		this.isVisibilidadCeldaNuevoHistorialCambioClave = isVisibilidadCeldaNuevoHistorialCambioClave;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHistorialCambioClave() {
		return isVisibilidadCeldaDuplicarHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaDuplicarHistorialCambioClave(Boolean isVisibilidadCeldaDuplicarHistorialCambioClave) {
		this.isVisibilidadCeldaDuplicarHistorialCambioClave = isVisibilidadCeldaDuplicarHistorialCambioClave;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHistorialCambioClave() {
		return isVisibilidadCeldaCopiarHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaCopiarHistorialCambioClave(Boolean isVisibilidadCeldaCopiarHistorialCambioClave) {
		this.isVisibilidadCeldaCopiarHistorialCambioClave = isVisibilidadCeldaCopiarHistorialCambioClave;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHistorialCambioClave() {
		return isVisibilidadCeldaVerFormHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaVerFormHistorialCambioClave(Boolean isVisibilidadCeldaVerFormHistorialCambioClave) {
		this.isVisibilidadCeldaVerFormHistorialCambioClave = isVisibilidadCeldaVerFormHistorialCambioClave;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHistorialCambioClave() {
		return isVisibilidadCeldaOrdenHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaOrdenHistorialCambioClave(Boolean isVisibilidadCeldaOrdenHistorialCambioClave) {
		this.isVisibilidadCeldaOrdenHistorialCambioClave = isVisibilidadCeldaOrdenHistorialCambioClave;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHistorialCambioClave() {
		return isVisibilidadCeldaNuevoRelacionesHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHistorialCambioClave(Boolean isVisibilidadCeldaNuevoRelacionesHistorialCambioClave) {
		this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave = isVisibilidadCeldaNuevoRelacionesHistorialCambioClave;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHistorialCambioClave() {
		return isVisibilidadCeldaModificarHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaModificarHistorialCambioClave(Boolean isVisibilidadCeldaModificarHistorialCambioClave) {
		this.isVisibilidadCeldaModificarHistorialCambioClave = isVisibilidadCeldaModificarHistorialCambioClave;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHistorialCambioClave() {
		return isVisibilidadCeldaActualizarHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaActualizarHistorialCambioClave(Boolean isVisibilidadCeldaActualizarHistorialCambioClave) {
		this.isVisibilidadCeldaActualizarHistorialCambioClave = isVisibilidadCeldaActualizarHistorialCambioClave;
	}

	public Boolean getIsVisibilidadCeldaEliminarHistorialCambioClave() {
		return isVisibilidadCeldaEliminarHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaEliminarHistorialCambioClave(Boolean isVisibilidadCeldaEliminarHistorialCambioClave) {
		this.isVisibilidadCeldaEliminarHistorialCambioClave = isVisibilidadCeldaEliminarHistorialCambioClave;
	}

	public Boolean getIsVisibilidadCeldaCancelarHistorialCambioClave() {
		return isVisibilidadCeldaCancelarHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaCancelarHistorialCambioClave(Boolean isVisibilidadCeldaCancelarHistorialCambioClave) {
		this.isVisibilidadCeldaCancelarHistorialCambioClave = isVisibilidadCeldaCancelarHistorialCambioClave;
	}

	public Boolean getIsVisibilidadCeldaGuardarHistorialCambioClave() {
		return isVisibilidadCeldaGuardarHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaGuardarHistorialCambioClave(Boolean isVisibilidadCeldaGuardarHistorialCambioClave) {
		this.isVisibilidadCeldaGuardarHistorialCambioClave = isVisibilidadCeldaGuardarHistorialCambioClave;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHistorialCambioClave() {
		return isVisibilidadCeldaGuardarCambiosHistorialCambioClave;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHistorialCambioClave(Boolean isVisibilidadCeldaGuardarCambiosHistorialCambioClave) {
		this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave = isVisibilidadCeldaGuardarCambiosHistorialCambioClave;
	}
		
	public HistorialCambioClaveSessionBean gethistorialcambioclaveSessionBean() {
		return this.historialcambioclaveSessionBean;
	}
	
	public void sethistorialcambioclaveSessionBean(HistorialCambioClaveSessionBean historialcambioclaveSessionBean) {
		this.historialcambioclaveSessionBean=historialcambioclaveSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdUsuarioPorFechaHora() {
		return this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setisVisibilidadBusquedaPorIdUsuarioPorFechaHora(Boolean isVisibilidadBusquedaPorIdUsuarioPorFechaHora) {
		this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora=isVisibilidadBusquedaPorIdUsuarioPorFechaHora;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(HistorialCambioClave historialcambioclave)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioForeignKey(historialcambioclave,null);
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
	
	public void bugActualizarReferenciaActual(HistorialCambioClave historialcambioclave,HistorialCambioClave historialcambioclaveAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHistorialCambioClave(historialcambioclave);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		historialcambioclaveAux.setId(historialcambioclave.getId());
		historialcambioclaveAux.setVersionRow(historialcambioclave.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessHistorialCambioClave();
		
			int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = historialcambioclaveValidator.getInvalidValues(this.historialcambioclave);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			historialcambioclaveLogic.setDatosCliente(datosCliente);
			historialcambioclaveLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				historialcambioclaveAux=new  HistorialCambioClave();
				
				historialcambioclaveAux.setIsNew(true);
				historialcambioclaveAux.setIsChanged(true);
				
				historialcambioclaveAux.setHistorialCambioClaveOriginal(this.historialcambioclave);
				
				historialcambioclaveAux.setId(this.historialcambioclave.getId());	
				historialcambioclaveAux.setVersionRow(this.historialcambioclave.getVersionRow());	
				historialcambioclaveAux.setid_usuario(this.historialcambioclave.getid_usuario());	
				historialcambioclaveAux.setnombre(this.historialcambioclave.getnombre());	
				historialcambioclaveAux.setfecha_hora(this.historialcambioclave.getfecha_hora());	
				historialcambioclaveAux.setobservacion(this.historialcambioclave.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialcambioclaveSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(historialcambioclaveAux,historialcambioclaveLogic.getHistorialCambioClaves());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialcambioclaveAux,historialcambioclaves);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialcambioclaveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclaveLogic.saveHistorialCambioClaves();//WithConnection
						//historialcambioclaveLogic.getSetVersionRowHistorialCambioClaves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialcambioclave,historialcambioclaveAux);
					
					this.refrescarForeignKeysDescripcionesHistorialCambioClave();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialcambioclaveLogic.saveHistorialCambioClaveRelaciones(historialcambioclaveAux);//WithConnection
								//historialcambioclaveLogic.getSetVersionRowHistorialCambioClaves();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialcambioclave,historialcambioclaveAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialcambioclaveSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialcambioclaveAux,historialcambioclaveLogic.getHistorialCambioClaves());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialcambioclaveAux,historialcambioclaves);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialcambioclave,historialcambioclaveAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				historialcambioclaveAux=new  HistorialCambioClave();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado() 
					|| (this.historialcambioclaveSessionBean.getEsGuardarRelacionado() && this.historialcambioclave.getId()>=0)) {
						
					historialcambioclaveAux.setIsNew(false);
				}
				
				historialcambioclaveAux.setIsDeleted(false);
			
				historialcambioclaveAux.setId(this.historialcambioclave.getId());	
				historialcambioclaveAux.setVersionRow(this.historialcambioclave.getVersionRow());	
				historialcambioclaveAux.setid_usuario(this.historialcambioclave.getid_usuario());	
				historialcambioclaveAux.setnombre(this.historialcambioclave.getnombre());	
				historialcambioclaveAux.setfecha_hora(this.historialcambioclave.getfecha_hora());	
				historialcambioclaveAux.setobservacion(this.historialcambioclave.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialcambioclaveAux,historialcambioclaveLogic.getHistorialCambioClaves());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialcambioclaveAux,historialcambioclaves);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialcambioclaveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclaveLogic.saveHistorialCambioClaves();//WithConnection
						//historialcambioclaveLogic.getSetVersionRowHistorialCambioClaves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialcambioclave,historialcambioclaveAux);
					
					this.refrescarForeignKeysDescripcionesHistorialCambioClave();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialcambioclaveLogic.saveHistorialCambioClaveRelaciones(historialcambioclaveAux);//WithConnection
								//historialcambioclaveLogic.getSetVersionRowHistorialCambioClaves();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialcambioclave,historialcambioclaveAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialcambioclaveSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialcambioclaveAux,historialcambioclaveLogic.getHistorialCambioClaves());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialcambioclaveAux,historialcambioclaves);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialcambioclave,historialcambioclaveAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				historialcambioclaveAux=new  HistorialCambioClave();
				
				historialcambioclaveAux.setIsNew(false);
				historialcambioclaveAux.setIsChanged(false);
				
				historialcambioclaveAux.setIsDeleted(true);
				
				historialcambioclaveAux.setId(this.historialcambioclave.getId());	
				historialcambioclaveAux.setVersionRow(this.historialcambioclave.getVersionRow());	
				historialcambioclaveAux.setid_usuario(this.historialcambioclave.getid_usuario());	
				historialcambioclaveAux.setnombre(this.historialcambioclave.getnombre());	
				historialcambioclaveAux.setfecha_hora(this.historialcambioclave.getfecha_hora());	
				historialcambioclaveAux.setobservacion(this.historialcambioclave.getobservacion());	
				
				if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.historialcambioclaveAux.getId()>=0) {	
						this.historialcambioclavesEliminados.add(historialcambioclaveAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(historialcambioclaveAux,historialcambioclaveLogic.getHistorialCambioClaves());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialcambioclaveAux,historialcambioclaves);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialcambioclaveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclaveLogic.saveHistorialCambioClaves();//WithConnection
						//historialcambioclaveLogic.getSetVersionRowHistorialCambioClaves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialcambioclaveLogic.saveHistorialCambioClaveRelaciones(historialcambioclaveAux);//WithConnection
								//historialcambioclaveLogic.getSetVersionRowHistorialCambioClaves();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones() 
								|| this.historialcambioclaveSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(historialcambioclaveAux,historialcambioclaveLogic.getHistorialCambioClaves());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(historialcambioclaveAux,historialcambioclaves);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.getHistorialCambioClaves().addAll(this.historialcambioclavesEliminados);
					
					historialcambioclaveLogic.saveHistorialCambioClaves();//WithConnection
					//historialcambioclaveLogic.getSetVersionRowHistorialCambioClaves();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesHistorialCambioClave();
				
				this.historialcambioclavesEliminados= new ArrayList<HistorialCambioClave>();		
			}
			
			if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Historial Cambio Clave GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.historialcambioclave=historialcambioclaveAux;
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
      		//this.finishProcessHistorialCambioClave();
      	}
		
	}	
	
	public void actualizarRelaciones(HistorialCambioClave historialcambioclaveLocal) throws Exception {
		
		if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(HistorialCambioClave historialcambioclaveLocal) throws Exception {	
		if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				historialcambioclaveLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHistorialCambioClaveActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = historialcambioclaveValidator.getInvalidValues(this.historialcambioclave);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(HistorialCambioClave historialcambioclave,List<HistorialCambioClave> historialcambioclaves) throws Exception {
		try	{		
			HistorialCambioClaveConstantesFunciones.actualizarLista(historialcambioclave,historialcambioclaves,this.historialcambioclaveSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(HistorialCambioClave historialcambioclave,List<HistorialCambioClave> historialcambioclaves) throws Exception {
		try	{			
			HistorialCambioClaveConstantesFunciones.actualizarSelectedLista(historialcambioclave,historialcambioclaves);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<HistorialCambioClave> historialcambioclavesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				historialcambioclavesLocal=this.historialcambioclaveLogic.getHistorialCambioClaves();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				historialcambioclavesLocal=this.historialcambioclaves;
			}
			//ARCHITECTURE
		
			for(HistorialCambioClave historialcambioclaveLocal:historialcambioclavesLocal) {
				if(this.permiteMantenimiento(historialcambioclaveLocal) && historialcambioclaveLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+HistorialCambioClaveConstantesFunciones.getHistorialCambioClaveLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HistorialCambioClaveConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelid_usuarioHistorialCambioClave,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialCambioClaveConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelnombreHistorialCambioClave,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialCambioClaveConstantesFunciones.FECHAHORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelfecha_horaHistorialCambioClave,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialCambioClaveConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelobservacionHistorialCambioClave,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelid_usuarioHistorialCambioClave,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelnombreHistorialCambioClave,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelfecha_horaHistorialCambioClave,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelobservacionHistorialCambioClave,"");
		
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
		this.iIdNuevoHistorialCambioClave--;	
		
		
		this.historialcambioclaveAux=new HistorialCambioClave();
		
		this.historialcambioclaveAux.setId(this.iIdNuevoHistorialCambioClave);
		this.historialcambioclaveAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialcambioclaveLogic.getHistorialCambioClaves().add(this.historialcambioclaveAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.historialcambioclaves.add(this.historialcambioclaveAux);
		}
		//ARCHITECTURE
		
		this.historialcambioclave=this.historialcambioclaveAux;
		
		if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHistorialCambioClave(this.historialcambioclave);
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialCambioClave(this.historialcambioclave);
		}
				
		//this.setDefaultControlesHistorialCambioClave();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHistorialCambioClave();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHistorialCambioClave();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialCambioClave();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialCambioClave(this.historialcambioclaveBean,this.historialcambioclave,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
			classes=HistorialCambioClaveConstantesFunciones.getClassesRelationshipsOfHistorialCambioClave(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.historialcambioclaveReturnGeneral=historialcambioclaveLogic.procesarEventosHistorialCambioClavesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialcambioclaveLogic.getHistorialCambioClaves(),this.historialcambioclave,this.historialcambioclaveParameterGeneral,this.isEsNuevoHistorialCambioClave,classes);//this.historialcambioclaveLogic.getHistorialCambioClave()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHistorialCambioClave(this.historialcambioclaveReturnGeneral,this.historialcambioclaveBean,false);
		
		if(this.historialcambioclaveReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialCambioClave(this.historialcambioclaveReturnGeneral.getHistorialCambioClave());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHistorialCambioClave(this.historialcambioclaveReturnGeneral.getHistorialCambioClave());
		}
		
		if(this.historialcambioclaveReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHistorialCambioClave(this.historialcambioclaveReturnGeneral.getHistorialCambioClave(),classes);//this.historialcambioclaveBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHistorialCambioClave();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHistorialCambioClave();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.RecargarFormHistorialCambioClave(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHistorialCambioClave(false);
						
			if(historialcambioclaveSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialCambioClave();
			}
			
			this.actualizarVisualTableDatosHistorialCambioClave();
			
			this.jTableDatosHistorialCambioClave.setRowSelectionInterval(this.getIndiceNuevoHistorialCambioClave(), this.getIndiceNuevoHistorialCambioClave());
			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
						
			this.actualizarEstadoCeldasBotonesHistorialCambioClave("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHistorialCambioClave(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jTextFieldnombreHistorialCambioClave.setEnabled(isHabilitar && this.historialcambioclaveConstantesFunciones.activarnombreHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jDateChooserfecha_horaHistorialCambioClave.setEnabled(isHabilitar && this.historialcambioclaveConstantesFunciones.activarfecha_horaHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jTextAreaobservacionHistorialCambioClave.setEnabled(isHabilitar && this.historialcambioclaveConstantesFunciones.activarobservacionHistorialCambioClave);	
		//
		this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setEnabled(isHabilitar && this.historialcambioclaveConstantesFunciones.activarid_usuarioHistorialCambioClave);
	};
	
	public void setDefaultControlesHistorialCambioClave() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHistorialCambioClave(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.historialcambioclaveSessionBean.setConGuardarRelaciones(true);			
			this.historialcambioclaveSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.setVisible(true);
			
					
		} else {
			//this.historialcambioclaveSessionBean.setConGuardarRelaciones(false);			
			this.historialcambioclaveSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoHistorialCambioClave() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
				if(historialcambioclaveAux.getId().equals(this.iIdNuevoHistorialCambioClave)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaves) {
				if(historialcambioclaveAux.getId().equals(this.iIdNuevoHistorialCambioClave)) {
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
	
	public int getIndiceActualHistorialCambioClave(HistorialCambioClave historialcambioclave,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
				if(historialcambioclaveAux.getId().equals(historialcambioclave.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaves) {
				if(historialcambioclaveAux.getId().equals(historialcambioclave.getId())) {
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
	
	public void setCamposBaseDesdeOriginalHistorialCambioClave(HistorialCambioClave historialcambioclaveOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
				if(historialcambioclaveAux.getHistorialCambioClaveOriginal().getId().equals(historialcambioclaveOriginal.getId())) {
					existe=true;
					historialcambioclaveOriginal.setId(historialcambioclaveAux.getId());
					historialcambioclaveOriginal.setVersionRow(historialcambioclaveAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaves) {
				if(historialcambioclaveAux.getHistorialCambioClaveOriginal().getId().equals(historialcambioclaveOriginal.getId())) {
					existe=true;
					historialcambioclaveOriginal.setId(historialcambioclaveAux.getId());
					historialcambioclaveOriginal.setVersionRow(historialcambioclaveAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHistorialCambioClave(Boolean esParaCancelar) throws Exception {
		historialcambioclavesAux=new ArrayList<HistorialCambioClave>();
		historialcambioclaveAux=new HistorialCambioClave();
		
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
					if(historialcambioclaveAux.getId()<0) {
						historialcambioclavesAux.add(historialcambioclaveAux);
					}		
				}
				this.iIdNuevoHistorialCambioClave=0L;
				this.historialcambioclaveLogic.getHistorialCambioClaves().removeAll(historialcambioclavesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaves) {
					if(historialcambioclaveAux.getId()<0) {
						historialcambioclavesAux.add(historialcambioclaveAux);
					}		
				}
				this.iIdNuevoHistorialCambioClave=0L;
				this.historialcambioclaves.removeAll(historialcambioclavesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHistorialCambioClave 
					&& this.historialcambioclaveLogic.getHistorialCambioClaves().size()>0
					) {
					historialcambioclaveAux=this.historialcambioclaveLogic.getHistorialCambioClaves().get(this.historialcambioclaveLogic.getHistorialCambioClaves().size() - 1);
				
					if(historialcambioclaveAux.getId()<0) {
						this.historialcambioclaveLogic.getHistorialCambioClaves().remove(historialcambioclaveAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHistorialCambioClave && this.historialcambioclaves.size()>0) {
					historialcambioclaveAux=this.historialcambioclaves.get(this.historialcambioclaves.size() - 1);
				
					if(historialcambioclaveAux.getId()<0) {
						this.historialcambioclaves.remove(historialcambioclaveAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHistorialCambioClave(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(historialcambioclave.getId()<0) {
				this.historialcambioclaveLogic.getHistorialCambioClaves().remove(this.historialcambioclave);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(historialcambioclave.getId()<0) {
				this.historialcambioclaves.remove(this.historialcambioclave);
			}
		}			
	}
	
	public void setEstadosInicialesHistorialCambioClave(List<HistorialCambioClave> historialcambioclavesAux) throws Exception {
		HistorialCambioClaveConstantesFunciones.setEstadosInicialesHistorialCambioClave(historialcambioclavesAux);
	}
	
	public void setEstadosInicialesHistorialCambioClave(HistorialCambioClave historialcambioclaveAux) throws Exception {
		HistorialCambioClaveConstantesFunciones.setEstadosInicialesHistorialCambioClave(historialcambioclaveAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHistorialCambioClaveActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHistorialCambioClave("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHistorialCambioClaveActual()) {
				if(!this.isEsNuevoHistorialCambioClave) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHistorialCambioClave("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHistorialCambioClave=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHistorialCambioClaveActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Historial Cambio Clave ?", "MANTENIMIENTO DE Historial Cambio Clave", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHistorialCambioClave("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(HistorialCambioClave historialcambioclave) throws Exception {
		HistorialCambioClaveConstantesFunciones.seleccionarAsignar(this.historialcambioclave,historialcambioclave);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHistorialCambioClave=this.isPermisoActualizarOriginalHistorialCambioClave;
			
			
			this.seleccionarAsignar(historialcambioclave);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialCambioClaveConstantesFunciones.quitarEspaciosHistorialCambioClave(this.historialcambioclave,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesHistorialCambioClave("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.historialcambioclaveSessionBean.setsFuncionBusquedaRapida(this.historialcambioclaveSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoHistorialCambioClave) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHistorialCambioClave(esParaCancelar);				
				this.cancelarNuevoHistorialCambioClave(esParaCancelar);								
			}
			
			this.historialcambioclave=new HistorialCambioClave();
			
			this.inicializarHistorialCambioClave();
			
			this.actualizarEstadoCeldasBotonesHistorialCambioClave("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHistorialCambioClave() throws Exception {
		try {
			HistorialCambioClaveConstantesFunciones.inicializarHistorialCambioClave(this.historialcambioclave);
			
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
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.historialcambioclaveLogic.getHistorialCambioClaves().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHistorialCambioClaves(String sAccionBusqueda,List<HistorialCambioClave> historialcambioclavesParaReportes) throws Exception {
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
					sPathReporteFinal="HistorialCambioClave"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HistorialCambioClaveMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HistorialCambioClaveMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="HistorialCambioClave"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Historial Cambio Claves");		
		parameters.put("busquedapor", HistorialCambioClaveConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHistorialCambioClave=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HistorialCambioClaveConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HistorialCambioClaveConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHistorialCambioClave=new JRBeanArrayDataSource(HistorialCambioClaveJInternalFrame.TraerHistorialCambioClaveBeans(historialcambioclavesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHistorialCambioClave);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HistorialCambioClaveConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HistorialCambioClaveConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HistorialCambioClaveBean.TraerHistorialCambioClaveBeans(historialcambioclavesParaReportes).toArray()));
							
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
				this.generarExcelReporteHistorialCambioClaves(sAccionBusqueda,sTipoArchivoReporte,historialcambioclavesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHistorialCambioClaves(sAccionBusqueda,sTipoArchivoReporte,historialcambioclavesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHistorialCambioClaveActionPerformed(null);
					//this.generarExcelReporteHistorialCambioClaves(sAccionBusqueda,sTipoArchivoReporte,historialcambioclavesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHistorialCambioClaves(sAccionBusqueda,sTipoArchivoReporte,historialcambioclavesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHistorialCambioClaves(sAccionBusqueda,sTipoArchivoReporte,historialcambioclavesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHistorialCambioClaves(sAccionBusqueda,sTipoArchivoReporte,historialcambioclavesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHistorialCambioClaves(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialCambioClave> historialcambioclavesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialcambioclave";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialCambioClaves");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialCambioClave("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(HistorialCambioClave historialcambioclave : historialcambioclavesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HistorialCambioClaveConstantesFunciones.generarExcelReporteDataHistorialCambioClave("NORMAL",row,workbook,historialcambioclave,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHistorialCambioClave(String sTipo,Row row,Workbook workbook) {
		
		HistorialCambioClaveConstantesFunciones.generarExcelReporteHeaderHistorialCambioClave(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHistorialCambioClaves(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialCambioClave> historialcambioclavesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialcambioclave_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialCambioClaves");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(HistorialCambioClave historialcambioclave : historialcambioclavesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HistorialCambioClaveConstantesFunciones.getHistorialCambioClaveDescripcion(historialcambioclave));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialcambioclave.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialcambioclave.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialcambioclave.getfecha_hora());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialcambioclave.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHistorialCambioClaves(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialCambioClave> historialcambioclavesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<HistorialCambioClave> historialcambioclavesRespaldo=null;
		
		classes=HistorialCambioClaveConstantesFunciones.getClassesRelationshipsOfHistorialCambioClave(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.historialcambioclaveLogic.setDatosCliente(this.datosCliente);
		this.historialcambioclaveLogic.setDatosDeep(this.datosDeep);
		this.historialcambioclaveLogic.setIsConDeep(true);
		
		historialcambioclavesRespaldo=this.historialcambioclaveLogic.getHistorialCambioClaves();
		
		this.historialcambioclaveLogic.setHistorialCambioClaves(historialcambioclavesParaReportes);	
		this.historialcambioclaveLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		historialcambioclavesParaReportes=this.historialcambioclaveLogic.getHistorialCambioClaves();
		this.historialcambioclaveLogic.setHistorialCambioClaves(historialcambioclavesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialcambioclave_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialCambioClaves");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialCambioClave("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(HistorialCambioClave historialcambioclave : historialcambioclavesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHistorialCambioClave("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HistorialCambioClaveConstantesFunciones.generarExcelReporteDataHistorialCambioClave("NORMAL",row,workbook,historialcambioclave,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(HistorialCambioClaveConstantesFunciones.getHistorialCambioClaveDescripcion(historialcambioclave));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHistorialCambioClave() throws Exception {		
		this.startProcessHistorialCambioClave(true);
	}
	
	public void startProcessHistorialCambioClave(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHistorialCambioClave ,this.jPanelParametrosReportesHistorialCambioClave, this.jScrollPanelDatosHistorialCambioClave,this.jPanelPaginacionHistorialCambioClave, this.jScrollPanelDatosEdicionHistorialCambioClave, this.jPanelAccionesHistorialCambioClave,this.jPanelAccionesFormularioHistorialCambioClave,this.jmenuBarHistorialCambioClave,this.jmenuBarDetalleHistorialCambioClave,this.jTtoolBarHistorialCambioClave,this.jTtoolBarDetalleHistorialCambioClave);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialCambioClave=this.jTabbedPaneBusquedasHistorialCambioClave; 
		
		final JPanel jPanelParametrosReportesHistorialCambioClave=this.jPanelParametrosReportesHistorialCambioClave;
		//final JScrollPane jScrollPanelDatosHistorialCambioClave=this.jScrollPanelDatosHistorialCambioClave;
		final JTable jTableDatosHistorialCambioClave=this.jTableDatosHistorialCambioClave;		
		final JPanel jPanelPaginacionHistorialCambioClave=this.jPanelPaginacionHistorialCambioClave;
		//final JScrollPane jScrollPanelDatosEdicionHistorialCambioClave=this.jScrollPanelDatosEdicionHistorialCambioClave;
		final JPanel jPanelAccionesHistorialCambioClave=this.jPanelAccionesHistorialCambioClave;
		
		JPanel jPanelCamposAuxiliarHistorialCambioClave=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHistorialCambioClave=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			jPanelCamposAuxiliarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jPanelCamposHistorialCambioClave;
			jPanelAccionesFormularioAuxiliarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jPanelAccionesFormularioHistorialCambioClave;
		}
		
		final JPanel jPanelCamposHistorialCambioClave=jPanelCamposAuxiliarHistorialCambioClave;
		final JPanel jPanelAccionesFormularioHistorialCambioClave=jPanelAccionesFormularioAuxiliarHistorialCambioClave;
		
		
		final JMenuBar jmenuBarHistorialCambioClave=this.jmenuBarHistorialCambioClave;
		final JToolBar jTtoolBarHistorialCambioClave=this.jTtoolBarHistorialCambioClave;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHistorialCambioClave=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialCambioClave=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			jmenuBarDetalleAuxiliarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jmenuBarDetalleHistorialCambioClave;
			jTtoolBarDetalleAuxiliarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jTtoolBarDetalleHistorialCambioClave;
		}
		
		final JMenuBar jmenuBarDetalleHistorialCambioClave=jmenuBarDetalleAuxiliarHistorialCambioClave;
		final JToolBar jTtoolBarDetalleHistorialCambioClave=jTtoolBarDetalleAuxiliarHistorialCambioClave;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialCambioClave;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialCambioClave;
			processRunnable.jTableDatos=jTableDatosHistorialCambioClave;
			processRunnable.jPanelCampos=jPanelCamposHistorialCambioClave;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialCambioClave;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialCambioClave;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialCambioClave;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialCambioClave;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialCambioClave;
			processRunnable.jTtoolBar=jTtoolBarHistorialCambioClave;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialCambioClave;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialCambioClave ,jPanelParametrosReportesHistorialCambioClave,jTableDatosHistorialCambioClave, /*jScrollPanelDatosHistorialCambioClave,*/jPanelCamposHistorialCambioClave,jPanelPaginacionHistorialCambioClave, /*jScrollPanelDatosEdicionHistorialCambioClave,*/ jPanelAccionesHistorialCambioClave,jPanelAccionesFormularioHistorialCambioClave,jmenuBarHistorialCambioClave,jmenuBarDetalleHistorialCambioClave,jTtoolBarHistorialCambioClave,jTtoolBarDetalleHistorialCambioClave);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialCambioClave ,jPanelParametrosReportesHistorialCambioClave, jScrollPanelDatosHistorialCambioClave,jPanelPaginacionHistorialCambioClave, jScrollPanelDatosEdicionHistorialCambioClave, jPanelAccionesHistorialCambioClave,jPanelAccionesFormularioHistorialCambioClave,jmenuBarHistorialCambioClave,jmenuBarDetalleHistorialCambioClave,jTtoolBarHistorialCambioClave,jTtoolBarDetalleHistorialCambioClave);
						
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
	
	public void finishProcessHistorialCambioClave() {// throws Exception 
		this.finishProcessHistorialCambioClave(true);
	}
	
	public void finishProcessHistorialCambioClave(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHistorialCambioClave ,this.jPanelParametrosReportesHistorialCambioClave, this.jScrollPanelDatosHistorialCambioClave,this.jPanelPaginacionHistorialCambioClave, this.jScrollPanelDatosEdicionHistorialCambioClave, this.jPanelAccionesHistorialCambioClave,this.jPanelAccionesFormularioHistorialCambioClave,this.jmenuBarHistorialCambioClave,this.jmenuBarDetalleHistorialCambioClave,this.jTtoolBarHistorialCambioClave,this.jTtoolBarDetalleHistorialCambioClave);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialCambioClave=this.jTabbedPaneBusquedasHistorialCambioClave; 
		
		final JPanel jPanelParametrosReportesHistorialCambioClave=this.jPanelParametrosReportesHistorialCambioClave;
		//final JScrollPane jScrollPanelDatosHistorialCambioClave=this.jScrollPanelDatosHistorialCambioClave;
		final JTable jTableDatosHistorialCambioClave=this.jTableDatosHistorialCambioClave;		
		final JPanel jPanelPaginacionHistorialCambioClave=this.jPanelPaginacionHistorialCambioClave;
		//final JScrollPane jScrollPanelDatosEdicionHistorialCambioClave=this.jScrollPanelDatosEdicionHistorialCambioClave;
		final JPanel jPanelAccionesHistorialCambioClave=this.jPanelAccionesHistorialCambioClave;
		
		JPanel jPanelCamposAuxiliarHistorialCambioClave=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHistorialCambioClave=new JPanel();
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			jPanelCamposAuxiliarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jPanelCamposHistorialCambioClave;
			jPanelAccionesFormularioAuxiliarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jPanelAccionesFormularioHistorialCambioClave;
		}
		
		final JPanel jPanelCamposHistorialCambioClave=jPanelCamposAuxiliarHistorialCambioClave;
		final JPanel jPanelAccionesFormularioHistorialCambioClave=jPanelAccionesFormularioAuxiliarHistorialCambioClave;
		
		
		final JMenuBar jmenuBarHistorialCambioClave=this.jmenuBarHistorialCambioClave;		
		final JToolBar jTtoolBarHistorialCambioClave=this.jTtoolBarHistorialCambioClave;
				
		JMenuBar jmenuBarDetalleAuxiliarHistorialCambioClave=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialCambioClave=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			jmenuBarDetalleAuxiliarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jmenuBarDetalleHistorialCambioClave;
			jTtoolBarDetalleAuxiliarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jTtoolBarDetalleHistorialCambioClave;		
		}
		
		final JMenuBar jmenuBarDetalleHistorialCambioClave=jmenuBarDetalleAuxiliarHistorialCambioClave;
		final JToolBar jTtoolBarDetalleHistorialCambioClave=jTtoolBarDetalleAuxiliarHistorialCambioClave;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialCambioClave;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialCambioClave;
			processRunnable.jTableDatos=jTableDatosHistorialCambioClave;
			processRunnable.jPanelCampos=jPanelCamposHistorialCambioClave;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialCambioClave;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialCambioClave;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialCambioClave;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialCambioClave;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialCambioClave;
			processRunnable.jTtoolBar=jTtoolBarHistorialCambioClave;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialCambioClave;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHistorialCambioClave ,jPanelParametrosReportesHistorialCambioClave, jTableDatosHistorialCambioClave,/*jScrollPanelDatosHistorialCambioClave,*/jPanelCamposHistorialCambioClave,jPanelPaginacionHistorialCambioClave, /*jScrollPanelDatosEdicionHistorialCambioClave,*/ jPanelAccionesHistorialCambioClave,jPanelAccionesFormularioHistorialCambioClave,jmenuBarHistorialCambioClave,jmenuBarDetalleHistorialCambioClave,jTtoolBarHistorialCambioClave,jTtoolBarDetalleHistorialCambioClave));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHistorialCambioClave(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHistorialCambioClave(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHistorialCambioClave(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHistorialCambioClave(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHistorialCambioClave,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHistorialCambioClave,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHistorialCambioClave(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHistorialCambioClave,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHistorialCambioClave,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.historialcambioclaveConstantesFunciones.getsFinalQueryHistorialCambioClave();
		String  finalQueryPaginacionTodos=this.historialcambioclaveConstantesFunciones.getsFinalQueryHistorialCambioClave();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=HistorialCambioClaveConstantesFunciones.getArrayColumnasGlobalesNoHistorialCambioClave(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HistorialCambioClaveConstantesFunciones.getArrayColumnasGlobalesHistorialCambioClave(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HistorialCambioClaveConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.historialcambioclavesEliminados= new ArrayList<HistorialCambioClave>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHistorialCambioClave();
		
				///*HistorialCambioClaveSessionBean*/this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
			
			if(this.historialcambioclaveSessionBean==null) {
				this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
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
					this.iNumeroPaginacion=HistorialCambioClaveConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HistorialCambioClaveConstantesFunciones.getClassesForeignKeysOfHistorialCambioClave(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/historialcambioclave."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			historialcambioclavesAux= new ArrayList<HistorialCambioClave>();
			
				
			historialcambioclaveLogic.setDatosCliente(this.datosCliente);
			historialcambioclaveLogic.setDatosDeep(this.datosDeep);
			historialcambioclaveLogic.setIsConDeep(true);
			
			
			historialcambioclaveLogic.getHistorialCambioClaveDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					historialcambioclaveLogic.getTodosHistorialCambioClaves(finalQueryGlobal,pagination);
					
					//historialcambioclaveLogic.getTodosHistorialCambioClavesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(historialcambioclaveLogic.getHistorialCambioClaves()==null|| historialcambioclaveLogic.getHistorialCambioClaves().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialcambioclavesAux= new ArrayList<HistorialCambioClave>();
							historialcambioclavesAux.addAll(historialcambioclaveLogic.getHistorialCambioClaves());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialcambioclavesAux= new ArrayList<HistorialCambioClave>();
							historialcambioclavesAux.addAll(historialcambioclaves);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialcambioclaveLogic.getTodosHistorialCambioClaves(finalQueryGlobal+"",this.pagination);												
							
							//historialcambioclaveLogic.getTodosHistorialCambioClavesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteHistorialCambioClaves("Todos",historialcambioclaveLogic.getHistorialCambioClaves() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialcambioclaveLogic.setHistorialCambioClaves(new ArrayList<HistorialCambioClave>());					
							historialcambioclaveLogic.getHistorialCambioClaves().addAll(historialcambioclavesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialcambioclaves=new ArrayList<HistorialCambioClave>();
							historialcambioclaves.addAll(historialcambioclavesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idHistorialCambioClave=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idHistorialCambioClave=this.idActual;
				
				} else if(this.idHistorialCambioClaveActual!=null && this.idHistorialCambioClaveActual!=0L) {
					idHistorialCambioClave=idHistorialCambioClaveActual;
				}
				
					
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndicePorId(idHistorialCambioClave);
				
				this.historialcambioclaves=new ArrayList<HistorialCambioClave>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					historialcambioclaveLogic.getEntity(idHistorialCambioClave);
					
					//historialcambioclaveLogic.getEntityWithConnection(idHistorialCambioClave);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialcambioclaveLogic.setHistorialCambioClaves(new ArrayList<HistorialCambioClave>());
					historialcambioclaveLogic.getHistorialCambioClaves().add(historialcambioclaveLogic.getHistorialCambioClave());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialcambioclaves=new ArrayList<HistorialCambioClave>();
					this.historialcambioclaves.add(historialcambioclave);
				}
				
				if(historialcambioclaveLogic.getHistorialCambioClave()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora")) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialcambioclaveLogic.getHistorialCambioClavesBusquedaPorIdUsuarioPorFechaHora(finalQueryGlobal,pagination,id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialcambioclaveLogic.getHistorialCambioClaves()==null||historialcambioclaveLogic.getHistorialCambioClaves().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialcambioclaves==null|| historialcambioclaves.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclavesAux=new ArrayList<HistorialCambioClave>();
						historialcambioclavesAux.addAll(historialcambioclaveLogic.getHistorialCambioClaves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialcambioclavesAux=new ArrayList<HistorialCambioClave>();
							historialcambioclavesAux.addAll(historialcambioclaves);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialcambioclaveLogic.getHistorialCambioClavesBusquedaPorIdUsuarioPorFechaHora(finalQueryGlobal,pagination,id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialCambioClaves("BusquedaPorIdUsuarioPorFechaHora",historialcambioclaveLogic.getHistorialCambioClaves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialCambioClaves("BusquedaPorIdUsuarioPorFechaHora",historialcambioclaves);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclaveLogic.setHistorialCambioClaves(new ArrayList<HistorialCambioClave>());
						historialcambioclaveLogic.getHistorialCambioClaves().addAll(historialcambioclavesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialcambioclaves=new ArrayList<HistorialCambioClave>();
							historialcambioclaves.addAll(historialcambioclavesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialcambioclaveLogic.getHistorialCambioClavesFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialcambioclaveLogic.getHistorialCambioClaves()==null||historialcambioclaveLogic.getHistorialCambioClaves().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialcambioclaves==null|| historialcambioclaves.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclavesAux=new ArrayList<HistorialCambioClave>();
						historialcambioclavesAux.addAll(historialcambioclaveLogic.getHistorialCambioClaves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialcambioclavesAux=new ArrayList<HistorialCambioClave>();
							historialcambioclavesAux.addAll(historialcambioclaves);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialcambioclaveLogic.getHistorialCambioClavesFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialCambioClaveConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialCambioClaves("FK_IdUsuario",historialcambioclaveLogic.getHistorialCambioClaves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialCambioClaves("FK_IdUsuario",historialcambioclaves);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclaveLogic.setHistorialCambioClaves(new ArrayList<HistorialCambioClave>());
						historialcambioclaveLogic.getHistorialCambioClaves().addAll(historialcambioclavesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialcambioclaves=new ArrayList<HistorialCambioClave>();
							historialcambioclaves.addAll(historialcambioclavesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHistorialCambioClave();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHistorialCambioClave();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialcambioclaveLogic.getHistorialCambioClaves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialcambioclaves.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialcambioclaveLogic.getHistorialCambioClaves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialcambioclaves.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(HistorialCambioClave historialcambioclave) {
		Boolean permite=true;
		
		if(this.historialcambioclave.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HistorialCambioClaveConstantesFunciones.getOrderByListaHistorialCambioClave();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HistorialCambioClaveConstantesFunciones.getOrderByListaHistorialCambioClave();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialCambioClave historialcambioclave:historialcambioclaveLogic.getHistorialCambioClaves()) {
				if(historialcambioclave.getsType().equals(Constantes2.S_TOTALES)) {
					historialcambioclaveTotales=historialcambioclave;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialCambioClave historialcambioclave:this.historialcambioclaves) {
				if(historialcambioclave.getsType().equals(Constantes2.S_TOTALES)) {
					historialcambioclaveTotales=historialcambioclave;
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
			this.historialcambioclaveAux=new HistorialCambioClave();
			this.historialcambioclaveAux.setsType(Constantes2.S_TOTALES);
			this.historialcambioclaveAux.setIsNew(false);
			this.historialcambioclaveAux.setIsChanged(false);
			this.historialcambioclaveAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				HistorialCambioClaveConstantesFunciones.TotalizarValoresFilaHistorialCambioClave(this.historialcambioclaveLogic.getHistorialCambioClaves(),this.historialcambioclaveAux);
				
				this.historialcambioclaveLogic.getHistorialCambioClaves().add(this.historialcambioclaveAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HistorialCambioClaveConstantesFunciones.TotalizarValoresFilaHistorialCambioClave(this.historialcambioclaves,this.historialcambioclaveAux);
				
				this.historialcambioclaves.add(this.historialcambioclaveAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		historialcambioclaveTotales=new HistorialCambioClave();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialcambioclaveLogic.getHistorialCambioClaves().remove(historialcambioclaveTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialcambioclaves.remove(historialcambioclaveTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		historialcambioclaveTotales=new HistorialCambioClave();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialCambioClave historialcambioclave:historialcambioclaveLogic.getHistorialCambioClaves()) {
				if(historialcambioclave.getsType().equals(Constantes2.S_TOTALES)) {
					historialcambioclaveTotales=historialcambioclave;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialCambioClaveConstantesFunciones.TotalizarValoresFilaHistorialCambioClave(this.historialcambioclaveLogic.getHistorialCambioClaves(),historialcambioclaveTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialCambioClave historialcambioclave:this.historialcambioclaves) {
				if(historialcambioclave.getsType().equals(Constantes2.S_TOTALES)) {
					historialcambioclaveTotales=historialcambioclave;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialCambioClaveConstantesFunciones.TotalizarValoresFilaHistorialCambioClave(this.historialcambioclaves,historialcambioclaveTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHistorialCambioClavesBusquedaPorIdUsuarioPorFechaHora()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdUsuarioPorFechaHora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialCambioClavesFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHistorialCambioClavesBusquedaPorIdUsuarioPorFechaHora(String sFinalQuery,Long id_usuario,Timestamp fecha_hora)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialcambioclaveLogic.getHistorialCambioClavesBusquedaPorIdUsuarioPorFechaHora(sFinalQuery,this.pagination,id_usuario,fecha_hora);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialCambioClavesFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialcambioclaveLogic.getHistorialCambioClavesFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosHistorialCambioClave() {
		this.isPermisoTodoHistorialCambioClave=false;
		this.isPermisoNuevoHistorialCambioClave=false;
		this.isPermisoActualizarHistorialCambioClave=false;
		this.isPermisoActualizarOriginalHistorialCambioClave=false;
		this.isPermisoEliminarHistorialCambioClave=false;
		this.isPermisoGuardarCambiosHistorialCambioClave=false;
		this.isPermisoConsultaHistorialCambioClave=false;
		this.isPermisoBusquedaHistorialCambioClave=false;
		this.isPermisoReporteHistorialCambioClave=false;		
		this.isPermisoOrdenHistorialCambioClave=false;		
		this.isPermisoPaginacionMedioHistorialCambioClave=false;		
		this.isPermisoPaginacionAltoHistorialCambioClave=false;
		this.isPermisoPaginacionTodoHistorialCambioClave=false;
		this.isPermisoCopiarHistorialCambioClave=false;		
		this.isPermisoVerFormHistorialCambioClave=false;		
		this.isPermisoDuplicarHistorialCambioClave=false;		
		this.isPermisoOrdenHistorialCambioClave=false;		
	}
	
	public void setPermisosUsuarioHistorialCambioClave(Boolean isPermiso) {
		this.isPermisoTodoHistorialCambioClave=isPermiso;
		this.isPermisoNuevoHistorialCambioClave=isPermiso;
		this.isPermisoActualizarHistorialCambioClave=isPermiso;
		this.isPermisoActualizarOriginalHistorialCambioClave=isPermiso;
		this.isPermisoEliminarHistorialCambioClave=isPermiso;
		this.isPermisoGuardarCambiosHistorialCambioClave=isPermiso;
		this.isPermisoConsultaHistorialCambioClave=isPermiso;
		this.isPermisoBusquedaHistorialCambioClave=isPermiso;
		this.isPermisoReporteHistorialCambioClave=isPermiso;
		this.isPermisoOrdenHistorialCambioClave=isPermiso;		
		this.isPermisoPaginacionMedioHistorialCambioClave=isPermiso;		
		this.isPermisoPaginacionAltoHistorialCambioClave=isPermiso;		
		this.isPermisoPaginacionTodoHistorialCambioClave=isPermiso;		
		this.isPermisoCopiarHistorialCambioClave=isPermiso;		
		this.isPermisoVerFormHistorialCambioClave=isPermiso;		
		this.isPermisoDuplicarHistorialCambioClave=isPermiso;
		this.isPermisoOrdenHistorialCambioClave=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHistorialCambioClave(Boolean isPermiso) {
		//this.isPermisoTodoHistorialCambioClave=isPermiso;
		this.isPermisoNuevoHistorialCambioClave=isPermiso;
		this.isPermisoActualizarHistorialCambioClave=isPermiso;
		this.isPermisoActualizarOriginalHistorialCambioClave=isPermiso;
		this.isPermisoEliminarHistorialCambioClave=isPermiso;
		this.isPermisoGuardarCambiosHistorialCambioClave=isPermiso;
		//this.isPermisoConsultaHistorialCambioClave=isPermiso;
		//this.isPermisoBusquedaHistorialCambioClave=isPermiso;
		//this.isPermisoReporteHistorialCambioClave=isPermiso;
		//this.isPermisoOrdenHistorialCambioClave=isPermiso;		
		//this.isPermisoPaginacionMedioHistorialCambioClave=isPermiso;		
		//this.isPermisoPaginacionAltoHistorialCambioClave=isPermiso;		
		//this.isPermisoPaginacionTodoHistorialCambioClave=isPermiso;		
		//this.isPermisoCopiarHistorialCambioClave=isPermiso;		
		//this.isPermisoDuplicarHistorialCambioClave=isPermiso;
		//this.isPermisoOrdenHistorialCambioClave=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHistorialCambioClaveClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(HistorialCambioClaveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebHistorialCambioClave(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHistorialCambioClaveClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioHistorialCambioClaveClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHistorialCambioClaveClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHistorialCambioClaveClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioHistorialCambioClave() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HistorialCambioClaveJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HistorialCambioClaveConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHistorialCambioClave=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHistorialCambioClave=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHistorialCambioClave=this.isPermisoActualizarHistorialCambioClave;
			this.isPermisoEliminarHistorialCambioClave=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHistorialCambioClave=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHistorialCambioClave=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHistorialCambioClave=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHistorialCambioClave=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHistorialCambioClave=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialCambioClave=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHistorialCambioClave=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHistorialCambioClave=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHistorialCambioClave=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHistorialCambioClave=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHistorialCambioClave=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHistorialCambioClave=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialCambioClave=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHistorialCambioClave.setToolTipText(this.jTableDatosHistorialCambioClave.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHistorialCambioClave(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHistorialCambioClave(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HistorialCambioClaveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(HistorialCambioClaveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioHistorialCambioClave() throws Exception {
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyHistorialCambioClaveListas()throws Exception {
		try	{						
			
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHistorialCambioClaveListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HistorialCambioClaveJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyHistorialCambioClaveListas(false);
			} else {
			
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyHistorialCambioClaveListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			HistorialCambioClaveParameterReturnGeneral historialcambioclaveReturnGeneral=new HistorialCambioClaveParameterReturnGeneral();
						
			


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.historialcambioclaveConstantesFunciones.cargarid_usuarioHistorialCambioClave)
					 || (this.esRecargarFks && this.historialcambioclaveConstantesFunciones.cargarid_usuarioHistorialCambioClave)) {

					if(!this.historialcambioclaveSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+historialcambioclaveSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				historialcambioclaveReturnGeneral=historialcambioclaveLogic.cargarCombosLoteForeignKeyHistorialCambioClave(finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=historialcambioclaveReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyHistorialCambioClave()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {
			if(this.historialcambioclaveSessionBean==null) {
				this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
			}

			if(!this.historialcambioclaveSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyHistorialCambioClave()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHistorialCambioClave(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHistorialCambioClave()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialCambioClave();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHistorialCambioClave(HistorialCambioClave historialcambioclave)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHistorialCambioClave(HistorialCambioClave historialcambioclave,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHistorialCambioClave()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialCambioClave()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHistorialCambioClave()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHistorialCambioClave()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHistorialCambioClave()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHistorialCambioClave()throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHistorialCambioClave(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHistorialCambioClave()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave!=null && this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public HistorialCambioClaveBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HistorialCambioClaveBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HistorialCambioClaveBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean(); 
		this.historialcambioclaveConstantesFunciones=new HistorialCambioClaveConstantesFunciones(); 
		this.historialcambioclaveBean=new HistorialCambioClave();//(this.historialcambioclaveConstantesFunciones); 		
		this.historialcambioclaveReturnGeneral=new HistorialCambioClaveParameterReturnGeneral(); 
		
		this.historialcambioclaveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialcambioclaveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HistorialCambioClaveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HistorialCambioClaveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HistorialCambioClaveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHistorialCambioClave(true);
			
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
			
			this.historialcambioclaveConstantesFunciones=new HistorialCambioClaveConstantesFunciones(); 
			this.historialcambioclaveBean=new HistorialCambioClave();//this.historialcambioclaveConstantesFunciones); 			
			this.historialcambioclaveReturnGeneral=new HistorialCambioClaveParameterReturnGeneral(); 
		
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Cambio Clave Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.historialcambioclave=new HistorialCambioClave();
			this.historialcambioclaves = new ArrayList<HistorialCambioClave>();
			this.historialcambioclavesAux = new ArrayList<HistorialCambioClave>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic=new HistorialCambioClaveLogic();
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}
			
			//this.historialcambioclaveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.historialcambioclaveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHistorialCambioClave);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialCambioClave);	
					}
					
					if(this.jInternalFrameImportacionHistorialCambioClave!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialCambioClave);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHistorialCambioClave!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHistorialCambioClave);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialCambioClave);
				this.jInternalFrameDetalleFormHistorialCambioClave.setVisible(false);
				this.jInternalFrameDetalleFormHistorialCambioClave.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialCambioClave);
					this.jInternalFrameReporteDinamicoHistorialCambioClave.setVisible(false);
					this.jInternalFrameReporteDinamicoHistorialCambioClave.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHistorialCambioClave!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHistorialCambioClave);
					this.jInternalFrameImportacionHistorialCambioClave.setVisible(false);
					this.jInternalFrameImportacionHistorialCambioClave.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHistorialCambioClave!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHistorialCambioClave);
					this.jInternalFrameOrderByHistorialCambioClave.setVisible(false);
					this.jInternalFrameOrderByHistorialCambioClave.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHistorialCambioClaveActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HistorialCambioClaveConstantesFunciones.INUMEROPAGINACION;
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
			
			this.historialcambioclaveReturnGeneral=new HistorialCambioClaveParameterReturnGeneral();
			
			this.historialcambioclaveParameterGeneral=new HistorialCambioClaveParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.historialcambioclaveLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
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
			
			if(HistorialCambioClaveJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialCambioClaveConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialcambioclaveSessionBean.getEsGuardarRelacionado(),this.historialcambioclaveSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialCambioClaveConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialcambioclaveSessionBean.getEsGuardarRelacionado(),this.historialcambioclaveSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoHistorialCambioClave=false;
			this.isVisibilidadCeldaDuplicarHistorialCambioClave=true;
			this.isVisibilidadCeldaCopiarHistorialCambioClave=true;
			this.isVisibilidadCeldaVerFormHistorialCambioClave=true;
			this.isVisibilidadCeldaOrdenHistorialCambioClave=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
			this.isVisibilidadCeldaModificarHistorialCambioClave=false;
			this.isVisibilidadCeldaActualizarHistorialCambioClave=false;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=false;
			this.isVisibilidadCeldaCancelarHistorialCambioClave=false;
			this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=false;
			
			
			this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHistorialCambioClave("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHistorialCambioClave();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHistorialCambioClave(false);
			
			this.setPermisosUsuarioHistorialCambioClave();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado() 
				|| (this.historialcambioclaveSessionBean.getEsGuardarRelacionado() && this.historialcambioclaveSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHistorialCambioClaveClasesRelacionadas();
			}
			
			if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHistorialCambioClaveClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHistorialCambioClave();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHistorialCambioClave();
			}
			
			if(!this.isPermisoBusquedaHistorialCambioClave) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioHistorialCambioClave,this.isPermisoPaginacionMedioHistorialCambioClave,this.isPermisoPaginacionTodoHistorialCambioClave);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HistorialCambioClaveConstantesFunciones.getTiposSeleccionarHistorialCambioClave());
				
				this.tiposColumnasSelect=HistorialCambioClaveConstantesFunciones.getTiposSeleccionarHistorialCambioClave(true);
				
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
			//if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHistorialCambioClave();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioHistorialCambioClave(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioHistorialCambioClave(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialCambioClave() ;
			
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
			
			this.usuarioLogic=new UsuarioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				historialcambioclaveImplementable= (HistorialCambioClaveImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialCambioClaveConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				historialcambioclaveImplementableHome= (HistorialCambioClaveImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialCambioClaveConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.historialcambioclaves= new ArrayList<HistorialCambioClave>();
			this.historialcambioclavesEliminados= new ArrayList<HistorialCambioClave>();
						
			this.isEsNuevoHistorialCambioClave=false;
			this.esParaAccionDesdeFormularioHistorialCambioClave=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHistorialCambioClave(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHistorialCambioClave();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HistorialCambioClaveConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHistorialCambioClave("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHistorialCambioClave(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHistorialCambioClave();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHistorialCambioClave();
			}
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHistorialCambioClave.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHistorialCambioClave.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHistorialCambioClave.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHistorialCambioClave(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga HistorialCambioClave: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHistorialCambioClave() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHistorialCambioClave")) {
				iIndex=this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHistorialCambioClave();	
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
	
	public void cargarCombosForeignKeyHistorialCambioClave(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHistorialCambioClave(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHistorialCambioClave(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHistorialCambioClaveListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHistorialCambioClave();
		
		this.cargarCombosFrameForeignKeyHistorialCambioClave();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHistorialCambioClave();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHistorialCambioClave();
		}
	}
	
	
	
	public void jButtonNuevoHistorialCambioClaveActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
			
			if(jTableDatosHistorialCambioClave.getRowCount()>=1) {
				jTableDatosHistorialCambioClave.removeRowSelectionInterval(0, jTableDatosHistorialCambioClave.getRowCount()-1);						
			}
			
			this.isEsNuevoHistorialCambioClave=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHistorialCambioClave(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHistorialCambioClave(true);			
			//this.historialcambioclave=new HistorialCambioClave();
			//this.historialcambioclave.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialCambioClave(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialCambioClave() ;
			
			if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialCambioClave(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.historialcambioclave);	
			this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);				
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
			if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar HistorialCambioClave: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHistorialCambioClaveActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHistorialCambioClave.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHistorialCambioClave.getSelectedRows().length;			
			}
			
			historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHistorialCambioClave--;			
				//HistorialCambioClave historialcambioclaveAux= new HistorialCambioClave();			
				//historialcambioclaveAux.setId(this.iIdNuevoHistorialCambioClave);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//HistorialCambioClave historialcambioclaveOrigen=new HistorialCambioClave();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(HistorialCambioClave historialcambioclaveOrigen : historialcambioclavesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							historialcambioclaveOrigen =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialcambioclaveOrigen =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHistorialCambioClave();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.historialcambioclave.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHistorialCambioClave(historialcambioclaveOrigen,this.historialcambioclave,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialcambioclaveLogic.getHistorialCambioClaves().add(this.historialcambioclaveAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialcambioclaves.add(this.historialcambioclaveAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHistorialCambioClave(false);
				
				this.jTableDatosHistorialCambioClave.setRowSelectionInterval(this.getIndiceNuevoHistorialCambioClave(), this.getIndiceNuevoHistorialCambioClave());
				
				int iLastRow =  this.jTableDatosHistorialCambioClave.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialCambioClave.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialCambioClave.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialCambioClave(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();									
		
			HistorialCambioClave historialcambioclaveOrigen=new HistorialCambioClave();
			HistorialCambioClave historialcambioclaveDestino=new HistorialCambioClave();
				
			historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHistorialCambioClave.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || historialcambioclavesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHistorialCambioClave.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclaveOrigen =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialcambioclaveOrigen =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialcambioclaveDestino =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialcambioclaveDestino =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				historialcambioclaveOrigen =historialcambioclavesSeleccionados.get(0);
				historialcambioclaveDestino =historialcambioclavesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHistorialCambioClave(historialcambioclaveOrigen,historialcambioclaveDestino,true,false);
				
				historialcambioclaveDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialcambioclaveDestino,historialcambioclaveLogic.getHistorialCambioClaves());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialcambioclaveDestino,historialcambioclaves);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHistorialCambioClave(false);
				
				//this.jTableDatosHistorialCambioClave.setRowSelectionInterval(this.getIndiceNuevoHistorialCambioClave(), this.getIndiceNuevoHistorialCambioClave());
				
				int iLastRow =  this.jTableDatosHistorialCambioClave.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialCambioClave.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialCambioClave.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialCambioClave(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHistorialCambioClave.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHistorialCambioClave.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHistorialCambioClave.setVisible(!isVisible);
			this.jPanelPaginacionHistorialCambioClave.setVisible(!isVisible);
			this.jPanelAccionesHistorialCambioClave.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHistorialCambioClave();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHistorialCambioClave();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHistorialCambioClave();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHistorialCambioClave();
			
			this.abrirFrameOrderByHistorialCambioClave();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHistorialCambioClave();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHistorialCambioClave(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialCambioClave);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHistorialCambioClave.isMaximum()) {
					this.jInternalFrameDetalleFormHistorialCambioClave.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHistorialCambioClave.setSize(this.jInternalFrameDetalleFormHistorialCambioClave.iWidthFormulario,this.jInternalFrameDetalleFormHistorialCambioClave.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHistorialCambioClave.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHistorialCambioClave.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHistorialCambioClave.isMaximum()) {
						this.jInternalFrameDetalleFormHistorialCambioClave.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHistorialCambioClave.jContentPaneDetalleHistorialCambioClave.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHistorialCambioClave.jContentPaneDetalleHistorialCambioClave.getWidth(),HistorialCambioClaveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHistorialCambioClave.jContentPaneDetalleHistorialCambioClave.getWidth(),HistorialCambioClaveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHistorialCambioClave.jContentPaneDetalleHistorialCambioClave.getWidth(),HistorialCambioClaveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHistorialCambioClave.setVisible(true);
	        this.jInternalFrameDetalleFormHistorialCambioClave.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHistorialCambioClave() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHistorialCambioClave==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHistorialCambioClave=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialCambioClave,false,this);
				} else {
					this.jInternalFrameOrderByHistorialCambioClave=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialCambioClave,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHistorialCambioClave);
				this.jInternalFrameOrderByHistorialCambioClave.setVisible(false);
				this.jInternalFrameOrderByHistorialCambioClave.setSelected(false);
				
				this.jInternalFrameOrderByHistorialCambioClave.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialCambioClave"));
				
				this.inicializarActualizarBindingTablaOrderByHistorialCambioClave();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHistorialCambioClave() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHistorialCambioClave==null) {
				
				this.jInternalFrameImportacionHistorialCambioClave=new ImportacionJInternalFrame(HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialCambioClave);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHistorialCambioClave);
				this.jInternalFrameImportacionHistorialCambioClave.setVisible(false);
				this.jInternalFrameImportacionHistorialCambioClave.setSelected(false);


				this.jInternalFrameImportacionHistorialCambioClave.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialCambioClave"));
				this.jInternalFrameImportacionHistorialCambioClave.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialCambioClave"));
				this.jInternalFrameImportacionHistorialCambioClave.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialCambioClave"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHistorialCambioClave() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHistorialCambioClave==null) {
				this.jInternalFrameReporteDinamicoHistorialCambioClave=new ReporteDinamicoJInternalFrame(HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialCambioClave);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialCambioClave);
				this.jInternalFrameReporteDinamicoHistorialCambioClave.setVisible(false);
				this.jInternalFrameReporteDinamicoHistorialCambioClave.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHistorialCambioClave.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialCambioClave"));
				this.jInternalFrameReporteDinamicoHistorialCambioClave.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialCambioClave"));
				this.jInternalFrameReporteDinamicoHistorialCambioClave.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialCambioClave"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialCambioClave();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleHistorialCambioClave() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialCambioClave);
			
	       	this.jInternalFrameDetalleFormHistorialCambioClave.setVisible(false);
	        this.jInternalFrameDetalleFormHistorialCambioClave.setSelected(false);
			
			//this.jInternalFrameDetalleFormHistorialCambioClave.dispose();
			//this.jInternalFrameDetalleFormHistorialCambioClave=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHistorialCambioClave() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHistorialCambioClave.setVisible(true);
	        this.jInternalFrameReporteDinamicoHistorialCambioClave.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHistorialCambioClave() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHistorialCambioClave.setVisible(true);
	        this.jInternalFrameImportacionHistorialCambioClave.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHistorialCambioClave() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHistorialCambioClave.setVisible(true);
	        this.jInternalFrameOrderByHistorialCambioClave.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHistorialCambioClave() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHistorialCambioClave.setVisible(false);
	        this.jInternalFrameOrderByHistorialCambioClave.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHistorialCambioClave() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHistorialCambioClave.setVisible(false);
	        this.jInternalFrameReporteDinamicoHistorialCambioClave.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHistorialCambioClave() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHistorialCambioClave.setVisible(false);
	        this.jInternalFrameImportacionHistorialCambioClave.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHistorialCambioClave(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHistorialCambioClave(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHistorialCambioClave(true);
			//this.isEsNuevoHistorialCambioClave=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHistorialCambioClave("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialCambioClave(false) ;
			
			if(historialcambioclaveSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialCambioClave(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialCambioClave(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHistorialCambioClaveActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHistorialCambioClave(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHistorialCambioClave(true);
			//this.isEsNuevoHistorialCambioClave=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.historialcambioclave.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHistorialCambioClave("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHistorialCambioClave(false) ;
			
			if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialCambioClave(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialCambioClave(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHistorialCambioClave(false);
			
			//if(!this.isEsNuevoHistorialCambioClave) {								
				int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
				
			}
			
			if(this.permiteMantenimiento(this.historialcambioclave)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHistorialCambioClave=true;
					this.inicializarActualizarBindingTablaHistorialCambioClave(false);
					this.isEsNuevoHistorialCambioClave=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHistorialCambioClave=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHistorialCambioClave=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialCambioClave(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialCambioClave(false);
				
				this.habilitarDeshabilitarControlesHistorialCambioClave(false);
			
												
				
				if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHistorialCambioClave();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHistorialCambioClaveActionPerformed(evt,historialcambioclaveSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHistorialCambioClave(this.historialcambioclave,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHistorialCambioClave.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,historialcambioclaveSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.historialcambioclave.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				this.historialcambioclave.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				this.historialcambioclave.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.historialcambioclave)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HistorialCambioClaveModel) this.jTableDatosHistorialCambioClave.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHistorialCambioClave=true;
				this.inicializarActualizarBindingTablaHistorialCambioClave(false);
				this.isEsNuevoHistorialCambioClave=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialCambioClave(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialCambioClave(false);
				
				this.habilitarDeshabilitarControlesHistorialCambioClave(false);
				
				
				
				if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHistorialCambioClave();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHistorialCambioClave.getRowCount()>=1) {
				jTableDatosHistorialCambioClave.removeRowSelectionInterval(0, jTableDatosHistorialCambioClave.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHistorialCambioClave(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHistorialCambioClave(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialCambioClave(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialCambioClave(false) ;
			
			this.isEsNuevoHistorialCambioClave=false;
			
			if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHistorialCambioClave();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHistorialCambioClave(false);
				
				//SI ES MANUAL
				if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHistorialCambioClave();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHistorialCambioClave--;			
			//HistorialCambioClave historialcambioclaveAux= new HistorialCambioClave();			
			//historialcambioclaveAux.setId(this.iIdNuevoHistorialCambioClave);
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHistorialCambioClave();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
			
			this.historialcambioclave.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.historialcambioclaveLogic.getHistorialCambioClaves().add(this.historialcambioclaveAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.historialcambioclaves.add(this.historialcambioclaveAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHistorialCambioClave(false);
			
			this.jTableDatosHistorialCambioClave.setRowSelectionInterval(this.getIndiceNuevoHistorialCambioClave(), this.getIndiceNuevoHistorialCambioClave());
			
			int iLastRow =  this.jTableDatosHistorialCambioClave.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHistorialCambioClave.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHistorialCambioClave.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHistorialCambioClave(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHistorialCambioClave(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialCambioClave(false);
			
			//SI ES MANUAL
			if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialCambioClave();
			}
			
			//this.abrirFrameTreeHistorialCambioClave();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Historial Cambio ClaveS ?", "MANTENIMIENTO DE Historial Cambio Clave", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionHistorialCambioClave.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralHistorialCambioClave();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.historialcambioclaveReturnGeneral=historialcambioclaveLogic.procesarImportacionHistorialCambioClavesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.historialcambioclaveParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarHistorialCambioClaveReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHistorialCambioClave.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHistorialCambioClave.setFileImportacion(this.jInternalFrameImportacionHistorialCambioClave.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHistorialCambioClave.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHistorialCambioClave.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHistorialCambioClave.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHistorialCambioClave.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		

		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HistorialCambioClaveBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HistorialCambioClaveBaseDesign.jrxml";
			
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
			
			this.generarReporteHistorialCambioClaves("Todos",historialcambioclavesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaHora_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaHora_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaHora_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaHora_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoHistorialCambioClave.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA:
					sNombreCampoCategoria="fecha_hora";
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA:
					sNombreCampoCategoriaValor="fecha_hora";
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_hora");
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialcambioclave";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("HistorialCambioClaves");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(HistorialCambioClave historialcambioclave:historialcambioclavesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialcambioclave.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(HistorialCambioClave historialcambioclave:historialcambioclavesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialcambioclave.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA);
					iRow++;

					for(HistorialCambioClave historialcambioclave:historialcambioclavesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialcambioclave.getfecha_hora());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(HistorialCambioClave historialcambioclave:historialcambioclavesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialcambioclave.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelHistorialCambioClave(row);				
			//	iRow++;
			//}				
			
			//for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHistorialCambioClave(historialcambioclaveAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
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
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialCambioClave(false);
			
			//SI ES MANUAL
			if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialCambioClave();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialCambioClave(false);
			
			//SI ES MANUAL
			if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialCambioClave();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialCambioClave(false);
			
			//SI ES MANUAL
			if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialCambioClave();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHistorialCambioClave() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHistorialCambioClave.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHistorialCambioClave.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHistorialCambioClave.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHistorialCambioClave.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHistorialCambioClave.setMinimumSize(dimensionMinimum);
		this.jTableDatosHistorialCambioClave.setMaximumSize(dimensionMaximum);
		this.jTableDatosHistorialCambioClave.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHistorialCambioClave(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHistorialCambioClave(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHistorialCambioClave(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHistorialCambioClave(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHistorialCambioClave(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHistorialCambioClave(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialCambioClave(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHistorialCambioClave(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHistorialCambioClave() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHistorialCambioClave();
		
		this.inicializarActualizarBindingBotonesManualHistorialCambioClave(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialCambioClave();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialCambioClave() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialCambioClave(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialCambioClave(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHistorialCambioClave.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHistorialCambioClave.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHistorialCambioClave.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHistorialCambioClave.jCheckBoxPostAccionNuevoHistorialCambioClave.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHistorialCambioClave.jCheckBoxPostAccionSinCerrarHistorialCambioClave.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHistorialCambioClave.jCheckBoxPostAccionSinMensajeHistorialCambioClave.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHistorialCambioClave.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHistorialCambioClave.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHistorialCambioClave.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
				this.jInternalFrameDetalleFormHistorialCambioClave.jCheckBoxPostAccionNuevoHistorialCambioClave.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHistorialCambioClave.jCheckBoxPostAccionSinCerrarHistorialCambioClave.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHistorialCambioClave.jCheckBoxPostAccionSinMensajeHistorialCambioClave.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHistorialCambioClave.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHistorialCambioClave.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHistorialCambioClave.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHistorialCambioClave.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHistorialCambioClave.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHistorialCambioClave.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHistorialCambioClave.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHistorialCambioClave.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHistorialCambioClave.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHistorialCambioClave(Boolean esInicializar) throws Exception {
		try	{	
			if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialCambioClave(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHistorialCambioClave() throws Exception {
		try	{
			if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialCambioClave();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialCambioClave() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialCambioClave() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHistorialCambioClave.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHistorialCambioClave.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHistorialCambioClave.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHistorialCambioClave.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHistorialCambioClave.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHistorialCambioClave.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHistorialCambioClave.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHistorialCambioClave.addItem(reporte);
			}
			
			
			if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHistorialCambioClave.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHistorialCambioClave.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHistorialCambioClave.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHistorialCambioClave.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHistorialCambioClave.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHistorialCambioClave.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHistorialCambioClave.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHistorialCambioClave.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHistorialCambioClave.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialCambioClave();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialCambioClave() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
				this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
				this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialCambioClave.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
				
				if(this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialCambioClave.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHistorialCambioClave()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.getSelectedItem()!=null){this.id_usuarioBusquedaPorIdUsuarioPorFechaHora=((Usuario)this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.getSelectedItem()).getId();}
		this.fecha_horaBusquedaPorIdUsuarioPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHistorialCambioClave(Boolean esInicializar) throws Exception {				
		if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialCambioClave();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHistorialCambioClave() throws Exception {
		this.inicializarActualizarBindingTablaHistorialCambioClave(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHistorialCambioClave() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHistorialCambioClaveOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClaveOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHistorialCambioClave(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=historialcambioclaveLogic.getHistorialCambioClaves().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=historialcambioclaves.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHistorialCambioClave.setModel(new HistorialCambioClaveModel(this.historialcambioclaveLogic.getHistorialCambioClaves(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHistorialCambioClave.setModel(new HistorialCambioClaveModel(this.historialcambioclaves,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHistorialCambioClave!=null && this.jInternalFrameOrderByHistorialCambioClave.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHistorialCambioClave();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClave,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO,historialcambioclaveConstantesFunciones.resaltarSeleccionarHistorialCambioClave,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO,historialcambioclaveConstantesFunciones.resaltarSeleccionarHistorialCambioClave,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClave,HistorialCambioClaveConstantesFunciones.LABEL_ID));

		if(this.historialcambioclaveConstantesFunciones.mostraridHistorialCambioClave && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialCambioClaveConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialcambioclaveConstantesFunciones.resaltaridHistorialCambioClave,this.historialcambioclaveConstantesFunciones.activaridHistorialCambioClave,this,true,"idHistorialCambioClave","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialcambioclaveConstantesFunciones.resaltaridHistorialCambioClave,this.historialcambioclaveConstantesFunciones.activaridHistorialCambioClave,this,true,"idHistorialCambioClave","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClave,HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO));

		if(this.historialcambioclaveConstantesFunciones.mostrarid_usuarioHistorialCambioClave && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.historialcambioclaveConstantesFunciones.resaltarid_usuarioHistorialCambioClave,this,this.historialcambioclaveConstantesFunciones.activarid_usuarioHistorialCambioClave));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.historialcambioclaveConstantesFunciones.resaltarid_usuarioHistorialCambioClave,this,this.historialcambioclaveConstantesFunciones.activarid_usuarioHistorialCambioClave,false,"id_usuarioHistorialCambioClave","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClave,HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE));

		if(this.historialcambioclaveConstantesFunciones.mostrarnombreHistorialCambioClave && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialcambioclaveConstantesFunciones.resaltarnombreHistorialCambioClave,this.historialcambioclaveConstantesFunciones.activarnombreHistorialCambioClave,this,true,"nombreHistorialCambioClave","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialcambioclaveConstantesFunciones.resaltarnombreHistorialCambioClave,this.historialcambioclaveConstantesFunciones.activarnombreHistorialCambioClave,this,true,"nombreHistorialCambioClave","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClave,HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA));

		if(this.historialcambioclaveConstantesFunciones.mostrarfecha_horaHistorialCambioClave && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateTimeRenderer(this.historialcambioclaveConstantesFunciones.resaltarfecha_horaHistorialCambioClave,this.historialcambioclaveConstantesFunciones.activarfecha_horaHistorialCambioClave));
			tableColumn.setCellEditor(new DateTimeEditorRenderer(this.historialcambioclaveConstantesFunciones.resaltarfecha_horaHistorialCambioClave,this.historialcambioclaveConstantesFunciones.activarfecha_horaHistorialCambioClave));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClave,HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION));

		if(this.historialcambioclaveConstantesFunciones.mostrarobservacionHistorialCambioClave && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.historialcambioclaveConstantesFunciones.resaltarobservacionHistorialCambioClave,this.historialcambioclaveConstantesFunciones.activarobservacionHistorialCambioClave,this,true,"observacionHistorialCambioClave","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialcambioclaveConstantesFunciones.resaltarobservacionHistorialCambioClave,this.historialcambioclaveConstantesFunciones.activarobservacionHistorialCambioClave,this,true,"observacionHistorialCambioClave","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialCambioClavePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialcambioclaveSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialcambioclaveSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialCambioClave.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialcambioclaveSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialcambioclaveSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialCambioClave.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.historialcambioclaveSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.historialcambioclaveSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHistorialCambioClave.addColumn(tableColumn);
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
			
			this.jTableDatosHistorialCambioClave.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHistorialCambioClave.moveColumn(this.jTableDatosHistorialCambioClave.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHistorialCambioClave.moveColumn(this.jTableDatosHistorialCambioClave.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHistorialCambioClave.moveColumn(this.jTableDatosHistorialCambioClave.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHistorialCambioClave.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHistorialCambioClave.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHistorialCambioClave,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHistorialCambioClave.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHistorialCambioClave.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHistorialCambioClave.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHistorialCambioClave.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=historialcambioclaveLogic.getHistorialCambioClaves().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=historialcambioclaves.size()-1;
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
		//this.jTableDatosHistorialCambioClave.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHistorialCambioClave.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHistorialCambioClave();
			
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
				
				//this.isEsNuevoHistorialCambioClave=false;
					
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
				if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHistorialCambioClave==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialCambioClave.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialCambioClave.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.historialcambioclave.getsType().equals("DUPLICADO")
				   || this.historialcambioclave.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHistorialCambioClave=true;
				
				} else {
					this.isEsNuevoHistorialCambioClave=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
					if(this.historialcambioclave.getId()>=0 && !this.historialcambioclave.getIsNew()) {						
						this.isEsNuevoHistorialCambioClave=false;
						
					} else {
						this.isEsNuevoHistorialCambioClave=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHistorialCambioClave(esRelaciones);						
				
				this.seleccionarHistorialCambioClave(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.historialcambioclave.getId()<0) {
					this.isEsNuevoHistorialCambioClave=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHistorialCambioClave(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHistorialCambioClave(evt,rowIndex);
				}	
				
				if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion HistorialCambioClave: " + this.dDif); 
					}
				}								
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHistorialCambioClave(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.historialcambioclave)) {
					if(this.historialcambioclave.getId()>0) {
						this.historialcambioclave.setIsDeleted(true);
						
						this.historialcambioclavesEliminados.add(this.historialcambioclave);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialcambioclaveLogic.getHistorialCambioClaves().remove(this.historialcambioclave);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialcambioclaves.remove(this.historialcambioclave);				
					}
					
					
					((HistorialCambioClaveModel) this.jTableDatosHistorialCambioClave.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialCambioClave(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHistorialCambioClave(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHistorialCambioClave) {
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialCambioClave.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialCambioClave.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHistorialCambioClave(this.historialcambioclave);
				}
				
				//ARCHITECTURE
				try {
					

					//Usuario
					if(!this.historialcambioclaveConstantesFunciones.cargarid_usuarioHistorialCambioClave || this.historialcambioclaveConstantesFunciones.event_dependid_usuarioHistorialCambioClave) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.historialcambioclave.getid_usuario());
									//this.inicializarActualizarBindingHistorialCambioClave(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(historialcambioclave.getUsuario()!=null) {
							this.usuariosForeignKey.add(historialcambioclave.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.historialcambioclave.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHistorialCambioClave("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHistorialCambioClave(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialCambioClave() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialCambioClave(HistorialCambioClave historialcambioclave) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHistorialCambioClave(historialcambioclave,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialCambioClave(HistorialCambioClave historialcambioclave,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHistorialCambioClave(historialcambioclave);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHistorialCambioClave(historialcambioclave,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHistorialCambioClave(historialcambioclave);
	}
	
	public void setVariablesObjetoActualToFormularioHistorialCambioClave(HistorialCambioClave historialcambioclave) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.setText(historialcambioclave.getId().toString());
			this.jInternalFrameDetalleFormHistorialCambioClave.jTextFieldnombreHistorialCambioClave.setText(historialcambioclave.getnombre());
			this.jInternalFrameDetalleFormHistorialCambioClave.jDateChooserfecha_horaHistorialCambioClave.setDate(historialcambioclave.getfecha_hora());
			this.jInternalFrameDetalleFormHistorialCambioClave.jTextAreaobservacionHistorialCambioClave.setText(historialcambioclave.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,HistorialCambioClave historialcambioclaveLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,historialcambioclaveLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,HistorialCambioClave historialcambioclaveLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				historialcambioclaveLocal=this.historialcambioclave;
			} else {
				historialcambioclaveLocal=this.historialcambioclaveAnterior;
			}
		}
		
		if(this.permiteMantenimiento(historialcambioclaveLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHistorialCambioClave(historialcambioclaveLocal,true);
					
					if(historialcambioclaveSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(historialcambioclaveLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(historialcambioclaveLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHistorialCambioClave(HistorialCambioClave historialcambioclave,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialCambioClave(historialcambioclave,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(historialcambioclave);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialCambioClave(HistorialCambioClave historialcambioclave,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialCambioClave(historialcambioclave,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialCambioClave(HistorialCambioClave historialcambioclave,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.getText()==null || this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.getText()=="" || this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.getText()=="Id") {
				this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.setText("0");
			}

			if(conColumnasBase) {historialcambioclave.setId(Long.parseLong(this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialCambioClaveConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelIdHistorialCambioClave,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialcambioclave.setnombre(this.jInternalFrameDetalleFormHistorialCambioClave.jTextFieldnombreHistorialCambioClave.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelnombreHistorialCambioClave,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialcambioclave.setfecha_hora(new Timestamp(this.jInternalFrameDetalleFormHistorialCambioClave.jDateChooserfecha_horaHistorialCambioClave.getDate().getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelfecha_horaHistorialCambioClave,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialcambioclave.setobservacion(this.jInternalFrameDetalleFormHistorialCambioClave.jTextAreaobservacionHistorialCambioClave.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialCambioClave.jLabelobservacionHistorialCambioClave,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialCambioClave(HistorialCambioClave historialcambioclaveBean,HistorialCambioClave historialcambioclave,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHistorialCambioClave(HistorialCambioClave historialcambioclaveOrigen,HistorialCambioClave historialcambioclave,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialcambioclaveOrigen.getId()!=null && !historialcambioclaveOrigen.getId().equals(0L))) {historialcambioclave.setId(historialcambioclaveOrigen.getId());}}
			if(conDefault || (!conDefault && historialcambioclaveOrigen.getnombre()!=null && !historialcambioclaveOrigen.getnombre().equals(""))) {historialcambioclave.setnombre(historialcambioclaveOrigen.getnombre());}
			if(conDefault || (!conDefault && historialcambioclaveOrigen.getfecha_hora()!=null && !historialcambioclaveOrigen.getfecha_hora().equals(new Timestamp((new Date()).getTime())))) {historialcambioclave.setfecha_hora(historialcambioclaveOrigen.getfecha_hora());}
			if(conDefault || (!conDefault && historialcambioclaveOrigen.getobservacion()!=null && !historialcambioclaveOrigen.getobservacion().equals(""))) {historialcambioclave.setobservacion(historialcambioclaveOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialCambioClave(HistorialCambioClave historialcambioclave) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.setText(historialcambioclave.getId().toString());
			this.jInternalFrameDetalleFormHistorialCambioClave.jTextFieldnombreHistorialCambioClave.setText(historialcambioclave.getnombre());
			this.jInternalFrameDetalleFormHistorialCambioClave.jDateChooserfecha_horaHistorialCambioClave.setDate(historialcambioclave.getfecha_hora());
			this.jInternalFrameDetalleFormHistorialCambioClave.jTextAreaobservacionHistorialCambioClave.setText(historialcambioclave.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialCambioClave(HistorialCambioClaveBean historialcambioclaveBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.setText(historialcambioclaveBean.getId().toString());
			this.jInternalFrameDetalleFormHistorialCambioClave.jTextFieldnombreHistorialCambioClave.setText(historialcambioclaveBean.getnombre());
			this.jInternalFrameDetalleFormHistorialCambioClave.jDateChooserfecha_horaHistorialCambioClave.setDate(historialcambioclaveBean.getfecha_hora());
			this.jInternalFrameDetalleFormHistorialCambioClave.jTextAreaobservacionHistorialCambioClave.setText(historialcambioclaveBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHistorialCambioClave(HistorialCambioClaveParameterReturnGeneral historialcambioclaveReturnGeneral,HistorialCambioClaveBean historialcambioclaveBean,Boolean conDefault) throws Exception { 
		try {
			HistorialCambioClave historialcambioclaveLocal=new HistorialCambioClave();
			
			historialcambioclaveLocal=historialcambioclaveReturnGeneral.getHistorialCambioClave();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialcambioclaveLocal.getId()!=null && !historialcambioclaveLocal.getId().equals(0L))) {historialcambioclaveBean.setId(historialcambioclaveLocal.getId());}}
			if(conDefault || (!conDefault && historialcambioclaveLocal.getnombre()!=null && !historialcambioclaveLocal.getnombre().equals(""))) {historialcambioclaveBean.setnombre(historialcambioclaveLocal.getnombre());}
			if(conDefault || (!conDefault && historialcambioclaveLocal.getfecha_hora()!=null && !historialcambioclaveLocal.getfecha_hora().equals(new Timestamp((new Date()).getTime())))) {historialcambioclaveBean.setfecha_hora(historialcambioclaveLocal.getfecha_hora());}
			if(conDefault || (!conDefault && historialcambioclaveLocal.getobservacion()!=null && !historialcambioclaveLocal.getobservacion().equals(""))) {historialcambioclaveBean.setobservacion(historialcambioclaveLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHistorialCambioClaveGenerico(Long idHistorialCambioClaveSeleccionado,JComboBox jComboBoxHistorialCambioClave,List<HistorialCambioClave> historialcambioclavesLocal)throws Exception {
		try {
			HistorialCambioClave  historialcambioclaveTemp=null;

			for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesLocal) {
				if(historialcambioclaveAux.getId()!=null && historialcambioclaveAux.getId().equals(idHistorialCambioClaveSeleccionado)) {
					historialcambioclaveTemp=historialcambioclaveAux;
					break;
				}
			}

			jComboBoxHistorialCambioClave.setSelectedItem(historialcambioclaveTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHistorialCambioClaveGenerico(JComboBox jComboBoxHistorialCambioClave,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialCambioClave.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHistorialCambioClave.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialCambioClave.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHistorialCambioClave.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialcambioclave=(HistorialCambioClave) historialcambioclaveLogic.getHistorialCambioClaves().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialcambioclave =(HistorialCambioClave) historialcambioclaves.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!historialcambioclave.getIsNew() && !historialcambioclave.getIsChanged() && !historialcambioclave.getIsDeleted()) {
				sDescripcion=historialcambioclave.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=historialcambioclave.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		HistorialCambioClave historialcambioclaveRow=new HistorialCambioClave();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialcambioclaveRow=(HistorialCambioClave) historialcambioclaveLogic.getHistorialCambioClaves().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialcambioclaveRow=(HistorialCambioClave) historialcambioclaves.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHistorialCambioClave(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave));			
			this.jButtonDuplicarHistorialCambioClave.setVisible((this.isVisibilidadCeldaDuplicarHistorialCambioClave && this.isPermisoDuplicarHistorialCambioClave));			
			this.jButtonCopiarHistorialCambioClave.setVisible((this.isVisibilidadCeldaCopiarHistorialCambioClave && this.isPermisoCopiarHistorialCambioClave));
			this.jButtonVerFormHistorialCambioClave.setVisible((this.isVisibilidadCeldaVerFormHistorialCambioClave && this.isPermisoVerFormHistorialCambioClave));
			
			this.jButtonAbrirOrderByHistorialCambioClave.setVisible((this.isVisibilidadCeldaOrdenHistorialCambioClave && this.isPermisoOrdenHistorialCambioClave));			
			
			this.jButtonNuevoRelacionesHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave));			
			this.jButtonNuevoGuardarCambiosHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarHistorialCambioClave.setVisible((this.isVisibilidadCeldaModificarHistorialCambioClave && this.isPermisoActualizarHistorialCambioClave));	
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarHistorialCambioClave.setVisible((this.isVisibilidadCeldaActualizarHistorialCambioClave && this.isPermisoActualizarHistorialCambioClave));	
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarHistorialCambioClave.setVisible((this.isVisibilidadCeldaEliminarHistorialCambioClave && this.isPermisoEliminarHistorialCambioClave));
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarHistorialCambioClave.setVisible(this.isVisibilidadCeldaCancelarHistorialCambioClave);							
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosHistorialCambioClave.setVisible((this.isVisibilidadCeldaGuardarHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));			
			
			}
						
			this.jButtonGuardarCambiosTablaHistorialCambioClave.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave));						
			this.jButtonDuplicarToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaDuplicarHistorialCambioClave && this.isPermisoDuplicarHistorialCambioClave));						
			this.jButtonCopiarToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaCopiarHistorialCambioClave && this.isPermisoCopiarHistorialCambioClave));			
			this.jButtonVerFormToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaVerFormHistorialCambioClave && this.isPermisoVerFormHistorialCambioClave));			
			this.jButtonAbrirOrderByToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaOrdenHistorialCambioClave && this.isPermisoOrdenHistorialCambioClave));
			this.jButtonNuevoRelacionesToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave));			
			this.jButtonNuevoGuardarCambiosToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));			
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaModificarHistorialCambioClave && this.isPermisoActualizarHistorialCambioClave));	
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaActualizarHistorialCambioClave  && this.isPermisoActualizarHistorialCambioClave));	
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaEliminarHistorialCambioClave && this.isPermisoEliminarHistorialCambioClave));
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarToolBarHistorialCambioClave.setVisible(this.isVisibilidadCeldaCancelarHistorialCambioClave);				
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaGuardarHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHistorialCambioClave.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave));			
			this.jMenuItemDuplicarHistorialCambioClave.setVisible((this.isVisibilidadCeldaDuplicarHistorialCambioClave && this.isPermisoDuplicarHistorialCambioClave));			
			this.jMenuItemCopiarHistorialCambioClave.setVisible((this.isVisibilidadCeldaCopiarHistorialCambioClave && this.isPermisoCopiarHistorialCambioClave));			
			this.jMenuItemVerFormHistorialCambioClave.setVisible((this.isVisibilidadCeldaVerFormHistorialCambioClave && this.isPermisoVerFormHistorialCambioClave));			
			this.jMenuItemAbrirOrderByHistorialCambioClave.setVisible((this.isVisibilidadCeldaOrdenHistorialCambioClave && this.isPermisoOrdenHistorialCambioClave));			
			//this.jMenuItemMostrarOcultarHistorialCambioClave.setVisible((this.isVisibilidadCeldaOrdenHistorialCambioClave && this.isPermisoOrdenHistorialCambioClave));
			this.jMenuItemDetalleAbrirOrderByHistorialCambioClave.setVisible((this.isVisibilidadCeldaOrdenHistorialCambioClave && this.isPermisoOrdenHistorialCambioClave));			
			//this.jMenuItemDetalleMostrarOcultarHistorialCambioClave.setVisible((this.isVisibilidadCeldaOrdenHistorialCambioClave && this.isPermisoOrdenHistorialCambioClave));			
			this.jMenuItemNuevoRelacionesHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave));			
			this.jMenuItemNuevoGuardarCambiosHistorialCambioClave.setVisible((this.isVisibilidadCeldaNuevoHistorialCambioClave && this.isPermisoNuevoHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));									
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemModificarHistorialCambioClave.setVisible((this.isVisibilidadCeldaModificarHistorialCambioClave && this.isPermisoActualizarHistorialCambioClave));	
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemActualizarHistorialCambioClave.setVisible((this.isVisibilidadCeldaActualizarHistorialCambioClave && this.isPermisoActualizarHistorialCambioClave));	
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemEliminarHistorialCambioClave.setVisible((this.isVisibilidadCeldaEliminarHistorialCambioClave && this.isPermisoEliminarHistorialCambioClave));
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemCancelarHistorialCambioClave.setVisible(this.isVisibilidadCeldaCancelarHistorialCambioClave);				
			}
			
			this.jMenuItemGuardarCambiosHistorialCambioClave.setVisible((this.isVisibilidadCeldaGuardarHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));						
			this.jMenuItemGuardarCambiosTablaHistorialCambioClave.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHistorialCambioClave=this.jButtonNuevoHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaDuplicarHistorialCambioClave=this.jButtonDuplicarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaCopiarHistorialCambioClave=this.jButtonCopiarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaVerFormHistorialCambioClave=this.jButtonVerFormHistorialCambioClave.isVisible();
			
			this.isVisibilidadCeldaOrdenHistorialCambioClave=this.jButtonAbrirOrderByHistorialCambioClave.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=this.jButtonNuevoRelacionesHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaModificarHistorialCambioClave=this.jButtonModificarHistorialCambioClave.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			this.isVisibilidadCeldaActualizarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaEliminarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaCancelarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaGuardarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosHistorialCambioClave.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=this.jButtonGuardarCambiosTablaHistorialCambioClave.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHistorialCambioClave=this.jButtonNuevoToolBarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=this.jButtonNuevoRelacionesToolBarHistorialCambioClave.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			this.isVisibilidadCeldaModificarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarToolBarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaActualizarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarToolBarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaEliminarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarToolBarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaCancelarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarToolBarHistorialCambioClave.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialCambioClave=this.jButtonGuardarCambiosToolBarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=this.jButtonGuardarCambiosTablaToolBarHistorialCambioClave.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHistorialCambioClave=this.jMenuItemNuevoHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=this.jMenuItemNuevoRelacionesHistorialCambioClave.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			this.isVisibilidadCeldaModificarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemModificarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaActualizarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemActualizarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaEliminarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemEliminarHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaCancelarHistorialCambioClave=this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemCancelarHistorialCambioClave.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialCambioClave=this.jMenuItemGuardarCambiosHistorialCambioClave.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=this.jMenuItemGuardarCambiosTablaHistorialCambioClave.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHistorialCambioClave(Boolean esInicializar) {
		if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {			
			if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
				//if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialCambioClave();
			}
			
			this.inicializarActualizarBindingBotonesManualHistorialCambioClave(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHistorialCambioClave() {
		this.jButtonNuevoHistorialCambioClave.setVisible(this.isPermisoNuevoHistorialCambioClave);			
		this.jButtonDuplicarHistorialCambioClave.setVisible(this.isPermisoDuplicarHistorialCambioClave);			
		this.jButtonCopiarHistorialCambioClave.setVisible(this.isPermisoCopiarHistorialCambioClave);			
		this.jButtonVerFormHistorialCambioClave.setVisible(this.isPermisoVerFormHistorialCambioClave);			
		
		this.jButtonAbrirOrderByHistorialCambioClave.setVisible(this.isPermisoOrdenHistorialCambioClave);					
		
		this.jButtonNuevoRelacionesHistorialCambioClave.setVisible(this.isPermisoNuevoHistorialCambioClave);			
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarHistorialCambioClave.setVisible(this.isPermisoActualizarHistorialCambioClave);	
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarHistorialCambioClave.setVisible(this.isPermisoActualizarHistorialCambioClave);	
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarHistorialCambioClave.setVisible(this.isPermisoEliminarHistorialCambioClave);
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarHistorialCambioClave.setVisible(this.isVisibilidadCeldaCancelarHistorialCambioClave);						
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosHistorialCambioClave.setVisible(this.isPermisoGuardarCambiosHistorialCambioClave);							
		}
		
		this.jButtonGuardarCambiosTablaHistorialCambioClave.setVisible(this.isPermisoActualizarHistorialCambioClave);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialCambioClave() {
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarHistorialCambioClave.setVisible(this.isPermisoActualizarHistorialCambioClave);	
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarHistorialCambioClave.setVisible(this.isPermisoActualizarHistorialCambioClave);	
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarHistorialCambioClave.setVisible(this.isPermisoEliminarHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarHistorialCambioClave.setVisible(this.isVisibilidadCeldaCancelarHistorialCambioClave);							
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosHistorialCambioClave.setVisible((this.isVisibilidadCeldaGuardarHistorialCambioClave && this.isPermisoGuardarCambiosHistorialCambioClave));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHistorialCambioClave() {
		if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHistorialCambioClave();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHistorialCambioClave() {
	}
	
	public void jTableDatosHistorialCambioClaveListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHistorialCambioClave(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHistorialCambioClaveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.gethistorialcambioclave(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialcambioclave==null) {
						this.historialcambioclave = new HistorialCambioClave();
					}

					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
				}

				if(this.historialcambioclave.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.historialcambioclave.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialCambioClave(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioHistorialCambioClaveUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebHistorialCambioClave(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialCambioClave.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialCambioClave.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.gethistorialcambioclave(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.historialcambioclaveLogic.getConnexion());

				if(this.historialcambioclave.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.historialcambioclave.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialCambioClave=(TitledBorder)this.jScrollPanelDatosHistorialCambioClave.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderHistorialCambioClave.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioHistorialCambioClaveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.gethistorialcambioclave(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialcambioclave==null) {
						this.historialcambioclave = new HistorialCambioClave();
					}

					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
				}

				if(this.historialcambioclave.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.historialcambioclave.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialCambioClave(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreHistorialCambioClaveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.gethistorialcambioclave(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialcambioclave==null) {
						this.historialcambioclave = new HistorialCambioClave();
					}

					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
				}

				if(this.historialcambioclave.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.historialcambioclave.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialCambioClave(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_horaHistorialCambioClaveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.gethistorialcambioclave(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialcambioclave==null) {
						this.historialcambioclave = new HistorialCambioClave();
					}

					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
				}

				if(this.historialcambioclave.getfecha_hora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hora = "+this.historialcambioclave.getfecha_hora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialCambioClave(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionHistorialCambioClaveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.gethistorialcambioclave(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialcambioclave==null) {
						this.historialcambioclave = new HistorialCambioClave();
					}

					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);
				}

				if(this.historialcambioclave.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.historialcambioclave.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialCambioClave(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialCambioClave(false,false);

			this.getHistorialCambioClavesBusquedaPorIdUsuarioPorFechaHora();

			this.inicializarActualizarBindingHistorialCambioClave(false);

			//if(HistorialCambioClaveBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialCambioClave(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioHistorialCambioClaveActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialCambioClave(false,false);

			this.getHistorialCambioClavesFK_IdUsuario();

			this.inicializarActualizarBindingHistorialCambioClave(false);

			//if(HistorialCambioClaveBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialCambioClave(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialcambioclaveLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHistorialCambioClave() {
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
			this.jInternalFrameDetalleFormHistorialCambioClave.setVisible(false);	    			
			this.jInternalFrameDetalleFormHistorialCambioClave.dispose();
			this.jInternalFrameDetalleFormHistorialCambioClave=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
			this.jInternalFrameReporteDinamicoHistorialCambioClave.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHistorialCambioClave.dispose();
			this.jInternalFrameReporteDinamicoHistorialCambioClave=null;
		}
		
		if(this.jInternalFrameImportacionHistorialCambioClave!=null) {
			this.jInternalFrameImportacionHistorialCambioClave.setVisible(false);	    			
			this.jInternalFrameImportacionHistorialCambioClave.dispose();
			this.jInternalFrameImportacionHistorialCambioClave=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHistorialCambioClave();
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
			
			if(sTipo.equals("NuevoHistorialCambioClave")) {
				jButtonNuevoHistorialCambioClaveActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHistorialCambioClave")) {
				jButtonDuplicarHistorialCambioClaveActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHistorialCambioClave")) {
				jButtonCopiarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("VerFormHistorialCambioClave")) {
				jButtonVerFormHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHistorialCambioClave")) {
				jButtonNuevoHistorialCambioClaveActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHistorialCambioClave")) {
				jButtonDuplicarHistorialCambioClaveActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHistorialCambioClave")) {
				jButtonNuevoHistorialCambioClaveActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHistorialCambioClave")) {
				jButtonDuplicarHistorialCambioClaveActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHistorialCambioClave")) {
				jButtonNuevoHistorialCambioClaveActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHistorialCambioClave")) {
				jButtonNuevoHistorialCambioClaveActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHistorialCambioClave")) {
				jButtonNuevoHistorialCambioClaveActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHistorialCambioClave")) {
				jButtonModificarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHistorialCambioClave")) {
				jButtonModificarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHistorialCambioClave")) {
				jButtonModificarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHistorialCambioClave")) {
				jButtonActualizarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHistorialCambioClave")) {
				jButtonActualizarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHistorialCambioClave")) {
				jButtonActualizarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("EliminarHistorialCambioClave")) {
				jButtonEliminarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHistorialCambioClave")) {
				jButtonEliminarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHistorialCambioClave")) {
				jButtonEliminarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("CancelarHistorialCambioClave")) {
				jButtonCancelarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHistorialCambioClave")) {
				jButtonCancelarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHistorialCambioClave")) {
				jButtonCancelarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("CerrarHistorialCambioClave")) {
				jButtonCerrarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHistorialCambioClave")) {
				jButtonCerrarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHistorialCambioClave")) {
				jButtonCerrarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHistorialCambioClave")) {
				jButtonMostrarOcultarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHistorialCambioClave")) {
				jButtonCancelarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHistorialCambioClave")) {
				jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHistorialCambioClave")) {
				jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHistorialCambioClave")) {
				jButtonCopiarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHistorialCambioClave")) {
				jButtonVerFormHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHistorialCambioClave")) {
				jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHistorialCambioClave")) {
				jButtonCopiarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHistorialCambioClave")) {
				jButtonVerFormHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHistorialCambioClave")) {
				jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHistorialCambioClave")) {
				jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHistorialCambioClave")) {
				jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHistorialCambioClave")) {
				jButtonRecargarInformacionHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHistorialCambioClave")) {
				jButtonRecargarInformacionHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHistorialCambioClave")) {
				jButtonRecargarInformacionHistorialCambioClaveActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHistorialCambioClave")) {
				jButtonAnterioresHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHistorialCambioClave")) {
				jButtonAnterioresHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHistorialCambioClave")) {
				jButtonAnterioresHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHistorialCambioClave")) {
				jButtonSiguientesHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHistorialCambioClave")) {
				jButtonSiguientesHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHistorialCambioClave")) {
				jButtonSiguientesHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHistorialCambioClave") || sTipo.equals("MenuItemDetalleAbrirOrderByHistorialCambioClave")) {
				jButtonAbrirOrderByHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHistorialCambioClave") || sTipo.equals("MenuItemDetalleMostrarOcultarHistorialCambioClave")) {
				jButtonMostrarOcultarHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialCambioClave")) {
				jButtonNuevoGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHistorialCambioClave")) {
				jButtonNuevoGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHistorialCambioClave")) {
				jButtonNuevoGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHistorialCambioClave")) {
				jButtonCerrarReporteDinamicoHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHistorialCambioClave")) {
				jButtonGenerarReporteDinamicoHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHistorialCambioClave")) {
				
				jButtonGenerarExcelReporteDinamicoHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHistorialCambioClave")) {
				jButtonCerrarImportacionHistorialCambioClaveActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHistorialCambioClave")) {
				
				jButtonGenerarImportacionHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHistorialCambioClave")) {
				
				jButtonAbrirImportacionHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHistorialCambioClave")) {
				jComboBoxTiposAccionesHistorialCambioClaveActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHistorialCambioClave")) {
				jComboBoxTiposRelacionesHistorialCambioClaveActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHistorialCambioClave")) {
				jComboBoxTiposAccionesHistorialCambioClaveActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHistorialCambioClave")) {
				
				jComboBoxTiposSeleccionarHistorialCambioClaveActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHistorialCambioClave")) {
				jTextFieldValorCampoGeneralHistorialCambioClaveActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHistorialCambioClave")) {
				jButtonAbrirOrderByHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHistorialCambioClave")) {
				jButtonAbrirOrderByHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHistorialCambioClave")) {
				jButtonCerrarOrderByHistorialCambioClaveActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialCambioClaveBusqueda")) {
				this.jButtonidHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioHistorialCambioClaveUpdate")) {
				this.jButtonid_usuarioHistorialCambioClaveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioHistorialCambioClaveBusqueda")) {
				this.jButtonid_usuarioHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreHistorialCambioClaveBusqueda")) {
				this.jButtonnombreHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_horaHistorialCambioClaveBusqueda")) {
				this.jButtonfecha_horaHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionHistorialCambioClaveBusqueda")) {
				this.jButtonobservacionHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave")) {
				this.jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClaveActionPerformed(evt);
			}
			
			;
			
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHistorialCambioClave();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialCambioClaveActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				


				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			HistorialCambioClave historialcambioclaveLocal=null;
			
			if(!this.getEsControlTabla()) {
				historialcambioclaveLocal=this.historialcambioclave;
			} else {
				historialcambioclaveLocal=this.historialcambioclaveAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
							
				
				


				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
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
			
			


			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialCambioClaveActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
								
						
				


				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
								
				
				


				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
							
				
				


				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialCambioClaveActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
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
			
			


			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
								
				
				


				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialCambioClaveActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHistorialCambioClave")) {
					jCheckBoxSeleccionarTodosHistorialCambioClaveItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHistorialCambioClave")) {
					jCheckBoxSeleccionadosHistorialCambioClaveItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHistorialCambioClave")) {
					
				}
				
				


				
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
												
				
				


				
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialCambioClaveActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialCambioClaveActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
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
			
			


			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialCambioClaveActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialcambioclave);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialcambioclave);
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
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
				
				


				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialCambioClave.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialCambioClave.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialCambioClaveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialcambioclaveAnterior =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHistorialCambioClave")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHistorialCambioClaveListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHistorialCambioClave.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.historialcambioclave =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.historialcambioclave);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHistorialCambioClave")) {
				
				}
				
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHistorialCambioClave")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHistorialCambioClave.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHistorialCambioClave")) {
			
			}
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHistorialCambioClave();
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
			if(sTipo.equals("NuevoHistorialCambioClave")) {
				jButtonNuevoHistorialCambioClaveActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHistorialCambioClave")) {
				jButtonDuplicarHistorialCambioClaveActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHistorialCambioClave")) {
				jButtonCopiarHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHistorialCambioClave")) {
				jButtonVerFormHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHistorialCambioClave")) {
				jButtonNuevoHistorialCambioClaveActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHistorialCambioClave")) {
				jButtonModificarHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHistorialCambioClave")) {
				jButtonActualizarHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHistorialCambioClave")) {
				jButtonEliminarHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHistorialCambioClave")) {
				jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHistorialCambioClave")) {
				jButtonCancelarHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHistorialCambioClave")) {
				jButtonCerrarHistorialCambioClaveActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHistorialCambioClave")) {
				jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialCambioClave")) {
				jButtonNuevoGuardarCambiosHistorialCambioClaveActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHistorialCambioClave")) {
				jButtonAbrirOrderByHistorialCambioClaveActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHistorialCambioClave")) {
				jButtonRecargarInformacionHistorialCambioClaveActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHistorialCambioClave")) {
				jButtonAnterioresHistorialCambioClaveActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHistorialCambioClave")) {
				jButtonSiguientesHistorialCambioClaveActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialCambioClaveBusqueda")) {
				this.jButtonidHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioHistorialCambioClaveUpdate")) {
				this.jButtonid_usuarioHistorialCambioClaveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioHistorialCambioClaveBusqueda")) {
				this.jButtonid_usuarioHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreHistorialCambioClaveBusqueda")) {
				this.jButtonnombreHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_horaHistorialCambioClaveBusqueda")) {
				this.jButtonfecha_horaHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionHistorialCambioClaveBusqueda")) {
				this.jButtonobservacionHistorialCambioClaveBusquedaActionPerformed(evt);
			}
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHistorialCambioClave();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHistorialCambioClave")) {
				closingInternalFrameHistorialCambioClave();
				
			} else if(sTipo.equals("jButtonCancelarHistorialCambioClave")) {
				JInternalFrameBase jInternalFrameDetalleFormHistorialCambioClave = (JInternalFrameBase)evt.getSource();
	            	
	            HistorialCambioClaveBeanSwingJInternalFrame jInternalFrameParent=(HistorialCambioClaveBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialCambioClave.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHistorialCambioClaveActionPerformed(null);
			}
			
			HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialcambioclave,new Object(),this.historialcambioclaveParameterGeneral,this.historialcambioclaveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHistorialCambioClave(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHistorialCambioClave(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHistorialCambioClave(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.historialcambioclave)) {
			if(!esControlTabla) {
				if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);			
				}
				
				if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHistorialCambioClave(this.historialcambioclave,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialcambioclaveReturnGeneral=historialcambioclaveLogic.procesarEventosHistorialCambioClavesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialcambioclaveLogic.getHistorialCambioClaves(),this.historialcambioclave,this.historialcambioclaveParameterGeneral,this.isEsNuevoHistorialCambioClave,classes);//this.historialcambioclaveLogic.getHistorialCambioClave()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHistorialCambioClave(this.historialcambioclaveReturnGeneral,this.historialcambioclaveBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHistorialCambioClave(classes,this.historialcambioclaveReturnGeneral,this.historialcambioclaveBean,false);
					}
						
					if(this.historialcambioclaveReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHistorialCambioClave(this.historialcambioclaveReturnGeneral.getHistorialCambioClave());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHistorialCambioClave(this.historialcambioclaveReturnGeneral.getHistorialCambioClave());	
					}
						
					if(this.historialcambioclaveReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHistorialCambioClave(this.historialcambioclaveReturnGeneral.getHistorialCambioClave(),classes);//this.historialcambioclaveBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHistorialCambioClave(this.historialcambioclave,classes);//this.historialcambioclaveBean);									
				}
			
				if(HistorialCambioClaveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHistorialCambioClave(this.historialcambioclave,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialCambioClave(this.historialcambioclave);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.historialcambioclaveAnterior!=null) {
						this.historialcambioclave=this.historialcambioclaveAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialcambioclaveReturnGeneral=historialcambioclaveLogic.procesarEventosHistorialCambioClavesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialcambioclaveLogic.getHistorialCambioClaves(),this.historialcambioclave,this.historialcambioclaveParameterGeneral,this.isEsNuevoHistorialCambioClave,classes);//this.historialcambioclaveLogic.getHistorialCambioClave()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialcambioclaveSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.historialcambioclaveReturnGeneral.getHistorialCambioClave(),historialcambioclaveLogic.getHistorialCambioClaves());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.historialcambioclaveReturnGeneral.getHistorialCambioClave(),this.historialcambioclaves);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHistorialCambioClave.repaint();
				
				//((AbstractTableModel) this.jTableDatosHistorialCambioClave.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHistorialCambioClave();
			}
		}
	}
	
	public void actualizarVisualTableDatosHistorialCambioClave() throws Exception {
		
		HistorialCambioClaveModel historialcambioclaveModel=(HistorialCambioClaveModel)this.jTableDatosHistorialCambioClave.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialcambioclaveModel.historialcambioclaves=this.historialcambioclaveLogic.getHistorialCambioClaves();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			historialcambioclaveModel.historialcambioclaves=this.historialcambioclaves;
		}
		
		
		((HistorialCambioClaveModel) this.jTableDatosHistorialCambioClave.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHistorialCambioClave() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gethistorialcambioclaveAnterior(),this.historialcambioclaveLogic.getHistorialCambioClaves());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gethistorialcambioclaveAnterior(),this.historialcambioclaves);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHistorialCambioClave();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHistorialCambioClave(HistorialCambioClave historialcambioclave,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
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
										
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialcambioclave,new Object(),generalEntityParameterGeneral,this.historialcambioclaveReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HistorialCambioClaveConstantesFunciones.getClassesRelationshipsOfHistorialCambioClave(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HistorialCambioClaveConstantesFunciones.getClassesRelationshipsFromStringsOfHistorialCambioClave(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHistorialCambioClave(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HistorialCambioClaveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialcambioclave,new Object(),generalEntityParameterGeneral,this.historialcambioclaveReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHistorialCambioClave(HistorialCambioClaveBean historialcambioclaveBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHistorialCambioClave(ArrayList<Classe> classes,HistorialCambioClaveReturnGeneral historialcambioclaveReturnGeneral,HistorialCambioClaveBean historialcambioclaveBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHistorialCambioClave(HistorialCambioClave historialcambioclave,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.historialcambioclave)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHistorialCambioClave = new HistorialCambioClaveDetalleFormJInternalFrame(jDesktopPane,this.historialcambioclaveSessionBean.getConGuardarRelaciones(),this.historialcambioclaveSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.setVisible(false);
		this.jInternalFrameDetalleFormHistorialCambioClave.setSelected(false);						
		
		this.jInternalFrameDetalleFormHistorialCambioClave.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHistorialCambioClave.historialcambioclaveLogic=this.historialcambioclaveLogic;
		
		this.cargarCombosFrameForeignKeyHistorialCambioClave("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialCambioClave();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialCambioClave();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHistorialCambioClave("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHistorialCambioClave();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHistorialCambioClave.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialCambioClave"));
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"ModificarHistorialCambioClave"));

		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarToolBarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialCambioClave"));
					
		this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemModificarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialCambioClave"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"ActualizarHistorialCambioClave"));
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarToolBarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialCambioClave"));
						
		this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemActualizarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialCambioClave"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"EliminarHistorialCambioClave"));
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialCambioClave"));
								
		this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemEliminarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialCambioClave"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"CancelarHistorialCambioClave"));
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialCambioClave"));
					
		this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemCancelarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialCambioClave"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemDetalleCerrarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialCambioClave"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialCambioClave"));
		
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialCambioClave"));
		
		
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialCambioClave"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonidHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialCambioClaveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonid_usuarioHistorialCambioClaveUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioHistorialCambioClaveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonid_usuarioHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonnombreHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"nombreHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonfecha_horaHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"fecha_horaHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonobservacionHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"observacionHistorialCambioClaveBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialCambioClave"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHistorialCambioClave"));
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialCambioClave"));
		}
		
		this.jTableDatosHistorialCambioClave.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHistorialCambioClave"));
		
		this.jTableDatosHistorialCambioClave.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHistorialCambioClave"));
		
		this.jButtonNuevoHistorialCambioClave.addActionListener(new ButtonActionListener(this,"NuevoHistorialCambioClave"));
		
		this.jButtonDuplicarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"DuplicarHistorialCambioClave"));
		
		this.jButtonCopiarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"CopiarHistorialCambioClave"));
		
		this.jButtonVerFormHistorialCambioClave.addActionListener(new ButtonActionListener(this,"VerFormHistorialCambioClave"));
		
		
		this.jButtonNuevoToolBarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"NuevoToolBarHistorialCambioClave"));
			
		this.jButtonDuplicarToolBarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHistorialCambioClave"));
			
		this.jMenuItemNuevoHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHistorialCambioClave"));
			
		this.jMenuItemDuplicarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHistorialCambioClave"));		
		
		
		this.jButtonNuevoRelacionesHistorialCambioClave.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHistorialCambioClave"));
		
		
		this.jButtonNuevoRelacionesToolBarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHistorialCambioClave"));
			
		this.jMenuItemNuevoRelacionesHistorialCambioClave.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHistorialCambioClave"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"ModificarHistorialCambioClave"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonModificarToolBarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialCambioClave"));
			
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemModificarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialCambioClave"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"ActualizarHistorialCambioClave"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonActualizarToolBarHistorialCambioClave.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialCambioClave"));
				
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemActualizarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialCambioClave"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"EliminarHistorialCambioClave"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonEliminarToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialCambioClave"));
						
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemEliminarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialCambioClave"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"CancelarHistorialCambioClave"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonCancelarToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialCambioClave"));
			
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemCancelarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialCambioClave"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHistorialCambioClave"));		
		
		
		this.jButtonCerrarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"CerrarHistorialCambioClave"));
		
		
		this.jButtonCerrarToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"CerrarToolBarHistorialCambioClave"));
			
		this.jMenuItemCerrarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHistorialCambioClave"));
			
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jMenuItemDetalleCerrarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialCambioClave"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GuardarCambiosHistorialCambioClave"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialCambioClave"));
		}
		
		this.jButtonCopiarToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"CopiarToolBarHistorialCambioClave"));
			
		this.jButtonVerFormToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"VerFormToolBarHistorialCambioClave"));
		
		this.jMenuItemGuardarCambiosHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHistorialCambioClave"));
			
		this.jMenuItemCopiarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHistorialCambioClave"));		
		
		this.jMenuItemVerFormHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHistorialCambioClave"));		
		
		
		this.jButtonGuardarCambiosTablaHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialCambioClave"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHistorialCambioClave"));
			
		this.jMenuItemGuardarCambiosTablaHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialCambioClave"));		
		
		
		
		this.jButtonRecargarInformacionHistorialCambioClave.addActionListener (new ButtonActionListener(this,"RecargarInformacionHistorialCambioClave"));
					
		this.jButtonRecargarInformacionToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHistorialCambioClave"));
		
		this.jMenuItemRecargarInformacionHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHistorialCambioClave"));		
		
		
		
		this.jButtonAnterioresHistorialCambioClave.addActionListener (new ButtonActionListener(this,"AnterioresHistorialCambioClave"));
		
		
		this.jButtonAnterioresToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHistorialCambioClave"));
		
		this.jMenuItemAnterioresHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHistorialCambioClave"));		
		
		
		this.jButtonSiguientesHistorialCambioClave.addActionListener (new ButtonActionListener(this,"SiguientesHistorialCambioClave"));
		
		
		this.jButtonSiguientesToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHistorialCambioClave"));
			
		this.jMenuItemSiguientesHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHistorialCambioClave"));
			
		this.jMenuItemAbrirOrderByHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHistorialCambioClave"));
			
		this.jMenuItemMostrarOcultarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHistorialCambioClave"));
			
		this.jMenuItemDetalleAbrirOrderByHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHistorialCambioClave"));
			
		this.jMenuItemDetalleMostarOcultarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHistorialCambioClave"));		
		
		
		this.jButtonNuevoGuardarCambiosHistorialCambioClave.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHistorialCambioClave"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHistorialCambioClave"));
			
		this.jMenuItemNuevoGuardarCambiosHistorialCambioClave.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHistorialCambioClave"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHistorialCambioClave.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHistorialCambioClave"));

		this.jCheckBoxSeleccionadosHistorialCambioClave.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHistorialCambioClave"));
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialCambioClave"));
		}
		
		
		this.jComboBoxTiposRelacionesHistorialCambioClave.addActionListener (new ButtonActionListener(this,"TiposRelacionesHistorialCambioClave"));
			
		this.jComboBoxTiposAccionesHistorialCambioClave.addActionListener (new ButtonActionListener(this,"TiposAccionesHistorialCambioClave"));
					
		this.jComboBoxTiposSeleccionarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHistorialCambioClave"));
			
		this.jTextFieldValorCampoGeneralHistorialCambioClave.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHistorialCambioClave"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonidHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialCambioClaveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonid_usuarioHistorialCambioClaveUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioHistorialCambioClaveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonid_usuarioHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonnombreHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"nombreHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonfecha_horaHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"fecha_horaHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonobservacionHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"observacionHistorialCambioClaveBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.addActionListener(new ButtonActionListener(this,"BusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHistorialCambioClave!=null) {
				this.jInternalFrameReporteDinamicoHistorialCambioClave.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialCambioClave"));
				this.jInternalFrameReporteDinamicoHistorialCambioClave.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialCambioClave"));
				this.jInternalFrameReporteDinamicoHistorialCambioClave.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialCambioClave"));
			}
			
			//this.jButtonCerrarReporteDinamicoHistorialCambioClave.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialCambioClave"));				
			//this.jButtonGenerarReporteDinamicoHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialCambioClave"));
			//this.jButtonGenerarExcelReporteDinamicoHistorialCambioClave.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialCambioClave"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHistorialCambioClave!=null) {
				this.jInternalFrameImportacionHistorialCambioClave.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialCambioClave"));
				this.jInternalFrameImportacionHistorialCambioClave.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialCambioClave"));
				this.jInternalFrameImportacionHistorialCambioClave.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialCambioClave"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHistorialCambioClave.addActionListener (new ButtonActionListener(this,"AbrirOrderByHistorialCambioClave"));
			
			this.jButtonAbrirOrderByToolBarHistorialCambioClave.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHistorialCambioClave"));			
			
			if(this.jInternalFrameOrderByHistorialCambioClave!=null) {
				this.jInternalFrameOrderByHistorialCambioClave.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialCambioClave"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialCambioClave.jTabbedPaneRelacionesHistorialCambioClave.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialCambioClave"));
		
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
            		closingInternalFrameHistorialCambioClave();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHistorialCambioClave.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHistorialCambioClave = (JInternalFrameBase)event.getSource();
	            	
	            HistorialCambioClaveBeanSwingJInternalFrame jInternalFrameParent=(HistorialCambioClaveBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialCambioClave.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHistorialCambioClaveActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHistorialCambioClave.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHistorialCambioClaveListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHistorialCambioClave.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHistorialCambioClave.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialCambioClaveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialCambioClaveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialCambioClaveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHistorialCambioClave";
		inputMap = this.jButtonNuevoHistorialCambioClave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHistorialCambioClave.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialCambioClaveActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialCambioClaveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialCambioClaveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialCambioClaveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHistorialCambioClave";
		inputMap = this.jButtonNuevoRelacionesHistorialCambioClave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHistorialCambioClave.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialCambioClaveActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHistorialCambioClave";
		inputMap = this.jButtonModificarHistorialCambioClave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHistorialCambioClave.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHistorialCambioClaveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHistorialCambioClave";
		inputMap = this.jButtonActualizarHistorialCambioClave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHistorialCambioClave.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHistorialCambioClaveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHistorialCambioClave";
		inputMap = this.jButtonEliminarHistorialCambioClave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHistorialCambioClave.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHistorialCambioClaveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHistorialCambioClave";
		inputMap = this.jButtonCancelarHistorialCambioClave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHistorialCambioClave.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHistorialCambioClaveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHistorialCambioClave";
		inputMap = this.jButtonCerrarHistorialCambioClave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHistorialCambioClave.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHistorialCambioClaveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHistorialCambioClave";
		inputMap = this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosHistorialCambioClave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonGuardarCambiosHistorialCambioClave.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHistorialCambioClaveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHistorialCambioClave.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHistorialCambioClaveItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHistorialCambioClave.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHistorialCambioClaveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHistorialCambioClave.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHistorialCambioClaveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHistorialCambioClave.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHistorialCambioClaveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonidHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialCambioClaveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonid_usuarioHistorialCambioClaveUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioHistorialCambioClaveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonid_usuarioHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonnombreHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"nombreHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonfecha_horaHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"fecha_horaHistorialCambioClaveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialCambioClave.jButtonobservacionHistorialCambioClaveBusqueda.addActionListener(new ButtonActionListener(this,"observacionHistorialCambioClaveBusqueda"));
		
		
		this.jButtonBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave.addActionListener(new ButtonActionListener(this,"BusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHistorialCambioClave.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHistorialCambioClaveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHistorialCambioClaveActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHistorialCambioClave.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHistorialCambioClave(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
					historialcambioclaveAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialCambioClave historialcambioclaveAux:historialcambioclaves) {
					historialcambioclaveAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHistorialCambioClaveItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialCambioClave(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
						historialcambioclaveAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialCambioClave historialcambioclaveAux:historialcambioclaves) {
						historialcambioclaveAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialCambioClave historialcambioclaveAux:historialcambioclaves) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialCambioClave(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialCambioClave.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialCambioClave.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClave,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHistorialCambioClaveItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialCambioClave(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHistorialCambioClave.getSelectedRows();
			
			HistorialCambioClave historialcambioclaveLocal=new HistorialCambioClave();
			
			//this.seleccionarTodosHistorialCambioClave(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialcambioclaveLocal =(HistorialCambioClave) this.historialcambioclaveLogic.getHistorialCambioClaves().toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					historialcambioclaveLocal =(HistorialCambioClave) this.historialcambioclaves.toArray()[this.jTableDatosHistorialCambioClave.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				historialcambioclaveLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
						historialcambioclaveAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialCambioClave historialcambioclaveAux:historialcambioclaves) {
						historialcambioclaveAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHistorialCambioClave(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialCambioClave.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialCambioClave.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialCambioClave,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHistorialCambioClaveItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHistorialCambioClaveParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHistorialCambioClaveActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHistorialCambioClave(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHistorialCambioClave.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaveLogic.getHistorialCambioClaves()) {
				
						if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							historialcambioclaveAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA)) {
							existe=true;
							historialcambioclaveAux.setfecha_hora(Timestamp.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							historialcambioclaveAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialCambioClave historialcambioclaveAux:historialcambioclaves) {
					
						if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							historialcambioclaveAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA)) {
							existe=true;
							historialcambioclaveAux.setfecha_hora(Timestamp.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							historialcambioclaveAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialCambioClave(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHistorialCambioClaveActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHistorialCambioClave(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHistorialCambioClave=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHistorialCambioClave.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHistorialCambioClave) {				
					conSplash=true;//false;										
					
					//this.startProcessHistorialCambioClave(conSplash);
				
					this.generarReporteHistorialCambioClavesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHistorialCambioClavesSeleccionados();
				//this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialCambioClavesSeleccionados(false);
				//this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialCambioClavesSeleccionados(true);
				//this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialCambioClave();
				
				this.exportarHistorialCambioClavesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHistorialCambioClaves();
				//this.importarHistorialCambioClaves();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialCambioClave();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHistorialCambioClavesSeleccionados();
				//this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Historial Cambio Clave", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHistorialCambioClave();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHistorialCambioClave)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHistorialCambioClave(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.setSelectedIndex(0);					
				}	
			} 			
			else if(HistorialCambioClaveBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHistorialCambioClave) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHistorialCambioClave(conSplash);
					
						//this.actualizarParametrosGeneralHistorialCambioClave();
						
						this.generarReporteProcesoAccionHistorialCambioClavesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HistorialCambioClaveBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Historial Cambio ClaveS SELECCIONADOS?", "MANTENIMIENTO DE Historial Cambio Clave", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHistorialCambioClave();
				
						this.actualizarParametrosGeneralHistorialCambioClave();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.historialcambioclaveReturnGeneral=historialcambioclaveLogic.procesarAccionHistorialCambioClavesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.historialcambioclaveLogic.getHistorialCambioClaves(),this.historialcambioclaveParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHistorialCambioClaveReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHistorialCambioClave();
					
					HistorialCambioClaveBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHistorialCambioClaveReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialCambioClave.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxTiposAccionesFormularioHistorialCambioClave.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHistorialCambioClave(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHistorialCambioClaveActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHistorialCambioClave();
			
			if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		
			HistorialCambioClave historialcambioclave=new HistorialCambioClave();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHistorialCambioClave(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHistorialCambioClave.getSelectedItem();
			
			
			
			
			historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
			//this.sTipoAccion;
			
			if(historialcambioclavesSeleccionados.size()==1) {
				for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesSeleccionados) {
					historialcambioclave=historialcambioclaveAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHistorialCambioClave();
			
      		//this.finishProcessHistorialCambioClave(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHistorialCambioClaveReturnGeneral() throws Exception {
		if(this.historialcambioclaveReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.historialcambioclaveReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.historialcambioclaveReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.historialcambioclaveReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.historialcambioclaveReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.historialcambioclaveReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHistorialCambioClave(false);
		}
		
		if(this.historialcambioclaveReturnGeneral.getConRetornoLista() || this.historialcambioclaveReturnGeneral.getConRetornoObjeto()) {
			if(this.historialcambioclaveReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialcambioclaveLogic.setHistorialCambioClaves(this.historialcambioclaveReturnGeneral.getHistorialCambioClaves());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.historialcambioclaveReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialcambioclaveLogic.setHistorialCambioClave(this.historialcambioclaveReturnGeneral.getHistorialCambioClave());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingHistorialCambioClave(false);
		}
	}
	
	public void actualizarParametrosGeneralHistorialCambioClave() throws Exception {
		
		
	}
	
	public ArrayList<HistorialCambioClave> getHistorialCambioClavesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHistorialCambioClave) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(HistorialCambioClave historialcambioclaveAux:historialcambioclaveLogic.getHistorialCambioClaves()) {
					if(historialcambioclaveAux.getIsSelected()) {
						historialcambioclavesSeleccionados.add(historialcambioclaveAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialCambioClave historialcambioclaveAux:this.historialcambioclaves) {
					if(historialcambioclaveAux.getIsSelected()) {
						historialcambioclavesSeleccionados.add(historialcambioclaveAux);				
					}
				}
			}
			
			if(historialcambioclavesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						historialcambioclavesSeleccionados.addAll(this.historialcambioclaveLogic.getHistorialCambioClaves());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						historialcambioclavesSeleccionados.addAll(this.historialcambioclaves);				
					}
				}
			}
		} else {
			historialcambioclavesSeleccionados.add(this.historialcambioclave);
		}
		
		return historialcambioclavesSeleccionados;
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
	
	public void generarReporteHistorialCambioClavesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHistorialCambioClavesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHistorialCambioClavesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialCambioClavesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialCambioClavesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Historial Cambio Clave",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHistorialCambioClavesSeleccionados() throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHistorialCambioClaves("Todos",historialcambioclavesSeleccionados);
		
	}	
	
	public void generarReporteNormalHistorialCambioClavesSeleccionados() throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHistorialCambioClaves("Todos",historialcambioclavesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHistorialCambioClavesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHistorialCambioClaves("Todos",historialcambioclavesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHistorialCambioClavesSeleccionados() throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHistorialCambioClave();
		
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHistorialCambioClave();
		
		
		//this.generarReporteHistorialCambioClaves("Todos",historialcambioclavesSeleccionados ,historialcambioclaveImplementable,historialcambioclaveImplementableHome);
	}
	
	public void mostrarImportacionHistorialCambioClaves() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHistorialCambioClave();
		
		this.abrirFrameImportacionHistorialCambioClave();		
		
			
		//this.generarReporteHistorialCambioClaves("Todos",historialcambioclavesSeleccionados ,historialcambioclaveImplementable,historialcambioclaveImplementableHome);
	}
	
	public void importarHistorialCambioClaves() throws Exception {		
	
	}
	
	public void exportarHistorialCambioClavesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHistorialCambioClavesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHistorialCambioClavesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHistorialCambioClavesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Historial Cambio Clave",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHistorialCambioClavesSeleccionados() throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialcambioclave."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHistorialCambioClave(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHistorialCambioClave(historialcambioclaveAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//historialcambioclaveAux.setsDetalleGeneralEntityReporte(historialcambioclaveAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHistorialCambioClave(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HistorialCambioClaveConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialCambioClaveConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHistorialCambioClave(HistorialCambioClave historialcambioclave,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=historialcambioclave.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=historialcambioclave.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialcambioclave.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialcambioclave.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialcambioclave.getfecha_hora().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialcambioclave.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHistorialCambioClavesSeleccionados() throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialcambioclave.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("HistorialCambioClaves");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHistorialCambioClave(row);				
				iRow++;
			}				
			
			for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHistorialCambioClave(historialcambioclaveAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHistorialCambioClavesSeleccionados() throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();		
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialcambioclave.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("historialcambioclaves");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("historialcambioclave");
			//elementRoot.appendChild(element);
		
			for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesSeleccionados) {
				element = document.createElement("historialcambioclave");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHistorialCambioClave(historialcambioclaveAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Cambio Clave",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHistorialCambioClave(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHistorialCambioClave(HistorialCambioClave historialcambioclave,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(historialcambioclave.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(historialcambioclave.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialcambioclave.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(historialcambioclave.getfecha_hora());
		cell = row.createCell(iColumn++);cell.setCellValue(historialcambioclave.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlHistorialCambioClave(HistorialCambioClave historialcambioclave,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HistorialCambioClaveConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(historialcambioclave.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HistorialCambioClaveConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(historialcambioclave.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementusuario_descripcion = document.createElement(HistorialCambioClaveConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(historialcambioclave.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementnombre = document.createElement(HistorialCambioClaveConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(historialcambioclave.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_hora = document.createElement(HistorialCambioClaveConstantesFunciones.FECHAHORA);
		elementfecha_hora.appendChild(document.createTextNode(historialcambioclave.getfecha_hora().toString().trim()));
		element.appendChild(elementfecha_hora);

		Element elementobservacion = document.createElement(HistorialCambioClaveConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(historialcambioclave.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoHistorialCambioClavesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados=new ArrayList<HistorialCambioClave>();
		
		historialcambioclavesSeleccionados=this.getHistorialCambioClavesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoHistorialCambioClave(historialcambioclavesSeleccionados);
		
		this.generarReporteHistorialCambioClaves("Todos",historialcambioclavesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHistorialCambioClave(ArrayList<HistorialCambioClave> historialcambioclavesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(HistorialCambioClave historialcambioclaveAux:historialcambioclavesSeleccionados) {
				historialcambioclaveAux.setsDetalleGeneralEntityReporte(historialcambioclaveAux.toString());
			
				if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					historialcambioclaveAux.setsDescripcionGeneralEntityReporte1(historialcambioclaveAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					historialcambioclaveAux.setsDescripcionGeneralEntityReporte1(historialcambioclaveAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA)) {
					existe=true;
					historialcambioclaveAux.setsDescripcionGeneralEntityReporte1(historialcambioclaveAux.getfecha_hora().toString());
				}
				 else if(sTipoSeleccionar.equals(HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					historialcambioclaveAux.setsDescripcionGeneralEntityReporte1(historialcambioclaveAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialCambioClaveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHistorialCambioClave(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHistorialCambioClave=true;
				this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=true;
				this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=true;
			}
			
			this.isVisibilidadCeldaModificarHistorialCambioClave=false;
			this.isVisibilidadCeldaActualizarHistorialCambioClave=false;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=false;
			this.isVisibilidadCeldaCancelarHistorialCambioClave=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHistorialCambioClave=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=false;
			this.isVisibilidadCeldaModificarHistorialCambioClave=false;
			this.isVisibilidadCeldaActualizarHistorialCambioClave=true;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=false;
			this.isVisibilidadCeldaCancelarHistorialCambioClave=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHistorialCambioClave=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=false;
			this.isVisibilidadCeldaModificarHistorialCambioClave=false;
			this.isVisibilidadCeldaActualizarHistorialCambioClave=true;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=true;
			this.isVisibilidadCeldaCancelarHistorialCambioClave=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHistorialCambioClave=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=false;
			this.isVisibilidadCeldaModificarHistorialCambioClave=false;
			this.isVisibilidadCeldaActualizarHistorialCambioClave=true;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=false;
			this.isVisibilidadCeldaCancelarHistorialCambioClave=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHistorialCambioClave=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=true;
			this.isVisibilidadCeldaModificarHistorialCambioClave=false;
			this.isVisibilidadCeldaActualizarHistorialCambioClave=false;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=false;
			this.isVisibilidadCeldaCancelarHistorialCambioClave=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHistorialCambioClave=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=false;
			this.isVisibilidadCeldaActualizarHistorialCambioClave=false;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=false;
			this.isVisibilidadCeldaCancelarHistorialCambioClave=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHistorialCambioClave=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=false;
			this.isVisibilidadCeldaModificarHistorialCambioClave=true;
			this.isVisibilidadCeldaActualizarHistorialCambioClave=false;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=false;
			this.isVisibilidadCeldaCancelarHistorialCambioClave=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialCambioClave=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHistorialCambioClave=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=true;
		} else {
			this.actualizarEstadoPanelsHistorialCambioClave(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHistorialCambioClave=false;
			//this.isVisibilidadCeldaVerFormHistorialCambioClave=false;
			this.isVisibilidadCeldaDuplicarHistorialCambioClave=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!historialcambioclaveSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
		} else {
			this.isVisibilidadCeldaNuevoHistorialCambioClave=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialCambioClave=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			if(!historialcambioclaveSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;												
			}
			
			this.jButtonCerrarHistorialCambioClave.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialCambioClave=false;
		}
		
		if(!this.permiteMantenimiento(this.historialcambioclave)) {
			this.isVisibilidadCeldaActualizarHistorialCambioClave=false;
			this.isVisibilidadCeldaEliminarHistorialCambioClave=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialCambioClave() {
	}
	
	public void actualizarEstadoPanelsHistorialCambioClave(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHistorialCambioClave!=null) {
				this.jScrollPanelDatosEdicionHistorialCambioClave.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialCambioClave!=null) {
				this.jScrollPanelDatosHistorialCambioClave.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialCambioClave!=null) {
				this.jPanelPaginacionHistorialCambioClave.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHistorialCambioClave!=null) {
				this.jScrollPanelDatosEdicionHistorialCambioClave.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHistorialCambioClave!=null) {
				this.jScrollPanelDatosHistorialCambioClave.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialCambioClave!=null) {
				this.jPanelPaginacionHistorialCambioClave.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHistorialCambioClave!=null) {
				this.jScrollPanelDatosEdicionHistorialCambioClave.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialCambioClave!=null) {
				this.jScrollPanelDatosHistorialCambioClave.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialCambioClave!=null) {
				this.jPanelPaginacionHistorialCambioClave.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHistorialCambioClave!=null) {
				this.jScrollPanelDatosEdicionHistorialCambioClave.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialCambioClave!=null) {
				this.jScrollPanelDatosHistorialCambioClave.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialCambioClave!=null) {
				this.jPanelPaginacionHistorialCambioClave.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHistorialCambioClave!=null) {
				this.jScrollPanelDatosEdicionHistorialCambioClave.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialCambioClave!=null) {
				this.jScrollPanelDatosHistorialCambioClave.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialCambioClave!=null) {
				this.jPanelPaginacionHistorialCambioClave.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHistorialCambioClave!=null) {
				this.jScrollPanelDatosEdicionHistorialCambioClave.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialCambioClave!=null) {
				this.jScrollPanelDatosHistorialCambioClave.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialCambioClave!=null) {
				this.jPanelPaginacionHistorialCambioClave.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHistorialCambioClave!=null) {
				this.jScrollPanelDatosEdicionHistorialCambioClave.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialCambioClave!=null) {
				this.jScrollPanelDatosHistorialCambioClave.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialCambioClave!=null) {
				this.jPanelPaginacionHistorialCambioClave.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
					this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialCambioClave!=null) {
				this.jTabbedPaneBusquedasHistorialCambioClave.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHistorialCambioClave!=null) {
				this.jPanelParametrosReportesHistorialCambioClave.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora=isParaUsuario;
			if(!this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora) {this.jTabbedPaneBusquedasHistorialCambioClave.remove(jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//HistorialCambioClaveSessionBean historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
		
		if(this.historialcambioclaveSessionBean==null) {
			this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
		}
		
		this.historialcambioclaveSessionBean.setsUltimaBusquedaHistorialCambioClave(this.getsAccionBusqueda());
		this.historialcambioclaveSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.historialcambioclaveSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdUsuarioPorFechaHora")) {
			historialcambioclaveSessionBean.setid_usuario(this.getid_usuarioBusquedaPorIdUsuarioPorFechaHora());	
			historialcambioclaveSessionBean.setfecha_hora(this.getfecha_horaBusquedaPorIdUsuarioPorFechaHora());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			historialcambioclaveSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//HistorialCambioClaveSessionBean historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
		
		if(this.historialcambioclaveSessionBean==null) {
			this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
		}
		
		if(this.historialcambioclaveSessionBean.getsUltimaBusquedaHistorialCambioClave()!=null&&!this.historialcambioclaveSessionBean.getsUltimaBusquedaHistorialCambioClave().equals("")) {
			this.setsAccionBusqueda(historialcambioclaveSessionBean.getsUltimaBusquedaHistorialCambioClave());
			this.setiNumeroPaginacion(historialcambioclaveSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(historialcambioclaveSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdUsuarioPorFechaHora")) {
				this.setid_usuarioBusquedaPorIdUsuarioPorFechaHora(historialcambioclaveSessionBean.getid_usuario());
				historialcambioclaveSessionBean.setid_usuario(-1L);
				this.setfecha_horaBusquedaPorIdUsuarioPorFechaHora(historialcambioclaveSessionBean.getfecha_hora());
				historialcambioclaveSessionBean.setfecha_hora(new Timestamp((new Date()).getTime()));
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(historialcambioclaveSessionBean.getid_usuario());
				historialcambioclaveSessionBean.setid_usuario(-1L);
			}
		}
		
		this.historialcambioclaveSessionBean.setsUltimaBusquedaHistorialCambioClave("");
		this.historialcambioclaveSessionBean.setiNumeroPaginacion(HistorialCambioClaveConstantesFunciones.INUMEROPAGINACION);
		this.historialcambioclaveSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaHistorialCambioClave(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHistorialCambioClave() {
		this.updateBorderResaltarBusquedasFormularioHistorialCambioClave();
		this.updateVisibilidadBusquedasFormularioHistorialCambioClave();
		this.updateHabilitarBusquedasFormularioHistorialCambioClave();
	}
	
	public void updateBorderResaltarBusquedasFormularioHistorialCambioClave() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHistorialCambioClave.getComponents().length>0) {
	

		if(this.historialcambioclaveConstantesFunciones.resaltarBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave!=null) {
			index= this.jTabbedPaneBusquedasHistorialCambioClave.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialCambioClave.getComponent(index);
				jPanel.setBorder(this.historialcambioclaveConstantesFunciones.resaltarBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHistorialCambioClave() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHistorialCambioClave.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialCambioClave.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialCambioClave.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialcambioclaveConstantesFunciones.mostrarBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
			if(!this.historialcambioclaveConstantesFunciones.mostrarBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave && index>-1) {
				this.jTabbedPaneBusquedasHistorialCambioClave.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHistorialCambioClave() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHistorialCambioClave.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialCambioClave.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialCambioClave.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialcambioclaveConstantesFunciones.activarBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
				this.jTabbedPaneBusquedasHistorialCambioClave.setEnabledAt(index,this.historialcambioclaveConstantesFunciones.activarBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHistorialCambioClave(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora")) {
			index= this.jTabbedPaneBusquedasHistorialCambioClave.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);

			this.jTabbedPaneBusquedasHistorialCambioClave.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialCambioClave.getComponent(index);

			this.historialcambioclaveConstantesFunciones.setResaltarBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave(resaltar);

			jPanel.setBorder(this.historialcambioclaveConstantesFunciones.resaltarBusquedaPorIdUsuarioPorFechaHoraHistorialCambioClave);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarHistorialCambioClave.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioHistorialCambioClave() throws Exception {

		if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHistorialCambioClave();
		this.updateVisibilidadResaltarControlesFormularioHistorialCambioClave();
		this.updateHabilitarResaltarControlesFormularioHistorialCambioClave();
		
	}
	
	public void updateBorderResaltarControlesFormularioHistorialCambioClave() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.historialcambioclaveConstantesFunciones.resaltaridHistorialCambioClave!=null && this.jInternalFrameDetalleFormHistorialCambioClave!=null) {this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.setBorder(this.historialcambioclaveConstantesFunciones.resaltaridHistorialCambioClave);}
		if(this.historialcambioclaveConstantesFunciones.resaltarid_usuarioHistorialCambioClave!=null && this.jInternalFrameDetalleFormHistorialCambioClave!=null) {this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setBorder(this.historialcambioclaveConstantesFunciones.resaltarid_usuarioHistorialCambioClave);}
		if(this.historialcambioclaveConstantesFunciones.resaltarnombreHistorialCambioClave!=null && this.jInternalFrameDetalleFormHistorialCambioClave!=null) {this.jInternalFrameDetalleFormHistorialCambioClave.jTextFieldnombreHistorialCambioClave.setBorder(this.historialcambioclaveConstantesFunciones.resaltarnombreHistorialCambioClave);}
		if(this.historialcambioclaveConstantesFunciones.resaltarfecha_horaHistorialCambioClave!=null && this.jInternalFrameDetalleFormHistorialCambioClave!=null) {this.jInternalFrameDetalleFormHistorialCambioClave.jDateChooserfecha_horaHistorialCambioClave.setBorder(this.historialcambioclaveConstantesFunciones.resaltarfecha_horaHistorialCambioClave);}
		if(this.historialcambioclaveConstantesFunciones.resaltarobservacionHistorialCambioClave!=null && this.jInternalFrameDetalleFormHistorialCambioClave!=null) {this.jInternalFrameDetalleFormHistorialCambioClave.jTextAreaobservacionHistorialCambioClave.setBorder(this.historialcambioclaveConstantesFunciones.resaltarobservacionHistorialCambioClave);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHistorialCambioClave() throws Exception {		
		if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
	
		//this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostraridHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jPanelidHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostraridHistorialCambioClave);
		//this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostrarid_usuarioHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jPanelid_usuarioHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostrarid_usuarioHistorialCambioClave);
		//this.jInternalFrameDetalleFormHistorialCambioClave.jTextFieldnombreHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostrarnombreHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jPanelnombreHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostrarnombreHistorialCambioClave);
		//this.jInternalFrameDetalleFormHistorialCambioClave.jDateChooserfecha_horaHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostrarfecha_horaHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jPanelfecha_horaHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostrarfecha_horaHistorialCambioClave);
		//this.jInternalFrameDetalleFormHistorialCambioClave.jTextAreaobservacionHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostrarobservacionHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jPanelobservacionHistorialCambioClave.setVisible(this.historialcambioclaveConstantesFunciones.mostrarobservacionHistorialCambioClave);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHistorialCambioClave() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialCambioClave==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialCambioClave!=null) {
	
		this.jInternalFrameDetalleFormHistorialCambioClave.jLabelidHistorialCambioClave.setEnabled(this.historialcambioclaveConstantesFunciones.activaridHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jComboBoxid_usuarioHistorialCambioClave.setEnabled(this.historialcambioclaveConstantesFunciones.activarid_usuarioHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jTextFieldnombreHistorialCambioClave.setEnabled(this.historialcambioclaveConstantesFunciones.activarnombreHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jDateChooserfecha_horaHistorialCambioClave.setEnabled(this.historialcambioclaveConstantesFunciones.activarfecha_horaHistorialCambioClave);
		this.jInternalFrameDetalleFormHistorialCambioClave.jTextAreaobservacionHistorialCambioClave.setEnabled(this.historialcambioclaveConstantesFunciones.activarobservacionHistorialCambioClave);
		}
	}
	
		
}