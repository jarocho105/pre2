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

import com.bydan.erp.seguridad.util.PerfilUsuarioConstantesFunciones;
import com.bydan.erp.seguridad.util.PerfilUsuarioParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PerfilUsuarioParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.PerfilUsuarioBean;
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
public class PerfilUsuarioBeanSwingJInternalFrame extends PerfilUsuarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PerfilUsuarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PerfilUsuario> perfilusuarioValidator = new ClassValidator<PerfilUsuario>(PerfilUsuario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PerfilUsuario perfilusuario;	
	public PerfilUsuario perfilusuarioAux;
	public PerfilUsuario perfilusuarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PerfilUsuario perfilusuarioTotales;
	public Long idPerfilUsuarioActual;
	public Long iIdNuevoPerfilUsuario=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPerfil="";

	public List<Perfil> perfilsForeignKey;

	public List<Perfil> getperfilsForeignKey() {
		return perfilsForeignKey;
	}

	public void setperfilsForeignKey(List<Perfil> perfilsForeignKey) {
		this.perfilsForeignKey = perfilsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Perfil perfilForeignKey;

	public Perfil getperfilForeignKey() {
		return perfilForeignKey;
	}

	public void setperfilForeignKey(Perfil perfilForeignKey) {
		this.perfilForeignKey = perfilForeignKey;
	}

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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idUsuarioActual=0L;

	public Long getidUsuarioActual() {
		return idUsuarioActual;
	}

	public void setidUsuarioActual(Long idUsuarioActual) {
		this.idUsuarioActual= idUsuarioActual;
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
	
	public Boolean isPermisoTodoPerfilUsuario;
	public Boolean isPermisoNuevoPerfilUsuario;
	public Boolean isPermisoActualizarPerfilUsuario;
	public Boolean isPermisoActualizarOriginalPerfilUsuario;
	public Boolean isPermisoEliminarPerfilUsuario;
	public Boolean isPermisoGuardarCambiosPerfilUsuario;
	public Boolean isPermisoConsultaPerfilUsuario;
	public Boolean isPermisoBusquedaPerfilUsuario;
	public Boolean isPermisoReportePerfilUsuario;
	public Boolean isPermisoPaginacionMedioPerfilUsuario;
	public Boolean isPermisoPaginacionAltoPerfilUsuario;
	public Boolean isPermisoPaginacionTodoPerfilUsuario;
	public Boolean isPermisoCopiarPerfilUsuario;
	public Boolean isPermisoVerFormPerfilUsuario;
	public Boolean isPermisoDuplicarPerfilUsuario;
	public Boolean isPermisoOrdenPerfilUsuario;
	
	
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
	
	public PerfilUsuarioParameterReturnGeneral perfilusuarioReturnGeneral;
	public PerfilUsuarioParameterReturnGeneral perfilusuarioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPerfilUsuario=false;
	public Boolean esParaAccionDesdeFormularioPerfilUsuario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PerfilUsuarioSessionBeanAdditional perfilusuarioSessionBeanAdditional=null;
	
	public PerfilUsuarioSessionBeanAdditional getPerfilUsuarioSessionBeanAdditional() {
		return this.perfilusuarioSessionBeanAdditional;
	}
	
	public void setPerfilUsuarioSessionBeanAdditional(PerfilUsuarioSessionBeanAdditional perfilusuarioSessionBeanAdditional) {
		try {
			this.perfilusuarioSessionBeanAdditional=perfilusuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PerfilUsuarioBeanSwingJInternalFrameAdditional perfilusuarioBeanSwingJInternalFrameAdditional=null;
	//public class PerfilUsuarioBeanSwingJInternalFrame
	
	public PerfilUsuarioBeanSwingJInternalFrameAdditional getPerfilUsuarioBeanSwingJInternalFrameAdditional() {
		return this.perfilusuarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setPerfilUsuarioBeanSwingJInternalFrameAdditional(PerfilUsuarioBeanSwingJInternalFrameAdditional perfilusuarioBeanSwingJInternalFrameAdditional) {
		try {
			this.perfilusuarioBeanSwingJInternalFrameAdditional=perfilusuarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PerfilUsuarioLogic perfilusuarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PerfilUsuario perfilusuarioBean;
	public PerfilUsuarioConstantesFunciones perfilusuarioConstantesFunciones;
	//public PerfilUsuarioParameterReturnGeneral perfilusuarioReturnGeneral;
	
	//FK
	
	public PerfilLogic perfilLogic;
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<PerfilUsuario> perfilusuarios;	
	//public List<PerfilUsuario> perfilusuariosEliminados;
	//public List<PerfilUsuario> perfilusuariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPerfilUsuario=false;
	public Boolean isVisibilidadCeldaDuplicarPerfilUsuario=true;
	public Boolean isVisibilidadCeldaCopiarPerfilUsuario=true;
	public Boolean isVisibilidadCeldaVerFormPerfilUsuario=true;
	public Boolean isVisibilidadCeldaOrdenPerfilUsuario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
	public Boolean isVisibilidadCeldaModificarPerfilUsuario=false;
	public Boolean isVisibilidadCeldaActualizarPerfilUsuario=false;
	public Boolean isVisibilidadCeldaEliminarPerfilUsuario=false;
	public Boolean isVisibilidadCeldaCancelarPerfilUsuario=false;
	public Boolean isVisibilidadCeldaGuardarPerfilUsuario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPerfilUsuario=false;	
	
	
	public Boolean isVisibilidadFK_IdPerfil=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoPerfilUsuario() {
		return this.iIdNuevoPerfilUsuario;
	}

	public void setiIdNuevoPerfilUsuario(Long iIdNuevoPerfilUsuario) {
		this.iIdNuevoPerfilUsuario = iIdNuevoPerfilUsuario;
	}
	
	public Long getidPerfilUsuarioActual() {
		return this.idPerfilUsuarioActual;
	}

	public void setidPerfilUsuarioActual(Long idPerfilUsuarioActual) {
		this.idPerfilUsuarioActual = idPerfilUsuarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PerfilUsuario getperfilusuario() {
		return this.perfilusuario;
	}

	public void setperfilusuario(PerfilUsuario perfilusuario) {
		this.perfilusuario = perfilusuario;
	}
	
	public PerfilUsuario getperfilusuarioAux() {
		return this.perfilusuarioAux;
	}

	public void setperfilusuarioAux(PerfilUsuario perfilusuarioAux) {
		this.perfilusuarioAux = perfilusuarioAux;
	}				
	
	public PerfilUsuario getperfilusuarioAnterior() {
		return this.perfilusuarioAnterior;
	}

	public void setperfilusuarioAnterior(PerfilUsuario perfilusuarioAnterior) {
		this.perfilusuarioAnterior = perfilusuarioAnterior;
	}	
	
	public PerfilUsuario getperfilusuarioTotales() {
		return this.perfilusuarioTotales;
	}

	public void setperfilusuarioTotales(PerfilUsuario perfilusuarioTotales) {
		this.perfilusuarioTotales = perfilusuarioTotales;
	}	
	
	public PerfilUsuario getperfilusuarioBean() {
		return this.perfilusuarioBean;
	}

	public void setperfilusuarioBean(PerfilUsuario perfilusuarioBean) {
		this.perfilusuarioBean = perfilusuarioBean;
	}	
	
	public PerfilUsuarioParameterReturnGeneral getperfilusuarioReturnGeneral() {
		return this.perfilusuarioReturnGeneral;
	}

	public void setperfilusuarioReturnGeneral(PerfilUsuarioParameterReturnGeneral perfilusuarioReturnGeneral) {
		this.perfilusuarioReturnGeneral = perfilusuarioReturnGeneral;
	}	
	
	
	public Long id_perfilFK_IdPerfil=-1L;

	public Long getid_perfilFK_IdPerfil() {
		return this.id_perfilFK_IdPerfil;
	}

	public void setid_perfilFK_IdPerfil(Long id_perfilFK_IdPerfil) {
		this.id_perfilFK_IdPerfil = id_perfilFK_IdPerfil;
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
	
	
	public PerfilUsuarioLogic getPerfilUsuarioLogic()	{		
		return perfilusuarioLogic;
	}

	public void setPerfilUsuarioLogic(PerfilUsuarioLogic perfilusuarioLogic) {
		this.perfilusuarioLogic = perfilusuarioLogic;
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
	
	public Boolean getIsEsNuevoPerfilUsuario() {
		return isEsNuevoPerfilUsuario;
	}

	public void setIsEsNuevoPerfilUsuario(Boolean isEsNuevoPerfilUsuario) {
		this.isEsNuevoPerfilUsuario = isEsNuevoPerfilUsuario;
	}

	public Boolean getEsParaAccionDesdeFormularioPerfilUsuario() {
		return esParaAccionDesdeFormularioPerfilUsuario;
	}
	
	public void setEsParaAccionDesdeFormularioPerfilUsuario(Boolean esParaAccionDesdeFormularioPerfilUsuario) {
		this.esParaAccionDesdeFormularioPerfilUsuario = esParaAccionDesdeFormularioPerfilUsuario;
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
	
	
	public void cargarCombosPerfilsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.perfilsForeignKey=new ArrayList<Perfil>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PerfilLogic perfilLogic=new PerfilLogic();

			perfilLogic.getPerfilDataAccess().setIsForForeingKeyData(true);

			if(this.perfilusuarioSessionBean==null) {
				this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
			}

			if(!this.perfilusuarioSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getPerfilDataAccess().setIsForForeingKeyData(true);

					perfilLogic.getTodosPerfilsWithConnection(sFinalQuery,new Pagination());

					this.perfilsForeignKey=perfilLogic.getPerfils();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPerfil(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getEntityWithConnection(perfilusuarioSessionBean.getlidPerfilActual());
					this.perfilsForeignKey.add(perfilLogic.getPerfil());
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

			if(this.perfilusuarioSessionBean==null) {
				this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
			}

			if(!this.perfilusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(perfilusuarioSessionBean.getlidUsuarioActual());
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

	
	
	public void setActualPerfilForeignKey(Long idPerfilSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Perfil  perfilTemp=null;

			for(Perfil perfilAux:perfilsForeignKey) {
				if(perfilAux.getId()!=null && perfilAux.getId().equals(idPerfilSeleccionado)) {
					perfilTemp=perfilAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(perfilTemp!=null) {

					if(this.perfilusuario!=null) {
						this.perfilusuario.setPerfil(perfilTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
						this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setSelectedItem(perfilTemp);
					}
				} else {
					//jComboBoxid_perfilPerfilUsuario.setSelectedItem(perfilTemp);
					if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
						if(this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPerfil") || sFormularioTipoBusqueda.equals("Todos")){
					if(perfilTemp!=null && jComboBoxid_perfilFK_IdPerfilPerfilUsuario!=null) {
						jComboBoxid_perfilFK_IdPerfilPerfilUsuario.setSelectedItem(perfilTemp);
					} else {
						if(jComboBoxid_perfilFK_IdPerfilPerfilUsuario!=null) {
							//jComboBoxid_perfilFK_IdPerfilPerfilUsuario.setSelectedItem(perfilTemp);
							if(jComboBoxid_perfilFK_IdPerfilPerfilUsuario.getItemCount()>0) {
								jComboBoxid_perfilFK_IdPerfilPerfilUsuario.setSelectedIndex(0);
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

	public String getActualPerfilForeignKeyDescripcion(Long idPerfilSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Perfil  perfilTemp=null;

			for(Perfil perfilAux:perfilsForeignKey) {
				if(perfilAux.getId()!=null && perfilAux.getId().equals(idPerfilSeleccionado)) {
					perfilTemp=perfilAux;
					break;
				}
			}


			sDescripcion=PerfilConstantesFunciones.getPerfilDescripcion(perfilTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPerfilForeignKeyGenerico(Long idPerfilSeleccionado,JComboBox jComboBoxid_perfilPerfilUsuarioGenerico)throws Exception
	{
		try
		{
			Perfil  perfilTemp=null;

			for(Perfil perfilAux:perfilsForeignKey) {
				if(perfilAux.getId()!=null && perfilAux.getId().equals(idPerfilSeleccionado)) {
					perfilTemp=perfilAux;
					break;
				}
			}

			if(perfilTemp!=null) {
				jComboBoxid_perfilPerfilUsuarioGenerico.setSelectedItem(perfilTemp);
			} else {
				if(jComboBoxid_perfilPerfilUsuarioGenerico!=null && jComboBoxid_perfilPerfilUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_perfilPerfilUsuarioGenerico.setSelectedIndex(0);
				}
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

					if(this.perfilusuario!=null) {
						this.perfilusuario.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
						this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioPerfilUsuario.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
						if(this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioPerfilUsuarioGenerico)throws Exception
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
				jComboBoxid_usuarioPerfilUsuarioGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioPerfilUsuarioGenerico!=null && jComboBoxid_usuarioPerfilUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_usuarioPerfilUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPerfilForeignKey(PerfilUsuario perfilusuario,JComboBox jComboBoxid_perfilPerfilUsuarioGenerico)throws Exception
	{
		try
		{
			Perfil  perfilAux=new Perfil();

			if(jComboBoxid_perfilPerfilUsuarioGenerico==null) {
				perfilAux=(Perfil)this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.getSelectedItem();
			} else {
				perfilAux=(Perfil)jComboBoxid_perfilPerfilUsuarioGenerico.getSelectedItem();
			}

			if(perfilAux!=null && perfilAux.getId()!=null) {
				perfilusuario.setid_perfil(perfilAux.getId());
				perfilusuario.setperfil_descripcion(PerfilUsuarioConstantesFunciones.getPerfilDescripcion(perfilAux));
				perfilusuario.setPerfil(perfilAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(PerfilUsuario perfilusuario,JComboBox jComboBoxid_usuarioPerfilUsuarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioPerfilUsuarioGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioPerfilUsuarioGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				perfilusuario.setid_usuario(usuarioAux.getId());
				perfilusuario.setusuario_descripcion(PerfilUsuarioConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				perfilusuario.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePerfilsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPerfil=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { 
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.addItem(perfil);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { 
					}

					if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPerfil") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_perfilFK_IdPerfilPerfilUsuario.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jComboBoxid_perfilFK_IdPerfilPerfilUsuario.addItem(perfil);
							}
						}

						if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { 
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { 
					}

					if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePerfilForeignKey(Perfil perfil,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setSelectedItem(perfil);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_perfilFK_IdPerfilPerfilUsuario.setSelectedItem(perfil);
						} else {
							this.jComboBoxid_perfilFK_IdPerfilPerfilUsuario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPerfilUsuario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PerfilUsuarioConstantesFunciones.refrescarForeignKeysDescripcionesPerfilUsuario(this.perfilusuarioLogic.getPerfilUsuarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PerfilUsuarioConstantesFunciones.refrescarForeignKeysDescripcionesPerfilUsuario(this.perfilusuarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Perfil.class));
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//perfilusuarioLogic.setPerfilUsuarios(this.perfilusuarios);
			perfilusuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PerfilUsuarioParameterReturnGeneral getPerfilUsuarioParameterGeneral() {
		return this.perfilusuarioParameterGeneral;
	}
	
	public void setPerfilUsuarioParameterGeneral(PerfilUsuarioParameterReturnGeneral perfilusuarioParameterGeneral) {
		this.perfilusuarioParameterGeneral = perfilusuarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPerfilUsuario() {
		return isPermisoTodoPerfilUsuario;
	}

	public void setIsPermisoTodoPerfilUsuario(Boolean isPermisoTodoPerfilUsuario) {
		this.isPermisoTodoPerfilUsuario = isPermisoTodoPerfilUsuario;
	}

	public Boolean getIsPermisoNuevoPerfilUsuario() {
		return isPermisoNuevoPerfilUsuario;
	}

	public void setIsPermisoNuevoPerfilUsuario(Boolean isPermisoNuevoPerfilUsuario) {
		this.isPermisoNuevoPerfilUsuario = isPermisoNuevoPerfilUsuario;
	}

	public Boolean getIsPermisoActualizarPerfilUsuario() {
		return isPermisoActualizarPerfilUsuario;
	}

	public void setIsPermisoActualizarPerfilUsuario(Boolean isPermisoActualizarPerfilUsuario) {
		this.isPermisoActualizarPerfilUsuario = isPermisoActualizarPerfilUsuario;
	}

	public Boolean getIsPermisoEliminarPerfilUsuario() {
		return isPermisoEliminarPerfilUsuario;
	}

	public void setIsPermisoEliminarPerfilUsuario(Boolean isPermisoEliminarPerfilUsuario) {
		this.isPermisoEliminarPerfilUsuario = isPermisoEliminarPerfilUsuario;
	}

	public Boolean getIsPermisoGuardarCambiosPerfilUsuario() {
		return isPermisoGuardarCambiosPerfilUsuario;
	}

	public void setIsPermisoGuardarCambiosPerfilUsuario(Boolean isPermisoGuardarCambiosPerfilUsuario) {
		this.isPermisoGuardarCambiosPerfilUsuario = isPermisoGuardarCambiosPerfilUsuario;
	}
	
	public Boolean getIsPermisoConsultaPerfilUsuario() {
		return isPermisoConsultaPerfilUsuario;
	}

	public void setIsPermisoConsultaPerfilUsuario(Boolean isPermisoConsultaPerfilUsuario) {
		this.isPermisoConsultaPerfilUsuario = isPermisoConsultaPerfilUsuario;
	}

	public Boolean getIsPermisoBusquedaPerfilUsuario() {
		return isPermisoBusquedaPerfilUsuario;
	}

	public void setIsPermisoBusquedaPerfilUsuario(Boolean isPermisoBusquedaPerfilUsuario) {
		this.isPermisoBusquedaPerfilUsuario = isPermisoBusquedaPerfilUsuario;
	}

	public Boolean getIsPermisoReportePerfilUsuario() {
		return isPermisoReportePerfilUsuario;
	}

	public void setIsPermisoReportePerfilUsuario(Boolean isPermisoReportePerfilUsuario) {
		this.isPermisoReportePerfilUsuario = isPermisoReportePerfilUsuario;
	}
	
	public Boolean getIsPermisoPaginacionMedioPerfilUsuario() {
		return isPermisoPaginacionMedioPerfilUsuario;
	}

	public void setIsPermisoPaginacionMedioPerfilUsuario(Boolean isPermisoPaginacionMedioPerfilUsuario) {
		this.isPermisoPaginacionMedioPerfilUsuario = isPermisoPaginacionMedioPerfilUsuario;
	}
	
	public Boolean getIsPermisoPaginacionTodoPerfilUsuario() {
		return isPermisoPaginacionTodoPerfilUsuario;
	}

	public void setIsPermisoPaginacionTodoPerfilUsuario(Boolean isPermisoPaginacionTodoPerfilUsuario) {
		this.isPermisoPaginacionTodoPerfilUsuario = isPermisoPaginacionTodoPerfilUsuario;
	}
	
	public Boolean getIsPermisoPaginacionAltoPerfilUsuario() {
		return isPermisoPaginacionAltoPerfilUsuario;
	}

	public void setIsPermisoPaginacionAltoPerfilUsuario(Boolean isPermisoPaginacionAltoPerfilUsuario) {
		this.isPermisoPaginacionAltoPerfilUsuario = isPermisoPaginacionAltoPerfilUsuario;
	}
	
	public Boolean getIsPermisoCopiarPerfilUsuario() {
		return isPermisoCopiarPerfilUsuario;
	}

	public void setIsPermisoCopiarPerfilUsuario(Boolean isPermisoCopiarPerfilUsuario) {
		this.isPermisoCopiarPerfilUsuario = isPermisoCopiarPerfilUsuario;
	}
	
	public Boolean getIsPermisoVerFormPerfilUsuario() {
		return isPermisoVerFormPerfilUsuario;
	}

	public void setIsPermisoVerFormPerfilUsuario(Boolean isPermisoVerFormPerfilUsuario) {
		this.isPermisoVerFormPerfilUsuario = isPermisoVerFormPerfilUsuario;
	}
	
	public Boolean getIsPermisoDuplicarPerfilUsuario() {
		return isPermisoDuplicarPerfilUsuario;
	}

	public void setIsPermisoDuplicarPerfilUsuario(Boolean isPermisoDuplicarPerfilUsuario) {
		this.isPermisoDuplicarPerfilUsuario = isPermisoDuplicarPerfilUsuario;
	}
	
	public Boolean getIsPermisoOrdenPerfilUsuario() {
		return isPermisoOrdenPerfilUsuario;
	}

	public void setIsPermisoOrdenPerfilUsuario(Boolean isPermisoOrdenPerfilUsuario) {
		this.isPermisoOrdenPerfilUsuario = isPermisoOrdenPerfilUsuario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPerfilUsuario() {
		return isVisibilidadCeldaNuevoPerfilUsuario;
	}

	public void setIsVisibilidadCeldaNuevoPerfilUsuario(Boolean isVisibilidadCeldaNuevoPerfilUsuario) {
		this.isVisibilidadCeldaNuevoPerfilUsuario = isVisibilidadCeldaNuevoPerfilUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPerfilUsuario() {
		return isVisibilidadCeldaDuplicarPerfilUsuario;
	}

	public void setIsVisibilidadCeldaDuplicarPerfilUsuario(Boolean isVisibilidadCeldaDuplicarPerfilUsuario) {
		this.isVisibilidadCeldaDuplicarPerfilUsuario = isVisibilidadCeldaDuplicarPerfilUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPerfilUsuario() {
		return isVisibilidadCeldaCopiarPerfilUsuario;
	}

	public void setIsVisibilidadCeldaCopiarPerfilUsuario(Boolean isVisibilidadCeldaCopiarPerfilUsuario) {
		this.isVisibilidadCeldaCopiarPerfilUsuario = isVisibilidadCeldaCopiarPerfilUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPerfilUsuario() {
		return isVisibilidadCeldaVerFormPerfilUsuario;
	}

	public void setIsVisibilidadCeldaVerFormPerfilUsuario(Boolean isVisibilidadCeldaVerFormPerfilUsuario) {
		this.isVisibilidadCeldaVerFormPerfilUsuario = isVisibilidadCeldaVerFormPerfilUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPerfilUsuario() {
		return isVisibilidadCeldaOrdenPerfilUsuario;
	}

	public void setIsVisibilidadCeldaOrdenPerfilUsuario(Boolean isVisibilidadCeldaOrdenPerfilUsuario) {
		this.isVisibilidadCeldaOrdenPerfilUsuario = isVisibilidadCeldaOrdenPerfilUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPerfilUsuario() {
		return isVisibilidadCeldaNuevoRelacionesPerfilUsuario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPerfilUsuario(Boolean isVisibilidadCeldaNuevoRelacionesPerfilUsuario) {
		this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario = isVisibilidadCeldaNuevoRelacionesPerfilUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPerfilUsuario() {
		return isVisibilidadCeldaModificarPerfilUsuario;
	}

	public void setIsVisibilidadCeldaModificarPerfilUsuario(Boolean isVisibilidadCeldaModificarPerfilUsuario) {
		this.isVisibilidadCeldaModificarPerfilUsuario = isVisibilidadCeldaModificarPerfilUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPerfilUsuario() {
		return isVisibilidadCeldaActualizarPerfilUsuario;
	}

	public void setIsVisibilidadCeldaActualizarPerfilUsuario(Boolean isVisibilidadCeldaActualizarPerfilUsuario) {
		this.isVisibilidadCeldaActualizarPerfilUsuario = isVisibilidadCeldaActualizarPerfilUsuario;
	}

	public Boolean getIsVisibilidadCeldaEliminarPerfilUsuario() {
		return isVisibilidadCeldaEliminarPerfilUsuario;
	}

	public void setIsVisibilidadCeldaEliminarPerfilUsuario(Boolean isVisibilidadCeldaEliminarPerfilUsuario) {
		this.isVisibilidadCeldaEliminarPerfilUsuario = isVisibilidadCeldaEliminarPerfilUsuario;
	}

	public Boolean getIsVisibilidadCeldaCancelarPerfilUsuario() {
		return isVisibilidadCeldaCancelarPerfilUsuario;
	}

	public void setIsVisibilidadCeldaCancelarPerfilUsuario(Boolean isVisibilidadCeldaCancelarPerfilUsuario) {
		this.isVisibilidadCeldaCancelarPerfilUsuario = isVisibilidadCeldaCancelarPerfilUsuario;
	}

	public Boolean getIsVisibilidadCeldaGuardarPerfilUsuario() {
		return isVisibilidadCeldaGuardarPerfilUsuario;
	}

	public void setIsVisibilidadCeldaGuardarPerfilUsuario(Boolean isVisibilidadCeldaGuardarPerfilUsuario) {
		this.isVisibilidadCeldaGuardarPerfilUsuario = isVisibilidadCeldaGuardarPerfilUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPerfilUsuario() {
		return isVisibilidadCeldaGuardarCambiosPerfilUsuario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPerfilUsuario(Boolean isVisibilidadCeldaGuardarCambiosPerfilUsuario) {
		this.isVisibilidadCeldaGuardarCambiosPerfilUsuario = isVisibilidadCeldaGuardarCambiosPerfilUsuario;
	}
		
	public PerfilUsuarioSessionBean getperfilusuarioSessionBean() {
		return this.perfilusuarioSessionBean;
	}
	
	public void setperfilusuarioSessionBean(PerfilUsuarioSessionBean perfilusuarioSessionBean) {
		this.perfilusuarioSessionBean=perfilusuarioSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPerfil() {
		return this.isVisibilidadFK_IdPerfil;
	}

	public void setisVisibilidadFK_IdPerfil(Boolean isVisibilidadFK_IdPerfil) {
		this.isVisibilidadFK_IdPerfil=isVisibilidadFK_IdPerfil;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(PerfilUsuario perfilusuario)throws Exception {
		try {
			
				this.setActualParaGuardarPerfilForeignKey(perfilusuario,null);
				this.setActualParaGuardarUsuarioForeignKey(perfilusuario,null);
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
	
	public void bugActualizarReferenciaActual(PerfilUsuario perfilusuario,PerfilUsuario perfilusuarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPerfilUsuario(perfilusuario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		perfilusuarioAux.setId(perfilusuario.getId());
		perfilusuarioAux.setVersionRow(perfilusuario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPerfilUsuario();
		
			int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = perfilusuarioValidator.getInvalidValues(this.perfilusuario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			perfilusuarioLogic.setDatosCliente(datosCliente);
			perfilusuarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				perfilusuarioAux=new  PerfilUsuario();
				
				perfilusuarioAux.setIsNew(true);
				perfilusuarioAux.setIsChanged(true);
				
				perfilusuarioAux.setPerfilUsuarioOriginal(this.perfilusuario);
				
				perfilusuarioAux.setId(this.perfilusuario.getId());	
				perfilusuarioAux.setVersionRow(this.perfilusuario.getVersionRow());	
				perfilusuarioAux.setid_perfil(this.perfilusuario.getid_perfil());	
				perfilusuarioAux.setid_usuario(this.perfilusuario.getid_usuario());	
				perfilusuarioAux.setestado(this.perfilusuario.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilusuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(perfilusuarioAux,perfilusuarioLogic.getPerfilUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilusuarioAux,perfilusuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuarioLogic.savePerfilUsuarios();//WithConnection
						//perfilusuarioLogic.getSetVersionRowPerfilUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfilusuario,perfilusuarioAux);
					
					this.refrescarForeignKeysDescripcionesPerfilUsuario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilusuarioLogic.savePerfilUsuarioRelaciones(perfilusuarioAux);//WithConnection
								//perfilusuarioLogic.getSetVersionRowPerfilUsuarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfilusuario,perfilusuarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilusuarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilusuarioAux,perfilusuarioLogic.getPerfilUsuarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilusuarioAux,perfilusuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfilusuario,perfilusuarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				perfilusuarioAux=new  PerfilUsuario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado() 
					|| (this.perfilusuarioSessionBean.getEsGuardarRelacionado() && this.perfilusuario.getId()>=0)) {
						
					perfilusuarioAux.setIsNew(false);
				}
				
				perfilusuarioAux.setIsDeleted(false);
			
				perfilusuarioAux.setId(this.perfilusuario.getId());	
				perfilusuarioAux.setVersionRow(this.perfilusuario.getVersionRow());	
				perfilusuarioAux.setid_perfil(this.perfilusuario.getid_perfil());	
				perfilusuarioAux.setid_usuario(this.perfilusuario.getid_usuario());	
				perfilusuarioAux.setestado(this.perfilusuario.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilusuarioAux,perfilusuarioLogic.getPerfilUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilusuarioAux,perfilusuarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuarioLogic.savePerfilUsuarios();//WithConnection
						//perfilusuarioLogic.getSetVersionRowPerfilUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfilusuario,perfilusuarioAux);
					
					this.refrescarForeignKeysDescripcionesPerfilUsuario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilusuarioLogic.savePerfilUsuarioRelaciones(perfilusuarioAux);//WithConnection
								//perfilusuarioLogic.getSetVersionRowPerfilUsuarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfilusuario,perfilusuarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilusuarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilusuarioAux,perfilusuarioLogic.getPerfilUsuarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilusuarioAux,perfilusuarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfilusuario,perfilusuarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				perfilusuarioAux=new  PerfilUsuario();
				
				perfilusuarioAux.setIsNew(false);
				perfilusuarioAux.setIsChanged(false);
				
				perfilusuarioAux.setIsDeleted(true);
				
				perfilusuarioAux.setId(this.perfilusuario.getId());	
				perfilusuarioAux.setVersionRow(this.perfilusuario.getVersionRow());	
				perfilusuarioAux.setid_perfil(this.perfilusuario.getid_perfil());	
				perfilusuarioAux.setid_usuario(this.perfilusuario.getid_usuario());	
				perfilusuarioAux.setestado(this.perfilusuario.getestado());	
				
				if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.perfilusuarioAux.getId()>=0) {	
						this.perfilusuariosEliminados.add(perfilusuarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(perfilusuarioAux,perfilusuarioLogic.getPerfilUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilusuarioAux,perfilusuarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilusuarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuarioLogic.savePerfilUsuarios();//WithConnection
						//perfilusuarioLogic.getSetVersionRowPerfilUsuarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilusuarioLogic.savePerfilUsuarioRelaciones(perfilusuarioAux);//WithConnection
								//perfilusuarioLogic.getSetVersionRowPerfilUsuarios();//WithConnection
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
							if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.perfilusuarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(perfilusuarioAux,perfilusuarioLogic.getPerfilUsuarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(perfilusuarioAux,perfilusuarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.getPerfilUsuarios().addAll(this.perfilusuariosEliminados);
					
					perfilusuarioLogic.savePerfilUsuarios();//WithConnection
					//perfilusuarioLogic.getSetVersionRowPerfilUsuarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPerfilUsuario();
				
				this.perfilusuariosEliminados= new ArrayList<PerfilUsuario>();		
			}
			
			if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Usuarios Perfiles  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.perfilusuario=perfilusuarioAux;
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
      		//this.finishProcessPerfilUsuario();
      	}
		
	}	
	
	public void actualizarRelaciones(PerfilUsuario perfilusuarioLocal) throws Exception {
		
		if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PerfilUsuario perfilusuarioLocal) throws Exception {	
		if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PerfilDetalleFormJInternalFrame.class)) {
				PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrameLocal=(PerfilBeanSwingJInternalFrame) ((PerfilDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				perfilBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPerfil(perfilBeanSwingJInternalFrameLocal.getperfil(),true);
				perfilBeanSwingJInternalFrameLocal.actualizarLista(perfilBeanSwingJInternalFrameLocal.perfil,this.perfilsForeignKey);

				perfilBeanSwingJInternalFrameLocal.actualizarRelaciones(perfilBeanSwingJInternalFrameLocal.perfil);

				perfilusuarioLocal.setPerfil(perfilBeanSwingJInternalFrameLocal.perfil);

				this.addItemDefectoCombosForeignKeyPerfil();
				this.cargarCombosFramePerfilsForeignKey("Formulario");
				this.setActualPerfilForeignKey(perfilBeanSwingJInternalFrameLocal.perfil.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				perfilusuarioLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPerfilUsuarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = perfilusuarioValidator.getInvalidValues(this.perfilusuario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PerfilUsuario perfilusuario,List<PerfilUsuario> perfilusuarios) throws Exception {
		try	{		
			PerfilUsuarioConstantesFunciones.actualizarLista(perfilusuario,perfilusuarios,this.perfilusuarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PerfilUsuario perfilusuario,List<PerfilUsuario> perfilusuarios) throws Exception {
		try	{			
			PerfilUsuarioConstantesFunciones.actualizarSelectedLista(perfilusuario,perfilusuarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PerfilUsuario> perfilusuariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				perfilusuariosLocal=this.perfilusuarioLogic.getPerfilUsuarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				perfilusuariosLocal=this.perfilusuarios;
			}
			//ARCHITECTURE
		
			for(PerfilUsuario perfilusuarioLocal:perfilusuariosLocal) {
				if(this.permiteMantenimiento(perfilusuarioLocal) && perfilusuarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PerfilUsuarioConstantesFunciones.getPerfilUsuarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PerfilUsuarioConstantesFunciones.IDPERFIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilUsuario.jLabelid_perfilPerfilUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilUsuarioConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilUsuario.jLabelid_usuarioPerfilUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilUsuarioConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilUsuario.jLabelestadoPerfilUsuario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilUsuario.jLabelid_perfilPerfilUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilUsuario.jLabelid_usuarioPerfilUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilUsuario.jLabelestadoPerfilUsuario,"");
		
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
		this.iIdNuevoPerfilUsuario--;	
		
		
		this.perfilusuarioAux=new PerfilUsuario();
		
		this.perfilusuarioAux.setId(this.iIdNuevoPerfilUsuario);
		this.perfilusuarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilusuarioLogic.getPerfilUsuarios().add(this.perfilusuarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.perfilusuarios.add(this.perfilusuarioAux);
		}
		//ARCHITECTURE
		
		this.perfilusuario=this.perfilusuarioAux;
		
		if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPerfilUsuario(this.perfilusuario);
			this.setVariablesObjetoActualToFormularioForeignKeyPerfilUsuario(this.perfilusuario);
		}
				
		//this.setDefaultControlesPerfilUsuario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPerfilUsuario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPerfilUsuario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilUsuario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfilUsuario(this.perfilusuarioBean,this.perfilusuario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PerfilUsuarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
			classes=PerfilUsuarioConstantesFunciones.getClassesRelationshipsOfPerfilUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.perfilusuarioReturnGeneral=perfilusuarioLogic.procesarEventosPerfilUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilusuarioLogic.getPerfilUsuarios(),this.perfilusuario,this.perfilusuarioParameterGeneral,this.isEsNuevoPerfilUsuario,classes);//this.perfilusuarioLogic.getPerfilUsuario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPerfilUsuario(this.perfilusuarioReturnGeneral,this.perfilusuarioBean,false);
		
		if(this.perfilusuarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPerfilUsuario(this.perfilusuarioReturnGeneral.getPerfilUsuario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPerfilUsuario(this.perfilusuarioReturnGeneral.getPerfilUsuario());
		}
		
		if(this.perfilusuarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPerfilUsuario(this.perfilusuarioReturnGeneral.getPerfilUsuario(),classes);//this.perfilusuarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPerfilUsuario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPerfilUsuario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.RecargarFormPerfilUsuario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPerfilUsuario(false);
						
			if(perfilusuarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilUsuario();
			}
			
			this.actualizarVisualTableDatosPerfilUsuario();
			
			this.jTableDatosPerfilUsuario.setRowSelectionInterval(this.getIndiceNuevoPerfilUsuario(), this.getIndiceNuevoPerfilUsuario());
			
			this.seleccionarFilaTablaPerfilUsuarioActual();
						
			this.actualizarEstadoCeldasBotonesPerfilUsuario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPerfilUsuario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.setEnabled(isHabilitar && this.perfilusuarioConstantesFunciones.activarestadoPerfilUsuario);	
		
		this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setEnabled(isHabilitar && this.perfilusuarioConstantesFunciones.activarid_perfilPerfilUsuario);//
		this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setEnabled(isHabilitar && this.perfilusuarioConstantesFunciones.activarid_usuarioPerfilUsuario);
	};
	
	public void setDefaultControlesPerfilUsuario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPerfilUsuario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.perfilusuarioSessionBean.setConGuardarRelaciones(true);			
			this.perfilusuarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.setVisible(true);
			
					
		} else {
			//this.perfilusuarioSessionBean.setConGuardarRelaciones(false);			
			this.perfilusuarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPerfilUsuario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
				if(perfilusuarioAux.getId().equals(this.iIdNuevoPerfilUsuario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilUsuario perfilusuarioAux:this.perfilusuarios) {
				if(perfilusuarioAux.getId().equals(this.iIdNuevoPerfilUsuario)) {
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
	
	public int getIndiceActualPerfilUsuario(PerfilUsuario perfilusuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
				if(perfilusuarioAux.getId().equals(perfilusuario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilUsuario perfilusuarioAux:this.perfilusuarios) {
				if(perfilusuarioAux.getId().equals(perfilusuario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPerfilUsuario(PerfilUsuario perfilusuarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
				if(perfilusuarioAux.getPerfilUsuarioOriginal().getId().equals(perfilusuarioOriginal.getId())) {
					existe=true;
					perfilusuarioOriginal.setId(perfilusuarioAux.getId());
					perfilusuarioOriginal.setVersionRow(perfilusuarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilUsuario perfilusuarioAux:this.perfilusuarios) {
				if(perfilusuarioAux.getPerfilUsuarioOriginal().getId().equals(perfilusuarioOriginal.getId())) {
					existe=true;
					perfilusuarioOriginal.setId(perfilusuarioAux.getId());
					perfilusuarioOriginal.setVersionRow(perfilusuarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPerfilUsuario(Boolean esParaCancelar) throws Exception {
		perfilusuariosAux=new ArrayList<PerfilUsuario>();
		perfilusuarioAux=new PerfilUsuario();
		
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
					if(perfilusuarioAux.getId()<0) {
						perfilusuariosAux.add(perfilusuarioAux);
					}		
				}
				this.iIdNuevoPerfilUsuario=0L;
				this.perfilusuarioLogic.getPerfilUsuarios().removeAll(perfilusuariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilUsuario perfilusuarioAux:this.perfilusuarios) {
					if(perfilusuarioAux.getId()<0) {
						perfilusuariosAux.add(perfilusuarioAux);
					}		
				}
				this.iIdNuevoPerfilUsuario=0L;
				this.perfilusuarios.removeAll(perfilusuariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPerfilUsuario 
					&& this.perfilusuarioLogic.getPerfilUsuarios().size()>0
					) {
					perfilusuarioAux=this.perfilusuarioLogic.getPerfilUsuarios().get(this.perfilusuarioLogic.getPerfilUsuarios().size() - 1);
				
					if(perfilusuarioAux.getId()<0) {
						this.perfilusuarioLogic.getPerfilUsuarios().remove(perfilusuarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPerfilUsuario && this.perfilusuarios.size()>0) {
					perfilusuarioAux=this.perfilusuarios.get(this.perfilusuarios.size() - 1);
				
					if(perfilusuarioAux.getId()<0) {
						this.perfilusuarios.remove(perfilusuarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPerfilUsuario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(perfilusuario.getId()<0) {
				this.perfilusuarioLogic.getPerfilUsuarios().remove(this.perfilusuario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(perfilusuario.getId()<0) {
				this.perfilusuarios.remove(this.perfilusuario);
			}
		}			
	}
	
	public void setEstadosInicialesPerfilUsuario(List<PerfilUsuario> perfilusuariosAux) throws Exception {
		PerfilUsuarioConstantesFunciones.setEstadosInicialesPerfilUsuario(perfilusuariosAux);
	}
	
	public void setEstadosInicialesPerfilUsuario(PerfilUsuario perfilusuarioAux) throws Exception {
		PerfilUsuarioConstantesFunciones.setEstadosInicialesPerfilUsuario(perfilusuarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPerfilUsuarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPerfilUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPerfilUsuarioActual()) {
				if(!this.isEsNuevoPerfilUsuario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPerfilUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPerfilUsuario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPerfilUsuarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Usuarios Perfiles  ?", "MANTENIMIENTO DE Usuarios Perfiles ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPerfilUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PerfilUsuario perfilusuario) throws Exception {
		PerfilUsuarioConstantesFunciones.seleccionarAsignar(this.perfilusuario,perfilusuario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPerfilUsuario=this.isPermisoActualizarOriginalPerfilUsuario;
			
			
			this.seleccionarAsignar(perfilusuario);
			
			

			idUsuarioActual=perfilusuario.getid_usuario();
			this.seleccionarUsuarioActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilUsuarioConstantesFunciones.quitarEspaciosPerfilUsuario(this.perfilusuario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPerfilUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.perfilusuarioSessionBean.setsFuncionBusquedaRapida(this.perfilusuarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarUsuarioActual() throws Exception {
		try	{
			Usuario usuarioAux=new Usuario();

			if(this.idUsuarioActual != null && this.idUsuarioActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(this.idUsuarioActual);
					usuarioAux= usuarioLogic.getUsuario();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				usuariosForeignKey=new ArrayList<Usuario>();
				usuariosForeignKey.add(usuarioAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPerfilUsuario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPerfilUsuario(esParaCancelar);				
				this.cancelarNuevoPerfilUsuario(esParaCancelar);								
			}
			
			this.perfilusuario=new PerfilUsuario();
			
			this.inicializarPerfilUsuario();
			
			this.actualizarEstadoCeldasBotonesPerfilUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPerfilUsuario() throws Exception {
		try {
			PerfilUsuarioConstantesFunciones.inicializarPerfilUsuario(this.perfilusuario);
			
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
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.perfilusuarioLogic.getPerfilUsuarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePerfilUsuarios(String sAccionBusqueda,List<PerfilUsuario> perfilusuariosParaReportes) throws Exception {
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
					sPathReporteFinal="PerfilUsuario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PerfilUsuarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PerfilUsuarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PerfilUsuario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Usuarios Perfiles s");		
		parameters.put("busquedapor", PerfilUsuarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePerfilUsuario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PerfilUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PerfilUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePerfilUsuario=new JRBeanArrayDataSource(PerfilUsuarioJInternalFrame.TraerPerfilUsuarioBeans(perfilusuariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePerfilUsuario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PerfilUsuarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PerfilUsuarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PerfilUsuarioBean.TraerPerfilUsuarioBeans(perfilusuariosParaReportes).toArray()));
							
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
				this.generarExcelReportePerfilUsuarios(sAccionBusqueda,sTipoArchivoReporte,perfilusuariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPerfilUsuarios(sAccionBusqueda,sTipoArchivoReporte,perfilusuariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPerfilUsuarioActionPerformed(null);
					//this.generarExcelReportePerfilUsuarios(sAccionBusqueda,sTipoArchivoReporte,perfilusuariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPerfilUsuarios(sAccionBusqueda,sTipoArchivoReporte,perfilusuariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPerfilUsuarios(sAccionBusqueda,sTipoArchivoReporte,perfilusuariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPerfilUsuarios(sAccionBusqueda,sTipoArchivoReporte,perfilusuariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePerfilUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilUsuario> perfilusuariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilusuario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilUsuarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfilUsuario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PerfilUsuario perfilusuario : perfilusuariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PerfilUsuarioConstantesFunciones.generarExcelReporteDataPerfilUsuario("NORMAL",row,workbook,perfilusuario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPerfilUsuario(String sTipo,Row row,Workbook workbook) {
		
		PerfilUsuarioConstantesFunciones.generarExcelReporteHeaderPerfilUsuario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPerfilUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilUsuario> perfilusuariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilusuario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PerfilUsuario perfilusuario : perfilusuariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PerfilUsuarioConstantesFunciones.getPerfilUsuarioDescripcion(perfilusuario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilusuario.getperfil_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilusuario.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilUsuarioConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilusuario.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPerfilUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilUsuario> perfilusuariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PerfilUsuario> perfilusuariosRespaldo=null;
		
		classes=PerfilUsuarioConstantesFunciones.getClassesRelationshipsOfPerfilUsuario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.perfilusuarioLogic.setDatosCliente(this.datosCliente);
		this.perfilusuarioLogic.setDatosDeep(this.datosDeep);
		this.perfilusuarioLogic.setIsConDeep(true);
		
		perfilusuariosRespaldo=this.perfilusuarioLogic.getPerfilUsuarios();
		
		this.perfilusuarioLogic.setPerfilUsuarios(perfilusuariosParaReportes);	
		this.perfilusuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		perfilusuariosParaReportes=this.perfilusuarioLogic.getPerfilUsuarios();
		this.perfilusuarioLogic.setPerfilUsuarios(perfilusuariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilusuario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfilUsuario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PerfilUsuario perfilusuario : perfilusuariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPerfilUsuario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PerfilUsuarioConstantesFunciones.generarExcelReporteDataPerfilUsuario("NORMAL",row,workbook,perfilusuario,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PerfilUsuarioConstantesFunciones.getPerfilUsuarioDescripcion(perfilusuario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilUsuario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPerfilUsuario() throws Exception {		
		this.startProcessPerfilUsuario(true);
	}
	
	public void startProcessPerfilUsuario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPerfilUsuario ,this.jPanelParametrosReportesPerfilUsuario, this.jScrollPanelDatosPerfilUsuario,this.jPanelPaginacionPerfilUsuario, this.jScrollPanelDatosEdicionPerfilUsuario, this.jPanelAccionesPerfilUsuario,this.jPanelAccionesFormularioPerfilUsuario,this.jmenuBarPerfilUsuario,this.jmenuBarDetallePerfilUsuario,this.jTtoolBarPerfilUsuario,this.jTtoolBarDetallePerfilUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfilUsuario=this.jTabbedPaneBusquedasPerfilUsuario; 
		
		final JPanel jPanelParametrosReportesPerfilUsuario=this.jPanelParametrosReportesPerfilUsuario;
		//final JScrollPane jScrollPanelDatosPerfilUsuario=this.jScrollPanelDatosPerfilUsuario;
		final JTable jTableDatosPerfilUsuario=this.jTableDatosPerfilUsuario;		
		final JPanel jPanelPaginacionPerfilUsuario=this.jPanelPaginacionPerfilUsuario;
		//final JScrollPane jScrollPanelDatosEdicionPerfilUsuario=this.jScrollPanelDatosEdicionPerfilUsuario;
		final JPanel jPanelAccionesPerfilUsuario=this.jPanelAccionesPerfilUsuario;
		
		JPanel jPanelCamposAuxiliarPerfilUsuario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPerfilUsuario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			jPanelCamposAuxiliarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jPanelCamposPerfilUsuario;
			jPanelAccionesFormularioAuxiliarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jPanelAccionesFormularioPerfilUsuario;
		}
		
		final JPanel jPanelCamposPerfilUsuario=jPanelCamposAuxiliarPerfilUsuario;
		final JPanel jPanelAccionesFormularioPerfilUsuario=jPanelAccionesFormularioAuxiliarPerfilUsuario;
		
		
		final JMenuBar jmenuBarPerfilUsuario=this.jmenuBarPerfilUsuario;
		final JToolBar jTtoolBarPerfilUsuario=this.jTtoolBarPerfilUsuario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPerfilUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfilUsuario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			jmenuBarDetalleAuxiliarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jmenuBarDetallePerfilUsuario;
			jTtoolBarDetalleAuxiliarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jTtoolBarDetallePerfilUsuario;
		}
		
		final JMenuBar jmenuBarDetallePerfilUsuario=jmenuBarDetalleAuxiliarPerfilUsuario;
		final JToolBar jTtoolBarDetallePerfilUsuario=jTtoolBarDetalleAuxiliarPerfilUsuario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfilUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfilUsuario;
			processRunnable.jTableDatos=jTableDatosPerfilUsuario;
			processRunnable.jPanelCampos=jPanelCamposPerfilUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfilUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesPerfilUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfilUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarPerfilUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfilUsuario;
			processRunnable.jTtoolBar=jTtoolBarPerfilUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfilUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfilUsuario ,jPanelParametrosReportesPerfilUsuario,jTableDatosPerfilUsuario, /*jScrollPanelDatosPerfilUsuario,*/jPanelCamposPerfilUsuario,jPanelPaginacionPerfilUsuario, /*jScrollPanelDatosEdicionPerfilUsuario,*/ jPanelAccionesPerfilUsuario,jPanelAccionesFormularioPerfilUsuario,jmenuBarPerfilUsuario,jmenuBarDetallePerfilUsuario,jTtoolBarPerfilUsuario,jTtoolBarDetallePerfilUsuario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfilUsuario ,jPanelParametrosReportesPerfilUsuario, jScrollPanelDatosPerfilUsuario,jPanelPaginacionPerfilUsuario, jScrollPanelDatosEdicionPerfilUsuario, jPanelAccionesPerfilUsuario,jPanelAccionesFormularioPerfilUsuario,jmenuBarPerfilUsuario,jmenuBarDetallePerfilUsuario,jTtoolBarPerfilUsuario,jTtoolBarDetallePerfilUsuario);
						
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
	
	public void finishProcessPerfilUsuario() {// throws Exception 
		this.finishProcessPerfilUsuario(true);
	}
	
	public void finishProcessPerfilUsuario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPerfilUsuario ,this.jPanelParametrosReportesPerfilUsuario, this.jScrollPanelDatosPerfilUsuario,this.jPanelPaginacionPerfilUsuario, this.jScrollPanelDatosEdicionPerfilUsuario, this.jPanelAccionesPerfilUsuario,this.jPanelAccionesFormularioPerfilUsuario,this.jmenuBarPerfilUsuario,this.jmenuBarDetallePerfilUsuario,this.jTtoolBarPerfilUsuario,this.jTtoolBarDetallePerfilUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfilUsuario=this.jTabbedPaneBusquedasPerfilUsuario; 
		
		final JPanel jPanelParametrosReportesPerfilUsuario=this.jPanelParametrosReportesPerfilUsuario;
		//final JScrollPane jScrollPanelDatosPerfilUsuario=this.jScrollPanelDatosPerfilUsuario;
		final JTable jTableDatosPerfilUsuario=this.jTableDatosPerfilUsuario;		
		final JPanel jPanelPaginacionPerfilUsuario=this.jPanelPaginacionPerfilUsuario;
		//final JScrollPane jScrollPanelDatosEdicionPerfilUsuario=this.jScrollPanelDatosEdicionPerfilUsuario;
		final JPanel jPanelAccionesPerfilUsuario=this.jPanelAccionesPerfilUsuario;
		
		JPanel jPanelCamposAuxiliarPerfilUsuario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPerfilUsuario=new JPanel();
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			jPanelCamposAuxiliarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jPanelCamposPerfilUsuario;
			jPanelAccionesFormularioAuxiliarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jPanelAccionesFormularioPerfilUsuario;
		}
		
		final JPanel jPanelCamposPerfilUsuario=jPanelCamposAuxiliarPerfilUsuario;
		final JPanel jPanelAccionesFormularioPerfilUsuario=jPanelAccionesFormularioAuxiliarPerfilUsuario;
		
		
		final JMenuBar jmenuBarPerfilUsuario=this.jmenuBarPerfilUsuario;		
		final JToolBar jTtoolBarPerfilUsuario=this.jTtoolBarPerfilUsuario;
				
		JMenuBar jmenuBarDetalleAuxiliarPerfilUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfilUsuario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			jmenuBarDetalleAuxiliarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jmenuBarDetallePerfilUsuario;
			jTtoolBarDetalleAuxiliarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jTtoolBarDetallePerfilUsuario;		
		}
		
		final JMenuBar jmenuBarDetallePerfilUsuario=jmenuBarDetalleAuxiliarPerfilUsuario;
		final JToolBar jTtoolBarDetallePerfilUsuario=jTtoolBarDetalleAuxiliarPerfilUsuario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfilUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfilUsuario;
			processRunnable.jTableDatos=jTableDatosPerfilUsuario;
			processRunnable.jPanelCampos=jPanelCamposPerfilUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfilUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesPerfilUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfilUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarPerfilUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfilUsuario;
			processRunnable.jTtoolBar=jTtoolBarPerfilUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfilUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPerfilUsuario ,jPanelParametrosReportesPerfilUsuario, jTableDatosPerfilUsuario,/*jScrollPanelDatosPerfilUsuario,*/jPanelCamposPerfilUsuario,jPanelPaginacionPerfilUsuario, /*jScrollPanelDatosEdicionPerfilUsuario,*/ jPanelAccionesPerfilUsuario,jPanelAccionesFormularioPerfilUsuario,jmenuBarPerfilUsuario,jmenuBarDetallePerfilUsuario,jTtoolBarPerfilUsuario,jTtoolBarDetallePerfilUsuario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPerfilUsuario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPerfilUsuario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPerfilUsuario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPerfilUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPerfilUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePerfilUsuario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPerfilUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPerfilUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePerfilUsuario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.perfilusuarioConstantesFunciones.getsFinalQueryPerfilUsuario();
		String  finalQueryPaginacionTodos=this.perfilusuarioConstantesFunciones.getsFinalQueryPerfilUsuario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PerfilUsuarioConstantesFunciones.getArrayColumnasGlobalesNoPerfilUsuario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PerfilUsuarioConstantesFunciones.getArrayColumnasGlobalesPerfilUsuario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PerfilUsuarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.perfilusuariosEliminados= new ArrayList<PerfilUsuario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPerfilUsuario();
		
				///*PerfilUsuarioSessionBean*/this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
			
			if(this.perfilusuarioSessionBean==null) {
				this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
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
					this.iNumeroPaginacion=PerfilUsuarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PerfilUsuarioConstantesFunciones.getClassesForeignKeysOfPerfilUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/perfilusuario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			perfilusuariosAux= new ArrayList<PerfilUsuario>();
			
				
			perfilusuarioLogic.setDatosCliente(this.datosCliente);
			perfilusuarioLogic.setDatosDeep(this.datosDeep);
			perfilusuarioLogic.setIsConDeep(true);
			
			
			perfilusuarioLogic.getPerfilUsuarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					perfilusuarioLogic.getTodosPerfilUsuarios(finalQueryGlobal,pagination);
					
					//perfilusuarioLogic.getTodosPerfilUsuariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(perfilusuarioLogic.getPerfilUsuarios()==null|| perfilusuarioLogic.getPerfilUsuarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilusuariosAux= new ArrayList<PerfilUsuario>();
							perfilusuariosAux.addAll(perfilusuarioLogic.getPerfilUsuarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilusuariosAux= new ArrayList<PerfilUsuario>();
							perfilusuariosAux.addAll(perfilusuarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilusuarioLogic.getTodosPerfilUsuarios(finalQueryGlobal+"",this.pagination);												
							
							//perfilusuarioLogic.getTodosPerfilUsuariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePerfilUsuarios("Todos",perfilusuarioLogic.getPerfilUsuarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());					
							perfilusuarioLogic.getPerfilUsuarios().addAll(perfilusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilusuarios=new ArrayList<PerfilUsuario>();
							perfilusuarios.addAll(perfilusuariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPerfilUsuario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPerfilUsuario=this.idActual;
				
				} else if(this.idPerfilUsuarioActual!=null && this.idPerfilUsuarioActual!=0L) {
					idPerfilUsuario=idPerfilUsuarioActual;
				}
				
					
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndicePorId(idPerfilUsuario);
				
				this.perfilusuarios=new ArrayList<PerfilUsuario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					perfilusuarioLogic.getEntity(idPerfilUsuario);
					
					//perfilusuarioLogic.getEntityWithConnection(idPerfilUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
					perfilusuarioLogic.getPerfilUsuarios().add(perfilusuarioLogic.getPerfilUsuario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilusuarios=new ArrayList<PerfilUsuario>();
					this.perfilusuarios.add(perfilusuario);
				}
				
				if(perfilusuarioLogic.getPerfilUsuario()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPerfil")) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilusuarioLogic.getPerfilUsuariosFK_IdPerfil(finalQueryGlobal,pagination,id_perfilFK_IdPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilusuarioLogic.getPerfilUsuarios()==null||perfilusuarioLogic.getPerfilUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilusuarios==null|| perfilusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuariosAux=new ArrayList<PerfilUsuario>();
						perfilusuariosAux.addAll(perfilusuarioLogic.getPerfilUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilusuariosAux=new ArrayList<PerfilUsuario>();
							perfilusuariosAux.addAll(perfilusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilusuarioLogic.getPerfilUsuariosFK_IdPerfil(finalQueryGlobal,pagination,id_perfilFK_IdPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilUsuarios("FK_IdPerfil",perfilusuarioLogic.getPerfilUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilUsuarios("FK_IdPerfil",perfilusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
						perfilusuarioLogic.getPerfilUsuarios().addAll(perfilusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilusuarios=new ArrayList<PerfilUsuario>();
							perfilusuarios.addAll(perfilusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilusuarioLogic.getPerfilUsuariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilusuarioLogic.getPerfilUsuarios()==null||perfilusuarioLogic.getPerfilUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilusuarios==null|| perfilusuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuariosAux=new ArrayList<PerfilUsuario>();
						perfilusuariosAux.addAll(perfilusuarioLogic.getPerfilUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilusuariosAux=new ArrayList<PerfilUsuario>();
							perfilusuariosAux.addAll(perfilusuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilusuarioLogic.getPerfilUsuariosFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilUsuarioConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilUsuarios("FK_IdUsuario",perfilusuarioLogic.getPerfilUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilUsuarios("FK_IdUsuario",perfilusuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuarioLogic.setPerfilUsuarios(new ArrayList<PerfilUsuario>());
						perfilusuarioLogic.getPerfilUsuarios().addAll(perfilusuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilusuarios=new ArrayList<PerfilUsuario>();
							perfilusuarios.addAll(perfilusuariosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPerfilUsuario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPerfilUsuario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilusuarioLogic.getPerfilUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilusuarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilusuarioLogic.getPerfilUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilusuarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PerfilUsuario perfilusuario) {
		Boolean permite=true;
		
		if(this.perfilusuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PerfilUsuarioConstantesFunciones.getOrderByListaPerfilUsuario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PerfilUsuarioConstantesFunciones.getOrderByListaPerfilUsuario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilUsuario perfilusuario:perfilusuarioLogic.getPerfilUsuarios()) {
				if(perfilusuario.getsType().equals(Constantes2.S_TOTALES)) {
					perfilusuarioTotales=perfilusuario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilUsuario perfilusuario:this.perfilusuarios) {
				if(perfilusuario.getsType().equals(Constantes2.S_TOTALES)) {
					perfilusuarioTotales=perfilusuario;
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
			this.perfilusuarioAux=new PerfilUsuario();
			this.perfilusuarioAux.setsType(Constantes2.S_TOTALES);
			this.perfilusuarioAux.setIsNew(false);
			this.perfilusuarioAux.setIsChanged(false);
			this.perfilusuarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PerfilUsuarioConstantesFunciones.TotalizarValoresFilaPerfilUsuario(this.perfilusuarioLogic.getPerfilUsuarios(),this.perfilusuarioAux);
				
				this.perfilusuarioLogic.getPerfilUsuarios().add(this.perfilusuarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PerfilUsuarioConstantesFunciones.TotalizarValoresFilaPerfilUsuario(this.perfilusuarios,this.perfilusuarioAux);
				
				this.perfilusuarios.add(this.perfilusuarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		perfilusuarioTotales=new PerfilUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilusuarioLogic.getPerfilUsuarios().remove(perfilusuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilusuarios.remove(perfilusuarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		perfilusuarioTotales=new PerfilUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilUsuario perfilusuario:perfilusuarioLogic.getPerfilUsuarios()) {
				if(perfilusuario.getsType().equals(Constantes2.S_TOTALES)) {
					perfilusuarioTotales=perfilusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilUsuarioConstantesFunciones.TotalizarValoresFilaPerfilUsuario(this.perfilusuarioLogic.getPerfilUsuarios(),perfilusuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilUsuario perfilusuario:this.perfilusuarios) {
				if(perfilusuario.getsType().equals(Constantes2.S_TOTALES)) {
					perfilusuarioTotales=perfilusuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilUsuarioConstantesFunciones.TotalizarValoresFilaPerfilUsuario(this.perfilusuarios,perfilusuarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPerfilUsuariosFK_IdPerfil()throws Exception {
		try {
			sAccionBusqueda="FK_IdPerfil";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilUsuariosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPerfilUsuariosFK_IdPerfil(String sFinalQuery,Long id_perfil)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilusuarioLogic.getPerfilUsuariosFK_IdPerfil(sFinalQuery,this.pagination,id_perfil);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilUsuariosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilusuarioLogic.getPerfilUsuariosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosPerfilUsuario() {
		this.isPermisoTodoPerfilUsuario=false;
		this.isPermisoNuevoPerfilUsuario=false;
		this.isPermisoActualizarPerfilUsuario=false;
		this.isPermisoActualizarOriginalPerfilUsuario=false;
		this.isPermisoEliminarPerfilUsuario=false;
		this.isPermisoGuardarCambiosPerfilUsuario=false;
		this.isPermisoConsultaPerfilUsuario=false;
		this.isPermisoBusquedaPerfilUsuario=false;
		this.isPermisoReportePerfilUsuario=false;		
		this.isPermisoOrdenPerfilUsuario=false;		
		this.isPermisoPaginacionMedioPerfilUsuario=false;		
		this.isPermisoPaginacionAltoPerfilUsuario=false;
		this.isPermisoPaginacionTodoPerfilUsuario=false;
		this.isPermisoCopiarPerfilUsuario=false;		
		this.isPermisoVerFormPerfilUsuario=false;		
		this.isPermisoDuplicarPerfilUsuario=false;		
		this.isPermisoOrdenPerfilUsuario=false;		
	}
	
	public void setPermisosUsuarioPerfilUsuario(Boolean isPermiso) {
		this.isPermisoTodoPerfilUsuario=isPermiso;
		this.isPermisoNuevoPerfilUsuario=isPermiso;
		this.isPermisoActualizarPerfilUsuario=isPermiso;
		this.isPermisoActualizarOriginalPerfilUsuario=isPermiso;
		this.isPermisoEliminarPerfilUsuario=isPermiso;
		this.isPermisoGuardarCambiosPerfilUsuario=isPermiso;
		this.isPermisoConsultaPerfilUsuario=isPermiso;
		this.isPermisoBusquedaPerfilUsuario=isPermiso;
		this.isPermisoReportePerfilUsuario=isPermiso;
		this.isPermisoOrdenPerfilUsuario=isPermiso;		
		this.isPermisoPaginacionMedioPerfilUsuario=isPermiso;		
		this.isPermisoPaginacionAltoPerfilUsuario=isPermiso;		
		this.isPermisoPaginacionTodoPerfilUsuario=isPermiso;		
		this.isPermisoCopiarPerfilUsuario=isPermiso;		
		this.isPermisoVerFormPerfilUsuario=isPermiso;		
		this.isPermisoDuplicarPerfilUsuario=isPermiso;
		this.isPermisoOrdenPerfilUsuario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPerfilUsuario(Boolean isPermiso) {
		//this.isPermisoTodoPerfilUsuario=isPermiso;
		this.isPermisoNuevoPerfilUsuario=isPermiso;
		this.isPermisoActualizarPerfilUsuario=isPermiso;
		this.isPermisoActualizarOriginalPerfilUsuario=isPermiso;
		this.isPermisoEliminarPerfilUsuario=isPermiso;
		this.isPermisoGuardarCambiosPerfilUsuario=isPermiso;
		//this.isPermisoConsultaPerfilUsuario=isPermiso;
		//this.isPermisoBusquedaPerfilUsuario=isPermiso;
		//this.isPermisoReportePerfilUsuario=isPermiso;
		//this.isPermisoOrdenPerfilUsuario=isPermiso;		
		//this.isPermisoPaginacionMedioPerfilUsuario=isPermiso;		
		//this.isPermisoPaginacionAltoPerfilUsuario=isPermiso;		
		//this.isPermisoPaginacionTodoPerfilUsuario=isPermiso;		
		//this.isPermisoCopiarPerfilUsuario=isPermiso;		
		//this.isPermisoDuplicarPerfilUsuario=isPermiso;
		//this.isPermisoOrdenPerfilUsuario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPerfilUsuarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PerfilUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPerfilUsuario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPerfilUsuarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPerfilUsuarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPerfilUsuarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPerfilUsuarioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPerfilUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PerfilUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PerfilUsuarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPerfilUsuario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPerfilUsuario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPerfilUsuario=this.isPermisoActualizarPerfilUsuario;
			this.isPermisoEliminarPerfilUsuario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPerfilUsuario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPerfilUsuario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPerfilUsuario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPerfilUsuario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePerfilUsuario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfilUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPerfilUsuario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPerfilUsuario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPerfilUsuario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPerfilUsuario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPerfilUsuario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPerfilUsuario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfilUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPerfilUsuario.setToolTipText(this.jTableDatosPerfilUsuario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPerfilUsuario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPerfilUsuario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PerfilUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PerfilUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPerfilUsuario() throws Exception {
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
	public void inicializarCombosForeignKeyPerfilUsuarioListas()throws Exception {
		try	{						
			
				this.perfilsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPerfilUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PerfilUsuarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPerfilUsuarioListas(false);
			} else {
			
				this.cargarCombosForeignKeyPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPerfilListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.perfilsForeignKey==null||this.perfilsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PerfilConstantesFunciones.getArrayColumnasGlobalesPerfil(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PerfilConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PerfilConstantesFunciones.SFINALQUERY;

				this.cargarCombosPerfilsForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyPerfilUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PerfilUsuarioParameterReturnGeneral perfilusuarioReturnGeneral=new PerfilUsuarioParameterReturnGeneral();
						
			


				String finalQueryGlobalPerfil="";

				if(((this.perfilsForeignKey==null||this.perfilsForeignKey.size()<=0) && this.perfilusuarioConstantesFunciones.cargarid_perfilPerfilUsuario)
					 || (this.esRecargarFks && this.perfilusuarioConstantesFunciones.cargarid_perfilPerfilUsuario)) {

					if(!this.perfilusuarioSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PerfilConstantesFunciones.getArrayColumnasGlobalesPerfil(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPerfil=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PerfilConstantesFunciones.TABLENAME);

						finalQueryGlobalPerfil=Funciones.GetFinalQueryAppend(finalQueryGlobalPerfil, "");
						finalQueryGlobalPerfil+=PerfilConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPerfilsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPerfil=" WHERE " + ConstantesSql.ID + "="+perfilusuarioSessionBean.getlidPerfilActual();
					}
				} else {
					finalQueryGlobalPerfil="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.perfilusuarioConstantesFunciones.cargarid_usuarioPerfilUsuario)
					 || (this.esRecargarFks && this.perfilusuarioConstantesFunciones.cargarid_usuarioPerfilUsuario)) {

					if(!this.perfilusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+perfilusuarioSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilusuarioReturnGeneral=perfilusuarioLogic.cargarCombosLoteForeignKeyPerfilUsuario(finalQueryGlobalPerfil,finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				this.perfilsForeignKey=perfilusuarioReturnGeneral.getperfilsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=perfilusuarioReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPerfilUsuario()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPerfil();
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPerfil()throws Exception {
		try {
			if(this.perfilusuarioSessionBean==null) {
				this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
			}

			if(!this.perfilusuarioSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
				Perfil perfil=new Perfil();
				PerfilConstantesFunciones.setPerfilDescripcion(perfil,Constantes.SMENSAJE_ESCOJA_OPCION);
				perfil.setId(null);

				if(!PerfilConstantesFunciones.ExisteEnLista(this.perfilsForeignKey,perfil,true)) {

					this.perfilsForeignKey.add(0,perfil);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.perfilusuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
	
	public void initActionsCombosTodosForeignKeyPerfilUsuario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPerfilUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPerfilUsuario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilUsuario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPerfilUsuario(PerfilUsuario perfilusuario)throws Exception {	
		try {
			
			this.setActualPerfilForeignKey(perfilusuario.getid_perfil(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPerfilUsuario(PerfilUsuario perfilusuario,String sTipoEvento)throws Exception {	
		try {
			
			

				if(perfilusuario.getUsuario()!=null && !sTipoEvento.equals("id_usuarioPerfilUsuario")) { //sTipoEvento Evita Bucle Infinito

					this.usuariosForeignKey=new ArrayList<Usuario>();
					this.usuariosForeignKey.add(perfilusuario.getUsuario());

					this.addItemDefectoCombosForeignKeyUsuario();
					this.cargarCombosFrameUsuariosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPerfilUsuario()throws Exception {	
		try {
			
			this.setActualPerfilForeignKey(this.perfilusuarioConstantesFunciones.getid_perfil(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilUsuario()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPerfilUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPerfilUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPerfilUsuario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPerfilUsuario()throws Exception {
		try {
			

			this.cargarCombosFramePerfilsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPerfilUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPerfilUsuario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario!=null && this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario!=null && this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PerfilUsuarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PerfilUsuarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PerfilUsuarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean(); 
		this.perfilusuarioConstantesFunciones=new PerfilUsuarioConstantesFunciones(); 
		this.perfilusuarioBean=new PerfilUsuario();//(this.perfilusuarioConstantesFunciones); 		
		this.perfilusuarioReturnGeneral=new PerfilUsuarioParameterReturnGeneral(); 
		
		this.perfilusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PerfilUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PerfilUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PerfilUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPerfilUsuario(true);
			
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
			
			this.perfilusuarioConstantesFunciones=new PerfilUsuarioConstantesFunciones(); 
			this.perfilusuarioBean=new PerfilUsuario();//this.perfilusuarioConstantesFunciones); 			
			this.perfilusuarioReturnGeneral=new PerfilUsuarioParameterReturnGeneral(); 
		
			PerfilUsuarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Usuarios Perfiles  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.perfilusuario=new PerfilUsuario();
			this.perfilusuarios = new ArrayList<PerfilUsuario>();
			this.perfilusuariosAux = new ArrayList<PerfilUsuario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic=new PerfilUsuarioLogic();
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.perfilusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.perfilusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPerfilUsuario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfilUsuario);	
					}
					
					if(this.jInternalFrameImportacionPerfilUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfilUsuario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPerfilUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPerfilUsuario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfilUsuario);
				this.jInternalFrameDetalleFormPerfilUsuario.setVisible(false);
				this.jInternalFrameDetalleFormPerfilUsuario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfilUsuario);
					this.jInternalFrameReporteDinamicoPerfilUsuario.setVisible(false);
					this.jInternalFrameReporteDinamicoPerfilUsuario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPerfilUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPerfilUsuario);
					this.jInternalFrameImportacionPerfilUsuario.setVisible(false);
					this.jInternalFrameImportacionPerfilUsuario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPerfilUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPerfilUsuario);
					this.jInternalFrameOrderByPerfilUsuario.setVisible(false);
					this.jInternalFrameOrderByPerfilUsuario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPerfilUsuarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PerfilUsuarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.perfilusuarioReturnGeneral=new PerfilUsuarioParameterReturnGeneral();
			
			this.perfilusuarioParameterGeneral=new PerfilUsuarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.perfilusuarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PerfilUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilusuarioSessionBean.getEsGuardarRelacionado(),this.perfilusuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilusuarioSessionBean.getEsGuardarRelacionado(),this.perfilusuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPerfilUsuario=false;
			this.isVisibilidadCeldaDuplicarPerfilUsuario=true;
			this.isVisibilidadCeldaCopiarPerfilUsuario=true;
			this.isVisibilidadCeldaVerFormPerfilUsuario=true;
			this.isVisibilidadCeldaOrdenPerfilUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
			this.isVisibilidadCeldaModificarPerfilUsuario=false;
			this.isVisibilidadCeldaActualizarPerfilUsuario=false;
			this.isVisibilidadCeldaEliminarPerfilUsuario=false;
			this.isVisibilidadCeldaCancelarPerfilUsuario=false;
			this.isVisibilidadCeldaGuardarPerfilUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=false;
			
			
			this.isVisibilidadFK_IdPerfil=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPerfilUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPerfilUsuario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPerfilUsuario(false);
			
			this.setPermisosUsuarioPerfilUsuario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado() 
				|| (this.perfilusuarioSessionBean.getEsGuardarRelacionado() && this.perfilusuarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPerfilUsuarioClasesRelacionadas();
			}
			
			if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPerfilUsuarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPerfilUsuario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPerfilUsuario();
			}
			
			if(!this.isPermisoBusquedaPerfilUsuario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPerfilUsuario,this.isPermisoPaginacionMedioPerfilUsuario,this.isPermisoPaginacionTodoPerfilUsuario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PerfilUsuarioConstantesFunciones.getTiposSeleccionarPerfilUsuario());
				
				this.tiposColumnasSelect=PerfilUsuarioConstantesFunciones.getTiposSeleccionarPerfilUsuario(true);
				
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
			//if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPerfilUsuario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPerfilUsuario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPerfilUsuario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilUsuario() ;
			
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
			
			this.perfilLogic=new PerfilLogic();
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
				perfilusuarioImplementable= (PerfilUsuarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				perfilusuarioImplementableHome= (PerfilUsuarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.perfilusuarios= new ArrayList<PerfilUsuario>();
			this.perfilusuariosEliminados= new ArrayList<PerfilUsuario>();
						
			this.isEsNuevoPerfilUsuario=false;
			this.esParaAccionDesdeFormularioPerfilUsuario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idUsuarioActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.perfilsForeignKey=new ArrayList<Perfil>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPerfilUsuario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPerfilUsuario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PerfilUsuarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PerfilUsuarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPerfilUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPerfilUsuario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPerfilUsuario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPerfilUsuario();
			}
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPerfilUsuario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPerfilUsuario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPerfilUsuario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPerfilUsuario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PerfilUsuario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPerfilUsuario() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPerfilUsuario")) {
				iIndex=this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPerfilUsuario();	
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
	
	public void cargarCombosForeignKeyPerfilUsuario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPerfilUsuario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPerfilUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPerfilUsuarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPerfilUsuario();
		
		this.cargarCombosFrameForeignKeyPerfilUsuario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPerfilUsuario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPerfilUsuario();
		}
	}
	
	

	public void cargarCombosForeignKeyPerfil(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPerfil();
				this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPerfil(this.perfilsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPerfilUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
			
			if(jTableDatosPerfilUsuario.getRowCount()>=1) {
				jTableDatosPerfilUsuario.removeRowSelectionInterval(0, jTableDatosPerfilUsuario.getRowCount()-1);						
			}
			
			this.isEsNuevoPerfilUsuario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPerfilUsuario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPerfilUsuario(true);			
			//this.perfilusuario=new PerfilUsuario();
			//this.perfilusuario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilUsuario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilUsuario() ;
			
			if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilUsuario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.perfilusuario);	
			this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);				
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
			if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PerfilUsuario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPerfilUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPerfilUsuario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPerfilUsuario.getSelectedRows().length;			
			}
			
			perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPerfilUsuario--;			
				//PerfilUsuario perfilusuarioAux= new PerfilUsuario();			
				//perfilusuarioAux.setId(this.iIdNuevoPerfilUsuario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PerfilUsuario perfilusuarioOrigen=new PerfilUsuario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PerfilUsuario perfilusuarioOrigen : perfilusuariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							perfilusuarioOrigen =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilusuarioOrigen =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPerfilUsuario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.perfilusuario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPerfilUsuario(perfilusuarioOrigen,this.perfilusuario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilusuarioLogic.getPerfilUsuarios().add(this.perfilusuarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfilusuarios.add(this.perfilusuarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPerfilUsuario(false);
				
				this.jTableDatosPerfilUsuario.setRowSelectionInterval(this.getIndiceNuevoPerfilUsuario(), this.getIndiceNuevoPerfilUsuario());
				
				int iLastRow =  this.jTableDatosPerfilUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfilUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfilUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilUsuario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();									
		
			PerfilUsuario perfilusuarioOrigen=new PerfilUsuario();
			PerfilUsuario perfilusuarioDestino=new PerfilUsuario();
				
			perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPerfilUsuario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || perfilusuariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPerfilUsuario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuarioOrigen =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilusuarioOrigen =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilusuarioDestino =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilusuarioDestino =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				perfilusuarioOrigen =perfilusuariosSeleccionados.get(0);
				perfilusuarioDestino =perfilusuariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPerfilUsuario(perfilusuarioOrigen,perfilusuarioDestino,true,false);
				
				perfilusuarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilusuarioDestino,perfilusuarioLogic.getPerfilUsuarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilusuarioDestino,perfilusuarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPerfilUsuario(false);
				
				//this.jTableDatosPerfilUsuario.setRowSelectionInterval(this.getIndiceNuevoPerfilUsuario(), this.getIndiceNuevoPerfilUsuario());
				
				int iLastRow =  this.jTableDatosPerfilUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfilUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfilUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilUsuario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPerfilUsuario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPerfilUsuario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPerfilUsuario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPerfilUsuario.setVisible(!isVisible);
			this.jPanelPaginacionPerfilUsuario.setVisible(!isVisible);
			this.jPanelAccionesPerfilUsuario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePerfilUsuario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPerfilUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPerfilUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPerfilUsuario();
			
			this.abrirFrameOrderByPerfilUsuario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPerfilUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePerfilUsuario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfilUsuario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPerfilUsuario.isMaximum()) {
					this.jInternalFrameDetalleFormPerfilUsuario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPerfilUsuario.setSize(this.jInternalFrameDetalleFormPerfilUsuario.iWidthFormulario,this.jInternalFrameDetalleFormPerfilUsuario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPerfilUsuario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPerfilUsuario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPerfilUsuario.isMaximum()) {
						this.jInternalFrameDetalleFormPerfilUsuario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPerfilUsuario.jContentPaneDetallePerfilUsuario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPerfilUsuario.jContentPaneDetallePerfilUsuario.getWidth(),PerfilUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPerfilUsuario.jContentPaneDetallePerfilUsuario.getWidth(),PerfilUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPerfilUsuario.jContentPaneDetallePerfilUsuario.getWidth(),PerfilUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPerfilUsuario.setVisible(true);
	        this.jInternalFrameDetalleFormPerfilUsuario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPerfilUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPerfilUsuario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPerfilUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilUsuario,false,this);
				} else {
					this.jInternalFrameOrderByPerfilUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilUsuario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPerfilUsuario);
				this.jInternalFrameOrderByPerfilUsuario.setVisible(false);
				this.jInternalFrameOrderByPerfilUsuario.setSelected(false);
				
				this.jInternalFrameOrderByPerfilUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfilUsuario"));
				
				this.inicializarActualizarBindingTablaOrderByPerfilUsuario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPerfilUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPerfilUsuario==null) {
				
				this.jInternalFrameImportacionPerfilUsuario=new ImportacionJInternalFrame(PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfilUsuario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPerfilUsuario);
				this.jInternalFrameImportacionPerfilUsuario.setVisible(false);
				this.jInternalFrameImportacionPerfilUsuario.setSelected(false);


				this.jInternalFrameImportacionPerfilUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfilUsuario"));
				this.jInternalFrameImportacionPerfilUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfilUsuario"));
				this.jInternalFrameImportacionPerfilUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfilUsuario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPerfilUsuario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPerfilUsuario==null) {
				this.jInternalFrameReporteDinamicoPerfilUsuario=new ReporteDinamicoJInternalFrame(PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfilUsuario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfilUsuario);
				this.jInternalFrameReporteDinamicoPerfilUsuario.setVisible(false);
				this.jInternalFrameReporteDinamicoPerfilUsuario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPerfilUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilUsuario"));
				this.jInternalFrameReporteDinamicoPerfilUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilUsuario"));
				this.jInternalFrameReporteDinamicoPerfilUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilUsuario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilUsuario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePerfilUsuario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfilUsuario);
			
	       	this.jInternalFrameDetalleFormPerfilUsuario.setVisible(false);
	        this.jInternalFrameDetalleFormPerfilUsuario.setSelected(false);
			
			//this.jInternalFrameDetalleFormPerfilUsuario.dispose();
			//this.jInternalFrameDetalleFormPerfilUsuario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPerfilUsuario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPerfilUsuario.setVisible(true);
	        this.jInternalFrameReporteDinamicoPerfilUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPerfilUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPerfilUsuario.setVisible(true);
	        this.jInternalFrameImportacionPerfilUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPerfilUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPerfilUsuario.setVisible(true);
	        this.jInternalFrameOrderByPerfilUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPerfilUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPerfilUsuario.setVisible(false);
	        this.jInternalFrameOrderByPerfilUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPerfilUsuario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPerfilUsuario.setVisible(false);
	        this.jInternalFrameReporteDinamicoPerfilUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPerfilUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPerfilUsuario.setVisible(false);
	        this.jInternalFrameImportacionPerfilUsuario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPerfilUsuario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPerfilUsuario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPerfilUsuario(true);
			//this.isEsNuevoPerfilUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPerfilUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilUsuario(false) ;
			
			if(perfilusuarioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilUsuario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPerfilUsuarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPerfilUsuario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPerfilUsuario(true);
			//this.isEsNuevoPerfilUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.perfilusuario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPerfilUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPerfilUsuario(false) ;
			
			if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilUsuario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Usuario")) {
				if(!this.perfilusuarioConstantesFunciones.cargarid_usuarioPerfilUsuario) {
					this.cargarCombosUsuariosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPerfilUsuario(false,false);
					this.cargarCombosFrameUsuariosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_usuario (id);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPerfil(List<Perfil> perfilsForeignKey)throws Exception{
		TableColumn tableColumnPerfil=this.jTableDatosPerfilUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuario,PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL));
		TableCellEditor tableCellEditorPerfil =tableColumnPerfil.getCellEditor();

		PerfilTableCell perfilTableCellFk=(PerfilTableCell)tableCellEditorPerfil;

		if(perfilTableCellFk!=null) {
			perfilTableCellFk.setperfilsForeignKey(perfilsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//perfilTableCellFk.setRowActual(intSelectedRow);
			//perfilTableCellFk.setperfilsForeignKeyActual(perfilsForeignKey);
		//}


		if(perfilTableCellFk!=null) {
			perfilTableCellFk.RecargarPerfilsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	

	public void setCombosCodigoDesdeBusquedaid_usuario (Long id) throws Exception {
		this.setActualUsuarioForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPerfilUsuario(false);
			
			//if(!this.isEsNuevoPerfilUsuario) {								
				int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
				
			}
			
			if(this.permiteMantenimiento(this.perfilusuario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPerfilUsuario=true;
					this.inicializarActualizarBindingTablaPerfilUsuario(false);
					this.isEsNuevoPerfilUsuario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPerfilUsuario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPerfilUsuario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfilUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilUsuario(false);
				
				this.habilitarDeshabilitarControlesPerfilUsuario(false);
			
												
				
				if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePerfilUsuario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPerfilUsuarioActionPerformed(evt,perfilusuarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPerfilUsuario(this.perfilusuario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPerfilUsuario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,perfilusuarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.perfilusuario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				this.perfilusuario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				this.perfilusuario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.perfilusuario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PerfilUsuarioModel) this.jTableDatosPerfilUsuario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPerfilUsuario=true;
				this.inicializarActualizarBindingTablaPerfilUsuario(false);
				this.isEsNuevoPerfilUsuario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfilUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilUsuario(false);
				
				this.habilitarDeshabilitarControlesPerfilUsuario(false);
				
				
				
				if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePerfilUsuario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPerfilUsuario.getRowCount()>=1) {
				jTableDatosPerfilUsuario.removeRowSelectionInterval(0, jTableDatosPerfilUsuario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPerfilUsuario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPerfilUsuario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilUsuario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilUsuario(false) ;
			
			this.isEsNuevoPerfilUsuario=false;
			
			if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePerfilUsuario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPerfilUsuario(false);
				
				//SI ES MANUAL
				if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPerfilUsuario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPerfilUsuario--;			
			//PerfilUsuario perfilusuarioAux= new PerfilUsuario();			
			//perfilusuarioAux.setId(this.iIdNuevoPerfilUsuario);
			
			if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPerfilUsuario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
			
			this.perfilusuario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.perfilusuarioLogic.getPerfilUsuarios().add(this.perfilusuarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.perfilusuarios.add(this.perfilusuarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPerfilUsuario(false);
			
			this.jTableDatosPerfilUsuario.setRowSelectionInterval(this.getIndiceNuevoPerfilUsuario(), this.getIndiceNuevoPerfilUsuario());
			
			int iLastRow =  this.jTableDatosPerfilUsuario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPerfilUsuario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPerfilUsuario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPerfilUsuario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPerfilUsuario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilUsuario(false);
			
			//SI ES MANUAL
			if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilUsuario();
			}
			
			//this.abrirFrameTreePerfilUsuario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Usuarios Perfiles S ?", "MANTENIMIENTO DE Usuarios Perfiles ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPerfilUsuario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPerfilUsuario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.perfilusuarioReturnGeneral=perfilusuarioLogic.procesarImportacionPerfilUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.perfilusuarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPerfilUsuarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPerfilUsuario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPerfilUsuario.setFileImportacion(this.jInternalFrameImportacionPerfilUsuario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPerfilUsuario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPerfilUsuario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPerfilUsuario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPerfilUsuario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		

		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PerfilUsuarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PerfilUsuarioBaseDesign.jrxml";
			
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
			
			this.generarReportePerfilUsuarios("Todos",perfilusuariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Perfil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Perfil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Perfil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Perfil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilUsuarioConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPerfilUsuario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoria="id_perfil";
					break;

				case PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case PerfilUsuarioConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoriaValor="id_perfil";
					break;

				case PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case PerfilUsuarioConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_perfil");
					break;

				case PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case PerfilUsuarioConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
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
	
	public void jButtonGenerarExcelReporteDinamicoPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilusuario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PerfilUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL);
					iRow++;

					for(PerfilUsuario perfilusuario:perfilusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilusuario.getperfil_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(PerfilUsuario perfilusuario:perfilusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilusuario.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilUsuarioConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(PerfilUsuario perfilusuario:perfilusuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilusuario.getestado());
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
			//	this.getFilaCabeceraExportarExcelPerfilUsuario(row);				
			//	iRow++;
			//}				
			
			//for(PerfilUsuario perfilusuarioAux:perfilusuariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPerfilUsuario(perfilusuarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
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
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilUsuario(false);
			
			//SI ES MANUAL
			if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilUsuario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilUsuario(false);
			
			//SI ES MANUAL
			if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfilUsuario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilUsuario(false);
			
			//SI ES MANUAL
			if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfilUsuario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPerfilUsuario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPerfilUsuario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPerfilUsuario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPerfilUsuario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPerfilUsuario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPerfilUsuario.setMinimumSize(dimensionMinimum);
		this.jTableDatosPerfilUsuario.setMaximumSize(dimensionMaximum);
		this.jTableDatosPerfilUsuario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPerfilUsuario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPerfilUsuario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPerfilUsuario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPerfilUsuario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPerfilUsuario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPerfilUsuario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilUsuario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPerfilUsuario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPerfilUsuario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPerfilUsuario();
		
		this.inicializarActualizarBindingBotonesManualPerfilUsuario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPerfilUsuario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilUsuario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilUsuario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilUsuario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPerfilUsuario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPerfilUsuario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePerfilUsuario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxPostAccionNuevoPerfilUsuario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxPostAccionSinCerrarPerfilUsuario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxPostAccionSinMensajePerfilUsuario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPerfilUsuario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPerfilUsuario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePerfilUsuario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
				this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxPostAccionNuevoPerfilUsuario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxPostAccionSinCerrarPerfilUsuario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxPostAccionSinMensajePerfilUsuario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPerfilUsuario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPerfilUsuario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPerfilUsuario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPerfilUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPerfilUsuario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPerfilUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPerfilUsuario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPerfilUsuario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPerfilUsuario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPerfilUsuario(Boolean esInicializar) throws Exception {
		try	{	
			if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilUsuario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPerfilUsuario() throws Exception {
		try	{
			if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfilUsuario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfilUsuario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfilUsuario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPerfilUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPerfilUsuario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPerfilUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPerfilUsuario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPerfilUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPerfilUsuario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPerfilUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPerfilUsuario.addItem(reporte);
			}
			
			
			if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPerfilUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPerfilUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPerfilUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPerfilUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPerfilUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPerfilUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPerfilUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPerfilUsuario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPerfilUsuario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilUsuario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilUsuario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
				this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
				this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfilUsuario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
				
				if(this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfilUsuario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPerfilUsuario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfilUsuario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfilUsuario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPerfilUsuario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_perfilFK_IdPerfilPerfilUsuario.getSelectedItem()!=null){this.id_perfilFK_IdPerfil=((Perfil)this.jComboBoxid_perfilFK_IdPerfilPerfilUsuario.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPerfilUsuario(Boolean esInicializar) throws Exception {				
		if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPerfilUsuario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPerfilUsuario() throws Exception {
		this.inicializarActualizarBindingTablaPerfilUsuario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPerfilUsuario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PerfilUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PerfilUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPerfilUsuarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PerfilUsuarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PerfilUsuarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPerfilUsuario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=perfilusuarioLogic.getPerfilUsuarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=perfilusuarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPerfilUsuario.setModel(new PerfilUsuarioModel(this.perfilusuarioLogic.getPerfilUsuarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPerfilUsuario.setModel(new PerfilUsuarioModel(this.perfilusuarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPerfilUsuario!=null && this.jInternalFrameOrderByPerfilUsuario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPerfilUsuario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPerfilUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PerfilUsuarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO,perfilusuarioConstantesFunciones.resaltarSeleccionarPerfilUsuario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PerfilUsuarioConstantesFunciones.SCLASSWEBTITULO,perfilusuarioConstantesFunciones.resaltarSeleccionarPerfilUsuario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPerfilUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuario,PerfilUsuarioConstantesFunciones.LABEL_ID));

		if(this.perfilusuarioConstantesFunciones.mostraridPerfilUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilUsuarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.perfilusuarioConstantesFunciones.resaltaridPerfilUsuario,this.perfilusuarioConstantesFunciones.activaridPerfilUsuario,this,true,"idPerfilUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.perfilusuarioConstantesFunciones.resaltaridPerfilUsuario,this.perfilusuarioConstantesFunciones.activaridPerfilUsuario,this,true,"idPerfilUsuario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuario,PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL));

		if(this.perfilusuarioConstantesFunciones.mostrarid_perfilPerfilUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PerfilTableCell(this.perfilsForeignKey,this.perfilusuarioConstantesFunciones.resaltarid_perfilPerfilUsuario,this,this.perfilusuarioConstantesFunciones.activarid_perfilPerfilUsuario));
			tableColumn.setCellEditor(new PerfilTableCell(this.perfilsForeignKey,this.perfilusuarioConstantesFunciones.resaltarid_perfilPerfilUsuario,this,this.perfilusuarioConstantesFunciones.activarid_perfilPerfilUsuario,true,"id_perfilPerfilUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuario,PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO));

		if(this.perfilusuarioConstantesFunciones.mostrarid_usuarioPerfilUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.perfilusuarioConstantesFunciones.resaltarid_usuarioPerfilUsuario,this,this.perfilusuarioConstantesFunciones.activarid_usuarioPerfilUsuario));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.perfilusuarioConstantesFunciones.resaltarid_usuarioPerfilUsuario,this,this.perfilusuarioConstantesFunciones.activarid_usuarioPerfilUsuario,false,"id_usuarioPerfilUsuario","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuario,PerfilUsuarioConstantesFunciones.LABEL_ESTADO));

		if(this.perfilusuarioConstantesFunciones.mostrarestadoPerfilUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilUsuarioConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilusuarioConstantesFunciones.resaltarestadoPerfilUsuario,this.perfilusuarioConstantesFunciones.activarestadoPerfilUsuario));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilusuarioConstantesFunciones.resaltarestadoPerfilUsuario,this.perfilusuarioConstantesFunciones.activarestadoPerfilUsuario,this,true,"estadoPerfilUsuario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilusuarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilusuarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfilUsuario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilusuarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilusuarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfilUsuario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.perfilusuarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.perfilusuarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPerfilUsuario.addColumn(tableColumn);
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
			
			this.jTableDatosPerfilUsuario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPerfilUsuario.moveColumn(this.jTableDatosPerfilUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPerfilUsuario.moveColumn(this.jTableDatosPerfilUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPerfilUsuario.moveColumn(this.jTableDatosPerfilUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPerfilUsuario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPerfilUsuario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPerfilUsuario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPerfilUsuario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPerfilUsuario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPerfilUsuario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPerfilUsuario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPerfilUsuario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=perfilusuarioLogic.getPerfilUsuarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=perfilusuarios.size()-1;
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
		//this.jTableDatosPerfilUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPerfilUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPerfilUsuario();
			
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
				
				//this.isEsNuevoPerfilUsuario=false;
					
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
				if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPerfilUsuario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfilUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfilUsuario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.perfilusuario.getsType().equals("DUPLICADO")
				   || this.perfilusuario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPerfilUsuario=true;
				
				} else {
					this.isEsNuevoPerfilUsuario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
					if(this.perfilusuario.getId()>=0 && !this.perfilusuario.getIsNew()) {						
						this.isEsNuevoPerfilUsuario=false;
						
					} else {
						this.isEsNuevoPerfilUsuario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPerfilUsuario(esRelaciones);						
				
				this.seleccionarPerfilUsuario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.perfilusuario.getId()<0) {
					this.isEsNuevoPerfilUsuario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPerfilUsuario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPerfilUsuario(evt,rowIndex);
				}	
				
				if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PerfilUsuario: " + this.dDif); 
					}
				}								
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPerfilUsuario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.perfilusuario)) {
					if(this.perfilusuario.getId()>0) {
						this.perfilusuario.setIsDeleted(true);
						
						this.perfilusuariosEliminados.add(this.perfilusuario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilusuarioLogic.getPerfilUsuarios().remove(this.perfilusuario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfilusuarios.remove(this.perfilusuario);				
					}
					
					
					((PerfilUsuarioModel) this.jTableDatosPerfilUsuario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilUsuario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPerfilUsuario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPerfilUsuario) {
			
			if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfilUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfilUsuario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPerfilUsuario(this.perfilusuario);
				}
				
				//ARCHITECTURE
				try {
					

					//Perfil
					if(!this.perfilusuarioConstantesFunciones.cargarid_perfilPerfilUsuario || this.perfilusuarioConstantesFunciones.event_dependid_perfilPerfilUsuario) {
						//this.cargarCombosPerfilsForeignKeyLista(" where id="+this.perfilusuario.getid_perfil());
									//this.inicializarActualizarBindingPerfilUsuario(false,false);
						this.perfilsForeignKey=new ArrayList<Perfil>();

						if(perfilusuario.getPerfil()!=null) {
							this.perfilsForeignKey.add(perfilusuario.getPerfil());
						}

						this.addItemDefectoCombosForeignKeyPerfil();
						this.cargarCombosFramePerfilsForeignKey("Todos");
					}
					this.setActualPerfilForeignKey(this.perfilusuario.getid_perfil(),false,"Formulario");

					//Usuario
					if(!this.perfilusuarioConstantesFunciones.cargarid_usuarioPerfilUsuario || this.perfilusuarioConstantesFunciones.event_dependid_usuarioPerfilUsuario) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.perfilusuario.getid_usuario());
									//this.inicializarActualizarBindingPerfilUsuario(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(perfilusuario.getUsuario()!=null) {
							this.usuariosForeignKey.add(perfilusuario.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.perfilusuario.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPerfilUsuario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPerfilUsuario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilUsuario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfilUsuario(PerfilUsuario perfilusuario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPerfilUsuario(perfilusuario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfilUsuario(PerfilUsuario perfilusuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPerfilUsuario(perfilusuario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPerfilUsuario(perfilusuario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPerfilUsuario(perfilusuario);
	}
	
	public void setVariablesObjetoActualToFormularioPerfilUsuario(PerfilUsuario perfilusuario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.setText(perfilusuario.getId().toString());
			this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.setSelected(perfilusuario.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PerfilUsuario perfilusuarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,perfilusuarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PerfilUsuario perfilusuarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				perfilusuarioLocal=this.perfilusuario;
			} else {
				perfilusuarioLocal=this.perfilusuarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(perfilusuarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPerfilUsuario(perfilusuarioLocal,true);
					
					if(perfilusuarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(perfilusuarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(perfilusuarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPerfilUsuario(PerfilUsuario perfilusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfilUsuario(perfilusuario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(perfilusuario);
	}
	
	public void setVariablesFormularioToObjetoActualPerfilUsuario(PerfilUsuario perfilusuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfilUsuario(perfilusuario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPerfilUsuario(PerfilUsuario perfilusuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.getText()==null || this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.getText()=="" || this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.getText()=="Id") {
				this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.setText("0");
			}

			if(conColumnasBase) {perfilusuario.setId(Long.parseLong(this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilUsuarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilUsuario.jLabelIdPerfilUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilusuario.setestado(this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilUsuarioConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilUsuario.jLabelestadoPerfilUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfilUsuario(PerfilUsuario perfilusuarioBean,PerfilUsuario perfilusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && perfilusuarioBean.getid_perfil()!=null && !perfilusuarioBean.getid_perfil().equals(-1L))) {perfilusuario.setid_perfil(perfilusuarioBean.getid_perfil());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPerfilUsuario(PerfilUsuario perfilusuarioOrigen,PerfilUsuario perfilusuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilusuarioOrigen.getId()!=null && !perfilusuarioOrigen.getId().equals(0L))) {perfilusuario.setId(perfilusuarioOrigen.getId());}}
			if(conDefault || (!conDefault && perfilusuarioOrigen.getid_perfil()!=null && !perfilusuarioOrigen.getid_perfil().equals(-1L))) {perfilusuario.setid_perfil(perfilusuarioOrigen.getid_perfil());}
			if(conDefault || (!conDefault && perfilusuarioOrigen.getestado()!=null && !perfilusuarioOrigen.getestado().equals(false))) {perfilusuario.setestado(perfilusuarioOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfilUsuario(PerfilUsuario perfilusuario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.setText(perfilusuario.getId().toString());
			this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.setSelected(perfilusuario.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfilUsuario(PerfilUsuarioBean perfilusuarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.setText(perfilusuarioBean.getId().toString());
			this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.setSelected(perfilusuarioBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPerfilUsuario(PerfilUsuarioParameterReturnGeneral perfilusuarioReturnGeneral,PerfilUsuarioBean perfilusuarioBean,Boolean conDefault) throws Exception { 
		try {
			PerfilUsuario perfilusuarioLocal=new PerfilUsuario();
			
			perfilusuarioLocal=perfilusuarioReturnGeneral.getPerfilUsuario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilusuarioLocal.getId()!=null && !perfilusuarioLocal.getId().equals(0L))) {perfilusuarioBean.setId(perfilusuarioLocal.getId());}}
			if(conDefault || (!conDefault && perfilusuarioLocal.getid_perfil()!=null && !perfilusuarioLocal.getid_perfil().equals(-1L))) {perfilusuarioBean.setid_perfil(perfilusuarioLocal.getid_perfil());}
			if(conDefault || (!conDefault && perfilusuarioLocal.getestado()!=null && !perfilusuarioLocal.getestado().equals(false))) {perfilusuarioBean.setestado(perfilusuarioLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPerfilUsuarioGenerico(Long idPerfilUsuarioSeleccionado,JComboBox jComboBoxPerfilUsuario,List<PerfilUsuario> perfilusuariosLocal)throws Exception {
		try {
			PerfilUsuario  perfilusuarioTemp=null;

			for(PerfilUsuario perfilusuarioAux:perfilusuariosLocal) {
				if(perfilusuarioAux.getId()!=null && perfilusuarioAux.getId().equals(idPerfilUsuarioSeleccionado)) {
					perfilusuarioTemp=perfilusuarioAux;
					break;
				}
			}

			jComboBoxPerfilUsuario.setSelectedItem(perfilusuarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPerfilUsuarioGenerico(JComboBox jComboBoxPerfilUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilUsuario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPerfilUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilUsuario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPerfilUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPerfilUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPerfilUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilusuario=(PerfilUsuario) perfilusuarioLogic.getPerfilUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilusuario =(PerfilUsuario) perfilusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Perfil")) {
			//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
			if(!perfilusuario.getIsNew() && !perfilusuario.getIsChanged() && !perfilusuario.getIsDeleted()) {
				sDescripcion=perfilusuario.getperfil_descripcion();
			} else {
				//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
				sDescripcion=perfilusuario.getperfil_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!perfilusuario.getIsNew() && !perfilusuario.getIsChanged() && !perfilusuario.getIsDeleted()) {
				sDescripcion=perfilusuario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=perfilusuario.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PerfilUsuario perfilusuarioRow=new PerfilUsuario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilusuarioRow=(PerfilUsuario) perfilusuarioLogic.getPerfilUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilusuarioRow=(PerfilUsuario) perfilusuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPerfilUsuario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoPerfilUsuario && this.isPermisoNuevoPerfilUsuario));			
			this.jButtonDuplicarPerfilUsuario.setVisible((this.isVisibilidadCeldaDuplicarPerfilUsuario && this.isPermisoDuplicarPerfilUsuario));			
			this.jButtonCopiarPerfilUsuario.setVisible((this.isVisibilidadCeldaCopiarPerfilUsuario && this.isPermisoCopiarPerfilUsuario));
			this.jButtonVerFormPerfilUsuario.setVisible((this.isVisibilidadCeldaVerFormPerfilUsuario && this.isPermisoVerFormPerfilUsuario));
			
			this.jButtonAbrirOrderByPerfilUsuario.setVisible((this.isVisibilidadCeldaOrdenPerfilUsuario && this.isPermisoOrdenPerfilUsuario));			
			
			this.jButtonNuevoRelacionesPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario && this.isPermisoNuevoPerfilUsuario));			
			this.jButtonNuevoGuardarCambiosPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoPerfilUsuario && this.isPermisoNuevoPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));
			
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarPerfilUsuario.setVisible((this.isVisibilidadCeldaModificarPerfilUsuario && this.isPermisoActualizarPerfilUsuario));	
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarPerfilUsuario.setVisible((this.isVisibilidadCeldaActualizarPerfilUsuario && this.isPermisoActualizarPerfilUsuario));	
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarPerfilUsuario.setVisible((this.isVisibilidadCeldaEliminarPerfilUsuario && this.isPermisoEliminarPerfilUsuario));
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarPerfilUsuario.setVisible(this.isVisibilidadCeldaCancelarPerfilUsuario);							
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosPerfilUsuario.setVisible((this.isVisibilidadCeldaGuardarPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));			
			
			}
						
			this.jButtonGuardarCambiosTablaPerfilUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoPerfilUsuario && this.isPermisoNuevoPerfilUsuario));						
			this.jButtonDuplicarToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaDuplicarPerfilUsuario && this.isPermisoDuplicarPerfilUsuario));						
			this.jButtonCopiarToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaCopiarPerfilUsuario && this.isPermisoCopiarPerfilUsuario));			
			this.jButtonVerFormToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaVerFormPerfilUsuario && this.isPermisoVerFormPerfilUsuario));			
			this.jButtonAbrirOrderByToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaOrdenPerfilUsuario && this.isPermisoOrdenPerfilUsuario));
			this.jButtonNuevoRelacionesToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario && this.isPermisoNuevoPerfilUsuario));			
			this.jButtonNuevoGuardarCambiosToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoPerfilUsuario && this.isPermisoNuevoPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));			
			
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaModificarPerfilUsuario && this.isPermisoActualizarPerfilUsuario));	
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaActualizarPerfilUsuario  && this.isPermisoActualizarPerfilUsuario));	
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaEliminarPerfilUsuario && this.isPermisoEliminarPerfilUsuario));
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarToolBarPerfilUsuario.setVisible(this.isVisibilidadCeldaCancelarPerfilUsuario);				
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaGuardarPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPerfilUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoPerfilUsuario && this.isPermisoNuevoPerfilUsuario));			
			this.jMenuItemDuplicarPerfilUsuario.setVisible((this.isVisibilidadCeldaDuplicarPerfilUsuario && this.isPermisoDuplicarPerfilUsuario));			
			this.jMenuItemCopiarPerfilUsuario.setVisible((this.isVisibilidadCeldaCopiarPerfilUsuario && this.isPermisoCopiarPerfilUsuario));			
			this.jMenuItemVerFormPerfilUsuario.setVisible((this.isVisibilidadCeldaVerFormPerfilUsuario && this.isPermisoVerFormPerfilUsuario));			
			this.jMenuItemAbrirOrderByPerfilUsuario.setVisible((this.isVisibilidadCeldaOrdenPerfilUsuario && this.isPermisoOrdenPerfilUsuario));			
			//this.jMenuItemMostrarOcultarPerfilUsuario.setVisible((this.isVisibilidadCeldaOrdenPerfilUsuario && this.isPermisoOrdenPerfilUsuario));
			this.jMenuItemDetalleAbrirOrderByPerfilUsuario.setVisible((this.isVisibilidadCeldaOrdenPerfilUsuario && this.isPermisoOrdenPerfilUsuario));			
			//this.jMenuItemDetalleMostrarOcultarPerfilUsuario.setVisible((this.isVisibilidadCeldaOrdenPerfilUsuario && this.isPermisoOrdenPerfilUsuario));			
			this.jMenuItemNuevoRelacionesPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario && this.isPermisoNuevoPerfilUsuario));			
			this.jMenuItemNuevoGuardarCambiosPerfilUsuario.setVisible((this.isVisibilidadCeldaNuevoPerfilUsuario && this.isPermisoNuevoPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));									
			
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemModificarPerfilUsuario.setVisible((this.isVisibilidadCeldaModificarPerfilUsuario && this.isPermisoActualizarPerfilUsuario));	
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemActualizarPerfilUsuario.setVisible((this.isVisibilidadCeldaActualizarPerfilUsuario && this.isPermisoActualizarPerfilUsuario));	
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemEliminarPerfilUsuario.setVisible((this.isVisibilidadCeldaEliminarPerfilUsuario && this.isPermisoEliminarPerfilUsuario));
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemCancelarPerfilUsuario.setVisible(this.isVisibilidadCeldaCancelarPerfilUsuario);				
			}
			
			this.jMenuItemGuardarCambiosPerfilUsuario.setVisible((this.isVisibilidadCeldaGuardarPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));						
			this.jMenuItemGuardarCambiosTablaPerfilUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPerfilUsuario=this.jButtonNuevoPerfilUsuario.isVisible();
			this.isVisibilidadCeldaDuplicarPerfilUsuario=this.jButtonDuplicarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaCopiarPerfilUsuario=this.jButtonCopiarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaVerFormPerfilUsuario=this.jButtonVerFormPerfilUsuario.isVisible();
			
			this.isVisibilidadCeldaOrdenPerfilUsuario=this.jButtonAbrirOrderByPerfilUsuario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=this.jButtonNuevoRelacionesPerfilUsuario.isVisible();
			this.isVisibilidadCeldaModificarPerfilUsuario=this.jButtonModificarPerfilUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			this.isVisibilidadCeldaActualizarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaEliminarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaCancelarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaGuardarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosPerfilUsuario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=this.jButtonGuardarCambiosTablaPerfilUsuario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPerfilUsuario=this.jButtonNuevoToolBarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=this.jButtonNuevoRelacionesToolBarPerfilUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			this.isVisibilidadCeldaModificarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarToolBarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaActualizarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarToolBarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaEliminarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarToolBarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaCancelarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarToolBarPerfilUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfilUsuario=this.jButtonGuardarCambiosToolBarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=this.jButtonGuardarCambiosTablaToolBarPerfilUsuario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPerfilUsuario=this.jMenuItemNuevoPerfilUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=this.jMenuItemNuevoRelacionesPerfilUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			this.isVisibilidadCeldaModificarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemModificarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaActualizarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemActualizarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaEliminarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemEliminarPerfilUsuario.isVisible();
			this.isVisibilidadCeldaCancelarPerfilUsuario=this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemCancelarPerfilUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfilUsuario=this.jMenuItemGuardarCambiosPerfilUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=this.jMenuItemGuardarCambiosTablaPerfilUsuario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPerfilUsuario(Boolean esInicializar) {
		if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
				//if(this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPerfilUsuario();
			}
			
			this.inicializarActualizarBindingBotonesManualPerfilUsuario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPerfilUsuario() {
		this.jButtonNuevoPerfilUsuario.setVisible(this.isPermisoNuevoPerfilUsuario);			
		this.jButtonDuplicarPerfilUsuario.setVisible(this.isPermisoDuplicarPerfilUsuario);			
		this.jButtonCopiarPerfilUsuario.setVisible(this.isPermisoCopiarPerfilUsuario);			
		this.jButtonVerFormPerfilUsuario.setVisible(this.isPermisoVerFormPerfilUsuario);			
		
		this.jButtonAbrirOrderByPerfilUsuario.setVisible(this.isPermisoOrdenPerfilUsuario);					
		
		this.jButtonNuevoRelacionesPerfilUsuario.setVisible(this.isPermisoNuevoPerfilUsuario);			
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarPerfilUsuario.setVisible(this.isPermisoActualizarPerfilUsuario);	
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarPerfilUsuario.setVisible(this.isPermisoActualizarPerfilUsuario);	
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarPerfilUsuario.setVisible(this.isPermisoEliminarPerfilUsuario);
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarPerfilUsuario.setVisible(this.isVisibilidadCeldaCancelarPerfilUsuario);						
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosPerfilUsuario.setVisible(this.isPermisoGuardarCambiosPerfilUsuario);							
		}
		
		this.jButtonGuardarCambiosTablaPerfilUsuario.setVisible(this.isPermisoActualizarPerfilUsuario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePerfilUsuario() {
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarPerfilUsuario.setVisible(this.isPermisoActualizarPerfilUsuario);	
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarPerfilUsuario.setVisible(this.isPermisoActualizarPerfilUsuario);	
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarPerfilUsuario.setVisible(this.isPermisoEliminarPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarPerfilUsuario.setVisible(this.isVisibilidadCeldaCancelarPerfilUsuario);							
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosPerfilUsuario.setVisible((this.isVisibilidadCeldaGuardarPerfilUsuario && this.isPermisoGuardarCambiosPerfilUsuario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPerfilUsuario() {
		if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPerfilUsuario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPerfilUsuario() {
	}
	
	public void jTableDatosPerfilUsuarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPerfilUsuario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPerfilUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.getperfilusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilusuario==null) {
						this.perfilusuario = new PerfilUsuario();
					}

					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
				}

				if(this.perfilusuario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.perfilusuario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_perfilPerfilUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperfil=true;

			idTienePermisoperfil=this.tienePermisosUsuarioEnPaginaWebPerfilUsuario(PerfilConstantesFunciones.CLASSNAME);

			if(idTienePermisoperfil) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilUsuario(this.getperfilusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);

				this.perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.perfilBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.perfilBeanSwingJInternalFrame.getPerfilLogic().setConnexion(this.perfilusuarioLogic.getConnexion());

				if(this.perfilusuario.getid_perfil()!=null) {
					this.perfilBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.perfilBeanSwingJInternalFrame.setIdActual(this.perfilusuario.getid_perfil());
					this.perfilBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfil();
				}

				JInternalFrameBase jinternalFrame =this.perfilBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilUsuario=(TitledBorder)this.jScrollPanelDatosPerfilUsuario.getBorder();
				TitledBorder titledBorderperfil=(TitledBorder)this.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getBorder();

				titledBorderperfil.setTitle(titledBorderPerfilUsuario.getTitle() + " -> Perfil");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_perfilPerfilUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.getperfilusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilusuario==null) {
						this.perfilusuario = new PerfilUsuario();
					}

					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
				}

				if(this.perfilusuario.getid_perfil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_perfil = "+this.perfilusuario.getid_perfil().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioPerfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="Usuario";

			if(!this.sFinalQueryGeneral_usuario.equals("")) {
				this.usuarioBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_usuario);
				this.usuarioBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.usuarioBeanSwingJInternalFrame.procesarBusqueda(this.usuarioBeanSwingJInternalFrame.sAccionBusqueda);
				this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingUsuario(false);
			}

			if(!this.sFinalQueryComboUsuario.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPerfilUsuario=null;
			TitledBorder titledBorderusuario=null;

			if(!this.jScrollPanelDatosPerfilUsuario.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPerfilUsuario=(TitledBorder)this.jScrollPanelDatosPerfilUsuario.getBorder();
				titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderPerfilUsuario.getTitle() + " -> Usuario");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_usuarioPerfilUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebPerfilUsuario(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilUsuario(this.getperfilusuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.perfilusuarioLogic.getConnexion());

				if(this.perfilusuario.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.perfilusuario.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilUsuario=(TitledBorder)this.jScrollPanelDatosPerfilUsuario.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderPerfilUsuario.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioPerfilUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.getperfilusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilusuario==null) {
						this.perfilusuario = new PerfilUsuario();
					}

					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
				}

				if(this.perfilusuario.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.perfilusuario.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoPerfilUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.getperfilusuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilusuario==null) {
						this.perfilusuario = new PerfilUsuario();
					}

					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);
				}

				if(this.perfilusuario.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.perfilusuario.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPerfilPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilUsuario(false,false);

			this.getPerfilUsuariosFK_IdPerfil();

			this.inicializarActualizarBindingPerfilUsuario(false);

			//if(PerfilUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioPerfilUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilUsuario(false,false);

			this.getPerfilUsuariosFK_IdUsuario();

			this.inicializarActualizarBindingPerfilUsuario(false);

			//if(PerfilUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilusuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePerfilUsuario() {
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
			this.jInternalFrameDetalleFormPerfilUsuario.setVisible(false);	    			
			this.jInternalFrameDetalleFormPerfilUsuario.dispose();
			this.jInternalFrameDetalleFormPerfilUsuario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
			this.jInternalFrameReporteDinamicoPerfilUsuario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPerfilUsuario.dispose();
			this.jInternalFrameReporteDinamicoPerfilUsuario=null;
		}
		
		if(this.jInternalFrameImportacionPerfilUsuario!=null) {
			this.jInternalFrameImportacionPerfilUsuario.setVisible(false);	    			
			this.jInternalFrameImportacionPerfilUsuario.dispose();
			this.jInternalFrameImportacionPerfilUsuario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPerfilUsuario();
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoPerfilUsuario")) {
				jButtonNuevoPerfilUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPerfilUsuario")) {
				jButtonDuplicarPerfilUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPerfilUsuario")) {
				jButtonCopiarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormPerfilUsuario")) {
				jButtonVerFormPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPerfilUsuario")) {
				jButtonNuevoPerfilUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPerfilUsuario")) {
				jButtonDuplicarPerfilUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPerfilUsuario")) {
				jButtonNuevoPerfilUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPerfilUsuario")) {
				jButtonDuplicarPerfilUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPerfilUsuario")) {
				jButtonNuevoPerfilUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPerfilUsuario")) {
				jButtonNuevoPerfilUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPerfilUsuario")) {
				jButtonNuevoPerfilUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPerfilUsuario")) {
				jButtonModificarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPerfilUsuario")) {
				jButtonModificarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPerfilUsuario")) {
				jButtonModificarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPerfilUsuario")) {
				jButtonActualizarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPerfilUsuario")) {
				jButtonActualizarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPerfilUsuario")) {
				jButtonActualizarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarPerfilUsuario")) {
				jButtonEliminarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPerfilUsuario")) {
				jButtonEliminarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPerfilUsuario")) {
				jButtonEliminarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarPerfilUsuario")) {
				jButtonCancelarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPerfilUsuario")) {
				jButtonCancelarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPerfilUsuario")) {
				jButtonCancelarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarPerfilUsuario")) {
				jButtonCerrarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPerfilUsuario")) {
				jButtonCerrarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPerfilUsuario")) {
				jButtonCerrarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPerfilUsuario")) {
				jButtonMostrarOcultarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPerfilUsuario")) {
				jButtonCancelarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPerfilUsuario")) {
				jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPerfilUsuario")) {
				jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPerfilUsuario")) {
				jButtonCopiarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPerfilUsuario")) {
				jButtonVerFormPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPerfilUsuario")) {
				jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPerfilUsuario")) {
				jButtonCopiarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPerfilUsuario")) {
				jButtonVerFormPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPerfilUsuario")) {
				jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPerfilUsuario")) {
				jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPerfilUsuario")) {
				jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPerfilUsuario")) {
				jButtonRecargarInformacionPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPerfilUsuario")) {
				jButtonRecargarInformacionPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPerfilUsuario")) {
				jButtonRecargarInformacionPerfilUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPerfilUsuario")) {
				jButtonAnterioresPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPerfilUsuario")) {
				jButtonAnterioresPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePerfilUsuario")) {
				jButtonAnterioresPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPerfilUsuario")) {
				jButtonSiguientesPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPerfilUsuario")) {
				jButtonSiguientesPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPerfilUsuario")) {
				jButtonSiguientesPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPerfilUsuario") || sTipo.equals("MenuItemDetalleAbrirOrderByPerfilUsuario")) {
				jButtonAbrirOrderByPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPerfilUsuario") || sTipo.equals("MenuItemDetalleMostrarOcultarPerfilUsuario")) {
				jButtonMostrarOcultarPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPerfilUsuario")) {
				jButtonNuevoGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPerfilUsuario")) {
				jButtonNuevoGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPerfilUsuario")) {
				jButtonNuevoGuardarCambiosPerfilUsuarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPerfilUsuario")) {
				jButtonCerrarReporteDinamicoPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPerfilUsuario")) {
				jButtonGenerarReporteDinamicoPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPerfilUsuario")) {
				
				jButtonGenerarExcelReporteDinamicoPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPerfilUsuario")) {
				jButtonCerrarImportacionPerfilUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPerfilUsuario")) {
				
				jButtonGenerarImportacionPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPerfilUsuario")) {
				
				jButtonAbrirImportacionPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPerfilUsuario")) {
				jComboBoxTiposAccionesPerfilUsuarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPerfilUsuario")) {
				jComboBoxTiposRelacionesPerfilUsuarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPerfilUsuario")) {
				jComboBoxTiposAccionesPerfilUsuarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPerfilUsuario")) {
				
				jComboBoxTiposSeleccionarPerfilUsuarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPerfilUsuario")) {
				jTextFieldValorCampoGeneralPerfilUsuarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPerfilUsuario")) {
				jButtonAbrirOrderByPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPerfilUsuario")) {
				jButtonAbrirOrderByPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPerfilUsuario")) {
				jButtonCerrarOrderByPerfilUsuarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilUsuarioBusqueda")) {
				this.jButtonidPerfilUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilPerfilUsuarioUpdate")) {
				this.jButtonid_perfilPerfilUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilPerfilUsuarioBusqueda")) {
				this.jButtonid_perfilPerfilUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_usuarioPerfilUsuario")) {
				this.jButtonid_usuarioPerfilUsuarioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioPerfilUsuarioUpdate")) {
				this.jButtonid_usuarioPerfilUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioPerfilUsuarioBusqueda")) {
				this.jButtonid_usuarioPerfilUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilUsuarioBusqueda")) {
				this.jButtonestadoPerfilUsuarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPerfilPerfilUsuario")) {
				this.jButtonFK_IdPerfilPerfilUsuarioActionPerformed(evt);
			}
			
			;
			
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPerfilUsuario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				


				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PerfilUsuario perfilusuarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				perfilusuarioLocal=this.perfilusuario;
			} else {
				perfilusuarioLocal=this.perfilusuarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
							
				
				


				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
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
			
			


			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
								
						
				


				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
								
				
				


				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
							
				
				


				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
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
			
			


			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilUsuarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
								
				
				


				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPerfilUsuario")) {
					jCheckBoxSeleccionarTodosPerfilUsuarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPerfilUsuario")) {
					jCheckBoxSeleccionadosPerfilUsuarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPerfilUsuario")) {
					
				}
				
				


				
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
												
				
				


				
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilUsuarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
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
			
			


			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilusuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilusuario);
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
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
				
				


				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilUsuario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilusuarioAnterior =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPerfilUsuario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPerfilUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPerfilUsuario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.perfilusuario =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.perfilusuario =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.perfilusuario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPerfilUsuario")) {
				
				}
				
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPerfilUsuario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPerfilUsuario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPerfilUsuario")) {
			
			}
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPerfilUsuario();
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
			if(sTipo.equals("NuevoPerfilUsuario")) {
				jButtonNuevoPerfilUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPerfilUsuario")) {
				jButtonDuplicarPerfilUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPerfilUsuario")) {
				jButtonCopiarPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPerfilUsuario")) {
				jButtonVerFormPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPerfilUsuario")) {
				jButtonNuevoPerfilUsuarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPerfilUsuario")) {
				jButtonModificarPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPerfilUsuario")) {
				jButtonActualizarPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPerfilUsuario")) {
				jButtonEliminarPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPerfilUsuario")) {
				jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPerfilUsuario")) {
				jButtonCancelarPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPerfilUsuario")) {
				jButtonCerrarPerfilUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPerfilUsuario")) {
				jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPerfilUsuario")) {
				jButtonNuevoGuardarCambiosPerfilUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPerfilUsuario")) {
				jButtonAbrirOrderByPerfilUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPerfilUsuario")) {
				jButtonRecargarInformacionPerfilUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPerfilUsuario")) {
				jButtonAnterioresPerfilUsuarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPerfilUsuario")) {
				jButtonSiguientesPerfilUsuarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilUsuarioBusqueda")) {
				this.jButtonidPerfilUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilPerfilUsuarioUpdate")) {
				this.jButtonid_perfilPerfilUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilPerfilUsuarioBusqueda")) {
				this.jButtonid_perfilPerfilUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_usuarioPerfilUsuario")) {
				this.jButtonid_usuarioPerfilUsuarioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioPerfilUsuarioUpdate")) {
				this.jButtonid_usuarioPerfilUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioPerfilUsuarioBusqueda")) {
				this.jButtonid_usuarioPerfilUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilUsuarioBusqueda")) {
				this.jButtonestadoPerfilUsuarioBusquedaActionPerformed(evt);
			}
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPerfilUsuario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePerfilUsuario")) {
				closingInternalFramePerfilUsuario();
				
			} else if(sTipo.equals("jButtonCancelarPerfilUsuario")) {
				JInternalFrameBase jInternalFrameDetalleFormPerfilUsuario = (JInternalFrameBase)evt.getSource();
	            	
	            PerfilUsuarioBeanSwingJInternalFrame jInternalFrameParent=(PerfilUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfilUsuario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPerfilUsuarioActionPerformed(null);
			}
			
			PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilusuario,new Object(),this.perfilusuarioParameterGeneral,this.perfilusuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPerfilUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPerfilUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPerfilUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.perfilusuario)) {
			if(!esControlTabla) {
				if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);			
				}
				
				if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPerfilUsuario(this.perfilusuario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilusuarioReturnGeneral=perfilusuarioLogic.procesarEventosPerfilUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilusuarioLogic.getPerfilUsuarios(),this.perfilusuario,this.perfilusuarioParameterGeneral,this.isEsNuevoPerfilUsuario,classes);//this.perfilusuarioLogic.getPerfilUsuario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPerfilUsuario(this.perfilusuarioReturnGeneral,this.perfilusuarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPerfilUsuario(classes,this.perfilusuarioReturnGeneral,this.perfilusuarioBean,false);
					}
						
					if(this.perfilusuarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPerfilUsuario(this.perfilusuarioReturnGeneral.getPerfilUsuario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPerfilUsuario(this.perfilusuarioReturnGeneral.getPerfilUsuario());	
					}
						
					if(this.perfilusuarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPerfilUsuario(this.perfilusuarioReturnGeneral.getPerfilUsuario(),classes);//this.perfilusuarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPerfilUsuario(this.perfilusuario,classes);//this.perfilusuarioBean);									
				}
			
				if(PerfilUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPerfilUsuario(this.perfilusuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilUsuario(this.perfilusuario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.perfilusuarioAnterior!=null) {
						this.perfilusuario=this.perfilusuarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilusuarioReturnGeneral=perfilusuarioLogic.procesarEventosPerfilUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilusuarioLogic.getPerfilUsuarios(),this.perfilusuario,this.perfilusuarioParameterGeneral,this.isEsNuevoPerfilUsuario,classes);//this.perfilusuarioLogic.getPerfilUsuario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilusuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilusuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.perfilusuarioReturnGeneral.getPerfilUsuario(),perfilusuarioLogic.getPerfilUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.perfilusuarioReturnGeneral.getPerfilUsuario(),this.perfilusuarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPerfilUsuario.repaint();
				
				//((AbstractTableModel) this.jTableDatosPerfilUsuario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPerfilUsuario();
			}
		}
	}
	
	public void actualizarVisualTableDatosPerfilUsuario() throws Exception {
		
		PerfilUsuarioModel perfilusuarioModel=(PerfilUsuarioModel)this.jTableDatosPerfilUsuario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilusuarioModel.perfilusuarios=this.perfilusuarioLogic.getPerfilUsuarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			perfilusuarioModel.perfilusuarios=this.perfilusuarios;
		}
		
		
		((PerfilUsuarioModel) this.jTableDatosPerfilUsuario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPerfilUsuario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperfilusuarioAnterior(),this.perfilusuarioLogic.getPerfilUsuarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperfilusuarioAnterior(),this.perfilusuarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPerfilUsuario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPerfilUsuario(PerfilUsuario perfilusuario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
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
										
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilusuario,new Object(),generalEntityParameterGeneral,this.perfilusuarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.perfilusuarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PerfilUsuarioConstantesFunciones.getClassesRelationshipsOfPerfilUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PerfilUsuarioConstantesFunciones.getClassesRelationshipsFromStringsOfPerfilUsuario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPerfilUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PerfilUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilusuario,new Object(),generalEntityParameterGeneral,this.perfilusuarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPerfilUsuario(PerfilUsuarioBean perfilusuarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPerfilUsuario(ArrayList<Classe> classes,PerfilUsuarioReturnGeneral perfilusuarioReturnGeneral,PerfilUsuarioBean perfilusuarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPerfilUsuario(PerfilUsuario perfilusuario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.perfilusuario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPerfilUsuario = new PerfilUsuarioDetalleFormJInternalFrame(jDesktopPane,this.perfilusuarioSessionBean.getConGuardarRelaciones(),this.perfilusuarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.setVisible(false);
		this.jInternalFrameDetalleFormPerfilUsuario.setSelected(false);						
		
		this.jInternalFrameDetalleFormPerfilUsuario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPerfilUsuario.perfilusuarioLogic=this.perfilusuarioLogic;
		
		this.cargarCombosFrameForeignKeyPerfilUsuario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePerfilUsuario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfilUsuario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPerfilUsuario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPerfilUsuario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPerfilUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfilUsuario"));
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarPerfilUsuario.addActionListener(new ButtonActionListener(this,"ModificarPerfilUsuario"));

		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarToolBarPerfilUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfilUsuario"));
					
		this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemModificarPerfilUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfilUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarPerfilUsuario.addActionListener (new ButtonActionListener(this,"ActualizarPerfilUsuario"));
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarToolBarPerfilUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfilUsuario"));
						
		this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemActualizarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfilUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarPerfilUsuario.addActionListener (new ButtonActionListener(this,"EliminarPerfilUsuario"));
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfilUsuario"));
								
		this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemEliminarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfilUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarPerfilUsuario.addActionListener (new ButtonActionListener(this,"CancelarPerfilUsuario"));
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfilUsuario"));
					
		this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemCancelarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfilUsuario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemDetalleCerrarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfilUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilUsuario"));
		
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilUsuario"));
		
		
		
		this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfilUsuario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonidPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_perfilPerfilUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_perfilPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilUsuarioBusqueda"));
		//jButtonid_usuarioPerfilUsuario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_usuarioPerfilUsuarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuario.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonestadoPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilUsuarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfilUsuario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePerfilUsuario"));
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfilUsuario"));
		}
		
		this.jTableDatosPerfilUsuario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPerfilUsuario"));
		
		this.jTableDatosPerfilUsuario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPerfilUsuario"));
		
		this.jButtonNuevoPerfilUsuario.addActionListener(new ButtonActionListener(this,"NuevoPerfilUsuario"));
		
		this.jButtonDuplicarPerfilUsuario.addActionListener(new ButtonActionListener(this,"DuplicarPerfilUsuario"));
		
		this.jButtonCopiarPerfilUsuario.addActionListener(new ButtonActionListener(this,"CopiarPerfilUsuario"));
		
		this.jButtonVerFormPerfilUsuario.addActionListener(new ButtonActionListener(this,"VerFormPerfilUsuario"));
		
		
		this.jButtonNuevoToolBarPerfilUsuario.addActionListener(new ButtonActionListener(this,"NuevoToolBarPerfilUsuario"));
			
		this.jButtonDuplicarToolBarPerfilUsuario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPerfilUsuario"));
			
		this.jMenuItemNuevoPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPerfilUsuario"));
			
		this.jMenuItemDuplicarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPerfilUsuario"));		
		
		
		this.jButtonNuevoRelacionesPerfilUsuario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPerfilUsuario"));
		
		
		this.jButtonNuevoRelacionesToolBarPerfilUsuario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPerfilUsuario"));
			
		this.jMenuItemNuevoRelacionesPerfilUsuario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPerfilUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarPerfilUsuario.addActionListener(new ButtonActionListener(this,"ModificarPerfilUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonModificarToolBarPerfilUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfilUsuario"));
			
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemModificarPerfilUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfilUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarPerfilUsuario.addActionListener (new ButtonActionListener(this,"ActualizarPerfilUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonActualizarToolBarPerfilUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfilUsuario"));
				
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemActualizarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfilUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarPerfilUsuario.addActionListener (new ButtonActionListener(this,"EliminarPerfilUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonEliminarToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfilUsuario"));
						
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemEliminarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfilUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarPerfilUsuario.addActionListener (new ButtonActionListener(this,"CancelarPerfilUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonCancelarToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfilUsuario"));
			
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemCancelarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfilUsuario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPerfilUsuario"));		
		
		
		this.jButtonCerrarPerfilUsuario.addActionListener (new ButtonActionListener(this,"CerrarPerfilUsuario"));
		
		
		this.jButtonCerrarToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"CerrarToolBarPerfilUsuario"));
			
		this.jMenuItemCerrarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPerfilUsuario"));
			
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jMenuItemDetalleCerrarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfilUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosPerfilUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosPerfilUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilUsuario"));
		}
		
		this.jButtonCopiarToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"CopiarToolBarPerfilUsuario"));
			
		this.jButtonVerFormToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"VerFormToolBarPerfilUsuario"));
		
		this.jMenuItemGuardarCambiosPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPerfilUsuario"));
			
		this.jMenuItemCopiarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPerfilUsuario"));		
		
		this.jMenuItemVerFormPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPerfilUsuario"));		
		
		
		this.jButtonGuardarCambiosTablaPerfilUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfilUsuario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPerfilUsuario"));
			
		this.jMenuItemGuardarCambiosTablaPerfilUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfilUsuario"));		
		
		
		
		this.jButtonRecargarInformacionPerfilUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionPerfilUsuario"));
					
		this.jButtonRecargarInformacionToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPerfilUsuario"));
		
		this.jMenuItemRecargarInformacionPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPerfilUsuario"));		
		
		
		
		this.jButtonAnterioresPerfilUsuario.addActionListener (new ButtonActionListener(this,"AnterioresPerfilUsuario"));
		
		
		this.jButtonAnterioresToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPerfilUsuario"));
		
		this.jMenuItemAnterioresPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPerfilUsuario"));		
		
		
		this.jButtonSiguientesPerfilUsuario.addActionListener (new ButtonActionListener(this,"SiguientesPerfilUsuario"));
		
		
		this.jButtonSiguientesToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPerfilUsuario"));
			
		this.jMenuItemSiguientesPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPerfilUsuario"));
			
		this.jMenuItemAbrirOrderByPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPerfilUsuario"));
			
		this.jMenuItemMostrarOcultarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPerfilUsuario"));
			
		this.jMenuItemDetalleAbrirOrderByPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPerfilUsuario"));
			
		this.jMenuItemDetalleMostarOcultarPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPerfilUsuario"));		
		
		
		this.jButtonNuevoGuardarCambiosPerfilUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPerfilUsuario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPerfilUsuario"));
			
		this.jMenuItemNuevoGuardarCambiosPerfilUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPerfilUsuario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPerfilUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPerfilUsuario"));

		this.jCheckBoxSeleccionadosPerfilUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPerfilUsuario"));
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfilUsuario"));
		}
		
		
		this.jComboBoxTiposRelacionesPerfilUsuario.addActionListener (new ButtonActionListener(this,"TiposRelacionesPerfilUsuario"));
			
		this.jComboBoxTiposAccionesPerfilUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesPerfilUsuario"));
					
		this.jComboBoxTiposSeleccionarPerfilUsuario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPerfilUsuario"));
			
		this.jTextFieldValorCampoGeneralPerfilUsuario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPerfilUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonidPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_perfilPerfilUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_perfilPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilUsuarioBusqueda"));
		//jButtonid_usuarioPerfilUsuario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_usuarioPerfilUsuarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuario.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonestadoPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilUsuarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPerfilPerfilUsuario.addActionListener(new ButtonActionListener(this,"FK_IdPerfilPerfilUsuario"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPerfilUsuario!=null) {
				this.jInternalFrameReporteDinamicoPerfilUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilUsuario"));
				this.jInternalFrameReporteDinamicoPerfilUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilUsuario"));
				this.jInternalFrameReporteDinamicoPerfilUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilUsuario"));
			}
			
			//this.jButtonCerrarReporteDinamicoPerfilUsuario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilUsuario"));				
			//this.jButtonGenerarReporteDinamicoPerfilUsuario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilUsuario"));
			//this.jButtonGenerarExcelReporteDinamicoPerfilUsuario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilUsuario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPerfilUsuario!=null) {
				this.jInternalFrameImportacionPerfilUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfilUsuario"));
				this.jInternalFrameImportacionPerfilUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfilUsuario"));
				this.jInternalFrameImportacionPerfilUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfilUsuario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPerfilUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByPerfilUsuario"));
			
			this.jButtonAbrirOrderByToolBarPerfilUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPerfilUsuario"));			
			
			if(this.jInternalFrameOrderByPerfilUsuario!=null) {
				this.jInternalFrameOrderByPerfilUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfilUsuario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilUsuario.jTabbedPaneRelacionesPerfilUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfilUsuario"));
		
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
            		closingInternalFramePerfilUsuario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPerfilUsuario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPerfilUsuario = (JInternalFrameBase)event.getSource();
	            	
	            PerfilUsuarioBeanSwingJInternalFrame jInternalFrameParent=(PerfilUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfilUsuario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPerfilUsuarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPerfilUsuario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPerfilUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPerfilUsuario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPerfilUsuario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPerfilUsuario";
		inputMap = this.jButtonNuevoPerfilUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPerfilUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilUsuarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPerfilUsuario";
		inputMap = this.jButtonNuevoRelacionesPerfilUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPerfilUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilUsuarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPerfilUsuario";
		inputMap = this.jButtonModificarPerfilUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPerfilUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPerfilUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPerfilUsuario";
		inputMap = this.jButtonActualizarPerfilUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPerfilUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPerfilUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPerfilUsuario";
		inputMap = this.jButtonEliminarPerfilUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPerfilUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPerfilUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPerfilUsuario";
		inputMap = this.jButtonCancelarPerfilUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPerfilUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPerfilUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPerfilUsuario";
		inputMap = this.jButtonCerrarPerfilUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPerfilUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPerfilUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPerfilUsuario";
		inputMap = this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosPerfilUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonGuardarCambiosPerfilUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPerfilUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPerfilUsuario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPerfilUsuarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPerfilUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPerfilUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPerfilUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPerfilUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPerfilUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPerfilUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonidPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_perfilPerfilUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_perfilPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilUsuarioBusqueda"));
		//jButtonid_usuarioPerfilUsuario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_usuarioPerfilUsuarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuario.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioPerfilUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilUsuario.jButtonestadoPerfilUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilUsuarioBusqueda"));
		
		
		this.jButtonFK_IdPerfilPerfilUsuario.addActionListener(new ButtonActionListener(this,"FK_IdPerfilPerfilUsuario"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPerfilUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPerfilUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPerfilUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPerfilUsuario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPerfilUsuario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
					perfilusuarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilUsuario perfilusuarioAux:perfilusuarios) {
					perfilusuarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPerfilUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfilUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
						perfilusuarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilUsuario perfilusuarioAux:perfilusuarios) {
						perfilusuarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
					
						if(sTipoSeleccionar.equals(PerfilUsuarioConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilusuarioAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilUsuario perfilusuarioAux:perfilusuarios) {
						
						if(sTipoSeleccionar.equals(PerfilUsuarioConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilusuarioAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPerfilUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfilUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfilUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPerfilUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfilUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPerfilUsuario.getSelectedRows();
			
			PerfilUsuario perfilusuarioLocal=new PerfilUsuario();
			
			//this.seleccionarTodosPerfilUsuario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilusuarioLocal =(PerfilUsuario) this.perfilusuarioLogic.getPerfilUsuarios().toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					perfilusuarioLocal =(PerfilUsuario) this.perfilusuarios.toArray()[this.jTableDatosPerfilUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				perfilusuarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
						perfilusuarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilUsuario perfilusuarioAux:perfilusuarios) {
						perfilusuarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPerfilUsuario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfilUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfilUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfilUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPerfilUsuarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPerfilUsuarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPerfilUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPerfilUsuario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPerfilUsuario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PerfilUsuario perfilusuarioAux:this.perfilusuarioLogic.getPerfilUsuarios()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilUsuario perfilusuarioAux:perfilusuarios) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPerfilUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPerfilUsuarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPerfilUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPerfilUsuario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPerfilUsuario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePerfilUsuario) {				
					conSplash=true;//false;										
					
					//this.startProcessPerfilUsuario(conSplash);
				
					this.generarReportePerfilUsuariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPerfilUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilUsuariosSeleccionados(false);
				//this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilUsuariosSeleccionados(true);
				//this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfilUsuario();
				
				this.exportarPerfilUsuariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPerfilUsuarios();
				//this.importarPerfilUsuarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfilUsuario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPerfilUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Usuarios Perfiles ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPerfilUsuario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPerfilUsuario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPerfilUsuario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.setSelectedIndex(0);					
				}	
			} 			
			else if(PerfilUsuarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePerfilUsuario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPerfilUsuario(conSplash);
					
						//this.actualizarParametrosGeneralPerfilUsuario();
						
						this.generarReporteProcesoAccionPerfilUsuariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PerfilUsuarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Usuarios Perfiles S SELECCIONADOS?", "MANTENIMIENTO DE Usuarios Perfiles ", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPerfilUsuario();
				
						this.actualizarParametrosGeneralPerfilUsuario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.perfilusuarioReturnGeneral=perfilusuarioLogic.procesarAccionPerfilUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.perfilusuarioLogic.getPerfilUsuarios(),this.perfilusuarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPerfilUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPerfilUsuario();
					
					PerfilUsuarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPerfilUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfilUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxTiposAccionesFormularioPerfilUsuario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPerfilUsuario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPerfilUsuarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPerfilUsuario();
			
			if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		
			PerfilUsuario perfilusuario=new PerfilUsuario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPerfilUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPerfilUsuario.getSelectedItem();
			
			
			
			
			perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(perfilusuariosSeleccionados.size()==1) {
				for(PerfilUsuario perfilusuarioAux:perfilusuariosSeleccionados) {
					perfilusuario=perfilusuarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPerfilUsuario();
			
      		//this.finishProcessPerfilUsuario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPerfilUsuarioReturnGeneral() throws Exception {
		if(this.perfilusuarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.perfilusuarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.perfilusuarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.perfilusuarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.perfilusuarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.perfilusuarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPerfilUsuario(false);
		}
		
		if(this.perfilusuarioReturnGeneral.getConRetornoLista() || this.perfilusuarioReturnGeneral.getConRetornoObjeto()) {
			if(this.perfilusuarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilusuarioLogic.setPerfilUsuarios(this.perfilusuarioReturnGeneral.getPerfilUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.perfilusuarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilusuarioLogic.setPerfilUsuario(this.perfilusuarioReturnGeneral.getPerfilUsuario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPerfilUsuario(false);
		}
	}
	
	public void actualizarParametrosGeneralPerfilUsuario() throws Exception {
		
		
	}
	
	public ArrayList<PerfilUsuario> getPerfilUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPerfilUsuario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PerfilUsuario perfilusuarioAux:perfilusuarioLogic.getPerfilUsuarios()) {
					if(perfilusuarioAux.getIsSelected()) {
						perfilusuariosSeleccionados.add(perfilusuarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilUsuario perfilusuarioAux:this.perfilusuarios) {
					if(perfilusuarioAux.getIsSelected()) {
						perfilusuariosSeleccionados.add(perfilusuarioAux);				
					}
				}
			}
			
			if(perfilusuariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						perfilusuariosSeleccionados.addAll(this.perfilusuarioLogic.getPerfilUsuarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						perfilusuariosSeleccionados.addAll(this.perfilusuarios);				
					}
				}
			}
		} else {
			perfilusuariosSeleccionados.add(this.perfilusuario);
		}
		
		return perfilusuariosSeleccionados;
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
	
	public void generarReportePerfilUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPerfilUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPerfilUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilUsuariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilUsuariosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Usuarios Perfiles ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPerfilUsuariosSeleccionados() throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePerfilUsuarios("Todos",perfilusuariosSeleccionados);
		
	}	
	
	public void generarReporteNormalPerfilUsuariosSeleccionados() throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePerfilUsuarios("Todos",perfilusuariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPerfilUsuariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePerfilUsuarios("Todos",perfilusuariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPerfilUsuariosSeleccionados() throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPerfilUsuario();
		
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPerfilUsuario();
		
		
		//this.generarReportePerfilUsuarios("Todos",perfilusuariosSeleccionados ,perfilusuarioImplementable,perfilusuarioImplementableHome);
	}
	
	public void mostrarImportacionPerfilUsuarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPerfilUsuario();
		
		this.abrirFrameImportacionPerfilUsuario();		
		
			
		//this.generarReportePerfilUsuarios("Todos",perfilusuariosSeleccionados ,perfilusuarioImplementable,perfilusuarioImplementableHome);
	}
	
	public void importarPerfilUsuarios() throws Exception {		
	
	}
	
	public void exportarPerfilUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPerfilUsuariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPerfilUsuariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPerfilUsuariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Usuarios Perfiles ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPerfilUsuariosSeleccionados() throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilusuario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPerfilUsuario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PerfilUsuario perfilusuarioAux:perfilusuariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPerfilUsuario(perfilusuarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//perfilusuarioAux.setsDetalleGeneralEntityReporte(perfilusuarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPerfilUsuario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PerfilUsuarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilUsuarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilUsuarioConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPerfilUsuario(PerfilUsuario perfilusuario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=perfilusuario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilusuario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilusuario.getperfil_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilusuario.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilusuario.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPerfilUsuariosSeleccionados() throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilusuario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PerfilUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPerfilUsuario(row);				
				iRow++;
			}				
			
			for(PerfilUsuario perfilusuarioAux:perfilusuariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPerfilUsuario(perfilusuarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPerfilUsuariosSeleccionados() throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();		
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilusuario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("perfilusuarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("perfilusuario");
			//elementRoot.appendChild(element);
		
			for(PerfilUsuario perfilusuarioAux:perfilusuariosSeleccionados) {
				element = document.createElement("perfilusuario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPerfilUsuario(perfilusuarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuarios Perfiles ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPerfilUsuario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilUsuarioConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPerfilUsuario(PerfilUsuario perfilusuario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(perfilusuario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilusuario.getperfil_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilusuario.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilusuario.getestado());				
	}
	
	public void setFilaDatosExportarXmlPerfilUsuario(PerfilUsuario perfilusuario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PerfilUsuarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(perfilusuario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PerfilUsuarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(perfilusuario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementperfil_descripcion = document.createElement(PerfilUsuarioConstantesFunciones.IDPERFIL);
		elementperfil_descripcion.appendChild(document.createTextNode(perfilusuario.getperfil_descripcion()));
		element.appendChild(elementperfil_descripcion);

		Element elementusuario_descripcion = document.createElement(PerfilUsuarioConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(perfilusuario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementestado = document.createElement(PerfilUsuarioConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(perfilusuario.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoPerfilUsuariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PerfilUsuario> perfilusuariosSeleccionados=new ArrayList<PerfilUsuario>();
		
		perfilusuariosSeleccionados=this.getPerfilUsuariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPerfilUsuario(perfilusuariosSeleccionados);
		
		this.generarReportePerfilUsuarios("Todos",perfilusuariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPerfilUsuario(ArrayList<PerfilUsuario> perfilusuariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PerfilUsuario perfilusuarioAux:perfilusuariosSeleccionados) {
				perfilusuarioAux.setsDetalleGeneralEntityReporte(perfilusuarioAux.toString());
			
				if(sTipoSeleccionar.equals(PerfilUsuarioConstantesFunciones.LABEL_IDPERFIL)) {
					existe=true;
					perfilusuarioAux.setsDescripcionGeneralEntityReporte1(perfilusuarioAux.getperfil_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilUsuarioConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					perfilusuarioAux.setsDescripcionGeneralEntityReporte1(perfilusuarioAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilUsuarioConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					perfilusuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilusuarioAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPerfilUsuario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPerfilUsuario=true;
				this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=true;
				this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=true;
			}
			
			this.isVisibilidadCeldaModificarPerfilUsuario=false;
			this.isVisibilidadCeldaActualizarPerfilUsuario=false;
			this.isVisibilidadCeldaEliminarPerfilUsuario=false;
			this.isVisibilidadCeldaCancelarPerfilUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPerfilUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=false;
			this.isVisibilidadCeldaModificarPerfilUsuario=false;
			this.isVisibilidadCeldaActualizarPerfilUsuario=true;
			this.isVisibilidadCeldaEliminarPerfilUsuario=false;
			this.isVisibilidadCeldaCancelarPerfilUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPerfilUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=false;
			this.isVisibilidadCeldaModificarPerfilUsuario=false;
			this.isVisibilidadCeldaActualizarPerfilUsuario=true;
			this.isVisibilidadCeldaEliminarPerfilUsuario=true;
			this.isVisibilidadCeldaCancelarPerfilUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPerfilUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=false;
			this.isVisibilidadCeldaModificarPerfilUsuario=false;
			this.isVisibilidadCeldaActualizarPerfilUsuario=true;
			this.isVisibilidadCeldaEliminarPerfilUsuario=false;
			this.isVisibilidadCeldaCancelarPerfilUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPerfilUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=true;
			this.isVisibilidadCeldaModificarPerfilUsuario=false;
			this.isVisibilidadCeldaActualizarPerfilUsuario=false;
			this.isVisibilidadCeldaEliminarPerfilUsuario=false;
			this.isVisibilidadCeldaCancelarPerfilUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPerfilUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=false;
			this.isVisibilidadCeldaActualizarPerfilUsuario=false;
			this.isVisibilidadCeldaEliminarPerfilUsuario=false;
			this.isVisibilidadCeldaCancelarPerfilUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPerfilUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=false;
			this.isVisibilidadCeldaModificarPerfilUsuario=true;
			this.isVisibilidadCeldaActualizarPerfilUsuario=false;
			this.isVisibilidadCeldaEliminarPerfilUsuario=false;
			this.isVisibilidadCeldaCancelarPerfilUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilUsuario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PerfilUsuarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPerfilUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=true;
		} else {
			this.actualizarEstadoPanelsPerfilUsuario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPerfilUsuario=false;
			//this.isVisibilidadCeldaVerFormPerfilUsuario=false;
			this.isVisibilidadCeldaDuplicarPerfilUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!perfilusuarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
		} else {
			this.isVisibilidadCeldaNuevoPerfilUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			if(!perfilusuarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;												
			}
			
			this.jButtonCerrarPerfilUsuario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPerfilUsuario=false;
		}
		
		if(!this.permiteMantenimiento(this.perfilusuario)) {
			this.isVisibilidadCeldaActualizarPerfilUsuario=false;
			this.isVisibilidadCeldaEliminarPerfilUsuario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPerfilUsuario() {
	}
	
	public void actualizarEstadoPanelsPerfilUsuario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPerfilUsuario!=null) {
				this.jScrollPanelDatosEdicionPerfilUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilUsuario!=null) {
				this.jScrollPanelDatosPerfilUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilUsuario!=null) {
				this.jPanelPaginacionPerfilUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPerfilUsuario!=null) {
				this.jScrollPanelDatosEdicionPerfilUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPerfilUsuario!=null) {
				this.jScrollPanelDatosPerfilUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilUsuario!=null) {
				this.jPanelPaginacionPerfilUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPerfilUsuario!=null) {
				this.jScrollPanelDatosEdicionPerfilUsuario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfilUsuario!=null) {
				this.jScrollPanelDatosPerfilUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilUsuario!=null) {
				this.jPanelPaginacionPerfilUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPerfilUsuario!=null) {
				this.jScrollPanelDatosEdicionPerfilUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfilUsuario!=null) {
				this.jScrollPanelDatosPerfilUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilUsuario!=null) {
				this.jPanelPaginacionPerfilUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPerfilUsuario!=null) {
				this.jScrollPanelDatosEdicionPerfilUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilUsuario!=null) {
				this.jScrollPanelDatosPerfilUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilUsuario!=null) {
				this.jPanelPaginacionPerfilUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPerfilUsuario!=null) {
				this.jScrollPanelDatosEdicionPerfilUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilUsuario!=null) {
				this.jScrollPanelDatosPerfilUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilUsuario!=null) {
				this.jPanelPaginacionPerfilUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPerfilUsuario!=null) {
				this.jScrollPanelDatosEdicionPerfilUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilUsuario!=null) {
				this.jScrollPanelDatosPerfilUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilUsuario!=null) {
				this.jPanelPaginacionPerfilUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
					this.jTabbedPaneBusquedasPerfilUsuario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.perfilusuarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilUsuario!=null) {
				this.jTabbedPaneBusquedasPerfilUsuario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPerfilUsuario!=null) {
				this.jPanelParametrosReportesPerfilUsuario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPerfil(Boolean isParaPerfil){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPerfilNegation=!isParaPerfil;

			this.isVisibilidadFK_IdPerfil=isParaPerfil;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasPerfilUsuario.remove(jPanelFK_IdPerfilPerfilUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdPerfil=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasPerfilUsuario.remove(jPanelFK_IdPerfilPerfilUsuario);}
		}
		
	}
	
	
	
	

	public String registrarSesionPerfilUsuarioParaBusquedaUsuarios() throws Exception {
		Boolean isPaginaPopupUsuario=false;

		try {

			if(perfilusuarioSessionBean==null) {
				perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
			}

			if(usuarioSessionBean==null) {
				usuarioSessionBean=new UsuarioSessionBean();
			}

			usuarioSessionBean.setsPathNavegacionActual(perfilusuarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+UsuarioConstantesFunciones.SCLASSWEBTITULO);
			usuarioSessionBean.setisPermiteRecargarInformacion(false);
			usuarioSessionBean.setisPaginaPopup(true);
			isPaginaPopupUsuario=usuarioSessionBean.getisPaginaPopup();
			usuarioSessionBean.setisPaginaPopup(false);
			usuarioSessionBean.setEstaModoBusqueda(true);
			usuarioSessionBean.setsFuncionBusquedaRapida("window.opener.perfilusuarioFuncionGeneral.setCombosCodigoDesdeBusquedaid_usuario(TO_REPLACE);");
			usuarioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeUsuario(true);
			usuarioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeUsuario(PerfilUsuarioConstantesFunciones.SNOMBREOPCION);
			//usuarioSessionBean.setisBusquedaDesdeForeignKeySesionPerfilUsuario(true);
			//usuarioSessionBean.setlidPerfilUsuarioActual(this.idPerfilUsuarioActual);

			perfilusuarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPerfilUsuario(true);
			perfilusuarioSessionBean.setlIdPerfilUsuarioActualForeignKey(this.idPerfilUsuarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PerfilUsuarioSessionBean perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		
		if(this.perfilusuarioSessionBean==null) {
			this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		}
		
		this.perfilusuarioSessionBean.setsUltimaBusquedaPerfilUsuario(this.getsAccionBusqueda());
		this.perfilusuarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.perfilusuarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPerfil")) {
			perfilusuarioSessionBean.setid_perfil(this.getid_perfilFK_IdPerfil());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			perfilusuarioSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PerfilUsuarioSessionBean perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		
		if(this.perfilusuarioSessionBean==null) {
			this.perfilusuarioSessionBean=new PerfilUsuarioSessionBean();
		}
		
		if(this.perfilusuarioSessionBean.getsUltimaBusquedaPerfilUsuario()!=null&&!this.perfilusuarioSessionBean.getsUltimaBusquedaPerfilUsuario().equals("")) {
			this.setsAccionBusqueda(perfilusuarioSessionBean.getsUltimaBusquedaPerfilUsuario());
			this.setiNumeroPaginacion(perfilusuarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(perfilusuarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPerfil")) {
				this.setid_perfilFK_IdPerfil(perfilusuarioSessionBean.getid_perfil());
				perfilusuarioSessionBean.setid_perfil(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(perfilusuarioSessionBean.getid_usuario());
				perfilusuarioSessionBean.setid_usuario(-1L);
			}
		}
		
		this.perfilusuarioSessionBean.setsUltimaBusquedaPerfilUsuario("");
		this.perfilusuarioSessionBean.setiNumeroPaginacion(PerfilUsuarioConstantesFunciones.INUMEROPAGINACION);
		this.perfilusuarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPerfilUsuario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPerfilUsuario() {
		this.updateBorderResaltarBusquedasFormularioPerfilUsuario();
		this.updateVisibilidadBusquedasFormularioPerfilUsuario();
		this.updateHabilitarBusquedasFormularioPerfilUsuario();
	}
	
	public void updateBorderResaltarBusquedasFormularioPerfilUsuario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPerfilUsuario.getComponents().length>0) {
	

		if(this.perfilusuarioConstantesFunciones.resaltarFK_IdPerfilPerfilUsuario!=null) {
			index= this.jTabbedPaneBusquedasPerfilUsuario.indexOfComponent(this.jPanelFK_IdPerfilPerfilUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilUsuario.getComponent(index);
				jPanel.setBorder(this.perfilusuarioConstantesFunciones.resaltarFK_IdPerfilPerfilUsuario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPerfilUsuario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPerfilUsuario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfilUsuario.indexOfComponent(this.jPanelFK_IdPerfilPerfilUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilusuarioConstantesFunciones.mostrarFK_IdPerfilPerfilUsuario);
			if(!this.perfilusuarioConstantesFunciones.mostrarFK_IdPerfilPerfilUsuario && index>-1) {
				this.jTabbedPaneBusquedasPerfilUsuario.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPerfilUsuario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPerfilUsuario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfilUsuario.indexOfComponent(this.jPanelFK_IdPerfilPerfilUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilusuarioConstantesFunciones.activarFK_IdPerfilPerfilUsuario);
				this.jTabbedPaneBusquedasPerfilUsuario.setEnabledAt(index,this.perfilusuarioConstantesFunciones.activarFK_IdPerfilPerfilUsuario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPerfilUsuario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPerfil")) {
			index= this.jTabbedPaneBusquedasPerfilUsuario.indexOfComponent(this.jPanelFK_IdPerfilPerfilUsuario);

			this.jTabbedPaneBusquedasPerfilUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilUsuario.getComponent(index);

			this.perfilusuarioConstantesFunciones.setResaltarFK_IdPerfilPerfilUsuario(resaltar);

			jPanel.setBorder(this.perfilusuarioConstantesFunciones.resaltarFK_IdPerfilPerfilUsuario);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPerfilUsuario.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPerfilUsuario() throws Exception {

		if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPerfilUsuario();
		this.updateVisibilidadResaltarControlesFormularioPerfilUsuario();
		this.updateHabilitarResaltarControlesFormularioPerfilUsuario();
		
	}
	
	public void updateBorderResaltarControlesFormularioPerfilUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.perfilusuarioConstantesFunciones.resaltaridPerfilUsuario!=null && this.jInternalFrameDetalleFormPerfilUsuario!=null) {this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.setBorder(this.perfilusuarioConstantesFunciones.resaltaridPerfilUsuario);}
		if(this.perfilusuarioConstantesFunciones.resaltarid_perfilPerfilUsuario!=null && this.jInternalFrameDetalleFormPerfilUsuario!=null) {this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setBorder(this.perfilusuarioConstantesFunciones.resaltarid_perfilPerfilUsuario);}
		if(this.perfilusuarioConstantesFunciones.resaltarid_usuarioPerfilUsuario!=null && this.jInternalFrameDetalleFormPerfilUsuario!=null) {this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setBorder(this.perfilusuarioConstantesFunciones.resaltarid_usuarioPerfilUsuario);}
		if(this.perfilusuarioConstantesFunciones.resaltarestadoPerfilUsuario!=null && this.jInternalFrameDetalleFormPerfilUsuario!=null) {this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.setBorder(this.perfilusuarioConstantesFunciones.resaltarestadoPerfilUsuario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPerfilUsuario() throws Exception {		
		if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
	
		//this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostraridPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.jPanelidPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostraridPerfilUsuario);
		//this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostrarid_perfilPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.jPanelid_perfilPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostrarid_perfilPerfilUsuario);
		//this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostrarid_usuarioPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.jPanelid_usuarioPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostrarid_usuarioPerfilUsuario);
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostrarid_usuarioPerfilUsuario);
		//this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostrarestadoPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.jPanelestadoPerfilUsuario.setVisible(this.perfilusuarioConstantesFunciones.mostrarestadoPerfilUsuario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPerfilUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormPerfilUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfilUsuario!=null) {
	
		this.jInternalFrameDetalleFormPerfilUsuario.jLabelidPerfilUsuario.setEnabled(this.perfilusuarioConstantesFunciones.activaridPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_perfilPerfilUsuario.setEnabled(this.perfilusuarioConstantesFunciones.activarid_perfilPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.jComboBoxid_usuarioPerfilUsuario.setEnabled(this.perfilusuarioConstantesFunciones.activarid_usuarioPerfilUsuario);
			this.jInternalFrameDetalleFormPerfilUsuario.jButtonid_usuarioPerfilUsuario.setEnabled(this.perfilusuarioConstantesFunciones.activarid_usuarioPerfilUsuario);
		this.jInternalFrameDetalleFormPerfilUsuario.jCheckBoxestadoPerfilUsuario.setEnabled(this.perfilusuarioConstantesFunciones.activarestadoPerfilUsuario);
		}
	}
	
		
}