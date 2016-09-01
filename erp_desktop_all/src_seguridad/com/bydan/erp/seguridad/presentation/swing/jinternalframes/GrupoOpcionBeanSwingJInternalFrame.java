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

import com.bydan.erp.seguridad.util.GrupoOpcionConstantesFunciones;
import com.bydan.erp.seguridad.util.GrupoOpcionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.GrupoOpcionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.GrupoOpcionBean;
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
public class GrupoOpcionBeanSwingJInternalFrame extends GrupoOpcionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GrupoOpcionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GrupoOpcion> grupoopcionValidator = new ClassValidator<GrupoOpcion>(GrupoOpcion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GrupoOpcion grupoopcion;	
	public GrupoOpcion grupoopcionAux;
	public GrupoOpcion grupoopcionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GrupoOpcion grupoopcionTotales;
	public Long idGrupoOpcionActual;
	public Long iIdNuevoGrupoOpcion=0L;
	public int rowIndexActual=0;
	
	
	
	
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

		
	
	
	
	
	

	public Boolean isTienePermisosUsuarioOpcion=false;

	public Boolean getIsTienePermisosUsuarioOpcion() {
		return isTienePermisosUsuarioOpcion;
	}

	public void setIsTienePermisosUsuarioOpcion(Boolean isTienePermisosUsuarioOpcion) {
		this.isTienePermisosUsuarioOpcion= isTienePermisosUsuarioOpcion;
	}


	public Boolean isTienePermisosOpcion=false;

	public Boolean getIsTienePermisosOpcion() {
		return isTienePermisosOpcion;
	}

	public void setIsTienePermisosOpcion(Boolean isTienePermisosOpcion) {
		this.isTienePermisosOpcion= isTienePermisosOpcion;
	}


	public Boolean isTienePermisosPerfilOpcion=false;

	public Boolean getIsTienePermisosPerfilOpcion() {
		return isTienePermisosPerfilOpcion;
	}

	public void setIsTienePermisosPerfilOpcion(Boolean isTienePermisosPerfilOpcion) {
		this.isTienePermisosPerfilOpcion= isTienePermisosPerfilOpcion;
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
	
	public Boolean isPermisoTodoGrupoOpcion;
	public Boolean isPermisoNuevoGrupoOpcion;
	public Boolean isPermisoActualizarGrupoOpcion;
	public Boolean isPermisoActualizarOriginalGrupoOpcion;
	public Boolean isPermisoEliminarGrupoOpcion;
	public Boolean isPermisoGuardarCambiosGrupoOpcion;
	public Boolean isPermisoConsultaGrupoOpcion;
	public Boolean isPermisoBusquedaGrupoOpcion;
	public Boolean isPermisoReporteGrupoOpcion;
	public Boolean isPermisoPaginacionMedioGrupoOpcion;
	public Boolean isPermisoPaginacionAltoGrupoOpcion;
	public Boolean isPermisoPaginacionTodoGrupoOpcion;
	public Boolean isPermisoCopiarGrupoOpcion;
	public Boolean isPermisoVerFormGrupoOpcion;
	public Boolean isPermisoDuplicarGrupoOpcion;
	public Boolean isPermisoOrdenGrupoOpcion;
	
	
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
	
	public GrupoOpcionParameterReturnGeneral grupoopcionReturnGeneral;
	public GrupoOpcionParameterReturnGeneral grupoopcionParameterGeneral;
	
	

	public UsuarioOpcionLogic usuarioopcionLogic=null;

	public UsuarioOpcionLogic getUsuarioOpcionLogic() {
		return usuarioopcionLogic;
	}

	public void setUsuarioOpcionLogic(UsuarioOpcionLogic usuarioopcionLogic) {
		this.usuarioopcionLogic = usuarioopcionLogic;
	}


	public OpcionLogic opcionLogic=null;

	public OpcionLogic getOpcionLogic() {
		return opcionLogic;
	}

	public void setOpcionLogic(OpcionLogic opcionLogic) {
		this.opcionLogic = opcionLogic;
	}


	public PerfilOpcionLogic perfilopcionLogic=null;

	public PerfilOpcionLogic getPerfilOpcionLogic() {
		return perfilopcionLogic;
	}

	public void setPerfilOpcionLogic(PerfilOpcionLogic perfilopcionLogic) {
		this.perfilopcionLogic = perfilopcionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGrupoOpcion=false;
	public Boolean esParaAccionDesdeFormularioGrupoOpcion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GrupoOpcionSessionBeanAdditional grupoopcionSessionBeanAdditional=null;
	
	public GrupoOpcionSessionBeanAdditional getGrupoOpcionSessionBeanAdditional() {
		return this.grupoopcionSessionBeanAdditional;
	}
	
	public void setGrupoOpcionSessionBeanAdditional(GrupoOpcionSessionBeanAdditional grupoopcionSessionBeanAdditional) {
		try {
			this.grupoopcionSessionBeanAdditional=grupoopcionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GrupoOpcionBeanSwingJInternalFrameAdditional grupoopcionBeanSwingJInternalFrameAdditional=null;
	//public class GrupoOpcionBeanSwingJInternalFrame
	
	public GrupoOpcionBeanSwingJInternalFrameAdditional getGrupoOpcionBeanSwingJInternalFrameAdditional() {
		return this.grupoopcionBeanSwingJInternalFrameAdditional;
	}
	
	public void setGrupoOpcionBeanSwingJInternalFrameAdditional(GrupoOpcionBeanSwingJInternalFrameAdditional grupoopcionBeanSwingJInternalFrameAdditional) {
		try {
			this.grupoopcionBeanSwingJInternalFrameAdditional=grupoopcionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GrupoOpcionLogic grupoopcionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GrupoOpcion grupoopcionBean;
	public GrupoOpcionConstantesFunciones grupoopcionConstantesFunciones;
	//public GrupoOpcionParameterReturnGeneral grupoopcionReturnGeneral;
	
	//FK
	
	public ModuloLogic moduloLogic;
	
	//PARAMETROS
	
	
	//public List<GrupoOpcion> grupoopcions;	
	//public List<GrupoOpcion> grupoopcionsEliminados;
	//public List<GrupoOpcion> grupoopcionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGrupoOpcion=false;
	public Boolean isVisibilidadCeldaDuplicarGrupoOpcion=true;
	public Boolean isVisibilidadCeldaCopiarGrupoOpcion=true;
	public Boolean isVisibilidadCeldaVerFormGrupoOpcion=true;
	public Boolean isVisibilidadCeldaOrdenGrupoOpcion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
	public Boolean isVisibilidadCeldaModificarGrupoOpcion=false;
	public Boolean isVisibilidadCeldaActualizarGrupoOpcion=false;
	public Boolean isVisibilidadCeldaEliminarGrupoOpcion=false;
	public Boolean isVisibilidadCeldaCancelarGrupoOpcion=false;
	public Boolean isVisibilidadCeldaGuardarGrupoOpcion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;	
	
	
	public Boolean isVisibilidadBusquedaIdModuloPorNombre=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	
	public Long getiIdNuevoGrupoOpcion() {
		return this.iIdNuevoGrupoOpcion;
	}

	public void setiIdNuevoGrupoOpcion(Long iIdNuevoGrupoOpcion) {
		this.iIdNuevoGrupoOpcion = iIdNuevoGrupoOpcion;
	}
	
	public Long getidGrupoOpcionActual() {
		return this.idGrupoOpcionActual;
	}

	public void setidGrupoOpcionActual(Long idGrupoOpcionActual) {
		this.idGrupoOpcionActual = idGrupoOpcionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GrupoOpcion getgrupoopcion() {
		return this.grupoopcion;
	}

	public void setgrupoopcion(GrupoOpcion grupoopcion) {
		this.grupoopcion = grupoopcion;
	}
	
	public GrupoOpcion getgrupoopcionAux() {
		return this.grupoopcionAux;
	}

	public void setgrupoopcionAux(GrupoOpcion grupoopcionAux) {
		this.grupoopcionAux = grupoopcionAux;
	}				
	
	public GrupoOpcion getgrupoopcionAnterior() {
		return this.grupoopcionAnterior;
	}

	public void setgrupoopcionAnterior(GrupoOpcion grupoopcionAnterior) {
		this.grupoopcionAnterior = grupoopcionAnterior;
	}	
	
	public GrupoOpcion getgrupoopcionTotales() {
		return this.grupoopcionTotales;
	}

	public void setgrupoopcionTotales(GrupoOpcion grupoopcionTotales) {
		this.grupoopcionTotales = grupoopcionTotales;
	}	
	
	public GrupoOpcion getgrupoopcionBean() {
		return this.grupoopcionBean;
	}

	public void setgrupoopcionBean(GrupoOpcion grupoopcionBean) {
		this.grupoopcionBean = grupoopcionBean;
	}	
	
	public GrupoOpcionParameterReturnGeneral getgrupoopcionReturnGeneral() {
		return this.grupoopcionReturnGeneral;
	}

	public void setgrupoopcionReturnGeneral(GrupoOpcionParameterReturnGeneral grupoopcionReturnGeneral) {
		this.grupoopcionReturnGeneral = grupoopcionReturnGeneral;
	}	
	
	
	public Long id_moduloBusquedaIdModuloPorNombre=-1L;

	public Long getid_moduloBusquedaIdModuloPorNombre() {
		return this.id_moduloBusquedaIdModuloPorNombre;
	}

	public void setid_moduloBusquedaIdModuloPorNombre(Long id_moduloBusquedaIdModuloPorNombre) {
		this.id_moduloBusquedaIdModuloPorNombre = id_moduloBusquedaIdModuloPorNombre;
	}

;
	public String nombre_principalBusquedaIdModuloPorNombre="";

	public String getnombre_principalBusquedaIdModuloPorNombre() {
		return this.nombre_principalBusquedaIdModuloPorNombre;
	}

	public void setnombre_principalBusquedaIdModuloPorNombre(String nombre_principalBusquedaIdModuloPorNombre) {
		this.nombre_principalBusquedaIdModuloPorNombre = nombre_principalBusquedaIdModuloPorNombre;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public GrupoOpcionLogic getGrupoOpcionLogic()	{		
		return grupoopcionLogic;
	}

	public void setGrupoOpcionLogic(GrupoOpcionLogic grupoopcionLogic) {
		this.grupoopcionLogic = grupoopcionLogic;
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
	
	public Boolean getIsEsNuevoGrupoOpcion() {
		return isEsNuevoGrupoOpcion;
	}

	public void setIsEsNuevoGrupoOpcion(Boolean isEsNuevoGrupoOpcion) {
		this.isEsNuevoGrupoOpcion = isEsNuevoGrupoOpcion;
	}

	public Boolean getEsParaAccionDesdeFormularioGrupoOpcion() {
		return esParaAccionDesdeFormularioGrupoOpcion;
	}
	
	public void setEsParaAccionDesdeFormularioGrupoOpcion(Boolean esParaAccionDesdeFormularioGrupoOpcion) {
		this.esParaAccionDesdeFormularioGrupoOpcion = esParaAccionDesdeFormularioGrupoOpcion;
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

			if(this.grupoopcionSessionBean==null) {
				this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
			}

			if(!this.grupoopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(grupoopcionSessionBean.getlidModuloActual());
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

					if(this.grupoopcion!=null) {
						this.grupoopcion.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
						this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloGrupoOpcion.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
						if(this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaIdModuloPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion!=null) {
						jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion!=null) {
							//jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.getItemCount()>0) {
								jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloGrupoOpcionGenerico)throws Exception
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
				jComboBoxid_moduloGrupoOpcionGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloGrupoOpcionGenerico!=null && jComboBoxid_moduloGrupoOpcionGenerico.getItemCount()>0) {
					jComboBoxid_moduloGrupoOpcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(GrupoOpcion grupoopcion,JComboBox jComboBoxid_moduloGrupoOpcionGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloGrupoOpcionGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloGrupoOpcionGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				grupoopcion.setid_modulo(moduloAux.getId());
				grupoopcion.setmodulo_descripcion(GrupoOpcionConstantesFunciones.getModuloDescripcion(moduloAux));
				grupoopcion.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { 
							this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { 
					}

					if(!GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaIdModuloPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.addItem(modulo);
							}
						}

						if(!GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
							this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
							this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesGrupoOpcion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			GrupoOpcionConstantesFunciones.refrescarForeignKeysDescripcionesGrupoOpcion(this.grupoopcionLogic.getGrupoOpcions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			GrupoOpcionConstantesFunciones.refrescarForeignKeysDescripcionesGrupoOpcion(this.grupoopcions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Modulo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//grupoopcionLogic.setGrupoOpcions(this.grupoopcions);
			grupoopcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public GrupoOpcionParameterReturnGeneral getGrupoOpcionParameterGeneral() {
		return this.grupoopcionParameterGeneral;
	}
	
	public void setGrupoOpcionParameterGeneral(GrupoOpcionParameterReturnGeneral grupoopcionParameterGeneral) {
		this.grupoopcionParameterGeneral = grupoopcionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGrupoOpcion() {
		return isPermisoTodoGrupoOpcion;
	}

	public void setIsPermisoTodoGrupoOpcion(Boolean isPermisoTodoGrupoOpcion) {
		this.isPermisoTodoGrupoOpcion = isPermisoTodoGrupoOpcion;
	}

	public Boolean getIsPermisoNuevoGrupoOpcion() {
		return isPermisoNuevoGrupoOpcion;
	}

	public void setIsPermisoNuevoGrupoOpcion(Boolean isPermisoNuevoGrupoOpcion) {
		this.isPermisoNuevoGrupoOpcion = isPermisoNuevoGrupoOpcion;
	}

	public Boolean getIsPermisoActualizarGrupoOpcion() {
		return isPermisoActualizarGrupoOpcion;
	}

	public void setIsPermisoActualizarGrupoOpcion(Boolean isPermisoActualizarGrupoOpcion) {
		this.isPermisoActualizarGrupoOpcion = isPermisoActualizarGrupoOpcion;
	}

	public Boolean getIsPermisoEliminarGrupoOpcion() {
		return isPermisoEliminarGrupoOpcion;
	}

	public void setIsPermisoEliminarGrupoOpcion(Boolean isPermisoEliminarGrupoOpcion) {
		this.isPermisoEliminarGrupoOpcion = isPermisoEliminarGrupoOpcion;
	}

	public Boolean getIsPermisoGuardarCambiosGrupoOpcion() {
		return isPermisoGuardarCambiosGrupoOpcion;
	}

	public void setIsPermisoGuardarCambiosGrupoOpcion(Boolean isPermisoGuardarCambiosGrupoOpcion) {
		this.isPermisoGuardarCambiosGrupoOpcion = isPermisoGuardarCambiosGrupoOpcion;
	}
	
	public Boolean getIsPermisoConsultaGrupoOpcion() {
		return isPermisoConsultaGrupoOpcion;
	}

	public void setIsPermisoConsultaGrupoOpcion(Boolean isPermisoConsultaGrupoOpcion) {
		this.isPermisoConsultaGrupoOpcion = isPermisoConsultaGrupoOpcion;
	}

	public Boolean getIsPermisoBusquedaGrupoOpcion() {
		return isPermisoBusquedaGrupoOpcion;
	}

	public void setIsPermisoBusquedaGrupoOpcion(Boolean isPermisoBusquedaGrupoOpcion) {
		this.isPermisoBusquedaGrupoOpcion = isPermisoBusquedaGrupoOpcion;
	}

	public Boolean getIsPermisoReporteGrupoOpcion() {
		return isPermisoReporteGrupoOpcion;
	}

	public void setIsPermisoReporteGrupoOpcion(Boolean isPermisoReporteGrupoOpcion) {
		this.isPermisoReporteGrupoOpcion = isPermisoReporteGrupoOpcion;
	}
	
	public Boolean getIsPermisoPaginacionMedioGrupoOpcion() {
		return isPermisoPaginacionMedioGrupoOpcion;
	}

	public void setIsPermisoPaginacionMedioGrupoOpcion(Boolean isPermisoPaginacionMedioGrupoOpcion) {
		this.isPermisoPaginacionMedioGrupoOpcion = isPermisoPaginacionMedioGrupoOpcion;
	}
	
	public Boolean getIsPermisoPaginacionTodoGrupoOpcion() {
		return isPermisoPaginacionTodoGrupoOpcion;
	}

	public void setIsPermisoPaginacionTodoGrupoOpcion(Boolean isPermisoPaginacionTodoGrupoOpcion) {
		this.isPermisoPaginacionTodoGrupoOpcion = isPermisoPaginacionTodoGrupoOpcion;
	}
	
	public Boolean getIsPermisoPaginacionAltoGrupoOpcion() {
		return isPermisoPaginacionAltoGrupoOpcion;
	}

	public void setIsPermisoPaginacionAltoGrupoOpcion(Boolean isPermisoPaginacionAltoGrupoOpcion) {
		this.isPermisoPaginacionAltoGrupoOpcion = isPermisoPaginacionAltoGrupoOpcion;
	}
	
	public Boolean getIsPermisoCopiarGrupoOpcion() {
		return isPermisoCopiarGrupoOpcion;
	}

	public void setIsPermisoCopiarGrupoOpcion(Boolean isPermisoCopiarGrupoOpcion) {
		this.isPermisoCopiarGrupoOpcion = isPermisoCopiarGrupoOpcion;
	}
	
	public Boolean getIsPermisoVerFormGrupoOpcion() {
		return isPermisoVerFormGrupoOpcion;
	}

	public void setIsPermisoVerFormGrupoOpcion(Boolean isPermisoVerFormGrupoOpcion) {
		this.isPermisoVerFormGrupoOpcion = isPermisoVerFormGrupoOpcion;
	}
	
	public Boolean getIsPermisoDuplicarGrupoOpcion() {
		return isPermisoDuplicarGrupoOpcion;
	}

	public void setIsPermisoDuplicarGrupoOpcion(Boolean isPermisoDuplicarGrupoOpcion) {
		this.isPermisoDuplicarGrupoOpcion = isPermisoDuplicarGrupoOpcion;
	}
	
	public Boolean getIsPermisoOrdenGrupoOpcion() {
		return isPermisoOrdenGrupoOpcion;
	}

	public void setIsPermisoOrdenGrupoOpcion(Boolean isPermisoOrdenGrupoOpcion) {
		this.isPermisoOrdenGrupoOpcion = isPermisoOrdenGrupoOpcion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGrupoOpcion() {
		return isVisibilidadCeldaNuevoGrupoOpcion;
	}

	public void setIsVisibilidadCeldaNuevoGrupoOpcion(Boolean isVisibilidadCeldaNuevoGrupoOpcion) {
		this.isVisibilidadCeldaNuevoGrupoOpcion = isVisibilidadCeldaNuevoGrupoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGrupoOpcion() {
		return isVisibilidadCeldaDuplicarGrupoOpcion;
	}

	public void setIsVisibilidadCeldaDuplicarGrupoOpcion(Boolean isVisibilidadCeldaDuplicarGrupoOpcion) {
		this.isVisibilidadCeldaDuplicarGrupoOpcion = isVisibilidadCeldaDuplicarGrupoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGrupoOpcion() {
		return isVisibilidadCeldaCopiarGrupoOpcion;
	}

	public void setIsVisibilidadCeldaCopiarGrupoOpcion(Boolean isVisibilidadCeldaCopiarGrupoOpcion) {
		this.isVisibilidadCeldaCopiarGrupoOpcion = isVisibilidadCeldaCopiarGrupoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGrupoOpcion() {
		return isVisibilidadCeldaVerFormGrupoOpcion;
	}

	public void setIsVisibilidadCeldaVerFormGrupoOpcion(Boolean isVisibilidadCeldaVerFormGrupoOpcion) {
		this.isVisibilidadCeldaVerFormGrupoOpcion = isVisibilidadCeldaVerFormGrupoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGrupoOpcion() {
		return isVisibilidadCeldaOrdenGrupoOpcion;
	}

	public void setIsVisibilidadCeldaOrdenGrupoOpcion(Boolean isVisibilidadCeldaOrdenGrupoOpcion) {
		this.isVisibilidadCeldaOrdenGrupoOpcion = isVisibilidadCeldaOrdenGrupoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGrupoOpcion() {
		return isVisibilidadCeldaNuevoRelacionesGrupoOpcion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGrupoOpcion(Boolean isVisibilidadCeldaNuevoRelacionesGrupoOpcion) {
		this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion = isVisibilidadCeldaNuevoRelacionesGrupoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGrupoOpcion() {
		return isVisibilidadCeldaModificarGrupoOpcion;
	}

	public void setIsVisibilidadCeldaModificarGrupoOpcion(Boolean isVisibilidadCeldaModificarGrupoOpcion) {
		this.isVisibilidadCeldaModificarGrupoOpcion = isVisibilidadCeldaModificarGrupoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGrupoOpcion() {
		return isVisibilidadCeldaActualizarGrupoOpcion;
	}

	public void setIsVisibilidadCeldaActualizarGrupoOpcion(Boolean isVisibilidadCeldaActualizarGrupoOpcion) {
		this.isVisibilidadCeldaActualizarGrupoOpcion = isVisibilidadCeldaActualizarGrupoOpcion;
	}

	public Boolean getIsVisibilidadCeldaEliminarGrupoOpcion() {
		return isVisibilidadCeldaEliminarGrupoOpcion;
	}

	public void setIsVisibilidadCeldaEliminarGrupoOpcion(Boolean isVisibilidadCeldaEliminarGrupoOpcion) {
		this.isVisibilidadCeldaEliminarGrupoOpcion = isVisibilidadCeldaEliminarGrupoOpcion;
	}

	public Boolean getIsVisibilidadCeldaCancelarGrupoOpcion() {
		return isVisibilidadCeldaCancelarGrupoOpcion;
	}

	public void setIsVisibilidadCeldaCancelarGrupoOpcion(Boolean isVisibilidadCeldaCancelarGrupoOpcion) {
		this.isVisibilidadCeldaCancelarGrupoOpcion = isVisibilidadCeldaCancelarGrupoOpcion;
	}

	public Boolean getIsVisibilidadCeldaGuardarGrupoOpcion() {
		return isVisibilidadCeldaGuardarGrupoOpcion;
	}

	public void setIsVisibilidadCeldaGuardarGrupoOpcion(Boolean isVisibilidadCeldaGuardarGrupoOpcion) {
		this.isVisibilidadCeldaGuardarGrupoOpcion = isVisibilidadCeldaGuardarGrupoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGrupoOpcion() {
		return isVisibilidadCeldaGuardarCambiosGrupoOpcion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGrupoOpcion(Boolean isVisibilidadCeldaGuardarCambiosGrupoOpcion) {
		this.isVisibilidadCeldaGuardarCambiosGrupoOpcion = isVisibilidadCeldaGuardarCambiosGrupoOpcion;
	}
		
	public GrupoOpcionSessionBean getgrupoopcionSessionBean() {
		return this.grupoopcionSessionBean;
	}
	
	public void setgrupoopcionSessionBean(GrupoOpcionSessionBean grupoopcionSessionBean) {
		this.grupoopcionSessionBean=grupoopcionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaIdModuloPorNombre() {
		return this.isVisibilidadBusquedaIdModuloPorNombre;
	}

	public void setisVisibilidadBusquedaIdModuloPorNombre(Boolean isVisibilidadBusquedaIdModuloPorNombre) {
		this.isVisibilidadBusquedaIdModuloPorNombre=isVisibilidadBusquedaIdModuloPorNombre;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(GrupoOpcion grupoopcion)throws Exception {
		try {
			
				this.setActualParaGuardarModuloForeignKey(grupoopcion,null);
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
	
	public void bugActualizarReferenciaActual(GrupoOpcion grupoopcion,GrupoOpcion grupoopcionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGrupoOpcion(grupoopcion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		grupoopcionAux.setId(grupoopcion.getId());
		grupoopcionAux.setVersionRow(grupoopcion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessGrupoOpcion();
		
			int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = grupoopcionValidator.getInvalidValues(this.grupoopcion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			grupoopcionLogic.setDatosCliente(datosCliente);
			grupoopcionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				grupoopcionAux=new  GrupoOpcion();
				
				grupoopcionAux.setIsNew(true);
				grupoopcionAux.setIsChanged(true);
				
				grupoopcionAux.setGrupoOpcionOriginal(this.grupoopcion);
				
				grupoopcionAux.setId(this.grupoopcion.getId());	
				grupoopcionAux.setVersionRow(this.grupoopcion.getVersionRow());	
				grupoopcionAux.setid_modulo(this.grupoopcion.getid_modulo());	
				grupoopcionAux.setcodigo(this.grupoopcion.getcodigo());	
				grupoopcionAux.setnombre_principal(this.grupoopcion.getnombre_principal());	
				grupoopcionAux.setorden(this.grupoopcion.getorden());	
				grupoopcionAux.setestado(this.grupoopcion.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupoopcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(grupoopcionAux,grupoopcionLogic.getGrupoOpcions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoopcionAux,grupoopcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.grupoopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionLogic.saveGrupoOpcions();//WithConnection
						//grupoopcionLogic.getSetVersionRowGrupoOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupoopcion,grupoopcionAux);
					
					this.refrescarForeignKeysDescripcionesGrupoOpcion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoopcionLogic.saveGrupoOpcionRelaciones(grupoopcionAux,this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());//WithConnection
								//grupoopcionLogic.getSetVersionRowGrupoOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.grupoopcion,grupoopcionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setUsuarioOpcions(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setOpcions(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setPerfilOpcions(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.grupoopcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(grupoopcionAux,grupoopcionLogic.getGrupoOpcions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(grupoopcionAux,grupoopcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.grupoopcion,grupoopcionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				grupoopcionAux=new  GrupoOpcion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.grupoopcionSessionBean.getEsGuardarRelacionado() 
					|| (this.grupoopcionSessionBean.getEsGuardarRelacionado() && this.grupoopcion.getId()>=0)) {
						
					grupoopcionAux.setIsNew(false);
				}
				
				grupoopcionAux.setIsDeleted(false);
			
				grupoopcionAux.setId(this.grupoopcion.getId());	
				grupoopcionAux.setVersionRow(this.grupoopcion.getVersionRow());	
				grupoopcionAux.setid_modulo(this.grupoopcion.getid_modulo());	
				grupoopcionAux.setcodigo(this.grupoopcion.getcodigo());	
				grupoopcionAux.setnombre_principal(this.grupoopcion.getnombre_principal());	
				grupoopcionAux.setorden(this.grupoopcion.getorden());	
				grupoopcionAux.setestado(this.grupoopcion.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupoopcionAux,grupoopcionLogic.getGrupoOpcions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoopcionAux,grupoopcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.grupoopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionLogic.saveGrupoOpcions();//WithConnection
						//grupoopcionLogic.getSetVersionRowGrupoOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupoopcion,grupoopcionAux);
					
					this.refrescarForeignKeysDescripcionesGrupoOpcion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoopcionLogic.saveGrupoOpcionRelaciones(grupoopcionAux,this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());//WithConnection
								//grupoopcionLogic.getSetVersionRowGrupoOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.grupoopcion,grupoopcionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setUsuarioOpcions(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setOpcions(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setPerfilOpcions(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.grupoopcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(grupoopcionAux,grupoopcionLogic.getGrupoOpcions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(grupoopcionAux,grupoopcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.grupoopcion,grupoopcionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				grupoopcionAux=new  GrupoOpcion();
				
				grupoopcionAux.setIsNew(false);
				grupoopcionAux.setIsChanged(false);
				
				grupoopcionAux.setIsDeleted(true);
				
				grupoopcionAux.setId(this.grupoopcion.getId());	
				grupoopcionAux.setVersionRow(this.grupoopcion.getVersionRow());	
				grupoopcionAux.setid_modulo(this.grupoopcion.getid_modulo());	
				grupoopcionAux.setcodigo(this.grupoopcion.getcodigo());	
				grupoopcionAux.setnombre_principal(this.grupoopcion.getnombre_principal());	
				grupoopcionAux.setorden(this.grupoopcion.getorden());	
				grupoopcionAux.setestado(this.grupoopcion.getestado());	
				
				if(this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.grupoopcionAux.getId()>=0) {	
						this.grupoopcionsEliminados.add(grupoopcionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(grupoopcionAux,grupoopcionLogic.getGrupoOpcions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoopcionAux,grupoopcions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.grupoopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionLogic.saveGrupoOpcions();//WithConnection
						//grupoopcionLogic.getSetVersionRowGrupoOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								grupoopcionLogic.saveGrupoOpcionRelaciones(grupoopcionAux,this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());//WithConnection
								//grupoopcionLogic.getSetVersionRowGrupoOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setUsuarioOpcions(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setOpcions(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoopcionAux.setPerfilOpcions(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.grupoopcionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(grupoopcionAux,grupoopcionLogic.getGrupoOpcions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(grupoopcionAux,grupoopcions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getGrupoOpcions().addAll(this.grupoopcionsEliminados);
					
					grupoopcionLogic.saveGrupoOpcions();//WithConnection
					//grupoopcionLogic.getSetVersionRowGrupoOpcions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesGrupoOpcion();
				
				this.grupoopcionsEliminados= new ArrayList<GrupoOpcion>();		
			}
			
			if(this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Grupo Opcion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.grupoopcion=grupoopcionAux;
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
      		//this.finishProcessGrupoOpcion();
      	}
		
	}	
	
	public void actualizarRelaciones(GrupoOpcion grupoopcionLocal) throws Exception {
		
		if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				grupoopcionLocal.setUsuarioOpcions(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());
				grupoopcionLocal.setOpcions(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());
				grupoopcionLocal.setPerfilOpcions(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
			
			} else {
			
				grupoopcionLocal.setUsuarioOpcions(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions);
				grupoopcionLocal.setOpcions(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcions);
				grupoopcionLocal.setPerfilOpcions(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GrupoOpcion grupoopcionLocal) throws Exception {	
		if(this.grupoopcionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				grupoopcionLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGrupoOpcionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = grupoopcionValidator.getInvalidValues(this.grupoopcion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GrupoOpcion grupoopcion,List<GrupoOpcion> grupoopcions) throws Exception {
		try	{		
			GrupoOpcionConstantesFunciones.actualizarLista(grupoopcion,grupoopcions,this.grupoopcionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GrupoOpcion grupoopcion,List<GrupoOpcion> grupoopcions) throws Exception {
		try	{			
			GrupoOpcionConstantesFunciones.actualizarSelectedLista(grupoopcion,grupoopcions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GrupoOpcion> grupoopcionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				grupoopcionsLocal=this.grupoopcionLogic.getGrupoOpcions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				grupoopcionsLocal=this.grupoopcions;
			}
			//ARCHITECTURE
		
			for(GrupoOpcion grupoopcionLocal:grupoopcionsLocal) {
				if(this.permiteMantenimiento(grupoopcionLocal) && grupoopcionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GrupoOpcionConstantesFunciones.getGrupoOpcionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GrupoOpcionConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelid_moduloGrupoOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoOpcionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelcodigoGrupoOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoOpcionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelnombre_principalGrupoOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoOpcionConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelordenGrupoOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoOpcionConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelestadoGrupoOpcion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoOpcion.jLabelid_moduloGrupoOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoOpcion.jLabelcodigoGrupoOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoOpcion.jLabelnombre_principalGrupoOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoOpcion.jLabelordenGrupoOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoOpcion.jLabelestadoGrupoOpcion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("UsuarioOpcion")) {
			if(this.grupoopcion==null) {
				this.grupoopcion= new GrupoOpcion();
			}

			if(this.grupoopcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGrupoOpcion
				this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);

				this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.getusuarioopcion().setGrupoOpcion(this.grupoopcion);
			}

			return;
		}
		 else  if(sTipo.equals("Opcion")) {
			if(this.grupoopcion==null) {
				this.grupoopcion= new GrupoOpcion();
			}

			if(this.grupoopcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGrupoOpcion
				this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);

				this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.getopcion().setGrupoOpcion(this.grupoopcion);
			}

			return;
		}
		 else  if(sTipo.equals("PerfilOpcion")) {
			if(this.grupoopcion==null) {
				this.grupoopcion= new GrupoOpcion();
			}

			if(this.grupoopcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGrupoOpcion
				this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);

				this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.getperfilopcion().setGrupoOpcion(this.grupoopcion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoGrupoOpcion--;	
		
		
		this.grupoopcionAux=new GrupoOpcion();
		
		this.grupoopcionAux.setId(this.iIdNuevoGrupoOpcion);
		this.grupoopcionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupoopcionLogic.getGrupoOpcions().add(this.grupoopcionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.grupoopcions.add(this.grupoopcionAux);
		}
		//ARCHITECTURE
		
		this.grupoopcion=this.grupoopcionAux;
		
		if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGrupoOpcion(this.grupoopcion);
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoOpcion(this.grupoopcion);
		}
				
		//this.setDefaultControlesGrupoOpcion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGrupoOpcion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGrupoOpcion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoOpcion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoOpcion(this.grupoopcionBean,this.grupoopcion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(GrupoOpcionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
			classes=GrupoOpcionConstantesFunciones.getClassesRelationshipsOfGrupoOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.grupoopcionReturnGeneral=grupoopcionLogic.procesarEventosGrupoOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoopcionLogic.getGrupoOpcions(),this.grupoopcion,this.grupoopcionParameterGeneral,this.isEsNuevoGrupoOpcion,classes);//this.grupoopcionLogic.getGrupoOpcion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGrupoOpcion(this.grupoopcionReturnGeneral,this.grupoopcionBean,false);
		
		if(this.grupoopcionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoOpcion(this.grupoopcionReturnGeneral.getGrupoOpcion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGrupoOpcion(this.grupoopcionReturnGeneral.getGrupoOpcion());
		}
		
		if(this.grupoopcionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGrupoOpcion(this.grupoopcionReturnGeneral.getGrupoOpcion(),classes);//this.grupoopcionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGrupoOpcion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGrupoOpcion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.RecargarFormGrupoOpcion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGrupoOpcion(false);
						
			if(grupoopcionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado() && UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUsuarioOpcionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado() && OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOpcionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado() && PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilOpcionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoOpcion();
			}
			
			this.actualizarVisualTableDatosGrupoOpcion();
			
			this.jTableDatosGrupoOpcion.setRowSelectionInterval(this.getIndiceNuevoGrupoOpcion(), this.getIndiceNuevoGrupoOpcion());
			
			this.seleccionarFilaTablaGrupoOpcionActual();
						
			this.actualizarEstadoCeldasBotonesGrupoOpcion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGrupoOpcion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldcodigoGrupoOpcion.setEnabled(isHabilitar && this.grupoopcionConstantesFunciones.activarcodigoGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jTextAreanombre_principalGrupoOpcion.setEnabled(isHabilitar && this.grupoopcionConstantesFunciones.activarnombre_principalGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldordenGrupoOpcion.setEnabled(isHabilitar && this.grupoopcionConstantesFunciones.activarordenGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.setEnabled(isHabilitar && this.grupoopcionConstantesFunciones.activarestadoGrupoOpcion);	
		//
		this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setEnabled(isHabilitar && this.grupoopcionConstantesFunciones.activarid_moduloGrupoOpcion);
	};
	
	public void setDefaultControlesGrupoOpcion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGrupoOpcion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.grupoopcionSessionBean.setConGuardarRelaciones(true);			
			this.grupoopcionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.grupoopcionSessionBean.setConGuardarRelaciones(false);			
			this.grupoopcionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoGrupoOpcion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
				if(grupoopcionAux.getId().equals(this.iIdNuevoGrupoOpcion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoOpcion grupoopcionAux:this.grupoopcions) {
				if(grupoopcionAux.getId().equals(this.iIdNuevoGrupoOpcion)) {
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
	
	public int getIndiceActualGrupoOpcion(GrupoOpcion grupoopcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
				if(grupoopcionAux.getId().equals(grupoopcion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoOpcion grupoopcionAux:this.grupoopcions) {
				if(grupoopcionAux.getId().equals(grupoopcion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGrupoOpcion(GrupoOpcion grupoopcionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
				if(grupoopcionAux.getGrupoOpcionOriginal().getId().equals(grupoopcionOriginal.getId())) {
					existe=true;
					grupoopcionOriginal.setId(grupoopcionAux.getId());
					grupoopcionOriginal.setVersionRow(grupoopcionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoOpcion grupoopcionAux:this.grupoopcions) {
				if(grupoopcionAux.getGrupoOpcionOriginal().getId().equals(grupoopcionOriginal.getId())) {
					existe=true;
					grupoopcionOriginal.setId(grupoopcionAux.getId());
					grupoopcionOriginal.setVersionRow(grupoopcionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGrupoOpcion(Boolean esParaCancelar) throws Exception {
		grupoopcionsAux=new ArrayList<GrupoOpcion>();
		grupoopcionAux=new GrupoOpcion();
		
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
					if(grupoopcionAux.getId()<0) {
						grupoopcionsAux.add(grupoopcionAux);
					}		
				}
				this.iIdNuevoGrupoOpcion=0L;
				this.grupoopcionLogic.getGrupoOpcions().removeAll(grupoopcionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoOpcion grupoopcionAux:this.grupoopcions) {
					if(grupoopcionAux.getId()<0) {
						grupoopcionsAux.add(grupoopcionAux);
					}		
				}
				this.iIdNuevoGrupoOpcion=0L;
				this.grupoopcions.removeAll(grupoopcionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGrupoOpcion 
					&& this.grupoopcionLogic.getGrupoOpcions().size()>0
					) {
					grupoopcionAux=this.grupoopcionLogic.getGrupoOpcions().get(this.grupoopcionLogic.getGrupoOpcions().size() - 1);
				
					if(grupoopcionAux.getId()<0) {
						this.grupoopcionLogic.getGrupoOpcions().remove(grupoopcionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGrupoOpcion && this.grupoopcions.size()>0) {
					grupoopcionAux=this.grupoopcions.get(this.grupoopcions.size() - 1);
				
					if(grupoopcionAux.getId()<0) {
						this.grupoopcions.remove(grupoopcionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGrupoOpcion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(grupoopcion.getId()<0) {
				this.grupoopcionLogic.getGrupoOpcions().remove(this.grupoopcion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(grupoopcion.getId()<0) {
				this.grupoopcions.remove(this.grupoopcion);
			}
		}			
	}
	
	public void setEstadosInicialesGrupoOpcion(List<GrupoOpcion> grupoopcionsAux) throws Exception {
		GrupoOpcionConstantesFunciones.setEstadosInicialesGrupoOpcion(grupoopcionsAux);
	}
	
	public void setEstadosInicialesGrupoOpcion(GrupoOpcion grupoopcionAux) throws Exception {
		GrupoOpcionConstantesFunciones.setEstadosInicialesGrupoOpcion(grupoopcionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGrupoOpcionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGrupoOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGrupoOpcionActual()) {
				if(!this.isEsNuevoGrupoOpcion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGrupoOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGrupoOpcion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGrupoOpcionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Grupo Opcion ?", "MANTENIMIENTO DE Grupo Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGrupoOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GrupoOpcion grupoopcion) throws Exception {
		GrupoOpcionConstantesFunciones.seleccionarAsignar(this.grupoopcion,grupoopcion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGrupoOpcion=this.isPermisoActualizarOriginalGrupoOpcion;
			
			
			this.seleccionarAsignar(grupoopcion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoOpcionConstantesFunciones.quitarEspaciosGrupoOpcion(this.grupoopcion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesGrupoOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.grupoopcionSessionBean.setsFuncionBusquedaRapida(this.grupoopcionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGrupoOpcion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGrupoOpcion(esParaCancelar);				
				this.cancelarNuevoGrupoOpcion(esParaCancelar);								
			}
			
			this.grupoopcion=new GrupoOpcion();
			
			this.inicializarGrupoOpcion();
			
			this.actualizarEstadoCeldasBotonesGrupoOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGrupoOpcion() throws Exception {
		try {
			GrupoOpcionConstantesFunciones.inicializarGrupoOpcion(this.grupoopcion);
			
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
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.grupoopcionLogic.getGrupoOpcions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGrupoOpcions(String sAccionBusqueda,List<GrupoOpcion> grupoopcionsParaReportes) throws Exception {
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
					sPathReporteFinal="GrupoOpcion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GrupoOpcionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GrupoOpcionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GrupoOpcion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Grupo Opcions");		
		parameters.put("busquedapor", GrupoOpcionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(UsuarioOpcion.class));
			classes.add(new Classe(Opcion.class));
			classes.add(new Classe(PerfilOpcion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					GrupoOpcionLogic grupoopcionLogicAuxiliar=new GrupoOpcionLogic();
					grupoopcionLogicAuxiliar.setDatosCliente(grupoopcionLogic.getDatosCliente());				
					grupoopcionLogicAuxiliar.setGrupoOpcions(grupoopcionsParaReportes);
					
					grupoopcionLogicAuxiliar.cargarRelacionesLoteForeignKeyGrupoOpcionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					grupoopcionsParaReportes=grupoopcionLogicAuxiliar.getGrupoOpcions();
					
					//grupoopcionLogic.getNewConnexionToDeep();
					
					//for (GrupoOpcion grupoopcion:grupoopcionsParaReportes) {
					//	grupoopcionLogic.deepLoad(grupoopcion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//grupoopcionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//grupoopcionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileUsuarioOpcion = AuxiliarReportes.class.getResourceAsStream("UsuarioOpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_usuarioopcion", reportFileUsuarioOpcion);

			InputStream reportFileOpcion = AuxiliarReportes.class.getResourceAsStream("OpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_opcion", reportFileOpcion);

			InputStream reportFilePerfilOpcion = AuxiliarReportes.class.getResourceAsStream("PerfilOpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_perfilopcion", reportFilePerfilOpcion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGrupoOpcion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GrupoOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GrupoOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGrupoOpcion=new JRBeanArrayDataSource(GrupoOpcionJInternalFrame.TraerGrupoOpcionBeans(grupoopcionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGrupoOpcion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GrupoOpcionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GrupoOpcionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GrupoOpcionBean.TraerGrupoOpcionBeans(grupoopcionsParaReportes).toArray()));
							
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
				this.generarExcelReporteGrupoOpcions(sAccionBusqueda,sTipoArchivoReporte,grupoopcionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGrupoOpcions(sAccionBusqueda,sTipoArchivoReporte,grupoopcionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGrupoOpcionActionPerformed(null);
					//this.generarExcelReporteGrupoOpcions(sAccionBusqueda,sTipoArchivoReporte,grupoopcionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGrupoOpcions(sAccionBusqueda,sTipoArchivoReporte,grupoopcionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGrupoOpcions(sAccionBusqueda,sTipoArchivoReporte,grupoopcionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGrupoOpcions(sAccionBusqueda,sTipoArchivoReporte,grupoopcionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGrupoOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoOpcion> grupoopcionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoopcion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoOpcions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoOpcion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GrupoOpcion grupoopcion : grupoopcionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GrupoOpcionConstantesFunciones.generarExcelReporteDataGrupoOpcion("NORMAL",row,workbook,grupoopcion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGrupoOpcion(String sTipo,Row row,Workbook workbook) {
		
		GrupoOpcionConstantesFunciones.generarExcelReporteHeaderGrupoOpcion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGrupoOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoOpcion> grupoopcionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoopcion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoOpcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GrupoOpcion grupoopcion : grupoopcionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GrupoOpcionConstantesFunciones.getGrupoOpcionDescripcion(grupoopcion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoOpcionConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoopcion.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoOpcionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoopcion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoOpcionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoopcion.getnombre_principal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoOpcionConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoopcion.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoOpcionConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(grupoopcion.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGrupoOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoOpcion> grupoopcionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GrupoOpcion> grupoopcionsRespaldo=null;
		
		classes=GrupoOpcionConstantesFunciones.getClassesRelationshipsOfGrupoOpcion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.grupoopcionLogic.setDatosCliente(this.datosCliente);
		this.grupoopcionLogic.setDatosDeep(this.datosDeep);
		this.grupoopcionLogic.setIsConDeep(true);
		
		grupoopcionsRespaldo=this.grupoopcionLogic.getGrupoOpcions();
		
		this.grupoopcionLogic.setGrupoOpcions(grupoopcionsParaReportes);	
		this.grupoopcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		grupoopcionsParaReportes=this.grupoopcionLogic.getGrupoOpcions();
		this.grupoopcionLogic.setGrupoOpcions(grupoopcionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoopcion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoOpcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoOpcion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GrupoOpcion grupoopcion : grupoopcionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGrupoOpcion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GrupoOpcionConstantesFunciones.generarExcelReporteDataGrupoOpcion("NORMAL",row,workbook,grupoopcion,cellStyleDataAux);
		
			
			


				//UsuarioOpcion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO))) {

				if(grupoopcion.getUsuarioOpcions()!=null && grupoopcion.getUsuarioOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					UsuarioOpcionConstantesFunciones.generarExcelReporteHeaderUsuarioOpcion("RELACIONADO",row,workbook);
				}

				if(grupoopcion.getUsuarioOpcions()!=null) {
					i2=0;
					for(UsuarioOpcion usuarioopcion : grupoopcion.getUsuarioOpcions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						UsuarioOpcionConstantesFunciones.generarExcelReporteDataUsuarioOpcion("RELACIONADO",row,workbook,usuarioopcion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Opcion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(OpcionConstantesFunciones.SCLASSWEBTITULO))) {

				if(grupoopcion.getOpcions()!=null && grupoopcion.getOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(OpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					OpcionConstantesFunciones.generarExcelReporteHeaderOpcion("RELACIONADO",row,workbook);
				}

				if(grupoopcion.getOpcions()!=null) {
					i2=0;
					for(Opcion opcion : grupoopcion.getOpcions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						OpcionConstantesFunciones.generarExcelReporteDataOpcion("RELACIONADO",row,workbook,opcion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PerfilOpcion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO))) {

				if(grupoopcion.getPerfilOpcions()!=null && grupoopcion.getPerfilOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PerfilOpcionConstantesFunciones.generarExcelReporteHeaderPerfilOpcion("RELACIONADO",row,workbook);
				}

				if(grupoopcion.getPerfilOpcions()!=null) {
					i2=0;
					for(PerfilOpcion perfilopcion : grupoopcion.getPerfilOpcions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PerfilOpcionConstantesFunciones.generarExcelReporteDataPerfilOpcion("RELACIONADO",row,workbook,perfilopcion,cellStyleDataAuxHijo);
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
		cell.setCellValue(GrupoOpcionConstantesFunciones.getGrupoOpcionDescripcion(grupoopcion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoOpcion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGrupoOpcion() throws Exception {		
		this.startProcessGrupoOpcion(true);
	}
	
	public void startProcessGrupoOpcion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGrupoOpcion ,this.jPanelParametrosReportesGrupoOpcion, this.jScrollPanelDatosGrupoOpcion,this.jPanelPaginacionGrupoOpcion, this.jScrollPanelDatosEdicionGrupoOpcion, this.jPanelAccionesGrupoOpcion,this.jPanelAccionesFormularioGrupoOpcion,this.jmenuBarGrupoOpcion,this.jmenuBarDetalleGrupoOpcion,this.jTtoolBarGrupoOpcion,this.jTtoolBarDetalleGrupoOpcion);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoOpcion=this.jTabbedPaneBusquedasGrupoOpcion; 
		
		final JPanel jPanelParametrosReportesGrupoOpcion=this.jPanelParametrosReportesGrupoOpcion;
		//final JScrollPane jScrollPanelDatosGrupoOpcion=this.jScrollPanelDatosGrupoOpcion;
		final JTable jTableDatosGrupoOpcion=this.jTableDatosGrupoOpcion;		
		final JPanel jPanelPaginacionGrupoOpcion=this.jPanelPaginacionGrupoOpcion;
		//final JScrollPane jScrollPanelDatosEdicionGrupoOpcion=this.jScrollPanelDatosEdicionGrupoOpcion;
		final JPanel jPanelAccionesGrupoOpcion=this.jPanelAccionesGrupoOpcion;
		
		JPanel jPanelCamposAuxiliarGrupoOpcion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGrupoOpcion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			jPanelCamposAuxiliarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jPanelCamposGrupoOpcion;
			jPanelAccionesFormularioAuxiliarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jPanelAccionesFormularioGrupoOpcion;
		}
		
		final JPanel jPanelCamposGrupoOpcion=jPanelCamposAuxiliarGrupoOpcion;
		final JPanel jPanelAccionesFormularioGrupoOpcion=jPanelAccionesFormularioAuxiliarGrupoOpcion;
		
		
		final JMenuBar jmenuBarGrupoOpcion=this.jmenuBarGrupoOpcion;
		final JToolBar jTtoolBarGrupoOpcion=this.jTtoolBarGrupoOpcion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGrupoOpcion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoOpcion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			jmenuBarDetalleAuxiliarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jmenuBarDetalleGrupoOpcion;
			jTtoolBarDetalleAuxiliarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jTtoolBarDetalleGrupoOpcion;
		}
		
		final JMenuBar jmenuBarDetalleGrupoOpcion=jmenuBarDetalleAuxiliarGrupoOpcion;
		final JToolBar jTtoolBarDetalleGrupoOpcion=jTtoolBarDetalleAuxiliarGrupoOpcion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoOpcion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoOpcion;
			processRunnable.jTableDatos=jTableDatosGrupoOpcion;
			processRunnable.jPanelCampos=jPanelCamposGrupoOpcion;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoOpcion;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoOpcion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoOpcion;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoOpcion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoOpcion;
			processRunnable.jTtoolBar=jTtoolBarGrupoOpcion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoOpcion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoOpcion ,jPanelParametrosReportesGrupoOpcion,jTableDatosGrupoOpcion, /*jScrollPanelDatosGrupoOpcion,*/jPanelCamposGrupoOpcion,jPanelPaginacionGrupoOpcion, /*jScrollPanelDatosEdicionGrupoOpcion,*/ jPanelAccionesGrupoOpcion,jPanelAccionesFormularioGrupoOpcion,jmenuBarGrupoOpcion,jmenuBarDetalleGrupoOpcion,jTtoolBarGrupoOpcion,jTtoolBarDetalleGrupoOpcion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoOpcion ,jPanelParametrosReportesGrupoOpcion, jScrollPanelDatosGrupoOpcion,jPanelPaginacionGrupoOpcion, jScrollPanelDatosEdicionGrupoOpcion, jPanelAccionesGrupoOpcion,jPanelAccionesFormularioGrupoOpcion,jmenuBarGrupoOpcion,jmenuBarDetalleGrupoOpcion,jTtoolBarGrupoOpcion,jTtoolBarDetalleGrupoOpcion);
						
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
	
	public void finishProcessGrupoOpcion() {// throws Exception 
		this.finishProcessGrupoOpcion(true);
	}
	
	public void finishProcessGrupoOpcion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGrupoOpcion ,this.jPanelParametrosReportesGrupoOpcion, this.jScrollPanelDatosGrupoOpcion,this.jPanelPaginacionGrupoOpcion, this.jScrollPanelDatosEdicionGrupoOpcion, this.jPanelAccionesGrupoOpcion,this.jPanelAccionesFormularioGrupoOpcion,this.jmenuBarGrupoOpcion,this.jmenuBarDetalleGrupoOpcion,this.jTtoolBarGrupoOpcion,this.jTtoolBarDetalleGrupoOpcion);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoOpcion=this.jTabbedPaneBusquedasGrupoOpcion; 
		
		final JPanel jPanelParametrosReportesGrupoOpcion=this.jPanelParametrosReportesGrupoOpcion;
		//final JScrollPane jScrollPanelDatosGrupoOpcion=this.jScrollPanelDatosGrupoOpcion;
		final JTable jTableDatosGrupoOpcion=this.jTableDatosGrupoOpcion;		
		final JPanel jPanelPaginacionGrupoOpcion=this.jPanelPaginacionGrupoOpcion;
		//final JScrollPane jScrollPanelDatosEdicionGrupoOpcion=this.jScrollPanelDatosEdicionGrupoOpcion;
		final JPanel jPanelAccionesGrupoOpcion=this.jPanelAccionesGrupoOpcion;
		
		JPanel jPanelCamposAuxiliarGrupoOpcion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGrupoOpcion=new JPanel();
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			jPanelCamposAuxiliarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jPanelCamposGrupoOpcion;
			jPanelAccionesFormularioAuxiliarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jPanelAccionesFormularioGrupoOpcion;
		}
		
		final JPanel jPanelCamposGrupoOpcion=jPanelCamposAuxiliarGrupoOpcion;
		final JPanel jPanelAccionesFormularioGrupoOpcion=jPanelAccionesFormularioAuxiliarGrupoOpcion;
		
		
		final JMenuBar jmenuBarGrupoOpcion=this.jmenuBarGrupoOpcion;		
		final JToolBar jTtoolBarGrupoOpcion=this.jTtoolBarGrupoOpcion;
				
		JMenuBar jmenuBarDetalleAuxiliarGrupoOpcion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoOpcion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			jmenuBarDetalleAuxiliarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jmenuBarDetalleGrupoOpcion;
			jTtoolBarDetalleAuxiliarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jTtoolBarDetalleGrupoOpcion;		
		}
		
		final JMenuBar jmenuBarDetalleGrupoOpcion=jmenuBarDetalleAuxiliarGrupoOpcion;
		final JToolBar jTtoolBarDetalleGrupoOpcion=jTtoolBarDetalleAuxiliarGrupoOpcion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoOpcion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoOpcion;
			processRunnable.jTableDatos=jTableDatosGrupoOpcion;
			processRunnable.jPanelCampos=jPanelCamposGrupoOpcion;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoOpcion;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoOpcion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoOpcion;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoOpcion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoOpcion;
			processRunnable.jTtoolBar=jTtoolBarGrupoOpcion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoOpcion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGrupoOpcion ,jPanelParametrosReportesGrupoOpcion, jTableDatosGrupoOpcion,/*jScrollPanelDatosGrupoOpcion,*/jPanelCamposGrupoOpcion,jPanelPaginacionGrupoOpcion, /*jScrollPanelDatosEdicionGrupoOpcion,*/ jPanelAccionesGrupoOpcion,jPanelAccionesFormularioGrupoOpcion,jmenuBarGrupoOpcion,jmenuBarDetalleGrupoOpcion,jTtoolBarGrupoOpcion,jTtoolBarDetalleGrupoOpcion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGrupoOpcion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGrupoOpcion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGrupoOpcion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGrupoOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGrupoOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGrupoOpcion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGrupoOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGrupoOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGrupoOpcion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.grupoopcionConstantesFunciones.getsFinalQueryGrupoOpcion();
		String  finalQueryPaginacionTodos=this.grupoopcionConstantesFunciones.getsFinalQueryGrupoOpcion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GrupoOpcionConstantesFunciones.getArrayColumnasGlobalesNoGrupoOpcion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GrupoOpcionConstantesFunciones.getArrayColumnasGlobalesGrupoOpcion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GrupoOpcionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.grupoopcionsEliminados= new ArrayList<GrupoOpcion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGrupoOpcion();
		
				///*GrupoOpcionSessionBean*/this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
			
			if(this.grupoopcionSessionBean==null) {
				this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
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
					this.iNumeroPaginacion=GrupoOpcionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GrupoOpcionConstantesFunciones.getClassesForeignKeysOfGrupoOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/grupoopcion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			grupoopcionsAux= new ArrayList<GrupoOpcion>();
			
				
			grupoopcionLogic.setDatosCliente(this.datosCliente);
			grupoopcionLogic.setDatosDeep(this.datosDeep);
			grupoopcionLogic.setIsConDeep(true);
			
			
			grupoopcionLogic.getGrupoOpcionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					grupoopcionLogic.getTodosGrupoOpcions(finalQueryGlobal,pagination);
					
					//grupoopcionLogic.getTodosGrupoOpcionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(grupoopcionLogic.getGrupoOpcions()==null|| grupoopcionLogic.getGrupoOpcions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoopcionsAux= new ArrayList<GrupoOpcion>();
							grupoopcionsAux.addAll(grupoopcionLogic.getGrupoOpcions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoopcionsAux= new ArrayList<GrupoOpcion>();
							grupoopcionsAux.addAll(grupoopcions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoopcionLogic.getTodosGrupoOpcions(finalQueryGlobal+"",this.pagination);												
							
							//grupoopcionLogic.getTodosGrupoOpcionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteGrupoOpcions("Todos",grupoopcionLogic.getGrupoOpcions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoopcionLogic.setGrupoOpcions(new ArrayList<GrupoOpcion>());					
							grupoopcionLogic.getGrupoOpcions().addAll(grupoopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoopcions=new ArrayList<GrupoOpcion>();
							grupoopcions.addAll(grupoopcionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idGrupoOpcion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idGrupoOpcion=this.idActual;
				
				} else if(this.idGrupoOpcionActual!=null && this.idGrupoOpcionActual!=0L) {
					idGrupoOpcion=idGrupoOpcionActual;
				}
				
					
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndicePorId(idGrupoOpcion);
				
				this.grupoopcions=new ArrayList<GrupoOpcion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					grupoopcionLogic.getEntity(idGrupoOpcion);
					
					//grupoopcionLogic.getEntityWithConnection(idGrupoOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoopcionLogic.setGrupoOpcions(new ArrayList<GrupoOpcion>());
					grupoopcionLogic.getGrupoOpcions().add(grupoopcionLogic.getGrupoOpcion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoopcions=new ArrayList<GrupoOpcion>();
					this.grupoopcions.add(grupoopcion);
				}
				
				if(grupoopcionLogic.getGrupoOpcion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaIdModuloPorNombre")) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceBusquedaIdModuloPorNombre(id_moduloBusquedaIdModuloPorNombre,nombre_principalBusquedaIdModuloPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoopcionLogic.getGrupoOpcionsBusquedaIdModuloPorNombre(finalQueryGlobal,pagination,id_moduloBusquedaIdModuloPorNombre,nombre_principalBusquedaIdModuloPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceBusquedaIdModuloPorNombre(id_moduloBusquedaIdModuloPorNombre,nombre_principalBusquedaIdModuloPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceBusquedaIdModuloPorNombre(id_moduloBusquedaIdModuloPorNombre,nombre_principalBusquedaIdModuloPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoopcionLogic.getGrupoOpcions()==null||grupoopcionLogic.getGrupoOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoopcions==null|| grupoopcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionsAux=new ArrayList<GrupoOpcion>();
						grupoopcionsAux.addAll(grupoopcionLogic.getGrupoOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoopcionsAux=new ArrayList<GrupoOpcion>();
							grupoopcionsAux.addAll(grupoopcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoopcionLogic.getGrupoOpcionsBusquedaIdModuloPorNombre(finalQueryGlobal,pagination,id_moduloBusquedaIdModuloPorNombre,nombre_principalBusquedaIdModuloPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceBusquedaIdModuloPorNombre(id_moduloBusquedaIdModuloPorNombre,nombre_principalBusquedaIdModuloPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceBusquedaIdModuloPorNombre(id_moduloBusquedaIdModuloPorNombre,nombre_principalBusquedaIdModuloPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoOpcions("BusquedaIdModuloPorNombre",grupoopcionLogic.getGrupoOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoOpcions("BusquedaIdModuloPorNombre",grupoopcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionLogic.setGrupoOpcions(new ArrayList<GrupoOpcion>());
						grupoopcionLogic.getGrupoOpcions().addAll(grupoopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoopcions=new ArrayList<GrupoOpcion>();
							grupoopcions.addAll(grupoopcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoopcionLogic.getGrupoOpcionsFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoopcionLogic.getGrupoOpcions()==null||grupoopcionLogic.getGrupoOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoopcions==null|| grupoopcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionsAux=new ArrayList<GrupoOpcion>();
						grupoopcionsAux.addAll(grupoopcionLogic.getGrupoOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoopcionsAux=new ArrayList<GrupoOpcion>();
							grupoopcionsAux.addAll(grupoopcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoopcionLogic.getGrupoOpcionsFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoOpcionConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoOpcions("FK_IdModulo",grupoopcionLogic.getGrupoOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoOpcions("FK_IdModulo",grupoopcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionLogic.setGrupoOpcions(new ArrayList<GrupoOpcion>());
						grupoopcionLogic.getGrupoOpcions().addAll(grupoopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoopcions=new ArrayList<GrupoOpcion>();
							grupoopcions.addAll(grupoopcionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGrupoOpcion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGrupoOpcion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupoopcionLogic.getGrupoOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoopcions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupoopcionLogic.getGrupoOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoopcions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GrupoOpcion grupoopcion) {
		Boolean permite=true;
		
		if(this.grupoopcion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GrupoOpcionConstantesFunciones.getOrderByListaGrupoOpcion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GrupoOpcionConstantesFunciones.getOrderByListaGrupoOpcion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoOpcion grupoopcion:grupoopcionLogic.getGrupoOpcions()) {
				if(grupoopcion.getsType().equals(Constantes2.S_TOTALES)) {
					grupoopcionTotales=grupoopcion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoOpcion grupoopcion:this.grupoopcions) {
				if(grupoopcion.getsType().equals(Constantes2.S_TOTALES)) {
					grupoopcionTotales=grupoopcion;
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
			this.grupoopcionAux=new GrupoOpcion();
			this.grupoopcionAux.setsType(Constantes2.S_TOTALES);
			this.grupoopcionAux.setIsNew(false);
			this.grupoopcionAux.setIsChanged(false);
			this.grupoopcionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				GrupoOpcionConstantesFunciones.TotalizarValoresFilaGrupoOpcion(this.grupoopcionLogic.getGrupoOpcions(),this.grupoopcionAux);
				
				this.grupoopcionLogic.getGrupoOpcions().add(this.grupoopcionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GrupoOpcionConstantesFunciones.TotalizarValoresFilaGrupoOpcion(this.grupoopcions,this.grupoopcionAux);
				
				this.grupoopcions.add(this.grupoopcionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		grupoopcionTotales=new GrupoOpcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupoopcionLogic.getGrupoOpcions().remove(grupoopcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupoopcions.remove(grupoopcionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		grupoopcionTotales=new GrupoOpcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoOpcion grupoopcion:grupoopcionLogic.getGrupoOpcions()) {
				if(grupoopcion.getsType().equals(Constantes2.S_TOTALES)) {
					grupoopcionTotales=grupoopcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoOpcionConstantesFunciones.TotalizarValoresFilaGrupoOpcion(this.grupoopcionLogic.getGrupoOpcions(),grupoopcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoOpcion grupoopcion:this.grupoopcions) {
				if(grupoopcion.getsType().equals(Constantes2.S_TOTALES)) {
					grupoopcionTotales=grupoopcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoOpcionConstantesFunciones.TotalizarValoresFilaGrupoOpcion(this.grupoopcions,grupoopcionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGrupoOpcionsBusquedaIdModuloPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaIdModuloPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoOpcionsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoOpcionPorIdModuloPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorIdModuloPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getGrupoOpcionsBusquedaIdModuloPorNombre(String sFinalQuery,Long id_modulo,String nombre_principal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoopcionLogic.getGrupoOpcionsBusquedaIdModuloPorNombre(sFinalQuery,this.pagination,id_modulo,nombre_principal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoOpcionsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoopcionLogic.getGrupoOpcionsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoOpcionPorIdModuloPorCodigo(Long id_modulo,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoopcionLogic.getGrupoOpcionPorIdModuloPorCodigo(id_modulo,codigo);
				
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
	
	public void inicializarPermisosGrupoOpcion() {
		this.isPermisoTodoGrupoOpcion=false;
		this.isPermisoNuevoGrupoOpcion=false;
		this.isPermisoActualizarGrupoOpcion=false;
		this.isPermisoActualizarOriginalGrupoOpcion=false;
		this.isPermisoEliminarGrupoOpcion=false;
		this.isPermisoGuardarCambiosGrupoOpcion=false;
		this.isPermisoConsultaGrupoOpcion=false;
		this.isPermisoBusquedaGrupoOpcion=false;
		this.isPermisoReporteGrupoOpcion=false;		
		this.isPermisoOrdenGrupoOpcion=false;		
		this.isPermisoPaginacionMedioGrupoOpcion=false;		
		this.isPermisoPaginacionAltoGrupoOpcion=false;
		this.isPermisoPaginacionTodoGrupoOpcion=false;
		this.isPermisoCopiarGrupoOpcion=false;		
		this.isPermisoVerFormGrupoOpcion=false;		
		this.isPermisoDuplicarGrupoOpcion=false;		
		this.isPermisoOrdenGrupoOpcion=false;		
	}
	
	public void setPermisosUsuarioGrupoOpcion(Boolean isPermiso) {
		this.isPermisoTodoGrupoOpcion=isPermiso;
		this.isPermisoNuevoGrupoOpcion=isPermiso;
		this.isPermisoActualizarGrupoOpcion=isPermiso;
		this.isPermisoActualizarOriginalGrupoOpcion=isPermiso;
		this.isPermisoEliminarGrupoOpcion=isPermiso;
		this.isPermisoGuardarCambiosGrupoOpcion=isPermiso;
		this.isPermisoConsultaGrupoOpcion=isPermiso;
		this.isPermisoBusquedaGrupoOpcion=isPermiso;
		this.isPermisoReporteGrupoOpcion=isPermiso;
		this.isPermisoOrdenGrupoOpcion=isPermiso;		
		this.isPermisoPaginacionMedioGrupoOpcion=isPermiso;		
		this.isPermisoPaginacionAltoGrupoOpcion=isPermiso;		
		this.isPermisoPaginacionTodoGrupoOpcion=isPermiso;		
		this.isPermisoCopiarGrupoOpcion=isPermiso;		
		this.isPermisoVerFormGrupoOpcion=isPermiso;		
		this.isPermisoDuplicarGrupoOpcion=isPermiso;
		this.isPermisoOrdenGrupoOpcion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGrupoOpcion(Boolean isPermiso) {
		//this.isPermisoTodoGrupoOpcion=isPermiso;
		this.isPermisoNuevoGrupoOpcion=isPermiso;
		this.isPermisoActualizarGrupoOpcion=isPermiso;
		this.isPermisoActualizarOriginalGrupoOpcion=isPermiso;
		this.isPermisoEliminarGrupoOpcion=isPermiso;
		this.isPermisoGuardarCambiosGrupoOpcion=isPermiso;
		//this.isPermisoConsultaGrupoOpcion=isPermiso;
		//this.isPermisoBusquedaGrupoOpcion=isPermiso;
		//this.isPermisoReporteGrupoOpcion=isPermiso;
		//this.isPermisoOrdenGrupoOpcion=isPermiso;		
		//this.isPermisoPaginacionMedioGrupoOpcion=isPermiso;		
		//this.isPermisoPaginacionAltoGrupoOpcion=isPermiso;		
		//this.isPermisoPaginacionTodoGrupoOpcion=isPermiso;		
		//this.isPermisoCopiarGrupoOpcion=isPermiso;		
		//this.isPermisoDuplicarGrupoOpcion=isPermiso;
		//this.isPermisoOrdenGrupoOpcion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGrupoOpcionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(UsuarioOpcionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(OpcionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PerfilOpcionConstantesFunciones.SNOMBREOPCION);
		
		if(GrupoOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosUsuarioOpcion=false;
		this.isTienePermisosUsuarioOpcion=this.verificarGetPermisosUsuarioOpcionGrupoOpcionClaseRelacionada(this.opcionsRelacionadas,UsuarioOpcionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosOpcion=false;
		this.isTienePermisosOpcion=this.verificarGetPermisosUsuarioOpcionGrupoOpcionClaseRelacionada(this.opcionsRelacionadas,OpcionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPerfilOpcion=false;
		this.isTienePermisosPerfilOpcion=this.verificarGetPermisosUsuarioOpcionGrupoOpcionClaseRelacionada(this.opcionsRelacionadas,PerfilOpcionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebGrupoOpcion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGrupoOpcionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosUsuarioOpcion=conPermiso;
		this.isTienePermisosOpcion=conPermiso;
		this.isTienePermisosPerfilOpcion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioGrupoOpcionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGrupoOpcionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGrupoOpcionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosUsuarioOpcion && this.jInternalFrameDetalleFormGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.remove(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosOpcion && this.jInternalFrameDetalleFormGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.remove(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPerfilOpcion && this.jInternalFrameDetalleFormGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.remove(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioGrupoOpcion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GrupoOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GrupoOpcionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGrupoOpcion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGrupoOpcion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGrupoOpcion=this.isPermisoActualizarGrupoOpcion;
			this.isPermisoEliminarGrupoOpcion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGrupoOpcion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGrupoOpcion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGrupoOpcion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGrupoOpcion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGrupoOpcion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoOpcion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGrupoOpcion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGrupoOpcion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGrupoOpcion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGrupoOpcion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGrupoOpcion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGrupoOpcion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoOpcion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGrupoOpcion.setToolTipText(this.jTableDatosGrupoOpcion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGrupoOpcion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGrupoOpcion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GrupoOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GrupoOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGrupoOpcion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosUsuarioOpcion && this.grupoopcionConstantesFunciones.mostrarUsuarioOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Usuario Opcion");
			reporte.setsDescripcion("Usuario Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosOpcion && this.grupoopcionConstantesFunciones.mostrarOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Opcion");
			reporte.setsDescripcion("Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPerfilOpcion && this.grupoopcionConstantesFunciones.mostrarPerfilOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Perfil Opcion");
			reporte.setsDescripcion("Perfil Opcion");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyGrupoOpcionListas()throws Exception {
		try	{						
			
				this.modulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGrupoOpcionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GrupoOpcionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyGrupoOpcionListas(false);
			} else {
			
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
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

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyGrupoOpcionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			GrupoOpcionParameterReturnGeneral grupoopcionReturnGeneral=new GrupoOpcionParameterReturnGeneral();
						
			


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.grupoopcionConstantesFunciones.cargarid_moduloGrupoOpcion)
					 || (this.esRecargarFks && this.grupoopcionConstantesFunciones.cargarid_moduloGrupoOpcion)) {

					if(!this.grupoopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+grupoopcionSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				grupoopcionReturnGeneral=grupoopcionLogic.cargarCombosLoteForeignKeyGrupoOpcion(finalQueryGlobalModulo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=grupoopcionReturnGeneral.getmodulosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyGrupoOpcion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {
			if(this.grupoopcionSessionBean==null) {
				this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
			}

			if(!this.grupoopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
	
	public void initActionsCombosTodosForeignKeyGrupoOpcion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGrupoOpcion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGrupoOpcion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoOpcion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGrupoOpcion(GrupoOpcion grupoopcion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGrupoOpcion(GrupoOpcion grupoopcion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGrupoOpcion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoOpcion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGrupoOpcion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGrupoOpcion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGrupoOpcion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGrupoOpcion()throws Exception {
		try {
			

			this.cargarCombosFrameModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGrupoOpcion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGrupoOpcion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public GrupoOpcionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GrupoOpcionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GrupoOpcionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.grupoopcionSessionBean=new GrupoOpcionSessionBean(); 
		this.grupoopcionConstantesFunciones=new GrupoOpcionConstantesFunciones(); 
		this.grupoopcionBean=new GrupoOpcion();//(this.grupoopcionConstantesFunciones); 		
		this.grupoopcionReturnGeneral=new GrupoOpcionParameterReturnGeneral(); 
		
		this.grupoopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GrupoOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GrupoOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GrupoOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGrupoOpcion(true);
			
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
			
			this.grupoopcionConstantesFunciones=new GrupoOpcionConstantesFunciones(); 
			this.grupoopcionBean=new GrupoOpcion();//this.grupoopcionConstantesFunciones); 			
			this.grupoopcionReturnGeneral=new GrupoOpcionParameterReturnGeneral(); 
		
			GrupoOpcionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Opcion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.grupoopcion=new GrupoOpcion();
			this.grupoopcions = new ArrayList<GrupoOpcion>();
			this.grupoopcionsAux = new ArrayList<GrupoOpcion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic=new GrupoOpcionLogic();
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}
			
			//this.grupoopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.grupoopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGrupoOpcion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoOpcion);	
					}
					
					if(this.jInternalFrameImportacionGrupoOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoOpcion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGrupoOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGrupoOpcion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoOpcion);
				this.jInternalFrameDetalleFormGrupoOpcion.setVisible(false);
				this.jInternalFrameDetalleFormGrupoOpcion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoOpcion);
					this.jInternalFrameReporteDinamicoGrupoOpcion.setVisible(false);
					this.jInternalFrameReporteDinamicoGrupoOpcion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGrupoOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGrupoOpcion);
					this.jInternalFrameImportacionGrupoOpcion.setVisible(false);
					this.jInternalFrameImportacionGrupoOpcion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGrupoOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGrupoOpcion);
					this.jInternalFrameOrderByGrupoOpcion.setVisible(false);
					this.jInternalFrameOrderByGrupoOpcion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGrupoOpcionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GrupoOpcionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.grupoopcionReturnGeneral=new GrupoOpcionParameterReturnGeneral();
			
			this.grupoopcionParameterGeneral=new GrupoOpcionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.grupoopcionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GrupoOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(UsuarioOpcionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(OpcionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PerfilOpcionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoOpcionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupoopcionSessionBean.getEsGuardarRelacionado(),this.grupoopcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoOpcionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupoopcionSessionBean.getEsGuardarRelacionado(),this.grupoopcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGrupoOpcion=false;
			this.isVisibilidadCeldaDuplicarGrupoOpcion=true;
			this.isVisibilidadCeldaCopiarGrupoOpcion=true;
			this.isVisibilidadCeldaVerFormGrupoOpcion=true;
			this.isVisibilidadCeldaOrdenGrupoOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
			this.isVisibilidadCeldaModificarGrupoOpcion=false;
			this.isVisibilidadCeldaActualizarGrupoOpcion=false;
			this.isVisibilidadCeldaEliminarGrupoOpcion=false;
			this.isVisibilidadCeldaCancelarGrupoOpcion=false;
			this.isVisibilidadCeldaGuardarGrupoOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;
			
			
			this.isVisibilidadBusquedaIdModuloPorNombre=true;
			this.isVisibilidadFK_IdModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGrupoOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGrupoOpcion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGrupoOpcion(false);
			
			this.setPermisosUsuarioGrupoOpcion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoopcionSessionBean.getEsGuardarRelacionado() 
				|| (this.grupoopcionSessionBean.getEsGuardarRelacionado() && this.grupoopcionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGrupoOpcionClasesRelacionadas();
			}
			
			if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGrupoOpcionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGrupoOpcion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGrupoOpcion();
			}
			
			if(!this.isPermisoBusquedaGrupoOpcion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioGrupoOpcion,this.isPermisoPaginacionMedioGrupoOpcion,this.isPermisoPaginacionTodoGrupoOpcion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GrupoOpcionConstantesFunciones.getTiposSeleccionarGrupoOpcion());
				
				this.tiposColumnasSelect=GrupoOpcionConstantesFunciones.getTiposSeleccionarGrupoOpcion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectGrupoOpcion();				
				//this.tiposRelacionesSelect=GrupoOpcionConstantesFunciones.getTiposRelacionesGrupoOpcion(true);
				
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
			//if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGrupoOpcion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioGrupoOpcion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioGrupoOpcion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoOpcion() ;
			
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
			
			
			this.usuarioopcionLogic=new UsuarioOpcionLogic();
			this.opcionLogic=new OpcionLogic();
			this.perfilopcionLogic=new PerfilOpcionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.moduloLogic=new ModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				grupoopcionImplementable= (GrupoOpcionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoOpcionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				grupoopcionImplementableHome= (GrupoOpcionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoOpcionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.grupoopcions= new ArrayList<GrupoOpcion>();
			this.grupoopcionsEliminados= new ArrayList<GrupoOpcion>();
						
			this.isEsNuevoGrupoOpcion=false;
			this.esParaAccionDesdeFormularioGrupoOpcion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGrupoOpcion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGrupoOpcion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GrupoOpcionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GrupoOpcionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGrupoOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGrupoOpcion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGrupoOpcion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGrupoOpcion();
			}
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGrupoOpcion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGrupoOpcion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGrupoOpcion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGrupoOpcion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GrupoOpcion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGrupoOpcion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(OpcionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(OpcionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGrupoOpcion")) {
				iIndex=this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();	
				
				

				if(sTitle.equals("Opciones")) {
					if(!OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGrupoOpcion();

						this.cargarParteTabPanelRelacionadaOpcion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Perfil Opciones")) {
					if(!PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGrupoOpcion();

						this.cargarParteTabPanelRelacionadaPerfilOpcion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Usuario Opciones")) {
					if(!UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGrupoOpcion();

						this.cargarParteTabPanelRelacionadaUsuarioOpcion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGrupoOpcion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGrupoOpcion.cargarSessionConBeanSwingJInternalFrameOpcion(false,true,iIndex);
		this.jButtonOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaOpcion();

		//this.jTabbedPaneRelacionesGrupoOpcion.updateUI();
		//this.jTabbedPaneRelacionesGrupoOpcion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGrupoOpcion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPerfilOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGrupoOpcion.cargarSessionConBeanSwingJInternalFramePerfilOpcion(false,true,iIndex);
		this.jButtonPerfilOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfilOpcion();

		//this.jTabbedPaneRelacionesGrupoOpcion.updateUI();
		//this.jTabbedPaneRelacionesGrupoOpcion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGrupoOpcion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaUsuarioOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGrupoOpcion.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(false,true,iIndex);
		this.jButtonUsuarioOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaUsuarioOpcion();

		//this.jTabbedPaneRelacionesGrupoOpcion.updateUI();
		//this.jTabbedPaneRelacionesGrupoOpcion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGrupoOpcion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("UsuarioOpcion")) {
				int row=this.jTableDatosGrupoOpcion.getSelectedRow();
				jButtonUsuarioOpcionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Opcion")) {
				int row=this.jTableDatosGrupoOpcion.getSelectedRow();
				jButtonOpcionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PerfilOpcion")) {
				int row=this.jTableDatosGrupoOpcion.getSelectedRow();
				jButtonPerfilOpcionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Usuario Opcion")) {

					if(this.isTienePermisosUsuarioOpcion && this.grupoopcionConstantesFunciones.mostrarUsuarioOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Usuario Opciones"+"("+UsuarioOpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Usuario Opciones");

						if(grupoopcionConstantesFunciones.resaltarUsuarioOpcionGrupoOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(grupoopcionConstantesFunciones.resaltarUsuarioOpcionGrupoOpcion);
						}

						jmenuItem.setEnabled(this.grupoopcionConstantesFunciones.activarUsuarioOpcionGrupoOpcion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"UsuarioOpcion"));

						

						this.jInternalFrameDetalleFormGrupoOpcion.jmenuDetalleGrupoOpcion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Opcion")) {

					if(this.isTienePermisosOpcion && this.grupoopcionConstantesFunciones.mostrarOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Opciones"+"("+OpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Opciones");

						if(grupoopcionConstantesFunciones.resaltarOpcionGrupoOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(grupoopcionConstantesFunciones.resaltarOpcionGrupoOpcion);
						}

						jmenuItem.setEnabled(this.grupoopcionConstantesFunciones.activarOpcionGrupoOpcion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Opcion"));

						

						this.jInternalFrameDetalleFormGrupoOpcion.jmenuDetalleGrupoOpcion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Perfil Opcion")) {

					if(this.isTienePermisosPerfilOpcion && this.grupoopcionConstantesFunciones.mostrarPerfilOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Perfil Opciones"+"("+PerfilOpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Perfil Opciones");

						if(grupoopcionConstantesFunciones.resaltarPerfilOpcionGrupoOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(grupoopcionConstantesFunciones.resaltarPerfilOpcionGrupoOpcion);
						}

						jmenuItem.setEnabled(this.grupoopcionConstantesFunciones.activarPerfilOpcionGrupoOpcion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PerfilOpcion"));

						

						this.jInternalFrameDetalleFormGrupoOpcion.jmenuDetalleGrupoOpcion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyGrupoOpcion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGrupoOpcion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGrupoOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGrupoOpcionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGrupoOpcion();
		
		this.cargarCombosFrameForeignKeyGrupoOpcion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGrupoOpcion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGrupoOpcion();
		}
	}
	
	
	
	public void jButtonNuevoGrupoOpcionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
			
			if(jTableDatosGrupoOpcion.getRowCount()>=1) {
				jTableDatosGrupoOpcion.removeRowSelectionInterval(0, jTableDatosGrupoOpcion.getRowCount()-1);						
			}
			
			this.isEsNuevoGrupoOpcion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGrupoOpcion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGrupoOpcion(true);			
			//this.grupoopcion=new GrupoOpcion();
			//this.grupoopcion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoOpcion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoOpcion() ;
			
			if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoOpcion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.grupoopcion);	
			this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);				
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
			if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GrupoOpcion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGrupoOpcionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGrupoOpcion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGrupoOpcion.getSelectedRows().length;			
			}
			
			grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGrupoOpcion--;			
				//GrupoOpcion grupoopcionAux= new GrupoOpcion();			
				//grupoopcionAux.setId(this.iIdNuevoGrupoOpcion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GrupoOpcion grupoopcionOrigen=new GrupoOpcion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GrupoOpcion grupoopcionOrigen : grupoopcionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							grupoopcionOrigen =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoopcionOrigen =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGrupoOpcion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.grupoopcion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGrupoOpcion(grupoopcionOrigen,this.grupoopcion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupoopcionLogic.getGrupoOpcions().add(this.grupoopcionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupoopcions.add(this.grupoopcionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGrupoOpcion(false);
				
				this.jTableDatosGrupoOpcion.setRowSelectionInterval(this.getIndiceNuevoGrupoOpcion(), this.getIndiceNuevoGrupoOpcion());
				
				int iLastRow =  this.jTableDatosGrupoOpcion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoOpcion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoOpcion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoOpcion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();									
		
			GrupoOpcion grupoopcionOrigen=new GrupoOpcion();
			GrupoOpcion grupoopcionDestino=new GrupoOpcion();
				
			grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGrupoOpcion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || grupoopcionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGrupoOpcion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionOrigen =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupoopcionOrigen =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoopcionDestino =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupoopcionDestino =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				grupoopcionOrigen =grupoopcionsSeleccionados.get(0);
				grupoopcionDestino =grupoopcionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGrupoOpcion(grupoopcionOrigen,grupoopcionDestino,true,false);
				
				grupoopcionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupoopcionDestino,grupoopcionLogic.getGrupoOpcions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoopcionDestino,grupoopcions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGrupoOpcion(false);
				
				//this.jTableDatosGrupoOpcion.setRowSelectionInterval(this.getIndiceNuevoGrupoOpcion(), this.getIndiceNuevoGrupoOpcion());
				
				int iLastRow =  this.jTableDatosGrupoOpcion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoOpcion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoOpcion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoOpcion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGrupoOpcion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGrupoOpcion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGrupoOpcion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGrupoOpcion.setVisible(!isVisible);
			this.jPanelPaginacionGrupoOpcion.setVisible(!isVisible);
			this.jPanelAccionesGrupoOpcion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGrupoOpcion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGrupoOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGrupoOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGrupoOpcion();
			
			this.abrirFrameOrderByGrupoOpcion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGrupoOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGrupoOpcion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoOpcion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGrupoOpcion.isMaximum()) {
					this.jInternalFrameDetalleFormGrupoOpcion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGrupoOpcion.setSize(this.jInternalFrameDetalleFormGrupoOpcion.iWidthFormulario,this.jInternalFrameDetalleFormGrupoOpcion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGrupoOpcion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGrupoOpcion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGrupoOpcion.isMaximum()) {
						this.jInternalFrameDetalleFormGrupoOpcion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGrupoOpcion.jContentPaneDetalleGrupoOpcion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGrupoOpcion.jContentPaneDetalleGrupoOpcion.getWidth(),GrupoOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGrupoOpcion.jContentPaneDetalleGrupoOpcion.getWidth(),GrupoOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGrupoOpcion.jContentPaneDetalleGrupoOpcion.getWidth(),GrupoOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaOpcion();
					}

					if(PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPerfilOpcion();
					}

					if(UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaUsuarioOpcion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGrupoOpcion.setVisible(true);
	        this.jInternalFrameDetalleFormGrupoOpcion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGrupoOpcion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGrupoOpcion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGrupoOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoOpcion,false,this);
				} else {
					this.jInternalFrameOrderByGrupoOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoOpcion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGrupoOpcion);
				this.jInternalFrameOrderByGrupoOpcion.setVisible(false);
				this.jInternalFrameOrderByGrupoOpcion.setSelected(false);
				
				this.jInternalFrameOrderByGrupoOpcion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoOpcion"));
				
				this.inicializarActualizarBindingTablaOrderByGrupoOpcion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGrupoOpcion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGrupoOpcion==null) {
				
				this.jInternalFrameImportacionGrupoOpcion=new ImportacionJInternalFrame(GrupoOpcionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoOpcion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGrupoOpcion);
				this.jInternalFrameImportacionGrupoOpcion.setVisible(false);
				this.jInternalFrameImportacionGrupoOpcion.setSelected(false);


				this.jInternalFrameImportacionGrupoOpcion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoOpcion"));
				this.jInternalFrameImportacionGrupoOpcion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoOpcion"));
				this.jInternalFrameImportacionGrupoOpcion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoOpcion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGrupoOpcion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGrupoOpcion==null) {
				this.jInternalFrameReporteDinamicoGrupoOpcion=new ReporteDinamicoJInternalFrame(GrupoOpcionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoOpcion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoOpcion);
				this.jInternalFrameReporteDinamicoGrupoOpcion.setVisible(false);
				this.jInternalFrameReporteDinamicoGrupoOpcion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGrupoOpcion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoOpcion"));
				this.jInternalFrameReporteDinamicoGrupoOpcion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoOpcion"));
				this.jInternalFrameReporteDinamicoGrupoOpcion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoOpcion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoOpcion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGrupoOpcion.jContentPaneDetalleGrupoOpcion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPerfilOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGrupoOpcion.jContentPaneDetalleGrupoOpcion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaUsuarioOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGrupoOpcion.jContentPaneDetalleGrupoOpcion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleGrupoOpcion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoOpcion);
			
	       	this.jInternalFrameDetalleFormGrupoOpcion.setVisible(false);
	        this.jInternalFrameDetalleFormGrupoOpcion.setSelected(false);
			
			//this.jInternalFrameDetalleFormGrupoOpcion.dispose();
			//this.jInternalFrameDetalleFormGrupoOpcion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGrupoOpcion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGrupoOpcion.setVisible(true);
	        this.jInternalFrameReporteDinamicoGrupoOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGrupoOpcion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGrupoOpcion.setVisible(true);
	        this.jInternalFrameImportacionGrupoOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGrupoOpcion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGrupoOpcion.setVisible(true);
	        this.jInternalFrameOrderByGrupoOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGrupoOpcion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGrupoOpcion.setVisible(false);
	        this.jInternalFrameOrderByGrupoOpcion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGrupoOpcion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGrupoOpcion.setVisible(false);
	        this.jInternalFrameReporteDinamicoGrupoOpcion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGrupoOpcion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGrupoOpcion.setVisible(false);
	        this.jInternalFrameImportacionGrupoOpcion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGrupoOpcion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGrupoOpcion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGrupoOpcion(true);
			//this.isEsNuevoGrupoOpcion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGrupoOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoOpcion(false) ;
			
			if(grupoopcionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado() && UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUsuarioOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado() && OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado() && PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoOpcion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoOpcion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGrupoOpcionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGrupoOpcion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGrupoOpcion(true);
			//this.isEsNuevoGrupoOpcion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.grupoopcion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGrupoOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGrupoOpcion(false) ;
			
			if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoOpcion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoOpcion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGrupoOpcion(false);
			
			//if(!this.isEsNuevoGrupoOpcion) {								
				int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
				
			}
			
			if(this.permiteMantenimiento(this.grupoopcion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGrupoOpcion=true;
					this.inicializarActualizarBindingTablaGrupoOpcion(false);
					this.isEsNuevoGrupoOpcion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGrupoOpcion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGrupoOpcion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoOpcion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoOpcion(false);
				
				this.habilitarDeshabilitarControlesGrupoOpcion(false);
			
												
				
				if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGrupoOpcion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGrupoOpcionActionPerformed(evt,grupoopcionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGrupoOpcion(this.grupoopcion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGrupoOpcion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,grupoopcionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.grupoopcion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				this.grupoopcion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				this.grupoopcion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.grupoopcion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GrupoOpcionModel) this.jTableDatosGrupoOpcion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGrupoOpcion=true;
				this.inicializarActualizarBindingTablaGrupoOpcion(false);
				this.isEsNuevoGrupoOpcion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoOpcion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoOpcion(false);
				
				this.habilitarDeshabilitarControlesGrupoOpcion(false);
				
				
				
				if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGrupoOpcion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGrupoOpcion.getRowCount()>=1) {
				jTableDatosGrupoOpcion.removeRowSelectionInterval(0, jTableDatosGrupoOpcion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGrupoOpcion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGrupoOpcion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoOpcion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoOpcion(false) ;
			
			this.isEsNuevoGrupoOpcion=false;
			
			if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGrupoOpcion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGrupoOpcion(false);
				
				//SI ES MANUAL
				if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGrupoOpcion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGrupoOpcion--;			
			//GrupoOpcion grupoopcionAux= new GrupoOpcion();			
			//grupoopcionAux.setId(this.iIdNuevoGrupoOpcion);
			
			if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGrupoOpcion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
			
			this.grupoopcion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.grupoopcionLogic.getGrupoOpcions().add(this.grupoopcionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.grupoopcions.add(this.grupoopcionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGrupoOpcion(false);
			
			this.jTableDatosGrupoOpcion.setRowSelectionInterval(this.getIndiceNuevoGrupoOpcion(), this.getIndiceNuevoGrupoOpcion());
			
			int iLastRow =  this.jTableDatosGrupoOpcion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGrupoOpcion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGrupoOpcion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGrupoOpcion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGrupoOpcion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoOpcion(false);
			
			//SI ES MANUAL
			if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoOpcion();
			}
			
			//this.abrirFrameTreeGrupoOpcion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Grupo OpcionS ?", "MANTENIMIENTO DE Grupo Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionGrupoOpcion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralGrupoOpcion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.grupoopcionReturnGeneral=grupoopcionLogic.procesarImportacionGrupoOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.grupoopcionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarGrupoOpcionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGrupoOpcion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGrupoOpcion.setFileImportacion(this.jInternalFrameImportacionGrupoOpcion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGrupoOpcion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGrupoOpcion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGrupoOpcion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGrupoOpcion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		

		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GrupoOpcionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GrupoOpcionBaseDesign.jrxml";
			
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
			
			this.generarReporteGrupoOpcions("Todos",grupoopcionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoOpcionConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoOpcionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoOpcionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoOpcionConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoOpcionConstantesFunciones.LABEL_ESTADO:
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
		
		if(this.jInternalFrameReporteDinamicoGrupoOpcion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GrupoOpcionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case GrupoOpcionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case GrupoOpcionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre_principal";
					break;

				case GrupoOpcionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case GrupoOpcionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GrupoOpcionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case GrupoOpcionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case GrupoOpcionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre_principal";
					break;

				case GrupoOpcionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case GrupoOpcionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoOpcionConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case GrupoOpcionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case GrupoOpcionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Principal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_principal");
					break;

				case GrupoOpcionConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case GrupoOpcionConstantesFunciones.LABEL_ESTADO:
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
	
	public void jButtonGenerarExcelReporteDinamicoGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoopcion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GrupoOpcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GrupoOpcionConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(GrupoOpcion grupoopcion:grupoopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoopcion.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoOpcionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(GrupoOpcion grupoopcion:grupoopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoopcion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoOpcionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(GrupoOpcion grupoopcion:grupoopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoopcion.getnombre_principal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoOpcionConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(GrupoOpcion grupoopcion:grupoopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoopcion.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoOpcionConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(GrupoOpcion grupoopcion:grupoopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoopcion.getestado());
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
			//	this.getFilaCabeceraExportarExcelGrupoOpcion(row);				
			//	iRow++;
			//}				
			
			//for(GrupoOpcion grupoopcionAux:grupoopcionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGrupoOpcion(grupoopcionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
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
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoOpcion(false);
			
			//SI ES MANUAL
			if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoOpcion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoOpcion(false);
			
			//SI ES MANUAL
			if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoOpcion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoOpcion(false);
			
			//SI ES MANUAL
			if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoOpcion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGrupoOpcion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGrupoOpcion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGrupoOpcion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGrupoOpcion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGrupoOpcion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGrupoOpcion.setMinimumSize(dimensionMinimum);
		this.jTableDatosGrupoOpcion.setMaximumSize(dimensionMaximum);
		this.jTableDatosGrupoOpcion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGrupoOpcion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGrupoOpcion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGrupoOpcion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGrupoOpcion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGrupoOpcion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGrupoOpcion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoOpcion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGrupoOpcion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGrupoOpcion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGrupoOpcion();
		
		this.inicializarActualizarBindingBotonesManualGrupoOpcion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoOpcion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoOpcion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoOpcion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoOpcion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGrupoOpcion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGrupoOpcion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGrupoOpcion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxPostAccionNuevoGrupoOpcion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxPostAccionSinCerrarGrupoOpcion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxPostAccionSinMensajeGrupoOpcion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGrupoOpcion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGrupoOpcion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGrupoOpcion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
				this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxPostAccionNuevoGrupoOpcion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxPostAccionSinCerrarGrupoOpcion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxPostAccionSinMensajeGrupoOpcion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGrupoOpcion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGrupoOpcion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGrupoOpcion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGrupoOpcion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGrupoOpcion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGrupoOpcion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGrupoOpcion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGrupoOpcion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGrupoOpcion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGrupoOpcion(Boolean esInicializar) throws Exception {
		try	{	
			if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoOpcion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGrupoOpcion() throws Exception {
		try	{
			if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoOpcion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoOpcion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoOpcion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGrupoOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGrupoOpcion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGrupoOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGrupoOpcion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGrupoOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGrupoOpcion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGrupoOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGrupoOpcion.addItem(reporte);
			}
			
			
			if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGrupoOpcion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGrupoOpcion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGrupoOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGrupoOpcion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGrupoOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGrupoOpcion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGrupoOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGrupoOpcion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGrupoOpcion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoOpcion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoOpcion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
				this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
				this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoOpcion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
				
				if(this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoOpcion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGrupoOpcion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoOpcion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoOpcion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGrupoOpcion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.getSelectedItem()!=null){this.id_moduloBusquedaIdModuloPorNombre=((Modulo)this.jComboBoxid_moduloBusquedaIdModuloPorNombreGrupoOpcion.getSelectedItem()).getId();}
		this.nombre_principalBusquedaIdModuloPorNombre=this.jTextAreanombre_principalBusquedaIdModuloPorNombreGrupoOpcion.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGrupoOpcion(Boolean esInicializar) throws Exception {				
		if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoOpcion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGrupoOpcion() throws Exception {
		this.inicializarActualizarBindingTablaGrupoOpcion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGrupoOpcion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGrupoOpcionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGrupoOpcion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=grupoopcionLogic.getGrupoOpcions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=grupoopcions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGrupoOpcion.setModel(new GrupoOpcionModel(this.grupoopcionLogic.getGrupoOpcions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGrupoOpcion.setModel(new GrupoOpcionModel(this.grupoopcions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGrupoOpcion!=null && this.jInternalFrameOrderByGrupoOpcion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGrupoOpcion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGrupoOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO,grupoopcionConstantesFunciones.resaltarSeleccionarGrupoOpcion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GrupoOpcionConstantesFunciones.SCLASSWEBTITULO,grupoopcionConstantesFunciones.resaltarSeleccionarGrupoOpcion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGrupoOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,GrupoOpcionConstantesFunciones.LABEL_ID));

		if(this.grupoopcionConstantesFunciones.mostraridGrupoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoOpcionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.grupoopcionConstantesFunciones.resaltaridGrupoOpcion,this.grupoopcionConstantesFunciones.activaridGrupoOpcion,this,true,"idGrupoOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoopcionConstantesFunciones.resaltaridGrupoOpcion,this.grupoopcionConstantesFunciones.activaridGrupoOpcion,this,true,"idGrupoOpcion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,GrupoOpcionConstantesFunciones.LABEL_IDMODULO));

		if(this.grupoopcionConstantesFunciones.mostrarid_moduloGrupoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoOpcionConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.grupoopcionConstantesFunciones.resaltarid_moduloGrupoOpcion,this,this.grupoopcionConstantesFunciones.activarid_moduloGrupoOpcion));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.grupoopcionConstantesFunciones.resaltarid_moduloGrupoOpcion,this,this.grupoopcionConstantesFunciones.activarid_moduloGrupoOpcion,false,"id_moduloGrupoOpcion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,GrupoOpcionConstantesFunciones.LABEL_CODIGO));

		if(this.grupoopcionConstantesFunciones.mostrarcodigoGrupoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoOpcionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupoopcionConstantesFunciones.resaltarcodigoGrupoOpcion,this.grupoopcionConstantesFunciones.activarcodigoGrupoOpcion,this,true,"codigoGrupoOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoopcionConstantesFunciones.resaltarcodigoGrupoOpcion,this.grupoopcionConstantesFunciones.activarcodigoGrupoOpcion,this,true,"codigoGrupoOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,GrupoOpcionConstantesFunciones.LABEL_NOMBRE));

		if(this.grupoopcionConstantesFunciones.mostrarnombre_principalGrupoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoOpcionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupoopcionConstantesFunciones.resaltarnombre_principalGrupoOpcion,this.grupoopcionConstantesFunciones.activarnombre_principalGrupoOpcion,this,true,"nombre_principalGrupoOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoopcionConstantesFunciones.resaltarnombre_principalGrupoOpcion,this.grupoopcionConstantesFunciones.activarnombre_principalGrupoOpcion,this,true,"nombre_principalGrupoOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,GrupoOpcionConstantesFunciones.LABEL_ORDEN));

		if(this.grupoopcionConstantesFunciones.mostrarordenGrupoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoOpcionConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.grupoopcionConstantesFunciones.resaltarordenGrupoOpcion,this.grupoopcionConstantesFunciones.activarordenGrupoOpcion,this,true,"ordenGrupoOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoopcionConstantesFunciones.resaltarordenGrupoOpcion,this.grupoopcionConstantesFunciones.activarordenGrupoOpcion,this,true,"ordenGrupoOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,GrupoOpcionConstantesFunciones.LABEL_ESTADO));

		if(this.grupoopcionConstantesFunciones.mostrarestadoGrupoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoOpcionConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.grupoopcionConstantesFunciones.resaltarestadoGrupoOpcion,this.grupoopcionConstantesFunciones.activarestadoGrupoOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.grupoopcionConstantesFunciones.resaltarestadoGrupoOpcion,this.grupoopcionConstantesFunciones.activarestadoGrupoOpcion,this,true,"estadoGrupoOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GrupoOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosUsuarioOpcion && this.grupoopcionConstantesFunciones.mostrarUsuarioOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Usuario Opciones");
				tableColumn.setHeaderValue("Usuario Opciones");
				tableColumn.setCellRenderer(new UsuarioOpcionTableCell(grupoopcionConstantesFunciones.resaltarUsuarioOpcionGrupoOpcion,this,this.grupoopcionConstantesFunciones.activarUsuarioOpcionGrupoOpcion));
				tableColumn.setCellEditor(new UsuarioOpcionTableCell(grupoopcionConstantesFunciones.resaltarUsuarioOpcionGrupoOpcion,this,this.grupoopcionConstantesFunciones.activarUsuarioOpcionGrupoOpcion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGrupoOpcion.addColumn(tableColumn);
			}

			if(this.isTienePermisosOpcion && this.grupoopcionConstantesFunciones.mostrarOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Opciones");
				tableColumn.setHeaderValue("Opciones");
				tableColumn.setCellRenderer(new OpcionTableCell(grupoopcionConstantesFunciones.resaltarOpcionGrupoOpcion,this,this.grupoopcionConstantesFunciones.activarOpcionGrupoOpcion));
				tableColumn.setCellEditor(new OpcionTableCell(grupoopcionConstantesFunciones.resaltarOpcionGrupoOpcion,this,this.grupoopcionConstantesFunciones.activarOpcionGrupoOpcion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGrupoOpcion.addColumn(tableColumn);
			}

			if(this.isTienePermisosPerfilOpcion && this.grupoopcionConstantesFunciones.mostrarPerfilOpcionGrupoOpcion && !GrupoOpcionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Perfil Opciones");
				tableColumn.setHeaderValue("Perfil Opciones");
				tableColumn.setCellRenderer(new PerfilOpcionTableCell(grupoopcionConstantesFunciones.resaltarPerfilOpcionGrupoOpcion,this,this.grupoopcionConstantesFunciones.activarPerfilOpcionGrupoOpcion));
				tableColumn.setCellEditor(new PerfilOpcionTableCell(grupoopcionConstantesFunciones.resaltarPerfilOpcionGrupoOpcion,this,this.grupoopcionConstantesFunciones.activarPerfilOpcionGrupoOpcion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGrupoOpcion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupoopcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupoopcionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoOpcion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupoopcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupoopcionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoOpcion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.grupoopcionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.grupoopcionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGrupoOpcion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.grupoopcionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosGrupoOpcion.addColumn(tableColumn);
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
			
			this.jTableDatosGrupoOpcion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.grupoopcionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGrupoOpcion.moveColumn(this.jTableDatosGrupoOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGrupoOpcion.moveColumn(this.jTableDatosGrupoOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.grupoopcionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosGrupoOpcion.moveColumn(this.jTableDatosGrupoOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGrupoOpcion.moveColumn(this.jTableDatosGrupoOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGrupoOpcion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGrupoOpcion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGrupoOpcion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGrupoOpcion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGrupoOpcion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGrupoOpcion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGrupoOpcion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGrupoOpcion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=grupoopcionLogic.getGrupoOpcions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=grupoopcions.size()-1;
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
		//this.jTableDatosGrupoOpcion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGrupoOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGrupoOpcion();
			
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
				
				//this.isEsNuevoGrupoOpcion=false;
					
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
				if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGrupoOpcion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoOpcion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoOpcion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.grupoopcion.getsType().equals("DUPLICADO")
				   || this.grupoopcion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGrupoOpcion=true;
				
				} else {
					this.isEsNuevoGrupoOpcion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
					if(this.grupoopcion.getId()>=0 && !this.grupoopcion.getIsNew()) {						
						this.isEsNuevoGrupoOpcion=false;
						
					} else {
						this.isEsNuevoGrupoOpcion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGrupoOpcion(esRelaciones);						
				
				this.seleccionarGrupoOpcion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.grupoopcion.getId()<0) {
					this.isEsNuevoGrupoOpcion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGrupoOpcion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGrupoOpcion(evt,rowIndex);
				}	
				
				if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GrupoOpcion: " + this.dDif); 
					}
				}								
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGrupoOpcion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.grupoopcion)) {
					if(this.grupoopcion.getId()>0) {
						this.grupoopcion.setIsDeleted(true);
						
						this.grupoopcionsEliminados.add(this.grupoopcion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupoopcionLogic.getGrupoOpcions().remove(this.grupoopcion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupoopcions.remove(this.grupoopcion);				
					}
					
					
					((GrupoOpcionModel) this.jTableDatosGrupoOpcion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoOpcion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGrupoOpcion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGrupoOpcion) {
			
			if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoOpcion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoOpcion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGrupoOpcion(this.grupoopcion);
				}
				
				//ARCHITECTURE
				try {
					

					//Modulo
					if(!this.grupoopcionConstantesFunciones.cargarid_moduloGrupoOpcion || this.grupoopcionConstantesFunciones.event_dependid_moduloGrupoOpcion) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.grupoopcion.getid_modulo());
									//this.inicializarActualizarBindingGrupoOpcion(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(grupoopcion.getModulo()!=null) {
							this.modulosForeignKey.add(grupoopcion.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.grupoopcion.getid_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGrupoOpcion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGrupoOpcion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoOpcion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoOpcion(GrupoOpcion grupoopcion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGrupoOpcion(grupoopcion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoOpcion(GrupoOpcion grupoopcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGrupoOpcion(grupoopcion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGrupoOpcion(grupoopcion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGrupoOpcion(grupoopcion);
	}
	
	public void setVariablesObjetoActualToFormularioGrupoOpcion(GrupoOpcion grupoopcion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.setText(grupoopcion.getId().toString());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldcodigoGrupoOpcion.setText(grupoopcion.getcodigo());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextAreanombre_principalGrupoOpcion.setText(grupoopcion.getnombre_principal());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldordenGrupoOpcion.setText(grupoopcion.getorden().toString());
			this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.setSelected(grupoopcion.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GrupoOpcion grupoopcionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,grupoopcionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GrupoOpcion grupoopcionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				grupoopcionLocal=this.grupoopcion;
			} else {
				grupoopcionLocal=this.grupoopcionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(grupoopcionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGrupoOpcion(grupoopcionLocal,true);
					
					if(grupoopcionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(grupoopcionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(grupoopcionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGrupoOpcion(GrupoOpcion grupoopcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoOpcion(grupoopcion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(grupoopcion);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoOpcion(GrupoOpcion grupoopcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoOpcion(grupoopcion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoOpcion(GrupoOpcion grupoopcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.getText()==null || this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.getText()=="" || this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.getText()=="Id") {
				this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.setText("0");
			}

			if(conColumnasBase) {grupoopcion.setId(Long.parseLong(this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoOpcionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelIdGrupoOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupoopcion.setcodigo(this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldcodigoGrupoOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoOpcionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelcodigoGrupoOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupoopcion.setnombre_principal(this.jInternalFrameDetalleFormGrupoOpcion.jTextAreanombre_principalGrupoOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoOpcionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelnombre_principalGrupoOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupoopcion.setorden(Integer.parseInt(this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldordenGrupoOpcion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoOpcionConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelordenGrupoOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupoopcion.setestado(this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoOpcionConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoOpcion.jLabelestadoGrupoOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoOpcion(GrupoOpcion grupoopcionBean,GrupoOpcion grupoopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGrupoOpcion(GrupoOpcion grupoopcionOrigen,GrupoOpcion grupoopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupoopcionOrigen.getId()!=null && !grupoopcionOrigen.getId().equals(0L))) {grupoopcion.setId(grupoopcionOrigen.getId());}}
			if(conDefault || (!conDefault && grupoopcionOrigen.getcodigo()!=null && !grupoopcionOrigen.getcodigo().equals(""))) {grupoopcion.setcodigo(grupoopcionOrigen.getcodigo());}
			if(conDefault || (!conDefault && grupoopcionOrigen.getnombre_principal()!=null && !grupoopcionOrigen.getnombre_principal().equals(""))) {grupoopcion.setnombre_principal(grupoopcionOrigen.getnombre_principal());}
			if(conDefault || (!conDefault && grupoopcionOrigen.getorden()!=null && !grupoopcionOrigen.getorden().equals(0))) {grupoopcion.setorden(grupoopcionOrigen.getorden());}
			if(conDefault || (!conDefault && grupoopcionOrigen.getestado()!=null && !grupoopcionOrigen.getestado().equals(false))) {grupoopcion.setestado(grupoopcionOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoOpcion(GrupoOpcion grupoopcion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.setText(grupoopcion.getId().toString());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldcodigoGrupoOpcion.setText(grupoopcion.getcodigo());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextAreanombre_principalGrupoOpcion.setText(grupoopcion.getnombre_principal());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldordenGrupoOpcion.setText(grupoopcion.getorden().toString());
			this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.setSelected(grupoopcion.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoOpcion(GrupoOpcionBean grupoopcionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.setText(grupoopcionBean.getId().toString());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldcodigoGrupoOpcion.setText(grupoopcionBean.getcodigo());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextAreanombre_principalGrupoOpcion.setText(grupoopcionBean.getnombre_principal());
			this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldordenGrupoOpcion.setText(grupoopcionBean.getorden().toString());
			this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.setSelected(grupoopcionBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGrupoOpcion(GrupoOpcionParameterReturnGeneral grupoopcionReturnGeneral,GrupoOpcionBean grupoopcionBean,Boolean conDefault) throws Exception { 
		try {
			GrupoOpcion grupoopcionLocal=new GrupoOpcion();
			
			grupoopcionLocal=grupoopcionReturnGeneral.getGrupoOpcion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupoopcionLocal.getId()!=null && !grupoopcionLocal.getId().equals(0L))) {grupoopcionBean.setId(grupoopcionLocal.getId());}}
			if(conDefault || (!conDefault && grupoopcionLocal.getcodigo()!=null && !grupoopcionLocal.getcodigo().equals(""))) {grupoopcionBean.setcodigo(grupoopcionLocal.getcodigo());}
			if(conDefault || (!conDefault && grupoopcionLocal.getnombre_principal()!=null && !grupoopcionLocal.getnombre_principal().equals(""))) {grupoopcionBean.setnombre_principal(grupoopcionLocal.getnombre_principal());}
			if(conDefault || (!conDefault && grupoopcionLocal.getorden()!=null && !grupoopcionLocal.getorden().equals(0))) {grupoopcionBean.setorden(grupoopcionLocal.getorden());}
			if(conDefault || (!conDefault && grupoopcionLocal.getestado()!=null && !grupoopcionLocal.getestado().equals(false))) {grupoopcionBean.setestado(grupoopcionLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGrupoOpcionGenerico(Long idGrupoOpcionSeleccionado,JComboBox jComboBoxGrupoOpcion,List<GrupoOpcion> grupoopcionsLocal)throws Exception {
		try {
			GrupoOpcion  grupoopcionTemp=null;

			for(GrupoOpcion grupoopcionAux:grupoopcionsLocal) {
				if(grupoopcionAux.getId()!=null && grupoopcionAux.getId().equals(idGrupoOpcionSeleccionado)) {
					grupoopcionTemp=grupoopcionAux;
					break;
				}
			}

			jComboBoxGrupoOpcion.setSelectedItem(grupoopcionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGrupoOpcionGenerico(JComboBox jComboBoxGrupoOpcion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoOpcion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGrupoOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoOpcion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGrupoOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGrupoOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGrupoOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("UsuarioOpcion")) {
			jButtonUsuarioOpcionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Opcion")) {
			jButtonOpcionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PerfilOpcion")) {
			jButtonPerfilOpcionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoopcion=(GrupoOpcion) grupoopcionLogic.getGrupoOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupoopcion =(GrupoOpcion) grupoopcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!grupoopcion.getIsNew() && !grupoopcion.getIsChanged() && !grupoopcion.getIsDeleted()) {
				sDescripcion=grupoopcion.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=grupoopcion.getmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GrupoOpcion grupoopcionRow=new GrupoOpcion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoopcionRow=(GrupoOpcion) grupoopcionLogic.getGrupoOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupoopcionRow=(GrupoOpcion) grupoopcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonUsuarioOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GrupoOpcion grupoopcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGrupoOpcion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion = (GrupoOpcion)this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.grupoopcion = (GrupoOpcion)this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(grupoopcion!=null) {
						this.grupoopcion = grupoopcion;
					} else {
						this.grupoopcion = new GrupoOpcion();
					}
				}

				if(this.isTienePermisosUsuarioOpcion && this.permiteMantenimiento(this.grupoopcion)) {
					UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFramePopup=new UsuarioOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						usuarioopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFramePopup;
					} else {
						usuarioopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame;
					}

					List<GrupoOpcion> grupoopcions=new ArrayList<GrupoOpcion>();
					grupoopcions.add(this.grupoopcion);
					if(!esRelacionado) {
						//usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setConGuardarRelaciones(false);
						//usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					usuarioopcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGrupoOpcion.cargarUsuarioOpcionBeanSwingJInternalFrame(grupoopcions,this.grupoopcion,usuarioopcionBeanSwingJInternalFrame,/*conInicializar,*/usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getConGuardarRelaciones(),usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado());
					usuarioopcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("no_relacionado");

						usuarioopcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(UsuarioOpcionConstantesFunciones.ITAMANIOFILATABLA + (UsuarioOpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						usuarioopcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGrupoOpcion=(TitledBorder)this.jScrollPanelDatosGrupoOpcion.getBorder();
						TitledBorder titledBorderUsuarioOpcion=(TitledBorder)usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.getBorder();

						titledBorderUsuarioOpcion.setTitle(titledBorderGrupoOpcion.getTitle() + " -> Usuario Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,usuarioopcionBeanSwingJInternalFrame);
						}

						usuarioopcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(usuarioopcionBeanSwingJInternalFrame);

						usuarioopcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.grupoopcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Usuario Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GrupoOpcion grupoopcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGrupoOpcion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion = (GrupoOpcion)this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.grupoopcion = (GrupoOpcion)this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(grupoopcion!=null) {
						this.grupoopcion = grupoopcion;
					} else {
						this.grupoopcion = new GrupoOpcion();
					}
				}

				if(this.isTienePermisosOpcion && this.permiteMantenimiento(this.grupoopcion)) {
					OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFramePopup=new OpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						opcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFramePopup;
					} else {
						opcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame;
					}

					List<GrupoOpcion> grupoopcions=new ArrayList<GrupoOpcion>();
					grupoopcions.add(this.grupoopcion);
					if(!esRelacionado) {
						//opcionBeanSwingJInternalFrame.opcionSessionBean.setConGuardarRelaciones(false);
						//opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					opcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGrupoOpcion.cargarOpcionBeanSwingJInternalFrame(grupoopcions,this.grupoopcion,opcionBeanSwingJInternalFrame,/*conInicializar,*/opcionBeanSwingJInternalFrame.opcionSessionBean.getConGuardarRelaciones(),opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado());
					opcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("no_relacionado");

						opcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(OpcionConstantesFunciones.ITAMANIOFILATABLA + (OpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						opcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGrupoOpcion=(TitledBorder)this.jScrollPanelDatosGrupoOpcion.getBorder();
						TitledBorder titledBorderOpcion=(TitledBorder)opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

						titledBorderOpcion.setTitle(titledBorderGrupoOpcion.getTitle() + " -> Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJInternalFrame);
						}

						opcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(opcionBeanSwingJInternalFrame);

						opcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.grupoopcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPerfilOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GrupoOpcion grupoopcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGrupoOpcion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion = (GrupoOpcion)this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.grupoopcion = (GrupoOpcion)this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(grupoopcion!=null) {
						this.grupoopcion = grupoopcion;
					} else {
						this.grupoopcion = new GrupoOpcion();
					}
				}

				if(this.isTienePermisosPerfilOpcion && this.permiteMantenimiento(this.grupoopcion)) {
					PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFramePopup=new PerfilOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						perfilopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFramePopup;
					} else {
						perfilopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame;
					}

					List<GrupoOpcion> grupoopcions=new ArrayList<GrupoOpcion>();
					grupoopcions.add(this.grupoopcion);
					if(!esRelacionado) {
						//perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setConGuardarRelaciones(false);
						//perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilopcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGrupoOpcion.cargarPerfilOpcionBeanSwingJInternalFrame(grupoopcions,this.grupoopcion,perfilopcionBeanSwingJInternalFrame,/*conInicializar,*/perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getConGuardarRelaciones(),perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado());
					perfilopcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("no_relacionado");

						perfilopcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PerfilOpcionConstantesFunciones.ITAMANIOFILATABLA + (PerfilOpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						perfilopcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGrupoOpcion=(TitledBorder)this.jScrollPanelDatosGrupoOpcion.getBorder();
						TitledBorder titledBorderPerfilOpcion=(TitledBorder)perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.getBorder();

						titledBorderPerfilOpcion.setTitle(titledBorderGrupoOpcion.getTitle() + " -> Perfil Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilopcionBeanSwingJInternalFrame);
						}

						perfilopcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(perfilopcionBeanSwingJInternalFrame);

						perfilopcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.grupoopcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Perfil Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGrupoOpcion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoGrupoOpcion && this.isPermisoNuevoGrupoOpcion));			
			this.jButtonDuplicarGrupoOpcion.setVisible((this.isVisibilidadCeldaDuplicarGrupoOpcion && this.isPermisoDuplicarGrupoOpcion));			
			this.jButtonCopiarGrupoOpcion.setVisible((this.isVisibilidadCeldaCopiarGrupoOpcion && this.isPermisoCopiarGrupoOpcion));
			this.jButtonVerFormGrupoOpcion.setVisible((this.isVisibilidadCeldaVerFormGrupoOpcion && this.isPermisoVerFormGrupoOpcion));
			
			this.jButtonAbrirOrderByGrupoOpcion.setVisible((this.isVisibilidadCeldaOrdenGrupoOpcion && this.isPermisoOrdenGrupoOpcion));			
			
			this.jButtonNuevoRelacionesGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion && this.isPermisoNuevoGrupoOpcion));			
			this.jButtonNuevoGuardarCambiosGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoGrupoOpcion && this.isPermisoNuevoGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));
			
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarGrupoOpcion.setVisible((this.isVisibilidadCeldaModificarGrupoOpcion && this.isPermisoActualizarGrupoOpcion));	
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarGrupoOpcion.setVisible((this.isVisibilidadCeldaActualizarGrupoOpcion && this.isPermisoActualizarGrupoOpcion));	
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarGrupoOpcion.setVisible((this.isVisibilidadCeldaEliminarGrupoOpcion && this.isPermisoEliminarGrupoOpcion));
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarGrupoOpcion.setVisible(this.isVisibilidadCeldaCancelarGrupoOpcion);							
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosGrupoOpcion.setVisible((this.isVisibilidadCeldaGuardarGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));			
			
			}
						
			this.jButtonGuardarCambiosTablaGrupoOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoGrupoOpcion && this.isPermisoNuevoGrupoOpcion));						
			this.jButtonDuplicarToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaDuplicarGrupoOpcion && this.isPermisoDuplicarGrupoOpcion));						
			this.jButtonCopiarToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaCopiarGrupoOpcion && this.isPermisoCopiarGrupoOpcion));			
			this.jButtonVerFormToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaVerFormGrupoOpcion && this.isPermisoVerFormGrupoOpcion));			
			this.jButtonAbrirOrderByToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaOrdenGrupoOpcion && this.isPermisoOrdenGrupoOpcion));
			this.jButtonNuevoRelacionesToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion && this.isPermisoNuevoGrupoOpcion));			
			this.jButtonNuevoGuardarCambiosToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoGrupoOpcion && this.isPermisoNuevoGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));			
			
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaModificarGrupoOpcion && this.isPermisoActualizarGrupoOpcion));	
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaActualizarGrupoOpcion  && this.isPermisoActualizarGrupoOpcion));	
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaEliminarGrupoOpcion && this.isPermisoEliminarGrupoOpcion));
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarToolBarGrupoOpcion.setVisible(this.isVisibilidadCeldaCancelarGrupoOpcion);				
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaGuardarGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGrupoOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoGrupoOpcion && this.isPermisoNuevoGrupoOpcion));			
			this.jMenuItemDuplicarGrupoOpcion.setVisible((this.isVisibilidadCeldaDuplicarGrupoOpcion && this.isPermisoDuplicarGrupoOpcion));			
			this.jMenuItemCopiarGrupoOpcion.setVisible((this.isVisibilidadCeldaCopiarGrupoOpcion && this.isPermisoCopiarGrupoOpcion));			
			this.jMenuItemVerFormGrupoOpcion.setVisible((this.isVisibilidadCeldaVerFormGrupoOpcion && this.isPermisoVerFormGrupoOpcion));			
			this.jMenuItemAbrirOrderByGrupoOpcion.setVisible((this.isVisibilidadCeldaOrdenGrupoOpcion && this.isPermisoOrdenGrupoOpcion));			
			//this.jMenuItemMostrarOcultarGrupoOpcion.setVisible((this.isVisibilidadCeldaOrdenGrupoOpcion && this.isPermisoOrdenGrupoOpcion));
			this.jMenuItemDetalleAbrirOrderByGrupoOpcion.setVisible((this.isVisibilidadCeldaOrdenGrupoOpcion && this.isPermisoOrdenGrupoOpcion));			
			//this.jMenuItemDetalleMostrarOcultarGrupoOpcion.setVisible((this.isVisibilidadCeldaOrdenGrupoOpcion && this.isPermisoOrdenGrupoOpcion));			
			this.jMenuItemNuevoRelacionesGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion && this.isPermisoNuevoGrupoOpcion));			
			this.jMenuItemNuevoGuardarCambiosGrupoOpcion.setVisible((this.isVisibilidadCeldaNuevoGrupoOpcion && this.isPermisoNuevoGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));									
			
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemModificarGrupoOpcion.setVisible((this.isVisibilidadCeldaModificarGrupoOpcion && this.isPermisoActualizarGrupoOpcion));	
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemActualizarGrupoOpcion.setVisible((this.isVisibilidadCeldaActualizarGrupoOpcion && this.isPermisoActualizarGrupoOpcion));	
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemEliminarGrupoOpcion.setVisible((this.isVisibilidadCeldaEliminarGrupoOpcion && this.isPermisoEliminarGrupoOpcion));
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemCancelarGrupoOpcion.setVisible(this.isVisibilidadCeldaCancelarGrupoOpcion);				
			}
			
			this.jMenuItemGuardarCambiosGrupoOpcion.setVisible((this.isVisibilidadCeldaGuardarGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));						
			this.jMenuItemGuardarCambiosTablaGrupoOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGrupoOpcion=this.jButtonNuevoGrupoOpcion.isVisible();
			this.isVisibilidadCeldaDuplicarGrupoOpcion=this.jButtonDuplicarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaCopiarGrupoOpcion=this.jButtonCopiarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaVerFormGrupoOpcion=this.jButtonVerFormGrupoOpcion.isVisible();
			
			this.isVisibilidadCeldaOrdenGrupoOpcion=this.jButtonAbrirOrderByGrupoOpcion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=this.jButtonNuevoRelacionesGrupoOpcion.isVisible();
			this.isVisibilidadCeldaModificarGrupoOpcion=this.jButtonModificarGrupoOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			this.isVisibilidadCeldaActualizarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaEliminarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaCancelarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaGuardarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosGrupoOpcion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=this.jButtonGuardarCambiosTablaGrupoOpcion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGrupoOpcion=this.jButtonNuevoToolBarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=this.jButtonNuevoRelacionesToolBarGrupoOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			this.isVisibilidadCeldaModificarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarToolBarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaActualizarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarToolBarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaEliminarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarToolBarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaCancelarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarToolBarGrupoOpcion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoOpcion=this.jButtonGuardarCambiosToolBarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=this.jButtonGuardarCambiosTablaToolBarGrupoOpcion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGrupoOpcion=this.jMenuItemNuevoGrupoOpcion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=this.jMenuItemNuevoRelacionesGrupoOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			this.isVisibilidadCeldaModificarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemModificarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaActualizarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemActualizarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaEliminarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemEliminarGrupoOpcion.isVisible();
			this.isVisibilidadCeldaCancelarGrupoOpcion=this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemCancelarGrupoOpcion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoOpcion=this.jMenuItemGuardarCambiosGrupoOpcion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=this.jMenuItemGuardarCambiosTablaGrupoOpcion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGrupoOpcion(Boolean esInicializar) {
		if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
				//if(this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoOpcion();
			}
			
			this.inicializarActualizarBindingBotonesManualGrupoOpcion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGrupoOpcion() {
		this.jButtonNuevoGrupoOpcion.setVisible(this.isPermisoNuevoGrupoOpcion);			
		this.jButtonDuplicarGrupoOpcion.setVisible(this.isPermisoDuplicarGrupoOpcion);			
		this.jButtonCopiarGrupoOpcion.setVisible(this.isPermisoCopiarGrupoOpcion);			
		this.jButtonVerFormGrupoOpcion.setVisible(this.isPermisoVerFormGrupoOpcion);			
		
		this.jButtonAbrirOrderByGrupoOpcion.setVisible(this.isPermisoOrdenGrupoOpcion);					
		
		this.jButtonNuevoRelacionesGrupoOpcion.setVisible(this.isPermisoNuevoGrupoOpcion);			
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarGrupoOpcion.setVisible(this.isPermisoActualizarGrupoOpcion);	
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarGrupoOpcion.setVisible(this.isPermisoActualizarGrupoOpcion);	
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarGrupoOpcion.setVisible(this.isPermisoEliminarGrupoOpcion);
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarGrupoOpcion.setVisible(this.isVisibilidadCeldaCancelarGrupoOpcion);						
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosGrupoOpcion.setVisible(this.isPermisoGuardarCambiosGrupoOpcion);							
		}
		
		this.jButtonGuardarCambiosTablaGrupoOpcion.setVisible(this.isPermisoActualizarGrupoOpcion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoOpcion() {
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarGrupoOpcion.setVisible(this.isPermisoActualizarGrupoOpcion);	
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarGrupoOpcion.setVisible(this.isPermisoActualizarGrupoOpcion);	
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarGrupoOpcion.setVisible(this.isPermisoEliminarGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarGrupoOpcion.setVisible(this.isVisibilidadCeldaCancelarGrupoOpcion);							
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosGrupoOpcion.setVisible((this.isVisibilidadCeldaGuardarGrupoOpcion && this.isPermisoGuardarCambiosGrupoOpcion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGrupoOpcion() {
		if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGrupoOpcion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGrupoOpcion() {
	}
	
	public void jTableDatosGrupoOpcionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGrupoOpcion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGrupoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.getgrupoopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoopcion==null) {
						this.grupoopcion = new GrupoOpcion();
					}

					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
				}

				if(this.grupoopcion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.grupoopcion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloGrupoOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebGrupoOpcion(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoOpcion(this.getgrupoopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.grupoopcionLogic.getConnexion());

				if(this.grupoopcion.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.grupoopcion.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoOpcion=(TitledBorder)this.jScrollPanelDatosGrupoOpcion.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderGrupoOpcion.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloGrupoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.getgrupoopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoopcion==null) {
						this.grupoopcion = new GrupoOpcion();
					}

					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
				}

				if(this.grupoopcion.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.grupoopcion.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoGrupoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.getgrupoopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoopcion==null) {
						this.grupoopcion = new GrupoOpcion();
					}

					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
				}

				if(this.grupoopcion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.grupoopcion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_principalGrupoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.getgrupoopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoopcion==null) {
						this.grupoopcion = new GrupoOpcion();
					}

					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
				}

				if(this.grupoopcion.getnombre_principal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_principal like '%"+this.grupoopcion.getnombre_principal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenGrupoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.getgrupoopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoopcion==null) {
						this.grupoopcion = new GrupoOpcion();
					}

					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
				}

				if(this.grupoopcion.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.grupoopcion.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoGrupoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.getgrupoopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoopcion==null) {
						this.grupoopcion = new GrupoOpcion();
					}

					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);
				}

				if(this.grupoopcion.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.grupoopcion.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaIdModuloPorNombreGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoOpcion(false,false);

			this.getGrupoOpcionsBusquedaIdModuloPorNombre();

			this.inicializarActualizarBindingGrupoOpcion(false);

			//if(GrupoOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloGrupoOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoOpcion(false,false);

			this.getGrupoOpcionsFK_IdModulo();

			this.inicializarActualizarBindingGrupoOpcion(false);

			//if(GrupoOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGrupoOpcion() {
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
		

		if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
			this.jInternalFrameDetalleFormGrupoOpcion.setVisible(false);	    			
			this.jInternalFrameDetalleFormGrupoOpcion.dispose();
			this.jInternalFrameDetalleFormGrupoOpcion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
			this.jInternalFrameReporteDinamicoGrupoOpcion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGrupoOpcion.dispose();
			this.jInternalFrameReporteDinamicoGrupoOpcion=null;
		}
		
		if(this.jInternalFrameImportacionGrupoOpcion!=null) {
			this.jInternalFrameImportacionGrupoOpcion.setVisible(false);	    			
			this.jInternalFrameImportacionGrupoOpcion.dispose();
			this.jInternalFrameImportacionGrupoOpcion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGrupoOpcion();
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
			
			if(sTipo.equals("NuevoGrupoOpcion")) {
				jButtonNuevoGrupoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGrupoOpcion")) {
				jButtonDuplicarGrupoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGrupoOpcion")) {
				jButtonCopiarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("VerFormGrupoOpcion")) {
				jButtonVerFormGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGrupoOpcion")) {
				jButtonNuevoGrupoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGrupoOpcion")) {
				jButtonDuplicarGrupoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGrupoOpcion")) {
				jButtonNuevoGrupoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGrupoOpcion")) {
				jButtonDuplicarGrupoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGrupoOpcion")) {
				jButtonNuevoGrupoOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGrupoOpcion")) {
				jButtonNuevoGrupoOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGrupoOpcion")) {
				jButtonNuevoGrupoOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGrupoOpcion")) {
				jButtonModificarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGrupoOpcion")) {
				jButtonModificarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGrupoOpcion")) {
				jButtonModificarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGrupoOpcion")) {
				jButtonActualizarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGrupoOpcion")) {
				jButtonActualizarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGrupoOpcion")) {
				jButtonActualizarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("EliminarGrupoOpcion")) {
				jButtonEliminarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGrupoOpcion")) {
				jButtonEliminarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGrupoOpcion")) {
				jButtonEliminarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("CancelarGrupoOpcion")) {
				jButtonCancelarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGrupoOpcion")) {
				jButtonCancelarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGrupoOpcion")) {
				jButtonCancelarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("CerrarGrupoOpcion")) {
				jButtonCerrarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGrupoOpcion")) {
				jButtonCerrarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGrupoOpcion")) {
				jButtonCerrarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGrupoOpcion")) {
				jButtonMostrarOcultarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGrupoOpcion")) {
				jButtonCancelarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGrupoOpcion")) {
				jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGrupoOpcion")) {
				jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGrupoOpcion")) {
				jButtonCopiarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGrupoOpcion")) {
				jButtonVerFormGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGrupoOpcion")) {
				jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGrupoOpcion")) {
				jButtonCopiarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGrupoOpcion")) {
				jButtonVerFormGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGrupoOpcion")) {
				jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGrupoOpcion")) {
				jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGrupoOpcion")) {
				jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGrupoOpcion")) {
				jButtonRecargarInformacionGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGrupoOpcion")) {
				jButtonRecargarInformacionGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGrupoOpcion")) {
				jButtonRecargarInformacionGrupoOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGrupoOpcion")) {
				jButtonAnterioresGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGrupoOpcion")) {
				jButtonAnterioresGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGrupoOpcion")) {
				jButtonAnterioresGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGrupoOpcion")) {
				jButtonSiguientesGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGrupoOpcion")) {
				jButtonSiguientesGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGrupoOpcion")) {
				jButtonSiguientesGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGrupoOpcion") || sTipo.equals("MenuItemDetalleAbrirOrderByGrupoOpcion")) {
				jButtonAbrirOrderByGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGrupoOpcion") || sTipo.equals("MenuItemDetalleMostrarOcultarGrupoOpcion")) {
				jButtonMostrarOcultarGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoOpcion")) {
				jButtonNuevoGuardarCambiosGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGrupoOpcion")) {
				jButtonNuevoGuardarCambiosGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGrupoOpcion")) {
				jButtonNuevoGuardarCambiosGrupoOpcionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGrupoOpcion")) {
				jButtonCerrarReporteDinamicoGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGrupoOpcion")) {
				jButtonGenerarReporteDinamicoGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGrupoOpcion")) {
				
				jButtonGenerarExcelReporteDinamicoGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGrupoOpcion")) {
				jButtonCerrarImportacionGrupoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGrupoOpcion")) {
				
				jButtonGenerarImportacionGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGrupoOpcion")) {
				
				jButtonAbrirImportacionGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGrupoOpcion")) {
				jComboBoxTiposAccionesGrupoOpcionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGrupoOpcion")) {
				jComboBoxTiposRelacionesGrupoOpcionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGrupoOpcion")) {
				jComboBoxTiposAccionesGrupoOpcionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGrupoOpcion")) {
				
				jComboBoxTiposSeleccionarGrupoOpcionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGrupoOpcion")) {
				jTextFieldValorCampoGeneralGrupoOpcionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGrupoOpcion")) {
				jButtonAbrirOrderByGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGrupoOpcion")) {
				jButtonAbrirOrderByGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGrupoOpcion")) {
				jButtonCerrarOrderByGrupoOpcionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoOpcionBusqueda")) {
				this.jButtonidGrupoOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloGrupoOpcionUpdate")) {
				this.jButtonid_moduloGrupoOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloGrupoOpcionBusqueda")) {
				this.jButtonid_moduloGrupoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoGrupoOpcionBusqueda")) {
				this.jButtoncodigoGrupoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_principalGrupoOpcionBusqueda")) {
				this.jButtonnombre_principalGrupoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenGrupoOpcionBusqueda")) {
				this.jButtonordenGrupoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoGrupoOpcionBusqueda")) {
				this.jButtonestadoGrupoOpcionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaIdModuloPorNombreGrupoOpcion")) {
				this.jButtonBusquedaIdModuloPorNombreGrupoOpcionActionPerformed(evt);
			}
			
			;
			
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGrupoOpcion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoOpcionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				


				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GrupoOpcion grupoopcionLocal=null;
			
			if(!this.getEsControlTabla()) {
				grupoopcionLocal=this.grupoopcion;
			} else {
				grupoopcionLocal=this.grupoopcionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
							
				
				


				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
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
			
			


			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoOpcionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
								
						
				


				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
								
				
				


				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoOpcionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
							
				
				


				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoOpcionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
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
			
			


			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoOpcionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
								
				
				


				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoOpcionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoOpcionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGrupoOpcion")) {
					jCheckBoxSeleccionarTodosGrupoOpcionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGrupoOpcion")) {
					jCheckBoxSeleccionadosGrupoOpcionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGrupoOpcion")) {
					
				}
				
				


				
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
												
				
				


				
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoOpcionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoOpcionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
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
			
			


			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoOpcionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoopcion);
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
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
				
				


				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoOpcion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoopcionAnterior =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGrupoOpcion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGrupoOpcionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGrupoOpcion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.grupoopcion =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.grupoopcion =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.grupoopcion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGrupoOpcion")) {
				
				}
				
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGrupoOpcion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGrupoOpcion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGrupoOpcion")) {
			
			}
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGrupoOpcion();
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
			if(sTipo.equals("NuevoGrupoOpcion")) {
				jButtonNuevoGrupoOpcionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGrupoOpcion")) {
				jButtonDuplicarGrupoOpcionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGrupoOpcion")) {
				jButtonCopiarGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGrupoOpcion")) {
				jButtonVerFormGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGrupoOpcion")) {
				jButtonNuevoGrupoOpcionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGrupoOpcion")) {
				jButtonModificarGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGrupoOpcion")) {
				jButtonActualizarGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGrupoOpcion")) {
				jButtonEliminarGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGrupoOpcion")) {
				jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGrupoOpcion")) {
				jButtonCancelarGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGrupoOpcion")) {
				jButtonCerrarGrupoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGrupoOpcion")) {
				jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoOpcion")) {
				jButtonNuevoGuardarCambiosGrupoOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGrupoOpcion")) {
				jButtonAbrirOrderByGrupoOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGrupoOpcion")) {
				jButtonRecargarInformacionGrupoOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGrupoOpcion")) {
				jButtonAnterioresGrupoOpcionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGrupoOpcion")) {
				jButtonSiguientesGrupoOpcionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoOpcionBusqueda")) {
				this.jButtonidGrupoOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloGrupoOpcionUpdate")) {
				this.jButtonid_moduloGrupoOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloGrupoOpcionBusqueda")) {
				this.jButtonid_moduloGrupoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoGrupoOpcionBusqueda")) {
				this.jButtoncodigoGrupoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_principalGrupoOpcionBusqueda")) {
				this.jButtonnombre_principalGrupoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenGrupoOpcionBusqueda")) {
				this.jButtonordenGrupoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoGrupoOpcionBusqueda")) {
				this.jButtonestadoGrupoOpcionBusquedaActionPerformed(evt);
			}
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGrupoOpcion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGrupoOpcion")) {
				closingInternalFrameGrupoOpcion();
				
			} else if(sTipo.equals("jButtonCancelarGrupoOpcion")) {
				JInternalFrameBase jInternalFrameDetalleFormGrupoOpcion = (JInternalFrameBase)evt.getSource();
	            	
	            GrupoOpcionBeanSwingJInternalFrame jInternalFrameParent=(GrupoOpcionBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoOpcion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGrupoOpcionActionPerformed(null);
			}
			
			GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupoopcion,new Object(),this.grupoopcionParameterGeneral,this.grupoopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGrupoOpcion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGrupoOpcion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGrupoOpcion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.grupoopcion)) {
			if(!esControlTabla) {
				if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);			
				}
				
				if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGrupoOpcion(this.grupoopcion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupoopcionReturnGeneral=grupoopcionLogic.procesarEventosGrupoOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoopcionLogic.getGrupoOpcions(),this.grupoopcion,this.grupoopcionParameterGeneral,this.isEsNuevoGrupoOpcion,classes);//this.grupoopcionLogic.getGrupoOpcion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGrupoOpcion(this.grupoopcionReturnGeneral,this.grupoopcionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGrupoOpcion(classes,this.grupoopcionReturnGeneral,this.grupoopcionBean,false);
					}
						
					if(this.grupoopcionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGrupoOpcion(this.grupoopcionReturnGeneral.getGrupoOpcion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGrupoOpcion(this.grupoopcionReturnGeneral.getGrupoOpcion());	
					}
						
					if(this.grupoopcionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGrupoOpcion(this.grupoopcionReturnGeneral.getGrupoOpcion(),classes);//this.grupoopcionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGrupoOpcion(this.grupoopcion,classes);//this.grupoopcionBean);									
				}
			
				if(GrupoOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGrupoOpcion(this.grupoopcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoOpcion(this.grupoopcion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.grupoopcionAnterior!=null) {
						this.grupoopcion=this.grupoopcionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupoopcionReturnGeneral=grupoopcionLogic.procesarEventosGrupoOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoopcionLogic.getGrupoOpcions(),this.grupoopcion,this.grupoopcionParameterGeneral,this.isEsNuevoGrupoOpcion,classes);//this.grupoopcionLogic.getGrupoOpcion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupoopcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupoopcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.grupoopcionReturnGeneral.getGrupoOpcion(),grupoopcionLogic.getGrupoOpcions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.grupoopcionReturnGeneral.getGrupoOpcion(),this.grupoopcions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGrupoOpcion.repaint();
				
				//((AbstractTableModel) this.jTableDatosGrupoOpcion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGrupoOpcion();
			}
		}
	}
	
	public void actualizarVisualTableDatosGrupoOpcion() throws Exception {
		
		GrupoOpcionModel grupoopcionModel=(GrupoOpcionModel)this.jTableDatosGrupoOpcion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoopcionModel.grupoopcions=this.grupoopcionLogic.getGrupoOpcions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			grupoopcionModel.grupoopcions=this.grupoopcions;
		}
		
		
		((GrupoOpcionModel) this.jTableDatosGrupoOpcion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGrupoOpcion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgrupoopcionAnterior(),this.grupoopcionLogic.getGrupoOpcions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgrupoopcionAnterior(),this.grupoopcions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGrupoOpcion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGrupoOpcion(GrupoOpcion grupoopcion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(grupoopcion.getUsuarioOpcions());
					this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(grupoopcion.getOpcions());
					this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(grupoopcion.getPerfilOpcions());
					this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
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
										
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoopcion,new Object(),generalEntityParameterGeneral,this.grupoopcionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.grupoopcionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GrupoOpcionConstantesFunciones.getClassesRelationshipsOfGrupoOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GrupoOpcionConstantesFunciones.getClassesRelationshipsFromStringsOfGrupoOpcion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGrupoOpcion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GrupoOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoopcion,new Object(),generalEntityParameterGeneral,this.grupoopcionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGrupoOpcion(GrupoOpcionBean grupoopcionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(grupoopcion.getUsuarioOpcions());
					this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(grupoopcion.getOpcions());
					this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(grupoopcion.getPerfilOpcions());
					this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGrupoOpcion(ArrayList<Classe> classes,GrupoOpcionReturnGeneral grupoopcionReturnGeneral,GrupoOpcionBean grupoopcionBean,Boolean conDefault) throws Exception {
		
			this.grupoopcionBean.setUsuarioOpcions(grupoopcionReturnGeneral.getGrupoOpcion().getUsuarioOpcions());
			this.grupoopcionBean.setOpcions(grupoopcionReturnGeneral.getGrupoOpcion().getOpcions());
			this.grupoopcionBean.setPerfilOpcions(grupoopcionReturnGeneral.getGrupoOpcion().getPerfilOpcions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGrupoOpcion(GrupoOpcion grupoopcion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					grupoopcion.setUsuarioOpcions(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					grupoopcion.setOpcions(this.jInternalFrameDetalleFormGrupoOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					grupoopcion.setPerfilOpcions(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.grupoopcion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGrupoOpcion = new GrupoOpcionDetalleFormJInternalFrame(jDesktopPane,this.grupoopcionSessionBean.getConGuardarRelaciones(),this.grupoopcionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.setVisible(false);
		this.jInternalFrameDetalleFormGrupoOpcion.setSelected(false);						
		
		this.jInternalFrameDetalleFormGrupoOpcion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGrupoOpcion.grupoopcionLogic=this.grupoopcionLogic;
		
		this.cargarCombosFrameForeignKeyGrupoOpcion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoOpcion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoOpcion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGrupoOpcion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGrupoOpcion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGrupoOpcion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoOpcion"));
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarGrupoOpcion.addActionListener(new ButtonActionListener(this,"ModificarGrupoOpcion"));

		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarToolBarGrupoOpcion.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoOpcion"));
					
		this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemModificarGrupoOpcion.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarGrupoOpcion.addActionListener (new ButtonActionListener(this,"ActualizarGrupoOpcion"));
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarToolBarGrupoOpcion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoOpcion"));
						
		this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemActualizarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarGrupoOpcion.addActionListener (new ButtonActionListener(this,"EliminarGrupoOpcion"));
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoOpcion"));
								
		this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemEliminarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarGrupoOpcion.addActionListener (new ButtonActionListener(this,"CancelarGrupoOpcion"));
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoOpcion"));
					
		this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemCancelarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoOpcion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemDetalleCerrarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoOpcion"));
		
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoOpcion"));
		
		
		
		this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoOpcion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonidGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonid_moduloGrupoOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloGrupoOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonid_moduloGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtoncodigoGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonnombre_principalGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_principalGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonordenGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ordenGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonestadoGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoGrupoOpcionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoOpcion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGrupoOpcion"));
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoOpcion"));
		}
		
		this.jTableDatosGrupoOpcion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGrupoOpcion"));
		
		this.jTableDatosGrupoOpcion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGrupoOpcion"));
		
		this.jButtonNuevoGrupoOpcion.addActionListener(new ButtonActionListener(this,"NuevoGrupoOpcion"));
		
		this.jButtonDuplicarGrupoOpcion.addActionListener(new ButtonActionListener(this,"DuplicarGrupoOpcion"));
		
		this.jButtonCopiarGrupoOpcion.addActionListener(new ButtonActionListener(this,"CopiarGrupoOpcion"));
		
		this.jButtonVerFormGrupoOpcion.addActionListener(new ButtonActionListener(this,"VerFormGrupoOpcion"));
		
		
		this.jButtonNuevoToolBarGrupoOpcion.addActionListener(new ButtonActionListener(this,"NuevoToolBarGrupoOpcion"));
			
		this.jButtonDuplicarToolBarGrupoOpcion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGrupoOpcion"));
			
		this.jMenuItemNuevoGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGrupoOpcion"));
			
		this.jMenuItemDuplicarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGrupoOpcion"));		
		
		
		this.jButtonNuevoRelacionesGrupoOpcion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGrupoOpcion"));
		
		
		this.jButtonNuevoRelacionesToolBarGrupoOpcion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGrupoOpcion"));
			
		this.jMenuItemNuevoRelacionesGrupoOpcion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGrupoOpcion"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarGrupoOpcion.addActionListener(new ButtonActionListener(this,"ModificarGrupoOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonModificarToolBarGrupoOpcion.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoOpcion"));
			
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemModificarGrupoOpcion.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarGrupoOpcion.addActionListener (new ButtonActionListener(this,"ActualizarGrupoOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonActualizarToolBarGrupoOpcion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoOpcion"));
				
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemActualizarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarGrupoOpcion.addActionListener (new ButtonActionListener(this,"EliminarGrupoOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonEliminarToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoOpcion"));
						
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemEliminarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarGrupoOpcion.addActionListener (new ButtonActionListener(this,"CancelarGrupoOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonCancelarToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoOpcion"));
			
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemCancelarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoOpcion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGrupoOpcion"));		
		
		
		this.jButtonCerrarGrupoOpcion.addActionListener (new ButtonActionListener(this,"CerrarGrupoOpcion"));
		
		
		this.jButtonCerrarToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"CerrarToolBarGrupoOpcion"));
			
		this.jMenuItemCerrarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGrupoOpcion"));
			
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jMenuItemDetalleCerrarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosGrupoOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosGrupoOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoOpcion"));
		}
		
		this.jButtonCopiarToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"CopiarToolBarGrupoOpcion"));
			
		this.jButtonVerFormToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"VerFormToolBarGrupoOpcion"));
		
		this.jMenuItemGuardarCambiosGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGrupoOpcion"));
			
		this.jMenuItemCopiarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGrupoOpcion"));		
		
		this.jMenuItemVerFormGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGrupoOpcion"));		
		
		
		this.jButtonGuardarCambiosTablaGrupoOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoOpcion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGrupoOpcion"));
			
		this.jMenuItemGuardarCambiosTablaGrupoOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoOpcion"));		
		
		
		
		this.jButtonRecargarInformacionGrupoOpcion.addActionListener (new ButtonActionListener(this,"RecargarInformacionGrupoOpcion"));
					
		this.jButtonRecargarInformacionToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGrupoOpcion"));
		
		this.jMenuItemRecargarInformacionGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGrupoOpcion"));		
		
		
		
		this.jButtonAnterioresGrupoOpcion.addActionListener (new ButtonActionListener(this,"AnterioresGrupoOpcion"));
		
		
		this.jButtonAnterioresToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGrupoOpcion"));
		
		this.jMenuItemAnterioresGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGrupoOpcion"));		
		
		
		this.jButtonSiguientesGrupoOpcion.addActionListener (new ButtonActionListener(this,"SiguientesGrupoOpcion"));
		
		
		this.jButtonSiguientesToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGrupoOpcion"));
			
		this.jMenuItemSiguientesGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGrupoOpcion"));
			
		this.jMenuItemAbrirOrderByGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGrupoOpcion"));
			
		this.jMenuItemMostrarOcultarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGrupoOpcion"));
			
		this.jMenuItemDetalleAbrirOrderByGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGrupoOpcion"));
			
		this.jMenuItemDetalleMostarOcultarGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGrupoOpcion"));		
		
		
		this.jButtonNuevoGuardarCambiosGrupoOpcion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGrupoOpcion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGrupoOpcion"));
			
		this.jMenuItemNuevoGuardarCambiosGrupoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGrupoOpcion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGrupoOpcion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGrupoOpcion"));

		this.jCheckBoxSeleccionadosGrupoOpcion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGrupoOpcion"));
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoOpcion"));
		}
		
		
		this.jComboBoxTiposRelacionesGrupoOpcion.addActionListener (new ButtonActionListener(this,"TiposRelacionesGrupoOpcion"));
			
		this.jComboBoxTiposAccionesGrupoOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesGrupoOpcion"));
					
		this.jComboBoxTiposSeleccionarGrupoOpcion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGrupoOpcion"));
			
		this.jTextFieldValorCampoGeneralGrupoOpcion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGrupoOpcion"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonidGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonid_moduloGrupoOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloGrupoOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonid_moduloGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtoncodigoGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonnombre_principalGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_principalGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonordenGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ordenGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonestadoGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoGrupoOpcionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaIdModuloPorNombreGrupoOpcion.addActionListener(new ButtonActionListener(this,"BusquedaIdModuloPorNombreGrupoOpcion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGrupoOpcion!=null) {
				this.jInternalFrameReporteDinamicoGrupoOpcion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoOpcion"));
				this.jInternalFrameReporteDinamicoGrupoOpcion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoOpcion"));
				this.jInternalFrameReporteDinamicoGrupoOpcion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoOpcion"));
			}
			
			//this.jButtonCerrarReporteDinamicoGrupoOpcion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoOpcion"));				
			//this.jButtonGenerarReporteDinamicoGrupoOpcion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoOpcion"));
			//this.jButtonGenerarExcelReporteDinamicoGrupoOpcion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoOpcion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGrupoOpcion!=null) {
				this.jInternalFrameImportacionGrupoOpcion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoOpcion"));
				this.jInternalFrameImportacionGrupoOpcion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoOpcion"));
				this.jInternalFrameImportacionGrupoOpcion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoOpcion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGrupoOpcion.addActionListener (new ButtonActionListener(this,"AbrirOrderByGrupoOpcion"));
			
			this.jButtonAbrirOrderByToolBarGrupoOpcion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGrupoOpcion"));			
			
			if(this.jInternalFrameOrderByGrupoOpcion!=null) {
				this.jInternalFrameOrderByGrupoOpcion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoOpcion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoOpcion.jTabbedPaneRelacionesGrupoOpcion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoOpcion"));
		
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
            		closingInternalFrameGrupoOpcion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGrupoOpcion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGrupoOpcion = (JInternalFrameBase)event.getSource();
	            	
	            GrupoOpcionBeanSwingJInternalFrame jInternalFrameParent=(GrupoOpcionBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoOpcion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGrupoOpcionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGrupoOpcion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGrupoOpcionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGrupoOpcion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGrupoOpcion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGrupoOpcion";
		inputMap = this.jButtonNuevoGrupoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGrupoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoOpcionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGrupoOpcion";
		inputMap = this.jButtonNuevoRelacionesGrupoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGrupoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoOpcionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGrupoOpcion";
		inputMap = this.jButtonModificarGrupoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGrupoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGrupoOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGrupoOpcion";
		inputMap = this.jButtonActualizarGrupoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGrupoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGrupoOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGrupoOpcion";
		inputMap = this.jButtonEliminarGrupoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGrupoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGrupoOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGrupoOpcion";
		inputMap = this.jButtonCancelarGrupoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGrupoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGrupoOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGrupoOpcion";
		inputMap = this.jButtonCerrarGrupoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGrupoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGrupoOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGrupoOpcion";
		inputMap = this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosGrupoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonGuardarCambiosGrupoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGrupoOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGrupoOpcion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGrupoOpcionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGrupoOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGrupoOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGrupoOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGrupoOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGrupoOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGrupoOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonidGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonid_moduloGrupoOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloGrupoOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonid_moduloGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtoncodigoGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"codigoGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonnombre_principalGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_principalGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonordenGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ordenGrupoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoOpcion.jButtonestadoGrupoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoGrupoOpcionBusqueda"));
		
		
		this.jButtonBusquedaIdModuloPorNombreGrupoOpcion.addActionListener(new ButtonActionListener(this,"BusquedaIdModuloPorNombreGrupoOpcion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGrupoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGrupoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGrupoOpcionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGrupoOpcion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGrupoOpcion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
					grupoopcionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoOpcion grupoopcionAux:grupoopcions) {
					grupoopcionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGrupoOpcionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoOpcion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
						grupoopcionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoOpcion grupoopcionAux:grupoopcions) {
						grupoopcionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
					
						if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							grupoopcionAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoOpcion grupoopcionAux:grupoopcions) {
						
						if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							grupoopcionAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoOpcion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoOpcion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoOpcion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGrupoOpcionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoOpcion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGrupoOpcion.getSelectedRows();
			
			GrupoOpcion grupoopcionLocal=new GrupoOpcion();
			
			//this.seleccionarTodosGrupoOpcion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoopcionLocal =(GrupoOpcion) this.grupoopcionLogic.getGrupoOpcions().toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					grupoopcionLocal =(GrupoOpcion) this.grupoopcions.toArray()[this.jTableDatosGrupoOpcion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				grupoopcionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
						grupoopcionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoOpcion grupoopcionAux:grupoopcions) {
						grupoopcionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGrupoOpcion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoOpcion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoOpcion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoOpcion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGrupoOpcionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGrupoOpcionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGrupoOpcionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGrupoOpcion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGrupoOpcion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoOpcion grupoopcionAux:this.grupoopcionLogic.getGrupoOpcions()) {
				
						if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							grupoopcionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							grupoopcionAux.setnombre_principal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							grupoopcionAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoOpcion grupoopcionAux:grupoopcions) {
					
						if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							grupoopcionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							grupoopcionAux.setnombre_principal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							grupoopcionAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoOpcion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGrupoOpcionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGrupoOpcion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGrupoOpcion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGrupoOpcion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGrupoOpcion) {				
					conSplash=true;//false;										
					
					//this.startProcessGrupoOpcion(conSplash);
				
					this.generarReporteGrupoOpcionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGrupoOpcionsSeleccionados();
				//this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoOpcionsSeleccionados(false);
				//this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoOpcionsSeleccionados(true);
				//this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoOpcion();
				
				this.exportarGrupoOpcionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGrupoOpcions();
				//this.importarGrupoOpcions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoOpcion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGrupoOpcionsSeleccionados();
				//this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Grupo Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGrupoOpcion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGrupoOpcion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGrupoOpcion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.setSelectedIndex(0);					
				}	
			} 			
			else if(GrupoOpcionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGrupoOpcion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGrupoOpcion(conSplash);
					
						//this.actualizarParametrosGeneralGrupoOpcion();
						
						this.generarReporteProcesoAccionGrupoOpcionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GrupoOpcionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Grupo OpcionS SELECCIONADOS?", "MANTENIMIENTO DE Grupo Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGrupoOpcion();
				
						this.actualizarParametrosGeneralGrupoOpcion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.grupoopcionReturnGeneral=grupoopcionLogic.procesarAccionGrupoOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.grupoopcionLogic.getGrupoOpcions(),this.grupoopcionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGrupoOpcionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGrupoOpcion();
					
					GrupoOpcionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGrupoOpcionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGrupoOpcion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxTiposAccionesFormularioGrupoOpcion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGrupoOpcion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGrupoOpcionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGrupoOpcion();
			
			if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		
			GrupoOpcion grupoopcion=new GrupoOpcion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGrupoOpcion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGrupoOpcion.getSelectedItem();
			
			
			
			
			grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(grupoopcionsSeleccionados.size()==1) {
				for(GrupoOpcion grupoopcionAux:grupoopcionsSeleccionados) {
					grupoopcion=grupoopcionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Usuario Opcion")) {
					jButtonUsuarioOpcionActionPerformed(null,rowIndex,true,false,grupoopcion);
				}
				else if(this.sTipoRelacion.equals("Opcion")) {
					jButtonOpcionActionPerformed(null,rowIndex,true,false,grupoopcion);
				}
				else if(this.sTipoRelacion.equals("Perfil Opcion")) {
					jButtonPerfilOpcionActionPerformed(null,rowIndex,true,false,grupoopcion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGrupoOpcion();
			
      		//this.finishProcessGrupoOpcion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGrupoOpcionReturnGeneral() throws Exception {
		if(this.grupoopcionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.grupoopcionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.grupoopcionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.grupoopcionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.grupoopcionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.grupoopcionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGrupoOpcion(false);
		}
		
		if(this.grupoopcionReturnGeneral.getConRetornoLista() || this.grupoopcionReturnGeneral.getConRetornoObjeto()) {
			if(this.grupoopcionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupoopcionLogic.setGrupoOpcions(this.grupoopcionReturnGeneral.getGrupoOpcions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.grupoopcionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupoopcionLogic.setGrupoOpcion(this.grupoopcionReturnGeneral.getGrupoOpcion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingGrupoOpcion(false);
		}
	}
	
	public void actualizarParametrosGeneralGrupoOpcion() throws Exception {
		
		
	}
	
	public ArrayList<GrupoOpcion> getGrupoOpcionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGrupoOpcion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GrupoOpcion grupoopcionAux:grupoopcionLogic.getGrupoOpcions()) {
					if(grupoopcionAux.getIsSelected()) {
						grupoopcionsSeleccionados.add(grupoopcionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoOpcion grupoopcionAux:this.grupoopcions) {
					if(grupoopcionAux.getIsSelected()) {
						grupoopcionsSeleccionados.add(grupoopcionAux);				
					}
				}
			}
			
			if(grupoopcionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						grupoopcionsSeleccionados.addAll(this.grupoopcionLogic.getGrupoOpcions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						grupoopcionsSeleccionados.addAll(this.grupoopcions);				
					}
				}
			}
		} else {
			grupoopcionsSeleccionados.add(this.grupoopcion);
		}
		
		return grupoopcionsSeleccionados;
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
	
	public void generarReporteGrupoOpcionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGrupoOpcionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGrupoOpcionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoOpcionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoOpcionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesGrupoOpcionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Grupo Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGrupoOpcionsSeleccionados() throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGrupoOpcions("Todos",grupoopcionsSeleccionados);
		
	}	
	
	public void generarReporteNormalGrupoOpcionsSeleccionados() throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGrupoOpcions("Todos",grupoopcionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGrupoOpcionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGrupoOpcions("Todos",grupoopcionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGrupoOpcionsSeleccionados() throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGrupoOpcion();
		
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGrupoOpcion();
		
		
		//this.generarReporteGrupoOpcions("Todos",grupoopcionsSeleccionados ,grupoopcionImplementable,grupoopcionImplementableHome);
	}
	
	public void mostrarImportacionGrupoOpcions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGrupoOpcion();
		
		this.abrirFrameImportacionGrupoOpcion();		
		
			
		//this.generarReporteGrupoOpcions("Todos",grupoopcionsSeleccionados ,grupoopcionImplementable,grupoopcionImplementableHome);
	}
	
	public void importarGrupoOpcions() throws Exception {		
	
	}
	
	public void exportarGrupoOpcionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGrupoOpcionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGrupoOpcionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGrupoOpcionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Grupo Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGrupoOpcionsSeleccionados() throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoopcion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGrupoOpcion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GrupoOpcion grupoopcionAux:grupoopcionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGrupoOpcion(grupoopcionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//grupoopcionAux.setsDetalleGeneralEntityReporte(grupoopcionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGrupoOpcion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GrupoOpcionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoOpcionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoOpcionConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoOpcionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoOpcionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoOpcionConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoOpcionConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGrupoOpcion(GrupoOpcion grupoopcion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=grupoopcion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoopcion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoopcion.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoopcion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoopcion.getnombre_principal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoopcion.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoopcion.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGrupoOpcionsSeleccionados() throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoopcion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GrupoOpcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGrupoOpcion(row);				
				iRow++;
			}				
			
			for(GrupoOpcion grupoopcionAux:grupoopcionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGrupoOpcion(grupoopcionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGrupoOpcionsSeleccionados() throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();		
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoopcion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("grupoopcions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("grupoopcion");
			//elementRoot.appendChild(element);
		
			for(GrupoOpcion grupoopcionAux:grupoopcionsSeleccionados) {
				element = document.createElement("grupoopcion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGrupoOpcion(grupoopcionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGrupoOpcion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoOpcionConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGrupoOpcion(GrupoOpcion grupoopcion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(grupoopcion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoopcion.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoopcion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoopcion.getnombre_principal());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoopcion.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoopcion.getestado());				
	}
	
	public void setFilaDatosExportarXmlGrupoOpcion(GrupoOpcion grupoopcion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GrupoOpcionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(grupoopcion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GrupoOpcionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(grupoopcion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementmodulo_descripcion = document.createElement(GrupoOpcionConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(grupoopcion.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementcodigo = document.createElement(GrupoOpcionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(grupoopcion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_principal = document.createElement(GrupoOpcionConstantesFunciones.NOMBRE);
		elementnombre_principal.appendChild(document.createTextNode(grupoopcion.getnombre_principal().trim()));
		element.appendChild(elementnombre_principal);

		Element elementorden = document.createElement(GrupoOpcionConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(grupoopcion.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementestado = document.createElement(GrupoOpcionConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(grupoopcion.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoGrupoOpcionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GrupoOpcion> grupoopcionsSeleccionados=new ArrayList<GrupoOpcion>();
		
		grupoopcionsSeleccionados=this.getGrupoOpcionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGrupoOpcion(grupoopcionsSeleccionados);
		
		this.generarReporteGrupoOpcions("Todos",grupoopcionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGrupoOpcion(ArrayList<GrupoOpcion> grupoopcionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GrupoOpcion grupoopcionAux:grupoopcionsSeleccionados) {
				grupoopcionAux.setsDetalleGeneralEntityReporte(grupoopcionAux.toString());
			
				if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					grupoopcionAux.setsDescripcionGeneralEntityReporte1(grupoopcionAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					grupoopcionAux.setsDescripcionGeneralEntityReporte1(grupoopcionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					grupoopcionAux.setsDescripcionGeneralEntityReporte1(grupoopcionAux.getnombre_principal());
				}
				 else if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					grupoopcionAux.setsDescripcionGeneralEntityReporte1(grupoopcionAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(GrupoOpcionConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					grupoopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(grupoopcionAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGrupoOpcion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGrupoOpcion=true;
				this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=true;
				this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=true;
			}
			
			this.isVisibilidadCeldaModificarGrupoOpcion=false;
			this.isVisibilidadCeldaActualizarGrupoOpcion=false;
			this.isVisibilidadCeldaEliminarGrupoOpcion=false;
			this.isVisibilidadCeldaCancelarGrupoOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGrupoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;
			this.isVisibilidadCeldaModificarGrupoOpcion=false;
			this.isVisibilidadCeldaActualizarGrupoOpcion=true;
			this.isVisibilidadCeldaEliminarGrupoOpcion=false;
			this.isVisibilidadCeldaCancelarGrupoOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGrupoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;
			this.isVisibilidadCeldaModificarGrupoOpcion=false;
			this.isVisibilidadCeldaActualizarGrupoOpcion=true;
			this.isVisibilidadCeldaEliminarGrupoOpcion=true;
			this.isVisibilidadCeldaCancelarGrupoOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGrupoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;
			this.isVisibilidadCeldaModificarGrupoOpcion=false;
			this.isVisibilidadCeldaActualizarGrupoOpcion=true;
			this.isVisibilidadCeldaEliminarGrupoOpcion=false;
			this.isVisibilidadCeldaCancelarGrupoOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGrupoOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=true;
			this.isVisibilidadCeldaModificarGrupoOpcion=false;
			this.isVisibilidadCeldaActualizarGrupoOpcion=false;
			this.isVisibilidadCeldaEliminarGrupoOpcion=false;
			this.isVisibilidadCeldaCancelarGrupoOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGrupoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;
			this.isVisibilidadCeldaActualizarGrupoOpcion=false;
			this.isVisibilidadCeldaEliminarGrupoOpcion=false;
			this.isVisibilidadCeldaCancelarGrupoOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGrupoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;
			this.isVisibilidadCeldaModificarGrupoOpcion=true;
			this.isVisibilidadCeldaActualizarGrupoOpcion=false;
			this.isVisibilidadCeldaEliminarGrupoOpcion=false;
			this.isVisibilidadCeldaCancelarGrupoOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoOpcion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GrupoOpcionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGrupoOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=true;
		} else {
			this.actualizarEstadoPanelsGrupoOpcion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGrupoOpcion=false;
			//this.isVisibilidadCeldaVerFormGrupoOpcion=false;
			this.isVisibilidadCeldaDuplicarGrupoOpcion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!grupoopcionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
		} else {
			this.isVisibilidadCeldaNuevoGrupoOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(grupoopcionSessionBean.getEsGuardarRelacionado()) {
			if(!grupoopcionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;												
			}
			
			this.jButtonCerrarGrupoOpcion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoOpcion=false;
		}
		
		if(!this.permiteMantenimiento(this.grupoopcion)) {
			this.isVisibilidadCeldaActualizarGrupoOpcion=false;
			this.isVisibilidadCeldaEliminarGrupoOpcion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoOpcion() {
		this.isVisibilidadCeldaNuevoGrupoOpcion=false;
		this.isVisibilidadCeldaGuardarCambiosGrupoOpcion=false;
	}
	
	public void actualizarEstadoPanelsGrupoOpcion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGrupoOpcion!=null) {
				this.jScrollPanelDatosEdicionGrupoOpcion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoOpcion!=null) {
				this.jScrollPanelDatosGrupoOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoOpcion!=null) {
				this.jPanelPaginacionGrupoOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGrupoOpcion!=null) {
				this.jScrollPanelDatosEdicionGrupoOpcion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGrupoOpcion!=null) {
				this.jScrollPanelDatosGrupoOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoOpcion!=null) {
				this.jPanelPaginacionGrupoOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGrupoOpcion!=null) {
				this.jScrollPanelDatosEdicionGrupoOpcion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoOpcion!=null) {
				this.jScrollPanelDatosGrupoOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoOpcion!=null) {
				this.jPanelPaginacionGrupoOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGrupoOpcion!=null) {
				this.jScrollPanelDatosEdicionGrupoOpcion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoOpcion!=null) {
				this.jScrollPanelDatosGrupoOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoOpcion!=null) {
				this.jPanelPaginacionGrupoOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGrupoOpcion!=null) {
				this.jScrollPanelDatosEdicionGrupoOpcion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoOpcion!=null) {
				this.jScrollPanelDatosGrupoOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoOpcion!=null) {
				this.jPanelPaginacionGrupoOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGrupoOpcion!=null) {
				this.jScrollPanelDatosEdicionGrupoOpcion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoOpcion!=null) {
				this.jScrollPanelDatosGrupoOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoOpcion!=null) {
				this.jPanelPaginacionGrupoOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGrupoOpcion!=null) {
				this.jScrollPanelDatosEdicionGrupoOpcion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoOpcion!=null) {
				this.jScrollPanelDatosGrupoOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoOpcion!=null) {
				this.jPanelPaginacionGrupoOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
					this.jTabbedPaneBusquedasGrupoOpcion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.grupoopcionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoOpcion!=null) {
				this.jTabbedPaneBusquedasGrupoOpcion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGrupoOpcion!=null) {
				this.jPanelParametrosReportesGrupoOpcion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaIdModuloPorNombre=isParaModulo;
			if(!this.isVisibilidadBusquedaIdModuloPorNombre) {this.jTabbedPaneBusquedasGrupoOpcion.remove(jPanelBusquedaIdModuloPorNombreGrupoOpcion);}
		}
		
	}
	
	

	public String registrarSesionGrupoOpcionParaUsuarioOpciones() throws Exception {
		Boolean isPaginaPopupUsuarioOpcion=false;

		try {

			if(this.grupoopcionSessionBean==null) {
				this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
			}

			if(this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean==null) {
				this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean.setsPathNavegacionActual(grupoopcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupUsuarioOpcion=this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion(false);
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion(GrupoOpcionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean.setisBusquedaDesdeForeignKeySesionGrupoOpcion(true);
			this.jInternalFrameDetalleFormGrupoOpcion.usuarioopcionSessionBean.setlidGrupoOpcionActual(this.idGrupoOpcionActual);

			grupoopcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion(true);
			grupoopcionSessionBean.setlIdGrupoOpcionActualForeignKey(this.idGrupoOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionGrupoOpcionParaOpciones() throws Exception {
		Boolean isPaginaPopupOpcion=false;

		try {

			if(this.grupoopcionSessionBean==null) {
				this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
			}

			if(this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean==null) {
				this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean=new OpcionSessionBean();
			}

			this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean.setsPathNavegacionActual(grupoopcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+OpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupOpcion=this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeOpcion(true);
			this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion(GrupoOpcionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean.setisBusquedaDesdeForeignKeySesionGrupoOpcion(true);
			this.jInternalFrameDetalleFormGrupoOpcion.opcionSessionBean.setlidGrupoOpcionActual(this.idGrupoOpcionActual);

			grupoopcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion(true);
			grupoopcionSessionBean.setlIdGrupoOpcionActualForeignKey(this.idGrupoOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionGrupoOpcionParaPerfilOpciones() throws Exception {
		Boolean isPaginaPopupPerfilOpcion=false;

		try {

			if(this.grupoopcionSessionBean==null) {
				this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
			}

			if(this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean==null) {
				this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean.setsPathNavegacionActual(grupoopcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfilOpcion=this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfilOpcion(false);
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilOpcion(GrupoOpcionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean.setisBusquedaDesdeForeignKeySesionGrupoOpcion(true);
			this.jInternalFrameDetalleFormGrupoOpcion.perfilopcionSessionBean.setlidGrupoOpcionActual(this.idGrupoOpcionActual);

			grupoopcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoOpcion(true);
			grupoopcionSessionBean.setlIdGrupoOpcionActualForeignKey(this.idGrupoOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//GrupoOpcionSessionBean grupoopcionSessionBean=new GrupoOpcionSessionBean();
		
		if(this.grupoopcionSessionBean==null) {
			this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
		}
		
		this.grupoopcionSessionBean.setsUltimaBusquedaGrupoOpcion(this.getsAccionBusqueda());
		this.grupoopcionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.grupoopcionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaIdModuloPorNombre")) {
			grupoopcionSessionBean.setid_modulo(this.getid_moduloBusquedaIdModuloPorNombre());	
			grupoopcionSessionBean.setnombre_principal(this.getnombre_principalBusquedaIdModuloPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			grupoopcionSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//GrupoOpcionSessionBean grupoopcionSessionBean=new GrupoOpcionSessionBean();
		
		if(this.grupoopcionSessionBean==null) {
			this.grupoopcionSessionBean=new GrupoOpcionSessionBean();
		}
		
		if(this.grupoopcionSessionBean.getsUltimaBusquedaGrupoOpcion()!=null&&!this.grupoopcionSessionBean.getsUltimaBusquedaGrupoOpcion().equals("")) {
			this.setsAccionBusqueda(grupoopcionSessionBean.getsUltimaBusquedaGrupoOpcion());
			this.setiNumeroPaginacion(grupoopcionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(grupoopcionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaIdModuloPorNombre")) {
				this.setid_moduloBusquedaIdModuloPorNombre(grupoopcionSessionBean.getid_modulo());
				grupoopcionSessionBean.setid_modulo(-1L);
				this.setnombre_principalBusquedaIdModuloPorNombre(grupoopcionSessionBean.getnombre_principal());
				grupoopcionSessionBean.setnombre_principal("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(grupoopcionSessionBean.getid_modulo());
				grupoopcionSessionBean.setid_modulo(-1L);
			}
		}
		
		this.grupoopcionSessionBean.setsUltimaBusquedaGrupoOpcion("");
		this.grupoopcionSessionBean.setiNumeroPaginacion(GrupoOpcionConstantesFunciones.INUMEROPAGINACION);
		this.grupoopcionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGrupoOpcion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGrupoOpcion() {
		this.updateBorderResaltarBusquedasFormularioGrupoOpcion();
		this.updateVisibilidadBusquedasFormularioGrupoOpcion();
		this.updateHabilitarBusquedasFormularioGrupoOpcion();
	}
	
	public void updateBorderResaltarBusquedasFormularioGrupoOpcion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGrupoOpcion.getComponents().length>0) {
	

		if(this.grupoopcionConstantesFunciones.resaltarBusquedaIdModuloPorNombreGrupoOpcion!=null) {
			index= this.jTabbedPaneBusquedasGrupoOpcion.indexOfComponent(this.jPanelBusquedaIdModuloPorNombreGrupoOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoOpcion.getComponent(index);
				jPanel.setBorder(this.grupoopcionConstantesFunciones.resaltarBusquedaIdModuloPorNombreGrupoOpcion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGrupoOpcion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGrupoOpcion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoOpcion.indexOfComponent(this.jPanelBusquedaIdModuloPorNombreGrupoOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupoopcionConstantesFunciones.mostrarBusquedaIdModuloPorNombreGrupoOpcion);
			if(!this.grupoopcionConstantesFunciones.mostrarBusquedaIdModuloPorNombreGrupoOpcion && index>-1) {
				this.jTabbedPaneBusquedasGrupoOpcion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGrupoOpcion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGrupoOpcion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoOpcion.indexOfComponent(this.jPanelBusquedaIdModuloPorNombreGrupoOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupoopcionConstantesFunciones.activarBusquedaIdModuloPorNombreGrupoOpcion);
				this.jTabbedPaneBusquedasGrupoOpcion.setEnabledAt(index,this.grupoopcionConstantesFunciones.activarBusquedaIdModuloPorNombreGrupoOpcion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGrupoOpcion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaIdModuloPorNombre")) {
			index= this.jTabbedPaneBusquedasGrupoOpcion.indexOfComponent(this.jPanelBusquedaIdModuloPorNombreGrupoOpcion);

			this.jTabbedPaneBusquedasGrupoOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoOpcion.getComponent(index);

			this.grupoopcionConstantesFunciones.setResaltarBusquedaIdModuloPorNombreGrupoOpcion(resaltar);

			jPanel.setBorder(this.grupoopcionConstantesFunciones.resaltarBusquedaIdModuloPorNombreGrupoOpcion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGrupoOpcion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGrupoOpcion() throws Exception {

		if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGrupoOpcion();
		this.updateVisibilidadResaltarControlesFormularioGrupoOpcion();
		this.updateHabilitarResaltarControlesFormularioGrupoOpcion();
		
	}
	
	public void updateBorderResaltarControlesFormularioGrupoOpcion() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.grupoopcionConstantesFunciones.resaltaridGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion!=null) {this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.setBorder(this.grupoopcionConstantesFunciones.resaltaridGrupoOpcion);}
		if(this.grupoopcionConstantesFunciones.resaltarid_moduloGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion!=null) {this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setBorder(this.grupoopcionConstantesFunciones.resaltarid_moduloGrupoOpcion);}
		if(this.grupoopcionConstantesFunciones.resaltarcodigoGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion!=null) {this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldcodigoGrupoOpcion.setBorder(this.grupoopcionConstantesFunciones.resaltarcodigoGrupoOpcion);}
		if(this.grupoopcionConstantesFunciones.resaltarnombre_principalGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion!=null) {this.jInternalFrameDetalleFormGrupoOpcion.jTextAreanombre_principalGrupoOpcion.setBorder(this.grupoopcionConstantesFunciones.resaltarnombre_principalGrupoOpcion);}
		if(this.grupoopcionConstantesFunciones.resaltarordenGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion!=null) {this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldordenGrupoOpcion.setBorder(this.grupoopcionConstantesFunciones.resaltarordenGrupoOpcion);}
		if(this.grupoopcionConstantesFunciones.resaltarestadoGrupoOpcion!=null && this.jInternalFrameDetalleFormGrupoOpcion!=null) {this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.setBorder(this.grupoopcionConstantesFunciones.resaltarestadoGrupoOpcion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGrupoOpcion() throws Exception {		
		if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
	
		//this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostraridGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jPanelidGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostraridGrupoOpcion);
		//this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarid_moduloGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jPanelid_moduloGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarid_moduloGrupoOpcion);
		//this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldcodigoGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarcodigoGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jPanelcodigoGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarcodigoGrupoOpcion);
		//this.jInternalFrameDetalleFormGrupoOpcion.jTextAreanombre_principalGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarnombre_principalGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jPanelnombre_principalGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarnombre_principalGrupoOpcion);
		//this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldordenGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarordenGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jPanelordenGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarordenGrupoOpcion);
		//this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarestadoGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jPanelestadoGrupoOpcion.setVisible(this.grupoopcionConstantesFunciones.mostrarestadoGrupoOpcion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGrupoOpcion() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoOpcion!=null) {
	
		this.jInternalFrameDetalleFormGrupoOpcion.jLabelidGrupoOpcion.setEnabled(this.grupoopcionConstantesFunciones.activaridGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jComboBoxid_moduloGrupoOpcion.setEnabled(this.grupoopcionConstantesFunciones.activarid_moduloGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldcodigoGrupoOpcion.setEnabled(this.grupoopcionConstantesFunciones.activarcodigoGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jTextAreanombre_principalGrupoOpcion.setEnabled(this.grupoopcionConstantesFunciones.activarnombre_principalGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jTextFieldordenGrupoOpcion.setEnabled(this.grupoopcionConstantesFunciones.activarordenGrupoOpcion);
		this.jInternalFrameDetalleFormGrupoOpcion.jCheckBoxestadoGrupoOpcion.setEnabled(this.grupoopcionConstantesFunciones.activarestadoGrupoOpcion);
		}
	}
	
		
}