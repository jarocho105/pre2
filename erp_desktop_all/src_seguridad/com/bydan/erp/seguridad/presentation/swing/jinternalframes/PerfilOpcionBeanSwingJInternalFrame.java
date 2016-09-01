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

import com.bydan.erp.seguridad.util.PerfilOpcionConstantesFunciones;
import com.bydan.erp.seguridad.util.PerfilOpcionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PerfilOpcionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.PerfilOpcionBean;
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
public class PerfilOpcionBeanSwingJInternalFrame extends PerfilOpcionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PerfilOpcionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PerfilOpcion> perfilopcionValidator = new ClassValidator<PerfilOpcion>(PerfilOpcion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PerfilOpcion perfilopcion;	
	public PerfilOpcion perfilopcionAux;
	public PerfilOpcion perfilopcionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PerfilOpcion perfilopcionTotales;
	public Long idPerfilOpcionActual;
	public Long iIdNuevoPerfilOpcion=0L;
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
	
	public Boolean isPermisoTodoPerfilOpcion;
	public Boolean isPermisoNuevoPerfilOpcion;
	public Boolean isPermisoActualizarPerfilOpcion;
	public Boolean isPermisoActualizarOriginalPerfilOpcion;
	public Boolean isPermisoEliminarPerfilOpcion;
	public Boolean isPermisoGuardarCambiosPerfilOpcion;
	public Boolean isPermisoConsultaPerfilOpcion;
	public Boolean isPermisoBusquedaPerfilOpcion;
	public Boolean isPermisoReportePerfilOpcion;
	public Boolean isPermisoPaginacionMedioPerfilOpcion;
	public Boolean isPermisoPaginacionAltoPerfilOpcion;
	public Boolean isPermisoPaginacionTodoPerfilOpcion;
	public Boolean isPermisoCopiarPerfilOpcion;
	public Boolean isPermisoVerFormPerfilOpcion;
	public Boolean isPermisoDuplicarPerfilOpcion;
	public Boolean isPermisoOrdenPerfilOpcion;
	
	
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
	
	public PerfilOpcionParameterReturnGeneral perfilopcionReturnGeneral;
	public PerfilOpcionParameterReturnGeneral perfilopcionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPerfilOpcion=false;
	public Boolean esParaAccionDesdeFormularioPerfilOpcion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PerfilOpcionSessionBeanAdditional perfilopcionSessionBeanAdditional=null;
	
	public PerfilOpcionSessionBeanAdditional getPerfilOpcionSessionBeanAdditional() {
		return this.perfilopcionSessionBeanAdditional;
	}
	
	public void setPerfilOpcionSessionBeanAdditional(PerfilOpcionSessionBeanAdditional perfilopcionSessionBeanAdditional) {
		try {
			this.perfilopcionSessionBeanAdditional=perfilopcionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PerfilOpcionBeanSwingJInternalFrameAdditional perfilopcionBeanSwingJInternalFrameAdditional=null;
	//public class PerfilOpcionBeanSwingJInternalFrame
	
	public PerfilOpcionBeanSwingJInternalFrameAdditional getPerfilOpcionBeanSwingJInternalFrameAdditional() {
		return this.perfilopcionBeanSwingJInternalFrameAdditional;
	}
	
	public void setPerfilOpcionBeanSwingJInternalFrameAdditional(PerfilOpcionBeanSwingJInternalFrameAdditional perfilopcionBeanSwingJInternalFrameAdditional) {
		try {
			this.perfilopcionBeanSwingJInternalFrameAdditional=perfilopcionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PerfilOpcionLogic perfilopcionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PerfilOpcion perfilopcionBean;
	public PerfilOpcionConstantesFunciones perfilopcionConstantesFunciones;
	//public PerfilOpcionParameterReturnGeneral perfilopcionReturnGeneral;
	
	//FK
	
	public SistemaLogic sistemaLogic;
	public ModuloLogic moduloLogic;
	public GrupoOpcionLogic grupoopcionLogic;
	public PerfilLogic perfilLogic;
	public OpcionLogic opcionLogic;
	
	//PARAMETROS
	
	
	//public List<PerfilOpcion> perfilopcions;	
	//public List<PerfilOpcion> perfilopcionsEliminados;
	//public List<PerfilOpcion> perfilopcionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPerfilOpcion=false;
	public Boolean isVisibilidadCeldaDuplicarPerfilOpcion=true;
	public Boolean isVisibilidadCeldaCopiarPerfilOpcion=true;
	public Boolean isVisibilidadCeldaVerFormPerfilOpcion=true;
	public Boolean isVisibilidadCeldaOrdenPerfilOpcion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
	public Boolean isVisibilidadCeldaModificarPerfilOpcion=false;
	public Boolean isVisibilidadCeldaActualizarPerfilOpcion=false;
	public Boolean isVisibilidadCeldaEliminarPerfilOpcion=false;
	public Boolean isVisibilidadCeldaCancelarPerfilOpcion=false;
	public Boolean isVisibilidadCeldaGuardarPerfilOpcion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPerfilOpcion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdPerfilPorIdOpcion=false;
	public Boolean isVisibilidadBusquedaPorIdSisPorIdModPorIdPer=false;
	public Boolean isVisibilidadFK_IdGrupoOpcion=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdOpcion=false;
	public Boolean isVisibilidadFK_IdPerfil=false;
	public Boolean isVisibilidadFK_IdSistema=false;
	
	public Long getiIdNuevoPerfilOpcion() {
		return this.iIdNuevoPerfilOpcion;
	}

	public void setiIdNuevoPerfilOpcion(Long iIdNuevoPerfilOpcion) {
		this.iIdNuevoPerfilOpcion = iIdNuevoPerfilOpcion;
	}
	
	public Long getidPerfilOpcionActual() {
		return this.idPerfilOpcionActual;
	}

	public void setidPerfilOpcionActual(Long idPerfilOpcionActual) {
		this.idPerfilOpcionActual = idPerfilOpcionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PerfilOpcion getperfilopcion() {
		return this.perfilopcion;
	}

	public void setperfilopcion(PerfilOpcion perfilopcion) {
		this.perfilopcion = perfilopcion;
	}
	
	public PerfilOpcion getperfilopcionAux() {
		return this.perfilopcionAux;
	}

	public void setperfilopcionAux(PerfilOpcion perfilopcionAux) {
		this.perfilopcionAux = perfilopcionAux;
	}				
	
	public PerfilOpcion getperfilopcionAnterior() {
		return this.perfilopcionAnterior;
	}

	public void setperfilopcionAnterior(PerfilOpcion perfilopcionAnterior) {
		this.perfilopcionAnterior = perfilopcionAnterior;
	}	
	
	public PerfilOpcion getperfilopcionTotales() {
		return this.perfilopcionTotales;
	}

	public void setperfilopcionTotales(PerfilOpcion perfilopcionTotales) {
		this.perfilopcionTotales = perfilopcionTotales;
	}	
	
	public PerfilOpcion getperfilopcionBean() {
		return this.perfilopcionBean;
	}

	public void setperfilopcionBean(PerfilOpcion perfilopcionBean) {
		this.perfilopcionBean = perfilopcionBean;
	}	
	
	public PerfilOpcionParameterReturnGeneral getperfilopcionReturnGeneral() {
		return this.perfilopcionReturnGeneral;
	}

	public void setperfilopcionReturnGeneral(PerfilOpcionParameterReturnGeneral perfilopcionReturnGeneral) {
		this.perfilopcionReturnGeneral = perfilopcionReturnGeneral;
	}	
	
	
	public Long id_sistemaBusquedaPorIdPerfilPorIdOpcion=-1L;

	public Long getid_sistemaBusquedaPorIdPerfilPorIdOpcion() {
		return this.id_sistemaBusquedaPorIdPerfilPorIdOpcion;
	}

	public void setid_sistemaBusquedaPorIdPerfilPorIdOpcion(Long id_sistemaBusquedaPorIdPerfilPorIdOpcion) {
		this.id_sistemaBusquedaPorIdPerfilPorIdOpcion = id_sistemaBusquedaPorIdPerfilPorIdOpcion;
	}

;
	public Long id_moduloBusquedaPorIdPerfilPorIdOpcion=-1L;

	public Long getid_moduloBusquedaPorIdPerfilPorIdOpcion() {
		return this.id_moduloBusquedaPorIdPerfilPorIdOpcion;
	}

	public void setid_moduloBusquedaPorIdPerfilPorIdOpcion(Long id_moduloBusquedaPorIdPerfilPorIdOpcion) {
		this.id_moduloBusquedaPorIdPerfilPorIdOpcion = id_moduloBusquedaPorIdPerfilPorIdOpcion;
	}

;
	public Long id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion=null;

	public Long getid_grupo_opcionBusquedaPorIdPerfilPorIdOpcion() {
		return this.id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion;
	}

	public void setid_grupo_opcionBusquedaPorIdPerfilPorIdOpcion(Long id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion) {
		this.id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion = id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion;
	}

;
	public Long id_perfilBusquedaPorIdPerfilPorIdOpcion=-1L;

	public Long getid_perfilBusquedaPorIdPerfilPorIdOpcion() {
		return this.id_perfilBusquedaPorIdPerfilPorIdOpcion;
	}

	public void setid_perfilBusquedaPorIdPerfilPorIdOpcion(Long id_perfilBusquedaPorIdPerfilPorIdOpcion) {
		this.id_perfilBusquedaPorIdPerfilPorIdOpcion = id_perfilBusquedaPorIdPerfilPorIdOpcion;
	}

;
	public Long id_opcionBusquedaPorIdPerfilPorIdOpcion=-1L;

	public Long getid_opcionBusquedaPorIdPerfilPorIdOpcion() {
		return this.id_opcionBusquedaPorIdPerfilPorIdOpcion;
	}

	public void setid_opcionBusquedaPorIdPerfilPorIdOpcion(Long id_opcionBusquedaPorIdPerfilPorIdOpcion) {
		this.id_opcionBusquedaPorIdPerfilPorIdOpcion = id_opcionBusquedaPorIdPerfilPorIdOpcion;
	}

	public Long id_sistemaBusquedaPorIdSisPorIdModPorIdPer=-1L;

	public Long getid_sistemaBusquedaPorIdSisPorIdModPorIdPer() {
		return this.id_sistemaBusquedaPorIdSisPorIdModPorIdPer;
	}

	public void setid_sistemaBusquedaPorIdSisPorIdModPorIdPer(Long id_sistemaBusquedaPorIdSisPorIdModPorIdPer) {
		this.id_sistemaBusquedaPorIdSisPorIdModPorIdPer = id_sistemaBusquedaPorIdSisPorIdModPorIdPer;
	}

;
	public Long id_moduloBusquedaPorIdSisPorIdModPorIdPer=-1L;

	public Long getid_moduloBusquedaPorIdSisPorIdModPorIdPer() {
		return this.id_moduloBusquedaPorIdSisPorIdModPorIdPer;
	}

	public void setid_moduloBusquedaPorIdSisPorIdModPorIdPer(Long id_moduloBusquedaPorIdSisPorIdModPorIdPer) {
		this.id_moduloBusquedaPorIdSisPorIdModPorIdPer = id_moduloBusquedaPorIdSisPorIdModPorIdPer;
	}

;
	public Long id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer=null;

	public Long getid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer() {
		return this.id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer;
	}

	public void setid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer(Long id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer) {
		this.id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer = id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer;
	}

;
	public Long id_perfilBusquedaPorIdSisPorIdModPorIdPer=-1L;

	public Long getid_perfilBusquedaPorIdSisPorIdModPorIdPer() {
		return this.id_perfilBusquedaPorIdSisPorIdModPorIdPer;
	}

	public void setid_perfilBusquedaPorIdSisPorIdModPorIdPer(Long id_perfilBusquedaPorIdSisPorIdModPorIdPer) {
		this.id_perfilBusquedaPorIdSisPorIdModPorIdPer = id_perfilBusquedaPorIdSisPorIdModPorIdPer;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PerfilOpcionLogic getPerfilOpcionLogic()	{		
		return perfilopcionLogic;
	}

	public void setPerfilOpcionLogic(PerfilOpcionLogic perfilopcionLogic) {
		this.perfilopcionLogic = perfilopcionLogic;
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
	
	public Boolean getIsEsNuevoPerfilOpcion() {
		return isEsNuevoPerfilOpcion;
	}

	public void setIsEsNuevoPerfilOpcion(Boolean isEsNuevoPerfilOpcion) {
		this.isEsNuevoPerfilOpcion = isEsNuevoPerfilOpcion;
	}

	public Boolean getEsParaAccionDesdeFormularioPerfilOpcion() {
		return esParaAccionDesdeFormularioPerfilOpcion;
	}
	
	public void setEsParaAccionDesdeFormularioPerfilOpcion(Boolean esParaAccionDesdeFormularioPerfilOpcion) {
		this.esParaAccionDesdeFormularioPerfilOpcion = esParaAccionDesdeFormularioPerfilOpcion;
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

			if(this.perfilopcionSessionBean==null) {
				this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
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
					sistemaLogic.getEntityWithConnection(perfilopcionSessionBean.getlidSistemaActual());
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

			if(this.perfilopcionSessionBean==null) {
				this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(perfilopcionSessionBean.getlidModuloActual());
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

			if(this.perfilopcionSessionBean==null) {
				this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {
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
					grupoopcionLogic.getEntityWithConnection(perfilopcionSessionBean.getlidGrupoOpcionActual());
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

			if(this.perfilopcionSessionBean==null) {
				this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
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
					perfilLogic.getEntityWithConnection(perfilopcionSessionBean.getlidPerfilActual());
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

			if(this.perfilopcionSessionBean==null) {
				this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
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
					opcionLogic.getEntityWithConnection(perfilopcionSessionBean.getlidOpcionActual());
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

					if(this.perfilopcion!=null) {
						this.perfilopcion.setSistema(sistemaTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setSelectedItem(sistemaTemp);
					}
				} else {
					//jComboBoxid_sistemaPerfilOpcion.setSelectedItem(sistemaTemp);
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
						jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
							//jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getItemCount()>0) {
								jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer") || sFormularioTipoBusqueda.equals("Todos")){
					if(sistemaTemp!=null && jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
						jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(sistemaTemp);
					} else {
						if(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
							//jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(sistemaTemp);
							if(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getItemCount()>0) {
								jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedIndex(0);
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
	public void setActualSistemaForeignKeyGenerico(Long idSistemaSeleccionado,JComboBox jComboBoxid_sistemaPerfilOpcionGenerico)throws Exception
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
				jComboBoxid_sistemaPerfilOpcionGenerico.setSelectedItem(sistemaTemp);
			} else {
				if(jComboBoxid_sistemaPerfilOpcionGenerico!=null && jComboBoxid_sistemaPerfilOpcionGenerico.getItemCount()>0) {
					jComboBoxid_sistemaPerfilOpcionGenerico.setSelectedIndex(0);
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

					if(this.perfilopcion!=null) {
						this.perfilopcion.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloPerfilOpcion.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
						jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
							//jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
						jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
							//jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloPerfilOpcionGenerico)throws Exception
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
				jComboBoxid_moduloPerfilOpcionGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloPerfilOpcionGenerico!=null && jComboBoxid_moduloPerfilOpcionGenerico.getItemCount()>0) {
					jComboBoxid_moduloPerfilOpcionGenerico.setSelectedIndex(0);
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

					if(this.perfilopcion!=null) {
						this.perfilopcion.setGrupoOpcion(grupoopcionTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setSelectedItem(grupoopcionTemp);
					}
				} else {
					//jComboBoxid_grupo_opcionPerfilOpcion.setSelectedItem(grupoopcionTemp);
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoopcionTemp!=null && jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
						jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(grupoopcionTemp);
					} else {
						if(jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
							//jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(grupoopcionTemp);
							if(jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getItemCount()>0) {
								jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoopcionTemp!=null && jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
						jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(grupoopcionTemp);
					} else {
						if(jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
							//jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(grupoopcionTemp);
							if(jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getItemCount()>0) {
								jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdGrupoOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoopcionTemp!=null && jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion!=null) {
						jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setSelectedItem(grupoopcionTemp);
					} else {
						if(jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion!=null) {
							//jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setSelectedItem(grupoopcionTemp);
							if(jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.getItemCount()>0) {
								jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setSelectedIndex(0);
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
	public void setActualGrupoOpcionForeignKeyGenerico(Long idGrupoOpcionSeleccionado,JComboBox jComboBoxid_grupo_opcionPerfilOpcionGenerico)throws Exception
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
				jComboBoxid_grupo_opcionPerfilOpcionGenerico.setSelectedItem(grupoopcionTemp);
			} else {
				if(jComboBoxid_grupo_opcionPerfilOpcionGenerico!=null && jComboBoxid_grupo_opcionPerfilOpcionGenerico.getItemCount()>0) {
					jComboBoxid_grupo_opcionPerfilOpcionGenerico.setSelectedIndex(0);
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

					if(this.perfilopcion!=null) {
						this.perfilopcion.setPerfil(perfilTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setSelectedItem(perfilTemp);
					}
				} else {
					//jComboBoxid_perfilPerfilOpcion.setSelectedItem(perfilTemp);
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(perfilTemp!=null && jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
						jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(perfilTemp);
					} else {
						if(jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
							//jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(perfilTemp);
							if(jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getItemCount()>0) {
								jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer") || sFormularioTipoBusqueda.equals("Todos")){
					if(perfilTemp!=null && jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
						jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(perfilTemp);
					} else {
						if(jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
							//jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(perfilTemp);
							if(jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getItemCount()>0) {
								jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedIndex(0);
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
	public void setActualPerfilForeignKeyGenerico(Long idPerfilSeleccionado,JComboBox jComboBoxid_perfilPerfilOpcionGenerico)throws Exception
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
				jComboBoxid_perfilPerfilOpcionGenerico.setSelectedItem(perfilTemp);
			} else {
				if(jComboBoxid_perfilPerfilOpcionGenerico!=null && jComboBoxid_perfilPerfilOpcionGenerico.getItemCount()>0) {
					jComboBoxid_perfilPerfilOpcionGenerico.setSelectedIndex(0);
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

					if(this.perfilopcion!=null) {
						this.perfilopcion.setOpcion(opcionTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setSelectedItem(opcionTemp);
					}
				} else {
					//jComboBoxid_opcionPerfilOpcion.setSelectedItem(opcionTemp);
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){
					if(opcionTemp!=null && jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
						jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(opcionTemp);
					} else {
						if(jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
							//jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(opcionTemp);
							if(jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getItemCount()>0) {
								jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(0);
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
	public void setActualOpcionForeignKeyGenerico(Long idOpcionSeleccionado,JComboBox jComboBoxid_opcionPerfilOpcionGenerico)throws Exception
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
				jComboBoxid_opcionPerfilOpcionGenerico.setSelectedItem(opcionTemp);
			} else {
				if(jComboBoxid_opcionPerfilOpcionGenerico!=null && jComboBoxid_opcionPerfilOpcionGenerico.getItemCount()>0) {
					jComboBoxid_opcionPerfilOpcionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSistemaForeignKey(PerfilOpcion perfilopcion,JComboBox jComboBoxid_sistemaPerfilOpcionGenerico)throws Exception
	{
		try
		{
			Sistema  sistemaAux=new Sistema();

			if(jComboBoxid_sistemaPerfilOpcionGenerico==null) {
				sistemaAux=(Sistema)this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.getSelectedItem();
			} else {
				sistemaAux=(Sistema)jComboBoxid_sistemaPerfilOpcionGenerico.getSelectedItem();
			}

			if(sistemaAux!=null && sistemaAux.getId()!=null) {
				perfilopcion.setid_sistema(sistemaAux.getId());
				perfilopcion.setsistema_descripcion(PerfilOpcionConstantesFunciones.getSistemaDescripcion(sistemaAux));
				perfilopcion.setSistema(sistemaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(PerfilOpcion perfilopcion,JComboBox jComboBoxid_moduloPerfilOpcionGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloPerfilOpcionGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloPerfilOpcionGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				perfilopcion.setid_modulo(moduloAux.getId());
				perfilopcion.setmodulo_descripcion(PerfilOpcionConstantesFunciones.getModuloDescripcion(moduloAux));
				perfilopcion.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoOpcionForeignKey(PerfilOpcion perfilopcion,JComboBox jComboBoxid_grupo_opcionPerfilOpcionGenerico)throws Exception
	{
		try
		{
			GrupoOpcion  grupoopcionAux=new GrupoOpcion();

			if(jComboBoxid_grupo_opcionPerfilOpcionGenerico==null) {
				grupoopcionAux=(GrupoOpcion)this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.getSelectedItem();
			} else {
				grupoopcionAux=(GrupoOpcion)jComboBoxid_grupo_opcionPerfilOpcionGenerico.getSelectedItem();
			}

			if(grupoopcionAux!=null) {
				perfilopcion.setid_grupo_opcion(grupoopcionAux.getId());
				perfilopcion.setgrupoopcion_descripcion(PerfilOpcionConstantesFunciones.getGrupoOpcionDescripcion(grupoopcionAux));
				perfilopcion.setGrupoOpcion(grupoopcionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPerfilForeignKey(PerfilOpcion perfilopcion,JComboBox jComboBoxid_perfilPerfilOpcionGenerico)throws Exception
	{
		try
		{
			Perfil  perfilAux=new Perfil();

			if(jComboBoxid_perfilPerfilOpcionGenerico==null) {
				perfilAux=(Perfil)this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.getSelectedItem();
			} else {
				perfilAux=(Perfil)jComboBoxid_perfilPerfilOpcionGenerico.getSelectedItem();
			}

			if(perfilAux!=null && perfilAux.getId()!=null) {
				perfilopcion.setid_perfil(perfilAux.getId());
				perfilopcion.setperfil_descripcion(PerfilOpcionConstantesFunciones.getPerfilDescripcion(perfilAux));
				perfilopcion.setPerfil(perfilAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOpcionForeignKey(PerfilOpcion perfilopcion,JComboBox jComboBoxid_opcionPerfilOpcionGenerico)throws Exception
	{
		try
		{
			Opcion  opcionAux=new Opcion();

			if(jComboBoxid_opcionPerfilOpcionGenerico==null) {
				opcionAux=(Opcion)this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.getSelectedItem();
			} else {
				opcionAux=(Opcion)jComboBoxid_opcionPerfilOpcionGenerico.getSelectedItem();
			}

			if(opcionAux!=null && opcionAux.getId()!=null) {
				perfilopcion.setid_opcion(opcionAux.getId());
				perfilopcion.setopcion_descripcion(PerfilOpcionConstantesFunciones.getOpcionDescripcion(opcionAux));
				perfilopcion.setOpcion(opcionAux);			}
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

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.addItem(sistema);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
					}

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addItem(sistema);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.removeAllItems();

							for(Sistema sistema:this.sistemasForeignKey) {
								this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addItem(sistema);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
					}

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addItem(modulo);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addItem(modulo);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.removeAllItems();

							for(GrupoOpcion grupoopcion:this.grupoopcionsForeignKey) {
								this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.addItem(grupoopcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
					}

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.removeAllItems();

							for(GrupoOpcion grupoopcion:this.grupoopcionsForeignKey) {
								this.jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addItem(grupoopcion);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.removeAllItems();

							for(GrupoOpcion grupoopcion:this.grupoopcionsForeignKey) {
								this.jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addItem(grupoopcion);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdGrupoOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.removeAllItems();

							for(GrupoOpcion grupoopcion:this.grupoopcionsForeignKey) {
								this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.addItem(grupoopcion);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.addItem(perfil);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
					}

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addItem(perfil);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addItem(perfil);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.addItem(opcion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { 
					}

					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.removeAllItems();

							for(Opcion opcion:this.opcionsForeignKey) {
								this.jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addItem(opcion);
							}
						}

						if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setSelectedItem(sistema);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(sistema);
						} else {
							this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setSelectedItem(grupoopcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(grupoopcion);
						} else {
							this.jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(grupoopcion);
						} else {
							this.jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setSelectedItem(grupoopcion);
						} else {
							this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setSelectedItem(perfil);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(perfil);
						} else {
							this.jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedItem(perfil);
						} else {
							this.jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setSelectedItem(opcion);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedItem(opcion);
						} else {
							this.jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPerfilOpcion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PerfilOpcionConstantesFunciones.refrescarForeignKeysDescripcionesPerfilOpcion(this.perfilopcionLogic.getPerfilOpcions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PerfilOpcionConstantesFunciones.refrescarForeignKeysDescripcionesPerfilOpcion(this.perfilopcions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Sistema.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(GrupoOpcion.class));
		classes.add(new Classe(Perfil.class));
		classes.add(new Classe(Opcion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//perfilopcionLogic.setPerfilOpcions(this.perfilopcions);
			perfilopcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PerfilOpcionParameterReturnGeneral getPerfilOpcionParameterGeneral() {
		return this.perfilopcionParameterGeneral;
	}
	
	public void setPerfilOpcionParameterGeneral(PerfilOpcionParameterReturnGeneral perfilopcionParameterGeneral) {
		this.perfilopcionParameterGeneral = perfilopcionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPerfilOpcion() {
		return isPermisoTodoPerfilOpcion;
	}

	public void setIsPermisoTodoPerfilOpcion(Boolean isPermisoTodoPerfilOpcion) {
		this.isPermisoTodoPerfilOpcion = isPermisoTodoPerfilOpcion;
	}

	public Boolean getIsPermisoNuevoPerfilOpcion() {
		return isPermisoNuevoPerfilOpcion;
	}

	public void setIsPermisoNuevoPerfilOpcion(Boolean isPermisoNuevoPerfilOpcion) {
		this.isPermisoNuevoPerfilOpcion = isPermisoNuevoPerfilOpcion;
	}

	public Boolean getIsPermisoActualizarPerfilOpcion() {
		return isPermisoActualizarPerfilOpcion;
	}

	public void setIsPermisoActualizarPerfilOpcion(Boolean isPermisoActualizarPerfilOpcion) {
		this.isPermisoActualizarPerfilOpcion = isPermisoActualizarPerfilOpcion;
	}

	public Boolean getIsPermisoEliminarPerfilOpcion() {
		return isPermisoEliminarPerfilOpcion;
	}

	public void setIsPermisoEliminarPerfilOpcion(Boolean isPermisoEliminarPerfilOpcion) {
		this.isPermisoEliminarPerfilOpcion = isPermisoEliminarPerfilOpcion;
	}

	public Boolean getIsPermisoGuardarCambiosPerfilOpcion() {
		return isPermisoGuardarCambiosPerfilOpcion;
	}

	public void setIsPermisoGuardarCambiosPerfilOpcion(Boolean isPermisoGuardarCambiosPerfilOpcion) {
		this.isPermisoGuardarCambiosPerfilOpcion = isPermisoGuardarCambiosPerfilOpcion;
	}
	
	public Boolean getIsPermisoConsultaPerfilOpcion() {
		return isPermisoConsultaPerfilOpcion;
	}

	public void setIsPermisoConsultaPerfilOpcion(Boolean isPermisoConsultaPerfilOpcion) {
		this.isPermisoConsultaPerfilOpcion = isPermisoConsultaPerfilOpcion;
	}

	public Boolean getIsPermisoBusquedaPerfilOpcion() {
		return isPermisoBusquedaPerfilOpcion;
	}

	public void setIsPermisoBusquedaPerfilOpcion(Boolean isPermisoBusquedaPerfilOpcion) {
		this.isPermisoBusquedaPerfilOpcion = isPermisoBusquedaPerfilOpcion;
	}

	public Boolean getIsPermisoReportePerfilOpcion() {
		return isPermisoReportePerfilOpcion;
	}

	public void setIsPermisoReportePerfilOpcion(Boolean isPermisoReportePerfilOpcion) {
		this.isPermisoReportePerfilOpcion = isPermisoReportePerfilOpcion;
	}
	
	public Boolean getIsPermisoPaginacionMedioPerfilOpcion() {
		return isPermisoPaginacionMedioPerfilOpcion;
	}

	public void setIsPermisoPaginacionMedioPerfilOpcion(Boolean isPermisoPaginacionMedioPerfilOpcion) {
		this.isPermisoPaginacionMedioPerfilOpcion = isPermisoPaginacionMedioPerfilOpcion;
	}
	
	public Boolean getIsPermisoPaginacionTodoPerfilOpcion() {
		return isPermisoPaginacionTodoPerfilOpcion;
	}

	public void setIsPermisoPaginacionTodoPerfilOpcion(Boolean isPermisoPaginacionTodoPerfilOpcion) {
		this.isPermisoPaginacionTodoPerfilOpcion = isPermisoPaginacionTodoPerfilOpcion;
	}
	
	public Boolean getIsPermisoPaginacionAltoPerfilOpcion() {
		return isPermisoPaginacionAltoPerfilOpcion;
	}

	public void setIsPermisoPaginacionAltoPerfilOpcion(Boolean isPermisoPaginacionAltoPerfilOpcion) {
		this.isPermisoPaginacionAltoPerfilOpcion = isPermisoPaginacionAltoPerfilOpcion;
	}
	
	public Boolean getIsPermisoCopiarPerfilOpcion() {
		return isPermisoCopiarPerfilOpcion;
	}

	public void setIsPermisoCopiarPerfilOpcion(Boolean isPermisoCopiarPerfilOpcion) {
		this.isPermisoCopiarPerfilOpcion = isPermisoCopiarPerfilOpcion;
	}
	
	public Boolean getIsPermisoVerFormPerfilOpcion() {
		return isPermisoVerFormPerfilOpcion;
	}

	public void setIsPermisoVerFormPerfilOpcion(Boolean isPermisoVerFormPerfilOpcion) {
		this.isPermisoVerFormPerfilOpcion = isPermisoVerFormPerfilOpcion;
	}
	
	public Boolean getIsPermisoDuplicarPerfilOpcion() {
		return isPermisoDuplicarPerfilOpcion;
	}

	public void setIsPermisoDuplicarPerfilOpcion(Boolean isPermisoDuplicarPerfilOpcion) {
		this.isPermisoDuplicarPerfilOpcion = isPermisoDuplicarPerfilOpcion;
	}
	
	public Boolean getIsPermisoOrdenPerfilOpcion() {
		return isPermisoOrdenPerfilOpcion;
	}

	public void setIsPermisoOrdenPerfilOpcion(Boolean isPermisoOrdenPerfilOpcion) {
		this.isPermisoOrdenPerfilOpcion = isPermisoOrdenPerfilOpcion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPerfilOpcion() {
		return isVisibilidadCeldaNuevoPerfilOpcion;
	}

	public void setIsVisibilidadCeldaNuevoPerfilOpcion(Boolean isVisibilidadCeldaNuevoPerfilOpcion) {
		this.isVisibilidadCeldaNuevoPerfilOpcion = isVisibilidadCeldaNuevoPerfilOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPerfilOpcion() {
		return isVisibilidadCeldaDuplicarPerfilOpcion;
	}

	public void setIsVisibilidadCeldaDuplicarPerfilOpcion(Boolean isVisibilidadCeldaDuplicarPerfilOpcion) {
		this.isVisibilidadCeldaDuplicarPerfilOpcion = isVisibilidadCeldaDuplicarPerfilOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPerfilOpcion() {
		return isVisibilidadCeldaCopiarPerfilOpcion;
	}

	public void setIsVisibilidadCeldaCopiarPerfilOpcion(Boolean isVisibilidadCeldaCopiarPerfilOpcion) {
		this.isVisibilidadCeldaCopiarPerfilOpcion = isVisibilidadCeldaCopiarPerfilOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPerfilOpcion() {
		return isVisibilidadCeldaVerFormPerfilOpcion;
	}

	public void setIsVisibilidadCeldaVerFormPerfilOpcion(Boolean isVisibilidadCeldaVerFormPerfilOpcion) {
		this.isVisibilidadCeldaVerFormPerfilOpcion = isVisibilidadCeldaVerFormPerfilOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPerfilOpcion() {
		return isVisibilidadCeldaOrdenPerfilOpcion;
	}

	public void setIsVisibilidadCeldaOrdenPerfilOpcion(Boolean isVisibilidadCeldaOrdenPerfilOpcion) {
		this.isVisibilidadCeldaOrdenPerfilOpcion = isVisibilidadCeldaOrdenPerfilOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPerfilOpcion() {
		return isVisibilidadCeldaNuevoRelacionesPerfilOpcion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPerfilOpcion(Boolean isVisibilidadCeldaNuevoRelacionesPerfilOpcion) {
		this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion = isVisibilidadCeldaNuevoRelacionesPerfilOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPerfilOpcion() {
		return isVisibilidadCeldaModificarPerfilOpcion;
	}

	public void setIsVisibilidadCeldaModificarPerfilOpcion(Boolean isVisibilidadCeldaModificarPerfilOpcion) {
		this.isVisibilidadCeldaModificarPerfilOpcion = isVisibilidadCeldaModificarPerfilOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPerfilOpcion() {
		return isVisibilidadCeldaActualizarPerfilOpcion;
	}

	public void setIsVisibilidadCeldaActualizarPerfilOpcion(Boolean isVisibilidadCeldaActualizarPerfilOpcion) {
		this.isVisibilidadCeldaActualizarPerfilOpcion = isVisibilidadCeldaActualizarPerfilOpcion;
	}

	public Boolean getIsVisibilidadCeldaEliminarPerfilOpcion() {
		return isVisibilidadCeldaEliminarPerfilOpcion;
	}

	public void setIsVisibilidadCeldaEliminarPerfilOpcion(Boolean isVisibilidadCeldaEliminarPerfilOpcion) {
		this.isVisibilidadCeldaEliminarPerfilOpcion = isVisibilidadCeldaEliminarPerfilOpcion;
	}

	public Boolean getIsVisibilidadCeldaCancelarPerfilOpcion() {
		return isVisibilidadCeldaCancelarPerfilOpcion;
	}

	public void setIsVisibilidadCeldaCancelarPerfilOpcion(Boolean isVisibilidadCeldaCancelarPerfilOpcion) {
		this.isVisibilidadCeldaCancelarPerfilOpcion = isVisibilidadCeldaCancelarPerfilOpcion;
	}

	public Boolean getIsVisibilidadCeldaGuardarPerfilOpcion() {
		return isVisibilidadCeldaGuardarPerfilOpcion;
	}

	public void setIsVisibilidadCeldaGuardarPerfilOpcion(Boolean isVisibilidadCeldaGuardarPerfilOpcion) {
		this.isVisibilidadCeldaGuardarPerfilOpcion = isVisibilidadCeldaGuardarPerfilOpcion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPerfilOpcion() {
		return isVisibilidadCeldaGuardarCambiosPerfilOpcion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPerfilOpcion(Boolean isVisibilidadCeldaGuardarCambiosPerfilOpcion) {
		this.isVisibilidadCeldaGuardarCambiosPerfilOpcion = isVisibilidadCeldaGuardarCambiosPerfilOpcion;
	}
		
	public PerfilOpcionSessionBean getperfilopcionSessionBean() {
		return this.perfilopcionSessionBean;
	}
	
	public void setperfilopcionSessionBean(PerfilOpcionSessionBean perfilopcionSessionBean) {
		this.perfilopcionSessionBean=perfilopcionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdPerfilPorIdOpcion() {
		return this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion;
	}

	public void setisVisibilidadBusquedaPorIdPerfilPorIdOpcion(Boolean isVisibilidadBusquedaPorIdPerfilPorIdOpcion) {
		this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion=isVisibilidadBusquedaPorIdPerfilPorIdOpcion;
	}

	public Boolean getisVisibilidadBusquedaPorIdSisPorIdModPorIdPer() {
		return this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer;
	}

	public void setisVisibilidadBusquedaPorIdSisPorIdModPorIdPer(Boolean isVisibilidadBusquedaPorIdSisPorIdModPorIdPer) {
		this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer=isVisibilidadBusquedaPorIdSisPorIdModPorIdPer;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(PerfilOpcion perfilopcion)throws Exception {
		try {
			
				this.setActualParaGuardarSistemaForeignKey(perfilopcion,null);
				this.setActualParaGuardarModuloForeignKey(perfilopcion,null);
				this.setActualParaGuardarGrupoOpcionForeignKey(perfilopcion,null);
				this.setActualParaGuardarPerfilForeignKey(perfilopcion,null);
				this.setActualParaGuardarOpcionForeignKey(perfilopcion,null);
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
	
	public void bugActualizarReferenciaActual(PerfilOpcion perfilopcion,PerfilOpcion perfilopcionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPerfilOpcion(perfilopcion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		perfilopcionAux.setId(perfilopcion.getId());
		perfilopcionAux.setVersionRow(perfilopcion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPerfilOpcion();
		
			int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = perfilopcionValidator.getInvalidValues(this.perfilopcion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			perfilopcionLogic.setDatosCliente(datosCliente);
			perfilopcionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				perfilopcionAux=new  PerfilOpcion();
				
				perfilopcionAux.setIsNew(true);
				perfilopcionAux.setIsChanged(true);
				
				perfilopcionAux.setPerfilOpcionOriginal(this.perfilopcion);
				
				perfilopcionAux.setId(this.perfilopcion.getId());	
				perfilopcionAux.setVersionRow(this.perfilopcion.getVersionRow());	
				perfilopcionAux.setid_sistema(this.perfilopcion.getid_sistema());	
				perfilopcionAux.setid_modulo(this.perfilopcion.getid_modulo());	
				perfilopcionAux.setid_grupo_opcion(this.perfilopcion.getid_grupo_opcion());	
				perfilopcionAux.setid_perfil(this.perfilopcion.getid_perfil());	
				perfilopcionAux.setid_opcion(this.perfilopcion.getid_opcion());	
				perfilopcionAux.settodo(this.perfilopcion.gettodo());	
				perfilopcionAux.setingreso(this.perfilopcion.getingreso());	
				perfilopcionAux.setmodificacion(this.perfilopcion.getmodificacion());	
				perfilopcionAux.seteliminacion(this.perfilopcion.geteliminacion());	
				perfilopcionAux.setguardar_cambios(this.perfilopcion.getguardar_cambios());	
				perfilopcionAux.setconsulta(this.perfilopcion.getconsulta());	
				perfilopcionAux.setbusqueda(this.perfilopcion.getbusqueda());	
				perfilopcionAux.setreporte(this.perfilopcion.getreporte());	
				perfilopcionAux.setorden(this.perfilopcion.getorden());	
				perfilopcionAux.setpaginacion_medio(this.perfilopcion.getpaginacion_medio());	
				perfilopcionAux.setpaginacion_alto(this.perfilopcion.getpaginacion_alto());	
				perfilopcionAux.setpaginacion_todo(this.perfilopcion.getpaginacion_todo());	
				perfilopcionAux.setduplicar(this.perfilopcion.getduplicar());	
				perfilopcionAux.setcopiar(this.perfilopcion.getcopiar());	
				perfilopcionAux.setcon_precargar(this.perfilopcion.getcon_precargar());	
				perfilopcionAux.setestado(this.perfilopcion.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilopcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(perfilopcionAux,perfilopcionLogic.getPerfilOpcions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilopcionAux,perfilopcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.perfilopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionLogic.savePerfilOpcions();//WithConnection
						//perfilopcionLogic.getSetVersionRowPerfilOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfilopcion,perfilopcionAux);
					
					this.refrescarForeignKeysDescripcionesPerfilOpcion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilopcionLogic.savePerfilOpcionRelaciones(perfilopcionAux);//WithConnection
								//perfilopcionLogic.getSetVersionRowPerfilOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfilopcion,perfilopcionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilopcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilopcionAux,perfilopcionLogic.getPerfilOpcions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilopcionAux,perfilopcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfilopcion,perfilopcionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				perfilopcionAux=new  PerfilOpcion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.perfilopcionSessionBean.getEsGuardarRelacionado() 
					|| (this.perfilopcionSessionBean.getEsGuardarRelacionado() && this.perfilopcion.getId()>=0)) {
						
					perfilopcionAux.setIsNew(false);
				}
				
				perfilopcionAux.setIsDeleted(false);
			
				perfilopcionAux.setId(this.perfilopcion.getId());	
				perfilopcionAux.setVersionRow(this.perfilopcion.getVersionRow());	
				perfilopcionAux.setid_sistema(this.perfilopcion.getid_sistema());	
				perfilopcionAux.setid_modulo(this.perfilopcion.getid_modulo());	
				perfilopcionAux.setid_grupo_opcion(this.perfilopcion.getid_grupo_opcion());	
				perfilopcionAux.setid_perfil(this.perfilopcion.getid_perfil());	
				perfilopcionAux.setid_opcion(this.perfilopcion.getid_opcion());	
				perfilopcionAux.settodo(this.perfilopcion.gettodo());	
				perfilopcionAux.setingreso(this.perfilopcion.getingreso());	
				perfilopcionAux.setmodificacion(this.perfilopcion.getmodificacion());	
				perfilopcionAux.seteliminacion(this.perfilopcion.geteliminacion());	
				perfilopcionAux.setguardar_cambios(this.perfilopcion.getguardar_cambios());	
				perfilopcionAux.setconsulta(this.perfilopcion.getconsulta());	
				perfilopcionAux.setbusqueda(this.perfilopcion.getbusqueda());	
				perfilopcionAux.setreporte(this.perfilopcion.getreporte());	
				perfilopcionAux.setorden(this.perfilopcion.getorden());	
				perfilopcionAux.setpaginacion_medio(this.perfilopcion.getpaginacion_medio());	
				perfilopcionAux.setpaginacion_alto(this.perfilopcion.getpaginacion_alto());	
				perfilopcionAux.setpaginacion_todo(this.perfilopcion.getpaginacion_todo());	
				perfilopcionAux.setduplicar(this.perfilopcion.getduplicar());	
				perfilopcionAux.setcopiar(this.perfilopcion.getcopiar());	
				perfilopcionAux.setcon_precargar(this.perfilopcion.getcon_precargar());	
				perfilopcionAux.setestado(this.perfilopcion.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilopcionAux,perfilopcionLogic.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilopcionAux,perfilopcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.perfilopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionLogic.savePerfilOpcions();//WithConnection
						//perfilopcionLogic.getSetVersionRowPerfilOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfilopcion,perfilopcionAux);
					
					this.refrescarForeignKeysDescripcionesPerfilOpcion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilopcionLogic.savePerfilOpcionRelaciones(perfilopcionAux);//WithConnection
								//perfilopcionLogic.getSetVersionRowPerfilOpcions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfilopcion,perfilopcionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilopcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilopcionAux,perfilopcionLogic.getPerfilOpcions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilopcionAux,perfilopcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfilopcion,perfilopcionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				perfilopcionAux=new  PerfilOpcion();
				
				perfilopcionAux.setIsNew(false);
				perfilopcionAux.setIsChanged(false);
				
				perfilopcionAux.setIsDeleted(true);
				
				perfilopcionAux.setId(this.perfilopcion.getId());	
				perfilopcionAux.setVersionRow(this.perfilopcion.getVersionRow());	
				perfilopcionAux.setid_sistema(this.perfilopcion.getid_sistema());	
				perfilopcionAux.setid_modulo(this.perfilopcion.getid_modulo());	
				perfilopcionAux.setid_grupo_opcion(this.perfilopcion.getid_grupo_opcion());	
				perfilopcionAux.setid_perfil(this.perfilopcion.getid_perfil());	
				perfilopcionAux.setid_opcion(this.perfilopcion.getid_opcion());	
				perfilopcionAux.settodo(this.perfilopcion.gettodo());	
				perfilopcionAux.setingreso(this.perfilopcion.getingreso());	
				perfilopcionAux.setmodificacion(this.perfilopcion.getmodificacion());	
				perfilopcionAux.seteliminacion(this.perfilopcion.geteliminacion());	
				perfilopcionAux.setguardar_cambios(this.perfilopcion.getguardar_cambios());	
				perfilopcionAux.setconsulta(this.perfilopcion.getconsulta());	
				perfilopcionAux.setbusqueda(this.perfilopcion.getbusqueda());	
				perfilopcionAux.setreporte(this.perfilopcion.getreporte());	
				perfilopcionAux.setorden(this.perfilopcion.getorden());	
				perfilopcionAux.setpaginacion_medio(this.perfilopcion.getpaginacion_medio());	
				perfilopcionAux.setpaginacion_alto(this.perfilopcion.getpaginacion_alto());	
				perfilopcionAux.setpaginacion_todo(this.perfilopcion.getpaginacion_todo());	
				perfilopcionAux.setduplicar(this.perfilopcion.getduplicar());	
				perfilopcionAux.setcopiar(this.perfilopcion.getcopiar());	
				perfilopcionAux.setcon_precargar(this.perfilopcion.getcon_precargar());	
				perfilopcionAux.setestado(this.perfilopcion.getestado());	
				
				if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.perfilopcionAux.getId()>=0) {	
						this.perfilopcionsEliminados.add(perfilopcionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(perfilopcionAux,perfilopcionLogic.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilopcionAux,perfilopcions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.perfilopcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilopcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionLogic.savePerfilOpcions();//WithConnection
						//perfilopcionLogic.getSetVersionRowPerfilOpcions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilopcionLogic.savePerfilOpcionRelaciones(perfilopcionAux);//WithConnection
								//perfilopcionLogic.getSetVersionRowPerfilOpcions();//WithConnection
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
							if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.perfilopcionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(perfilopcionAux,perfilopcionLogic.getPerfilOpcions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(perfilopcionAux,perfilopcions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getPerfilOpcions().addAll(this.perfilopcionsEliminados);
					
					perfilopcionLogic.savePerfilOpcions();//WithConnection
					//perfilopcionLogic.getSetVersionRowPerfilOpcions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPerfilOpcion();
				
				this.perfilopcionsEliminados= new ArrayList<PerfilOpcion>();		
			}
			
			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Perfil Opcion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.perfilopcion=perfilopcionAux;
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
      		//this.finishProcessPerfilOpcion();
      	}
		
	}	
	
	public void actualizarRelaciones(PerfilOpcion perfilopcionLocal) throws Exception {
		
		if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PerfilOpcion perfilopcionLocal) throws Exception {	
		if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(SistemaDetalleFormJInternalFrame.class)) {
				SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrameLocal=(SistemaBeanSwingJInternalFrame) ((SistemaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sistemaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSistema(sistemaBeanSwingJInternalFrameLocal.getsistema(),true);
				sistemaBeanSwingJInternalFrameLocal.actualizarLista(sistemaBeanSwingJInternalFrameLocal.sistema,this.sistemasForeignKey);

				sistemaBeanSwingJInternalFrameLocal.actualizarRelaciones(sistemaBeanSwingJInternalFrameLocal.sistema);

				perfilopcionLocal.setSistema(sistemaBeanSwingJInternalFrameLocal.sistema);

				this.addItemDefectoCombosForeignKeySistema();
				this.cargarCombosFrameSistemasForeignKey("Formulario");
				this.setActualSistemaForeignKey(sistemaBeanSwingJInternalFrameLocal.sistema.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				perfilopcionLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoOpcionDetalleFormJInternalFrame.class)) {
				GrupoOpcionBeanSwingJInternalFrame grupoopcionBeanSwingJInternalFrameLocal=(GrupoOpcionBeanSwingJInternalFrame) ((GrupoOpcionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoopcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoOpcion(grupoopcionBeanSwingJInternalFrameLocal.getgrupoopcion(),true);
				grupoopcionBeanSwingJInternalFrameLocal.actualizarLista(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion,this.grupoopcionsForeignKey);

				grupoopcionBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion);

				perfilopcionLocal.setGrupoOpcion(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion);

				this.addItemDefectoCombosForeignKeyGrupoOpcion();
				this.cargarCombosFrameGrupoOpcionsForeignKey("Formulario");
				this.setActualGrupoOpcionForeignKey(grupoopcionBeanSwingJInternalFrameLocal.grupoopcion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PerfilDetalleFormJInternalFrame.class)) {
				PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrameLocal=(PerfilBeanSwingJInternalFrame) ((PerfilDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				perfilBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPerfil(perfilBeanSwingJInternalFrameLocal.getperfil(),true);
				perfilBeanSwingJInternalFrameLocal.actualizarLista(perfilBeanSwingJInternalFrameLocal.perfil,this.perfilsForeignKey);

				perfilBeanSwingJInternalFrameLocal.actualizarRelaciones(perfilBeanSwingJInternalFrameLocal.perfil);

				perfilopcionLocal.setPerfil(perfilBeanSwingJInternalFrameLocal.perfil);

				this.addItemDefectoCombosForeignKeyPerfil();
				this.cargarCombosFramePerfilsForeignKey("Formulario");
				this.setActualPerfilForeignKey(perfilBeanSwingJInternalFrameLocal.perfil.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(OpcionDetalleFormJInternalFrame.class)) {
				OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrameLocal=(OpcionBeanSwingJInternalFrame) ((OpcionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				opcionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOpcion(opcionBeanSwingJInternalFrameLocal.getopcion(),true);
				opcionBeanSwingJInternalFrameLocal.actualizarLista(opcionBeanSwingJInternalFrameLocal.opcion,this.opcionsForeignKey);

				opcionBeanSwingJInternalFrameLocal.actualizarRelaciones(opcionBeanSwingJInternalFrameLocal.opcion);

				perfilopcionLocal.setOpcion(opcionBeanSwingJInternalFrameLocal.opcion);

				this.addItemDefectoCombosForeignKeyOpcion();
				this.cargarCombosFrameOpcionsForeignKey("Formulario");
				this.setActualOpcionForeignKey(opcionBeanSwingJInternalFrameLocal.opcion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPerfilOpcionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = perfilopcionValidator.getInvalidValues(this.perfilopcion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions) throws Exception {
		try	{		
			PerfilOpcionConstantesFunciones.actualizarLista(perfilopcion,perfilopcions,this.perfilopcionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PerfilOpcion perfilopcion,List<PerfilOpcion> perfilopcions) throws Exception {
		try	{			
			PerfilOpcionConstantesFunciones.actualizarSelectedLista(perfilopcion,perfilopcions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PerfilOpcion> perfilopcionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				perfilopcionsLocal=this.perfilopcionLogic.getPerfilOpcions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				perfilopcionsLocal=this.perfilopcions;
			}
			//ARCHITECTURE
		
			for(PerfilOpcion perfilopcionLocal:perfilopcionsLocal) {
				if(this.permiteMantenimiento(perfilopcionLocal) && perfilopcionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PerfilOpcionConstantesFunciones.getPerfilOpcionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.IDSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_sistemaPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_moduloPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.IDGRUPOOPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_grupo_opcionPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.IDPERFIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_perfilPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.IDOPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_opcionPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.TODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabeltodoPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.INGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelingresoPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.MODIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelmodificacionPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.ELIMINACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabeleliminacionPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.GUARDARCAMBIOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelguardar_cambiosPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.CONSULTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelconsultaPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.BUSQUEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelbusquedaPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.REPORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelreportePerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelordenPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.PAGINACIONMEDIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_medioPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.PAGINACIONALTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_altoPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.PAGINACIONTODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_todoPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.DUPLICAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelduplicarPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.COPIAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelcopiarPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.CONPRECARGAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelcon_precargarPerfilOpcion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilOpcionConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelestadoPerfilOpcion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_sistemaPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_moduloPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_grupo_opcionPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_perfilPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelid_opcionPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabeltodoPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelingresoPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelmodificacionPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabeleliminacionPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelguardar_cambiosPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelconsultaPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelbusquedaPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelreportePerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelordenPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_medioPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_altoPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_todoPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelduplicarPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelcopiarPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelcon_precargarPerfilOpcion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilOpcion.jLabelestadoPerfilOpcion,"");
		
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
		this.iIdNuevoPerfilOpcion--;	
		
		
		this.perfilopcionAux=new PerfilOpcion();
		
		this.perfilopcionAux.setId(this.iIdNuevoPerfilOpcion);
		this.perfilopcionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilopcionLogic.getPerfilOpcions().add(this.perfilopcionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.perfilopcions.add(this.perfilopcionAux);
		}
		//ARCHITECTURE
		
		this.perfilopcion=this.perfilopcionAux;
		
		if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPerfilOpcion(this.perfilopcion);
			this.setVariablesObjetoActualToFormularioForeignKeyPerfilOpcion(this.perfilopcion);
		}
				
		//this.setDefaultControlesPerfilOpcion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPerfilOpcion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPerfilOpcion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilOpcion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfilOpcion(this.perfilopcionBean,this.perfilopcion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PerfilOpcionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
			classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.perfilopcionReturnGeneral=perfilopcionLogic.procesarEventosPerfilOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilopcionLogic.getPerfilOpcions(),this.perfilopcion,this.perfilopcionParameterGeneral,this.isEsNuevoPerfilOpcion,classes);//this.perfilopcionLogic.getPerfilOpcion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPerfilOpcion(this.perfilopcionReturnGeneral,this.perfilopcionBean,false);
		
		if(this.perfilopcionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPerfilOpcion(this.perfilopcionReturnGeneral.getPerfilOpcion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPerfilOpcion(this.perfilopcionReturnGeneral.getPerfilOpcion());
		}
		
		if(this.perfilopcionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPerfilOpcion(this.perfilopcionReturnGeneral.getPerfilOpcion(),classes);//this.perfilopcionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPerfilOpcion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPerfilOpcion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.RecargarFormPerfilOpcion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPerfilOpcion(false);
						
			if(perfilopcionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilOpcion();
			}
			
			this.actualizarVisualTableDatosPerfilOpcion();
			
			this.jTableDatosPerfilOpcion.setRowSelectionInterval(this.getIndiceNuevoPerfilOpcion(), this.getIndiceNuevoPerfilOpcion());
			
			this.seleccionarFilaTablaPerfilOpcionActual();
						
			this.actualizarEstadoCeldasBotonesPerfilOpcion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPerfilOpcion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activartodoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activaringresoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarmodificacionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activareliminacionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarguardar_cambiosPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarconsultaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarbusquedaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarreportePerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarordenPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarpaginacion_medioPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarpaginacion_altoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarpaginacion_todoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarduplicarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarcopiarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarcon_precargarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarestadoPerfilOpcion);	
		
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarid_sistemaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarid_moduloPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarid_grupo_opcionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarid_perfilPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setEnabled(isHabilitar && this.perfilopcionConstantesFunciones.activarid_opcionPerfilOpcion);
	};
	
	public void setDefaultControlesPerfilOpcion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPerfilOpcion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.perfilopcionSessionBean.setConGuardarRelaciones(true);			
			this.perfilopcionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.setVisible(true);
			
					
		} else {
			//this.perfilopcionSessionBean.setConGuardarRelaciones(false);			
			this.perfilopcionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPerfilOpcion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
				if(perfilopcionAux.getId().equals(this.iIdNuevoPerfilOpcion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilOpcion perfilopcionAux:this.perfilopcions) {
				if(perfilopcionAux.getId().equals(this.iIdNuevoPerfilOpcion)) {
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
	
	public int getIndiceActualPerfilOpcion(PerfilOpcion perfilopcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
				if(perfilopcionAux.getId().equals(perfilopcion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilOpcion perfilopcionAux:this.perfilopcions) {
				if(perfilopcionAux.getId().equals(perfilopcion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPerfilOpcion(PerfilOpcion perfilopcionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
				if(perfilopcionAux.getPerfilOpcionOriginal().getId().equals(perfilopcionOriginal.getId())) {
					existe=true;
					perfilopcionOriginal.setId(perfilopcionAux.getId());
					perfilopcionOriginal.setVersionRow(perfilopcionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilOpcion perfilopcionAux:this.perfilopcions) {
				if(perfilopcionAux.getPerfilOpcionOriginal().getId().equals(perfilopcionOriginal.getId())) {
					existe=true;
					perfilopcionOriginal.setId(perfilopcionAux.getId());
					perfilopcionOriginal.setVersionRow(perfilopcionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPerfilOpcion(Boolean esParaCancelar) throws Exception {
		perfilopcionsAux=new ArrayList<PerfilOpcion>();
		perfilopcionAux=new PerfilOpcion();
		
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
					if(perfilopcionAux.getId()<0) {
						perfilopcionsAux.add(perfilopcionAux);
					}		
				}
				this.iIdNuevoPerfilOpcion=0L;
				this.perfilopcionLogic.getPerfilOpcions().removeAll(perfilopcionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilOpcion perfilopcionAux:this.perfilopcions) {
					if(perfilopcionAux.getId()<0) {
						perfilopcionsAux.add(perfilopcionAux);
					}		
				}
				this.iIdNuevoPerfilOpcion=0L;
				this.perfilopcions.removeAll(perfilopcionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPerfilOpcion 
					&& this.perfilopcionLogic.getPerfilOpcions().size()>0
					) {
					perfilopcionAux=this.perfilopcionLogic.getPerfilOpcions().get(this.perfilopcionLogic.getPerfilOpcions().size() - 1);
				
					if(perfilopcionAux.getId()<0) {
						this.perfilopcionLogic.getPerfilOpcions().remove(perfilopcionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPerfilOpcion && this.perfilopcions.size()>0) {
					perfilopcionAux=this.perfilopcions.get(this.perfilopcions.size() - 1);
				
					if(perfilopcionAux.getId()<0) {
						this.perfilopcions.remove(perfilopcionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPerfilOpcion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(perfilopcion.getId()<0) {
				this.perfilopcionLogic.getPerfilOpcions().remove(this.perfilopcion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(perfilopcion.getId()<0) {
				this.perfilopcions.remove(this.perfilopcion);
			}
		}			
	}
	
	public void setEstadosInicialesPerfilOpcion(List<PerfilOpcion> perfilopcionsAux) throws Exception {
		PerfilOpcionConstantesFunciones.setEstadosInicialesPerfilOpcion(perfilopcionsAux);
	}
	
	public void setEstadosInicialesPerfilOpcion(PerfilOpcion perfilopcionAux) throws Exception {
		PerfilOpcionConstantesFunciones.setEstadosInicialesPerfilOpcion(perfilopcionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPerfilOpcionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPerfilOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPerfilOpcionActual()) {
				if(!this.isEsNuevoPerfilOpcion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPerfilOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPerfilOpcion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPerfilOpcionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Perfil Opcion ?", "MANTENIMIENTO DE Perfil Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPerfilOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PerfilOpcion perfilopcion) throws Exception {
		PerfilOpcionConstantesFunciones.seleccionarAsignar(this.perfilopcion,perfilopcion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPerfilOpcion=this.isPermisoActualizarOriginalPerfilOpcion;
			
			
			this.seleccionarAsignar(perfilopcion);
			
			

			idOpcionActual=perfilopcion.getid_opcion();
			this.seleccionarOpcionActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilOpcionConstantesFunciones.quitarEspaciosPerfilOpcion(this.perfilopcion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPerfilOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.perfilopcionSessionBean.setsFuncionBusquedaRapida(this.perfilopcionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoPerfilOpcion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPerfilOpcion(esParaCancelar);				
				this.cancelarNuevoPerfilOpcion(esParaCancelar);								
			}
			
			this.perfilopcion=new PerfilOpcion();
			
			this.inicializarPerfilOpcion();
			
			this.actualizarEstadoCeldasBotonesPerfilOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPerfilOpcion() throws Exception {
		try {
			PerfilOpcionConstantesFunciones.inicializarPerfilOpcion(this.perfilopcion);
			
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
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.perfilopcionLogic.getPerfilOpcions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePerfilOpcions(String sAccionBusqueda,List<PerfilOpcion> perfilopcionsParaReportes) throws Exception {
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
					sPathReporteFinal="PerfilOpcion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PerfilOpcionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PerfilOpcionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PerfilOpcion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Perfil Opciones");		
		parameters.put("busquedapor", PerfilOpcionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePerfilOpcion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PerfilOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PerfilOpcionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePerfilOpcion=new JRBeanArrayDataSource(PerfilOpcionJInternalFrame.TraerPerfilOpcionBeans(perfilopcionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePerfilOpcion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PerfilOpcionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PerfilOpcionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PerfilOpcionBean.TraerPerfilOpcionBeans(perfilopcionsParaReportes).toArray()));
							
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
				this.generarExcelReportePerfilOpcions(sAccionBusqueda,sTipoArchivoReporte,perfilopcionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPerfilOpcions(sAccionBusqueda,sTipoArchivoReporte,perfilopcionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPerfilOpcionActionPerformed(null);
					//this.generarExcelReportePerfilOpcions(sAccionBusqueda,sTipoArchivoReporte,perfilopcionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPerfilOpcions(sAccionBusqueda,sTipoArchivoReporte,perfilopcionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPerfilOpcions(sAccionBusqueda,sTipoArchivoReporte,perfilopcionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPerfilOpcions(sAccionBusqueda,sTipoArchivoReporte,perfilopcionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePerfilOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilOpcion> perfilopcionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilOpcions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfilOpcion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PerfilOpcion perfilopcion : perfilopcionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PerfilOpcionConstantesFunciones.generarExcelReporteDataPerfilOpcion("NORMAL",row,workbook,perfilopcion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPerfilOpcion(String sTipo,Row row,Workbook workbook) {
		
		PerfilOpcionConstantesFunciones.generarExcelReporteHeaderPerfilOpcion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPerfilOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilOpcion> perfilopcionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilOpcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PerfilOpcion perfilopcion : perfilopcionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PerfilOpcionConstantesFunciones.getPerfilOpcionDescripcion(perfilopcion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilopcion.getsistema_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilopcion.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilopcion.getgrupoopcion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_IDPERFIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDPERFIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilopcion.getperfil_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_IDOPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDOPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilopcion.getopcion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_TODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_TODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.gettodo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_INGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_INGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getingreso()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_MODIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_MODIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getmodificacion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_ELIMINACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ELIMINACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.geteliminacion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getguardar_cambios()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_CONSULTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_CONSULTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getconsulta()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getbusqueda()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_REPORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_REPORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getreporte()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getorden()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getpaginacion_medio()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getpaginacion_alto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getpaginacion_todo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_DUPLICAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_DUPLICAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getduplicar()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_COPIAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_COPIAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getcopiar()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getcon_precargar()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilOpcionConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilopcion.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPerfilOpcions(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilOpcion> perfilopcionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PerfilOpcion> perfilopcionsRespaldo=null;
		
		classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.perfilopcionLogic.setDatosCliente(this.datosCliente);
		this.perfilopcionLogic.setDatosDeep(this.datosDeep);
		this.perfilopcionLogic.setIsConDeep(true);
		
		perfilopcionsRespaldo=this.perfilopcionLogic.getPerfilOpcions();
		
		this.perfilopcionLogic.setPerfilOpcions(perfilopcionsParaReportes);	
		this.perfilopcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		perfilopcionsParaReportes=this.perfilopcionLogic.getPerfilOpcions();
		this.perfilopcionLogic.setPerfilOpcions(perfilopcionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilOpcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfilOpcion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PerfilOpcion perfilopcion : perfilopcionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPerfilOpcion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PerfilOpcionConstantesFunciones.generarExcelReporteDataPerfilOpcion("NORMAL",row,workbook,perfilopcion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PerfilOpcionConstantesFunciones.getPerfilOpcionDescripcion(perfilopcion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilOpcion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPerfilOpcion() throws Exception {		
		this.startProcessPerfilOpcion(true);
	}
	
	public void startProcessPerfilOpcion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPerfilOpcion ,this.jPanelParametrosReportesPerfilOpcion, this.jScrollPanelDatosPerfilOpcion,this.jPanelPaginacionPerfilOpcion, this.jScrollPanelDatosEdicionPerfilOpcion, this.jPanelAccionesPerfilOpcion,this.jPanelAccionesFormularioPerfilOpcion,this.jmenuBarPerfilOpcion,this.jmenuBarDetallePerfilOpcion,this.jTtoolBarPerfilOpcion,this.jTtoolBarDetallePerfilOpcion);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfilOpcion=this.jTabbedPaneBusquedasPerfilOpcion; 
		
		final JPanel jPanelParametrosReportesPerfilOpcion=this.jPanelParametrosReportesPerfilOpcion;
		//final JScrollPane jScrollPanelDatosPerfilOpcion=this.jScrollPanelDatosPerfilOpcion;
		final JTable jTableDatosPerfilOpcion=this.jTableDatosPerfilOpcion;		
		final JPanel jPanelPaginacionPerfilOpcion=this.jPanelPaginacionPerfilOpcion;
		//final JScrollPane jScrollPanelDatosEdicionPerfilOpcion=this.jScrollPanelDatosEdicionPerfilOpcion;
		final JPanel jPanelAccionesPerfilOpcion=this.jPanelAccionesPerfilOpcion;
		
		JPanel jPanelCamposAuxiliarPerfilOpcion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPerfilOpcion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			jPanelCamposAuxiliarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jPanelCamposPerfilOpcion;
			jPanelAccionesFormularioAuxiliarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jPanelAccionesFormularioPerfilOpcion;
		}
		
		final JPanel jPanelCamposPerfilOpcion=jPanelCamposAuxiliarPerfilOpcion;
		final JPanel jPanelAccionesFormularioPerfilOpcion=jPanelAccionesFormularioAuxiliarPerfilOpcion;
		
		
		final JMenuBar jmenuBarPerfilOpcion=this.jmenuBarPerfilOpcion;
		final JToolBar jTtoolBarPerfilOpcion=this.jTtoolBarPerfilOpcion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPerfilOpcion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfilOpcion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			jmenuBarDetalleAuxiliarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jmenuBarDetallePerfilOpcion;
			jTtoolBarDetalleAuxiliarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jTtoolBarDetallePerfilOpcion;
		}
		
		final JMenuBar jmenuBarDetallePerfilOpcion=jmenuBarDetalleAuxiliarPerfilOpcion;
		final JToolBar jTtoolBarDetallePerfilOpcion=jTtoolBarDetalleAuxiliarPerfilOpcion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfilOpcion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfilOpcion;
			processRunnable.jTableDatos=jTableDatosPerfilOpcion;
			processRunnable.jPanelCampos=jPanelCamposPerfilOpcion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfilOpcion;
			processRunnable.jPanelAcciones=jPanelAccionesPerfilOpcion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfilOpcion;
			
			
			processRunnable.jmenuBar=jmenuBarPerfilOpcion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfilOpcion;
			processRunnable.jTtoolBar=jTtoolBarPerfilOpcion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfilOpcion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfilOpcion ,jPanelParametrosReportesPerfilOpcion,jTableDatosPerfilOpcion, /*jScrollPanelDatosPerfilOpcion,*/jPanelCamposPerfilOpcion,jPanelPaginacionPerfilOpcion, /*jScrollPanelDatosEdicionPerfilOpcion,*/ jPanelAccionesPerfilOpcion,jPanelAccionesFormularioPerfilOpcion,jmenuBarPerfilOpcion,jmenuBarDetallePerfilOpcion,jTtoolBarPerfilOpcion,jTtoolBarDetallePerfilOpcion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfilOpcion ,jPanelParametrosReportesPerfilOpcion, jScrollPanelDatosPerfilOpcion,jPanelPaginacionPerfilOpcion, jScrollPanelDatosEdicionPerfilOpcion, jPanelAccionesPerfilOpcion,jPanelAccionesFormularioPerfilOpcion,jmenuBarPerfilOpcion,jmenuBarDetallePerfilOpcion,jTtoolBarPerfilOpcion,jTtoolBarDetallePerfilOpcion);
						
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
	
	public void finishProcessPerfilOpcion() {// throws Exception 
		this.finishProcessPerfilOpcion(true);
	}
	
	public void finishProcessPerfilOpcion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPerfilOpcion ,this.jPanelParametrosReportesPerfilOpcion, this.jScrollPanelDatosPerfilOpcion,this.jPanelPaginacionPerfilOpcion, this.jScrollPanelDatosEdicionPerfilOpcion, this.jPanelAccionesPerfilOpcion,this.jPanelAccionesFormularioPerfilOpcion,this.jmenuBarPerfilOpcion,this.jmenuBarDetallePerfilOpcion,this.jTtoolBarPerfilOpcion,this.jTtoolBarDetallePerfilOpcion);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfilOpcion=this.jTabbedPaneBusquedasPerfilOpcion; 
		
		final JPanel jPanelParametrosReportesPerfilOpcion=this.jPanelParametrosReportesPerfilOpcion;
		//final JScrollPane jScrollPanelDatosPerfilOpcion=this.jScrollPanelDatosPerfilOpcion;
		final JTable jTableDatosPerfilOpcion=this.jTableDatosPerfilOpcion;		
		final JPanel jPanelPaginacionPerfilOpcion=this.jPanelPaginacionPerfilOpcion;
		//final JScrollPane jScrollPanelDatosEdicionPerfilOpcion=this.jScrollPanelDatosEdicionPerfilOpcion;
		final JPanel jPanelAccionesPerfilOpcion=this.jPanelAccionesPerfilOpcion;
		
		JPanel jPanelCamposAuxiliarPerfilOpcion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPerfilOpcion=new JPanel();
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			jPanelCamposAuxiliarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jPanelCamposPerfilOpcion;
			jPanelAccionesFormularioAuxiliarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jPanelAccionesFormularioPerfilOpcion;
		}
		
		final JPanel jPanelCamposPerfilOpcion=jPanelCamposAuxiliarPerfilOpcion;
		final JPanel jPanelAccionesFormularioPerfilOpcion=jPanelAccionesFormularioAuxiliarPerfilOpcion;
		
		
		final JMenuBar jmenuBarPerfilOpcion=this.jmenuBarPerfilOpcion;		
		final JToolBar jTtoolBarPerfilOpcion=this.jTtoolBarPerfilOpcion;
				
		JMenuBar jmenuBarDetalleAuxiliarPerfilOpcion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfilOpcion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			jmenuBarDetalleAuxiliarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jmenuBarDetallePerfilOpcion;
			jTtoolBarDetalleAuxiliarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jTtoolBarDetallePerfilOpcion;		
		}
		
		final JMenuBar jmenuBarDetallePerfilOpcion=jmenuBarDetalleAuxiliarPerfilOpcion;
		final JToolBar jTtoolBarDetallePerfilOpcion=jTtoolBarDetalleAuxiliarPerfilOpcion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfilOpcion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfilOpcion;
			processRunnable.jTableDatos=jTableDatosPerfilOpcion;
			processRunnable.jPanelCampos=jPanelCamposPerfilOpcion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfilOpcion;
			processRunnable.jPanelAcciones=jPanelAccionesPerfilOpcion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfilOpcion;
			
			
			processRunnable.jmenuBar=jmenuBarPerfilOpcion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfilOpcion;
			processRunnable.jTtoolBar=jTtoolBarPerfilOpcion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfilOpcion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPerfilOpcion ,jPanelParametrosReportesPerfilOpcion, jTableDatosPerfilOpcion,/*jScrollPanelDatosPerfilOpcion,*/jPanelCamposPerfilOpcion,jPanelPaginacionPerfilOpcion, /*jScrollPanelDatosEdicionPerfilOpcion,*/ jPanelAccionesPerfilOpcion,jPanelAccionesFormularioPerfilOpcion,jmenuBarPerfilOpcion,jmenuBarDetallePerfilOpcion,jTtoolBarPerfilOpcion,jTtoolBarDetallePerfilOpcion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPerfilOpcion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPerfilOpcion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPerfilOpcion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPerfilOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPerfilOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePerfilOpcion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPerfilOpcion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPerfilOpcion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePerfilOpcion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.perfilopcionConstantesFunciones.getsFinalQueryPerfilOpcion();
		String  finalQueryPaginacionTodos=this.perfilopcionConstantesFunciones.getsFinalQueryPerfilOpcion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PerfilOpcionConstantesFunciones.getArrayColumnasGlobalesNoPerfilOpcion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PerfilOpcionConstantesFunciones.getArrayColumnasGlobalesPerfilOpcion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PerfilOpcionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.perfilopcionsEliminados= new ArrayList<PerfilOpcion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPerfilOpcion();
		
				///*PerfilOpcionSessionBean*/this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			
			if(this.perfilopcionSessionBean==null) {
				this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
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
					this.iNumeroPaginacion=PerfilOpcionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PerfilOpcionConstantesFunciones.getClassesForeignKeysOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/perfilopcion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			perfilopcionsAux= new ArrayList<PerfilOpcion>();
			
				
			perfilopcionLogic.setDatosCliente(this.datosCliente);
			perfilopcionLogic.setDatosDeep(this.datosDeep);
			perfilopcionLogic.setIsConDeep(true);
			
			
			perfilopcionLogic.getPerfilOpcionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					perfilopcionLogic.getTodosPerfilOpcions(finalQueryGlobal,pagination);
					
					//perfilopcionLogic.getTodosPerfilOpcionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(perfilopcionLogic.getPerfilOpcions()==null|| perfilopcionLogic.getPerfilOpcions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilopcionsAux= new ArrayList<PerfilOpcion>();
							perfilopcionsAux.addAll(perfilopcionLogic.getPerfilOpcions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcionsAux= new ArrayList<PerfilOpcion>();
							perfilopcionsAux.addAll(perfilopcions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilopcionLogic.getTodosPerfilOpcions(finalQueryGlobal+"",this.pagination);												
							
							//perfilopcionLogic.getTodosPerfilOpcionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePerfilOpcions("Todos",perfilopcionLogic.getPerfilOpcions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());					
							perfilopcionLogic.getPerfilOpcions().addAll(perfilopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcions=new ArrayList<PerfilOpcion>();
							perfilopcions.addAll(perfilopcionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPerfilOpcion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPerfilOpcion=this.idActual;
				
				} else if(this.idPerfilOpcionActual!=null && this.idPerfilOpcionActual!=0L) {
					idPerfilOpcion=idPerfilOpcionActual;
				}
				
					
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndicePorId(idPerfilOpcion);
				
				this.perfilopcions=new ArrayList<PerfilOpcion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					perfilopcionLogic.getEntity(idPerfilOpcion);
					
					//perfilopcionLogic.getEntityWithConnection(idPerfilOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
					perfilopcionLogic.getPerfilOpcions().add(perfilopcionLogic.getPerfilOpcion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilopcions=new ArrayList<PerfilOpcion>();
					this.perfilopcions.add(perfilopcion);
				}
				
				if(perfilopcionLogic.getPerfilOpcion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion")) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdPerfilPorIdOpcion(id_sistemaBusquedaPorIdPerfilPorIdOpcion,id_moduloBusquedaPorIdPerfilPorIdOpcion,id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion,id_perfilBusquedaPorIdPerfilPorIdOpcion,id_opcionBusquedaPorIdPerfilPorIdOpcion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilopcionLogic.getPerfilOpcionsBusquedaPorIdPerfilPorIdOpcion(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdPerfilPorIdOpcion,id_moduloBusquedaPorIdPerfilPorIdOpcion,id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion,id_perfilBusquedaPorIdPerfilPorIdOpcion,id_opcionBusquedaPorIdPerfilPorIdOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdPerfilPorIdOpcion(id_sistemaBusquedaPorIdPerfilPorIdOpcion,id_moduloBusquedaPorIdPerfilPorIdOpcion,id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion,id_perfilBusquedaPorIdPerfilPorIdOpcion,id_opcionBusquedaPorIdPerfilPorIdOpcion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdPerfilPorIdOpcion(id_sistemaBusquedaPorIdPerfilPorIdOpcion,id_moduloBusquedaPorIdPerfilPorIdOpcion,id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion,id_perfilBusquedaPorIdPerfilPorIdOpcion,id_opcionBusquedaPorIdPerfilPorIdOpcion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilopcionLogic.getPerfilOpcions()==null||perfilopcionLogic.getPerfilOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilopcions==null|| perfilopcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionsAux=new ArrayList<PerfilOpcion>();
						perfilopcionsAux.addAll(perfilopcionLogic.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcionsAux=new ArrayList<PerfilOpcion>();
							perfilopcionsAux.addAll(perfilopcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilopcionLogic.getPerfilOpcionsBusquedaPorIdPerfilPorIdOpcion(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdPerfilPorIdOpcion,id_moduloBusquedaPorIdPerfilPorIdOpcion,id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion,id_perfilBusquedaPorIdPerfilPorIdOpcion,id_opcionBusquedaPorIdPerfilPorIdOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdPerfilPorIdOpcion(id_sistemaBusquedaPorIdPerfilPorIdOpcion,id_moduloBusquedaPorIdPerfilPorIdOpcion,id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion,id_perfilBusquedaPorIdPerfilPorIdOpcion,id_opcionBusquedaPorIdPerfilPorIdOpcion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdPerfilPorIdOpcion(id_sistemaBusquedaPorIdPerfilPorIdOpcion,id_moduloBusquedaPorIdPerfilPorIdOpcion,id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion,id_perfilBusquedaPorIdPerfilPorIdOpcion,id_opcionBusquedaPorIdPerfilPorIdOpcion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilOpcions("BusquedaPorIdPerfilPorIdOpcion",perfilopcionLogic.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilOpcions("BusquedaPorIdPerfilPorIdOpcion",perfilopcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
						perfilopcionLogic.getPerfilOpcions().addAll(perfilopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcions=new ArrayList<PerfilOpcion>();
							perfilopcions.addAll(perfilopcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer")) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSisPorIdModPorIdPer(id_sistemaBusquedaPorIdSisPorIdModPorIdPer,id_moduloBusquedaPorIdSisPorIdModPorIdPer,id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer,id_perfilBusquedaPorIdSisPorIdModPorIdPer);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilopcionLogic.getPerfilOpcionsBusquedaPorIdSisPorIdModPorIdPer(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSisPorIdModPorIdPer,id_moduloBusquedaPorIdSisPorIdModPorIdPer,id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer,id_perfilBusquedaPorIdSisPorIdModPorIdPer);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSisPorIdModPorIdPer(id_sistemaBusquedaPorIdSisPorIdModPorIdPer,id_moduloBusquedaPorIdSisPorIdModPorIdPer,id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer,id_perfilBusquedaPorIdSisPorIdModPorIdPer);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSisPorIdModPorIdPer(id_sistemaBusquedaPorIdSisPorIdModPorIdPer,id_moduloBusquedaPorIdSisPorIdModPorIdPer,id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer,id_perfilBusquedaPorIdSisPorIdModPorIdPer);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilopcionLogic.getPerfilOpcions()==null||perfilopcionLogic.getPerfilOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilopcions==null|| perfilopcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionsAux=new ArrayList<PerfilOpcion>();
						perfilopcionsAux.addAll(perfilopcionLogic.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcionsAux=new ArrayList<PerfilOpcion>();
							perfilopcionsAux.addAll(perfilopcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilopcionLogic.getPerfilOpcionsBusquedaPorIdSisPorIdModPorIdPer(finalQueryGlobal,pagination,id_sistemaBusquedaPorIdSisPorIdModPorIdPer,id_moduloBusquedaPorIdSisPorIdModPorIdPer,id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer,id_perfilBusquedaPorIdSisPorIdModPorIdPer);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSisPorIdModPorIdPer(id_sistemaBusquedaPorIdSisPorIdModPorIdPer,id_moduloBusquedaPorIdSisPorIdModPorIdPer,id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer,id_perfilBusquedaPorIdSisPorIdModPorIdPer);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceBusquedaPorIdSisPorIdModPorIdPer(id_sistemaBusquedaPorIdSisPorIdModPorIdPer,id_moduloBusquedaPorIdSisPorIdModPorIdPer,id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer,id_perfilBusquedaPorIdSisPorIdModPorIdPer);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilOpcions("BusquedaPorIdSisPorIdModPorIdPer",perfilopcionLogic.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilOpcions("BusquedaPorIdSisPorIdModPorIdPer",perfilopcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
						perfilopcionLogic.getPerfilOpcions().addAll(perfilopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcions=new ArrayList<PerfilOpcion>();
							perfilopcions.addAll(perfilopcionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdGrupoOpcion")) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilopcionLogic.getPerfilOpcionsFK_IdGrupoOpcion(finalQueryGlobal,pagination,id_grupo_opcionFK_IdGrupoOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilopcionLogic.getPerfilOpcions()==null||perfilopcionLogic.getPerfilOpcions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilopcions==null|| perfilopcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionsAux=new ArrayList<PerfilOpcion>();
						perfilopcionsAux.addAll(perfilopcionLogic.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcionsAux=new ArrayList<PerfilOpcion>();
							perfilopcionsAux.addAll(perfilopcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilopcionLogic.getPerfilOpcionsFK_IdGrupoOpcion(finalQueryGlobal,pagination,id_grupo_opcionFK_IdGrupoOpcion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilOpcionConstantesFunciones.getDetalleIndiceFK_IdGrupoOpcion(id_grupo_opcionFK_IdGrupoOpcion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilOpcions("FK_IdGrupoOpcion",perfilopcionLogic.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilOpcions("FK_IdGrupoOpcion",perfilopcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionLogic.setPerfilOpcions(new ArrayList<PerfilOpcion>());
						perfilopcionLogic.getPerfilOpcions().addAll(perfilopcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcions=new ArrayList<PerfilOpcion>();
							perfilopcions.addAll(perfilopcionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPerfilOpcion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPerfilOpcion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilopcionLogic.getPerfilOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilopcions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilopcionLogic.getPerfilOpcions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilopcions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PerfilOpcion perfilopcion) {
		Boolean permite=true;
		
		if(this.perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PerfilOpcionConstantesFunciones.getOrderByListaPerfilOpcion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PerfilOpcionConstantesFunciones.getOrderByListaPerfilOpcion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilOpcion perfilopcion:perfilopcionLogic.getPerfilOpcions()) {
				if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilopcionTotales=perfilopcion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilOpcion perfilopcion:this.perfilopcions) {
				if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilopcionTotales=perfilopcion;
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
			this.perfilopcionAux=new PerfilOpcion();
			this.perfilopcionAux.setsType(Constantes2.S_TOTALES);
			this.perfilopcionAux.setIsNew(false);
			this.perfilopcionAux.setIsChanged(false);
			this.perfilopcionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PerfilOpcionConstantesFunciones.TotalizarValoresFilaPerfilOpcion(this.perfilopcionLogic.getPerfilOpcions(),this.perfilopcionAux);
				
				this.perfilopcionLogic.getPerfilOpcions().add(this.perfilopcionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PerfilOpcionConstantesFunciones.TotalizarValoresFilaPerfilOpcion(this.perfilopcions,this.perfilopcionAux);
				
				this.perfilopcions.add(this.perfilopcionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		perfilopcionTotales=new PerfilOpcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilopcionLogic.getPerfilOpcions().remove(perfilopcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilopcions.remove(perfilopcionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		perfilopcionTotales=new PerfilOpcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilOpcion perfilopcion:perfilopcionLogic.getPerfilOpcions()) {
				if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilopcionTotales=perfilopcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilOpcionConstantesFunciones.TotalizarValoresFilaPerfilOpcion(this.perfilopcionLogic.getPerfilOpcions(),perfilopcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilOpcion perfilopcion:this.perfilopcions) {
				if(perfilopcion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilopcionTotales=perfilopcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilOpcionConstantesFunciones.TotalizarValoresFilaPerfilOpcion(this.perfilopcions,perfilopcionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPerfilOpcionsBusquedaPorIdPerfilPorIdOpcion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdPerfilPorIdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilOpcionsBusquedaPorIdSisPorIdModPorIdPer()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdSisPorIdModPorIdPer";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilOpcionsFK_IdGrupoOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilOpcionsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilOpcionsFK_IdOpcion()throws Exception {
		try {
			sAccionBusqueda="FK_IdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilOpcionsFK_IdPerfil()throws Exception {
		try {
			sAccionBusqueda="FK_IdPerfil";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilOpcionsFK_IdSistema()throws Exception {
		try {
			sAccionBusqueda="FK_IdSistema";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilOpcionPorIdPerfilPorIdOpcion()throws Exception {
		try {
			sAccionBusqueda="PorIdPerfilPorIdOpcion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getPerfilOpcionsBusquedaPorIdPerfilPorIdOpcion(String sFinalQuery,Long id_sistema,Long id_modulo,Long id_grupo_opcion,Long id_perfil,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.getPerfilOpcionsBusquedaPorIdPerfilPorIdOpcion(sFinalQuery,this.pagination,id_sistema,id_modulo,id_grupo_opcion,id_perfil,id_opcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilOpcionsBusquedaPorIdSisPorIdModPorIdPer(String sFinalQuery,Long id_sistema,Long id_modulo,Long id_grupo_opcion,Long id_perfil)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.getPerfilOpcionsBusquedaPorIdSisPorIdModPorIdPer(sFinalQuery,this.pagination,id_sistema,id_modulo,id_grupo_opcion,id_perfil);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilOpcionsFK_IdGrupoOpcion(String sFinalQuery,Long id_grupo_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.getPerfilOpcionsFK_IdGrupoOpcion(sFinalQuery,this.pagination,id_grupo_opcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilOpcionsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.getPerfilOpcionsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilOpcionsFK_IdOpcion(String sFinalQuery,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.getPerfilOpcionsFK_IdOpcion(sFinalQuery,this.pagination,id_opcion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilOpcionsFK_IdPerfil(String sFinalQuery,Long id_perfil)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.getPerfilOpcionsFK_IdPerfil(sFinalQuery,this.pagination,id_perfil);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilOpcionsFK_IdSistema(String sFinalQuery,Long id_sistema)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.getPerfilOpcionsFK_IdSistema(sFinalQuery,this.pagination,id_sistema);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilOpcionPorIdPerfilPorIdOpcion(Long id_perfil,Long id_opcion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLogic.getPerfilOpcionPorIdPerfilPorIdOpcion(id_perfil,id_opcion);
				
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
	
	public void inicializarPermisosPerfilOpcion() {
		this.isPermisoTodoPerfilOpcion=false;
		this.isPermisoNuevoPerfilOpcion=false;
		this.isPermisoActualizarPerfilOpcion=false;
		this.isPermisoActualizarOriginalPerfilOpcion=false;
		this.isPermisoEliminarPerfilOpcion=false;
		this.isPermisoGuardarCambiosPerfilOpcion=false;
		this.isPermisoConsultaPerfilOpcion=false;
		this.isPermisoBusquedaPerfilOpcion=false;
		this.isPermisoReportePerfilOpcion=false;		
		this.isPermisoOrdenPerfilOpcion=false;		
		this.isPermisoPaginacionMedioPerfilOpcion=false;		
		this.isPermisoPaginacionAltoPerfilOpcion=false;
		this.isPermisoPaginacionTodoPerfilOpcion=false;
		this.isPermisoCopiarPerfilOpcion=false;		
		this.isPermisoVerFormPerfilOpcion=false;		
		this.isPermisoDuplicarPerfilOpcion=false;		
		this.isPermisoOrdenPerfilOpcion=false;		
	}
	
	public void setPermisosUsuarioPerfilOpcion(Boolean isPermiso) {
		this.isPermisoTodoPerfilOpcion=isPermiso;
		this.isPermisoNuevoPerfilOpcion=isPermiso;
		this.isPermisoActualizarPerfilOpcion=isPermiso;
		this.isPermisoActualizarOriginalPerfilOpcion=isPermiso;
		this.isPermisoEliminarPerfilOpcion=isPermiso;
		this.isPermisoGuardarCambiosPerfilOpcion=isPermiso;
		this.isPermisoConsultaPerfilOpcion=isPermiso;
		this.isPermisoBusquedaPerfilOpcion=isPermiso;
		this.isPermisoReportePerfilOpcion=isPermiso;
		this.isPermisoOrdenPerfilOpcion=isPermiso;		
		this.isPermisoPaginacionMedioPerfilOpcion=isPermiso;		
		this.isPermisoPaginacionAltoPerfilOpcion=isPermiso;		
		this.isPermisoPaginacionTodoPerfilOpcion=isPermiso;		
		this.isPermisoCopiarPerfilOpcion=isPermiso;		
		this.isPermisoVerFormPerfilOpcion=isPermiso;		
		this.isPermisoDuplicarPerfilOpcion=isPermiso;
		this.isPermisoOrdenPerfilOpcion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPerfilOpcion(Boolean isPermiso) {
		//this.isPermisoTodoPerfilOpcion=isPermiso;
		this.isPermisoNuevoPerfilOpcion=isPermiso;
		this.isPermisoActualizarPerfilOpcion=isPermiso;
		this.isPermisoActualizarOriginalPerfilOpcion=isPermiso;
		this.isPermisoEliminarPerfilOpcion=isPermiso;
		this.isPermisoGuardarCambiosPerfilOpcion=isPermiso;
		//this.isPermisoConsultaPerfilOpcion=isPermiso;
		//this.isPermisoBusquedaPerfilOpcion=isPermiso;
		//this.isPermisoReportePerfilOpcion=isPermiso;
		//this.isPermisoOrdenPerfilOpcion=isPermiso;		
		//this.isPermisoPaginacionMedioPerfilOpcion=isPermiso;		
		//this.isPermisoPaginacionAltoPerfilOpcion=isPermiso;		
		//this.isPermisoPaginacionTodoPerfilOpcion=isPermiso;		
		//this.isPermisoCopiarPerfilOpcion=isPermiso;		
		//this.isPermisoDuplicarPerfilOpcion=isPermiso;
		//this.isPermisoOrdenPerfilOpcion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPerfilOpcionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PerfilOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPerfilOpcion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPerfilOpcionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPerfilOpcionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPerfilOpcionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPerfilOpcionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPerfilOpcion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PerfilOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PerfilOpcionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPerfilOpcion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPerfilOpcion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPerfilOpcion=this.isPermisoActualizarPerfilOpcion;
			this.isPermisoEliminarPerfilOpcion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPerfilOpcion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPerfilOpcion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPerfilOpcion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPerfilOpcion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePerfilOpcion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfilOpcion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPerfilOpcion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPerfilOpcion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPerfilOpcion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPerfilOpcion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPerfilOpcion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPerfilOpcion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfilOpcion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPerfilOpcion.setToolTipText(this.jTableDatosPerfilOpcion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPerfilOpcion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPerfilOpcion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PerfilOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PerfilOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPerfilOpcion() throws Exception {
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
	public void inicializarCombosForeignKeyPerfilOpcionListas()throws Exception {
		try	{						
			
				this.sistemasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.grupoopcionsForeignKey=new ArrayList();
				this.perfilsForeignKey=new ArrayList();
				this.opcionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPerfilOpcionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PerfilOpcionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPerfilOpcionListas(false);
			} else {
			
				this.cargarCombosForeignKeySistemaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyOpcionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPerfilListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.perfilsForeignKey==null||this.perfilsForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyPerfilOpcionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PerfilOpcionParameterReturnGeneral perfilopcionReturnGeneral=new PerfilOpcionParameterReturnGeneral();
						
			


				String finalQueryGlobalSistema="";

				if(((this.sistemasForeignKey==null||this.sistemasForeignKey.size()<=0) && this.perfilopcionConstantesFunciones.cargarid_sistemaPerfilOpcion)
					 || (this.esRecargarFks && this.perfilopcionConstantesFunciones.cargarid_sistemaPerfilOpcion)) {

					if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SistemaConstantesFunciones.getArrayColumnasGlobalesSistema(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSistema=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SistemaConstantesFunciones.TABLENAME);

						finalQueryGlobalSistema=Funciones.GetFinalQueryAppend(finalQueryGlobalSistema, "");
						finalQueryGlobalSistema+=SistemaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSistemasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSistema=" WHERE " + ConstantesSql.ID + "="+perfilopcionSessionBean.getlidSistemaActual();
					}
				} else {
					finalQueryGlobalSistema="NONE";
				}


				String finalQueryGlobalModulo="";

				if(cargarCombosDependencia && ((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.perfilopcionConstantesFunciones.cargarid_moduloPerfilOpcion)
					 || (this.esRecargarFks && this.perfilopcionConstantesFunciones.cargarid_moduloPerfilOpcion)) {

					if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+perfilopcionSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalGrupoOpcion="";

				if(cargarCombosDependencia && ((this.grupoopcionsForeignKey==null||this.grupoopcionsForeignKey.size()<=0) && this.perfilopcionConstantesFunciones.cargarid_grupo_opcionPerfilOpcion)
					 || (this.esRecargarFks && this.perfilopcionConstantesFunciones.cargarid_grupo_opcionPerfilOpcion)) {

					if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=GrupoOpcionConstantesFunciones.getArrayColumnasGlobalesGrupoOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrupoOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoOpcionConstantesFunciones.TABLENAME);

						finalQueryGlobalGrupoOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalGrupoOpcion, "");
						finalQueryGlobalGrupoOpcion+=GrupoOpcionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosGrupoOpcionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrupoOpcion=" WHERE " + ConstantesSql.ID + "="+perfilopcionSessionBean.getlidGrupoOpcionActual();
					}
				} else {
					finalQueryGlobalGrupoOpcion="NONE";
				}


				String finalQueryGlobalPerfil="";

				if(cargarCombosDependencia && ((this.perfilsForeignKey==null||this.perfilsForeignKey.size()<=0) && this.perfilopcionConstantesFunciones.cargarid_perfilPerfilOpcion)
					 || (this.esRecargarFks && this.perfilopcionConstantesFunciones.cargarid_perfilPerfilOpcion)) {

					if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PerfilConstantesFunciones.getArrayColumnasGlobalesPerfil(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPerfil=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PerfilConstantesFunciones.TABLENAME);

						finalQueryGlobalPerfil=Funciones.GetFinalQueryAppend(finalQueryGlobalPerfil, "");
						finalQueryGlobalPerfil+=PerfilConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPerfilsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPerfil=" WHERE " + ConstantesSql.ID + "="+perfilopcionSessionBean.getlidPerfilActual();
					}
				} else {
					finalQueryGlobalPerfil="NONE";
				}


				String finalQueryGlobalOpcion="";

				if(cargarCombosDependencia && ((this.opcionsForeignKey==null||this.opcionsForeignKey.size()<=0) && this.perfilopcionConstantesFunciones.cargarid_opcionPerfilOpcion)
					 || (this.esRecargarFks && this.perfilopcionConstantesFunciones.cargarid_opcionPerfilOpcion)) {

					if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OpcionConstantesFunciones.getArrayColumnasGlobalesOpcion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOpcion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OpcionConstantesFunciones.TABLENAME);

						finalQueryGlobalOpcion=Funciones.GetFinalQueryAppend(finalQueryGlobalOpcion, "");
						finalQueryGlobalOpcion+=OpcionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOpcionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOpcion=" WHERE " + ConstantesSql.ID + "="+perfilopcionSessionBean.getlidOpcionActual();
					}
				} else {
					finalQueryGlobalOpcion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilopcionReturnGeneral=perfilopcionLogic.cargarCombosLoteForeignKeyPerfilOpcion(finalQueryGlobalSistema,finalQueryGlobalModulo,finalQueryGlobalGrupoOpcion,finalQueryGlobalPerfil,finalQueryGlobalOpcion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSistema.equals("NONE")) {
				this.sistemasForeignKey=perfilopcionReturnGeneral.getsistemasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=perfilopcionReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalGrupoOpcion.equals("NONE")) {
				this.grupoopcionsForeignKey=perfilopcionReturnGeneral.getgrupoopcionsForeignKey();
			}

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				this.perfilsForeignKey=perfilopcionReturnGeneral.getperfilsForeignKey();
			}

			if(!finalQueryGlobalOpcion.equals("NONE")) {
				this.opcionsForeignKey=perfilopcionReturnGeneral.getopcionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPerfilOpcion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeySistema();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyGrupoOpcion();
			this.addItemDefectoCombosForeignKeyPerfil();
			this.addItemDefectoCombosForeignKeyOpcion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeySistema()throws Exception {
		try {
			if(this.perfilopcionSessionBean==null) {
				this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionSistema()) {
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

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionGrupoOpcion()) {
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

	public void addItemDefectoCombosForeignKeyPerfil()throws Exception {
		try {

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
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

	public void addItemDefectoCombosForeignKeyOpcion()throws Exception {
		try {

			if(!this.perfilopcionSessionBean.getisBusquedaDesdeForeignKeySesionOpcion()) {
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
	
	public void initActionsCombosTodosForeignKeyPerfilOpcion()throws Exception {
		try {
			
			this.initActionsCombosForeignKeySistema("Todos");
			this.initActionsCombosForeignKeyModulo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPerfilOpcion(String sFormularioTipoBusqueda)throws Exception {
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
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.addItemListener(new ComboBoxItemListener(this,"id_sistemaPerfilOpcion"));
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaPerfilOpcion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.addActionListener(new ComboBoxActionListener(this,"id_sistemaPerfilOpcion"));
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_sistemaPerfilOpcion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

					} else {
						this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

					} else {
						this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

						this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

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
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.addItemListener(new ComboBoxItemListener(this,"id_moduloPerfilOpcion"));
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_moduloPerfilOpcion"));
					}
				} else {
					if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.addActionListener(new ComboBoxActionListener(this,"id_moduloPerfilOpcion"));
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"id_moduloPerfilOpcion"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

					} else {
						this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

					} else {
						this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

						this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyPerfilOpcion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilOpcion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPerfilOpcion(PerfilOpcion perfilopcion)throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(perfilopcion.getid_sistema(),false,"Formulario");
			this.setActualModuloForeignKey(perfilopcion.getid_modulo(),false,"Formulario");
			this.setActualGrupoOpcionForeignKey(perfilopcion.getid_grupo_opcion(),false,"Formulario");
			this.setActualPerfilForeignKey(perfilopcion.getid_perfil(),false,"Formulario");
			this.setActualOpcionForeignKey(perfilopcion.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPerfilOpcion(PerfilOpcion perfilopcion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(perfilopcion.getOpcion()!=null && !sTipoEvento.equals("id_opcionPerfilOpcion")) { //sTipoEvento Evita Bucle Infinito

					this.opcionsForeignKey=new ArrayList<Opcion>();
					this.opcionsForeignKey.add(perfilopcion.getOpcion());

					this.addItemDefectoCombosForeignKeyOpcion();
					this.cargarCombosFrameOpcionsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPerfilOpcion()throws Exception {	
		try {
			
			this.setActualSistemaForeignKey(this.perfilopcionConstantesFunciones.getid_sistema(),false,"Formulario");
			this.setActualModuloForeignKey(this.perfilopcionConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualGrupoOpcionForeignKey(this.perfilopcionConstantesFunciones.getid_grupo_opcion(),false,"Formulario");
			this.setActualPerfilForeignKey(this.perfilopcionConstantesFunciones.getid_perfil(),false,"Formulario");
			this.setActualOpcionForeignKey(this.perfilopcionConstantesFunciones.getid_opcion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilOpcion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPerfilOpcion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPerfilOpcion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPerfilOpcion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPerfilOpcion()throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameGrupoOpcionsForeignKey("Todos");
			this.cargarCombosFramePerfilsForeignKey("Todos");
			this.cargarCombosFrameOpcionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPerfilOpcion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSistemasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoOpcionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPerfilOpcion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormPerfilOpcionSistema(JComboBox<?> jComboBoxGenericoSistema,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormPerfilOpcionid_modulo(jComboBoxGenericoSistema,sFormularioTipoBusqueda,"Sistema",false);
		this.recargarFormPerfilOpcionid_perfil(jComboBoxGenericoSistema,sFormularioTipoBusqueda,"Sistema",false);
	}

	public void recargarFormPerfilOpcionModulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormPerfilOpcionid_grupo_opcion(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
		this.recargarFormPerfilOpcionid_opcion(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
	}






	
	



	public void recargarFormPerfilOpcionid_modulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Sistema")){
				this.setActualParaGuardarSistemaForeignKey(this.perfilopcion,jComboBoxGenericoModulo);
			}

			if(this.perfilopcion.getid_sistema()!=null && this.perfilopcion.getid_sistema()!=0L) {
				sFinalQuery+="  WHERE  id_sistema="+this.perfilopcion.getid_sistema();
			} else {
				sFinalQuery+="  WHERE  id_sistema=-1";
			}



			//BUCLE RECURSIVO
			this.setActualModuloForeignKey(this.perfilopcion.getid_sistema(),true,sFormularioTipoBusqueda);

			this.cargarCombosModulosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormPerfilOpcionid_grupo_opcion(JComboBox<?> jComboBoxGenericoGrupoOpcion,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.perfilopcion,jComboBoxGenericoGrupoOpcion);
			}

			if(this.perfilopcion.getid_modulo()!=null && this.perfilopcion.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.perfilopcion.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualGrupoOpcionForeignKey(this.perfilopcion.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosGrupoOpcionsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameGrupoOpcionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormPerfilOpcionid_perfil(JComboBox<?> jComboBoxGenericoPerfil,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Sistema")){
				this.setActualParaGuardarSistemaForeignKey(this.perfilopcion,jComboBoxGenericoPerfil);
			}

			if(this.perfilopcion.getid_sistema()!=null && this.perfilopcion.getid_sistema()!=0L) {
				sFinalQuery+="  WHERE  id_sistema="+this.perfilopcion.getid_sistema();
			} else {
				sFinalQuery+="  WHERE  id_sistema=-1";
			}



			//BUCLE RECURSIVO
			this.setActualPerfilForeignKey(this.perfilopcion.getid_sistema(),true,sFormularioTipoBusqueda);

			this.cargarCombosPerfilsForeignKeyLista(sFinalQuery);

			this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormPerfilOpcionid_opcion(JComboBox<?> jComboBoxGenericoOpcion,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.perfilopcion,jComboBoxGenericoOpcion);
			}

			if(this.perfilopcion.getid_modulo()!=null && this.perfilopcion.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.perfilopcion.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualOpcionForeignKey(this.perfilopcion.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosOpcionsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameOpcionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public PerfilOpcionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PerfilOpcionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PerfilOpcionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.perfilopcionSessionBean=new PerfilOpcionSessionBean(); 
		this.perfilopcionConstantesFunciones=new PerfilOpcionConstantesFunciones(); 
		this.perfilopcionBean=new PerfilOpcion();//(this.perfilopcionConstantesFunciones); 		
		this.perfilopcionReturnGeneral=new PerfilOpcionParameterReturnGeneral(); 
		
		this.perfilopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PerfilOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PerfilOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PerfilOpcionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPerfilOpcion(true);
			
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
			
			this.perfilopcionConstantesFunciones=new PerfilOpcionConstantesFunciones(); 
			this.perfilopcionBean=new PerfilOpcion();//this.perfilopcionConstantesFunciones); 			
			this.perfilopcionReturnGeneral=new PerfilOpcionParameterReturnGeneral(); 
		
			PerfilOpcionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Opcion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.perfilopcion=new PerfilOpcion();
			this.perfilopcions = new ArrayList<PerfilOpcion>();
			this.perfilopcionsAux = new ArrayList<PerfilOpcion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic=new PerfilOpcionLogic();
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}
			
			//this.perfilopcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.perfilopcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPerfilOpcion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfilOpcion);	
					}
					
					if(this.jInternalFrameImportacionPerfilOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfilOpcion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPerfilOpcion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPerfilOpcion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfilOpcion);
				this.jInternalFrameDetalleFormPerfilOpcion.setVisible(false);
				this.jInternalFrameDetalleFormPerfilOpcion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfilOpcion);
					this.jInternalFrameReporteDinamicoPerfilOpcion.setVisible(false);
					this.jInternalFrameReporteDinamicoPerfilOpcion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPerfilOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPerfilOpcion);
					this.jInternalFrameImportacionPerfilOpcion.setVisible(false);
					this.jInternalFrameImportacionPerfilOpcion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPerfilOpcion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPerfilOpcion);
					this.jInternalFrameOrderByPerfilOpcion.setVisible(false);
					this.jInternalFrameOrderByPerfilOpcion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPerfilOpcionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PerfilOpcionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.perfilopcionReturnGeneral=new PerfilOpcionParameterReturnGeneral();
			
			this.perfilopcionParameterGeneral=new PerfilOpcionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.perfilopcionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PerfilOpcionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilOpcionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilopcionSessionBean.getEsGuardarRelacionado(),this.perfilopcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilOpcionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilopcionSessionBean.getEsGuardarRelacionado(),this.perfilopcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPerfilOpcion=false;
			this.isVisibilidadCeldaDuplicarPerfilOpcion=true;
			this.isVisibilidadCeldaCopiarPerfilOpcion=true;
			this.isVisibilidadCeldaVerFormPerfilOpcion=true;
			this.isVisibilidadCeldaOrdenPerfilOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
			this.isVisibilidadCeldaModificarPerfilOpcion=false;
			this.isVisibilidadCeldaActualizarPerfilOpcion=false;
			this.isVisibilidadCeldaEliminarPerfilOpcion=false;
			this.isVisibilidadCeldaCancelarPerfilOpcion=false;
			this.isVisibilidadCeldaGuardarPerfilOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=false;
			
			
			this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion=true;
			this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer=true;
			this.isVisibilidadFK_IdGrupoOpcion=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdOpcion=true;
			this.isVisibilidadFK_IdPerfil=true;
			this.isVisibilidadFK_IdSistema=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPerfilOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPerfilOpcion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPerfilOpcion(false);
			
			this.setPermisosUsuarioPerfilOpcion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilopcionSessionBean.getEsGuardarRelacionado() 
				|| (this.perfilopcionSessionBean.getEsGuardarRelacionado() && this.perfilopcionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPerfilOpcionClasesRelacionadas();
			}
			
			if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPerfilOpcionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPerfilOpcion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPerfilOpcion();
			}
			
			if(!this.isPermisoBusquedaPerfilOpcion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPerfilOpcion,this.isPermisoPaginacionMedioPerfilOpcion,this.isPermisoPaginacionTodoPerfilOpcion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PerfilOpcionConstantesFunciones.getTiposSeleccionarPerfilOpcion());
				
				this.tiposColumnasSelect=PerfilOpcionConstantesFunciones.getTiposSeleccionarPerfilOpcion(true);
				
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
			//if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPerfilOpcion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPerfilOpcion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPerfilOpcion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilOpcion() ;
			
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
			this.perfilLogic=new PerfilLogic();
			this.opcionLogic=new OpcionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				perfilopcionImplementable= (PerfilOpcionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilOpcionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				perfilopcionImplementableHome= (PerfilOpcionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilOpcionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.perfilopcions= new ArrayList<PerfilOpcion>();
			this.perfilopcionsEliminados= new ArrayList<PerfilOpcion>();
						
			this.isEsNuevoPerfilOpcion=false;
			this.esParaAccionDesdeFormularioPerfilOpcion=false;
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
			this.perfilsForeignKey=new ArrayList<Perfil>() ;
			this.opcionsForeignKey=new ArrayList<Opcion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPerfilOpcion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPerfilOpcion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PerfilOpcionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PerfilOpcionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPerfilOpcion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPerfilOpcion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPerfilOpcion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPerfilOpcion();
			}
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPerfilOpcion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPerfilOpcion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPerfilOpcion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPerfilOpcion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PerfilOpcion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPerfilOpcion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPerfilOpcion")) {
				iIndex=this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPerfilOpcion();	
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
	
	public void cargarCombosForeignKeyPerfilOpcion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPerfilOpcion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPerfilOpcion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPerfilOpcionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPerfilOpcion();
		
		this.cargarCombosFrameForeignKeyPerfilOpcion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPerfilOpcion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPerfilOpcion();
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
	
	public void jButtonNuevoPerfilOpcionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
			
			if(jTableDatosPerfilOpcion.getRowCount()>=1) {
				jTableDatosPerfilOpcion.removeRowSelectionInterval(0, jTableDatosPerfilOpcion.getRowCount()-1);						
			}
			
			this.isEsNuevoPerfilOpcion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPerfilOpcion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPerfilOpcion(true);			
			//this.perfilopcion=new PerfilOpcion();
			//this.perfilopcion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilOpcion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilOpcion() ;
			
			if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilOpcion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.perfilopcion);	
			this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);				
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
			if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PerfilOpcion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPerfilOpcionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPerfilOpcion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPerfilOpcion.getSelectedRows().length;			
			}
			
			perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPerfilOpcion--;			
				//PerfilOpcion perfilopcionAux= new PerfilOpcion();			
				//perfilopcionAux.setId(this.iIdNuevoPerfilOpcion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PerfilOpcion perfilopcionOrigen=new PerfilOpcion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PerfilOpcion perfilopcionOrigen : perfilopcionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							perfilopcionOrigen =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilopcionOrigen =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPerfilOpcion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.perfilopcion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPerfilOpcion(perfilopcionOrigen,this.perfilopcion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilopcionLogic.getPerfilOpcions().add(this.perfilopcionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfilopcions.add(this.perfilopcionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPerfilOpcion(false);
				
				this.jTableDatosPerfilOpcion.setRowSelectionInterval(this.getIndiceNuevoPerfilOpcion(), this.getIndiceNuevoPerfilOpcion());
				
				int iLastRow =  this.jTableDatosPerfilOpcion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfilOpcion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfilOpcion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilOpcion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();									
		
			PerfilOpcion perfilopcionOrigen=new PerfilOpcion();
			PerfilOpcion perfilopcionDestino=new PerfilOpcion();
				
			perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPerfilOpcion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || perfilopcionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPerfilOpcion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionOrigen =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilopcionOrigen =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilopcionDestino =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilopcionDestino =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				perfilopcionOrigen =perfilopcionsSeleccionados.get(0);
				perfilopcionDestino =perfilopcionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPerfilOpcion(perfilopcionOrigen,perfilopcionDestino,true,false);
				
				perfilopcionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilopcionDestino,perfilopcionLogic.getPerfilOpcions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilopcionDestino,perfilopcions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPerfilOpcion(false);
				
				//this.jTableDatosPerfilOpcion.setRowSelectionInterval(this.getIndiceNuevoPerfilOpcion(), this.getIndiceNuevoPerfilOpcion());
				
				int iLastRow =  this.jTableDatosPerfilOpcion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfilOpcion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfilOpcion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilOpcion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPerfilOpcion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPerfilOpcion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPerfilOpcion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPerfilOpcion.setVisible(!isVisible);
			this.jPanelPaginacionPerfilOpcion.setVisible(!isVisible);
			this.jPanelAccionesPerfilOpcion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePerfilOpcion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPerfilOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPerfilOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPerfilOpcion();
			
			this.abrirFrameOrderByPerfilOpcion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPerfilOpcion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePerfilOpcion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfilOpcion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPerfilOpcion.isMaximum()) {
					this.jInternalFrameDetalleFormPerfilOpcion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPerfilOpcion.setSize(this.jInternalFrameDetalleFormPerfilOpcion.iWidthFormulario,this.jInternalFrameDetalleFormPerfilOpcion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPerfilOpcion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPerfilOpcion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPerfilOpcion.isMaximum()) {
						this.jInternalFrameDetalleFormPerfilOpcion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPerfilOpcion.jContentPaneDetallePerfilOpcion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPerfilOpcion.jContentPaneDetallePerfilOpcion.getWidth(),PerfilOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPerfilOpcion.jContentPaneDetallePerfilOpcion.getWidth(),PerfilOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPerfilOpcion.jContentPaneDetallePerfilOpcion.getWidth(),PerfilOpcionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPerfilOpcion.setVisible(true);
	        this.jInternalFrameDetalleFormPerfilOpcion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPerfilOpcion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPerfilOpcion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPerfilOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilOpcion,false,this);
				} else {
					this.jInternalFrameOrderByPerfilOpcion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilOpcion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPerfilOpcion);
				this.jInternalFrameOrderByPerfilOpcion.setVisible(false);
				this.jInternalFrameOrderByPerfilOpcion.setSelected(false);
				
				this.jInternalFrameOrderByPerfilOpcion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfilOpcion"));
				
				this.inicializarActualizarBindingTablaOrderByPerfilOpcion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPerfilOpcion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPerfilOpcion==null) {
				
				this.jInternalFrameImportacionPerfilOpcion=new ImportacionJInternalFrame(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfilOpcion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPerfilOpcion);
				this.jInternalFrameImportacionPerfilOpcion.setVisible(false);
				this.jInternalFrameImportacionPerfilOpcion.setSelected(false);


				this.jInternalFrameImportacionPerfilOpcion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfilOpcion"));
				this.jInternalFrameImportacionPerfilOpcion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfilOpcion"));
				this.jInternalFrameImportacionPerfilOpcion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfilOpcion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPerfilOpcion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPerfilOpcion==null) {
				this.jInternalFrameReporteDinamicoPerfilOpcion=new ReporteDinamicoJInternalFrame(PerfilOpcionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfilOpcion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfilOpcion);
				this.jInternalFrameReporteDinamicoPerfilOpcion.setVisible(false);
				this.jInternalFrameReporteDinamicoPerfilOpcion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPerfilOpcion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilOpcion"));
				this.jInternalFrameReporteDinamicoPerfilOpcion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilOpcion"));
				this.jInternalFrameReporteDinamicoPerfilOpcion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilOpcion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilOpcion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePerfilOpcion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfilOpcion);
			
	       	this.jInternalFrameDetalleFormPerfilOpcion.setVisible(false);
	        this.jInternalFrameDetalleFormPerfilOpcion.setSelected(false);
			
			//this.jInternalFrameDetalleFormPerfilOpcion.dispose();
			//this.jInternalFrameDetalleFormPerfilOpcion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPerfilOpcion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPerfilOpcion.setVisible(true);
	        this.jInternalFrameReporteDinamicoPerfilOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPerfilOpcion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPerfilOpcion.setVisible(true);
	        this.jInternalFrameImportacionPerfilOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPerfilOpcion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPerfilOpcion.setVisible(true);
	        this.jInternalFrameOrderByPerfilOpcion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPerfilOpcion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPerfilOpcion.setVisible(false);
	        this.jInternalFrameOrderByPerfilOpcion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPerfilOpcion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPerfilOpcion.setVisible(false);
	        this.jInternalFrameReporteDinamicoPerfilOpcion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPerfilOpcion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPerfilOpcion.setVisible(false);
	        this.jInternalFrameImportacionPerfilOpcion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderPerfilOpcion=(TitledBorder)this.jScrollPanelDatosPerfilOpcion.getBorder();
						TitledBorder titledBorderOpcion=(TitledBorder)opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

						titledBorderOpcion.setTitle(titledBorderPerfilOpcion.getTitle() + " -> Opcion");


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
	
	public void jButtonModificarPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPerfilOpcion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPerfilOpcion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPerfilOpcion(true);
			//this.isEsNuevoPerfilOpcion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPerfilOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilOpcion(false) ;
			
			if(perfilopcionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilOpcion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilOpcion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPerfilOpcionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPerfilOpcion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPerfilOpcion(true);
			//this.isEsNuevoPerfilOpcion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.perfilopcion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPerfilOpcion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPerfilOpcion(false) ;
			
			if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilOpcion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilOpcion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Opcion")) {
				if(!this.perfilopcionConstantesFunciones.cargarid_opcionPerfilOpcion) {
					this.cargarCombosOpcionsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPerfilOpcion(false,false);
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
		TableColumn tableColumnSistema=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA));
		TableCellEditor tableCellEditorSistema =tableColumnSistema.getCellEditor();

		SistemaTableCell sistemaTableCellFk=(SistemaTableCell)tableCellEditorSistema;

		if(sistemaTableCellFk!=null) {
			sistemaTableCellFk.setsistemasForeignKey(sistemasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilOpcion.getSelectedRow();

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
		TableColumn tableColumnModulo=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilOpcion.getSelectedRow();

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
		TableColumn tableColumnGrupoOpcion=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION));
		TableCellEditor tableCellEditorGrupoOpcion =tableColumnGrupoOpcion.getCellEditor();

		GrupoOpcionTableCell grupoopcionTableCellFk=(GrupoOpcionTableCell)tableCellEditorGrupoOpcion;

		if(grupoopcionTableCellFk!=null) {
			grupoopcionTableCellFk.setgrupoopcionsForeignKey(grupoopcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoopcionTableCellFk.setRowActual(intSelectedRow);
			//grupoopcionTableCellFk.setgrupoopcionsForeignKeyActual(grupoopcionsForeignKey);
		//}


		if(grupoopcionTableCellFk!=null) {
			grupoopcionTableCellFk.RecargarGrupoOpcionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPerfil(List<Perfil> perfilsForeignKey)throws Exception{
		TableColumn tableColumnPerfil=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDPERFIL));
		TableCellEditor tableCellEditorPerfil =tableColumnPerfil.getCellEditor();

		PerfilTableCell perfilTableCellFk=(PerfilTableCell)tableCellEditorPerfil;

		if(perfilTableCellFk!=null) {
			perfilTableCellFk.setperfilsForeignKey(perfilsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//perfilTableCellFk.setRowActual(intSelectedRow);
			//perfilTableCellFk.setperfilsForeignKeyActual(perfilsForeignKey);
		//}


		if(perfilTableCellFk!=null) {
			perfilTableCellFk.RecargarPerfilsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaOpcion(List<Opcion> opcionsForeignKey)throws Exception{
		TableColumn tableColumnOpcion=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDOPCION));
		TableCellEditor tableCellEditorOpcion =tableColumnOpcion.getCellEditor();

		OpcionTableCell opcionTableCellFk=(OpcionTableCell)tableCellEditorOpcion;

		if(opcionTableCellFk!=null) {
			opcionTableCellFk.setopcionsForeignKey(opcionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilOpcion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//opcionTableCellFk.setRowActual(intSelectedRow);
			//opcionTableCellFk.setopcionsForeignKeyActual(opcionsForeignKey);
		//}


		if(opcionTableCellFk!=null) {
			opcionTableCellFk.RecargarOpcionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_opcion (Long id) throws Exception {
		this.setActualOpcionForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPerfilOpcion(false);
			
			//if(!this.isEsNuevoPerfilOpcion) {								
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				
			}
			
			if(this.permiteMantenimiento(this.perfilopcion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPerfilOpcion=true;
					this.inicializarActualizarBindingTablaPerfilOpcion(false);
					this.isEsNuevoPerfilOpcion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPerfilOpcion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPerfilOpcion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfilOpcion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilOpcion(false);
				
				this.habilitarDeshabilitarControlesPerfilOpcion(false);
			
												
				
				if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePerfilOpcion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPerfilOpcionActionPerformed(evt,perfilopcionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPerfilOpcion(this.perfilopcion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPerfilOpcion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,perfilopcionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.perfilopcion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				this.perfilopcion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				this.perfilopcion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.perfilopcion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PerfilOpcionModel) this.jTableDatosPerfilOpcion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPerfilOpcion=true;
				this.inicializarActualizarBindingTablaPerfilOpcion(false);
				this.isEsNuevoPerfilOpcion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfilOpcion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilOpcion(false);
				
				this.habilitarDeshabilitarControlesPerfilOpcion(false);
				
				
				
				if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePerfilOpcion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPerfilOpcion.getRowCount()>=1) {
				jTableDatosPerfilOpcion.removeRowSelectionInterval(0, jTableDatosPerfilOpcion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPerfilOpcion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPerfilOpcion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilOpcion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilOpcion(false) ;
			
			this.isEsNuevoPerfilOpcion=false;
			
			if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePerfilOpcion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPerfilOpcion(false);
				
				//SI ES MANUAL
				if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPerfilOpcion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPerfilOpcion--;			
			//PerfilOpcion perfilopcionAux= new PerfilOpcion();			
			//perfilopcionAux.setId(this.iIdNuevoPerfilOpcion);
			
			if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPerfilOpcion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
			
			this.perfilopcion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.perfilopcionLogic.getPerfilOpcions().add(this.perfilopcionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.perfilopcions.add(this.perfilopcionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPerfilOpcion(false);
			
			this.jTableDatosPerfilOpcion.setRowSelectionInterval(this.getIndiceNuevoPerfilOpcion(), this.getIndiceNuevoPerfilOpcion());
			
			int iLastRow =  this.jTableDatosPerfilOpcion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPerfilOpcion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPerfilOpcion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPerfilOpcion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPerfilOpcion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilOpcion(false);
			
			//SI ES MANUAL
			if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilOpcion();
			}
			
			//this.abrirFrameTreePerfilOpcion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Perfil OpcionES ?", "MANTENIMIENTO DE Perfil Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPerfilOpcion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPerfilOpcion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.perfilopcionReturnGeneral=perfilopcionLogic.procesarImportacionPerfilOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.perfilopcionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPerfilOpcionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPerfilOpcion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPerfilOpcion.setFileImportacion(this.jInternalFrameImportacionPerfilOpcion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPerfilOpcion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPerfilOpcion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPerfilOpcion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPerfilOpcion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		

		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PerfilOpcionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PerfilOpcionBaseDesign.jrxml";
			
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
			
			this.generarReportePerfilOpcions("Todos",perfilopcionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GrupoOpcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GrupoOpcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GrupoOpcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GrupoOpcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDPERFIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Perfil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Perfil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Perfil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Perfil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDOPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Opcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Opcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Opcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Opcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_TODO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_do_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_do_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_do_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_do_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_INGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_greso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_greso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_greso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_greso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_MODIFICACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_dificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_dificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_dificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_dificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_ELIMINACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_iminacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_iminacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_iminacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_iminacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ardarCambios_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ardarCambios_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ardarCambios_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ardarCambios_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONSULTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nsulta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nsulta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nsulta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nsulta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_squeda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_squeda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_squeda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_squeda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_REPORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_porte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_porte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_porte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_porte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ginacionMedio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ginacionMedio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ginacionMedio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ginacionMedio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ginacionAlto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ginacionAlto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ginacionAlto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ginacionAlto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ginacionTodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ginacionTodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ginacionTodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ginacionTodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_DUPLICAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_plicar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_plicar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_plicar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_plicar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_COPIAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_piar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_piar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_piar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_piar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nPrecargar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nPrecargar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nPrecargar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nPrecargar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilOpcionConstantesFunciones.LABEL_ESTADO:
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
		
		if(this.jInternalFrameReporteDinamicoPerfilOpcion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoria="id_sistema";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					sNombreCampoCategoria="id_grupo_opcion";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoria="id_perfil";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoria="id_opcion";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_TODO:
					sNombreCampoCategoria="todo";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_INGRESO:
					sNombreCampoCategoria="ingreso";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_MODIFICACION:
					sNombreCampoCategoria="modificacion";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ELIMINACION:
					sNombreCampoCategoria="eliminacion";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS:
					sNombreCampoCategoria="guardar_cambios";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONSULTA:
					sNombreCampoCategoria="consulta";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA:
					sNombreCampoCategoria="busqueda";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_REPORTE:
					sNombreCampoCategoria="reporte";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO:
					sNombreCampoCategoria="paginacion_medio";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO:
					sNombreCampoCategoria="paginacion_alto";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO:
					sNombreCampoCategoria="paginacion_todo";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_DUPLICAR:
					sNombreCampoCategoria="duplicar";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_COPIAR:
					sNombreCampoCategoria="copiar";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					sNombreCampoCategoria="con_precargar";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA:
					sNombreCampoCategoriaValor="id_sistema";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					sNombreCampoCategoriaValor="id_grupo_opcion";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoriaValor="id_perfil";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDOPCION:
					sNombreCampoCategoriaValor="id_opcion";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_TODO:
					sNombreCampoCategoriaValor="todo";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_INGRESO:
					sNombreCampoCategoriaValor="ingreso";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_MODIFICACION:
					sNombreCampoCategoriaValor="modificacion";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ELIMINACION:
					sNombreCampoCategoriaValor="eliminacion";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS:
					sNombreCampoCategoriaValor="guardar_cambios";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONSULTA:
					sNombreCampoCategoriaValor="consulta";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA:
					sNombreCampoCategoriaValor="busqueda";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_REPORTE:
					sNombreCampoCategoriaValor="reporte";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO:
					sNombreCampoCategoriaValor="paginacion_medio";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO:
					sNombreCampoCategoriaValor="paginacion_alto";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO:
					sNombreCampoCategoriaValor="paginacion_todo";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_DUPLICAR:
					sNombreCampoCategoriaValor="duplicar";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_COPIAR:
					sNombreCampoCategoriaValor="copiar";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					sNombreCampoCategoriaValor="con_precargar";
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sistema");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_grupo_opcion");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDPERFIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_perfil");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDOPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Opcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_opcion");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_TODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Todo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"todo");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_INGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_MODIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"modificacion");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ELIMINACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Eliminacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"eliminacion");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Guardar Cambios",sNombreCampoCategoria,sNombreCampoCategoriaValor,"guardar_cambios");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONSULTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Consulta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"consulta");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Busqueda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"busqueda");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_REPORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Reporte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"reporte");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Paginacion Medio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"paginacion_medio");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Paginacion Alto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"paginacion_alto");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Paginacion Todo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"paginacion_todo");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_DUPLICAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Duplicar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"duplicar");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_COPIAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Copiar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"copiar");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precargar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_precargar");
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ESTADO:
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
	
	public void jButtonGenerarExcelReporteDinamicoPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PerfilOpcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getsistema_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getgrupoopcion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDPERFIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDPERFIL);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getperfil_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_IDOPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDOPCION);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getopcion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_TODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_TODO);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.gettodo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_INGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_INGRESO);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_MODIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_MODIFICACION);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getmodificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ELIMINACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ELIMINACION);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.geteliminacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getguardar_cambios());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONSULTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_CONSULTA);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getconsulta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getbusqueda());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_REPORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_REPORTE);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getreporte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getpaginacion_medio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getpaginacion_alto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getpaginacion_todo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_DUPLICAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_DUPLICAR);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getduplicar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_COPIAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_COPIAR);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getcopiar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getcon_precargar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilOpcionConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(PerfilOpcion perfilopcion:perfilopcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilopcion.getestado());
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
			//	this.getFilaCabeceraExportarExcelPerfilOpcion(row);				
			//	iRow++;
			//}				
			
			//for(PerfilOpcion perfilopcionAux:perfilopcionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPerfilOpcion(perfilopcionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
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
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilOpcion(false);
			
			//SI ES MANUAL
			if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilOpcion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilOpcion(false);
			
			//SI ES MANUAL
			if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfilOpcion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilOpcion(false);
			
			//SI ES MANUAL
			if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfilOpcion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPerfilOpcion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPerfilOpcion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPerfilOpcion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPerfilOpcion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPerfilOpcion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPerfilOpcion.setMinimumSize(dimensionMinimum);
		this.jTableDatosPerfilOpcion.setMaximumSize(dimensionMaximum);
		this.jTableDatosPerfilOpcion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPerfilOpcion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPerfilOpcion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPerfilOpcion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPerfilOpcion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPerfilOpcion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPerfilOpcion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilOpcion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPerfilOpcion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPerfilOpcion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPerfilOpcion();
		
		this.inicializarActualizarBindingBotonesManualPerfilOpcion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPerfilOpcion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilOpcion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilOpcion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilOpcion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPerfilOpcion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPerfilOpcion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePerfilOpcion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxPostAccionNuevoPerfilOpcion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxPostAccionSinCerrarPerfilOpcion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxPostAccionSinMensajePerfilOpcion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPerfilOpcion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPerfilOpcion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePerfilOpcion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
				this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxPostAccionNuevoPerfilOpcion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxPostAccionSinCerrarPerfilOpcion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxPostAccionSinMensajePerfilOpcion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPerfilOpcion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPerfilOpcion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPerfilOpcion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPerfilOpcion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPerfilOpcion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPerfilOpcion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPerfilOpcion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPerfilOpcion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPerfilOpcion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPerfilOpcion(Boolean esInicializar) throws Exception {
		try	{	
			if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilOpcion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPerfilOpcion() throws Exception {
		try	{
			if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfilOpcion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfilOpcion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfilOpcion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPerfilOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPerfilOpcion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPerfilOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPerfilOpcion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPerfilOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPerfilOpcion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPerfilOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPerfilOpcion.addItem(reporte);
			}
			
			
			if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPerfilOpcion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPerfilOpcion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPerfilOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPerfilOpcion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPerfilOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPerfilOpcion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPerfilOpcion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPerfilOpcion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPerfilOpcion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilOpcion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilOpcion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
				this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
				this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfilOpcion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
				
				if(this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfilOpcion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPerfilOpcion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfilOpcion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfilOpcion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPerfilOpcion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()!=null){this.id_sistemaBusquedaPorIdPerfilPorIdOpcion=((Sistema)this.jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()!=null){this.id_moduloBusquedaPorIdPerfilPorIdOpcion=((Modulo)this.jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()!=null){this.id_grupo_opcionBusquedaPorIdPerfilPorIdOpcion=((GrupoOpcion)this.jComboBoxid_grupo_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()!=null){this.id_perfilBusquedaPorIdPerfilPorIdOpcion=((Perfil)this.jComboBoxid_perfilBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()!=null){this.id_opcionBusquedaPorIdPerfilPorIdOpcion=((Opcion)this.jComboBoxid_opcionBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getSelectedItem()!=null){this.id_sistemaBusquedaPorIdSisPorIdModPorIdPer=((Sistema)this.jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getSelectedItem()!=null){this.id_moduloBusquedaPorIdSisPorIdModPorIdPer=((Modulo)this.jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getSelectedItem()!=null){this.id_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer=((GrupoOpcion)this.jComboBoxid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getSelectedItem()!=null){this.id_perfilBusquedaPorIdSisPorIdModPorIdPer=((Perfil)this.jComboBoxid_perfilBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.getSelectedItem()!=null){this.id_grupo_opcionFK_IdGrupoOpcion=((GrupoOpcion)this.jComboBoxid_grupo_opcionFK_IdGrupoOpcionPerfilOpcion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPerfilOpcion(Boolean esInicializar) throws Exception {				
		if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPerfilOpcion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPerfilOpcion() throws Exception {
		this.inicializarActualizarBindingTablaPerfilOpcion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPerfilOpcion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPerfilOpcionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPerfilOpcion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=perfilopcionLogic.getPerfilOpcions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=perfilopcions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPerfilOpcion.setModel(new PerfilOpcionModel(this.perfilopcionLogic.getPerfilOpcions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPerfilOpcion.setModel(new PerfilOpcionModel(this.perfilopcions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPerfilOpcion!=null && this.jInternalFrameOrderByPerfilOpcion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPerfilOpcion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO,perfilopcionConstantesFunciones.resaltarSeleccionarPerfilOpcion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PerfilOpcionConstantesFunciones.SCLASSWEBTITULO,perfilopcionConstantesFunciones.resaltarSeleccionarPerfilOpcion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_ID));

		if(this.perfilopcionConstantesFunciones.mostraridPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.perfilopcionConstantesFunciones.resaltaridPerfilOpcion,this.perfilopcionConstantesFunciones.activaridPerfilOpcion,this,true,"idPerfilOpcion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.perfilopcionConstantesFunciones.resaltaridPerfilOpcion,this.perfilopcionConstantesFunciones.activaridPerfilOpcion,this,true,"idPerfilOpcion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA));

		if(this.perfilopcionConstantesFunciones.mostrarid_sistemaPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SistemaTableCell(this.sistemasForeignKey,this.perfilopcionConstantesFunciones.resaltarid_sistemaPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_sistemaPerfilOpcion));
			tableColumn.setCellEditor(new SistemaTableCell(this.sistemasForeignKey,this.perfilopcionConstantesFunciones.resaltarid_sistemaPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_sistemaPerfilOpcion,true,"id_sistemaPerfilOpcion","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDMODULO));

		if(this.perfilopcionConstantesFunciones.mostrarid_moduloPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.perfilopcionConstantesFunciones.resaltarid_moduloPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_moduloPerfilOpcion));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.perfilopcionConstantesFunciones.resaltarid_moduloPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_moduloPerfilOpcion,true,"id_moduloPerfilOpcion","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION));

		if(this.perfilopcionConstantesFunciones.mostrarid_grupo_opcionPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new GrupoOpcionTableCell(this.grupoopcionsForeignKey,this.perfilopcionConstantesFunciones.resaltarid_grupo_opcionPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_grupo_opcionPerfilOpcion));
			tableColumn.setCellEditor(new GrupoOpcionTableCell(this.grupoopcionsForeignKey,this.perfilopcionConstantesFunciones.resaltarid_grupo_opcionPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_grupo_opcionPerfilOpcion,true,"id_grupo_opcionPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDPERFIL));

		if(this.perfilopcionConstantesFunciones.mostrarid_perfilPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_IDPERFIL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PerfilTableCell(this.perfilsForeignKey,this.perfilopcionConstantesFunciones.resaltarid_perfilPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_perfilPerfilOpcion));
			tableColumn.setCellEditor(new PerfilTableCell(this.perfilsForeignKey,this.perfilopcionConstantesFunciones.resaltarid_perfilPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_perfilPerfilOpcion,true,"id_perfilPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_IDOPCION));

		if(this.perfilopcionConstantesFunciones.mostrarid_opcionPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_IDOPCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OpcionTableCell(this.opcionsForeignKey,this.perfilopcionConstantesFunciones.resaltarid_opcionPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_opcionPerfilOpcion));
			tableColumn.setCellEditor(new OpcionTableCell(this.opcionsForeignKey,this.perfilopcionConstantesFunciones.resaltarid_opcionPerfilOpcion,this,this.perfilopcionConstantesFunciones.activarid_opcionPerfilOpcion,true,"id_opcionPerfilOpcion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_TODO));

		if(this.perfilopcionConstantesFunciones.mostrartodoPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_TODO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltartodoPerfilOpcion,this.perfilopcionConstantesFunciones.activartodoPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltartodoPerfilOpcion,this.perfilopcionConstantesFunciones.activartodoPerfilOpcion,this,true,"todoPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_INGRESO));

		if(this.perfilopcionConstantesFunciones.mostraringresoPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_INGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltaringresoPerfilOpcion,this.perfilopcionConstantesFunciones.activaringresoPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltaringresoPerfilOpcion,this.perfilopcionConstantesFunciones.activaringresoPerfilOpcion,this,true,"ingresoPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_MODIFICACION));

		if(this.perfilopcionConstantesFunciones.mostrarmodificacionPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_MODIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarmodificacionPerfilOpcion,this.perfilopcionConstantesFunciones.activarmodificacionPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarmodificacionPerfilOpcion,this.perfilopcionConstantesFunciones.activarmodificacionPerfilOpcion,this,true,"modificacionPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_ELIMINACION));

		if(this.perfilopcionConstantesFunciones.mostrareliminacionPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_ELIMINACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltareliminacionPerfilOpcion,this.perfilopcionConstantesFunciones.activareliminacionPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltareliminacionPerfilOpcion,this.perfilopcionConstantesFunciones.activareliminacionPerfilOpcion,this,true,"eliminacionPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS));

		if(this.perfilopcionConstantesFunciones.mostrarguardar_cambiosPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarguardar_cambiosPerfilOpcion,this.perfilopcionConstantesFunciones.activarguardar_cambiosPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarguardar_cambiosPerfilOpcion,this.perfilopcionConstantesFunciones.activarguardar_cambiosPerfilOpcion,this,true,"guardar_cambiosPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_CONSULTA));

		if(this.perfilopcionConstantesFunciones.mostrarconsultaPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_CONSULTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarconsultaPerfilOpcion,this.perfilopcionConstantesFunciones.activarconsultaPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarconsultaPerfilOpcion,this.perfilopcionConstantesFunciones.activarconsultaPerfilOpcion,this,true,"consultaPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA));

		if(this.perfilopcionConstantesFunciones.mostrarbusquedaPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarbusquedaPerfilOpcion,this.perfilopcionConstantesFunciones.activarbusquedaPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarbusquedaPerfilOpcion,this.perfilopcionConstantesFunciones.activarbusquedaPerfilOpcion,this,true,"busquedaPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_REPORTE));

		if(this.perfilopcionConstantesFunciones.mostrarreportePerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_REPORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarreportePerfilOpcion,this.perfilopcionConstantesFunciones.activarreportePerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarreportePerfilOpcion,this.perfilopcionConstantesFunciones.activarreportePerfilOpcion,this,true,"reportePerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_ORDEN));

		if(this.perfilopcionConstantesFunciones.mostrarordenPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarordenPerfilOpcion,this.perfilopcionConstantesFunciones.activarordenPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarordenPerfilOpcion,this.perfilopcionConstantesFunciones.activarordenPerfilOpcion,this,true,"ordenPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO));

		if(this.perfilopcionConstantesFunciones.mostrarpaginacion_medioPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarpaginacion_medioPerfilOpcion,this.perfilopcionConstantesFunciones.activarpaginacion_medioPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarpaginacion_medioPerfilOpcion,this.perfilopcionConstantesFunciones.activarpaginacion_medioPerfilOpcion,this,true,"paginacion_medioPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO));

		if(this.perfilopcionConstantesFunciones.mostrarpaginacion_altoPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarpaginacion_altoPerfilOpcion,this.perfilopcionConstantesFunciones.activarpaginacion_altoPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarpaginacion_altoPerfilOpcion,this.perfilopcionConstantesFunciones.activarpaginacion_altoPerfilOpcion,this,true,"paginacion_altoPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO));

		if(this.perfilopcionConstantesFunciones.mostrarpaginacion_todoPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarpaginacion_todoPerfilOpcion,this.perfilopcionConstantesFunciones.activarpaginacion_todoPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarpaginacion_todoPerfilOpcion,this.perfilopcionConstantesFunciones.activarpaginacion_todoPerfilOpcion,this,true,"paginacion_todoPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_DUPLICAR));

		if(this.perfilopcionConstantesFunciones.mostrarduplicarPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_DUPLICAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarduplicarPerfilOpcion,this.perfilopcionConstantesFunciones.activarduplicarPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarduplicarPerfilOpcion,this.perfilopcionConstantesFunciones.activarduplicarPerfilOpcion,this,true,"duplicarPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_COPIAR));

		if(this.perfilopcionConstantesFunciones.mostrarcopiarPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_COPIAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarcopiarPerfilOpcion,this.perfilopcionConstantesFunciones.activarcopiarPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarcopiarPerfilOpcion,this.perfilopcionConstantesFunciones.activarcopiarPerfilOpcion,this,true,"copiarPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR));

		if(this.perfilopcionConstantesFunciones.mostrarcon_precargarPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarcon_precargarPerfilOpcion,this.perfilopcionConstantesFunciones.activarcon_precargarPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarcon_precargarPerfilOpcion,this.perfilopcionConstantesFunciones.activarcon_precargarPerfilOpcion,this,true,"con_precargarPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,PerfilOpcionConstantesFunciones.LABEL_ESTADO));

		if(this.perfilopcionConstantesFunciones.mostrarestadoPerfilOpcion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilOpcionConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilopcionConstantesFunciones.resaltarestadoPerfilOpcion,this.perfilopcionConstantesFunciones.activarestadoPerfilOpcion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilopcionConstantesFunciones.resaltarestadoPerfilOpcion,this.perfilopcionConstantesFunciones.activarestadoPerfilOpcion,this,true,"estadoPerfilOpcion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilOpcionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilopcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilopcionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfilOpcion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilopcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilopcionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfilOpcion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.perfilopcionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.perfilopcionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPerfilOpcion.addColumn(tableColumn);
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
			
			this.jTableDatosPerfilOpcion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPerfilOpcion.moveColumn(this.jTableDatosPerfilOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPerfilOpcion.moveColumn(this.jTableDatosPerfilOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPerfilOpcion.moveColumn(this.jTableDatosPerfilOpcion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPerfilOpcion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPerfilOpcion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPerfilOpcion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPerfilOpcion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPerfilOpcion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPerfilOpcion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPerfilOpcion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPerfilOpcion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=perfilopcionLogic.getPerfilOpcions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=perfilopcions.size()-1;
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
		//this.jTableDatosPerfilOpcion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPerfilOpcion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPerfilOpcion();
			
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
				
				//this.isEsNuevoPerfilOpcion=false;
					
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPerfilOpcion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfilOpcion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfilOpcion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.perfilopcion.getsType().equals("DUPLICADO")
				   || this.perfilopcion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPerfilOpcion=true;
				
				} else {
					this.isEsNuevoPerfilOpcion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
					if(this.perfilopcion.getId()>=0 && !this.perfilopcion.getIsNew()) {						
						this.isEsNuevoPerfilOpcion=false;
						
					} else {
						this.isEsNuevoPerfilOpcion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPerfilOpcion(esRelaciones);						
				
				this.seleccionarPerfilOpcion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.perfilopcion.getId()<0) {
					this.isEsNuevoPerfilOpcion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPerfilOpcion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPerfilOpcion(evt,rowIndex);
				}	
				
				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PerfilOpcion: " + this.dDif); 
					}
				}								
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPerfilOpcion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.perfilopcion)) {
					if(this.perfilopcion.getId()>0) {
						this.perfilopcion.setIsDeleted(true);
						
						this.perfilopcionsEliminados.add(this.perfilopcion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilopcionLogic.getPerfilOpcions().remove(this.perfilopcion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfilopcions.remove(this.perfilopcion);				
					}
					
					
					((PerfilOpcionModel) this.jTableDatosPerfilOpcion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilOpcion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPerfilOpcion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPerfilOpcion) {
			
			if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfilOpcion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfilOpcion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPerfilOpcion(this.perfilopcion);
				}
				
				//ARCHITECTURE
				try {
					

					//Sistema
					if(!this.perfilopcionConstantesFunciones.cargarid_sistemaPerfilOpcion || this.perfilopcionConstantesFunciones.event_dependid_sistemaPerfilOpcion) {
						//this.cargarCombosSistemasForeignKeyLista(" where id="+this.perfilopcion.getid_sistema());
									//this.inicializarActualizarBindingPerfilOpcion(false,false);
						this.sistemasForeignKey=new ArrayList<Sistema>();

						if(perfilopcion.getSistema()!=null) {
							this.sistemasForeignKey.add(perfilopcion.getSistema());
						}

						this.addItemDefectoCombosForeignKeySistema();
						this.cargarCombosFrameSistemasForeignKey("Todos");
					}
					this.setActualSistemaForeignKey(this.perfilopcion.getid_sistema(),false,"Formulario");

					//Modulo
					if(!this.perfilopcionConstantesFunciones.cargarid_moduloPerfilOpcion || this.perfilopcionConstantesFunciones.event_dependid_moduloPerfilOpcion) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.perfilopcion.getid_modulo());
									//this.inicializarActualizarBindingPerfilOpcion(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(perfilopcion.getModulo()!=null) {
							this.modulosForeignKey.add(perfilopcion.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.perfilopcion.getid_modulo(),false,"Formulario");

					//GrupoOpcion
					if(!this.perfilopcionConstantesFunciones.cargarid_grupo_opcionPerfilOpcion || this.perfilopcionConstantesFunciones.event_dependid_grupo_opcionPerfilOpcion) {
						//this.cargarCombosGrupoOpcionsForeignKeyLista(" where id="+this.perfilopcion.getid_grupo_opcion());
									//this.inicializarActualizarBindingPerfilOpcion(false,false);
						this.grupoopcionsForeignKey=new ArrayList<GrupoOpcion>();

						if(perfilopcion.getGrupoOpcion()!=null) {
							this.grupoopcionsForeignKey.add(perfilopcion.getGrupoOpcion());
						}

						this.addItemDefectoCombosForeignKeyGrupoOpcion();
						this.cargarCombosFrameGrupoOpcionsForeignKey("Todos");
					}
					this.setActualGrupoOpcionForeignKey(this.perfilopcion.getid_grupo_opcion(),false,"Formulario");

					//Perfil
					if(!this.perfilopcionConstantesFunciones.cargarid_perfilPerfilOpcion || this.perfilopcionConstantesFunciones.event_dependid_perfilPerfilOpcion) {
						//this.cargarCombosPerfilsForeignKeyLista(" where id="+this.perfilopcion.getid_perfil());
									//this.inicializarActualizarBindingPerfilOpcion(false,false);
						this.perfilsForeignKey=new ArrayList<Perfil>();

						if(perfilopcion.getPerfil()!=null) {
							this.perfilsForeignKey.add(perfilopcion.getPerfil());
						}

						this.addItemDefectoCombosForeignKeyPerfil();
						this.cargarCombosFramePerfilsForeignKey("Todos");
					}
					this.setActualPerfilForeignKey(this.perfilopcion.getid_perfil(),false,"Formulario");

					//Opcion
					if(!this.perfilopcionConstantesFunciones.cargarid_opcionPerfilOpcion || this.perfilopcionConstantesFunciones.event_dependid_opcionPerfilOpcion) {
						//this.cargarCombosOpcionsForeignKeyLista(" where id="+this.perfilopcion.getid_opcion());
									//this.inicializarActualizarBindingPerfilOpcion(false,false);
						this.opcionsForeignKey=new ArrayList<Opcion>();

						if(perfilopcion.getOpcion()!=null) {
							this.opcionsForeignKey.add(perfilopcion.getOpcion());
						}

						this.addItemDefectoCombosForeignKeyOpcion();
						this.cargarCombosFrameOpcionsForeignKey("Todos");
					}
					this.setActualOpcionForeignKey(this.perfilopcion.getid_opcion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPerfilOpcion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPerfilOpcion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilOpcion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfilOpcion(PerfilOpcion perfilopcion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPerfilOpcion(perfilopcion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfilOpcion(PerfilOpcion perfilopcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPerfilOpcion(perfilopcion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPerfilOpcion(perfilopcion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPerfilOpcion(perfilopcion);
	}
	
	public void setVariablesObjetoActualToFormularioPerfilOpcion(PerfilOpcion perfilopcion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.setText(perfilopcion.getId().toString());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.setSelected(perfilopcion.gettodo());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.setSelected(perfilopcion.getingreso());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.setSelected(perfilopcion.getmodificacion());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.setSelected(perfilopcion.geteliminacion());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.setSelected(perfilopcion.getguardar_cambios());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.setSelected(perfilopcion.getconsulta());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.setSelected(perfilopcion.getbusqueda());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.setSelected(perfilopcion.getreporte());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.setSelected(perfilopcion.getorden());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.setSelected(perfilopcion.getpaginacion_medio());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.setSelected(perfilopcion.getpaginacion_alto());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.setSelected(perfilopcion.getpaginacion_todo());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.setSelected(perfilopcion.getduplicar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.setSelected(perfilopcion.getcopiar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.setSelected(perfilopcion.getcon_precargar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.setSelected(perfilopcion.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PerfilOpcion perfilopcionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,perfilopcionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PerfilOpcion perfilopcionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				perfilopcionLocal=this.perfilopcion;
			} else {
				perfilopcionLocal=this.perfilopcionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(perfilopcionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPerfilOpcion(perfilopcionLocal,true);
					
					if(perfilopcionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(perfilopcionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(perfilopcionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPerfilOpcion(PerfilOpcion perfilopcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfilOpcion(perfilopcion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(perfilopcion);
	}
	
	public void setVariablesFormularioToObjetoActualPerfilOpcion(PerfilOpcion perfilopcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfilOpcion(perfilopcion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPerfilOpcion(PerfilOpcion perfilopcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.getText()==null || this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.getText()=="" || this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.getText()=="Id") {
				this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.setText("0");
			}

			if(conColumnasBase) {perfilopcion.setId(Long.parseLong(this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelIdPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.settodo(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_TODO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabeltodoPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setingreso(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_INGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelingresoPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setmodificacion(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_MODIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelmodificacionPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.seteliminacion(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_ELIMINACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabeleliminacionPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setguardar_cambios(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelguardar_cambiosPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setconsulta(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_CONSULTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelconsultaPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setbusqueda(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelbusquedaPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setreporte(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_REPORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelreportePerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setorden(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelordenPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setpaginacion_medio(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_medioPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setpaginacion_alto(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_altoPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setpaginacion_todo(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelpaginacion_todoPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setduplicar(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_DUPLICAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelduplicarPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setcopiar(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_COPIAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelcopiarPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setcon_precargar(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelcon_precargarPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilopcion.setestado(this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilOpcionConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilOpcion.jLabelestadoPerfilOpcion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfilOpcion(PerfilOpcion perfilopcionBean,PerfilOpcion perfilopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && perfilopcionBean.getid_sistema()!=null && !perfilopcionBean.getid_sistema().equals(-1L))) {perfilopcion.setid_sistema(perfilopcionBean.getid_sistema());}
			if(conDefault || (!conDefault && perfilopcionBean.getid_modulo()!=null && !perfilopcionBean.getid_modulo().equals(-1L))) {perfilopcion.setid_modulo(perfilopcionBean.getid_modulo());}
			if(conDefault || (!conDefault && perfilopcionBean.getid_grupo_opcion()!=null && !perfilopcionBean.getid_grupo_opcion().equals(null))) {perfilopcion.setid_grupo_opcion(perfilopcionBean.getid_grupo_opcion());}
			if(conDefault || (!conDefault && perfilopcionBean.getid_perfil()!=null && !perfilopcionBean.getid_perfil().equals(-1L))) {perfilopcion.setid_perfil(perfilopcionBean.getid_perfil());}
			if(conDefault || (!conDefault && perfilopcionBean.getid_opcion()!=null && !perfilopcionBean.getid_opcion().equals(-1L))) {perfilopcion.setid_opcion(perfilopcionBean.getid_opcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPerfilOpcion(PerfilOpcion perfilopcionOrigen,PerfilOpcion perfilopcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilopcionOrigen.getId()!=null && !perfilopcionOrigen.getId().equals(0L))) {perfilopcion.setId(perfilopcionOrigen.getId());}}
			if(conDefault || (!conDefault && perfilopcionOrigen.getid_sistema()!=null && !perfilopcionOrigen.getid_sistema().equals(-1L))) {perfilopcion.setid_sistema(perfilopcionOrigen.getid_sistema());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getid_modulo()!=null && !perfilopcionOrigen.getid_modulo().equals(-1L))) {perfilopcion.setid_modulo(perfilopcionOrigen.getid_modulo());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getid_grupo_opcion()!=null && !perfilopcionOrigen.getid_grupo_opcion().equals(null))) {perfilopcion.setid_grupo_opcion(perfilopcionOrigen.getid_grupo_opcion());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getid_perfil()!=null && !perfilopcionOrigen.getid_perfil().equals(-1L))) {perfilopcion.setid_perfil(perfilopcionOrigen.getid_perfil());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getid_opcion()!=null && !perfilopcionOrigen.getid_opcion().equals(-1L))) {perfilopcion.setid_opcion(perfilopcionOrigen.getid_opcion());}
			if(conDefault || (!conDefault && perfilopcionOrigen.gettodo()!=null && !perfilopcionOrigen.gettodo().equals(false))) {perfilopcion.settodo(perfilopcionOrigen.gettodo());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getingreso()!=null && !perfilopcionOrigen.getingreso().equals(false))) {perfilopcion.setingreso(perfilopcionOrigen.getingreso());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getmodificacion()!=null && !perfilopcionOrigen.getmodificacion().equals(false))) {perfilopcion.setmodificacion(perfilopcionOrigen.getmodificacion());}
			if(conDefault || (!conDefault && perfilopcionOrigen.geteliminacion()!=null && !perfilopcionOrigen.geteliminacion().equals(false))) {perfilopcion.seteliminacion(perfilopcionOrigen.geteliminacion());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getguardar_cambios()!=null && !perfilopcionOrigen.getguardar_cambios().equals(false))) {perfilopcion.setguardar_cambios(perfilopcionOrigen.getguardar_cambios());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getconsulta()!=null && !perfilopcionOrigen.getconsulta().equals(false))) {perfilopcion.setconsulta(perfilopcionOrigen.getconsulta());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getbusqueda()!=null && !perfilopcionOrigen.getbusqueda().equals(false))) {perfilopcion.setbusqueda(perfilopcionOrigen.getbusqueda());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getreporte()!=null && !perfilopcionOrigen.getreporte().equals(false))) {perfilopcion.setreporte(perfilopcionOrigen.getreporte());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getorden()!=null && !perfilopcionOrigen.getorden().equals(false))) {perfilopcion.setorden(perfilopcionOrigen.getorden());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getpaginacion_medio()!=null && !perfilopcionOrigen.getpaginacion_medio().equals(false))) {perfilopcion.setpaginacion_medio(perfilopcionOrigen.getpaginacion_medio());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getpaginacion_alto()!=null && !perfilopcionOrigen.getpaginacion_alto().equals(false))) {perfilopcion.setpaginacion_alto(perfilopcionOrigen.getpaginacion_alto());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getpaginacion_todo()!=null && !perfilopcionOrigen.getpaginacion_todo().equals(false))) {perfilopcion.setpaginacion_todo(perfilopcionOrigen.getpaginacion_todo());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getduplicar()!=null && !perfilopcionOrigen.getduplicar().equals(false))) {perfilopcion.setduplicar(perfilopcionOrigen.getduplicar());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getcopiar()!=null && !perfilopcionOrigen.getcopiar().equals(false))) {perfilopcion.setcopiar(perfilopcionOrigen.getcopiar());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getcon_precargar()!=null && !perfilopcionOrigen.getcon_precargar().equals(false))) {perfilopcion.setcon_precargar(perfilopcionOrigen.getcon_precargar());}
			if(conDefault || (!conDefault && perfilopcionOrigen.getestado()!=null && !perfilopcionOrigen.getestado().equals(false))) {perfilopcion.setestado(perfilopcionOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfilOpcion(PerfilOpcion perfilopcion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.setText(perfilopcion.getId().toString());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.setSelected(perfilopcion.gettodo());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.setSelected(perfilopcion.getingreso());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.setSelected(perfilopcion.getmodificacion());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.setSelected(perfilopcion.geteliminacion());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.setSelected(perfilopcion.getguardar_cambios());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.setSelected(perfilopcion.getconsulta());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.setSelected(perfilopcion.getbusqueda());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.setSelected(perfilopcion.getreporte());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.setSelected(perfilopcion.getorden());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.setSelected(perfilopcion.getpaginacion_medio());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.setSelected(perfilopcion.getpaginacion_alto());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.setSelected(perfilopcion.getpaginacion_todo());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.setSelected(perfilopcion.getduplicar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.setSelected(perfilopcion.getcopiar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.setSelected(perfilopcion.getcon_precargar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.setSelected(perfilopcion.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfilOpcion(PerfilOpcionBean perfilopcionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.setText(perfilopcionBean.getId().toString());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.setSelected(perfilopcionBean.gettodo());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.setSelected(perfilopcionBean.getingreso());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.setSelected(perfilopcionBean.getmodificacion());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.setSelected(perfilopcionBean.geteliminacion());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.setSelected(perfilopcionBean.getguardar_cambios());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.setSelected(perfilopcionBean.getconsulta());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.setSelected(perfilopcionBean.getbusqueda());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.setSelected(perfilopcionBean.getreporte());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.setSelected(perfilopcionBean.getorden());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.setSelected(perfilopcionBean.getpaginacion_medio());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.setSelected(perfilopcionBean.getpaginacion_alto());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.setSelected(perfilopcionBean.getpaginacion_todo());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.setSelected(perfilopcionBean.getduplicar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.setSelected(perfilopcionBean.getcopiar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.setSelected(perfilopcionBean.getcon_precargar());
			this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.setSelected(perfilopcionBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPerfilOpcion(PerfilOpcionParameterReturnGeneral perfilopcionReturnGeneral,PerfilOpcionBean perfilopcionBean,Boolean conDefault) throws Exception { 
		try {
			PerfilOpcion perfilopcionLocal=new PerfilOpcion();
			
			perfilopcionLocal=perfilopcionReturnGeneral.getPerfilOpcion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilopcionLocal.getId()!=null && !perfilopcionLocal.getId().equals(0L))) {perfilopcionBean.setId(perfilopcionLocal.getId());}}
			if(conDefault || (!conDefault && perfilopcionLocal.getid_sistema()!=null && !perfilopcionLocal.getid_sistema().equals(-1L))) {perfilopcionBean.setid_sistema(perfilopcionLocal.getid_sistema());}
			if(conDefault || (!conDefault && perfilopcionLocal.getid_modulo()!=null && !perfilopcionLocal.getid_modulo().equals(-1L))) {perfilopcionBean.setid_modulo(perfilopcionLocal.getid_modulo());}
			if(conDefault || (!conDefault && perfilopcionLocal.getid_grupo_opcion()!=null && !perfilopcionLocal.getid_grupo_opcion().equals(null))) {perfilopcionBean.setid_grupo_opcion(perfilopcionLocal.getid_grupo_opcion());}
			if(conDefault || (!conDefault && perfilopcionLocal.getid_perfil()!=null && !perfilopcionLocal.getid_perfil().equals(-1L))) {perfilopcionBean.setid_perfil(perfilopcionLocal.getid_perfil());}
			if(conDefault || (!conDefault && perfilopcionLocal.getid_opcion()!=null && !perfilopcionLocal.getid_opcion().equals(-1L))) {perfilopcionBean.setid_opcion(perfilopcionLocal.getid_opcion());}
			if(conDefault || (!conDefault && perfilopcionLocal.gettodo()!=null && !perfilopcionLocal.gettodo().equals(false))) {perfilopcionBean.settodo(perfilopcionLocal.gettodo());}
			if(conDefault || (!conDefault && perfilopcionLocal.getingreso()!=null && !perfilopcionLocal.getingreso().equals(false))) {perfilopcionBean.setingreso(perfilopcionLocal.getingreso());}
			if(conDefault || (!conDefault && perfilopcionLocal.getmodificacion()!=null && !perfilopcionLocal.getmodificacion().equals(false))) {perfilopcionBean.setmodificacion(perfilopcionLocal.getmodificacion());}
			if(conDefault || (!conDefault && perfilopcionLocal.geteliminacion()!=null && !perfilopcionLocal.geteliminacion().equals(false))) {perfilopcionBean.seteliminacion(perfilopcionLocal.geteliminacion());}
			if(conDefault || (!conDefault && perfilopcionLocal.getguardar_cambios()!=null && !perfilopcionLocal.getguardar_cambios().equals(false))) {perfilopcionBean.setguardar_cambios(perfilopcionLocal.getguardar_cambios());}
			if(conDefault || (!conDefault && perfilopcionLocal.getconsulta()!=null && !perfilopcionLocal.getconsulta().equals(false))) {perfilopcionBean.setconsulta(perfilopcionLocal.getconsulta());}
			if(conDefault || (!conDefault && perfilopcionLocal.getbusqueda()!=null && !perfilopcionLocal.getbusqueda().equals(false))) {perfilopcionBean.setbusqueda(perfilopcionLocal.getbusqueda());}
			if(conDefault || (!conDefault && perfilopcionLocal.getreporte()!=null && !perfilopcionLocal.getreporte().equals(false))) {perfilopcionBean.setreporte(perfilopcionLocal.getreporte());}
			if(conDefault || (!conDefault && perfilopcionLocal.getorden()!=null && !perfilopcionLocal.getorden().equals(false))) {perfilopcionBean.setorden(perfilopcionLocal.getorden());}
			if(conDefault || (!conDefault && perfilopcionLocal.getpaginacion_medio()!=null && !perfilopcionLocal.getpaginacion_medio().equals(false))) {perfilopcionBean.setpaginacion_medio(perfilopcionLocal.getpaginacion_medio());}
			if(conDefault || (!conDefault && perfilopcionLocal.getpaginacion_alto()!=null && !perfilopcionLocal.getpaginacion_alto().equals(false))) {perfilopcionBean.setpaginacion_alto(perfilopcionLocal.getpaginacion_alto());}
			if(conDefault || (!conDefault && perfilopcionLocal.getpaginacion_todo()!=null && !perfilopcionLocal.getpaginacion_todo().equals(false))) {perfilopcionBean.setpaginacion_todo(perfilopcionLocal.getpaginacion_todo());}
			if(conDefault || (!conDefault && perfilopcionLocal.getduplicar()!=null && !perfilopcionLocal.getduplicar().equals(false))) {perfilopcionBean.setduplicar(perfilopcionLocal.getduplicar());}
			if(conDefault || (!conDefault && perfilopcionLocal.getcopiar()!=null && !perfilopcionLocal.getcopiar().equals(false))) {perfilopcionBean.setcopiar(perfilopcionLocal.getcopiar());}
			if(conDefault || (!conDefault && perfilopcionLocal.getcon_precargar()!=null && !perfilopcionLocal.getcon_precargar().equals(false))) {perfilopcionBean.setcon_precargar(perfilopcionLocal.getcon_precargar());}
			if(conDefault || (!conDefault && perfilopcionLocal.getestado()!=null && !perfilopcionLocal.getestado().equals(false))) {perfilopcionBean.setestado(perfilopcionLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPerfilOpcionGenerico(Long idPerfilOpcionSeleccionado,JComboBox jComboBoxPerfilOpcion,List<PerfilOpcion> perfilopcionsLocal)throws Exception {
		try {
			PerfilOpcion  perfilopcionTemp=null;

			for(PerfilOpcion perfilopcionAux:perfilopcionsLocal) {
				if(perfilopcionAux.getId()!=null && perfilopcionAux.getId().equals(idPerfilOpcionSeleccionado)) {
					perfilopcionTemp=perfilopcionAux;
					break;
				}
			}

			jComboBoxPerfilOpcion.setSelectedItem(perfilopcionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPerfilOpcionGenerico(JComboBox jComboBoxPerfilOpcion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilOpcion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPerfilOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilOpcion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPerfilOpcion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPerfilOpcion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPerfilOpcion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilopcion=(PerfilOpcion) perfilopcionLogic.getPerfilOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilopcion =(PerfilOpcion) perfilopcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Sistema")) {
			//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
			if(!perfilopcion.getIsNew() && !perfilopcion.getIsChanged() && !perfilopcion.getIsDeleted()) {
				sDescripcion=perfilopcion.getsistema_descripcion();
			} else {
				//sDescripcion=this.getActualSistemaForeignKeyDescripcion((Long)value);
				sDescripcion=perfilopcion.getsistema_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!perfilopcion.getIsNew() && !perfilopcion.getIsChanged() && !perfilopcion.getIsDeleted()) {
				sDescripcion=perfilopcion.getmodulo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=perfilopcion.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("GrupoOpcion")) {
			//sDescripcion=this.getActualGrupoOpcionForeignKeyDescripcion((Long)value);
			if(!perfilopcion.getIsNew() && !perfilopcion.getIsChanged() && !perfilopcion.getIsDeleted()) {
				sDescripcion=perfilopcion.getgrupoopcion_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=perfilopcion.getgrupoopcion_descripcion();
			}
		}

		if(sTipo.equals("Perfil")) {
			//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
			if(!perfilopcion.getIsNew() && !perfilopcion.getIsChanged() && !perfilopcion.getIsDeleted()) {
				sDescripcion=perfilopcion.getperfil_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=perfilopcion.getperfil_descripcion();
			}
		}

		if(sTipo.equals("Opcion")) {
			//sDescripcion=this.getActualOpcionForeignKeyDescripcion((Long)value);
			if(!perfilopcion.getIsNew() && !perfilopcion.getIsChanged() && !perfilopcion.getIsDeleted()) {
				sDescripcion=perfilopcion.getopcion_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=perfilopcion.getopcion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PerfilOpcion perfilopcionRow=new PerfilOpcion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilopcionRow=(PerfilOpcion) perfilopcionLogic.getPerfilOpcions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilopcionRow=(PerfilOpcion) perfilopcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPerfilOpcion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoPerfilOpcion && this.isPermisoNuevoPerfilOpcion));			
			this.jButtonDuplicarPerfilOpcion.setVisible((this.isVisibilidadCeldaDuplicarPerfilOpcion && this.isPermisoDuplicarPerfilOpcion));			
			this.jButtonCopiarPerfilOpcion.setVisible((this.isVisibilidadCeldaCopiarPerfilOpcion && this.isPermisoCopiarPerfilOpcion));
			this.jButtonVerFormPerfilOpcion.setVisible((this.isVisibilidadCeldaVerFormPerfilOpcion && this.isPermisoVerFormPerfilOpcion));
			
			this.jButtonAbrirOrderByPerfilOpcion.setVisible((this.isVisibilidadCeldaOrdenPerfilOpcion && this.isPermisoOrdenPerfilOpcion));			
			
			this.jButtonNuevoRelacionesPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion && this.isPermisoNuevoPerfilOpcion));			
			this.jButtonNuevoGuardarCambiosPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoPerfilOpcion && this.isPermisoNuevoPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));
			
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarPerfilOpcion.setVisible((this.isVisibilidadCeldaModificarPerfilOpcion && this.isPermisoActualizarPerfilOpcion));	
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarPerfilOpcion.setVisible((this.isVisibilidadCeldaActualizarPerfilOpcion && this.isPermisoActualizarPerfilOpcion));	
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarPerfilOpcion.setVisible((this.isVisibilidadCeldaEliminarPerfilOpcion && this.isPermisoEliminarPerfilOpcion));
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarPerfilOpcion.setVisible(this.isVisibilidadCeldaCancelarPerfilOpcion);							
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosPerfilOpcion.setVisible((this.isVisibilidadCeldaGuardarPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));			
			
			}
						
			this.jButtonGuardarCambiosTablaPerfilOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoPerfilOpcion && this.isPermisoNuevoPerfilOpcion));						
			this.jButtonDuplicarToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaDuplicarPerfilOpcion && this.isPermisoDuplicarPerfilOpcion));						
			this.jButtonCopiarToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaCopiarPerfilOpcion && this.isPermisoCopiarPerfilOpcion));			
			this.jButtonVerFormToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaVerFormPerfilOpcion && this.isPermisoVerFormPerfilOpcion));			
			this.jButtonAbrirOrderByToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaOrdenPerfilOpcion && this.isPermisoOrdenPerfilOpcion));
			this.jButtonNuevoRelacionesToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion && this.isPermisoNuevoPerfilOpcion));			
			this.jButtonNuevoGuardarCambiosToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoPerfilOpcion && this.isPermisoNuevoPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));			
			
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaModificarPerfilOpcion && this.isPermisoActualizarPerfilOpcion));	
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaActualizarPerfilOpcion  && this.isPermisoActualizarPerfilOpcion));	
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaEliminarPerfilOpcion && this.isPermisoEliminarPerfilOpcion));
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarToolBarPerfilOpcion.setVisible(this.isVisibilidadCeldaCancelarPerfilOpcion);				
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaGuardarPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPerfilOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoPerfilOpcion && this.isPermisoNuevoPerfilOpcion));			
			this.jMenuItemDuplicarPerfilOpcion.setVisible((this.isVisibilidadCeldaDuplicarPerfilOpcion && this.isPermisoDuplicarPerfilOpcion));			
			this.jMenuItemCopiarPerfilOpcion.setVisible((this.isVisibilidadCeldaCopiarPerfilOpcion && this.isPermisoCopiarPerfilOpcion));			
			this.jMenuItemVerFormPerfilOpcion.setVisible((this.isVisibilidadCeldaVerFormPerfilOpcion && this.isPermisoVerFormPerfilOpcion));			
			this.jMenuItemAbrirOrderByPerfilOpcion.setVisible((this.isVisibilidadCeldaOrdenPerfilOpcion && this.isPermisoOrdenPerfilOpcion));			
			//this.jMenuItemMostrarOcultarPerfilOpcion.setVisible((this.isVisibilidadCeldaOrdenPerfilOpcion && this.isPermisoOrdenPerfilOpcion));
			this.jMenuItemDetalleAbrirOrderByPerfilOpcion.setVisible((this.isVisibilidadCeldaOrdenPerfilOpcion && this.isPermisoOrdenPerfilOpcion));			
			//this.jMenuItemDetalleMostrarOcultarPerfilOpcion.setVisible((this.isVisibilidadCeldaOrdenPerfilOpcion && this.isPermisoOrdenPerfilOpcion));			
			this.jMenuItemNuevoRelacionesPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion && this.isPermisoNuevoPerfilOpcion));			
			this.jMenuItemNuevoGuardarCambiosPerfilOpcion.setVisible((this.isVisibilidadCeldaNuevoPerfilOpcion && this.isPermisoNuevoPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));									
			
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemModificarPerfilOpcion.setVisible((this.isVisibilidadCeldaModificarPerfilOpcion && this.isPermisoActualizarPerfilOpcion));	
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemActualizarPerfilOpcion.setVisible((this.isVisibilidadCeldaActualizarPerfilOpcion && this.isPermisoActualizarPerfilOpcion));	
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemEliminarPerfilOpcion.setVisible((this.isVisibilidadCeldaEliminarPerfilOpcion && this.isPermisoEliminarPerfilOpcion));
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemCancelarPerfilOpcion.setVisible(this.isVisibilidadCeldaCancelarPerfilOpcion);				
			}
			
			this.jMenuItemGuardarCambiosPerfilOpcion.setVisible((this.isVisibilidadCeldaGuardarPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));						
			this.jMenuItemGuardarCambiosTablaPerfilOpcion.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPerfilOpcion=this.jButtonNuevoPerfilOpcion.isVisible();
			this.isVisibilidadCeldaDuplicarPerfilOpcion=this.jButtonDuplicarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaCopiarPerfilOpcion=this.jButtonCopiarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaVerFormPerfilOpcion=this.jButtonVerFormPerfilOpcion.isVisible();
			
			this.isVisibilidadCeldaOrdenPerfilOpcion=this.jButtonAbrirOrderByPerfilOpcion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=this.jButtonNuevoRelacionesPerfilOpcion.isVisible();
			this.isVisibilidadCeldaModificarPerfilOpcion=this.jButtonModificarPerfilOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			this.isVisibilidadCeldaActualizarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaEliminarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaCancelarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaGuardarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosPerfilOpcion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=this.jButtonGuardarCambiosTablaPerfilOpcion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPerfilOpcion=this.jButtonNuevoToolBarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=this.jButtonNuevoRelacionesToolBarPerfilOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			this.isVisibilidadCeldaModificarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarToolBarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaActualizarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarToolBarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaEliminarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarToolBarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaCancelarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarToolBarPerfilOpcion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfilOpcion=this.jButtonGuardarCambiosToolBarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=this.jButtonGuardarCambiosTablaToolBarPerfilOpcion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPerfilOpcion=this.jMenuItemNuevoPerfilOpcion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=this.jMenuItemNuevoRelacionesPerfilOpcion.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			this.isVisibilidadCeldaModificarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemModificarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaActualizarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemActualizarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaEliminarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemEliminarPerfilOpcion.isVisible();
			this.isVisibilidadCeldaCancelarPerfilOpcion=this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemCancelarPerfilOpcion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfilOpcion=this.jMenuItemGuardarCambiosPerfilOpcion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=this.jMenuItemGuardarCambiosTablaPerfilOpcion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPerfilOpcion(Boolean esInicializar) {
		if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
				//if(this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPerfilOpcion();
			}
			
			this.inicializarActualizarBindingBotonesManualPerfilOpcion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPerfilOpcion() {
		this.jButtonNuevoPerfilOpcion.setVisible(this.isPermisoNuevoPerfilOpcion);			
		this.jButtonDuplicarPerfilOpcion.setVisible(this.isPermisoDuplicarPerfilOpcion);			
		this.jButtonCopiarPerfilOpcion.setVisible(this.isPermisoCopiarPerfilOpcion);			
		this.jButtonVerFormPerfilOpcion.setVisible(this.isPermisoVerFormPerfilOpcion);			
		
		this.jButtonAbrirOrderByPerfilOpcion.setVisible(this.isPermisoOrdenPerfilOpcion);					
		
		this.jButtonNuevoRelacionesPerfilOpcion.setVisible(this.isPermisoNuevoPerfilOpcion);			
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarPerfilOpcion.setVisible(this.isPermisoActualizarPerfilOpcion);	
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarPerfilOpcion.setVisible(this.isPermisoActualizarPerfilOpcion);	
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarPerfilOpcion.setVisible(this.isPermisoEliminarPerfilOpcion);
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarPerfilOpcion.setVisible(this.isVisibilidadCeldaCancelarPerfilOpcion);						
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosPerfilOpcion.setVisible(this.isPermisoGuardarCambiosPerfilOpcion);							
		}
		
		this.jButtonGuardarCambiosTablaPerfilOpcion.setVisible(this.isPermisoActualizarPerfilOpcion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePerfilOpcion() {
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarPerfilOpcion.setVisible(this.isPermisoActualizarPerfilOpcion);	
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarPerfilOpcion.setVisible(this.isPermisoActualizarPerfilOpcion);	
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarPerfilOpcion.setVisible(this.isPermisoEliminarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarPerfilOpcion.setVisible(this.isVisibilidadCeldaCancelarPerfilOpcion);							
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosPerfilOpcion.setVisible((this.isVisibilidadCeldaGuardarPerfilOpcion && this.isPermisoGuardarCambiosPerfilOpcion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPerfilOpcion() {
		if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPerfilOpcion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPerfilOpcion() {
	}
	
	public void jTableDatosPerfilOpcionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPerfilOpcion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.perfilopcion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sistemaPerfilOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosistema=true;

			idTienePermisosistema=this.tienePermisosUsuarioEnPaginaWebPerfilOpcion(SistemaConstantesFunciones.CLASSNAME);

			if(idTienePermisosistema) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);

				this.sistemaBeanSwingJInternalFrame=new SistemaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sistemaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sistemaBeanSwingJInternalFrame.getSistemaLogic().setConnexion(this.perfilopcionLogic.getConnexion());

				if(this.perfilopcion.getid_sistema()!=null) {
					this.sistemaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sistemaBeanSwingJInternalFrame.setIdActual(this.perfilopcion.getid_sistema());
					this.sistemaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sistemaBeanSwingJInternalFrame.inicializarActualizarBindingTablaSistema();
				}

				JInternalFrameBase jinternalFrame =this.sistemaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilOpcion=(TitledBorder)this.jScrollPanelDatosPerfilOpcion.getBorder();
				TitledBorder titledBordersistema=(TitledBorder)this.sistemaBeanSwingJInternalFrame.jScrollPanelDatosSistema.getBorder();

				titledBordersistema.setTitle(titledBorderPerfilOpcion.getTitle() + " -> Sistema");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sistemaPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getid_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sistema = "+this.perfilopcion.getid_sistema().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloPerfilOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebPerfilOpcion(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.perfilopcionLogic.getConnexion());

				if(this.perfilopcion.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.perfilopcion.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilOpcion=(TitledBorder)this.jScrollPanelDatosPerfilOpcion.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderPerfilOpcion.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.perfilopcion.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_opcionPerfilOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupoopcion=true;

			idTienePermisogrupoopcion=this.tienePermisosUsuarioEnPaginaWebPerfilOpcion(GrupoOpcionConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);

				this.grupoopcionBeanSwingJInternalFrame=new GrupoOpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoopcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoopcionBeanSwingJInternalFrame.getGrupoOpcionLogic().setConnexion(this.perfilopcionLogic.getConnexion());

				if(this.perfilopcion.getid_grupo_opcion()!=null) {
					this.grupoopcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoopcionBeanSwingJInternalFrame.setIdActual(this.perfilopcion.getid_grupo_opcion());
					this.grupoopcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoopcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoopcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoOpcion();
				}

				JInternalFrameBase jinternalFrame =this.grupoopcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilOpcion=(TitledBorder)this.jScrollPanelDatosPerfilOpcion.getBorder();
				TitledBorder titledBordergrupoopcion=(TitledBorder)this.grupoopcionBeanSwingJInternalFrame.jScrollPanelDatosGrupoOpcion.getBorder();

				titledBordergrupoopcion.setTitle(titledBorderPerfilOpcion.getTitle() + " -> Grupo Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_opcionPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getid_grupo_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_opcion = "+this.perfilopcion.getid_grupo_opcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_perfilPerfilOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperfil=true;

			idTienePermisoperfil=this.tienePermisosUsuarioEnPaginaWebPerfilOpcion(PerfilConstantesFunciones.CLASSNAME);

			if(idTienePermisoperfil) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);

				this.perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.perfilBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.perfilBeanSwingJInternalFrame.getPerfilLogic().setConnexion(this.perfilopcionLogic.getConnexion());

				if(this.perfilopcion.getid_perfil()!=null) {
					this.perfilBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.perfilBeanSwingJInternalFrame.setIdActual(this.perfilopcion.getid_perfil());
					this.perfilBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfil();
				}

				JInternalFrameBase jinternalFrame =this.perfilBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilOpcion=(TitledBorder)this.jScrollPanelDatosPerfilOpcion.getBorder();
				TitledBorder titledBorderperfil=(TitledBorder)this.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getBorder();

				titledBorderperfil.setTitle(titledBorderPerfilOpcion.getTitle() + " -> Perfil");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_perfilPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getid_perfil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_perfil = "+this.perfilopcion.getid_perfil().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_opcionPerfilOpcionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPerfilOpcion=null;
			TitledBorder titledBorderopcion=null;

			if(!this.jScrollPanelDatosPerfilOpcion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPerfilOpcion=(TitledBorder)this.jScrollPanelDatosPerfilOpcion.getBorder();
				titledBorderopcion=(TitledBorder)this.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

				titledBorderopcion.setTitle(titledBorderPerfilOpcion.getTitle() + " -> Opcion");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_opcionPerfilOpcionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoopcion=true;

			idTienePermisoopcion=this.tienePermisosUsuarioEnPaginaWebPerfilOpcion(OpcionConstantesFunciones.CLASSNAME);

			if(idTienePermisoopcion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilOpcion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilOpcion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);

				this.opcionBeanSwingJInternalFrame=new OpcionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.opcionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.opcionBeanSwingJInternalFrame.getOpcionLogic().setConnexion(this.perfilopcionLogic.getConnexion());

				if(this.perfilopcion.getid_opcion()!=null) {
					this.opcionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.opcionBeanSwingJInternalFrame.setIdActual(this.perfilopcion.getid_opcion());
					this.opcionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.opcionBeanSwingJInternalFrame.inicializarActualizarBindingTablaOpcion();
				}

				JInternalFrameBase jinternalFrame =this.opcionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilOpcion=(TitledBorder)this.jScrollPanelDatosPerfilOpcion.getBorder();
				TitledBorder titledBorderopcion=(TitledBorder)this.opcionBeanSwingJInternalFrame.jScrollPanelDatosOpcion.getBorder();

				titledBorderopcion.setTitle(titledBorderPerfilOpcion.getTitle() + " -> Opcion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_opcionPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getid_opcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_opcion = "+this.perfilopcion.getid_opcion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontodoPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.gettodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where todo = "+this.perfilopcion.gettodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningresoPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso = "+this.perfilopcion.getingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmodificacionPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getmodificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where modificacion = "+this.perfilopcion.getmodificacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoneliminacionPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.geteliminacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where eliminacion = "+this.perfilopcion.geteliminacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonguardar_cambiosPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getguardar_cambios()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where guardar_cambios = "+this.perfilopcion.getguardar_cambios().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonconsultaPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getconsulta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where consulta = "+this.perfilopcion.getconsulta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbusquedaPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getbusqueda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where busqueda = "+this.perfilopcion.getbusqueda().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonreportePerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getreporte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where reporte = "+this.perfilopcion.getreporte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.perfilopcion.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpaginacion_medioPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getpaginacion_medio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where paginacion_medio = "+this.perfilopcion.getpaginacion_medio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpaginacion_altoPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getpaginacion_alto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where paginacion_alto = "+this.perfilopcion.getpaginacion_alto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpaginacion_todoPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getpaginacion_todo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where paginacion_todo = "+this.perfilopcion.getpaginacion_todo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonduplicarPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getduplicar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where duplicar = "+this.perfilopcion.getduplicar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncopiarPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getcopiar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where copiar = "+this.perfilopcion.getcopiar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_precargarPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getcon_precargar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_precargar = "+this.perfilopcion.getcon_precargar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoPerfilOpcionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.getperfilopcion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilopcion==null) {
						this.perfilopcion = new PerfilOpcion();
					}

					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);
				}

				if(this.perfilopcion.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.perfilopcion.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilOpcion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilOpcion(false,false);

			this.getPerfilOpcionsBusquedaPorIdPerfilPorIdOpcion();

			this.inicializarActualizarBindingPerfilOpcion(false);

			//if(PerfilOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilOpcion(false,false);

			this.getPerfilOpcionsBusquedaPorIdSisPorIdModPorIdPer();

			this.inicializarActualizarBindingPerfilOpcion(false);

			//if(PerfilOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoOpcionPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilOpcion(false,false);

			this.getPerfilOpcionsFK_IdGrupoOpcion();

			this.inicializarActualizarBindingPerfilOpcion(false);

			//if(PerfilOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilOpcion(false,false);

			this.getPerfilOpcionsFK_IdModulo();

			this.inicializarActualizarBindingPerfilOpcion(false);

			//if(PerfilOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdOpcionPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilOpcion(false,false);

			this.getPerfilOpcionsFK_IdOpcion();

			this.inicializarActualizarBindingPerfilOpcion(false);

			//if(PerfilOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPerfilPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilOpcion(false,false);

			this.getPerfilOpcionsFK_IdPerfil();

			this.inicializarActualizarBindingPerfilOpcion(false);

			//if(PerfilOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSistemaPerfilOpcionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilOpcion(false,false);

			this.getPerfilOpcionsFK_IdSistema();

			this.inicializarActualizarBindingPerfilOpcion(false);

			//if(PerfilOpcionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilOpcion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilopcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePerfilOpcion() {
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
			this.jInternalFrameDetalleFormPerfilOpcion.setVisible(false);	    			
			this.jInternalFrameDetalleFormPerfilOpcion.dispose();
			this.jInternalFrameDetalleFormPerfilOpcion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
			this.jInternalFrameReporteDinamicoPerfilOpcion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPerfilOpcion.dispose();
			this.jInternalFrameReporteDinamicoPerfilOpcion=null;
		}
		
		if(this.jInternalFrameImportacionPerfilOpcion!=null) {
			this.jInternalFrameImportacionPerfilOpcion.setVisible(false);	    			
			this.jInternalFrameImportacionPerfilOpcion.dispose();
			this.jInternalFrameImportacionPerfilOpcion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPerfilOpcion();
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
			
			if(sTipo.equals("NuevoPerfilOpcion")) {
				jButtonNuevoPerfilOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPerfilOpcion")) {
				jButtonDuplicarPerfilOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPerfilOpcion")) {
				jButtonCopiarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("VerFormPerfilOpcion")) {
				jButtonVerFormPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPerfilOpcion")) {
				jButtonNuevoPerfilOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPerfilOpcion")) {
				jButtonDuplicarPerfilOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPerfilOpcion")) {
				jButtonNuevoPerfilOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPerfilOpcion")) {
				jButtonDuplicarPerfilOpcionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPerfilOpcion")) {
				jButtonNuevoPerfilOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPerfilOpcion")) {
				jButtonNuevoPerfilOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPerfilOpcion")) {
				jButtonNuevoPerfilOpcionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPerfilOpcion")) {
				jButtonModificarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPerfilOpcion")) {
				jButtonModificarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPerfilOpcion")) {
				jButtonModificarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPerfilOpcion")) {
				jButtonActualizarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPerfilOpcion")) {
				jButtonActualizarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPerfilOpcion")) {
				jButtonActualizarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("EliminarPerfilOpcion")) {
				jButtonEliminarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPerfilOpcion")) {
				jButtonEliminarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPerfilOpcion")) {
				jButtonEliminarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("CancelarPerfilOpcion")) {
				jButtonCancelarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPerfilOpcion")) {
				jButtonCancelarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPerfilOpcion")) {
				jButtonCancelarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("CerrarPerfilOpcion")) {
				jButtonCerrarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPerfilOpcion")) {
				jButtonCerrarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPerfilOpcion")) {
				jButtonCerrarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPerfilOpcion")) {
				jButtonMostrarOcultarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPerfilOpcion")) {
				jButtonCancelarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPerfilOpcion")) {
				jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPerfilOpcion")) {
				jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPerfilOpcion")) {
				jButtonCopiarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPerfilOpcion")) {
				jButtonVerFormPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPerfilOpcion")) {
				jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPerfilOpcion")) {
				jButtonCopiarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPerfilOpcion")) {
				jButtonVerFormPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPerfilOpcion")) {
				jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPerfilOpcion")) {
				jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPerfilOpcion")) {
				jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPerfilOpcion")) {
				jButtonRecargarInformacionPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPerfilOpcion")) {
				jButtonRecargarInformacionPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPerfilOpcion")) {
				jButtonRecargarInformacionPerfilOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPerfilOpcion")) {
				jButtonAnterioresPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPerfilOpcion")) {
				jButtonAnterioresPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePerfilOpcion")) {
				jButtonAnterioresPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPerfilOpcion")) {
				jButtonSiguientesPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPerfilOpcion")) {
				jButtonSiguientesPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPerfilOpcion")) {
				jButtonSiguientesPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPerfilOpcion") || sTipo.equals("MenuItemDetalleAbrirOrderByPerfilOpcion")) {
				jButtonAbrirOrderByPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPerfilOpcion") || sTipo.equals("MenuItemDetalleMostrarOcultarPerfilOpcion")) {
				jButtonMostrarOcultarPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPerfilOpcion")) {
				jButtonNuevoGuardarCambiosPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPerfilOpcion")) {
				jButtonNuevoGuardarCambiosPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPerfilOpcion")) {
				jButtonNuevoGuardarCambiosPerfilOpcionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPerfilOpcion")) {
				jButtonCerrarReporteDinamicoPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPerfilOpcion")) {
				jButtonGenerarReporteDinamicoPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPerfilOpcion")) {
				
				jButtonGenerarExcelReporteDinamicoPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPerfilOpcion")) {
				jButtonCerrarImportacionPerfilOpcionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPerfilOpcion")) {
				
				jButtonGenerarImportacionPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPerfilOpcion")) {
				
				jButtonAbrirImportacionPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPerfilOpcion")) {
				jComboBoxTiposAccionesPerfilOpcionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPerfilOpcion")) {
				jComboBoxTiposRelacionesPerfilOpcionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPerfilOpcion")) {
				jComboBoxTiposAccionesPerfilOpcionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPerfilOpcion")) {
				
				jComboBoxTiposSeleccionarPerfilOpcionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPerfilOpcion")) {
				jTextFieldValorCampoGeneralPerfilOpcionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPerfilOpcion")) {
				jButtonAbrirOrderByPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPerfilOpcion")) {
				jButtonAbrirOrderByPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPerfilOpcion")) {
				jButtonCerrarOrderByPerfilOpcionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilOpcionBusqueda")) {
				this.jButtonidPerfilOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaPerfilOpcionUpdate")) {
				this.jButtonid_sistemaPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaPerfilOpcionBusqueda")) {
				this.jButtonid_sistemaPerfilOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloPerfilOpcionUpdate")) {
				this.jButtonid_moduloPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloPerfilOpcionBusqueda")) {
				this.jButtonid_moduloPerfilOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_opcionPerfilOpcionUpdate")) {
				this.jButtonid_grupo_opcionPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_opcionPerfilOpcionBusqueda")) {
				this.jButtonid_grupo_opcionPerfilOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilPerfilOpcionUpdate")) {
				this.jButtonid_perfilPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilPerfilOpcionBusqueda")) {
				this.jButtonid_perfilPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_opcionPerfilOpcion")) {
				this.jButtonid_opcionPerfilOpcionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_opcionPerfilOpcionArbol")) {
				this.abrirFrameTreeOpcion("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionPerfilOpcionUpdate")) {
				this.jButtonid_opcionPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionPerfilOpcionBusqueda")) {
				this.jButtonid_opcionPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("todoPerfilOpcionBusqueda")) {
				this.jButtontodoPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresoPerfilOpcionBusqueda")) {
				this.jButtoningresoPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modificacionPerfilOpcionBusqueda")) {
				this.jButtonmodificacionPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("eliminacionPerfilOpcionBusqueda")) {
				this.jButtoneliminacionPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("guardar_cambiosPerfilOpcionBusqueda")) {
				this.jButtonguardar_cambiosPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("consultaPerfilOpcionBusqueda")) {
				this.jButtonconsultaPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("busquedaPerfilOpcionBusqueda")) {
				this.jButtonbusquedaPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("reportePerfilOpcionBusqueda")) {
				this.jButtonreportePerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPerfilOpcionBusqueda")) {
				this.jButtonordenPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paginacion_medioPerfilOpcionBusqueda")) {
				this.jButtonpaginacion_medioPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paginacion_altoPerfilOpcionBusqueda")) {
				this.jButtonpaginacion_altoPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paginacion_todoPerfilOpcionBusqueda")) {
				this.jButtonpaginacion_todoPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("duplicarPerfilOpcionBusqueda")) {
				this.jButtonduplicarPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("copiarPerfilOpcionBusqueda")) {
				this.jButtoncopiarPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_precargarPerfilOpcionBusqueda")) {
				this.jButtoncon_precargarPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilOpcionBusqueda")) {
				this.jButtonestadoPerfilOpcionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_opcionPerfilOpcion")) {
				this.jButtonid_opcionPerfilOpcionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorIdPerfilPorIdOpcionPerfilOpcion")) {
				this.jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdSisPorIdModPorIdPerPerfilOpcion")) {
				this.jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdGrupoOpcionPerfilOpcion")) {
				this.jButtonFK_IdGrupoOpcionPerfilOpcionActionPerformed(evt);
			}
			
			;
			
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPerfilOpcion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilOpcionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				


				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PerfilOpcion perfilopcionLocal=null;
			
			if(!this.getEsControlTabla()) {
				perfilopcionLocal=this.perfilopcion;
			} else {
				perfilopcionLocal=this.perfilopcionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
							
				
				


				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
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
			
			


			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilOpcionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
								
						
				


				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
								
				
				


				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilOpcionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
							
				
				


				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilOpcionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
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
			
			


			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilOpcionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
								
				
				


				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilOpcionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilOpcionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPerfilOpcion")) {
					jCheckBoxSeleccionarTodosPerfilOpcionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPerfilOpcion")) {
					jCheckBoxSeleccionadosPerfilOpcionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPerfilOpcion")) {
					
				}
				
				


				
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
												
				
				


				
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilOpcionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilOpcionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
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
			
			


			if(sTipo.equals("id_sistemaPerfilOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion;
				}

				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					//classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormPerfilOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
				//recargarFormPerfilOpcionSistema(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
				//recargarFormPerfilOpcionSistema(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
			}
			 else if(sTipo.equals("id_moduloPerfilOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion;
				}

				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					//classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormPerfilOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
				//recargarFormPerfilOpcionModulo(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
				//recargarFormPerfilOpcionModulo(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
			}
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilOpcionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_sistemaPerfilOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion;
				}

				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					//classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormPerfilOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
				//recargarFormPerfilOpcionSistema(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
				//recargarFormPerfilOpcionSistema(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
			}
			 else if(sTipo.equals("id_moduloPerfilOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion;
				}

				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					//classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormPerfilOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
				//recargarFormPerfilOpcionModulo(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
				//recargarFormPerfilOpcionModulo(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
			}
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilopcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilopcion);
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
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
				
				


			if(sTipo.equals("id_sistemaPerfilOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion;
				}

				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					//classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeySistema(jComboBoxGenerico,"Formulario");

				this.recargarFormPerfilOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
				//recargarFormPerfilOpcionSistema(jComboBoxid_sistemaBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion")) {
				this.procesarActionsCombosForeignKeySistema(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
				//recargarFormPerfilOpcionSistema(jComboBoxid_sistemaBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
			}
			 else if(sTipo.equals("id_moduloPerfilOpcion")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion;
				}

				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					//classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormPerfilOpcion(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
				//recargarFormPerfilOpcionModulo(jComboBoxid_moduloBusquedaPorIdPerfilPorIdOpcionPerfilOpcion,"BusquedaPorIdPerfilPorIdOpcion");
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
				//recargarFormPerfilOpcionModulo(jComboBoxid_moduloBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion,"BusquedaPorIdSisPorIdModPorIdPer");
			}
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilOpcion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilOpcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilOpcionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilopcionAnterior =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPerfilOpcion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPerfilOpcionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPerfilOpcion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.perfilopcion =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.perfilopcion =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.perfilopcion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPerfilOpcion")) {
				
				}
				
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPerfilOpcion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPerfilOpcion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPerfilOpcion")) {
			
			}
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPerfilOpcion();
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
			if(sTipo.equals("NuevoPerfilOpcion")) {
				jButtonNuevoPerfilOpcionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPerfilOpcion")) {
				jButtonDuplicarPerfilOpcionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPerfilOpcion")) {
				jButtonCopiarPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPerfilOpcion")) {
				jButtonVerFormPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPerfilOpcion")) {
				jButtonNuevoPerfilOpcionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPerfilOpcion")) {
				jButtonModificarPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPerfilOpcion")) {
				jButtonActualizarPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPerfilOpcion")) {
				jButtonEliminarPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPerfilOpcion")) {
				jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPerfilOpcion")) {
				jButtonCancelarPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPerfilOpcion")) {
				jButtonCerrarPerfilOpcionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPerfilOpcion")) {
				jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPerfilOpcion")) {
				jButtonNuevoGuardarCambiosPerfilOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPerfilOpcion")) {
				jButtonAbrirOrderByPerfilOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPerfilOpcion")) {
				jButtonRecargarInformacionPerfilOpcionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPerfilOpcion")) {
				jButtonAnterioresPerfilOpcionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPerfilOpcion")) {
				jButtonSiguientesPerfilOpcionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilOpcionBusqueda")) {
				this.jButtonidPerfilOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sistemaPerfilOpcionUpdate")) {
				this.jButtonid_sistemaPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sistemaPerfilOpcionBusqueda")) {
				this.jButtonid_sistemaPerfilOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloPerfilOpcionUpdate")) {
				this.jButtonid_moduloPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloPerfilOpcionBusqueda")) {
				this.jButtonid_moduloPerfilOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_opcionPerfilOpcionUpdate")) {
				this.jButtonid_grupo_opcionPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_opcionPerfilOpcionBusqueda")) {
				this.jButtonid_grupo_opcionPerfilOpcionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilPerfilOpcionUpdate")) {
				this.jButtonid_perfilPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilPerfilOpcionBusqueda")) {
				this.jButtonid_perfilPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_opcionPerfilOpcion")) {
				this.jButtonid_opcionPerfilOpcionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_opcionPerfilOpcionArbol")) {
				this.abrirFrameTreeOpcion("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_opcionPerfilOpcionUpdate")) {
				this.jButtonid_opcionPerfilOpcionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_opcionPerfilOpcionBusqueda")) {
				this.jButtonid_opcionPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("todoPerfilOpcionBusqueda")) {
				this.jButtontodoPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresoPerfilOpcionBusqueda")) {
				this.jButtoningresoPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modificacionPerfilOpcionBusqueda")) {
				this.jButtonmodificacionPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("eliminacionPerfilOpcionBusqueda")) {
				this.jButtoneliminacionPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("guardar_cambiosPerfilOpcionBusqueda")) {
				this.jButtonguardar_cambiosPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("consultaPerfilOpcionBusqueda")) {
				this.jButtonconsultaPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("busquedaPerfilOpcionBusqueda")) {
				this.jButtonbusquedaPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("reportePerfilOpcionBusqueda")) {
				this.jButtonreportePerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenPerfilOpcionBusqueda")) {
				this.jButtonordenPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paginacion_medioPerfilOpcionBusqueda")) {
				this.jButtonpaginacion_medioPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paginacion_altoPerfilOpcionBusqueda")) {
				this.jButtonpaginacion_altoPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("paginacion_todoPerfilOpcionBusqueda")) {
				this.jButtonpaginacion_todoPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("duplicarPerfilOpcionBusqueda")) {
				this.jButtonduplicarPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("copiarPerfilOpcionBusqueda")) {
				this.jButtoncopiarPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_precargarPerfilOpcionBusqueda")) {
				this.jButtoncon_precargarPerfilOpcionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilOpcionBusqueda")) {
				this.jButtonestadoPerfilOpcionBusquedaActionPerformed(evt);
			}
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPerfilOpcion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePerfilOpcion")) {
				closingInternalFramePerfilOpcion();
				
			} else if(sTipo.equals("jButtonCancelarPerfilOpcion")) {
				JInternalFrameBase jInternalFrameDetalleFormPerfilOpcion = (JInternalFrameBase)evt.getSource();
	            	
	            PerfilOpcionBeanSwingJInternalFrame jInternalFrameParent=(PerfilOpcionBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfilOpcion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPerfilOpcionActionPerformed(null);
			}
			
			PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilopcion,new Object(),this.perfilopcionParameterGeneral,this.perfilopcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPerfilOpcion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPerfilOpcion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPerfilOpcion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.perfilopcion)) {
			if(!esControlTabla) {
				if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);			
				}
				
				if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPerfilOpcion(this.perfilopcion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilopcionReturnGeneral=perfilopcionLogic.procesarEventosPerfilOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilopcionLogic.getPerfilOpcions(),this.perfilopcion,this.perfilopcionParameterGeneral,this.isEsNuevoPerfilOpcion,classes);//this.perfilopcionLogic.getPerfilOpcion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPerfilOpcion(this.perfilopcionReturnGeneral,this.perfilopcionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPerfilOpcion(classes,this.perfilopcionReturnGeneral,this.perfilopcionBean,false);
					}
						
					if(this.perfilopcionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPerfilOpcion(this.perfilopcionReturnGeneral.getPerfilOpcion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPerfilOpcion(this.perfilopcionReturnGeneral.getPerfilOpcion());	
					}
						
					if(this.perfilopcionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPerfilOpcion(this.perfilopcionReturnGeneral.getPerfilOpcion(),classes);//this.perfilopcionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPerfilOpcion(this.perfilopcion,classes);//this.perfilopcionBean);									
				}
			
				if(PerfilOpcionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPerfilOpcion(this.perfilopcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilOpcion(this.perfilopcion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.perfilopcionAnterior!=null) {
						this.perfilopcion=this.perfilopcionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilopcionReturnGeneral=perfilopcionLogic.procesarEventosPerfilOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilopcionLogic.getPerfilOpcions(),this.perfilopcion,this.perfilopcionParameterGeneral,this.isEsNuevoPerfilOpcion,classes);//this.perfilopcionLogic.getPerfilOpcion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilopcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilopcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.perfilopcionReturnGeneral.getPerfilOpcion(),perfilopcionLogic.getPerfilOpcions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.perfilopcionReturnGeneral.getPerfilOpcion(),this.perfilopcions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPerfilOpcion.repaint();
				
				//((AbstractTableModel) this.jTableDatosPerfilOpcion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPerfilOpcion();
			}
		}
	}
	
	public void actualizarVisualTableDatosPerfilOpcion() throws Exception {
		
		PerfilOpcionModel perfilopcionModel=(PerfilOpcionModel)this.jTableDatosPerfilOpcion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilopcionModel.perfilopcions=this.perfilopcionLogic.getPerfilOpcions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			perfilopcionModel.perfilopcions=this.perfilopcions;
		}
		
		
		((PerfilOpcionModel) this.jTableDatosPerfilOpcion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPerfilOpcion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperfilopcionAnterior(),this.perfilopcionLogic.getPerfilOpcions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperfilopcionAnterior(),this.perfilopcions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPerfilOpcion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPerfilOpcion(PerfilOpcion perfilopcion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
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
										
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilopcion,new Object(),generalEntityParameterGeneral,this.perfilopcionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.perfilopcionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsOfPerfilOpcion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PerfilOpcionConstantesFunciones.getClassesRelationshipsFromStringsOfPerfilOpcion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPerfilOpcion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PerfilOpcionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilopcion,new Object(),generalEntityParameterGeneral,this.perfilopcionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPerfilOpcion(PerfilOpcionBean perfilopcionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPerfilOpcion(ArrayList<Classe> classes,PerfilOpcionReturnGeneral perfilopcionReturnGeneral,PerfilOpcionBean perfilopcionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPerfilOpcion(PerfilOpcion perfilopcion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.perfilopcion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPerfilOpcion = new PerfilOpcionDetalleFormJInternalFrame(jDesktopPane,this.perfilopcionSessionBean.getConGuardarRelaciones(),this.perfilopcionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.setVisible(false);
		this.jInternalFrameDetalleFormPerfilOpcion.setSelected(false);						
		
		this.jInternalFrameDetalleFormPerfilOpcion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPerfilOpcion.perfilopcionLogic=this.perfilopcionLogic;
		
		this.cargarCombosFrameForeignKeyPerfilOpcion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePerfilOpcion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfilOpcion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPerfilOpcion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPerfilOpcion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPerfilOpcion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfilOpcion"));
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarPerfilOpcion.addActionListener(new ButtonActionListener(this,"ModificarPerfilOpcion"));

		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarToolBarPerfilOpcion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfilOpcion"));
					
		this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemModificarPerfilOpcion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfilOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarPerfilOpcion.addActionListener (new ButtonActionListener(this,"ActualizarPerfilOpcion"));
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarToolBarPerfilOpcion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfilOpcion"));
						
		this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemActualizarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfilOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarPerfilOpcion.addActionListener (new ButtonActionListener(this,"EliminarPerfilOpcion"));
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfilOpcion"));
								
		this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemEliminarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfilOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarPerfilOpcion.addActionListener (new ButtonActionListener(this,"CancelarPerfilOpcion"));
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfilOpcion"));
					
		this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemCancelarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfilOpcion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemDetalleCerrarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfilOpcion"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilOpcion"));
		
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilOpcion"));
		
		
		
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfilOpcion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonidPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_sistemaPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_sistemaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_moduloPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_moduloPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_grupo_opcionPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_grupo_opcionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_perfilPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_perfilPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilOpcionBusqueda"));
		//jButtonid_opcionPerfilOpcion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_opcionPerfilOpcionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcion"));
		//jButtonid_opcionPerfilOpcionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeOpcion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionArbol.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtontodoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"todoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoningresoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ingresoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonmodificacionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"modificacionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoneliminacionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"eliminacionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonguardar_cambiosPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"guardar_cambiosPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonconsultaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"consultaPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonbusquedaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"busquedaPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonreportePerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"reportePerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonordenPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ordenPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_medioPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_medioPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_altoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_altoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_todoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_todoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonduplicarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"duplicarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoncopiarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"copiarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoncon_precargarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_precargarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonestadoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilOpcionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfilOpcion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePerfilOpcion"));
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfilOpcion"));
		}
		
		this.jTableDatosPerfilOpcion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPerfilOpcion"));
		
		this.jTableDatosPerfilOpcion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPerfilOpcion"));
		
		this.jButtonNuevoPerfilOpcion.addActionListener(new ButtonActionListener(this,"NuevoPerfilOpcion"));
		
		this.jButtonDuplicarPerfilOpcion.addActionListener(new ButtonActionListener(this,"DuplicarPerfilOpcion"));
		
		this.jButtonCopiarPerfilOpcion.addActionListener(new ButtonActionListener(this,"CopiarPerfilOpcion"));
		
		this.jButtonVerFormPerfilOpcion.addActionListener(new ButtonActionListener(this,"VerFormPerfilOpcion"));
		
		
		this.jButtonNuevoToolBarPerfilOpcion.addActionListener(new ButtonActionListener(this,"NuevoToolBarPerfilOpcion"));
			
		this.jButtonDuplicarToolBarPerfilOpcion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPerfilOpcion"));
			
		this.jMenuItemNuevoPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPerfilOpcion"));
			
		this.jMenuItemDuplicarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPerfilOpcion"));		
		
		
		this.jButtonNuevoRelacionesPerfilOpcion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPerfilOpcion"));
		
		
		this.jButtonNuevoRelacionesToolBarPerfilOpcion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPerfilOpcion"));
			
		this.jMenuItemNuevoRelacionesPerfilOpcion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPerfilOpcion"));		
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarPerfilOpcion.addActionListener(new ButtonActionListener(this,"ModificarPerfilOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonModificarToolBarPerfilOpcion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfilOpcion"));
			
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemModificarPerfilOpcion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfilOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarPerfilOpcion.addActionListener (new ButtonActionListener(this,"ActualizarPerfilOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonActualizarToolBarPerfilOpcion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfilOpcion"));
				
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemActualizarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfilOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarPerfilOpcion.addActionListener (new ButtonActionListener(this,"EliminarPerfilOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonEliminarToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfilOpcion"));
						
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemEliminarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfilOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarPerfilOpcion.addActionListener (new ButtonActionListener(this,"CancelarPerfilOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonCancelarToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfilOpcion"));
			
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemCancelarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfilOpcion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPerfilOpcion"));		
		
		
		this.jButtonCerrarPerfilOpcion.addActionListener (new ButtonActionListener(this,"CerrarPerfilOpcion"));
		
		
		this.jButtonCerrarToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"CerrarToolBarPerfilOpcion"));
			
		this.jMenuItemCerrarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPerfilOpcion"));
			
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jMenuItemDetalleCerrarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfilOpcion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosPerfilOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosPerfilOpcion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilOpcion"));
		}
		
		this.jButtonCopiarToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"CopiarToolBarPerfilOpcion"));
			
		this.jButtonVerFormToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"VerFormToolBarPerfilOpcion"));
		
		this.jMenuItemGuardarCambiosPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPerfilOpcion"));
			
		this.jMenuItemCopiarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPerfilOpcion"));		
		
		this.jMenuItemVerFormPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPerfilOpcion"));		
		
		
		this.jButtonGuardarCambiosTablaPerfilOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfilOpcion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPerfilOpcion"));
			
		this.jMenuItemGuardarCambiosTablaPerfilOpcion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfilOpcion"));		
		
		
		
		this.jButtonRecargarInformacionPerfilOpcion.addActionListener (new ButtonActionListener(this,"RecargarInformacionPerfilOpcion"));
					
		this.jButtonRecargarInformacionToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPerfilOpcion"));
		
		this.jMenuItemRecargarInformacionPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPerfilOpcion"));		
		
		
		
		this.jButtonAnterioresPerfilOpcion.addActionListener (new ButtonActionListener(this,"AnterioresPerfilOpcion"));
		
		
		this.jButtonAnterioresToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPerfilOpcion"));
		
		this.jMenuItemAnterioresPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPerfilOpcion"));		
		
		
		this.jButtonSiguientesPerfilOpcion.addActionListener (new ButtonActionListener(this,"SiguientesPerfilOpcion"));
		
		
		this.jButtonSiguientesToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPerfilOpcion"));
			
		this.jMenuItemSiguientesPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPerfilOpcion"));
			
		this.jMenuItemAbrirOrderByPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPerfilOpcion"));
			
		this.jMenuItemMostrarOcultarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPerfilOpcion"));
			
		this.jMenuItemDetalleAbrirOrderByPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPerfilOpcion"));
			
		this.jMenuItemDetalleMostarOcultarPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPerfilOpcion"));		
		
		
		this.jButtonNuevoGuardarCambiosPerfilOpcion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPerfilOpcion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPerfilOpcion"));
			
		this.jMenuItemNuevoGuardarCambiosPerfilOpcion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPerfilOpcion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPerfilOpcion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPerfilOpcion"));

		this.jCheckBoxSeleccionadosPerfilOpcion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPerfilOpcion"));
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfilOpcion"));
		}
		
		
		this.jComboBoxTiposRelacionesPerfilOpcion.addActionListener (new ButtonActionListener(this,"TiposRelacionesPerfilOpcion"));
			
		this.jComboBoxTiposAccionesPerfilOpcion.addActionListener (new ButtonActionListener(this,"TiposAccionesPerfilOpcion"));
					
		this.jComboBoxTiposSeleccionarPerfilOpcion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPerfilOpcion"));
			
		this.jTextFieldValorCampoGeneralPerfilOpcion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPerfilOpcion"));		
		
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonidPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_sistemaPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_sistemaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_moduloPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_moduloPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_grupo_opcionPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_grupo_opcionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_perfilPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_perfilPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilOpcionBusqueda"));
		//jButtonid_opcionPerfilOpcion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_opcionPerfilOpcionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcion"));
		//jButtonid_opcionPerfilOpcionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeOpcion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionArbol.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtontodoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"todoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoningresoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ingresoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonmodificacionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"modificacionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoneliminacionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"eliminacionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonguardar_cambiosPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"guardar_cambiosPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonconsultaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"consultaPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonbusquedaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"busquedaPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonreportePerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"reportePerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonordenPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ordenPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_medioPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_medioPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_altoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_altoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_todoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_todoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonduplicarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"duplicarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoncopiarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"copiarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoncon_precargarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_precargarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonestadoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilOpcionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

			this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcion"));

			this.jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

			this.jButtonFK_IdGrupoOpcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"FK_IdGrupoOpcionPerfilOpcion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPerfilOpcion!=null) {
				this.jInternalFrameReporteDinamicoPerfilOpcion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilOpcion"));
				this.jInternalFrameReporteDinamicoPerfilOpcion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilOpcion"));
				this.jInternalFrameReporteDinamicoPerfilOpcion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilOpcion"));
			}
			
			//this.jButtonCerrarReporteDinamicoPerfilOpcion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilOpcion"));				
			//this.jButtonGenerarReporteDinamicoPerfilOpcion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilOpcion"));
			//this.jButtonGenerarExcelReporteDinamicoPerfilOpcion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilOpcion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPerfilOpcion!=null) {
				this.jInternalFrameImportacionPerfilOpcion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfilOpcion"));
				this.jInternalFrameImportacionPerfilOpcion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfilOpcion"));
				this.jInternalFrameImportacionPerfilOpcion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfilOpcion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPerfilOpcion.addActionListener (new ButtonActionListener(this,"AbrirOrderByPerfilOpcion"));
			
			this.jButtonAbrirOrderByToolBarPerfilOpcion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPerfilOpcion"));			
			
			if(this.jInternalFrameOrderByPerfilOpcion!=null) {
				this.jInternalFrameOrderByPerfilOpcion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfilOpcion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilOpcion.jTabbedPaneRelacionesPerfilOpcion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfilOpcion"));
		
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
            		closingInternalFramePerfilOpcion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPerfilOpcion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPerfilOpcion = (JInternalFrameBase)event.getSource();
	            	
	            PerfilOpcionBeanSwingJInternalFrame jInternalFrameParent=(PerfilOpcionBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfilOpcion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPerfilOpcionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPerfilOpcion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPerfilOpcionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPerfilOpcion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPerfilOpcion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilOpcionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPerfilOpcion";
		inputMap = this.jButtonNuevoPerfilOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPerfilOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilOpcionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilOpcionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPerfilOpcion";
		inputMap = this.jButtonNuevoRelacionesPerfilOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPerfilOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilOpcionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPerfilOpcion";
		inputMap = this.jButtonModificarPerfilOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPerfilOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPerfilOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPerfilOpcion";
		inputMap = this.jButtonActualizarPerfilOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPerfilOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPerfilOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPerfilOpcion";
		inputMap = this.jButtonEliminarPerfilOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPerfilOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPerfilOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPerfilOpcion";
		inputMap = this.jButtonCancelarPerfilOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPerfilOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPerfilOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPerfilOpcion";
		inputMap = this.jButtonCerrarPerfilOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPerfilOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPerfilOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPerfilOpcion";
		inputMap = this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosPerfilOpcion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonGuardarCambiosPerfilOpcion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPerfilOpcionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPerfilOpcion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPerfilOpcionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPerfilOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPerfilOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPerfilOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPerfilOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPerfilOpcion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPerfilOpcionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonidPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_sistemaPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_sistemaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_sistemaPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_moduloPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_moduloPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_moduloPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_grupo_opcionPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_opcionPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_grupo_opcionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_opcionPerfilOpcionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_perfilPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_perfilPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilOpcionBusqueda"));
		//jButtonid_opcionPerfilOpcion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_opcionPerfilOpcionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcion"));
		//jButtonid_opcionPerfilOpcionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeOpcion("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionArbol.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionUpdate.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtontodoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"todoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoningresoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ingresoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonmodificacionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"modificacionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoneliminacionPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"eliminacionPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonguardar_cambiosPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"guardar_cambiosPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonconsultaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"consultaPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonbusquedaPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"busquedaPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonreportePerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"reportePerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonordenPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"ordenPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_medioPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_medioPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_altoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_altoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonpaginacion_todoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"paginacion_todoPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonduplicarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"duplicarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoncopiarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"copiarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtoncon_precargarPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"con_precargarPerfilOpcionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilOpcion.jButtonestadoPerfilOpcionBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilOpcionBusqueda"));
		
		
		this.jButtonBusquedaPorIdPerfilPorIdOpcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdPerfilPorIdOpcionPerfilOpcion"));

		this.jButtonBuscarBusquedaPorIdPerfilPorIdOpcionid_opcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"id_opcionPerfilOpcion"));

		this.jButtonBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdSisPorIdModPorIdPerPerfilOpcion"));

		this.jButtonFK_IdGrupoOpcionPerfilOpcion.addActionListener(new ButtonActionListener(this,"FK_IdGrupoOpcionPerfilOpcion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPerfilOpcion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPerfilOpcionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPerfilOpcionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPerfilOpcion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPerfilOpcion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
					perfilopcionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilOpcion perfilopcionAux:perfilopcions) {
					perfilopcionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPerfilOpcionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfilOpcion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
						perfilopcionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilOpcion perfilopcionAux:perfilopcions) {
						perfilopcionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
					
						if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_TODO)) {
							existe=true;
							perfilopcionAux.settodo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_INGRESO)) {
							existe=true;
							perfilopcionAux.setingreso(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_MODIFICACION)) {
							existe=true;
							perfilopcionAux.setmodificacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ELIMINACION)) {
							existe=true;
							perfilopcionAux.seteliminacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS)) {
							existe=true;
							perfilopcionAux.setguardar_cambios(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_CONSULTA)) {
							existe=true;
							perfilopcionAux.setconsulta(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA)) {
							existe=true;
							perfilopcionAux.setbusqueda(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_REPORTE)) {
							existe=true;
							perfilopcionAux.setreporte(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							perfilopcionAux.setorden(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO)) {
							existe=true;
							perfilopcionAux.setpaginacion_medio(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO)) {
							existe=true;
							perfilopcionAux.setpaginacion_alto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO)) {
							existe=true;
							perfilopcionAux.setpaginacion_todo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_DUPLICAR)) {
							existe=true;
							perfilopcionAux.setduplicar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_COPIAR)) {
							existe=true;
							perfilopcionAux.setcopiar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR)) {
							existe=true;
							perfilopcionAux.setcon_precargar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilopcionAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilOpcion perfilopcionAux:perfilopcions) {
						
						if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_TODO)) {
							existe=true;
							perfilopcionAux.settodo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_INGRESO)) {
							existe=true;
							perfilopcionAux.setingreso(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_MODIFICACION)) {
							existe=true;
							perfilopcionAux.setmodificacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ELIMINACION)) {
							existe=true;
							perfilopcionAux.seteliminacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS)) {
							existe=true;
							perfilopcionAux.setguardar_cambios(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_CONSULTA)) {
							existe=true;
							perfilopcionAux.setconsulta(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA)) {
							existe=true;
							perfilopcionAux.setbusqueda(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_REPORTE)) {
							existe=true;
							perfilopcionAux.setreporte(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							perfilopcionAux.setorden(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO)) {
							existe=true;
							perfilopcionAux.setpaginacion_medio(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO)) {
							existe=true;
							perfilopcionAux.setpaginacion_alto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO)) {
							existe=true;
							perfilopcionAux.setpaginacion_todo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_DUPLICAR)) {
							existe=true;
							perfilopcionAux.setduplicar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_COPIAR)) {
							existe=true;
							perfilopcionAux.setcopiar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR)) {
							existe=true;
							perfilopcionAux.setcon_precargar(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilopcionAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPerfilOpcion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfilOpcion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfilOpcion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPerfilOpcionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfilOpcion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPerfilOpcion.getSelectedRows();
			
			PerfilOpcion perfilopcionLocal=new PerfilOpcion();
			
			//this.seleccionarTodosPerfilOpcion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilopcionLocal =(PerfilOpcion) this.perfilopcionLogic.getPerfilOpcions().toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					perfilopcionLocal =(PerfilOpcion) this.perfilopcions.toArray()[this.jTableDatosPerfilOpcion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				perfilopcionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
						perfilopcionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilOpcion perfilopcionAux:perfilopcions) {
						perfilopcionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPerfilOpcion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfilOpcion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfilOpcion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfilOpcion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPerfilOpcionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPerfilOpcionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPerfilOpcionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPerfilOpcion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPerfilOpcion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PerfilOpcion perfilopcionAux:this.perfilopcionLogic.getPerfilOpcions()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilOpcion perfilopcionAux:perfilopcions) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPerfilOpcion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPerfilOpcionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPerfilOpcion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPerfilOpcion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPerfilOpcion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePerfilOpcion) {				
					conSplash=true;//false;										
					
					//this.startProcessPerfilOpcion(conSplash);
				
					this.generarReportePerfilOpcionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPerfilOpcionsSeleccionados();
				//this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilOpcionsSeleccionados(false);
				//this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilOpcionsSeleccionados(true);
				//this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfilOpcion();
				
				this.exportarPerfilOpcionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPerfilOpcions();
				//this.importarPerfilOpcions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfilOpcion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPerfilOpcionsSeleccionados();
				//this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Perfil Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPerfilOpcion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPerfilOpcion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPerfilOpcion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.setSelectedIndex(0);					
				}	
			} 			
			else if(PerfilOpcionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePerfilOpcion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPerfilOpcion(conSplash);
					
						//this.actualizarParametrosGeneralPerfilOpcion();
						
						this.generarReporteProcesoAccionPerfilOpcionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PerfilOpcionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Perfil OpcionES SELECCIONADOS?", "MANTENIMIENTO DE Perfil Opcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPerfilOpcion();
				
						this.actualizarParametrosGeneralPerfilOpcion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.perfilopcionReturnGeneral=perfilopcionLogic.procesarAccionPerfilOpcionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.perfilopcionLogic.getPerfilOpcions(),this.perfilopcionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPerfilOpcionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPerfilOpcion();
					
					PerfilOpcionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPerfilOpcionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfilOpcion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxTiposAccionesFormularioPerfilOpcion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPerfilOpcion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPerfilOpcionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPerfilOpcion();
			
			if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
			PerfilOpcion perfilopcion=new PerfilOpcion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPerfilOpcion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPerfilOpcion.getSelectedItem();
			
			
			
			
			perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(perfilopcionsSeleccionados.size()==1) {
				for(PerfilOpcion perfilopcionAux:perfilopcionsSeleccionados) {
					perfilopcion=perfilopcionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPerfilOpcion();
			
      		//this.finishProcessPerfilOpcion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPerfilOpcionReturnGeneral() throws Exception {
		if(this.perfilopcionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.perfilopcionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.perfilopcionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.perfilopcionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.perfilopcionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.perfilopcionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPerfilOpcion(false);
		}
		
		if(this.perfilopcionReturnGeneral.getConRetornoLista() || this.perfilopcionReturnGeneral.getConRetornoObjeto()) {
			if(this.perfilopcionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilopcionLogic.setPerfilOpcions(this.perfilopcionReturnGeneral.getPerfilOpcions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.perfilopcionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilopcionLogic.setPerfilOpcion(this.perfilopcionReturnGeneral.getPerfilOpcion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPerfilOpcion(false);
		}
	}
	
	public void actualizarParametrosGeneralPerfilOpcion() throws Exception {
		
		
	}
	
	public ArrayList<PerfilOpcion> getPerfilOpcionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPerfilOpcion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PerfilOpcion perfilopcionAux:perfilopcionLogic.getPerfilOpcions()) {
					if(perfilopcionAux.getIsSelected()) {
						perfilopcionsSeleccionados.add(perfilopcionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilOpcion perfilopcionAux:this.perfilopcions) {
					if(perfilopcionAux.getIsSelected()) {
						perfilopcionsSeleccionados.add(perfilopcionAux);				
					}
				}
			}
			
			if(perfilopcionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						perfilopcionsSeleccionados.addAll(this.perfilopcionLogic.getPerfilOpcions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						perfilopcionsSeleccionados.addAll(this.perfilopcions);				
					}
				}
			}
		} else {
			perfilopcionsSeleccionados.add(this.perfilopcion);
		}
		
		return perfilopcionsSeleccionados;
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
	
	public void generarReportePerfilOpcionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPerfilOpcionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPerfilOpcionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilOpcionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilOpcionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Perfil Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPerfilOpcionsSeleccionados() throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePerfilOpcions("Todos",perfilopcionsSeleccionados);
		
	}	
	
	public void generarReporteNormalPerfilOpcionsSeleccionados() throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePerfilOpcions("Todos",perfilopcionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPerfilOpcionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePerfilOpcions("Todos",perfilopcionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPerfilOpcionsSeleccionados() throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPerfilOpcion();
		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPerfilOpcion();
		
		
		//this.generarReportePerfilOpcions("Todos",perfilopcionsSeleccionados ,perfilopcionImplementable,perfilopcionImplementableHome);
	}
	
	public void mostrarImportacionPerfilOpcions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPerfilOpcion();
		
		this.abrirFrameImportacionPerfilOpcion();		
		
			
		//this.generarReportePerfilOpcions("Todos",perfilopcionsSeleccionados ,perfilopcionImplementable,perfilopcionImplementableHome);
	}
	
	public void importarPerfilOpcions() throws Exception {		
	
	}
	
	public void exportarPerfilOpcionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPerfilOpcionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPerfilOpcionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPerfilOpcionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Perfil Opcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPerfilOpcionsSeleccionados() throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPerfilOpcion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PerfilOpcion perfilopcionAux:perfilopcionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPerfilOpcion(perfilopcionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//perfilopcionAux.setsDetalleGeneralEntityReporte(perfilopcionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPerfilOpcion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_IDPERFIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_IDOPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_TODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_INGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_MODIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_ELIMINACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_CONSULTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_REPORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_DUPLICAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_COPIAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilOpcionConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPerfilOpcion(PerfilOpcion perfilopcion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=perfilopcion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getsistema_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getgrupoopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getperfil_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getopcion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.gettodo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getmodificacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.geteliminacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getguardar_cambios().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getconsulta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getbusqueda().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getreporte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getpaginacion_medio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getpaginacion_alto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getpaginacion_todo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getduplicar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getcopiar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getcon_precargar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilopcion.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPerfilOpcionsSeleccionados() throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PerfilOpcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPerfilOpcion(row);				
				iRow++;
			}				
			
			for(PerfilOpcion perfilopcionAux:perfilopcionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPerfilOpcion(perfilopcionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPerfilOpcionsSeleccionados() throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();		
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilopcion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("perfilopcions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("perfilopcion");
			//elementRoot.appendChild(element);
		
			for(PerfilOpcion perfilopcionAux:perfilopcionsSeleccionados) {
				element = document.createElement("perfilopcion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPerfilOpcion(perfilopcionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Opcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPerfilOpcion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDPERFIL);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_IDOPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_TODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_INGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_MODIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ELIMINACION);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_CONSULTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_REPORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_DUPLICAR);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_COPIAR);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilOpcionConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPerfilOpcion(PerfilOpcion perfilopcion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getsistema_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getgrupoopcion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getperfil_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getopcion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.gettodo());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getmodificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.geteliminacion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getguardar_cambios());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getconsulta());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getbusqueda());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getreporte());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getpaginacion_medio());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getpaginacion_alto());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getpaginacion_todo());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getduplicar());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getcopiar());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getcon_precargar());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilopcion.getestado());				
	}
	
	public void setFilaDatosExportarXmlPerfilOpcion(PerfilOpcion perfilopcion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PerfilOpcionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(perfilopcion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PerfilOpcionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(perfilopcion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementsistema_descripcion = document.createElement(PerfilOpcionConstantesFunciones.IDSISTEMA);
		elementsistema_descripcion.appendChild(document.createTextNode(perfilopcion.getsistema_descripcion()));
		element.appendChild(elementsistema_descripcion);

		Element elementmodulo_descripcion = document.createElement(PerfilOpcionConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(perfilopcion.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementgrupoopcion_descripcion = document.createElement(PerfilOpcionConstantesFunciones.IDGRUPOOPCION);
		elementgrupoopcion_descripcion.appendChild(document.createTextNode(perfilopcion.getgrupoopcion_descripcion()));
		element.appendChild(elementgrupoopcion_descripcion);

		Element elementperfil_descripcion = document.createElement(PerfilOpcionConstantesFunciones.IDPERFIL);
		elementperfil_descripcion.appendChild(document.createTextNode(perfilopcion.getperfil_descripcion()));
		element.appendChild(elementperfil_descripcion);

		Element elementopcion_descripcion = document.createElement(PerfilOpcionConstantesFunciones.IDOPCION);
		elementopcion_descripcion.appendChild(document.createTextNode(perfilopcion.getopcion_descripcion()));
		element.appendChild(elementopcion_descripcion);

		Element elementtodo = document.createElement(PerfilOpcionConstantesFunciones.TODO);
		elementtodo.appendChild(document.createTextNode(perfilopcion.gettodo().toString().trim()));
		element.appendChild(elementtodo);

		Element elementingreso = document.createElement(PerfilOpcionConstantesFunciones.INGRESO);
		elementingreso.appendChild(document.createTextNode(perfilopcion.getingreso().toString().trim()));
		element.appendChild(elementingreso);

		Element elementmodificacion = document.createElement(PerfilOpcionConstantesFunciones.MODIFICACION);
		elementmodificacion.appendChild(document.createTextNode(perfilopcion.getmodificacion().toString().trim()));
		element.appendChild(elementmodificacion);

		Element elementeliminacion = document.createElement(PerfilOpcionConstantesFunciones.ELIMINACION);
		elementeliminacion.appendChild(document.createTextNode(perfilopcion.geteliminacion().toString().trim()));
		element.appendChild(elementeliminacion);

		Element elementguardar_cambios = document.createElement(PerfilOpcionConstantesFunciones.GUARDARCAMBIOS);
		elementguardar_cambios.appendChild(document.createTextNode(perfilopcion.getguardar_cambios().toString().trim()));
		element.appendChild(elementguardar_cambios);

		Element elementconsulta = document.createElement(PerfilOpcionConstantesFunciones.CONSULTA);
		elementconsulta.appendChild(document.createTextNode(perfilopcion.getconsulta().toString().trim()));
		element.appendChild(elementconsulta);

		Element elementbusqueda = document.createElement(PerfilOpcionConstantesFunciones.BUSQUEDA);
		elementbusqueda.appendChild(document.createTextNode(perfilopcion.getbusqueda().toString().trim()));
		element.appendChild(elementbusqueda);

		Element elementreporte = document.createElement(PerfilOpcionConstantesFunciones.REPORTE);
		elementreporte.appendChild(document.createTextNode(perfilopcion.getreporte().toString().trim()));
		element.appendChild(elementreporte);

		Element elementorden = document.createElement(PerfilOpcionConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(perfilopcion.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementpaginacion_medio = document.createElement(PerfilOpcionConstantesFunciones.PAGINACIONMEDIO);
		elementpaginacion_medio.appendChild(document.createTextNode(perfilopcion.getpaginacion_medio().toString().trim()));
		element.appendChild(elementpaginacion_medio);

		Element elementpaginacion_alto = document.createElement(PerfilOpcionConstantesFunciones.PAGINACIONALTO);
		elementpaginacion_alto.appendChild(document.createTextNode(perfilopcion.getpaginacion_alto().toString().trim()));
		element.appendChild(elementpaginacion_alto);

		Element elementpaginacion_todo = document.createElement(PerfilOpcionConstantesFunciones.PAGINACIONTODO);
		elementpaginacion_todo.appendChild(document.createTextNode(perfilopcion.getpaginacion_todo().toString().trim()));
		element.appendChild(elementpaginacion_todo);

		Element elementduplicar = document.createElement(PerfilOpcionConstantesFunciones.DUPLICAR);
		elementduplicar.appendChild(document.createTextNode(perfilopcion.getduplicar().toString().trim()));
		element.appendChild(elementduplicar);

		Element elementcopiar = document.createElement(PerfilOpcionConstantesFunciones.COPIAR);
		elementcopiar.appendChild(document.createTextNode(perfilopcion.getcopiar().toString().trim()));
		element.appendChild(elementcopiar);

		Element elementcon_precargar = document.createElement(PerfilOpcionConstantesFunciones.CONPRECARGAR);
		elementcon_precargar.appendChild(document.createTextNode(perfilopcion.getcon_precargar().toString().trim()));
		element.appendChild(elementcon_precargar);

		Element elementestado = document.createElement(PerfilOpcionConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(perfilopcion.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoPerfilOpcionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PerfilOpcion> perfilopcionsSeleccionados=new ArrayList<PerfilOpcion>();
		
		perfilopcionsSeleccionados=this.getPerfilOpcionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPerfilOpcion(perfilopcionsSeleccionados);
		
		this.generarReportePerfilOpcions("Todos",perfilopcionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPerfilOpcion(ArrayList<PerfilOpcion> perfilopcionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PerfilOpcion perfilopcionAux:perfilopcionsSeleccionados) {
				perfilopcionAux.setsDetalleGeneralEntityReporte(perfilopcionAux.toString());
			
				if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_IDSISTEMA)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(perfilopcionAux.getsistema_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(perfilopcionAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_IDGRUPOOPCION)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(perfilopcionAux.getgrupoopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_IDPERFIL)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(perfilopcionAux.getperfil_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_IDOPCION)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(perfilopcionAux.getopcion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_TODO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.gettodo()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_INGRESO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getingreso()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_MODIFICACION)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getmodificacion()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ELIMINACION)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.geteliminacion()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_GUARDARCAMBIOS)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getguardar_cambios()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_CONSULTA)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getconsulta()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_BUSQUEDA)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getbusqueda()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_REPORTE)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getreporte()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getorden()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONMEDIO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getpaginacion_medio()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONALTO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getpaginacion_alto()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_PAGINACIONTODO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getpaginacion_todo()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_DUPLICAR)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getduplicar()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_COPIAR)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getcopiar()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_CONPRECARGAR)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getcon_precargar()));
				}
				 else if(sTipoSeleccionar.equals(PerfilOpcionConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					perfilopcionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilopcionAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilOpcionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPerfilOpcion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPerfilOpcion=true;
				this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=true;
				this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=true;
			}
			
			this.isVisibilidadCeldaModificarPerfilOpcion=false;
			this.isVisibilidadCeldaActualizarPerfilOpcion=false;
			this.isVisibilidadCeldaEliminarPerfilOpcion=false;
			this.isVisibilidadCeldaCancelarPerfilOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPerfilOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=false;
			this.isVisibilidadCeldaModificarPerfilOpcion=false;
			this.isVisibilidadCeldaActualizarPerfilOpcion=true;
			this.isVisibilidadCeldaEliminarPerfilOpcion=false;
			this.isVisibilidadCeldaCancelarPerfilOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPerfilOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=false;
			this.isVisibilidadCeldaModificarPerfilOpcion=false;
			this.isVisibilidadCeldaActualizarPerfilOpcion=true;
			this.isVisibilidadCeldaEliminarPerfilOpcion=true;
			this.isVisibilidadCeldaCancelarPerfilOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPerfilOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=false;
			this.isVisibilidadCeldaModificarPerfilOpcion=false;
			this.isVisibilidadCeldaActualizarPerfilOpcion=true;
			this.isVisibilidadCeldaEliminarPerfilOpcion=false;
			this.isVisibilidadCeldaCancelarPerfilOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPerfilOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=true;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=true;
			this.isVisibilidadCeldaModificarPerfilOpcion=false;
			this.isVisibilidadCeldaActualizarPerfilOpcion=false;
			this.isVisibilidadCeldaEliminarPerfilOpcion=false;
			this.isVisibilidadCeldaCancelarPerfilOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilOpcion=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPerfilOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=false;
			this.isVisibilidadCeldaActualizarPerfilOpcion=false;
			this.isVisibilidadCeldaEliminarPerfilOpcion=false;
			this.isVisibilidadCeldaCancelarPerfilOpcion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPerfilOpcion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=false;
			this.isVisibilidadCeldaModificarPerfilOpcion=true;
			this.isVisibilidadCeldaActualizarPerfilOpcion=false;
			this.isVisibilidadCeldaEliminarPerfilOpcion=false;
			this.isVisibilidadCeldaCancelarPerfilOpcion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilOpcion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PerfilOpcionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPerfilOpcion=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=true;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=true;
		} else {
			this.actualizarEstadoPanelsPerfilOpcion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPerfilOpcion=false;
			//this.isVisibilidadCeldaVerFormPerfilOpcion=false;
			this.isVisibilidadCeldaDuplicarPerfilOpcion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!perfilopcionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
		} else {
			this.isVisibilidadCeldaNuevoPerfilOpcion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilOpcion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(perfilopcionSessionBean.getEsGuardarRelacionado()) {
			if(!perfilopcionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;												
			}
			
			this.jButtonCerrarPerfilOpcion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPerfilOpcion=false;
		}
		
		if(!this.permiteMantenimiento(this.perfilopcion)) {
			this.isVisibilidadCeldaActualizarPerfilOpcion=false;
			this.isVisibilidadCeldaEliminarPerfilOpcion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPerfilOpcion() {
	}
	
	public void actualizarEstadoPanelsPerfilOpcion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPerfilOpcion!=null) {
				this.jScrollPanelDatosEdicionPerfilOpcion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilOpcion!=null) {
				this.jScrollPanelDatosPerfilOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilOpcion!=null) {
				this.jPanelPaginacionPerfilOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPerfilOpcion!=null) {
				this.jScrollPanelDatosEdicionPerfilOpcion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPerfilOpcion!=null) {
				this.jScrollPanelDatosPerfilOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilOpcion!=null) {
				this.jPanelPaginacionPerfilOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPerfilOpcion!=null) {
				this.jScrollPanelDatosEdicionPerfilOpcion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfilOpcion!=null) {
				this.jScrollPanelDatosPerfilOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilOpcion!=null) {
				this.jPanelPaginacionPerfilOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPerfilOpcion!=null) {
				this.jScrollPanelDatosEdicionPerfilOpcion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfilOpcion!=null) {
				this.jScrollPanelDatosPerfilOpcion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilOpcion!=null) {
				this.jPanelPaginacionPerfilOpcion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPerfilOpcion!=null) {
				this.jScrollPanelDatosEdicionPerfilOpcion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilOpcion!=null) {
				this.jScrollPanelDatosPerfilOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilOpcion!=null) {
				this.jPanelPaginacionPerfilOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPerfilOpcion!=null) {
				this.jScrollPanelDatosEdicionPerfilOpcion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilOpcion!=null) {
				this.jScrollPanelDatosPerfilOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilOpcion!=null) {
				this.jPanelPaginacionPerfilOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPerfilOpcion!=null) {
				this.jScrollPanelDatosEdicionPerfilOpcion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilOpcion!=null) {
				this.jScrollPanelDatosPerfilOpcion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilOpcion!=null) {
				this.jPanelPaginacionPerfilOpcion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
					this.jTabbedPaneBusquedasPerfilOpcion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.perfilopcionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilOpcion!=null) {
				this.jTabbedPaneBusquedasPerfilOpcion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPerfilOpcion!=null) {
				this.jPanelParametrosReportesPerfilOpcion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaSistema(Boolean isParaSistema){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSistemaNegation=!isParaSistema;

			this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion=isParaSistema;
			if(!this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);}

			this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer=isParaSistema;
			if(!this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);}

			this.isVisibilidadFK_IdGrupoOpcion=isParaSistemaNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelFK_IdGrupoOpcionPerfilOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);}

			this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer=isParaModulo;
			if(!this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);}

			this.isVisibilidadFK_IdGrupoOpcion=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelFK_IdGrupoOpcionPerfilOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoOpcion(Boolean isParaGrupoOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoOpcionNegation=!isParaGrupoOpcion;

			this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion=isParaGrupoOpcion;
			if(!this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);}

			this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer=isParaGrupoOpcion;
			if(!this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);}

			this.isVisibilidadFK_IdGrupoOpcion=isParaGrupoOpcion;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelFK_IdGrupoOpcionPerfilOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaPerfil(Boolean isParaPerfil){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPerfilNegation=!isParaPerfil;

			this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion=isParaPerfil;
			if(!this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);}

			this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer=isParaPerfil;
			if(!this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);}

			this.isVisibilidadFK_IdGrupoOpcion=isParaPerfilNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelFK_IdGrupoOpcionPerfilOpcion);}
		}
		
	}

	public void setVisibilidadBusquedasParaOpcion(Boolean isParaOpcion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOpcionNegation=!isParaOpcion;

			this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion=isParaOpcion;
			if(!this.isVisibilidadBusquedaPorIdPerfilPorIdOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);}

			this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer=isParaOpcionNegation;
			if(!this.isVisibilidadBusquedaPorIdSisPorIdModPorIdPer) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);}

			this.isVisibilidadFK_IdGrupoOpcion=isParaOpcionNegation;
			if(!this.isVisibilidadFK_IdGrupoOpcion) {this.jTabbedPaneBusquedasPerfilOpcion.remove(jPanelFK_IdGrupoOpcionPerfilOpcion);}
		}
		
	}
	
	
	
	

	public String registrarSesionPerfilOpcionParaBusquedaOpciones() throws Exception {
		Boolean isPaginaPopupOpcion=false;

		try {

			if(perfilopcionSessionBean==null) {
				perfilopcionSessionBean=new PerfilOpcionSessionBean();
			}

			if(opcionSessionBean==null) {
				opcionSessionBean=new OpcionSessionBean();
			}

			opcionSessionBean.setsPathNavegacionActual(perfilopcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+OpcionConstantesFunciones.SCLASSWEBTITULO);
			opcionSessionBean.setisPermiteRecargarInformacion(false);
			opcionSessionBean.setisPaginaPopup(true);
			isPaginaPopupOpcion=opcionSessionBean.getisPaginaPopup();
			opcionSessionBean.setisPaginaPopup(false);
			opcionSessionBean.setEstaModoBusqueda(true);
			opcionSessionBean.setsFuncionBusquedaRapida("window.opener.perfilopcionFuncionGeneral.setCombosCodigoDesdeBusquedaid_opcion(TO_REPLACE);");
			opcionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeOpcion(true);
			opcionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeOpcion(PerfilOpcionConstantesFunciones.SNOMBREOPCION);
			//opcionSessionBean.setisBusquedaDesdeForeignKeySesionPerfilOpcion(true);
			//opcionSessionBean.setlidPerfilOpcionActual(this.idPerfilOpcionActual);

			perfilopcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPerfilOpcion(true);
			perfilopcionSessionBean.setlIdPerfilOpcionActualForeignKey(this.idPerfilOpcionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PerfilOpcionSessionBean perfilopcionSessionBean=new PerfilOpcionSessionBean();
		
		if(this.perfilopcionSessionBean==null) {
			this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		}
		
		this.perfilopcionSessionBean.setsUltimaBusquedaPerfilOpcion(this.getsAccionBusqueda());
		this.perfilopcionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.perfilopcionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdPerfilPorIdOpcion")) {
			perfilopcionSessionBean.setid_sistema(this.getid_sistemaBusquedaPorIdPerfilPorIdOpcion());	
			perfilopcionSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdPerfilPorIdOpcion());	
			perfilopcionSessionBean.setid_grupo_opcion(this.getid_grupo_opcionBusquedaPorIdPerfilPorIdOpcion());	
			perfilopcionSessionBean.setid_perfil(this.getid_perfilBusquedaPorIdPerfilPorIdOpcion());	
			perfilopcionSessionBean.setid_opcion(this.getid_opcionBusquedaPorIdPerfilPorIdOpcion());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIdSisPorIdModPorIdPer")) {
			perfilopcionSessionBean.setid_sistema(this.getid_sistemaBusquedaPorIdSisPorIdModPorIdPer());	
			perfilopcionSessionBean.setid_modulo(this.getid_moduloBusquedaPorIdSisPorIdModPorIdPer());	
			perfilopcionSessionBean.setid_grupo_opcion(this.getid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer());	
			perfilopcionSessionBean.setid_perfil(this.getid_perfilBusquedaPorIdSisPorIdModPorIdPer());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdGrupoOpcion")) {
			perfilopcionSessionBean.setid_grupo_opcion(this.getid_grupo_opcionFK_IdGrupoOpcion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PerfilOpcionSessionBean perfilopcionSessionBean=new PerfilOpcionSessionBean();
		
		if(this.perfilopcionSessionBean==null) {
			this.perfilopcionSessionBean=new PerfilOpcionSessionBean();
		}
		
		if(this.perfilopcionSessionBean.getsUltimaBusquedaPerfilOpcion()!=null&&!this.perfilopcionSessionBean.getsUltimaBusquedaPerfilOpcion().equals("")) {
			this.setsAccionBusqueda(perfilopcionSessionBean.getsUltimaBusquedaPerfilOpcion());
			this.setiNumeroPaginacion(perfilopcionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(perfilopcionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdPerfilPorIdOpcion")) {
				this.setid_sistemaBusquedaPorIdPerfilPorIdOpcion(perfilopcionSessionBean.getid_sistema());
				perfilopcionSessionBean.setid_sistema(-1L);
				this.setid_moduloBusquedaPorIdPerfilPorIdOpcion(perfilopcionSessionBean.getid_modulo());
				perfilopcionSessionBean.setid_modulo(-1L);
				this.setid_grupo_opcionBusquedaPorIdPerfilPorIdOpcion(perfilopcionSessionBean.getid_grupo_opcion());
				perfilopcionSessionBean.setid_grupo_opcion(null);
				this.setid_perfilBusquedaPorIdPerfilPorIdOpcion(perfilopcionSessionBean.getid_perfil());
				perfilopcionSessionBean.setid_perfil(-1L);
				this.setid_opcionBusquedaPorIdPerfilPorIdOpcion(perfilopcionSessionBean.getid_opcion());
				perfilopcionSessionBean.setid_opcion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdSisPorIdModPorIdPer")) {
				this.setid_sistemaBusquedaPorIdSisPorIdModPorIdPer(perfilopcionSessionBean.getid_sistema());
				perfilopcionSessionBean.setid_sistema(-1L);
				this.setid_moduloBusquedaPorIdSisPorIdModPorIdPer(perfilopcionSessionBean.getid_modulo());
				perfilopcionSessionBean.setid_modulo(-1L);
				this.setid_grupo_opcionBusquedaPorIdSisPorIdModPorIdPer(perfilopcionSessionBean.getid_grupo_opcion());
				perfilopcionSessionBean.setid_grupo_opcion(null);
				this.setid_perfilBusquedaPorIdSisPorIdModPorIdPer(perfilopcionSessionBean.getid_perfil());
				perfilopcionSessionBean.setid_perfil(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdGrupoOpcion")) {
				this.setid_grupo_opcionFK_IdGrupoOpcion(perfilopcionSessionBean.getid_grupo_opcion());
				perfilopcionSessionBean.setid_grupo_opcion(null);
			}
		}
		
		this.perfilopcionSessionBean.setsUltimaBusquedaPerfilOpcion("");
		this.perfilopcionSessionBean.setiNumeroPaginacion(PerfilOpcionConstantesFunciones.INUMEROPAGINACION);
		this.perfilopcionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPerfilOpcion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPerfilOpcion() {
		this.updateBorderResaltarBusquedasFormularioPerfilOpcion();
		this.updateVisibilidadBusquedasFormularioPerfilOpcion();
		this.updateHabilitarBusquedasFormularioPerfilOpcion();
	}
	
	public void updateBorderResaltarBusquedasFormularioPerfilOpcion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPerfilOpcion.getComponents().length>0) {
	

		if(this.perfilopcionConstantesFunciones.resaltarBusquedaPorIdPerfilPorIdOpcionPerfilOpcion!=null) {
			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
				jPanel.setBorder(this.perfilopcionConstantesFunciones.resaltarBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
			}
		}

		if(this.perfilopcionConstantesFunciones.resaltarBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion!=null) {
			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
				jPanel.setBorder(this.perfilopcionConstantesFunciones.resaltarBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
			}
		}

		if(this.perfilopcionConstantesFunciones.resaltarFK_IdGrupoOpcionPerfilOpcion!=null) {
			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelFK_IdGrupoOpcionPerfilOpcion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
				jPanel.setBorder(this.perfilopcionConstantesFunciones.resaltarFK_IdGrupoOpcionPerfilOpcion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPerfilOpcion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPerfilOpcion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilopcionConstantesFunciones.mostrarBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
			if(!this.perfilopcionConstantesFunciones.mostrarBusquedaPorIdPerfilPorIdOpcionPerfilOpcion && index>-1) {
				this.jTabbedPaneBusquedasPerfilOpcion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilopcionConstantesFunciones.mostrarBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
			if(!this.perfilopcionConstantesFunciones.mostrarBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion && index>-1) {
				this.jTabbedPaneBusquedasPerfilOpcion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelFK_IdGrupoOpcionPerfilOpcion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilopcionConstantesFunciones.mostrarFK_IdGrupoOpcionPerfilOpcion);
			if(!this.perfilopcionConstantesFunciones.mostrarFK_IdGrupoOpcionPerfilOpcion && index>-1) {
				this.jTabbedPaneBusquedasPerfilOpcion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPerfilOpcion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPerfilOpcion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilopcionConstantesFunciones.activarBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
				this.jTabbedPaneBusquedasPerfilOpcion.setEnabledAt(index,this.perfilopcionConstantesFunciones.activarBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
			}

			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilopcionConstantesFunciones.activarBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
				this.jTabbedPaneBusquedasPerfilOpcion.setEnabledAt(index,this.perfilopcionConstantesFunciones.activarBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
			}

			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelFK_IdGrupoOpcionPerfilOpcion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilopcionConstantesFunciones.activarFK_IdGrupoOpcionPerfilOpcion);
				this.jTabbedPaneBusquedasPerfilOpcion.setEnabledAt(index,this.perfilopcionConstantesFunciones.activarFK_IdGrupoOpcionPerfilOpcion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPerfilOpcion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdPerfilPorIdOpcion")) {
			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);

			this.jTabbedPaneBusquedasPerfilOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);

			this.perfilopcionConstantesFunciones.setResaltarBusquedaPorIdPerfilPorIdOpcionPerfilOpcion(resaltar);

			jPanel.setBorder(this.perfilopcionConstantesFunciones.resaltarBusquedaPorIdPerfilPorIdOpcionPerfilOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIdSisPorIdModPorIdPer")) {
			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);

			this.jTabbedPaneBusquedasPerfilOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);

			this.perfilopcionConstantesFunciones.setResaltarBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion(resaltar);

			jPanel.setBorder(this.perfilopcionConstantesFunciones.resaltarBusquedaPorIdSisPorIdModPorIdPerPerfilOpcion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdGrupoOpcion")) {
			index= this.jTabbedPaneBusquedasPerfilOpcion.indexOfComponent(this.jPanelFK_IdGrupoOpcionPerfilOpcion);

			this.jTabbedPaneBusquedasPerfilOpcion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilOpcion.getComponent(index);

			this.perfilopcionConstantesFunciones.setResaltarFK_IdGrupoOpcionPerfilOpcion(resaltar);

			jPanel.setBorder(this.perfilopcionConstantesFunciones.resaltarFK_IdGrupoOpcionPerfilOpcion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPerfilOpcion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPerfilOpcion() throws Exception {

		if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPerfilOpcion();
		this.updateVisibilidadResaltarControlesFormularioPerfilOpcion();
		this.updateHabilitarResaltarControlesFormularioPerfilOpcion();
		
	}
	
	public void updateBorderResaltarControlesFormularioPerfilOpcion() throws Exception {
		if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.perfilopcionConstantesFunciones.resaltaridPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltaridPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarid_sistemaPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarid_sistemaPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarid_moduloPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarid_moduloPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarid_grupo_opcionPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarid_grupo_opcionPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarid_perfilPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarid_perfilPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarid_opcionPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarid_opcionPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltartodoPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltartodoPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltaringresoPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltaringresoPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarmodificacionPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarmodificacionPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltareliminacionPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltareliminacionPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarguardar_cambiosPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarguardar_cambiosPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarconsultaPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarconsultaPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarbusquedaPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarbusquedaPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarreportePerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarreportePerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarordenPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarordenPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarpaginacion_medioPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarpaginacion_medioPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarpaginacion_altoPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarpaginacion_altoPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarpaginacion_todoPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarpaginacion_todoPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarduplicarPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarduplicarPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarcopiarPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarcopiarPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarcon_precargarPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarcon_precargarPerfilOpcion);}
		if(this.perfilopcionConstantesFunciones.resaltarestadoPerfilOpcion!=null && this.jInternalFrameDetalleFormPerfilOpcion!=null) {this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.setBorder(this.perfilopcionConstantesFunciones.resaltarestadoPerfilOpcion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPerfilOpcion() throws Exception {		
		if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
	
		//this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostraridPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelidPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostraridPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_sistemaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelid_sistemaPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_sistemaPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_moduloPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelid_moduloPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_moduloPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_grupo_opcionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelid_grupo_opcionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_grupo_opcionPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_perfilPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelid_perfilPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_perfilPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_opcionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelid_opcionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_opcionPerfilOpcion);
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarid_opcionPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrartodoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPaneltodoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrartodoPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostraringresoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelingresoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostraringresoPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarmodificacionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelmodificacionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarmodificacionPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrareliminacionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPaneleliminacionPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrareliminacionPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarguardar_cambiosPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelguardar_cambiosPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarguardar_cambiosPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarconsultaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelconsultaPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarconsultaPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarbusquedaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelbusquedaPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarbusquedaPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarreportePerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelreportePerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarreportePerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarordenPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelordenPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarordenPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarpaginacion_medioPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelpaginacion_medioPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarpaginacion_medioPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarpaginacion_altoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelpaginacion_altoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarpaginacion_altoPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarpaginacion_todoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelpaginacion_todoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarpaginacion_todoPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarduplicarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelduplicarPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarduplicarPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarcopiarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelcopiarPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarcopiarPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarcon_precargarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelcon_precargarPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarcon_precargarPerfilOpcion);
		//this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarestadoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jPanelestadoPerfilOpcion.setVisible(this.perfilopcionConstantesFunciones.mostrarestadoPerfilOpcion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPerfilOpcion() throws Exception {
		if(this.jInternalFrameDetalleFormPerfilOpcion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfilOpcion!=null) {
	
		this.jInternalFrameDetalleFormPerfilOpcion.jLabelidPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activaridPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_sistemaPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarid_sistemaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_moduloPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarid_moduloPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_grupo_opcionPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarid_grupo_opcionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_perfilPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarid_perfilPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jComboBoxid_opcionPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarid_opcionPerfilOpcion);
			this.jInternalFrameDetalleFormPerfilOpcion.jButtonid_opcionPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarid_opcionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxtodoPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activartodoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxingresoPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activaringresoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxmodificacionPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarmodificacionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxeliminacionPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activareliminacionPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxguardar_cambiosPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarguardar_cambiosPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxconsultaPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarconsultaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxbusquedaPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarbusquedaPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxreportePerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarreportePerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxordenPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarordenPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_medioPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarpaginacion_medioPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_altoPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarpaginacion_altoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxpaginacion_todoPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarpaginacion_todoPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxduplicarPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarduplicarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcopiarPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarcopiarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxcon_precargarPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarcon_precargarPerfilOpcion);
		this.jInternalFrameDetalleFormPerfilOpcion.jCheckBoxestadoPerfilOpcion.setEnabled(this.perfilopcionConstantesFunciones.activarestadoPerfilOpcion);
		}
	}
	
		
}