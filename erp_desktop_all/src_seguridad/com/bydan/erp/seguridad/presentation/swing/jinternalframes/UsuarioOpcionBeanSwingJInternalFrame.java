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

import com.bydan.erp.seguridad.util.UsuarioOpcionConstantesFunciones;
import com.bydan.erp.seguridad.util.UsuarioOpcionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.UsuarioOpcionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.UsuarioOpcionBean;
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
public class UsuarioOpcionBeanSwingJInternalFrame extends UsuarioOpcionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UsuarioOpcionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<UsuarioOpcion> usuarioopcionValidator = new ClassValidator<UsuarioOpcion>(UsuarioOpcion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public UsuarioOpcion usuarioopcion;	
	public UsuarioOpcion usuarioopcionAux;
	public UsuarioOpcion usuarioopcionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public UsuarioOpcion usuarioopcionTotales;
	public Long idUsuarioOpcionActual;
	public Long iIdNuevoUsuarioOpcion=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboSistema="";

	public List<Sistema> sistemasForeignKey;

	public List<Sistema> getsistemasForeignKey() {
		return sistemasForeignKey;
	}

	public void setsistemasForeignKey(List<Sistema> sistemasForeignKey) {
		this.sistemasForeignKey = sistemasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sistema sistemaForeignKey;

	public Sistema getsistemaForeignKey() {
		return sistemaForeignKey;
	}

	public void setsistemaForeignKey(Sistema sistemaForeignKey) {
		this.sistemaForeignKey = sistemaForeignKey;
	}

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboGrupoOpcion="";

	public List<GrupoOpcion> grupoopcionsForeignKey;

	public List<GrupoOpcion> getgrupoopcionsForeignKey() {
		return grupoopcionsForeignKey;
	}

	public void setgrupoopcionsForeignKey(List<GrupoOpcion> grupoopcionsForeignKey) {
		this.grupoopcionsForeignKey = grupoopcionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoOpcion grupoopcionForeignKey;

	public GrupoOpcion getgrupoopcionForeignKey() {
		return grupoopcionForeignKey;
	}

	public void setgrupoopcionForeignKey(GrupoOpcion grupoopcionForeignKey) {
		this.grupoopcionForeignKey = grupoopcionForeignKey;
	}

	public String sFinalQueryComboOpcion="";

	public List<Opcion> opcionsForeignKey;

	public List<Opcion> getopcionsForeignKey() {
		return opcionsForeignKey;
	}

	public void setopcionsForeignKey(List<Opcion> opcionsForeignKey) {
		this.opcionsForeignKey = opcionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Opcion opcionForeignKey;

	public Opcion getopcionForeignKey() {
		return opcionForeignKey;
	}

	public void setopcionForeignKey(Opcion opcionForeignKey) {
		this.opcionForeignKey = opcionForeignKey;
	}

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
	public Long idOpcionActual=0L;

	public Long getidOpcionActual() {
		return idOpcionActual;
	}

	public void setidOpcionActual(Long idOpcionActual) {
		this.idOpcionActual= idOpcionActual;
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
	
	public Boolean isPermisoTodoUsuarioOpcion;
	public Boolean isPermisoNuevoUsuarioOpcion;
	public Boolean isPermisoActualizarUsuarioOpcion;
	public Boolean isPermisoActualizarOriginalUsuarioOpcion;
	public Boolean isPermisoEliminarUsuarioOpcion;
	public Boolean isPermisoGuardarCambiosUsuarioOpcion;
	public Boolean isPermisoConsultaUsuarioOpcion;
	public Boolean isPermisoBusquedaUsuarioOpcion;
	public Boolean isPermisoReporteUsuarioOpcion;
	public Boolean isPermisoPaginacionMedioUsuarioOpcion;
	public Boolean isPermisoPaginacionAltoUsuarioOpcion;
	public Boolean isPermisoPaginacionTodoUsuarioOpcion;
	public Boolean isPermisoCopiarUsuarioOpcion;
	public Boolean isPermisoVerFormUsuarioOpcion;
	public Boolean isPermisoDuplicarUsuarioOpcion;
	public Boolean isPermisoOrdenUsuarioOpcion;
	
	
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
	
	public UsuarioOpcionParameterReturnGeneral usuarioopcionReturnGeneral;
	public UsuarioOpcionParameterReturnGeneral usuarioopcionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUsuarioOpcion=false;
	public Boolean esParaAccionDesdeFormularioUsuarioOpcion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UsuarioOpcionSessionBeanAdditional usuarioopcionSessionBeanAdditional=null;
	
	public UsuarioOpcionSessionBeanAdditional getUsuarioOpcionSessionBeanAdditional() {
		return this.usuarioopcionSessionBeanAdditional;
	}
	
	public void setUsuarioOpcionSessionBeanAdditional(UsuarioOpcionSessionBeanAdditional usuarioopcionSessionBeanAdditional) {
		try {
			this.usuarioopcionSessionBeanAdditional=usuarioopcionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UsuarioOpcionBeanSwingJInternalFrameAdditional usuarioopcionBeanSwingJInternalFrameAdditional=null;
	//public class UsuarioOpcionBeanSwingJInternalFrame
	
	public UsuarioOpcionBeanSwingJInternalFrameAdditional getUsuarioOpcionBeanSwingJInternalFrameAdditional() {
		return this.usuarioopcionBeanSwingJInternalFrameAdditional;
	}
	
	public void setUsuarioOpcionBeanSwingJInternalFrameAdditional(UsuarioOpcionBeanSwingJInternalFrameAdditional usuarioopcionBeanSwingJInternalFrameAdditional) {
		try {
			this.usuarioopcionBeanSwingJInternalFrameAdditional=usuarioopcionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UsuarioOpcionLogic usuarioopcionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public UsuarioOpcion usuarioopcionBean;
	public UsuarioOpcionConstantesFunciones usuarioopcionConstantesFunciones;
	//public UsuarioOpcionParameterReturnGeneral usuarioopcionReturnGeneral;
	
	//FK
	
	public SistemaLogic sistemaLogic;
	public ModuloLogic moduloLogic;
	public GrupoOpcionLogic grupoopcionLogic;
	public OpcionLogic opcionLogic;
	public PerfilLogic perfilLogic;
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<UsuarioOpcion> usuarioopcions;	
	//public List<UsuarioOpcion> usuarioopcionsEliminados;
	//public List<UsuarioOpcion> usuarioopcionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUsuarioOpcion=false;
	public Boolean isVisibilidadCeldaDuplicarUsuarioOpcion=true;
	public Boolean isVisibilidadCeldaCopiarUsuarioOpcion=true;
	public Boolean isVisibilidadCeldaVerFormUsuarioOpcion=true;
	public Boolean isVisibilidadCeldaOrdenUsuarioOpcion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
	public Boolean isVisibilidadCeldaModificarUsuarioOpcion=false;
	public Boolean isVisibilidadCeldaActualizarUsuarioOpcion=false;
	public Boolean isVisibilidadCeldaEliminarUsuarioOpcion=false;
	public Boolean isVisibilidadCeldaCancelarUsuarioOpcion=false;
	public Boolean isVisibilidadCeldaGuardarUsuarioOpcion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUsuarioOpcion=false;	
	
	
	public Boolean isVisibilidadFK_IdGrupoOpcion=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdOpcion=false;
	public Boolean isVisibilidadFK_IdPerfil=false;
	public Boolean isVisibilidadFK_IdSistema=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoUsuarioOpcion() {
		return this.iIdNuevoUsuarioOpcion;
	}

	public void setiIdNuevoUsuarioOpcion(Long iIdNuevoUsuarioOpcion) {
		this.iIdNuevoUsuarioOpcion = iIdNuevoUsuarioOpcion;
	}
	
	public Long getidUsuarioOpcionActual() {
		return this.idUsuarioOpcionActual;
	}

	public void setidUsuarioOpcionActual(Long idUsuarioOpcionActual) {
		this.idUsuarioOpcionActual = idUsuarioOpcionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public UsuarioOpcion getusuarioopcion() {
		return this.usuarioopcion;
	}

	public void setusuarioopcion(UsuarioOpcion usuarioopcion) {
		this.usuarioopcion = usuarioopcion;
	}
	
	public UsuarioOpcion getusuarioopcionAux() {
		return this.usuarioopcionAux;
	}

	public void setusuarioopcionAux(UsuarioOpcion usuarioopcionAux) {
		this.usuarioopcionAux = usuarioopcionAux;
	}				
	
	public UsuarioOpcion getusuarioopcionAnterior() {
		return this.usuarioopcionAnterior;
	}

	public void setusuarioopcionAnterior(UsuarioOpcion usuarioopcionAnterior) {
		this.usuarioopcionAnterior = usuarioopcionAnterior;
	}	
	
	public UsuarioOpcion getusuarioopcionTotales() {
		return this.usuarioopcionTotales;
	}

	public void setusuarioopcionTotales(UsuarioOpcion usuarioopcionTotales) {
		this.usuarioopcionTotales = usuarioopcionTotales;
	}	
	
	public UsuarioOpcion getusuarioopcionBean() {
		return this.usuarioopcionBean;
	}

	public void setusuarioopcionBean(UsuarioOpcion usuarioopcionBean) {
		this.usuarioopcionBean = usuarioopcionBean;
	}	
	
	public UsuarioOpcionParameterReturnGeneral getusuarioopcionReturnGeneral() {
		return this.usuarioopcionReturnGeneral;
	}

	public void setusuarioopcionReturnGeneral(UsuarioOpcionParameterReturnGeneral usuarioopcionReturnGeneral) {
		this.usuarioopcionReturnGeneral = usuarioopcionReturnGeneral;
	}	
	
	
	public Long id_grupo_opcionFK_IdGrupoOpcion=null;

	public Long getid_grupo_opcionFK_IdGrupoOpcion() {
		return this.id_grupo_opcionFK_IdGrupoOpcion;
	}

	public void setid_grupo_opcionFK_IdGrupoOpcion(Long id_grupo_opcionFK_IdGrupoOpcion) {
		this.id_grupo_opcionFK_IdGrupoOpcion = id_grupo_opcionFK_IdGrupoOpcion;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_opcionFK_IdOpcion=-1L;

	public Long getid_opcionFK_IdOpcion() {
		return this.id_opcionFK_IdOpcion;
	}

	public void setid_opcionFK_IdOpcion(Long id_opcionFK_IdOpcion) {
		this.id_opcionFK_IdOpcion = id_opcionFK_IdOpcion;
	}

	public Long id_perfilFK_IdPerfil=-1L;

	public Long getid_perfilFK_IdPerfil() {
		return this.id_perfilFK_IdPerfil;
	}

	public void setid_perfilFK_IdPerfil(Long id_perfilFK_IdPerfil) {
		this.id_perfilFK_IdPerfil = id_perfilFK_IdPerfil;
	}

	public Long id_sistemaFK_IdSistema=-1L;

	public Long getid_sistemaFK_IdSistema() {
		return this.id_sistemaFK_IdSistema;
	}

	public void setid_sistemaFK_IdSistema(Long id_sistemaFK_IdSistema) {
		this.id_sistemaFK_IdSistema = id_sistemaFK_IdSistema;
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
	
	
	public UsuarioOpcionLogic getUsuarioOpcionLogic()	{		
		return usuarioopcionLogic;
	}

	public void setUsuarioOpcionLogic(UsuarioOpcionLogic usuarioopcionLogic) {
		this.usuarioopcionLogic = usuarioopcionLogic;
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
	
	public Boolean getIsEsNuevoUsuarioOpcion() {
		return isEsNuevoUsuarioOpcion;
	}

	public void setIsEsNuevoUsuarioOpcion(Boolean isEsNuevoUsuarioOpcion) {
		this.isEsNuevoUsuarioOpcion = isEsNuevoUsuarioOpcion;
	}

	public Boolean getEsParaAccionDesdeFormularioUsuarioOpcion() {
		return esParaAccionDesdeFormularioUsuarioOpcion;
	}
	
	public void setEsParaAccionDesdeFormularioUsuarioOpcion(Boolean esParaAccionDesdeFormularioUsuarioOpcion) {
		this.esParaAccionDesdeFormularioUsuarioOpcion = esParaAccionDesdeFormularioUsuarioOpcion;
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
	
	
	public void cargarCombosSistemasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sistemasForeignKey=new ArrayList<Sistema>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SistemaLogic sistemaLogic=new SistemaLogic();

			sistemaLogic.getSistemaDataAccess().setIsForForeingKeyData(true);

			if(this.usuarioopcionSessionBean==null) {
				this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getSistemaDataAccess().setIsForForeingKeyData(true);

					sistemaLogic.getTodosSistemasWithConnection(sFinalQuery,new Pagination());

					this.sistemasForeignKey=sistemaLogic.getSistemas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSistema(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sistemaLogic.getEntityWithConnection(usuarioopcionSessionBean.getlidSistemaActual());
					this.sistemasForeignKey.add(sistemaLogic.getSistema());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.usuarioopcionSessionBean==null) {
				this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(usuarioopcionSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	public void cargarCombosGrupoOpcionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoopcionsForeignKey=new ArrayList<GrupoOpcion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoOpcionLogic grupoopcionLogic=new GrupoOpcionLogic();

			grupoopcionLogic.getGrupoOpcionDataAccess().setIsForForeingKeyData(true);

			if(this.usuarioopcionSessionBean==null) {
				this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoopcionLogic.getGrupoOpcionDataAccess().setIsForForeingKeyData(true);

					grupoopcionLogic.getTodosGrupoOpcionsWithConnection(sFinalQuery,new Pagination());

					this.grupoopcionsForeignKey=grupoopcionLogic.getGrupoOpcions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoOpcion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoopcionLogic.getEntityWithConnection(usuarioopcionSessionBean.getlidGrupoOpcionActual());
					this.grupoopcionsForeignKey.add(grupoopcionLogic.getGrupoOpcion());
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

	public void cargarCombosOpcionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.opcionsForeignKey=new ArrayList<Opcion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			OpcionLogic opcionLogic=new OpcionLogic();

			opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

			if(this.usuarioopcionSessionBean==null) {
				this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

					opcionLogic.getTodosOpcionsWithConnection(sFinalQuery,new Pagination());

					this.opcionsForeignKey=opcionLogic.getOpcions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaOpcion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getEntityWithConnection(usuarioopcionSessionBean.getlidOpcionActual());
					this.opcionsForeignKey.add(opcionLogic.getOpcion());
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

			if(this.usuarioopcionSessionBean==null) {
				this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
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
					perfilLogic.getEntityWithConnection(usuarioopcionSessionBean.getlidPerfilActual());
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

			usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.usuarioopcionSessionBean==null) {
				this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

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
					usuarioLogic.getEntityWithConnection(usuarioopcionSessionBean.getlidUsuarioActual());
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

	
	
	public void setActualSistemaForeignKey(Long idSistemaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sistemaTemp!=null) {

					if(this.usuarioopcion!=null) {
						this.usuarioopcion.setSistema(sistemaTemp);
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setSelectedItem(sistemaTemp);
					}
				} else {
					//jComboBoxid_sistemaUsuarioOpcion.setSelectedItem(sistemaTemp);
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setSelectedIndex(0);
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

	public String getActualSistemaForeignKeyDescripcion(Long idSistemaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}


			sDescripcion=SistemaConstantesFunciones.getSistemaDescripcion(sistemaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSistemaForeignKeyGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxid_sistemaUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaTemp=null;

			for(Sistema sistemaAux:sistemasForeignKey) {
				if(sistemaAux.getId()!=null && sistemaAux.getId().equals(idSistemaSeleccionado)) {
					sistemaTemp=sistemaAux;
					break;
				}
			}

			if(sistemaTemp!=null) {
				jComboBoxid_sistemaUsuarioOpcionGenerico.setSelectedItem(sistemaTemp);
			} else {
				if(jComboBoxid_sistemaUsuarioOpcionGenerico!=null && jComboBoxid_sistemaUsuarioOpcionGenerico.getItemCount()>0) {
					jComboBoxid_sistemaUsuarioOpcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.usuarioopcion!=null) {
						this.usuarioopcion.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloUsuarioOpcion.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloUsuarioOpcionGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloUsuarioOpcionGenerico!=null && jComboBoxid_moduloUsuarioOpcionGenerico.getItemCount()>0) {
					jComboBoxid_moduloUsuarioOpcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoOpcionForeignKey(Long idGrupoOpcionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoOpcion  grupoopcionTemp=null;

			for(GrupoOpcion grupoopcionAux:grupoopcionsForeignKey) {
				if(grupoopcionAux.getId()!=null && grupoopcionAux.getId().equals(idGrupoOpcionSeleccionado)) {
					grupoopcionTemp=grupoopcionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoopcionTemp!=null) {

					if(this.usuarioopcion!=null) {
						this.usuarioopcion.setGrupoOpcion(grupoopcionTemp);
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setSelectedItem(grupoopcionTemp);
					}
				} else {
					//jComboBoxid_grupo_opcionUsuarioOpcion.setSelectedItem(grupoopcionTemp);
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdGrupoOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoopcionTemp!=null && jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion!=null) {
						jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setSelectedItem(grupoopcionTemp);
					} else {
						if(jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion!=null) {
							//jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setSelectedItem(grupoopcionTemp);
							if(jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.getItemCount()>0) {
								jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setSelectedIndex(0);
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

	public String getActualGrupoOpcionForeignKeyDescripcion(Long idGrupoOpcionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoOpcion  grupoopcionTemp=null;

			for(GrupoOpcion grupoopcionAux:grupoopcionsForeignKey) {
				if(grupoopcionAux.getId()!=null && grupoopcionAux.getId().equals(idGrupoOpcionSeleccionado)) {
					grupoopcionTemp=grupoopcionAux;
					break;
				}
			}


			sDescripcion=GrupoOpcionConstantesFunciones.getGrupoOpcionDescripcion(grupoopcionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoOpcionForeignKeyGenerico(Long idGrupoOpcionSeleccionado,JComboBox jComboBoxid_grupo_opcionUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			GrupoOpcion  grupoopcionTemp=null;

			for(GrupoOpcion grupoopcionAux:grupoopcionsForeignKey) {
				if(grupoopcionAux.getId()!=null && grupoopcionAux.getId().equals(idGrupoOpcionSeleccionado)) {
					grupoopcionTemp=grupoopcionAux;
					break;
				}
			}

			if(grupoopcionTemp!=null) {
				jComboBoxid_grupo_opcionUsuarioOpcionGenerico.setSelectedItem(grupoopcionTemp);
			} else {
				if(jComboBoxid_grupo_opcionUsuarioOpcionGenerico!=null && jComboBoxid_grupo_opcionUsuarioOpcionGenerico.getItemCount()>0) {
					jComboBoxid_grupo_opcionUsuarioOpcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualOpcionForeignKey(Long idOpcionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(opcionTemp!=null) {

					if(this.usuarioopcion!=null) {
						this.usuarioopcion.setOpcion(opcionTemp);
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setSelectedItem(opcionTemp);
					}
				} else {
					//jComboBoxid_opcionUsuarioOpcion.setSelectedItem(opcionTemp);
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setSelectedIndex(0);
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

	public String getActualOpcionForeignKeyDescripcion(Long idOpcionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}


			sDescripcion=OpcionConstantesFunciones.getOpcionDescripcion(opcionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualOpcionForeignKeyGenerico(Long idOpcionSeleccionado,JComboBox jComboBoxid_opcionUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsForeignKey) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			if(opcionTemp!=null) {
				jComboBoxid_opcionUsuarioOpcionGenerico.setSelectedItem(opcionTemp);
			} else {
				if(jComboBoxid_opcionUsuarioOpcionGenerico!=null && jComboBoxid_opcionUsuarioOpcionGenerico.getItemCount()>0) {
					jComboBoxid_opcionUsuarioOpcionGenerico.setSelectedIndex(0);
				}
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

					if(this.usuarioopcion!=null) {
						this.usuarioopcion.setPerfil(perfilTemp);
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setSelectedItem(perfilTemp);
					}
				} else {
					//jComboBoxid_perfilUsuarioOpcion.setSelectedItem(perfilTemp);
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPerfil") || sFormularioTipoBusqueda.equals("Todos")){
					if(perfilTemp!=null && jComboBoxid_perfilFK_IdPerfilUsuarioOpcion!=null) {
						jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.setSelectedItem(perfilTemp);
					} else {
						if(jComboBoxid_perfilFK_IdPerfilUsuarioOpcion!=null) {
							//jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.setSelectedItem(perfilTemp);
							if(jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.getItemCount()>0) {
								jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.setSelectedIndex(0);
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
	public void setActualPerfilForeignKeyGenerico(Long idPerfilSeleccionado,JComboBox jComboBoxid_perfilUsuarioOpcionGenerico)throws Exception
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
				jComboBoxid_perfilUsuarioOpcionGenerico.setSelectedItem(perfilTemp);
			} else {
				if(jComboBoxid_perfilUsuarioOpcionGenerico!=null && jComboBoxid_perfilUsuarioOpcionGenerico.getItemCount()>0) {
					jComboBoxid_perfilUsuarioOpcionGenerico.setSelectedIndex(0);
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

					if(this.usuarioopcion!=null) {
						this.usuarioopcion.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioUsuarioOpcion.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioUsuarioOpcionGenerico)throws Exception
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
				jComboBoxid_usuarioUsuarioOpcionGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioUsuarioOpcionGenerico!=null && jComboBoxid_usuarioUsuarioOpcionGenerico.getItemCount()>0) {
					jComboBoxid_usuarioUsuarioOpcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSistemaForeignKey(UsuarioOpcion usuarioopcion,JComboBox jComboBoxid_sistemaUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaAux=new Sistema();

			if(jComboBoxid_sistemaUsuarioOpcionGenerico==null) {
				sistemaAux=(Sistema)this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.getSelectedItem();
			} else {
				sistemaAux=(Sistema)jComboBoxid_sistemaUsuarioOpcionGenerico.getSelectedItem();
			}

			if(sistemaAux!=null && sistemaAux.getId()!=null) {
				usuarioopcion.setid_sistema(sistemaAux.getId());
				usuarioopcion.setsistema_descripcion(UsuarioOpcionConstantesFunciones.getSistemaDescripcion(sistemaAux));
				usuarioopcion.setSistema(sistemaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(UsuarioOpcion usuarioopcion,JComboBox jComboBoxid_moduloUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloUsuarioOpcionGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloUsuarioOpcionGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				usuarioopcion.setid_modulo(moduloAux.getId());
				usuarioopcion.setmodulo_descripcion(UsuarioOpcionConstantesFunciones.getModuloDescripcion(moduloAux));
				usuarioopcion.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoOpcionForeignKey(UsuarioOpcion usuarioopcion,JComboBox jComboBoxid_grupo_opcionUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			GrupoOpcion  grupoopcionAux=new GrupoOpcion();

			if(jComboBoxid_grupo_opcionUsuarioOpcionGenerico==null) {
				grupoopcionAux=(GrupoOpcion)this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.getSelectedItem();
			} else {
				grupoopcionAux=(GrupoOpcion)jComboBoxid_grupo_opcionUsuarioOpcionGenerico.getSelectedItem();
			}

			if(grupoopcionAux!=null) {
				usuarioopcion.setid_grupo_opcion(grupoopcionAux.getId());
				usuarioopcion.setgrupoopcion_descripcion(UsuarioOpcionConstantesFunciones.getGrupoOpcionDescripcion(grupoopcionAux));
				usuarioopcion.setGrupoOpcion(grupoopcionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOpcionForeignKey(UsuarioOpcion usuarioopcion,JComboBox jComboBoxid_opcionUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			Opcion  opcionAux=new Opcion();

			if(jComboBoxid_opcionUsuarioOpcionGenerico==null) {
				opcionAux=(Opcion)this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.getSelectedItem();
			} else {
				opcionAux=(Opcion)jComboBoxid_opcionUsuarioOpcionGenerico.getSelectedItem();
			}

			if(opcionAux!=null && opcionAux.getId()!=null) {
				usuarioopcion.setid_opcion(opcionAux.getId());
				usuarioopcion.setopcion_descripcion(UsuarioOpcionConstantesFunciones.getOpcionDescripcion(opcionAux));
				usuarioopcion.setOpcion(opcionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPerfilForeignKey(UsuarioOpcion usuarioopcion,JComboBox jComboBoxid_perfilUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			Perfil  perfilAux=new Perfil();

			if(jComboBoxid_perfilUsuarioOpcionGenerico==null) {
				perfilAux=(Perfil)this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.getSelectedItem();
			} else {
				perfilAux=(Perfil)jComboBoxid_perfilUsuarioOpcionGenerico.getSelectedItem();
			}

			if(perfilAux!=null && perfilAux.getId()!=null) {
				usuarioopcion.setid_perfil(perfilAux.getId());
				usuarioopcion.setperfil_descripcion(UsuarioOpcionConstantesFunciones.getPerfilDescripcion(perfilAux));
				usuarioopcion.setPerfil(perfilAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(UsuarioOpcion usuarioopcion,JComboBox jComboBoxid_usuarioUsuarioOpcionGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioUsuarioOpcionGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioUsuarioOpcionGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				usuarioopcion.setid_usuario(usuarioAux.getId());
				usuarioopcion.setusuario_descripcion(UsuarioOpcionConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				usuarioopcion.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSistemasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSistema=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.addItem(sistema);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
					}

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
					}

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoOpcionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoOpcion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.removeAllItems();

							for(GrupoOpcion grupoopcion:this.grupoopcionsForeignKey) {
								this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.addItem(grupoopcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
					}

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdGrupoOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.removeAllItems();

							for(GrupoOpcion grupoopcion:this.grupoopcionsForeignKey) {
								this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.addItem(grupoopcion);
							}
						}

						if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameOpcionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingOpcion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.addItem(opcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
					}

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePerfilsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPerfil=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.addItem(perfil);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
					}

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPerfil") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.addItem(perfil);
							}
						}

						if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { 
					}

					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameSistemaForeignKey(Sistema sistema,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setSelectedItem(sistema);
						}
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameGrupoOpcionForeignKey(GrupoOpcion grupoopcion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setSelectedItem(grupoopcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setSelectedItem(grupoopcion);
						} else {
							this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameOpcionForeignKey(Opcion opcion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setSelectedItem(opcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePerfilForeignKey(Perfil perfil,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setSelectedItem(perfil);
						}
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.setSelectedItem(perfil);
						} else {
							this.jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesUsuarioOpcion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UsuarioOpcionConstantesFunciones.refrescarForeignKeysDescripcionesUsuarioOpcion(this.usuarioopcionLogic.getUsuarioOpcions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UsuarioOpcionConstantesFunciones.refrescarForeignKeysDescripcionesUsuarioOpcion(this.usuarioopcions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Sistema.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(GrupoOpcion.class));
		classes.add(new Classe(Opcion.class));
		classes.add(new Classe(Perfil.class));
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//usuarioopcionLogic.setUsuarioOpcions(this.usuarioopcions);
			usuarioopcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public UsuarioOpcionParameterReturnGeneral getUsuarioOpcionParameterGeneral() {
		return this.usuarioopcionParameterGeneral;
	}
	
	public void setUsuarioOpcionParameterGeneral(UsuarioOpcionParameterReturnGeneral usuarioopcionParameterGeneral) {
		this.usuarioopcionParameterGeneral = usuarioopcionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUsuarioOpcion() {
		return isPermisoTodoUsuarioOpcion;
	}

	public void setIsPermisoTodoUsuarioOpcion(Boolean isPermisoTodoUsuarioOpcion) {
		this.isPermisoTodoUsuarioOpcion = isPermisoTodoUsuarioOpcion;
	}

	public Boolean getIsPermisoNuevoUsuarioOpcion() {
		return isPermisoNuevoUsuarioOpcion;
	}

	public void setIsPermisoNuevoUsuarioOpcion(Boolean isPermisoNuevoUsuarioOpcion) {
		this.isPermisoNuevoUsuarioOpcion = isPermisoNuevoUsuarioOpcion;
	}

	public Boolean getIsPermisoActualizarUsuarioOpcion() {
		return isPermisoActualizarUsuarioOpcion;
	}

	public void setIsPermisoActualizarUsuarioOpcion(Boolean isPermisoActualizarUsuarioOpcion) {
		this.isPermisoActualizarUsuarioOpcion = isPermisoActualizarUsuarioOpcion;
	}

	public Boolean getIsPermisoEliminarUsuarioOpcion() {
		return isPermisoEliminarUsuarioOpcion;
	}

	public void setIsPermisoEliminarUsuarioOpcion(Boolean isPermisoEliminarUsuarioOpcion) {
		this.isPermisoEliminarUsuarioOpcion = isPermisoEliminarUsuarioOpcion;
	}

	public Boolean getIsPermisoGuardarCambiosUsuarioOpcion() {
		return isPermisoGuardarCambiosUsuarioOpcion;
	}

	public void setIsPermisoGuardarCambiosUsuarioOpcion(Boolean isPermisoGuardarCambiosUsuarioOpcion) {
		this.isPermisoGuardarCambiosUsuarioOpcion = isPermisoGuardarCambiosUsuarioOpcion;
	}
	
	public Boolean getIsPermisoConsultaUsuarioOpcion() {
		return isPermisoConsultaUsuarioOpcion;
	}

	public void setIsPermisoConsultaUsuarioOpcion(Boolean isPermisoConsultaUsuarioOpcion) {
		this.isPermisoConsultaUsuarioOpcion = isPermisoConsultaUsuarioOpcion;
	}

	public Boolean getIsPermisoBusquedaUsuarioOpcion() {
		return isPermisoBusquedaUsuarioOpcion;
	}

	public void setIsPermisoBusquedaUsuarioOpcion(Boolean isPermisoBusquedaUsuarioOpcion) {
		this.isPermisoBusquedaUsuarioOpcion = isPermisoBusquedaUsuarioOpcion;
	}

	public Boolean getIsPermisoReporteUsuarioOpcion() {
		return isPermisoReporteUsuarioOpcion;
	}

	public void setIsPermisoReporteUsuarioOpcion(Boolean isPermisoReporteUsuarioOpcion) {
		this.isPermisoReporteUsuarioOpcion = isPermisoReporteUsuarioOpcion;
	}
	
	public Boolean getIsPermisoPaginacionMedioUsuarioOpcion() {
		return isPermisoPaginacionMedioUsuarioOpcion;
	}

	public void setIsPermisoPaginacionMedioUsuarioOpcion(Boolean isPermisoPaginacionMedioUsuarioOpcion) {
		this.isPermisoPaginacionMedioUsuarioOpcion = isPermisoPaginacionMedioUsuarioOpcion;
	}
	
	public Boolean getIsPermisoPaginacionTodoUsuarioOpcion() {
		return isPermisoPaginacionTodoUsuarioOpcion;
	}

	public void setIsPermisoPaginacionTodoUsuarioOpcion(Boolean isPermisoPaginacionTodoUsuarioOpcion) {
		this.isPermisoPaginacionTodoUsuarioOpcion = isPermisoPaginacionTodoUsuarioOpcion;
	}
	
	public Boolean getIsPermisoPaginacionAltoUsuarioOpcion() {
		return isPermisoPaginacionAltoUsuarioOpcion;
	}

	public void setIsPermisoPaginacionAltoUsuarioOpcion(Boolean isPermisoPaginacionAltoUsuarioOpcion) {
		this.isPermisoPaginacionAltoUsuarioOpcion = isPermisoPaginacionAltoUsuarioOpcion;
	}
	
	public Boolean getIsPermisoCopiarUsuarioOpcion() {
		return isPermisoCopiarUsuarioOpcion;
	}

	public void setIsPermisoCopiarUsuarioOpcion(Boolean isPermisoCopiarUsuarioOpcion) {
		this.isPermisoCopiarUsuarioOpcion = isPermisoCopiarUsuarioOpcion;
	}
	
	public Boolean getIsPermisoVerFormUsuarioOpcion() {
		return isPermisoVerFormUsuarioOpcion;
	}

	public void setIsPermisoVerFormUsuarioOpcion(Boolean isPermisoVerFormUsuarioOpcion) {
		this.isPermisoVerFormUsuarioOpcion = isPermisoVerFormUsuarioOpcion;
	}
	
	public Boolean getIsPermisoDuplicarUsuarioOpcion() {
		return isPermisoDuplicarUsuarioOpcion;
	}

	public void setIsPermisoDuplicarUsuarioOpcion(Boolean isPermisoDuplicarUsuarioOpcion) {
		this.isPermisoDuplicarUsuarioOpcion = isPermisoDuplicarUsuarioOpcion;
	}
	
	public Boolean getIsPermisoOrdenUsuarioOpcion() {
		return isPermisoOrdenUsuarioOpcion;
	}

	public void setIsPermisoOrdenUsuarioOpcion(Boolean isPermisoOrdenUsuarioOpcion) {
		this.isPermisoOrdenUsuarioOpcion = isPermisoOrdenUsuarioOpcion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUsuarioOpcion() {
		return isVisibilidadCeldaNuevoUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaNuevoUsuarioOpcion(Boolean isVisibilidadCeldaNuevoUsuarioOpcion) {
		this.isVisibilidadCeldaNuevoUsuarioOpcion = isVisibilidadCeldaNuevoUsuarioOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUsuarioOpcion() {
		return isVisibilidadCeldaDuplicarUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaDuplicarUsuarioOpcion(Boolean isVisibilidadCeldaDuplicarUsuarioOpcion) {
		this.isVisibilidadCeldaDuplicarUsuarioOpcion = isVisibilidadCeldaDuplicarUsuarioOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUsuarioOpcion() {
		return isVisibilidadCeldaCopiarUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaCopiarUsuarioOpcion(Boolean isVisibilidadCeldaCopiarUsuarioOpcion) {
		this.isVisibilidadCeldaCopiarUsuarioOpcion = isVisibilidadCeldaCopiarUsuarioOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUsuarioOpcion() {
		return isVisibilidadCeldaVerFormUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaVerFormUsuarioOpcion(Boolean isVisibilidadCeldaVerFormUsuarioOpcion) {
		this.isVisibilidadCeldaVerFormUsuarioOpcion = isVisibilidadCeldaVerFormUsuarioOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUsuarioOpcion() {
		return isVisibilidadCeldaOrdenUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaOrdenUsuarioOpcion(Boolean isVisibilidadCeldaOrdenUsuarioOpcion) {
		this.isVisibilidadCeldaOrdenUsuarioOpcion = isVisibilidadCeldaOrdenUsuarioOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUsuarioOpcion() {
		return isVisibilidadCeldaNuevoRelacionesUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUsuarioOpcion(Boolean isVisibilidadCeldaNuevoRelacionesUsuarioOpcion) {
		this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion = isVisibilidadCeldaNuevoRelacionesUsuarioOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUsuarioOpcion() {
		return isVisibilidadCeldaModificarUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaModificarUsuarioOpcion(Boolean isVisibilidadCeldaModificarUsuarioOpcion) {
		this.isVisibilidadCeldaModificarUsuarioOpcion = isVisibilidadCeldaModificarUsuarioOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUsuarioOpcion() {
		return isVisibilidadCeldaActualizarUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaActualizarUsuarioOpcion(Boolean isVisibilidadCeldaActualizarUsuarioOpcion) {
		this.isVisibilidadCeldaActualizarUsuarioOpcion = isVisibilidadCeldaActualizarUsuarioOpcion;
	}

	public Boolean getIsVisibilidadCeldaEliminarUsuarioOpcion() {
		return isVisibilidadCeldaEliminarUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaEliminarUsuarioOpcion(Boolean isVisibilidadCeldaEliminarUsuarioOpcion) {
		this.isVisibilidadCeldaEliminarUsuarioOpcion = isVisibilidadCeldaEliminarUsuarioOpcion;
	}

	public Boolean getIsVisibilidadCeldaCancelarUsuarioOpcion() {
		return isVisibilidadCeldaCancelarUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaCancelarUsuarioOpcion(Boolean isVisibilidadCeldaCancelarUsuarioOpcion) {
		this.isVisibilidadCeldaCancelarUsuarioOpcion = isVisibilidadCeldaCancelarUsuarioOpcion;
	}

	public Boolean getIsVisibilidadCeldaGuardarUsuarioOpcion() {
		return isVisibilidadCeldaGuardarUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaGuardarUsuarioOpcion(Boolean isVisibilidadCeldaGuardarUsuarioOpcion) {
		this.isVisibilidadCeldaGuardarUsuarioOpcion = isVisibilidadCeldaGuardarUsuarioOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUsuarioOpcion() {
		return isVisibilidadCeldaGuardarCambiosUsuarioOpcion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUsuarioOpcion(Boolean isVisibilidadCeldaGuardarCambiosUsuarioOpcion) {
		this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion = isVisibilidadCeldaGuardarCambiosUsuarioOpcion;
	}
		
	public UsuarioOpcionSessionBean getusuarioopcionSessionBean() {
		return this.usuarioopcionSessionBean;
	}
	
	public void setusuarioopcionSessionBean(UsuarioOpcionSessionBean usuarioopcionSessionBean) {
		this.usuarioopcionSessionBean=usuarioopcionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdGrupoOpcion() {
		return this.isVisibilidadFK_IdGrupoOpcion;
	}

	public void setisVisibilidadFK_IdGrupoOpcion(Boolean isVisibilidadFK_IdGrupoOpcion) {
		this.isVisibilidadFK_IdGrupoOpcion=isVisibilidadFK_IdGrupoOpcion;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdOpcion() {
		return this.isVisibilidadFK_IdOpcion;
	}

	public void setisVisibilidadFK_IdOpcion(Boolean isVisibilidadFK_IdOpcion) {
		this.isVisibilidadFK_IdOpcion=isVisibilidadFK_IdOpcion;
	}

	public Boolean getisVisibilidadFK_IdPerfil() {
		return this.isVisibilidadFK_IdPerfil;
	}

	public void setisVisibilidadFK_IdPerfil(Boolean isVisibilidadFK_IdPerfil) {
		this.isVisibilidadFK_IdPerfil=isVisibilidadFK_IdPerfil;
	}

	public Boolean getisVisibilidadFK_IdSistema() {
		return this.isVisibilidadFK_IdSistema;
	}

	public void setisVisibilidadFK_IdSistema(Boolean isVisibilidadFK_IdSistema) {
		this.isVisibilidadFK_IdSistema=isVisibilidadFK_IdSistema;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(UsuarioOpcion usuarioopcion)throws Exception {
		try {
			
				this.setActualParaGuardarSistemaForeignKey(usuarioopcion,null);
				this.setActualParaGuardarModuloForeignKey(usuarioopcion,null);
				this.setActualParaGuardarGrupoOpcionForeignKey(usuarioopcion,null);
				this.setActualParaGuardarOpcionForeignKey(usuarioopcion,null);
				this.setActualParaGuardarPerfilForeignKey(usuarioopcion,null);
				this.setActualParaGuardarUsuarioForeignKey(usuarioopcion,null);
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
	
	public void bugActualizarReferenciaActual(UsuarioOpcion usuarioopcion,UsuarioOpcion usuarioopcionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUsuarioOpcion(usuarioopcion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		usuarioopcionAux.setId(usuarioopcion.getId());
		usuarioopcionAux.setVersionRow(usuarioopcion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUsuarioOpcion();
		
			int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = usuarioopcionValidator.getInvalidValues(this.usuarioopcion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			usuarioopcionLogic.setDatosCliente(datosCliente);
			usuarioopcionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				usuarioopcionAux=new  UsuarioOpcion();
				
				usuarioopcionAux.setIsNew(true);
				usuarioopcionAux.setIsChanged(true);
				
				usuarioopcionAux.setUsuarioOpcionOriginal(this.usuarioopcion);
				
				usuarioopcionAux.setId(this.usuarioopcion.getId());	
				usuarioopcionAux.setVersionRow(this.usuarioopcion.getVersionRow());	
				usuarioopcionAux.setid_sistema(this.usuarioopcion.getid_sistema());	
				usuarioopcionAux.setid_modulo(this.usuarioopcion.getid_modulo());	
				usuarioopcionAux.setid_grupo_opcion(this.usuarioopcion.getid_grupo_opcion());	
				usuarioopcionAux.setid_opcion(this.usuarioopcion.getid_opcion());	
				usuarioopcionAux.setid_perfil(this.usuarioopcion.getid_perfil());	
				usuarioopcionAux.setid_usuario(this.usuarioopcion.getid_usuario());	
				usuarioopcionAux.setcon_precargar(this.usuarioopcion.getcon_precargar());	
				usuarioopcionAux.setestado(this.usuarioopcion.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.usuarioopcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(usuarioopcionAux,usuarioopcionLogic.getUsuarioOpcions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(usuarioopcionAux,usuarioopcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.usuarioopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionLogic.saveUsuarioOpcions();//WithConnection
						//usuarioopcionLogic.getSetVersionRowUsuarioOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.usuarioopcion,usuarioopcionAux);
					
					this.refrescarForeignKeysDescripcionesUsuarioOpcion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								usuarioopcionLogic.saveUsuarioOpcionRelaciones(usuarioopcionAux);//WithConnection
								//usuarioopcionLogic.getSetVersionRowUsuarioOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.usuarioopcion,usuarioopcionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.usuarioopcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(usuarioopcionAux,usuarioopcionLogic.getUsuarioOpcions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(usuarioopcionAux,usuarioopcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.usuarioopcion,usuarioopcionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				usuarioopcionAux=new  UsuarioOpcion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado() 
					|| (this.usuarioopcionSessionBean.getEsGuardarRelacionado() && this.usuarioopcion.getId()>=0)) {
						
					usuarioopcionAux.setIsNew(false);
				}
				
				usuarioopcionAux.setIsDeleted(false);
			
				usuarioopcionAux.setId(this.usuarioopcion.getId());	
				usuarioopcionAux.setVersionRow(this.usuarioopcion.getVersionRow());	
				usuarioopcionAux.setid_sistema(this.usuarioopcion.getid_sistema());	
				usuarioopcionAux.setid_modulo(this.usuarioopcion.getid_modulo());	
				usuarioopcionAux.setid_grupo_opcion(this.usuarioopcion.getid_grupo_opcion());	
				usuarioopcionAux.setid_opcion(this.usuarioopcion.getid_opcion());	
				usuarioopcionAux.setid_perfil(this.usuarioopcion.getid_perfil());	
				usuarioopcionAux.setid_usuario(this.usuarioopcion.getid_usuario());	
				usuarioopcionAux.setcon_precargar(this.usuarioopcion.getcon_precargar());	
				usuarioopcionAux.setestado(this.usuarioopcion.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(usuarioopcionAux,usuarioopcionLogic.getUsuarioOpcions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(usuarioopcionAux,usuarioopcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.usuarioopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionLogic.saveUsuarioOpcions();//WithConnection
						//usuarioopcionLogic.getSetVersionRowUsuarioOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.usuarioopcion,usuarioopcionAux);
					
					this.refrescarForeignKeysDescripcionesUsuarioOpcion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								usuarioopcionLogic.saveUsuarioOpcionRelaciones(usuarioopcionAux);//WithConnection
								//usuarioopcionLogic.getSetVersionRowUsuarioOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.usuarioopcion,usuarioopcionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.usuarioopcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(usuarioopcionAux,usuarioopcionLogic.getUsuarioOpcions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(usuarioopcionAux,usuarioopcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.usuarioopcion,usuarioopcionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				usuarioopcionAux=new  UsuarioOpcion();
				
				usuarioopcionAux.setIsNew(false);
				usuarioopcionAux.setIsChanged(false);
				
				usuarioopcionAux.setIsDeleted(true);
				
				usuarioopcionAux.setId(this.usuarioopcion.getId());	
				usuarioopcionAux.setVersionRow(this.usuarioopcion.getVersionRow());	
				usuarioopcionAux.setid_sistema(this.usuarioopcion.getid_sistema());	
				usuarioopcionAux.setid_modulo(this.usuarioopcion.getid_modulo());	
				usuarioopcionAux.setid_grupo_opcion(this.usuarioopcion.getid_grupo_opcion());	
				usuarioopcionAux.setid_opcion(this.usuarioopcion.getid_opcion());	
				usuarioopcionAux.setid_perfil(this.usuarioopcion.getid_perfil());	
				usuarioopcionAux.setid_usuario(this.usuarioopcion.getid_usuario());	
				usuarioopcionAux.setcon_precargar(this.usuarioopcion.getcon_precargar());	
				usuarioopcionAux.setestado(this.usuarioopcion.getestado());	
				
				if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.usuarioopcionAux.getId()>=0) {	
						this.usuarioopcionsEliminados.add(usuarioopcionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(usuarioopcionAux,usuarioopcionLogic.getUsuarioOpcions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(usuarioopcionAux,usuarioopcions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.usuarioopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionLogic.saveUsuarioOpcions();//WithConnection
						//usuarioopcionLogic.getSetVersionRowUsuarioOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								usuarioopcionLogic.saveUsuarioOpcionRelaciones(usuarioopcionAux);//WithConnection
								//usuarioopcionLogic.getSetVersionRowUsuarioOpcions();//WithConnection
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
							if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.usuarioopcionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(usuarioopcionAux,usuarioopcionLogic.getUsuarioOpcions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(usuarioopcionAux,usuarioopcions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getUsuarioOpcions().addAll(this.usuarioopcionsEliminados);
					
					usuarioopcionLogic.saveUsuarioOpcions();//WithConnection
					//usuarioopcionLogic.getSetVersionRowUsuarioOpcions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUsuarioOpcion();
				
				this.usuarioopcionsEliminados= new ArrayList<UsuarioOpcion>();		
			}
			
			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Usuario Opcion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.usuarioopcion=usuarioopcionAux;
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
      		//this.finishProcessUsuarioOpcion();
      	}
		
	}	
	
	public void actualizarRelaciones(UsuarioOpcion usuarioopcionLocal) throws Exception {
		
		if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(UsuarioOpcion usuarioopcionLocal) throws Exception {	
		if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(SistemaDetalleFormJInternalFrame.class)) {
				SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrameLocal=(SistemaBeanSwingJInternalFrame) ((SistemaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sistemaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSistema(sistemaBeanSwingJInternalFrameLocal.getsistema(),true);
				sistemaBeanSwingJInternalFrameLocal.actualizarLista(sistemaBeanSwingJInternalFrameLocal.sistema,this.sistemasForeignKey);

				sistemaBeanSwingJInternalFrameLocal.actualizarRelaciones(sistemaBeanSwingJInternalFrameLocal.sistema);

				usuarioopcionLocal.setSistema(sistemaBeanSwingJInternalFrameLocal.sistema);

				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey("Formulario");
				this.setActualSistemaForeignKey(sistemaBeanSwingJInternalFrameLocal.sistema.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				usuarioopcionLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoOpcionDetalleFormJInternalFrame.class)) {
				GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrameLocal=(GrupoOpcionBeanSwingJInternalFrame) ((GrupoOpcionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoopcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoOpcion(grupoopcionBeanSwingJInternalFrameLocal.getgrupoopcion(),true);
				grupoopcionBeanSwingJInternalFrameLocal.actualizarLista(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion,this.grupoopcionsForeignKey);

				grupoopcionBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion);

				usuarioopcionLocal.setGrupoOpcion(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion);

				this.addItemDefectoCombosForeignKeyGrupoOpcion();
				this.cargarCombosFrameGrupoOpcionsForeignKey("Formulario");
				this.setActualGrupoOpcionForeignKey(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(OpcionDetalleFormJInternalFrame.class)) {
				OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrameLocal=(OpcionBeanSwingJInternalFrame) ((OpcionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				opcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOpcion(opcionBeanSwingJInternalFrameLocal.getopcion(),true);
				opcionBeanSwingJInternalFrameLocal.actualizarLista(opcionBeanSwingJInternalFrameLocal.opcion,this.opcionsForeignKey);

				opcionBeanSwingJInternalFrameLocal.actualizarRelaciones(opcionBeanSwingJInternalFrameLocal.opcion);

				usuarioopcionLocal.setOpcion(opcionBeanSwingJInternalFrameLocal.opcion);

				this.addItemDefectoCombosForeignKeyOpcion();
				this.cargarCombosFrameOpcionsForeignKey("Formulario");
				this.setActualOpcionForeignKey(opcionBeanSwingJInternalFrameLocal.opcion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PerfilDetalleFormJInternalFrame.class)) {
				PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrameLocal=(PerfilBeanSwingJInternalFrame) ((PerfilDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				perfilBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPerfil(perfilBeanSwingJInternalFrameLocal.getperfil(),true);
				perfilBeanSwingJInternalFrameLocal.actualizarLista(perfilBeanSwingJInternalFrameLocal.perfil,this.perfilsForeignKey);

				perfilBeanSwingJInternalFrameLocal.actualizarRelaciones(perfilBeanSwingJInternalFrameLocal.perfil);

				usuarioopcionLocal.setPerfil(perfilBeanSwingJInternalFrameLocal.perfil);

				this.addItemDefectoCombosForeignKeyPerfil();
				this.cargarCombosFramePerfilsForeignKey("Formulario");
				this.setActualPerfilForeignKey(perfilBeanSwingJInternalFrameLocal.perfil.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				usuarioopcionLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUsuarioOpcionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = usuarioopcionValidator.getInvalidValues(this.usuarioopcion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(UsuarioOpcion usuarioopcion,List<UsuarioOpcion> usuarioopcions) throws Exception {
		try	{		
			UsuarioOpcionConstantesFunciones.actualizarLista(usuarioopcion,usuarioopcions,this.usuarioopcionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(UsuarioOpcion usuarioopcion,List<UsuarioOpcion> usuarioopcions) throws Exception {
		try	{			
			UsuarioOpcionConstantesFunciones.actualizarSelectedLista(usuarioopcion,usuarioopcions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<UsuarioOpcion> usuarioopcionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				usuarioopcionsLocal=this.usuarioopcionLogic.getUsuarioOpcions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				usuarioopcionsLocal=this.usuarioopcions;
			}
			//ARCHITECTURE
		
			for(UsuarioOpcion usuarioopcionLocal:usuarioopcionsLocal) {
				if(this.permiteMantenimiento(usuarioopcionLocal) && usuarioopcionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UsuarioOpcionConstantesFunciones.getUsuarioOpcionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UsuarioOpcionConstantesFunciones.IDSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_sistemaUsuarioOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UsuarioOpcionConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_moduloUsuarioOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UsuarioOpcionConstantesFunciones.IDGRUPOOPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_grupo_opcionUsuarioOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UsuarioOpcionConstantesFunciones.IDOPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_opcionUsuarioOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UsuarioOpcionConstantesFunciones.IDPERFIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_perfilUsuarioOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UsuarioOpcionConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_usuarioUsuarioOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UsuarioOpcionConstantesFunciones.CONPRECARGAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelcon_precargarUsuarioOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UsuarioOpcionConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelestadoUsuarioOpcion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_sistemaUsuarioOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_moduloUsuarioOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_grupo_opcionUsuarioOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_opcionUsuarioOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_perfilUsuarioOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelid_usuarioUsuarioOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelcon_precargarUsuarioOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelestadoUsuarioOpcion,"");
		
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
		this.iIdNuevoUsuarioOpcion--;	
		
		
		this.usuarioopcionAux=new UsuarioOpcion();
		
		this.usuarioopcionAux.setId(this.iIdNuevoUsuarioOpcion);
		this.usuarioopcionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.usuarioopcionLogic.getUsuarioOpcions().add(this.usuarioopcionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.usuarioopcions.add(this.usuarioopcionAux);
		}
		//ARCHITECTURE
		
		this.usuarioopcion=this.usuarioopcionAux;
		
		if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUsuarioOpcion(this.usuarioopcion);
			this.setVariablesObjetoActualToFormularioForeignKeyUsuarioOpcion(this.usuarioopcion);
		}
				
		//this.setDefaultControlesUsuarioOpcion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUsuarioOpcion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUsuarioOpcion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUsuarioOpcion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUsuarioOpcion(this.usuarioopcionBean,this.usuarioopcion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UsuarioOpcionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
			classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.usuarioopcionReturnGeneral=usuarioopcionLogic.procesarEventosUsuarioOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.usuarioopcionLogic.getUsuarioOpcions(),this.usuarioopcion,this.usuarioopcionParameterGeneral,this.isEsNuevoUsuarioOpcion,classes);//this.usuarioopcionLogic.getUsuarioOpcion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUsuarioOpcion(this.usuarioopcionReturnGeneral,this.usuarioopcionBean,false);
		
		if(this.usuarioopcionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUsuarioOpcion(this.usuarioopcionReturnGeneral.getUsuarioOpcion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUsuarioOpcion(this.usuarioopcionReturnGeneral.getUsuarioOpcion());
		}
		
		if(this.usuarioopcionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUsuarioOpcion(this.usuarioopcionReturnGeneral.getUsuarioOpcion(),classes);//this.usuarioopcionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUsuarioOpcion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUsuarioOpcion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.RecargarFormUsuarioOpcion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUsuarioOpcion(false);
						
			if(usuarioopcionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUsuarioOpcion();
			}
			
			this.actualizarVisualTableDatosUsuarioOpcion();
			
			this.jTableDatosUsuarioOpcion.setRowSelectionInterval(this.getIndiceNuevoUsuarioOpcion(), this.getIndiceNuevoUsuarioOpcion());
			
			this.seleccionarFilaTablaUsuarioOpcionActual();
						
			this.actualizarEstadoCeldasBotonesUsuarioOpcion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUsuarioOpcion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.setEnabled(isHabilitar && this.usuarioopcionConstantesFunciones.activarcon_precargarUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.setEnabled(isHabilitar && this.usuarioopcionConstantesFunciones.activarestadoUsuarioOpcion);	
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setEnabled(isHabilitar && this.usuarioopcionConstantesFunciones.activarid_sistemaUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setEnabled(isHabilitar && this.usuarioopcionConstantesFunciones.activarid_moduloUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setEnabled(isHabilitar && this.usuarioopcionConstantesFunciones.activarid_grupo_opcionUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setEnabled(isHabilitar && this.usuarioopcionConstantesFunciones.activarid_opcionUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setEnabled(isHabilitar && this.usuarioopcionConstantesFunciones.activarid_perfilUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setEnabled(isHabilitar && this.usuarioopcionConstantesFunciones.activarid_usuarioUsuarioOpcion);
	};
	
	public void setDefaultControlesUsuarioOpcion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUsuarioOpcion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.usuarioopcionSessionBean.setConGuardarRelaciones(true);			
			this.usuarioopcionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.setVisible(true);
			
					
		} else {
			//this.usuarioopcionSessionBean.setConGuardarRelaciones(false);			
			this.usuarioopcionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoUsuarioOpcion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
				if(usuarioopcionAux.getId().equals(this.iIdNuevoUsuarioOpcion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UsuarioOpcion usuarioopcionAux:this.usuarioopcions) {
				if(usuarioopcionAux.getId().equals(this.iIdNuevoUsuarioOpcion)) {
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
	
	public int getIndiceActualUsuarioOpcion(UsuarioOpcion usuarioopcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
				if(usuarioopcionAux.getId().equals(usuarioopcion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UsuarioOpcion usuarioopcionAux:this.usuarioopcions) {
				if(usuarioopcionAux.getId().equals(usuarioopcion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUsuarioOpcion(UsuarioOpcion usuarioopcionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
				if(usuarioopcionAux.getUsuarioOpcionOriginal().getId().equals(usuarioopcionOriginal.getId())) {
					existe=true;
					usuarioopcionOriginal.setId(usuarioopcionAux.getId());
					usuarioopcionOriginal.setVersionRow(usuarioopcionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UsuarioOpcion usuarioopcionAux:this.usuarioopcions) {
				if(usuarioopcionAux.getUsuarioOpcionOriginal().getId().equals(usuarioopcionOriginal.getId())) {
					existe=true;
					usuarioopcionOriginal.setId(usuarioopcionAux.getId());
					usuarioopcionOriginal.setVersionRow(usuarioopcionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUsuarioOpcion(Boolean esParaCancelar) throws Exception {
		usuarioopcionsAux=new ArrayList<UsuarioOpcion>();
		usuarioopcionAux=new UsuarioOpcion();
		
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
					if(usuarioopcionAux.getId()<0) {
						usuarioopcionsAux.add(usuarioopcionAux);
					}		
				}
				this.iIdNuevoUsuarioOpcion=0L;
				this.usuarioopcionLogic.getUsuarioOpcions().removeAll(usuarioopcionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UsuarioOpcion usuarioopcionAux:this.usuarioopcions) {
					if(usuarioopcionAux.getId()<0) {
						usuarioopcionsAux.add(usuarioopcionAux);
					}		
				}
				this.iIdNuevoUsuarioOpcion=0L;
				this.usuarioopcions.removeAll(usuarioopcionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUsuarioOpcion 
					&& this.usuarioopcionLogic.getUsuarioOpcions().size()>0
					) {
					usuarioopcionAux=this.usuarioopcionLogic.getUsuarioOpcions().get(this.usuarioopcionLogic.getUsuarioOpcions().size() - 1);
				
					if(usuarioopcionAux.getId()<0) {
						this.usuarioopcionLogic.getUsuarioOpcions().remove(usuarioopcionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUsuarioOpcion && this.usuarioopcions.size()>0) {
					usuarioopcionAux=this.usuarioopcions.get(this.usuarioopcions.size() - 1);
				
					if(usuarioopcionAux.getId()<0) {
						this.usuarioopcions.remove(usuarioopcionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUsuarioOpcion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(usuarioopcion.getId()<0) {
				this.usuarioopcionLogic.getUsuarioOpcions().remove(this.usuarioopcion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(usuarioopcion.getId()<0) {
				this.usuarioopcions.remove(this.usuarioopcion);
			}
		}			
	}
	
	public void setEstadosInicialesUsuarioOpcion(List<UsuarioOpcion> usuarioopcionsAux) throws Exception {
		UsuarioOpcionConstantesFunciones.setEstadosInicialesUsuarioOpcion(usuarioopcionsAux);
	}
	
	public void setEstadosInicialesUsuarioOpcion(UsuarioOpcion usuarioopcionAux) throws Exception {
		UsuarioOpcionConstantesFunciones.setEstadosInicialesUsuarioOpcion(usuarioopcionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUsuarioOpcionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUsuarioOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUsuarioOpcionActual()) {
				if(!this.isEsNuevoUsuarioOpcion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUsuarioOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUsuarioOpcion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUsuarioOpcionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Usuario Opcion ?", "MANTENIMIENTO DE Usuario Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUsuarioOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(UsuarioOpcion usuarioopcion) throws Exception {
		UsuarioOpcionConstantesFunciones.seleccionarAsignar(this.usuarioopcion,usuarioopcion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUsuarioOpcion=this.isPermisoActualizarOriginalUsuarioOpcion;
			
			
			this.seleccionarAsignar(usuarioopcion);
			
			

			idOpcionActual=usuarioopcion.getid_opcion();
			this.seleccionarOpcionActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UsuarioOpcionConstantesFunciones.quitarEspaciosUsuarioOpcion(this.usuarioopcion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUsuarioOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.usuarioopcionSessionBean.setsFuncionBusquedaRapida(this.usuarioopcionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarOpcionActual() throws Exception {
		try	{
			Opcion opcionAux=new Opcion();

			if(this.idOpcionActual != null && this.idOpcionActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getEntityWithConnection(this.idOpcionActual);
					opcionAux= opcionLogic.getOpcion();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				opcionsForeignKey=new ArrayList<Opcion>();
				opcionsForeignKey.add(opcionAux);
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
			if(this.isEsNuevoUsuarioOpcion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUsuarioOpcion(esParaCancelar);				
				this.cancelarNuevoUsuarioOpcion(esParaCancelar);								
			}
			
			this.usuarioopcion=new UsuarioOpcion();
			
			this.inicializarUsuarioOpcion();
			
			this.actualizarEstadoCeldasBotonesUsuarioOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUsuarioOpcion() throws Exception {
		try {
			UsuarioOpcionConstantesFunciones.inicializarUsuarioOpcion(this.usuarioopcion);
			
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
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.usuarioopcionLogic.getUsuarioOpcions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUsuarioOpcions(String sAccionBusqueda,List<UsuarioOpcion> usuarioopcionsParaReportes) throws Exception {
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
					sPathReporteFinal="UsuarioOpcion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UsuarioOpcionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UsuarioOpcionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="UsuarioOpcion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Usuario Opciones");		
		parameters.put("busquedapor", UsuarioOpcionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUsuarioOpcion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UsuarioOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UsuarioOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUsuarioOpcion=new JRBeanArrayDataSource(UsuarioOpcionJInternalFrame.TraerUsuarioOpcionBeans(usuarioopcionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUsuarioOpcion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UsuarioOpcionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UsuarioOpcionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UsuarioOpcionBean.TraerUsuarioOpcionBeans(usuarioopcionsParaReportes).toArray()));
							
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
				this.generarExcelReporteUsuarioOpcions(sAccionBusqueda,sTipoArchivoReporte,usuarioopcionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUsuarioOpcions(sAccionBusqueda,sTipoArchivoReporte,usuarioopcionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUsuarioOpcionActionPerformed(null);
					//this.generarExcelReporteUsuarioOpcions(sAccionBusqueda,sTipoArchivoReporte,usuarioopcionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUsuarioOpcions(sAccionBusqueda,sTipoArchivoReporte,usuarioopcionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUsuarioOpcions(sAccionBusqueda,sTipoArchivoReporte,usuarioopcionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUsuarioOpcions(sAccionBusqueda,sTipoArchivoReporte,usuarioopcionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUsuarioOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<UsuarioOpcion> usuarioopcionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"usuarioopcion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UsuarioOpcions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUsuarioOpcion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(UsuarioOpcion usuarioopcion : usuarioopcionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UsuarioOpcionConstantesFunciones.generarExcelReporteDataUsuarioOpcion("NORMAL",row,workbook,usuarioopcion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUsuarioOpcion(String sTipo,Row row,Workbook workbook) {
		
		UsuarioOpcionConstantesFunciones.generarExcelReporteHeaderUsuarioOpcion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUsuarioOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<UsuarioOpcion> usuarioopcionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"usuarioopcion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UsuarioOpcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(UsuarioOpcion usuarioopcion : usuarioopcionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UsuarioOpcionConstantesFunciones.getUsuarioOpcionDescripcion(usuarioopcion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(usuarioopcion.getsistema_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UsuarioOpcionConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(usuarioopcion.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(usuarioopcion.getgrupoopcion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UsuarioOpcionConstantesFunciones.LABEL_IDOPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDOPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(usuarioopcion.getopcion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(usuarioopcion.getperfil_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(usuarioopcion.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(usuarioopcion.getcon_precargar()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UsuarioOpcionConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(usuarioopcion.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUsuarioOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<UsuarioOpcion> usuarioopcionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<UsuarioOpcion> usuarioopcionsRespaldo=null;
		
		classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.usuarioopcionLogic.setDatosCliente(this.datosCliente);
		this.usuarioopcionLogic.setDatosDeep(this.datosDeep);
		this.usuarioopcionLogic.setIsConDeep(true);
		
		usuarioopcionsRespaldo=this.usuarioopcionLogic.getUsuarioOpcions();
		
		this.usuarioopcionLogic.setUsuarioOpcions(usuarioopcionsParaReportes);	
		this.usuarioopcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		usuarioopcionsParaReportes=this.usuarioopcionLogic.getUsuarioOpcions();
		this.usuarioopcionLogic.setUsuarioOpcions(usuarioopcionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"usuarioopcion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UsuarioOpcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUsuarioOpcion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(UsuarioOpcion usuarioopcion : usuarioopcionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUsuarioOpcion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UsuarioOpcionConstantesFunciones.generarExcelReporteDataUsuarioOpcion("NORMAL",row,workbook,usuarioopcion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(UsuarioOpcionConstantesFunciones.getUsuarioOpcionDescripcion(usuarioopcion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUsuarioOpcion() throws Exception {		
		this.startProcessUsuarioOpcion(true);
	}
	
	public void startProcessUsuarioOpcion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUsuarioOpcion ,this.jPanelParametrosReportesUsuarioOpcion, this.jScrollPanelDatosUsuarioOpcion,this.jPanelPaginacionUsuarioOpcion, this.jScrollPanelDatosEdicionUsuarioOpcion, this.jPanelAccionesUsuarioOpcion,this.jPanelAccionesFormularioUsuarioOpcion,this.jmenuBarUsuarioOpcion,this.jmenuBarDetalleUsuarioOpcion,this.jTtoolBarUsuarioOpcion,this.jTtoolBarDetalleUsuarioOpcion);		
		
		final JTabbedPane jTabbedPaneBusquedasUsuarioOpcion=this.jTabbedPaneBusquedasUsuarioOpcion; 
		
		final JPanel jPanelParametrosReportesUsuarioOpcion=this.jPanelParametrosReportesUsuarioOpcion;
		//final JScrollPane jScrollPanelDatosUsuarioOpcion=this.jScrollPanelDatosUsuarioOpcion;
		final JTable jTableDatosUsuarioOpcion=this.jTableDatosUsuarioOpcion;		
		final JPanel jPanelPaginacionUsuarioOpcion=this.jPanelPaginacionUsuarioOpcion;
		//final JScrollPane jScrollPanelDatosEdicionUsuarioOpcion=this.jScrollPanelDatosEdicionUsuarioOpcion;
		final JPanel jPanelAccionesUsuarioOpcion=this.jPanelAccionesUsuarioOpcion;
		
		JPanel jPanelCamposAuxiliarUsuarioOpcion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUsuarioOpcion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			jPanelCamposAuxiliarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jPanelCamposUsuarioOpcion;
			jPanelAccionesFormularioAuxiliarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jPanelAccionesFormularioUsuarioOpcion;
		}
		
		final JPanel jPanelCamposUsuarioOpcion=jPanelCamposAuxiliarUsuarioOpcion;
		final JPanel jPanelAccionesFormularioUsuarioOpcion=jPanelAccionesFormularioAuxiliarUsuarioOpcion;
		
		
		final JMenuBar jmenuBarUsuarioOpcion=this.jmenuBarUsuarioOpcion;
		final JToolBar jTtoolBarUsuarioOpcion=this.jTtoolBarUsuarioOpcion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUsuarioOpcion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUsuarioOpcion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			jmenuBarDetalleAuxiliarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jmenuBarDetalleUsuarioOpcion;
			jTtoolBarDetalleAuxiliarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jTtoolBarDetalleUsuarioOpcion;
		}
		
		final JMenuBar jmenuBarDetalleUsuarioOpcion=jmenuBarDetalleAuxiliarUsuarioOpcion;
		final JToolBar jTtoolBarDetalleUsuarioOpcion=jTtoolBarDetalleAuxiliarUsuarioOpcion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUsuarioOpcion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUsuarioOpcion;
			processRunnable.jTableDatos=jTableDatosUsuarioOpcion;
			processRunnable.jPanelCampos=jPanelCamposUsuarioOpcion;
			processRunnable.jPanelPaginacion=jPanelPaginacionUsuarioOpcion;
			processRunnable.jPanelAcciones=jPanelAccionesUsuarioOpcion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUsuarioOpcion;
			
			
			processRunnable.jmenuBar=jmenuBarUsuarioOpcion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUsuarioOpcion;
			processRunnable.jTtoolBar=jTtoolBarUsuarioOpcion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUsuarioOpcion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUsuarioOpcion ,jPanelParametrosReportesUsuarioOpcion,jTableDatosUsuarioOpcion, /*jScrollPanelDatosUsuarioOpcion,*/jPanelCamposUsuarioOpcion,jPanelPaginacionUsuarioOpcion, /*jScrollPanelDatosEdicionUsuarioOpcion,*/ jPanelAccionesUsuarioOpcion,jPanelAccionesFormularioUsuarioOpcion,jmenuBarUsuarioOpcion,jmenuBarDetalleUsuarioOpcion,jTtoolBarUsuarioOpcion,jTtoolBarDetalleUsuarioOpcion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUsuarioOpcion ,jPanelParametrosReportesUsuarioOpcion, jScrollPanelDatosUsuarioOpcion,jPanelPaginacionUsuarioOpcion, jScrollPanelDatosEdicionUsuarioOpcion, jPanelAccionesUsuarioOpcion,jPanelAccionesFormularioUsuarioOpcion,jmenuBarUsuarioOpcion,jmenuBarDetalleUsuarioOpcion,jTtoolBarUsuarioOpcion,jTtoolBarDetalleUsuarioOpcion);
						
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
	
	public void finishProcessUsuarioOpcion() {// throws Exception 
		this.finishProcessUsuarioOpcion(true);
	}
	
	public void finishProcessUsuarioOpcion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUsuarioOpcion ,this.jPanelParametrosReportesUsuarioOpcion, this.jScrollPanelDatosUsuarioOpcion,this.jPanelPaginacionUsuarioOpcion, this.jScrollPanelDatosEdicionUsuarioOpcion, this.jPanelAccionesUsuarioOpcion,this.jPanelAccionesFormularioUsuarioOpcion,this.jmenuBarUsuarioOpcion,this.jmenuBarDetalleUsuarioOpcion,this.jTtoolBarUsuarioOpcion,this.jTtoolBarDetalleUsuarioOpcion);		
		
		final JTabbedPane jTabbedPaneBusquedasUsuarioOpcion=this.jTabbedPaneBusquedasUsuarioOpcion; 
		
		final JPanel jPanelParametrosReportesUsuarioOpcion=this.jPanelParametrosReportesUsuarioOpcion;
		//final JScrollPane jScrollPanelDatosUsuarioOpcion=this.jScrollPanelDatosUsuarioOpcion;
		final JTable jTableDatosUsuarioOpcion=this.jTableDatosUsuarioOpcion;		
		final JPanel jPanelPaginacionUsuarioOpcion=this.jPanelPaginacionUsuarioOpcion;
		//final JScrollPane jScrollPanelDatosEdicionUsuarioOpcion=this.jScrollPanelDatosEdicionUsuarioOpcion;
		final JPanel jPanelAccionesUsuarioOpcion=this.jPanelAccionesUsuarioOpcion;
		
		JPanel jPanelCamposAuxiliarUsuarioOpcion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUsuarioOpcion=new JPanel();
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			jPanelCamposAuxiliarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jPanelCamposUsuarioOpcion;
			jPanelAccionesFormularioAuxiliarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jPanelAccionesFormularioUsuarioOpcion;
		}
		
		final JPanel jPanelCamposUsuarioOpcion=jPanelCamposAuxiliarUsuarioOpcion;
		final JPanel jPanelAccionesFormularioUsuarioOpcion=jPanelAccionesFormularioAuxiliarUsuarioOpcion;
		
		
		final JMenuBar jmenuBarUsuarioOpcion=this.jmenuBarUsuarioOpcion;		
		final JToolBar jTtoolBarUsuarioOpcion=this.jTtoolBarUsuarioOpcion;
				
		JMenuBar jmenuBarDetalleAuxiliarUsuarioOpcion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUsuarioOpcion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			jmenuBarDetalleAuxiliarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jmenuBarDetalleUsuarioOpcion;
			jTtoolBarDetalleAuxiliarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jTtoolBarDetalleUsuarioOpcion;		
		}
		
		final JMenuBar jmenuBarDetalleUsuarioOpcion=jmenuBarDetalleAuxiliarUsuarioOpcion;
		final JToolBar jTtoolBarDetalleUsuarioOpcion=jTtoolBarDetalleAuxiliarUsuarioOpcion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUsuarioOpcion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUsuarioOpcion;
			processRunnable.jTableDatos=jTableDatosUsuarioOpcion;
			processRunnable.jPanelCampos=jPanelCamposUsuarioOpcion;
			processRunnable.jPanelPaginacion=jPanelPaginacionUsuarioOpcion;
			processRunnable.jPanelAcciones=jPanelAccionesUsuarioOpcion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUsuarioOpcion;
			
			
			processRunnable.jmenuBar=jmenuBarUsuarioOpcion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUsuarioOpcion;
			processRunnable.jTtoolBar=jTtoolBarUsuarioOpcion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUsuarioOpcion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUsuarioOpcion ,jPanelParametrosReportesUsuarioOpcion, jTableDatosUsuarioOpcion,/*jScrollPanelDatosUsuarioOpcion,*/jPanelCamposUsuarioOpcion,jPanelPaginacionUsuarioOpcion, /*jScrollPanelDatosEdicionUsuarioOpcion,*/ jPanelAccionesUsuarioOpcion,jPanelAccionesFormularioUsuarioOpcion,jmenuBarUsuarioOpcion,jmenuBarDetalleUsuarioOpcion,jTtoolBarUsuarioOpcion,jTtoolBarDetalleUsuarioOpcion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUsuarioOpcion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUsuarioOpcion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUsuarioOpcion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUsuarioOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUsuarioOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUsuarioOpcion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUsuarioOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUsuarioOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUsuarioOpcion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.usuarioopcionConstantesFunciones.getsFinalQueryUsuarioOpcion();
		String  finalQueryPaginacionTodos=this.usuarioopcionConstantesFunciones.getsFinalQueryUsuarioOpcion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UsuarioOpcionConstantesFunciones.getArrayColumnasGlobalesNoUsuarioOpcion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UsuarioOpcionConstantesFunciones.getArrayColumnasGlobalesUsuarioOpcion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UsuarioOpcionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.usuarioopcionsEliminados= new ArrayList<UsuarioOpcion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUsuarioOpcion();
		
				///*UsuarioOpcionSessionBean*/this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			
			if(this.usuarioopcionSessionBean==null) {
				this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
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
					this.iNumeroPaginacion=UsuarioOpcionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UsuarioOpcionConstantesFunciones.getClassesForeignKeysOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/usuarioopcion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			usuarioopcionsAux= new ArrayList<UsuarioOpcion>();
			
				
			usuarioopcionLogic.setDatosCliente(this.datosCliente);
			usuarioopcionLogic.setDatosDeep(this.datosDeep);
			usuarioopcionLogic.setIsConDeep(true);
			
			
			usuarioopcionLogic.getUsuarioOpcionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					usuarioopcionLogic.getTodosUsuarioOpcions(finalQueryGlobal,pagination);
					
					//usuarioopcionLogic.getTodosUsuarioOpcionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(usuarioopcionLogic.getUsuarioOpcions()==null|| usuarioopcionLogic.getUsuarioOpcions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							usuarioopcionsAux= new ArrayList<UsuarioOpcion>();
							usuarioopcionsAux.addAll(usuarioopcionLogic.getUsuarioOpcions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							usuarioopcionsAux= new ArrayList<UsuarioOpcion>();
							usuarioopcionsAux.addAll(usuarioopcions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							usuarioopcionLogic.getTodosUsuarioOpcions(finalQueryGlobal+"",this.pagination);												
							
							//usuarioopcionLogic.getTodosUsuarioOpcionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUsuarioOpcions("Todos",usuarioopcionLogic.getUsuarioOpcions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());					
							usuarioopcionLogic.getUsuarioOpcions().addAll(usuarioopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							usuarioopcions=new ArrayList<UsuarioOpcion>();
							usuarioopcions.addAll(usuarioopcionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUsuarioOpcion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUsuarioOpcion=this.idActual;
				
				} else if(this.idUsuarioOpcionActual!=null && this.idUsuarioOpcionActual!=0L) {
					idUsuarioOpcion=idUsuarioOpcionActual;
				}
				
					
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndicePorId(idUsuarioOpcion);
				
				this.usuarioopcions=new ArrayList<UsuarioOpcion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					usuarioopcionLogic.getEntity(idUsuarioOpcion);
					
					//usuarioopcionLogic.getEntityWithConnection(idUsuarioOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
					usuarioopcionLogic.getUsuarioOpcions().add(usuarioopcionLogic.getUsuarioOpcion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.usuarioopcions=new ArrayList<UsuarioOpcion>();
					this.usuarioopcions.add(usuarioopcion);
				}
				
				if(usuarioopcionLogic.getUsuarioOpcion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdGrupoOpcion")) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					usuarioopcionLogic.getUsuarioOpcionsFK_IdGrupoOpcion(finalQueryGlobal,pagination,id_grupo_opcionFK_IdGrupoOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=usuarioopcionLogic.getUsuarioOpcions()==null||usuarioopcionLogic.getUsuarioOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=usuarioopcions==null|| usuarioopcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionsAux=new ArrayList<UsuarioOpcion>();
						usuarioopcionsAux.addAll(usuarioopcionLogic.getUsuarioOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							usuarioopcionsAux=new ArrayList<UsuarioOpcion>();
							usuarioopcionsAux.addAll(usuarioopcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							usuarioopcionLogic.getUsuarioOpcionsFK_IdGrupoOpcion(finalQueryGlobal,pagination,id_grupo_opcionFK_IdGrupoOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUsuarioOpcions("FK_IdGrupoOpcion",usuarioopcionLogic.getUsuarioOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUsuarioOpcions("FK_IdGrupoOpcion",usuarioopcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
						usuarioopcionLogic.getUsuarioOpcions().addAll(usuarioopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							usuarioopcions=new ArrayList<UsuarioOpcion>();
							usuarioopcions.addAll(usuarioopcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPerfil")) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					usuarioopcionLogic.getUsuarioOpcionsFK_IdPerfil(finalQueryGlobal,pagination,id_perfilFK_IdPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=usuarioopcionLogic.getUsuarioOpcions()==null||usuarioopcionLogic.getUsuarioOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=usuarioopcions==null|| usuarioopcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionsAux=new ArrayList<UsuarioOpcion>();
						usuarioopcionsAux.addAll(usuarioopcionLogic.getUsuarioOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							usuarioopcionsAux=new ArrayList<UsuarioOpcion>();
							usuarioopcionsAux.addAll(usuarioopcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							usuarioopcionLogic.getUsuarioOpcionsFK_IdPerfil(finalQueryGlobal,pagination,id_perfilFK_IdPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UsuarioOpcionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUsuarioOpcions("FK_IdPerfil",usuarioopcionLogic.getUsuarioOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUsuarioOpcions("FK_IdPerfil",usuarioopcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
						usuarioopcionLogic.getUsuarioOpcions().addAll(usuarioopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							usuarioopcions=new ArrayList<UsuarioOpcion>();
							usuarioopcions.addAll(usuarioopcionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUsuarioOpcion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUsuarioOpcion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=usuarioopcionLogic.getUsuarioOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=usuarioopcions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=usuarioopcionLogic.getUsuarioOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=usuarioopcions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(UsuarioOpcion usuarioopcion) {
		Boolean permite=true;
		
		if(this.usuarioopcion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UsuarioOpcionConstantesFunciones.getOrderByListaUsuarioOpcion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UsuarioOpcionConstantesFunciones.getOrderByListaUsuarioOpcion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UsuarioOpcion usuarioopcion:usuarioopcionLogic.getUsuarioOpcions()) {
				if(usuarioopcion.getsType().equals(Constantes2.S_TOTALES)) {
					usuarioopcionTotales=usuarioopcion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UsuarioOpcion usuarioopcion:this.usuarioopcions) {
				if(usuarioopcion.getsType().equals(Constantes2.S_TOTALES)) {
					usuarioopcionTotales=usuarioopcion;
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
			this.usuarioopcionAux=new UsuarioOpcion();
			this.usuarioopcionAux.setsType(Constantes2.S_TOTALES);
			this.usuarioopcionAux.setIsNew(false);
			this.usuarioopcionAux.setIsChanged(false);
			this.usuarioopcionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UsuarioOpcionConstantesFunciones.TotalizarValoresFilaUsuarioOpcion(this.usuarioopcionLogic.getUsuarioOpcions(),this.usuarioopcionAux);
				
				this.usuarioopcionLogic.getUsuarioOpcions().add(this.usuarioopcionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UsuarioOpcionConstantesFunciones.TotalizarValoresFilaUsuarioOpcion(this.usuarioopcions,this.usuarioopcionAux);
				
				this.usuarioopcions.add(this.usuarioopcionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		usuarioopcionTotales=new UsuarioOpcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.usuarioopcionLogic.getUsuarioOpcions().remove(usuarioopcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.usuarioopcions.remove(usuarioopcionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		usuarioopcionTotales=new UsuarioOpcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UsuarioOpcion usuarioopcion:usuarioopcionLogic.getUsuarioOpcions()) {
				if(usuarioopcion.getsType().equals(Constantes2.S_TOTALES)) {
					usuarioopcionTotales=usuarioopcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UsuarioOpcionConstantesFunciones.TotalizarValoresFilaUsuarioOpcion(this.usuarioopcionLogic.getUsuarioOpcions(),usuarioopcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UsuarioOpcion usuarioopcion:this.usuarioopcions) {
				if(usuarioopcion.getsType().equals(Constantes2.S_TOTALES)) {
					usuarioopcionTotales=usuarioopcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UsuarioOpcionConstantesFunciones.TotalizarValoresFilaUsuarioOpcion(this.usuarioopcions,usuarioopcionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUsuarioOpcionsFK_IdGrupoOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUsuarioOpcionsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUsuarioOpcionsFK_IdOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUsuarioOpcionsFK_IdPerfil()throws Exception {
		try {
			sAccionBusqueda="FK_IdPerfil";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUsuarioOpcionsFK_IdSistema()throws Exception {
		try {
			sAccionBusqueda="FK_IdSistema";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUsuarioOpcionsFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUsuarioOpcionsFK_IdGrupoOpcion(String sFinalQuery,Long id_grupo_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioopcionLogic.getUsuarioOpcionsFK_IdGrupoOpcion(sFinalQuery,this.pagination,id_grupo_opcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUsuarioOpcionsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioopcionLogic.getUsuarioOpcionsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUsuarioOpcionsFK_IdOpcion(String sFinalQuery,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioopcionLogic.getUsuarioOpcionsFK_IdOpcion(sFinalQuery,this.pagination,id_opcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUsuarioOpcionsFK_IdPerfil(String sFinalQuery,Long id_perfil)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioopcionLogic.getUsuarioOpcionsFK_IdPerfil(sFinalQuery,this.pagination,id_perfil);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUsuarioOpcionsFK_IdSistema(String sFinalQuery,Long id_sistema)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioopcionLogic.getUsuarioOpcionsFK_IdSistema(sFinalQuery,this.pagination,id_sistema);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUsuarioOpcionsFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioopcionLogic.getUsuarioOpcionsFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosUsuarioOpcion() {
		this.isPermisoTodoUsuarioOpcion=false;
		this.isPermisoNuevoUsuarioOpcion=false;
		this.isPermisoActualizarUsuarioOpcion=false;
		this.isPermisoActualizarOriginalUsuarioOpcion=false;
		this.isPermisoEliminarUsuarioOpcion=false;
		this.isPermisoGuardarCambiosUsuarioOpcion=false;
		this.isPermisoConsultaUsuarioOpcion=false;
		this.isPermisoBusquedaUsuarioOpcion=false;
		this.isPermisoReporteUsuarioOpcion=false;		
		this.isPermisoOrdenUsuarioOpcion=false;		
		this.isPermisoPaginacionMedioUsuarioOpcion=false;		
		this.isPermisoPaginacionAltoUsuarioOpcion=false;
		this.isPermisoPaginacionTodoUsuarioOpcion=false;
		this.isPermisoCopiarUsuarioOpcion=false;		
		this.isPermisoVerFormUsuarioOpcion=false;		
		this.isPermisoDuplicarUsuarioOpcion=false;		
		this.isPermisoOrdenUsuarioOpcion=false;		
	}
	
	public void setPermisosUsuarioUsuarioOpcion(Boolean isPermiso) {
		this.isPermisoTodoUsuarioOpcion=isPermiso;
		this.isPermisoNuevoUsuarioOpcion=isPermiso;
		this.isPermisoActualizarUsuarioOpcion=isPermiso;
		this.isPermisoActualizarOriginalUsuarioOpcion=isPermiso;
		this.isPermisoEliminarUsuarioOpcion=isPermiso;
		this.isPermisoGuardarCambiosUsuarioOpcion=isPermiso;
		this.isPermisoConsultaUsuarioOpcion=isPermiso;
		this.isPermisoBusquedaUsuarioOpcion=isPermiso;
		this.isPermisoReporteUsuarioOpcion=isPermiso;
		this.isPermisoOrdenUsuarioOpcion=isPermiso;		
		this.isPermisoPaginacionMedioUsuarioOpcion=isPermiso;		
		this.isPermisoPaginacionAltoUsuarioOpcion=isPermiso;		
		this.isPermisoPaginacionTodoUsuarioOpcion=isPermiso;		
		this.isPermisoCopiarUsuarioOpcion=isPermiso;		
		this.isPermisoVerFormUsuarioOpcion=isPermiso;		
		this.isPermisoDuplicarUsuarioOpcion=isPermiso;
		this.isPermisoOrdenUsuarioOpcion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUsuarioOpcion(Boolean isPermiso) {
		//this.isPermisoTodoUsuarioOpcion=isPermiso;
		this.isPermisoNuevoUsuarioOpcion=isPermiso;
		this.isPermisoActualizarUsuarioOpcion=isPermiso;
		this.isPermisoActualizarOriginalUsuarioOpcion=isPermiso;
		this.isPermisoEliminarUsuarioOpcion=isPermiso;
		this.isPermisoGuardarCambiosUsuarioOpcion=isPermiso;
		//this.isPermisoConsultaUsuarioOpcion=isPermiso;
		//this.isPermisoBusquedaUsuarioOpcion=isPermiso;
		//this.isPermisoReporteUsuarioOpcion=isPermiso;
		//this.isPermisoOrdenUsuarioOpcion=isPermiso;		
		//this.isPermisoPaginacionMedioUsuarioOpcion=isPermiso;		
		//this.isPermisoPaginacionAltoUsuarioOpcion=isPermiso;		
		//this.isPermisoPaginacionTodoUsuarioOpcion=isPermiso;		
		//this.isPermisoCopiarUsuarioOpcion=isPermiso;		
		//this.isPermisoDuplicarUsuarioOpcion=isPermiso;
		//this.isPermisoOrdenUsuarioOpcion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUsuarioOpcionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(UsuarioOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebUsuarioOpcion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUsuarioOpcionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioUsuarioOpcionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUsuarioOpcionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUsuarioOpcionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioUsuarioOpcion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UsuarioOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UsuarioOpcionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUsuarioOpcion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUsuarioOpcion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUsuarioOpcion=this.isPermisoActualizarUsuarioOpcion;
			this.isPermisoEliminarUsuarioOpcion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUsuarioOpcion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUsuarioOpcion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUsuarioOpcion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUsuarioOpcion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUsuarioOpcion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUsuarioOpcion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUsuarioOpcion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUsuarioOpcion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUsuarioOpcion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUsuarioOpcion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUsuarioOpcion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUsuarioOpcion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUsuarioOpcion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUsuarioOpcion.setToolTipText(this.jTableDatosUsuarioOpcion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUsuarioOpcion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUsuarioOpcion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UsuarioOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UsuarioOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUsuarioOpcion() throws Exception {
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
	public void inicializarCombosForeignKeyUsuarioOpcionListas()throws Exception {
		try	{						
			
				this.sistemasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.grupoopcionsForeignKey=new ArrayList();
				this.opcionsForeignKey=new ArrayList();
				this.perfilsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUsuarioOpcionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UsuarioOpcionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUsuarioOpcionListas(false);
			} else {
			
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeySistemaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SistemaConstantesFunciones.SFINALQUERY;

				this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoOpcionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.grupoopcionsForeignKey==null||this.grupoopcionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoOpcionConstantesFunciones.getArrayColumnasGlobalesGrupoOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoOpcionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoOpcionConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoOpcionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyOpcionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=OpcionConstantesFunciones.SFINALQUERY;

				this.cargarCombosOpcionsForeignKeyLista(finalQueryGlobal);
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

			if(cargarCombosDependencia && (this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyUsuarioOpcionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UsuarioOpcionParameterReturnGeneral usuarioopcionReturnGeneral=new UsuarioOpcionParameterReturnGeneral();
						
			


				String finalQueryGlobalSistema="";

				if(((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0) && this.usuarioopcionConstantesFunciones.cargarid_sistemaUsuarioOpcion)
					 || (this.esRecargarFks && this.usuarioopcionConstantesFunciones.cargarid_sistemaUsuarioOpcion)) {

					if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSistema=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

						finalQueryGlobalSistema=Funciones.GetFinalQueryAppend(finalQueryGlobalSistema, "");
						finalQueryGlobalSistema+=SistemaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSistema=" WHERE " + ConstantesSql.ID + "="+usuarioopcionSessionBean.getlidSistemaActual();
					}
				} else {
					finalQueryGlobalSistema="NONE";
				}


				String finalQueryGlobalModulo="";

				if(cargarCombosDependencia && ((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.usuarioopcionConstantesFunciones.cargarid_moduloUsuarioOpcion)
					 || (this.esRecargarFks && this.usuarioopcionConstantesFunciones.cargarid_moduloUsuarioOpcion)) {

					if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+usuarioopcionSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalGrupoOpcion="";

				if(cargarCombosDependencia && ((this.grupoopcionsForeignKey==null||this.grupoopcionsForeignKey.size()<=0) && this.usuarioopcionConstantesFunciones.cargarid_grupo_opcionUsuarioOpcion)
					 || (this.esRecargarFks && this.usuarioopcionConstantesFunciones.cargarid_grupo_opcionUsuarioOpcion)) {

					if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=GrupoOpcionConstantesFunciones.getArrayColumnasGlobalesGrupoOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrupoOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoOpcionConstantesFunciones.TABLENAME);

						finalQueryGlobalGrupoOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalGrupoOpcion, "");
						finalQueryGlobalGrupoOpcion+=GrupoOpcionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosGrupoOpcionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrupoOpcion=" WHERE " + ConstantesSql.ID + "="+usuarioopcionSessionBean.getlidGrupoOpcionActual();
					}
				} else {
					finalQueryGlobalGrupoOpcion="NONE";
				}


				String finalQueryGlobalOpcion="";

				if(cargarCombosDependencia && ((this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0) && this.usuarioopcionConstantesFunciones.cargarid_opcionUsuarioOpcion)
					 || (this.esRecargarFks && this.usuarioopcionConstantesFunciones.cargarid_opcionUsuarioOpcion)) {

					if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);

						finalQueryGlobalOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalOpcion, "");
						finalQueryGlobalOpcion+=OpcionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOpcionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOpcion=" WHERE " + ConstantesSql.ID + "="+usuarioopcionSessionBean.getlidOpcionActual();
					}
				} else {
					finalQueryGlobalOpcion="NONE";
				}


				String finalQueryGlobalPerfil="";

				if(((this.perfilsForeignKey==null||this.perfilsForeignKey.size()<=0) && this.usuarioopcionConstantesFunciones.cargarid_perfilUsuarioOpcion)
					 || (this.esRecargarFks && this.usuarioopcionConstantesFunciones.cargarid_perfilUsuarioOpcion)) {

					if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PerfilConstantesFunciones.getArrayColumnasGlobalesPerfil(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPerfil=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PerfilConstantesFunciones.TABLENAME);

						finalQueryGlobalPerfil=Funciones.GetFinalQueryAppend(finalQueryGlobalPerfil, "");
						finalQueryGlobalPerfil+=PerfilConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPerfilsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPerfil=" WHERE " + ConstantesSql.ID + "="+usuarioopcionSessionBean.getlidPerfilActual();
					}
				} else {
					finalQueryGlobalPerfil="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(cargarCombosDependencia && ((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.usuarioopcionConstantesFunciones.cargarid_usuarioUsuarioOpcion)
					 || (this.esRecargarFks && this.usuarioopcionConstantesFunciones.cargarid_usuarioUsuarioOpcion)) {

					if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+usuarioopcionSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				usuarioopcionReturnGeneral=usuarioopcionLogic.cargarCombosLoteForeignKeyUsuarioOpcion(finalQueryGlobalSistema,finalQueryGlobalModulo,finalQueryGlobalGrupoOpcion,finalQueryGlobalOpcion,finalQueryGlobalPerfil,finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSistema.equals("NONE")) {
				this.sistemasForeignKey=usuarioopcionReturnGeneral.getsistemasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=usuarioopcionReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalGrupoOpcion.equals("NONE")) {
				this.grupoopcionsForeignKey=usuarioopcionReturnGeneral.getgrupoopcionsForeignKey();
			}

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				this.opcionsForeignKey=usuarioopcionReturnGeneral.getopcionsForeignKey();
			}

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				this.perfilsForeignKey=usuarioopcionReturnGeneral.getperfilsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=usuarioopcionReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUsuarioOpcion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeySistema();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyGrupoOpcion();
			this.addItemDefectoCombosForeignKeyOpcion();
			this.addItemDefectoCombosForeignKeyPerfil();
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeySistema()throws Exception {
		try {
			if(this.usuarioopcionSessionBean==null) {
				this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
				Sistema sistema=new Sistema();
				SistemaConstantesFunciones.setSistemaDescripcion(sistema,Constantes.SMENSAJE_ESCOJA_OPCION);
				sistema.setId(null);

				if(!SistemaConstantesFunciones.ExisteEnLista(this.sistemasForeignKey,sistema,true)) {

					this.sistemasForeignKey.add(0,sistema);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyGrupoOpcion()throws Exception {
		try {

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {
				GrupoOpcion grupoopcion=new GrupoOpcion();
				GrupoOpcionConstantesFunciones.setGrupoOpcionDescripcion(grupoopcion,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupoopcion.setId(null);

				if(!GrupoOpcionConstantesFunciones.ExisteEnLista(this.grupoopcionsForeignKey,grupoopcion,true)) {

					this.grupoopcionsForeignKey.add(0,grupoopcion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyOpcion()throws Exception {
		try {

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
				Opcion opcion=new Opcion();
				OpcionConstantesFunciones.setOpcionDescripcion(opcion,Constantes.SMENSAJE_ESCOJA_OPCION);
				opcion.setId(null);

				if(!OpcionConstantesFunciones.ExisteEnLista(this.opcionsForeignKey,opcion,true)) {

					this.opcionsForeignKey.add(0,opcion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPerfil()throws Exception {
		try {

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
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

			if(!this.usuarioopcionSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
	
	public void initActionsCombosTodosForeignKeyUsuarioOpcion()throws Exception {
		try {
			
			this.initActionsCombosForeignKeySistema("Todos");
			this.initActionsCombosForeignKeyModulo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUsuarioOpcion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeySistema(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyModulo(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeySistema(JComboBox jComboBoxSistemaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Sistema sistemaLocal=(Sistema)jComboBoxSistemaGenerico.getSelectedItem();

			if(sistemaLocal!=null  && sistemaLocal.getId()!=null  && sistemaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_sistema="+sistemaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboModulo=sFinalQueryCombo;

			this.modulosForeignKey=new ArrayList<Modulo>();
			this.cargarCombosForeignKeyModulo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboPerfil=sFinalQueryCombo;

			this.perfilsForeignKey=new ArrayList<Perfil>();
			this.cargarCombosForeignKeyPerfil(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyModulo(JComboBox jComboBoxModuloGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Modulo moduloLocal=(Modulo)jComboBoxModuloGenerico.getSelectedItem();

			if(moduloLocal!=null  && moduloLocal.getId()!=null  && moduloLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_modulo="+moduloLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboGrupoOpcion=sFinalQueryCombo;

			this.grupoopcionsForeignKey=new ArrayList<GrupoOpcion>();
			this.cargarCombosForeignKeyGrupoOpcion(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboOpcion=sFinalQueryCombo;

			this.opcionsForeignKey=new ArrayList<Opcion>();
			this.cargarCombosForeignKeyOpcion(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeySistema(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.addItemListener(new ComboBoxItemListener(this,"id_sistemaUsuarioOpcion"));
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaUsuarioOpcion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.addActionListener(new ComboBoxActionListener(this,"id_sistemaUsuarioOpcion"));
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaUsuarioOpcion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.addItemListener(new ComboBoxItemListener(this,"id_moduloUsuarioOpcion"));
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_moduloUsuarioOpcion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.addActionListener(new ComboBoxActionListener(this,"id_moduloUsuarioOpcion"));
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_moduloUsuarioOpcion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyUsuarioOpcion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUsuarioOpcion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUsuarioOpcion(UsuarioOpcion usuarioopcion)throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(usuarioopcion.getid_sistema(),false,"Formulario");
			this.setActualModuloForeignKey(usuarioopcion.getid_modulo(),false,"Formulario");
			this.setActualGrupoOpcionForeignKey(usuarioopcion.getid_grupo_opcion(),false,"Formulario");
			this.setActualOpcionForeignKey(usuarioopcion.getid_opcion(),false,"Formulario");
			this.setActualPerfilForeignKey(usuarioopcion.getid_perfil(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUsuarioOpcion(UsuarioOpcion usuarioopcion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(usuarioopcion.getOpcion()!=null && !sTipoEvento.equals("id_opcionUsuarioOpcion")) { //sTipoEvento Evita Bucle Infinito

					this.opcionsForeignKey=new ArrayList<Opcion>();
					this.opcionsForeignKey.add(usuarioopcion.getOpcion());

					this.addItemDefectoCombosForeignKeyOpcion();
					this.cargarCombosFrameOpcionsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUsuarioOpcion()throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(this.usuarioopcionConstantesFunciones.getid_sistema(),false,"Formulario");
			this.setActualModuloForeignKey(this.usuarioopcionConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualGrupoOpcionForeignKey(this.usuarioopcionConstantesFunciones.getid_grupo_opcion(),false,"Formulario");
			this.setActualOpcionForeignKey(this.usuarioopcionConstantesFunciones.getid_opcion(),false,"Formulario");
			this.setActualPerfilForeignKey(this.usuarioopcionConstantesFunciones.getid_perfil(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUsuarioOpcion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUsuarioOpcion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUsuarioOpcion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUsuarioOpcion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUsuarioOpcion()throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameGrupoOpcionsForeignKey("Todos");
			this.cargarCombosFrameOpcionsForeignKey("Todos");
			this.cargarCombosFramePerfilsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUsuarioOpcion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoOpcionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUsuarioOpcion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormUsuarioOpcionSistema(JComboBox<?> jComboBoxGenericoSistema,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormUsuarioOpcionid_modulo(jComboBoxGenericoSistema,sFormularioTipoBusqueda,"Sistema",false);
		this.recargarFormUsuarioOpcionid_usuario(jComboBoxGenericoSistema,sFormularioTipoBusqueda,"Sistema",false);
	}

	public void recargarFormUsuarioOpcionModulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormUsuarioOpcionid_grupo_opcion(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
		this.recargarFormUsuarioOpcionid_opcion(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
	}








	
	



	public void recargarFormUsuarioOpcionid_modulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Sistema")){
				this.setActualParaGuardarSistemaForeignKey(this.usuarioopcion,jComboBoxGenericoModulo);
			}

			if(this.usuarioopcion.getid_sistema()!=null && this.usuarioopcion.getid_sistema()!=0L) {
				sFinalQuery+="  WHERE  id_sistema="+this.usuarioopcion.getid_sistema();
			} else {
				sFinalQuery+="  WHERE  id_sistema=-1";
			}



			//BUCLE RECURSIVO
			this.setActualModuloForeignKey(this.usuarioopcion.getid_sistema(),true,sFormularioTipoBusqueda);

			this.cargarCombosModulosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormUsuarioOpcionid_grupo_opcion(JComboBox<?> jComboBoxGenericoGrupoOpcion,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.usuarioopcion,jComboBoxGenericoGrupoOpcion);
			}

			if(this.usuarioopcion.getid_modulo()!=null && this.usuarioopcion.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.usuarioopcion.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualGrupoOpcionForeignKey(this.usuarioopcion.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosGrupoOpcionsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameGrupoOpcionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormUsuarioOpcionid_opcion(JComboBox<?> jComboBoxGenericoOpcion,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.usuarioopcion,jComboBoxGenericoOpcion);
			}

			if(this.usuarioopcion.getid_modulo()!=null && this.usuarioopcion.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.usuarioopcion.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualOpcionForeignKey(this.usuarioopcion.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosOpcionsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormUsuarioOpcionid_usuario(JComboBox<?> jComboBoxGenericoUsuario,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Sistema")){
				this.setActualParaGuardarSistemaForeignKey(this.usuarioopcion,jComboBoxGenericoUsuario);
			}

			if(this.usuarioopcion.getid_sistema()!=null && this.usuarioopcion.getid_sistema()!=0L) {
				sFinalQuery+="  WHERE  id_sistema="+this.usuarioopcion.getid_sistema();
			} else {
				sFinalQuery+="  WHERE  id_sistema=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUsuarioForeignKey(this.usuarioopcion.getid_sistema(),true,sFormularioTipoBusqueda);

			this.cargarCombosUsuariosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public UsuarioOpcionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UsuarioOpcionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UsuarioOpcionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean(); 
		this.usuarioopcionConstantesFunciones=new UsuarioOpcionConstantesFunciones(); 
		this.usuarioopcionBean=new UsuarioOpcion();//(this.usuarioopcionConstantesFunciones); 		
		this.usuarioopcionReturnGeneral=new UsuarioOpcionParameterReturnGeneral(); 
		
		this.usuarioopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.usuarioopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UsuarioOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UsuarioOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UsuarioOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUsuarioOpcion(true);
			
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
			
			this.usuarioopcionConstantesFunciones=new UsuarioOpcionConstantesFunciones(); 
			this.usuarioopcionBean=new UsuarioOpcion();//this.usuarioopcionConstantesFunciones); 			
			this.usuarioopcionReturnGeneral=new UsuarioOpcionParameterReturnGeneral(); 
		
			UsuarioOpcionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Usuario Opcion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.usuarioopcion=new UsuarioOpcion();
			this.usuarioopcions = new ArrayList<UsuarioOpcion>();
			this.usuarioopcionsAux = new ArrayList<UsuarioOpcion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic=new UsuarioOpcionLogic();
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}
			
			//this.usuarioopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.usuarioopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUsuarioOpcion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUsuarioOpcion);	
					}
					
					if(this.jInternalFrameImportacionUsuarioOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUsuarioOpcion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUsuarioOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUsuarioOpcion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUsuarioOpcion);
				this.jInternalFrameDetalleFormUsuarioOpcion.setVisible(false);
				this.jInternalFrameDetalleFormUsuarioOpcion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUsuarioOpcion);
					this.jInternalFrameReporteDinamicoUsuarioOpcion.setVisible(false);
					this.jInternalFrameReporteDinamicoUsuarioOpcion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUsuarioOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUsuarioOpcion);
					this.jInternalFrameImportacionUsuarioOpcion.setVisible(false);
					this.jInternalFrameImportacionUsuarioOpcion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUsuarioOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUsuarioOpcion);
					this.jInternalFrameOrderByUsuarioOpcion.setVisible(false);
					this.jInternalFrameOrderByUsuarioOpcion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUsuarioOpcionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UsuarioOpcionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.usuarioopcionReturnGeneral=new UsuarioOpcionParameterReturnGeneral();
			
			this.usuarioopcionParameterGeneral=new UsuarioOpcionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.usuarioopcionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UsuarioOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UsuarioOpcionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.usuarioopcionSessionBean.getEsGuardarRelacionado(),this.usuarioopcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UsuarioOpcionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.usuarioopcionSessionBean.getEsGuardarRelacionado(),this.usuarioopcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUsuarioOpcion=false;
			this.isVisibilidadCeldaDuplicarUsuarioOpcion=true;
			this.isVisibilidadCeldaCopiarUsuarioOpcion=true;
			this.isVisibilidadCeldaVerFormUsuarioOpcion=true;
			this.isVisibilidadCeldaOrdenUsuarioOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
			this.isVisibilidadCeldaModificarUsuarioOpcion=false;
			this.isVisibilidadCeldaActualizarUsuarioOpcion=false;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=false;
			this.isVisibilidadCeldaCancelarUsuarioOpcion=false;
			this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=false;
			
			
			this.isVisibilidadFK_IdGrupoOpcion=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdOpcion=true;
			this.isVisibilidadFK_IdPerfil=true;
			this.isVisibilidadFK_IdSistema=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUsuarioOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUsuarioOpcion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUsuarioOpcion(false);
			
			this.setPermisosUsuarioUsuarioOpcion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado() 
				|| (this.usuarioopcionSessionBean.getEsGuardarRelacionado() && this.usuarioopcionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUsuarioOpcionClasesRelacionadas();
			}
			
			if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUsuarioOpcionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUsuarioOpcion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUsuarioOpcion();
			}
			
			if(!this.isPermisoBusquedaUsuarioOpcion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUsuarioOpcion,this.isPermisoPaginacionMedioUsuarioOpcion,this.isPermisoPaginacionTodoUsuarioOpcion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UsuarioOpcionConstantesFunciones.getTiposSeleccionarUsuarioOpcion());
				
				this.tiposColumnasSelect=UsuarioOpcionConstantesFunciones.getTiposSeleccionarUsuarioOpcion(true);
				
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
			//if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUsuarioOpcion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioUsuarioOpcion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioUsuarioOpcion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUsuarioOpcion() ;
			
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
			
			this.sistemaLogic=new SistemaLogic();
			this.moduloLogic=new ModuloLogic();
			this.grupoopcionLogic=new GrupoOpcionLogic();
			this.opcionLogic=new OpcionLogic();
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
				usuarioopcionImplementable= (UsuarioOpcionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UsuarioOpcionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				usuarioopcionImplementableHome= (UsuarioOpcionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UsuarioOpcionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.usuarioopcions= new ArrayList<UsuarioOpcion>();
			this.usuarioopcionsEliminados= new ArrayList<UsuarioOpcion>();
						
			this.isEsNuevoUsuarioOpcion=false;
			this.esParaAccionDesdeFormularioUsuarioOpcion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idOpcionActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.sistemasForeignKey=new ArrayList<Sistema>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.grupoopcionsForeignKey=new ArrayList<GrupoOpcion>() ;
			this.opcionsForeignKey=new ArrayList<Opcion>() ;
			this.perfilsForeignKey=new ArrayList<Perfil>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUsuarioOpcion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUsuarioOpcion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UsuarioOpcionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UsuarioOpcionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUsuarioOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUsuarioOpcion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUsuarioOpcion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUsuarioOpcion();
			}
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUsuarioOpcion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUsuarioOpcion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUsuarioOpcion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUsuarioOpcion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga UsuarioOpcion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUsuarioOpcion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUsuarioOpcion")) {
				iIndex=this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUsuarioOpcion();	
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
	
	public void cargarCombosForeignKeyUsuarioOpcion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUsuarioOpcion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUsuarioOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUsuarioOpcionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUsuarioOpcion();
		
		this.cargarCombosFrameForeignKeyUsuarioOpcion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUsuarioOpcion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUsuarioOpcion();
		}
	}
	
	

	public void cargarCombosForeignKeySistema(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeySistema("Todos");
				}

			this.recargarComboTablaSistema(this.sistemasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoOpcion();
				this.cargarCombosFrameGrupoOpcionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaGrupoOpcion(this.grupoopcionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyOpcion();
				this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaOpcion(this.opcionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPerfil(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPerfil();
				this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaPerfil(this.perfilsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaUsuario(this.usuariosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoUsuarioOpcionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
			
			if(jTableDatosUsuarioOpcion.getRowCount()>=1) {
				jTableDatosUsuarioOpcion.removeRowSelectionInterval(0, jTableDatosUsuarioOpcion.getRowCount()-1);						
			}
			
			this.isEsNuevoUsuarioOpcion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUsuarioOpcion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUsuarioOpcion(true);			
			//this.usuarioopcion=new UsuarioOpcion();
			//this.usuarioopcion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUsuarioOpcion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUsuarioOpcion() ;
			
			if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUsuarioOpcion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.usuarioopcion);	
			this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);				
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
			if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar UsuarioOpcion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUsuarioOpcionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUsuarioOpcion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUsuarioOpcion.getSelectedRows().length;			
			}
			
			usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUsuarioOpcion--;			
				//UsuarioOpcion usuarioopcionAux= new UsuarioOpcion();			
				//usuarioopcionAux.setId(this.iIdNuevoUsuarioOpcion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//UsuarioOpcion usuarioopcionOrigen=new UsuarioOpcion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(UsuarioOpcion usuarioopcionOrigen : usuarioopcionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							usuarioopcionOrigen =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							usuarioopcionOrigen =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUsuarioOpcion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.usuarioopcion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUsuarioOpcion(usuarioopcionOrigen,this.usuarioopcion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.usuarioopcionLogic.getUsuarioOpcions().add(this.usuarioopcionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.usuarioopcions.add(this.usuarioopcionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUsuarioOpcion(false);
				
				this.jTableDatosUsuarioOpcion.setRowSelectionInterval(this.getIndiceNuevoUsuarioOpcion(), this.getIndiceNuevoUsuarioOpcion());
				
				int iLastRow =  this.jTableDatosUsuarioOpcion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUsuarioOpcion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUsuarioOpcion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUsuarioOpcion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();									
		
			UsuarioOpcion usuarioopcionOrigen=new UsuarioOpcion();
			UsuarioOpcion usuarioopcionDestino=new UsuarioOpcion();
				
			usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUsuarioOpcion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || usuarioopcionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUsuarioOpcion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionOrigen =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						usuarioopcionOrigen =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						usuarioopcionDestino =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						usuarioopcionDestino =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				usuarioopcionOrigen =usuarioopcionsSeleccionados.get(0);
				usuarioopcionDestino =usuarioopcionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUsuarioOpcion(usuarioopcionOrigen,usuarioopcionDestino,true,false);
				
				usuarioopcionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(usuarioopcionDestino,usuarioopcionLogic.getUsuarioOpcions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(usuarioopcionDestino,usuarioopcions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUsuarioOpcion(false);
				
				//this.jTableDatosUsuarioOpcion.setRowSelectionInterval(this.getIndiceNuevoUsuarioOpcion(), this.getIndiceNuevoUsuarioOpcion());
				
				int iLastRow =  this.jTableDatosUsuarioOpcion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUsuarioOpcion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUsuarioOpcion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUsuarioOpcion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUsuarioOpcion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUsuarioOpcion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUsuarioOpcion.setVisible(!isVisible);
			this.jPanelPaginacionUsuarioOpcion.setVisible(!isVisible);
			this.jPanelAccionesUsuarioOpcion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUsuarioOpcion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUsuarioOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUsuarioOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUsuarioOpcion();
			
			this.abrirFrameOrderByUsuarioOpcion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUsuarioOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUsuarioOpcion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUsuarioOpcion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUsuarioOpcion.isMaximum()) {
					this.jInternalFrameDetalleFormUsuarioOpcion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUsuarioOpcion.setSize(this.jInternalFrameDetalleFormUsuarioOpcion.iWidthFormulario,this.jInternalFrameDetalleFormUsuarioOpcion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUsuarioOpcion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUsuarioOpcion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUsuarioOpcion.isMaximum()) {
						this.jInternalFrameDetalleFormUsuarioOpcion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUsuarioOpcion.jContentPaneDetalleUsuarioOpcion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUsuarioOpcion.jContentPaneDetalleUsuarioOpcion.getWidth(),UsuarioOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUsuarioOpcion.jContentPaneDetalleUsuarioOpcion.getWidth(),UsuarioOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUsuarioOpcion.jContentPaneDetalleUsuarioOpcion.getWidth(),UsuarioOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUsuarioOpcion.setVisible(true);
	        this.jInternalFrameDetalleFormUsuarioOpcion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUsuarioOpcion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUsuarioOpcion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUsuarioOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUsuarioOpcion,false,this);
				} else {
					this.jInternalFrameOrderByUsuarioOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUsuarioOpcion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUsuarioOpcion);
				this.jInternalFrameOrderByUsuarioOpcion.setVisible(false);
				this.jInternalFrameOrderByUsuarioOpcion.setSelected(false);
				
				this.jInternalFrameOrderByUsuarioOpcion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUsuarioOpcion"));
				
				this.inicializarActualizarBindingTablaOrderByUsuarioOpcion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUsuarioOpcion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUsuarioOpcion==null) {
				
				this.jInternalFrameImportacionUsuarioOpcion=new ImportacionJInternalFrame(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUsuarioOpcion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUsuarioOpcion);
				this.jInternalFrameImportacionUsuarioOpcion.setVisible(false);
				this.jInternalFrameImportacionUsuarioOpcion.setSelected(false);


				this.jInternalFrameImportacionUsuarioOpcion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUsuarioOpcion"));
				this.jInternalFrameImportacionUsuarioOpcion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUsuarioOpcion"));
				this.jInternalFrameImportacionUsuarioOpcion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUsuarioOpcion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUsuarioOpcion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUsuarioOpcion==null) {
				this.jInternalFrameReporteDinamicoUsuarioOpcion=new ReporteDinamicoJInternalFrame(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUsuarioOpcion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUsuarioOpcion);
				this.jInternalFrameReporteDinamicoUsuarioOpcion.setVisible(false);
				this.jInternalFrameReporteDinamicoUsuarioOpcion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUsuarioOpcion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUsuarioOpcion"));
				this.jInternalFrameReporteDinamicoUsuarioOpcion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUsuarioOpcion"));
				this.jInternalFrameReporteDinamicoUsuarioOpcion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUsuarioOpcion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUsuarioOpcion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleUsuarioOpcion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUsuarioOpcion);
			
	       	this.jInternalFrameDetalleFormUsuarioOpcion.setVisible(false);
	        this.jInternalFrameDetalleFormUsuarioOpcion.setSelected(false);
			
			//this.jInternalFrameDetalleFormUsuarioOpcion.dispose();
			//this.jInternalFrameDetalleFormUsuarioOpcion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUsuarioOpcion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUsuarioOpcion.setVisible(true);
	        this.jInternalFrameReporteDinamicoUsuarioOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUsuarioOpcion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUsuarioOpcion.setVisible(true);
	        this.jInternalFrameImportacionUsuarioOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUsuarioOpcion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUsuarioOpcion.setVisible(true);
	        this.jInternalFrameOrderByUsuarioOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUsuarioOpcion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUsuarioOpcion.setVisible(false);
	        this.jInternalFrameOrderByUsuarioOpcion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUsuarioOpcion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUsuarioOpcion.setVisible(false);
	        this.jInternalFrameReporteDinamicoUsuarioOpcion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUsuarioOpcion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUsuarioOpcion.setVisible(false);
	        this.jInternalFrameImportacionUsuarioOpcion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeOpcion(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeOpcion);
						OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.sTipoBusqueda="Opcion";
						}

						opcionBeanSwingJInternalFrame.getTodosOpcionArbol();
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setOpcions(opcionBeanSwingJInternalFrame.opcionsArbol);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.CargarTreeOpcion();
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setVisible(true);
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						opcionBeanSwingJInternalFrame.jInternalFrameTreeOpcion.jInternalFrameParent=this;
						TitledBorder titledBorderUsuarioOpcion=(TitledBorder)this.jScrollPanelDatosUsuarioOpcion.getBorder();
						TitledBorder titledBorderOpcion=(TitledBorder)opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

						titledBorderOpcion.setTitle(titledBorderUsuarioOpcion.getTitle() + " -> Opcion");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(opcionBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeOpcion(OpcionBeanSwingJInternalFrame jInternalFrameTreeOpcion) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeOpcion);
						jInternalFrameTreeOpcion.setVisible(false);
						jInternalFrameTreeOpcion.setSelected(false);
						//jInternalFrameTreeOpcion.dispose();
						//jInternalFrameTreeOpcion=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUsuarioOpcion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUsuarioOpcion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUsuarioOpcion(true);
			//this.isEsNuevoUsuarioOpcion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUsuarioOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUsuarioOpcion(false) ;
			
			if(usuarioopcionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUsuarioOpcion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUsuarioOpcion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUsuarioOpcionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUsuarioOpcion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUsuarioOpcion(true);
			//this.isEsNuevoUsuarioOpcion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.usuarioopcion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUsuarioOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUsuarioOpcion(false) ;
			
			if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUsuarioOpcion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUsuarioOpcion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Opcion")) {
				if(!this.usuarioopcionConstantesFunciones.cargarid_opcionUsuarioOpcion) {
					this.cargarCombosOpcionsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingUsuarioOpcion(false,false);
					this.cargarCombosFrameOpcionsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_opcion (id);

				this.recargarComboTablaOpcion(this.opcionsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaSistema(List<Sistema> sistemasForeignKey)throws Exception{
		TableColumn tableColumnSistema=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA));
		TableCellEditor tableCellEditorSistema =tableColumnSistema.getCellEditor();

		SistemaTableCell sistemaTableCellFk=(SistemaTableCell)tableCellEditorSistema;

		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.setsistemasForeignKey(sistemasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUsuarioOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sistemaTableCellFk.setRowActual(intSelectedRow);
			//sistemaTableCellFk.setsistemasForeignKeyActual(sistemasForeignKey);
		//}


		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.RecargarSistemasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUsuarioOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaGrupoOpcion(List<GrupoOpcion> grupoopcionsForeignKey)throws Exception{
		TableColumn tableColumnGrupoOpcion=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION));
		TableCellEditor tableCellEditorGrupoOpcion =tableColumnGrupoOpcion.getCellEditor();

		GrupoOpcionTableCell grupoopcionTableCellFk=(GrupoOpcionTableCell)tableCellEditorGrupoOpcion;

		if(grupoopcionTableCellFk!=null) {
			grupoopcionTableCellFk.setgrupoopcionsForeignKey(grupoopcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUsuarioOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoopcionTableCellFk.setRowActual(intSelectedRow);
			//grupoopcionTableCellFk.setgrupoopcionsForeignKeyActual(grupoopcionsForeignKey);
		//}


		if(grupoopcionTableCellFk!=null) {
			grupoopcionTableCellFk.RecargarGrupoOpcionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaOpcion(List<Opcion> opcionsForeignKey)throws Exception{
		TableColumn tableColumnOpcion=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDOPCION));
		TableCellEditor tableCellEditorOpcion =tableColumnOpcion.getCellEditor();

		OpcionTableCell opcionTableCellFk=(OpcionTableCell)tableCellEditorOpcion;

		if(opcionTableCellFk!=null) {
			opcionTableCellFk.setopcionsForeignKey(opcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUsuarioOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//opcionTableCellFk.setRowActual(intSelectedRow);
			//opcionTableCellFk.setopcionsForeignKeyActual(opcionsForeignKey);
		//}


		if(opcionTableCellFk!=null) {
			opcionTableCellFk.RecargarOpcionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPerfil(List<Perfil> perfilsForeignKey)throws Exception{
		TableColumn tableColumnPerfil=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL));
		TableCellEditor tableCellEditorPerfil =tableColumnPerfil.getCellEditor();

		PerfilTableCell perfilTableCellFk=(PerfilTableCell)tableCellEditorPerfil;

		if(perfilTableCellFk!=null) {
			perfilTableCellFk.setperfilsForeignKey(perfilsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUsuarioOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//perfilTableCellFk.setRowActual(intSelectedRow);
			//perfilTableCellFk.setperfilsForeignKeyActual(perfilsForeignKey);
		//}


		if(perfilTableCellFk!=null) {
			perfilTableCellFk.RecargarPerfilsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUsuario(List<Usuario> usuariosForeignKey)throws Exception{
		TableColumn tableColumnUsuario=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO));
		TableCellEditor tableCellEditorUsuario =tableColumnUsuario.getCellEditor();

		UsuarioTableCell usuarioTableCellFk=(UsuarioTableCell)tableCellEditorUsuario;

		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.setusuariosForeignKey(usuariosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUsuarioOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//usuarioTableCellFk.setRowActual(intSelectedRow);
			//usuarioTableCellFk.setusuariosForeignKeyActual(usuariosForeignKey);
		//}


		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.RecargarUsuariosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_opcion (Long id) throws Exception {
		this.setActualOpcionForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUsuarioOpcion(false);
			
			//if(!this.isEsNuevoUsuarioOpcion) {								
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				
			}
			
			if(this.permiteMantenimiento(this.usuarioopcion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUsuarioOpcion=true;
					this.inicializarActualizarBindingTablaUsuarioOpcion(false);
					this.isEsNuevoUsuarioOpcion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUsuarioOpcion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUsuarioOpcion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUsuarioOpcion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUsuarioOpcion(false);
				
				this.habilitarDeshabilitarControlesUsuarioOpcion(false);
			
												
				
				if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUsuarioOpcion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUsuarioOpcionActionPerformed(evt,usuarioopcionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUsuarioOpcion(this.usuarioopcion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUsuarioOpcion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,usuarioopcionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.usuarioopcion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				this.usuarioopcion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				this.usuarioopcion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.usuarioopcion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UsuarioOpcionModel) this.jTableDatosUsuarioOpcion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUsuarioOpcion=true;
				this.inicializarActualizarBindingTablaUsuarioOpcion(false);
				this.isEsNuevoUsuarioOpcion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUsuarioOpcion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUsuarioOpcion(false);
				
				this.habilitarDeshabilitarControlesUsuarioOpcion(false);
				
				
				
				if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUsuarioOpcion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUsuarioOpcion.getRowCount()>=1) {
				jTableDatosUsuarioOpcion.removeRowSelectionInterval(0, jTableDatosUsuarioOpcion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUsuarioOpcion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUsuarioOpcion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUsuarioOpcion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUsuarioOpcion(false) ;
			
			this.isEsNuevoUsuarioOpcion=false;
			
			if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUsuarioOpcion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUsuarioOpcion(false);
				
				//SI ES MANUAL
				if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUsuarioOpcion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUsuarioOpcion--;			
			//UsuarioOpcion usuarioopcionAux= new UsuarioOpcion();			
			//usuarioopcionAux.setId(this.iIdNuevoUsuarioOpcion);
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUsuarioOpcion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
			
			this.usuarioopcion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.usuarioopcionLogic.getUsuarioOpcions().add(this.usuarioopcionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.usuarioopcions.add(this.usuarioopcionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUsuarioOpcion(false);
			
			this.jTableDatosUsuarioOpcion.setRowSelectionInterval(this.getIndiceNuevoUsuarioOpcion(), this.getIndiceNuevoUsuarioOpcion());
			
			int iLastRow =  this.jTableDatosUsuarioOpcion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUsuarioOpcion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUsuarioOpcion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUsuarioOpcion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUsuarioOpcion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUsuarioOpcion(false);
			
			//SI ES MANUAL
			if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUsuarioOpcion();
			}
			
			//this.abrirFrameTreeUsuarioOpcion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Usuario OpcionES ?", "MANTENIMIENTO DE Usuario Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUsuarioOpcion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUsuarioOpcion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.usuarioopcionReturnGeneral=usuarioopcionLogic.procesarImportacionUsuarioOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.usuarioopcionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUsuarioOpcionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUsuarioOpcion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUsuarioOpcion.setFileImportacion(this.jInternalFrameImportacionUsuarioOpcion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUsuarioOpcion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUsuarioOpcion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUsuarioOpcion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUsuarioOpcion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		

		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UsuarioOpcionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UsuarioOpcionBaseDesign.jrxml";
			
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
			
			this.generarReporteUsuarioOpcions("Todos",usuarioopcionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GrupoOpcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GrupoOpcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GrupoOpcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GrupoOpcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Opcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Opcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Opcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Opcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Perfil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Perfil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Perfil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Perfil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nPrecargar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nPrecargar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nPrecargar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nPrecargar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UsuarioOpcionConstantesFunciones.LABEL_ESTADO:
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
		
		if(this.jInternalFrameReporteDinamicoUsuarioOpcion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoria="id_sistema";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					sNombreCampoCategoria="id_grupo_opcion";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoria="id_opcion";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoria="id_perfil";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					sNombreCampoCategoria="con_precargar";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoriaValor="id_sistema";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					sNombreCampoCategoriaValor="id_grupo_opcion";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoriaValor="id_opcion";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoriaValor="id_perfil";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					sNombreCampoCategoriaValor="con_precargar";
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sistema");
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_grupo_opcion");
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_opcion");
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_perfil");
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Precargar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_precargar");
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_ESTADO:
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
	
	public void jButtonGenerarExcelReporteDinamicoUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"usuarioopcion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("UsuarioOpcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA);
					iRow++;

					for(UsuarioOpcion usuarioopcion:usuarioopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(usuarioopcion.getsistema_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(UsuarioOpcion usuarioopcion:usuarioopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(usuarioopcion.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
					iRow++;

					for(UsuarioOpcion usuarioopcion:usuarioopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(usuarioopcion.getgrupoopcion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDOPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDOPCION);
					iRow++;

					for(UsuarioOpcion usuarioopcion:usuarioopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(usuarioopcion.getopcion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL);
					iRow++;

					for(UsuarioOpcion usuarioopcion:usuarioopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(usuarioopcion.getperfil_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(UsuarioOpcion usuarioopcion:usuarioopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(usuarioopcion.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR);
					iRow++;

					for(UsuarioOpcion usuarioopcion:usuarioopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(usuarioopcion.getcon_precargar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UsuarioOpcionConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(UsuarioOpcion usuarioopcion:usuarioopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(usuarioopcion.getestado());
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
			//	this.getFilaCabeceraExportarExcelUsuarioOpcion(row);				
			//	iRow++;
			//}				
			
			//for(UsuarioOpcion usuarioopcionAux:usuarioopcionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUsuarioOpcion(usuarioopcionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
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
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUsuarioOpcion(false);
			
			//SI ES MANUAL
			if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUsuarioOpcion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUsuarioOpcion(false);
			
			//SI ES MANUAL
			if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUsuarioOpcion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUsuarioOpcion(false);
			
			//SI ES MANUAL
			if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUsuarioOpcion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUsuarioOpcion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUsuarioOpcion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUsuarioOpcion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUsuarioOpcion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUsuarioOpcion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUsuarioOpcion.setMinimumSize(dimensionMinimum);
		this.jTableDatosUsuarioOpcion.setMaximumSize(dimensionMaximum);
		this.jTableDatosUsuarioOpcion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUsuarioOpcion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUsuarioOpcion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUsuarioOpcion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUsuarioOpcion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUsuarioOpcion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUsuarioOpcion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUsuarioOpcion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUsuarioOpcion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUsuarioOpcion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUsuarioOpcion();
		
		this.inicializarActualizarBindingBotonesManualUsuarioOpcion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUsuarioOpcion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUsuarioOpcion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUsuarioOpcion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUsuarioOpcion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUsuarioOpcion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUsuarioOpcion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUsuarioOpcion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxPostAccionNuevoUsuarioOpcion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxPostAccionSinCerrarUsuarioOpcion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxPostAccionSinMensajeUsuarioOpcion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUsuarioOpcion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUsuarioOpcion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUsuarioOpcion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
				this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxPostAccionNuevoUsuarioOpcion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxPostAccionSinCerrarUsuarioOpcion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxPostAccionSinMensajeUsuarioOpcion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUsuarioOpcion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUsuarioOpcion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUsuarioOpcion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUsuarioOpcion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUsuarioOpcion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUsuarioOpcion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUsuarioOpcion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUsuarioOpcion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUsuarioOpcion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUsuarioOpcion(Boolean esInicializar) throws Exception {
		try	{	
			if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUsuarioOpcion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUsuarioOpcion() throws Exception {
		try	{
			if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUsuarioOpcion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUsuarioOpcion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUsuarioOpcion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUsuarioOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUsuarioOpcion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUsuarioOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUsuarioOpcion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUsuarioOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUsuarioOpcion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUsuarioOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUsuarioOpcion.addItem(reporte);
			}
			
			
			if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUsuarioOpcion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUsuarioOpcion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUsuarioOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUsuarioOpcion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUsuarioOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUsuarioOpcion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUsuarioOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUsuarioOpcion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUsuarioOpcion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUsuarioOpcion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUsuarioOpcion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
				this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
				this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUsuarioOpcion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
				
				if(this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUsuarioOpcion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUsuarioOpcion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.getSelectedItem()!=null){this.id_grupo_opcionFK_IdGrupoOpcion=((GrupoOpcion)this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionUsuarioOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.getSelectedItem()!=null){this.id_perfilFK_IdPerfil=((Perfil)this.jComboBoxid_perfilFK_IdPerfilUsuarioOpcion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUsuarioOpcion(Boolean esInicializar) throws Exception {				
		if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUsuarioOpcion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUsuarioOpcion() throws Exception {
		this.inicializarActualizarBindingTablaUsuarioOpcion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUsuarioOpcion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUsuarioOpcionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUsuarioOpcion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=usuarioopcionLogic.getUsuarioOpcions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=usuarioopcions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUsuarioOpcion.setModel(new UsuarioOpcionModel(this.usuarioopcionLogic.getUsuarioOpcions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUsuarioOpcion.setModel(new UsuarioOpcionModel(this.usuarioopcions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUsuarioOpcion!=null && this.jInternalFrameOrderByUsuarioOpcion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUsuarioOpcion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO,usuarioopcionConstantesFunciones.resaltarSeleccionarUsuarioOpcion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO,usuarioopcionConstantesFunciones.resaltarSeleccionarUsuarioOpcion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_ID));

		if(this.usuarioopcionConstantesFunciones.mostraridUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.usuarioopcionConstantesFunciones.resaltaridUsuarioOpcion,this.usuarioopcionConstantesFunciones.activaridUsuarioOpcion,this,true,"idUsuarioOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.usuarioopcionConstantesFunciones.resaltaridUsuarioOpcion,this.usuarioopcionConstantesFunciones.activaridUsuarioOpcion,this,true,"idUsuarioOpcion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA));

		if(this.usuarioopcionConstantesFunciones.mostrarid_sistemaUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SistemaTableCell(this.sistemasForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_sistemaUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_sistemaUsuarioOpcion));
			tableColumn.setCellEditor(new SistemaTableCell(this.sistemasForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_sistemaUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_sistemaUsuarioOpcion,true,"id_sistemaUsuarioOpcion","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDMODULO));

		if(this.usuarioopcionConstantesFunciones.mostrarid_moduloUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_moduloUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_moduloUsuarioOpcion));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_moduloUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_moduloUsuarioOpcion,true,"id_moduloUsuarioOpcion","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION));

		if(this.usuarioopcionConstantesFunciones.mostrarid_grupo_opcionUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new GrupoOpcionTableCell(this.grupoopcionsForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_grupo_opcionUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_grupo_opcionUsuarioOpcion));
			tableColumn.setCellEditor(new GrupoOpcionTableCell(this.grupoopcionsForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_grupo_opcionUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_grupo_opcionUsuarioOpcion,true,"id_grupo_opcionUsuarioOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDOPCION));

		if(this.usuarioopcionConstantesFunciones.mostrarid_opcionUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_IDOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OpcionTableCell(this.opcionsForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_opcionUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_opcionUsuarioOpcion));
			tableColumn.setCellEditor(new OpcionTableCell(this.opcionsForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_opcionUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_opcionUsuarioOpcion,true,"id_opcionUsuarioOpcion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL));

		if(this.usuarioopcionConstantesFunciones.mostrarid_perfilUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PerfilTableCell(this.perfilsForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_perfilUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_perfilUsuarioOpcion));
			tableColumn.setCellEditor(new PerfilTableCell(this.perfilsForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_perfilUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_perfilUsuarioOpcion,true,"id_perfilUsuarioOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO));

		if(this.usuarioopcionConstantesFunciones.mostrarid_usuarioUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_usuarioUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_usuarioUsuarioOpcion));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.usuarioopcionConstantesFunciones.resaltarid_usuarioUsuarioOpcion,this,this.usuarioopcionConstantesFunciones.activarid_usuarioUsuarioOpcion,true,"id_usuarioUsuarioOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR));

		if(this.usuarioopcionConstantesFunciones.mostrarcon_precargarUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.usuarioopcionConstantesFunciones.resaltarcon_precargarUsuarioOpcion,this.usuarioopcionConstantesFunciones.activarcon_precargarUsuarioOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.usuarioopcionConstantesFunciones.resaltarcon_precargarUsuarioOpcion,this.usuarioopcionConstantesFunciones.activarcon_precargarUsuarioOpcion,this,true,"con_precargarUsuarioOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,UsuarioOpcionConstantesFunciones.LABEL_ESTADO));

		if(this.usuarioopcionConstantesFunciones.mostrarestadoUsuarioOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UsuarioOpcionConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.usuarioopcionConstantesFunciones.resaltarestadoUsuarioOpcion,this.usuarioopcionConstantesFunciones.activarestadoUsuarioOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.usuarioopcionConstantesFunciones.resaltarestadoUsuarioOpcion,this.usuarioopcionConstantesFunciones.activarestadoUsuarioOpcion,this,true,"estadoUsuarioOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UsuarioOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.usuarioopcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.usuarioopcionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUsuarioOpcion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.usuarioopcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.usuarioopcionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUsuarioOpcion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.usuarioopcionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.usuarioopcionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUsuarioOpcion.addColumn(tableColumn);
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
			
			this.jTableDatosUsuarioOpcion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUsuarioOpcion.moveColumn(this.jTableDatosUsuarioOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUsuarioOpcion.moveColumn(this.jTableDatosUsuarioOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUsuarioOpcion.moveColumn(this.jTableDatosUsuarioOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUsuarioOpcion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUsuarioOpcion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUsuarioOpcion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUsuarioOpcion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUsuarioOpcion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUsuarioOpcion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUsuarioOpcion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=usuarioopcionLogic.getUsuarioOpcions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=usuarioopcions.size()-1;
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
		//this.jTableDatosUsuarioOpcion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUsuarioOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUsuarioOpcion();
			
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
				
				//this.isEsNuevoUsuarioOpcion=false;
					
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUsuarioOpcion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUsuarioOpcion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUsuarioOpcion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.usuarioopcion.getsType().equals("DUPLICADO")
				   || this.usuarioopcion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUsuarioOpcion=true;
				
				} else {
					this.isEsNuevoUsuarioOpcion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
					if(this.usuarioopcion.getId()>=0 && !this.usuarioopcion.getIsNew()) {						
						this.isEsNuevoUsuarioOpcion=false;
						
					} else {
						this.isEsNuevoUsuarioOpcion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUsuarioOpcion(esRelaciones);						
				
				this.seleccionarUsuarioOpcion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.usuarioopcion.getId()<0) {
					this.isEsNuevoUsuarioOpcion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUsuarioOpcion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUsuarioOpcion(evt,rowIndex);
				}	
				
				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion UsuarioOpcion: " + this.dDif); 
					}
				}								
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUsuarioOpcion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.usuarioopcion)) {
					if(this.usuarioopcion.getId()>0) {
						this.usuarioopcion.setIsDeleted(true);
						
						this.usuarioopcionsEliminados.add(this.usuarioopcion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.usuarioopcionLogic.getUsuarioOpcions().remove(this.usuarioopcion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.usuarioopcions.remove(this.usuarioopcion);				
					}
					
					
					((UsuarioOpcionModel) this.jTableDatosUsuarioOpcion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUsuarioOpcion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUsuarioOpcion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUsuarioOpcion) {
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUsuarioOpcion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUsuarioOpcion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUsuarioOpcion(this.usuarioopcion);
				}
				
				//ARCHITECTURE
				try {
					

					//Sistema
					if(!this.usuarioopcionConstantesFunciones.cargarid_sistemaUsuarioOpcion || this.usuarioopcionConstantesFunciones.event_dependid_sistemaUsuarioOpcion) {
						//this.cargarCombosSistemasForeignKeyLista(" where id="+this.usuarioopcion.getid_sistema());
									//this.inicializarActualizarBindingUsuarioOpcion(false,false);
						this.sistemasForeignKey=new ArrayList<Sistema>();

						if(usuarioopcion.getSistema()!=null) {
							this.sistemasForeignKey.add(usuarioopcion.getSistema());
						}

						this.addItemDefectoCombosForeignKeySistema();
						this.cargarCombosFrameSistemasForeignKey("Todos");
					}
					this.setActualSistemaForeignKey(this.usuarioopcion.getid_sistema(),false,"Formulario");

					//Modulo
					if(!this.usuarioopcionConstantesFunciones.cargarid_moduloUsuarioOpcion || this.usuarioopcionConstantesFunciones.event_dependid_moduloUsuarioOpcion) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.usuarioopcion.getid_modulo());
									//this.inicializarActualizarBindingUsuarioOpcion(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(usuarioopcion.getModulo()!=null) {
							this.modulosForeignKey.add(usuarioopcion.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.usuarioopcion.getid_modulo(),false,"Formulario");

					//GrupoOpcion
					if(!this.usuarioopcionConstantesFunciones.cargarid_grupo_opcionUsuarioOpcion || this.usuarioopcionConstantesFunciones.event_dependid_grupo_opcionUsuarioOpcion) {
						//this.cargarCombosGrupoOpcionsForeignKeyLista(" where id="+this.usuarioopcion.getid_grupo_opcion());
									//this.inicializarActualizarBindingUsuarioOpcion(false,false);
						this.grupoopcionsForeignKey=new ArrayList<GrupoOpcion>();

						if(usuarioopcion.getGrupoOpcion()!=null) {
							this.grupoopcionsForeignKey.add(usuarioopcion.getGrupoOpcion());
						}

						this.addItemDefectoCombosForeignKeyGrupoOpcion();
						this.cargarCombosFrameGrupoOpcionsForeignKey("Todos");
					}
					this.setActualGrupoOpcionForeignKey(this.usuarioopcion.getid_grupo_opcion(),false,"Formulario");

					//Opcion
					if(!this.usuarioopcionConstantesFunciones.cargarid_opcionUsuarioOpcion || this.usuarioopcionConstantesFunciones.event_dependid_opcionUsuarioOpcion) {
						//this.cargarCombosOpcionsForeignKeyLista(" where id="+this.usuarioopcion.getid_opcion());
									//this.inicializarActualizarBindingUsuarioOpcion(false,false);
						this.opcionsForeignKey=new ArrayList<Opcion>();

						if(usuarioopcion.getOpcion()!=null) {
							this.opcionsForeignKey.add(usuarioopcion.getOpcion());
						}

						this.addItemDefectoCombosForeignKeyOpcion();
						this.cargarCombosFrameOpcionsForeignKey("Todos");
					}
					this.setActualOpcionForeignKey(this.usuarioopcion.getid_opcion(),false,"Formulario");

					//Perfil
					if(!this.usuarioopcionConstantesFunciones.cargarid_perfilUsuarioOpcion || this.usuarioopcionConstantesFunciones.event_dependid_perfilUsuarioOpcion) {
						//this.cargarCombosPerfilsForeignKeyLista(" where id="+this.usuarioopcion.getid_perfil());
									//this.inicializarActualizarBindingUsuarioOpcion(false,false);
						this.perfilsForeignKey=new ArrayList<Perfil>();

						if(usuarioopcion.getPerfil()!=null) {
							this.perfilsForeignKey.add(usuarioopcion.getPerfil());
						}

						this.addItemDefectoCombosForeignKeyPerfil();
						this.cargarCombosFramePerfilsForeignKey("Todos");
					}
					this.setActualPerfilForeignKey(this.usuarioopcion.getid_perfil(),false,"Formulario");

					//Usuario
					if(!this.usuarioopcionConstantesFunciones.cargarid_usuarioUsuarioOpcion || this.usuarioopcionConstantesFunciones.event_dependid_usuarioUsuarioOpcion) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.usuarioopcion.getid_usuario());
									//this.inicializarActualizarBindingUsuarioOpcion(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(usuarioopcion.getUsuario()!=null) {
							this.usuariosForeignKey.add(usuarioopcion.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.usuarioopcion.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUsuarioOpcion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUsuarioOpcion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUsuarioOpcion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUsuarioOpcion(UsuarioOpcion usuarioopcion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUsuarioOpcion(usuarioopcion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUsuarioOpcion(UsuarioOpcion usuarioopcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUsuarioOpcion(usuarioopcion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUsuarioOpcion(usuarioopcion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUsuarioOpcion(usuarioopcion);
	}
	
	public void setVariablesObjetoActualToFormularioUsuarioOpcion(UsuarioOpcion usuarioopcion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.setText(usuarioopcion.getId().toString());
			this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.setSelected(usuarioopcion.getcon_precargar());
			this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.setSelected(usuarioopcion.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,UsuarioOpcion usuarioopcionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,usuarioopcionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,UsuarioOpcion usuarioopcionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				usuarioopcionLocal=this.usuarioopcion;
			} else {
				usuarioopcionLocal=this.usuarioopcionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(usuarioopcionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUsuarioOpcion(usuarioopcionLocal,true);
					
					if(usuarioopcionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(usuarioopcionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(usuarioopcionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUsuarioOpcion(UsuarioOpcion usuarioopcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUsuarioOpcion(usuarioopcion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(usuarioopcion);
	}
	
	public void setVariablesFormularioToObjetoActualUsuarioOpcion(UsuarioOpcion usuarioopcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUsuarioOpcion(usuarioopcion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUsuarioOpcion(UsuarioOpcion usuarioopcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.getText()==null || this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.getText()=="" || this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.getText()=="Id") {
				this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.setText("0");
			}

			if(conColumnasBase) {usuarioopcion.setId(Long.parseLong(this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UsuarioOpcionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelIdUsuarioOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			usuarioopcion.setcon_precargar(this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelcon_precargarUsuarioOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			usuarioopcion.setestado(this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UsuarioOpcionConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUsuarioOpcion.jLabelestadoUsuarioOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUsuarioOpcion(UsuarioOpcion usuarioopcionBean,UsuarioOpcion usuarioopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && usuarioopcionBean.getid_sistema()!=null && !usuarioopcionBean.getid_sistema().equals(-1L))) {usuarioopcion.setid_sistema(usuarioopcionBean.getid_sistema());}
			if(conDefault || (!conDefault && usuarioopcionBean.getid_modulo()!=null && !usuarioopcionBean.getid_modulo().equals(-1L))) {usuarioopcion.setid_modulo(usuarioopcionBean.getid_modulo());}
			if(conDefault || (!conDefault && usuarioopcionBean.getid_grupo_opcion()!=null && !usuarioopcionBean.getid_grupo_opcion().equals(null))) {usuarioopcion.setid_grupo_opcion(usuarioopcionBean.getid_grupo_opcion());}
			if(conDefault || (!conDefault && usuarioopcionBean.getid_opcion()!=null && !usuarioopcionBean.getid_opcion().equals(-1L))) {usuarioopcion.setid_opcion(usuarioopcionBean.getid_opcion());}
			if(conDefault || (!conDefault && usuarioopcionBean.getid_perfil()!=null && !usuarioopcionBean.getid_perfil().equals(-1L))) {usuarioopcion.setid_perfil(usuarioopcionBean.getid_perfil());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUsuarioOpcion(UsuarioOpcion usuarioopcionOrigen,UsuarioOpcion usuarioopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && usuarioopcionOrigen.getId()!=null && !usuarioopcionOrigen.getId().equals(0L))) {usuarioopcion.setId(usuarioopcionOrigen.getId());}}
			if(conDefault || (!conDefault && usuarioopcionOrigen.getid_sistema()!=null && !usuarioopcionOrigen.getid_sistema().equals(-1L))) {usuarioopcion.setid_sistema(usuarioopcionOrigen.getid_sistema());}
			if(conDefault || (!conDefault && usuarioopcionOrigen.getid_modulo()!=null && !usuarioopcionOrigen.getid_modulo().equals(-1L))) {usuarioopcion.setid_modulo(usuarioopcionOrigen.getid_modulo());}
			if(conDefault || (!conDefault && usuarioopcionOrigen.getid_grupo_opcion()!=null && !usuarioopcionOrigen.getid_grupo_opcion().equals(null))) {usuarioopcion.setid_grupo_opcion(usuarioopcionOrigen.getid_grupo_opcion());}
			if(conDefault || (!conDefault && usuarioopcionOrigen.getid_opcion()!=null && !usuarioopcionOrigen.getid_opcion().equals(-1L))) {usuarioopcion.setid_opcion(usuarioopcionOrigen.getid_opcion());}
			if(conDefault || (!conDefault && usuarioopcionOrigen.getid_perfil()!=null && !usuarioopcionOrigen.getid_perfil().equals(-1L))) {usuarioopcion.setid_perfil(usuarioopcionOrigen.getid_perfil());}
			if(conDefault || (!conDefault && usuarioopcionOrigen.getcon_precargar()!=null && !usuarioopcionOrigen.getcon_precargar().equals(false))) {usuarioopcion.setcon_precargar(usuarioopcionOrigen.getcon_precargar());}
			if(conDefault || (!conDefault && usuarioopcionOrigen.getestado()!=null && !usuarioopcionOrigen.getestado().equals(false))) {usuarioopcion.setestado(usuarioopcionOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUsuarioOpcion(UsuarioOpcion usuarioopcion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.setText(usuarioopcion.getId().toString());
			this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.setSelected(usuarioopcion.getcon_precargar());
			this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.setSelected(usuarioopcion.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUsuarioOpcion(UsuarioOpcionBean usuarioopcionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.setText(usuarioopcionBean.getId().toString());
			this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.setSelected(usuarioopcionBean.getcon_precargar());
			this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.setSelected(usuarioopcionBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUsuarioOpcion(UsuarioOpcionParameterReturnGeneral usuarioopcionReturnGeneral,UsuarioOpcionBean usuarioopcionBean,Boolean conDefault) throws Exception { 
		try {
			UsuarioOpcion usuarioopcionLocal=new UsuarioOpcion();
			
			usuarioopcionLocal=usuarioopcionReturnGeneral.getUsuarioOpcion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && usuarioopcionLocal.getId()!=null && !usuarioopcionLocal.getId().equals(0L))) {usuarioopcionBean.setId(usuarioopcionLocal.getId());}}
			if(conDefault || (!conDefault && usuarioopcionLocal.getid_sistema()!=null && !usuarioopcionLocal.getid_sistema().equals(-1L))) {usuarioopcionBean.setid_sistema(usuarioopcionLocal.getid_sistema());}
			if(conDefault || (!conDefault && usuarioopcionLocal.getid_modulo()!=null && !usuarioopcionLocal.getid_modulo().equals(-1L))) {usuarioopcionBean.setid_modulo(usuarioopcionLocal.getid_modulo());}
			if(conDefault || (!conDefault && usuarioopcionLocal.getid_grupo_opcion()!=null && !usuarioopcionLocal.getid_grupo_opcion().equals(null))) {usuarioopcionBean.setid_grupo_opcion(usuarioopcionLocal.getid_grupo_opcion());}
			if(conDefault || (!conDefault && usuarioopcionLocal.getid_opcion()!=null && !usuarioopcionLocal.getid_opcion().equals(-1L))) {usuarioopcionBean.setid_opcion(usuarioopcionLocal.getid_opcion());}
			if(conDefault || (!conDefault && usuarioopcionLocal.getid_perfil()!=null && !usuarioopcionLocal.getid_perfil().equals(-1L))) {usuarioopcionBean.setid_perfil(usuarioopcionLocal.getid_perfil());}
			if(conDefault || (!conDefault && usuarioopcionLocal.getcon_precargar()!=null && !usuarioopcionLocal.getcon_precargar().equals(false))) {usuarioopcionBean.setcon_precargar(usuarioopcionLocal.getcon_precargar());}
			if(conDefault || (!conDefault && usuarioopcionLocal.getestado()!=null && !usuarioopcionLocal.getestado().equals(false))) {usuarioopcionBean.setestado(usuarioopcionLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUsuarioOpcionGenerico(Long idUsuarioOpcionSeleccionado,JComboBox jComboBoxUsuarioOpcion,List<UsuarioOpcion> usuarioopcionsLocal)throws Exception {
		try {
			UsuarioOpcion  usuarioopcionTemp=null;

			for(UsuarioOpcion usuarioopcionAux:usuarioopcionsLocal) {
				if(usuarioopcionAux.getId()!=null && usuarioopcionAux.getId().equals(idUsuarioOpcionSeleccionado)) {
					usuarioopcionTemp=usuarioopcionAux;
					break;
				}
			}

			jComboBoxUsuarioOpcion.setSelectedItem(usuarioopcionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUsuarioOpcionGenerico(JComboBox jComboBoxUsuarioOpcion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUsuarioOpcion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUsuarioOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUsuarioOpcion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUsuarioOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUsuarioOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUsuarioOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			usuarioopcion=(UsuarioOpcion) usuarioopcionLogic.getUsuarioOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			usuarioopcion =(UsuarioOpcion) usuarioopcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Sistema")) {
			//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
			if(!usuarioopcion.getIsNew() && !usuarioopcion.getIsChanged() && !usuarioopcion.getIsDeleted()) {
				sDescripcion=usuarioopcion.getsistema_descripcion();
			} else {
				//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
				sDescripcion=usuarioopcion.getsistema_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!usuarioopcion.getIsNew() && !usuarioopcion.getIsChanged() && !usuarioopcion.getIsDeleted()) {
				sDescripcion=usuarioopcion.getmodulo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=usuarioopcion.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("GrupoOpcion")) {
			//sDescripcion=this.getActualGrupoOpcionForeignKeyDescripcion((Long)value);
			if(!usuarioopcion.getIsNew() && !usuarioopcion.getIsChanged() && !usuarioopcion.getIsDeleted()) {
				sDescripcion=usuarioopcion.getgrupoopcion_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=usuarioopcion.getgrupoopcion_descripcion();
			}
		}

		if(sTipo.equals("Opcion")) {
			//sDescripcion=this.getActualOpcionForeignKeyDescripcion((Long)value);
			if(!usuarioopcion.getIsNew() && !usuarioopcion.getIsChanged() && !usuarioopcion.getIsDeleted()) {
				sDescripcion=usuarioopcion.getopcion_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=usuarioopcion.getopcion_descripcion();
			}
		}

		if(sTipo.equals("Perfil")) {
			//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
			if(!usuarioopcion.getIsNew() && !usuarioopcion.getIsChanged() && !usuarioopcion.getIsDeleted()) {
				sDescripcion=usuarioopcion.getperfil_descripcion();
			} else {
				//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
				sDescripcion=usuarioopcion.getperfil_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!usuarioopcion.getIsNew() && !usuarioopcion.getIsChanged() && !usuarioopcion.getIsDeleted()) {
				sDescripcion=usuarioopcion.getusuario_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=usuarioopcion.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		UsuarioOpcion usuarioopcionRow=new UsuarioOpcion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			usuarioopcionRow=(UsuarioOpcion) usuarioopcionLogic.getUsuarioOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			usuarioopcionRow=(UsuarioOpcion) usuarioopcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUsuarioOpcion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion));			
			this.jButtonDuplicarUsuarioOpcion.setVisible((this.isVisibilidadCeldaDuplicarUsuarioOpcion && this.isPermisoDuplicarUsuarioOpcion));			
			this.jButtonCopiarUsuarioOpcion.setVisible((this.isVisibilidadCeldaCopiarUsuarioOpcion && this.isPermisoCopiarUsuarioOpcion));
			this.jButtonVerFormUsuarioOpcion.setVisible((this.isVisibilidadCeldaVerFormUsuarioOpcion && this.isPermisoVerFormUsuarioOpcion));
			
			this.jButtonAbrirOrderByUsuarioOpcion.setVisible((this.isVisibilidadCeldaOrdenUsuarioOpcion && this.isPermisoOrdenUsuarioOpcion));			
			
			this.jButtonNuevoRelacionesUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion));			
			this.jButtonNuevoGuardarCambiosUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarUsuarioOpcion.setVisible((this.isVisibilidadCeldaModificarUsuarioOpcion && this.isPermisoActualizarUsuarioOpcion));	
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarUsuarioOpcion.setVisible((this.isVisibilidadCeldaActualizarUsuarioOpcion && this.isPermisoActualizarUsuarioOpcion));	
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarUsuarioOpcion.setVisible((this.isVisibilidadCeldaEliminarUsuarioOpcion && this.isPermisoEliminarUsuarioOpcion));
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarUsuarioOpcion.setVisible(this.isVisibilidadCeldaCancelarUsuarioOpcion);							
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosUsuarioOpcion.setVisible((this.isVisibilidadCeldaGuardarUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));			
			
			}
						
			this.jButtonGuardarCambiosTablaUsuarioOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion));						
			this.jButtonDuplicarToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaDuplicarUsuarioOpcion && this.isPermisoDuplicarUsuarioOpcion));						
			this.jButtonCopiarToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaCopiarUsuarioOpcion && this.isPermisoCopiarUsuarioOpcion));			
			this.jButtonVerFormToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaVerFormUsuarioOpcion && this.isPermisoVerFormUsuarioOpcion));			
			this.jButtonAbrirOrderByToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaOrdenUsuarioOpcion && this.isPermisoOrdenUsuarioOpcion));
			this.jButtonNuevoRelacionesToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion));			
			this.jButtonNuevoGuardarCambiosToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));			
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaModificarUsuarioOpcion && this.isPermisoActualizarUsuarioOpcion));	
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaActualizarUsuarioOpcion  && this.isPermisoActualizarUsuarioOpcion));	
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaEliminarUsuarioOpcion && this.isPermisoEliminarUsuarioOpcion));
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarToolBarUsuarioOpcion.setVisible(this.isVisibilidadCeldaCancelarUsuarioOpcion);				
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaGuardarUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUsuarioOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion));			
			this.jMenuItemDuplicarUsuarioOpcion.setVisible((this.isVisibilidadCeldaDuplicarUsuarioOpcion && this.isPermisoDuplicarUsuarioOpcion));			
			this.jMenuItemCopiarUsuarioOpcion.setVisible((this.isVisibilidadCeldaCopiarUsuarioOpcion && this.isPermisoCopiarUsuarioOpcion));			
			this.jMenuItemVerFormUsuarioOpcion.setVisible((this.isVisibilidadCeldaVerFormUsuarioOpcion && this.isPermisoVerFormUsuarioOpcion));			
			this.jMenuItemAbrirOrderByUsuarioOpcion.setVisible((this.isVisibilidadCeldaOrdenUsuarioOpcion && this.isPermisoOrdenUsuarioOpcion));			
			//this.jMenuItemMostrarOcultarUsuarioOpcion.setVisible((this.isVisibilidadCeldaOrdenUsuarioOpcion && this.isPermisoOrdenUsuarioOpcion));
			this.jMenuItemDetalleAbrirOrderByUsuarioOpcion.setVisible((this.isVisibilidadCeldaOrdenUsuarioOpcion && this.isPermisoOrdenUsuarioOpcion));			
			//this.jMenuItemDetalleMostrarOcultarUsuarioOpcion.setVisible((this.isVisibilidadCeldaOrdenUsuarioOpcion && this.isPermisoOrdenUsuarioOpcion));			
			this.jMenuItemNuevoRelacionesUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion));			
			this.jMenuItemNuevoGuardarCambiosUsuarioOpcion.setVisible((this.isVisibilidadCeldaNuevoUsuarioOpcion && this.isPermisoNuevoUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));									
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemModificarUsuarioOpcion.setVisible((this.isVisibilidadCeldaModificarUsuarioOpcion && this.isPermisoActualizarUsuarioOpcion));	
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemActualizarUsuarioOpcion.setVisible((this.isVisibilidadCeldaActualizarUsuarioOpcion && this.isPermisoActualizarUsuarioOpcion));	
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemEliminarUsuarioOpcion.setVisible((this.isVisibilidadCeldaEliminarUsuarioOpcion && this.isPermisoEliminarUsuarioOpcion));
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemCancelarUsuarioOpcion.setVisible(this.isVisibilidadCeldaCancelarUsuarioOpcion);				
			}
			
			this.jMenuItemGuardarCambiosUsuarioOpcion.setVisible((this.isVisibilidadCeldaGuardarUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));						
			this.jMenuItemGuardarCambiosTablaUsuarioOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUsuarioOpcion=this.jButtonNuevoUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaDuplicarUsuarioOpcion=this.jButtonDuplicarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaCopiarUsuarioOpcion=this.jButtonCopiarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaVerFormUsuarioOpcion=this.jButtonVerFormUsuarioOpcion.isVisible();
			
			this.isVisibilidadCeldaOrdenUsuarioOpcion=this.jButtonAbrirOrderByUsuarioOpcion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=this.jButtonNuevoRelacionesUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaModificarUsuarioOpcion=this.jButtonModificarUsuarioOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			this.isVisibilidadCeldaActualizarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaEliminarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaCancelarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaGuardarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosUsuarioOpcion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=this.jButtonGuardarCambiosTablaUsuarioOpcion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUsuarioOpcion=this.jButtonNuevoToolBarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=this.jButtonNuevoRelacionesToolBarUsuarioOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			this.isVisibilidadCeldaModificarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarToolBarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaActualizarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarToolBarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaEliminarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarToolBarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaCancelarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarToolBarUsuarioOpcion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUsuarioOpcion=this.jButtonGuardarCambiosToolBarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=this.jButtonGuardarCambiosTablaToolBarUsuarioOpcion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUsuarioOpcion=this.jMenuItemNuevoUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=this.jMenuItemNuevoRelacionesUsuarioOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			this.isVisibilidadCeldaModificarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemModificarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaActualizarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemActualizarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaEliminarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemEliminarUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaCancelarUsuarioOpcion=this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemCancelarUsuarioOpcion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUsuarioOpcion=this.jMenuItemGuardarCambiosUsuarioOpcion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=this.jMenuItemGuardarCambiosTablaUsuarioOpcion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUsuarioOpcion(Boolean esInicializar) {
		if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
				//if(this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUsuarioOpcion();
			}
			
			this.inicializarActualizarBindingBotonesManualUsuarioOpcion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUsuarioOpcion() {
		this.jButtonNuevoUsuarioOpcion.setVisible(this.isPermisoNuevoUsuarioOpcion);			
		this.jButtonDuplicarUsuarioOpcion.setVisible(this.isPermisoDuplicarUsuarioOpcion);			
		this.jButtonCopiarUsuarioOpcion.setVisible(this.isPermisoCopiarUsuarioOpcion);			
		this.jButtonVerFormUsuarioOpcion.setVisible(this.isPermisoVerFormUsuarioOpcion);			
		
		this.jButtonAbrirOrderByUsuarioOpcion.setVisible(this.isPermisoOrdenUsuarioOpcion);					
		
		this.jButtonNuevoRelacionesUsuarioOpcion.setVisible(this.isPermisoNuevoUsuarioOpcion);			
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarUsuarioOpcion.setVisible(this.isPermisoActualizarUsuarioOpcion);	
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarUsuarioOpcion.setVisible(this.isPermisoActualizarUsuarioOpcion);	
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarUsuarioOpcion.setVisible(this.isPermisoEliminarUsuarioOpcion);
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarUsuarioOpcion.setVisible(this.isVisibilidadCeldaCancelarUsuarioOpcion);						
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosUsuarioOpcion.setVisible(this.isPermisoGuardarCambiosUsuarioOpcion);							
		}
		
		this.jButtonGuardarCambiosTablaUsuarioOpcion.setVisible(this.isPermisoActualizarUsuarioOpcion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUsuarioOpcion() {
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarUsuarioOpcion.setVisible(this.isPermisoActualizarUsuarioOpcion);	
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarUsuarioOpcion.setVisible(this.isPermisoActualizarUsuarioOpcion);	
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarUsuarioOpcion.setVisible(this.isPermisoEliminarUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarUsuarioOpcion.setVisible(this.isVisibilidadCeldaCancelarUsuarioOpcion);							
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosUsuarioOpcion.setVisible((this.isVisibilidadCeldaGuardarUsuarioOpcion && this.isPermisoGuardarCambiosUsuarioOpcion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUsuarioOpcion() {
		if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUsuarioOpcion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUsuarioOpcion() {
	}
	
	public void jTableDatosUsuarioOpcionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUsuarioOpcion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.usuarioopcion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sistemaUsuarioOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosistema=true;

			idTienePermisosistema=this.tienePermisosUsuarioEnPaginaWebUsuarioOpcion(SistemaConstantesFunciones.CLASSNAME);

			if(idTienePermisosistema) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUsuarioOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUsuarioOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);

				this.sistemaBeanSwingJInternalFrame=new SistemaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sistemaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sistemaBeanSwingJInternalFrame.getSistemaLogic().setConnexion(this.usuarioopcionLogic.getConnexion());

				if(this.usuarioopcion.getid_sistema()!=null) {
					this.sistemaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sistemaBeanSwingJInternalFrame.setIdActual(this.usuarioopcion.getid_sistema());
					this.sistemaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.inicializarActualizarBindingTablaSistema();
				}

				JInternalFrameBase jinternalFrame =this.sistemaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUsuarioOpcion=(TitledBorder)this.jScrollPanelDatosUsuarioOpcion.getBorder();
				TitledBorder titledBordersistema=(TitledBorder)this.sistemaBeanSwingJInternalFrame.jScrollPanelDatosSistema.getBorder();

				titledBordersistema.setTitle(titledBorderUsuarioOpcion.getTitle() + " -> Sistema");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sistemaUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getid_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sistema = "+this.usuarioopcion.getid_sistema().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloUsuarioOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebUsuarioOpcion(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUsuarioOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUsuarioOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.usuarioopcionLogic.getConnexion());

				if(this.usuarioopcion.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.usuarioopcion.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUsuarioOpcion=(TitledBorder)this.jScrollPanelDatosUsuarioOpcion.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderUsuarioOpcion.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.usuarioopcion.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_opcionUsuarioOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupoopcion=true;

			idTienePermisogrupoopcion=this.tienePermisosUsuarioEnPaginaWebUsuarioOpcion(GrupoOpcionConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUsuarioOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUsuarioOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);

				this.grupoopcionBeanSwingJInternalFrame=new GrupoOpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoopcionBeanSwingJInternalFrame.getGrupoOpcionLogic().setConnexion(this.usuarioopcionLogic.getConnexion());

				if(this.usuarioopcion.getid_grupo_opcion()!=null) {
					this.grupoopcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoopcionBeanSwingJInternalFrame.setIdActual(this.usuarioopcion.getid_grupo_opcion());
					this.grupoopcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoopcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoOpcion();
				}

				JInternalFrameBase jinternalFrame =this.grupoopcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUsuarioOpcion=(TitledBorder)this.jScrollPanelDatosUsuarioOpcion.getBorder();
				TitledBorder titledBordergrupoopcion=(TitledBorder)this.grupoopcionBeanSwingJInternalFrame.jScrollPanelDatosGrupoOpcion.getBorder();

				titledBordergrupoopcion.setTitle(titledBorderUsuarioOpcion.getTitle() + " -> Grupo Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_opcionUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getid_grupo_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_opcion = "+this.usuarioopcion.getid_grupo_opcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_opcionUsuarioOpcionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.opcionBeanSwingJInternalFrame.sTipoBusqueda="Opcion";

			if(!this.sFinalQueryGeneral_opcion.equals("")) {
				this.opcionBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_opcion);
				this.opcionBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.opcionBeanSwingJInternalFrame.procesarBusqueda(this.opcionBeanSwingJInternalFrame.sAccionBusqueda);
				this.opcionBeanSwingJInternalFrame.inicializarActualizarBindingOpcion(false);
			}

			if(!this.sFinalQueryComboOpcion.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.opcionBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderUsuarioOpcion=null;
			TitledBorder titledBorderopcion=null;

			if(!this.jScrollPanelDatosUsuarioOpcion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderUsuarioOpcion=(TitledBorder)this.jScrollPanelDatosUsuarioOpcion.getBorder();
				titledBorderopcion=(TitledBorder)this.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

				titledBorderopcion.setTitle(titledBorderUsuarioOpcion.getTitle() + " -> Opcion");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_opcionUsuarioOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoopcion=true;

			idTienePermisoopcion=this.tienePermisosUsuarioEnPaginaWebUsuarioOpcion(OpcionConstantesFunciones.CLASSNAME);

			if(idTienePermisoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUsuarioOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUsuarioOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);

				this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.opcionBeanSwingJInternalFrame.getOpcionLogic().setConnexion(this.usuarioopcionLogic.getConnexion());

				if(this.usuarioopcion.getid_opcion()!=null) {
					this.opcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.opcionBeanSwingJInternalFrame.setIdActual(this.usuarioopcion.getid_opcion());
					this.opcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion();
				}

				JInternalFrameBase jinternalFrame =this.opcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUsuarioOpcion=(TitledBorder)this.jScrollPanelDatosUsuarioOpcion.getBorder();
				TitledBorder titledBorderopcion=(TitledBorder)this.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

				titledBorderopcion.setTitle(titledBorderUsuarioOpcion.getTitle() + " -> Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_opcionUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getid_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_opcion = "+this.usuarioopcion.getid_opcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_perfilUsuarioOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperfil=true;

			idTienePermisoperfil=this.tienePermisosUsuarioEnPaginaWebUsuarioOpcion(PerfilConstantesFunciones.CLASSNAME);

			if(idTienePermisoperfil) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUsuarioOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUsuarioOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);

				this.perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.perfilBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.perfilBeanSwingJInternalFrame.getPerfilLogic().setConnexion(this.usuarioopcionLogic.getConnexion());

				if(this.usuarioopcion.getid_perfil()!=null) {
					this.perfilBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.perfilBeanSwingJInternalFrame.setIdActual(this.usuarioopcion.getid_perfil());
					this.perfilBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfil();
				}

				JInternalFrameBase jinternalFrame =this.perfilBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUsuarioOpcion=(TitledBorder)this.jScrollPanelDatosUsuarioOpcion.getBorder();
				TitledBorder titledBorderperfil=(TitledBorder)this.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getBorder();

				titledBorderperfil.setTitle(titledBorderUsuarioOpcion.getTitle() + " -> Perfil");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_perfilUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getid_perfil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_perfil = "+this.usuarioopcion.getid_perfil().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioUsuarioOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebUsuarioOpcion(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUsuarioOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUsuarioOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.usuarioopcionLogic.getConnexion());

				if(this.usuarioopcion.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.usuarioopcion.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUsuarioOpcion=(TitledBorder)this.jScrollPanelDatosUsuarioOpcion.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderUsuarioOpcion.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.usuarioopcion.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_precargarUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getcon_precargar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_precargar = "+this.usuarioopcion.getcon_precargar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoUsuarioOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.getusuarioopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.usuarioopcion==null) {
						this.usuarioopcion = new UsuarioOpcion();
					}

					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);
				}

				if(this.usuarioopcion.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.usuarioopcion.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUsuarioOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdGrupoOpcionUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUsuarioOpcion(false,false);

			this.getUsuarioOpcionsFK_IdGrupoOpcion();

			this.inicializarActualizarBindingUsuarioOpcion(false);

			//if(UsuarioOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUsuarioOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUsuarioOpcion(false,false);

			this.getUsuarioOpcionsFK_IdModulo();

			this.inicializarActualizarBindingUsuarioOpcion(false);

			//if(UsuarioOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUsuarioOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdOpcionUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUsuarioOpcion(false,false);

			this.getUsuarioOpcionsFK_IdOpcion();

			this.inicializarActualizarBindingUsuarioOpcion(false);

			//if(UsuarioOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUsuarioOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPerfilUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUsuarioOpcion(false,false);

			this.getUsuarioOpcionsFK_IdPerfil();

			this.inicializarActualizarBindingUsuarioOpcion(false);

			//if(UsuarioOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUsuarioOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSistemaUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUsuarioOpcion(false,false);

			this.getUsuarioOpcionsFK_IdSistema();

			this.inicializarActualizarBindingUsuarioOpcion(false);

			//if(UsuarioOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUsuarioOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioUsuarioOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUsuarioOpcion(false,false);

			this.getUsuarioOpcionsFK_IdUsuario();

			this.inicializarActualizarBindingUsuarioOpcion(false);

			//if(UsuarioOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUsuarioOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.usuarioopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUsuarioOpcion() {
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
			this.jInternalFrameDetalleFormUsuarioOpcion.setVisible(false);	    			
			this.jInternalFrameDetalleFormUsuarioOpcion.dispose();
			this.jInternalFrameDetalleFormUsuarioOpcion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
			this.jInternalFrameReporteDinamicoUsuarioOpcion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUsuarioOpcion.dispose();
			this.jInternalFrameReporteDinamicoUsuarioOpcion=null;
		}
		
		if(this.jInternalFrameImportacionUsuarioOpcion!=null) {
			this.jInternalFrameImportacionUsuarioOpcion.setVisible(false);	    			
			this.jInternalFrameImportacionUsuarioOpcion.dispose();
			this.jInternalFrameImportacionUsuarioOpcion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUsuarioOpcion();
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
			
			if(sTipo.equals("NuevoUsuarioOpcion")) {
				jButtonNuevoUsuarioOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUsuarioOpcion")) {
				jButtonDuplicarUsuarioOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUsuarioOpcion")) {
				jButtonCopiarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("VerFormUsuarioOpcion")) {
				jButtonVerFormUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUsuarioOpcion")) {
				jButtonNuevoUsuarioOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUsuarioOpcion")) {
				jButtonDuplicarUsuarioOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUsuarioOpcion")) {
				jButtonNuevoUsuarioOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUsuarioOpcion")) {
				jButtonDuplicarUsuarioOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUsuarioOpcion")) {
				jButtonNuevoUsuarioOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUsuarioOpcion")) {
				jButtonNuevoUsuarioOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUsuarioOpcion")) {
				jButtonNuevoUsuarioOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUsuarioOpcion")) {
				jButtonModificarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUsuarioOpcion")) {
				jButtonModificarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUsuarioOpcion")) {
				jButtonModificarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUsuarioOpcion")) {
				jButtonActualizarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUsuarioOpcion")) {
				jButtonActualizarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUsuarioOpcion")) {
				jButtonActualizarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("EliminarUsuarioOpcion")) {
				jButtonEliminarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUsuarioOpcion")) {
				jButtonEliminarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUsuarioOpcion")) {
				jButtonEliminarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("CancelarUsuarioOpcion")) {
				jButtonCancelarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUsuarioOpcion")) {
				jButtonCancelarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUsuarioOpcion")) {
				jButtonCancelarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("CerrarUsuarioOpcion")) {
				jButtonCerrarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUsuarioOpcion")) {
				jButtonCerrarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUsuarioOpcion")) {
				jButtonCerrarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUsuarioOpcion")) {
				jButtonMostrarOcultarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUsuarioOpcion")) {
				jButtonCancelarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUsuarioOpcion")) {
				jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUsuarioOpcion")) {
				jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUsuarioOpcion")) {
				jButtonCopiarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUsuarioOpcion")) {
				jButtonVerFormUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUsuarioOpcion")) {
				jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUsuarioOpcion")) {
				jButtonCopiarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUsuarioOpcion")) {
				jButtonVerFormUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUsuarioOpcion")) {
				jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUsuarioOpcion")) {
				jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUsuarioOpcion")) {
				jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUsuarioOpcion")) {
				jButtonRecargarInformacionUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUsuarioOpcion")) {
				jButtonRecargarInformacionUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUsuarioOpcion")) {
				jButtonRecargarInformacionUsuarioOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUsuarioOpcion")) {
				jButtonAnterioresUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUsuarioOpcion")) {
				jButtonAnterioresUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUsuarioOpcion")) {
				jButtonAnterioresUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUsuarioOpcion")) {
				jButtonSiguientesUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUsuarioOpcion")) {
				jButtonSiguientesUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUsuarioOpcion")) {
				jButtonSiguientesUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUsuarioOpcion") || sTipo.equals("MenuItemDetalleAbrirOrderByUsuarioOpcion")) {
				jButtonAbrirOrderByUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUsuarioOpcion") || sTipo.equals("MenuItemDetalleMostrarOcultarUsuarioOpcion")) {
				jButtonMostrarOcultarUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUsuarioOpcion")) {
				jButtonNuevoGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUsuarioOpcion")) {
				jButtonNuevoGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUsuarioOpcion")) {
				jButtonNuevoGuardarCambiosUsuarioOpcionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUsuarioOpcion")) {
				jButtonCerrarReporteDinamicoUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUsuarioOpcion")) {
				jButtonGenerarReporteDinamicoUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUsuarioOpcion")) {
				
				jButtonGenerarExcelReporteDinamicoUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUsuarioOpcion")) {
				jButtonCerrarImportacionUsuarioOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUsuarioOpcion")) {
				
				jButtonGenerarImportacionUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUsuarioOpcion")) {
				
				jButtonAbrirImportacionUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUsuarioOpcion")) {
				jComboBoxTiposAccionesUsuarioOpcionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUsuarioOpcion")) {
				jComboBoxTiposRelacionesUsuarioOpcionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUsuarioOpcion")) {
				jComboBoxTiposAccionesUsuarioOpcionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUsuarioOpcion")) {
				
				jComboBoxTiposSeleccionarUsuarioOpcionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUsuarioOpcion")) {
				jTextFieldValorCampoGeneralUsuarioOpcionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUsuarioOpcion")) {
				jButtonAbrirOrderByUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUsuarioOpcion")) {
				jButtonAbrirOrderByUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUsuarioOpcion")) {
				jButtonCerrarOrderByUsuarioOpcionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUsuarioOpcionBusqueda")) {
				this.jButtonidUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaUsuarioOpcionUpdate")) {
				this.jButtonid_sistemaUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaUsuarioOpcionBusqueda")) {
				this.jButtonid_sistemaUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloUsuarioOpcionUpdate")) {
				this.jButtonid_moduloUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloUsuarioOpcionBusqueda")) {
				this.jButtonid_moduloUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_opcionUsuarioOpcionUpdate")) {
				this.jButtonid_grupo_opcionUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_opcionUsuarioOpcionBusqueda")) {
				this.jButtonid_grupo_opcionUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_opcionUsuarioOpcion")) {
				this.jButtonid_opcionUsuarioOpcionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_opcionUsuarioOpcionArbol")) {
				this.abrirFrameTreeOpcion("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionUsuarioOpcionUpdate")) {
				this.jButtonid_opcionUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionUsuarioOpcionBusqueda")) {
				this.jButtonid_opcionUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilUsuarioOpcionUpdate")) {
				this.jButtonid_perfilUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilUsuarioOpcionBusqueda")) {
				this.jButtonid_perfilUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioUsuarioOpcionUpdate")) {
				this.jButtonid_usuarioUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioUsuarioOpcionBusqueda")) {
				this.jButtonid_usuarioUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_precargarUsuarioOpcionBusqueda")) {
				this.jButtoncon_precargarUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoUsuarioOpcionBusqueda")) {
				this.jButtonestadoUsuarioOpcionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdGrupoOpcionUsuarioOpcion")) {
				this.jButtonFK_IdGrupoOpcionUsuarioOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPerfilUsuarioOpcion")) {
				this.jButtonFK_IdPerfilUsuarioOpcionActionPerformed(evt);
			}
			
			;
			
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUsuarioOpcion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUsuarioOpcionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				


				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			UsuarioOpcion usuarioopcionLocal=null;
			
			if(!this.getEsControlTabla()) {
				usuarioopcionLocal=this.usuarioopcion;
			} else {
				usuarioopcionLocal=this.usuarioopcionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
							
				
				


				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUsuarioOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
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
			
			


			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUsuarioOpcionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
								
						
				


				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
								
				
				


				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUsuarioOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUsuarioOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUsuarioOpcionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
							
				
				


				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUsuarioOpcionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
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
			
			


			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUsuarioOpcionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
								
				
				


				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUsuarioOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUsuarioOpcionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUsuarioOpcionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUsuarioOpcion")) {
					jCheckBoxSeleccionarTodosUsuarioOpcionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUsuarioOpcion")) {
					jCheckBoxSeleccionadosUsuarioOpcionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUsuarioOpcion")) {
					
				}
				
				


				
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
												
				
				


				
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUsuarioOpcionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUsuarioOpcionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
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
			
			


			if(sTipo.equals("id_sistemaUsuarioOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion;
				}

				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					//classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormUsuarioOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_moduloUsuarioOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion;
				}

				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					//classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormUsuarioOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUsuarioOpcionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_sistemaUsuarioOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion;
				}

				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					//classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormUsuarioOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_moduloUsuarioOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion;
				}

				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					//classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormUsuarioOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.usuarioopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.usuarioopcion);
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
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
				
				


			if(sTipo.equals("id_sistemaUsuarioOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion;
				}

				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					//classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormUsuarioOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_moduloUsuarioOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion;
				}

				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					//classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormUsuarioOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UsuarioOpcion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UsuarioOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUsuarioOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.usuarioopcionAnterior =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUsuarioOpcion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUsuarioOpcionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUsuarioOpcion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.usuarioopcion =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.usuarioopcion =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.usuarioopcion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUsuarioOpcion")) {
				
				}
				
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUsuarioOpcion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUsuarioOpcion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUsuarioOpcion")) {
			
			}
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUsuarioOpcion();
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
			if(sTipo.equals("NuevoUsuarioOpcion")) {
				jButtonNuevoUsuarioOpcionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUsuarioOpcion")) {
				jButtonDuplicarUsuarioOpcionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUsuarioOpcion")) {
				jButtonCopiarUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUsuarioOpcion")) {
				jButtonVerFormUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUsuarioOpcion")) {
				jButtonNuevoUsuarioOpcionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUsuarioOpcion")) {
				jButtonModificarUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUsuarioOpcion")) {
				jButtonActualizarUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUsuarioOpcion")) {
				jButtonEliminarUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUsuarioOpcion")) {
				jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUsuarioOpcion")) {
				jButtonCancelarUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUsuarioOpcion")) {
				jButtonCerrarUsuarioOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUsuarioOpcion")) {
				jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUsuarioOpcion")) {
				jButtonNuevoGuardarCambiosUsuarioOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUsuarioOpcion")) {
				jButtonAbrirOrderByUsuarioOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUsuarioOpcion")) {
				jButtonRecargarInformacionUsuarioOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUsuarioOpcion")) {
				jButtonAnterioresUsuarioOpcionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUsuarioOpcion")) {
				jButtonSiguientesUsuarioOpcionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUsuarioOpcionBusqueda")) {
				this.jButtonidUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaUsuarioOpcionUpdate")) {
				this.jButtonid_sistemaUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaUsuarioOpcionBusqueda")) {
				this.jButtonid_sistemaUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloUsuarioOpcionUpdate")) {
				this.jButtonid_moduloUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloUsuarioOpcionBusqueda")) {
				this.jButtonid_moduloUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_opcionUsuarioOpcionUpdate")) {
				this.jButtonid_grupo_opcionUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_opcionUsuarioOpcionBusqueda")) {
				this.jButtonid_grupo_opcionUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_opcionUsuarioOpcion")) {
				this.jButtonid_opcionUsuarioOpcionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_opcionUsuarioOpcionArbol")) {
				this.abrirFrameTreeOpcion("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionUsuarioOpcionUpdate")) {
				this.jButtonid_opcionUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionUsuarioOpcionBusqueda")) {
				this.jButtonid_opcionUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilUsuarioOpcionUpdate")) {
				this.jButtonid_perfilUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilUsuarioOpcionBusqueda")) {
				this.jButtonid_perfilUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioUsuarioOpcionUpdate")) {
				this.jButtonid_usuarioUsuarioOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioUsuarioOpcionBusqueda")) {
				this.jButtonid_usuarioUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_precargarUsuarioOpcionBusqueda")) {
				this.jButtoncon_precargarUsuarioOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoUsuarioOpcionBusqueda")) {
				this.jButtonestadoUsuarioOpcionBusquedaActionPerformed(evt);
			}
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUsuarioOpcion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUsuarioOpcion")) {
				closingInternalFrameUsuarioOpcion();
				
			} else if(sTipo.equals("jButtonCancelarUsuarioOpcion")) {
				JInternalFrameBase jInternalFrameDetalleFormUsuarioOpcion = (JInternalFrameBase)evt.getSource();
	            	
	            UsuarioOpcionBeanSwingJInternalFrame jInternalFrameParent=(UsuarioOpcionBeanSwingJInternalFrame)jInternalFrameDetalleFormUsuarioOpcion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUsuarioOpcionActionPerformed(null);
			}
			
			UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.usuarioopcion,new Object(),this.usuarioopcionParameterGeneral,this.usuarioopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUsuarioOpcion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUsuarioOpcion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUsuarioOpcion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.usuarioopcion)) {
			if(!esControlTabla) {
				if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);			
				}
				
				if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUsuarioOpcion(this.usuarioopcion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.usuarioopcionReturnGeneral=usuarioopcionLogic.procesarEventosUsuarioOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.usuarioopcionLogic.getUsuarioOpcions(),this.usuarioopcion,this.usuarioopcionParameterGeneral,this.isEsNuevoUsuarioOpcion,classes);//this.usuarioopcionLogic.getUsuarioOpcion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUsuarioOpcion(this.usuarioopcionReturnGeneral,this.usuarioopcionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUsuarioOpcion(classes,this.usuarioopcionReturnGeneral,this.usuarioopcionBean,false);
					}
						
					if(this.usuarioopcionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUsuarioOpcion(this.usuarioopcionReturnGeneral.getUsuarioOpcion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUsuarioOpcion(this.usuarioopcionReturnGeneral.getUsuarioOpcion());	
					}
						
					if(this.usuarioopcionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUsuarioOpcion(this.usuarioopcionReturnGeneral.getUsuarioOpcion(),classes);//this.usuarioopcionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUsuarioOpcion(this.usuarioopcion,classes);//this.usuarioopcionBean);									
				}
			
				if(UsuarioOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUsuarioOpcion(this.usuarioopcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUsuarioOpcion(this.usuarioopcion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.usuarioopcionAnterior!=null) {
						this.usuarioopcion=this.usuarioopcionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.usuarioopcionReturnGeneral=usuarioopcionLogic.procesarEventosUsuarioOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.usuarioopcionLogic.getUsuarioOpcions(),this.usuarioopcion,this.usuarioopcionParameterGeneral,this.isEsNuevoUsuarioOpcion,classes);//this.usuarioopcionLogic.getUsuarioOpcion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.usuarioopcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.usuarioopcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.usuarioopcionReturnGeneral.getUsuarioOpcion(),usuarioopcionLogic.getUsuarioOpcions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.usuarioopcionReturnGeneral.getUsuarioOpcion(),this.usuarioopcions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUsuarioOpcion.repaint();
				
				//((AbstractTableModel) this.jTableDatosUsuarioOpcion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUsuarioOpcion();
			}
		}
	}
	
	public void actualizarVisualTableDatosUsuarioOpcion() throws Exception {
		
		UsuarioOpcionModel usuarioopcionModel=(UsuarioOpcionModel)this.jTableDatosUsuarioOpcion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			usuarioopcionModel.usuarioopcions=this.usuarioopcionLogic.getUsuarioOpcions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			usuarioopcionModel.usuarioopcions=this.usuarioopcions;
		}
		
		
		((UsuarioOpcionModel) this.jTableDatosUsuarioOpcion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUsuarioOpcion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getusuarioopcionAnterior(),this.usuarioopcionLogic.getUsuarioOpcions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getusuarioopcionAnterior(),this.usuarioopcions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUsuarioOpcion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUsuarioOpcion(UsuarioOpcion usuarioopcion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
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
										
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.usuarioopcion,new Object(),generalEntityParameterGeneral,this.usuarioopcionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.usuarioopcionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsOfUsuarioOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UsuarioOpcionConstantesFunciones.getClassesRelationshipsFromStringsOfUsuarioOpcion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUsuarioOpcion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UsuarioOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.usuarioopcion,new Object(),generalEntityParameterGeneral,this.usuarioopcionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUsuarioOpcion(UsuarioOpcionBean usuarioopcionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUsuarioOpcion(ArrayList<Classe> classes,UsuarioOpcionReturnGeneral usuarioopcionReturnGeneral,UsuarioOpcionBean usuarioopcionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUsuarioOpcion(UsuarioOpcion usuarioopcion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.usuarioopcion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUsuarioOpcion = new UsuarioOpcionDetalleFormJInternalFrame(jDesktopPane,this.usuarioopcionSessionBean.getConGuardarRelaciones(),this.usuarioopcionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.setVisible(false);
		this.jInternalFrameDetalleFormUsuarioOpcion.setSelected(false);						
		
		this.jInternalFrameDetalleFormUsuarioOpcion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUsuarioOpcion.usuarioopcionLogic=this.usuarioopcionLogic;
		
		this.cargarCombosFrameForeignKeyUsuarioOpcion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUsuarioOpcion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUsuarioOpcion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUsuarioOpcion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUsuarioOpcion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUsuarioOpcion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUsuarioOpcion"));
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"ModificarUsuarioOpcion"));

		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarToolBarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"ModificarToolBarUsuarioOpcion"));
					
		this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemModificarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"MenuItemModificarUsuarioOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"ActualizarUsuarioOpcion"));
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarToolBarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUsuarioOpcion"));
						
		this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemActualizarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUsuarioOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"EliminarUsuarioOpcion"));
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"EliminarToolBarUsuarioOpcion"));
								
		this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemEliminarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUsuarioOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"CancelarUsuarioOpcion"));
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"CancelarToolBarUsuarioOpcion"));
					
		this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemCancelarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUsuarioOpcion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemDetalleCerrarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUsuarioOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUsuarioOpcion"));
		
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUsuarioOpcion"));
		
		
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUsuarioOpcion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonidUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_sistemaUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_sistemaUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_moduloUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_moduloUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_grupo_opcionUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_grupo_opcionUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionUsuarioOpcionBusqueda"));
		//jButtonid_opcionUsuarioOpcion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_opcionUsuarioOpcionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcion.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcion"));
		//jButtonid_opcionUsuarioOpcionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeOpcion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionArbol.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_perfilUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_perfilUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_usuarioUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_usuarioUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioUsuarioOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtoncon_precargarUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_precargarUsuarioOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonestadoUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoUsuarioOpcionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUsuarioOpcion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUsuarioOpcion"));
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUsuarioOpcion"));
		}
		
		this.jTableDatosUsuarioOpcion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUsuarioOpcion"));
		
		this.jTableDatosUsuarioOpcion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUsuarioOpcion"));
		
		this.jButtonNuevoUsuarioOpcion.addActionListener(new ButtonActionListener(this,"NuevoUsuarioOpcion"));
		
		this.jButtonDuplicarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"DuplicarUsuarioOpcion"));
		
		this.jButtonCopiarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"CopiarUsuarioOpcion"));
		
		this.jButtonVerFormUsuarioOpcion.addActionListener(new ButtonActionListener(this,"VerFormUsuarioOpcion"));
		
		
		this.jButtonNuevoToolBarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"NuevoToolBarUsuarioOpcion"));
			
		this.jButtonDuplicarToolBarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUsuarioOpcion"));
			
		this.jMenuItemNuevoUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUsuarioOpcion"));
			
		this.jMenuItemDuplicarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUsuarioOpcion"));		
		
		
		this.jButtonNuevoRelacionesUsuarioOpcion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUsuarioOpcion"));
		
		
		this.jButtonNuevoRelacionesToolBarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUsuarioOpcion"));
			
		this.jMenuItemNuevoRelacionesUsuarioOpcion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUsuarioOpcion"));		
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"ModificarUsuarioOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonModificarToolBarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"ModificarToolBarUsuarioOpcion"));
			
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemModificarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"MenuItemModificarUsuarioOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"ActualizarUsuarioOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonActualizarToolBarUsuarioOpcion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUsuarioOpcion"));
				
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemActualizarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUsuarioOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"EliminarUsuarioOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonEliminarToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"EliminarToolBarUsuarioOpcion"));
						
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemEliminarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUsuarioOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"CancelarUsuarioOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonCancelarToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"CancelarToolBarUsuarioOpcion"));
			
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemCancelarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUsuarioOpcion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUsuarioOpcion"));		
		
		
		this.jButtonCerrarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"CerrarUsuarioOpcion"));
		
		
		this.jButtonCerrarToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"CerrarToolBarUsuarioOpcion"));
			
		this.jMenuItemCerrarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUsuarioOpcion"));
			
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jMenuItemDetalleCerrarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUsuarioOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosUsuarioOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUsuarioOpcion"));
		}
		
		this.jButtonCopiarToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"CopiarToolBarUsuarioOpcion"));
			
		this.jButtonVerFormToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"VerFormToolBarUsuarioOpcion"));
		
		this.jMenuItemGuardarCambiosUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUsuarioOpcion"));
			
		this.jMenuItemCopiarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUsuarioOpcion"));		
		
		this.jMenuItemVerFormUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUsuarioOpcion"));		
		
		
		this.jButtonGuardarCambiosTablaUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUsuarioOpcion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUsuarioOpcion"));
			
		this.jMenuItemGuardarCambiosTablaUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUsuarioOpcion"));		
		
		
		
		this.jButtonRecargarInformacionUsuarioOpcion.addActionListener (new ButtonActionListener(this,"RecargarInformacionUsuarioOpcion"));
					
		this.jButtonRecargarInformacionToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUsuarioOpcion"));
		
		this.jMenuItemRecargarInformacionUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUsuarioOpcion"));		
		
		
		
		this.jButtonAnterioresUsuarioOpcion.addActionListener (new ButtonActionListener(this,"AnterioresUsuarioOpcion"));
		
		
		this.jButtonAnterioresToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUsuarioOpcion"));
		
		this.jMenuItemAnterioresUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUsuarioOpcion"));		
		
		
		this.jButtonSiguientesUsuarioOpcion.addActionListener (new ButtonActionListener(this,"SiguientesUsuarioOpcion"));
		
		
		this.jButtonSiguientesToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUsuarioOpcion"));
			
		this.jMenuItemSiguientesUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUsuarioOpcion"));
			
		this.jMenuItemAbrirOrderByUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUsuarioOpcion"));
			
		this.jMenuItemMostrarOcultarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUsuarioOpcion"));
			
		this.jMenuItemDetalleAbrirOrderByUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUsuarioOpcion"));
			
		this.jMenuItemDetalleMostarOcultarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUsuarioOpcion"));		
		
		
		this.jButtonNuevoGuardarCambiosUsuarioOpcion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUsuarioOpcion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUsuarioOpcion"));
			
		this.jMenuItemNuevoGuardarCambiosUsuarioOpcion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUsuarioOpcion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUsuarioOpcion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUsuarioOpcion"));

		this.jCheckBoxSeleccionadosUsuarioOpcion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUsuarioOpcion"));
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUsuarioOpcion"));
		}
		
		
		this.jComboBoxTiposRelacionesUsuarioOpcion.addActionListener (new ButtonActionListener(this,"TiposRelacionesUsuarioOpcion"));
			
		this.jComboBoxTiposAccionesUsuarioOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesUsuarioOpcion"));
					
		this.jComboBoxTiposSeleccionarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUsuarioOpcion"));
			
		this.jTextFieldValorCampoGeneralUsuarioOpcion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUsuarioOpcion"));		
		
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonidUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_sistemaUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_sistemaUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_moduloUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_moduloUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_grupo_opcionUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_grupo_opcionUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionUsuarioOpcionBusqueda"));
		//jButtonid_opcionUsuarioOpcion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_opcionUsuarioOpcionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcion.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcion"));
		//jButtonid_opcionUsuarioOpcionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeOpcion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionArbol.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_perfilUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_perfilUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_usuarioUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_usuarioUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioUsuarioOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtoncon_precargarUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_precargarUsuarioOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonestadoUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoUsuarioOpcionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdGrupoOpcionUsuarioOpcion.addActionListener(new ButtonActionListener(this,"FK_IdGrupoOpcionUsuarioOpcion"));

			this.jButtonFK_IdPerfilUsuarioOpcion.addActionListener(new ButtonActionListener(this,"FK_IdPerfilUsuarioOpcion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUsuarioOpcion!=null) {
				this.jInternalFrameReporteDinamicoUsuarioOpcion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUsuarioOpcion"));
				this.jInternalFrameReporteDinamicoUsuarioOpcion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUsuarioOpcion"));
				this.jInternalFrameReporteDinamicoUsuarioOpcion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUsuarioOpcion"));
			}
			
			//this.jButtonCerrarReporteDinamicoUsuarioOpcion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUsuarioOpcion"));				
			//this.jButtonGenerarReporteDinamicoUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUsuarioOpcion"));
			//this.jButtonGenerarExcelReporteDinamicoUsuarioOpcion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUsuarioOpcion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUsuarioOpcion!=null) {
				this.jInternalFrameImportacionUsuarioOpcion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUsuarioOpcion"));
				this.jInternalFrameImportacionUsuarioOpcion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUsuarioOpcion"));
				this.jInternalFrameImportacionUsuarioOpcion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUsuarioOpcion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUsuarioOpcion.addActionListener (new ButtonActionListener(this,"AbrirOrderByUsuarioOpcion"));
			
			this.jButtonAbrirOrderByToolBarUsuarioOpcion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUsuarioOpcion"));			
			
			if(this.jInternalFrameOrderByUsuarioOpcion!=null) {
				this.jInternalFrameOrderByUsuarioOpcion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUsuarioOpcion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUsuarioOpcion.jTabbedPaneRelacionesUsuarioOpcion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUsuarioOpcion"));
		
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
            		closingInternalFrameUsuarioOpcion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUsuarioOpcion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUsuarioOpcion = (JInternalFrameBase)event.getSource();
	            	
	            UsuarioOpcionBeanSwingJInternalFrame jInternalFrameParent=(UsuarioOpcionBeanSwingJInternalFrame)jInternalFrameDetalleFormUsuarioOpcion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUsuarioOpcionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUsuarioOpcion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUsuarioOpcionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUsuarioOpcion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUsuarioOpcion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUsuarioOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUsuarioOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUsuarioOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUsuarioOpcion";
		inputMap = this.jButtonNuevoUsuarioOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUsuarioOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUsuarioOpcionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUsuarioOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUsuarioOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUsuarioOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUsuarioOpcion";
		inputMap = this.jButtonNuevoRelacionesUsuarioOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUsuarioOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUsuarioOpcionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUsuarioOpcion";
		inputMap = this.jButtonModificarUsuarioOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUsuarioOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUsuarioOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUsuarioOpcion";
		inputMap = this.jButtonActualizarUsuarioOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUsuarioOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUsuarioOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUsuarioOpcion";
		inputMap = this.jButtonEliminarUsuarioOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUsuarioOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUsuarioOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUsuarioOpcion";
		inputMap = this.jButtonCancelarUsuarioOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUsuarioOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUsuarioOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUsuarioOpcion";
		inputMap = this.jButtonCerrarUsuarioOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUsuarioOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUsuarioOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUsuarioOpcion";
		inputMap = this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosUsuarioOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonGuardarCambiosUsuarioOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUsuarioOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUsuarioOpcion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUsuarioOpcionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUsuarioOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUsuarioOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUsuarioOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUsuarioOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUsuarioOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUsuarioOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonidUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_sistemaUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_sistemaUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_moduloUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_moduloUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_grupo_opcionUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_grupo_opcionUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionUsuarioOpcionBusqueda"));
		//jButtonid_opcionUsuarioOpcion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_opcionUsuarioOpcionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcion.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcion"));
		//jButtonid_opcionUsuarioOpcionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeOpcion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionArbol.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_perfilUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_perfilUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilUsuarioOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_usuarioUsuarioOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioUsuarioOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_usuarioUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioUsuarioOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtoncon_precargarUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_precargarUsuarioOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUsuarioOpcion.jButtonestadoUsuarioOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoUsuarioOpcionBusqueda"));
		
		
		this.jButtonFK_IdGrupoOpcionUsuarioOpcion.addActionListener(new ButtonActionListener(this,"FK_IdGrupoOpcionUsuarioOpcion"));

		this.jButtonFK_IdPerfilUsuarioOpcion.addActionListener(new ButtonActionListener(this,"FK_IdPerfilUsuarioOpcion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUsuarioOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUsuarioOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUsuarioOpcionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUsuarioOpcion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUsuarioOpcion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
					usuarioopcionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UsuarioOpcion usuarioopcionAux:usuarioopcions) {
					usuarioopcionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUsuarioOpcionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUsuarioOpcion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
						usuarioopcionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UsuarioOpcion usuarioopcionAux:usuarioopcions) {
						usuarioopcionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
					
						if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR)) {
							existe=true;
							usuarioopcionAux.setcon_precargar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							usuarioopcionAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UsuarioOpcion usuarioopcionAux:usuarioopcions) {
						
						if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR)) {
							existe=true;
							usuarioopcionAux.setcon_precargar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							usuarioopcionAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUsuarioOpcion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUsuarioOpcion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUsuarioOpcion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUsuarioOpcionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUsuarioOpcion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUsuarioOpcion.getSelectedRows();
			
			UsuarioOpcion usuarioopcionLocal=new UsuarioOpcion();
			
			//this.seleccionarTodosUsuarioOpcion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioopcionLocal =(UsuarioOpcion) this.usuarioopcionLogic.getUsuarioOpcions().toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					usuarioopcionLocal =(UsuarioOpcion) this.usuarioopcions.toArray()[this.jTableDatosUsuarioOpcion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				usuarioopcionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
						usuarioopcionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UsuarioOpcion usuarioopcionAux:usuarioopcions) {
						usuarioopcionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUsuarioOpcion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUsuarioOpcion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUsuarioOpcion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUsuarioOpcion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUsuarioOpcionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUsuarioOpcionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUsuarioOpcionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUsuarioOpcion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUsuarioOpcion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UsuarioOpcion usuarioopcionAux:this.usuarioopcionLogic.getUsuarioOpcions()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UsuarioOpcion usuarioopcionAux:usuarioopcions) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUsuarioOpcion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUsuarioOpcionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUsuarioOpcion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUsuarioOpcion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUsuarioOpcion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUsuarioOpcion) {				
					conSplash=true;//false;										
					
					//this.startProcessUsuarioOpcion(conSplash);
				
					this.generarReporteUsuarioOpcionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUsuarioOpcionsSeleccionados();
				//this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUsuarioOpcionsSeleccionados(false);
				//this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUsuarioOpcionsSeleccionados(true);
				//this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUsuarioOpcion();
				
				this.exportarUsuarioOpcionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUsuarioOpcions();
				//this.importarUsuarioOpcions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUsuarioOpcion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUsuarioOpcionsSeleccionados();
				//this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Usuario Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUsuarioOpcion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUsuarioOpcion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUsuarioOpcion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.setSelectedIndex(0);					
				}	
			} 			
			else if(UsuarioOpcionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUsuarioOpcion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUsuarioOpcion(conSplash);
					
						//this.actualizarParametrosGeneralUsuarioOpcion();
						
						this.generarReporteProcesoAccionUsuarioOpcionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UsuarioOpcionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Usuario OpcionES SELECCIONADOS?", "MANTENIMIENTO DE Usuario Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUsuarioOpcion();
				
						this.actualizarParametrosGeneralUsuarioOpcion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.usuarioopcionReturnGeneral=usuarioopcionLogic.procesarAccionUsuarioOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.usuarioopcionLogic.getUsuarioOpcions(),this.usuarioopcionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUsuarioOpcionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUsuarioOpcion();
					
					UsuarioOpcionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUsuarioOpcionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUsuarioOpcion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxTiposAccionesFormularioUsuarioOpcion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUsuarioOpcion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUsuarioOpcionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUsuarioOpcion();
			
			if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		
			UsuarioOpcion usuarioopcion=new UsuarioOpcion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUsuarioOpcion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUsuarioOpcion.getSelectedItem();
			
			
			
			
			usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(usuarioopcionsSeleccionados.size()==1) {
				for(UsuarioOpcion usuarioopcionAux:usuarioopcionsSeleccionados) {
					usuarioopcion=usuarioopcionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUsuarioOpcion();
			
      		//this.finishProcessUsuarioOpcion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUsuarioOpcionReturnGeneral() throws Exception {
		if(this.usuarioopcionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.usuarioopcionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.usuarioopcionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.usuarioopcionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.usuarioopcionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.usuarioopcionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUsuarioOpcion(false);
		}
		
		if(this.usuarioopcionReturnGeneral.getConRetornoLista() || this.usuarioopcionReturnGeneral.getConRetornoObjeto()) {
			if(this.usuarioopcionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.usuarioopcionLogic.setUsuarioOpcions(this.usuarioopcionReturnGeneral.getUsuarioOpcions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.usuarioopcionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.usuarioopcionLogic.setUsuarioOpcion(this.usuarioopcionReturnGeneral.getUsuarioOpcion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUsuarioOpcion(false);
		}
	}
	
	public void actualizarParametrosGeneralUsuarioOpcion() throws Exception {
		
		
	}
	
	public ArrayList<UsuarioOpcion> getUsuarioOpcionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUsuarioOpcion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(UsuarioOpcion usuarioopcionAux:usuarioopcionLogic.getUsuarioOpcions()) {
					if(usuarioopcionAux.getIsSelected()) {
						usuarioopcionsSeleccionados.add(usuarioopcionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UsuarioOpcion usuarioopcionAux:this.usuarioopcions) {
					if(usuarioopcionAux.getIsSelected()) {
						usuarioopcionsSeleccionados.add(usuarioopcionAux);				
					}
				}
			}
			
			if(usuarioopcionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						usuarioopcionsSeleccionados.addAll(this.usuarioopcionLogic.getUsuarioOpcions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						usuarioopcionsSeleccionados.addAll(this.usuarioopcions);				
					}
				}
			}
		} else {
			usuarioopcionsSeleccionados.add(this.usuarioopcion);
		}
		
		return usuarioopcionsSeleccionados;
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
	
	public void generarReporteUsuarioOpcionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUsuarioOpcionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUsuarioOpcionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUsuarioOpcionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUsuarioOpcionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Usuario Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUsuarioOpcionsSeleccionados() throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUsuarioOpcions("Todos",usuarioopcionsSeleccionados);
		
	}	
	
	public void generarReporteNormalUsuarioOpcionsSeleccionados() throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUsuarioOpcions("Todos",usuarioopcionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUsuarioOpcionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUsuarioOpcions("Todos",usuarioopcionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUsuarioOpcionsSeleccionados() throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUsuarioOpcion();
		
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUsuarioOpcion();
		
		
		//this.generarReporteUsuarioOpcions("Todos",usuarioopcionsSeleccionados ,usuarioopcionImplementable,usuarioopcionImplementableHome);
	}
	
	public void mostrarImportacionUsuarioOpcions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUsuarioOpcion();
		
		this.abrirFrameImportacionUsuarioOpcion();		
		
			
		//this.generarReporteUsuarioOpcions("Todos",usuarioopcionsSeleccionados ,usuarioopcionImplementable,usuarioopcionImplementableHome);
	}
	
	public void importarUsuarioOpcions() throws Exception {		
	
	}
	
	public void exportarUsuarioOpcionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUsuarioOpcionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUsuarioOpcionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUsuarioOpcionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Usuario Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUsuarioOpcionsSeleccionados() throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"usuarioopcion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUsuarioOpcion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(UsuarioOpcion usuarioopcionAux:usuarioopcionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUsuarioOpcion(usuarioopcionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//usuarioopcionAux.setsDetalleGeneralEntityReporte(usuarioopcionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUsuarioOpcion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_IDOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UsuarioOpcionConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUsuarioOpcion(UsuarioOpcion usuarioopcion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=usuarioopcion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getsistema_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getgrupoopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getperfil_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getcon_precargar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=usuarioopcion.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUsuarioOpcionsSeleccionados() throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"usuarioopcion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("UsuarioOpcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUsuarioOpcion(row);				
				iRow++;
			}				
			
			for(UsuarioOpcion usuarioopcionAux:usuarioopcionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUsuarioOpcion(usuarioopcionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUsuarioOpcionsSeleccionados() throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();		
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"usuarioopcion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("usuarioopcions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("usuarioopcion");
			//elementRoot.appendChild(element);
		
			for(UsuarioOpcion usuarioopcionAux:usuarioopcionsSeleccionados) {
				element = document.createElement("usuarioopcion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUsuarioOpcion(usuarioopcionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Usuario Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUsuarioOpcion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDOPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL);
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR);
		cell = row.createCell(iColumn++);cell.setCellValue(UsuarioOpcionConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUsuarioOpcion(UsuarioOpcion usuarioopcion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getsistema_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getgrupoopcion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getopcion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getperfil_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getcon_precargar());
		cell = row.createCell(iColumn++);cell.setCellValue(usuarioopcion.getestado());				
	}
	
	public void setFilaDatosExportarXmlUsuarioOpcion(UsuarioOpcion usuarioopcion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UsuarioOpcionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(usuarioopcion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UsuarioOpcionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(usuarioopcion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementsistema_descripcion = document.createElement(UsuarioOpcionConstantesFunciones.IDSISTEMA);
		elementsistema_descripcion.appendChild(document.createTextNode(usuarioopcion.getsistema_descripcion()));
		element.appendChild(elementsistema_descripcion);

		Element elementmodulo_descripcion = document.createElement(UsuarioOpcionConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(usuarioopcion.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementgrupoopcion_descripcion = document.createElement(UsuarioOpcionConstantesFunciones.IDGRUPOOPCION);
		elementgrupoopcion_descripcion.appendChild(document.createTextNode(usuarioopcion.getgrupoopcion_descripcion()));
		element.appendChild(elementgrupoopcion_descripcion);

		Element elementopcion_descripcion = document.createElement(UsuarioOpcionConstantesFunciones.IDOPCION);
		elementopcion_descripcion.appendChild(document.createTextNode(usuarioopcion.getopcion_descripcion()));
		element.appendChild(elementopcion_descripcion);

		Element elementperfil_descripcion = document.createElement(UsuarioOpcionConstantesFunciones.IDPERFIL);
		elementperfil_descripcion.appendChild(document.createTextNode(usuarioopcion.getperfil_descripcion()));
		element.appendChild(elementperfil_descripcion);

		Element elementusuario_descripcion = document.createElement(UsuarioOpcionConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(usuarioopcion.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementcon_precargar = document.createElement(UsuarioOpcionConstantesFunciones.CONPRECARGAR);
		elementcon_precargar.appendChild(document.createTextNode(usuarioopcion.getcon_precargar().toString().trim()));
		element.appendChild(elementcon_precargar);

		Element elementestado = document.createElement(UsuarioOpcionConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(usuarioopcion.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoUsuarioOpcionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados=new ArrayList<UsuarioOpcion>();
		
		usuarioopcionsSeleccionados=this.getUsuarioOpcionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUsuarioOpcion(usuarioopcionsSeleccionados);
		
		this.generarReporteUsuarioOpcions("Todos",usuarioopcionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUsuarioOpcion(ArrayList<UsuarioOpcion> usuarioopcionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(UsuarioOpcion usuarioopcionAux:usuarioopcionsSeleccionados) {
				usuarioopcionAux.setsDetalleGeneralEntityReporte(usuarioopcionAux.toString());
			
				if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_IDSISTEMA)) {
					existe=true;
					usuarioopcionAux.setsDescripcionGeneralEntityReporte1(usuarioopcionAux.getsistema_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					usuarioopcionAux.setsDescripcionGeneralEntityReporte1(usuarioopcionAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_IDGRUPOOPCION)) {
					existe=true;
					usuarioopcionAux.setsDescripcionGeneralEntityReporte1(usuarioopcionAux.getgrupoopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_IDOPCION)) {
					existe=true;
					usuarioopcionAux.setsDescripcionGeneralEntityReporte1(usuarioopcionAux.getopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_IDPERFIL)) {
					existe=true;
					usuarioopcionAux.setsDescripcionGeneralEntityReporte1(usuarioopcionAux.getperfil_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					usuarioopcionAux.setsDescripcionGeneralEntityReporte1(usuarioopcionAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_CONPRECARGAR)) {
					existe=true;
					usuarioopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(usuarioopcionAux.getcon_precargar()));
				}
				 else if(sTipoSeleccionar.equals(UsuarioOpcionConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					usuarioopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(usuarioopcionAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UsuarioOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUsuarioOpcion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUsuarioOpcion=true;
				this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=true;
				this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=true;
			}
			
			this.isVisibilidadCeldaModificarUsuarioOpcion=false;
			this.isVisibilidadCeldaActualizarUsuarioOpcion=false;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=false;
			this.isVisibilidadCeldaCancelarUsuarioOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUsuarioOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=false;
			this.isVisibilidadCeldaModificarUsuarioOpcion=false;
			this.isVisibilidadCeldaActualizarUsuarioOpcion=true;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=false;
			this.isVisibilidadCeldaCancelarUsuarioOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUsuarioOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=false;
			this.isVisibilidadCeldaModificarUsuarioOpcion=false;
			this.isVisibilidadCeldaActualizarUsuarioOpcion=true;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=true;
			this.isVisibilidadCeldaCancelarUsuarioOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUsuarioOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=false;
			this.isVisibilidadCeldaModificarUsuarioOpcion=false;
			this.isVisibilidadCeldaActualizarUsuarioOpcion=true;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=false;
			this.isVisibilidadCeldaCancelarUsuarioOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUsuarioOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=true;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=true;
			this.isVisibilidadCeldaModificarUsuarioOpcion=false;
			this.isVisibilidadCeldaActualizarUsuarioOpcion=false;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=false;
			this.isVisibilidadCeldaCancelarUsuarioOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUsuarioOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=false;
			this.isVisibilidadCeldaActualizarUsuarioOpcion=false;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=false;
			this.isVisibilidadCeldaCancelarUsuarioOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUsuarioOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=false;
			this.isVisibilidadCeldaModificarUsuarioOpcion=true;
			this.isVisibilidadCeldaActualizarUsuarioOpcion=false;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=false;
			this.isVisibilidadCeldaCancelarUsuarioOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarUsuarioOpcion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UsuarioOpcionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUsuarioOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=true;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=true;
		} else {
			this.actualizarEstadoPanelsUsuarioOpcion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUsuarioOpcion=false;
			//this.isVisibilidadCeldaVerFormUsuarioOpcion=false;
			this.isVisibilidadCeldaDuplicarUsuarioOpcion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!usuarioopcionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
		} else {
			this.isVisibilidadCeldaNuevoUsuarioOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosUsuarioOpcion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			if(!usuarioopcionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;												
			}
			
			this.jButtonCerrarUsuarioOpcion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUsuarioOpcion=false;
		}
		
		if(!this.permiteMantenimiento(this.usuarioopcion)) {
			this.isVisibilidadCeldaActualizarUsuarioOpcion=false;
			this.isVisibilidadCeldaEliminarUsuarioOpcion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUsuarioOpcion() {
	}
	
	public void actualizarEstadoPanelsUsuarioOpcion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUsuarioOpcion!=null) {
				this.jScrollPanelDatosEdicionUsuarioOpcion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUsuarioOpcion!=null) {
				this.jScrollPanelDatosUsuarioOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionUsuarioOpcion!=null) {
				this.jPanelPaginacionUsuarioOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUsuarioOpcion!=null) {
				this.jScrollPanelDatosEdicionUsuarioOpcion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUsuarioOpcion!=null) {
				this.jScrollPanelDatosUsuarioOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionUsuarioOpcion!=null) {
				this.jPanelPaginacionUsuarioOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUsuarioOpcion!=null) {
				this.jScrollPanelDatosEdicionUsuarioOpcion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUsuarioOpcion!=null) {
				this.jScrollPanelDatosUsuarioOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionUsuarioOpcion!=null) {
				this.jPanelPaginacionUsuarioOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUsuarioOpcion!=null) {
				this.jScrollPanelDatosEdicionUsuarioOpcion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUsuarioOpcion!=null) {
				this.jScrollPanelDatosUsuarioOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionUsuarioOpcion!=null) {
				this.jPanelPaginacionUsuarioOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUsuarioOpcion!=null) {
				this.jScrollPanelDatosEdicionUsuarioOpcion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUsuarioOpcion!=null) {
				this.jScrollPanelDatosUsuarioOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionUsuarioOpcion!=null) {
				this.jPanelPaginacionUsuarioOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUsuarioOpcion!=null) {
				this.jScrollPanelDatosEdicionUsuarioOpcion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUsuarioOpcion!=null) {
				this.jScrollPanelDatosUsuarioOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionUsuarioOpcion!=null) {
				this.jPanelPaginacionUsuarioOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUsuarioOpcion!=null) {
				this.jScrollPanelDatosEdicionUsuarioOpcion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUsuarioOpcion!=null) {
				this.jScrollPanelDatosUsuarioOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionUsuarioOpcion!=null) {
				this.jPanelPaginacionUsuarioOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
					this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.usuarioopcionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUsuarioOpcion!=null) {
				this.jTabbedPaneBusquedasUsuarioOpcion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUsuarioOpcion!=null) {
				this.jPanelParametrosReportesUsuarioOpcion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaSistema(Boolean isParaSistema){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSistemaNegation=!isParaSistema;

			this.isVisibilidadFK_IdGrupoOpcion=isParaSistemaNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdGrupoOpcionUsuarioOpcion);}

			this.isVisibilidadFK_IdPerfil=isParaSistemaNegation;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdPerfilUsuarioOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdGrupoOpcion=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdGrupoOpcionUsuarioOpcion);}

			this.isVisibilidadFK_IdPerfil=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdPerfilUsuarioOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoOpcion(Boolean isParaGrupoOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoOpcionNegation=!isParaGrupoOpcion;

			this.isVisibilidadFK_IdGrupoOpcion=isParaGrupoOpcion;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdGrupoOpcionUsuarioOpcion);}

			this.isVisibilidadFK_IdPerfil=isParaGrupoOpcionNegation;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdPerfilUsuarioOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaOpcion(Boolean isParaOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOpcionNegation=!isParaOpcion;

			this.isVisibilidadFK_IdGrupoOpcion=isParaOpcionNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdGrupoOpcionUsuarioOpcion);}

			this.isVisibilidadFK_IdPerfil=isParaOpcionNegation;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdPerfilUsuarioOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaPerfil(Boolean isParaPerfil){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPerfilNegation=!isParaPerfil;

			this.isVisibilidadFK_IdGrupoOpcion=isParaPerfilNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdGrupoOpcionUsuarioOpcion);}

			this.isVisibilidadFK_IdPerfil=isParaPerfil;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdPerfilUsuarioOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdGrupoOpcion=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdGrupoOpcionUsuarioOpcion);}

			this.isVisibilidadFK_IdPerfil=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasUsuarioOpcion.remove(jPanelFK_IdPerfilUsuarioOpcion);}
		}
		
	}
	
	
	
	

	public String registrarSesionUsuarioOpcionParaBusquedaOpciones() throws Exception {
		Boolean isPaginaPopupOpcion=false;

		try {

			if(usuarioopcionSessionBean==null) {
				usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			if(opcionSessionBean==null) {
				opcionSessionBean=new OpcionSessionBean();
			}

			opcionSessionBean.setsPathNavegacionActual(usuarioopcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+OpcionConstantesFunciones.SCLASSWEBTITULO);
			opcionSessionBean.setisPermiteRecargarInformacion(false);
			opcionSessionBean.setisPaginaPopup(true);
			isPaginaPopupOpcion=opcionSessionBean.getisPaginaPopup();
			opcionSessionBean.setisPaginaPopup(false);
			opcionSessionBean.setEstaModoBusqueda(true);
			opcionSessionBean.setsFuncionBusquedaRapida("window.opener.usuarioopcionFuncionGeneral.setCombosCodigoDesdeBusquedaid_opcion(TO_REPLACE);");
			opcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeOpcion(true);
			opcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion(UsuarioOpcionConstantesFunciones.SNOMBREOPCION);
			//opcionSessionBean.setisBusquedaDesdeForeignKeySesionUsuarioOpcion(true);
			//opcionSessionBean.setlidUsuarioOpcionActual(this.idUsuarioOpcionActual);

			usuarioopcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUsuarioOpcion(true);
			usuarioopcionSessionBean.setlIdUsuarioOpcionActualForeignKey(this.idUsuarioOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UsuarioOpcionSessionBean usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		
		if(this.usuarioopcionSessionBean==null) {
			this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		}
		
		this.usuarioopcionSessionBean.setsUltimaBusquedaUsuarioOpcion(this.getsAccionBusqueda());
		this.usuarioopcionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.usuarioopcionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdGrupoOpcion")) {
			usuarioopcionSessionBean.setid_grupo_opcion(this.getid_grupo_opcionFK_IdGrupoOpcion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPerfil")) {
			usuarioopcionSessionBean.setid_perfil(this.getid_perfilFK_IdPerfil());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UsuarioOpcionSessionBean usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		
		if(this.usuarioopcionSessionBean==null) {
			this.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
		}
		
		if(this.usuarioopcionSessionBean.getsUltimaBusquedaUsuarioOpcion()!=null&&!this.usuarioopcionSessionBean.getsUltimaBusquedaUsuarioOpcion().equals("")) {
			this.setsAccionBusqueda(usuarioopcionSessionBean.getsUltimaBusquedaUsuarioOpcion());
			this.setiNumeroPaginacion(usuarioopcionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(usuarioopcionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdGrupoOpcion")) {
				this.setid_grupo_opcionFK_IdGrupoOpcion(usuarioopcionSessionBean.getid_grupo_opcion());
				usuarioopcionSessionBean.setid_grupo_opcion(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPerfil")) {
				this.setid_perfilFK_IdPerfil(usuarioopcionSessionBean.getid_perfil());
				usuarioopcionSessionBean.setid_perfil(-1L);
			}
		}
		
		this.usuarioopcionSessionBean.setsUltimaBusquedaUsuarioOpcion("");
		this.usuarioopcionSessionBean.setiNumeroPaginacion(UsuarioOpcionConstantesFunciones.INUMEROPAGINACION);
		this.usuarioopcionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUsuarioOpcion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUsuarioOpcion() {
		this.updateBorderResaltarBusquedasFormularioUsuarioOpcion();
		this.updateVisibilidadBusquedasFormularioUsuarioOpcion();
		this.updateHabilitarBusquedasFormularioUsuarioOpcion();
	}
	
	public void updateBorderResaltarBusquedasFormularioUsuarioOpcion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUsuarioOpcion.getComponents().length>0) {
	

		if(this.usuarioopcionConstantesFunciones.resaltarFK_IdGrupoOpcionUsuarioOpcion!=null) {
			index= this.jTabbedPaneBusquedasUsuarioOpcion.indexOfComponent(this.jPanelFK_IdGrupoOpcionUsuarioOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUsuarioOpcion.getComponent(index);
				jPanel.setBorder(this.usuarioopcionConstantesFunciones.resaltarFK_IdGrupoOpcionUsuarioOpcion);
			}
		}

		if(this.usuarioopcionConstantesFunciones.resaltarFK_IdPerfilUsuarioOpcion!=null) {
			index= this.jTabbedPaneBusquedasUsuarioOpcion.indexOfComponent(this.jPanelFK_IdPerfilUsuarioOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUsuarioOpcion.getComponent(index);
				jPanel.setBorder(this.usuarioopcionConstantesFunciones.resaltarFK_IdPerfilUsuarioOpcion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUsuarioOpcion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUsuarioOpcion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUsuarioOpcion.indexOfComponent(this.jPanelFK_IdGrupoOpcionUsuarioOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUsuarioOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.usuarioopcionConstantesFunciones.mostrarFK_IdGrupoOpcionUsuarioOpcion);
			if(!this.usuarioopcionConstantesFunciones.mostrarFK_IdGrupoOpcionUsuarioOpcion && index>-1) {
				this.jTabbedPaneBusquedasUsuarioOpcion.remove(index);
			}

			index= this.jTabbedPaneBusquedasUsuarioOpcion.indexOfComponent(this.jPanelFK_IdPerfilUsuarioOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUsuarioOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.usuarioopcionConstantesFunciones.mostrarFK_IdPerfilUsuarioOpcion);
			if(!this.usuarioopcionConstantesFunciones.mostrarFK_IdPerfilUsuarioOpcion && index>-1) {
				this.jTabbedPaneBusquedasUsuarioOpcion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUsuarioOpcion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUsuarioOpcion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUsuarioOpcion.indexOfComponent(this.jPanelFK_IdGrupoOpcionUsuarioOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUsuarioOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.usuarioopcionConstantesFunciones.activarFK_IdGrupoOpcionUsuarioOpcion);
				this.jTabbedPaneBusquedasUsuarioOpcion.setEnabledAt(index,this.usuarioopcionConstantesFunciones.activarFK_IdGrupoOpcionUsuarioOpcion);
			}

			index= this.jTabbedPaneBusquedasUsuarioOpcion.indexOfComponent(this.jPanelFK_IdPerfilUsuarioOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUsuarioOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.usuarioopcionConstantesFunciones.activarFK_IdPerfilUsuarioOpcion);
				this.jTabbedPaneBusquedasUsuarioOpcion.setEnabledAt(index,this.usuarioopcionConstantesFunciones.activarFK_IdPerfilUsuarioOpcion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUsuarioOpcion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdGrupoOpcion")) {
			index= this.jTabbedPaneBusquedasUsuarioOpcion.indexOfComponent(this.jPanelFK_IdGrupoOpcionUsuarioOpcion);

			this.jTabbedPaneBusquedasUsuarioOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUsuarioOpcion.getComponent(index);

			this.usuarioopcionConstantesFunciones.setResaltarFK_IdGrupoOpcionUsuarioOpcion(resaltar);

			jPanel.setBorder(this.usuarioopcionConstantesFunciones.resaltarFK_IdGrupoOpcionUsuarioOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPerfil")) {
			index= this.jTabbedPaneBusquedasUsuarioOpcion.indexOfComponent(this.jPanelFK_IdPerfilUsuarioOpcion);

			this.jTabbedPaneBusquedasUsuarioOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUsuarioOpcion.getComponent(index);

			this.usuarioopcionConstantesFunciones.setResaltarFK_IdPerfilUsuarioOpcion(resaltar);

			jPanel.setBorder(this.usuarioopcionConstantesFunciones.resaltarFK_IdPerfilUsuarioOpcion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUsuarioOpcion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUsuarioOpcion() throws Exception {

		if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUsuarioOpcion();
		this.updateVisibilidadResaltarControlesFormularioUsuarioOpcion();
		this.updateHabilitarResaltarControlesFormularioUsuarioOpcion();
		
	}
	
	public void updateBorderResaltarControlesFormularioUsuarioOpcion() throws Exception {
		if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.usuarioopcionConstantesFunciones.resaltaridUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltaridUsuarioOpcion);}
		if(this.usuarioopcionConstantesFunciones.resaltarid_sistemaUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltarid_sistemaUsuarioOpcion);}
		if(this.usuarioopcionConstantesFunciones.resaltarid_moduloUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltarid_moduloUsuarioOpcion);}
		if(this.usuarioopcionConstantesFunciones.resaltarid_grupo_opcionUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltarid_grupo_opcionUsuarioOpcion);}
		if(this.usuarioopcionConstantesFunciones.resaltarid_opcionUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltarid_opcionUsuarioOpcion);}
		if(this.usuarioopcionConstantesFunciones.resaltarid_perfilUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltarid_perfilUsuarioOpcion);}
		if(this.usuarioopcionConstantesFunciones.resaltarid_usuarioUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltarid_usuarioUsuarioOpcion);}
		if(this.usuarioopcionConstantesFunciones.resaltarcon_precargarUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltarcon_precargarUsuarioOpcion);}
		if(this.usuarioopcionConstantesFunciones.resaltarestadoUsuarioOpcion!=null && this.jInternalFrameDetalleFormUsuarioOpcion!=null) {this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.setBorder(this.usuarioopcionConstantesFunciones.resaltarestadoUsuarioOpcion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUsuarioOpcion() throws Exception {		
		if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
	
		//this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostraridUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelidUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostraridUsuarioOpcion);
		//this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_sistemaUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelid_sistemaUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_sistemaUsuarioOpcion);
		//this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_moduloUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelid_moduloUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_moduloUsuarioOpcion);
		//this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_grupo_opcionUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelid_grupo_opcionUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_grupo_opcionUsuarioOpcion);
		//this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_opcionUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelid_opcionUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_opcionUsuarioOpcion);
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_opcionUsuarioOpcion);
		//this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_perfilUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelid_perfilUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_perfilUsuarioOpcion);
		//this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_usuarioUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelid_usuarioUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarid_usuarioUsuarioOpcion);
		//this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarcon_precargarUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelcon_precargarUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarcon_precargarUsuarioOpcion);
		//this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarestadoUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jPanelestadoUsuarioOpcion.setVisible(this.usuarioopcionConstantesFunciones.mostrarestadoUsuarioOpcion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUsuarioOpcion() throws Exception {
		if(this.jInternalFrameDetalleFormUsuarioOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUsuarioOpcion!=null) {
	
		this.jInternalFrameDetalleFormUsuarioOpcion.jLabelidUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activaridUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_sistemaUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarid_sistemaUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_moduloUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarid_moduloUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_grupo_opcionUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarid_grupo_opcionUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_opcionUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarid_opcionUsuarioOpcion);
			this.jInternalFrameDetalleFormUsuarioOpcion.jButtonid_opcionUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarid_opcionUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_perfilUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarid_perfilUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jComboBoxid_usuarioUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarid_usuarioUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxcon_precargarUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarcon_precargarUsuarioOpcion);
		this.jInternalFrameDetalleFormUsuarioOpcion.jCheckBoxestadoUsuarioOpcion.setEnabled(this.usuarioopcionConstantesFunciones.activarestadoUsuarioOpcion);
		}
	}
	
		
}