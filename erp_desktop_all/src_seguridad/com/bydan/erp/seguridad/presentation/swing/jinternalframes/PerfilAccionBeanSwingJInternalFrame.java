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

import com.bydan.erp.seguridad.util.PerfilAccionConstantesFunciones;
import com.bydan.erp.seguridad.util.PerfilAccionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PerfilAccionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.PerfilAccionBean;
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
public class PerfilAccionBeanSwingJInternalFrame extends PerfilAccionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PerfilAccionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PerfilAccion> perfilaccionValidator = new ClassValidator<PerfilAccion>(PerfilAccion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PerfilAccion perfilaccion;	
	public PerfilAccion perfilaccionAux;
	public PerfilAccion perfilaccionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PerfilAccion perfilaccionTotales;
	public Long idPerfilAccionActual;
	public Long iIdNuevoPerfilAccion=0L;
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

	public String sFinalQueryComboAccion="";

	public List<Accion> accionsForeignKey;

	public List<Accion> getaccionsForeignKey() {
		return accionsForeignKey;
	}

	public void setaccionsForeignKey(List<Accion> accionsForeignKey) {
		this.accionsForeignKey = accionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Accion accionForeignKey;

	public Accion getaccionForeignKey() {
		return accionForeignKey;
	}

	public void setaccionForeignKey(Accion accionForeignKey) {
		this.accionForeignKey = accionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idPerfilActual=0L;

	public Long getidPerfilActual() {
		return idPerfilActual;
	}

	public void setidPerfilActual(Long idPerfilActual) {
		this.idPerfilActual= idPerfilActual;
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
	
	public Boolean isPermisoTodoPerfilAccion;
	public Boolean isPermisoNuevoPerfilAccion;
	public Boolean isPermisoActualizarPerfilAccion;
	public Boolean isPermisoActualizarOriginalPerfilAccion;
	public Boolean isPermisoEliminarPerfilAccion;
	public Boolean isPermisoGuardarCambiosPerfilAccion;
	public Boolean isPermisoConsultaPerfilAccion;
	public Boolean isPermisoBusquedaPerfilAccion;
	public Boolean isPermisoReportePerfilAccion;
	public Boolean isPermisoPaginacionMedioPerfilAccion;
	public Boolean isPermisoPaginacionAltoPerfilAccion;
	public Boolean isPermisoPaginacionTodoPerfilAccion;
	public Boolean isPermisoCopiarPerfilAccion;
	public Boolean isPermisoVerFormPerfilAccion;
	public Boolean isPermisoDuplicarPerfilAccion;
	public Boolean isPermisoOrdenPerfilAccion;
	
	
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
	
	public PerfilAccionParameterReturnGeneral perfilaccionReturnGeneral;
	public PerfilAccionParameterReturnGeneral perfilaccionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPerfilAccion=false;
	public Boolean esParaAccionDesdeFormularioPerfilAccion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PerfilAccionSessionBeanAdditional perfilaccionSessionBeanAdditional=null;
	
	public PerfilAccionSessionBeanAdditional getPerfilAccionSessionBeanAdditional() {
		return this.perfilaccionSessionBeanAdditional;
	}
	
	public void setPerfilAccionSessionBeanAdditional(PerfilAccionSessionBeanAdditional perfilaccionSessionBeanAdditional) {
		try {
			this.perfilaccionSessionBeanAdditional=perfilaccionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PerfilAccionBeanSwingJInternalFrameAdditional perfilaccionBeanSwingJInternalFrameAdditional=null;
	//public class PerfilAccionBeanSwingJInternalFrame
	
	public PerfilAccionBeanSwingJInternalFrameAdditional getPerfilAccionBeanSwingJInternalFrameAdditional() {
		return this.perfilaccionBeanSwingJInternalFrameAdditional;
	}
	
	public void setPerfilAccionBeanSwingJInternalFrameAdditional(PerfilAccionBeanSwingJInternalFrameAdditional perfilaccionBeanSwingJInternalFrameAdditional) {
		try {
			this.perfilaccionBeanSwingJInternalFrameAdditional=perfilaccionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PerfilAccionLogic perfilaccionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PerfilAccion perfilaccionBean;
	public PerfilAccionConstantesFunciones perfilaccionConstantesFunciones;
	//public PerfilAccionParameterReturnGeneral perfilaccionReturnGeneral;
	
	//FK
	
	public PerfilLogic perfilLogic;
	public AccionLogic accionLogic;
	
	//PARAMETROS
	
	
	//public List<PerfilAccion> perfilaccions;	
	//public List<PerfilAccion> perfilaccionsEliminados;
	//public List<PerfilAccion> perfilaccionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPerfilAccion=false;
	public Boolean isVisibilidadCeldaDuplicarPerfilAccion=true;
	public Boolean isVisibilidadCeldaCopiarPerfilAccion=true;
	public Boolean isVisibilidadCeldaVerFormPerfilAccion=true;
	public Boolean isVisibilidadCeldaOrdenPerfilAccion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
	public Boolean isVisibilidadCeldaModificarPerfilAccion=false;
	public Boolean isVisibilidadCeldaActualizarPerfilAccion=false;
	public Boolean isVisibilidadCeldaEliminarPerfilAccion=false;
	public Boolean isVisibilidadCeldaCancelarPerfilAccion=false;
	public Boolean isVisibilidadCeldaGuardarPerfilAccion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPerfilAccion=false;	
	
	
	public Boolean isVisibilidadFK_IdAccion=false;
	public Boolean isVisibilidadFK_IdPerfil=false;
	
	public Long getiIdNuevoPerfilAccion() {
		return this.iIdNuevoPerfilAccion;
	}

	public void setiIdNuevoPerfilAccion(Long iIdNuevoPerfilAccion) {
		this.iIdNuevoPerfilAccion = iIdNuevoPerfilAccion;
	}
	
	public Long getidPerfilAccionActual() {
		return this.idPerfilAccionActual;
	}

	public void setidPerfilAccionActual(Long idPerfilAccionActual) {
		this.idPerfilAccionActual = idPerfilAccionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PerfilAccion getperfilaccion() {
		return this.perfilaccion;
	}

	public void setperfilaccion(PerfilAccion perfilaccion) {
		this.perfilaccion = perfilaccion;
	}
	
	public PerfilAccion getperfilaccionAux() {
		return this.perfilaccionAux;
	}

	public void setperfilaccionAux(PerfilAccion perfilaccionAux) {
		this.perfilaccionAux = perfilaccionAux;
	}				
	
	public PerfilAccion getperfilaccionAnterior() {
		return this.perfilaccionAnterior;
	}

	public void setperfilaccionAnterior(PerfilAccion perfilaccionAnterior) {
		this.perfilaccionAnterior = perfilaccionAnterior;
	}	
	
	public PerfilAccion getperfilaccionTotales() {
		return this.perfilaccionTotales;
	}

	public void setperfilaccionTotales(PerfilAccion perfilaccionTotales) {
		this.perfilaccionTotales = perfilaccionTotales;
	}	
	
	public PerfilAccion getperfilaccionBean() {
		return this.perfilaccionBean;
	}

	public void setperfilaccionBean(PerfilAccion perfilaccionBean) {
		this.perfilaccionBean = perfilaccionBean;
	}	
	
	public PerfilAccionParameterReturnGeneral getperfilaccionReturnGeneral() {
		return this.perfilaccionReturnGeneral;
	}

	public void setperfilaccionReturnGeneral(PerfilAccionParameterReturnGeneral perfilaccionReturnGeneral) {
		this.perfilaccionReturnGeneral = perfilaccionReturnGeneral;
	}	
	
	
	public Long id_accionFK_IdAccion=-1L;

	public Long getid_accionFK_IdAccion() {
		return this.id_accionFK_IdAccion;
	}

	public void setid_accionFK_IdAccion(Long id_accionFK_IdAccion) {
		this.id_accionFK_IdAccion = id_accionFK_IdAccion;
	}

	public Long id_perfilFK_IdPerfil=-1L;

	public Long getid_perfilFK_IdPerfil() {
		return this.id_perfilFK_IdPerfil;
	}

	public void setid_perfilFK_IdPerfil(Long id_perfilFK_IdPerfil) {
		this.id_perfilFK_IdPerfil = id_perfilFK_IdPerfil;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PerfilAccionLogic getPerfilAccionLogic()	{		
		return perfilaccionLogic;
	}

	public void setPerfilAccionLogic(PerfilAccionLogic perfilaccionLogic) {
		this.perfilaccionLogic = perfilaccionLogic;
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
	
	public Boolean getIsEsNuevoPerfilAccion() {
		return isEsNuevoPerfilAccion;
	}

	public void setIsEsNuevoPerfilAccion(Boolean isEsNuevoPerfilAccion) {
		this.isEsNuevoPerfilAccion = isEsNuevoPerfilAccion;
	}

	public Boolean getEsParaAccionDesdeFormularioPerfilAccion() {
		return esParaAccionDesdeFormularioPerfilAccion;
	}
	
	public void setEsParaAccionDesdeFormularioPerfilAccion(Boolean esParaAccionDesdeFormularioPerfilAccion) {
		this.esParaAccionDesdeFormularioPerfilAccion = esParaAccionDesdeFormularioPerfilAccion;
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

			if(this.perfilaccionSessionBean==null) {
				this.perfilaccionSessionBean=new PerfilAccionSessionBean();
			}

			if(!this.perfilaccionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
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
					perfilLogic.getEntityWithConnection(perfilaccionSessionBean.getlidPerfilActual());
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

	public void cargarCombosAccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.accionsForeignKey=new ArrayList<Accion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AccionLogic accionLogic=new AccionLogic();

			accionLogic.getAccionDataAccess().setIsForForeingKeyData(true);

			if(this.perfilaccionSessionBean==null) {
				this.perfilaccionSessionBean=new PerfilAccionSessionBean();
			}

			if(!this.perfilaccionSessionBean.getisBusquedaDesdeForeignKeySesionAccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionLogic.getAccionDataAccess().setIsForForeingKeyData(true);

					accionLogic.getTodosAccionsWithConnection(sFinalQuery,new Pagination());

					this.accionsForeignKey=accionLogic.getAccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					accionLogic.getEntityWithConnection(perfilaccionSessionBean.getlidAccionActual());
					this.accionsForeignKey.add(accionLogic.getAccion());
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

					if(this.perfilaccion!=null) {
						this.perfilaccion.setPerfil(perfilTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
						this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setSelectedItem(perfilTemp);
					}
				} else {
					//jComboBoxid_perfilPerfilAccion.setSelectedItem(perfilTemp);
					if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
						if(this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPerfil") || sFormularioTipoBusqueda.equals("Todos")){
					if(perfilTemp!=null && jComboBoxid_perfilFK_IdPerfilPerfilAccion!=null) {
						jComboBoxid_perfilFK_IdPerfilPerfilAccion.setSelectedItem(perfilTemp);
					} else {
						if(jComboBoxid_perfilFK_IdPerfilPerfilAccion!=null) {
							//jComboBoxid_perfilFK_IdPerfilPerfilAccion.setSelectedItem(perfilTemp);
							if(jComboBoxid_perfilFK_IdPerfilPerfilAccion.getItemCount()>0) {
								jComboBoxid_perfilFK_IdPerfilPerfilAccion.setSelectedIndex(0);
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
	public void setActualPerfilForeignKeyGenerico(Long idPerfilSeleccionado,JComboBox jComboBoxid_perfilPerfilAccionGenerico)throws Exception
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
				jComboBoxid_perfilPerfilAccionGenerico.setSelectedItem(perfilTemp);
			} else {
				if(jComboBoxid_perfilPerfilAccionGenerico!=null && jComboBoxid_perfilPerfilAccionGenerico.getItemCount()>0) {
					jComboBoxid_perfilPerfilAccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAccionForeignKey(Long idAccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Accion  accionTemp=null;

			for(Accion accionAux:accionsForeignKey) {
				if(accionAux.getId()!=null && accionAux.getId().equals(idAccionSeleccionado)) {
					accionTemp=accionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(accionTemp!=null) {

					if(this.perfilaccion!=null) {
						this.perfilaccion.setAccion(accionTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
						this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setSelectedItem(accionTemp);
					}
				} else {
					//jComboBoxid_accionPerfilAccion.setSelectedItem(accionTemp);
					if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
						if(this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(accionTemp!=null && jComboBoxid_accionFK_IdAccionPerfilAccion!=null) {
						jComboBoxid_accionFK_IdAccionPerfilAccion.setSelectedItem(accionTemp);
					} else {
						if(jComboBoxid_accionFK_IdAccionPerfilAccion!=null) {
							//jComboBoxid_accionFK_IdAccionPerfilAccion.setSelectedItem(accionTemp);
							if(jComboBoxid_accionFK_IdAccionPerfilAccion.getItemCount()>0) {
								jComboBoxid_accionFK_IdAccionPerfilAccion.setSelectedIndex(0);
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

	public String getActualAccionForeignKeyDescripcion(Long idAccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Accion  accionTemp=null;

			for(Accion accionAux:accionsForeignKey) {
				if(accionAux.getId()!=null && accionAux.getId().equals(idAccionSeleccionado)) {
					accionTemp=accionAux;
					break;
				}
			}


			sDescripcion=AccionConstantesFunciones.getAccionDescripcion(accionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAccionForeignKeyGenerico(Long idAccionSeleccionado,JComboBox jComboBoxid_accionPerfilAccionGenerico)throws Exception
	{
		try
		{
			Accion  accionTemp=null;

			for(Accion accionAux:accionsForeignKey) {
				if(accionAux.getId()!=null && accionAux.getId().equals(idAccionSeleccionado)) {
					accionTemp=accionAux;
					break;
				}
			}

			if(accionTemp!=null) {
				jComboBoxid_accionPerfilAccionGenerico.setSelectedItem(accionTemp);
			} else {
				if(jComboBoxid_accionPerfilAccionGenerico!=null && jComboBoxid_accionPerfilAccionGenerico.getItemCount()>0) {
					jComboBoxid_accionPerfilAccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPerfilForeignKey(PerfilAccion perfilaccion,JComboBox jComboBoxid_perfilPerfilAccionGenerico)throws Exception
	{
		try
		{
			Perfil  perfilAux=new Perfil();

			if(jComboBoxid_perfilPerfilAccionGenerico==null) {
				perfilAux=(Perfil)this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.getSelectedItem();
			} else {
				perfilAux=(Perfil)jComboBoxid_perfilPerfilAccionGenerico.getSelectedItem();
			}

			if(perfilAux!=null && perfilAux.getId()!=null) {
				perfilaccion.setid_perfil(perfilAux.getId());
				perfilaccion.setperfil_descripcion(PerfilAccionConstantesFunciones.getPerfilDescripcion(perfilAux));
				perfilaccion.setPerfil(perfilAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAccionForeignKey(PerfilAccion perfilaccion,JComboBox jComboBoxid_accionPerfilAccionGenerico)throws Exception
	{
		try
		{
			Accion  accionAux=new Accion();

			if(jComboBoxid_accionPerfilAccionGenerico==null) {
				accionAux=(Accion)this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.getSelectedItem();
			} else {
				accionAux=(Accion)jComboBoxid_accionPerfilAccionGenerico.getSelectedItem();
			}

			if(accionAux!=null && accionAux.getId()!=null) {
				perfilaccion.setid_accion(accionAux.getId());
				perfilaccion.setaccion_descripcion(PerfilAccionConstantesFunciones.getAccionDescripcion(accionAux));
				perfilaccion.setAccion(accionAux);			}
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

					if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilAccion!=null) { 
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.addItem(perfil);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilAccion!=null) { 
					}

					if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPerfil") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_perfilFK_IdPerfilPerfilAccion.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jComboBoxid_perfilFK_IdPerfilPerfilAccion.addItem(perfil);
							}
						}

						if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilAccion!=null) { 
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.removeAllItems();

							for(Accion accion:this.accionsForeignKey) {
								this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.addItem(accion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilAccion!=null) { 
					}

					if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_accionFK_IdAccionPerfilAccion.removeAllItems();

							for(Accion accion:this.accionsForeignKey) {
								this.jComboBoxid_accionFK_IdAccionPerfilAccion.addItem(accion);
							}
						}

						if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePerfilForeignKey(Perfil perfil,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setSelectedItem(perfil);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_perfilFK_IdPerfilPerfilAccion.setSelectedItem(perfil);
						} else {
							this.jComboBoxid_perfilFK_IdPerfilPerfilAccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAccionForeignKey(Accion accion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setSelectedItem(accion);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_accionFK_IdAccionPerfilAccion.setSelectedItem(accion);
						} else {
							this.jComboBoxid_accionFK_IdAccionPerfilAccion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPerfilAccion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PerfilAccionConstantesFunciones.refrescarForeignKeysDescripcionesPerfilAccion(this.perfilaccionLogic.getPerfilAccions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PerfilAccionConstantesFunciones.refrescarForeignKeysDescripcionesPerfilAccion(this.perfilaccions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Perfil.class));
		classes.add(new Classe(Accion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//perfilaccionLogic.setPerfilAccions(this.perfilaccions);
			perfilaccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PerfilAccionParameterReturnGeneral getPerfilAccionParameterGeneral() {
		return this.perfilaccionParameterGeneral;
	}
	
	public void setPerfilAccionParameterGeneral(PerfilAccionParameterReturnGeneral perfilaccionParameterGeneral) {
		this.perfilaccionParameterGeneral = perfilaccionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPerfilAccion() {
		return isPermisoTodoPerfilAccion;
	}

	public void setIsPermisoTodoPerfilAccion(Boolean isPermisoTodoPerfilAccion) {
		this.isPermisoTodoPerfilAccion = isPermisoTodoPerfilAccion;
	}

	public Boolean getIsPermisoNuevoPerfilAccion() {
		return isPermisoNuevoPerfilAccion;
	}

	public void setIsPermisoNuevoPerfilAccion(Boolean isPermisoNuevoPerfilAccion) {
		this.isPermisoNuevoPerfilAccion = isPermisoNuevoPerfilAccion;
	}

	public Boolean getIsPermisoActualizarPerfilAccion() {
		return isPermisoActualizarPerfilAccion;
	}

	public void setIsPermisoActualizarPerfilAccion(Boolean isPermisoActualizarPerfilAccion) {
		this.isPermisoActualizarPerfilAccion = isPermisoActualizarPerfilAccion;
	}

	public Boolean getIsPermisoEliminarPerfilAccion() {
		return isPermisoEliminarPerfilAccion;
	}

	public void setIsPermisoEliminarPerfilAccion(Boolean isPermisoEliminarPerfilAccion) {
		this.isPermisoEliminarPerfilAccion = isPermisoEliminarPerfilAccion;
	}

	public Boolean getIsPermisoGuardarCambiosPerfilAccion() {
		return isPermisoGuardarCambiosPerfilAccion;
	}

	public void setIsPermisoGuardarCambiosPerfilAccion(Boolean isPermisoGuardarCambiosPerfilAccion) {
		this.isPermisoGuardarCambiosPerfilAccion = isPermisoGuardarCambiosPerfilAccion;
	}
	
	public Boolean getIsPermisoConsultaPerfilAccion() {
		return isPermisoConsultaPerfilAccion;
	}

	public void setIsPermisoConsultaPerfilAccion(Boolean isPermisoConsultaPerfilAccion) {
		this.isPermisoConsultaPerfilAccion = isPermisoConsultaPerfilAccion;
	}

	public Boolean getIsPermisoBusquedaPerfilAccion() {
		return isPermisoBusquedaPerfilAccion;
	}

	public void setIsPermisoBusquedaPerfilAccion(Boolean isPermisoBusquedaPerfilAccion) {
		this.isPermisoBusquedaPerfilAccion = isPermisoBusquedaPerfilAccion;
	}

	public Boolean getIsPermisoReportePerfilAccion() {
		return isPermisoReportePerfilAccion;
	}

	public void setIsPermisoReportePerfilAccion(Boolean isPermisoReportePerfilAccion) {
		this.isPermisoReportePerfilAccion = isPermisoReportePerfilAccion;
	}
	
	public Boolean getIsPermisoPaginacionMedioPerfilAccion() {
		return isPermisoPaginacionMedioPerfilAccion;
	}

	public void setIsPermisoPaginacionMedioPerfilAccion(Boolean isPermisoPaginacionMedioPerfilAccion) {
		this.isPermisoPaginacionMedioPerfilAccion = isPermisoPaginacionMedioPerfilAccion;
	}
	
	public Boolean getIsPermisoPaginacionTodoPerfilAccion() {
		return isPermisoPaginacionTodoPerfilAccion;
	}

	public void setIsPermisoPaginacionTodoPerfilAccion(Boolean isPermisoPaginacionTodoPerfilAccion) {
		this.isPermisoPaginacionTodoPerfilAccion = isPermisoPaginacionTodoPerfilAccion;
	}
	
	public Boolean getIsPermisoPaginacionAltoPerfilAccion() {
		return isPermisoPaginacionAltoPerfilAccion;
	}

	public void setIsPermisoPaginacionAltoPerfilAccion(Boolean isPermisoPaginacionAltoPerfilAccion) {
		this.isPermisoPaginacionAltoPerfilAccion = isPermisoPaginacionAltoPerfilAccion;
	}
	
	public Boolean getIsPermisoCopiarPerfilAccion() {
		return isPermisoCopiarPerfilAccion;
	}

	public void setIsPermisoCopiarPerfilAccion(Boolean isPermisoCopiarPerfilAccion) {
		this.isPermisoCopiarPerfilAccion = isPermisoCopiarPerfilAccion;
	}
	
	public Boolean getIsPermisoVerFormPerfilAccion() {
		return isPermisoVerFormPerfilAccion;
	}

	public void setIsPermisoVerFormPerfilAccion(Boolean isPermisoVerFormPerfilAccion) {
		this.isPermisoVerFormPerfilAccion = isPermisoVerFormPerfilAccion;
	}
	
	public Boolean getIsPermisoDuplicarPerfilAccion() {
		return isPermisoDuplicarPerfilAccion;
	}

	public void setIsPermisoDuplicarPerfilAccion(Boolean isPermisoDuplicarPerfilAccion) {
		this.isPermisoDuplicarPerfilAccion = isPermisoDuplicarPerfilAccion;
	}
	
	public Boolean getIsPermisoOrdenPerfilAccion() {
		return isPermisoOrdenPerfilAccion;
	}

	public void setIsPermisoOrdenPerfilAccion(Boolean isPermisoOrdenPerfilAccion) {
		this.isPermisoOrdenPerfilAccion = isPermisoOrdenPerfilAccion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPerfilAccion() {
		return isVisibilidadCeldaNuevoPerfilAccion;
	}

	public void setIsVisibilidadCeldaNuevoPerfilAccion(Boolean isVisibilidadCeldaNuevoPerfilAccion) {
		this.isVisibilidadCeldaNuevoPerfilAccion = isVisibilidadCeldaNuevoPerfilAccion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPerfilAccion() {
		return isVisibilidadCeldaDuplicarPerfilAccion;
	}

	public void setIsVisibilidadCeldaDuplicarPerfilAccion(Boolean isVisibilidadCeldaDuplicarPerfilAccion) {
		this.isVisibilidadCeldaDuplicarPerfilAccion = isVisibilidadCeldaDuplicarPerfilAccion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPerfilAccion() {
		return isVisibilidadCeldaCopiarPerfilAccion;
	}

	public void setIsVisibilidadCeldaCopiarPerfilAccion(Boolean isVisibilidadCeldaCopiarPerfilAccion) {
		this.isVisibilidadCeldaCopiarPerfilAccion = isVisibilidadCeldaCopiarPerfilAccion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPerfilAccion() {
		return isVisibilidadCeldaVerFormPerfilAccion;
	}

	public void setIsVisibilidadCeldaVerFormPerfilAccion(Boolean isVisibilidadCeldaVerFormPerfilAccion) {
		this.isVisibilidadCeldaVerFormPerfilAccion = isVisibilidadCeldaVerFormPerfilAccion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPerfilAccion() {
		return isVisibilidadCeldaOrdenPerfilAccion;
	}

	public void setIsVisibilidadCeldaOrdenPerfilAccion(Boolean isVisibilidadCeldaOrdenPerfilAccion) {
		this.isVisibilidadCeldaOrdenPerfilAccion = isVisibilidadCeldaOrdenPerfilAccion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPerfilAccion() {
		return isVisibilidadCeldaNuevoRelacionesPerfilAccion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPerfilAccion(Boolean isVisibilidadCeldaNuevoRelacionesPerfilAccion) {
		this.isVisibilidadCeldaNuevoRelacionesPerfilAccion = isVisibilidadCeldaNuevoRelacionesPerfilAccion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPerfilAccion() {
		return isVisibilidadCeldaModificarPerfilAccion;
	}

	public void setIsVisibilidadCeldaModificarPerfilAccion(Boolean isVisibilidadCeldaModificarPerfilAccion) {
		this.isVisibilidadCeldaModificarPerfilAccion = isVisibilidadCeldaModificarPerfilAccion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPerfilAccion() {
		return isVisibilidadCeldaActualizarPerfilAccion;
	}

	public void setIsVisibilidadCeldaActualizarPerfilAccion(Boolean isVisibilidadCeldaActualizarPerfilAccion) {
		this.isVisibilidadCeldaActualizarPerfilAccion = isVisibilidadCeldaActualizarPerfilAccion;
	}

	public Boolean getIsVisibilidadCeldaEliminarPerfilAccion() {
		return isVisibilidadCeldaEliminarPerfilAccion;
	}

	public void setIsVisibilidadCeldaEliminarPerfilAccion(Boolean isVisibilidadCeldaEliminarPerfilAccion) {
		this.isVisibilidadCeldaEliminarPerfilAccion = isVisibilidadCeldaEliminarPerfilAccion;
	}

	public Boolean getIsVisibilidadCeldaCancelarPerfilAccion() {
		return isVisibilidadCeldaCancelarPerfilAccion;
	}

	public void setIsVisibilidadCeldaCancelarPerfilAccion(Boolean isVisibilidadCeldaCancelarPerfilAccion) {
		this.isVisibilidadCeldaCancelarPerfilAccion = isVisibilidadCeldaCancelarPerfilAccion;
	}

	public Boolean getIsVisibilidadCeldaGuardarPerfilAccion() {
		return isVisibilidadCeldaGuardarPerfilAccion;
	}

	public void setIsVisibilidadCeldaGuardarPerfilAccion(Boolean isVisibilidadCeldaGuardarPerfilAccion) {
		this.isVisibilidadCeldaGuardarPerfilAccion = isVisibilidadCeldaGuardarPerfilAccion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPerfilAccion() {
		return isVisibilidadCeldaGuardarCambiosPerfilAccion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPerfilAccion(Boolean isVisibilidadCeldaGuardarCambiosPerfilAccion) {
		this.isVisibilidadCeldaGuardarCambiosPerfilAccion = isVisibilidadCeldaGuardarCambiosPerfilAccion;
	}
		
	public PerfilAccionSessionBean getperfilaccionSessionBean() {
		return this.perfilaccionSessionBean;
	}
	
	public void setperfilaccionSessionBean(PerfilAccionSessionBean perfilaccionSessionBean) {
		this.perfilaccionSessionBean=perfilaccionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAccion() {
		return this.isVisibilidadFK_IdAccion;
	}

	public void setisVisibilidadFK_IdAccion(Boolean isVisibilidadFK_IdAccion) {
		this.isVisibilidadFK_IdAccion=isVisibilidadFK_IdAccion;
	}

	public Boolean getisVisibilidadFK_IdPerfil() {
		return this.isVisibilidadFK_IdPerfil;
	}

	public void setisVisibilidadFK_IdPerfil(Boolean isVisibilidadFK_IdPerfil) {
		this.isVisibilidadFK_IdPerfil=isVisibilidadFK_IdPerfil;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(PerfilAccion perfilaccion)throws Exception {
		try {
			
				this.setActualParaGuardarPerfilForeignKey(perfilaccion,null);
				this.setActualParaGuardarAccionForeignKey(perfilaccion,null);
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
	
	public void bugActualizarReferenciaActual(PerfilAccion perfilaccion,PerfilAccion perfilaccionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPerfilAccion(perfilaccion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		perfilaccionAux.setId(perfilaccion.getId());
		perfilaccionAux.setVersionRow(perfilaccion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPerfilAccion();
		
			int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = perfilaccionValidator.getInvalidValues(this.perfilaccion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			perfilaccionLogic.setDatosCliente(datosCliente);
			perfilaccionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				perfilaccionAux=new  PerfilAccion();
				
				perfilaccionAux.setIsNew(true);
				perfilaccionAux.setIsChanged(true);
				
				perfilaccionAux.setPerfilAccionOriginal(this.perfilaccion);
				
				perfilaccionAux.setId(this.perfilaccion.getId());	
				perfilaccionAux.setVersionRow(this.perfilaccion.getVersionRow());	
				perfilaccionAux.setid_perfil(this.perfilaccion.getid_perfil());	
				perfilaccionAux.setid_accion(this.perfilaccion.getid_accion());	
				perfilaccionAux.setejecusion(this.perfilaccion.getejecusion());	
				perfilaccionAux.setestado(this.perfilaccion.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilaccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(perfilaccionAux,perfilaccionLogic.getPerfilAccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilaccionAux,perfilaccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.perfilaccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilaccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionLogic.savePerfilAccions();//WithConnection
						//perfilaccionLogic.getSetVersionRowPerfilAccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfilaccion,perfilaccionAux);
					
					this.refrescarForeignKeysDescripcionesPerfilAccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilaccionLogic.savePerfilAccionRelaciones(perfilaccionAux);//WithConnection
								//perfilaccionLogic.getSetVersionRowPerfilAccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfilaccion,perfilaccionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilaccionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilaccionAux,perfilaccionLogic.getPerfilAccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilaccionAux,perfilaccions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfilaccion,perfilaccionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				perfilaccionAux=new  PerfilAccion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.perfilaccionSessionBean.getEsGuardarRelacionado() 
					|| (this.perfilaccionSessionBean.getEsGuardarRelacionado() && this.perfilaccion.getId()>=0)) {
						
					perfilaccionAux.setIsNew(false);
				}
				
				perfilaccionAux.setIsDeleted(false);
			
				perfilaccionAux.setId(this.perfilaccion.getId());	
				perfilaccionAux.setVersionRow(this.perfilaccion.getVersionRow());	
				perfilaccionAux.setid_perfil(this.perfilaccion.getid_perfil());	
				perfilaccionAux.setid_accion(this.perfilaccion.getid_accion());	
				perfilaccionAux.setejecusion(this.perfilaccion.getejecusion());	
				perfilaccionAux.setestado(this.perfilaccion.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilaccionAux,perfilaccionLogic.getPerfilAccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilaccionAux,perfilaccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.perfilaccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilaccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionLogic.savePerfilAccions();//WithConnection
						//perfilaccionLogic.getSetVersionRowPerfilAccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfilaccion,perfilaccionAux);
					
					this.refrescarForeignKeysDescripcionesPerfilAccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilaccionLogic.savePerfilAccionRelaciones(perfilaccionAux);//WithConnection
								//perfilaccionLogic.getSetVersionRowPerfilAccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfilaccion,perfilaccionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilaccionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilaccionAux,perfilaccionLogic.getPerfilAccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilaccionAux,perfilaccions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfilaccion,perfilaccionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				perfilaccionAux=new  PerfilAccion();
				
				perfilaccionAux.setIsNew(false);
				perfilaccionAux.setIsChanged(false);
				
				perfilaccionAux.setIsDeleted(true);
				
				perfilaccionAux.setId(this.perfilaccion.getId());	
				perfilaccionAux.setVersionRow(this.perfilaccion.getVersionRow());	
				perfilaccionAux.setid_perfil(this.perfilaccion.getid_perfil());	
				perfilaccionAux.setid_accion(this.perfilaccion.getid_accion());	
				perfilaccionAux.setejecusion(this.perfilaccion.getejecusion());	
				perfilaccionAux.setestado(this.perfilaccion.getestado());	
				
				if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.perfilaccionAux.getId()>=0) {	
						this.perfilaccionsEliminados.add(perfilaccionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(perfilaccionAux,perfilaccionLogic.getPerfilAccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilaccionAux,perfilaccions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.perfilaccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilaccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionLogic.savePerfilAccions();//WithConnection
						//perfilaccionLogic.getSetVersionRowPerfilAccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilaccionLogic.savePerfilAccionRelaciones(perfilaccionAux);//WithConnection
								//perfilaccionLogic.getSetVersionRowPerfilAccions();//WithConnection
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
							if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.perfilaccionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(perfilaccionAux,perfilaccionLogic.getPerfilAccions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(perfilaccionAux,perfilaccions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.getPerfilAccions().addAll(this.perfilaccionsEliminados);
					
					perfilaccionLogic.savePerfilAccions();//WithConnection
					//perfilaccionLogic.getSetVersionRowPerfilAccions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPerfilAccion();
				
				this.perfilaccionsEliminados= new ArrayList<PerfilAccion>();		
			}
			
			if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Perfil Accion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.perfilaccion=perfilaccionAux;
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
      		//this.finishProcessPerfilAccion();
      	}
		
	}	
	
	public void actualizarRelaciones(PerfilAccion perfilaccionLocal) throws Exception {
		
		if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PerfilAccion perfilaccionLocal) throws Exception {	
		if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PerfilDetalleFormJInternalFrame.class)) {
				PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrameLocal=(PerfilBeanSwingJInternalFrame) ((PerfilDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				perfilBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPerfil(perfilBeanSwingJInternalFrameLocal.getperfil(),true);
				perfilBeanSwingJInternalFrameLocal.actualizarLista(perfilBeanSwingJInternalFrameLocal.perfil,this.perfilsForeignKey);

				perfilBeanSwingJInternalFrameLocal.actualizarRelaciones(perfilBeanSwingJInternalFrameLocal.perfil);

				perfilaccionLocal.setPerfil(perfilBeanSwingJInternalFrameLocal.perfil);

				this.addItemDefectoCombosForeignKeyPerfil();
				this.cargarCombosFramePerfilsForeignKey("Formulario");
				this.setActualPerfilForeignKey(perfilBeanSwingJInternalFrameLocal.perfil.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AccionDetalleFormJInternalFrame.class)) {
				AccionBeanSwingJInternalFrame accionBeanSwingJInternalFrameLocal=(AccionBeanSwingJInternalFrame) ((AccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				accionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAccion(accionBeanSwingJInternalFrameLocal.getaccion(),true);
				accionBeanSwingJInternalFrameLocal.actualizarLista(accionBeanSwingJInternalFrameLocal.accion,this.accionsForeignKey);

				accionBeanSwingJInternalFrameLocal.actualizarRelaciones(accionBeanSwingJInternalFrameLocal.accion);

				perfilaccionLocal.setAccion(accionBeanSwingJInternalFrameLocal.accion);

				this.addItemDefectoCombosForeignKeyAccion();
				this.cargarCombosFrameAccionsForeignKey("Formulario");
				this.setActualAccionForeignKey(accionBeanSwingJInternalFrameLocal.accion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPerfilAccionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = perfilaccionValidator.getInvalidValues(this.perfilaccion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PerfilAccion perfilaccion,List<PerfilAccion> perfilaccions) throws Exception {
		try	{		
			PerfilAccionConstantesFunciones.actualizarLista(perfilaccion,perfilaccions,this.perfilaccionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PerfilAccion perfilaccion,List<PerfilAccion> perfilaccions) throws Exception {
		try	{			
			PerfilAccionConstantesFunciones.actualizarSelectedLista(perfilaccion,perfilaccions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PerfilAccion> perfilaccionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				perfilaccionsLocal=this.perfilaccionLogic.getPerfilAccions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				perfilaccionsLocal=this.perfilaccions;
			}
			//ARCHITECTURE
		
			for(PerfilAccion perfilaccionLocal:perfilaccionsLocal) {
				if(this.permiteMantenimiento(perfilaccionLocal) && perfilaccionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PerfilAccionConstantesFunciones.getPerfilAccionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PerfilAccionConstantesFunciones.IDPERFIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilAccion.jLabelid_perfilPerfilAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilAccionConstantesFunciones.IDACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilAccion.jLabelid_accionPerfilAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilAccionConstantesFunciones.EJECUSION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilAccion.jLabelejecusionPerfilAccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilAccionConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilAccion.jLabelestadoPerfilAccion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilAccion.jLabelid_perfilPerfilAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilAccion.jLabelid_accionPerfilAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilAccion.jLabelejecusionPerfilAccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilAccion.jLabelestadoPerfilAccion,"");
		
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
		this.iIdNuevoPerfilAccion--;	
		
		
		this.perfilaccionAux=new PerfilAccion();
		
		this.perfilaccionAux.setId(this.iIdNuevoPerfilAccion);
		this.perfilaccionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilaccionLogic.getPerfilAccions().add(this.perfilaccionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.perfilaccions.add(this.perfilaccionAux);
		}
		//ARCHITECTURE
		
		this.perfilaccion=this.perfilaccionAux;
		
		if(PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPerfilAccion(this.perfilaccion);
			this.setVariablesObjetoActualToFormularioForeignKeyPerfilAccion(this.perfilaccion);
		}
				
		//this.setDefaultControlesPerfilAccion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPerfilAccion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPerfilAccion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilAccion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfilAccion(this.perfilaccionBean,this.perfilaccion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PerfilAccionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
			classes=PerfilAccionConstantesFunciones.getClassesRelationshipsOfPerfilAccion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.perfilaccionReturnGeneral=perfilaccionLogic.procesarEventosPerfilAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilaccionLogic.getPerfilAccions(),this.perfilaccion,this.perfilaccionParameterGeneral,this.isEsNuevoPerfilAccion,classes);//this.perfilaccionLogic.getPerfilAccion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPerfilAccion(this.perfilaccionReturnGeneral,this.perfilaccionBean,false);
		
		if(this.perfilaccionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPerfilAccion(this.perfilaccionReturnGeneral.getPerfilAccion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPerfilAccion(this.perfilaccionReturnGeneral.getPerfilAccion());
		}
		
		if(this.perfilaccionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPerfilAccion(this.perfilaccionReturnGeneral.getPerfilAccion(),classes);//this.perfilaccionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPerfilAccion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPerfilAccion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilAccionBeanSwingJInternalFrameAdditional.RecargarFormPerfilAccion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPerfilAccion(false);
						
			if(perfilaccionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilAccion();
			}
			
			this.actualizarVisualTableDatosPerfilAccion();
			
			this.jTableDatosPerfilAccion.setRowSelectionInterval(this.getIndiceNuevoPerfilAccion(), this.getIndiceNuevoPerfilAccion());
			
			this.seleccionarFilaTablaPerfilAccionActual();
						
			this.actualizarEstadoCeldasBotonesPerfilAccion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPerfilAccion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.setEnabled(isHabilitar && this.perfilaccionConstantesFunciones.activarejecusionPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.setEnabled(isHabilitar && this.perfilaccionConstantesFunciones.activarestadoPerfilAccion);	
		
		this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setEnabled(isHabilitar && this.perfilaccionConstantesFunciones.activarid_perfilPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setEnabled(isHabilitar && this.perfilaccionConstantesFunciones.activarid_accionPerfilAccion);
	};
	
	public void setDefaultControlesPerfilAccion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPerfilAccion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.perfilaccionSessionBean.setConGuardarRelaciones(true);			
			this.perfilaccionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.setVisible(true);
			
					
		} else {
			//this.perfilaccionSessionBean.setConGuardarRelaciones(false);			
			this.perfilaccionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPerfilAccion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
				if(perfilaccionAux.getId().equals(this.iIdNuevoPerfilAccion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilAccion perfilaccionAux:this.perfilaccions) {
				if(perfilaccionAux.getId().equals(this.iIdNuevoPerfilAccion)) {
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
	
	public int getIndiceActualPerfilAccion(PerfilAccion perfilaccion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
				if(perfilaccionAux.getId().equals(perfilaccion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilAccion perfilaccionAux:this.perfilaccions) {
				if(perfilaccionAux.getId().equals(perfilaccion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPerfilAccion(PerfilAccion perfilaccionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
				if(perfilaccionAux.getPerfilAccionOriginal().getId().equals(perfilaccionOriginal.getId())) {
					existe=true;
					perfilaccionOriginal.setId(perfilaccionAux.getId());
					perfilaccionOriginal.setVersionRow(perfilaccionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilAccion perfilaccionAux:this.perfilaccions) {
				if(perfilaccionAux.getPerfilAccionOriginal().getId().equals(perfilaccionOriginal.getId())) {
					existe=true;
					perfilaccionOriginal.setId(perfilaccionAux.getId());
					perfilaccionOriginal.setVersionRow(perfilaccionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPerfilAccion(Boolean esParaCancelar) throws Exception {
		perfilaccionsAux=new ArrayList<PerfilAccion>();
		perfilaccionAux=new PerfilAccion();
		
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
					if(perfilaccionAux.getId()<0) {
						perfilaccionsAux.add(perfilaccionAux);
					}		
				}
				this.iIdNuevoPerfilAccion=0L;
				this.perfilaccionLogic.getPerfilAccions().removeAll(perfilaccionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilAccion perfilaccionAux:this.perfilaccions) {
					if(perfilaccionAux.getId()<0) {
						perfilaccionsAux.add(perfilaccionAux);
					}		
				}
				this.iIdNuevoPerfilAccion=0L;
				this.perfilaccions.removeAll(perfilaccionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPerfilAccion 
					&& this.perfilaccionLogic.getPerfilAccions().size()>0
					) {
					perfilaccionAux=this.perfilaccionLogic.getPerfilAccions().get(this.perfilaccionLogic.getPerfilAccions().size() - 1);
				
					if(perfilaccionAux.getId()<0) {
						this.perfilaccionLogic.getPerfilAccions().remove(perfilaccionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPerfilAccion && this.perfilaccions.size()>0) {
					perfilaccionAux=this.perfilaccions.get(this.perfilaccions.size() - 1);
				
					if(perfilaccionAux.getId()<0) {
						this.perfilaccions.remove(perfilaccionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPerfilAccion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(perfilaccion.getId()<0) {
				this.perfilaccionLogic.getPerfilAccions().remove(this.perfilaccion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(perfilaccion.getId()<0) {
				this.perfilaccions.remove(this.perfilaccion);
			}
		}			
	}
	
	public void setEstadosInicialesPerfilAccion(List<PerfilAccion> perfilaccionsAux) throws Exception {
		PerfilAccionConstantesFunciones.setEstadosInicialesPerfilAccion(perfilaccionsAux);
	}
	
	public void setEstadosInicialesPerfilAccion(PerfilAccion perfilaccionAux) throws Exception {
		PerfilAccionConstantesFunciones.setEstadosInicialesPerfilAccion(perfilaccionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPerfilAccionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPerfilAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPerfilAccionActual()) {
				if(!this.isEsNuevoPerfilAccion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPerfilAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPerfilAccion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPerfilAccionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Perfil Accion ?", "MANTENIMIENTO DE Perfil Accion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPerfilAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PerfilAccion perfilaccion) throws Exception {
		PerfilAccionConstantesFunciones.seleccionarAsignar(this.perfilaccion,perfilaccion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPerfilAccion=this.isPermisoActualizarOriginalPerfilAccion;
			
			
			this.seleccionarAsignar(perfilaccion);
			
			

			idPerfilActual=perfilaccion.getid_perfil();
			this.seleccionarPerfilActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilAccionConstantesFunciones.quitarEspaciosPerfilAccion(this.perfilaccion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPerfilAccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.perfilaccionSessionBean.setsFuncionBusquedaRapida(this.perfilaccionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarPerfilActual() throws Exception {
		try	{
			Perfil perfilAux=new Perfil();

			if(this.idPerfilActual != null && this.idPerfilActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getEntityWithConnection(this.idPerfilActual);
					perfilAux= perfilLogic.getPerfil();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				perfilsForeignKey=new ArrayList<Perfil>();
				perfilsForeignKey.add(perfilAux);
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
			if(this.isEsNuevoPerfilAccion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPerfilAccion(esParaCancelar);				
				this.cancelarNuevoPerfilAccion(esParaCancelar);								
			}
			
			this.perfilaccion=new PerfilAccion();
			
			this.inicializarPerfilAccion();
			
			this.actualizarEstadoCeldasBotonesPerfilAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPerfilAccion() throws Exception {
		try {
			PerfilAccionConstantesFunciones.inicializarPerfilAccion(this.perfilaccion);
			
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
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.perfilaccionLogic.getPerfilAccions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePerfilAccions(String sAccionBusqueda,List<PerfilAccion> perfilaccionsParaReportes) throws Exception {
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
					sPathReporteFinal="PerfilAccion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PerfilAccionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PerfilAccionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PerfilAccion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Perfil Acciones");		
		parameters.put("busquedapor", PerfilAccionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePerfilAccion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PerfilAccionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PerfilAccionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePerfilAccion=new JRBeanArrayDataSource(PerfilAccionJInternalFrame.TraerPerfilAccionBeans(perfilaccionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePerfilAccion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PerfilAccionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PerfilAccionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PerfilAccionBean.TraerPerfilAccionBeans(perfilaccionsParaReportes).toArray()));
							
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
				this.generarExcelReportePerfilAccions(sAccionBusqueda,sTipoArchivoReporte,perfilaccionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPerfilAccions(sAccionBusqueda,sTipoArchivoReporte,perfilaccionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPerfilAccionActionPerformed(null);
					//this.generarExcelReportePerfilAccions(sAccionBusqueda,sTipoArchivoReporte,perfilaccionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPerfilAccions(sAccionBusqueda,sTipoArchivoReporte,perfilaccionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPerfilAccions(sAccionBusqueda,sTipoArchivoReporte,perfilaccionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPerfilAccions(sAccionBusqueda,sTipoArchivoReporte,perfilaccionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePerfilAccions(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilAccion> perfilaccionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilaccion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilAccions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfilAccion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PerfilAccion perfilaccion : perfilaccionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PerfilAccionConstantesFunciones.generarExcelReporteDataPerfilAccion("NORMAL",row,workbook,perfilaccion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPerfilAccion(String sTipo,Row row,Workbook workbook) {
		
		PerfilAccionConstantesFunciones.generarExcelReporteHeaderPerfilAccion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPerfilAccions(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilAccion> perfilaccionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilaccion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilAccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PerfilAccion perfilaccion : perfilaccionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PerfilAccionConstantesFunciones.getPerfilAccionDescripcion(perfilaccion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilAccionConstantesFunciones.LABEL_IDPERFIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_IDPERFIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilaccion.getperfil_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilAccionConstantesFunciones.LABEL_IDACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_IDACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilaccion.getaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilAccionConstantesFunciones.LABEL_EJECUSION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_EJECUSION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilaccion.getejecusion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilAccionConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilaccion.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPerfilAccions(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilAccion> perfilaccionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PerfilAccion> perfilaccionsRespaldo=null;
		
		classes=PerfilAccionConstantesFunciones.getClassesRelationshipsOfPerfilAccion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.perfilaccionLogic.setDatosCliente(this.datosCliente);
		this.perfilaccionLogic.setDatosDeep(this.datosDeep);
		this.perfilaccionLogic.setIsConDeep(true);
		
		perfilaccionsRespaldo=this.perfilaccionLogic.getPerfilAccions();
		
		this.perfilaccionLogic.setPerfilAccions(perfilaccionsParaReportes);	
		this.perfilaccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		perfilaccionsParaReportes=this.perfilaccionLogic.getPerfilAccions();
		this.perfilaccionLogic.setPerfilAccions(perfilaccionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilaccion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilAccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfilAccion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PerfilAccion perfilaccion : perfilaccionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPerfilAccion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PerfilAccionConstantesFunciones.generarExcelReporteDataPerfilAccion("NORMAL",row,workbook,perfilaccion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PerfilAccionConstantesFunciones.getPerfilAccionDescripcion(perfilaccion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilAccion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPerfilAccion() throws Exception {		
		this.startProcessPerfilAccion(true);
	}
	
	public void startProcessPerfilAccion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPerfilAccion ,this.jPanelParametrosReportesPerfilAccion, this.jScrollPanelDatosPerfilAccion,this.jPanelPaginacionPerfilAccion, this.jScrollPanelDatosEdicionPerfilAccion, this.jPanelAccionesPerfilAccion,this.jPanelAccionesFormularioPerfilAccion,this.jmenuBarPerfilAccion,this.jmenuBarDetallePerfilAccion,this.jTtoolBarPerfilAccion,this.jTtoolBarDetallePerfilAccion);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfilAccion=this.jTabbedPaneBusquedasPerfilAccion; 
		
		final JPanel jPanelParametrosReportesPerfilAccion=this.jPanelParametrosReportesPerfilAccion;
		//final JScrollPane jScrollPanelDatosPerfilAccion=this.jScrollPanelDatosPerfilAccion;
		final JTable jTableDatosPerfilAccion=this.jTableDatosPerfilAccion;		
		final JPanel jPanelPaginacionPerfilAccion=this.jPanelPaginacionPerfilAccion;
		//final JScrollPane jScrollPanelDatosEdicionPerfilAccion=this.jScrollPanelDatosEdicionPerfilAccion;
		final JPanel jPanelAccionesPerfilAccion=this.jPanelAccionesPerfilAccion;
		
		JPanel jPanelCamposAuxiliarPerfilAccion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPerfilAccion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			jPanelCamposAuxiliarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jPanelCamposPerfilAccion;
			jPanelAccionesFormularioAuxiliarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jPanelAccionesFormularioPerfilAccion;
		}
		
		final JPanel jPanelCamposPerfilAccion=jPanelCamposAuxiliarPerfilAccion;
		final JPanel jPanelAccionesFormularioPerfilAccion=jPanelAccionesFormularioAuxiliarPerfilAccion;
		
		
		final JMenuBar jmenuBarPerfilAccion=this.jmenuBarPerfilAccion;
		final JToolBar jTtoolBarPerfilAccion=this.jTtoolBarPerfilAccion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPerfilAccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfilAccion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			jmenuBarDetalleAuxiliarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jmenuBarDetallePerfilAccion;
			jTtoolBarDetalleAuxiliarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jTtoolBarDetallePerfilAccion;
		}
		
		final JMenuBar jmenuBarDetallePerfilAccion=jmenuBarDetalleAuxiliarPerfilAccion;
		final JToolBar jTtoolBarDetallePerfilAccion=jTtoolBarDetalleAuxiliarPerfilAccion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfilAccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfilAccion;
			processRunnable.jTableDatos=jTableDatosPerfilAccion;
			processRunnable.jPanelCampos=jPanelCamposPerfilAccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfilAccion;
			processRunnable.jPanelAcciones=jPanelAccionesPerfilAccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfilAccion;
			
			
			processRunnable.jmenuBar=jmenuBarPerfilAccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfilAccion;
			processRunnable.jTtoolBar=jTtoolBarPerfilAccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfilAccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfilAccion ,jPanelParametrosReportesPerfilAccion,jTableDatosPerfilAccion, /*jScrollPanelDatosPerfilAccion,*/jPanelCamposPerfilAccion,jPanelPaginacionPerfilAccion, /*jScrollPanelDatosEdicionPerfilAccion,*/ jPanelAccionesPerfilAccion,jPanelAccionesFormularioPerfilAccion,jmenuBarPerfilAccion,jmenuBarDetallePerfilAccion,jTtoolBarPerfilAccion,jTtoolBarDetallePerfilAccion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfilAccion ,jPanelParametrosReportesPerfilAccion, jScrollPanelDatosPerfilAccion,jPanelPaginacionPerfilAccion, jScrollPanelDatosEdicionPerfilAccion, jPanelAccionesPerfilAccion,jPanelAccionesFormularioPerfilAccion,jmenuBarPerfilAccion,jmenuBarDetallePerfilAccion,jTtoolBarPerfilAccion,jTtoolBarDetallePerfilAccion);
						
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
	
	public void finishProcessPerfilAccion() {// throws Exception 
		this.finishProcessPerfilAccion(true);
	}
	
	public void finishProcessPerfilAccion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPerfilAccion ,this.jPanelParametrosReportesPerfilAccion, this.jScrollPanelDatosPerfilAccion,this.jPanelPaginacionPerfilAccion, this.jScrollPanelDatosEdicionPerfilAccion, this.jPanelAccionesPerfilAccion,this.jPanelAccionesFormularioPerfilAccion,this.jmenuBarPerfilAccion,this.jmenuBarDetallePerfilAccion,this.jTtoolBarPerfilAccion,this.jTtoolBarDetallePerfilAccion);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfilAccion=this.jTabbedPaneBusquedasPerfilAccion; 
		
		final JPanel jPanelParametrosReportesPerfilAccion=this.jPanelParametrosReportesPerfilAccion;
		//final JScrollPane jScrollPanelDatosPerfilAccion=this.jScrollPanelDatosPerfilAccion;
		final JTable jTableDatosPerfilAccion=this.jTableDatosPerfilAccion;		
		final JPanel jPanelPaginacionPerfilAccion=this.jPanelPaginacionPerfilAccion;
		//final JScrollPane jScrollPanelDatosEdicionPerfilAccion=this.jScrollPanelDatosEdicionPerfilAccion;
		final JPanel jPanelAccionesPerfilAccion=this.jPanelAccionesPerfilAccion;
		
		JPanel jPanelCamposAuxiliarPerfilAccion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPerfilAccion=new JPanel();
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			jPanelCamposAuxiliarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jPanelCamposPerfilAccion;
			jPanelAccionesFormularioAuxiliarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jPanelAccionesFormularioPerfilAccion;
		}
		
		final JPanel jPanelCamposPerfilAccion=jPanelCamposAuxiliarPerfilAccion;
		final JPanel jPanelAccionesFormularioPerfilAccion=jPanelAccionesFormularioAuxiliarPerfilAccion;
		
		
		final JMenuBar jmenuBarPerfilAccion=this.jmenuBarPerfilAccion;		
		final JToolBar jTtoolBarPerfilAccion=this.jTtoolBarPerfilAccion;
				
		JMenuBar jmenuBarDetalleAuxiliarPerfilAccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfilAccion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			jmenuBarDetalleAuxiliarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jmenuBarDetallePerfilAccion;
			jTtoolBarDetalleAuxiliarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jTtoolBarDetallePerfilAccion;		
		}
		
		final JMenuBar jmenuBarDetallePerfilAccion=jmenuBarDetalleAuxiliarPerfilAccion;
		final JToolBar jTtoolBarDetallePerfilAccion=jTtoolBarDetalleAuxiliarPerfilAccion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfilAccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfilAccion;
			processRunnable.jTableDatos=jTableDatosPerfilAccion;
			processRunnable.jPanelCampos=jPanelCamposPerfilAccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfilAccion;
			processRunnable.jPanelAcciones=jPanelAccionesPerfilAccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfilAccion;
			
			
			processRunnable.jmenuBar=jmenuBarPerfilAccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfilAccion;
			processRunnable.jTtoolBar=jTtoolBarPerfilAccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfilAccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPerfilAccion ,jPanelParametrosReportesPerfilAccion, jTableDatosPerfilAccion,/*jScrollPanelDatosPerfilAccion,*/jPanelCamposPerfilAccion,jPanelPaginacionPerfilAccion, /*jScrollPanelDatosEdicionPerfilAccion,*/ jPanelAccionesPerfilAccion,jPanelAccionesFormularioPerfilAccion,jmenuBarPerfilAccion,jmenuBarDetallePerfilAccion,jTtoolBarPerfilAccion,jTtoolBarDetallePerfilAccion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPerfilAccion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPerfilAccion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPerfilAccion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPerfilAccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPerfilAccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePerfilAccion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPerfilAccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPerfilAccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePerfilAccion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.perfilaccionConstantesFunciones.getsFinalQueryPerfilAccion();
		String  finalQueryPaginacionTodos=this.perfilaccionConstantesFunciones.getsFinalQueryPerfilAccion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PerfilAccionConstantesFunciones.getArrayColumnasGlobalesNoPerfilAccion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PerfilAccionConstantesFunciones.getArrayColumnasGlobalesPerfilAccion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PerfilAccionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.perfilaccionsEliminados= new ArrayList<PerfilAccion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPerfilAccion();
		
				///*PerfilAccionSessionBean*/this.perfilaccionSessionBean=new PerfilAccionSessionBean();
			
			if(this.perfilaccionSessionBean==null) {
				this.perfilaccionSessionBean=new PerfilAccionSessionBean();
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
					this.iNumeroPaginacion=PerfilAccionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PerfilAccionConstantesFunciones.getClassesForeignKeysOfPerfilAccion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/perfilaccion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			perfilaccionsAux= new ArrayList<PerfilAccion>();
			
				
			perfilaccionLogic.setDatosCliente(this.datosCliente);
			perfilaccionLogic.setDatosDeep(this.datosDeep);
			perfilaccionLogic.setIsConDeep(true);
			
			
			perfilaccionLogic.getPerfilAccionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					perfilaccionLogic.getTodosPerfilAccions(finalQueryGlobal,pagination);
					
					//perfilaccionLogic.getTodosPerfilAccionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(perfilaccionLogic.getPerfilAccions()==null|| perfilaccionLogic.getPerfilAccions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilaccionsAux= new ArrayList<PerfilAccion>();
							perfilaccionsAux.addAll(perfilaccionLogic.getPerfilAccions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilaccionsAux= new ArrayList<PerfilAccion>();
							perfilaccionsAux.addAll(perfilaccions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilaccionLogic.getTodosPerfilAccions(finalQueryGlobal+"",this.pagination);												
							
							//perfilaccionLogic.getTodosPerfilAccionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePerfilAccions("Todos",perfilaccionLogic.getPerfilAccions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilaccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());					
							perfilaccionLogic.getPerfilAccions().addAll(perfilaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilaccions=new ArrayList<PerfilAccion>();
							perfilaccions.addAll(perfilaccionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPerfilAccion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPerfilAccion=this.idActual;
				
				} else if(this.idPerfilAccionActual!=null && this.idPerfilAccionActual!=0L) {
					idPerfilAccion=idPerfilAccionActual;
				}
				
					
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndicePorId(idPerfilAccion);
				
				this.perfilaccions=new ArrayList<PerfilAccion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					perfilaccionLogic.getEntity(idPerfilAccion);
					
					//perfilaccionLogic.getEntityWithConnection(idPerfilAccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilaccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());
					perfilaccionLogic.getPerfilAccions().add(perfilaccionLogic.getPerfilAccion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilaccions=new ArrayList<PerfilAccion>();
					this.perfilaccions.add(perfilaccion);
				}
				
				if(perfilaccionLogic.getPerfilAccion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAccion")) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdAccion(id_accionFK_IdAccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilaccionLogic.getPerfilAccionsFK_IdAccion(finalQueryGlobal,pagination,id_accionFK_IdAccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdAccion(id_accionFK_IdAccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdAccion(id_accionFK_IdAccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilaccionLogic.getPerfilAccions()==null||perfilaccionLogic.getPerfilAccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilaccions==null|| perfilaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionsAux=new ArrayList<PerfilAccion>();
						perfilaccionsAux.addAll(perfilaccionLogic.getPerfilAccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilaccionsAux=new ArrayList<PerfilAccion>();
							perfilaccionsAux.addAll(perfilaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilaccionLogic.getPerfilAccionsFK_IdAccion(finalQueryGlobal,pagination,id_accionFK_IdAccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdAccion(id_accionFK_IdAccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdAccion(id_accionFK_IdAccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilAccions("FK_IdAccion",perfilaccionLogic.getPerfilAccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilAccions("FK_IdAccion",perfilaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());
						perfilaccionLogic.getPerfilAccions().addAll(perfilaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilaccions=new ArrayList<PerfilAccion>();
							perfilaccions.addAll(perfilaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPerfil")) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilaccionLogic.getPerfilAccionsFK_IdPerfil(finalQueryGlobal,pagination,id_perfilFK_IdPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilaccionLogic.getPerfilAccions()==null||perfilaccionLogic.getPerfilAccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilaccions==null|| perfilaccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionsAux=new ArrayList<PerfilAccion>();
						perfilaccionsAux.addAll(perfilaccionLogic.getPerfilAccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilaccionsAux=new ArrayList<PerfilAccion>();
							perfilaccionsAux.addAll(perfilaccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilaccionLogic.getPerfilAccionsFK_IdPerfil(finalQueryGlobal,pagination,id_perfilFK_IdPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilAccionConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilAccions("FK_IdPerfil",perfilaccionLogic.getPerfilAccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilAccions("FK_IdPerfil",perfilaccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionLogic.setPerfilAccions(new ArrayList<PerfilAccion>());
						perfilaccionLogic.getPerfilAccions().addAll(perfilaccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilaccions=new ArrayList<PerfilAccion>();
							perfilaccions.addAll(perfilaccionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPerfilAccion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPerfilAccion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilaccionLogic.getPerfilAccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilaccions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilaccionLogic.getPerfilAccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilaccions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PerfilAccion perfilaccion) {
		Boolean permite=true;
		
		if(this.perfilaccion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PerfilAccionConstantesFunciones.getOrderByListaPerfilAccion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PerfilAccionConstantesFunciones.getOrderByListaPerfilAccion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilAccion perfilaccion:perfilaccionLogic.getPerfilAccions()) {
				if(perfilaccion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilaccionTotales=perfilaccion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilAccion perfilaccion:this.perfilaccions) {
				if(perfilaccion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilaccionTotales=perfilaccion;
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
			this.perfilaccionAux=new PerfilAccion();
			this.perfilaccionAux.setsType(Constantes2.S_TOTALES);
			this.perfilaccionAux.setIsNew(false);
			this.perfilaccionAux.setIsChanged(false);
			this.perfilaccionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PerfilAccionConstantesFunciones.TotalizarValoresFilaPerfilAccion(this.perfilaccionLogic.getPerfilAccions(),this.perfilaccionAux);
				
				this.perfilaccionLogic.getPerfilAccions().add(this.perfilaccionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PerfilAccionConstantesFunciones.TotalizarValoresFilaPerfilAccion(this.perfilaccions,this.perfilaccionAux);
				
				this.perfilaccions.add(this.perfilaccionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		perfilaccionTotales=new PerfilAccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilaccionLogic.getPerfilAccions().remove(perfilaccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilaccions.remove(perfilaccionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		perfilaccionTotales=new PerfilAccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilAccion perfilaccion:perfilaccionLogic.getPerfilAccions()) {
				if(perfilaccion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilaccionTotales=perfilaccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilAccionConstantesFunciones.TotalizarValoresFilaPerfilAccion(this.perfilaccionLogic.getPerfilAccions(),perfilaccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilAccion perfilaccion:this.perfilaccions) {
				if(perfilaccion.getsType().equals(Constantes2.S_TOTALES)) {
					perfilaccionTotales=perfilaccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilAccionConstantesFunciones.TotalizarValoresFilaPerfilAccion(this.perfilaccions,perfilaccionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPerfilAccionsFK_IdAccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdAccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilAccionsFK_IdPerfil()throws Exception {
		try {
			sAccionBusqueda="FK_IdPerfil";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPerfilAccionsFK_IdAccion(String sFinalQuery,Long id_accion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilaccionLogic.getPerfilAccionsFK_IdAccion(sFinalQuery,this.pagination,id_accion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilAccionsFK_IdPerfil(String sFinalQuery,Long id_perfil)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilaccionLogic.getPerfilAccionsFK_IdPerfil(sFinalQuery,this.pagination,id_perfil);
				
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
	
	public void inicializarPermisosPerfilAccion() {
		this.isPermisoTodoPerfilAccion=false;
		this.isPermisoNuevoPerfilAccion=false;
		this.isPermisoActualizarPerfilAccion=false;
		this.isPermisoActualizarOriginalPerfilAccion=false;
		this.isPermisoEliminarPerfilAccion=false;
		this.isPermisoGuardarCambiosPerfilAccion=false;
		this.isPermisoConsultaPerfilAccion=false;
		this.isPermisoBusquedaPerfilAccion=false;
		this.isPermisoReportePerfilAccion=false;		
		this.isPermisoOrdenPerfilAccion=false;		
		this.isPermisoPaginacionMedioPerfilAccion=false;		
		this.isPermisoPaginacionAltoPerfilAccion=false;
		this.isPermisoPaginacionTodoPerfilAccion=false;
		this.isPermisoCopiarPerfilAccion=false;		
		this.isPermisoVerFormPerfilAccion=false;		
		this.isPermisoDuplicarPerfilAccion=false;		
		this.isPermisoOrdenPerfilAccion=false;		
	}
	
	public void setPermisosUsuarioPerfilAccion(Boolean isPermiso) {
		this.isPermisoTodoPerfilAccion=isPermiso;
		this.isPermisoNuevoPerfilAccion=isPermiso;
		this.isPermisoActualizarPerfilAccion=isPermiso;
		this.isPermisoActualizarOriginalPerfilAccion=isPermiso;
		this.isPermisoEliminarPerfilAccion=isPermiso;
		this.isPermisoGuardarCambiosPerfilAccion=isPermiso;
		this.isPermisoConsultaPerfilAccion=isPermiso;
		this.isPermisoBusquedaPerfilAccion=isPermiso;
		this.isPermisoReportePerfilAccion=isPermiso;
		this.isPermisoOrdenPerfilAccion=isPermiso;		
		this.isPermisoPaginacionMedioPerfilAccion=isPermiso;		
		this.isPermisoPaginacionAltoPerfilAccion=isPermiso;		
		this.isPermisoPaginacionTodoPerfilAccion=isPermiso;		
		this.isPermisoCopiarPerfilAccion=isPermiso;		
		this.isPermisoVerFormPerfilAccion=isPermiso;		
		this.isPermisoDuplicarPerfilAccion=isPermiso;
		this.isPermisoOrdenPerfilAccion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPerfilAccion(Boolean isPermiso) {
		//this.isPermisoTodoPerfilAccion=isPermiso;
		this.isPermisoNuevoPerfilAccion=isPermiso;
		this.isPermisoActualizarPerfilAccion=isPermiso;
		this.isPermisoActualizarOriginalPerfilAccion=isPermiso;
		this.isPermisoEliminarPerfilAccion=isPermiso;
		this.isPermisoGuardarCambiosPerfilAccion=isPermiso;
		//this.isPermisoConsultaPerfilAccion=isPermiso;
		//this.isPermisoBusquedaPerfilAccion=isPermiso;
		//this.isPermisoReportePerfilAccion=isPermiso;
		//this.isPermisoOrdenPerfilAccion=isPermiso;		
		//this.isPermisoPaginacionMedioPerfilAccion=isPermiso;		
		//this.isPermisoPaginacionAltoPerfilAccion=isPermiso;		
		//this.isPermisoPaginacionTodoPerfilAccion=isPermiso;		
		//this.isPermisoCopiarPerfilAccion=isPermiso;		
		//this.isPermisoDuplicarPerfilAccion=isPermiso;
		//this.isPermisoOrdenPerfilAccion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPerfilAccionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PerfilAccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPerfilAccion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPerfilAccionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPerfilAccionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPerfilAccionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPerfilAccionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPerfilAccion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PerfilAccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PerfilAccionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPerfilAccion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPerfilAccion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPerfilAccion=this.isPermisoActualizarPerfilAccion;
			this.isPermisoEliminarPerfilAccion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPerfilAccion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPerfilAccion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPerfilAccion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPerfilAccion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePerfilAccion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfilAccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPerfilAccion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPerfilAccion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPerfilAccion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPerfilAccion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPerfilAccion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPerfilAccion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfilAccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPerfilAccion.setToolTipText(this.jTableDatosPerfilAccion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPerfilAccion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPerfilAccion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PerfilAccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PerfilAccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPerfilAccion() throws Exception {
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
	public void inicializarCombosForeignKeyPerfilAccionListas()throws Exception {
		try	{						
			
				this.perfilsForeignKey=new ArrayList();
				this.accionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPerfilAccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PerfilAccionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPerfilAccionListas(false);
			} else {
			
				this.cargarCombosForeignKeyPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAccionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.accionsForeignKey==null||this.accionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AccionConstantesFunciones.getArrayColumnasGlobalesAccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosAccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPerfilAccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PerfilAccionParameterReturnGeneral perfilaccionReturnGeneral=new PerfilAccionParameterReturnGeneral();
						
			


				String finalQueryGlobalPerfil="";

				if(((this.perfilsForeignKey==null||this.perfilsForeignKey.size()<=0) && this.perfilaccionConstantesFunciones.cargarid_perfilPerfilAccion)
					 || (this.esRecargarFks && this.perfilaccionConstantesFunciones.cargarid_perfilPerfilAccion)) {

					if(!this.perfilaccionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PerfilConstantesFunciones.getArrayColumnasGlobalesPerfil(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPerfil=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PerfilConstantesFunciones.TABLENAME);

						finalQueryGlobalPerfil=Funciones.GetFinalQueryAppend(finalQueryGlobalPerfil, "");
						finalQueryGlobalPerfil+=PerfilConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPerfilsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPerfil=" WHERE " + ConstantesSql.ID + "="+perfilaccionSessionBean.getlidPerfilActual();
					}
				} else {
					finalQueryGlobalPerfil="NONE";
				}


				String finalQueryGlobalAccion="";

				if(((this.accionsForeignKey==null||this.accionsForeignKey.size()<=0) && this.perfilaccionConstantesFunciones.cargarid_accionPerfilAccion)
					 || (this.esRecargarFks && this.perfilaccionConstantesFunciones.cargarid_accionPerfilAccion)) {

					if(!this.perfilaccionSessionBean.getisBusquedaDesdeForeignKeySesionAccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AccionConstantesFunciones.getArrayColumnasGlobalesAccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AccionConstantesFunciones.TABLENAME);

						finalQueryGlobalAccion=Funciones.GetFinalQueryAppend(finalQueryGlobalAccion, "");
						finalQueryGlobalAccion+=AccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAccion=" WHERE " + ConstantesSql.ID + "="+perfilaccionSessionBean.getlidAccionActual();
					}
				} else {
					finalQueryGlobalAccion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilaccionReturnGeneral=perfilaccionLogic.cargarCombosLoteForeignKeyPerfilAccion(finalQueryGlobalPerfil,finalQueryGlobalAccion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				this.perfilsForeignKey=perfilaccionReturnGeneral.getperfilsForeignKey();
			}

			if(!finalQueryGlobalAccion.equals("NONE")) {
				this.accionsForeignKey=perfilaccionReturnGeneral.getaccionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPerfilAccion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPerfil();
			this.addItemDefectoCombosForeignKeyAccion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPerfil()throws Exception {
		try {
			if(this.perfilaccionSessionBean==null) {
				this.perfilaccionSessionBean=new PerfilAccionSessionBean();
			}

			if(!this.perfilaccionSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
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

	public void addItemDefectoCombosForeignKeyAccion()throws Exception {
		try {

			if(!this.perfilaccionSessionBean.getisBusquedaDesdeForeignKeySesionAccion()) {
				Accion accion=new Accion();
				AccionConstantesFunciones.setAccionDescripcion(accion,Constantes.SMENSAJE_ESCOJA_OPCION);
				accion.setId(null);

				if(!AccionConstantesFunciones.ExisteEnLista(this.accionsForeignKey,accion,true)) {

					this.accionsForeignKey.add(0,accion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPerfilAccion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPerfilAccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPerfilAccion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilAccion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPerfilAccion(PerfilAccion perfilaccion)throws Exception {	
		try {
			
			this.setActualPerfilForeignKey(perfilaccion.getid_perfil(),false,"Formulario");
			this.setActualAccionForeignKey(perfilaccion.getid_accion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPerfilAccion(PerfilAccion perfilaccion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(perfilaccion.getPerfil()!=null && !sTipoEvento.equals("id_perfilPerfilAccion")) { //sTipoEvento Evita Bucle Infinito

					this.perfilsForeignKey=new ArrayList<Perfil>();
					this.perfilsForeignKey.add(perfilaccion.getPerfil());

					this.addItemDefectoCombosForeignKeyPerfil();
					this.cargarCombosFramePerfilsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPerfilAccion()throws Exception {	
		try {
			
			this.setActualPerfilForeignKey(this.perfilaccionConstantesFunciones.getid_perfil(),false,"Formulario");
			this.setActualAccionForeignKey(this.perfilaccionConstantesFunciones.getid_accion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilAccion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPerfilAccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPerfilAccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPerfilAccion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPerfilAccion()throws Exception {
		try {
			

			this.cargarCombosFramePerfilsForeignKey("Todos");
			this.cargarCombosFrameAccionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPerfilAccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAccionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPerfilAccion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion!=null && this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion!=null && this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PerfilAccionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PerfilAccionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PerfilAccionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.perfilaccionSessionBean=new PerfilAccionSessionBean(); 
		this.perfilaccionConstantesFunciones=new PerfilAccionConstantesFunciones(); 
		this.perfilaccionBean=new PerfilAccion();//(this.perfilaccionConstantesFunciones); 		
		this.perfilaccionReturnGeneral=new PerfilAccionParameterReturnGeneral(); 
		
		this.perfilaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PerfilAccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PerfilAccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PerfilAccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPerfilAccion(true);
			
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
			
			this.perfilaccionConstantesFunciones=new PerfilAccionConstantesFunciones(); 
			this.perfilaccionBean=new PerfilAccion();//this.perfilaccionConstantesFunciones); 			
			this.perfilaccionReturnGeneral=new PerfilAccionParameterReturnGeneral(); 
		
			PerfilAccionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Accion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.perfilaccion=new PerfilAccion();
			this.perfilaccions = new ArrayList<PerfilAccion>();
			this.perfilaccionsAux = new ArrayList<PerfilAccion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic=new PerfilAccionLogic();
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}
			
			//this.perfilaccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.perfilaccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPerfilAccion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfilAccion);	
					}
					
					if(this.jInternalFrameImportacionPerfilAccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfilAccion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPerfilAccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPerfilAccion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfilAccion);
				this.jInternalFrameDetalleFormPerfilAccion.setVisible(false);
				this.jInternalFrameDetalleFormPerfilAccion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfilAccion);
					this.jInternalFrameReporteDinamicoPerfilAccion.setVisible(false);
					this.jInternalFrameReporteDinamicoPerfilAccion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPerfilAccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPerfilAccion);
					this.jInternalFrameImportacionPerfilAccion.setVisible(false);
					this.jInternalFrameImportacionPerfilAccion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPerfilAccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPerfilAccion);
					this.jInternalFrameOrderByPerfilAccion.setVisible(false);
					this.jInternalFrameOrderByPerfilAccion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPerfilAccionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PerfilAccionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.perfilaccionReturnGeneral=new PerfilAccionParameterReturnGeneral();
			
			this.perfilaccionParameterGeneral=new PerfilAccionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.perfilaccionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PerfilAccionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilAccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilaccionSessionBean.getEsGuardarRelacionado(),this.perfilaccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilAccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilaccionSessionBean.getEsGuardarRelacionado(),this.perfilaccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPerfilAccion=false;
			this.isVisibilidadCeldaDuplicarPerfilAccion=true;
			this.isVisibilidadCeldaCopiarPerfilAccion=true;
			this.isVisibilidadCeldaVerFormPerfilAccion=true;
			this.isVisibilidadCeldaOrdenPerfilAccion=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
			this.isVisibilidadCeldaModificarPerfilAccion=false;
			this.isVisibilidadCeldaActualizarPerfilAccion=false;
			this.isVisibilidadCeldaEliminarPerfilAccion=false;
			this.isVisibilidadCeldaCancelarPerfilAccion=false;
			this.isVisibilidadCeldaGuardarPerfilAccion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=false;
			
			
			this.isVisibilidadFK_IdAccion=true;
			this.isVisibilidadFK_IdPerfil=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPerfilAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPerfilAccion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPerfilAccion(false);
			
			this.setPermisosUsuarioPerfilAccion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilaccionSessionBean.getEsGuardarRelacionado() 
				|| (this.perfilaccionSessionBean.getEsGuardarRelacionado() && this.perfilaccionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPerfilAccionClasesRelacionadas();
			}
			
			if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPerfilAccionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPerfilAccion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPerfilAccion();
			}
			
			if(!this.isPermisoBusquedaPerfilAccion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPerfilAccion,this.isPermisoPaginacionMedioPerfilAccion,this.isPermisoPaginacionTodoPerfilAccion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PerfilAccionConstantesFunciones.getTiposSeleccionarPerfilAccion());
				
				this.tiposColumnasSelect=PerfilAccionConstantesFunciones.getTiposSeleccionarPerfilAccion(true);
				
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
			//if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPerfilAccion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPerfilAccion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPerfilAccion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilAccion() ;
			
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
			this.accionLogic=new AccionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				perfilaccionImplementable= (PerfilAccionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilAccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				perfilaccionImplementableHome= (PerfilAccionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilAccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.perfilaccions= new ArrayList<PerfilAccion>();
			this.perfilaccionsEliminados= new ArrayList<PerfilAccion>();
						
			this.isEsNuevoPerfilAccion=false;
			this.esParaAccionDesdeFormularioPerfilAccion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idPerfilActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.perfilsForeignKey=new ArrayList<Perfil>() ;
			this.accionsForeignKey=new ArrayList<Accion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPerfilAccion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPerfilAccion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PerfilAccionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PerfilAccionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPerfilAccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPerfilAccion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPerfilAccion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPerfilAccion();
			}
			
			PerfilAccionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPerfilAccion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPerfilAccion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPerfilAccion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPerfilAccion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PerfilAccion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPerfilAccion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPerfilAccion")) {
				iIndex=this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPerfilAccion();	
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
	
	public void cargarCombosForeignKeyPerfilAccion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPerfilAccion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPerfilAccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPerfilAccionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPerfilAccion();
		
		this.cargarCombosFrameForeignKeyPerfilAccion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPerfilAccion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPerfilAccion();
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

	public void cargarCombosForeignKeyAccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAccion();
				this.cargarCombosFrameAccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAccion(this.accionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPerfilAccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
			
			if(jTableDatosPerfilAccion.getRowCount()>=1) {
				jTableDatosPerfilAccion.removeRowSelectionInterval(0, jTableDatosPerfilAccion.getRowCount()-1);						
			}
			
			this.isEsNuevoPerfilAccion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPerfilAccion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPerfilAccion(true);			
			//this.perfilaccion=new PerfilAccion();
			//this.perfilaccion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilAccion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilAccion() ;
			
			if(PerfilAccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilAccion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.perfilaccion);	
			this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);				
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
			if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PerfilAccion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPerfilAccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPerfilAccion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPerfilAccion.getSelectedRows().length;			
			}
			
			perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPerfilAccion--;			
				//PerfilAccion perfilaccionAux= new PerfilAccion();			
				//perfilaccionAux.setId(this.iIdNuevoPerfilAccion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PerfilAccion perfilaccionOrigen=new PerfilAccion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PerfilAccion perfilaccionOrigen : perfilaccionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							perfilaccionOrigen =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilaccionOrigen =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPerfilAccion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.perfilaccion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPerfilAccion(perfilaccionOrigen,this.perfilaccion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilaccionLogic.getPerfilAccions().add(this.perfilaccionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfilaccions.add(this.perfilaccionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPerfilAccion(false);
				
				this.jTableDatosPerfilAccion.setRowSelectionInterval(this.getIndiceNuevoPerfilAccion(), this.getIndiceNuevoPerfilAccion());
				
				int iLastRow =  this.jTableDatosPerfilAccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfilAccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfilAccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilAccion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();									
		
			PerfilAccion perfilaccionOrigen=new PerfilAccion();
			PerfilAccion perfilaccionDestino=new PerfilAccion();
				
			perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPerfilAccion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || perfilaccionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPerfilAccion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionOrigen =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilaccionOrigen =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilaccionDestino =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilaccionDestino =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				perfilaccionOrigen =perfilaccionsSeleccionados.get(0);
				perfilaccionDestino =perfilaccionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPerfilAccion(perfilaccionOrigen,perfilaccionDestino,true,false);
				
				perfilaccionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilaccionDestino,perfilaccionLogic.getPerfilAccions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilaccionDestino,perfilaccions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPerfilAccion(false);
				
				//this.jTableDatosPerfilAccion.setRowSelectionInterval(this.getIndiceNuevoPerfilAccion(), this.getIndiceNuevoPerfilAccion());
				
				int iLastRow =  this.jTableDatosPerfilAccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfilAccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfilAccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilAccion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPerfilAccion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPerfilAccion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPerfilAccion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPerfilAccion.setVisible(!isVisible);
			this.jPanelPaginacionPerfilAccion.setVisible(!isVisible);
			this.jPanelAccionesPerfilAccion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePerfilAccion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPerfilAccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPerfilAccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPerfilAccion();
			
			this.abrirFrameOrderByPerfilAccion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPerfilAccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePerfilAccion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfilAccion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPerfilAccion.isMaximum()) {
					this.jInternalFrameDetalleFormPerfilAccion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPerfilAccion.setSize(this.jInternalFrameDetalleFormPerfilAccion.iWidthFormulario,this.jInternalFrameDetalleFormPerfilAccion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPerfilAccion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPerfilAccion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPerfilAccion.isMaximum()) {
						this.jInternalFrameDetalleFormPerfilAccion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPerfilAccion.jContentPaneDetallePerfilAccion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPerfilAccion.jContentPaneDetallePerfilAccion.getWidth(),PerfilAccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPerfilAccion.jContentPaneDetallePerfilAccion.getWidth(),PerfilAccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPerfilAccion.jContentPaneDetallePerfilAccion.getWidth(),PerfilAccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPerfilAccion.setVisible(true);
	        this.jInternalFrameDetalleFormPerfilAccion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPerfilAccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPerfilAccion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPerfilAccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilAccion,false,this);
				} else {
					this.jInternalFrameOrderByPerfilAccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilAccion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPerfilAccion);
				this.jInternalFrameOrderByPerfilAccion.setVisible(false);
				this.jInternalFrameOrderByPerfilAccion.setSelected(false);
				
				this.jInternalFrameOrderByPerfilAccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfilAccion"));
				
				this.inicializarActualizarBindingTablaOrderByPerfilAccion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPerfilAccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPerfilAccion==null) {
				
				this.jInternalFrameImportacionPerfilAccion=new ImportacionJInternalFrame(PerfilAccionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfilAccion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPerfilAccion);
				this.jInternalFrameImportacionPerfilAccion.setVisible(false);
				this.jInternalFrameImportacionPerfilAccion.setSelected(false);


				this.jInternalFrameImportacionPerfilAccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfilAccion"));
				this.jInternalFrameImportacionPerfilAccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfilAccion"));
				this.jInternalFrameImportacionPerfilAccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfilAccion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPerfilAccion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPerfilAccion==null) {
				this.jInternalFrameReporteDinamicoPerfilAccion=new ReporteDinamicoJInternalFrame(PerfilAccionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfilAccion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfilAccion);
				this.jInternalFrameReporteDinamicoPerfilAccion.setVisible(false);
				this.jInternalFrameReporteDinamicoPerfilAccion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPerfilAccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilAccion"));
				this.jInternalFrameReporteDinamicoPerfilAccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilAccion"));
				this.jInternalFrameReporteDinamicoPerfilAccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilAccion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilAccion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePerfilAccion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfilAccion);
			
	       	this.jInternalFrameDetalleFormPerfilAccion.setVisible(false);
	        this.jInternalFrameDetalleFormPerfilAccion.setSelected(false);
			
			//this.jInternalFrameDetalleFormPerfilAccion.dispose();
			//this.jInternalFrameDetalleFormPerfilAccion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPerfilAccion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPerfilAccion.setVisible(true);
	        this.jInternalFrameReporteDinamicoPerfilAccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPerfilAccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPerfilAccion.setVisible(true);
	        this.jInternalFrameImportacionPerfilAccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPerfilAccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPerfilAccion.setVisible(true);
	        this.jInternalFrameOrderByPerfilAccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPerfilAccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPerfilAccion.setVisible(false);
	        this.jInternalFrameOrderByPerfilAccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPerfilAccion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPerfilAccion.setVisible(false);
	        this.jInternalFrameReporteDinamicoPerfilAccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPerfilAccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPerfilAccion.setVisible(false);
	        this.jInternalFrameImportacionPerfilAccion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPerfilAccion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPerfilAccion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPerfilAccion(true);
			//this.isEsNuevoPerfilAccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPerfilAccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilAccion(false) ;
			
			if(perfilaccionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PerfilAccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilAccion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilAccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPerfilAccionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPerfilAccion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPerfilAccion(true);
			//this.isEsNuevoPerfilAccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.perfilaccion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPerfilAccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPerfilAccion(false) ;
			
			if(PerfilAccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilAccion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilAccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Perfil")) {
				if(!this.perfilaccionConstantesFunciones.cargarid_perfilPerfilAccion) {
					this.cargarCombosPerfilsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPerfilAccion(false,false);
					this.cargarCombosFramePerfilsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_perfil (id);

				this.recargarComboTablaPerfil(this.perfilsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPerfil(List<Perfil> perfilsForeignKey)throws Exception{
		TableColumn tableColumnPerfil=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,PerfilAccionConstantesFunciones.LABEL_IDPERFIL));
		TableCellEditor tableCellEditorPerfil =tableColumnPerfil.getCellEditor();

		PerfilTableCell perfilTableCellFk=(PerfilTableCell)tableCellEditorPerfil;

		if(perfilTableCellFk!=null) {
			perfilTableCellFk.setperfilsForeignKey(perfilsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilAccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//perfilTableCellFk.setRowActual(intSelectedRow);
			//perfilTableCellFk.setperfilsForeignKeyActual(perfilsForeignKey);
		//}


		if(perfilTableCellFk!=null) {
			perfilTableCellFk.RecargarPerfilsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAccion(List<Accion> accionsForeignKey)throws Exception{
		TableColumn tableColumnAccion=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,PerfilAccionConstantesFunciones.LABEL_IDACCION));
		TableCellEditor tableCellEditorAccion =tableColumnAccion.getCellEditor();

		AccionTableCell accionTableCellFk=(AccionTableCell)tableCellEditorAccion;

		if(accionTableCellFk!=null) {
			accionTableCellFk.setaccionsForeignKey(accionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilAccion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//accionTableCellFk.setRowActual(intSelectedRow);
			//accionTableCellFk.setaccionsForeignKeyActual(accionsForeignKey);
		//}


		if(accionTableCellFk!=null) {
			accionTableCellFk.RecargarAccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_perfil (Long id) throws Exception {
		this.setActualPerfilForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPerfilAccion(false);
			
			//if(!this.isEsNuevoPerfilAccion) {								
				int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
				
			}
			
			if(this.permiteMantenimiento(this.perfilaccion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPerfilAccion=true;
					this.inicializarActualizarBindingTablaPerfilAccion(false);
					this.isEsNuevoPerfilAccion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPerfilAccion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPerfilAccion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfilAccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilAccion(false);
				
				this.habilitarDeshabilitarControlesPerfilAccion(false);
			
												
				
				if(PerfilAccionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePerfilAccion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPerfilAccionActionPerformed(evt,perfilaccionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPerfilAccion(this.perfilaccion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPerfilAccion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,perfilaccionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.perfilaccion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPerfilAccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				this.perfilaccion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				this.perfilaccion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.perfilaccion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PerfilAccionModel) this.jTableDatosPerfilAccion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPerfilAccion=true;
				this.inicializarActualizarBindingTablaPerfilAccion(false);
				this.isEsNuevoPerfilAccion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfilAccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilAccion(false);
				
				this.habilitarDeshabilitarControlesPerfilAccion(false);
				
				
				
				if(PerfilAccionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePerfilAccion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPerfilAccionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPerfilAccion.getRowCount()>=1) {
				jTableDatosPerfilAccion.removeRowSelectionInterval(0, jTableDatosPerfilAccion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPerfilAccion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPerfilAccion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilAccion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilAccion(false) ;
			
			this.isEsNuevoPerfilAccion=false;
			
			if(PerfilAccionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePerfilAccion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPerfilAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPerfilAccion(false);
				
				//SI ES MANUAL
				if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPerfilAccion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPerfilAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPerfilAccion--;			
			//PerfilAccion perfilaccionAux= new PerfilAccion();			
			//perfilaccionAux.setId(this.iIdNuevoPerfilAccion);
			
			if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPerfilAccion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
			
			this.perfilaccion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.perfilaccionLogic.getPerfilAccions().add(this.perfilaccionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.perfilaccions.add(this.perfilaccionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPerfilAccion(false);
			
			this.jTableDatosPerfilAccion.setRowSelectionInterval(this.getIndiceNuevoPerfilAccion(), this.getIndiceNuevoPerfilAccion());
			
			int iLastRow =  this.jTableDatosPerfilAccion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPerfilAccion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPerfilAccion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPerfilAccion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPerfilAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPerfilAccion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilAccion(false);
			
			//SI ES MANUAL
			if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilAccion();
			}
			
			//this.abrirFrameTreePerfilAccion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPerfilAccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Perfil AccionES ?", "MANTENIMIENTO DE Perfil Accion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPerfilAccion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPerfilAccion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.perfilaccionReturnGeneral=perfilaccionLogic.procesarImportacionPerfilAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.perfilaccionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPerfilAccionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPerfilAccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPerfilAccion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPerfilAccion.setFileImportacion(this.jInternalFrameImportacionPerfilAccion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPerfilAccion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPerfilAccion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPerfilAccion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPerfilAccion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPerfilAccionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		

		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PerfilAccionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PerfilAccionBaseDesign.jrxml";
			
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
			
			this.generarReportePerfilAccions("Todos",perfilaccionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilAccionConstantesFunciones.LABEL_IDPERFIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Perfil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Perfil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Perfil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Perfil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilAccionConstantesFunciones.LABEL_IDACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Accion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Accion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Accion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Accion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilAccionConstantesFunciones.LABEL_EJECUSION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecusion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecusion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecusion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecusion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilAccionConstantesFunciones.LABEL_ESTADO:
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
		
		if(this.jInternalFrameReporteDinamicoPerfilAccion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PerfilAccionConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoria="id_perfil";
					break;

				case PerfilAccionConstantesFunciones.LABEL_IDACCION:
					sNombreCampoCategoria="id_accion";
					break;

				case PerfilAccionConstantesFunciones.LABEL_EJECUSION:
					sNombreCampoCategoria="ejecusion";
					break;

				case PerfilAccionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PerfilAccionConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoriaValor="id_perfil";
					break;

				case PerfilAccionConstantesFunciones.LABEL_IDACCION:
					sNombreCampoCategoriaValor="id_accion";
					break;

				case PerfilAccionConstantesFunciones.LABEL_EJECUSION:
					sNombreCampoCategoriaValor="ejecusion";
					break;

				case PerfilAccionConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilAccionConstantesFunciones.LABEL_IDPERFIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_perfil");
					break;

				case PerfilAccionConstantesFunciones.LABEL_IDACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Accion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_accion");
					break;

				case PerfilAccionConstantesFunciones.LABEL_EJECUSION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejecusion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ejecusion");
					break;

				case PerfilAccionConstantesFunciones.LABEL_ESTADO:
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
	
	public void jButtonGenerarExcelReporteDinamicoPerfilAccionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilaccion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PerfilAccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PerfilAccionConstantesFunciones.LABEL_IDPERFIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_IDPERFIL);
					iRow++;

					for(PerfilAccion perfilaccion:perfilaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilaccion.getperfil_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilAccionConstantesFunciones.LABEL_IDACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_IDACCION);
					iRow++;

					for(PerfilAccion perfilaccion:perfilaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilaccion.getaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilAccionConstantesFunciones.LABEL_EJECUSION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_EJECUSION);
					iRow++;

					for(PerfilAccion perfilaccion:perfilaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilaccion.getejecusion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilAccionConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(PerfilAccion perfilaccion:perfilaccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilaccion.getestado());
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
			//	this.getFilaCabeceraExportarExcelPerfilAccion(row);				
			//	iRow++;
			//}				
			
			//for(PerfilAccion perfilaccionAux:perfilaccionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPerfilAccion(perfilaccionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
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
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilAccion(false);
			
			//SI ES MANUAL
			if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilAccion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPerfilAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilAccion(false);
			
			//SI ES MANUAL
			if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfilAccion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPerfilAccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilAccion(false);
			
			//SI ES MANUAL
			if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfilAccion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPerfilAccion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPerfilAccion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPerfilAccion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPerfilAccion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPerfilAccion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPerfilAccion.setMinimumSize(dimensionMinimum);
		this.jTableDatosPerfilAccion.setMaximumSize(dimensionMaximum);
		this.jTableDatosPerfilAccion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPerfilAccion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPerfilAccion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPerfilAccion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPerfilAccion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPerfilAccion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPerfilAccion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilAccion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPerfilAccion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPerfilAccion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPerfilAccion();
		
		this.inicializarActualizarBindingBotonesManualPerfilAccion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPerfilAccion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilAccion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilAccion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilAccion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPerfilAccion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPerfilAccion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePerfilAccion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxPostAccionNuevoPerfilAccion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxPostAccionSinCerrarPerfilAccion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxPostAccionSinMensajePerfilAccion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPerfilAccion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPerfilAccion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePerfilAccion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
				this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxPostAccionNuevoPerfilAccion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxPostAccionSinCerrarPerfilAccion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxPostAccionSinMensajePerfilAccion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPerfilAccion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPerfilAccion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPerfilAccion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPerfilAccion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPerfilAccion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPerfilAccion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPerfilAccion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPerfilAccion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPerfilAccion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPerfilAccion(Boolean esInicializar) throws Exception {
		try	{	
			if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilAccion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPerfilAccion() throws Exception {
		try	{
			if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfilAccion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfilAccion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfilAccion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPerfilAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPerfilAccion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPerfilAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPerfilAccion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPerfilAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPerfilAccion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPerfilAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPerfilAccion.addItem(reporte);
			}
			
			
			if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPerfilAccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPerfilAccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPerfilAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPerfilAccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPerfilAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPerfilAccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPerfilAccion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPerfilAccion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPerfilAccion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilAccion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilAccion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
				this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
				this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfilAccion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
				
				if(this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfilAccion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPerfilAccion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfilAccion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfilAccion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPerfilAccion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_accionFK_IdAccionPerfilAccion.getSelectedItem()!=null){this.id_accionFK_IdAccion=((Accion)this.jComboBoxid_accionFK_IdAccionPerfilAccion.getSelectedItem()).getId();}
		if(this.jComboBoxid_perfilFK_IdPerfilPerfilAccion.getSelectedItem()!=null){this.id_perfilFK_IdPerfil=((Perfil)this.jComboBoxid_perfilFK_IdPerfilPerfilAccion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPerfilAccion(Boolean esInicializar) throws Exception {				
		if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPerfilAccion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPerfilAccion() throws Exception {
		this.inicializarActualizarBindingTablaPerfilAccion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPerfilAccion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPerfilAccionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPerfilAccion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=perfilaccionLogic.getPerfilAccions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=perfilaccions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPerfilAccion.setModel(new PerfilAccionModel(this.perfilaccionLogic.getPerfilAccions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPerfilAccion.setModel(new PerfilAccionModel(this.perfilaccions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPerfilAccion!=null && this.jInternalFrameOrderByPerfilAccion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPerfilAccion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO,perfilaccionConstantesFunciones.resaltarSeleccionarPerfilAccion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PerfilAccionConstantesFunciones.SCLASSWEBTITULO,perfilaccionConstantesFunciones.resaltarSeleccionarPerfilAccion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,PerfilAccionConstantesFunciones.LABEL_ID));

		if(this.perfilaccionConstantesFunciones.mostraridPerfilAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilAccionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.perfilaccionConstantesFunciones.resaltaridPerfilAccion,this.perfilaccionConstantesFunciones.activaridPerfilAccion,this,true,"idPerfilAccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.perfilaccionConstantesFunciones.resaltaridPerfilAccion,this.perfilaccionConstantesFunciones.activaridPerfilAccion,this,true,"idPerfilAccion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,PerfilAccionConstantesFunciones.LABEL_IDPERFIL));

		if(this.perfilaccionConstantesFunciones.mostrarid_perfilPerfilAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilAccionConstantesFunciones.LABEL_IDPERFIL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PerfilTableCell(this.perfilsForeignKey,this.perfilaccionConstantesFunciones.resaltarid_perfilPerfilAccion,this,this.perfilaccionConstantesFunciones.activarid_perfilPerfilAccion));
			tableColumn.setCellEditor(new PerfilTableCell(this.perfilsForeignKey,this.perfilaccionConstantesFunciones.resaltarid_perfilPerfilAccion,this,this.perfilaccionConstantesFunciones.activarid_perfilPerfilAccion,true,"id_perfilPerfilAccion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,PerfilAccionConstantesFunciones.LABEL_IDACCION));

		if(this.perfilaccionConstantesFunciones.mostrarid_accionPerfilAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilAccionConstantesFunciones.LABEL_IDACCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AccionTableCell(this.accionsForeignKey,this.perfilaccionConstantesFunciones.resaltarid_accionPerfilAccion,this,this.perfilaccionConstantesFunciones.activarid_accionPerfilAccion));
			tableColumn.setCellEditor(new AccionTableCell(this.accionsForeignKey,this.perfilaccionConstantesFunciones.resaltarid_accionPerfilAccion,this,this.perfilaccionConstantesFunciones.activarid_accionPerfilAccion,true,"id_accionPerfilAccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,PerfilAccionConstantesFunciones.LABEL_EJECUSION));

		if(this.perfilaccionConstantesFunciones.mostrarejecusionPerfilAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilAccionConstantesFunciones.LABEL_EJECUSION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilaccionConstantesFunciones.resaltarejecusionPerfilAccion,this.perfilaccionConstantesFunciones.activarejecusionPerfilAccion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilaccionConstantesFunciones.resaltarejecusionPerfilAccion,this.perfilaccionConstantesFunciones.activarejecusionPerfilAccion,this,true,"ejecusionPerfilAccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,PerfilAccionConstantesFunciones.LABEL_ESTADO));

		if(this.perfilaccionConstantesFunciones.mostrarestadoPerfilAccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilAccionConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilaccionConstantesFunciones.resaltarestadoPerfilAccion,this.perfilaccionConstantesFunciones.activarestadoPerfilAccion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilaccionConstantesFunciones.resaltarestadoPerfilAccion,this.perfilaccionConstantesFunciones.activarestadoPerfilAccion,this,true,"estadoPerfilAccion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilAccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilaccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilaccionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfilAccion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilaccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilaccionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfilAccion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.perfilaccionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.perfilaccionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPerfilAccion.addColumn(tableColumn);
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
			
			this.jTableDatosPerfilAccion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPerfilAccion.moveColumn(this.jTableDatosPerfilAccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPerfilAccion.moveColumn(this.jTableDatosPerfilAccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPerfilAccion.moveColumn(this.jTableDatosPerfilAccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPerfilAccion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPerfilAccion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPerfilAccion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPerfilAccion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPerfilAccion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPerfilAccion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPerfilAccion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPerfilAccion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=perfilaccionLogic.getPerfilAccions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=perfilaccions.size()-1;
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
		//this.jTableDatosPerfilAccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPerfilAccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPerfilAccion();
			
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
				
				//this.isEsNuevoPerfilAccion=false;
					
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
				if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPerfilAccion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfilAccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfilAccion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.perfilaccion.getsType().equals("DUPLICADO")
				   || this.perfilaccion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPerfilAccion=true;
				
				} else {
					this.isEsNuevoPerfilAccion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
					if(this.perfilaccion.getId()>=0 && !this.perfilaccion.getIsNew()) {						
						this.isEsNuevoPerfilAccion=false;
						
					} else {
						this.isEsNuevoPerfilAccion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPerfilAccion(esRelaciones);						
				
				this.seleccionarPerfilAccion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.perfilaccion.getId()<0) {
					this.isEsNuevoPerfilAccion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPerfilAccion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPerfilAccion(evt,rowIndex);
				}	
				
				if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PerfilAccion: " + this.dDif); 
					}
				}								
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPerfilAccion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.perfilaccion)) {
					if(this.perfilaccion.getId()>0) {
						this.perfilaccion.setIsDeleted(true);
						
						this.perfilaccionsEliminados.add(this.perfilaccion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilaccionLogic.getPerfilAccions().remove(this.perfilaccion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfilaccions.remove(this.perfilaccion);				
					}
					
					
					((PerfilAccionModel) this.jTableDatosPerfilAccion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilAccion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPerfilAccion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPerfilAccion) {
			
			if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfilAccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfilAccion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPerfilAccion(this.perfilaccion);
				}
				
				//ARCHITECTURE
				try {
					

					//Perfil
					if(!this.perfilaccionConstantesFunciones.cargarid_perfilPerfilAccion || this.perfilaccionConstantesFunciones.event_dependid_perfilPerfilAccion) {
						//this.cargarCombosPerfilsForeignKeyLista(" where id="+this.perfilaccion.getid_perfil());
									//this.inicializarActualizarBindingPerfilAccion(false,false);
						this.perfilsForeignKey=new ArrayList<Perfil>();

						if(perfilaccion.getPerfil()!=null) {
							this.perfilsForeignKey.add(perfilaccion.getPerfil());
						}

						this.addItemDefectoCombosForeignKeyPerfil();
						this.cargarCombosFramePerfilsForeignKey("Todos");
					}
					this.setActualPerfilForeignKey(this.perfilaccion.getid_perfil(),false,"Formulario");

					//Accion
					if(!this.perfilaccionConstantesFunciones.cargarid_accionPerfilAccion || this.perfilaccionConstantesFunciones.event_dependid_accionPerfilAccion) {
						//this.cargarCombosAccionsForeignKeyLista(" where id="+this.perfilaccion.getid_accion());
									//this.inicializarActualizarBindingPerfilAccion(false,false);
						this.accionsForeignKey=new ArrayList<Accion>();

						if(perfilaccion.getAccion()!=null) {
							this.accionsForeignKey.add(perfilaccion.getAccion());
						}

						this.addItemDefectoCombosForeignKeyAccion();
						this.cargarCombosFrameAccionsForeignKey("Todos");
					}
					this.setActualAccionForeignKey(this.perfilaccion.getid_accion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPerfilAccion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPerfilAccion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilAccion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfilAccion(PerfilAccion perfilaccion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPerfilAccion(perfilaccion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfilAccion(PerfilAccion perfilaccion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPerfilAccion(perfilaccion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPerfilAccion(perfilaccion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPerfilAccion(perfilaccion);
	}
	
	public void setVariablesObjetoActualToFormularioPerfilAccion(PerfilAccion perfilaccion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.setText(perfilaccion.getId().toString());
			this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.setSelected(perfilaccion.getejecusion());
			this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.setSelected(perfilaccion.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PerfilAccion perfilaccionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,perfilaccionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PerfilAccion perfilaccionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				perfilaccionLocal=this.perfilaccion;
			} else {
				perfilaccionLocal=this.perfilaccionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(perfilaccionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPerfilAccion(perfilaccionLocal,true);
					
					if(perfilaccionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(perfilaccionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(perfilaccionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPerfilAccion(PerfilAccion perfilaccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfilAccion(perfilaccion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(perfilaccion);
	}
	
	public void setVariablesFormularioToObjetoActualPerfilAccion(PerfilAccion perfilaccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfilAccion(perfilaccion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPerfilAccion(PerfilAccion perfilaccion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.getText()==null || this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.getText()=="" || this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.getText()=="Id") {
				this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.setText("0");
			}

			if(conColumnasBase) {perfilaccion.setId(Long.parseLong(this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilAccionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilAccion.jLabelIdPerfilAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilaccion.setejecusion(this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilAccionConstantesFunciones.LABEL_EJECUSION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilAccion.jLabelejecusionPerfilAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilaccion.setestado(this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilAccionConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilAccion.jLabelestadoPerfilAccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfilAccion(PerfilAccion perfilaccionBean,PerfilAccion perfilaccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && perfilaccionBean.getid_perfil()!=null && !perfilaccionBean.getid_perfil().equals(-1L))) {perfilaccion.setid_perfil(perfilaccionBean.getid_perfil());}
			if(conDefault || (!conDefault && perfilaccionBean.getid_accion()!=null && !perfilaccionBean.getid_accion().equals(-1L))) {perfilaccion.setid_accion(perfilaccionBean.getid_accion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPerfilAccion(PerfilAccion perfilaccionOrigen,PerfilAccion perfilaccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilaccionOrigen.getId()!=null && !perfilaccionOrigen.getId().equals(0L))) {perfilaccion.setId(perfilaccionOrigen.getId());}}
			if(conDefault || (!conDefault && perfilaccionOrigen.getid_perfil()!=null && !perfilaccionOrigen.getid_perfil().equals(-1L))) {perfilaccion.setid_perfil(perfilaccionOrigen.getid_perfil());}
			if(conDefault || (!conDefault && perfilaccionOrigen.getid_accion()!=null && !perfilaccionOrigen.getid_accion().equals(-1L))) {perfilaccion.setid_accion(perfilaccionOrigen.getid_accion());}
			if(conDefault || (!conDefault && perfilaccionOrigen.getejecusion()!=null && !perfilaccionOrigen.getejecusion().equals(false))) {perfilaccion.setejecusion(perfilaccionOrigen.getejecusion());}
			if(conDefault || (!conDefault && perfilaccionOrigen.getestado()!=null && !perfilaccionOrigen.getestado().equals(false))) {perfilaccion.setestado(perfilaccionOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfilAccion(PerfilAccion perfilaccion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.setText(perfilaccion.getId().toString());
			this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.setSelected(perfilaccion.getejecusion());
			this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.setSelected(perfilaccion.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfilAccion(PerfilAccionBean perfilaccionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.setText(perfilaccionBean.getId().toString());
			this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.setSelected(perfilaccionBean.getejecusion());
			this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.setSelected(perfilaccionBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPerfilAccion(PerfilAccionParameterReturnGeneral perfilaccionReturnGeneral,PerfilAccionBean perfilaccionBean,Boolean conDefault) throws Exception { 
		try {
			PerfilAccion perfilaccionLocal=new PerfilAccion();
			
			perfilaccionLocal=perfilaccionReturnGeneral.getPerfilAccion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilaccionLocal.getId()!=null && !perfilaccionLocal.getId().equals(0L))) {perfilaccionBean.setId(perfilaccionLocal.getId());}}
			if(conDefault || (!conDefault && perfilaccionLocal.getid_perfil()!=null && !perfilaccionLocal.getid_perfil().equals(-1L))) {perfilaccionBean.setid_perfil(perfilaccionLocal.getid_perfil());}
			if(conDefault || (!conDefault && perfilaccionLocal.getid_accion()!=null && !perfilaccionLocal.getid_accion().equals(-1L))) {perfilaccionBean.setid_accion(perfilaccionLocal.getid_accion());}
			if(conDefault || (!conDefault && perfilaccionLocal.getejecusion()!=null && !perfilaccionLocal.getejecusion().equals(false))) {perfilaccionBean.setejecusion(perfilaccionLocal.getejecusion());}
			if(conDefault || (!conDefault && perfilaccionLocal.getestado()!=null && !perfilaccionLocal.getestado().equals(false))) {perfilaccionBean.setestado(perfilaccionLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPerfilAccionGenerico(Long idPerfilAccionSeleccionado,JComboBox jComboBoxPerfilAccion,List<PerfilAccion> perfilaccionsLocal)throws Exception {
		try {
			PerfilAccion  perfilaccionTemp=null;

			for(PerfilAccion perfilaccionAux:perfilaccionsLocal) {
				if(perfilaccionAux.getId()!=null && perfilaccionAux.getId().equals(idPerfilAccionSeleccionado)) {
					perfilaccionTemp=perfilaccionAux;
					break;
				}
			}

			jComboBoxPerfilAccion.setSelectedItem(perfilaccionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPerfilAccionGenerico(JComboBox jComboBoxPerfilAccion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilAccion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPerfilAccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilAccion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPerfilAccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPerfilAccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPerfilAccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilaccion=(PerfilAccion) perfilaccionLogic.getPerfilAccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilaccion =(PerfilAccion) perfilaccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Perfil")) {
			//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
			if(!perfilaccion.getIsNew() && !perfilaccion.getIsChanged() && !perfilaccion.getIsDeleted()) {
				sDescripcion=perfilaccion.getperfil_descripcion();
			} else {
				//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
				sDescripcion=perfilaccion.getperfil_descripcion();
			}
		}

		if(sTipo.equals("Accion")) {
			//sDescripcion=this.getActualAccionForeignKeyDescripcion((Long)value);
			if(!perfilaccion.getIsNew() && !perfilaccion.getIsChanged() && !perfilaccion.getIsDeleted()) {
				sDescripcion=perfilaccion.getaccion_descripcion();
			} else {
				//sDescripcion=this.getActualAccionForeignKeyDescripcion((Long)value);
				sDescripcion=perfilaccion.getaccion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PerfilAccion perfilaccionRow=new PerfilAccion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilaccionRow=(PerfilAccion) perfilaccionLogic.getPerfilAccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilaccionRow=(PerfilAccion) perfilaccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPerfilAccion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoPerfilAccion && this.isPermisoNuevoPerfilAccion));			
			this.jButtonDuplicarPerfilAccion.setVisible((this.isVisibilidadCeldaDuplicarPerfilAccion && this.isPermisoDuplicarPerfilAccion));			
			this.jButtonCopiarPerfilAccion.setVisible((this.isVisibilidadCeldaCopiarPerfilAccion && this.isPermisoCopiarPerfilAccion));
			this.jButtonVerFormPerfilAccion.setVisible((this.isVisibilidadCeldaVerFormPerfilAccion && this.isPermisoVerFormPerfilAccion));
			
			this.jButtonAbrirOrderByPerfilAccion.setVisible((this.isVisibilidadCeldaOrdenPerfilAccion && this.isPermisoOrdenPerfilAccion));			
			
			this.jButtonNuevoRelacionesPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilAccion && this.isPermisoNuevoPerfilAccion));			
			this.jButtonNuevoGuardarCambiosPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoPerfilAccion && this.isPermisoNuevoPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));
			
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarPerfilAccion.setVisible((this.isVisibilidadCeldaModificarPerfilAccion && this.isPermisoActualizarPerfilAccion));	
			this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarPerfilAccion.setVisible((this.isVisibilidadCeldaActualizarPerfilAccion && this.isPermisoActualizarPerfilAccion));	
			this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarPerfilAccion.setVisible((this.isVisibilidadCeldaEliminarPerfilAccion && this.isPermisoEliminarPerfilAccion));
			this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarPerfilAccion.setVisible(this.isVisibilidadCeldaCancelarPerfilAccion);							
			this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosPerfilAccion.setVisible((this.isVisibilidadCeldaGuardarPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));			
			
			}
						
			this.jButtonGuardarCambiosTablaPerfilAccion.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoPerfilAccion && this.isPermisoNuevoPerfilAccion));						
			this.jButtonDuplicarToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaDuplicarPerfilAccion && this.isPermisoDuplicarPerfilAccion));						
			this.jButtonCopiarToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaCopiarPerfilAccion && this.isPermisoCopiarPerfilAccion));			
			this.jButtonVerFormToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaVerFormPerfilAccion && this.isPermisoVerFormPerfilAccion));			
			this.jButtonAbrirOrderByToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaOrdenPerfilAccion && this.isPermisoOrdenPerfilAccion));
			this.jButtonNuevoRelacionesToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilAccion && this.isPermisoNuevoPerfilAccion));			
			this.jButtonNuevoGuardarCambiosToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoPerfilAccion && this.isPermisoNuevoPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));			
			
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaModificarPerfilAccion && this.isPermisoActualizarPerfilAccion));	
			this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaActualizarPerfilAccion  && this.isPermisoActualizarPerfilAccion));	
			this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaEliminarPerfilAccion && this.isPermisoEliminarPerfilAccion));
			this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarToolBarPerfilAccion.setVisible(this.isVisibilidadCeldaCancelarPerfilAccion);				
			this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaGuardarPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPerfilAccion.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoPerfilAccion && this.isPermisoNuevoPerfilAccion));			
			this.jMenuItemDuplicarPerfilAccion.setVisible((this.isVisibilidadCeldaDuplicarPerfilAccion && this.isPermisoDuplicarPerfilAccion));			
			this.jMenuItemCopiarPerfilAccion.setVisible((this.isVisibilidadCeldaCopiarPerfilAccion && this.isPermisoCopiarPerfilAccion));			
			this.jMenuItemVerFormPerfilAccion.setVisible((this.isVisibilidadCeldaVerFormPerfilAccion && this.isPermisoVerFormPerfilAccion));			
			this.jMenuItemAbrirOrderByPerfilAccion.setVisible((this.isVisibilidadCeldaOrdenPerfilAccion && this.isPermisoOrdenPerfilAccion));			
			//this.jMenuItemMostrarOcultarPerfilAccion.setVisible((this.isVisibilidadCeldaOrdenPerfilAccion && this.isPermisoOrdenPerfilAccion));
			this.jMenuItemDetalleAbrirOrderByPerfilAccion.setVisible((this.isVisibilidadCeldaOrdenPerfilAccion && this.isPermisoOrdenPerfilAccion));			
			//this.jMenuItemDetalleMostrarOcultarPerfilAccion.setVisible((this.isVisibilidadCeldaOrdenPerfilAccion && this.isPermisoOrdenPerfilAccion));			
			this.jMenuItemNuevoRelacionesPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilAccion && this.isPermisoNuevoPerfilAccion));			
			this.jMenuItemNuevoGuardarCambiosPerfilAccion.setVisible((this.isVisibilidadCeldaNuevoPerfilAccion && this.isPermisoNuevoPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));									
			
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemModificarPerfilAccion.setVisible((this.isVisibilidadCeldaModificarPerfilAccion && this.isPermisoActualizarPerfilAccion));	
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemActualizarPerfilAccion.setVisible((this.isVisibilidadCeldaActualizarPerfilAccion && this.isPermisoActualizarPerfilAccion));	
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemEliminarPerfilAccion.setVisible((this.isVisibilidadCeldaEliminarPerfilAccion && this.isPermisoEliminarPerfilAccion));
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemCancelarPerfilAccion.setVisible(this.isVisibilidadCeldaCancelarPerfilAccion);				
			}
			
			this.jMenuItemGuardarCambiosPerfilAccion.setVisible((this.isVisibilidadCeldaGuardarPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));						
			this.jMenuItemGuardarCambiosTablaPerfilAccion.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPerfilAccion=this.jButtonNuevoPerfilAccion.isVisible();
			this.isVisibilidadCeldaDuplicarPerfilAccion=this.jButtonDuplicarPerfilAccion.isVisible();
			this.isVisibilidadCeldaCopiarPerfilAccion=this.jButtonCopiarPerfilAccion.isVisible();
			this.isVisibilidadCeldaVerFormPerfilAccion=this.jButtonVerFormPerfilAccion.isVisible();
			
			this.isVisibilidadCeldaOrdenPerfilAccion=this.jButtonAbrirOrderByPerfilAccion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=this.jButtonNuevoRelacionesPerfilAccion.isVisible();
			this.isVisibilidadCeldaModificarPerfilAccion=this.jButtonModificarPerfilAccion.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			this.isVisibilidadCeldaActualizarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarPerfilAccion.isVisible();
			this.isVisibilidadCeldaEliminarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarPerfilAccion.isVisible();
			this.isVisibilidadCeldaCancelarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarPerfilAccion.isVisible();
			this.isVisibilidadCeldaGuardarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosPerfilAccion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=this.jButtonGuardarCambiosTablaPerfilAccion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPerfilAccion=this.jButtonNuevoToolBarPerfilAccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=this.jButtonNuevoRelacionesToolBarPerfilAccion.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			this.isVisibilidadCeldaModificarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarToolBarPerfilAccion.isVisible();
			this.isVisibilidadCeldaActualizarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarToolBarPerfilAccion.isVisible();
			this.isVisibilidadCeldaEliminarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarToolBarPerfilAccion.isVisible();
			this.isVisibilidadCeldaCancelarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarToolBarPerfilAccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfilAccion=this.jButtonGuardarCambiosToolBarPerfilAccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=this.jButtonGuardarCambiosTablaToolBarPerfilAccion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPerfilAccion=this.jMenuItemNuevoPerfilAccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=this.jMenuItemNuevoRelacionesPerfilAccion.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			this.isVisibilidadCeldaModificarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jMenuItemModificarPerfilAccion.isVisible();
			this.isVisibilidadCeldaActualizarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jMenuItemActualizarPerfilAccion.isVisible();
			this.isVisibilidadCeldaEliminarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jMenuItemEliminarPerfilAccion.isVisible();
			this.isVisibilidadCeldaCancelarPerfilAccion=this.jInternalFrameDetalleFormPerfilAccion.jMenuItemCancelarPerfilAccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfilAccion=this.jMenuItemGuardarCambiosPerfilAccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=this.jMenuItemGuardarCambiosTablaPerfilAccion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPerfilAccion(Boolean esInicializar) {
		if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
				//if(this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPerfilAccion();
			}
			
			this.inicializarActualizarBindingBotonesManualPerfilAccion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPerfilAccion() {
		this.jButtonNuevoPerfilAccion.setVisible(this.isPermisoNuevoPerfilAccion);			
		this.jButtonDuplicarPerfilAccion.setVisible(this.isPermisoDuplicarPerfilAccion);			
		this.jButtonCopiarPerfilAccion.setVisible(this.isPermisoCopiarPerfilAccion);			
		this.jButtonVerFormPerfilAccion.setVisible(this.isPermisoVerFormPerfilAccion);			
		
		this.jButtonAbrirOrderByPerfilAccion.setVisible(this.isPermisoOrdenPerfilAccion);					
		
		this.jButtonNuevoRelacionesPerfilAccion.setVisible(this.isPermisoNuevoPerfilAccion);			
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarPerfilAccion.setVisible(this.isPermisoActualizarPerfilAccion);	
			this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarPerfilAccion.setVisible(this.isPermisoActualizarPerfilAccion);	
			this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarPerfilAccion.setVisible(this.isPermisoEliminarPerfilAccion);
			this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarPerfilAccion.setVisible(this.isVisibilidadCeldaCancelarPerfilAccion);						
			this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosPerfilAccion.setVisible(this.isPermisoGuardarCambiosPerfilAccion);							
		}
		
		this.jButtonGuardarCambiosTablaPerfilAccion.setVisible(this.isPermisoActualizarPerfilAccion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePerfilAccion() {
		this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarPerfilAccion.setVisible(this.isPermisoActualizarPerfilAccion);	
		this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarPerfilAccion.setVisible(this.isPermisoActualizarPerfilAccion);	
		this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarPerfilAccion.setVisible(this.isPermisoEliminarPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarPerfilAccion.setVisible(this.isVisibilidadCeldaCancelarPerfilAccion);							
		this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosPerfilAccion.setVisible((this.isVisibilidadCeldaGuardarPerfilAccion && this.isPermisoGuardarCambiosPerfilAccion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPerfilAccion() {
		if(PerfilAccionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPerfilAccion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPerfilAccion() {
	}
	
	public void jTableDatosPerfilAccionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPerfilAccion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPerfilAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilAccion(this.getperfilaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilaccion==null) {
						this.perfilaccion = new PerfilAccion();
					}

					this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
				}

				if(this.perfilaccion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.perfilaccion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_perfilPerfilAccionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.perfilBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.perfilBeanSwingJInternalFrame.sTipoBusqueda="Perfil";

			if(!this.sFinalQueryGeneral_perfil.equals("")) {
				this.perfilBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_perfil);
				this.perfilBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.perfilBeanSwingJInternalFrame.procesarBusqueda(this.perfilBeanSwingJInternalFrame.sAccionBusqueda);
				this.perfilBeanSwingJInternalFrame.inicializarActualizarBindingPerfil(false);
			}

			if(!this.sFinalQueryComboPerfil.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.perfilBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPerfilAccion=null;
			TitledBorder titledBorderperfil=null;

			if(!this.jScrollPanelDatosPerfilAccion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPerfilAccion=(TitledBorder)this.jScrollPanelDatosPerfilAccion.getBorder();
				titledBorderperfil=(TitledBorder)this.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getBorder();

				titledBorderperfil.setTitle(titledBorderPerfilAccion.getTitle() + " -> Perfil");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_perfilPerfilAccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperfil=true;

			idTienePermisoperfil=this.tienePermisosUsuarioEnPaginaWebPerfilAccion(PerfilConstantesFunciones.CLASSNAME);

			if(idTienePermisoperfil) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilAccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilAccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilAccion(this.getperfilaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);

				this.perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.perfilBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.perfilBeanSwingJInternalFrame.getPerfilLogic().setConnexion(this.perfilaccionLogic.getConnexion());

				if(this.perfilaccion.getid_perfil()!=null) {
					this.perfilBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.perfilBeanSwingJInternalFrame.setIdActual(this.perfilaccion.getid_perfil());
					this.perfilBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfil();
				}

				JInternalFrameBase jinternalFrame =this.perfilBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilAccion=(TitledBorder)this.jScrollPanelDatosPerfilAccion.getBorder();
				TitledBorder titledBorderperfil=(TitledBorder)this.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getBorder();

				titledBorderperfil.setTitle(titledBorderPerfilAccion.getTitle() + " -> Perfil");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_perfilPerfilAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilAccion(this.getperfilaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilaccion==null) {
						this.perfilaccion = new PerfilAccion();
					}

					this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
				}

				if(this.perfilaccion.getid_perfil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_perfil = "+this.perfilaccion.getid_perfil().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_accionPerfilAccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoaccion=true;

			idTienePermisoaccion=this.tienePermisosUsuarioEnPaginaWebPerfilAccion(AccionConstantesFunciones.CLASSNAME);

			if(idTienePermisoaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilAccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilAccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilAccion(this.getperfilaccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);

				this.accionBeanSwingJInternalFrame=new AccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.accionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.accionBeanSwingJInternalFrame.getAccionLogic().setConnexion(this.perfilaccionLogic.getConnexion());

				if(this.perfilaccion.getid_accion()!=null) {
					this.accionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.accionBeanSwingJInternalFrame.setIdActual(this.perfilaccion.getid_accion());
					this.accionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.accionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.accionBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccion();
				}

				JInternalFrameBase jinternalFrame =this.accionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilAccion=(TitledBorder)this.jScrollPanelDatosPerfilAccion.getBorder();
				TitledBorder titledBorderaccion=(TitledBorder)this.accionBeanSwingJInternalFrame.jScrollPanelDatosAccion.getBorder();

				titledBorderaccion.setTitle(titledBorderPerfilAccion.getTitle() + " -> Accion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_accionPerfilAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilAccion(this.getperfilaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilaccion==null) {
						this.perfilaccion = new PerfilAccion();
					}

					this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
				}

				if(this.perfilaccion.getid_accion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_accion = "+this.perfilaccion.getid_accion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonejecusionPerfilAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilAccion(this.getperfilaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilaccion==null) {
						this.perfilaccion = new PerfilAccion();
					}

					this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
				}

				if(this.perfilaccion.getejecusion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ejecusion = "+this.perfilaccion.getejecusion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoPerfilAccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilAccion(this.getperfilaccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilaccion==null) {
						this.perfilaccion = new PerfilAccion();
					}

					this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);
				}

				if(this.perfilaccion.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.perfilaccion.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilAccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAccionPerfilAccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilAccion(false,false);

			this.getPerfilAccionsFK_IdAccion();

			this.inicializarActualizarBindingPerfilAccion(false);

			//if(PerfilAccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilAccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPerfilPerfilAccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilAccion(false,false);

			this.getPerfilAccionsFK_IdPerfil();

			this.inicializarActualizarBindingPerfilAccion(false);

			//if(PerfilAccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilAccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilaccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePerfilAccion() {
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
			this.jInternalFrameDetalleFormPerfilAccion.setVisible(false);	    			
			this.jInternalFrameDetalleFormPerfilAccion.dispose();
			this.jInternalFrameDetalleFormPerfilAccion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
			this.jInternalFrameReporteDinamicoPerfilAccion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPerfilAccion.dispose();
			this.jInternalFrameReporteDinamicoPerfilAccion=null;
		}
		
		if(this.jInternalFrameImportacionPerfilAccion!=null) {
			this.jInternalFrameImportacionPerfilAccion.setVisible(false);	    			
			this.jInternalFrameImportacionPerfilAccion.dispose();
			this.jInternalFrameImportacionPerfilAccion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPerfilAccion();
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
			
			if(sTipo.equals("NuevoPerfilAccion")) {
				jButtonNuevoPerfilAccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPerfilAccion")) {
				jButtonDuplicarPerfilAccionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPerfilAccion")) {
				jButtonCopiarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormPerfilAccion")) {
				jButtonVerFormPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPerfilAccion")) {
				jButtonNuevoPerfilAccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPerfilAccion")) {
				jButtonDuplicarPerfilAccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPerfilAccion")) {
				jButtonNuevoPerfilAccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPerfilAccion")) {
				jButtonDuplicarPerfilAccionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPerfilAccion")) {
				jButtonNuevoPerfilAccionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPerfilAccion")) {
				jButtonNuevoPerfilAccionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPerfilAccion")) {
				jButtonNuevoPerfilAccionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPerfilAccion")) {
				jButtonModificarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPerfilAccion")) {
				jButtonModificarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPerfilAccion")) {
				jButtonModificarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPerfilAccion")) {
				jButtonActualizarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPerfilAccion")) {
				jButtonActualizarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPerfilAccion")) {
				jButtonActualizarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarPerfilAccion")) {
				jButtonEliminarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPerfilAccion")) {
				jButtonEliminarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPerfilAccion")) {
				jButtonEliminarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarPerfilAccion")) {
				jButtonCancelarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPerfilAccion")) {
				jButtonCancelarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPerfilAccion")) {
				jButtonCancelarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarPerfilAccion")) {
				jButtonCerrarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPerfilAccion")) {
				jButtonCerrarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPerfilAccion")) {
				jButtonCerrarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPerfilAccion")) {
				jButtonMostrarOcultarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPerfilAccion")) {
				jButtonCancelarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPerfilAccion")) {
				jButtonGuardarCambiosPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPerfilAccion")) {
				jButtonGuardarCambiosPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPerfilAccion")) {
				jButtonCopiarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPerfilAccion")) {
				jButtonVerFormPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPerfilAccion")) {
				jButtonGuardarCambiosPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPerfilAccion")) {
				jButtonCopiarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPerfilAccion")) {
				jButtonVerFormPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPerfilAccion")) {
				jButtonGuardarCambiosPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPerfilAccion")) {
				jButtonGuardarCambiosPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPerfilAccion")) {
				jButtonGuardarCambiosPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPerfilAccion")) {
				jButtonRecargarInformacionPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPerfilAccion")) {
				jButtonRecargarInformacionPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPerfilAccion")) {
				jButtonRecargarInformacionPerfilAccionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPerfilAccion")) {
				jButtonAnterioresPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPerfilAccion")) {
				jButtonAnterioresPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePerfilAccion")) {
				jButtonAnterioresPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPerfilAccion")) {
				jButtonSiguientesPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPerfilAccion")) {
				jButtonSiguientesPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPerfilAccion")) {
				jButtonSiguientesPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPerfilAccion") || sTipo.equals("MenuItemDetalleAbrirOrderByPerfilAccion")) {
				jButtonAbrirOrderByPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPerfilAccion") || sTipo.equals("MenuItemDetalleMostrarOcultarPerfilAccion")) {
				jButtonMostrarOcultarPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPerfilAccion")) {
				jButtonNuevoGuardarCambiosPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPerfilAccion")) {
				jButtonNuevoGuardarCambiosPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPerfilAccion")) {
				jButtonNuevoGuardarCambiosPerfilAccionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPerfilAccion")) {
				jButtonCerrarReporteDinamicoPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPerfilAccion")) {
				jButtonGenerarReporteDinamicoPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPerfilAccion")) {
				
				jButtonGenerarExcelReporteDinamicoPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPerfilAccion")) {
				jButtonCerrarImportacionPerfilAccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPerfilAccion")) {
				
				jButtonGenerarImportacionPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPerfilAccion")) {
				
				jButtonAbrirImportacionPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPerfilAccion")) {
				jComboBoxTiposAccionesPerfilAccionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPerfilAccion")) {
				jComboBoxTiposRelacionesPerfilAccionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPerfilAccion")) {
				jComboBoxTiposAccionesPerfilAccionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPerfilAccion")) {
				
				jComboBoxTiposSeleccionarPerfilAccionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPerfilAccion")) {
				jTextFieldValorCampoGeneralPerfilAccionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPerfilAccion")) {
				jButtonAbrirOrderByPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPerfilAccion")) {
				jButtonAbrirOrderByPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPerfilAccion")) {
				jButtonCerrarOrderByPerfilAccionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilAccionBusqueda")) {
				this.jButtonidPerfilAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_perfilPerfilAccion")) {
				this.jButtonid_perfilPerfilAccionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilPerfilAccionUpdate")) {
				this.jButtonid_perfilPerfilAccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilPerfilAccionBusqueda")) {
				this.jButtonid_perfilPerfilAccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_accionPerfilAccionUpdate")) {
				this.jButtonid_accionPerfilAccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_accionPerfilAccionBusqueda")) {
				this.jButtonid_accionPerfilAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ejecusionPerfilAccionBusqueda")) {
				this.jButtonejecusionPerfilAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilAccionBusqueda")) {
				this.jButtonestadoPerfilAccionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_perfilPerfilAccion")) {
				this.jButtonid_perfilPerfilAccionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAccionPerfilAccion")) {
				this.jButtonFK_IdAccionPerfilAccionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPerfilPerfilAccion")) {
				this.jButtonFK_IdPerfilPerfilAccionActionPerformed(evt);
			}
			
			;
			
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPerfilAccion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilAccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				


				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PerfilAccion perfilaccionLocal=null;
			
			if(!this.getEsControlTabla()) {
				perfilaccionLocal=this.perfilaccion;
			} else {
				perfilaccionLocal=this.perfilaccionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
							
				
				


				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
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
			
			


			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilAccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
								
						
				


				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
								
				
				


				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilAccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
							
				
				


				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilAccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilaccionAnterior =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilaccionAnterior =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
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
			
			


			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilAccionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
								
				
				


				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilAccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilAccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPerfilAccion")) {
					jCheckBoxSeleccionarTodosPerfilAccionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPerfilAccion")) {
					jCheckBoxSeleccionadosPerfilAccionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPerfilAccion")) {
					
				}
				
				


				
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
												
				
				


				
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilAccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilaccionAnterior =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilaccionAnterior =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilAccionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
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
			
			


			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilAccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilaccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilaccion);
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
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
				
				


				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilAccion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilAccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilAccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilaccionAnterior =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPerfilAccion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPerfilAccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPerfilAccion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.perfilaccion =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.perfilaccion =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.perfilaccion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPerfilAccion")) {
				
				}
				
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPerfilAccion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPerfilAccion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPerfilAccion")) {
			
			}
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPerfilAccion();
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
			if(sTipo.equals("NuevoPerfilAccion")) {
				jButtonNuevoPerfilAccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPerfilAccion")) {
				jButtonDuplicarPerfilAccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPerfilAccion")) {
				jButtonCopiarPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPerfilAccion")) {
				jButtonVerFormPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPerfilAccion")) {
				jButtonNuevoPerfilAccionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPerfilAccion")) {
				jButtonModificarPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPerfilAccion")) {
				jButtonActualizarPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPerfilAccion")) {
				jButtonEliminarPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPerfilAccion")) {
				jButtonGuardarCambiosPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPerfilAccion")) {
				jButtonCancelarPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPerfilAccion")) {
				jButtonCerrarPerfilAccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPerfilAccion")) {
				jButtonGuardarCambiosPerfilAccionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPerfilAccion")) {
				jButtonNuevoGuardarCambiosPerfilAccionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPerfilAccion")) {
				jButtonAbrirOrderByPerfilAccionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPerfilAccion")) {
				jButtonRecargarInformacionPerfilAccionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPerfilAccion")) {
				jButtonAnterioresPerfilAccionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPerfilAccion")) {
				jButtonSiguientesPerfilAccionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilAccionBusqueda")) {
				this.jButtonidPerfilAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_perfilPerfilAccion")) {
				this.jButtonid_perfilPerfilAccionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilPerfilAccionUpdate")) {
				this.jButtonid_perfilPerfilAccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilPerfilAccionBusqueda")) {
				this.jButtonid_perfilPerfilAccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_accionPerfilAccionUpdate")) {
				this.jButtonid_accionPerfilAccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_accionPerfilAccionBusqueda")) {
				this.jButtonid_accionPerfilAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ejecusionPerfilAccionBusqueda")) {
				this.jButtonejecusionPerfilAccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilAccionBusqueda")) {
				this.jButtonestadoPerfilAccionBusquedaActionPerformed(evt);
			}
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPerfilAccion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePerfilAccion")) {
				closingInternalFramePerfilAccion();
				
			} else if(sTipo.equals("jButtonCancelarPerfilAccion")) {
				JInternalFrameBase jInternalFrameDetalleFormPerfilAccion = (JInternalFrameBase)evt.getSource();
	            	
	            PerfilAccionBeanSwingJInternalFrame jInternalFrameParent=(PerfilAccionBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfilAccion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPerfilAccionActionPerformed(null);
			}
			
			PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilaccion,new Object(),this.perfilaccionParameterGeneral,this.perfilaccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPerfilAccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPerfilAccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPerfilAccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.perfilaccion)) {
			if(!esControlTabla) {
				if(PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);			
				}
				
				if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPerfilAccion(this.perfilaccion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilaccionReturnGeneral=perfilaccionLogic.procesarEventosPerfilAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilaccionLogic.getPerfilAccions(),this.perfilaccion,this.perfilaccionParameterGeneral,this.isEsNuevoPerfilAccion,classes);//this.perfilaccionLogic.getPerfilAccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPerfilAccion(this.perfilaccionReturnGeneral,this.perfilaccionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPerfilAccion(classes,this.perfilaccionReturnGeneral,this.perfilaccionBean,false);
					}
						
					if(this.perfilaccionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPerfilAccion(this.perfilaccionReturnGeneral.getPerfilAccion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPerfilAccion(this.perfilaccionReturnGeneral.getPerfilAccion());	
					}
						
					if(this.perfilaccionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPerfilAccion(this.perfilaccionReturnGeneral.getPerfilAccion(),classes);//this.perfilaccionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPerfilAccion(this.perfilaccion,classes);//this.perfilaccionBean);									
				}
			
				if(PerfilAccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPerfilAccion(this.perfilaccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilAccion(this.perfilaccion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.perfilaccionAnterior!=null) {
						this.perfilaccion=this.perfilaccionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilaccionReturnGeneral=perfilaccionLogic.procesarEventosPerfilAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilaccionLogic.getPerfilAccions(),this.perfilaccion,this.perfilaccionParameterGeneral,this.isEsNuevoPerfilAccion,classes);//this.perfilaccionLogic.getPerfilAccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilaccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilaccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.perfilaccionReturnGeneral.getPerfilAccion(),perfilaccionLogic.getPerfilAccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.perfilaccionReturnGeneral.getPerfilAccion(),this.perfilaccions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPerfilAccion.repaint();
				
				//((AbstractTableModel) this.jTableDatosPerfilAccion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPerfilAccion();
			}
		}
	}
	
	public void actualizarVisualTableDatosPerfilAccion() throws Exception {
		
		PerfilAccionModel perfilaccionModel=(PerfilAccionModel)this.jTableDatosPerfilAccion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilaccionModel.perfilaccions=this.perfilaccionLogic.getPerfilAccions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			perfilaccionModel.perfilaccions=this.perfilaccions;
		}
		
		
		((PerfilAccionModel) this.jTableDatosPerfilAccion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPerfilAccion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperfilaccionAnterior(),this.perfilaccionLogic.getPerfilAccions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperfilaccionAnterior(),this.perfilaccions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPerfilAccion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPerfilAccion(PerfilAccion perfilaccion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
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
										
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilaccion,new Object(),generalEntityParameterGeneral,this.perfilaccionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.perfilaccionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PerfilAccionConstantesFunciones.getClassesRelationshipsOfPerfilAccion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PerfilAccionConstantesFunciones.getClassesRelationshipsFromStringsOfPerfilAccion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPerfilAccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PerfilAccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilaccion,new Object(),generalEntityParameterGeneral,this.perfilaccionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPerfilAccion(PerfilAccionBean perfilaccionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPerfilAccion(ArrayList<Classe> classes,PerfilAccionReturnGeneral perfilaccionReturnGeneral,PerfilAccionBean perfilaccionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPerfilAccion(PerfilAccion perfilaccion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.perfilaccion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPerfilAccion = new PerfilAccionDetalleFormJInternalFrame(jDesktopPane,this.perfilaccionSessionBean.getConGuardarRelaciones(),this.perfilaccionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.setVisible(false);
		this.jInternalFrameDetalleFormPerfilAccion.setSelected(false);						
		
		this.jInternalFrameDetalleFormPerfilAccion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPerfilAccion.perfilaccionLogic=this.perfilaccionLogic;
		
		this.cargarCombosFrameForeignKeyPerfilAccion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePerfilAccion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfilAccion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPerfilAccion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPerfilAccion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPerfilAccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfilAccion"));
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarPerfilAccion.addActionListener(new ButtonActionListener(this,"ModificarPerfilAccion"));

		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarToolBarPerfilAccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfilAccion"));
					
		this.jInternalFrameDetalleFormPerfilAccion.jMenuItemModificarPerfilAccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfilAccion"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarPerfilAccion.addActionListener (new ButtonActionListener(this,"ActualizarPerfilAccion"));
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarToolBarPerfilAccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfilAccion"));
						
		this.jInternalFrameDetalleFormPerfilAccion.jMenuItemActualizarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfilAccion"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarPerfilAccion.addActionListener (new ButtonActionListener(this,"EliminarPerfilAccion"));
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfilAccion"));
								
		this.jInternalFrameDetalleFormPerfilAccion.jMenuItemEliminarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfilAccion"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarPerfilAccion.addActionListener (new ButtonActionListener(this,"CancelarPerfilAccion"));
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfilAccion"));
					
		this.jInternalFrameDetalleFormPerfilAccion.jMenuItemCancelarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfilAccion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jMenuItemDetalleCerrarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfilAccion"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilAccion"));
		
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilAccion"));
		
		
		
		this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfilAccion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonidPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilAccionBusqueda"));
		//jButtonid_perfilPerfilAccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_perfilPerfilAccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccion.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_accionPerfilAccionUpdate.addActionListener(new ButtonActionListener(this,"id_accionPerfilAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_accionPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_accionPerfilAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonejecusionPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"ejecusionPerfilAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonestadoPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilAccionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfilAccion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePerfilAccion"));
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfilAccion"));
		}
		
		this.jTableDatosPerfilAccion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPerfilAccion"));
		
		this.jTableDatosPerfilAccion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPerfilAccion"));
		
		this.jButtonNuevoPerfilAccion.addActionListener(new ButtonActionListener(this,"NuevoPerfilAccion"));
		
		this.jButtonDuplicarPerfilAccion.addActionListener(new ButtonActionListener(this,"DuplicarPerfilAccion"));
		
		this.jButtonCopiarPerfilAccion.addActionListener(new ButtonActionListener(this,"CopiarPerfilAccion"));
		
		this.jButtonVerFormPerfilAccion.addActionListener(new ButtonActionListener(this,"VerFormPerfilAccion"));
		
		
		this.jButtonNuevoToolBarPerfilAccion.addActionListener(new ButtonActionListener(this,"NuevoToolBarPerfilAccion"));
			
		this.jButtonDuplicarToolBarPerfilAccion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPerfilAccion"));
			
		this.jMenuItemNuevoPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPerfilAccion"));
			
		this.jMenuItemDuplicarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPerfilAccion"));		
		
		
		this.jButtonNuevoRelacionesPerfilAccion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPerfilAccion"));
		
		
		this.jButtonNuevoRelacionesToolBarPerfilAccion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPerfilAccion"));
			
		this.jMenuItemNuevoRelacionesPerfilAccion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPerfilAccion"));		
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarPerfilAccion.addActionListener(new ButtonActionListener(this,"ModificarPerfilAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonModificarToolBarPerfilAccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfilAccion"));
			
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemModificarPerfilAccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfilAccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarPerfilAccion.addActionListener (new ButtonActionListener(this,"ActualizarPerfilAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonActualizarToolBarPerfilAccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfilAccion"));
				
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemActualizarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfilAccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarPerfilAccion.addActionListener (new ButtonActionListener(this,"EliminarPerfilAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonEliminarToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfilAccion"));
						
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemEliminarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfilAccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarPerfilAccion.addActionListener (new ButtonActionListener(this,"CancelarPerfilAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonCancelarToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfilAccion"));
			
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemCancelarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfilAccion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPerfilAccion"));		
		
		
		this.jButtonCerrarPerfilAccion.addActionListener (new ButtonActionListener(this,"CerrarPerfilAccion"));
		
		
		this.jButtonCerrarToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"CerrarToolBarPerfilAccion"));
			
		this.jMenuItemCerrarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPerfilAccion"));
			
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jMenuItemDetalleCerrarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfilAccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosPerfilAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosPerfilAccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilAccion"));
		}
		
		this.jButtonCopiarToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"CopiarToolBarPerfilAccion"));
			
		this.jButtonVerFormToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"VerFormToolBarPerfilAccion"));
		
		this.jMenuItemGuardarCambiosPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPerfilAccion"));
			
		this.jMenuItemCopiarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPerfilAccion"));		
		
		this.jMenuItemVerFormPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPerfilAccion"));		
		
		
		this.jButtonGuardarCambiosTablaPerfilAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfilAccion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPerfilAccion"));
			
		this.jMenuItemGuardarCambiosTablaPerfilAccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfilAccion"));		
		
		
		
		this.jButtonRecargarInformacionPerfilAccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionPerfilAccion"));
					
		this.jButtonRecargarInformacionToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPerfilAccion"));
		
		this.jMenuItemRecargarInformacionPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPerfilAccion"));		
		
		
		
		this.jButtonAnterioresPerfilAccion.addActionListener (new ButtonActionListener(this,"AnterioresPerfilAccion"));
		
		
		this.jButtonAnterioresToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPerfilAccion"));
		
		this.jMenuItemAnterioresPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPerfilAccion"));		
		
		
		this.jButtonSiguientesPerfilAccion.addActionListener (new ButtonActionListener(this,"SiguientesPerfilAccion"));
		
		
		this.jButtonSiguientesToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPerfilAccion"));
			
		this.jMenuItemSiguientesPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPerfilAccion"));
			
		this.jMenuItemAbrirOrderByPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPerfilAccion"));
			
		this.jMenuItemMostrarOcultarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPerfilAccion"));
			
		this.jMenuItemDetalleAbrirOrderByPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPerfilAccion"));
			
		this.jMenuItemDetalleMostarOcultarPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPerfilAccion"));		
		
		
		this.jButtonNuevoGuardarCambiosPerfilAccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPerfilAccion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPerfilAccion"));
			
		this.jMenuItemNuevoGuardarCambiosPerfilAccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPerfilAccion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPerfilAccion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPerfilAccion"));

		this.jCheckBoxSeleccionadosPerfilAccion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPerfilAccion"));
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfilAccion"));
		}
		
		
		this.jComboBoxTiposRelacionesPerfilAccion.addActionListener (new ButtonActionListener(this,"TiposRelacionesPerfilAccion"));
			
		this.jComboBoxTiposAccionesPerfilAccion.addActionListener (new ButtonActionListener(this,"TiposAccionesPerfilAccion"));
					
		this.jComboBoxTiposSeleccionarPerfilAccion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPerfilAccion"));
			
		this.jTextFieldValorCampoGeneralPerfilAccion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPerfilAccion"));		
		
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonidPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilAccionBusqueda"));
		//jButtonid_perfilPerfilAccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_perfilPerfilAccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccion.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_accionPerfilAccionUpdate.addActionListener(new ButtonActionListener(this,"id_accionPerfilAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_accionPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_accionPerfilAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonejecusionPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"ejecusionPerfilAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonestadoPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilAccionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAccionPerfilAccion.addActionListener(new ButtonActionListener(this,"FK_IdAccionPerfilAccion"));

			this.jButtonFK_IdPerfilPerfilAccion.addActionListener(new ButtonActionListener(this,"FK_IdPerfilPerfilAccion"));

			this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPerfilAccion!=null) {
				this.jInternalFrameReporteDinamicoPerfilAccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilAccion"));
				this.jInternalFrameReporteDinamicoPerfilAccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilAccion"));
				this.jInternalFrameReporteDinamicoPerfilAccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilAccion"));
			}
			
			//this.jButtonCerrarReporteDinamicoPerfilAccion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilAccion"));				
			//this.jButtonGenerarReporteDinamicoPerfilAccion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilAccion"));
			//this.jButtonGenerarExcelReporteDinamicoPerfilAccion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilAccion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPerfilAccion!=null) {
				this.jInternalFrameImportacionPerfilAccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfilAccion"));
				this.jInternalFrameImportacionPerfilAccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfilAccion"));
				this.jInternalFrameImportacionPerfilAccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfilAccion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPerfilAccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByPerfilAccion"));
			
			this.jButtonAbrirOrderByToolBarPerfilAccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPerfilAccion"));			
			
			if(this.jInternalFrameOrderByPerfilAccion!=null) {
				this.jInternalFrameOrderByPerfilAccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfilAccion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilAccion.jTabbedPaneRelacionesPerfilAccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfilAccion"));
		
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
            		closingInternalFramePerfilAccion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPerfilAccion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPerfilAccion = (JInternalFrameBase)event.getSource();
	            	
	            PerfilAccionBeanSwingJInternalFrame jInternalFrameParent=(PerfilAccionBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfilAccion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPerfilAccionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPerfilAccion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPerfilAccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPerfilAccion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPerfilAccion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilAccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilAccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilAccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPerfilAccion";
		inputMap = this.jButtonNuevoPerfilAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPerfilAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilAccionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilAccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilAccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilAccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPerfilAccion";
		inputMap = this.jButtonNuevoRelacionesPerfilAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPerfilAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilAccionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPerfilAccion";
		inputMap = this.jButtonModificarPerfilAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPerfilAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPerfilAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPerfilAccion";
		inputMap = this.jButtonActualizarPerfilAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPerfilAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPerfilAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPerfilAccion";
		inputMap = this.jButtonEliminarPerfilAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPerfilAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPerfilAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPerfilAccion";
		inputMap = this.jButtonCancelarPerfilAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPerfilAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPerfilAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPerfilAccion";
		inputMap = this.jButtonCerrarPerfilAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPerfilAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPerfilAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPerfilAccion";
		inputMap = this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosPerfilAccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPerfilAccion.jButtonGuardarCambiosPerfilAccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPerfilAccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPerfilAccion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPerfilAccionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPerfilAccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPerfilAccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPerfilAccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPerfilAccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPerfilAccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPerfilAccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonidPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilAccionBusqueda"));
		//jButtonid_perfilPerfilAccion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_perfilPerfilAccionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccion.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccionUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_accionPerfilAccionUpdate.addActionListener(new ButtonActionListener(this,"id_accionPerfilAccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonid_accionPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"id_accionPerfilAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonejecusionPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"ejecusionPerfilAccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilAccion.jButtonestadoPerfilAccionBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilAccionBusqueda"));
		
		
		this.jButtonFK_IdAccionPerfilAccion.addActionListener(new ButtonActionListener(this,"FK_IdAccionPerfilAccion"));

		this.jButtonFK_IdPerfilPerfilAccion.addActionListener(new ButtonActionListener(this,"FK_IdPerfilPerfilAccion"));

		this.jButtonBuscarFK_IdPerfilid_perfilPerfilAccion.addActionListener(new ButtonActionListener(this,"id_perfilPerfilAccion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPerfilAccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPerfilAccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPerfilAccionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPerfilAccion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPerfilAccion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
					perfilaccionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilAccion perfilaccionAux:perfilaccions) {
					perfilaccionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPerfilAccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfilAccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
						perfilaccionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilAccion perfilaccionAux:perfilaccions) {
						perfilaccionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
					
						if(sTipoSeleccionar.equals(PerfilAccionConstantesFunciones.LABEL_EJECUSION)) {
							existe=true;
							perfilaccionAux.setejecusion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilAccionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilaccionAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilAccion perfilaccionAux:perfilaccions) {
						
						if(sTipoSeleccionar.equals(PerfilAccionConstantesFunciones.LABEL_EJECUSION)) {
							existe=true;
							perfilaccionAux.setejecusion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilAccionConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilaccionAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPerfilAccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfilAccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfilAccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPerfilAccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfilAccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPerfilAccion.getSelectedRows();
			
			PerfilAccion perfilaccionLocal=new PerfilAccion();
			
			//this.seleccionarTodosPerfilAccion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilaccionLocal =(PerfilAccion) this.perfilaccionLogic.getPerfilAccions().toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					perfilaccionLocal =(PerfilAccion) this.perfilaccions.toArray()[this.jTableDatosPerfilAccion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				perfilaccionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
						perfilaccionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilAccion perfilaccionAux:perfilaccions) {
						perfilaccionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPerfilAccion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfilAccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfilAccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfilAccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPerfilAccionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPerfilAccionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPerfilAccionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPerfilAccion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPerfilAccion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PerfilAccion perfilaccionAux:this.perfilaccionLogic.getPerfilAccions()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilAccion perfilaccionAux:perfilaccions) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPerfilAccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPerfilAccionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPerfilAccion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPerfilAccion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPerfilAccion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePerfilAccion) {				
					conSplash=true;//false;										
					
					//this.startProcessPerfilAccion(conSplash);
				
					this.generarReportePerfilAccionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPerfilAccionsSeleccionados();
				//this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilAccionsSeleccionados(false);
				//this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilAccionsSeleccionados(true);
				//this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfilAccion();
				
				this.exportarPerfilAccionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPerfilAccions();
				//this.importarPerfilAccions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfilAccion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPerfilAccionsSeleccionados();
				//this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Perfil Accion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPerfilAccion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPerfilAccion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPerfilAccion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.setSelectedIndex(0);					
				}	
			} 			
			else if(PerfilAccionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePerfilAccion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPerfilAccion(conSplash);
					
						//this.actualizarParametrosGeneralPerfilAccion();
						
						this.generarReporteProcesoAccionPerfilAccionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PerfilAccionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Perfil AccionES SELECCIONADOS?", "MANTENIMIENTO DE Perfil Accion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPerfilAccion();
				
						this.actualizarParametrosGeneralPerfilAccion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.perfilaccionReturnGeneral=perfilaccionLogic.procesarAccionPerfilAccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.perfilaccionLogic.getPerfilAccions(),this.perfilaccionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPerfilAccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPerfilAccion();
					
					PerfilAccionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPerfilAccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfilAccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfilAccion.jComboBoxTiposAccionesFormularioPerfilAccion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPerfilAccion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPerfilAccionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPerfilAccion();
			
			if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		
			PerfilAccion perfilaccion=new PerfilAccion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPerfilAccion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPerfilAccion.getSelectedItem();
			
			
			
			
			perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(perfilaccionsSeleccionados.size()==1) {
				for(PerfilAccion perfilaccionAux:perfilaccionsSeleccionados) {
					perfilaccion=perfilaccionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPerfilAccion();
			
      		//this.finishProcessPerfilAccion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPerfilAccionReturnGeneral() throws Exception {
		if(this.perfilaccionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.perfilaccionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.perfilaccionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.perfilaccionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.perfilaccionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.perfilaccionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPerfilAccion(false);
		}
		
		if(this.perfilaccionReturnGeneral.getConRetornoLista() || this.perfilaccionReturnGeneral.getConRetornoObjeto()) {
			if(this.perfilaccionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilaccionLogic.setPerfilAccions(this.perfilaccionReturnGeneral.getPerfilAccions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.perfilaccionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilaccionLogic.setPerfilAccion(this.perfilaccionReturnGeneral.getPerfilAccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPerfilAccion(false);
		}
	}
	
	public void actualizarParametrosGeneralPerfilAccion() throws Exception {
		
		
	}
	
	public ArrayList<PerfilAccion> getPerfilAccionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPerfilAccion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PerfilAccion perfilaccionAux:perfilaccionLogic.getPerfilAccions()) {
					if(perfilaccionAux.getIsSelected()) {
						perfilaccionsSeleccionados.add(perfilaccionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilAccion perfilaccionAux:this.perfilaccions) {
					if(perfilaccionAux.getIsSelected()) {
						perfilaccionsSeleccionados.add(perfilaccionAux);				
					}
				}
			}
			
			if(perfilaccionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						perfilaccionsSeleccionados.addAll(this.perfilaccionLogic.getPerfilAccions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						perfilaccionsSeleccionados.addAll(this.perfilaccions);				
					}
				}
			}
		} else {
			perfilaccionsSeleccionados.add(this.perfilaccion);
		}
		
		return perfilaccionsSeleccionados;
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
	
	public void generarReportePerfilAccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPerfilAccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPerfilAccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilAccionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilAccionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Perfil Accion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPerfilAccionsSeleccionados() throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePerfilAccions("Todos",perfilaccionsSeleccionados);
		
	}	
	
	public void generarReporteNormalPerfilAccionsSeleccionados() throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePerfilAccions("Todos",perfilaccionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPerfilAccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePerfilAccions("Todos",perfilaccionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPerfilAccionsSeleccionados() throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPerfilAccion();
		
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPerfilAccion();
		
		
		//this.generarReportePerfilAccions("Todos",perfilaccionsSeleccionados ,perfilaccionImplementable,perfilaccionImplementableHome);
	}
	
	public void mostrarImportacionPerfilAccions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPerfilAccion();
		
		this.abrirFrameImportacionPerfilAccion();		
		
			
		//this.generarReportePerfilAccions("Todos",perfilaccionsSeleccionados ,perfilaccionImplementable,perfilaccionImplementableHome);
	}
	
	public void importarPerfilAccions() throws Exception {		
	
	}
	
	public void exportarPerfilAccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPerfilAccionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPerfilAccionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPerfilAccionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Perfil Accion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPerfilAccionsSeleccionados() throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilaccion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPerfilAccion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PerfilAccion perfilaccionAux:perfilaccionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPerfilAccion(perfilaccionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//perfilaccionAux.setsDetalleGeneralEntityReporte(perfilaccionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPerfilAccion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PerfilAccionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilAccionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilAccionConstantesFunciones.LABEL_IDPERFIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilAccionConstantesFunciones.LABEL_IDACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilAccionConstantesFunciones.LABEL_EJECUSION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilAccionConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPerfilAccion(PerfilAccion perfilaccion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=perfilaccion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilaccion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilaccion.getperfil_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilaccion.getaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilaccion.getejecusion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilaccion.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPerfilAccionsSeleccionados() throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilaccion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PerfilAccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPerfilAccion(row);				
				iRow++;
			}				
			
			for(PerfilAccion perfilaccionAux:perfilaccionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPerfilAccion(perfilaccionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPerfilAccionsSeleccionados() throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();		
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilaccion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("perfilaccions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("perfilaccion");
			//elementRoot.appendChild(element);
		
			for(PerfilAccion perfilaccionAux:perfilaccionsSeleccionados) {
				element = document.createElement("perfilaccion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPerfilAccion(perfilaccionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Accion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPerfilAccion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_IDPERFIL);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_IDACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_EJECUSION);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilAccionConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPerfilAccion(PerfilAccion perfilaccion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(perfilaccion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilaccion.getperfil_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilaccion.getaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilaccion.getejecusion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilaccion.getestado());				
	}
	
	public void setFilaDatosExportarXmlPerfilAccion(PerfilAccion perfilaccion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PerfilAccionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(perfilaccion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PerfilAccionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(perfilaccion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementperfil_descripcion = document.createElement(PerfilAccionConstantesFunciones.IDPERFIL);
		elementperfil_descripcion.appendChild(document.createTextNode(perfilaccion.getperfil_descripcion()));
		element.appendChild(elementperfil_descripcion);

		Element elementaccion_descripcion = document.createElement(PerfilAccionConstantesFunciones.IDACCION);
		elementaccion_descripcion.appendChild(document.createTextNode(perfilaccion.getaccion_descripcion()));
		element.appendChild(elementaccion_descripcion);

		Element elementejecusion = document.createElement(PerfilAccionConstantesFunciones.EJECUSION);
		elementejecusion.appendChild(document.createTextNode(perfilaccion.getejecusion().toString().trim()));
		element.appendChild(elementejecusion);

		Element elementestado = document.createElement(PerfilAccionConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(perfilaccion.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoPerfilAccionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PerfilAccion> perfilaccionsSeleccionados=new ArrayList<PerfilAccion>();
		
		perfilaccionsSeleccionados=this.getPerfilAccionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPerfilAccion(perfilaccionsSeleccionados);
		
		this.generarReportePerfilAccions("Todos",perfilaccionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPerfilAccion(ArrayList<PerfilAccion> perfilaccionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PerfilAccion perfilaccionAux:perfilaccionsSeleccionados) {
				perfilaccionAux.setsDetalleGeneralEntityReporte(perfilaccionAux.toString());
			
				if(sTipoSeleccionar.equals(PerfilAccionConstantesFunciones.LABEL_IDPERFIL)) {
					existe=true;
					perfilaccionAux.setsDescripcionGeneralEntityReporte1(perfilaccionAux.getperfil_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilAccionConstantesFunciones.LABEL_IDACCION)) {
					existe=true;
					perfilaccionAux.setsDescripcionGeneralEntityReporte1(perfilaccionAux.getaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilAccionConstantesFunciones.LABEL_EJECUSION)) {
					existe=true;
					perfilaccionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilaccionAux.getejecusion()));
				}
				 else if(sTipoSeleccionar.equals(PerfilAccionConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					perfilaccionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilaccionAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilAccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPerfilAccion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPerfilAccion=true;
				this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=true;
				this.isVisibilidadCeldaGuardarCambiosPerfilAccion=true;
			}
			
			this.isVisibilidadCeldaModificarPerfilAccion=false;
			this.isVisibilidadCeldaActualizarPerfilAccion=false;
			this.isVisibilidadCeldaEliminarPerfilAccion=false;
			this.isVisibilidadCeldaCancelarPerfilAccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilAccion=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPerfilAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=false;
			this.isVisibilidadCeldaModificarPerfilAccion=false;
			this.isVisibilidadCeldaActualizarPerfilAccion=true;
			this.isVisibilidadCeldaEliminarPerfilAccion=false;
			this.isVisibilidadCeldaCancelarPerfilAccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilAccion=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPerfilAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=false;
			this.isVisibilidadCeldaModificarPerfilAccion=false;
			this.isVisibilidadCeldaActualizarPerfilAccion=true;
			this.isVisibilidadCeldaEliminarPerfilAccion=true;
			this.isVisibilidadCeldaCancelarPerfilAccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilAccion=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPerfilAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=false;
			this.isVisibilidadCeldaModificarPerfilAccion=false;
			this.isVisibilidadCeldaActualizarPerfilAccion=true;
			this.isVisibilidadCeldaEliminarPerfilAccion=false;
			this.isVisibilidadCeldaCancelarPerfilAccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPerfilAccion=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=true;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=true;
			this.isVisibilidadCeldaModificarPerfilAccion=false;
			this.isVisibilidadCeldaActualizarPerfilAccion=false;
			this.isVisibilidadCeldaEliminarPerfilAccion=false;
			this.isVisibilidadCeldaCancelarPerfilAccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilAccion=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPerfilAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=false;
			this.isVisibilidadCeldaActualizarPerfilAccion=false;
			this.isVisibilidadCeldaEliminarPerfilAccion=false;
			this.isVisibilidadCeldaCancelarPerfilAccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPerfilAccion=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=false;
			this.isVisibilidadCeldaModificarPerfilAccion=true;
			this.isVisibilidadCeldaActualizarPerfilAccion=false;
			this.isVisibilidadCeldaEliminarPerfilAccion=false;
			this.isVisibilidadCeldaCancelarPerfilAccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilAccion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PerfilAccionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPerfilAccion=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=true;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=true;
		} else {
			this.actualizarEstadoPanelsPerfilAccion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPerfilAccion=false;
			//this.isVisibilidadCeldaVerFormPerfilAccion=false;
			this.isVisibilidadCeldaDuplicarPerfilAccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!perfilaccionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
		} else {
			this.isVisibilidadCeldaNuevoPerfilAccion=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilAccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(perfilaccionSessionBean.getEsGuardarRelacionado()) {
			if(!perfilaccionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;												
			}
			
			this.jButtonCerrarPerfilAccion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPerfilAccion=false;
		}
		
		if(!this.permiteMantenimiento(this.perfilaccion)) {
			this.isVisibilidadCeldaActualizarPerfilAccion=false;
			this.isVisibilidadCeldaEliminarPerfilAccion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPerfilAccion() {
	}
	
	public void actualizarEstadoPanelsPerfilAccion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPerfilAccion!=null) {
				this.jScrollPanelDatosEdicionPerfilAccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilAccion!=null) {
				this.jScrollPanelDatosPerfilAccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilAccion!=null) {
				this.jPanelPaginacionPerfilAccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPerfilAccion!=null) {
				this.jScrollPanelDatosEdicionPerfilAccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPerfilAccion!=null) {
				this.jScrollPanelDatosPerfilAccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilAccion!=null) {
				this.jPanelPaginacionPerfilAccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPerfilAccion!=null) {
				this.jScrollPanelDatosEdicionPerfilAccion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfilAccion!=null) {
				this.jScrollPanelDatosPerfilAccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilAccion!=null) {
				this.jPanelPaginacionPerfilAccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPerfilAccion!=null) {
				this.jScrollPanelDatosEdicionPerfilAccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfilAccion!=null) {
				this.jScrollPanelDatosPerfilAccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilAccion!=null) {
				this.jPanelPaginacionPerfilAccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPerfilAccion!=null) {
				this.jScrollPanelDatosEdicionPerfilAccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilAccion!=null) {
				this.jScrollPanelDatosPerfilAccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilAccion!=null) {
				this.jPanelPaginacionPerfilAccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPerfilAccion!=null) {
				this.jScrollPanelDatosEdicionPerfilAccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilAccion!=null) {
				this.jScrollPanelDatosPerfilAccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilAccion!=null) {
				this.jPanelPaginacionPerfilAccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPerfilAccion!=null) {
				this.jScrollPanelDatosEdicionPerfilAccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilAccion!=null) {
				this.jScrollPanelDatosPerfilAccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilAccion!=null) {
				this.jPanelPaginacionPerfilAccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
					this.jTabbedPaneBusquedasPerfilAccion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.perfilaccionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilAccion!=null) {
				this.jTabbedPaneBusquedasPerfilAccion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPerfilAccion!=null) {
				this.jPanelParametrosReportesPerfilAccion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPerfil(Boolean isParaPerfil){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPerfilNegation=!isParaPerfil;

			this.isVisibilidadFK_IdAccion=isParaPerfilNegation;
			if(!this.isVisibilidadFK_IdAccion) {this.jTabbedPaneBusquedasPerfilAccion.remove(jPanelFK_IdAccionPerfilAccion);}

			this.isVisibilidadFK_IdPerfil=isParaPerfil;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasPerfilAccion.remove(jPanelFK_IdPerfilPerfilAccion);}
		}
		
	}

	public void setVisibilidadBusquedasParaAccion(Boolean isParaAccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAccionNegation=!isParaAccion;

			this.isVisibilidadFK_IdAccion=isParaAccion;
			if(!this.isVisibilidadFK_IdAccion) {this.jTabbedPaneBusquedasPerfilAccion.remove(jPanelFK_IdAccionPerfilAccion);}

			this.isVisibilidadFK_IdPerfil=isParaAccionNegation;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasPerfilAccion.remove(jPanelFK_IdPerfilPerfilAccion);}
		}
		
	}
	
	
	
	

	public String registrarSesionPerfilAccionParaBusquedaPerfiles() throws Exception {
		Boolean isPaginaPopupPerfil=false;

		try {

			if(perfilaccionSessionBean==null) {
				perfilaccionSessionBean=new PerfilAccionSessionBean();
			}

			if(perfilSessionBean==null) {
				perfilSessionBean=new PerfilSessionBean();
			}

			perfilSessionBean.setsPathNavegacionActual(perfilaccionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilConstantesFunciones.SCLASSWEBTITULO);
			perfilSessionBean.setisPermiteRecargarInformacion(false);
			perfilSessionBean.setisPaginaPopup(true);
			isPaginaPopupPerfil=perfilSessionBean.getisPaginaPopup();
			perfilSessionBean.setisPaginaPopup(false);
			perfilSessionBean.setEstaModoBusqueda(true);
			perfilSessionBean.setsFuncionBusquedaRapida("window.opener.perfilaccionFuncionGeneral.setCombosCodigoDesdeBusquedaid_perfil(TO_REPLACE);");
			perfilSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfil(true);
			perfilSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfil(PerfilAccionConstantesFunciones.SNOMBREOPCION);
			//perfilSessionBean.setisBusquedaDesdeForeignKeySesionPerfilAccion(true);
			//perfilSessionBean.setlidPerfilAccionActual(this.idPerfilAccionActual);

			perfilaccionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPerfilAccion(true);
			perfilaccionSessionBean.setlIdPerfilAccionActualForeignKey(this.idPerfilAccionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PerfilAccionSessionBean perfilaccionSessionBean=new PerfilAccionSessionBean();
		
		if(this.perfilaccionSessionBean==null) {
			this.perfilaccionSessionBean=new PerfilAccionSessionBean();
		}
		
		this.perfilaccionSessionBean.setsUltimaBusquedaPerfilAccion(this.getsAccionBusqueda());
		this.perfilaccionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.perfilaccionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAccion")) {
			perfilaccionSessionBean.setid_accion(this.getid_accionFK_IdAccion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPerfil")) {
			perfilaccionSessionBean.setid_perfil(this.getid_perfilFK_IdPerfil());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PerfilAccionSessionBean perfilaccionSessionBean=new PerfilAccionSessionBean();
		
		if(this.perfilaccionSessionBean==null) {
			this.perfilaccionSessionBean=new PerfilAccionSessionBean();
		}
		
		if(this.perfilaccionSessionBean.getsUltimaBusquedaPerfilAccion()!=null&&!this.perfilaccionSessionBean.getsUltimaBusquedaPerfilAccion().equals("")) {
			this.setsAccionBusqueda(perfilaccionSessionBean.getsUltimaBusquedaPerfilAccion());
			this.setiNumeroPaginacion(perfilaccionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(perfilaccionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAccion")) {
				this.setid_accionFK_IdAccion(perfilaccionSessionBean.getid_accion());
				perfilaccionSessionBean.setid_accion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPerfil")) {
				this.setid_perfilFK_IdPerfil(perfilaccionSessionBean.getid_perfil());
				perfilaccionSessionBean.setid_perfil(-1L);
			}
		}
		
		this.perfilaccionSessionBean.setsUltimaBusquedaPerfilAccion("");
		this.perfilaccionSessionBean.setiNumeroPaginacion(PerfilAccionConstantesFunciones.INUMEROPAGINACION);
		this.perfilaccionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPerfilAccion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPerfilAccion() {
		this.updateBorderResaltarBusquedasFormularioPerfilAccion();
		this.updateVisibilidadBusquedasFormularioPerfilAccion();
		this.updateHabilitarBusquedasFormularioPerfilAccion();
	}
	
	public void updateBorderResaltarBusquedasFormularioPerfilAccion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPerfilAccion.getComponents().length>0) {
	

		if(this.perfilaccionConstantesFunciones.resaltarFK_IdAccionPerfilAccion!=null) {
			index= this.jTabbedPaneBusquedasPerfilAccion.indexOfComponent(this.jPanelFK_IdAccionPerfilAccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilAccion.getComponent(index);
				jPanel.setBorder(this.perfilaccionConstantesFunciones.resaltarFK_IdAccionPerfilAccion);
			}
		}

		if(this.perfilaccionConstantesFunciones.resaltarFK_IdPerfilPerfilAccion!=null) {
			index= this.jTabbedPaneBusquedasPerfilAccion.indexOfComponent(this.jPanelFK_IdPerfilPerfilAccion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilAccion.getComponent(index);
				jPanel.setBorder(this.perfilaccionConstantesFunciones.resaltarFK_IdPerfilPerfilAccion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPerfilAccion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPerfilAccion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfilAccion.indexOfComponent(this.jPanelFK_IdAccionPerfilAccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilAccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilaccionConstantesFunciones.mostrarFK_IdAccionPerfilAccion);
			if(!this.perfilaccionConstantesFunciones.mostrarFK_IdAccionPerfilAccion && index>-1) {
				this.jTabbedPaneBusquedasPerfilAccion.remove(index);
			}

			index= this.jTabbedPaneBusquedasPerfilAccion.indexOfComponent(this.jPanelFK_IdPerfilPerfilAccion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilAccion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilaccionConstantesFunciones.mostrarFK_IdPerfilPerfilAccion);
			if(!this.perfilaccionConstantesFunciones.mostrarFK_IdPerfilPerfilAccion && index>-1) {
				this.jTabbedPaneBusquedasPerfilAccion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPerfilAccion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPerfilAccion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfilAccion.indexOfComponent(this.jPanelFK_IdAccionPerfilAccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilAccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilaccionConstantesFunciones.activarFK_IdAccionPerfilAccion);
				this.jTabbedPaneBusquedasPerfilAccion.setEnabledAt(index,this.perfilaccionConstantesFunciones.activarFK_IdAccionPerfilAccion);
			}

			index= this.jTabbedPaneBusquedasPerfilAccion.indexOfComponent(this.jPanelFK_IdPerfilPerfilAccion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilAccion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilaccionConstantesFunciones.activarFK_IdPerfilPerfilAccion);
				this.jTabbedPaneBusquedasPerfilAccion.setEnabledAt(index,this.perfilaccionConstantesFunciones.activarFK_IdPerfilPerfilAccion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPerfilAccion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAccion")) {
			index= this.jTabbedPaneBusquedasPerfilAccion.indexOfComponent(this.jPanelFK_IdAccionPerfilAccion);

			this.jTabbedPaneBusquedasPerfilAccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilAccion.getComponent(index);

			this.perfilaccionConstantesFunciones.setResaltarFK_IdAccionPerfilAccion(resaltar);

			jPanel.setBorder(this.perfilaccionConstantesFunciones.resaltarFK_IdAccionPerfilAccion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPerfil")) {
			index= this.jTabbedPaneBusquedasPerfilAccion.indexOfComponent(this.jPanelFK_IdPerfilPerfilAccion);

			this.jTabbedPaneBusquedasPerfilAccion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilAccion.getComponent(index);

			this.perfilaccionConstantesFunciones.setResaltarFK_IdPerfilPerfilAccion(resaltar);

			jPanel.setBorder(this.perfilaccionConstantesFunciones.resaltarFK_IdPerfilPerfilAccion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPerfilAccion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPerfilAccion() throws Exception {

		if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPerfilAccion();
		this.updateVisibilidadResaltarControlesFormularioPerfilAccion();
		this.updateHabilitarResaltarControlesFormularioPerfilAccion();
		
	}
	
	public void updateBorderResaltarControlesFormularioPerfilAccion() throws Exception {
		if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.perfilaccionConstantesFunciones.resaltaridPerfilAccion!=null && this.jInternalFrameDetalleFormPerfilAccion!=null) {this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.setBorder(this.perfilaccionConstantesFunciones.resaltaridPerfilAccion);}
		if(this.perfilaccionConstantesFunciones.resaltarid_perfilPerfilAccion!=null && this.jInternalFrameDetalleFormPerfilAccion!=null) {this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setBorder(this.perfilaccionConstantesFunciones.resaltarid_perfilPerfilAccion);}
		if(this.perfilaccionConstantesFunciones.resaltarid_accionPerfilAccion!=null && this.jInternalFrameDetalleFormPerfilAccion!=null) {this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setBorder(this.perfilaccionConstantesFunciones.resaltarid_accionPerfilAccion);}
		if(this.perfilaccionConstantesFunciones.resaltarejecusionPerfilAccion!=null && this.jInternalFrameDetalleFormPerfilAccion!=null) {this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.setBorder(this.perfilaccionConstantesFunciones.resaltarejecusionPerfilAccion);}
		if(this.perfilaccionConstantesFunciones.resaltarestadoPerfilAccion!=null && this.jInternalFrameDetalleFormPerfilAccion!=null) {this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.setBorder(this.perfilaccionConstantesFunciones.resaltarestadoPerfilAccion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPerfilAccion() throws Exception {		
		if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
	
		//this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostraridPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jPanelidPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostraridPerfilAccion);
		//this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarid_perfilPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jPanelid_perfilPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarid_perfilPerfilAccion);
			this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarid_perfilPerfilAccion);
		//this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarid_accionPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jPanelid_accionPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarid_accionPerfilAccion);
		//this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarejecusionPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jPanelejecusionPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarejecusionPerfilAccion);
		//this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarestadoPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jPanelestadoPerfilAccion.setVisible(this.perfilaccionConstantesFunciones.mostrarestadoPerfilAccion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPerfilAccion() throws Exception {
		if(this.jInternalFrameDetalleFormPerfilAccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfilAccion!=null) {
	
		this.jInternalFrameDetalleFormPerfilAccion.jLabelidPerfilAccion.setEnabled(this.perfilaccionConstantesFunciones.activaridPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_perfilPerfilAccion.setEnabled(this.perfilaccionConstantesFunciones.activarid_perfilPerfilAccion);
			this.jInternalFrameDetalleFormPerfilAccion.jButtonid_perfilPerfilAccion.setEnabled(this.perfilaccionConstantesFunciones.activarid_perfilPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jComboBoxid_accionPerfilAccion.setEnabled(this.perfilaccionConstantesFunciones.activarid_accionPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxejecusionPerfilAccion.setEnabled(this.perfilaccionConstantesFunciones.activarejecusionPerfilAccion);
		this.jInternalFrameDetalleFormPerfilAccion.jCheckBoxestadoPerfilAccion.setEnabled(this.perfilaccionConstantesFunciones.activarestadoPerfilAccion);
		}
	}
	
		
}