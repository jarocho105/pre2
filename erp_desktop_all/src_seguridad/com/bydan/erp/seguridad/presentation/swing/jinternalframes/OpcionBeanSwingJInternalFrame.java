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

import com.bydan.erp.seguridad.util.OpcionConstantesFunciones;
import com.bydan.erp.seguridad.util.OpcionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.OpcionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.OpcionBean;
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
public class OpcionBeanSwingJInternalFrame extends OpcionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(OpcionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Opcion> opcionValidator = new ClassValidator<Opcion>(Opcion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Opcion opcion;	
	public Opcion opcionAux;
	public Opcion opcionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Opcion opcionTotales;
	public Long idOpcionActual;
	public Long iIdNuevoOpcion=0L;
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

	public String sFinalQueryComboTipoTeclaMascara="";

	public List<TipoTeclaMascara> tipoteclamascarasForeignKey;

	public List<TipoTeclaMascara> gettipoteclamascarasForeignKey() {
		return tipoteclamascarasForeignKey;
	}

	public void settipoteclamascarasForeignKey(List<TipoTeclaMascara> tipoteclamascarasForeignKey) {
		this.tipoteclamascarasForeignKey = tipoteclamascarasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoTeclaMascara tipoteclamascaraForeignKey;

	public TipoTeclaMascara gettipoteclamascaraForeignKey() {
		return tipoteclamascaraForeignKey;
	}

	public void settipoteclamascaraForeignKey(TipoTeclaMascara tipoteclamascaraForeignKey) {
		this.tipoteclamascaraForeignKey = tipoteclamascaraForeignKey;
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


	public Boolean isTienePermisosAccion=false;

	public Boolean getIsTienePermisosAccion() {
		return isTienePermisosAccion;
	}

	public void setIsTienePermisosAccion(Boolean isTienePermisosAccion) {
		this.isTienePermisosAccion= isTienePermisosAccion;
	}


	public Boolean isTienePermisosPerfilOpcion=false;

	public Boolean getIsTienePermisosPerfilOpcion() {
		return isTienePermisosPerfilOpcion;
	}

	public void setIsTienePermisosPerfilOpcion(Boolean isTienePermisosPerfilOpcion) {
		this.isTienePermisosPerfilOpcion= isTienePermisosPerfilOpcion;
	}


	public Boolean isTienePermisosCampo=false;

	public Boolean getIsTienePermisosCampo() {
		return isTienePermisosCampo;
	}

	public void setIsTienePermisosCampo(Boolean isTienePermisosCampo) {
		this.isTienePermisosCampo= isTienePermisosCampo;
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
	
	public Boolean isPermisoTodoOpcion;
	public Boolean isPermisoNuevoOpcion;
	public Boolean isPermisoActualizarOpcion;
	public Boolean isPermisoActualizarOriginalOpcion;
	public Boolean isPermisoEliminarOpcion;
	public Boolean isPermisoGuardarCambiosOpcion;
	public Boolean isPermisoConsultaOpcion;
	public Boolean isPermisoBusquedaOpcion;
	public Boolean isPermisoReporteOpcion;
	public Boolean isPermisoPaginacionMedioOpcion;
	public Boolean isPermisoPaginacionAltoOpcion;
	public Boolean isPermisoPaginacionTodoOpcion;
	public Boolean isPermisoCopiarOpcion;
	public Boolean isPermisoVerFormOpcion;
	public Boolean isPermisoDuplicarOpcion;
	public Boolean isPermisoOrdenOpcion;
	
	public List<Opcion> opcionsArbol;
	
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
	
	public OpcionParameterReturnGeneral opcionReturnGeneral;
	public OpcionParameterReturnGeneral opcionParameterGeneral;
	
	

	public UsuarioOpcionLogic usuarioopcionLogic=null;

	public UsuarioOpcionLogic getUsuarioOpcionLogic() {
		return usuarioopcionLogic;
	}

	public void setUsuarioOpcionLogic(UsuarioOpcionLogic usuarioopcionLogic) {
		this.usuarioopcionLogic = usuarioopcionLogic;
	}


	public AccionLogic accionLogic=null;

	public AccionLogic getAccionLogic() {
		return accionLogic;
	}

	public void setAccionLogic(AccionLogic accionLogic) {
		this.accionLogic = accionLogic;
	}


	public PerfilOpcionLogic perfilopcionLogic=null;

	public PerfilOpcionLogic getPerfilOpcionLogic() {
		return perfilopcionLogic;
	}

	public void setPerfilOpcionLogic(PerfilOpcionLogic perfilopcionLogic) {
		this.perfilopcionLogic = perfilopcionLogic;
	}


	public CampoLogic campoLogic=null;

	public CampoLogic getCampoLogic() {
		return campoLogic;
	}

	public void setCampoLogic(CampoLogic campoLogic) {
		this.campoLogic = campoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoOpcion=false;
	public Boolean esParaAccionDesdeFormularioOpcion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected OpcionSessionBeanAdditional opcionSessionBeanAdditional=null;
	
	public OpcionSessionBeanAdditional getOpcionSessionBeanAdditional() {
		return this.opcionSessionBeanAdditional;
	}
	
	public void setOpcionSessionBeanAdditional(OpcionSessionBeanAdditional opcionSessionBeanAdditional) {
		try {
			this.opcionSessionBeanAdditional=opcionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected OpcionBeanSwingJInternalFrameAdditional opcionBeanSwingJInternalFrameAdditional=null;
	//public class OpcionBeanSwingJInternalFrame
	
	public OpcionBeanSwingJInternalFrameAdditional getOpcionBeanSwingJInternalFrameAdditional() {
		return this.opcionBeanSwingJInternalFrameAdditional;
	}
	
	public void setOpcionBeanSwingJInternalFrameAdditional(OpcionBeanSwingJInternalFrameAdditional opcionBeanSwingJInternalFrameAdditional) {
		try {
			this.opcionBeanSwingJInternalFrameAdditional=opcionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public OpcionLogic opcionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Opcion opcionBean;
	public OpcionConstantesFunciones opcionConstantesFunciones;
	//public OpcionParameterReturnGeneral opcionReturnGeneral;
	
	//FK
	
	public SistemaLogic sistemaLogic;
	public ModuloLogic moduloLogic;
	public GrupoOpcionLogic grupoopcionLogic;
	public TipoTeclaMascaraLogic tipoteclamascaraLogic;
	
	//PARAMETROS
	
	
	//public List<Opcion> opcions;	
	//public List<Opcion> opcionsEliminados;
	//public List<Opcion> opcionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoOpcion=false;
	public Boolean isVisibilidadCeldaDuplicarOpcion=true;
	public Boolean isVisibilidadCeldaCopiarOpcion=true;
	public Boolean isVisibilidadCeldaVerFormOpcion=true;
	public Boolean isVisibilidadCeldaOrdenOpcion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesOpcion=false;
	public Boolean isVisibilidadCeldaModificarOpcion=false;
	public Boolean isVisibilidadCeldaActualizarOpcion=false;
	public Boolean isVisibilidadCeldaEliminarOpcion=false;
	public Boolean isVisibilidadCeldaCancelarOpcion=false;
	public Boolean isVisibilidadCeldaGuardarOpcion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosOpcion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdModuloPorIdOpcion=false;
	public Boolean isVisibilidadBusquedaPorIdModuloPorNombre=false;
	public Boolean isVisibilidadBusquedaPorIdSistemaPorModulo=false;
	public Boolean isVisibilidadFK_IdGrupoOpcion=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdOpcion=false;
	public Boolean isVisibilidadFK_IdSistema=false;
	public Boolean isVisibilidadFK_IdTipoTeclaMascara=false;
	
	public Long getiIdNuevoOpcion() {
		return this.iIdNuevoOpcion;
	}

	public void setiIdNuevoOpcion(Long iIdNuevoOpcion) {
		this.iIdNuevoOpcion = iIdNuevoOpcion;
	}
	
	public Long getidOpcionActual() {
		return this.idOpcionActual;
	}

	public void setidOpcionActual(Long idOpcionActual) {
		this.idOpcionActual = idOpcionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Opcion getopcion() {
		return this.opcion;
	}

	public void setopcion(Opcion opcion) {
		this.opcion = opcion;
	}
	
	public Opcion getopcionAux() {
		return this.opcionAux;
	}

	public void setopcionAux(Opcion opcionAux) {
		this.opcionAux = opcionAux;
	}				
	
	public Opcion getopcionAnterior() {
		return this.opcionAnterior;
	}

	public void setopcionAnterior(Opcion opcionAnterior) {
		this.opcionAnterior = opcionAnterior;
	}	
	
	public Opcion getopcionTotales() {
		return this.opcionTotales;
	}

	public void setopcionTotales(Opcion opcionTotales) {
		this.opcionTotales = opcionTotales;
	}	
	
	public Opcion getopcionBean() {
		return this.opcionBean;
	}

	public void setopcionBean(Opcion opcionBean) {
		this.opcionBean = opcionBean;
	}	
	
	public OpcionParameterReturnGeneral getopcionReturnGeneral() {
		return this.opcionReturnGeneral;
	}

	public void setopcionReturnGeneral(OpcionParameterReturnGeneral opcionReturnGeneral) {
		this.opcionReturnGeneral = opcionReturnGeneral;
	}	
	
	
	public Long id_sistemaBusquedaPorIdModuloPorIdOpcion=-1L;

	public Long getid_sistemaBusquedaPorIdModuloPorIdOpcion() {
		return this.id_sistemaBusquedaPorIdModuloPorIdOpcion;
	}

	public void setid_sistemaBusquedaPorIdModuloPorIdOpcion(Long id_sistemaBusquedaPorIdModuloPorIdOpcion) {
		this.id_sistemaBusquedaPorIdModuloPorIdOpcion = id_sistemaBusquedaPorIdModuloPorIdOpcion;
	}

;
	public Long id_moduloBusquedaPorIdModuloPorIdOpcion=-1L;

	public Long getid_moduloBusquedaPorIdModuloPorIdOpcion() {
		return this.id_moduloBusquedaPorIdModuloPorIdOpcion;
	}

	public void setid_moduloBusquedaPorIdModuloPorIdOpcion(Long id_moduloBusquedaPorIdModuloPorIdOpcion) {
		this.id_moduloBusquedaPorIdModuloPorIdOpcion = id_moduloBusquedaPorIdModuloPorIdOpcion;
	}

;
	public Long id_opcionBusquedaPorIdModuloPorIdOpcion=null;

	public Long getid_opcionBusquedaPorIdModuloPorIdOpcion() {
		return this.id_opcionBusquedaPorIdModuloPorIdOpcion;
	}

	public void setid_opcionBusquedaPorIdModuloPorIdOpcion(Long id_opcionBusquedaPorIdModuloPorIdOpcion) {
		this.id_opcionBusquedaPorIdModuloPorIdOpcion = id_opcionBusquedaPorIdModuloPorIdOpcion;
	}

	public Long id_sistemaBusquedaPorIdModuloPorNombre=-1L;

	public Long getid_sistemaBusquedaPorIdModuloPorNombre() {
		return this.id_sistemaBusquedaPorIdModuloPorNombre;
	}

	public void setid_sistemaBusquedaPorIdModuloPorNombre(Long id_sistemaBusquedaPorIdModuloPorNombre) {
		this.id_sistemaBusquedaPorIdModuloPorNombre = id_sistemaBusquedaPorIdModuloPorNombre;
	}

;
	public Long id_moduloBusquedaPorIdModuloPorNombre=-1L;

	public Long getid_moduloBusquedaPorIdModuloPorNombre() {
		return this.id_moduloBusquedaPorIdModuloPorNombre;
	}

	public void setid_moduloBusquedaPorIdModuloPorNombre(Long id_moduloBusquedaPorIdModuloPorNombre) {
		this.id_moduloBusquedaPorIdModuloPorNombre = id_moduloBusquedaPorIdModuloPorNombre;
	}

;
	public String nombreBusquedaPorIdModuloPorNombre="";

	public String getnombreBusquedaPorIdModuloPorNombre() {
		return this.nombreBusquedaPorIdModuloPorNombre;
	}

	public void setnombreBusquedaPorIdModuloPorNombre(String nombreBusquedaPorIdModuloPorNombre) {
		this.nombreBusquedaPorIdModuloPorNombre = nombreBusquedaPorIdModuloPorNombre;
	}

	public Long id_sistemaBusquedaPorIdSistemaPorModulo=-1L;

	public Long getid_sistemaBusquedaPorIdSistemaPorModulo() {
		return this.id_sistemaBusquedaPorIdSistemaPorModulo;
	}

	public void setid_sistemaBusquedaPorIdSistemaPorModulo(Long id_sistemaBusquedaPorIdSistemaPorModulo) {
		this.id_sistemaBusquedaPorIdSistemaPorModulo = id_sistemaBusquedaPorIdSistemaPorModulo;
	}

;
	public Long id_moduloBusquedaPorIdSistemaPorModulo=-1L;

	public Long getid_moduloBusquedaPorIdSistemaPorModulo() {
		return this.id_moduloBusquedaPorIdSistemaPorModulo;
	}

	public void setid_moduloBusquedaPorIdSistemaPorModulo(Long id_moduloBusquedaPorIdSistemaPorModulo) {
		this.id_moduloBusquedaPorIdSistemaPorModulo = id_moduloBusquedaPorIdSistemaPorModulo;
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

	public Long id_opcionFK_IdOpcion=null;

	public Long getid_opcionFK_IdOpcion() {
		return this.id_opcionFK_IdOpcion;
	}

	public void setid_opcionFK_IdOpcion(Long id_opcionFK_IdOpcion) {
		this.id_opcionFK_IdOpcion = id_opcionFK_IdOpcion;
	}

	public Long id_sistemaFK_IdSistema=-1L;

	public Long getid_sistemaFK_IdSistema() {
		return this.id_sistemaFK_IdSistema;
	}

	public void setid_sistemaFK_IdSistema(Long id_sistemaFK_IdSistema) {
		this.id_sistemaFK_IdSistema = id_sistemaFK_IdSistema;
	}

	public Long id_tipo_tecla_mascaraFK_IdTipoTeclaMascara=-1L;

	public Long getid_tipo_tecla_mascaraFK_IdTipoTeclaMascara() {
		return this.id_tipo_tecla_mascaraFK_IdTipoTeclaMascara;
	}

	public void setid_tipo_tecla_mascaraFK_IdTipoTeclaMascara(Long id_tipo_tecla_mascaraFK_IdTipoTeclaMascara) {
		this.id_tipo_tecla_mascaraFK_IdTipoTeclaMascara = id_tipo_tecla_mascaraFK_IdTipoTeclaMascara;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public OpcionLogic getOpcionLogic()	{		
		return opcionLogic;
	}

	public void setOpcionLogic(OpcionLogic opcionLogic) {
		this.opcionLogic = opcionLogic;
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
	
	public Boolean getIsEsNuevoOpcion() {
		return isEsNuevoOpcion;
	}

	public void setIsEsNuevoOpcion(Boolean isEsNuevoOpcion) {
		this.isEsNuevoOpcion = isEsNuevoOpcion;
	}

	public Boolean getEsParaAccionDesdeFormularioOpcion() {
		return esParaAccionDesdeFormularioOpcion;
	}
	
	public void setEsParaAccionDesdeFormularioOpcion(Boolean esParaAccionDesdeFormularioOpcion) {
		this.esParaAccionDesdeFormularioOpcion = esParaAccionDesdeFormularioOpcion;
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

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
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
					sistemaLogic.getEntityWithConnection(opcionSessionBean.getlidSistemaActual());
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

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(opcionSessionBean.getlidModuloActual());
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

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {
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
					grupoopcionLogic.getEntityWithConnection(opcionSessionBean.getlidGrupoOpcionActual());
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

			Opcion opcionNulo = new Opcion();

			OpcionLogic opcionLogic=new OpcionLogic();

			opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionDataAccess().setIsForForeingKeyData(true);

					opcionLogic.getTodosOpcionsWithConnection(sFinalQuery,new Pagination());

					this.opcionsForeignKey=opcionLogic.getOpcions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.opcionsForeignKey.add(0, opcionNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaOpcion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getEntityWithConnection(opcionSessionBean.getlidOpcionActual());
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

	public void cargarCombosTipoTeclaMascarasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoteclamascarasForeignKey=new ArrayList<TipoTeclaMascara>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoTeclaMascaraLogic tipoteclamascaraLogic=new TipoTeclaMascaraLogic();

			tipoteclamascaraLogic.getTipoTeclaMascaraDataAccess().setIsForForeingKeyData(true);

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTeclaMascara()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoteclamascaraLogic.getTipoTeclaMascaraDataAccess().setIsForForeingKeyData(true);

					tipoteclamascaraLogic.getTodosTipoTeclaMascarasWithConnection(sFinalQuery,new Pagination());

					this.tipoteclamascarasForeignKey=tipoteclamascaraLogic.getTipoTeclaMascaras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoTeclaMascara(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoteclamascaraLogic.getEntityWithConnection(opcionSessionBean.getlidTipoTeclaMascaraActual());
					this.tipoteclamascarasForeignKey.add(tipoteclamascaraLogic.getTipoTeclaMascara());
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

					if(this.opcion!=null) {
						this.opcion.setSistema(sistemaTemp);
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setSelectedItem(sistemaTemp);
					}
				} else {
					//jComboBoxid_sistemaOpcion.setSelectedItem(sistemaTemp);
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion!=null) {
						jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion!=null) {
							//jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.getItemCount()>0) {
								jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion!=null) {
						jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion!=null) {
							//jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.getItemCount()>0) {
								jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion!=null) {
						jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion!=null) {
							//jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.getItemCount()>0) {
								jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaFK_IdSistemaOpcion!=null) {
						jComboBoxid_sistemaFK_IdSistemaOpcion.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaFK_IdSistemaOpcion!=null) {
							//jComboBoxid_sistemaFK_IdSistemaOpcion.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaFK_IdSistemaOpcion.getItemCount()>0) {
								jComboBoxid_sistemaFK_IdSistemaOpcion.setSelectedIndex(0);
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
	public void setActualSistemaForeignKeyGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxid_sistemaOpcionGenerico)throws Exception
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
				jComboBoxid_sistemaOpcionGenerico.setSelectedItem(sistemaTemp);
			} else {
				if(jComboBoxid_sistemaOpcionGenerico!=null && jComboBoxid_sistemaOpcionGenerico.getItemCount()>0) {
					jComboBoxid_sistemaOpcionGenerico.setSelectedIndex(0);
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

					if(this.opcion!=null) {
						this.opcion.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloOpcion.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion!=null) {
						jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion!=null) {
							//jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion!=null) {
						jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion!=null) {
							//jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion!=null) {
						jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion!=null) {
							//jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloOpcionGenerico)throws Exception
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
				jComboBoxid_moduloOpcionGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloOpcionGenerico!=null && jComboBoxid_moduloOpcionGenerico.getItemCount()>0) {
					jComboBoxid_moduloOpcionGenerico.setSelectedIndex(0);
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

					if(this.opcion!=null) {
						this.opcion.setGrupoOpcion(grupoopcionTemp);
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setSelectedItem(grupoopcionTemp);
					}
				} else {
					//jComboBoxid_grupo_opcionOpcion.setSelectedItem(grupoopcionTemp);
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setSelectedIndex(0);
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
	public void setActualGrupoOpcionForeignKeyGenerico(Long idGrupoOpcionSeleccionado,JComboBox jComboBoxid_grupo_opcionOpcionGenerico)throws Exception
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
				jComboBoxid_grupo_opcionOpcionGenerico.setSelectedItem(grupoopcionTemp);
			} else {
				if(jComboBoxid_grupo_opcionOpcionGenerico!=null && jComboBoxid_grupo_opcionOpcionGenerico.getItemCount()>0) {
					jComboBoxid_grupo_opcionOpcionGenerico.setSelectedIndex(0);
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

					if(this.opcion!=null) {
						this.opcion.setOpcion(opcionTemp);
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setSelectedItem(opcionTemp);
					}
				} else {
					//jComboBoxid_opcionOpcion.setSelectedItem(opcionTemp);
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(opcionTemp!=null && jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion!=null) {
						jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(opcionTemp);
					} else {
						if(jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion!=null) {
							//jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(opcionTemp);
							if(jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.getItemCount()>0) {
								jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedIndex(0);
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
	public void setActualOpcionForeignKeyGenerico(Long idOpcionSeleccionado,JComboBox jComboBoxid_opcionOpcionGenerico)throws Exception
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
				jComboBoxid_opcionOpcionGenerico.setSelectedItem(opcionTemp);
			} else {
				if(jComboBoxid_opcionOpcionGenerico!=null && jComboBoxid_opcionOpcionGenerico.getItemCount()>0) {
					jComboBoxid_opcionOpcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoTeclaMascaraForeignKey(Long idTipoTeclaMascaraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoTeclaMascara  tipoteclamascaraTemp=null;

			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasForeignKey) {
				if(tipoteclamascaraAux.getId()!=null && tipoteclamascaraAux.getId().equals(idTipoTeclaMascaraSeleccionado)) {
					tipoteclamascaraTemp=tipoteclamascaraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoteclamascaraTemp!=null) {

					if(this.opcion!=null) {
						this.opcion.setTipoTeclaMascara(tipoteclamascaraTemp);
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setSelectedItem(tipoteclamascaraTemp);
					}
				} else {
					//jComboBoxid_tipo_tecla_mascaraOpcion.setSelectedItem(tipoteclamascaraTemp);
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoTeclaMascara") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoteclamascaraTemp!=null && jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion!=null) {
						jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setSelectedItem(tipoteclamascaraTemp);
					} else {
						if(jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion!=null) {
							//jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setSelectedItem(tipoteclamascaraTemp);
							if(jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.getItemCount()>0) {
								jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setSelectedIndex(0);
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

	public String getActualTipoTeclaMascaraForeignKeyDescripcion(Long idTipoTeclaMascaraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoTeclaMascara  tipoteclamascaraTemp=null;

			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasForeignKey) {
				if(tipoteclamascaraAux.getId()!=null && tipoteclamascaraAux.getId().equals(idTipoTeclaMascaraSeleccionado)) {
					tipoteclamascaraTemp=tipoteclamascaraAux;
					break;
				}
			}


			sDescripcion=TipoTeclaMascaraConstantesFunciones.getTipoTeclaMascaraDescripcion(tipoteclamascaraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoTeclaMascaraForeignKeyGenerico(Long idTipoTeclaMascaraSeleccionado,JComboBox jComboBoxid_tipo_tecla_mascaraOpcionGenerico)throws Exception
	{
		try
		{
			TipoTeclaMascara  tipoteclamascaraTemp=null;

			for(TipoTeclaMascara tipoteclamascaraAux:tipoteclamascarasForeignKey) {
				if(tipoteclamascaraAux.getId()!=null && tipoteclamascaraAux.getId().equals(idTipoTeclaMascaraSeleccionado)) {
					tipoteclamascaraTemp=tipoteclamascaraAux;
					break;
				}
			}

			if(tipoteclamascaraTemp!=null) {
				jComboBoxid_tipo_tecla_mascaraOpcionGenerico.setSelectedItem(tipoteclamascaraTemp);
			} else {
				if(jComboBoxid_tipo_tecla_mascaraOpcionGenerico!=null && jComboBoxid_tipo_tecla_mascaraOpcionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_tecla_mascaraOpcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSistemaForeignKey(Opcion opcion,JComboBox jComboBoxid_sistemaOpcionGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaAux=new Sistema();

			if(jComboBoxid_sistemaOpcionGenerico==null) {
				sistemaAux=(Sistema)this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.getSelectedItem();
			} else {
				sistemaAux=(Sistema)jComboBoxid_sistemaOpcionGenerico.getSelectedItem();
			}

			if(sistemaAux!=null && sistemaAux.getId()!=null) {
				opcion.setid_sistema(sistemaAux.getId());
				opcion.setsistema_descripcion(OpcionConstantesFunciones.getSistemaDescripcion(sistemaAux));
				opcion.setSistema(sistemaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(Opcion opcion,JComboBox jComboBoxid_moduloOpcionGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloOpcionGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloOpcionGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				opcion.setid_modulo(moduloAux.getId());
				opcion.setmodulo_descripcion(OpcionConstantesFunciones.getModuloDescripcion(moduloAux));
				opcion.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoOpcionForeignKey(Opcion opcion,JComboBox jComboBoxid_grupo_opcionOpcionGenerico)throws Exception
	{
		try
		{
			GrupoOpcion  grupoopcionAux=new GrupoOpcion();

			if(jComboBoxid_grupo_opcionOpcionGenerico==null) {
				grupoopcionAux=(GrupoOpcion)this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.getSelectedItem();
			} else {
				grupoopcionAux=(GrupoOpcion)jComboBoxid_grupo_opcionOpcionGenerico.getSelectedItem();
			}

			if(grupoopcionAux!=null) {
				opcion.setid_grupo_opcion(grupoopcionAux.getId());
				opcion.setgrupoopcion_descripcion(OpcionConstantesFunciones.getGrupoOpcionDescripcion(grupoopcionAux));
				opcion.setGrupoOpcion(grupoopcionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOpcionForeignKey(Opcion opcion,JComboBox jComboBoxid_opcionOpcionGenerico)throws Exception
	{
		try
		{
			Opcion  opcionAux=new Opcion();

			if(jComboBoxid_opcionOpcionGenerico==null) {
				opcionAux=(Opcion)this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.getSelectedItem();
			} else {
				opcionAux=(Opcion)jComboBoxid_opcionOpcionGenerico.getSelectedItem();
			}

			if(opcionAux!=null) {
				opcion.setid_opcion(opcionAux.getId());
				opcion.setopcion_descripcion(OpcionConstantesFunciones.getOpcionDescripcion(opcionAux));
				opcion.setOpcion(opcionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoTeclaMascaraForeignKey(Opcion opcion,JComboBox jComboBoxid_tipo_tecla_mascaraOpcionGenerico)throws Exception
	{
		try
		{
			TipoTeclaMascara  tipoteclamascaraAux=new TipoTeclaMascara();

			if(jComboBoxid_tipo_tecla_mascaraOpcionGenerico==null) {
				tipoteclamascaraAux=(TipoTeclaMascara)this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.getSelectedItem();
			} else {
				tipoteclamascaraAux=(TipoTeclaMascara)jComboBoxid_tipo_tecla_mascaraOpcionGenerico.getSelectedItem();
			}

			if(tipoteclamascaraAux!=null && tipoteclamascaraAux.getId()!=null) {
				opcion.setid_tipo_tecla_mascara(tipoteclamascaraAux.getId());
				opcion.settipoteclamascara_descripcion(OpcionConstantesFunciones.getTipoTeclaMascaraDescripcion(tipoteclamascaraAux));
				opcion.setTipoTeclaMascara(tipoteclamascaraAux);			}
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

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) { 
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.addItem(sistema);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) { 
					}

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.addItem(sistema);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.addItem(sistema);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.addItem(sistema);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdSistema") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaFK_IdSistemaOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaFK_IdSistemaOpcion.addItem(sistema);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) { 
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) { 
					}

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.addItem(modulo);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.addItem(modulo);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSistemaPorModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.addItem(modulo);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) { 
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.removeAllItems();

							for(GrupoOpcion grupoopcion:this.grupoopcionsForeignKey) {
								this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.addItem(grupoopcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) { 
					}

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) { 
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.addItem(opcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) { 
					}

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdModuloPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.addItem(opcion);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoTeclaMascarasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoTeclaMascara=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) { 
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.removeAllItems();

							for(TipoTeclaMascara tipoteclamascara:this.tipoteclamascarasForeignKey) {
								this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.addItem(tipoteclamascara);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOpcion!=null) { 
					}

					if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoTeclaMascara") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.removeAllItems();

							for(TipoTeclaMascara tipoteclamascara:this.tipoteclamascarasForeignKey) {
								this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.addItem(tipoteclamascara);
							}
						}

						if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameSistemaForeignKey(Sistema sistema,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setSelectedItem(sistema);
						}
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaFK_IdSistemaOpcion.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaFK_IdSistemaOpcion.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setSelectedItem(grupoopcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameOpcionForeignKey(Opcion opcion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setSelectedItem(opcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedItem(opcion);
						} else {
							this.jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoTeclaMascaraForeignKey(TipoTeclaMascara tipoteclamascara,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setSelectedItem(tipoteclamascara);
						}
					} else {
						if(this.jInternalFrameDetalleFormOpcion!=null) {
							this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setSelectedItem(tipoteclamascara);
						} else {
							this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesOpcion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			OpcionConstantesFunciones.refrescarForeignKeysDescripcionesOpcion(this.opcionLogic.getOpcions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			OpcionConstantesFunciones.refrescarForeignKeysDescripcionesOpcion(this.opcions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Sistema.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(GrupoOpcion.class));
		classes.add(new Classe(Opcion.class));
		classes.add(new Classe(TipoTeclaMascara.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//opcionLogic.setOpcions(this.opcions);
			opcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public OpcionParameterReturnGeneral getOpcionParameterGeneral() {
		return this.opcionParameterGeneral;
	}
	
	public void setOpcionParameterGeneral(OpcionParameterReturnGeneral opcionParameterGeneral) {
		this.opcionParameterGeneral = opcionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoOpcion() {
		return isPermisoTodoOpcion;
	}

	public void setIsPermisoTodoOpcion(Boolean isPermisoTodoOpcion) {
		this.isPermisoTodoOpcion = isPermisoTodoOpcion;
	}

	public Boolean getIsPermisoNuevoOpcion() {
		return isPermisoNuevoOpcion;
	}

	public void setIsPermisoNuevoOpcion(Boolean isPermisoNuevoOpcion) {
		this.isPermisoNuevoOpcion = isPermisoNuevoOpcion;
	}

	public Boolean getIsPermisoActualizarOpcion() {
		return isPermisoActualizarOpcion;
	}

	public void setIsPermisoActualizarOpcion(Boolean isPermisoActualizarOpcion) {
		this.isPermisoActualizarOpcion = isPermisoActualizarOpcion;
	}

	public Boolean getIsPermisoEliminarOpcion() {
		return isPermisoEliminarOpcion;
	}

	public void setIsPermisoEliminarOpcion(Boolean isPermisoEliminarOpcion) {
		this.isPermisoEliminarOpcion = isPermisoEliminarOpcion;
	}

	public Boolean getIsPermisoGuardarCambiosOpcion() {
		return isPermisoGuardarCambiosOpcion;
	}

	public void setIsPermisoGuardarCambiosOpcion(Boolean isPermisoGuardarCambiosOpcion) {
		this.isPermisoGuardarCambiosOpcion = isPermisoGuardarCambiosOpcion;
	}
	
	public Boolean getIsPermisoConsultaOpcion() {
		return isPermisoConsultaOpcion;
	}

	public void setIsPermisoConsultaOpcion(Boolean isPermisoConsultaOpcion) {
		this.isPermisoConsultaOpcion = isPermisoConsultaOpcion;
	}

	public Boolean getIsPermisoBusquedaOpcion() {
		return isPermisoBusquedaOpcion;
	}

	public void setIsPermisoBusquedaOpcion(Boolean isPermisoBusquedaOpcion) {
		this.isPermisoBusquedaOpcion = isPermisoBusquedaOpcion;
	}

	public Boolean getIsPermisoReporteOpcion() {
		return isPermisoReporteOpcion;
	}

	public void setIsPermisoReporteOpcion(Boolean isPermisoReporteOpcion) {
		this.isPermisoReporteOpcion = isPermisoReporteOpcion;
	}
	
	public Boolean getIsPermisoPaginacionMedioOpcion() {
		return isPermisoPaginacionMedioOpcion;
	}

	public void setIsPermisoPaginacionMedioOpcion(Boolean isPermisoPaginacionMedioOpcion) {
		this.isPermisoPaginacionMedioOpcion = isPermisoPaginacionMedioOpcion;
	}
	
	public Boolean getIsPermisoPaginacionTodoOpcion() {
		return isPermisoPaginacionTodoOpcion;
	}

	public void setIsPermisoPaginacionTodoOpcion(Boolean isPermisoPaginacionTodoOpcion) {
		this.isPermisoPaginacionTodoOpcion = isPermisoPaginacionTodoOpcion;
	}
	
	public Boolean getIsPermisoPaginacionAltoOpcion() {
		return isPermisoPaginacionAltoOpcion;
	}

	public void setIsPermisoPaginacionAltoOpcion(Boolean isPermisoPaginacionAltoOpcion) {
		this.isPermisoPaginacionAltoOpcion = isPermisoPaginacionAltoOpcion;
	}
	
	public Boolean getIsPermisoCopiarOpcion() {
		return isPermisoCopiarOpcion;
	}

	public void setIsPermisoCopiarOpcion(Boolean isPermisoCopiarOpcion) {
		this.isPermisoCopiarOpcion = isPermisoCopiarOpcion;
	}
	
	public Boolean getIsPermisoVerFormOpcion() {
		return isPermisoVerFormOpcion;
	}

	public void setIsPermisoVerFormOpcion(Boolean isPermisoVerFormOpcion) {
		this.isPermisoVerFormOpcion = isPermisoVerFormOpcion;
	}
	
	public Boolean getIsPermisoDuplicarOpcion() {
		return isPermisoDuplicarOpcion;
	}

	public void setIsPermisoDuplicarOpcion(Boolean isPermisoDuplicarOpcion) {
		this.isPermisoDuplicarOpcion = isPermisoDuplicarOpcion;
	}
	
	public Boolean getIsPermisoOrdenOpcion() {
		return isPermisoOrdenOpcion;
	}

	public void setIsPermisoOrdenOpcion(Boolean isPermisoOrdenOpcion) {
		this.isPermisoOrdenOpcion = isPermisoOrdenOpcion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoOpcion() {
		return isVisibilidadCeldaNuevoOpcion;
	}

	public void setIsVisibilidadCeldaNuevoOpcion(Boolean isVisibilidadCeldaNuevoOpcion) {
		this.isVisibilidadCeldaNuevoOpcion = isVisibilidadCeldaNuevoOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarOpcion() {
		return isVisibilidadCeldaDuplicarOpcion;
	}

	public void setIsVisibilidadCeldaDuplicarOpcion(Boolean isVisibilidadCeldaDuplicarOpcion) {
		this.isVisibilidadCeldaDuplicarOpcion = isVisibilidadCeldaDuplicarOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarOpcion() {
		return isVisibilidadCeldaCopiarOpcion;
	}

	public void setIsVisibilidadCeldaCopiarOpcion(Boolean isVisibilidadCeldaCopiarOpcion) {
		this.isVisibilidadCeldaCopiarOpcion = isVisibilidadCeldaCopiarOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormOpcion() {
		return isVisibilidadCeldaVerFormOpcion;
	}

	public void setIsVisibilidadCeldaVerFormOpcion(Boolean isVisibilidadCeldaVerFormOpcion) {
		this.isVisibilidadCeldaVerFormOpcion = isVisibilidadCeldaVerFormOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenOpcion() {
		return isVisibilidadCeldaOrdenOpcion;
	}

	public void setIsVisibilidadCeldaOrdenOpcion(Boolean isVisibilidadCeldaOrdenOpcion) {
		this.isVisibilidadCeldaOrdenOpcion = isVisibilidadCeldaOrdenOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesOpcion() {
		return isVisibilidadCeldaNuevoRelacionesOpcion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesOpcion(Boolean isVisibilidadCeldaNuevoRelacionesOpcion) {
		this.isVisibilidadCeldaNuevoRelacionesOpcion = isVisibilidadCeldaNuevoRelacionesOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarOpcion() {
		return isVisibilidadCeldaModificarOpcion;
	}

	public void setIsVisibilidadCeldaModificarOpcion(Boolean isVisibilidadCeldaModificarOpcion) {
		this.isVisibilidadCeldaModificarOpcion = isVisibilidadCeldaModificarOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarOpcion() {
		return isVisibilidadCeldaActualizarOpcion;
	}

	public void setIsVisibilidadCeldaActualizarOpcion(Boolean isVisibilidadCeldaActualizarOpcion) {
		this.isVisibilidadCeldaActualizarOpcion = isVisibilidadCeldaActualizarOpcion;
	}

	public Boolean getIsVisibilidadCeldaEliminarOpcion() {
		return isVisibilidadCeldaEliminarOpcion;
	}

	public void setIsVisibilidadCeldaEliminarOpcion(Boolean isVisibilidadCeldaEliminarOpcion) {
		this.isVisibilidadCeldaEliminarOpcion = isVisibilidadCeldaEliminarOpcion;
	}

	public Boolean getIsVisibilidadCeldaCancelarOpcion() {
		return isVisibilidadCeldaCancelarOpcion;
	}

	public void setIsVisibilidadCeldaCancelarOpcion(Boolean isVisibilidadCeldaCancelarOpcion) {
		this.isVisibilidadCeldaCancelarOpcion = isVisibilidadCeldaCancelarOpcion;
	}

	public Boolean getIsVisibilidadCeldaGuardarOpcion() {
		return isVisibilidadCeldaGuardarOpcion;
	}

	public void setIsVisibilidadCeldaGuardarOpcion(Boolean isVisibilidadCeldaGuardarOpcion) {
		this.isVisibilidadCeldaGuardarOpcion = isVisibilidadCeldaGuardarOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosOpcion() {
		return isVisibilidadCeldaGuardarCambiosOpcion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosOpcion(Boolean isVisibilidadCeldaGuardarCambiosOpcion) {
		this.isVisibilidadCeldaGuardarCambiosOpcion = isVisibilidadCeldaGuardarCambiosOpcion;
	}
		
	public OpcionSessionBean getopcionSessionBean() {
		return this.opcionSessionBean;
	}
	
	public void setopcionSessionBean(OpcionSessionBean opcionSessionBean) {
		this.opcionSessionBean=opcionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdModuloPorIdOpcion() {
		return this.isVisibilidadBusquedaPorIdModuloPorIdOpcion;
	}

	public void setisVisibilidadBusquedaPorIdModuloPorIdOpcion(Boolean isVisibilidadBusquedaPorIdModuloPorIdOpcion) {
		this.isVisibilidadBusquedaPorIdModuloPorIdOpcion=isVisibilidadBusquedaPorIdModuloPorIdOpcion;
	}

	public Boolean getisVisibilidadBusquedaPorIdModuloPorNombre() {
		return this.isVisibilidadBusquedaPorIdModuloPorNombre;
	}

	public void setisVisibilidadBusquedaPorIdModuloPorNombre(Boolean isVisibilidadBusquedaPorIdModuloPorNombre) {
		this.isVisibilidadBusquedaPorIdModuloPorNombre=isVisibilidadBusquedaPorIdModuloPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorIdSistemaPorModulo() {
		return this.isVisibilidadBusquedaPorIdSistemaPorModulo;
	}

	public void setisVisibilidadBusquedaPorIdSistemaPorModulo(Boolean isVisibilidadBusquedaPorIdSistemaPorModulo) {
		this.isVisibilidadBusquedaPorIdSistemaPorModulo=isVisibilidadBusquedaPorIdSistemaPorModulo;
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

	public Boolean getisVisibilidadFK_IdSistema() {
		return this.isVisibilidadFK_IdSistema;
	}

	public void setisVisibilidadFK_IdSistema(Boolean isVisibilidadFK_IdSistema) {
		this.isVisibilidadFK_IdSistema=isVisibilidadFK_IdSistema;
	}

	public Boolean getisVisibilidadFK_IdTipoTeclaMascara() {
		return this.isVisibilidadFK_IdTipoTeclaMascara;
	}

	public void setisVisibilidadFK_IdTipoTeclaMascara(Boolean isVisibilidadFK_IdTipoTeclaMascara) {
		this.isVisibilidadFK_IdTipoTeclaMascara=isVisibilidadFK_IdTipoTeclaMascara;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysOpcion(Opcion opcion)throws Exception {
		try {
			
				this.setActualParaGuardarSistemaForeignKey(opcion,null);
				this.setActualParaGuardarModuloForeignKey(opcion,null);
				this.setActualParaGuardarGrupoOpcionForeignKey(opcion,null);
				this.setActualParaGuardarOpcionForeignKey(opcion,null);
				this.setActualParaGuardarTipoTeclaMascaraForeignKey(opcion,null);
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
	
	public void bugActualizarReferenciaActual(Opcion opcion,Opcion opcionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalOpcion(opcion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		opcionAux.setId(opcion.getId());
		opcionAux.setVersionRow(opcion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessOpcion();
		
			int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = opcionValidator.getInvalidValues(this.opcion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			opcionLogic.setDatosCliente(datosCliente);
			opcionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				opcionAux=new  Opcion();
				
				opcionAux.setIsNew(true);
				opcionAux.setIsChanged(true);
				
				opcionAux.setOpcionOriginal(this.opcion);
				
				opcionAux.setId(this.opcion.getId());	
				opcionAux.setVersionRow(this.opcion.getVersionRow());	
				opcionAux.setid_sistema(this.opcion.getid_sistema());	
				opcionAux.setid_modulo(this.opcion.getid_modulo());	
				opcionAux.setid_grupo_opcion(this.opcion.getid_grupo_opcion());	
				
				if(this.opcion.getid_opcion()!=null && this.opcion.getid_opcion()>0L) {
					opcionAux.setid_opcion(this.opcion.getid_opcion());
				} else {
					opcionAux.setid_opcion(null);
				}	
				opcionAux.setcodigo(this.opcion.getcodigo());	
				opcionAux.setnombre(this.opcion.getnombre());	
				opcionAux.setid_tipo_tecla_mascara(this.opcion.getid_tipo_tecla_mascara());	
				opcionAux.settecla(this.opcion.gettecla());	
				opcionAux.setposicion(this.opcion.getposicion());	
				opcionAux.seticon_name(this.opcion.geticon_name());	
				opcionAux.setnombre_clase(this.opcion.getnombre_clase());	
				opcionAux.setsub_modulo(this.opcion.getsub_modulo());	
				opcionAux.setpaquete(this.opcion.getpaquete());	
				opcionAux.setpaquete_original(this.opcion.getpaquete_original());	
				opcionAux.setpath_auxiliar(this.opcion.getpath_auxiliar());	
				opcionAux.setes_para_menu(this.opcion.getes_para_menu());	
				opcionAux.setcon_mostrar_acciones_campo(this.opcion.getcon_mostrar_acciones_campo());	
				opcionAux.setes_guardar_relaciones(this.opcion.getes_guardar_relaciones());	
				opcionAux.setestado(this.opcion.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.opcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.opcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(opcionAux,opcionLogic.getOpcions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(opcionAux,opcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.opcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.opcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionLogic.saveOpcions();//WithConnection
						//opcionLogic.getSetVersionRowOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
					this.refrescarForeignKeysDescripcionesOpcion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.opcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions().addAll(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionsEliminados);
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos().addAll(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.camposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accions.addAll(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionsEliminados);
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campos.addAll(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.camposEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								opcionLogic.saveOpcionRelaciones(opcionAux,this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions(),this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions(),this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos());//WithConnection
								//opcionLogic.getSetVersionRowOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.setAccions(new ArrayList<Accion>());
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.setCampos(new ArrayList<Campo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accions= new ArrayList<Accion>();
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campos= new ArrayList<Campo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setUsuarioOpcions(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setOpcions(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setAccions(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions());

							if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setPerfilOpcions(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());

							if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setCampos(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.opcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.opcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(opcionAux,opcionLogic.getOpcions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(opcionAux,opcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.opcion,opcionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				opcionAux=new  Opcion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.opcionSessionBean.getEsGuardarRelacionado() 
					|| (this.opcionSessionBean.getEsGuardarRelacionado() && this.opcion.getId()>=0)) {
						
					opcionAux.setIsNew(false);
				}
				
				opcionAux.setIsDeleted(false);
			
				opcionAux.setId(this.opcion.getId());	
				opcionAux.setVersionRow(this.opcion.getVersionRow());	
				opcionAux.setid_sistema(this.opcion.getid_sistema());	
				opcionAux.setid_modulo(this.opcion.getid_modulo());	
				opcionAux.setid_grupo_opcion(this.opcion.getid_grupo_opcion());	
				
				if(this.opcion.getid_opcion()!=null && this.opcion.getid_opcion()>0L) {
					opcionAux.setid_opcion(this.opcion.getid_opcion());
				} else {
					opcionAux.setid_opcion(null);
				}	
				opcionAux.setcodigo(this.opcion.getcodigo());	
				opcionAux.setnombre(this.opcion.getnombre());	
				opcionAux.setid_tipo_tecla_mascara(this.opcion.getid_tipo_tecla_mascara());	
				opcionAux.settecla(this.opcion.gettecla());	
				opcionAux.setposicion(this.opcion.getposicion());	
				opcionAux.seticon_name(this.opcion.geticon_name());	
				opcionAux.setnombre_clase(this.opcion.getnombre_clase());	
				opcionAux.setsub_modulo(this.opcion.getsub_modulo());	
				opcionAux.setpaquete(this.opcion.getpaquete());	
				opcionAux.setpaquete_original(this.opcion.getpaquete_original());	
				opcionAux.setpath_auxiliar(this.opcion.getpath_auxiliar());	
				opcionAux.setes_para_menu(this.opcion.getes_para_menu());	
				opcionAux.setcon_mostrar_acciones_campo(this.opcion.getcon_mostrar_acciones_campo());	
				opcionAux.setes_guardar_relaciones(this.opcion.getes_guardar_relaciones());	
				opcionAux.setestado(this.opcion.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(opcionAux,opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(opcionAux,opcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.opcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.opcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionLogic.saveOpcions();//WithConnection
						//opcionLogic.getSetVersionRowOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
					this.refrescarForeignKeysDescripcionesOpcion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.opcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions().addAll(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionsEliminados);
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos().addAll(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.camposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accions.addAll(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionsEliminados);
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campos.addAll(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.camposEliminados);
						}
						//ARCHITECTURE
						
						if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								opcionLogic.saveOpcionRelaciones(opcionAux,this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions(),this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions(),this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos());//WithConnection
								//opcionLogic.getSetVersionRowOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.setAccions(new ArrayList<Accion>());
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.setCampos(new ArrayList<Campo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accions= new ArrayList<Accion>();
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campos= new ArrayList<Campo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setUsuarioOpcions(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setOpcions(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setAccions(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions());

							if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setPerfilOpcions(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());

							if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setCampos(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.opcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.opcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(opcionAux,opcionLogic.getOpcions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(opcionAux,opcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.opcion,opcionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				opcionAux=new  Opcion();
				
				opcionAux.setIsNew(false);
				opcionAux.setIsChanged(false);
				
				opcionAux.setIsDeleted(true);
				
				opcionAux.setId(this.opcion.getId());	
				opcionAux.setVersionRow(this.opcion.getVersionRow());	
				opcionAux.setid_sistema(this.opcion.getid_sistema());	
				opcionAux.setid_modulo(this.opcion.getid_modulo());	
				opcionAux.setid_grupo_opcion(this.opcion.getid_grupo_opcion());	
				
				if(this.opcion.getid_opcion()!=null && this.opcion.getid_opcion()>0L) {
					opcionAux.setid_opcion(this.opcion.getid_opcion());
				} else {
					opcionAux.setid_opcion(null);
				}	
				opcionAux.setcodigo(this.opcion.getcodigo());	
				opcionAux.setnombre(this.opcion.getnombre());	
				opcionAux.setid_tipo_tecla_mascara(this.opcion.getid_tipo_tecla_mascara());	
				opcionAux.settecla(this.opcion.gettecla());	
				opcionAux.setposicion(this.opcion.getposicion());	
				opcionAux.seticon_name(this.opcion.geticon_name());	
				opcionAux.setnombre_clase(this.opcion.getnombre_clase());	
				opcionAux.setsub_modulo(this.opcion.getsub_modulo());	
				opcionAux.setpaquete(this.opcion.getpaquete());	
				opcionAux.setpaquete_original(this.opcion.getpaquete_original());	
				opcionAux.setpath_auxiliar(this.opcion.getpath_auxiliar());	
				opcionAux.setes_para_menu(this.opcion.getes_para_menu());	
				opcionAux.setcon_mostrar_acciones_campo(this.opcion.getcon_mostrar_acciones_campo());	
				opcionAux.setes_guardar_relaciones(this.opcion.getes_guardar_relaciones());	
				opcionAux.setestado(this.opcion.getestado());	
				
				if(this.opcionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.opcionAux.getId()>=0) {	
						this.opcionsEliminados.add(opcionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(opcionAux,opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(opcionAux,opcions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.opcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.opcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionLogic.saveOpcions();//WithConnection
						//opcionLogic.getSetVersionRowOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.opcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions().addAll(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions().addAll(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions().addAll(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionsEliminados);
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions().addAll(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos().addAll(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.camposEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions.addAll(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcions.addAll(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accions.addAll(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionsEliminados);
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions.addAll(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionsEliminados);
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campos.addAll(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.camposEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jInternalFrameDetalleFormAccion.perfilaccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jInternalFrameDetalleFormCampo.perfilcampoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								opcionLogic.saveOpcionRelaciones(opcionAux,this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions(),this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions(),this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions(),this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions(),this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos());//WithConnection
								//opcionLogic.getSetVersionRowOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(new ArrayList<UsuarioOpcion>());
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(new ArrayList<Opcion>());
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.setAccions(new ArrayList<Accion>());
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.setCampos(new ArrayList<Campo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions= new ArrayList<UsuarioOpcion>();
							this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcions= new ArrayList<Opcion>();
							this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accions= new ArrayList<Accion>();
							this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions= new ArrayList<PerfilOpcion>();
							this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campos= new ArrayList<Campo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setUsuarioOpcions(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());

							if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setOpcions(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());

							if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setAccions(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions());

							if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setPerfilOpcions(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());

							if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.quitarFilaTotales();}
							opcionAux.setCampos(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.opcionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.opcionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(opcionAux,opcionLogic.getOpcions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(opcionAux,opcions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getOpcions().addAll(this.opcionsEliminados);
					
					opcionLogic.saveOpcions();//WithConnection
					//opcionLogic.getSetVersionRowOpcions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesOpcion();
				
				this.opcionsEliminados= new ArrayList<Opcion>();		
			}
			
			if(this.opcionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
			//ACTUALIZA ARBOL
			this.getTodosOpcionArbol();
			
			//TO_OPTIMIZE POR TIPO FK NO TODOS
			this.inicializarCombosForeignKeyOpcionListas();
			
			this.cargarCombosForeignKeyOpcion(false);
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Opcion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.opcion=opcionAux;
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
      		//this.finishProcessOpcion();
      	}
		
	}	
	
	public void actualizarRelaciones(Opcion opcionLocal) throws Exception {
		
		if(this.opcionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				opcionLocal.setUsuarioOpcions(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());
				opcionLocal.setOpcions(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());
				opcionLocal.setAccions(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions());
				opcionLocal.setPerfilOpcions(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
				opcionLocal.setCampos(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos());
			
			} else {
			
				opcionLocal.setUsuarioOpcions(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcions);
				opcionLocal.setOpcions(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcions);
				opcionLocal.setAccions(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accions);
				opcionLocal.setPerfilOpcions(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcions);
				opcionLocal.setCampos(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Opcion opcionLocal) throws Exception {	
		if(this.opcionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(SistemaDetalleFormJInternalFrame.class)) {
				SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrameLocal=(SistemaBeanSwingJInternalFrame) ((SistemaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sistemaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSistema(sistemaBeanSwingJInternalFrameLocal.getsistema(),true);
				sistemaBeanSwingJInternalFrameLocal.actualizarLista(sistemaBeanSwingJInternalFrameLocal.sistema,this.sistemasForeignKey);

				sistemaBeanSwingJInternalFrameLocal.actualizarRelaciones(sistemaBeanSwingJInternalFrameLocal.sistema);

				opcionLocal.setSistema(sistemaBeanSwingJInternalFrameLocal.sistema);

				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey("Formulario");
				this.setActualSistemaForeignKey(sistemaBeanSwingJInternalFrameLocal.sistema.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				opcionLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoOpcionDetalleFormJInternalFrame.class)) {
				GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrameLocal=(GrupoOpcionBeanSwingJInternalFrame) ((GrupoOpcionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoopcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoOpcion(grupoopcionBeanSwingJInternalFrameLocal.getgrupoopcion(),true);
				grupoopcionBeanSwingJInternalFrameLocal.actualizarLista(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion,this.grupoopcionsForeignKey);

				grupoopcionBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion);

				opcionLocal.setGrupoOpcion(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion);

				this.addItemDefectoCombosForeignKeyGrupoOpcion();
				this.cargarCombosFrameGrupoOpcionsForeignKey("Formulario");
				this.setActualGrupoOpcionForeignKey(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(OpcionDetalleFormJInternalFrame.class)) {
				OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrameLocal=(OpcionBeanSwingJInternalFrame) ((OpcionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				opcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOpcion(opcionBeanSwingJInternalFrameLocal.getopcion(),true);
				opcionBeanSwingJInternalFrameLocal.actualizarLista(opcionBeanSwingJInternalFrameLocal.opcion,this.opcionsForeignKey);

				opcionBeanSwingJInternalFrameLocal.actualizarRelaciones(opcionBeanSwingJInternalFrameLocal.opcion);

				opcionLocal.setOpcion(opcionBeanSwingJInternalFrameLocal.opcion);

				this.addItemDefectoCombosForeignKeyOpcion();
				this.cargarCombosFrameOpcionsForeignKey("Formulario");
				this.setActualOpcionForeignKey(opcionBeanSwingJInternalFrameLocal.opcion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoTeclaMascaraDetalleFormJInternalFrame.class)) {
				TipoTeclaMascaraBeanSwingJInternalFrame tipoteclamascaraBeanSwingJInternalFrameLocal=(TipoTeclaMascaraBeanSwingJInternalFrame) ((TipoTeclaMascaraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoteclamascaraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoTeclaMascara(tipoteclamascaraBeanSwingJInternalFrameLocal.gettipoteclamascara(),true);
				tipoteclamascaraBeanSwingJInternalFrameLocal.actualizarLista(tipoteclamascaraBeanSwingJInternalFrameLocal.tipoteclamascara,this.tipoteclamascarasForeignKey);

				tipoteclamascaraBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoteclamascaraBeanSwingJInternalFrameLocal.tipoteclamascara);

				opcionLocal.setTipoTeclaMascara(tipoteclamascaraBeanSwingJInternalFrameLocal.tipoteclamascara);

				this.addItemDefectoCombosForeignKeyTipoTeclaMascara();
				this.cargarCombosFrameTipoTeclaMascarasForeignKey("Formulario");
				this.setActualTipoTeclaMascaraForeignKey(tipoteclamascaraBeanSwingJInternalFrameLocal.tipoteclamascara.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarOpcionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = opcionValidator.getInvalidValues(this.opcion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Opcion opcion,List<Opcion> opcions) throws Exception {
		try	{		
			OpcionConstantesFunciones.actualizarLista(opcion,opcions,this.opcionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Opcion opcion,List<Opcion> opcions) throws Exception {
		try	{			
			OpcionConstantesFunciones.actualizarSelectedLista(opcion,opcions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Opcion> opcionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsLocal=this.opcionLogic.getOpcions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				opcionsLocal=this.opcions;
			}
			//ARCHITECTURE
		
			for(Opcion opcionLocal:opcionsLocal) {
				if(this.permiteMantenimiento(opcionLocal) && opcionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+OpcionConstantesFunciones.getOpcionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.IDSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelid_sistemaOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelid_moduloOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.IDGRUPOOPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelid_grupo_opcionOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.IDOPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelid_opcionOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelcodigoOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelnombreOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.IDTIPOTECLAMASCARA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelid_tipo_tecla_mascaraOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.TECLA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelteclaOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.POSICION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelposicionOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.ICONNAME)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelicon_nameOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.NOMBRECLASE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelnombre_claseOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.SUBMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelsub_moduloOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.PAQUETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelpaqueteOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.PAQUETEORIGINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelpaquete_originalOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.PATHAUXILIAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelpath_auxiliarOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.ESPARAMENU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabeles_para_menuOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.CONMOSTRARACCIONESCAMPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelcon_mostrar_acciones_campoOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.ESGUARDARRELACIONES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabeles_guardar_relacionesOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OpcionConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelestadoOpcion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormOpcion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelid_sistemaOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelid_moduloOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelid_grupo_opcionOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelid_opcionOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelcodigoOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelnombreOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelid_tipo_tecla_mascaraOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelteclaOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelposicionOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelicon_nameOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelnombre_claseOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelsub_moduloOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelpaqueteOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelpaquete_originalOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelpath_auxiliarOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabeles_para_menuOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelcon_mostrar_acciones_campoOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabeles_guardar_relacionesOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOpcion.jLabelestadoOpcion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("UsuarioOpcion")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.getusuarioopcion().setOpcion(this.opcion);
			}

			return;
		}
		 else  if(sTipo.equals("Opcion")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.getopcion().setOpcion(this.opcion);
			}

			return;
		}
		 else  if(sTipo.equals("Accion")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.getaccion().setOpcion(this.opcion);
			}

			return;
		}
		 else  if(sTipo.equals("PerfilOpcion")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.getperfilopcion().setOpcion(this.opcion);
			}

			return;
		}
		 else  if(sTipo.equals("Campo")) {
			if(this.opcion==null) {
				this.opcion= new Opcion();
			}

			if(this.opcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoOpcion
				this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.getcampo().setOpcion(this.opcion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoOpcion--;	
		
		
		this.opcionAux=new Opcion();
		
		this.opcionAux.setId(this.iIdNuevoOpcion);
		this.opcionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.opcionLogic.getOpcions().add(this.opcionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.opcions.add(this.opcionAux);
		}
		//ARCHITECTURE
		
		this.opcion=this.opcionAux;
		
		if(OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioOpcion(this.opcion);
			this.setVariablesObjetoActualToFormularioForeignKeyOpcion(this.opcion);
		}
				
		//this.setDefaultControlesOpcion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyOpcion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyOpcion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyOpcion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualOpcion(this.opcionBean,this.opcion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(OpcionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.opcionSessionBean.getConGuardarRelaciones()) {
			classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.opcionReturnGeneral=opcionLogic.procesarEventosOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.opcionLogic.getOpcions(),this.opcion,this.opcionParameterGeneral,this.isEsNuevoOpcion,classes);//this.opcionLogic.getOpcion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanOpcion(this.opcionReturnGeneral,this.opcionBean,false);
		
		if(this.opcionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyOpcion(this.opcionReturnGeneral.getOpcion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioOpcion(this.opcionReturnGeneral.getOpcion());
		}
		
		if(this.opcionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioOpcion(this.opcionReturnGeneral.getOpcion(),classes);//this.opcionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualOpcion(this.opcion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyOpcion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyOpcion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			OpcionBeanSwingJInternalFrameAdditional.RecargarFormOpcion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingOpcion(false);
						
			if(opcionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado() && UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUsuarioOpcionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado() && OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOpcionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionSessionBean.getEsGuardarRelacionado() && AccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAccionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado() && PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilOpcionActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoSessionBean.getEsGuardarRelacionado() && CampoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCampoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(OpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualOpcion();
			}
			
			this.actualizarVisualTableDatosOpcion();
			
			this.jTableDatosOpcion.setRowSelectionInterval(this.getIndiceNuevoOpcion(), this.getIndiceNuevoOpcion());
			
			this.seleccionarFilaTablaOpcionActual();
						
			this.actualizarEstadoCeldasBotonesOpcion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesOpcion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormOpcion.jTextFieldcodigoOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarcodigoOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldnombreOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarnombreOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldteclaOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarteclaOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldposicionOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarposicionOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextAreaicon_nameOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activaricon_nameOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldnombre_claseOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarnombre_claseOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldsub_moduloOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarsub_moduloOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextAreapaqueteOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarpaqueteOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextAreapaquete_originalOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarpaquete_originalOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldpath_auxiliarOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarpath_auxiliarOpcion);
		this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activares_para_menuOpcion);
		this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarcon_mostrar_acciones_campoOpcion);
		this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activares_guardar_relacionesOpcion);
		this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarestadoOpcion);	
		
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarid_sistemaOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarid_moduloOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarid_grupo_opcionOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarid_opcionOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setEnabled(isHabilitar && this.opcionConstantesFunciones.activarid_tipo_tecla_mascaraOpcion);
	};
	
	public void setDefaultControlesOpcion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoOpcion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.opcionSessionBean.setConGuardarRelaciones(true);			
			this.opcionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.opcionSessionBean.setConGuardarRelaciones(false);			
			this.opcionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoOpcion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
				if(opcionAux.getId().equals(this.iIdNuevoOpcion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Opcion opcionAux:this.opcions) {
				if(opcionAux.getId().equals(this.iIdNuevoOpcion)) {
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
	
	public int getIndiceActualOpcion(Opcion opcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
				if(opcionAux.getId().equals(opcion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Opcion opcionAux:this.opcions) {
				if(opcionAux.getId().equals(opcion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalOpcion(Opcion opcionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
				if(opcionAux.getOpcionOriginal().getId().equals(opcionOriginal.getId())) {
					existe=true;
					opcionOriginal.setId(opcionAux.getId());
					opcionOriginal.setVersionRow(opcionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Opcion opcionAux:this.opcions) {
				if(opcionAux.getOpcionOriginal().getId().equals(opcionOriginal.getId())) {
					existe=true;
					opcionOriginal.setId(opcionAux.getId());
					opcionOriginal.setVersionRow(opcionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosOpcion(Boolean esParaCancelar) throws Exception {
		opcionsAux=new ArrayList<Opcion>();
		opcionAux=new Opcion();
		
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
					if(opcionAux.getId()<0) {
						opcionsAux.add(opcionAux);
					}		
				}
				this.iIdNuevoOpcion=0L;
				this.opcionLogic.getOpcions().removeAll(opcionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Opcion opcionAux:this.opcions) {
					if(opcionAux.getId()<0) {
						opcionsAux.add(opcionAux);
					}		
				}
				this.iIdNuevoOpcion=0L;
				this.opcions.removeAll(opcionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoOpcion 
					&& this.opcionLogic.getOpcions().size()>0
					) {
					opcionAux=this.opcionLogic.getOpcions().get(this.opcionLogic.getOpcions().size() - 1);
				
					if(opcionAux.getId()<0) {
						this.opcionLogic.getOpcions().remove(opcionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoOpcion && this.opcions.size()>0) {
					opcionAux=this.opcions.get(this.opcions.size() - 1);
				
					if(opcionAux.getId()<0) {
						this.opcions.remove(opcionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoOpcion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(opcion.getId()<0) {
				this.opcionLogic.getOpcions().remove(this.opcion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(opcion.getId()<0) {
				this.opcions.remove(this.opcion);
			}
		}			
	}
	
	public void setEstadosInicialesOpcion(List<Opcion> opcionsAux) throws Exception {
		OpcionConstantesFunciones.setEstadosInicialesOpcion(opcionsAux);
	}
	
	public void setEstadosInicialesOpcion(Opcion opcionAux) throws Exception {
		OpcionConstantesFunciones.setEstadosInicialesOpcion(opcionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarOpcionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarOpcionActual()) {
				if(!this.isEsNuevoOpcion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoOpcion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarOpcionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Opcion ?", "MANTENIMIENTO DE Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Opcion opcion) throws Exception {
		OpcionConstantesFunciones.seleccionarAsignar(this.opcion,opcion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarOpcion=this.isPermisoActualizarOriginalOpcion;
			
			
			this.seleccionarAsignar(opcion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			OpcionConstantesFunciones.quitarEspaciosOpcion(this.opcion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.opcionSessionBean.setsFuncionBusquedaRapida(this.opcionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoOpcion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosOpcion(esParaCancelar);				
				this.cancelarNuevoOpcion(esParaCancelar);								
			}
			
			this.opcion=new Opcion();
			
			this.inicializarOpcion();
			
			this.actualizarEstadoCeldasBotonesOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarOpcion() throws Exception {
		try {
			OpcionConstantesFunciones.inicializarOpcion(this.opcion);
			
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
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.opcionLogic.getOpcions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteOpcions(String sAccionBusqueda,List<Opcion> opcionsParaReportes) throws Exception {
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
					sPathReporteFinal="Opcion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="OpcionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("OpcionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Opcion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Opciones");		
		parameters.put("busquedapor", OpcionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
			classes.add(new Classe(Accion.class));
			classes.add(new Classe(PerfilOpcion.class));
			classes.add(new Classe(Campo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					OpcionLogic opcionLogicAuxiliar=new OpcionLogic();
					opcionLogicAuxiliar.setDatosCliente(opcionLogic.getDatosCliente());				
					opcionLogicAuxiliar.setOpcions(opcionsParaReportes);
					
					opcionLogicAuxiliar.cargarRelacionesLoteForeignKeyOpcionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					opcionsParaReportes=opcionLogicAuxiliar.getOpcions();
					
					//opcionLogic.getNewConnexionToDeep();
					
					//for (Opcion opcion:opcionsParaReportes) {
					//	opcionLogic.deepLoad(opcion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//opcionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//opcionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileUsuarioOpcion = AuxiliarReportes.class.getResourceAsStream("UsuarioOpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_usuarioopcion", reportFileUsuarioOpcion);

			InputStream reportFileOpcion = AuxiliarReportes.class.getResourceAsStream("OpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_opcion", reportFileOpcion);

			InputStream reportFileAccion = AuxiliarReportes.class.getResourceAsStream("AccionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_accion", reportFileAccion);

			InputStream reportFilePerfilOpcion = AuxiliarReportes.class.getResourceAsStream("PerfilOpcionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_perfilopcion", reportFilePerfilOpcion);

			InputStream reportFileCampo = AuxiliarReportes.class.getResourceAsStream("CampoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_campo", reportFileCampo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceOpcion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			OpcionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			OpcionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceOpcion=new JRBeanArrayDataSource(OpcionJInternalFrame.TraerOpcionBeans(opcionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceOpcion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+OpcionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+OpcionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(OpcionBean.TraerOpcionBeans(opcionsParaReportes).toArray()));
							
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
				this.generarExcelReporteOpcions(sAccionBusqueda,sTipoArchivoReporte,opcionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalOpcions(sAccionBusqueda,sTipoArchivoReporte,opcionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoOpcionActionPerformed(null);
					//this.generarExcelReporteOpcions(sAccionBusqueda,sTipoArchivoReporte,opcionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalOpcions(sAccionBusqueda,sTipoArchivoReporte,opcionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesOpcions(sAccionBusqueda,sTipoArchivoReporte,opcionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesOpcions(sAccionBusqueda,sTipoArchivoReporte,opcionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Opcions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderOpcion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Opcion opcion : opcionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			OpcionConstantesFunciones.generarExcelReporteDataOpcion("NORMAL",row,workbook,opcion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderOpcion(String sTipo,Row row,Workbook workbook) {
		
		OpcionConstantesFunciones.generarExcelReporteHeaderOpcion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Opcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Opcion opcion : opcionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(OpcionConstantesFunciones.getOpcionDescripcion(opcion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_IDSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_IDSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getsistema_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_IDGRUPOOPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getgrupoopcion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_IDOPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_IDOPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getopcion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.gettipoteclamascara_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_TECLA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_TECLA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.gettecla());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_POSICION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_POSICION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getposicion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_ICONNAME))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_ICONNAME);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.geticon_name());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_NOMBRECLASE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_NOMBRECLASE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getnombre_clase());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_SUBMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_SUBMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getsub_modulo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_PAQUETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_PAQUETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getpaquete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getpaquete_original());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_PATHAUXILIAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_PATHAUXILIAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(opcion.getpath_auxiliar());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_ESPARAMENU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_ESPARAMENU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(opcion.getes_para_menu()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(opcion.getcon_mostrar_acciones_campo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(opcion.getes_guardar_relaciones()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OpcionConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OpcionConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(opcion.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<Opcion> opcionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Opcion> opcionsRespaldo=null;
		
		classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.opcionLogic.setDatosCliente(this.datosCliente);
		this.opcionLogic.setDatosDeep(this.datosDeep);
		this.opcionLogic.setIsConDeep(true);
		
		opcionsRespaldo=this.opcionLogic.getOpcions();
		
		this.opcionLogic.setOpcions(opcionsParaReportes);	
		this.opcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		opcionsParaReportes=this.opcionLogic.getOpcions();
		this.opcionLogic.setOpcions(opcionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Opcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderOpcion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Opcion opcion : opcionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderOpcion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			OpcionConstantesFunciones.generarExcelReporteDataOpcion("NORMAL",row,workbook,opcion,cellStyleDataAux);
		
			
			


				//UsuarioOpcion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO))) {

				if(opcion.getUsuarioOpcions()!=null && opcion.getUsuarioOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					UsuarioOpcionConstantesFunciones.generarExcelReporteHeaderUsuarioOpcion("RELACIONADO",row,workbook);
				}

				if(opcion.getUsuarioOpcions()!=null) {
					i2=0;
					for(UsuarioOpcion usuarioopcion : opcion.getUsuarioOpcions()) {
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

				if(opcion.getOpcions()!=null && opcion.getOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(OpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					OpcionConstantesFunciones.generarExcelReporteHeaderOpcion("RELACIONADO",row,workbook);
				}

				if(opcion.getOpcions()!=null) {
					i2=0;
					for(Opcion opcionAutoRef : opcion.getOpcions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						OpcionConstantesFunciones.generarExcelReporteDataOpcion("RELACIONADO",row,workbook,opcionAutoRef,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Accion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AccionConstantesFunciones.SCLASSWEBTITULO))) {

				if(opcion.getAccions()!=null && opcion.getAccions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AccionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AccionConstantesFunciones.generarExcelReporteHeaderAccion("RELACIONADO",row,workbook);
				}

				if(opcion.getAccions()!=null) {
					i2=0;
					for(Accion accion : opcion.getAccions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AccionConstantesFunciones.generarExcelReporteDataAccion("RELACIONADO",row,workbook,accion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PerfilOpcion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO))) {

				if(opcion.getPerfilOpcions()!=null && opcion.getPerfilOpcions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PerfilOpcionConstantesFunciones.generarExcelReporteHeaderPerfilOpcion("RELACIONADO",row,workbook);
				}

				if(opcion.getPerfilOpcions()!=null) {
					i2=0;
					for(PerfilOpcion perfilopcion : opcion.getPerfilOpcions()) {
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


				//Campo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CampoConstantesFunciones.SCLASSWEBTITULO))) {

				if(opcion.getCampos()!=null && opcion.getCampos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CampoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CampoConstantesFunciones.generarExcelReporteHeaderCampo("RELACIONADO",row,workbook);
				}

				if(opcion.getCampos()!=null) {
					i2=0;
					for(Campo campo : opcion.getCampos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CampoConstantesFunciones.generarExcelReporteDataCampo("RELACIONADO",row,workbook,campo,cellStyleDataAuxHijo);
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
		cell.setCellValue(OpcionConstantesFunciones.getOpcionDescripcion(opcion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoOpcion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoOpcion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessOpcion() throws Exception {		
		this.startProcessOpcion(true);
	}
	
	public void startProcessOpcion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasOpcion ,this.jPanelParametrosReportesOpcion, this.jScrollPanelDatosOpcion,this.jPanelPaginacionOpcion, this.jScrollPanelDatosEdicionOpcion, this.jPanelAccionesOpcion,this.jPanelAccionesFormularioOpcion,this.jmenuBarOpcion,this.jmenuBarDetalleOpcion,this.jTtoolBarOpcion,this.jTtoolBarDetalleOpcion);		
		
		final JTabbedPane jTabbedPaneBusquedasOpcion=this.jTabbedPaneBusquedasOpcion; 
		
		final JPanel jPanelParametrosReportesOpcion=this.jPanelParametrosReportesOpcion;
		//final JScrollPane jScrollPanelDatosOpcion=this.jScrollPanelDatosOpcion;
		final JTable jTableDatosOpcion=this.jTableDatosOpcion;		
		final JPanel jPanelPaginacionOpcion=this.jPanelPaginacionOpcion;
		//final JScrollPane jScrollPanelDatosEdicionOpcion=this.jScrollPanelDatosEdicionOpcion;
		final JPanel jPanelAccionesOpcion=this.jPanelAccionesOpcion;
		
		JPanel jPanelCamposAuxiliarOpcion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarOpcion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormOpcion!=null) {
			jPanelCamposAuxiliarOpcion=this.jInternalFrameDetalleFormOpcion.jPanelCamposOpcion;
			jPanelAccionesFormularioAuxiliarOpcion=this.jInternalFrameDetalleFormOpcion.jPanelAccionesFormularioOpcion;
		}
		
		final JPanel jPanelCamposOpcion=jPanelCamposAuxiliarOpcion;
		final JPanel jPanelAccionesFormularioOpcion=jPanelAccionesFormularioAuxiliarOpcion;
		
		
		final JMenuBar jmenuBarOpcion=this.jmenuBarOpcion;
		final JToolBar jTtoolBarOpcion=this.jTtoolBarOpcion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarOpcion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarOpcion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) {
			jmenuBarDetalleAuxiliarOpcion=this.jInternalFrameDetalleFormOpcion.jmenuBarDetalleOpcion;
			jTtoolBarDetalleAuxiliarOpcion=this.jInternalFrameDetalleFormOpcion.jTtoolBarDetalleOpcion;
		}
		
		final JMenuBar jmenuBarDetalleOpcion=jmenuBarDetalleAuxiliarOpcion;
		final JToolBar jTtoolBarDetalleOpcion=jTtoolBarDetalleAuxiliarOpcion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasOpcion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesOpcion;
			processRunnable.jTableDatos=jTableDatosOpcion;
			processRunnable.jPanelCampos=jPanelCamposOpcion;
			processRunnable.jPanelPaginacion=jPanelPaginacionOpcion;
			processRunnable.jPanelAcciones=jPanelAccionesOpcion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioOpcion;
			
			
			processRunnable.jmenuBar=jmenuBarOpcion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleOpcion;
			processRunnable.jTtoolBar=jTtoolBarOpcion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleOpcion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasOpcion ,jPanelParametrosReportesOpcion,jTableDatosOpcion, /*jScrollPanelDatosOpcion,*/jPanelCamposOpcion,jPanelPaginacionOpcion, /*jScrollPanelDatosEdicionOpcion,*/ jPanelAccionesOpcion,jPanelAccionesFormularioOpcion,jmenuBarOpcion,jmenuBarDetalleOpcion,jTtoolBarOpcion,jTtoolBarDetalleOpcion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasOpcion ,jPanelParametrosReportesOpcion, jScrollPanelDatosOpcion,jPanelPaginacionOpcion, jScrollPanelDatosEdicionOpcion, jPanelAccionesOpcion,jPanelAccionesFormularioOpcion,jmenuBarOpcion,jmenuBarDetalleOpcion,jTtoolBarOpcion,jTtoolBarDetalleOpcion);
						
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
	
	public void finishProcessOpcion() {// throws Exception 
		this.finishProcessOpcion(true);
	}
	
	public void finishProcessOpcion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasOpcion ,this.jPanelParametrosReportesOpcion, this.jScrollPanelDatosOpcion,this.jPanelPaginacionOpcion, this.jScrollPanelDatosEdicionOpcion, this.jPanelAccionesOpcion,this.jPanelAccionesFormularioOpcion,this.jmenuBarOpcion,this.jmenuBarDetalleOpcion,this.jTtoolBarOpcion,this.jTtoolBarDetalleOpcion);		
		
		final JTabbedPane jTabbedPaneBusquedasOpcion=this.jTabbedPaneBusquedasOpcion; 
		
		final JPanel jPanelParametrosReportesOpcion=this.jPanelParametrosReportesOpcion;
		//final JScrollPane jScrollPanelDatosOpcion=this.jScrollPanelDatosOpcion;
		final JTable jTableDatosOpcion=this.jTableDatosOpcion;		
		final JPanel jPanelPaginacionOpcion=this.jPanelPaginacionOpcion;
		//final JScrollPane jScrollPanelDatosEdicionOpcion=this.jScrollPanelDatosEdicionOpcion;
		final JPanel jPanelAccionesOpcion=this.jPanelAccionesOpcion;
		
		JPanel jPanelCamposAuxiliarOpcion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarOpcion=new JPanel();
		
		if(this.jInternalFrameDetalleFormOpcion!=null) {
			jPanelCamposAuxiliarOpcion=this.jInternalFrameDetalleFormOpcion.jPanelCamposOpcion;
			jPanelAccionesFormularioAuxiliarOpcion=this.jInternalFrameDetalleFormOpcion.jPanelAccionesFormularioOpcion;
		}
		
		final JPanel jPanelCamposOpcion=jPanelCamposAuxiliarOpcion;
		final JPanel jPanelAccionesFormularioOpcion=jPanelAccionesFormularioAuxiliarOpcion;
		
		
		final JMenuBar jmenuBarOpcion=this.jmenuBarOpcion;		
		final JToolBar jTtoolBarOpcion=this.jTtoolBarOpcion;
				
		JMenuBar jmenuBarDetalleAuxiliarOpcion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarOpcion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormOpcion!=null) {
			jmenuBarDetalleAuxiliarOpcion=this.jInternalFrameDetalleFormOpcion.jmenuBarDetalleOpcion;
			jTtoolBarDetalleAuxiliarOpcion=this.jInternalFrameDetalleFormOpcion.jTtoolBarDetalleOpcion;		
		}
		
		final JMenuBar jmenuBarDetalleOpcion=jmenuBarDetalleAuxiliarOpcion;
		final JToolBar jTtoolBarDetalleOpcion=jTtoolBarDetalleAuxiliarOpcion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasOpcion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesOpcion;
			processRunnable.jTableDatos=jTableDatosOpcion;
			processRunnable.jPanelCampos=jPanelCamposOpcion;
			processRunnable.jPanelPaginacion=jPanelPaginacionOpcion;
			processRunnable.jPanelAcciones=jPanelAccionesOpcion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioOpcion;
			
			
			processRunnable.jmenuBar=jmenuBarOpcion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleOpcion;
			processRunnable.jTtoolBar=jTtoolBarOpcion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleOpcion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasOpcion ,jPanelParametrosReportesOpcion, jTableDatosOpcion,/*jScrollPanelDatosOpcion,*/jPanelCamposOpcion,jPanelPaginacionOpcion, /*jScrollPanelDatosEdicionOpcion,*/ jPanelAccionesOpcion,jPanelAccionesFormularioOpcion,jmenuBarOpcion,jmenuBarDetalleOpcion,jTtoolBarOpcion,jTtoolBarDetalleOpcion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesOpcion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarOpcion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuOpcion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleOpcion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleOpcion,esHabilitar,1,1);
		}
	}
	*/
	
	
	public void getTodosOpcionArbol() throws Exception {	
		ArrayList<String> arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral);
		
		String  finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);
		
		this.pagination=new Pagination();
		
		this.pagination.setiFirstResult(-1);
		this.pagination.setiMaxResults(-1);
		
		this.cargarDatosCliente();
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			opcionLogic.getTodosOpcions(finalQueryGlobal+"",this.pagination);//WithConnection
			this.opcionsArbol=opcionLogic.getOpcions();
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
	}
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.opcionConstantesFunciones.getsFinalQueryOpcion();
		String  finalQueryPaginacionTodos=this.opcionConstantesFunciones.getsFinalQueryOpcion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=OpcionConstantesFunciones.getArrayColumnasGlobalesNoOpcion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.opcionsEliminados= new ArrayList<Opcion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessOpcion();
		
				///*OpcionSessionBean*/this.opcionSessionBean=new OpcionSessionBean();
			
			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
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
					this.iNumeroPaginacion=OpcionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=OpcionConstantesFunciones.getClassesForeignKeysOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/opcion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			opcionsAux= new ArrayList<Opcion>();
			
				
			opcionLogic.setDatosCliente(this.datosCliente);
			opcionLogic.setDatosDeep(this.datosDeep);
			opcionLogic.setIsConDeep(true);
			
			
			opcionLogic.getOpcionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					opcionLogic.getTodosOpcions(finalQueryGlobal,pagination);
					
					//opcionLogic.getTodosOpcionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(opcionLogic.getOpcions()==null|| opcionLogic.getOpcions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							opcionsAux= new ArrayList<Opcion>();
							opcionsAux.addAll(opcionLogic.getOpcions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcionsAux= new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							opcionLogic.getTodosOpcions(finalQueryGlobal+"",this.pagination);												
							
							//opcionLogic.getTodosOpcionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteOpcions("Todos",opcionLogic.getOpcions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							opcionLogic.setOpcions(new ArrayList<Opcion>());					
							opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idOpcion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idOpcion=this.idActual;
				
				} else if(this.idOpcionActual!=null && this.idOpcionActual!=0L) {
					idOpcion=idOpcionActual;
				}
				
					
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndicePorId(idOpcion);
				
				this.opcions=new ArrayList<Opcion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					opcionLogic.getEntity(idOpcion);
					
					//opcionLogic.getEntityWithConnection(idOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.setOpcions(new ArrayList<Opcion>());
					opcionLogic.getOpcions().add(opcionLogic.getOpcion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.opcions=new ArrayList<Opcion>();
					this.opcions.add(opcion);
				}
				
				if(opcionLogic.getOpcion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdModuloPorIdOpcion")) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdOpcion(id_sistemaBusquedaPorIdModuloPorIdOpcion,id_moduloBusquedaPorIdModuloPorIdOpcion,id_opcionBusquedaPorIdModuloPorIdOpcion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getOpcionsBusquedaPorIdModuloPorIdOpcion(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdModuloPorIdOpcion,id_moduloBusquedaPorIdModuloPorIdOpcion,id_opcionBusquedaPorIdModuloPorIdOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdOpcion(id_sistemaBusquedaPorIdModuloPorIdOpcion,id_moduloBusquedaPorIdModuloPorIdOpcion,id_opcionBusquedaPorIdModuloPorIdOpcion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdOpcion(id_sistemaBusquedaPorIdModuloPorIdOpcion,id_moduloBusquedaPorIdModuloPorIdOpcion,id_opcionBusquedaPorIdModuloPorIdOpcion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getOpcionsBusquedaPorIdModuloPorIdOpcion(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdModuloPorIdOpcion,id_moduloBusquedaPorIdModuloPorIdOpcion,id_opcionBusquedaPorIdModuloPorIdOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdOpcion(id_sistemaBusquedaPorIdModuloPorIdOpcion,id_moduloBusquedaPorIdModuloPorIdOpcion,id_opcionBusquedaPorIdModuloPorIdOpcion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorIdOpcion(id_sistemaBusquedaPorIdModuloPorIdOpcion,id_moduloBusquedaPorIdModuloPorIdOpcion,id_opcionBusquedaPorIdModuloPorIdOpcion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOpcions("BusquedaPorIdModuloPorIdOpcion",opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOpcions("BusquedaPorIdModuloPorIdOpcion",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIdModuloPorNombre")) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_sistemaBusquedaPorIdModuloPorNombre,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getOpcionsBusquedaPorIdModuloPorNombre(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdModuloPorNombre,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_sistemaBusquedaPorIdModuloPorNombre,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_sistemaBusquedaPorIdModuloPorNombre,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getOpcionsBusquedaPorIdModuloPorNombre(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdModuloPorNombre,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_sistemaBusquedaPorIdModuloPorNombre,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdModuloPorNombre(id_sistemaBusquedaPorIdModuloPorNombre,id_moduloBusquedaPorIdModuloPorNombre,nombreBusquedaPorIdModuloPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOpcions("BusquedaPorIdModuloPorNombre",opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOpcions("BusquedaPorIdModuloPorNombre",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIdSistemaPorModulo")) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorModulo(id_sistemaBusquedaPorIdSistemaPorModulo,id_moduloBusquedaPorIdSistemaPorModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getOpcionsBusquedaPorIdSistemaPorModulo(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSistemaPorModulo,id_moduloBusquedaPorIdSistemaPorModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorModulo(id_sistemaBusquedaPorIdSistemaPorModulo,id_moduloBusquedaPorIdSistemaPorModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorModulo(id_sistemaBusquedaPorIdSistemaPorModulo,id_moduloBusquedaPorIdSistemaPorModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getOpcionsBusquedaPorIdSistemaPorModulo(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSistemaPorModulo,id_moduloBusquedaPorIdSistemaPorModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorModulo(id_sistemaBusquedaPorIdSistemaPorModulo,id_moduloBusquedaPorIdSistemaPorModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSistemaPorModulo(id_sistemaBusquedaPorIdSistemaPorModulo,id_moduloBusquedaPorIdSistemaPorModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOpcions("BusquedaPorIdSistemaPorModulo",opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOpcions("BusquedaPorIdSistemaPorModulo",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSistema")) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getOpcionsFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getOpcionsFK_IdSistema(finalQueryGlobal,pagination,id_sistemaFK_IdSistema);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdSistema(id_sistemaFK_IdSistema);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOpcions("FK_IdSistema",opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOpcions("FK_IdSistema",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoTeclaMascara")) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					opcionLogic.getOpcionsFK_IdTipoTeclaMascara(finalQueryGlobal,pagination,id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=opcionLogic.getOpcions()==null||opcionLogic.getOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=opcions==null|| opcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionsAux=new ArrayList<Opcion>();
						opcionsAux.addAll(opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcionsAux=new ArrayList<Opcion>();
							opcionsAux.addAll(opcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							opcionLogic.getOpcionsFK_IdTipoTeclaMascara(finalQueryGlobal,pagination,id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OpcionConstantesFunciones.getDetalleIndiceFK_IdTipoTeclaMascara(id_tipo_tecla_mascaraFK_IdTipoTeclaMascara);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOpcions("FK_IdTipoTeclaMascara",opcionLogic.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOpcions("FK_IdTipoTeclaMascara",opcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionLogic.setOpcions(new ArrayList<Opcion>());
						opcionLogic.getOpcions().addAll(opcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcions=new ArrayList<Opcion>();
							opcions.addAll(opcionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesOpcion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessOpcion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=opcionLogic.getOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=opcions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=opcionLogic.getOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=opcions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Opcion opcion) {
		Boolean permite=true;
		
		if(this.opcion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=OpcionConstantesFunciones.getOrderByListaOpcion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=OpcionConstantesFunciones.getOrderByListaOpcion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Opcion opcion:opcionLogic.getOpcions()) {
				if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
					opcionTotales=opcion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Opcion opcion:this.opcions) {
				if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
					opcionTotales=opcion;
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
			this.opcionAux=new Opcion();
			this.opcionAux.setsType(Constantes2.S_TOTALES);
			this.opcionAux.setIsNew(false);
			this.opcionAux.setIsChanged(false);
			this.opcionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				OpcionConstantesFunciones.TotalizarValoresFilaOpcion(this.opcionLogic.getOpcions(),this.opcionAux);
				
				this.opcionLogic.getOpcions().add(this.opcionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				OpcionConstantesFunciones.TotalizarValoresFilaOpcion(this.opcions,this.opcionAux);
				
				this.opcions.add(this.opcionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		opcionTotales=new Opcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.opcionLogic.getOpcions().remove(opcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.opcions.remove(opcionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		opcionTotales=new Opcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Opcion opcion:opcionLogic.getOpcions()) {
				if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
					opcionTotales=opcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				OpcionConstantesFunciones.TotalizarValoresFilaOpcion(this.opcionLogic.getOpcions(),opcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Opcion opcion:this.opcions) {
				if(opcion.getsType().equals(Constantes2.S_TOTALES)) {
					opcionTotales=opcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				OpcionConstantesFunciones.TotalizarValoresFilaOpcion(this.opcions,opcionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getOpcionsBusquedaPorIdModuloPorIdOpcion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdModuloPorIdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOpcionsBusquedaPorIdModuloPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdModuloPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOpcionsBusquedaPorIdSistemaPorModulo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdSistemaPorModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOpcionsFK_IdGrupoOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOpcionsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOpcionsFK_IdOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOpcionsFK_IdSistema()throws Exception {
		try {
			sAccionBusqueda="FK_IdSistema";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOpcionsFK_IdTipoTeclaMascara()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoTeclaMascara";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getOpcionsBusquedaPorIdModuloPorIdOpcion(String sFinalQuery,Long id_sistema,Long id_modulo,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionsBusquedaPorIdModuloPorIdOpcion(sFinalQuery,this.pagination,id_sistema,id_modulo,id_opcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOpcionsBusquedaPorIdModuloPorNombre(String sFinalQuery,Long id_sistema,Long id_modulo,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionsBusquedaPorIdModuloPorNombre(sFinalQuery,this.pagination,id_sistema,id_modulo,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOpcionsBusquedaPorIdSistemaPorModulo(String sFinalQuery,Long id_sistema,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionsBusquedaPorIdSistemaPorModulo(sFinalQuery,this.pagination,id_sistema,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOpcionsFK_IdGrupoOpcion(String sFinalQuery,Long id_grupo_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionsFK_IdGrupoOpcion(sFinalQuery,this.pagination,id_grupo_opcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOpcionsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOpcionsFK_IdOpcion(String sFinalQuery,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionsFK_IdOpcion(sFinalQuery,this.pagination,id_opcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOpcionsFK_IdSistema(String sFinalQuery,Long id_sistema)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionsFK_IdSistema(sFinalQuery,this.pagination,id_sistema);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOpcionsFK_IdTipoTeclaMascara(String sFinalQuery,Long id_tipo_tecla_mascara)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLogic.getOpcionsFK_IdTipoTeclaMascara(sFinalQuery,this.pagination,id_tipo_tecla_mascara);
				
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
	
	public void inicializarPermisosOpcion() {
		this.isPermisoTodoOpcion=false;
		this.isPermisoNuevoOpcion=false;
		this.isPermisoActualizarOpcion=false;
		this.isPermisoActualizarOriginalOpcion=false;
		this.isPermisoEliminarOpcion=false;
		this.isPermisoGuardarCambiosOpcion=false;
		this.isPermisoConsultaOpcion=false;
		this.isPermisoBusquedaOpcion=false;
		this.isPermisoReporteOpcion=false;		
		this.isPermisoOrdenOpcion=false;		
		this.isPermisoPaginacionMedioOpcion=false;		
		this.isPermisoPaginacionAltoOpcion=false;
		this.isPermisoPaginacionTodoOpcion=false;
		this.isPermisoCopiarOpcion=false;		
		this.isPermisoVerFormOpcion=false;		
		this.isPermisoDuplicarOpcion=false;		
		this.isPermisoOrdenOpcion=false;		
	}
	
	public void setPermisosUsuarioOpcion(Boolean isPermiso) {
		this.isPermisoTodoOpcion=isPermiso;
		this.isPermisoNuevoOpcion=isPermiso;
		this.isPermisoActualizarOpcion=isPermiso;
		this.isPermisoActualizarOriginalOpcion=isPermiso;
		this.isPermisoEliminarOpcion=isPermiso;
		this.isPermisoGuardarCambiosOpcion=isPermiso;
		this.isPermisoConsultaOpcion=isPermiso;
		this.isPermisoBusquedaOpcion=isPermiso;
		this.isPermisoReporteOpcion=isPermiso;
		this.isPermisoOrdenOpcion=isPermiso;		
		this.isPermisoPaginacionMedioOpcion=isPermiso;		
		this.isPermisoPaginacionAltoOpcion=isPermiso;		
		this.isPermisoPaginacionTodoOpcion=isPermiso;		
		this.isPermisoCopiarOpcion=isPermiso;		
		this.isPermisoVerFormOpcion=isPermiso;		
		this.isPermisoDuplicarOpcion=isPermiso;
		this.isPermisoOrdenOpcion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioOpcion(Boolean isPermiso) {
		//this.isPermisoTodoOpcion=isPermiso;
		this.isPermisoNuevoOpcion=isPermiso;
		this.isPermisoActualizarOpcion=isPermiso;
		this.isPermisoActualizarOriginalOpcion=isPermiso;
		this.isPermisoEliminarOpcion=isPermiso;
		this.isPermisoGuardarCambiosOpcion=isPermiso;
		//this.isPermisoConsultaOpcion=isPermiso;
		//this.isPermisoBusquedaOpcion=isPermiso;
		//this.isPermisoReporteOpcion=isPermiso;
		//this.isPermisoOrdenOpcion=isPermiso;		
		//this.isPermisoPaginacionMedioOpcion=isPermiso;		
		//this.isPermisoPaginacionAltoOpcion=isPermiso;		
		//this.isPermisoPaginacionTodoOpcion=isPermiso;		
		//this.isPermisoCopiarOpcion=isPermiso;		
		//this.isPermisoDuplicarOpcion=isPermiso;
		//this.isPermisoOrdenOpcion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioOpcionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(UsuarioOpcionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(OpcionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(AccionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PerfilOpcionConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CampoConstantesFunciones.SNOMBREOPCION);
		
		if(OpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosUsuarioOpcion=this.verificarGetPermisosUsuarioOpcionOpcionClaseRelacionada(this.opcionsRelacionadas,UsuarioOpcionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosOpcion=false;
		this.isTienePermisosOpcion=this.verificarGetPermisosUsuarioOpcionOpcionClaseRelacionada(this.opcionsRelacionadas,OpcionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosAccion=false;
		this.isTienePermisosAccion=this.verificarGetPermisosUsuarioOpcionOpcionClaseRelacionada(this.opcionsRelacionadas,AccionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPerfilOpcion=false;
		this.isTienePermisosPerfilOpcion=this.verificarGetPermisosUsuarioOpcionOpcionClaseRelacionada(this.opcionsRelacionadas,PerfilOpcionConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCampo=false;
		this.isTienePermisosCampo=this.verificarGetPermisosUsuarioOpcionOpcionClaseRelacionada(this.opcionsRelacionadas,CampoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebOpcion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioOpcionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosUsuarioOpcion=conPermiso;
		this.isTienePermisosOpcion=conPermiso;
		this.isTienePermisosAccion=conPermiso;
		this.isTienePermisosPerfilOpcion=conPermiso;
		this.isTienePermisosCampo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionOpcionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioOpcionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosUsuarioOpcion && this.jInternalFrameDetalleFormOpcion!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.remove(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosOpcion && this.jInternalFrameDetalleFormOpcion!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.remove(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosAccion && this.jInternalFrameDetalleFormOpcion!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.remove(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPerfilOpcion && this.jInternalFrameDetalleFormOpcion!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.remove(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCampo && this.jInternalFrameDetalleFormOpcion!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.remove(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioOpcion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(OpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.opcionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, OpcionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoOpcion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOpcion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalOpcion=this.isPermisoActualizarOpcion;
			this.isPermisoEliminarOpcion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosOpcion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaOpcion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaOpcion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoOpcion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteOpcion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenOpcion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioOpcion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoOpcion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoOpcion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarOpcion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormOpcion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarOpcion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenOpcion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.opcionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosOpcion.setToolTipText(this.jTableDatosOpcion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioOpcion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioOpcion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(OpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(OpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioOpcion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosUsuarioOpcion && this.opcionConstantesFunciones.mostrarUsuarioOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Usuario Opcion");
			reporte.setsDescripcion("Usuario Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosOpcion && this.opcionConstantesFunciones.mostrarOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Opcion");
			reporte.setsDescripcion("Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosAccion && this.opcionConstantesFunciones.mostrarAccionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Accion");
			reporte.setsDescripcion("Accion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPerfilOpcion && this.opcionConstantesFunciones.mostrarPerfilOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Perfil Opcion");
			reporte.setsDescripcion("Perfil Opcion");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCampo && this.opcionConstantesFunciones.mostrarCampoOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Campo");
			reporte.setsDescripcion("Campo");
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
	public void inicializarCombosForeignKeyOpcionListas()throws Exception {
		try	{						
			
				this.sistemasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.grupoopcionsForeignKey=new ArrayList();
				this.opcionsForeignKey=new ArrayList();
				this.tipoteclamascarasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyOpcionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(OpcionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyOpcionListas(false);
			} else {
			
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoTeclaMascaraListas(cargarCombosDependencia,sFinalQueryCombo);
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

			if((this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0)) {
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

	public void cargarCombosForeignKeyTipoTeclaMascaraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoteclamascarasForeignKey==null||this.tipoteclamascarasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoTeclaMascaraConstantesFunciones.getArrayColumnasGlobalesTipoTeclaMascara(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTeclaMascaraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoTeclaMascaraConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoTeclaMascarasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyOpcionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			OpcionParameterReturnGeneral opcionReturnGeneral=new OpcionParameterReturnGeneral();
						
			


				String finalQueryGlobalSistema="";

				if(((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0) && this.opcionConstantesFunciones.cargarid_sistemaOpcion)
					 || (this.esRecargarFks && this.opcionConstantesFunciones.cargarid_sistemaOpcion)) {

					if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSistema=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

						finalQueryGlobalSistema=Funciones.GetFinalQueryAppend(finalQueryGlobalSistema, "");
						finalQueryGlobalSistema+=SistemaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSistema=" WHERE " + ConstantesSql.ID + "="+opcionSessionBean.getlidSistemaActual();
					}
				} else {
					finalQueryGlobalSistema="NONE";
				}


				String finalQueryGlobalModulo="";

				if(cargarCombosDependencia && ((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.opcionConstantesFunciones.cargarid_moduloOpcion)
					 || (this.esRecargarFks && this.opcionConstantesFunciones.cargarid_moduloOpcion)) {

					if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+opcionSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalGrupoOpcion="";

				if(cargarCombosDependencia && ((this.grupoopcionsForeignKey==null||this.grupoopcionsForeignKey.size()<=0) && this.opcionConstantesFunciones.cargarid_grupo_opcionOpcion)
					 || (this.esRecargarFks && this.opcionConstantesFunciones.cargarid_grupo_opcionOpcion)) {

					if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=GrupoOpcionConstantesFunciones.getArrayColumnasGlobalesGrupoOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrupoOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoOpcionConstantesFunciones.TABLENAME);

						finalQueryGlobalGrupoOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalGrupoOpcion, "");
						finalQueryGlobalGrupoOpcion+=GrupoOpcionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosGrupoOpcionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrupoOpcion=" WHERE " + ConstantesSql.ID + "="+opcionSessionBean.getlidGrupoOpcionActual();
					}
				} else {
					finalQueryGlobalGrupoOpcion="NONE";
				}


				String finalQueryGlobalOpcion="";

				if(((this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0) && this.opcionConstantesFunciones.cargarid_opcionOpcion)
					 || (this.esRecargarFks && this.opcionConstantesFunciones.cargarid_opcionOpcion)) {

					if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);

						finalQueryGlobalOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalOpcion, "");
						finalQueryGlobalOpcion+=OpcionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOpcionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOpcion=" WHERE " + ConstantesSql.ID + "="+opcionSessionBean.getlidOpcionActual();
					}
				} else {
					finalQueryGlobalOpcion="NONE";
				}


				String finalQueryGlobalTipoTeclaMascara="";

				if(((this.tipoteclamascarasForeignKey==null||this.tipoteclamascarasForeignKey.size()<=0) && this.opcionConstantesFunciones.cargarid_tipo_tecla_mascaraOpcion)
					 || (this.esRecargarFks && this.opcionConstantesFunciones.cargarid_tipo_tecla_mascaraOpcion)) {

					if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTeclaMascara()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoTeclaMascaraConstantesFunciones.getArrayColumnasGlobalesTipoTeclaMascara(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoTeclaMascara=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoTeclaMascaraConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoTeclaMascara=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoTeclaMascara, "");
						finalQueryGlobalTipoTeclaMascara+=TipoTeclaMascaraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoTeclaMascarasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoTeclaMascara=" WHERE " + ConstantesSql.ID + "="+opcionSessionBean.getlidTipoTeclaMascaraActual();
					}
				} else {
					finalQueryGlobalTipoTeclaMascara="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				opcionReturnGeneral=opcionLogic.cargarCombosLoteForeignKeyOpcion(finalQueryGlobalSistema,finalQueryGlobalModulo,finalQueryGlobalGrupoOpcion,finalQueryGlobalOpcion,finalQueryGlobalTipoTeclaMascara);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSistema.equals("NONE")) {
				this.sistemasForeignKey=opcionReturnGeneral.getsistemasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=opcionReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalGrupoOpcion.equals("NONE")) {
				this.grupoopcionsForeignKey=opcionReturnGeneral.getgrupoopcionsForeignKey();
			}

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				this.opcionsForeignKey=opcionReturnGeneral.getopcionsForeignKey();
			}

			if(!finalQueryGlobalTipoTeclaMascara.equals("NONE")) {
				this.tipoteclamascarasForeignKey=opcionReturnGeneral.gettipoteclamascarasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyOpcion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeySistema();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyGrupoOpcion();
			this.addItemDefectoCombosForeignKeyOpcion();
			this.addItemDefectoCombosForeignKeyTipoTeclaMascara();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeySistema()throws Exception {
		try {
			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
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

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {
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

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
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

	public void addItemDefectoCombosForeignKeyTipoTeclaMascara()throws Exception {
		try {

			if(!this.opcionSessionBean.getisBusquedaDesdeForeignKeySesionTipoTeclaMascara()) {
				TipoTeclaMascara tipoteclamascara=new TipoTeclaMascara();
				TipoTeclaMascaraConstantesFunciones.setTipoTeclaMascaraDescripcion(tipoteclamascara,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoteclamascara.setId(null);

				if(!TipoTeclaMascaraConstantesFunciones.ExisteEnLista(this.tipoteclamascarasForeignKey,tipoteclamascara,true)) {

					this.tipoteclamascarasForeignKey.add(0,tipoteclamascara);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyOpcion()throws Exception {
		try {
			
			this.initActionsCombosForeignKeySistema("Todos");
			this.initActionsCombosForeignKeyModulo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyOpcion(String sFormularioTipoBusqueda)throws Exception {
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
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeySistema(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.addItemListener(new ComboBoxItemListener(this,"id_sistemaOpcion"));
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaOpcion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.addActionListener(new ComboBoxActionListener(this,"id_sistemaOpcion"));
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaOpcion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion"));

					} else {
						this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion"));

					} else {
						this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion"));

					} else {
						this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_sistemaFK_IdSistemaOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_sistemaFK_IdSistemaOpcion"));

						this.jComboBoxid_sistemaFK_IdSistemaOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaFK_IdSistemaOpcion"));

					} else {
						this.jComboBoxid_sistemaFK_IdSistemaOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_sistemaFK_IdSistemaOpcion"));

						this.jComboBoxid_sistemaFK_IdSistemaOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaFK_IdSistemaOpcion"));

					}
			
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
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.addItemListener(new ComboBoxItemListener(this,"id_moduloOpcion"));
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_moduloOpcion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormOpcion!=null) {
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.addActionListener(new ComboBoxActionListener(this,"id_moduloOpcion"));
						this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_moduloOpcion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion"));

					} else {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion"));

					} else {
						this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion"));

					} else {
						this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyOpcion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyOpcion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyOpcion(Opcion opcion)throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(opcion.getid_sistema(),false,"Formulario");
			this.setActualModuloForeignKey(opcion.getid_modulo(),false,"Formulario");
			this.setActualGrupoOpcionForeignKey(opcion.getid_grupo_opcion(),false,"Formulario");
			this.setActualOpcionForeignKey(opcion.getid_opcion(),false,"Formulario");
			this.setActualTipoTeclaMascaraForeignKey(opcion.getid_tipo_tecla_mascara(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyOpcion(Opcion opcion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyOpcion()throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(this.opcionConstantesFunciones.getid_sistema(),false,"Formulario");
			this.setActualModuloForeignKey(this.opcionConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualGrupoOpcionForeignKey(this.opcionConstantesFunciones.getid_grupo_opcion(),false,"Formulario");
			this.setActualOpcionForeignKey(this.opcionConstantesFunciones.getid_opcion(),false,"Formulario");
			this.setActualTipoTeclaMascaraForeignKey(this.opcionConstantesFunciones.getid_tipo_tecla_mascara(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyOpcion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyOpcion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyOpcion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroOpcion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyOpcion()throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameGrupoOpcionsForeignKey("Todos");
			this.cargarCombosFrameOpcionsForeignKey("Todos");
			this.cargarCombosFrameTipoTeclaMascarasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyOpcion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoOpcionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoTeclaMascarasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyOpcion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion!=null && this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion!=null && this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion!=null && this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion!=null && this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion!=null && this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormOpcionSistema(JComboBox<?> jComboBoxGenericoSistema,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormOpcionid_modulo(jComboBoxGenericoSistema,sFormularioTipoBusqueda,"Sistema",false);
	}

	public void recargarFormOpcionModulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormOpcionid_grupo_opcion(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
	}






	
	



	public void recargarFormOpcionid_modulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Sistema")){
				this.setActualParaGuardarSistemaForeignKey(this.opcion,jComboBoxGenericoModulo);
			}

			if(this.opcion.getid_sistema()!=null && this.opcion.getid_sistema()!=0L) {
				sFinalQuery+="  WHERE  id_sistema="+this.opcion.getid_sistema();
			} else {
				sFinalQuery+="  WHERE  id_sistema=-1";
			}



			//BUCLE RECURSIVO
			this.setActualModuloForeignKey(this.opcion.getid_sistema(),true,sFormularioTipoBusqueda);

			this.cargarCombosModulosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormOpcionid_grupo_opcion(JComboBox<?> jComboBoxGenericoGrupoOpcion,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.opcion,jComboBoxGenericoGrupoOpcion);
			}

			if(this.opcion.getid_modulo()!=null && this.opcion.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.opcion.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualGrupoOpcionForeignKey(this.opcion.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosGrupoOpcionsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameGrupoOpcionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public OpcionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public OpcionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public OpcionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.opcionSessionBean=new OpcionSessionBean(); 
		this.opcionConstantesFunciones=new OpcionConstantesFunciones(); 
		this.opcionBean=new Opcion();//(this.opcionConstantesFunciones); 		
		this.opcionReturnGeneral=new OpcionParameterReturnGeneral(); 
		
		this.opcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.opcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public OpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public OpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public OpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessOpcion(true);
			
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
			
			this.opcionConstantesFunciones=new OpcionConstantesFunciones(); 
			this.opcionBean=new Opcion();//this.opcionConstantesFunciones); 			
			this.opcionReturnGeneral=new OpcionParameterReturnGeneral(); 
		
			OpcionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Opcion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.opcion=new Opcion();
			this.opcions = new ArrayList<Opcion>();
			this.opcionsAux = new ArrayList<Opcion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic=new OpcionLogic();
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			//this.opcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.opcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormOpcion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoOpcion);	
					}
					
					if(this.jInternalFrameImportacionOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionOpcion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByOpcion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormOpcion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormOpcion);
				this.jInternalFrameDetalleFormOpcion.setVisible(false);
				this.jInternalFrameDetalleFormOpcion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoOpcion);
					this.jInternalFrameReporteDinamicoOpcion.setVisible(false);
					this.jInternalFrameReporteDinamicoOpcion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionOpcion);
					this.jInternalFrameImportacionOpcion.setVisible(false);
					this.jInternalFrameImportacionOpcion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByOpcion);
					this.jInternalFrameOrderByOpcion.setVisible(false);
					this.jInternalFrameOrderByOpcion.setSelected(false);				
				}
				
			}
			
			this.opcionsArbol= new ArrayList<Opcion>();
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTreeOpcion);    		
			}
			
			this.jDesktopPane.add(this.jInternalFrameTreeOpcion);
			this.jInternalFrameTreeOpcion.setVisible(false);
	        this.jInternalFrameTreeOpcion.setSelected(false);						
			
			if(!esParaBusquedaForeignKey) {
				this.getTodosOpcionArbol();
			}			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idOpcionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=OpcionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.opcionReturnGeneral=new OpcionParameterReturnGeneral();
			
			this.opcionParameterGeneral=new OpcionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.opcionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(OpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.opcionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(UsuarioOpcionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(OpcionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(AccionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PerfilOpcionConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CampoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,OpcionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.opcionSessionBean.getEsGuardarRelacionado(),this.opcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,OpcionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.opcionSessionBean.getEsGuardarRelacionado(),this.opcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoOpcion=false;
			this.isVisibilidadCeldaDuplicarOpcion=true;
			this.isVisibilidadCeldaCopiarOpcion=true;
			this.isVisibilidadCeldaVerFormOpcion=true;
			this.isVisibilidadCeldaOrdenOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesOpcion=false;
			this.isVisibilidadCeldaModificarOpcion=false;
			this.isVisibilidadCeldaActualizarOpcion=false;
			this.isVisibilidadCeldaEliminarOpcion=false;
			this.isVisibilidadCeldaCancelarOpcion=false;
			this.isVisibilidadCeldaGuardarOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosOpcion=false;
			
			
			this.isVisibilidadBusquedaPorIdModuloPorIdOpcion=true;
			this.isVisibilidadBusquedaPorIdModuloPorNombre=true;
			this.isVisibilidadBusquedaPorIdSistemaPorModulo=true;
			this.isVisibilidadFK_IdGrupoOpcion=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdOpcion=true;
			this.isVisibilidadFK_IdSistema=true;
			this.isVisibilidadFK_IdTipoTeclaMascara=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosOpcion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioOpcion(false);
			
			this.setPermisosUsuarioOpcion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.opcionSessionBean.getEsGuardarRelacionado() 
				|| (this.opcionSessionBean.getEsGuardarRelacionado() && this.opcionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioOpcionClasesRelacionadas();
			}
			
			if(this.opcionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioOpcionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!OpcionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosOpcion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualOpcion();
			}
			
			if(!this.isPermisoBusquedaOpcion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasOpcion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.opcionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioOpcion,this.isPermisoPaginacionMedioOpcion,this.isPermisoPaginacionTodoOpcion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(OpcionConstantesFunciones.getTiposSeleccionarOpcion());
				
				this.tiposColumnasSelect=OpcionConstantesFunciones.getTiposSeleccionarOpcion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectOpcion();				
				//this.tiposRelacionesSelect=OpcionConstantesFunciones.getTiposRelacionesOpcion(true);
				
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
			//if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioOpcion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioOpcion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioOpcion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesOpcion() ;
			
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
			this.accionLogic=new AccionLogic();
			this.perfilopcionLogic=new PerfilOpcionLogic();
			this.campoLogic=new CampoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.sistemaLogic=new SistemaLogic();
			this.moduloLogic=new ModuloLogic();
			this.grupoopcionLogic=new GrupoOpcionLogic();
			this.tipoteclamascaraLogic=new TipoTeclaMascaraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				opcionImplementable= (OpcionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+OpcionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				opcionImplementableHome= (OpcionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+OpcionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.opcions= new ArrayList<Opcion>();
			this.opcionsEliminados= new ArrayList<Opcion>();
						
			this.isEsNuevoOpcion=false;
			this.esParaAccionDesdeFormularioOpcion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.sistemasForeignKey=new ArrayList<Sistema>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.grupoopcionsForeignKey=new ArrayList<GrupoOpcion>() ;
			this.opcionsForeignKey=new ArrayList<Opcion>() ;
			this.tipoteclamascarasForeignKey=new ArrayList<TipoTeclaMascara>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyOpcion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroOpcion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			OpcionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=OpcionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingOpcion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormOpcion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioOpcion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioOpcion();
			}
			
			OpcionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasOpcion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasOpcion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasOpcion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessOpcion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Opcion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectOpcion() {
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
		reporte.setsCodigo(AccionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AccionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CampoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CampoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesOpcion")) {
				iIndex=this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosOpcion.getSelectedRow();	
				
				

				if(sTitle.equals("Acciones")) {
					if(!AccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessOpcion();

						this.cargarParteTabPanelRelacionadaAccion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Campos")) {
					if(!CampoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessOpcion();

						this.cargarParteTabPanelRelacionadaCampo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Opciones")) {
					if(!OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessOpcion();

						this.cargarParteTabPanelRelacionadaOpcion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Perfil Opciones")) {
					if(!PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessOpcion();

						this.cargarParteTabPanelRelacionadaPerfilOpcion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Usuario Opciones")) {
					if(!UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessOpcion();

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
				this.finishProcessOpcion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAccion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormOpcion.cargarSessionConBeanSwingJInternalFrameAccion(false,true,iIndex);
		this.jButtonAccionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAccion();

		//this.jTabbedPaneRelacionesOpcion.updateUI();
		//this.jTabbedPaneRelacionesOpcion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesOpcion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCampo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormOpcion.cargarSessionConBeanSwingJInternalFrameCampo(false,true,iIndex);
		this.jButtonCampoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCampo();

		//this.jTabbedPaneRelacionesOpcion.updateUI();
		//this.jTabbedPaneRelacionesOpcion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesOpcion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormOpcion.cargarSessionConBeanSwingJInternalFrameOpcion(false,true,iIndex);
		this.jButtonOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaOpcion();

		//this.jTabbedPaneRelacionesOpcion.updateUI();
		//this.jTabbedPaneRelacionesOpcion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesOpcion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPerfilOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormOpcion.cargarSessionConBeanSwingJInternalFramePerfilOpcion(false,true,iIndex);
		this.jButtonPerfilOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPerfilOpcion();

		//this.jTabbedPaneRelacionesOpcion.updateUI();
		//this.jTabbedPaneRelacionesOpcion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesOpcion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaUsuarioOpcion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormOpcion.cargarSessionConBeanSwingJInternalFrameUsuarioOpcion(false,true,iIndex);
		this.jButtonUsuarioOpcionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaUsuarioOpcion();

		//this.jTabbedPaneRelacionesOpcion.updateUI();
		//this.jTabbedPaneRelacionesOpcion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesOpcion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("UsuarioOpcion")) {
				int row=this.jTableDatosOpcion.getSelectedRow();
				jButtonUsuarioOpcionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Opcion")) {
				int row=this.jTableDatosOpcion.getSelectedRow();
				jButtonOpcionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Accion")) {
				int row=this.jTableDatosOpcion.getSelectedRow();
				jButtonAccionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PerfilOpcion")) {
				int row=this.jTableDatosOpcion.getSelectedRow();
				jButtonPerfilOpcionActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Campo")) {
				int row=this.jTableDatosOpcion.getSelectedRow();
				jButtonCampoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Usuario Opcion")) {

					if(this.isTienePermisosUsuarioOpcion && this.opcionConstantesFunciones.mostrarUsuarioOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Usuario Opciones"+"("+UsuarioOpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Usuario Opciones");

						if(opcionConstantesFunciones.resaltarUsuarioOpcionOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFunciones.resaltarUsuarioOpcionOpcion);
						}

						jmenuItem.setEnabled(this.opcionConstantesFunciones.activarUsuarioOpcionOpcion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"UsuarioOpcion"));

						

						this.jInternalFrameDetalleFormOpcion.jmenuDetalleOpcion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Opcion")) {

					if(this.isTienePermisosOpcion && this.opcionConstantesFunciones.mostrarOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Opciones"+"("+OpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Opciones");

						if(opcionConstantesFunciones.resaltarOpcionOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFunciones.resaltarOpcionOpcion);
						}

						jmenuItem.setEnabled(this.opcionConstantesFunciones.activarOpcionOpcion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Opcion"));

						

						this.jInternalFrameDetalleFormOpcion.jmenuDetalleOpcion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Accion")) {

					if(this.isTienePermisosAccion && this.opcionConstantesFunciones.mostrarAccionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Acciones"+"("+AccionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Acciones");

						if(opcionConstantesFunciones.resaltarAccionOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFunciones.resaltarAccionOpcion);
						}

						jmenuItem.setEnabled(this.opcionConstantesFunciones.activarAccionOpcion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Accion"));

						

						this.jInternalFrameDetalleFormOpcion.jmenuDetalleOpcion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Perfil Opcion")) {

					if(this.isTienePermisosPerfilOpcion && this.opcionConstantesFunciones.mostrarPerfilOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Perfil Opciones"+"("+PerfilOpcionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Perfil Opciones");

						if(opcionConstantesFunciones.resaltarPerfilOpcionOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFunciones.resaltarPerfilOpcionOpcion);
						}

						jmenuItem.setEnabled(this.opcionConstantesFunciones.activarPerfilOpcionOpcion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PerfilOpcion"));

						

						this.jInternalFrameDetalleFormOpcion.jmenuDetalleOpcion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Campo")) {

					if(this.isTienePermisosCampo && this.opcionConstantesFunciones.mostrarCampoOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Campos"+"("+CampoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Campos");

						if(opcionConstantesFunciones.resaltarCampoOpcion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(opcionConstantesFunciones.resaltarCampoOpcion);
						}

						jmenuItem.setEnabled(this.opcionConstantesFunciones.activarCampoOpcion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Campo"));

						

						this.jInternalFrameDetalleFormOpcion.jmenuDetalleOpcion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyOpcion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyOpcion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyOpcionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyOpcion();
		
		this.cargarCombosFrameForeignKeyOpcion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyOpcion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyOpcion();
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

	public void cargarCombosForeignKeyTipoTeclaMascara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoTeclaMascaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoTeclaMascara();
				this.cargarCombosFrameTipoTeclaMascarasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoTeclaMascara(this.tipoteclamascarasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoOpcionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.opcionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
			
			if(jTableDatosOpcion.getRowCount()>=1) {
				jTableDatosOpcion.removeRowSelectionInterval(0, jTableDatosOpcion.getRowCount()-1);						
			}
			
			this.isEsNuevoOpcion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoOpcion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesOpcion(true);			
			//this.opcion=new Opcion();
			//this.opcion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesOpcion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualOpcion() ;
			
			if(OpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleOpcion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.opcion);	
			this.actualizarInformacion("INFO_PADRE",false,this.opcion);				
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
			if(this.opcionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Opcion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarOpcionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosOpcion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosOpcion.getSelectedRows().length;			
			}
			
			opcionsSeleccionados=this.getOpcionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoOpcion--;			
				//Opcion opcionAux= new Opcion();			
				//opcionAux.setId(this.iIdNuevoOpcion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Opcion opcionOrigen=new Opcion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Opcion opcionOrigen : opcionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							opcionOrigen =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							opcionOrigen =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaOpcion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.opcion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosOpcion(opcionOrigen,this.opcion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.opcionLogic.getOpcions().add(this.opcionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.opcions.add(this.opcionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaOpcion(false);
				
				this.jTableDatosOpcion.setRowSelectionInterval(this.getIndiceNuevoOpcion(), this.getIndiceNuevoOpcion());
				
				int iLastRow =  this.jTableDatosOpcion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosOpcion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosOpcion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaOpcion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();									
		
			Opcion opcionOrigen=new Opcion();
			Opcion opcionDestino=new Opcion();
				
			opcionsSeleccionados=this.getOpcionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosOpcion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || opcionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosOpcion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionOrigen =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						opcionOrigen =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						opcionDestino =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						opcionDestino =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				opcionOrigen =opcionsSeleccionados.get(0);
				opcionDestino =opcionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosOpcion(opcionOrigen,opcionDestino,true,false);
				
				opcionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(opcionDestino,opcionLogic.getOpcions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(opcionDestino,opcions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaOpcion(false);
				
				//this.jTableDatosOpcion.setRowSelectionInterval(this.getIndiceNuevoOpcion(), this.getIndiceNuevoOpcion());
				
				int iLastRow =  this.jTableDatosOpcion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosOpcion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosOpcion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaOpcion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormOpcion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesOpcion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasOpcion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesOpcion.setVisible(!isVisible);
			this.jPanelPaginacionOpcion.setVisible(!isVisible);
			this.jPanelAccionesOpcion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameOpcion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByOpcion();
			
			this.abrirFrameOrderByOpcion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleOpcion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormOpcion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormOpcion.isMaximum()) {
					this.jInternalFrameDetalleFormOpcion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormOpcion.setSize(this.jInternalFrameDetalleFormOpcion.iWidthFormulario,this.jInternalFrameDetalleFormOpcion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormOpcion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormOpcion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormOpcion.isMaximum()) {
						this.jInternalFrameDetalleFormOpcion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth(),OpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth(),OpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth(),OpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAccion();
					}

					if(CampoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCampo();
					}

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
			
		
	       	this.jInternalFrameDetalleFormOpcion.setVisible(true);
	        this.jInternalFrameDetalleFormOpcion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByOpcion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByOpcion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOpcion,false,this);
				} else {
					this.jInternalFrameOrderByOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOpcion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByOpcion);
				this.jInternalFrameOrderByOpcion.setVisible(false);
				this.jInternalFrameOrderByOpcion.setSelected(false);
				
				this.jInternalFrameOrderByOpcion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByOpcion"));
				
				this.inicializarActualizarBindingTablaOrderByOpcion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionOpcion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionOpcion==null) {
				
				this.jInternalFrameImportacionOpcion=new ImportacionJInternalFrame(OpcionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionOpcion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionOpcion);
				this.jInternalFrameImportacionOpcion.setVisible(false);
				this.jInternalFrameImportacionOpcion.setSelected(false);


				this.jInternalFrameImportacionOpcion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionOpcion"));
				this.jInternalFrameImportacionOpcion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionOpcion"));
				this.jInternalFrameImportacionOpcion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionOpcion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoOpcion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoOpcion==null) {
				this.jInternalFrameReporteDinamicoOpcion=new ReporteDinamicoJInternalFrame(OpcionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoOpcion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoOpcion);
				this.jInternalFrameReporteDinamicoOpcion.setVisible(false);
				this.jInternalFrameReporteDinamicoOpcion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoOpcion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoOpcion"));
				this.jInternalFrameReporteDinamicoOpcion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoOpcion"));
				this.jInternalFrameReporteDinamicoOpcion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoOpcion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualOpcion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAccion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jScrollPanelDatosAccion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jScrollPanelDatosAccion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jScrollPanelDatosAccion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.jScrollPanelDatosAccion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCampo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jScrollPanelDatosCampo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jScrollPanelDatosCampo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jScrollPanelDatosCampo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.jScrollPanelDatosCampo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPerfilOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaUsuarioOpcion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormOpcion.jContentPaneDetalleOpcion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleOpcion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormOpcion);
			
	       	this.jInternalFrameDetalleFormOpcion.setVisible(false);
	        this.jInternalFrameDetalleFormOpcion.setSelected(false);
			
			//this.jInternalFrameDetalleFormOpcion.dispose();
			//this.jInternalFrameDetalleFormOpcion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoOpcion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoOpcion.setVisible(true);
	        this.jInternalFrameReporteDinamicoOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionOpcion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionOpcion.setVisible(true);
	        this.jInternalFrameImportacionOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByOpcion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByOpcion.setVisible(true);
	        this.jInternalFrameOrderByOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByOpcion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByOpcion.setVisible(false);
	        this.jInternalFrameOrderByOpcion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoOpcion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoOpcion.setVisible(false);
	        this.jInternalFrameReporteDinamicoOpcion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionOpcion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionOpcion.setVisible(false);
	        this.jInternalFrameImportacionOpcion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	 public void abrirFrameTreeOpcion(String sTipoProceso) { //throws Exception	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameTreeOpcion);
			
			this.jInternalFrameTreeOpcion.setsTipoProceso(sTipoProceso);
			
			if(sTipoProceso.equals("BUSQUEDA_FK")) {
				this.jInternalFrameTreeOpcion.sTipoBusqueda="Opcion";
			}
			
			this.jInternalFrameTreeOpcion.setOpcions(this.opcionsArbol);
			this.jInternalFrameTreeOpcion.CargarTreeOpcion();
			
	       	this.jInternalFrameTreeOpcion.setVisible(true);
	        this.jInternalFrameTreeOpcion.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			e.getStackTrace();
			//FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	public void cerrarFrameTreeOpcion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameTreeOpcion);
			
	       	this.jInternalFrameTreeOpcion.setVisible(false);
	        this.jInternalFrameTreeOpcion.setSelected(false);
			
			//this.jInternalFrameTreeOpcion.dispose();
			//this.jInternalFrameTreeOpcion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void jButtonModificarOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarOpcion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarOpcion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesOpcion(true);
			//this.isEsNuevoOpcion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesOpcion(false) ;
			
			if(opcionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado() && UsuarioOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUsuarioOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado() && OpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionSessionBean.getEsGuardarRelacionado() && AccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAccionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado() && PerfilOpcionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPerfilOpcionActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoSessionBean.getEsGuardarRelacionado() && CampoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCampoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(OpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleOpcion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualOpcion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaOpcionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarOpcion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesOpcion(true);
			//this.isEsNuevoOpcion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.opcion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesOpcion(false) ;
			
			if(OpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleOpcion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualOpcion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaSistema(List<Sistema> sistemasForeignKey)throws Exception{
		TableColumn tableColumnSistema=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDSISTEMA));
		TableCellEditor tableCellEditorSistema =tableColumnSistema.getCellEditor();

		SistemaTableCell sistemaTableCellFk=(SistemaTableCell)tableCellEditorSistema;

		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.setsistemasForeignKey(sistemasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOpcion.getSelectedRow();

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
		TableColumn tableColumnModulo=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOpcion.getSelectedRow();

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
		TableColumn tableColumnGrupoOpcion=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDGRUPOOPCION));
		TableCellEditor tableCellEditorGrupoOpcion =tableColumnGrupoOpcion.getCellEditor();

		GrupoOpcionTableCell grupoopcionTableCellFk=(GrupoOpcionTableCell)tableCellEditorGrupoOpcion;

		if(grupoopcionTableCellFk!=null) {
			grupoopcionTableCellFk.setgrupoopcionsForeignKey(grupoopcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOpcion.getSelectedRow();

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
		TableColumn tableColumnOpcion=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDOPCION));
		TableCellEditor tableCellEditorOpcion =tableColumnOpcion.getCellEditor();

		OpcionTableCell opcionTableCellFk=(OpcionTableCell)tableCellEditorOpcion;

		if(opcionTableCellFk!=null) {
			opcionTableCellFk.setopcionsForeignKey(opcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//opcionTableCellFk.setRowActual(intSelectedRow);
			//opcionTableCellFk.setopcionsForeignKeyActual(opcionsForeignKey);
		//}


		if(opcionTableCellFk!=null) {
			opcionTableCellFk.RecargarOpcionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoTeclaMascara(List<TipoTeclaMascara> tipoteclamascarasForeignKey)throws Exception{
		TableColumn tableColumnTipoTeclaMascara=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA));
		TableCellEditor tableCellEditorTipoTeclaMascara =tableColumnTipoTeclaMascara.getCellEditor();

		TipoTeclaMascaraTableCell tipoteclamascaraTableCellFk=(TipoTeclaMascaraTableCell)tableCellEditorTipoTeclaMascara;

		if(tipoteclamascaraTableCellFk!=null) {
			tipoteclamascaraTableCellFk.settipoteclamascarasForeignKey(tipoteclamascarasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoteclamascaraTableCellFk.setRowActual(intSelectedRow);
			//tipoteclamascaraTableCellFk.settipoteclamascarasForeignKeyActual(tipoteclamascarasForeignKey);
		//}


		if(tipoteclamascaraTableCellFk!=null) {
			tipoteclamascaraTableCellFk.RecargarTipoTeclaMascarasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesOpcion(false);
			
			//if(!this.isEsNuevoOpcion) {								
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				
			}
			
			if(this.permiteMantenimiento(this.opcion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.opcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoOpcion=true;
					this.inicializarActualizarBindingTablaOpcion(false);
					this.isEsNuevoOpcion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoOpcion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoOpcion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesOpcion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualOpcion(false);
				
				this.habilitarDeshabilitarControlesOpcion(false);
			
												
				
				if(OpcionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleOpcion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoOpcionActionPerformed(evt,opcionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualOpcion(this.opcion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosOpcion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,opcionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.opcion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				this.opcion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				this.opcion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.opcion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.opcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((OpcionModel) this.jTableDatosOpcion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoOpcion=true;
				this.inicializarActualizarBindingTablaOpcion(false);
				this.isEsNuevoOpcion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesOpcion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualOpcion(false);
				
				this.habilitarDeshabilitarControlesOpcion(false);
				
				
				
				if(OpcionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleOpcion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarOpcionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosOpcion.getRowCount()>=1) {
				jTableDatosOpcion.removeRowSelectionInterval(0, jTableDatosOpcion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesOpcion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaOpcion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesOpcion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualOpcion(false) ;
			
			this.isEsNuevoOpcion=false;
			
			if(OpcionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleOpcion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingOpcion(false);
				
				//SI ES MANUAL
				if(OpcionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualOpcion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoOpcion--;			
			//Opcion opcionAux= new Opcion();			
			//opcionAux.setId(this.iIdNuevoOpcion);
			
			if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaOpcion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
			
			this.opcion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.opcionLogic.getOpcions().add(this.opcionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.opcions.add(this.opcionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaOpcion(false);
			
			this.jTableDatosOpcion.setRowSelectionInterval(this.getIndiceNuevoOpcion(), this.getIndiceNuevoOpcion());
			
			int iLastRow =  this.jTableDatosOpcion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosOpcion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosOpcion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaOpcion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingOpcion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingOpcion(false);
			
			//SI ES MANUAL
			if(OpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualOpcion();
			}
			
			//this.abrirFrameTreeOpcion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionOpcionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE OpcionES ?", "MANTENIMIENTO DE Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionOpcion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralOpcion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.opcionReturnGeneral=opcionLogic.procesarImportacionOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.opcionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarOpcionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionOpcionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionOpcion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionOpcion.setFileImportacion(this.jInternalFrameImportacionOpcion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionOpcion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionOpcion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionOpcion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionOpcion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		

		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("OpcionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"OpcionBaseDesign.jrxml";
			
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
			
			this.generarReporteOpcions("Todos",opcionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case OpcionConstantesFunciones.LABEL_IDSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GrupoOpcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GrupoOpcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GrupoOpcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GrupoOpcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_IDOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Opcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Opcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Opcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Opcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoTeclaMascara_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoTeclaMascara_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoTeclaMascara_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoTeclaMascara_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_TECLA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cla_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cla_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cla_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cla_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_POSICION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sicion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sicion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sicion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sicion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_ICONNAME:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_onName_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_onName_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_onName_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_onName_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_NOMBRECLASE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreClase_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreClase_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreClase_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreClase_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_SUBMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_PAQUETE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_quete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_quete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_quete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_quete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_queteOriginal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_queteOriginal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_queteOriginal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_queteOriginal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_PATHAUXILIAR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_thAuxiliar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_thAuxiliar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_thAuxiliar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_thAuxiliar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_ESPARAMENU:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ParaMenu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ParaMenu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ParaMenu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ParaMenu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nMostrarAccionesCampo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nMostrarAccionesCampo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nMostrarAccionesCampo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nMostrarAccionesCampo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GuardarRelaciones_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GuardarRelaciones_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GuardarRelaciones_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GuardarRelaciones_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OpcionConstantesFunciones.LABEL_ESTADO:
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
		
		if(this.jInternalFrameReporteDinamicoOpcion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoOpcion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case OpcionConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoria="id_sistema";
					break;

				case OpcionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case OpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					sNombreCampoCategoria="id_grupo_opcion";
					break;

				case OpcionConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoria="id_opcion";
					break;

				case OpcionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case OpcionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					sNombreCampoCategoria="id_tipo_tecla_mascara";
					break;

				case OpcionConstantesFunciones.LABEL_TECLA:
					sNombreCampoCategoria="tecla";
					break;

				case OpcionConstantesFunciones.LABEL_POSICION:
					sNombreCampoCategoria="posicion";
					break;

				case OpcionConstantesFunciones.LABEL_ICONNAME:
					sNombreCampoCategoria="icon_name";
					break;

				case OpcionConstantesFunciones.LABEL_NOMBRECLASE:
					sNombreCampoCategoria="nombre_clase";
					break;

				case OpcionConstantesFunciones.LABEL_SUBMODULO:
					sNombreCampoCategoria="sub_modulo";
					break;

				case OpcionConstantesFunciones.LABEL_PAQUETE:
					sNombreCampoCategoria="paquete";
					break;

				case OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL:
					sNombreCampoCategoria="paquete_original";
					break;

				case OpcionConstantesFunciones.LABEL_PATHAUXILIAR:
					sNombreCampoCategoria="path_auxiliar";
					break;

				case OpcionConstantesFunciones.LABEL_ESPARAMENU:
					sNombreCampoCategoria="es_para_menu";
					break;

				case OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO:
					sNombreCampoCategoria="con_mostrar_acciones_campo";
					break;

				case OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES:
					sNombreCampoCategoria="es_guardar_relaciones";
					break;

				case OpcionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoOpcion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case OpcionConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoriaValor="id_sistema";
					break;

				case OpcionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case OpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					sNombreCampoCategoriaValor="id_grupo_opcion";
					break;

				case OpcionConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoriaValor="id_opcion";
					break;

				case OpcionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case OpcionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					sNombreCampoCategoriaValor="id_tipo_tecla_mascara";
					break;

				case OpcionConstantesFunciones.LABEL_TECLA:
					sNombreCampoCategoriaValor="tecla";
					break;

				case OpcionConstantesFunciones.LABEL_POSICION:
					sNombreCampoCategoriaValor="posicion";
					break;

				case OpcionConstantesFunciones.LABEL_ICONNAME:
					sNombreCampoCategoriaValor="icon_name";
					break;

				case OpcionConstantesFunciones.LABEL_NOMBRECLASE:
					sNombreCampoCategoriaValor="nombre_clase";
					break;

				case OpcionConstantesFunciones.LABEL_SUBMODULO:
					sNombreCampoCategoriaValor="sub_modulo";
					break;

				case OpcionConstantesFunciones.LABEL_PAQUETE:
					sNombreCampoCategoriaValor="paquete";
					break;

				case OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL:
					sNombreCampoCategoriaValor="paquete_original";
					break;

				case OpcionConstantesFunciones.LABEL_PATHAUXILIAR:
					sNombreCampoCategoriaValor="path_auxiliar";
					break;

				case OpcionConstantesFunciones.LABEL_ESPARAMENU:
					sNombreCampoCategoriaValor="es_para_menu";
					break;

				case OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO:
					sNombreCampoCategoriaValor="con_mostrar_acciones_campo";
					break;

				case OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES:
					sNombreCampoCategoriaValor="es_guardar_relaciones";
					break;

				case OpcionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoOpcion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoOpcion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case OpcionConstantesFunciones.LABEL_IDSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sistema");
					break;

				case OpcionConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case OpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_grupo_opcion");
					break;

				case OpcionConstantesFunciones.LABEL_IDOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_opcion");
					break;

				case OpcionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case OpcionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tecla Mascara",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_tecla_mascara");
					break;

				case OpcionConstantesFunciones.LABEL_TECLA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tecla",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tecla");
					break;

				case OpcionConstantesFunciones.LABEL_POSICION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Posicion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"posicion");
					break;

				case OpcionConstantesFunciones.LABEL_ICONNAME:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Path Del Icono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"icon_name");
					break;

				case OpcionConstantesFunciones.LABEL_NOMBRECLASE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre De Clase",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_clase");
					break;

				case OpcionConstantesFunciones.LABEL_SUBMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"SubModulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_modulo");
					break;

				case OpcionConstantesFunciones.LABEL_PAQUETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Paquete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"paquete");
					break;

				case OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Paquete Original",sNombreCampoCategoria,sNombreCampoCategoriaValor,"paquete_original");
					break;

				case OpcionConstantesFunciones.LABEL_PATHAUXILIAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Path Auxiliar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"path_auxiliar");
					break;

				case OpcionConstantesFunciones.LABEL_ESPARAMENU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Para Menu",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_para_menu");
					break;

				case OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mostrar Acciones Campo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_mostrar_acciones_campo");
					break;

				case OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Guardar Relaciones",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_guardar_relaciones");
					break;

				case OpcionConstantesFunciones.LABEL_ESTADO:
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
	
	public void jButtonGenerarExcelReporteDinamicoOpcionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Opcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case OpcionConstantesFunciones.LABEL_IDSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_IDSISTEMA);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getsistema_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getgrupoopcion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_IDOPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_IDOPCION);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getopcion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.gettipoteclamascara_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_TECLA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_TECLA);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.gettecla());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_POSICION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_POSICION);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getposicion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_ICONNAME:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_ICONNAME);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.geticon_name());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_NOMBRECLASE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_NOMBRECLASE);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getnombre_clase());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_SUBMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_SUBMODULO);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getsub_modulo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_PAQUETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_PAQUETE);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getpaquete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getpaquete_original());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_PATHAUXILIAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_PATHAUXILIAR);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getpath_auxiliar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_ESPARAMENU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_ESPARAMENU);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getes_para_menu());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getcon_mostrar_acciones_campo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getes_guardar_relaciones());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OpcionConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OpcionConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(Opcion opcion:opcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(opcion.getestado());
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
			//	this.getFilaCabeceraExportarExcelOpcion(row);				
			//	iRow++;
			//}				
			
			//for(Opcion opcionAux:opcionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelOpcion(opcionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	public void jButtonArbolOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.abrirFrameTreeOpcion("BUSQUEDA_NORMAL");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingOpcion(false);
			
			//SI ES MANUAL
			if(OpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualOpcion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingOpcion(false);
			
			//SI ES MANUAL
			if(OpcionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualOpcion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingOpcion(false);
			
			//SI ES MANUAL
			if(OpcionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualOpcion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaOpcion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosOpcion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosOpcion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosOpcion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosOpcion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosOpcion.setMinimumSize(dimensionMinimum);
		this.jTableDatosOpcion.setMaximumSize(dimensionMaximum);
		this.jTableDatosOpcion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingOpcion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingOpcion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingOpcion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaOpcion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesOpcion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasOpcion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesOpcion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesOpcion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !OpcionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!OpcionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualOpcion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaOpcion();
		
		this.inicializarActualizarBindingBotonesManualOpcion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualOpcion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesOpcion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualOpcion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualOpcion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosOpcion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosOpcion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteOpcion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormOpcion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormOpcion.jCheckBoxPostAccionNuevoOpcion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormOpcion.jCheckBoxPostAccionSinCerrarOpcion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormOpcion.jCheckBoxPostAccionSinMensajeOpcion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosOpcion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosOpcion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteOpcion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormOpcion!=null) {
				this.jInternalFrameDetalleFormOpcion.jCheckBoxPostAccionNuevoOpcion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormOpcion.jCheckBoxPostAccionSinCerrarOpcion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormOpcion.jCheckBoxPostAccionSinMensajeOpcion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionOpcion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionOpcion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormOpcion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesOpcion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoOpcion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesOpcion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesOpcion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarOpcion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesOpcion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoOpcion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesOpcion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralOpcion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesOpcion(Boolean esInicializar) throws Exception {
		try	{	
			if(OpcionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualOpcion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesOpcion() throws Exception {
		try	{
			if(OpcionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualOpcion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleOpcion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualOpcion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesOpcion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesOpcion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesOpcion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionOpcion.addItem(reporte);
			}
			
			
			if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionOpcion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionOpcion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesOpcion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesOpcion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarOpcion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarOpcion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualOpcion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualOpcion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoOpcion!=null) {
				this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoOpcion!=null) {
				this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoOpcion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoOpcion!=null) {
				
				if(this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoOpcion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoOpcion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoOpcion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoOpcion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualOpcion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.getSelectedItem()!=null){this.id_sistemaBusquedaPorIdModuloPorIdOpcion=((Sistema)this.jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.getSelectedItem()!=null){this.id_moduloBusquedaPorIdModuloPorIdOpcion=((Modulo)this.jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.getSelectedItem()!=null){this.id_opcionBusquedaPorIdModuloPorIdOpcion=((Opcion)this.jComboBoxid_opcionBusquedaPorIdModuloPorIdOpcionOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.getSelectedItem()!=null){this.id_sistemaBusquedaPorIdModuloPorNombre=((Sistema)this.jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.getSelectedItem()!=null){this.id_moduloBusquedaPorIdModuloPorNombre=((Modulo)this.jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion.getSelectedItem()).getId();}
		this.nombreBusquedaPorIdModuloPorNombre=this.jTextFieldnombreBusquedaPorIdModuloPorNombreOpcion.getText();
		if(this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.getSelectedItem()!=null){this.id_sistemaBusquedaPorIdSistemaPorModulo=((Sistema)this.jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.getSelectedItem()!=null){this.id_moduloBusquedaPorIdSistemaPorModulo=((Modulo)this.jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_sistemaFK_IdSistemaOpcion.getSelectedItem()!=null){this.id_sistemaFK_IdSistema=((Sistema)this.jComboBoxid_sistemaFK_IdSistemaOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.getSelectedItem()!=null){this.id_tipo_tecla_mascaraFK_IdTipoTeclaMascara=((TipoTeclaMascara)this.jComboBoxid_tipo_tecla_mascaraFK_IdTipoTeclaMascaraOpcion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasOpcion(Boolean esInicializar) throws Exception {				
		if(OpcionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualOpcion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaOpcion() throws Exception {
		this.inicializarActualizarBindingTablaOpcion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByOpcion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosOpcionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaOpcion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=opcionLogic.getOpcions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=opcions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosOpcion.setModel(new OpcionModel(this.opcionLogic.getOpcions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosOpcion.setModel(new OpcionModel(this.opcions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByOpcion!=null && this.jInternalFrameOrderByOpcion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByOpcion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+OpcionConstantesFunciones.SCLASSWEBTITULO,opcionConstantesFunciones.resaltarSeleccionarOpcion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+OpcionConstantesFunciones.SCLASSWEBTITULO,opcionConstantesFunciones.resaltarSeleccionarOpcion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_ID));

		if(this.opcionConstantesFunciones.mostraridOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.opcionConstantesFunciones.resaltaridOpcion,this.opcionConstantesFunciones.activaridOpcion,this,true,"idOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltaridOpcion,this.opcionConstantesFunciones.activaridOpcion,this,true,"idOpcion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDSISTEMA));

		if(this.opcionConstantesFunciones.mostrarid_sistemaOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_IDSISTEMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SistemaTableCell(this.sistemasForeignKey,this.opcionConstantesFunciones.resaltarid_sistemaOpcion,this,this.opcionConstantesFunciones.activarid_sistemaOpcion));
			tableColumn.setCellEditor(new SistemaTableCell(this.sistemasForeignKey,this.opcionConstantesFunciones.resaltarid_sistemaOpcion,this,this.opcionConstantesFunciones.activarid_sistemaOpcion,true,"id_sistemaOpcion","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDMODULO));

		if(this.opcionConstantesFunciones.mostrarid_moduloOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.opcionConstantesFunciones.resaltarid_moduloOpcion,this,this.opcionConstantesFunciones.activarid_moduloOpcion));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.opcionConstantesFunciones.resaltarid_moduloOpcion,this,this.opcionConstantesFunciones.activarid_moduloOpcion,true,"id_moduloOpcion","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDGRUPOOPCION));

		if(this.opcionConstantesFunciones.mostrarid_grupo_opcionOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_IDGRUPOOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new GrupoOpcionTableCell(this.grupoopcionsForeignKey,this.opcionConstantesFunciones.resaltarid_grupo_opcionOpcion,this,this.opcionConstantesFunciones.activarid_grupo_opcionOpcion));
			tableColumn.setCellEditor(new GrupoOpcionTableCell(this.grupoopcionsForeignKey,this.opcionConstantesFunciones.resaltarid_grupo_opcionOpcion,this,this.opcionConstantesFunciones.activarid_grupo_opcionOpcion,true,"id_grupo_opcionOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDOPCION));

		if(this.opcionConstantesFunciones.mostrarid_opcionOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_IDOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OpcionTableCell(this.opcionsForeignKey,this.opcionConstantesFunciones.resaltarid_opcionOpcion,this,this.opcionConstantesFunciones.activarid_opcionOpcion));
			tableColumn.setCellEditor(new OpcionTableCell(this.opcionsForeignKey,this.opcionConstantesFunciones.resaltarid_opcionOpcion,this,this.opcionConstantesFunciones.activarid_opcionOpcion,true,"id_opcionOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_CODIGO));

		if(this.opcionConstantesFunciones.mostrarcodigoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltarcodigoOpcion,this.opcionConstantesFunciones.activarcodigoOpcion,this,true,"codigoOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarcodigoOpcion,this.opcionConstantesFunciones.activarcodigoOpcion,this,true,"codigoOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_NOMBRE));

		if(this.opcionConstantesFunciones.mostrarnombreOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltarnombreOpcion,this.opcionConstantesFunciones.activarnombreOpcion,this,true,"nombreOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarnombreOpcion,this.opcionConstantesFunciones.activarnombreOpcion,this,true,"nombreOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA));

		if(this.opcionConstantesFunciones.mostrarid_tipo_tecla_mascaraOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoTeclaMascaraTableCell(this.tipoteclamascarasForeignKey,this.opcionConstantesFunciones.resaltarid_tipo_tecla_mascaraOpcion,this,this.opcionConstantesFunciones.activarid_tipo_tecla_mascaraOpcion));
			tableColumn.setCellEditor(new TipoTeclaMascaraTableCell(this.tipoteclamascarasForeignKey,this.opcionConstantesFunciones.resaltarid_tipo_tecla_mascaraOpcion,this,this.opcionConstantesFunciones.activarid_tipo_tecla_mascaraOpcion,true,"id_tipo_tecla_mascaraOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_TECLA));

		if(this.opcionConstantesFunciones.mostrarteclaOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_TECLA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltarteclaOpcion,this.opcionConstantesFunciones.activarteclaOpcion,this,true,"teclaOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarteclaOpcion,this.opcionConstantesFunciones.activarteclaOpcion,this,true,"teclaOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_POSICION));

		if(this.opcionConstantesFunciones.mostrarposicionOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_POSICION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.opcionConstantesFunciones.resaltarposicionOpcion,this.opcionConstantesFunciones.activarposicionOpcion,this,true,"posicionOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarposicionOpcion,this.opcionConstantesFunciones.activarposicionOpcion,this,true,"posicionOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_ICONNAME));

		if(this.opcionConstantesFunciones.mostraricon_nameOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_ICONNAME,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltaricon_nameOpcion,this.opcionConstantesFunciones.activaricon_nameOpcion,this,true,"icon_nameOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltaricon_nameOpcion,this.opcionConstantesFunciones.activaricon_nameOpcion,this,true,"icon_nameOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_NOMBRECLASE));

		if(this.opcionConstantesFunciones.mostrarnombre_claseOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_NOMBRECLASE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltarnombre_claseOpcion,this.opcionConstantesFunciones.activarnombre_claseOpcion,this,true,"nombre_claseOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarnombre_claseOpcion,this.opcionConstantesFunciones.activarnombre_claseOpcion,this,true,"nombre_claseOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_SUBMODULO));

		if(this.opcionConstantesFunciones.mostrarsub_moduloOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_SUBMODULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltarsub_moduloOpcion,this.opcionConstantesFunciones.activarsub_moduloOpcion,this,true,"sub_moduloOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarsub_moduloOpcion,this.opcionConstantesFunciones.activarsub_moduloOpcion,this,true,"sub_moduloOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_PAQUETE));

		if(this.opcionConstantesFunciones.mostrarpaqueteOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_PAQUETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltarpaqueteOpcion,this.opcionConstantesFunciones.activarpaqueteOpcion,this,true,"paqueteOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarpaqueteOpcion,this.opcionConstantesFunciones.activarpaqueteOpcion,this,true,"paqueteOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL));

		if(this.opcionConstantesFunciones.mostrarpaquete_originalOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltarpaquete_originalOpcion,this.opcionConstantesFunciones.activarpaquete_originalOpcion,this,true,"paquete_originalOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarpaquete_originalOpcion,this.opcionConstantesFunciones.activarpaquete_originalOpcion,this,true,"paquete_originalOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_PATHAUXILIAR));

		if(this.opcionConstantesFunciones.mostrarpath_auxiliarOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_PATHAUXILIAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.opcionConstantesFunciones.resaltarpath_auxiliarOpcion,this.opcionConstantesFunciones.activarpath_auxiliarOpcion,this,true,"path_auxiliarOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.opcionConstantesFunciones.resaltarpath_auxiliarOpcion,this.opcionConstantesFunciones.activarpath_auxiliarOpcion,this,true,"path_auxiliarOpcion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_ESPARAMENU));

		if(this.opcionConstantesFunciones.mostrares_para_menuOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_ESPARAMENU,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.opcionConstantesFunciones.resaltares_para_menuOpcion,this.opcionConstantesFunciones.activares_para_menuOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.opcionConstantesFunciones.resaltares_para_menuOpcion,this.opcionConstantesFunciones.activares_para_menuOpcion,this,true,"es_para_menuOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO));

		if(this.opcionConstantesFunciones.mostrarcon_mostrar_acciones_campoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.opcionConstantesFunciones.resaltarcon_mostrar_acciones_campoOpcion,this.opcionConstantesFunciones.activarcon_mostrar_acciones_campoOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.opcionConstantesFunciones.resaltarcon_mostrar_acciones_campoOpcion,this.opcionConstantesFunciones.activarcon_mostrar_acciones_campoOpcion,this,true,"con_mostrar_acciones_campoOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES));

		if(this.opcionConstantesFunciones.mostrares_guardar_relacionesOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.opcionConstantesFunciones.resaltares_guardar_relacionesOpcion,this.opcionConstantesFunciones.activares_guardar_relacionesOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.opcionConstantesFunciones.resaltares_guardar_relacionesOpcion,this.opcionConstantesFunciones.activares_guardar_relacionesOpcion,this,true,"es_guardar_relacionesOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOpcion,OpcionConstantesFunciones.LABEL_ESTADO));

		if(this.opcionConstantesFunciones.mostrarestadoOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OpcionConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.opcionConstantesFunciones.resaltarestadoOpcion,this.opcionConstantesFunciones.activarestadoOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.opcionConstantesFunciones.resaltarestadoOpcion,this.opcionConstantesFunciones.activarestadoOpcion,this,true,"estadoOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.opcionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosUsuarioOpcion && this.opcionConstantesFunciones.mostrarUsuarioOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Usuario Opciones");
				tableColumn.setHeaderValue("Usuario Opciones");
				tableColumn.setCellRenderer(new UsuarioOpcionTableCell(opcionConstantesFunciones.resaltarUsuarioOpcionOpcion,this,this.opcionConstantesFunciones.activarUsuarioOpcionOpcion));
				tableColumn.setCellEditor(new UsuarioOpcionTableCell(opcionConstantesFunciones.resaltarUsuarioOpcionOpcion,this,this.opcionConstantesFunciones.activarUsuarioOpcionOpcion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosOpcion.addColumn(tableColumn);
			}

			if(this.isTienePermisosOpcion && this.opcionConstantesFunciones.mostrarOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Opciones");
				tableColumn.setHeaderValue("Opciones");
				tableColumn.setCellRenderer(new OpcionTableCell(opcionConstantesFunciones.resaltarOpcionOpcion,this,this.opcionConstantesFunciones.activarOpcionOpcion));
				tableColumn.setCellEditor(new OpcionTableCell(opcionConstantesFunciones.resaltarOpcionOpcion,this,this.opcionConstantesFunciones.activarOpcionOpcion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosOpcion.addColumn(tableColumn);
			}

			if(this.isTienePermisosAccion && this.opcionConstantesFunciones.mostrarAccionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Acciones");
				tableColumn.setHeaderValue("Acciones");
				tableColumn.setCellRenderer(new AccionTableCell(opcionConstantesFunciones.resaltarAccionOpcion,this,this.opcionConstantesFunciones.activarAccionOpcion));
				tableColumn.setCellEditor(new AccionTableCell(opcionConstantesFunciones.resaltarAccionOpcion,this,this.opcionConstantesFunciones.activarAccionOpcion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosOpcion.addColumn(tableColumn);
			}

			if(this.isTienePermisosPerfilOpcion && this.opcionConstantesFunciones.mostrarPerfilOpcionOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Perfil Opciones");
				tableColumn.setHeaderValue("Perfil Opciones");
				tableColumn.setCellRenderer(new PerfilOpcionTableCell(opcionConstantesFunciones.resaltarPerfilOpcionOpcion,this,this.opcionConstantesFunciones.activarPerfilOpcionOpcion));
				tableColumn.setCellEditor(new PerfilOpcionTableCell(opcionConstantesFunciones.resaltarPerfilOpcionOpcion,this,this.opcionConstantesFunciones.activarPerfilOpcionOpcion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosOpcion.addColumn(tableColumn);
			}

			if(this.isTienePermisosCampo && this.opcionConstantesFunciones.mostrarCampoOpcion && !OpcionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Campos");
				tableColumn.setHeaderValue("Campos");
				tableColumn.setCellRenderer(new CampoTableCell(opcionConstantesFunciones.resaltarCampoOpcion,this,this.opcionConstantesFunciones.activarCampoOpcion));
				tableColumn.setCellEditor(new CampoTableCell(opcionConstantesFunciones.resaltarCampoOpcion,this,this.opcionConstantesFunciones.activarCampoOpcion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosOpcion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.opcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.opcionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosOpcion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.opcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.opcionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosOpcion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarOpcion && this.isPermisoGuardarCambiosOpcion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.opcionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.opcionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosOpcion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.opcionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosOpcion.addColumn(tableColumn);
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
			
			this.jTableDatosOpcion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarOpcion && this.isPermisoGuardarCambiosOpcion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.opcionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarOpcion && this.isPermisoGuardarCambiosOpcion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosOpcion.moveColumn(this.jTableDatosOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosOpcion.moveColumn(this.jTableDatosOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.opcionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosOpcion.moveColumn(this.jTableDatosOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosOpcion.moveColumn(this.jTableDatosOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosOpcion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosOpcion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosOpcion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosOpcion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosOpcion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosOpcion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosOpcion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosOpcion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=opcionLogic.getOpcions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=opcions.size()-1;
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
		//this.jTableDatosOpcion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosOpcion();
			
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
				
				//this.isEsNuevoOpcion=false;
					
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormOpcion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosOpcion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosOpcion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.opcion.getsType().equals("DUPLICADO")
				   || this.opcion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoOpcion=true;
				
				} else {
					this.isEsNuevoOpcion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.opcionSessionBean.getEsGuardarRelacionado()) {
					if(this.opcion.getId()>=0 && !this.opcion.getIsNew()) {						
						this.isEsNuevoOpcion=false;
						
					} else {
						this.isEsNuevoOpcion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoOpcion(esRelaciones);						
				
				this.seleccionarOpcion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.opcion.getId()<0) {
					this.isEsNuevoOpcion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarOpcion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarOpcion(evt,rowIndex);
				}	
				
				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Opcion: " + this.dDif); 
					}
				}								
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarOpcion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.opcion)) {
					if(this.opcion.getId()>0) {
						this.opcion.setIsDeleted(true);
						
						this.opcionsEliminados.add(this.opcion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.opcionLogic.getOpcions().remove(this.opcion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.opcions.remove(this.opcion);				
					}
					
					
					((OpcionModel) this.jTableDatosOpcion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaOpcion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarOpcion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoOpcion) {
			
			if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosOpcion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosOpcion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioOpcion(this.opcion);
				}
				
				//ARCHITECTURE
				try {
					

					//Sistema
					if(!this.opcionConstantesFunciones.cargarid_sistemaOpcion || this.opcionConstantesFunciones.event_dependid_sistemaOpcion) {
						//this.cargarCombosSistemasForeignKeyLista(" where id="+this.opcion.getid_sistema());
									//this.inicializarActualizarBindingOpcion(false,false);
						this.sistemasForeignKey=new ArrayList<Sistema>();

						if(opcion.getSistema()!=null) {
							this.sistemasForeignKey.add(opcion.getSistema());
						}

						this.addItemDefectoCombosForeignKeySistema();
						this.cargarCombosFrameSistemasForeignKey("Todos");
					}
					this.setActualSistemaForeignKey(this.opcion.getid_sistema(),false,"Formulario");

					//Modulo
					if(!this.opcionConstantesFunciones.cargarid_moduloOpcion || this.opcionConstantesFunciones.event_dependid_moduloOpcion) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.opcion.getid_modulo());
									//this.inicializarActualizarBindingOpcion(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(opcion.getModulo()!=null) {
							this.modulosForeignKey.add(opcion.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.opcion.getid_modulo(),false,"Formulario");

					//GrupoOpcion
					if(!this.opcionConstantesFunciones.cargarid_grupo_opcionOpcion || this.opcionConstantesFunciones.event_dependid_grupo_opcionOpcion) {
						//this.cargarCombosGrupoOpcionsForeignKeyLista(" where id="+this.opcion.getid_grupo_opcion());
									//this.inicializarActualizarBindingOpcion(false,false);
						this.grupoopcionsForeignKey=new ArrayList<GrupoOpcion>();

						if(opcion.getGrupoOpcion()!=null) {
							this.grupoopcionsForeignKey.add(opcion.getGrupoOpcion());
						}

						this.addItemDefectoCombosForeignKeyGrupoOpcion();
						this.cargarCombosFrameGrupoOpcionsForeignKey("Todos");
					}
					this.setActualGrupoOpcionForeignKey(this.opcion.getid_grupo_opcion(),false,"Formulario");

					//Opcion
					if(!this.opcionConstantesFunciones.cargarid_opcionOpcion || this.opcionConstantesFunciones.event_dependid_opcionOpcion) {
						//this.cargarCombosOpcionsForeignKeyLista(" where id="+this.opcion.getid_opcion());
									//this.inicializarActualizarBindingOpcion(false,false);
						this.opcionsForeignKey=new ArrayList<Opcion>();

						if(opcion.getOpcion()!=null) {
							this.opcionsForeignKey.add(opcion.getOpcion());
						}

						this.addItemDefectoCombosForeignKeyOpcion();
						this.cargarCombosFrameOpcionsForeignKey("Todos");
					}
					this.setActualOpcionForeignKey(this.opcion.getid_opcion(),false,"Formulario");

					//TipoTeclaMascara
					if(!this.opcionConstantesFunciones.cargarid_tipo_tecla_mascaraOpcion || this.opcionConstantesFunciones.event_dependid_tipo_tecla_mascaraOpcion) {
						//this.cargarCombosTipoTeclaMascarasForeignKeyLista(" where id="+this.opcion.getid_tipo_tecla_mascara());
									//this.inicializarActualizarBindingOpcion(false,false);
						this.tipoteclamascarasForeignKey=new ArrayList<TipoTeclaMascara>();

						if(opcion.getTipoTeclaMascara()!=null) {
							this.tipoteclamascarasForeignKey.add(opcion.getTipoTeclaMascara());
						}

						this.addItemDefectoCombosForeignKeyTipoTeclaMascara();
						this.cargarCombosFrameTipoTeclaMascarasForeignKey("Todos");
					}
					this.setActualTipoTeclaMascaraForeignKey(this.opcion.getid_tipo_tecla_mascara(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesOpcion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesOpcion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualOpcion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoOpcion(Opcion opcion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoOpcion(opcion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoOpcion(Opcion opcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioOpcion(opcion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyOpcion(opcion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyOpcion(opcion);
	}
	
	public void setVariablesObjetoActualToFormularioOpcion(Opcion opcion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.setText(opcion.getId().toString());
			this.jInternalFrameDetalleFormOpcion.jTextFieldcodigoOpcion.setText(opcion.getcodigo());
			this.jInternalFrameDetalleFormOpcion.jTextFieldnombreOpcion.setText(opcion.getnombre());
			this.jInternalFrameDetalleFormOpcion.jTextFieldteclaOpcion.setText(opcion.gettecla());
			this.jInternalFrameDetalleFormOpcion.jTextFieldposicionOpcion.setText(opcion.getposicion().toString());
			this.jInternalFrameDetalleFormOpcion.jTextAreaicon_nameOpcion.setText(opcion.geticon_name());
			this.jInternalFrameDetalleFormOpcion.jTextFieldnombre_claseOpcion.setText(opcion.getnombre_clase());
			this.jInternalFrameDetalleFormOpcion.jTextFieldsub_moduloOpcion.setText(opcion.getsub_modulo());
			this.jInternalFrameDetalleFormOpcion.jTextAreapaqueteOpcion.setText(opcion.getpaquete());
			this.jInternalFrameDetalleFormOpcion.jTextAreapaquete_originalOpcion.setText(opcion.getpaquete_original());
			this.jInternalFrameDetalleFormOpcion.jTextFieldpath_auxiliarOpcion.setText(opcion.getpath_auxiliar());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.setSelected(opcion.getes_para_menu());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.setSelected(opcion.getcon_mostrar_acciones_campo());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.setSelected(opcion.getes_guardar_relaciones());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.setSelected(opcion.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Opcion opcionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,opcionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Opcion opcionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				opcionLocal=this.opcion;
			} else {
				opcionLocal=this.opcionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(opcionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoOpcion(opcionLocal,true);
					
					if(opcionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(opcionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.opcionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(opcionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoOpcion(Opcion opcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualOpcion(opcion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysOpcion(opcion);
	}
	
	public void setVariablesFormularioToObjetoActualOpcion(Opcion opcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualOpcion(opcion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualOpcion(Opcion opcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.getText()==null || this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.getText()=="" || this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.getText()=="Id") {
				this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.setText("0");
			}

			if(conColumnasBase) {opcion.setId(Long.parseLong(this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelIdOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setcodigo(this.jInternalFrameDetalleFormOpcion.jTextFieldcodigoOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelcodigoOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setnombre(this.jInternalFrameDetalleFormOpcion.jTextFieldnombreOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelnombreOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.settecla(this.jInternalFrameDetalleFormOpcion.jTextFieldteclaOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_TECLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelteclaOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setposicion(Short.parseShort(this.jInternalFrameDetalleFormOpcion.jTextFieldposicionOpcion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_POSICION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelposicionOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.seticon_name(this.jInternalFrameDetalleFormOpcion.jTextAreaicon_nameOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_ICONNAME+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelicon_nameOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setnombre_clase(this.jInternalFrameDetalleFormOpcion.jTextFieldnombre_claseOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_NOMBRECLASE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelnombre_claseOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setsub_modulo(this.jInternalFrameDetalleFormOpcion.jTextFieldsub_moduloOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_SUBMODULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelsub_moduloOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setpaquete(this.jInternalFrameDetalleFormOpcion.jTextAreapaqueteOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_PAQUETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelpaqueteOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setpaquete_original(this.jInternalFrameDetalleFormOpcion.jTextAreapaquete_originalOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelpaquete_originalOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setpath_auxiliar(this.jInternalFrameDetalleFormOpcion.jTextFieldpath_auxiliarOpcion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_PATHAUXILIAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelpath_auxiliarOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setes_para_menu(this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_ESPARAMENU+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabeles_para_menuOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setcon_mostrar_acciones_campo(this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelcon_mostrar_acciones_campoOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setes_guardar_relaciones(this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabeles_guardar_relacionesOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			opcion.setestado(this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OpcionConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOpcion.jLabelestadoOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualOpcion(Opcion opcionBean,Opcion opcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && opcionBean.getid_sistema()!=null && !opcionBean.getid_sistema().equals(-1L))) {opcion.setid_sistema(opcionBean.getid_sistema());}
			if(conDefault || (!conDefault && opcionBean.getid_modulo()!=null && !opcionBean.getid_modulo().equals(-1L))) {opcion.setid_modulo(opcionBean.getid_modulo());}
			if(conDefault || (!conDefault && opcionBean.getid_grupo_opcion()!=null && !opcionBean.getid_grupo_opcion().equals(null))) {opcion.setid_grupo_opcion(opcionBean.getid_grupo_opcion());}
			if(conDefault || (!conDefault && opcionBean.getid_opcion()!=null && !opcionBean.getid_opcion().equals(null))) {opcion.setid_opcion(opcionBean.getid_opcion());}
			if(conDefault || (!conDefault && opcionBean.getid_tipo_tecla_mascara()!=null && !opcionBean.getid_tipo_tecla_mascara().equals(-1L))) {opcion.setid_tipo_tecla_mascara(opcionBean.getid_tipo_tecla_mascara());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosOpcion(Opcion opcionOrigen,Opcion opcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && opcionOrigen.getId()!=null && !opcionOrigen.getId().equals(0L))) {opcion.setId(opcionOrigen.getId());}}
			if(conDefault || (!conDefault && opcionOrigen.getid_sistema()!=null && !opcionOrigen.getid_sistema().equals(-1L))) {opcion.setid_sistema(opcionOrigen.getid_sistema());}
			if(conDefault || (!conDefault && opcionOrigen.getid_modulo()!=null && !opcionOrigen.getid_modulo().equals(-1L))) {opcion.setid_modulo(opcionOrigen.getid_modulo());}
			if(conDefault || (!conDefault && opcionOrigen.getid_grupo_opcion()!=null && !opcionOrigen.getid_grupo_opcion().equals(null))) {opcion.setid_grupo_opcion(opcionOrigen.getid_grupo_opcion());}
			if(conDefault || (!conDefault && opcionOrigen.getid_opcion()!=null && !opcionOrigen.getid_opcion().equals(null))) {opcion.setid_opcion(opcionOrigen.getid_opcion());}
			if(conDefault || (!conDefault && opcionOrigen.getcodigo()!=null && !opcionOrigen.getcodigo().equals(""))) {opcion.setcodigo(opcionOrigen.getcodigo());}
			if(conDefault || (!conDefault && opcionOrigen.getnombre()!=null && !opcionOrigen.getnombre().equals(""))) {opcion.setnombre(opcionOrigen.getnombre());}
			if(conDefault || (!conDefault && opcionOrigen.getid_tipo_tecla_mascara()!=null && !opcionOrigen.getid_tipo_tecla_mascara().equals(-1L))) {opcion.setid_tipo_tecla_mascara(opcionOrigen.getid_tipo_tecla_mascara());}
			if(conDefault || (!conDefault && opcionOrigen.gettecla()!=null && !opcionOrigen.gettecla().equals(""))) {opcion.settecla(opcionOrigen.gettecla());}
			if(conDefault || (!conDefault && opcionOrigen.getposicion()!=null && !opcionOrigen.getposicion().equals(Short.parseShort("0")))) {opcion.setposicion(opcionOrigen.getposicion());}
			if(conDefault || (!conDefault && opcionOrigen.geticon_name()!=null && !opcionOrigen.geticon_name().equals(""))) {opcion.seticon_name(opcionOrigen.geticon_name());}
			if(conDefault || (!conDefault && opcionOrigen.getnombre_clase()!=null && !opcionOrigen.getnombre_clase().equals(""))) {opcion.setnombre_clase(opcionOrigen.getnombre_clase());}
			if(conDefault || (!conDefault && opcionOrigen.getsub_modulo()!=null && !opcionOrigen.getsub_modulo().equals(""))) {opcion.setsub_modulo(opcionOrigen.getsub_modulo());}
			if(conDefault || (!conDefault && opcionOrigen.getpaquete()!=null && !opcionOrigen.getpaquete().equals(""))) {opcion.setpaquete(opcionOrigen.getpaquete());}
			if(conDefault || (!conDefault && opcionOrigen.getpaquete_original()!=null && !opcionOrigen.getpaquete_original().equals(""))) {opcion.setpaquete_original(opcionOrigen.getpaquete_original());}
			if(conDefault || (!conDefault && opcionOrigen.getpath_auxiliar()!=null && !opcionOrigen.getpath_auxiliar().equals(""))) {opcion.setpath_auxiliar(opcionOrigen.getpath_auxiliar());}
			if(conDefault || (!conDefault && opcionOrigen.getes_para_menu()!=null && !opcionOrigen.getes_para_menu().equals(false))) {opcion.setes_para_menu(opcionOrigen.getes_para_menu());}
			if(conDefault || (!conDefault && opcionOrigen.getcon_mostrar_acciones_campo()!=null && !opcionOrigen.getcon_mostrar_acciones_campo().equals(false))) {opcion.setcon_mostrar_acciones_campo(opcionOrigen.getcon_mostrar_acciones_campo());}
			if(conDefault || (!conDefault && opcionOrigen.getes_guardar_relaciones()!=null && !opcionOrigen.getes_guardar_relaciones().equals(false))) {opcion.setes_guardar_relaciones(opcionOrigen.getes_guardar_relaciones());}
			if(conDefault || (!conDefault && opcionOrigen.getestado()!=null && !opcionOrigen.getestado().equals(false))) {opcion.setestado(opcionOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioOpcion(Opcion opcion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.setText(opcion.getId().toString());
			this.jInternalFrameDetalleFormOpcion.jTextFieldcodigoOpcion.setText(opcion.getcodigo());
			this.jInternalFrameDetalleFormOpcion.jTextFieldnombreOpcion.setText(opcion.getnombre());
			this.jInternalFrameDetalleFormOpcion.jTextFieldteclaOpcion.setText(opcion.gettecla());
			this.jInternalFrameDetalleFormOpcion.jTextFieldposicionOpcion.setText(opcion.getposicion().toString());
			this.jInternalFrameDetalleFormOpcion.jTextAreaicon_nameOpcion.setText(opcion.geticon_name());
			this.jInternalFrameDetalleFormOpcion.jTextFieldnombre_claseOpcion.setText(opcion.getnombre_clase());
			this.jInternalFrameDetalleFormOpcion.jTextFieldsub_moduloOpcion.setText(opcion.getsub_modulo());
			this.jInternalFrameDetalleFormOpcion.jTextAreapaqueteOpcion.setText(opcion.getpaquete());
			this.jInternalFrameDetalleFormOpcion.jTextAreapaquete_originalOpcion.setText(opcion.getpaquete_original());
			this.jInternalFrameDetalleFormOpcion.jTextFieldpath_auxiliarOpcion.setText(opcion.getpath_auxiliar());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.setSelected(opcion.getes_para_menu());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.setSelected(opcion.getcon_mostrar_acciones_campo());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.setSelected(opcion.getes_guardar_relaciones());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.setSelected(opcion.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioOpcion(OpcionBean opcionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.setText(opcionBean.getId().toString());
			this.jInternalFrameDetalleFormOpcion.jTextFieldcodigoOpcion.setText(opcionBean.getcodigo());
			this.jInternalFrameDetalleFormOpcion.jTextFieldnombreOpcion.setText(opcionBean.getnombre());
			this.jInternalFrameDetalleFormOpcion.jTextFieldteclaOpcion.setText(opcionBean.gettecla());
			this.jInternalFrameDetalleFormOpcion.jTextFieldposicionOpcion.setText(opcionBean.getposicion().toString());
			this.jInternalFrameDetalleFormOpcion.jTextAreaicon_nameOpcion.setText(opcionBean.geticon_name());
			this.jInternalFrameDetalleFormOpcion.jTextFieldnombre_claseOpcion.setText(opcionBean.getnombre_clase());
			this.jInternalFrameDetalleFormOpcion.jTextFieldsub_moduloOpcion.setText(opcionBean.getsub_modulo());
			this.jInternalFrameDetalleFormOpcion.jTextAreapaqueteOpcion.setText(opcionBean.getpaquete());
			this.jInternalFrameDetalleFormOpcion.jTextAreapaquete_originalOpcion.setText(opcionBean.getpaquete_original());
			this.jInternalFrameDetalleFormOpcion.jTextFieldpath_auxiliarOpcion.setText(opcionBean.getpath_auxiliar());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.setSelected(opcionBean.getes_para_menu());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.setSelected(opcionBean.getcon_mostrar_acciones_campo());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.setSelected(opcionBean.getes_guardar_relaciones());
			this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.setSelected(opcionBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanOpcion(OpcionParameterReturnGeneral opcionReturnGeneral,OpcionBean opcionBean,Boolean conDefault) throws Exception { 
		try {
			Opcion opcionLocal=new Opcion();
			
			opcionLocal=opcionReturnGeneral.getOpcion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && opcionLocal.getId()!=null && !opcionLocal.getId().equals(0L))) {opcionBean.setId(opcionLocal.getId());}}
			if(conDefault || (!conDefault && opcionLocal.getid_sistema()!=null && !opcionLocal.getid_sistema().equals(-1L))) {opcionBean.setid_sistema(opcionLocal.getid_sistema());}
			if(conDefault || (!conDefault && opcionLocal.getid_modulo()!=null && !opcionLocal.getid_modulo().equals(-1L))) {opcionBean.setid_modulo(opcionLocal.getid_modulo());}
			if(conDefault || (!conDefault && opcionLocal.getid_grupo_opcion()!=null && !opcionLocal.getid_grupo_opcion().equals(null))) {opcionBean.setid_grupo_opcion(opcionLocal.getid_grupo_opcion());}
			if(conDefault || (!conDefault && opcionLocal.getid_opcion()!=null && !opcionLocal.getid_opcion().equals(null))) {opcionBean.setid_opcion(opcionLocal.getid_opcion());}
			if(conDefault || (!conDefault && opcionLocal.getcodigo()!=null && !opcionLocal.getcodigo().equals(""))) {opcionBean.setcodigo(opcionLocal.getcodigo());}
			if(conDefault || (!conDefault && opcionLocal.getnombre()!=null && !opcionLocal.getnombre().equals(""))) {opcionBean.setnombre(opcionLocal.getnombre());}
			if(conDefault || (!conDefault && opcionLocal.getid_tipo_tecla_mascara()!=null && !opcionLocal.getid_tipo_tecla_mascara().equals(-1L))) {opcionBean.setid_tipo_tecla_mascara(opcionLocal.getid_tipo_tecla_mascara());}
			if(conDefault || (!conDefault && opcionLocal.gettecla()!=null && !opcionLocal.gettecla().equals(""))) {opcionBean.settecla(opcionLocal.gettecla());}
			if(conDefault || (!conDefault && opcionLocal.getposicion()!=null && !opcionLocal.getposicion().equals(Short.parseShort("0")))) {opcionBean.setposicion(opcionLocal.getposicion());}
			if(conDefault || (!conDefault && opcionLocal.geticon_name()!=null && !opcionLocal.geticon_name().equals(""))) {opcionBean.seticon_name(opcionLocal.geticon_name());}
			if(conDefault || (!conDefault && opcionLocal.getnombre_clase()!=null && !opcionLocal.getnombre_clase().equals(""))) {opcionBean.setnombre_clase(opcionLocal.getnombre_clase());}
			if(conDefault || (!conDefault && opcionLocal.getsub_modulo()!=null && !opcionLocal.getsub_modulo().equals(""))) {opcionBean.setsub_modulo(opcionLocal.getsub_modulo());}
			if(conDefault || (!conDefault && opcionLocal.getpaquete()!=null && !opcionLocal.getpaquete().equals(""))) {opcionBean.setpaquete(opcionLocal.getpaquete());}
			if(conDefault || (!conDefault && opcionLocal.getpaquete_original()!=null && !opcionLocal.getpaquete_original().equals(""))) {opcionBean.setpaquete_original(opcionLocal.getpaquete_original());}
			if(conDefault || (!conDefault && opcionLocal.getpath_auxiliar()!=null && !opcionLocal.getpath_auxiliar().equals(""))) {opcionBean.setpath_auxiliar(opcionLocal.getpath_auxiliar());}
			if(conDefault || (!conDefault && opcionLocal.getes_para_menu()!=null && !opcionLocal.getes_para_menu().equals(false))) {opcionBean.setes_para_menu(opcionLocal.getes_para_menu());}
			if(conDefault || (!conDefault && opcionLocal.getcon_mostrar_acciones_campo()!=null && !opcionLocal.getcon_mostrar_acciones_campo().equals(false))) {opcionBean.setcon_mostrar_acciones_campo(opcionLocal.getcon_mostrar_acciones_campo());}
			if(conDefault || (!conDefault && opcionLocal.getes_guardar_relaciones()!=null && !opcionLocal.getes_guardar_relaciones().equals(false))) {opcionBean.setes_guardar_relaciones(opcionLocal.getes_guardar_relaciones());}
			if(conDefault || (!conDefault && opcionLocal.getestado()!=null && !opcionLocal.getestado().equals(false))) {opcionBean.setestado(opcionLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxOpcionGenerico(Long idOpcionSeleccionado,JComboBox jComboBoxOpcion,List<Opcion> opcionsLocal)throws Exception {
		try {
			Opcion  opcionTemp=null;

			for(Opcion opcionAux:opcionsLocal) {
				if(opcionAux.getId()!=null && opcionAux.getId().equals(idOpcionSeleccionado)) {
					opcionTemp=opcionAux;
					break;
				}
			}

			jComboBoxOpcion.setSelectedItem(opcionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxOpcionGenerico(JComboBox jComboBoxOpcion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxOpcion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxOpcion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
				//AUTOREFERENCIADA
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
				
				jComboBoxOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Arbol"));			
				//AUTOREFERENCIADA
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
		 else if(sTipo.equals("Accion")) {
			jButtonAccionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PerfilOpcion")) {
			jButtonPerfilOpcionActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Campo")) {
			jButtonCampoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			opcion=(Opcion) opcionLogic.getOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			opcion =(Opcion) opcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Sistema")) {
			//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
			if(!opcion.getIsNew() && !opcion.getIsChanged() && !opcion.getIsDeleted()) {
				sDescripcion=opcion.getsistema_descripcion();
			} else {
				//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
				sDescripcion=opcion.getsistema_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!opcion.getIsNew() && !opcion.getIsChanged() && !opcion.getIsDeleted()) {
				sDescripcion=opcion.getmodulo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=opcion.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("GrupoOpcion")) {
			//sDescripcion=this.getActualGrupoOpcionForeignKeyDescripcion((Long)value);
			if(!opcion.getIsNew() && !opcion.getIsChanged() && !opcion.getIsDeleted()) {
				sDescripcion=opcion.getgrupoopcion_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=opcion.getgrupoopcion_descripcion();
			}
		}

		if(sTipo.equals("Opcion")) {
			//sDescripcion=this.getActualOpcionForeignKeyDescripcion((Long)value);
			if(!opcion.getIsNew() && !opcion.getIsChanged() && !opcion.getIsDeleted()) {
				sDescripcion=opcion.getopcion_descripcion();
			} else {
				//sDescripcion=this.getActualOpcionForeignKeyDescripcion((Long)value);
				sDescripcion=opcion.getopcion_descripcion();
			}
		}

		if(sTipo.equals("TipoTeclaMascara")) {
			//sDescripcion=this.getActualTipoTeclaMascaraForeignKeyDescripcion((Long)value);
			if(!opcion.getIsNew() && !opcion.getIsChanged() && !opcion.getIsDeleted()) {
				sDescripcion=opcion.gettipoteclamascara_descripcion();
			} else {
				//sDescripcion=this.getActualTipoTeclaMascaraForeignKeyDescripcion((Long)value);
				sDescripcion=opcion.gettipoteclamascara_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Opcion opcionRow=new Opcion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			opcionRow=(Opcion) opcionLogic.getOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			opcionRow=(Opcion) opcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonUsuarioOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormOpcion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						this.opcion = new Opcion();
					}
				}

				if(this.isTienePermisosUsuarioOpcion && this.permiteMantenimiento(this.opcion)) {
					UsuarioOpcionBeanSwingJInternalFrame usuarioopcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFramePopup=new UsuarioOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						usuarioopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFramePopup;
					} else {
						usuarioopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();
					opcions.add(this.opcion);
					if(!esRelacionado) {
						//usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setConGuardarRelaciones(false);
						//usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					usuarioopcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormOpcion.cargarUsuarioOpcionBeanSwingJInternalFrame(opcions,this.opcion,usuarioopcionBeanSwingJInternalFrame,/*conInicializar,*/usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getConGuardarRelaciones(),usuarioopcionBeanSwingJInternalFrame.usuarioopcionSessionBean.getEsGuardarRelacionado());
					usuarioopcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						usuarioopcionBeanSwingJInternalFrame.actualizarEstadoPanelsUsuarioOpcion("no_relacionado");

						usuarioopcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(UsuarioOpcionConstantesFunciones.ITAMANIOFILATABLA + (UsuarioOpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						usuarioopcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
						TitledBorder titledBorderUsuarioOpcion=(TitledBorder)usuarioopcionBeanSwingJInternalFrame.jScrollPanelDatosUsuarioOpcion.getBorder();

						titledBorderUsuarioOpcion.setTitle(titledBorderOpcion.getTitle() + " -> Usuario Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,usuarioopcionBeanSwingJInternalFrame);
						}

						usuarioopcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(usuarioopcionBeanSwingJInternalFrame);

						usuarioopcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.opcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Usuario Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormOpcion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						this.opcion = new Opcion();
					}
				}

				if(this.isTienePermisosOpcion && this.permiteMantenimiento(this.opcion)) {
					OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFramePopup=new OpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						opcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFramePopup;
					} else {
						opcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();
					opcions.add(this.opcion);
					if(!esRelacionado) {
						//opcionBeanSwingJInternalFrame.opcionSessionBean.setConGuardarRelaciones(false);
						//opcionBeanSwingJInternalFrame.opcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					opcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormOpcion.cargarOpcionBeanSwingJInternalFrame(opcions,this.opcion,opcionBeanSwingJInternalFrame,/*conInicializar,*/opcionBeanSwingJInternalFrame.opcionSessionBean.getConGuardarRelaciones(),opcionBeanSwingJInternalFrame.opcionSessionBean.getEsGuardarRelacionado());
					opcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						opcionBeanSwingJInternalFrame.actualizarEstadoPanelsOpcion("no_relacionado");

						opcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(OpcionConstantesFunciones.ITAMANIOFILATABLA + (OpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						opcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
						titledBorderOpcion.setTitle(titledBorderOpcion.getTitle() + " -> Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,opcionBeanSwingJInternalFrame);
						}

						opcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(opcionBeanSwingJInternalFrame);

						opcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.opcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonAccionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormOpcion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						this.opcion = new Opcion();
					}
				}

				if(this.isTienePermisosAccion && this.permiteMantenimiento(this.opcion)) {
					AccionBeanSwingJInternalFrame accionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFramePopup=new AccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						accionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFramePopup;
					} else {
						accionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();
					opcions.add(this.opcion);
					if(!esRelacionado) {
						//accionBeanSwingJInternalFrame.accionSessionBean.setConGuardarRelaciones(false);
						//accionBeanSwingJInternalFrame.accionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					accionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormOpcion.cargarAccionBeanSwingJInternalFrame(opcions,this.opcion,accionBeanSwingJInternalFrame,/*conInicializar,*/accionBeanSwingJInternalFrame.accionSessionBean.getConGuardarRelaciones(),accionBeanSwingJInternalFrame.accionSessionBean.getEsGuardarRelacionado());
					accionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						accionBeanSwingJInternalFrame.actualizarEstadoPanelsAccion("no_relacionado");

						accionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AccionConstantesFunciones.ITAMANIOFILATABLA + (AccionConstantesFunciones.ITAMANIOFILATABLA/2));

						accionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
						TitledBorder titledBorderAccion=(TitledBorder)accionBeanSwingJInternalFrame.jScrollPanelDatosAccion.getBorder();

						titledBorderAccion.setTitle(titledBorderOpcion.getTitle() + " -> Accion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,accionBeanSwingJInternalFrame);
						}

						accionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(accionBeanSwingJInternalFrame);

						accionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.opcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Accion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPerfilOpcionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormOpcion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						this.opcion = new Opcion();
					}
				}

				if(this.isTienePermisosPerfilOpcion && this.permiteMantenimiento(this.opcion)) {
					PerfilOpcionBeanSwingJInternalFrame perfilopcionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFramePopup=new PerfilOpcionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						perfilopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFramePopup;
					} else {
						perfilopcionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();
					opcions.add(this.opcion);
					if(!esRelacionado) {
						//perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setConGuardarRelaciones(false);
						//perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					perfilopcionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormOpcion.cargarPerfilOpcionBeanSwingJInternalFrame(opcions,this.opcion,perfilopcionBeanSwingJInternalFrame,/*conInicializar,*/perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getConGuardarRelaciones(),perfilopcionBeanSwingJInternalFrame.perfilopcionSessionBean.getEsGuardarRelacionado());
					perfilopcionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						perfilopcionBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilOpcion("no_relacionado");

						perfilopcionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PerfilOpcionConstantesFunciones.ITAMANIOFILATABLA + (PerfilOpcionConstantesFunciones.ITAMANIOFILATABLA/2));

						perfilopcionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
						TitledBorder titledBorderPerfilOpcion=(TitledBorder)perfilopcionBeanSwingJInternalFrame.jScrollPanelDatosPerfilOpcion.getBorder();

						titledBorderPerfilOpcion.setTitle(titledBorderOpcion.getTitle() + " -> Perfil Opcion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,perfilopcionBeanSwingJInternalFrame);
						}

						perfilopcionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(perfilopcionBeanSwingJInternalFrame);

						perfilopcionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.opcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Perfil Opcion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCampoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Opcion opcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormOpcion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion = (Opcion)this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.opcion = (Opcion)this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(opcion!=null) {
						this.opcion = opcion;
					} else {
						this.opcion = new Opcion();
					}
				}

				if(this.isTienePermisosCampo && this.permiteMantenimiento(this.opcion)) {
					CampoBeanSwingJInternalFrame campoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFramePopup=new CampoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						campoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFramePopup;
					} else {
						campoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame;
					}

					List<Opcion> opcions=new ArrayList<Opcion>();
					opcions.add(this.opcion);
					if(!esRelacionado) {
						//campoBeanSwingJInternalFrame.campoSessionBean.setConGuardarRelaciones(false);
						//campoBeanSwingJInternalFrame.campoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					campoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormOpcion.cargarCampoBeanSwingJInternalFrame(opcions,this.opcion,campoBeanSwingJInternalFrame,/*conInicializar,*/campoBeanSwingJInternalFrame.campoSessionBean.getConGuardarRelaciones(),campoBeanSwingJInternalFrame.campoSessionBean.getEsGuardarRelacionado());
					campoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						campoBeanSwingJInternalFrame.actualizarEstadoPanelsCampo("no_relacionado");

						campoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CampoConstantesFunciones.ITAMANIOFILATABLA + (CampoConstantesFunciones.ITAMANIOFILATABLA/2));

						campoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
						TitledBorder titledBorderCampo=(TitledBorder)campoBeanSwingJInternalFrame.jScrollPanelDatosCampo.getBorder();

						titledBorderCampo.setTitle(titledBorderOpcion.getTitle() + " -> Campo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,campoBeanSwingJInternalFrame);
						}

						campoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(campoBeanSwingJInternalFrame);

						campoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.opcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Campo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualOpcion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoOpcion.setVisible((this.isVisibilidadCeldaNuevoOpcion && this.isPermisoNuevoOpcion));			
			this.jButtonDuplicarOpcion.setVisible((this.isVisibilidadCeldaDuplicarOpcion && this.isPermisoDuplicarOpcion));			
			this.jButtonCopiarOpcion.setVisible((this.isVisibilidadCeldaCopiarOpcion && this.isPermisoCopiarOpcion));
			this.jButtonVerFormOpcion.setVisible((this.isVisibilidadCeldaVerFormOpcion && this.isPermisoVerFormOpcion));
			
			this.jButtonAbrirOrderByOpcion.setVisible((this.isVisibilidadCeldaOrdenOpcion && this.isPermisoOrdenOpcion));			
			
			this.jButtonNuevoRelacionesOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesOpcion && this.isPermisoNuevoOpcion));			
			this.jButtonNuevoGuardarCambiosOpcion.setVisible((this.isVisibilidadCeldaNuevoOpcion && this.isPermisoNuevoOpcion && this.isPermisoGuardarCambiosOpcion));
			
			if(this.jInternalFrameDetalleFormOpcion!=null) {
			this.jInternalFrameDetalleFormOpcion.jButtonModificarOpcion.setVisible((this.isVisibilidadCeldaModificarOpcion && this.isPermisoActualizarOpcion));	
			this.jInternalFrameDetalleFormOpcion.jButtonActualizarOpcion.setVisible((this.isVisibilidadCeldaActualizarOpcion && this.isPermisoActualizarOpcion));	
			this.jInternalFrameDetalleFormOpcion.jButtonEliminarOpcion.setVisible((this.isVisibilidadCeldaEliminarOpcion && this.isPermisoEliminarOpcion));
			this.jInternalFrameDetalleFormOpcion.jButtonCancelarOpcion.setVisible(this.isVisibilidadCeldaCancelarOpcion);							
			this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosOpcion.setVisible((this.isVisibilidadCeldaGuardarOpcion && this.isPermisoGuardarCambiosOpcion));			
			
			}
						
			this.jButtonGuardarCambiosTablaOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosOpcion && this.isPermisoGuardarCambiosOpcion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarOpcion.setVisible((this.isVisibilidadCeldaNuevoOpcion && this.isPermisoNuevoOpcion));						
			this.jButtonDuplicarToolBarOpcion.setVisible((this.isVisibilidadCeldaDuplicarOpcion && this.isPermisoDuplicarOpcion));						
			this.jButtonCopiarToolBarOpcion.setVisible((this.isVisibilidadCeldaCopiarOpcion && this.isPermisoCopiarOpcion));			
			this.jButtonVerFormToolBarOpcion.setVisible((this.isVisibilidadCeldaVerFormOpcion && this.isPermisoVerFormOpcion));			
			this.jButtonAbrirOrderByToolBarOpcion.setVisible((this.isVisibilidadCeldaOrdenOpcion && this.isPermisoOrdenOpcion));
			this.jButtonNuevoRelacionesToolBarOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesOpcion && this.isPermisoNuevoOpcion));			
			this.jButtonNuevoGuardarCambiosToolBarOpcion.setVisible((this.isVisibilidadCeldaNuevoOpcion && this.isPermisoNuevoOpcion && this.isPermisoGuardarCambiosOpcion));			
			
			if(this.jInternalFrameDetalleFormOpcion!=null) {
			this.jInternalFrameDetalleFormOpcion.jButtonModificarToolBarOpcion.setVisible((this.isVisibilidadCeldaModificarOpcion && this.isPermisoActualizarOpcion));	
			this.jInternalFrameDetalleFormOpcion.jButtonActualizarToolBarOpcion.setVisible((this.isVisibilidadCeldaActualizarOpcion  && this.isPermisoActualizarOpcion));	
			this.jInternalFrameDetalleFormOpcion.jButtonEliminarToolBarOpcion.setVisible((this.isVisibilidadCeldaEliminarOpcion && this.isPermisoEliminarOpcion));
			this.jInternalFrameDetalleFormOpcion.jButtonCancelarToolBarOpcion.setVisible(this.isVisibilidadCeldaCancelarOpcion);				
			this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosToolBarOpcion.setVisible((this.isVisibilidadCeldaGuardarOpcion && this.isPermisoGuardarCambiosOpcion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosOpcion && this.isPermisoGuardarCambiosOpcion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoOpcion.setVisible((this.isVisibilidadCeldaNuevoOpcion && this.isPermisoNuevoOpcion));			
			this.jMenuItemDuplicarOpcion.setVisible((this.isVisibilidadCeldaDuplicarOpcion && this.isPermisoDuplicarOpcion));			
			this.jMenuItemCopiarOpcion.setVisible((this.isVisibilidadCeldaCopiarOpcion && this.isPermisoCopiarOpcion));			
			this.jMenuItemVerFormOpcion.setVisible((this.isVisibilidadCeldaVerFormOpcion && this.isPermisoVerFormOpcion));			
			this.jMenuItemAbrirOrderByOpcion.setVisible((this.isVisibilidadCeldaOrdenOpcion && this.isPermisoOrdenOpcion));			
			//this.jMenuItemMostrarOcultarOpcion.setVisible((this.isVisibilidadCeldaOrdenOpcion && this.isPermisoOrdenOpcion));
			this.jMenuItemDetalleAbrirOrderByOpcion.setVisible((this.isVisibilidadCeldaOrdenOpcion && this.isPermisoOrdenOpcion));			
			//this.jMenuItemDetalleMostrarOcultarOpcion.setVisible((this.isVisibilidadCeldaOrdenOpcion && this.isPermisoOrdenOpcion));			
			this.jMenuItemNuevoRelacionesOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesOpcion && this.isPermisoNuevoOpcion));			
			this.jMenuItemNuevoGuardarCambiosOpcion.setVisible((this.isVisibilidadCeldaNuevoOpcion && this.isPermisoNuevoOpcion && this.isPermisoGuardarCambiosOpcion));									
			
			if(this.jInternalFrameDetalleFormOpcion!=null) {
			this.jInternalFrameDetalleFormOpcion.jMenuItemModificarOpcion.setVisible((this.isVisibilidadCeldaModificarOpcion && this.isPermisoActualizarOpcion));	
			this.jInternalFrameDetalleFormOpcion.jMenuItemActualizarOpcion.setVisible((this.isVisibilidadCeldaActualizarOpcion && this.isPermisoActualizarOpcion));	
			this.jInternalFrameDetalleFormOpcion.jMenuItemEliminarOpcion.setVisible((this.isVisibilidadCeldaEliminarOpcion && this.isPermisoEliminarOpcion));
			this.jInternalFrameDetalleFormOpcion.jMenuItemCancelarOpcion.setVisible(this.isVisibilidadCeldaCancelarOpcion);				
			}
			
			this.jMenuItemGuardarCambiosOpcion.setVisible((this.isVisibilidadCeldaGuardarOpcion && this.isPermisoGuardarCambiosOpcion));						
			this.jMenuItemGuardarCambiosTablaOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosOpcion && this.isPermisoGuardarCambiosOpcion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoOpcion=this.jButtonNuevoOpcion.isVisible();
			this.isVisibilidadCeldaDuplicarOpcion=this.jButtonDuplicarOpcion.isVisible();
			this.isVisibilidadCeldaCopiarOpcion=this.jButtonCopiarOpcion.isVisible();
			this.isVisibilidadCeldaVerFormOpcion=this.jButtonVerFormOpcion.isVisible();
			
			this.isVisibilidadCeldaOrdenOpcion=this.jButtonAbrirOrderByOpcion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesOpcion=this.jButtonNuevoRelacionesOpcion.isVisible();
			this.isVisibilidadCeldaModificarOpcion=this.jButtonModificarOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormOpcion!=null) {
			this.isVisibilidadCeldaActualizarOpcion=this.jInternalFrameDetalleFormOpcion.jButtonActualizarOpcion.isVisible();
			this.isVisibilidadCeldaEliminarOpcion=this.jInternalFrameDetalleFormOpcion.jButtonEliminarOpcion.isVisible();
			this.isVisibilidadCeldaCancelarOpcion=this.jInternalFrameDetalleFormOpcion.jButtonCancelarOpcion.isVisible();
			this.isVisibilidadCeldaGuardarOpcion=this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosOpcion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosOpcion=this.jButtonGuardarCambiosTablaOpcion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoOpcion=this.jButtonNuevoToolBarOpcion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesOpcion=this.jButtonNuevoRelacionesToolBarOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormOpcion!=null) {
			this.isVisibilidadCeldaModificarOpcion=this.jInternalFrameDetalleFormOpcion.jButtonModificarToolBarOpcion.isVisible();
			this.isVisibilidadCeldaActualizarOpcion=this.jInternalFrameDetalleFormOpcion.jButtonActualizarToolBarOpcion.isVisible();
			this.isVisibilidadCeldaEliminarOpcion=this.jInternalFrameDetalleFormOpcion.jButtonEliminarToolBarOpcion.isVisible();
			this.isVisibilidadCeldaCancelarOpcion=this.jInternalFrameDetalleFormOpcion.jButtonCancelarToolBarOpcion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarOpcion=this.jButtonGuardarCambiosToolBarOpcion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosOpcion=this.jButtonGuardarCambiosTablaToolBarOpcion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoOpcion=this.jMenuItemNuevoOpcion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesOpcion=this.jMenuItemNuevoRelacionesOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormOpcion!=null) {
			this.isVisibilidadCeldaModificarOpcion=this.jInternalFrameDetalleFormOpcion.jMenuItemModificarOpcion.isVisible();
			this.isVisibilidadCeldaActualizarOpcion=this.jInternalFrameDetalleFormOpcion.jMenuItemActualizarOpcion.isVisible();
			this.isVisibilidadCeldaEliminarOpcion=this.jInternalFrameDetalleFormOpcion.jMenuItemEliminarOpcion.isVisible();
			this.isVisibilidadCeldaCancelarOpcion=this.jInternalFrameDetalleFormOpcion.jMenuItemCancelarOpcion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarOpcion=this.jMenuItemGuardarCambiosOpcion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosOpcion=this.jMenuItemGuardarCambiosTablaOpcion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesOpcion(Boolean esInicializar) {
		if(OpcionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.opcionSessionBean.getConGuardarRelaciones()) {
				//if(this.opcionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesOpcion();
			}
			
			this.inicializarActualizarBindingBotonesManualOpcion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualOpcion() {
		this.jButtonNuevoOpcion.setVisible(this.isPermisoNuevoOpcion);			
		this.jButtonDuplicarOpcion.setVisible(this.isPermisoDuplicarOpcion);			
		this.jButtonCopiarOpcion.setVisible(this.isPermisoCopiarOpcion);			
		this.jButtonVerFormOpcion.setVisible(this.isPermisoVerFormOpcion);			
		
		this.jButtonAbrirOrderByOpcion.setVisible(this.isPermisoOrdenOpcion);					
		
		this.jButtonNuevoRelacionesOpcion.setVisible(this.isPermisoNuevoOpcion);			
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonModificarOpcion.setVisible(this.isPermisoActualizarOpcion);	
			this.jInternalFrameDetalleFormOpcion.jButtonActualizarOpcion.setVisible(this.isPermisoActualizarOpcion);	
			this.jInternalFrameDetalleFormOpcion.jButtonEliminarOpcion.setVisible(this.isPermisoEliminarOpcion);
			this.jInternalFrameDetalleFormOpcion.jButtonCancelarOpcion.setVisible(this.isVisibilidadCeldaCancelarOpcion);						
			this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosOpcion.setVisible(this.isPermisoGuardarCambiosOpcion);							
		}
		
		this.jButtonGuardarCambiosTablaOpcion.setVisible(this.isPermisoActualizarOpcion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleOpcion() {
		this.jInternalFrameDetalleFormOpcion.jButtonModificarOpcion.setVisible(this.isPermisoActualizarOpcion);	
		this.jInternalFrameDetalleFormOpcion.jButtonActualizarOpcion.setVisible(this.isPermisoActualizarOpcion);	
		this.jInternalFrameDetalleFormOpcion.jButtonEliminarOpcion.setVisible(this.isPermisoEliminarOpcion);
		this.jInternalFrameDetalleFormOpcion.jButtonCancelarOpcion.setVisible(this.isVisibilidadCeldaCancelarOpcion);							
		this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosOpcion.setVisible((this.isVisibilidadCeldaGuardarOpcion && this.isPermisoGuardarCambiosOpcion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosOpcion() {
		if(OpcionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualOpcion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesOpcion() {
	}
	
	public void jTableDatosOpcionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarOpcion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.opcion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sistemaOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosistema=true;

			idTienePermisosistema=this.tienePermisosUsuarioEnPaginaWebOpcion(SistemaConstantesFunciones.CLASSNAME);

			if(idTienePermisosistema) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.sistemaBeanSwingJInternalFrame=new SistemaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sistemaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sistemaBeanSwingJInternalFrame.getSistemaLogic().setConnexion(this.opcionLogic.getConnexion());

				if(this.opcion.getid_sistema()!=null) {
					this.sistemaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sistemaBeanSwingJInternalFrame.setIdActual(this.opcion.getid_sistema());
					this.sistemaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.inicializarActualizarBindingTablaSistema();
				}

				JInternalFrameBase jinternalFrame =this.sistemaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
				TitledBorder titledBordersistema=(TitledBorder)this.sistemaBeanSwingJInternalFrame.jScrollPanelDatosSistema.getBorder();

				titledBordersistema.setTitle(titledBorderOpcion.getTitle() + " -> Sistema");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sistemaOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getid_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sistema = "+this.opcion.getid_sistema().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebOpcion(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.opcionLogic.getConnexion());

				if(this.opcion.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.opcion.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderOpcion.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.opcion.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_opcionOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupoopcion=true;

			idTienePermisogrupoopcion=this.tienePermisosUsuarioEnPaginaWebOpcion(GrupoOpcionConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.grupoopcionBeanSwingJInternalFrame=new GrupoOpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoopcionBeanSwingJInternalFrame.getGrupoOpcionLogic().setConnexion(this.opcionLogic.getConnexion());

				if(this.opcion.getid_grupo_opcion()!=null) {
					this.grupoopcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoopcionBeanSwingJInternalFrame.setIdActual(this.opcion.getid_grupo_opcion());
					this.grupoopcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoopcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoOpcion();
				}

				JInternalFrameBase jinternalFrame =this.grupoopcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
				TitledBorder titledBordergrupoopcion=(TitledBorder)this.grupoopcionBeanSwingJInternalFrame.jScrollPanelDatosGrupoOpcion.getBorder();

				titledBordergrupoopcion.setTitle(titledBorderOpcion.getTitle() + " -> Grupo Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_opcionOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getid_grupo_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_opcion = "+this.opcion.getid_grupo_opcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_opcionOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoopcion=true;

			idTienePermisoopcion=this.tienePermisosUsuarioEnPaginaWebOpcion(OpcionConstantesFunciones.CLASSNAME);

			if(idTienePermisoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.opcionBeanSwingJInternalFrame.getOpcionLogic().setConnexion(this.opcionLogic.getConnexion());

				if(this.opcion.getid_opcion()!=null) {
					this.opcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.opcionBeanSwingJInternalFrame.setIdActual(this.opcion.getid_opcion());
					this.opcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion();
				}

				JInternalFrameBase jinternalFrame =this.opcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
				TitledBorder titledBorderopcion=(TitledBorder)this.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

				titledBorderopcion.setTitle(titledBorderOpcion.getTitle() + " -> Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_opcionOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getid_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_opcion = "+this.opcion.getid_opcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.opcion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.opcion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_tecla_mascaraOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoteclamascara=true;

			idTienePermisotipoteclamascara=this.tienePermisosUsuarioEnPaginaWebOpcion(TipoTeclaMascaraConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoteclamascara) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);

				this.tipoteclamascaraBeanSwingJInternalFrame=new TipoTeclaMascaraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoteclamascaraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoteclamascaraBeanSwingJInternalFrame.getTipoTeclaMascaraLogic().setConnexion(this.opcionLogic.getConnexion());

				if(this.opcion.getid_tipo_tecla_mascara()!=null) {
					this.tipoteclamascaraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoteclamascaraBeanSwingJInternalFrame.setIdActual(this.opcion.getid_tipo_tecla_mascara());
					this.tipoteclamascaraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoteclamascaraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoteclamascaraBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoTeclaMascara();
				}

				JInternalFrameBase jinternalFrame =this.tipoteclamascaraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOpcion=(TitledBorder)this.jScrollPanelDatosOpcion.getBorder();
				TitledBorder titledBordertipoteclamascara=(TitledBorder)this.tipoteclamascaraBeanSwingJInternalFrame.jScrollPanelDatosTipoTeclaMascara.getBorder();

				titledBordertipoteclamascara.setTitle(titledBorderOpcion.getTitle() + " -> Tipo Tecla Mascara");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_tecla_mascaraOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getid_tipo_tecla_mascara()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_tecla_mascara = "+this.opcion.getid_tipo_tecla_mascara().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonteclaOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.gettecla()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tecla like '%"+this.opcion.gettecla()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonposicionOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getposicion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where posicion = "+this.opcion.getposicion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonicon_nameOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.geticon_name()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where icon_name like '%"+this.opcion.geticon_name()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_claseOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getnombre_clase()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_clase like '%"+this.opcion.getnombre_clase()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_moduloOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getsub_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_modulo like '%"+this.opcion.getsub_modulo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpaqueteOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getpaquete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where paquete like '%"+this.opcion.getpaquete()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpaquete_originalOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getpaquete_original()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where paquete_original like '%"+this.opcion.getpaquete_original()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpath_auxiliarOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getpath_auxiliar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where path_auxiliar like '%"+this.opcion.getpath_auxiliar()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_para_menuOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getes_para_menu()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_para_menu = "+this.opcion.getes_para_menu().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_mostrar_acciones_campoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getcon_mostrar_acciones_campo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_mostrar_acciones_campo = "+this.opcion.getcon_mostrar_acciones_campo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_guardar_relacionesOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getes_guardar_relaciones()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_guardar_relaciones = "+this.opcion.getes_guardar_relaciones().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOpcion(this.getopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.opcion==null) {
						this.opcion = new Opcion();
					}

					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);
				}

				if(this.opcion.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.opcion.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdModuloPorIdOpcionOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOpcion(false,false);

			this.getOpcionsBusquedaPorIdModuloPorIdOpcion();

			this.inicializarActualizarBindingOpcion(false);

			//if(OpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdModuloPorNombreOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOpcion(false,false);

			this.getOpcionsBusquedaPorIdModuloPorNombre();

			this.inicializarActualizarBindingOpcion(false);

			//if(OpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdSistemaPorModuloOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOpcion(false,false);

			this.getOpcionsBusquedaPorIdSistemaPorModulo();

			this.inicializarActualizarBindingOpcion(false);

			//if(OpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoOpcionOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOpcion(false,false);

			this.getOpcionsFK_IdGrupoOpcion();

			this.inicializarActualizarBindingOpcion(false);

			//if(OpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOpcion(false,false);

			this.getOpcionsFK_IdModulo();

			this.inicializarActualizarBindingOpcion(false);

			//if(OpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdOpcionOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOpcion(false,false);

			this.getOpcionsFK_IdOpcion();

			this.inicializarActualizarBindingOpcion(false);

			//if(OpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSistemaOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOpcion(false,false);

			this.getOpcionsFK_IdSistema();

			this.inicializarActualizarBindingOpcion(false);

			//if(OpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoTeclaMascaraOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOpcion(false,false);

			this.getOpcionsFK_IdTipoTeclaMascara();

			this.inicializarActualizarBindingOpcion(false);

			//if(OpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.opcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameOpcion() {
		if(this.jInternalFrameDetalleFormOpcion!=null) {
		

		if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormOpcion!=null) {
			this.jInternalFrameDetalleFormOpcion.setVisible(false);	    			
			this.jInternalFrameDetalleFormOpcion.dispose();
			this.jInternalFrameDetalleFormOpcion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoOpcion!=null) {
			this.jInternalFrameReporteDinamicoOpcion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoOpcion.dispose();
			this.jInternalFrameReporteDinamicoOpcion=null;
		}
		
		if(this.jInternalFrameImportacionOpcion!=null) {
			this.jInternalFrameImportacionOpcion.setVisible(false);	    			
			this.jInternalFrameImportacionOpcion.dispose();
			this.jInternalFrameImportacionOpcion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	public void closingTreeFrameOpcion() {
		
		if(this.jInternalFrameTreeOpcion!=null) {
			this.jInternalFrameTreeOpcion.setVisible(false);	    			
			this.jInternalFrameTreeOpcion.dispose();
			this.jInternalFrameTreeOpcion=null;
		}
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessOpcion();
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
			
			if(sTipo.equals("NuevoOpcion")) {
				jButtonNuevoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarOpcion")) {
				jButtonDuplicarOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarOpcion")) {
				jButtonCopiarOpcionActionPerformed(evt);
			} else if(sTipo.equals("VerFormOpcion")) {
				jButtonVerFormOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarOpcion")) {
				jButtonNuevoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarOpcion")) {
				jButtonDuplicarOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoOpcion")) {
				jButtonNuevoOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarOpcion")) {
				jButtonDuplicarOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesOpcion")) {
				jButtonNuevoOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarOpcion")) {
				jButtonNuevoOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesOpcion")) {
				jButtonNuevoOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarOpcion")) {
				jButtonModificarOpcionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarOpcion")) {
				jButtonModificarOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarOpcion")) {
				jButtonModificarOpcionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarOpcion")) {
				jButtonActualizarOpcionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarOpcion")) {
				jButtonActualizarOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarOpcion")) {
				jButtonActualizarOpcionActionPerformed(evt);
			} else if(sTipo.equals("EliminarOpcion")) {
				jButtonEliminarOpcionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarOpcion")) {
				jButtonEliminarOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarOpcion")) {
				jButtonEliminarOpcionActionPerformed(evt);
			} else if(sTipo.equals("CancelarOpcion")) {
				jButtonCancelarOpcionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarOpcion")) {
				jButtonCancelarOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarOpcion")) {
				jButtonCancelarOpcionActionPerformed(evt);
			} else if(sTipo.equals("CerrarOpcion")) {
				jButtonCerrarOpcionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarOpcion")) {
				jButtonCerrarOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarOpcion")) {
				jButtonCerrarOpcionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarOpcion")) {
				jButtonMostrarOcultarOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarOpcion")) {
				jButtonCancelarOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosOpcion")) {
				jButtonGuardarCambiosOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarOpcion")) {
				jButtonGuardarCambiosOpcionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarOpcion")) {
				jButtonCopiarOpcionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarOpcion")) {
				jButtonVerFormOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosOpcion")) {
				jButtonGuardarCambiosOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarOpcion")) {
				jButtonCopiarOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormOpcion")) {
				jButtonVerFormOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaOpcion")) {
				jButtonGuardarCambiosOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarOpcion")) {
				jButtonGuardarCambiosOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaOpcion")) {
				jButtonGuardarCambiosOpcionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionOpcion")) {
				jButtonRecargarInformacionOpcionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarOpcion")) {
				jButtonRecargarInformacionOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionOpcion")) {
				jButtonRecargarInformacionOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("ArbolOpcion")) {
				jButtonArbolOpcionActionPerformed(evt);
			} 
			else if(sTipo.equals("AnterioresOpcion")) {
				jButtonAnterioresOpcionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarOpcion")) {
				jButtonAnterioresOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreOpcion")) {
				jButtonAnterioresOpcionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesOpcion")) {
				jButtonSiguientesOpcionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarOpcion")) {
				jButtonSiguientesOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesOpcion")) {
				jButtonSiguientesOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByOpcion") || sTipo.equals("MenuItemDetalleAbrirOrderByOpcion")) {
				jButtonAbrirOrderByOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarOpcion") || sTipo.equals("MenuItemDetalleMostrarOcultarOpcion")) {
				jButtonMostrarOcultarOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosOpcion")) {
				jButtonNuevoGuardarCambiosOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarOpcion")) {
				jButtonNuevoGuardarCambiosOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosOpcion")) {
				jButtonNuevoGuardarCambiosOpcionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoOpcion")) {
				jButtonCerrarReporteDinamicoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoOpcion")) {
				jButtonGenerarReporteDinamicoOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoOpcion")) {
				
				jButtonGenerarExcelReporteDinamicoOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionOpcion")) {
				jButtonCerrarImportacionOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionOpcion")) {
				
				jButtonGenerarImportacionOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionOpcion")) {
				
				jButtonAbrirImportacionOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesOpcion")) {
				jComboBoxTiposAccionesOpcionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesOpcion")) {
				jComboBoxTiposRelacionesOpcionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioOpcion")) {
				jComboBoxTiposAccionesOpcionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarOpcion")) {
				
				jComboBoxTiposSeleccionarOpcionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralOpcion")) {
				jTextFieldValorCampoGeneralOpcionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByOpcion")) {
				jButtonAbrirOrderByOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarOpcion")) {
				jButtonAbrirOrderByOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByOpcion")) {
				jButtonCerrarOrderByOpcionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idOpcionBusqueda")) {
				this.jButtonidOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaOpcionUpdate")) {
				this.jButtonid_sistemaOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaOpcionBusqueda")) {
				this.jButtonid_sistemaOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloOpcionUpdate")) {
				this.jButtonid_moduloOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloOpcionBusqueda")) {
				this.jButtonid_moduloOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_opcionOpcionUpdate")) {
				this.jButtonid_grupo_opcionOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_opcionOpcionBusqueda")) {
				this.jButtonid_grupo_opcionOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionOpcionUpdate")) {
				this.jButtonid_opcionOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionOpcionBusqueda")) {
				this.jButtonid_opcionOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoOpcionBusqueda")) {
				this.jButtoncodigoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreOpcionBusqueda")) {
				this.jButtonnombreOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_tecla_mascaraOpcionUpdate")) {
				this.jButtonid_tipo_tecla_mascaraOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_tecla_mascaraOpcionBusqueda")) {
				this.jButtonid_tipo_tecla_mascaraOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("teclaOpcionBusqueda")) {
				this.jButtonteclaOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("posicionOpcionBusqueda")) {
				this.jButtonposicionOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("icon_nameOpcionBusqueda")) {
				this.jButtonicon_nameOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_claseOpcionBusqueda")) {
				this.jButtonnombre_claseOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_moduloOpcionBusqueda")) {
				this.jButtonsub_moduloOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paqueteOpcionBusqueda")) {
				this.jButtonpaqueteOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paquete_originalOpcionBusqueda")) {
				this.jButtonpaquete_originalOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("path_auxiliarOpcionBusqueda")) {
				this.jButtonpath_auxiliarOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_menuOpcionBusqueda")) {
				this.jButtones_para_menuOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_mostrar_acciones_campoOpcionBusqueda")) {
				this.jButtoncon_mostrar_acciones_campoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_guardar_relacionesOpcionBusqueda")) {
				this.jButtones_guardar_relacionesOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoOpcionBusqueda")) {
				this.jButtonestadoOpcionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdModuloPorIdOpcionOpcion")) {
				this.jButtonBusquedaPorIdModuloPorIdOpcionOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdModuloPorNombreOpcion")) {
				this.jButtonBusquedaPorIdModuloPorNombreOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdSistemaPorModuloOpcion")) {
				this.jButtonBusquedaPorIdSistemaPorModuloOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSistemaOpcion")) {
				this.jButtonFK_IdSistemaOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoTeclaMascaraOpcion")) {
				this.jButtonFK_IdTipoTeclaMascaraOpcionActionPerformed(evt);
			}
			
			;
			
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessOpcion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOpcionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				


				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Opcion opcionLocal=null;
			
			if(!this.getEsControlTabla()) {
				opcionLocal=this.opcion;
			} else {
				opcionLocal=this.opcionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
							
				
				


				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
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
			
			


			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOpcionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
								
						
				


				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
								
				
				


				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOpcionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
							
				
				


				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOpcionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.opcionAnterior =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
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
			
			


			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOpcionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
								
				
				


				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOpcionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOpcionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosOpcion")) {
					jCheckBoxSeleccionarTodosOpcionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosOpcion")) {
					jCheckBoxSeleccionadosOpcionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarOpcion")) {
					
				}
				
				


				
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
												
				
				


				
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOpcionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.opcionAnterior =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOpcionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
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
			
			


			if(sTipo.equals("id_sistemaOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion;
				}

				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					//classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaFK_IdSistemaOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaFK_IdSistemaOpcion,"FK_IdSistema");
				//recargarFormOpcionSistema(jComboBoxid_sistemaFK_IdSistemaOpcion,"FK_IdSistema");
			}
			 else if(sTipo.equals("id_moduloOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion;
				}

				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					//classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
			}
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOpcionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_sistemaOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion;
				}

				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					//classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaFK_IdSistemaOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaFK_IdSistemaOpcion,"FK_IdSistema");
				//recargarFormOpcionSistema(jComboBoxid_sistemaFK_IdSistemaOpcion,"FK_IdSistema");
			}
			 else if(sTipo.equals("id_moduloOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion;
				}

				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					//classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
			}
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.opcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.opcion);
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
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
				
				


			if(sTipo.equals("id_sistemaOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion;
				}

				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					//classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
				//recargarFormOpcionSistema(jComboBoxid_sistemaBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaFK_IdSistemaOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaFK_IdSistemaOpcion,"FK_IdSistema");
				//recargarFormOpcionSistema(jComboBoxid_sistemaFK_IdSistemaOpcion,"FK_IdSistema");
			}
			 else if(sTipo.equals("id_moduloOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion;
				}

				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					//classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorIdOpcionOpcion,"BusquedaPorIdModuloPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdModuloPorNombreOpcion,"BusquedaPorIdModuloPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
				//recargarFormOpcionModulo(jComboBoxid_moduloBusquedaPorIdSistemaPorModuloOpcion,"BusquedaPorIdSistemaPorModulo");
			}
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Opcion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Opcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.opcionAnterior =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.opcionAnterior =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarOpcion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosOpcionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosOpcion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.opcion =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.opcion =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.opcion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarOpcion")) {
				
				}
				
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarOpcion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosOpcion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarOpcion")) {
			
			}
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessOpcion();
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
			if(sTipo.equals("NuevoOpcion")) {
				jButtonNuevoOpcionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarOpcion")) {
				jButtonDuplicarOpcionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarOpcion")) {
				jButtonCopiarOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormOpcion")) {
				jButtonVerFormOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesOpcion")) {
				jButtonNuevoOpcionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarOpcion")) {
				jButtonModificarOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarOpcion")) {
				jButtonActualizarOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarOpcion")) {
				jButtonEliminarOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaOpcion")) {
				jButtonGuardarCambiosOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarOpcion")) {
				jButtonCancelarOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOpcion")) {
				jButtonCerrarOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosOpcion")) {
				jButtonGuardarCambiosOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosOpcion")) {
				jButtonNuevoGuardarCambiosOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByOpcion")) {
				jButtonAbrirOrderByOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionOpcion")) {
				jButtonRecargarInformacionOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresOpcion")) {
				jButtonAnterioresOpcionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesOpcion")) {
				jButtonSiguientesOpcionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idOpcionBusqueda")) {
				this.jButtonidOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaOpcionUpdate")) {
				this.jButtonid_sistemaOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaOpcionBusqueda")) {
				this.jButtonid_sistemaOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloOpcionUpdate")) {
				this.jButtonid_moduloOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloOpcionBusqueda")) {
				this.jButtonid_moduloOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_opcionOpcionUpdate")) {
				this.jButtonid_grupo_opcionOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_opcionOpcionBusqueda")) {
				this.jButtonid_grupo_opcionOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionOpcionUpdate")) {
				this.jButtonid_opcionOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionOpcionBusqueda")) {
				this.jButtonid_opcionOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoOpcionBusqueda")) {
				this.jButtoncodigoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreOpcionBusqueda")) {
				this.jButtonnombreOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_tecla_mascaraOpcionUpdate")) {
				this.jButtonid_tipo_tecla_mascaraOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_tecla_mascaraOpcionBusqueda")) {
				this.jButtonid_tipo_tecla_mascaraOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("teclaOpcionBusqueda")) {
				this.jButtonteclaOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("posicionOpcionBusqueda")) {
				this.jButtonposicionOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("icon_nameOpcionBusqueda")) {
				this.jButtonicon_nameOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_claseOpcionBusqueda")) {
				this.jButtonnombre_claseOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_moduloOpcionBusqueda")) {
				this.jButtonsub_moduloOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paqueteOpcionBusqueda")) {
				this.jButtonpaqueteOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paquete_originalOpcionBusqueda")) {
				this.jButtonpaquete_originalOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("path_auxiliarOpcionBusqueda")) {
				this.jButtonpath_auxiliarOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_menuOpcionBusqueda")) {
				this.jButtones_para_menuOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_mostrar_acciones_campoOpcionBusqueda")) {
				this.jButtoncon_mostrar_acciones_campoOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_guardar_relacionesOpcionBusqueda")) {
				this.jButtones_guardar_relacionesOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoOpcionBusqueda")) {
				this.jButtonestadoOpcionBusquedaActionPerformed(evt);
			}
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessOpcion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameOpcion")) {
				closingInternalFrameOpcion();
				
			} else if(sTipo.equals("jButtonCancelarOpcion")) {
				JInternalFrameBase jInternalFrameDetalleFormOpcion = (JInternalFrameBase)evt.getSource();
	            	
	            OpcionBeanSwingJInternalFrame jInternalFrameParent=(OpcionBeanSwingJInternalFrame)jInternalFrameDetalleFormOpcion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarOpcionActionPerformed(null);
			}
			
			OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.opcion,new Object(),this.opcionParameterGeneral,this.opcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormOpcion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormOpcion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormOpcion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.opcion)) {
			if(!esControlTabla) {
				if(OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);			
				}
				
				if(this.opcionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualOpcion(this.opcion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.opcionReturnGeneral=opcionLogic.procesarEventosOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.opcionLogic.getOpcions(),this.opcion,this.opcionParameterGeneral,this.isEsNuevoOpcion,classes);//this.opcionLogic.getOpcion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanOpcion(this.opcionReturnGeneral,this.opcionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.opcionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanOpcion(classes,this.opcionReturnGeneral,this.opcionBean,false);
					}
						
					if(this.opcionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyOpcion(this.opcionReturnGeneral.getOpcion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioOpcion(this.opcionReturnGeneral.getOpcion());	
					}
						
					if(this.opcionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioOpcion(this.opcionReturnGeneral.getOpcion(),classes);//this.opcionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioOpcion(this.opcion,classes);//this.opcionBean);									
				}
			
				if(OpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualOpcion(this.opcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysOpcion(this.opcion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.opcionAnterior!=null) {
						this.opcion=this.opcionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.opcionReturnGeneral=opcionLogic.procesarEventosOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.opcionLogic.getOpcions(),this.opcion,this.opcionParameterGeneral,this.isEsNuevoOpcion,classes);//this.opcionLogic.getOpcion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.opcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.opcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.opcionReturnGeneral.getOpcion(),opcionLogic.getOpcions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.opcionReturnGeneral.getOpcion(),this.opcions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosOpcion.repaint();
				
				//((AbstractTableModel) this.jTableDatosOpcion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosOpcion();
			}
		}
	}
	
	public void actualizarVisualTableDatosOpcion() throws Exception {
		
		OpcionModel opcionModel=(OpcionModel)this.jTableDatosOpcion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			opcionModel.opcions=this.opcionLogic.getOpcions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			opcionModel.opcions=this.opcions;
		}
		
		
		((OpcionModel) this.jTableDatosOpcion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaOpcion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getopcionAnterior(),this.opcionLogic.getOpcions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getopcionAnterior(),this.opcions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosOpcion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioOpcion(Opcion opcion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(opcion.getUsuarioOpcions());
					this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(opcion.getOpcions());
					this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accion.class)) {
					this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.setAccions(opcion.getAccions());
					this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(opcion.getPerfilOpcions());
					this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Campo.class)) {
					this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.setCampos(opcion.getCampos());
					this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCampo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
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
										
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.opcion,new Object(),generalEntityParameterGeneral,this.opcionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.opcionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=OpcionConstantesFunciones.getClassesRelationshipsOfOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=OpcionConstantesFunciones.getClassesRelationshipsFromStringsOfOpcion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormOpcion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				OpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.opcion,new Object(),generalEntityParameterGeneral,this.opcionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioOpcion(OpcionBean opcionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.setUsuarioOpcions(opcion.getUsuarioOpcions());
					this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuarioOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.setOpcions(opcion.getOpcions());
					this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accion.class)) {
					this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.setAccions(opcion.getAccions());
					this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.setPerfilOpcions(opcion.getPerfilOpcions());
					this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilOpcion(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Campo.class)) {
					this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.setCampos(opcion.getCampos());
					this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCampo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanOpcion(ArrayList<Classe> classes,OpcionReturnGeneral opcionReturnGeneral,OpcionBean opcionBean,Boolean conDefault) throws Exception {
		
			this.opcionBean.setUsuarioOpcions(opcionReturnGeneral.getOpcion().getUsuarioOpcions());
			this.opcionBean.setOpcions(opcionReturnGeneral.getOpcion().getOpcions());
			this.opcionBean.setAccions(opcionReturnGeneral.getOpcion().getAccions());
			this.opcionBean.setPerfilOpcions(opcionReturnGeneral.getOpcion().getPerfilOpcions());
			this.opcionBean.setCampos(opcionReturnGeneral.getOpcion().getCampos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualOpcion(Opcion opcion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(UsuarioOpcion.class)) {
					opcion.setUsuarioOpcions(this.jInternalFrameDetalleFormOpcion.usuarioopcionBeanSwingJInternalFrame.usuarioopcionLogic.getUsuarioOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Opcion.class)) {
					opcion.setOpcions(this.jInternalFrameDetalleFormOpcion.opcionBeanSwingJInternalFrame.opcionLogic.getOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Accion.class)) {
					opcion.setAccions(this.jInternalFrameDetalleFormOpcion.accionBeanSwingJInternalFrame.accionLogic.getAccions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PerfilOpcion.class)) {
					opcion.setPerfilOpcions(this.jInternalFrameDetalleFormOpcion.perfilopcionBeanSwingJInternalFrame.perfilopcionLogic.getPerfilOpcions());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Campo.class)) {
					opcion.setCampos(this.jInternalFrameDetalleFormOpcion.campoBeanSwingJInternalFrame.campoLogic.getCampos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.opcion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormOpcion = new OpcionDetalleFormJInternalFrame(jDesktopPane,this.opcionSessionBean.getConGuardarRelaciones(),this.opcionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormOpcion);
		this.jInternalFrameDetalleFormOpcion.setVisible(false);
		this.jInternalFrameDetalleFormOpcion.setSelected(false);						
		
		this.jInternalFrameDetalleFormOpcion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormOpcion.opcionLogic=this.opcionLogic;
		
		this.cargarCombosFrameForeignKeyOpcion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleOpcion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleOpcion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyOpcion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyOpcion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormOpcion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarOpcion"));
		
		this.jInternalFrameDetalleFormOpcion.jButtonModificarOpcion.addActionListener(new ButtonActionListener(this,"ModificarOpcion"));

		
		this.jInternalFrameDetalleFormOpcion.jButtonModificarToolBarOpcion.addActionListener(new ButtonActionListener(this,"ModificarToolBarOpcion"));
					
		this.jInternalFrameDetalleFormOpcion.jMenuItemModificarOpcion.addActionListener(new ButtonActionListener(this,"MenuItemModificarOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormOpcion.jButtonActualizarOpcion.addActionListener (new ButtonActionListener(this,"ActualizarOpcion"));
		
		
		this.jInternalFrameDetalleFormOpcion.jButtonActualizarToolBarOpcion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarOpcion"));
						
		this.jInternalFrameDetalleFormOpcion.jMenuItemActualizarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormOpcion.jButtonEliminarOpcion.addActionListener (new ButtonActionListener(this,"EliminarOpcion"));
		
		
		this.jInternalFrameDetalleFormOpcion.jButtonEliminarToolBarOpcion.addActionListener (new ButtonActionListener(this,"EliminarToolBarOpcion"));
								
		this.jInternalFrameDetalleFormOpcion.jMenuItemEliminarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormOpcion.jButtonCancelarOpcion.addActionListener (new ButtonActionListener(this,"CancelarOpcion"));
		
		
		this.jInternalFrameDetalleFormOpcion.jButtonCancelarToolBarOpcion.addActionListener (new ButtonActionListener(this,"CancelarToolBarOpcion"));
					
		this.jInternalFrameDetalleFormOpcion.jMenuItemCancelarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarOpcion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormOpcion.jMenuItemDetalleCerrarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosToolBarOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarOpcion"));
		
		
		
		this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosToolBarOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarOpcion"));
		
		
		
		this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioOpcion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonidOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_sistemaOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_sistemaOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_moduloOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_moduloOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_grupo_opcionOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_grupo_opcionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_opcionOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_opcionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtoncodigoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"codigoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonnombreOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombreOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_tipo_tecla_mascaraOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_tipo_tecla_mascaraOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonteclaOpcionBusqueda.addActionListener(new ButtonActionListener(this,"teclaOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonposicionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"posicionOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonicon_nameOpcionBusqueda.addActionListener(new ButtonActionListener(this,"icon_nameOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonnombre_claseOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_claseOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonsub_moduloOpcionBusqueda.addActionListener(new ButtonActionListener(this,"sub_moduloOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpaqueteOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paqueteOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpaquete_originalOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paquete_originalOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpath_auxiliarOpcionBusqueda.addActionListener(new ButtonActionListener(this,"path_auxiliarOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtones_para_menuOpcionBusqueda.addActionListener(new ButtonActionListener(this,"es_para_menuOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtoncon_mostrar_acciones_campoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_mostrar_acciones_campoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtones_guardar_relacionesOpcionBusqueda.addActionListener(new ButtonActionListener(this,"es_guardar_relacionesOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonestadoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoOpcionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesOpcion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameOpcion"));
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarOpcion"));
		}
		
		this.jTableDatosOpcion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarOpcion"));
		
		this.jTableDatosOpcion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarOpcion"));
		
		this.jButtonNuevoOpcion.addActionListener(new ButtonActionListener(this,"NuevoOpcion"));
		
		this.jButtonDuplicarOpcion.addActionListener(new ButtonActionListener(this,"DuplicarOpcion"));
		
		this.jButtonCopiarOpcion.addActionListener(new ButtonActionListener(this,"CopiarOpcion"));
		
		this.jButtonVerFormOpcion.addActionListener(new ButtonActionListener(this,"VerFormOpcion"));
		
		
		this.jButtonNuevoToolBarOpcion.addActionListener(new ButtonActionListener(this,"NuevoToolBarOpcion"));
			
		this.jButtonDuplicarToolBarOpcion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarOpcion"));
			
		this.jMenuItemNuevoOpcion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoOpcion"));
			
		this.jMenuItemDuplicarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarOpcion"));		
		
		
		this.jButtonNuevoRelacionesOpcion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesOpcion"));
		
		
		this.jButtonNuevoRelacionesToolBarOpcion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarOpcion"));
			
		this.jMenuItemNuevoRelacionesOpcion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesOpcion"));		
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonModificarOpcion.addActionListener(new ButtonActionListener(this,"ModificarOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonModificarToolBarOpcion.addActionListener(new ButtonActionListener(this,"ModificarToolBarOpcion"));
			
			this.jInternalFrameDetalleFormOpcion.jMenuItemModificarOpcion.addActionListener(new ButtonActionListener(this,"MenuItemModificarOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormOpcion.jButtonActualizarOpcion.addActionListener (new ButtonActionListener(this,"ActualizarOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonActualizarToolBarOpcion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarOpcion"));
				
			this.jInternalFrameDetalleFormOpcion.jMenuItemActualizarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonEliminarOpcion.addActionListener (new ButtonActionListener(this,"EliminarOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonEliminarToolBarOpcion.addActionListener (new ButtonActionListener(this,"EliminarToolBarOpcion"));
						
			this.jInternalFrameDetalleFormOpcion.jMenuItemEliminarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonCancelarOpcion.addActionListener (new ButtonActionListener(this,"CancelarOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonCancelarToolBarOpcion.addActionListener (new ButtonActionListener(this,"CancelarToolBarOpcion"));
			
			this.jInternalFrameDetalleFormOpcion.jMenuItemCancelarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarOpcion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarOpcion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarOpcion"));		
		
		
		this.jButtonCerrarOpcion.addActionListener (new ButtonActionListener(this,"CerrarOpcion"));
		
		
		this.jButtonCerrarToolBarOpcion.addActionListener (new ButtonActionListener(this,"CerrarToolBarOpcion"));
			
		this.jMenuItemCerrarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarOpcion"));
			
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jMenuItemDetalleCerrarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosToolBarOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarOpcion"));
		}
		
		this.jButtonCopiarToolBarOpcion.addActionListener (new ButtonActionListener(this,"CopiarToolBarOpcion"));
			
		this.jButtonVerFormToolBarOpcion.addActionListener (new ButtonActionListener(this,"VerFormToolBarOpcion"));
		
		this.jMenuItemGuardarCambiosOpcion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosOpcion"));
			
		this.jMenuItemCopiarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarOpcion"));		
		
		this.jMenuItemVerFormOpcion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormOpcion"));		
		
		
		this.jButtonGuardarCambiosTablaOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaOpcion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarOpcion"));
			
		this.jMenuItemGuardarCambiosTablaOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaOpcion"));		
		
		
		
		this.jButtonRecargarInformacionOpcion.addActionListener (new ButtonActionListener(this,"RecargarInformacionOpcion"));
					
		this.jButtonRecargarInformacionToolBarOpcion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarOpcion"));
		
		this.jMenuItemRecargarInformacionOpcion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionOpcion"));		
		
		
		this.jButtonArbolOpcion.addActionListener (new ButtonActionListener(this,"ArbolOpcion"));
		
		this.jButtonAnterioresOpcion.addActionListener (new ButtonActionListener(this,"AnterioresOpcion"));
		
		
		this.jButtonAnterioresToolBarOpcion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarOpcion"));
		
		this.jMenuItemAnterioresOpcion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresOpcion"));		
		
		
		this.jButtonSiguientesOpcion.addActionListener (new ButtonActionListener(this,"SiguientesOpcion"));
		
		
		this.jButtonSiguientesToolBarOpcion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarOpcion"));
			
		this.jMenuItemSiguientesOpcion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesOpcion"));
			
		this.jMenuItemAbrirOrderByOpcion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByOpcion"));
			
		this.jMenuItemMostrarOcultarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarOpcion"));
			
		this.jMenuItemDetalleAbrirOrderByOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByOpcion"));
			
		this.jMenuItemDetalleMostarOcultarOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarOpcion"));		
		
		
		this.jButtonNuevoGuardarCambiosOpcion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosOpcion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarOpcion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarOpcion"));
			
		this.jMenuItemNuevoGuardarCambiosOpcion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosOpcion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosOpcion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosOpcion"));

		this.jCheckBoxSeleccionadosOpcion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosOpcion"));
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioOpcion"));
		}
		
		
		this.jComboBoxTiposRelacionesOpcion.addActionListener (new ButtonActionListener(this,"TiposRelacionesOpcion"));
			
		this.jComboBoxTiposAccionesOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesOpcion"));
					
		this.jComboBoxTiposSeleccionarOpcion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarOpcion"));
			
		this.jTextFieldValorCampoGeneralOpcion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralOpcion"));		
		
		
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonidOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_sistemaOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_sistemaOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_moduloOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_moduloOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_grupo_opcionOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_grupo_opcionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_opcionOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_opcionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtoncodigoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"codigoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonnombreOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombreOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_tipo_tecla_mascaraOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_tipo_tecla_mascaraOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonteclaOpcionBusqueda.addActionListener(new ButtonActionListener(this,"teclaOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonposicionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"posicionOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonicon_nameOpcionBusqueda.addActionListener(new ButtonActionListener(this,"icon_nameOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonnombre_claseOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_claseOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonsub_moduloOpcionBusqueda.addActionListener(new ButtonActionListener(this,"sub_moduloOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpaqueteOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paqueteOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpaquete_originalOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paquete_originalOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpath_auxiliarOpcionBusqueda.addActionListener(new ButtonActionListener(this,"path_auxiliarOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtones_para_menuOpcionBusqueda.addActionListener(new ButtonActionListener(this,"es_para_menuOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtoncon_mostrar_acciones_campoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_mostrar_acciones_campoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtones_guardar_relacionesOpcionBusqueda.addActionListener(new ButtonActionListener(this,"es_guardar_relacionesOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonestadoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoOpcionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdModuloPorIdOpcionOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorIdOpcionOpcion"));

			this.jButtonBusquedaPorIdModuloPorNombreOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorNombreOpcion"));

			this.jButtonBusquedaPorIdSistemaPorModuloOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSistemaPorModuloOpcion"));

			this.jButtonFK_IdSistemaOpcion.addActionListener(new ButtonActionListener(this,"FK_IdSistemaOpcion"));

			this.jButtonFK_IdTipoTeclaMascaraOpcion.addActionListener(new ButtonActionListener(this,"FK_IdTipoTeclaMascaraOpcion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoOpcion!=null) {
				this.jInternalFrameReporteDinamicoOpcion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoOpcion"));
				this.jInternalFrameReporteDinamicoOpcion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoOpcion"));
				this.jInternalFrameReporteDinamicoOpcion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoOpcion"));
			}
			
			//this.jButtonCerrarReporteDinamicoOpcion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoOpcion"));				
			//this.jButtonGenerarReporteDinamicoOpcion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoOpcion"));
			//this.jButtonGenerarExcelReporteDinamicoOpcion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoOpcion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionOpcion!=null) {
				this.jInternalFrameImportacionOpcion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionOpcion"));
				this.jInternalFrameImportacionOpcion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionOpcion"));
				this.jInternalFrameImportacionOpcion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionOpcion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByOpcion.addActionListener (new ButtonActionListener(this,"AbrirOrderByOpcion"));
			
			this.jButtonAbrirOrderByToolBarOpcion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarOpcion"));			
			
			if(this.jInternalFrameOrderByOpcion!=null) {
				this.jInternalFrameOrderByOpcion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByOpcion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOpcion.jTabbedPaneRelacionesOpcion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesOpcion"));
		
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
            		closingInternalFrameOpcion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormOpcion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormOpcion = (JInternalFrameBase)event.getSource();
	            	
	            OpcionBeanSwingJInternalFrame jInternalFrameParent=(OpcionBeanSwingJInternalFrame)jInternalFrameDetalleFormOpcion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarOpcionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosOpcion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosOpcionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosOpcion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosOpcion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoOpcion";
		inputMap = this.jButtonNuevoOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoOpcionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesOpcion";
		inputMap = this.jButtonNuevoRelacionesOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoOpcionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarOpcion";
		inputMap = this.jButtonModificarOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarOpcion";
		inputMap = this.jButtonActualizarOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarOpcion";
		inputMap = this.jButtonEliminarOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarOpcion";
		inputMap = this.jButtonCancelarOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarOpcion";
		inputMap = this.jButtonCerrarOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosOpcion";
		inputMap = this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormOpcion.jButtonGuardarCambiosOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonArbolOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonArbolOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosOpcion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosOpcionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonidOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_sistemaOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_sistemaOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_moduloOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_moduloOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_grupo_opcionOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_grupo_opcionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_opcionOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_opcionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtoncodigoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"codigoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonnombreOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombreOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOpcion.jButtonid_tipo_tecla_mascaraOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonid_tipo_tecla_mascaraOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_tecla_mascaraOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonteclaOpcionBusqueda.addActionListener(new ButtonActionListener(this,"teclaOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonposicionOpcionBusqueda.addActionListener(new ButtonActionListener(this,"posicionOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonicon_nameOpcionBusqueda.addActionListener(new ButtonActionListener(this,"icon_nameOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonnombre_claseOpcionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_claseOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonsub_moduloOpcionBusqueda.addActionListener(new ButtonActionListener(this,"sub_moduloOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpaqueteOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paqueteOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpaquete_originalOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paquete_originalOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonpath_auxiliarOpcionBusqueda.addActionListener(new ButtonActionListener(this,"path_auxiliarOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtones_para_menuOpcionBusqueda.addActionListener(new ButtonActionListener(this,"es_para_menuOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtoncon_mostrar_acciones_campoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_mostrar_acciones_campoOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtones_guardar_relacionesOpcionBusqueda.addActionListener(new ButtonActionListener(this,"es_guardar_relacionesOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOpcion.jButtonestadoOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoOpcionBusqueda"));
		
		
		this.jButtonBusquedaPorIdModuloPorIdOpcionOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorIdOpcionOpcion"));

		this.jButtonBusquedaPorIdModuloPorNombreOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdModuloPorNombreOpcion"));

		this.jButtonBusquedaPorIdSistemaPorModuloOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSistemaPorModuloOpcion"));

		this.jButtonFK_IdSistemaOpcion.addActionListener(new ButtonActionListener(this,"FK_IdSistemaOpcion"));

		this.jButtonFK_IdTipoTeclaMascaraOpcion.addActionListener(new ButtonActionListener(this,"FK_IdTipoTeclaMascaraOpcion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarOpcionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarOpcion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosOpcion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
					opcionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Opcion opcionAux:opcions) {
					opcionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosOpcionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingOpcion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
						opcionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Opcion opcionAux:opcions) {
						opcionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
					
						if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESPARAMENU)) {
							existe=true;
							opcionAux.setes_para_menu(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO)) {
							existe=true;
							opcionAux.setcon_mostrar_acciones_campo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES)) {
							existe=true;
							opcionAux.setes_guardar_relaciones(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							opcionAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Opcion opcionAux:opcions) {
						
						if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESPARAMENU)) {
							existe=true;
							opcionAux.setes_para_menu(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO)) {
							existe=true;
							opcionAux.setcon_mostrar_acciones_campo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES)) {
							existe=true;
							opcionAux.setes_guardar_relaciones(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							opcionAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaOpcion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosOpcion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosOpcion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosOpcion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosOpcionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingOpcion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosOpcion.getSelectedRows();
			
			Opcion opcionLocal=new Opcion();
			
			//this.seleccionarTodosOpcion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					opcionLocal =(Opcion) this.opcionLogic.getOpcions().toArray()[this.jTableDatosOpcion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					opcionLocal =(Opcion) this.opcions.toArray()[this.jTableDatosOpcion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				opcionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
						opcionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Opcion opcionAux:opcions) {
						opcionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaOpcion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosOpcion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosOpcion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosOpcion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualOpcionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarOpcionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralOpcionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingOpcion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralOpcion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Opcion opcionAux:this.opcionLogic.getOpcions()) {
				
						if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							opcionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							opcionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_TECLA)) {
							existe=true;
							opcionAux.settecla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_POSICION)) {
							existe=true;
							opcionAux.setposicion(Short.parseShort(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ICONNAME)) {
							existe=true;
							opcionAux.seticon_name(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_NOMBRECLASE)) {
							existe=true;
							opcionAux.setnombre_clase(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_SUBMODULO)) {
							existe=true;
							opcionAux.setsub_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PAQUETE)) {
							existe=true;
							opcionAux.setpaquete(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL)) {
							existe=true;
							opcionAux.setpaquete_original(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PATHAUXILIAR)) {
							existe=true;
							opcionAux.setpath_auxiliar(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Opcion opcionAux:opcions) {
					
						if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							opcionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							opcionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_TECLA)) {
							existe=true;
							opcionAux.settecla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_POSICION)) {
							existe=true;
							opcionAux.setposicion(Short.parseShort(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ICONNAME)) {
							existe=true;
							opcionAux.seticon_name(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_NOMBRECLASE)) {
							existe=true;
							opcionAux.setnombre_clase(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_SUBMODULO)) {
							existe=true;
							opcionAux.setsub_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PAQUETE)) {
							existe=true;
							opcionAux.setpaquete(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL)) {
							existe=true;
							opcionAux.setpaquete_original(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PATHAUXILIAR)) {
							existe=true;
							opcionAux.setpath_auxiliar(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaOpcion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesOpcionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingOpcion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioOpcion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesOpcion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteOpcion) {				
					conSplash=true;//false;										
					
					//this.startProcessOpcion(conSplash);
				
					this.generarReporteOpcionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoOpcionsSeleccionados();
				//this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoOpcionsSeleccionados(false);
				//this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoOpcionsSeleccionados(true);
				//this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessOpcion();
				
				this.exportarOpcionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionOpcions();
				//this.importarOpcions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessOpcion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelOpcionsSeleccionados();
				//this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessOpcion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoOpcion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyOpcion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.setSelectedIndex(0);					
				}	
			} 			
			else if(OpcionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteOpcion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessOpcion(conSplash);
					
						//this.actualizarParametrosGeneralOpcion();
						
						this.generarReporteProcesoAccionOpcionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(OpcionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO OpcionES SELECCIONADOS?", "MANTENIMIENTO DE Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessOpcion();
				
						this.actualizarParametrosGeneralOpcion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.opcionReturnGeneral=opcionLogic.procesarAccionOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.opcionLogic.getOpcions(),this.opcionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarOpcionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralOpcion();
					
					OpcionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarOpcionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesOpcion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormOpcion.jComboBoxTiposAccionesFormularioOpcion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessOpcion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesOpcionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessOpcion();
			
			if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
			Opcion opcion=new Opcion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingOpcion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesOpcion.getSelectedItem();
			
			
			
			
			opcionsSeleccionados=this.getOpcionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(opcionsSeleccionados.size()==1) {
				for(Opcion opcionAux:opcionsSeleccionados) {
					opcion=opcionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Usuario Opcion")) {
					jButtonUsuarioOpcionActionPerformed(null,rowIndex,true,false,opcion);
				}
				else if(this.sTipoRelacion.equals("Opcion")) {
					jButtonOpcionActionPerformed(null,rowIndex,true,false,opcion);
				}
				else if(this.sTipoRelacion.equals("Accion")) {
					jButtonAccionActionPerformed(null,rowIndex,true,false,opcion);
				}
				else if(this.sTipoRelacion.equals("Perfil Opcion")) {
					jButtonPerfilOpcionActionPerformed(null,rowIndex,true,false,opcion);
				}
				else if(this.sTipoRelacion.equals("Campo")) {
					jButtonCampoActionPerformed(null,rowIndex,true,false,opcion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessOpcion();
			
      		//this.finishProcessOpcion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarOpcionReturnGeneral() throws Exception {
		if(this.opcionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.opcionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.opcionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.opcionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.opcionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.opcionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingOpcion(false);
		}
		
		if(this.opcionReturnGeneral.getConRetornoLista() || this.opcionReturnGeneral.getConRetornoObjeto()) {
			if(this.opcionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.opcionLogic.setOpcions(this.opcionReturnGeneral.getOpcions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.opcionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.opcionLogic.setOpcion(this.opcionReturnGeneral.getOpcion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingOpcion(false);
		}
	}
	
	public void actualizarParametrosGeneralOpcion() throws Exception {
		
		
	}
	
	public ArrayList<Opcion> getOpcionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioOpcion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Opcion opcionAux:opcionLogic.getOpcions()) {
					if(opcionAux.getIsSelected()) {
						opcionsSeleccionados.add(opcionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Opcion opcionAux:this.opcions) {
					if(opcionAux.getIsSelected()) {
						opcionsSeleccionados.add(opcionAux);				
					}
				}
			}
			
			if(opcionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						opcionsSeleccionados.addAll(this.opcionLogic.getOpcions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						opcionsSeleccionados.addAll(this.opcions);				
					}
				}
			}
		} else {
			opcionsSeleccionados.add(this.opcion);
		}
		
		return opcionsSeleccionados;
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
	
	public void generarReporteOpcionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalOpcionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoOpcionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoOpcionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoOpcionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesOpcionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesOpcionsSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteOpcions("Todos",opcionsSeleccionados);
		
	}	
	
	public void generarReporteNormalOpcionsSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteOpcions("Todos",opcionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionOpcionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteOpcions("Todos",opcionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoOpcionsSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoOpcion();
		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoOpcion();
		
		
		//this.generarReporteOpcions("Todos",opcionsSeleccionados ,opcionImplementable,opcionImplementableHome);
	}
	
	public void mostrarImportacionOpcions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionOpcion();
		
		this.abrirFrameImportacionOpcion();		
		
			
		//this.generarReporteOpcions("Todos",opcionsSeleccionados ,opcionImplementable,opcionImplementableHome);
	}
	
	public void importarOpcions() throws Exception {		
	
	}
	
	public void exportarOpcionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelOpcionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoOpcionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlOpcionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoOpcionsSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarOpcion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Opcion opcionAux:opcionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarOpcion(opcionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//opcionAux.setsDetalleGeneralEntityReporte(opcionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarOpcion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_IDSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_IDGRUPOOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_IDOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_TECLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_POSICION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_ICONNAME;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_NOMBRECLASE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_SUBMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_PAQUETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_PATHAUXILIAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_ESPARAMENU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OpcionConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarOpcion(Opcion opcion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=opcion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getsistema_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getgrupoopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.gettipoteclamascara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.gettecla();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getposicion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.geticon_name();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getnombre_clase();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getsub_modulo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getpaquete();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getpaquete_original();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getpath_auxiliar();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getes_para_menu().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getcon_mostrar_acciones_campo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getes_guardar_relaciones().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=opcion.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelOpcionsSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Opcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelOpcion(row);				
				iRow++;
			}				
			
			for(Opcion opcionAux:opcionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelOpcion(opcionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlOpcionsSeleccionados() throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();		
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"opcion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("opcions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("opcion");
			//elementRoot.appendChild(element);
		
			for(Opcion opcionAux:opcionsSeleccionados) {
				element = document.createElement("opcion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlOpcion(opcionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.opcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelOpcion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_IDSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_IDOPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_TECLA);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_POSICION);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_ICONNAME);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_NOMBRECLASE);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_SUBMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_PAQUETE);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_PATHAUXILIAR);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_ESPARAMENU);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES);
		cell = row.createCell(iColumn++);cell.setCellValue(OpcionConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelOpcion(Opcion opcion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getsistema_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getgrupoopcion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getopcion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.gettipoteclamascara_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.gettecla());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getposicion());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.geticon_name());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getnombre_clase());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getsub_modulo());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getpaquete());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getpaquete_original());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getpath_auxiliar());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getes_para_menu());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getcon_mostrar_acciones_campo());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getes_guardar_relaciones());
		cell = row.createCell(iColumn++);cell.setCellValue(opcion.getestado());				
	}
	
	public void setFilaDatosExportarXmlOpcion(Opcion opcion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(OpcionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(opcion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(OpcionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(opcion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementsistema_descripcion = document.createElement(OpcionConstantesFunciones.IDSISTEMA);
		elementsistema_descripcion.appendChild(document.createTextNode(opcion.getsistema_descripcion()));
		element.appendChild(elementsistema_descripcion);

		Element elementmodulo_descripcion = document.createElement(OpcionConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(opcion.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementgrupoopcion_descripcion = document.createElement(OpcionConstantesFunciones.IDGRUPOOPCION);
		elementgrupoopcion_descripcion.appendChild(document.createTextNode(opcion.getgrupoopcion_descripcion()));
		element.appendChild(elementgrupoopcion_descripcion);

		Element elementopcion_descripcion = document.createElement(OpcionConstantesFunciones.IDOPCION);
		elementopcion_descripcion.appendChild(document.createTextNode(opcion.getopcion_descripcion()));
		element.appendChild(elementopcion_descripcion);

		Element elementcodigo = document.createElement(OpcionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(opcion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(OpcionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(opcion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipoteclamascara_descripcion = document.createElement(OpcionConstantesFunciones.IDTIPOTECLAMASCARA);
		elementtipoteclamascara_descripcion.appendChild(document.createTextNode(opcion.gettipoteclamascara_descripcion()));
		element.appendChild(elementtipoteclamascara_descripcion);

		Element elementtecla = document.createElement(OpcionConstantesFunciones.TECLA);
		elementtecla.appendChild(document.createTextNode(opcion.gettecla().trim()));
		element.appendChild(elementtecla);

		Element elementposicion = document.createElement(OpcionConstantesFunciones.POSICION);
		elementposicion.appendChild(document.createTextNode(opcion.getposicion().toString().trim()));
		element.appendChild(elementposicion);

		Element elementicon_name = document.createElement(OpcionConstantesFunciones.ICONNAME);
		elementicon_name.appendChild(document.createTextNode(opcion.geticon_name().trim()));
		element.appendChild(elementicon_name);

		Element elementnombre_clase = document.createElement(OpcionConstantesFunciones.NOMBRECLASE);
		elementnombre_clase.appendChild(document.createTextNode(opcion.getnombre_clase().trim()));
		element.appendChild(elementnombre_clase);

		Element elementsub_modulo = document.createElement(OpcionConstantesFunciones.SUBMODULO);
		elementsub_modulo.appendChild(document.createTextNode(opcion.getsub_modulo().trim()));
		element.appendChild(elementsub_modulo);

		Element elementpaquete = document.createElement(OpcionConstantesFunciones.PAQUETE);
		elementpaquete.appendChild(document.createTextNode(opcion.getpaquete().trim()));
		element.appendChild(elementpaquete);

		Element elementpaquete_original = document.createElement(OpcionConstantesFunciones.PAQUETEORIGINAL);
		elementpaquete_original.appendChild(document.createTextNode(opcion.getpaquete_original().trim()));
		element.appendChild(elementpaquete_original);

		Element elementpath_auxiliar = document.createElement(OpcionConstantesFunciones.PATHAUXILIAR);
		elementpath_auxiliar.appendChild(document.createTextNode(opcion.getpath_auxiliar().trim()));
		element.appendChild(elementpath_auxiliar);

		Element elementes_para_menu = document.createElement(OpcionConstantesFunciones.ESPARAMENU);
		elementes_para_menu.appendChild(document.createTextNode(opcion.getes_para_menu().toString().trim()));
		element.appendChild(elementes_para_menu);

		Element elementcon_mostrar_acciones_campo = document.createElement(OpcionConstantesFunciones.CONMOSTRARACCIONESCAMPO);
		elementcon_mostrar_acciones_campo.appendChild(document.createTextNode(opcion.getcon_mostrar_acciones_campo().toString().trim()));
		element.appendChild(elementcon_mostrar_acciones_campo);

		Element elementes_guardar_relaciones = document.createElement(OpcionConstantesFunciones.ESGUARDARRELACIONES);
		elementes_guardar_relaciones.appendChild(document.createTextNode(opcion.getes_guardar_relaciones().toString().trim()));
		element.appendChild(elementes_guardar_relaciones);

		Element elementestado = document.createElement(OpcionConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(opcion.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoOpcionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Opcion> opcionsSeleccionados=new ArrayList<Opcion>();
		
		opcionsSeleccionados=this.getOpcionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoOpcion(opcionsSeleccionados);
		
		this.generarReporteOpcions("Todos",opcionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoOpcion(ArrayList<Opcion> opcionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Opcion opcionAux:opcionsSeleccionados) {
				opcionAux.setsDetalleGeneralEntityReporte(opcionAux.toString());
			
				if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_IDSISTEMA)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getsistema_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_IDGRUPOOPCION)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getgrupoopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_IDOPCION)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_IDTIPOTECLAMASCARA)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.gettipoteclamascara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_TECLA)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.gettecla());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_POSICION)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getposicion().toString());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ICONNAME)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.geticon_name());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_NOMBRECLASE)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getnombre_clase());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_SUBMODULO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getsub_modulo());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PAQUETE)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getpaquete());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PAQUETEORIGINAL)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getpaquete_original());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_PATHAUXILIAR)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(opcionAux.getpath_auxiliar());
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESPARAMENU)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(opcionAux.getes_para_menu()));
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(opcionAux.getcon_mostrar_acciones_campo()));
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESGUARDARRELACIONES)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(opcionAux.getes_guardar_relaciones()));
				}
				 else if(sTipoSeleccionar.equals(OpcionConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					opcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(opcionAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesOpcion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoOpcion=true;
				this.isVisibilidadCeldaNuevoRelacionesOpcion=true;
				this.isVisibilidadCeldaGuardarCambiosOpcion=true;
			}
			
			this.isVisibilidadCeldaModificarOpcion=false;
			this.isVisibilidadCeldaActualizarOpcion=false;
			this.isVisibilidadCeldaEliminarOpcion=false;
			this.isVisibilidadCeldaCancelarOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarOpcion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosOpcion=false;
			this.isVisibilidadCeldaModificarOpcion=false;
			this.isVisibilidadCeldaActualizarOpcion=true;
			this.isVisibilidadCeldaEliminarOpcion=false;
			this.isVisibilidadCeldaCancelarOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarOpcion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosOpcion=false;
			this.isVisibilidadCeldaModificarOpcion=false;
			this.isVisibilidadCeldaActualizarOpcion=true;
			this.isVisibilidadCeldaEliminarOpcion=true;
			this.isVisibilidadCeldaCancelarOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarOpcion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosOpcion=false;
			this.isVisibilidadCeldaModificarOpcion=false;
			this.isVisibilidadCeldaActualizarOpcion=true;
			this.isVisibilidadCeldaEliminarOpcion=false;
			this.isVisibilidadCeldaCancelarOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarOpcion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesOpcion=true;
			this.isVisibilidadCeldaGuardarCambiosOpcion=true;
			this.isVisibilidadCeldaModificarOpcion=false;
			this.isVisibilidadCeldaActualizarOpcion=false;
			this.isVisibilidadCeldaEliminarOpcion=false;
			this.isVisibilidadCeldaCancelarOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarOpcion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosOpcion=false;
			this.isVisibilidadCeldaActualizarOpcion=false;
			this.isVisibilidadCeldaEliminarOpcion=false;
			this.isVisibilidadCeldaCancelarOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarOpcion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosOpcion=false;
			this.isVisibilidadCeldaModificarOpcion=true;
			this.isVisibilidadCeldaActualizarOpcion=false;
			this.isVisibilidadCeldaEliminarOpcion=false;
			this.isVisibilidadCeldaCancelarOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarOpcion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(OpcionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesOpcion=true;
			this.isVisibilidadCeldaGuardarCambiosOpcion=true;
		} else {
			this.actualizarEstadoPanelsOpcion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarOpcion=false;
			//this.isVisibilidadCeldaVerFormOpcion=false;
			this.isVisibilidadCeldaDuplicarOpcion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!opcionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesOpcion=false;
		} else {
			this.isVisibilidadCeldaNuevoOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosOpcion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(opcionSessionBean.getEsGuardarRelacionado()) {
			if(!opcionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesOpcion=false;												
			}
			
			this.jButtonCerrarOpcion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesOpcion=false;
		}
		
		if(!this.permiteMantenimiento(this.opcion)) {
			this.isVisibilidadCeldaActualizarOpcion=false;
			this.isVisibilidadCeldaEliminarOpcion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesOpcion() {
		this.isVisibilidadCeldaNuevoOpcion=false;
		this.isVisibilidadCeldaGuardarCambiosOpcion=false;
	}
	
	public void actualizarEstadoPanelsOpcion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionOpcion!=null) {
				this.jScrollPanelDatosEdicionOpcion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOpcion!=null) {
				this.jTabbedPaneBusquedasOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosOpcion!=null) {
				this.jScrollPanelDatosOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionOpcion!=null) {
				this.jPanelPaginacionOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionOpcion!=null) {
				this.jScrollPanelDatosEdicionOpcion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOpcion!=null) {
				this.jTabbedPaneBusquedasOpcion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosOpcion!=null) {
				this.jScrollPanelDatosOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionOpcion!=null) {
				this.jPanelPaginacionOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionOpcion!=null) {
				this.jScrollPanelDatosEdicionOpcion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOpcion!=null) {
				this.jTabbedPaneBusquedasOpcion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosOpcion!=null) {
				this.jScrollPanelDatosOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionOpcion!=null) {
				this.jPanelPaginacionOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionOpcion!=null) {
				this.jScrollPanelDatosEdicionOpcion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOpcion!=null) {
				this.jTabbedPaneBusquedasOpcion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosOpcion!=null) {
				this.jScrollPanelDatosOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionOpcion!=null) {
				this.jPanelPaginacionOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionOpcion!=null) {
				this.jScrollPanelDatosEdicionOpcion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOpcion!=null) {
				this.jTabbedPaneBusquedasOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosOpcion!=null) {
				this.jScrollPanelDatosOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionOpcion!=null) {
				this.jPanelPaginacionOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionOpcion!=null) {
				this.jScrollPanelDatosEdicionOpcion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOpcion!=null) {
				this.jTabbedPaneBusquedasOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosOpcion!=null) {
				this.jScrollPanelDatosOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionOpcion!=null) {
				this.jPanelPaginacionOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionOpcion!=null) {
				this.jScrollPanelDatosEdicionOpcion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOpcion!=null) {
				this.jTabbedPaneBusquedasOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosOpcion!=null) {
				this.jScrollPanelDatosOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionOpcion!=null) {
				this.jPanelPaginacionOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.opcionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasOpcion!=null) {
					this.jTabbedPaneBusquedasOpcion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.opcionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOpcion!=null) {
				this.jTabbedPaneBusquedasOpcion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesOpcion!=null) {
				this.jPanelParametrosReportesOpcion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaSistema(Boolean isParaSistema){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSistemaNegation=!isParaSistema;

			this.isVisibilidadBusquedaPorIdModuloPorIdOpcion=isParaSistema;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdOpcion) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorIdOpcionOpcion);}

			this.isVisibilidadBusquedaPorIdModuloPorNombre=isParaSistema;
			if(!this.isVisibilidadBusquedaPorIdModuloPorNombre) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorNombreOpcion);}

			this.isVisibilidadBusquedaPorIdSistemaPorModulo=isParaSistema;
			if(!this.isVisibilidadBusquedaPorIdSistemaPorModulo) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdSistemaPorModuloOpcion);}

			this.isVisibilidadFK_IdSistema=isParaSistema;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdSistemaOpcion);}

			this.isVisibilidadFK_IdTipoTeclaMascara=isParaSistemaNegation;
			if(!this.isVisibilidadFK_IdTipoTeclaMascara) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdTipoTeclaMascaraOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorIdModuloPorIdOpcion=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdOpcion) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorIdOpcionOpcion);}

			this.isVisibilidadBusquedaPorIdModuloPorNombre=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdModuloPorNombre) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorNombreOpcion);}

			this.isVisibilidadBusquedaPorIdSistemaPorModulo=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdSistemaPorModulo) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdSistemaPorModuloOpcion);}

			this.isVisibilidadFK_IdSistema=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdSistemaOpcion);}

			this.isVisibilidadFK_IdTipoTeclaMascara=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoTeclaMascara) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdTipoTeclaMascaraOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoOpcion(Boolean isParaGrupoOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoOpcionNegation=!isParaGrupoOpcion;

			this.isVisibilidadBusquedaPorIdModuloPorIdOpcion=isParaGrupoOpcionNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdOpcion) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorIdOpcionOpcion);}

			this.isVisibilidadBusquedaPorIdModuloPorNombre=isParaGrupoOpcionNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorNombre) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorNombreOpcion);}

			this.isVisibilidadBusquedaPorIdSistemaPorModulo=isParaGrupoOpcionNegation;
			if(!this.isVisibilidadBusquedaPorIdSistemaPorModulo) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdSistemaPorModuloOpcion);}

			this.isVisibilidadFK_IdSistema=isParaGrupoOpcionNegation;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdSistemaOpcion);}

			this.isVisibilidadFK_IdTipoTeclaMascara=isParaGrupoOpcionNegation;
			if(!this.isVisibilidadFK_IdTipoTeclaMascara) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdTipoTeclaMascaraOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaOpcion(Boolean isParaOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOpcionNegation=!isParaOpcion;

			this.isVisibilidadBusquedaPorIdModuloPorIdOpcion=isParaOpcion;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdOpcion) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorIdOpcionOpcion);}

			this.isVisibilidadBusquedaPorIdModuloPorNombre=isParaOpcionNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorNombre) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorNombreOpcion);}

			this.isVisibilidadBusquedaPorIdSistemaPorModulo=isParaOpcionNegation;
			if(!this.isVisibilidadBusquedaPorIdSistemaPorModulo) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdSistemaPorModuloOpcion);}

			this.isVisibilidadFK_IdSistema=isParaOpcionNegation;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdSistemaOpcion);}

			this.isVisibilidadFK_IdTipoTeclaMascara=isParaOpcionNegation;
			if(!this.isVisibilidadFK_IdTipoTeclaMascara) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdTipoTeclaMascaraOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoTeclaMascara(Boolean isParaTipoTeclaMascara){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoTeclaMascaraNegation=!isParaTipoTeclaMascara;

			this.isVisibilidadBusquedaPorIdModuloPorIdOpcion=isParaTipoTeclaMascaraNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorIdOpcion) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorIdOpcionOpcion);}

			this.isVisibilidadBusquedaPorIdModuloPorNombre=isParaTipoTeclaMascaraNegation;
			if(!this.isVisibilidadBusquedaPorIdModuloPorNombre) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdModuloPorNombreOpcion);}

			this.isVisibilidadBusquedaPorIdSistemaPorModulo=isParaTipoTeclaMascaraNegation;
			if(!this.isVisibilidadBusquedaPorIdSistemaPorModulo) {this.jTabbedPaneBusquedasOpcion.remove(jPanelBusquedaPorIdSistemaPorModuloOpcion);}

			this.isVisibilidadFK_IdSistema=isParaTipoTeclaMascaraNegation;
			if(!this.isVisibilidadFK_IdSistema) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdSistemaOpcion);}

			this.isVisibilidadFK_IdTipoTeclaMascara=isParaTipoTeclaMascara;
			if(!this.isVisibilidadFK_IdTipoTeclaMascara) {this.jTabbedPaneBusquedasOpcion.remove(jPanelFK_IdTipoTeclaMascaraOpcion);}
		}
		
	}
	
	

	public String registrarSesionOpcionParaUsuarioOpciones() throws Exception {
		Boolean isPaginaPopupUsuarioOpcion=false;

		try {

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean==null) {
				this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean=new UsuarioOpcionSessionBean();
			}

			this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean.setsPathNavegacionActual(opcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+UsuarioOpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupUsuarioOpcion=this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeUsuarioOpcion(false);
			this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeUsuarioOpcion(OpcionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
			this.jInternalFrameDetalleFormOpcion.usuarioopcionSessionBean.setlidOpcionActual(this.idOpcionActual);

			opcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyOpcion(true);
			opcionSessionBean.setlIdOpcionActualForeignKey(this.idOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionOpcionParaOpciones() throws Exception {
		Boolean isPaginaPopupOpcion=false;

		try {

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(this.jInternalFrameDetalleFormOpcion.opcionSessionBean==null) {
				this.jInternalFrameDetalleFormOpcion.opcionSessionBean=new OpcionSessionBean();
			}

			this.jInternalFrameDetalleFormOpcion.opcionSessionBean.setsPathNavegacionActual(opcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+OpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormOpcion.opcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupOpcion=this.jInternalFrameDetalleFormOpcion.opcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormOpcion.opcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeOpcion(true);
			this.jInternalFrameDetalleFormOpcion.opcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion(OpcionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormOpcion.opcionSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
			this.jInternalFrameDetalleFormOpcion.opcionSessionBean.setlidOpcionActual(this.idOpcionActual);

			opcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyOpcion(true);
			opcionSessionBean.setlIdOpcionActualForeignKey(this.idOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionOpcionParaAcciones() throws Exception {
		Boolean isPaginaPopupAccion=false;

		try {

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(this.jInternalFrameDetalleFormOpcion.accionSessionBean==null) {
				this.jInternalFrameDetalleFormOpcion.accionSessionBean=new AccionSessionBean();
			}

			this.jInternalFrameDetalleFormOpcion.accionSessionBean.setsPathNavegacionActual(opcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AccionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormOpcion.accionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAccion=this.jInternalFrameDetalleFormOpcion.accionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormOpcion.accionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormOpcion.accionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAccion(false);
			this.jInternalFrameDetalleFormOpcion.accionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAccion(OpcionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormOpcion.accionSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
			this.jInternalFrameDetalleFormOpcion.accionSessionBean.setlidOpcionActual(this.idOpcionActual);

			opcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyOpcion(true);
			opcionSessionBean.setlIdOpcionActualForeignKey(this.idOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionOpcionParaPerfilOpciones() throws Exception {
		Boolean isPaginaPopupPerfilOpcion=false;

		try {

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean==null) {
				this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean.setsPathNavegacionActual(opcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPerfilOpcion=this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfilOpcion(false);
			this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfilOpcion(OpcionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
			this.jInternalFrameDetalleFormOpcion.perfilopcionSessionBean.setlidOpcionActual(this.idOpcionActual);

			opcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyOpcion(true);
			opcionSessionBean.setlIdOpcionActualForeignKey(this.idOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionOpcionParaCampos() throws Exception {
		Boolean isPaginaPopupCampo=false;

		try {

			if(this.opcionSessionBean==null) {
				this.opcionSessionBean=new OpcionSessionBean();
			}

			if(this.jInternalFrameDetalleFormOpcion.campoSessionBean==null) {
				this.jInternalFrameDetalleFormOpcion.campoSessionBean=new CampoSessionBean();
			}

			this.jInternalFrameDetalleFormOpcion.campoSessionBean.setsPathNavegacionActual(opcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CampoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormOpcion.campoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCampo=this.jInternalFrameDetalleFormOpcion.campoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormOpcion.campoSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormOpcion.campoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCampo(false);
			this.jInternalFrameDetalleFormOpcion.campoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCampo(OpcionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormOpcion.campoSessionBean.setisBusquedaDesdeForeignKeySesionOpcion(true);
			this.jInternalFrameDetalleFormOpcion.campoSessionBean.setlidOpcionActual(this.idOpcionActual);

			opcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyOpcion(true);
			opcionSessionBean.setlIdOpcionActualForeignKey(this.idOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//OpcionSessionBean opcionSessionBean=new OpcionSessionBean();
		
		if(this.opcionSessionBean==null) {
			this.opcionSessionBean=new OpcionSessionBean();
		}
		
		this.opcionSessionBean.setsUltimaBusquedaOpcion(this.getsAccionBusqueda());
		this.opcionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.opcionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorIdOpcion")) {
			opcionSessionBean.setid_sistema(this.getid_sistemaBusquedaPorIdModuloPorIdOpcion());	
			opcionSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdModuloPorIdOpcion());	
			opcionSessionBean.setid_opcion(this.getid_opcionBusquedaPorIdModuloPorIdOpcion());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorNombre")) {
			opcionSessionBean.setid_sistema(this.getid_sistemaBusquedaPorIdModuloPorNombre());	
			opcionSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdModuloPorNombre());	
			opcionSessionBean.setnombre(this.getnombreBusquedaPorIdModuloPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIdSistemaPorModulo")) {
			opcionSessionBean.setid_sistema(this.getid_sistemaBusquedaPorIdSistemaPorModulo());	
			opcionSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdSistemaPorModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
			opcionSessionBean.setid_sistema(this.getid_sistemaFK_IdSistema());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoTeclaMascara")) {
			opcionSessionBean.setid_tipo_tecla_mascara(this.getid_tipo_tecla_mascaraFK_IdTipoTeclaMascara());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//OpcionSessionBean opcionSessionBean=new OpcionSessionBean();
		
		if(this.opcionSessionBean==null) {
			this.opcionSessionBean=new OpcionSessionBean();
		}
		
		if(this.opcionSessionBean.getsUltimaBusquedaOpcion()!=null&&!this.opcionSessionBean.getsUltimaBusquedaOpcion().equals("")) {
			this.setsAccionBusqueda(opcionSessionBean.getsUltimaBusquedaOpcion());
			this.setiNumeroPaginacion(opcionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(opcionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorIdOpcion")) {
				this.setid_sistemaBusquedaPorIdModuloPorIdOpcion(opcionSessionBean.getid_sistema());
				opcionSessionBean.setid_sistema(-1L);
				this.setid_moduloBusquedaPorIdModuloPorIdOpcion(opcionSessionBean.getid_modulo());
				opcionSessionBean.setid_modulo(-1L);
				this.setid_opcionBusquedaPorIdModuloPorIdOpcion(opcionSessionBean.getid_opcion());
				opcionSessionBean.setid_opcion(null);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdModuloPorNombre")) {
				this.setid_sistemaBusquedaPorIdModuloPorNombre(opcionSessionBean.getid_sistema());
				opcionSessionBean.setid_sistema(-1L);
				this.setid_moduloBusquedaPorIdModuloPorNombre(opcionSessionBean.getid_modulo());
				opcionSessionBean.setid_modulo(-1L);
				this.setnombreBusquedaPorIdModuloPorNombre(opcionSessionBean.getnombre());
				opcionSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdSistemaPorModulo")) {
				this.setid_sistemaBusquedaPorIdSistemaPorModulo(opcionSessionBean.getid_sistema());
				opcionSessionBean.setid_sistema(-1L);
				this.setid_moduloBusquedaPorIdSistemaPorModulo(opcionSessionBean.getid_modulo());
				opcionSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSistema")) {
				this.setid_sistemaFK_IdSistema(opcionSessionBean.getid_sistema());
				opcionSessionBean.setid_sistema(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoTeclaMascara")) {
				this.setid_tipo_tecla_mascaraFK_IdTipoTeclaMascara(opcionSessionBean.getid_tipo_tecla_mascara());
				opcionSessionBean.setid_tipo_tecla_mascara(-1L);
			}
		}
		
		this.opcionSessionBean.setsUltimaBusquedaOpcion("");
		this.opcionSessionBean.setiNumeroPaginacion(OpcionConstantesFunciones.INUMEROPAGINACION);
		this.opcionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaOpcion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioOpcion() {
		this.updateBorderResaltarBusquedasFormularioOpcion();
		this.updateVisibilidadBusquedasFormularioOpcion();
		this.updateHabilitarBusquedasFormularioOpcion();
	}
	
	public void updateBorderResaltarBusquedasFormularioOpcion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasOpcion.getComponents().length>0) {
	

		if(this.opcionConstantesFunciones.resaltarBusquedaPorIdModuloPorIdOpcionOpcion!=null) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdOpcionOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFunciones.resaltarBusquedaPorIdModuloPorIdOpcionOpcion);
			}
		}

		if(this.opcionConstantesFunciones.resaltarBusquedaPorIdModuloPorNombreOpcion!=null) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorNombreOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFunciones.resaltarBusquedaPorIdModuloPorNombreOpcion);
			}
		}

		if(this.opcionConstantesFunciones.resaltarBusquedaPorIdSistemaPorModuloOpcion!=null) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdSistemaPorModuloOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFunciones.resaltarBusquedaPorIdSistemaPorModuloOpcion);
			}
		}

		if(this.opcionConstantesFunciones.resaltarFK_IdSistemaOpcion!=null) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelFK_IdSistemaOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFunciones.resaltarFK_IdSistemaOpcion);
			}
		}

		if(this.opcionConstantesFunciones.resaltarFK_IdTipoTeclaMascaraOpcion!=null) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelFK_IdTipoTeclaMascaraOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				jPanel.setBorder(this.opcionConstantesFunciones.resaltarFK_IdTipoTeclaMascaraOpcion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioOpcion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasOpcion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdOpcionOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFunciones.mostrarBusquedaPorIdModuloPorIdOpcionOpcion);
			if(!this.opcionConstantesFunciones.mostrarBusquedaPorIdModuloPorIdOpcionOpcion && index>-1) {
				this.jTabbedPaneBusquedasOpcion.remove(index);
			}

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorNombreOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFunciones.mostrarBusquedaPorIdModuloPorNombreOpcion);
			if(!this.opcionConstantesFunciones.mostrarBusquedaPorIdModuloPorNombreOpcion && index>-1) {
				this.jTabbedPaneBusquedasOpcion.remove(index);
			}

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdSistemaPorModuloOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFunciones.mostrarBusquedaPorIdSistemaPorModuloOpcion);
			if(!this.opcionConstantesFunciones.mostrarBusquedaPorIdSistemaPorModuloOpcion && index>-1) {
				this.jTabbedPaneBusquedasOpcion.remove(index);
			}

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelFK_IdSistemaOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFunciones.mostrarFK_IdSistemaOpcion);
			if(!this.opcionConstantesFunciones.mostrarFK_IdSistemaOpcion && index>-1) {
				this.jTabbedPaneBusquedasOpcion.remove(index);
			}

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelFK_IdTipoTeclaMascaraOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.opcionConstantesFunciones.mostrarFK_IdTipoTeclaMascaraOpcion);
			if(!this.opcionConstantesFunciones.mostrarFK_IdTipoTeclaMascaraOpcion && index>-1) {
				this.jTabbedPaneBusquedasOpcion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioOpcion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasOpcion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdOpcionOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFunciones.activarBusquedaPorIdModuloPorIdOpcionOpcion);
				this.jTabbedPaneBusquedasOpcion.setEnabledAt(index,this.opcionConstantesFunciones.activarBusquedaPorIdModuloPorIdOpcionOpcion);
			}

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorNombreOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFunciones.activarBusquedaPorIdModuloPorNombreOpcion);
				this.jTabbedPaneBusquedasOpcion.setEnabledAt(index,this.opcionConstantesFunciones.activarBusquedaPorIdModuloPorNombreOpcion);
			}

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdSistemaPorModuloOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFunciones.activarBusquedaPorIdSistemaPorModuloOpcion);
				this.jTabbedPaneBusquedasOpcion.setEnabledAt(index,this.opcionConstantesFunciones.activarBusquedaPorIdSistemaPorModuloOpcion);
			}

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelFK_IdSistemaOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFunciones.activarFK_IdSistemaOpcion);
				this.jTabbedPaneBusquedasOpcion.setEnabledAt(index,this.opcionConstantesFunciones.activarFK_IdSistemaOpcion);
			}

			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelFK_IdTipoTeclaMascaraOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.opcionConstantesFunciones.activarFK_IdTipoTeclaMascaraOpcion);
				this.jTabbedPaneBusquedasOpcion.setEnabledAt(index,this.opcionConstantesFunciones.activarFK_IdTipoTeclaMascaraOpcion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaOpcion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdModuloPorIdOpcion")) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorIdOpcionOpcion);

			this.jTabbedPaneBusquedasOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);

			this.opcionConstantesFunciones.setResaltarBusquedaPorIdModuloPorIdOpcionOpcion(resaltar);

			jPanel.setBorder(this.opcionConstantesFunciones.resaltarBusquedaPorIdModuloPorIdOpcionOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIdModuloPorNombre")) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdModuloPorNombreOpcion);

			this.jTabbedPaneBusquedasOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);

			this.opcionConstantesFunciones.setResaltarBusquedaPorIdModuloPorNombreOpcion(resaltar);

			jPanel.setBorder(this.opcionConstantesFunciones.resaltarBusquedaPorIdModuloPorNombreOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIdSistemaPorModulo")) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelBusquedaPorIdSistemaPorModuloOpcion);

			this.jTabbedPaneBusquedasOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);

			this.opcionConstantesFunciones.setResaltarBusquedaPorIdSistemaPorModuloOpcion(resaltar);

			jPanel.setBorder(this.opcionConstantesFunciones.resaltarBusquedaPorIdSistemaPorModuloOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSistema")) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelFK_IdSistemaOpcion);

			this.jTabbedPaneBusquedasOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);

			this.opcionConstantesFunciones.setResaltarFK_IdSistemaOpcion(resaltar);

			jPanel.setBorder(this.opcionConstantesFunciones.resaltarFK_IdSistemaOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoTeclaMascara")) {
			index= this.jTabbedPaneBusquedasOpcion.indexOfComponent(this.jPanelFK_IdTipoTeclaMascaraOpcion);

			this.jTabbedPaneBusquedasOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOpcion.getComponent(index);

			this.opcionConstantesFunciones.setResaltarFK_IdTipoTeclaMascaraOpcion(resaltar);

			jPanel.setBorder(this.opcionConstantesFunciones.resaltarFK_IdTipoTeclaMascaraOpcion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarOpcion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioOpcion() throws Exception {

		if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioOpcion();
		this.updateVisibilidadResaltarControlesFormularioOpcion();
		this.updateHabilitarResaltarControlesFormularioOpcion();
		
	}
	
	public void updateBorderResaltarControlesFormularioOpcion() throws Exception {
		if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.opcionConstantesFunciones.resaltaridOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.setBorder(this.opcionConstantesFunciones.resaltaridOpcion);}
		if(this.opcionConstantesFunciones.resaltarid_sistemaOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setBorder(this.opcionConstantesFunciones.resaltarid_sistemaOpcion);}
		if(this.opcionConstantesFunciones.resaltarid_moduloOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setBorder(this.opcionConstantesFunciones.resaltarid_moduloOpcion);}
		if(this.opcionConstantesFunciones.resaltarid_grupo_opcionOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setBorder(this.opcionConstantesFunciones.resaltarid_grupo_opcionOpcion);}
		if(this.opcionConstantesFunciones.resaltarid_opcionOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setBorder(this.opcionConstantesFunciones.resaltarid_opcionOpcion);}
		if(this.opcionConstantesFunciones.resaltarcodigoOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextFieldcodigoOpcion.setBorder(this.opcionConstantesFunciones.resaltarcodigoOpcion);}
		if(this.opcionConstantesFunciones.resaltarnombreOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextFieldnombreOpcion.setBorder(this.opcionConstantesFunciones.resaltarnombreOpcion);}
		if(this.opcionConstantesFunciones.resaltarid_tipo_tecla_mascaraOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setBorder(this.opcionConstantesFunciones.resaltarid_tipo_tecla_mascaraOpcion);}
		if(this.opcionConstantesFunciones.resaltarteclaOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextFieldteclaOpcion.setBorder(this.opcionConstantesFunciones.resaltarteclaOpcion);}
		if(this.opcionConstantesFunciones.resaltarposicionOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextFieldposicionOpcion.setBorder(this.opcionConstantesFunciones.resaltarposicionOpcion);}
		if(this.opcionConstantesFunciones.resaltaricon_nameOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextAreaicon_nameOpcion.setBorder(this.opcionConstantesFunciones.resaltaricon_nameOpcion);}
		if(this.opcionConstantesFunciones.resaltarnombre_claseOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextFieldnombre_claseOpcion.setBorder(this.opcionConstantesFunciones.resaltarnombre_claseOpcion);}
		if(this.opcionConstantesFunciones.resaltarsub_moduloOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextFieldsub_moduloOpcion.setBorder(this.opcionConstantesFunciones.resaltarsub_moduloOpcion);}
		if(this.opcionConstantesFunciones.resaltarpaqueteOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextAreapaqueteOpcion.setBorder(this.opcionConstantesFunciones.resaltarpaqueteOpcion);}
		if(this.opcionConstantesFunciones.resaltarpaquete_originalOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextAreapaquete_originalOpcion.setBorder(this.opcionConstantesFunciones.resaltarpaquete_originalOpcion);}
		if(this.opcionConstantesFunciones.resaltarpath_auxiliarOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jTextFieldpath_auxiliarOpcion.setBorder(this.opcionConstantesFunciones.resaltarpath_auxiliarOpcion);}
		if(this.opcionConstantesFunciones.resaltares_para_menuOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.setBorder(this.opcionConstantesFunciones.resaltares_para_menuOpcion);}
		if(this.opcionConstantesFunciones.resaltarcon_mostrar_acciones_campoOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.setBorder(this.opcionConstantesFunciones.resaltarcon_mostrar_acciones_campoOpcion);}
		if(this.opcionConstantesFunciones.resaltares_guardar_relacionesOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.setBorder(this.opcionConstantesFunciones.resaltares_guardar_relacionesOpcion);}
		if(this.opcionConstantesFunciones.resaltarestadoOpcion!=null && this.jInternalFrameDetalleFormOpcion!=null) {this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.setBorder(this.opcionConstantesFunciones.resaltarestadoOpcion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioOpcion() throws Exception {		
		if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormOpcion!=null) {
	
		//this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.setVisible(this.opcionConstantesFunciones.mostraridOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelidOpcion.setVisible(this.opcionConstantesFunciones.mostraridOpcion);
		//this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_sistemaOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelid_sistemaOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_sistemaOpcion);
		//this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_moduloOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelid_moduloOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_moduloOpcion);
		//this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_grupo_opcionOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelid_grupo_opcionOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_grupo_opcionOpcion);
		//this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_opcionOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelid_opcionOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_opcionOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextFieldcodigoOpcion.setVisible(this.opcionConstantesFunciones.mostrarcodigoOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelcodigoOpcion.setVisible(this.opcionConstantesFunciones.mostrarcodigoOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextFieldnombreOpcion.setVisible(this.opcionConstantesFunciones.mostrarnombreOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelnombreOpcion.setVisible(this.opcionConstantesFunciones.mostrarnombreOpcion);
		//this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_tipo_tecla_mascaraOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelid_tipo_tecla_mascaraOpcion.setVisible(this.opcionConstantesFunciones.mostrarid_tipo_tecla_mascaraOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextFieldteclaOpcion.setVisible(this.opcionConstantesFunciones.mostrarteclaOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelteclaOpcion.setVisible(this.opcionConstantesFunciones.mostrarteclaOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextFieldposicionOpcion.setVisible(this.opcionConstantesFunciones.mostrarposicionOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelposicionOpcion.setVisible(this.opcionConstantesFunciones.mostrarposicionOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextAreaicon_nameOpcion.setVisible(this.opcionConstantesFunciones.mostraricon_nameOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelicon_nameOpcion.setVisible(this.opcionConstantesFunciones.mostraricon_nameOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextFieldnombre_claseOpcion.setVisible(this.opcionConstantesFunciones.mostrarnombre_claseOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelnombre_claseOpcion.setVisible(this.opcionConstantesFunciones.mostrarnombre_claseOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextFieldsub_moduloOpcion.setVisible(this.opcionConstantesFunciones.mostrarsub_moduloOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelsub_moduloOpcion.setVisible(this.opcionConstantesFunciones.mostrarsub_moduloOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextAreapaqueteOpcion.setVisible(this.opcionConstantesFunciones.mostrarpaqueteOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelpaqueteOpcion.setVisible(this.opcionConstantesFunciones.mostrarpaqueteOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextAreapaquete_originalOpcion.setVisible(this.opcionConstantesFunciones.mostrarpaquete_originalOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelpaquete_originalOpcion.setVisible(this.opcionConstantesFunciones.mostrarpaquete_originalOpcion);
		//this.jInternalFrameDetalleFormOpcion.jTextFieldpath_auxiliarOpcion.setVisible(this.opcionConstantesFunciones.mostrarpath_auxiliarOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelpath_auxiliarOpcion.setVisible(this.opcionConstantesFunciones.mostrarpath_auxiliarOpcion);
		//this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.setVisible(this.opcionConstantesFunciones.mostrares_para_menuOpcion);
		this.jInternalFrameDetalleFormOpcion.jPaneles_para_menuOpcion.setVisible(this.opcionConstantesFunciones.mostrares_para_menuOpcion);
		//this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.setVisible(this.opcionConstantesFunciones.mostrarcon_mostrar_acciones_campoOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelcon_mostrar_acciones_campoOpcion.setVisible(this.opcionConstantesFunciones.mostrarcon_mostrar_acciones_campoOpcion);
		//this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.setVisible(this.opcionConstantesFunciones.mostrares_guardar_relacionesOpcion);
		this.jInternalFrameDetalleFormOpcion.jPaneles_guardar_relacionesOpcion.setVisible(this.opcionConstantesFunciones.mostrares_guardar_relacionesOpcion);
		//this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.setVisible(this.opcionConstantesFunciones.mostrarestadoOpcion);
		this.jInternalFrameDetalleFormOpcion.jPanelestadoOpcion.setVisible(this.opcionConstantesFunciones.mostrarestadoOpcion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioOpcion() throws Exception {
		if(this.jInternalFrameDetalleFormOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormOpcion!=null) {
	
		this.jInternalFrameDetalleFormOpcion.jLabelidOpcion.setEnabled(this.opcionConstantesFunciones.activaridOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_sistemaOpcion.setEnabled(this.opcionConstantesFunciones.activarid_sistemaOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_moduloOpcion.setEnabled(this.opcionConstantesFunciones.activarid_moduloOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_grupo_opcionOpcion.setEnabled(this.opcionConstantesFunciones.activarid_grupo_opcionOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_opcionOpcion.setEnabled(this.opcionConstantesFunciones.activarid_opcionOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldcodigoOpcion.setEnabled(this.opcionConstantesFunciones.activarcodigoOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldnombreOpcion.setEnabled(this.opcionConstantesFunciones.activarnombreOpcion);
		this.jInternalFrameDetalleFormOpcion.jComboBoxid_tipo_tecla_mascaraOpcion.setEnabled(this.opcionConstantesFunciones.activarid_tipo_tecla_mascaraOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldteclaOpcion.setEnabled(this.opcionConstantesFunciones.activarteclaOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldposicionOpcion.setEnabled(this.opcionConstantesFunciones.activarposicionOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextAreaicon_nameOpcion.setEnabled(this.opcionConstantesFunciones.activaricon_nameOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldnombre_claseOpcion.setEnabled(this.opcionConstantesFunciones.activarnombre_claseOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldsub_moduloOpcion.setEnabled(this.opcionConstantesFunciones.activarsub_moduloOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextAreapaqueteOpcion.setEnabled(this.opcionConstantesFunciones.activarpaqueteOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextAreapaquete_originalOpcion.setEnabled(this.opcionConstantesFunciones.activarpaquete_originalOpcion);
		this.jInternalFrameDetalleFormOpcion.jTextFieldpath_auxiliarOpcion.setEnabled(this.opcionConstantesFunciones.activarpath_auxiliarOpcion);
		this.jInternalFrameDetalleFormOpcion.jCheckBoxes_para_menuOpcion.setEnabled(this.opcionConstantesFunciones.activares_para_menuOpcion);
		this.jInternalFrameDetalleFormOpcion.jCheckBoxcon_mostrar_acciones_campoOpcion.setEnabled(this.opcionConstantesFunciones.activarcon_mostrar_acciones_campoOpcion);
		this.jInternalFrameDetalleFormOpcion.jCheckBoxes_guardar_relacionesOpcion.setEnabled(this.opcionConstantesFunciones.activares_guardar_relacionesOpcion);
		this.jInternalFrameDetalleFormOpcion.jCheckBoxestadoOpcion.setEnabled(this.opcionConstantesFunciones.activarestadoOpcion);
		}
	}
	
		
}