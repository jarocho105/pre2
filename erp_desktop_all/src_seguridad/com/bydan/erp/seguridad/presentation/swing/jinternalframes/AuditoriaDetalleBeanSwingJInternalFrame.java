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

import com.bydan.erp.seguridad.util.AuditoriaDetalleConstantesFunciones;
import com.bydan.erp.seguridad.util.AuditoriaDetalleParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.AuditoriaDetalleParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.AuditoriaDetalleBean;
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
public class AuditoriaDetalleBeanSwingJInternalFrame extends AuditoriaDetalleJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AuditoriaDetalleBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AuditoriaDetalle> auditoriadetalleValidator = new ClassValidator<AuditoriaDetalle>(AuditoriaDetalle.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AuditoriaDetalle auditoriadetalle;	
	public AuditoriaDetalle auditoriadetalleAux;
	public AuditoriaDetalle auditoriadetalleAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AuditoriaDetalle auditoriadetalleTotales;
	public Long idAuditoriaDetalleActual;
	public Long iIdNuevoAuditoriaDetalle=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboAuditoria="";

	public List<Auditoria> auditoriasForeignKey;

	public List<Auditoria> getauditoriasForeignKey() {
		return auditoriasForeignKey;
	}

	public void setauditoriasForeignKey(List<Auditoria> auditoriasForeignKey) {
		this.auditoriasForeignKey = auditoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Auditoria auditoriaForeignKey;

	public Auditoria getauditoriaForeignKey() {
		return auditoriaForeignKey;
	}

	public void setauditoriaForeignKey(Auditoria auditoriaForeignKey) {
		this.auditoriaForeignKey = auditoriaForeignKey;
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
	
	public Boolean isPermisoTodoAuditoriaDetalle;
	public Boolean isPermisoNuevoAuditoriaDetalle;
	public Boolean isPermisoActualizarAuditoriaDetalle;
	public Boolean isPermisoActualizarOriginalAuditoriaDetalle;
	public Boolean isPermisoEliminarAuditoriaDetalle;
	public Boolean isPermisoGuardarCambiosAuditoriaDetalle;
	public Boolean isPermisoConsultaAuditoriaDetalle;
	public Boolean isPermisoBusquedaAuditoriaDetalle;
	public Boolean isPermisoReporteAuditoriaDetalle;
	public Boolean isPermisoPaginacionMedioAuditoriaDetalle;
	public Boolean isPermisoPaginacionAltoAuditoriaDetalle;
	public Boolean isPermisoPaginacionTodoAuditoriaDetalle;
	public Boolean isPermisoCopiarAuditoriaDetalle;
	public Boolean isPermisoVerFormAuditoriaDetalle;
	public Boolean isPermisoDuplicarAuditoriaDetalle;
	public Boolean isPermisoOrdenAuditoriaDetalle;
	
	
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
	
	public AuditoriaDetalleParameterReturnGeneral auditoriadetalleReturnGeneral;
	public AuditoriaDetalleParameterReturnGeneral auditoriadetalleParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAuditoriaDetalle=false;
	public Boolean esParaAccionDesdeFormularioAuditoriaDetalle=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AuditoriaDetalleSessionBeanAdditional auditoriadetalleSessionBeanAdditional=null;
	
	public AuditoriaDetalleSessionBeanAdditional getAuditoriaDetalleSessionBeanAdditional() {
		return this.auditoriadetalleSessionBeanAdditional;
	}
	
	public void setAuditoriaDetalleSessionBeanAdditional(AuditoriaDetalleSessionBeanAdditional auditoriadetalleSessionBeanAdditional) {
		try {
			this.auditoriadetalleSessionBeanAdditional=auditoriadetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AuditoriaDetalleBeanSwingJInternalFrameAdditional auditoriadetalleBeanSwingJInternalFrameAdditional=null;
	//public class AuditoriaDetalleBeanSwingJInternalFrame
	
	public AuditoriaDetalleBeanSwingJInternalFrameAdditional getAuditoriaDetalleBeanSwingJInternalFrameAdditional() {
		return this.auditoriadetalleBeanSwingJInternalFrameAdditional;
	}
	
	public void setAuditoriaDetalleBeanSwingJInternalFrameAdditional(AuditoriaDetalleBeanSwingJInternalFrameAdditional auditoriadetalleBeanSwingJInternalFrameAdditional) {
		try {
			this.auditoriadetalleBeanSwingJInternalFrameAdditional=auditoriadetalleBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AuditoriaDetalleLogic auditoriadetalleLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AuditoriaDetalle auditoriadetalleBean;
	public AuditoriaDetalleConstantesFunciones auditoriadetalleConstantesFunciones;
	//public AuditoriaDetalleParameterReturnGeneral auditoriadetalleReturnGeneral;
	
	//FK
	
	public AuditoriaLogic auditoriaLogic;
	
	//PARAMETROS
	
	
	//public List<AuditoriaDetalle> auditoriadetalles;	
	//public List<AuditoriaDetalle> auditoriadetallesEliminados;
	//public List<AuditoriaDetalle> auditoriadetallesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAuditoriaDetalle=false;
	public Boolean isVisibilidadCeldaDuplicarAuditoriaDetalle=true;
	public Boolean isVisibilidadCeldaCopiarAuditoriaDetalle=true;
	public Boolean isVisibilidadCeldaVerFormAuditoriaDetalle=true;
	public Boolean isVisibilidadCeldaOrdenAuditoriaDetalle=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
	public Boolean isVisibilidadCeldaModificarAuditoriaDetalle=false;
	public Boolean isVisibilidadCeldaActualizarAuditoriaDetalle=false;
	public Boolean isVisibilidadCeldaEliminarAuditoriaDetalle=false;
	public Boolean isVisibilidadCeldaCancelarAuditoriaDetalle=false;
	public Boolean isVisibilidadCeldaGuardarAuditoriaDetalle=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdAuditoriaPorNombreCampo=false;
	public Boolean isVisibilidadFK_IdAuditoria=false;
	
	public Long getiIdNuevoAuditoriaDetalle() {
		return this.iIdNuevoAuditoriaDetalle;
	}

	public void setiIdNuevoAuditoriaDetalle(Long iIdNuevoAuditoriaDetalle) {
		this.iIdNuevoAuditoriaDetalle = iIdNuevoAuditoriaDetalle;
	}
	
	public Long getidAuditoriaDetalleActual() {
		return this.idAuditoriaDetalleActual;
	}

	public void setidAuditoriaDetalleActual(Long idAuditoriaDetalleActual) {
		this.idAuditoriaDetalleActual = idAuditoriaDetalleActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AuditoriaDetalle getauditoriadetalle() {
		return this.auditoriadetalle;
	}

	public void setauditoriadetalle(AuditoriaDetalle auditoriadetalle) {
		this.auditoriadetalle = auditoriadetalle;
	}
	
	public AuditoriaDetalle getauditoriadetalleAux() {
		return this.auditoriadetalleAux;
	}

	public void setauditoriadetalleAux(AuditoriaDetalle auditoriadetalleAux) {
		this.auditoriadetalleAux = auditoriadetalleAux;
	}				
	
	public AuditoriaDetalle getauditoriadetalleAnterior() {
		return this.auditoriadetalleAnterior;
	}

	public void setauditoriadetalleAnterior(AuditoriaDetalle auditoriadetalleAnterior) {
		this.auditoriadetalleAnterior = auditoriadetalleAnterior;
	}	
	
	public AuditoriaDetalle getauditoriadetalleTotales() {
		return this.auditoriadetalleTotales;
	}

	public void setauditoriadetalleTotales(AuditoriaDetalle auditoriadetalleTotales) {
		this.auditoriadetalleTotales = auditoriadetalleTotales;
	}	
	
	public AuditoriaDetalle getauditoriadetalleBean() {
		return this.auditoriadetalleBean;
	}

	public void setauditoriadetalleBean(AuditoriaDetalle auditoriadetalleBean) {
		this.auditoriadetalleBean = auditoriadetalleBean;
	}	
	
	public AuditoriaDetalleParameterReturnGeneral getauditoriadetalleReturnGeneral() {
		return this.auditoriadetalleReturnGeneral;
	}

	public void setauditoriadetalleReturnGeneral(AuditoriaDetalleParameterReturnGeneral auditoriadetalleReturnGeneral) {
		this.auditoriadetalleReturnGeneral = auditoriadetalleReturnGeneral;
	}	
	
	
	public Long id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo=-1L;

	public Long getid_auditoriaBusquedaPorIdAuditoriaPorNombreCampo() {
		return this.id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo;
	}

	public void setid_auditoriaBusquedaPorIdAuditoriaPorNombreCampo(Long id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo) {
		this.id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo = id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo;
	}

;
	public String nombre_campoBusquedaPorIdAuditoriaPorNombreCampo="";

	public String getnombre_campoBusquedaPorIdAuditoriaPorNombreCampo() {
		return this.nombre_campoBusquedaPorIdAuditoriaPorNombreCampo;
	}

	public void setnombre_campoBusquedaPorIdAuditoriaPorNombreCampo(String nombre_campoBusquedaPorIdAuditoriaPorNombreCampo) {
		this.nombre_campoBusquedaPorIdAuditoriaPorNombreCampo = nombre_campoBusquedaPorIdAuditoriaPorNombreCampo;
	}

	public Long id_auditoriaFK_IdAuditoria=-1L;

	public Long getid_auditoriaFK_IdAuditoria() {
		return this.id_auditoriaFK_IdAuditoria;
	}

	public void setid_auditoriaFK_IdAuditoria(Long id_auditoriaFK_IdAuditoria) {
		this.id_auditoriaFK_IdAuditoria = id_auditoriaFK_IdAuditoria;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AuditoriaDetalleLogic getAuditoriaDetalleLogic()	{		
		return auditoriadetalleLogic;
	}

	public void setAuditoriaDetalleLogic(AuditoriaDetalleLogic auditoriadetalleLogic) {
		this.auditoriadetalleLogic = auditoriadetalleLogic;
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
	
	public Boolean getIsEsNuevoAuditoriaDetalle() {
		return isEsNuevoAuditoriaDetalle;
	}

	public void setIsEsNuevoAuditoriaDetalle(Boolean isEsNuevoAuditoriaDetalle) {
		this.isEsNuevoAuditoriaDetalle = isEsNuevoAuditoriaDetalle;
	}

	public Boolean getEsParaAccionDesdeFormularioAuditoriaDetalle() {
		return esParaAccionDesdeFormularioAuditoriaDetalle;
	}
	
	public void setEsParaAccionDesdeFormularioAuditoriaDetalle(Boolean esParaAccionDesdeFormularioAuditoriaDetalle) {
		this.esParaAccionDesdeFormularioAuditoriaDetalle = esParaAccionDesdeFormularioAuditoriaDetalle;
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
	
	
	public void cargarCombosAuditoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.auditoriasForeignKey=new ArrayList<Auditoria>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AuditoriaLogic auditoriaLogic=new AuditoriaLogic();

			auditoriaLogic.getAuditoriaDataAccess().setIsForForeingKeyData(true);

			if(this.auditoriadetalleSessionBean==null) {
				this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
			}

			if(!this.auditoriadetalleSessionBean.getisBusquedaDesdeForeignKeySesionAuditoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriaDataAccess().setIsForForeingKeyData(true);

					auditoriaLogic.getTodosAuditoriasWithConnection(sFinalQuery,new Pagination());

					this.auditoriasForeignKey=auditoriaLogic.getAuditorias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAuditoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getEntityWithConnection(auditoriadetalleSessionBean.getlidAuditoriaActual());
					this.auditoriasForeignKey.add(auditoriaLogic.getAuditoria());
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

	
	
	public void setActualAuditoriaForeignKey(Long idAuditoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Auditoria  auditoriaTemp=null;

			for(Auditoria auditoriaAux:auditoriasForeignKey) {
				if(auditoriaAux.getId()!=null && auditoriaAux.getId().equals(idAuditoriaSeleccionado)) {
					auditoriaTemp=auditoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(auditoriaTemp!=null) {

					if(this.auditoriadetalle!=null) {
						this.auditoriadetalle.setAuditoria(auditoriaTemp);
					}

					if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
						this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setSelectedItem(auditoriaTemp);
					}
				} else {
					//jComboBoxid_auditoriaAuditoriaDetalle.setSelectedItem(auditoriaTemp);
					if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
						if(this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdAuditoriaPorNombreCampo") || sFormularioTipoBusqueda.equals("Todos")){
					if(auditoriaTemp!=null && jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle!=null) {
						jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setSelectedItem(auditoriaTemp);
					} else {
						if(jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle!=null) {
							//jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setSelectedItem(auditoriaTemp);
							if(jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.getItemCount()>0) {
								jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdAuditoria") || sFormularioTipoBusqueda.equals("Todos")){
					if(auditoriaTemp!=null && jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle!=null) {
						jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setSelectedItem(auditoriaTemp);
					} else {
						if(jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle!=null) {
							//jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setSelectedItem(auditoriaTemp);
							if(jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.getItemCount()>0) {
								jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setSelectedIndex(0);
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

	public String getActualAuditoriaForeignKeyDescripcion(Long idAuditoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Auditoria  auditoriaTemp=null;

			for(Auditoria auditoriaAux:auditoriasForeignKey) {
				if(auditoriaAux.getId()!=null && auditoriaAux.getId().equals(idAuditoriaSeleccionado)) {
					auditoriaTemp=auditoriaAux;
					break;
				}
			}


			sDescripcion=AuditoriaConstantesFunciones.getAuditoriaDescripcion(auditoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAuditoriaForeignKeyGenerico(Long idAuditoriaSeleccionado,JComboBox jComboBoxid_auditoriaAuditoriaDetalleGenerico)throws Exception
	{
		try
		{
			Auditoria  auditoriaTemp=null;

			for(Auditoria auditoriaAux:auditoriasForeignKey) {
				if(auditoriaAux.getId()!=null && auditoriaAux.getId().equals(idAuditoriaSeleccionado)) {
					auditoriaTemp=auditoriaAux;
					break;
				}
			}

			if(auditoriaTemp!=null) {
				jComboBoxid_auditoriaAuditoriaDetalleGenerico.setSelectedItem(auditoriaTemp);
			} else {
				if(jComboBoxid_auditoriaAuditoriaDetalleGenerico!=null && jComboBoxid_auditoriaAuditoriaDetalleGenerico.getItemCount()>0) {
					jComboBoxid_auditoriaAuditoriaDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAuditoriaForeignKey(AuditoriaDetalle auditoriadetalle,JComboBox jComboBoxid_auditoriaAuditoriaDetalleGenerico)throws Exception
	{
		try
		{
			Auditoria  auditoriaAux=new Auditoria();

			if(jComboBoxid_auditoriaAuditoriaDetalleGenerico==null) {
				auditoriaAux=(Auditoria)this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.getSelectedItem();
			} else {
				auditoriaAux=(Auditoria)jComboBoxid_auditoriaAuditoriaDetalleGenerico.getSelectedItem();
			}

			if(auditoriaAux!=null && auditoriaAux.getId()!=null) {
				auditoriadetalle.setid_auditoria(auditoriaAux.getId());
				auditoriadetalle.setauditoria_descripcion(AuditoriaDetalleConstantesFunciones.getAuditoriaDescripcion(auditoriaAux));
				auditoriadetalle.setAuditoria(auditoriaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAuditoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAuditoria=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { 
							this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.removeAllItems();

							for(Auditoria auditoria:this.auditoriasForeignKey) {
								this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.addItem(auditoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { 
					}

					if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdAuditoriaPorNombreCampo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.removeAllItems();

							for(Auditoria auditoria:this.auditoriasForeignKey) {
								this.jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.addItem(auditoria);
							}
						}

						if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdAuditoria") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.removeAllItems();

							for(Auditoria auditoria:this.auditoriasForeignKey) {
								this.jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.addItem(auditoria);
							}
						}

						if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAuditoriaForeignKey(Auditoria auditoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
							this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setSelectedItem(auditoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
							this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setSelectedItem(auditoria);
						} else {
							this.jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setSelectedItem(auditoria);
						} else {
							this.jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAuditoriaDetalle() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AuditoriaDetalleConstantesFunciones.refrescarForeignKeysDescripcionesAuditoriaDetalle(this.auditoriadetalleLogic.getAuditoriaDetalles());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AuditoriaDetalleConstantesFunciones.refrescarForeignKeysDescripcionesAuditoriaDetalle(this.auditoriadetalles);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Auditoria.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//auditoriadetalleLogic.setAuditoriaDetalles(this.auditoriadetalles);
			auditoriadetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AuditoriaDetalleParameterReturnGeneral getAuditoriaDetalleParameterGeneral() {
		return this.auditoriadetalleParameterGeneral;
	}
	
	public void setAuditoriaDetalleParameterGeneral(AuditoriaDetalleParameterReturnGeneral auditoriadetalleParameterGeneral) {
		this.auditoriadetalleParameterGeneral = auditoriadetalleParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAuditoriaDetalle() {
		return isPermisoTodoAuditoriaDetalle;
	}

	public void setIsPermisoTodoAuditoriaDetalle(Boolean isPermisoTodoAuditoriaDetalle) {
		this.isPermisoTodoAuditoriaDetalle = isPermisoTodoAuditoriaDetalle;
	}

	public Boolean getIsPermisoNuevoAuditoriaDetalle() {
		return isPermisoNuevoAuditoriaDetalle;
	}

	public void setIsPermisoNuevoAuditoriaDetalle(Boolean isPermisoNuevoAuditoriaDetalle) {
		this.isPermisoNuevoAuditoriaDetalle = isPermisoNuevoAuditoriaDetalle;
	}

	public Boolean getIsPermisoActualizarAuditoriaDetalle() {
		return isPermisoActualizarAuditoriaDetalle;
	}

	public void setIsPermisoActualizarAuditoriaDetalle(Boolean isPermisoActualizarAuditoriaDetalle) {
		this.isPermisoActualizarAuditoriaDetalle = isPermisoActualizarAuditoriaDetalle;
	}

	public Boolean getIsPermisoEliminarAuditoriaDetalle() {
		return isPermisoEliminarAuditoriaDetalle;
	}

	public void setIsPermisoEliminarAuditoriaDetalle(Boolean isPermisoEliminarAuditoriaDetalle) {
		this.isPermisoEliminarAuditoriaDetalle = isPermisoEliminarAuditoriaDetalle;
	}

	public Boolean getIsPermisoGuardarCambiosAuditoriaDetalle() {
		return isPermisoGuardarCambiosAuditoriaDetalle;
	}

	public void setIsPermisoGuardarCambiosAuditoriaDetalle(Boolean isPermisoGuardarCambiosAuditoriaDetalle) {
		this.isPermisoGuardarCambiosAuditoriaDetalle = isPermisoGuardarCambiosAuditoriaDetalle;
	}
	
	public Boolean getIsPermisoConsultaAuditoriaDetalle() {
		return isPermisoConsultaAuditoriaDetalle;
	}

	public void setIsPermisoConsultaAuditoriaDetalle(Boolean isPermisoConsultaAuditoriaDetalle) {
		this.isPermisoConsultaAuditoriaDetalle = isPermisoConsultaAuditoriaDetalle;
	}

	public Boolean getIsPermisoBusquedaAuditoriaDetalle() {
		return isPermisoBusquedaAuditoriaDetalle;
	}

	public void setIsPermisoBusquedaAuditoriaDetalle(Boolean isPermisoBusquedaAuditoriaDetalle) {
		this.isPermisoBusquedaAuditoriaDetalle = isPermisoBusquedaAuditoriaDetalle;
	}

	public Boolean getIsPermisoReporteAuditoriaDetalle() {
		return isPermisoReporteAuditoriaDetalle;
	}

	public void setIsPermisoReporteAuditoriaDetalle(Boolean isPermisoReporteAuditoriaDetalle) {
		this.isPermisoReporteAuditoriaDetalle = isPermisoReporteAuditoriaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionMedioAuditoriaDetalle() {
		return isPermisoPaginacionMedioAuditoriaDetalle;
	}

	public void setIsPermisoPaginacionMedioAuditoriaDetalle(Boolean isPermisoPaginacionMedioAuditoriaDetalle) {
		this.isPermisoPaginacionMedioAuditoriaDetalle = isPermisoPaginacionMedioAuditoriaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionTodoAuditoriaDetalle() {
		return isPermisoPaginacionTodoAuditoriaDetalle;
	}

	public void setIsPermisoPaginacionTodoAuditoriaDetalle(Boolean isPermisoPaginacionTodoAuditoriaDetalle) {
		this.isPermisoPaginacionTodoAuditoriaDetalle = isPermisoPaginacionTodoAuditoriaDetalle;
	}
	
	public Boolean getIsPermisoPaginacionAltoAuditoriaDetalle() {
		return isPermisoPaginacionAltoAuditoriaDetalle;
	}

	public void setIsPermisoPaginacionAltoAuditoriaDetalle(Boolean isPermisoPaginacionAltoAuditoriaDetalle) {
		this.isPermisoPaginacionAltoAuditoriaDetalle = isPermisoPaginacionAltoAuditoriaDetalle;
	}
	
	public Boolean getIsPermisoCopiarAuditoriaDetalle() {
		return isPermisoCopiarAuditoriaDetalle;
	}

	public void setIsPermisoCopiarAuditoriaDetalle(Boolean isPermisoCopiarAuditoriaDetalle) {
		this.isPermisoCopiarAuditoriaDetalle = isPermisoCopiarAuditoriaDetalle;
	}
	
	public Boolean getIsPermisoVerFormAuditoriaDetalle() {
		return isPermisoVerFormAuditoriaDetalle;
	}

	public void setIsPermisoVerFormAuditoriaDetalle(Boolean isPermisoVerFormAuditoriaDetalle) {
		this.isPermisoVerFormAuditoriaDetalle = isPermisoVerFormAuditoriaDetalle;
	}
	
	public Boolean getIsPermisoDuplicarAuditoriaDetalle() {
		return isPermisoDuplicarAuditoriaDetalle;
	}

	public void setIsPermisoDuplicarAuditoriaDetalle(Boolean isPermisoDuplicarAuditoriaDetalle) {
		this.isPermisoDuplicarAuditoriaDetalle = isPermisoDuplicarAuditoriaDetalle;
	}
	
	public Boolean getIsPermisoOrdenAuditoriaDetalle() {
		return isPermisoOrdenAuditoriaDetalle;
	}

	public void setIsPermisoOrdenAuditoriaDetalle(Boolean isPermisoOrdenAuditoriaDetalle) {
		this.isPermisoOrdenAuditoriaDetalle = isPermisoOrdenAuditoriaDetalle;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAuditoriaDetalle() {
		return isVisibilidadCeldaNuevoAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaNuevoAuditoriaDetalle(Boolean isVisibilidadCeldaNuevoAuditoriaDetalle) {
		this.isVisibilidadCeldaNuevoAuditoriaDetalle = isVisibilidadCeldaNuevoAuditoriaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAuditoriaDetalle() {
		return isVisibilidadCeldaDuplicarAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaDuplicarAuditoriaDetalle(Boolean isVisibilidadCeldaDuplicarAuditoriaDetalle) {
		this.isVisibilidadCeldaDuplicarAuditoriaDetalle = isVisibilidadCeldaDuplicarAuditoriaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAuditoriaDetalle() {
		return isVisibilidadCeldaCopiarAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaCopiarAuditoriaDetalle(Boolean isVisibilidadCeldaCopiarAuditoriaDetalle) {
		this.isVisibilidadCeldaCopiarAuditoriaDetalle = isVisibilidadCeldaCopiarAuditoriaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAuditoriaDetalle() {
		return isVisibilidadCeldaVerFormAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaVerFormAuditoriaDetalle(Boolean isVisibilidadCeldaVerFormAuditoriaDetalle) {
		this.isVisibilidadCeldaVerFormAuditoriaDetalle = isVisibilidadCeldaVerFormAuditoriaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAuditoriaDetalle() {
		return isVisibilidadCeldaOrdenAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaOrdenAuditoriaDetalle(Boolean isVisibilidadCeldaOrdenAuditoriaDetalle) {
		this.isVisibilidadCeldaOrdenAuditoriaDetalle = isVisibilidadCeldaOrdenAuditoriaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAuditoriaDetalle() {
		return isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAuditoriaDetalle(Boolean isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle) {
		this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle = isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAuditoriaDetalle() {
		return isVisibilidadCeldaModificarAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaModificarAuditoriaDetalle(Boolean isVisibilidadCeldaModificarAuditoriaDetalle) {
		this.isVisibilidadCeldaModificarAuditoriaDetalle = isVisibilidadCeldaModificarAuditoriaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAuditoriaDetalle() {
		return isVisibilidadCeldaActualizarAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaActualizarAuditoriaDetalle(Boolean isVisibilidadCeldaActualizarAuditoriaDetalle) {
		this.isVisibilidadCeldaActualizarAuditoriaDetalle = isVisibilidadCeldaActualizarAuditoriaDetalle;
	}

	public Boolean getIsVisibilidadCeldaEliminarAuditoriaDetalle() {
		return isVisibilidadCeldaEliminarAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaEliminarAuditoriaDetalle(Boolean isVisibilidadCeldaEliminarAuditoriaDetalle) {
		this.isVisibilidadCeldaEliminarAuditoriaDetalle = isVisibilidadCeldaEliminarAuditoriaDetalle;
	}

	public Boolean getIsVisibilidadCeldaCancelarAuditoriaDetalle() {
		return isVisibilidadCeldaCancelarAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaCancelarAuditoriaDetalle(Boolean isVisibilidadCeldaCancelarAuditoriaDetalle) {
		this.isVisibilidadCeldaCancelarAuditoriaDetalle = isVisibilidadCeldaCancelarAuditoriaDetalle;
	}

	public Boolean getIsVisibilidadCeldaGuardarAuditoriaDetalle() {
		return isVisibilidadCeldaGuardarAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaGuardarAuditoriaDetalle(Boolean isVisibilidadCeldaGuardarAuditoriaDetalle) {
		this.isVisibilidadCeldaGuardarAuditoriaDetalle = isVisibilidadCeldaGuardarAuditoriaDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAuditoriaDetalle() {
		return isVisibilidadCeldaGuardarCambiosAuditoriaDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAuditoriaDetalle(Boolean isVisibilidadCeldaGuardarCambiosAuditoriaDetalle) {
		this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle = isVisibilidadCeldaGuardarCambiosAuditoriaDetalle;
	}
		
	public AuditoriaDetalleSessionBean getauditoriadetalleSessionBean() {
		return this.auditoriadetalleSessionBean;
	}
	
	public void setauditoriadetalleSessionBean(AuditoriaDetalleSessionBean auditoriadetalleSessionBean) {
		this.auditoriadetalleSessionBean=auditoriadetalleSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdAuditoriaPorNombreCampo() {
		return this.isVisibilidadBusquedaPorIdAuditoriaPorNombreCampo;
	}

	public void setisVisibilidadBusquedaPorIdAuditoriaPorNombreCampo(Boolean isVisibilidadBusquedaPorIdAuditoriaPorNombreCampo) {
		this.isVisibilidadBusquedaPorIdAuditoriaPorNombreCampo=isVisibilidadBusquedaPorIdAuditoriaPorNombreCampo;
	}

	public Boolean getisVisibilidadFK_IdAuditoria() {
		return this.isVisibilidadFK_IdAuditoria;
	}

	public void setisVisibilidadFK_IdAuditoria(Boolean isVisibilidadFK_IdAuditoria) {
		this.isVisibilidadFK_IdAuditoria=isVisibilidadFK_IdAuditoria;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(AuditoriaDetalle auditoriadetalle)throws Exception {
		try {
			
				this.setActualParaGuardarAuditoriaForeignKey(auditoriadetalle,null);
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
	
	public void bugActualizarReferenciaActual(AuditoriaDetalle auditoriadetalle,AuditoriaDetalle auditoriadetalleAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAuditoriaDetalle(auditoriadetalle);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		auditoriadetalleAux.setId(auditoriadetalle.getId());
		auditoriadetalleAux.setVersionRow(auditoriadetalle.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAuditoriaDetalle();
		
			int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = auditoriadetalleValidator.getInvalidValues(this.auditoriadetalle);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			auditoriadetalleLogic.setDatosCliente(datosCliente);
			auditoriadetalleLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				auditoriadetalleAux=new  AuditoriaDetalle();
				
				auditoriadetalleAux.setIsNew(true);
				auditoriadetalleAux.setIsChanged(true);
				
				auditoriadetalleAux.setAuditoriaDetalleOriginal(this.auditoriadetalle);
				
				auditoriadetalleAux.setId(this.auditoriadetalle.getId());	
				auditoriadetalleAux.setVersionRow(this.auditoriadetalle.getVersionRow());	
				auditoriadetalleAux.setid_auditoria(this.auditoriadetalle.getid_auditoria());	
				auditoriadetalleAux.setnombre_campo(this.auditoriadetalle.getnombre_campo());	
				auditoriadetalleAux.setvalor_anterior(this.auditoriadetalle.getvalor_anterior());	
				auditoriadetalleAux.setvalor_actual(this.auditoriadetalle.getvalor_actual());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.auditoriadetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(auditoriadetalleAux,auditoriadetalleLogic.getAuditoriaDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(auditoriadetalleAux,auditoriadetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.auditoriadetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetalleLogic.saveAuditoriaDetalles();//WithConnection
						//auditoriadetalleLogic.getSetVersionRowAuditoriaDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.auditoriadetalle,auditoriadetalleAux);
					
					this.refrescarForeignKeysDescripcionesAuditoriaDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								auditoriadetalleLogic.saveAuditoriaDetalleRelaciones(auditoriadetalleAux);//WithConnection
								//auditoriadetalleLogic.getSetVersionRowAuditoriaDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.auditoriadetalle,auditoriadetalleAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.auditoriadetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(auditoriadetalleAux,auditoriadetalleLogic.getAuditoriaDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(auditoriadetalleAux,auditoriadetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.auditoriadetalle,auditoriadetalleAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				auditoriadetalleAux=new  AuditoriaDetalle();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado() 
					|| (this.auditoriadetalleSessionBean.getEsGuardarRelacionado() && this.auditoriadetalle.getId()>=0)) {
						
					auditoriadetalleAux.setIsNew(false);
				}
				
				auditoriadetalleAux.setIsDeleted(false);
			
				auditoriadetalleAux.setId(this.auditoriadetalle.getId());	
				auditoriadetalleAux.setVersionRow(this.auditoriadetalle.getVersionRow());	
				auditoriadetalleAux.setid_auditoria(this.auditoriadetalle.getid_auditoria());	
				auditoriadetalleAux.setnombre_campo(this.auditoriadetalle.getnombre_campo());	
				auditoriadetalleAux.setvalor_anterior(this.auditoriadetalle.getvalor_anterior());	
				auditoriadetalleAux.setvalor_actual(this.auditoriadetalle.getvalor_actual());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(auditoriadetalleAux,auditoriadetalleLogic.getAuditoriaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(auditoriadetalleAux,auditoriadetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.auditoriadetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetalleLogic.saveAuditoriaDetalles();//WithConnection
						//auditoriadetalleLogic.getSetVersionRowAuditoriaDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.auditoriadetalle,auditoriadetalleAux);
					
					this.refrescarForeignKeysDescripcionesAuditoriaDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								auditoriadetalleLogic.saveAuditoriaDetalleRelaciones(auditoriadetalleAux);//WithConnection
								//auditoriadetalleLogic.getSetVersionRowAuditoriaDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.auditoriadetalle,auditoriadetalleAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.auditoriadetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(auditoriadetalleAux,auditoriadetalleLogic.getAuditoriaDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(auditoriadetalleAux,auditoriadetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.auditoriadetalle,auditoriadetalleAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				auditoriadetalleAux=new  AuditoriaDetalle();
				
				auditoriadetalleAux.setIsNew(false);
				auditoriadetalleAux.setIsChanged(false);
				
				auditoriadetalleAux.setIsDeleted(true);
				
				auditoriadetalleAux.setId(this.auditoriadetalle.getId());	
				auditoriadetalleAux.setVersionRow(this.auditoriadetalle.getVersionRow());	
				auditoriadetalleAux.setid_auditoria(this.auditoriadetalle.getid_auditoria());	
				auditoriadetalleAux.setnombre_campo(this.auditoriadetalle.getnombre_campo());	
				auditoriadetalleAux.setvalor_anterior(this.auditoriadetalle.getvalor_anterior());	
				auditoriadetalleAux.setvalor_actual(this.auditoriadetalle.getvalor_actual());	
				
				if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.auditoriadetalleAux.getId()>=0) {	
						this.auditoriadetallesEliminados.add(auditoriadetalleAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(auditoriadetalleAux,auditoriadetalleLogic.getAuditoriaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(auditoriadetalleAux,auditoriadetalles);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.auditoriadetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetalleLogic.saveAuditoriaDetalles();//WithConnection
						//auditoriadetalleLogic.getSetVersionRowAuditoriaDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								auditoriadetalleLogic.saveAuditoriaDetalleRelaciones(auditoriadetalleAux);//WithConnection
								//auditoriadetalleLogic.getSetVersionRowAuditoriaDetalles();//WithConnection
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
							if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones() 
								|| this.auditoriadetalleSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(auditoriadetalleAux,auditoriadetalleLogic.getAuditoriaDetalles());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(auditoriadetalleAux,auditoriadetalles);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.getAuditoriaDetalles().addAll(this.auditoriadetallesEliminados);
					
					auditoriadetalleLogic.saveAuditoriaDetalles();//WithConnection
					//auditoriadetalleLogic.getSetVersionRowAuditoriaDetalles();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAuditoriaDetalle();
				
				this.auditoriadetallesEliminados= new ArrayList<AuditoriaDetalle>();		
			}
			
			if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Auditoria Detalle GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.auditoriadetalle=auditoriadetalleAux;
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
      		//this.finishProcessAuditoriaDetalle();
      	}
		
	}	
	
	public void actualizarRelaciones(AuditoriaDetalle auditoriadetalleLocal) throws Exception {
		
		if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AuditoriaDetalle auditoriadetalleLocal) throws Exception {	
		if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AuditoriaDetalleFormJInternalFrame.class)) {
				AuditoriaBeanSwingJInternalFrame auditoriaBeanSwingJInternalFrameLocal=(AuditoriaBeanSwingJInternalFrame) ((AuditoriaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				auditoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAuditoria(auditoriaBeanSwingJInternalFrameLocal.getauditoria(),true);
				auditoriaBeanSwingJInternalFrameLocal.actualizarLista(auditoriaBeanSwingJInternalFrameLocal.auditoria,this.auditoriasForeignKey);

				auditoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(auditoriaBeanSwingJInternalFrameLocal.auditoria);

				auditoriadetalleLocal.setAuditoria(auditoriaBeanSwingJInternalFrameLocal.auditoria);

				this.addItemDefectoCombosForeignKeyAuditoria();
				this.cargarCombosFrameAuditoriasForeignKey("Formulario");
				this.setActualAuditoriaForeignKey(auditoriaBeanSwingJInternalFrameLocal.auditoria.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAuditoriaDetalleActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = auditoriadetalleValidator.getInvalidValues(this.auditoriadetalle);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AuditoriaDetalle auditoriadetalle,List<AuditoriaDetalle> auditoriadetalles) throws Exception {
		try	{		
			AuditoriaDetalleConstantesFunciones.actualizarLista(auditoriadetalle,auditoriadetalles,this.auditoriadetalleSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AuditoriaDetalle auditoriadetalle,List<AuditoriaDetalle> auditoriadetalles) throws Exception {
		try	{			
			AuditoriaDetalleConstantesFunciones.actualizarSelectedLista(auditoriadetalle,auditoriadetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AuditoriaDetalle> auditoriadetallesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				auditoriadetallesLocal=this.auditoriadetalleLogic.getAuditoriaDetalles();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				auditoriadetallesLocal=this.auditoriadetalles;
			}
			//ARCHITECTURE
		
			for(AuditoriaDetalle auditoriadetalleLocal:auditoriadetallesLocal) {
				if(this.permiteMantenimiento(auditoriadetalleLocal) && auditoriadetalleLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AuditoriaDetalleConstantesFunciones.getAuditoriaDetalleLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AuditoriaDetalleConstantesFunciones.IDAUDITORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelid_auditoriaAuditoriaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaDetalleConstantesFunciones.NOMBRECAMPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelnombre_campoAuditoriaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaDetalleConstantesFunciones.VALORANTERIOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelvalor_anteriorAuditoriaDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaDetalleConstantesFunciones.VALORACTUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelvalor_actualAuditoriaDetalle,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelid_auditoriaAuditoriaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelnombre_campoAuditoriaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelvalor_anteriorAuditoriaDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelvalor_actualAuditoriaDetalle,"");
		
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
		this.iIdNuevoAuditoriaDetalle--;	
		
		
		this.auditoriadetalleAux=new AuditoriaDetalle();
		
		this.auditoriadetalleAux.setId(this.iIdNuevoAuditoriaDetalle);
		this.auditoriadetalleAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.auditoriadetalleLogic.getAuditoriaDetalles().add(this.auditoriadetalleAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.auditoriadetalles.add(this.auditoriadetalleAux);
		}
		//ARCHITECTURE
		
		this.auditoriadetalle=this.auditoriadetalleAux;
		
		if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAuditoriaDetalle(this.auditoriadetalle);
			this.setVariablesObjetoActualToFormularioForeignKeyAuditoriaDetalle(this.auditoriadetalle);
		}
				
		//this.setDefaultControlesAuditoriaDetalle();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAuditoriaDetalle();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAuditoriaDetalle();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAuditoriaDetalle();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAuditoriaDetalle(this.auditoriadetalleBean,this.auditoriadetalle,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
			classes=AuditoriaDetalleConstantesFunciones.getClassesRelationshipsOfAuditoriaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.auditoriadetalleReturnGeneral=auditoriadetalleLogic.procesarEventosAuditoriaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.auditoriadetalleLogic.getAuditoriaDetalles(),this.auditoriadetalle,this.auditoriadetalleParameterGeneral,this.isEsNuevoAuditoriaDetalle,classes);//this.auditoriadetalleLogic.getAuditoriaDetalle()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAuditoriaDetalle(this.auditoriadetalleReturnGeneral,this.auditoriadetalleBean,false);
		
		if(this.auditoriadetalleReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAuditoriaDetalle(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAuditoriaDetalle(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle());
		}
		
		if(this.auditoriadetalleReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAuditoriaDetalle(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle(),classes);//this.auditoriadetalleBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAuditoriaDetalle();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAuditoriaDetalle();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.RecargarFormAuditoriaDetalle(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAuditoriaDetalle(false);
						
			if(auditoriadetalleSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAuditoriaDetalle();
			}
			
			this.actualizarVisualTableDatosAuditoriaDetalle();
			
			this.jTableDatosAuditoriaDetalle.setRowSelectionInterval(this.getIndiceNuevoAuditoriaDetalle(), this.getIndiceNuevoAuditoriaDetalle());
			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
						
			this.actualizarEstadoCeldasBotonesAuditoriaDetalle("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAuditoriaDetalle(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreanombre_campoAuditoriaDetalle.setEnabled(isHabilitar && this.auditoriadetalleConstantesFunciones.activarnombre_campoAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_anteriorAuditoriaDetalle.setEnabled(isHabilitar && this.auditoriadetalleConstantesFunciones.activarvalor_anteriorAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_actualAuditoriaDetalle.setEnabled(isHabilitar && this.auditoriadetalleConstantesFunciones.activarvalor_actualAuditoriaDetalle);	
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setEnabled(isHabilitar && this.auditoriadetalleConstantesFunciones.activarid_auditoriaAuditoriaDetalle);
	};
	
	public void setDefaultControlesAuditoriaDetalle() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAuditoriaDetalle(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.auditoriadetalleSessionBean.setConGuardarRelaciones(true);			
			this.auditoriadetalleSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.setVisible(true);
			
					
		} else {
			//this.auditoriadetalleSessionBean.setConGuardarRelaciones(false);			
			this.auditoriadetalleSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAuditoriaDetalle() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
				if(auditoriadetalleAux.getId().equals(this.iIdNuevoAuditoriaDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalles) {
				if(auditoriadetalleAux.getId().equals(this.iIdNuevoAuditoriaDetalle)) {
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
	
	public int getIndiceActualAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
				if(auditoriadetalleAux.getId().equals(auditoriadetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalles) {
				if(auditoriadetalleAux.getId().equals(auditoriadetalle.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAuditoriaDetalle(AuditoriaDetalle auditoriadetalleOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
				if(auditoriadetalleAux.getAuditoriaDetalleOriginal().getId().equals(auditoriadetalleOriginal.getId())) {
					existe=true;
					auditoriadetalleOriginal.setId(auditoriadetalleAux.getId());
					auditoriadetalleOriginal.setVersionRow(auditoriadetalleAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalles) {
				if(auditoriadetalleAux.getAuditoriaDetalleOriginal().getId().equals(auditoriadetalleOriginal.getId())) {
					existe=true;
					auditoriadetalleOriginal.setId(auditoriadetalleAux.getId());
					auditoriadetalleOriginal.setVersionRow(auditoriadetalleAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAuditoriaDetalle(Boolean esParaCancelar) throws Exception {
		auditoriadetallesAux=new ArrayList<AuditoriaDetalle>();
		auditoriadetalleAux=new AuditoriaDetalle();
		
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
					if(auditoriadetalleAux.getId()<0) {
						auditoriadetallesAux.add(auditoriadetalleAux);
					}		
				}
				this.iIdNuevoAuditoriaDetalle=0L;
				this.auditoriadetalleLogic.getAuditoriaDetalles().removeAll(auditoriadetallesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalles) {
					if(auditoriadetalleAux.getId()<0) {
						auditoriadetallesAux.add(auditoriadetalleAux);
					}		
				}
				this.iIdNuevoAuditoriaDetalle=0L;
				this.auditoriadetalles.removeAll(auditoriadetallesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAuditoriaDetalle 
					&& this.auditoriadetalleLogic.getAuditoriaDetalles().size()>0
					) {
					auditoriadetalleAux=this.auditoriadetalleLogic.getAuditoriaDetalles().get(this.auditoriadetalleLogic.getAuditoriaDetalles().size() - 1);
				
					if(auditoriadetalleAux.getId()<0) {
						this.auditoriadetalleLogic.getAuditoriaDetalles().remove(auditoriadetalleAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAuditoriaDetalle && this.auditoriadetalles.size()>0) {
					auditoriadetalleAux=this.auditoriadetalles.get(this.auditoriadetalles.size() - 1);
				
					if(auditoriadetalleAux.getId()<0) {
						this.auditoriadetalles.remove(auditoriadetalleAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAuditoriaDetalle(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(auditoriadetalle.getId()<0) {
				this.auditoriadetalleLogic.getAuditoriaDetalles().remove(this.auditoriadetalle);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(auditoriadetalle.getId()<0) {
				this.auditoriadetalles.remove(this.auditoriadetalle);
			}
		}			
	}
	
	public void setEstadosInicialesAuditoriaDetalle(List<AuditoriaDetalle> auditoriadetallesAux) throws Exception {
		AuditoriaDetalleConstantesFunciones.setEstadosInicialesAuditoriaDetalle(auditoriadetallesAux);
	}
	
	public void setEstadosInicialesAuditoriaDetalle(AuditoriaDetalle auditoriadetalleAux) throws Exception {
		AuditoriaDetalleConstantesFunciones.setEstadosInicialesAuditoriaDetalle(auditoriadetalleAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAuditoriaDetalleActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAuditoriaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAuditoriaDetalleActual()) {
				if(!this.isEsNuevoAuditoriaDetalle) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAuditoriaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAuditoriaDetalle=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAuditoriaDetalleActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Auditoria Detalle ?", "MANTENIMIENTO DE Auditoria Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAuditoriaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AuditoriaDetalle auditoriadetalle) throws Exception {
		AuditoriaDetalleConstantesFunciones.seleccionarAsignar(this.auditoriadetalle,auditoriadetalle);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAuditoriaDetalle=this.isPermisoActualizarOriginalAuditoriaDetalle;
			
			
			this.seleccionarAsignar(auditoriadetalle);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AuditoriaDetalleConstantesFunciones.quitarEspaciosAuditoriaDetalle(this.auditoriadetalle,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAuditoriaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.auditoriadetalleSessionBean.setsFuncionBusquedaRapida(this.auditoriadetalleSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAuditoriaDetalle) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAuditoriaDetalle(esParaCancelar);				
				this.cancelarNuevoAuditoriaDetalle(esParaCancelar);								
			}
			
			this.auditoriadetalle=new AuditoriaDetalle();
			
			this.inicializarAuditoriaDetalle();
			
			this.actualizarEstadoCeldasBotonesAuditoriaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAuditoriaDetalle() throws Exception {
		try {
			AuditoriaDetalleConstantesFunciones.inicializarAuditoriaDetalle(this.auditoriadetalle);
			
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
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.auditoriadetalleLogic.getAuditoriaDetalles().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAuditoriaDetalles(String sAccionBusqueda,List<AuditoriaDetalle> auditoriadetallesParaReportes) throws Exception {
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
					sPathReporteFinal="AuditoriaDetalle"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AuditoriaDetalleMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AuditoriaDetalleMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AuditoriaDetalle"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Auditoria Detalles");		
		parameters.put("busquedapor", AuditoriaDetalleConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAuditoriaDetalle=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AuditoriaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AuditoriaDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAuditoriaDetalle=new JRBeanArrayDataSource(AuditoriaDetalleJInternalFrame.TraerAuditoriaDetalleBeans(auditoriadetallesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAuditoriaDetalle);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AuditoriaDetalleConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AuditoriaDetalleConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AuditoriaDetalleBean.TraerAuditoriaDetalleBeans(auditoriadetallesParaReportes).toArray()));
							
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
				this.generarExcelReporteAuditoriaDetalles(sAccionBusqueda,sTipoArchivoReporte,auditoriadetallesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAuditoriaDetalles(sAccionBusqueda,sTipoArchivoReporte,auditoriadetallesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAuditoriaDetalleActionPerformed(null);
					//this.generarExcelReporteAuditoriaDetalles(sAccionBusqueda,sTipoArchivoReporte,auditoriadetallesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAuditoriaDetalles(sAccionBusqueda,sTipoArchivoReporte,auditoriadetallesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAuditoriaDetalles(sAccionBusqueda,sTipoArchivoReporte,auditoriadetallesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAuditoriaDetalles(sAccionBusqueda,sTipoArchivoReporte,auditoriadetallesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAuditoriaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<AuditoriaDetalle> auditoriadetallesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoriadetalle";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AuditoriaDetalles");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAuditoriaDetalle("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AuditoriaDetalle auditoriadetalle : auditoriadetallesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AuditoriaDetalleConstantesFunciones.generarExcelReporteDataAuditoriaDetalle("NORMAL",row,workbook,auditoriadetalle,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAuditoriaDetalle(String sTipo,Row row,Workbook workbook) {
		
		AuditoriaDetalleConstantesFunciones.generarExcelReporteHeaderAuditoriaDetalle(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAuditoriaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<AuditoriaDetalle> auditoriadetallesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoriadetalle_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AuditoriaDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AuditoriaDetalle auditoriadetalle : auditoriadetallesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AuditoriaDetalleConstantesFunciones.getAuditoriaDetalleDescripcion(auditoriadetalle));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoriadetalle.getauditoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoriadetalle.getnombre_campo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoriadetalle.getvalor_anterior());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoriadetalle.getvalor_actual());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAuditoriaDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<AuditoriaDetalle> auditoriadetallesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AuditoriaDetalle> auditoriadetallesRespaldo=null;
		
		classes=AuditoriaDetalleConstantesFunciones.getClassesRelationshipsOfAuditoriaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.auditoriadetalleLogic.setDatosCliente(this.datosCliente);
		this.auditoriadetalleLogic.setDatosDeep(this.datosDeep);
		this.auditoriadetalleLogic.setIsConDeep(true);
		
		auditoriadetallesRespaldo=this.auditoriadetalleLogic.getAuditoriaDetalles();
		
		this.auditoriadetalleLogic.setAuditoriaDetalles(auditoriadetallesParaReportes);	
		this.auditoriadetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		auditoriadetallesParaReportes=this.auditoriadetalleLogic.getAuditoriaDetalles();
		this.auditoriadetalleLogic.setAuditoriaDetalles(auditoriadetallesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoriadetalle_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AuditoriaDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAuditoriaDetalle("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AuditoriaDetalle auditoriadetalle : auditoriadetallesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAuditoriaDetalle("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AuditoriaDetalleConstantesFunciones.generarExcelReporteDataAuditoriaDetalle("NORMAL",row,workbook,auditoriadetalle,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AuditoriaDetalleConstantesFunciones.getAuditoriaDetalleDescripcion(auditoriadetalle));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAuditoriaDetalle() throws Exception {		
		this.startProcessAuditoriaDetalle(true);
	}
	
	public void startProcessAuditoriaDetalle(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAuditoriaDetalle ,this.jPanelParametrosReportesAuditoriaDetalle, this.jScrollPanelDatosAuditoriaDetalle,this.jPanelPaginacionAuditoriaDetalle, this.jScrollPanelDatosEdicionAuditoriaDetalle, this.jPanelAccionesAuditoriaDetalle,this.jPanelAccionesFormularioAuditoriaDetalle,this.jmenuBarAuditoriaDetalle,this.jmenuBarDetalleAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,this.jTtoolBarDetalleAuditoriaDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasAuditoriaDetalle=this.jTabbedPaneBusquedasAuditoriaDetalle; 
		
		final JPanel jPanelParametrosReportesAuditoriaDetalle=this.jPanelParametrosReportesAuditoriaDetalle;
		//final JScrollPane jScrollPanelDatosAuditoriaDetalle=this.jScrollPanelDatosAuditoriaDetalle;
		final JTable jTableDatosAuditoriaDetalle=this.jTableDatosAuditoriaDetalle;		
		final JPanel jPanelPaginacionAuditoriaDetalle=this.jPanelPaginacionAuditoriaDetalle;
		//final JScrollPane jScrollPanelDatosEdicionAuditoriaDetalle=this.jScrollPanelDatosEdicionAuditoriaDetalle;
		final JPanel jPanelAccionesAuditoriaDetalle=this.jPanelAccionesAuditoriaDetalle;
		
		JPanel jPanelCamposAuxiliarAuditoriaDetalle=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAuditoriaDetalle=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			jPanelCamposAuxiliarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelCamposAuditoriaDetalle;
			jPanelAccionesFormularioAuxiliarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelAccionesFormularioAuditoriaDetalle;
		}
		
		final JPanel jPanelCamposAuditoriaDetalle=jPanelCamposAuxiliarAuditoriaDetalle;
		final JPanel jPanelAccionesFormularioAuditoriaDetalle=jPanelAccionesFormularioAuxiliarAuditoriaDetalle;
		
		
		final JMenuBar jmenuBarAuditoriaDetalle=this.jmenuBarAuditoriaDetalle;
		final JToolBar jTtoolBarAuditoriaDetalle=this.jTtoolBarAuditoriaDetalle;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAuditoriaDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAuditoriaDetalle=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			jmenuBarDetalleAuxiliarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jmenuBarDetalleAuditoriaDetalle;
			jTtoolBarDetalleAuxiliarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jTtoolBarDetalleAuditoriaDetalle;
		}
		
		final JMenuBar jmenuBarDetalleAuditoriaDetalle=jmenuBarDetalleAuxiliarAuditoriaDetalle;
		final JToolBar jTtoolBarDetalleAuditoriaDetalle=jTtoolBarDetalleAuxiliarAuditoriaDetalle;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAuditoriaDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAuditoriaDetalle;
			processRunnable.jTableDatos=jTableDatosAuditoriaDetalle;
			processRunnable.jPanelCampos=jPanelCamposAuditoriaDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionAuditoriaDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesAuditoriaDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAuditoriaDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarAuditoriaDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAuditoriaDetalle;
			processRunnable.jTtoolBar=jTtoolBarAuditoriaDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAuditoriaDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAuditoriaDetalle ,jPanelParametrosReportesAuditoriaDetalle,jTableDatosAuditoriaDetalle, /*jScrollPanelDatosAuditoriaDetalle,*/jPanelCamposAuditoriaDetalle,jPanelPaginacionAuditoriaDetalle, /*jScrollPanelDatosEdicionAuditoriaDetalle,*/ jPanelAccionesAuditoriaDetalle,jPanelAccionesFormularioAuditoriaDetalle,jmenuBarAuditoriaDetalle,jmenuBarDetalleAuditoriaDetalle,jTtoolBarAuditoriaDetalle,jTtoolBarDetalleAuditoriaDetalle);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAuditoriaDetalle ,jPanelParametrosReportesAuditoriaDetalle, jScrollPanelDatosAuditoriaDetalle,jPanelPaginacionAuditoriaDetalle, jScrollPanelDatosEdicionAuditoriaDetalle, jPanelAccionesAuditoriaDetalle,jPanelAccionesFormularioAuditoriaDetalle,jmenuBarAuditoriaDetalle,jmenuBarDetalleAuditoriaDetalle,jTtoolBarAuditoriaDetalle,jTtoolBarDetalleAuditoriaDetalle);
						
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
	
	public void finishProcessAuditoriaDetalle() {// throws Exception 
		this.finishProcessAuditoriaDetalle(true);
	}
	
	public void finishProcessAuditoriaDetalle(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAuditoriaDetalle ,this.jPanelParametrosReportesAuditoriaDetalle, this.jScrollPanelDatosAuditoriaDetalle,this.jPanelPaginacionAuditoriaDetalle, this.jScrollPanelDatosEdicionAuditoriaDetalle, this.jPanelAccionesAuditoriaDetalle,this.jPanelAccionesFormularioAuditoriaDetalle,this.jmenuBarAuditoriaDetalle,this.jmenuBarDetalleAuditoriaDetalle,this.jTtoolBarAuditoriaDetalle,this.jTtoolBarDetalleAuditoriaDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasAuditoriaDetalle=this.jTabbedPaneBusquedasAuditoriaDetalle; 
		
		final JPanel jPanelParametrosReportesAuditoriaDetalle=this.jPanelParametrosReportesAuditoriaDetalle;
		//final JScrollPane jScrollPanelDatosAuditoriaDetalle=this.jScrollPanelDatosAuditoriaDetalle;
		final JTable jTableDatosAuditoriaDetalle=this.jTableDatosAuditoriaDetalle;		
		final JPanel jPanelPaginacionAuditoriaDetalle=this.jPanelPaginacionAuditoriaDetalle;
		//final JScrollPane jScrollPanelDatosEdicionAuditoriaDetalle=this.jScrollPanelDatosEdicionAuditoriaDetalle;
		final JPanel jPanelAccionesAuditoriaDetalle=this.jPanelAccionesAuditoriaDetalle;
		
		JPanel jPanelCamposAuxiliarAuditoriaDetalle=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAuditoriaDetalle=new JPanel();
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			jPanelCamposAuxiliarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelCamposAuditoriaDetalle;
			jPanelAccionesFormularioAuxiliarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelAccionesFormularioAuditoriaDetalle;
		}
		
		final JPanel jPanelCamposAuditoriaDetalle=jPanelCamposAuxiliarAuditoriaDetalle;
		final JPanel jPanelAccionesFormularioAuditoriaDetalle=jPanelAccionesFormularioAuxiliarAuditoriaDetalle;
		
		
		final JMenuBar jmenuBarAuditoriaDetalle=this.jmenuBarAuditoriaDetalle;		
		final JToolBar jTtoolBarAuditoriaDetalle=this.jTtoolBarAuditoriaDetalle;
				
		JMenuBar jmenuBarDetalleAuxiliarAuditoriaDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAuditoriaDetalle=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			jmenuBarDetalleAuxiliarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jmenuBarDetalleAuditoriaDetalle;
			jTtoolBarDetalleAuxiliarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jTtoolBarDetalleAuditoriaDetalle;		
		}
		
		final JMenuBar jmenuBarDetalleAuditoriaDetalle=jmenuBarDetalleAuxiliarAuditoriaDetalle;
		final JToolBar jTtoolBarDetalleAuditoriaDetalle=jTtoolBarDetalleAuxiliarAuditoriaDetalle;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAuditoriaDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAuditoriaDetalle;
			processRunnable.jTableDatos=jTableDatosAuditoriaDetalle;
			processRunnable.jPanelCampos=jPanelCamposAuditoriaDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionAuditoriaDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesAuditoriaDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAuditoriaDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarAuditoriaDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAuditoriaDetalle;
			processRunnable.jTtoolBar=jTtoolBarAuditoriaDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAuditoriaDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAuditoriaDetalle ,jPanelParametrosReportesAuditoriaDetalle, jTableDatosAuditoriaDetalle,/*jScrollPanelDatosAuditoriaDetalle,*/jPanelCamposAuditoriaDetalle,jPanelPaginacionAuditoriaDetalle, /*jScrollPanelDatosEdicionAuditoriaDetalle,*/ jPanelAccionesAuditoriaDetalle,jPanelAccionesFormularioAuditoriaDetalle,jmenuBarAuditoriaDetalle,jmenuBarDetalleAuditoriaDetalle,jTtoolBarAuditoriaDetalle,jTtoolBarDetalleAuditoriaDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAuditoriaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAuditoriaDetalle(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAuditoriaDetalle(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAuditoriaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAuditoriaDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAuditoriaDetalle,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAuditoriaDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAuditoriaDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAuditoriaDetalle,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.auditoriadetalleConstantesFunciones.getsFinalQueryAuditoriaDetalle();
		String  finalQueryPaginacionTodos=this.auditoriadetalleConstantesFunciones.getsFinalQueryAuditoriaDetalle();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AuditoriaDetalleConstantesFunciones.getArrayColumnasGlobalesNoAuditoriaDetalle(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AuditoriaDetalleConstantesFunciones.getArrayColumnasGlobalesAuditoriaDetalle(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AuditoriaDetalleConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.auditoriadetallesEliminados= new ArrayList<AuditoriaDetalle>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAuditoriaDetalle();
		
				///*AuditoriaDetalleSessionBean*/this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
			
			if(this.auditoriadetalleSessionBean==null) {
				this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
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
					this.iNumeroPaginacion=AuditoriaDetalleConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AuditoriaDetalleConstantesFunciones.getClassesForeignKeysOfAuditoriaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/auditoriadetalle."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			auditoriadetallesAux= new ArrayList<AuditoriaDetalle>();
			
				
			auditoriadetalleLogic.setDatosCliente(this.datosCliente);
			auditoriadetalleLogic.setDatosDeep(this.datosDeep);
			auditoriadetalleLogic.setIsConDeep(true);
			
			
			auditoriadetalleLogic.getAuditoriaDetalleDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					auditoriadetalleLogic.getTodosAuditoriaDetalles(finalQueryGlobal,pagination);
					
					//auditoriadetalleLogic.getTodosAuditoriaDetallesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(auditoriadetalleLogic.getAuditoriaDetalles()==null|| auditoriadetalleLogic.getAuditoriaDetalles().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							auditoriadetallesAux= new ArrayList<AuditoriaDetalle>();
							auditoriadetallesAux.addAll(auditoriadetalleLogic.getAuditoriaDetalles());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriadetallesAux= new ArrayList<AuditoriaDetalle>();
							auditoriadetallesAux.addAll(auditoriadetalles);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							auditoriadetalleLogic.getTodosAuditoriaDetalles(finalQueryGlobal+"",this.pagination);												
							
							//auditoriadetalleLogic.getTodosAuditoriaDetallesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAuditoriaDetalles("Todos",auditoriadetalleLogic.getAuditoriaDetalles() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							auditoriadetalleLogic.setAuditoriaDetalles(new ArrayList<AuditoriaDetalle>());					
							auditoriadetalleLogic.getAuditoriaDetalles().addAll(auditoriadetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriadetalles=new ArrayList<AuditoriaDetalle>();
							auditoriadetalles.addAll(auditoriadetallesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAuditoriaDetalle=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAuditoriaDetalle=this.idActual;
				
				} else if(this.idAuditoriaDetalleActual!=null && this.idAuditoriaDetalleActual!=0L) {
					idAuditoriaDetalle=idAuditoriaDetalleActual;
				}
				
					
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndicePorId(idAuditoriaDetalle);
				
				this.auditoriadetalles=new ArrayList<AuditoriaDetalle>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					auditoriadetalleLogic.getEntity(idAuditoriaDetalle);
					
					//auditoriadetalleLogic.getEntityWithConnection(idAuditoriaDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriadetalleLogic.setAuditoriaDetalles(new ArrayList<AuditoriaDetalle>());
					auditoriadetalleLogic.getAuditoriaDetalles().add(auditoriadetalleLogic.getAuditoriaDetalle());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.auditoriadetalles=new ArrayList<AuditoriaDetalle>();
					this.auditoriadetalles.add(auditoriadetalle);
				}
				
				if(auditoriadetalleLogic.getAuditoriaDetalle()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdAuditoriaPorNombreCampo")) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceBusquedaPorIdAuditoriaPorNombreCampo(id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo,nombre_campoBusquedaPorIdAuditoriaPorNombreCampo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriadetalleLogic.getAuditoriaDetallesBusquedaPorIdAuditoriaPorNombreCampo(finalQueryGlobal,pagination,id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo,nombre_campoBusquedaPorIdAuditoriaPorNombreCampo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceBusquedaPorIdAuditoriaPorNombreCampo(id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo,nombre_campoBusquedaPorIdAuditoriaPorNombreCampo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceBusquedaPorIdAuditoriaPorNombreCampo(id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo,nombre_campoBusquedaPorIdAuditoriaPorNombreCampo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriadetalleLogic.getAuditoriaDetalles()==null||auditoriadetalleLogic.getAuditoriaDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditoriadetalles==null|| auditoriadetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetallesAux=new ArrayList<AuditoriaDetalle>();
						auditoriadetallesAux.addAll(auditoriadetalleLogic.getAuditoriaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriadetallesAux=new ArrayList<AuditoriaDetalle>();
							auditoriadetallesAux.addAll(auditoriadetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriadetalleLogic.getAuditoriaDetallesBusquedaPorIdAuditoriaPorNombreCampo(finalQueryGlobal,pagination,id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo,nombre_campoBusquedaPorIdAuditoriaPorNombreCampo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceBusquedaPorIdAuditoriaPorNombreCampo(id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo,nombre_campoBusquedaPorIdAuditoriaPorNombreCampo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceBusquedaPorIdAuditoriaPorNombreCampo(id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo,nombre_campoBusquedaPorIdAuditoriaPorNombreCampo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditoriaDetalles("BusquedaPorIdAuditoriaPorNombreCampo",auditoriadetalleLogic.getAuditoriaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditoriaDetalles("BusquedaPorIdAuditoriaPorNombreCampo",auditoriadetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetalleLogic.setAuditoriaDetalles(new ArrayList<AuditoriaDetalle>());
						auditoriadetalleLogic.getAuditoriaDetalles().addAll(auditoriadetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriadetalles=new ArrayList<AuditoriaDetalle>();
							auditoriadetalles.addAll(auditoriadetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdAuditoria")) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceFK_IdAuditoria(id_auditoriaFK_IdAuditoria);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriadetalleLogic.getAuditoriaDetallesFK_IdAuditoria(finalQueryGlobal,pagination,id_auditoriaFK_IdAuditoria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceFK_IdAuditoria(id_auditoriaFK_IdAuditoria);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceFK_IdAuditoria(id_auditoriaFK_IdAuditoria);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriadetalleLogic.getAuditoriaDetalles()==null||auditoriadetalleLogic.getAuditoriaDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditoriadetalles==null|| auditoriadetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetallesAux=new ArrayList<AuditoriaDetalle>();
						auditoriadetallesAux.addAll(auditoriadetalleLogic.getAuditoriaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriadetallesAux=new ArrayList<AuditoriaDetalle>();
							auditoriadetallesAux.addAll(auditoriadetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriadetalleLogic.getAuditoriaDetallesFK_IdAuditoria(finalQueryGlobal,pagination,id_auditoriaFK_IdAuditoria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceFK_IdAuditoria(id_auditoriaFK_IdAuditoria);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaDetalleConstantesFunciones.getDetalleIndiceFK_IdAuditoria(id_auditoriaFK_IdAuditoria);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditoriaDetalles("FK_IdAuditoria",auditoriadetalleLogic.getAuditoriaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditoriaDetalles("FK_IdAuditoria",auditoriadetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetalleLogic.setAuditoriaDetalles(new ArrayList<AuditoriaDetalle>());
						auditoriadetalleLogic.getAuditoriaDetalles().addAll(auditoriadetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriadetalles=new ArrayList<AuditoriaDetalle>();
							auditoriadetalles.addAll(auditoriadetallesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAuditoriaDetalle();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAuditoriaDetalle();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=auditoriadetalleLogic.getAuditoriaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=auditoriadetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=auditoriadetalleLogic.getAuditoriaDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=auditoriadetalles.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AuditoriaDetalle auditoriadetalle) {
		Boolean permite=true;
		
		if(this.auditoriadetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AuditoriaDetalleConstantesFunciones.getOrderByListaAuditoriaDetalle();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AuditoriaDetalleConstantesFunciones.getOrderByListaAuditoriaDetalle();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AuditoriaDetalle auditoriadetalle:auditoriadetalleLogic.getAuditoriaDetalles()) {
				if(auditoriadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriadetalleTotales=auditoriadetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AuditoriaDetalle auditoriadetalle:this.auditoriadetalles) {
				if(auditoriadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriadetalleTotales=auditoriadetalle;
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
			this.auditoriadetalleAux=new AuditoriaDetalle();
			this.auditoriadetalleAux.setsType(Constantes2.S_TOTALES);
			this.auditoriadetalleAux.setIsNew(false);
			this.auditoriadetalleAux.setIsChanged(false);
			this.auditoriadetalleAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AuditoriaDetalleConstantesFunciones.TotalizarValoresFilaAuditoriaDetalle(this.auditoriadetalleLogic.getAuditoriaDetalles(),this.auditoriadetalleAux);
				
				this.auditoriadetalleLogic.getAuditoriaDetalles().add(this.auditoriadetalleAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AuditoriaDetalleConstantesFunciones.TotalizarValoresFilaAuditoriaDetalle(this.auditoriadetalles,this.auditoriadetalleAux);
				
				this.auditoriadetalles.add(this.auditoriadetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		auditoriadetalleTotales=new AuditoriaDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.auditoriadetalleLogic.getAuditoriaDetalles().remove(auditoriadetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.auditoriadetalles.remove(auditoriadetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		auditoriadetalleTotales=new AuditoriaDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AuditoriaDetalle auditoriadetalle:auditoriadetalleLogic.getAuditoriaDetalles()) {
				if(auditoriadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriadetalleTotales=auditoriadetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AuditoriaDetalleConstantesFunciones.TotalizarValoresFilaAuditoriaDetalle(this.auditoriadetalleLogic.getAuditoriaDetalles(),auditoriadetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AuditoriaDetalle auditoriadetalle:this.auditoriadetalles) {
				if(auditoriadetalle.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriadetalleTotales=auditoriadetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AuditoriaDetalleConstantesFunciones.TotalizarValoresFilaAuditoriaDetalle(this.auditoriadetalles,auditoriadetalleTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAuditoriaDetallesBusquedaPorIdAuditoriaPorNombreCampo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdAuditoriaPorNombreCampo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriaDetallesFK_IdAuditoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdAuditoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAuditoriaDetallesBusquedaPorIdAuditoriaPorNombreCampo(String sFinalQuery,Long id_auditoria,String nombre_campo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriadetalleLogic.getAuditoriaDetallesBusquedaPorIdAuditoriaPorNombreCampo(sFinalQuery,this.pagination,id_auditoria,nombre_campo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriaDetallesFK_IdAuditoria(String sFinalQuery,Long id_auditoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriadetalleLogic.getAuditoriaDetallesFK_IdAuditoria(sFinalQuery,this.pagination,id_auditoria);
				
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
	
	public void inicializarPermisosAuditoriaDetalle() {
		this.isPermisoTodoAuditoriaDetalle=false;
		this.isPermisoNuevoAuditoriaDetalle=false;
		this.isPermisoActualizarAuditoriaDetalle=false;
		this.isPermisoActualizarOriginalAuditoriaDetalle=false;
		this.isPermisoEliminarAuditoriaDetalle=false;
		this.isPermisoGuardarCambiosAuditoriaDetalle=false;
		this.isPermisoConsultaAuditoriaDetalle=false;
		this.isPermisoBusquedaAuditoriaDetalle=false;
		this.isPermisoReporteAuditoriaDetalle=false;		
		this.isPermisoOrdenAuditoriaDetalle=false;		
		this.isPermisoPaginacionMedioAuditoriaDetalle=false;		
		this.isPermisoPaginacionAltoAuditoriaDetalle=false;
		this.isPermisoPaginacionTodoAuditoriaDetalle=false;
		this.isPermisoCopiarAuditoriaDetalle=false;		
		this.isPermisoVerFormAuditoriaDetalle=false;		
		this.isPermisoDuplicarAuditoriaDetalle=false;		
		this.isPermisoOrdenAuditoriaDetalle=false;		
	}
	
	public void setPermisosUsuarioAuditoriaDetalle(Boolean isPermiso) {
		this.isPermisoTodoAuditoriaDetalle=isPermiso;
		this.isPermisoNuevoAuditoriaDetalle=isPermiso;
		this.isPermisoActualizarAuditoriaDetalle=isPermiso;
		this.isPermisoActualizarOriginalAuditoriaDetalle=isPermiso;
		this.isPermisoEliminarAuditoriaDetalle=isPermiso;
		this.isPermisoGuardarCambiosAuditoriaDetalle=isPermiso;
		this.isPermisoConsultaAuditoriaDetalle=isPermiso;
		this.isPermisoBusquedaAuditoriaDetalle=isPermiso;
		this.isPermisoReporteAuditoriaDetalle=isPermiso;
		this.isPermisoOrdenAuditoriaDetalle=isPermiso;		
		this.isPermisoPaginacionMedioAuditoriaDetalle=isPermiso;		
		this.isPermisoPaginacionAltoAuditoriaDetalle=isPermiso;		
		this.isPermisoPaginacionTodoAuditoriaDetalle=isPermiso;		
		this.isPermisoCopiarAuditoriaDetalle=isPermiso;		
		this.isPermisoVerFormAuditoriaDetalle=isPermiso;		
		this.isPermisoDuplicarAuditoriaDetalle=isPermiso;
		this.isPermisoOrdenAuditoriaDetalle=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAuditoriaDetalle(Boolean isPermiso) {
		//this.isPermisoTodoAuditoriaDetalle=isPermiso;
		this.isPermisoNuevoAuditoriaDetalle=isPermiso;
		this.isPermisoActualizarAuditoriaDetalle=isPermiso;
		this.isPermisoActualizarOriginalAuditoriaDetalle=isPermiso;
		this.isPermisoEliminarAuditoriaDetalle=isPermiso;
		this.isPermisoGuardarCambiosAuditoriaDetalle=isPermiso;
		//this.isPermisoConsultaAuditoriaDetalle=isPermiso;
		//this.isPermisoBusquedaAuditoriaDetalle=isPermiso;
		//this.isPermisoReporteAuditoriaDetalle=isPermiso;
		//this.isPermisoOrdenAuditoriaDetalle=isPermiso;		
		//this.isPermisoPaginacionMedioAuditoriaDetalle=isPermiso;		
		//this.isPermisoPaginacionAltoAuditoriaDetalle=isPermiso;		
		//this.isPermisoPaginacionTodoAuditoriaDetalle=isPermiso;		
		//this.isPermisoCopiarAuditoriaDetalle=isPermiso;		
		//this.isPermisoDuplicarAuditoriaDetalle=isPermiso;
		//this.isPermisoOrdenAuditoriaDetalle=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAuditoriaDetalleClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AuditoriaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAuditoriaDetalle(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAuditoriaDetalleClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAuditoriaDetalleClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAuditoriaDetalleClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAuditoriaDetalleClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAuditoriaDetalle() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AuditoriaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AuditoriaDetalleConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAuditoriaDetalle=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAuditoriaDetalle=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAuditoriaDetalle=this.isPermisoActualizarAuditoriaDetalle;
			this.isPermisoEliminarAuditoriaDetalle=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAuditoriaDetalle=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAuditoriaDetalle=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAuditoriaDetalle=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAuditoriaDetalle=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAuditoriaDetalle=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAuditoriaDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAuditoriaDetalle=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAuditoriaDetalle=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAuditoriaDetalle=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAuditoriaDetalle=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAuditoriaDetalle=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAuditoriaDetalle=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAuditoriaDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAuditoriaDetalle.setToolTipText(this.jTableDatosAuditoriaDetalle.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAuditoriaDetalle(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAuditoriaDetalle(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AuditoriaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AuditoriaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAuditoriaDetalle() throws Exception {
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
	public void inicializarCombosForeignKeyAuditoriaDetalleListas()throws Exception {
		try	{						
			
				this.auditoriasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAuditoriaDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AuditoriaDetalleJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAuditoriaDetalleListas(false);
			} else {
			
				this.cargarCombosForeignKeyAuditoriaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyAuditoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.auditoriasForeignKey==null||this.auditoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AuditoriaConstantesFunciones.getArrayColumnasGlobalesAuditoria(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AuditoriaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AuditoriaConstantesFunciones.SFINALQUERY;

				this.cargarCombosAuditoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAuditoriaDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AuditoriaDetalleParameterReturnGeneral auditoriadetalleReturnGeneral=new AuditoriaDetalleParameterReturnGeneral();
						
			


				String finalQueryGlobalAuditoria="";

				if(((this.auditoriasForeignKey==null||this.auditoriasForeignKey.size()<=0) && this.auditoriadetalleConstantesFunciones.cargarid_auditoriaAuditoriaDetalle)
					 || (this.esRecargarFks && this.auditoriadetalleConstantesFunciones.cargarid_auditoriaAuditoriaDetalle)) {

					if(!this.auditoriadetalleSessionBean.getisBusquedaDesdeForeignKeySesionAuditoria()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AuditoriaConstantesFunciones.getArrayColumnasGlobalesAuditoria(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAuditoria=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AuditoriaConstantesFunciones.TABLENAME);

						finalQueryGlobalAuditoria=Funciones.GetFinalQueryAppend(finalQueryGlobalAuditoria, "");
						finalQueryGlobalAuditoria+=AuditoriaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAuditoriasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAuditoria=" WHERE " + ConstantesSql.ID + "="+auditoriadetalleSessionBean.getlidAuditoriaActual();
					}
				} else {
					finalQueryGlobalAuditoria="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				auditoriadetalleReturnGeneral=auditoriadetalleLogic.cargarCombosLoteForeignKeyAuditoriaDetalle(finalQueryGlobalAuditoria);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalAuditoria.equals("NONE")) {
				this.auditoriasForeignKey=auditoriadetalleReturnGeneral.getauditoriasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAuditoriaDetalle()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAuditoria();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAuditoria()throws Exception {
		try {
			if(this.auditoriadetalleSessionBean==null) {
				this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
			}

			if(!this.auditoriadetalleSessionBean.getisBusquedaDesdeForeignKeySesionAuditoria()) {
				Auditoria auditoria=new Auditoria();
				AuditoriaConstantesFunciones.setAuditoriaDescripcion(auditoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				auditoria.setId(null);

				if(!AuditoriaConstantesFunciones.ExisteEnLista(this.auditoriasForeignKey,auditoria,true)) {

					this.auditoriasForeignKey.add(0,auditoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAuditoriaDetalle()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAuditoriaDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAuditoriaDetalle()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAuditoriaDetalle();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAuditoriaDetalle(AuditoriaDetalle auditoriadetalle)throws Exception {	
		try {
			
			this.setActualAuditoriaForeignKey(auditoriadetalle.getid_auditoria(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAuditoriaDetalle()throws Exception {	
		try {
			
			this.setActualAuditoriaForeignKey(this.auditoriadetalleConstantesFunciones.getid_auditoria(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAuditoriaDetalle()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAuditoriaDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAuditoriaDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAuditoriaDetalle()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAuditoriaDetalle()throws Exception {
		try {
			

			this.cargarCombosFrameAuditoriasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAuditoriaDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAuditoriasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAuditoriaDetalle()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle!=null && this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public AuditoriaDetalleBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AuditoriaDetalleBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AuditoriaDetalleBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean(); 
		this.auditoriadetalleConstantesFunciones=new AuditoriaDetalleConstantesFunciones(); 
		this.auditoriadetalleBean=new AuditoriaDetalle();//(this.auditoriadetalleConstantesFunciones); 		
		this.auditoriadetalleReturnGeneral=new AuditoriaDetalleParameterReturnGeneral(); 
		
		this.auditoriadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.auditoriadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AuditoriaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AuditoriaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AuditoriaDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAuditoriaDetalle(true);
			
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
			
			this.auditoriadetalleConstantesFunciones=new AuditoriaDetalleConstantesFunciones(); 
			this.auditoriadetalleBean=new AuditoriaDetalle();//this.auditoriadetalleConstantesFunciones); 			
			this.auditoriadetalleReturnGeneral=new AuditoriaDetalleParameterReturnGeneral(); 
		
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Auditoria Detalle Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.auditoriadetalle=new AuditoriaDetalle();
			this.auditoriadetalles = new ArrayList<AuditoriaDetalle>();
			this.auditoriadetallesAux = new ArrayList<AuditoriaDetalle>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic=new AuditoriaDetalleLogic();
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.auditoriadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.auditoriadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAuditoriaDetalle);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAuditoriaDetalle);	
					}
					
					if(this.jInternalFrameImportacionAuditoriaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAuditoriaDetalle);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAuditoriaDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAuditoriaDetalle);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAuditoriaDetalle);
				this.jInternalFrameDetalleFormAuditoriaDetalle.setVisible(false);
				this.jInternalFrameDetalleFormAuditoriaDetalle.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAuditoriaDetalle);
					this.jInternalFrameReporteDinamicoAuditoriaDetalle.setVisible(false);
					this.jInternalFrameReporteDinamicoAuditoriaDetalle.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAuditoriaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAuditoriaDetalle);
					this.jInternalFrameImportacionAuditoriaDetalle.setVisible(false);
					this.jInternalFrameImportacionAuditoriaDetalle.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAuditoriaDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAuditoriaDetalle);
					this.jInternalFrameOrderByAuditoriaDetalle.setVisible(false);
					this.jInternalFrameOrderByAuditoriaDetalle.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAuditoriaDetalleActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AuditoriaDetalleConstantesFunciones.INUMEROPAGINACION;
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
			
			this.auditoriadetalleReturnGeneral=new AuditoriaDetalleParameterReturnGeneral();
			
			this.auditoriadetalleParameterGeneral=new AuditoriaDetalleParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.auditoriadetalleLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AuditoriaDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AuditoriaDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.auditoriadetalleSessionBean.getEsGuardarRelacionado(),this.auditoriadetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AuditoriaDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.auditoriadetalleSessionBean.getEsGuardarRelacionado(),this.auditoriadetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=false;
			this.isVisibilidadCeldaDuplicarAuditoriaDetalle=true;
			this.isVisibilidadCeldaCopiarAuditoriaDetalle=true;
			this.isVisibilidadCeldaVerFormAuditoriaDetalle=true;
			this.isVisibilidadCeldaOrdenAuditoriaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
			this.isVisibilidadCeldaModificarAuditoriaDetalle=false;
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=false;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=false;
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=false;
			this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=false;
			
			
			this.isVisibilidadBusquedaPorIdAuditoriaPorNombreCampo=true;
			this.isVisibilidadFK_IdAuditoria=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAuditoriaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAuditoriaDetalle();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAuditoriaDetalle(false);
			
			this.setPermisosUsuarioAuditoriaDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado() 
				|| (this.auditoriadetalleSessionBean.getEsGuardarRelacionado() && this.auditoriadetalleSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAuditoriaDetalleClasesRelacionadas();
			}
			
			if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAuditoriaDetalleClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAuditoriaDetalle();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAuditoriaDetalle();
			}
			
			if(!this.isPermisoBusquedaAuditoriaDetalle) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAuditoriaDetalle,this.isPermisoPaginacionMedioAuditoriaDetalle,this.isPermisoPaginacionTodoAuditoriaDetalle);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AuditoriaDetalleConstantesFunciones.getTiposSeleccionarAuditoriaDetalle());
				
				this.tiposColumnasSelect=AuditoriaDetalleConstantesFunciones.getTiposSeleccionarAuditoriaDetalle(true);
				
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
			//if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAuditoriaDetalle();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAuditoriaDetalle(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAuditoriaDetalle(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAuditoriaDetalle() ;
			
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
			
			this.auditoriaLogic=new AuditoriaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				auditoriadetalleImplementable= (AuditoriaDetalleImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AuditoriaDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				auditoriadetalleImplementableHome= (AuditoriaDetalleImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AuditoriaDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.auditoriadetalles= new ArrayList<AuditoriaDetalle>();
			this.auditoriadetallesEliminados= new ArrayList<AuditoriaDetalle>();
						
			this.isEsNuevoAuditoriaDetalle=false;
			this.esParaAccionDesdeFormularioAuditoriaDetalle=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.auditoriasForeignKey=new ArrayList<Auditoria>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAuditoriaDetalle(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAuditoriaDetalle();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AuditoriaDetalleConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAuditoriaDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAuditoriaDetalle(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAuditoriaDetalle();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAuditoriaDetalle();
			}
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAuditoriaDetalle.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAuditoriaDetalle.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAuditoriaDetalle.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAuditoriaDetalle(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AuditoriaDetalle: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAuditoriaDetalle() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAuditoriaDetalle")) {
				iIndex=this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAuditoriaDetalle();	
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
	
	public void cargarCombosForeignKeyAuditoriaDetalle(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAuditoriaDetalle(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAuditoriaDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAuditoriaDetalleListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAuditoriaDetalle();
		
		this.cargarCombosFrameForeignKeyAuditoriaDetalle();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAuditoriaDetalle();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAuditoriaDetalle();
		}
	}
	
	

	public void cargarCombosForeignKeyAuditoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAuditoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAuditoria();
				this.cargarCombosFrameAuditoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAuditoria(this.auditoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAuditoriaDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
			
			if(jTableDatosAuditoriaDetalle.getRowCount()>=1) {
				jTableDatosAuditoriaDetalle.removeRowSelectionInterval(0, jTableDatosAuditoriaDetalle.getRowCount()-1);						
			}
			
			this.isEsNuevoAuditoriaDetalle=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAuditoriaDetalle(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAuditoriaDetalle(true);			
			//this.auditoriadetalle=new AuditoriaDetalle();
			//this.auditoriadetalle.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAuditoriaDetalle(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAuditoriaDetalle() ;
			
			if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAuditoriaDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.auditoriadetalle);	
			this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);				
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
			if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AuditoriaDetalle: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAuditoriaDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAuditoriaDetalle.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAuditoriaDetalle.getSelectedRows().length;			
			}
			
			auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAuditoriaDetalle--;			
				//AuditoriaDetalle auditoriadetalleAux= new AuditoriaDetalle();			
				//auditoriadetalleAux.setId(this.iIdNuevoAuditoriaDetalle);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AuditoriaDetalle auditoriadetalleOrigen=new AuditoriaDetalle();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AuditoriaDetalle auditoriadetalleOrigen : auditoriadetallesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							auditoriadetalleOrigen =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriadetalleOrigen =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAuditoriaDetalle();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.auditoriadetalle.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAuditoriaDetalle(auditoriadetalleOrigen,this.auditoriadetalle,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.auditoriadetalleLogic.getAuditoriaDetalles().add(this.auditoriadetalleAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.auditoriadetalles.add(this.auditoriadetalleAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
				
				this.jTableDatosAuditoriaDetalle.setRowSelectionInterval(this.getIndiceNuevoAuditoriaDetalle(), this.getIndiceNuevoAuditoriaDetalle());
				
				int iLastRow =  this.jTableDatosAuditoriaDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAuditoriaDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAuditoriaDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();									
		
			AuditoriaDetalle auditoriadetalleOrigen=new AuditoriaDetalle();
			AuditoriaDetalle auditoriadetalleDestino=new AuditoriaDetalle();
				
			auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAuditoriaDetalle.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || auditoriadetallesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAuditoriaDetalle.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetalleOrigen =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						auditoriadetalleOrigen =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriadetalleDestino =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						auditoriadetalleDestino =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				auditoriadetalleOrigen =auditoriadetallesSeleccionados.get(0);
				auditoriadetalleDestino =auditoriadetallesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAuditoriaDetalle(auditoriadetalleOrigen,auditoriadetalleDestino,true,false);
				
				auditoriadetalleDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(auditoriadetalleDestino,auditoriadetalleLogic.getAuditoriaDetalles());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(auditoriadetalleDestino,auditoriadetalles);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
				
				//this.jTableDatosAuditoriaDetalle.setRowSelectionInterval(this.getIndiceNuevoAuditoriaDetalle(), this.getIndiceNuevoAuditoriaDetalle());
				
				int iLastRow =  this.jTableDatosAuditoriaDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAuditoriaDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAuditoriaDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAuditoriaDetalle.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAuditoriaDetalle.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAuditoriaDetalle.setVisible(!isVisible);
			this.jPanelPaginacionAuditoriaDetalle.setVisible(!isVisible);
			this.jPanelAccionesAuditoriaDetalle.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAuditoriaDetalle();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAuditoriaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAuditoriaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAuditoriaDetalle();
			
			this.abrirFrameOrderByAuditoriaDetalle();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAuditoriaDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAuditoriaDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAuditoriaDetalle);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAuditoriaDetalle.isMaximum()) {
					this.jInternalFrameDetalleFormAuditoriaDetalle.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAuditoriaDetalle.setSize(this.jInternalFrameDetalleFormAuditoriaDetalle.iWidthFormulario,this.jInternalFrameDetalleFormAuditoriaDetalle.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAuditoriaDetalle.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAuditoriaDetalle.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAuditoriaDetalle.isMaximum()) {
						this.jInternalFrameDetalleFormAuditoriaDetalle.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAuditoriaDetalle.jContentPaneDetalleAuditoriaDetalle.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAuditoriaDetalle.jContentPaneDetalleAuditoriaDetalle.getWidth(),AuditoriaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAuditoriaDetalle.jContentPaneDetalleAuditoriaDetalle.getWidth(),AuditoriaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAuditoriaDetalle.jContentPaneDetalleAuditoriaDetalle.getWidth(),AuditoriaDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAuditoriaDetalle.setVisible(true);
	        this.jInternalFrameDetalleFormAuditoriaDetalle.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAuditoriaDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAuditoriaDetalle==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAuditoriaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoriaDetalle,false,this);
				} else {
					this.jInternalFrameOrderByAuditoriaDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoriaDetalle,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAuditoriaDetalle);
				this.jInternalFrameOrderByAuditoriaDetalle.setVisible(false);
				this.jInternalFrameOrderByAuditoriaDetalle.setSelected(false);
				
				this.jInternalFrameOrderByAuditoriaDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAuditoriaDetalle"));
				
				this.inicializarActualizarBindingTablaOrderByAuditoriaDetalle();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAuditoriaDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAuditoriaDetalle==null) {
				
				this.jInternalFrameImportacionAuditoriaDetalle=new ImportacionJInternalFrame(AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAuditoriaDetalle);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAuditoriaDetalle);
				this.jInternalFrameImportacionAuditoriaDetalle.setVisible(false);
				this.jInternalFrameImportacionAuditoriaDetalle.setSelected(false);


				this.jInternalFrameImportacionAuditoriaDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAuditoriaDetalle"));
				this.jInternalFrameImportacionAuditoriaDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAuditoriaDetalle"));
				this.jInternalFrameImportacionAuditoriaDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAuditoriaDetalle"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAuditoriaDetalle() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAuditoriaDetalle==null) {
				this.jInternalFrameReporteDinamicoAuditoriaDetalle=new ReporteDinamicoJInternalFrame(AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAuditoriaDetalle);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAuditoriaDetalle);
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.setVisible(false);
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAuditoriaDetalle"));
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAuditoriaDetalle"));
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAuditoriaDetalle"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAuditoriaDetalle();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAuditoriaDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAuditoriaDetalle);
			
	       	this.jInternalFrameDetalleFormAuditoriaDetalle.setVisible(false);
	        this.jInternalFrameDetalleFormAuditoriaDetalle.setSelected(false);
			
			//this.jInternalFrameDetalleFormAuditoriaDetalle.dispose();
			//this.jInternalFrameDetalleFormAuditoriaDetalle=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAuditoriaDetalle() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAuditoriaDetalle.setVisible(true);
	        this.jInternalFrameReporteDinamicoAuditoriaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAuditoriaDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAuditoriaDetalle.setVisible(true);
	        this.jInternalFrameImportacionAuditoriaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAuditoriaDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAuditoriaDetalle.setVisible(true);
	        this.jInternalFrameOrderByAuditoriaDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAuditoriaDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAuditoriaDetalle.setVisible(false);
	        this.jInternalFrameOrderByAuditoriaDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAuditoriaDetalle() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAuditoriaDetalle.setVisible(false);
	        this.jInternalFrameReporteDinamicoAuditoriaDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAuditoriaDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAuditoriaDetalle.setVisible(false);
	        this.jInternalFrameImportacionAuditoriaDetalle.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAuditoriaDetalle(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAuditoriaDetalle(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAuditoriaDetalle(true);
			//this.isEsNuevoAuditoriaDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAuditoriaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAuditoriaDetalle(false) ;
			
			if(auditoriadetalleSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAuditoriaDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAuditoriaDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAuditoriaDetalleActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAuditoriaDetalle(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAuditoriaDetalle(true);
			//this.isEsNuevoAuditoriaDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.auditoriadetalle.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAuditoriaDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAuditoriaDetalle(false) ;
			
			if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAuditoriaDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAuditoriaDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAuditoria(List<Auditoria> auditoriasForeignKey)throws Exception{
		TableColumn tableColumnAuditoria=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA));
		TableCellEditor tableCellEditorAuditoria =tableColumnAuditoria.getCellEditor();

		AuditoriaTableCell auditoriaTableCellFk=(AuditoriaTableCell)tableCellEditorAuditoria;

		if(auditoriaTableCellFk!=null) {
			auditoriaTableCellFk.setauditoriasForeignKey(auditoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAuditoriaDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//auditoriaTableCellFk.setRowActual(intSelectedRow);
			//auditoriaTableCellFk.setauditoriasForeignKeyActual(auditoriasForeignKey);
		//}


		if(auditoriaTableCellFk!=null) {
			auditoriaTableCellFk.RecargarAuditoriasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAuditoriaDetalle(false);
			
			//if(!this.isEsNuevoAuditoriaDetalle) {								
				int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
				
			}
			
			if(this.permiteMantenimiento(this.auditoriadetalle)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAuditoriaDetalle=true;
					this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
					this.isEsNuevoAuditoriaDetalle=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAuditoriaDetalle=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAuditoriaDetalle=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAuditoriaDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAuditoriaDetalle(false);
				
				this.habilitarDeshabilitarControlesAuditoriaDetalle(false);
			
												
				
				if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAuditoriaDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAuditoriaDetalleActionPerformed(evt,auditoriadetalleSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAuditoriaDetalle(this.auditoriadetalle,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAuditoriaDetalle.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,auditoriadetalleSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.auditoriadetalle.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				this.auditoriadetalle.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				this.auditoriadetalle.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.auditoriadetalle)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AuditoriaDetalleModel) this.jTableDatosAuditoriaDetalle.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAuditoriaDetalle=true;
				this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
				this.isEsNuevoAuditoriaDetalle=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAuditoriaDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAuditoriaDetalle(false);
				
				this.habilitarDeshabilitarControlesAuditoriaDetalle(false);
				
				
				
				if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAuditoriaDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAuditoriaDetalle.getRowCount()>=1) {
				jTableDatosAuditoriaDetalle.removeRowSelectionInterval(0, jTableDatosAuditoriaDetalle.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAuditoriaDetalle(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAuditoriaDetalle(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAuditoriaDetalle(false) ;
			
			this.isEsNuevoAuditoriaDetalle=false;
			
			if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAuditoriaDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAuditoriaDetalle(false);
				
				//SI ES MANUAL
				if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAuditoriaDetalle();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAuditoriaDetalle--;			
			//AuditoriaDetalle auditoriadetalleAux= new AuditoriaDetalle();			
			//auditoriadetalleAux.setId(this.iIdNuevoAuditoriaDetalle);
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAuditoriaDetalle();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
			
			this.auditoriadetalle.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.auditoriadetalleLogic.getAuditoriaDetalles().add(this.auditoriadetalleAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.auditoriadetalles.add(this.auditoriadetalleAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
			
			this.jTableDatosAuditoriaDetalle.setRowSelectionInterval(this.getIndiceNuevoAuditoriaDetalle(), this.getIndiceNuevoAuditoriaDetalle());
			
			int iLastRow =  this.jTableDatosAuditoriaDetalle.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAuditoriaDetalle.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAuditoriaDetalle.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAuditoriaDetalle(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAuditoriaDetalle(false);
			
			//SI ES MANUAL
			if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAuditoriaDetalle();
			}
			
			//this.abrirFrameTreeAuditoriaDetalle();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Auditoria DetalleS ?", "MANTENIMIENTO DE Auditoria Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAuditoriaDetalle.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAuditoriaDetalle();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.auditoriadetalleReturnGeneral=auditoriadetalleLogic.procesarImportacionAuditoriaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.auditoriadetalleParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAuditoriaDetalleReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAuditoriaDetalle.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAuditoriaDetalle.setFileImportacion(this.jInternalFrameImportacionAuditoriaDetalle.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAuditoriaDetalle.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAuditoriaDetalle.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAuditoriaDetalle.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAuditoriaDetalle.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		

		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AuditoriaDetalleBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AuditoriaDetalleBaseDesign.jrxml";
			
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
			
			this.generarReporteAuditoriaDetalles("Todos",auditoriadetallesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Auditoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Auditoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Auditoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Auditoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCampo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCampo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCampo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCampo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAnterior_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAnterior_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAnterior_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAnterior_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorActual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorActual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorActual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorActual_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA:
					sNombreCampoCategoria="id_auditoria";
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO:
					sNombreCampoCategoria="nombre_campo";
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR:
					sNombreCampoCategoria="valor_anterior";
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL:
					sNombreCampoCategoria="valor_actual";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA:
					sNombreCampoCategoriaValor="id_auditoria";
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO:
					sNombreCampoCategoriaValor="nombre_campo";
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR:
					sNombreCampoCategoriaValor="valor_anterior";
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL:
					sNombreCampoCategoriaValor="valor_actual";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Auditoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_auditoria");
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Del Campo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_campo");
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Anterior",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_anterior");
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Actual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_actual");
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
	
	public void jButtonGenerarExcelReporteDinamicoAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoriadetalle";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AuditoriaDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA);
					iRow++;

					for(AuditoriaDetalle auditoriadetalle:auditoriadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoriadetalle.getauditoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO);
					iRow++;

					for(AuditoriaDetalle auditoriadetalle:auditoriadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoriadetalle.getnombre_campo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR);
					iRow++;

					for(AuditoriaDetalle auditoriadetalle:auditoriadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoriadetalle.getvalor_anterior());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL);
					iRow++;

					for(AuditoriaDetalle auditoriadetalle:auditoriadetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoriadetalle.getvalor_actual());
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
			//	this.getFilaCabeceraExportarExcelAuditoriaDetalle(row);				
			//	iRow++;
			//}				
			
			//for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAuditoriaDetalle(auditoriadetalleAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
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
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAuditoriaDetalle(false);
			
			//SI ES MANUAL
			if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAuditoriaDetalle();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAuditoriaDetalle(false);
			
			//SI ES MANUAL
			if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAuditoriaDetalle();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAuditoriaDetalle(false);
			
			//SI ES MANUAL
			if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAuditoriaDetalle();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAuditoriaDetalle() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAuditoriaDetalle.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAuditoriaDetalle.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAuditoriaDetalle.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAuditoriaDetalle.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAuditoriaDetalle.setMinimumSize(dimensionMinimum);
		this.jTableDatosAuditoriaDetalle.setMaximumSize(dimensionMaximum);
		this.jTableDatosAuditoriaDetalle.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAuditoriaDetalle(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAuditoriaDetalle(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAuditoriaDetalle(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAuditoriaDetalle(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAuditoriaDetalle(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAuditoriaDetalle(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAuditoriaDetalle(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAuditoriaDetalle(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAuditoriaDetalle() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAuditoriaDetalle();
		
		this.inicializarActualizarBindingBotonesManualAuditoriaDetalle(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAuditoriaDetalle();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAuditoriaDetalle() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAuditoriaDetalle(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAuditoriaDetalle(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAuditoriaDetalle.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAuditoriaDetalle.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAuditoriaDetalle.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAuditoriaDetalle.jCheckBoxPostAccionNuevoAuditoriaDetalle.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAuditoriaDetalle.jCheckBoxPostAccionSinCerrarAuditoriaDetalle.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAuditoriaDetalle.jCheckBoxPostAccionSinMensajeAuditoriaDetalle.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAuditoriaDetalle.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAuditoriaDetalle.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAuditoriaDetalle.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
				this.jInternalFrameDetalleFormAuditoriaDetalle.jCheckBoxPostAccionNuevoAuditoriaDetalle.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAuditoriaDetalle.jCheckBoxPostAccionSinCerrarAuditoriaDetalle.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAuditoriaDetalle.jCheckBoxPostAccionSinMensajeAuditoriaDetalle.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAuditoriaDetalle.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAuditoriaDetalle.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAuditoriaDetalle.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAuditoriaDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAuditoriaDetalle.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAuditoriaDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAuditoriaDetalle.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAuditoriaDetalle.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAuditoriaDetalle.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAuditoriaDetalle(Boolean esInicializar) throws Exception {
		try	{	
			if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAuditoriaDetalle(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAuditoriaDetalle() throws Exception {
		try	{
			if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAuditoriaDetalle();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAuditoriaDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAuditoriaDetalle() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAuditoriaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAuditoriaDetalle.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAuditoriaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAuditoriaDetalle.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAuditoriaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAuditoriaDetalle.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAuditoriaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAuditoriaDetalle.addItem(reporte);
			}
			
			
			if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAuditoriaDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAuditoriaDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAuditoriaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAuditoriaDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAuditoriaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAuditoriaDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAuditoriaDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAuditoriaDetalle.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAuditoriaDetalle.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAuditoriaDetalle();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAuditoriaDetalle() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
				
				if(this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAuditoriaDetalle()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.getSelectedItem()!=null){this.id_auditoriaBusquedaPorIdAuditoriaPorNombreCampo=((Auditoria)this.jComboBoxid_auditoriaBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.getSelectedItem()).getId();}
		this.nombre_campoBusquedaPorIdAuditoriaPorNombreCampo=this.jTextAreanombre_campoBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.getText();
		if(this.jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.getSelectedItem()!=null){this.id_auditoriaFK_IdAuditoria=((Auditoria)this.jComboBoxid_auditoriaFK_IdAuditoriaAuditoriaDetalle.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAuditoriaDetalle(Boolean esInicializar) throws Exception {				
		if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAuditoriaDetalle();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAuditoriaDetalle() throws Exception {
		this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAuditoriaDetalle() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAuditoriaDetalleOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalleOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAuditoriaDetalle(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=auditoriadetalleLogic.getAuditoriaDetalles().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=auditoriadetalles.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAuditoriaDetalle.setModel(new AuditoriaDetalleModel(this.auditoriadetalleLogic.getAuditoriaDetalles(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAuditoriaDetalle.setModel(new AuditoriaDetalleModel(this.auditoriadetalles,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAuditoriaDetalle!=null && this.jInternalFrameOrderByAuditoriaDetalle.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAuditoriaDetalle();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO,auditoriadetalleConstantesFunciones.resaltarSeleccionarAuditoriaDetalle,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO,auditoriadetalleConstantesFunciones.resaltarSeleccionarAuditoriaDetalle,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,AuditoriaDetalleConstantesFunciones.LABEL_ID));

		if(this.auditoriadetalleConstantesFunciones.mostraridAuditoriaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaDetalleConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.auditoriadetalleConstantesFunciones.resaltaridAuditoriaDetalle,this.auditoriadetalleConstantesFunciones.activaridAuditoriaDetalle,this,true,"idAuditoriaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriadetalleConstantesFunciones.resaltaridAuditoriaDetalle,this.auditoriadetalleConstantesFunciones.activaridAuditoriaDetalle,this,true,"idAuditoriaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA));

		if(this.auditoriadetalleConstantesFunciones.mostrarid_auditoriaAuditoriaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AuditoriaTableCell(this.auditoriasForeignKey,this.auditoriadetalleConstantesFunciones.resaltarid_auditoriaAuditoriaDetalle,this,this.auditoriadetalleConstantesFunciones.activarid_auditoriaAuditoriaDetalle));
			tableColumn.setCellEditor(new AuditoriaTableCell(this.auditoriasForeignKey,this.auditoriadetalleConstantesFunciones.resaltarid_auditoriaAuditoriaDetalle,this,this.auditoriadetalleConstantesFunciones.activarid_auditoriaAuditoriaDetalle,true,"id_auditoriaAuditoriaDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO));

		if(this.auditoriadetalleConstantesFunciones.mostrarnombre_campoAuditoriaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriadetalleConstantesFunciones.resaltarnombre_campoAuditoriaDetalle,this.auditoriadetalleConstantesFunciones.activarnombre_campoAuditoriaDetalle,this,true,"nombre_campoAuditoriaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriadetalleConstantesFunciones.resaltarnombre_campoAuditoriaDetalle,this.auditoriadetalleConstantesFunciones.activarnombre_campoAuditoriaDetalle,this,true,"nombre_campoAuditoriaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR));

		if(this.auditoriadetalleConstantesFunciones.mostrarvalor_anteriorAuditoriaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriadetalleConstantesFunciones.resaltarvalor_anteriorAuditoriaDetalle,this.auditoriadetalleConstantesFunciones.activarvalor_anteriorAuditoriaDetalle,this,true,"valor_anteriorAuditoriaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriadetalleConstantesFunciones.resaltarvalor_anteriorAuditoriaDetalle,this.auditoriadetalleConstantesFunciones.activarvalor_anteriorAuditoriaDetalle,this,true,"valor_anteriorAuditoriaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL));

		if(this.auditoriadetalleConstantesFunciones.mostrarvalor_actualAuditoriaDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriadetalleConstantesFunciones.resaltarvalor_actualAuditoriaDetalle,this.auditoriadetalleConstantesFunciones.activarvalor_actualAuditoriaDetalle,this,true,"valor_actualAuditoriaDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriadetalleConstantesFunciones.resaltarvalor_actualAuditoriaDetalle,this.auditoriadetalleConstantesFunciones.activarvalor_actualAuditoriaDetalle,this,true,"valor_actualAuditoriaDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.auditoriadetalleSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.auditoriadetalleSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAuditoriaDetalle.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.auditoriadetalleSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.auditoriadetalleSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAuditoriaDetalle.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.auditoriadetalleSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.auditoriadetalleSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAuditoriaDetalle.addColumn(tableColumn);
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
			
			this.jTableDatosAuditoriaDetalle.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAuditoriaDetalle.moveColumn(this.jTableDatosAuditoriaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAuditoriaDetalle.moveColumn(this.jTableDatosAuditoriaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAuditoriaDetalle.moveColumn(this.jTableDatosAuditoriaDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAuditoriaDetalle.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAuditoriaDetalle.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAuditoriaDetalle,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAuditoriaDetalle.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAuditoriaDetalle.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAuditoriaDetalle.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAuditoriaDetalle.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=auditoriadetalleLogic.getAuditoriaDetalles().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=auditoriadetalles.size()-1;
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
		//this.jTableDatosAuditoriaDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAuditoriaDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAuditoriaDetalle();
			
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
				
				//this.isEsNuevoAuditoriaDetalle=false;
					
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
				if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAuditoriaDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAuditoriaDetalle.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.auditoriadetalle.getsType().equals("DUPLICADO")
				   || this.auditoriadetalle.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAuditoriaDetalle=true;
				
				} else {
					this.isEsNuevoAuditoriaDetalle=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
					if(this.auditoriadetalle.getId()>=0 && !this.auditoriadetalle.getIsNew()) {						
						this.isEsNuevoAuditoriaDetalle=false;
						
					} else {
						this.isEsNuevoAuditoriaDetalle=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAuditoriaDetalle(esRelaciones);						
				
				this.seleccionarAuditoriaDetalle(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.auditoriadetalle.getId()<0) {
					this.isEsNuevoAuditoriaDetalle=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAuditoriaDetalle(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAuditoriaDetalle(evt,rowIndex);
				}	
				
				if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AuditoriaDetalle: " + this.dDif); 
					}
				}								
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAuditoriaDetalle(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.auditoriadetalle)) {
					if(this.auditoriadetalle.getId()>0) {
						this.auditoriadetalle.setIsDeleted(true);
						
						this.auditoriadetallesEliminados.add(this.auditoriadetalle);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.auditoriadetalleLogic.getAuditoriaDetalles().remove(this.auditoriadetalle);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.auditoriadetalles.remove(this.auditoriadetalle);				
					}
					
					
					((AuditoriaDetalleModel) this.jTableDatosAuditoriaDetalle.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAuditoriaDetalle(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAuditoriaDetalle(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAuditoriaDetalle) {
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAuditoriaDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAuditoriaDetalle.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAuditoriaDetalle(this.auditoriadetalle);
				}
				
				//ARCHITECTURE
				try {
					

					//Auditoria
					if(!this.auditoriadetalleConstantesFunciones.cargarid_auditoriaAuditoriaDetalle || this.auditoriadetalleConstantesFunciones.event_dependid_auditoriaAuditoriaDetalle) {
						//this.cargarCombosAuditoriasForeignKeyLista(" where id="+this.auditoriadetalle.getid_auditoria());
									//this.inicializarActualizarBindingAuditoriaDetalle(false,false);
						this.auditoriasForeignKey=new ArrayList<Auditoria>();

						if(auditoriadetalle.getAuditoria()!=null) {
							this.auditoriasForeignKey.add(auditoriadetalle.getAuditoria());
						}

						this.addItemDefectoCombosForeignKeyAuditoria();
						this.cargarCombosFrameAuditoriasForeignKey("Todos");
					}
					this.setActualAuditoriaForeignKey(this.auditoriadetalle.getid_auditoria(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAuditoriaDetalle("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAuditoriaDetalle(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAuditoriaDetalle() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAuditoriaDetalle(AuditoriaDetalle auditoriadetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAuditoriaDetalle(auditoriadetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAuditoriaDetalle(auditoriadetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAuditoriaDetalle(auditoriadetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAuditoriaDetalle(auditoriadetalle);
	}
	
	public void setVariablesObjetoActualToFormularioAuditoriaDetalle(AuditoriaDetalle auditoriadetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.setText(auditoriadetalle.getId().toString());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreanombre_campoAuditoriaDetalle.setText(auditoriadetalle.getnombre_campo());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_anteriorAuditoriaDetalle.setText(auditoriadetalle.getvalor_anterior());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_actualAuditoriaDetalle.setText(auditoriadetalle.getvalor_actual());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AuditoriaDetalle auditoriadetalleLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,auditoriadetalleLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AuditoriaDetalle auditoriadetalleLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				auditoriadetalleLocal=this.auditoriadetalle;
			} else {
				auditoriadetalleLocal=this.auditoriadetalleAnterior;
			}
		}
		
		if(this.permiteMantenimiento(auditoriadetalleLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAuditoriaDetalle(auditoriadetalleLocal,true);
					
					if(auditoriadetalleSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(auditoriadetalleLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(auditoriadetalleLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAuditoriaDetalle(auditoriadetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(auditoriadetalle);
	}
	
	public void setVariablesFormularioToObjetoActualAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAuditoriaDetalle(auditoriadetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.getText()==null || this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.getText()=="" || this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.getText()=="Id") {
				this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.setText("0");
			}

			if(conColumnasBase) {auditoriadetalle.setId(Long.parseLong(this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaDetalleConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelIdAuditoriaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoriadetalle.setnombre_campo(this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreanombre_campoAuditoriaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelnombre_campoAuditoriaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoriadetalle.setvalor_anterior(this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_anteriorAuditoriaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelvalor_anteriorAuditoriaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoriadetalle.setvalor_actual(this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_actualAuditoriaDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelvalor_actualAuditoriaDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAuditoriaDetalle(AuditoriaDetalle auditoriadetalleBean,AuditoriaDetalle auditoriadetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && auditoriadetalleBean.getid_auditoria()!=null && !auditoriadetalleBean.getid_auditoria().equals(-1L))) {auditoriadetalle.setid_auditoria(auditoriadetalleBean.getid_auditoria());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAuditoriaDetalle(AuditoriaDetalle auditoriadetalleOrigen,AuditoriaDetalle auditoriadetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && auditoriadetalleOrigen.getId()!=null && !auditoriadetalleOrigen.getId().equals(0L))) {auditoriadetalle.setId(auditoriadetalleOrigen.getId());}}
			if(conDefault || (!conDefault && auditoriadetalleOrigen.getid_auditoria()!=null && !auditoriadetalleOrigen.getid_auditoria().equals(-1L))) {auditoriadetalle.setid_auditoria(auditoriadetalleOrigen.getid_auditoria());}
			if(conDefault || (!conDefault && auditoriadetalleOrigen.getnombre_campo()!=null && !auditoriadetalleOrigen.getnombre_campo().equals(""))) {auditoriadetalle.setnombre_campo(auditoriadetalleOrigen.getnombre_campo());}
			if(conDefault || (!conDefault && auditoriadetalleOrigen.getvalor_anterior()!=null && !auditoriadetalleOrigen.getvalor_anterior().equals(""))) {auditoriadetalle.setvalor_anterior(auditoriadetalleOrigen.getvalor_anterior());}
			if(conDefault || (!conDefault && auditoriadetalleOrigen.getvalor_actual()!=null && !auditoriadetalleOrigen.getvalor_actual().equals(""))) {auditoriadetalle.setvalor_actual(auditoriadetalleOrigen.getvalor_actual());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAuditoriaDetalle(AuditoriaDetalle auditoriadetalle) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.setText(auditoriadetalle.getId().toString());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreanombre_campoAuditoriaDetalle.setText(auditoriadetalle.getnombre_campo());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_anteriorAuditoriaDetalle.setText(auditoriadetalle.getvalor_anterior());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_actualAuditoriaDetalle.setText(auditoriadetalle.getvalor_actual());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAuditoriaDetalle(AuditoriaDetalleBean auditoriadetalleBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.setText(auditoriadetalleBean.getId().toString());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreanombre_campoAuditoriaDetalle.setText(auditoriadetalleBean.getnombre_campo());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_anteriorAuditoriaDetalle.setText(auditoriadetalleBean.getvalor_anterior());
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_actualAuditoriaDetalle.setText(auditoriadetalleBean.getvalor_actual());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAuditoriaDetalle(AuditoriaDetalleParameterReturnGeneral auditoriadetalleReturnGeneral,AuditoriaDetalleBean auditoriadetalleBean,Boolean conDefault) throws Exception { 
		try {
			AuditoriaDetalle auditoriadetalleLocal=new AuditoriaDetalle();
			
			auditoriadetalleLocal=auditoriadetalleReturnGeneral.getAuditoriaDetalle();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && auditoriadetalleLocal.getId()!=null && !auditoriadetalleLocal.getId().equals(0L))) {auditoriadetalleBean.setId(auditoriadetalleLocal.getId());}}
			if(conDefault || (!conDefault && auditoriadetalleLocal.getid_auditoria()!=null && !auditoriadetalleLocal.getid_auditoria().equals(-1L))) {auditoriadetalleBean.setid_auditoria(auditoriadetalleLocal.getid_auditoria());}
			if(conDefault || (!conDefault && auditoriadetalleLocal.getnombre_campo()!=null && !auditoriadetalleLocal.getnombre_campo().equals(""))) {auditoriadetalleBean.setnombre_campo(auditoriadetalleLocal.getnombre_campo());}
			if(conDefault || (!conDefault && auditoriadetalleLocal.getvalor_anterior()!=null && !auditoriadetalleLocal.getvalor_anterior().equals(""))) {auditoriadetalleBean.setvalor_anterior(auditoriadetalleLocal.getvalor_anterior());}
			if(conDefault || (!conDefault && auditoriadetalleLocal.getvalor_actual()!=null && !auditoriadetalleLocal.getvalor_actual().equals(""))) {auditoriadetalleBean.setvalor_actual(auditoriadetalleLocal.getvalor_actual());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAuditoriaDetalleGenerico(Long idAuditoriaDetalleSeleccionado,JComboBox jComboBoxAuditoriaDetalle,List<AuditoriaDetalle> auditoriadetallesLocal)throws Exception {
		try {
			AuditoriaDetalle  auditoriadetalleTemp=null;

			for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesLocal) {
				if(auditoriadetalleAux.getId()!=null && auditoriadetalleAux.getId().equals(idAuditoriaDetalleSeleccionado)) {
					auditoriadetalleTemp=auditoriadetalleAux;
					break;
				}
			}

			jComboBoxAuditoriaDetalle.setSelectedItem(auditoriadetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAuditoriaDetalleGenerico(JComboBox jComboBoxAuditoriaDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAuditoriaDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAuditoriaDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAuditoriaDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAuditoriaDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			auditoriadetalle=(AuditoriaDetalle) auditoriadetalleLogic.getAuditoriaDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			auditoriadetalle =(AuditoriaDetalle) auditoriadetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Auditoria")) {
			//sDescripcion=this.getActualAuditoriaForeignKeyDescripcion((Long)value);
			if(!auditoriadetalle.getIsNew() && !auditoriadetalle.getIsChanged() && !auditoriadetalle.getIsDeleted()) {
				sDescripcion=auditoriadetalle.getauditoria_descripcion();
			} else {
				//sDescripcion=this.getActualAuditoriaForeignKeyDescripcion((Long)value);
				sDescripcion=auditoriadetalle.getauditoria_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AuditoriaDetalle auditoriadetalleRow=new AuditoriaDetalle();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			auditoriadetalleRow=(AuditoriaDetalle) auditoriadetalleLogic.getAuditoriaDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			auditoriadetalleRow=(AuditoriaDetalle) auditoriadetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAuditoriaDetalle(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle));			
			this.jButtonDuplicarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaDuplicarAuditoriaDetalle && this.isPermisoDuplicarAuditoriaDetalle));			
			this.jButtonCopiarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaCopiarAuditoriaDetalle && this.isPermisoCopiarAuditoriaDetalle));
			this.jButtonVerFormAuditoriaDetalle.setVisible((this.isVisibilidadCeldaVerFormAuditoriaDetalle && this.isPermisoVerFormAuditoriaDetalle));
			
			this.jButtonAbrirOrderByAuditoriaDetalle.setVisible((this.isVisibilidadCeldaOrdenAuditoriaDetalle && this.isPermisoOrdenAuditoriaDetalle));			
			
			this.jButtonNuevoRelacionesAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle));			
			this.jButtonNuevoGuardarCambiosAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaModificarAuditoriaDetalle && this.isPermisoActualizarAuditoriaDetalle));	
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaActualizarAuditoriaDetalle && this.isPermisoActualizarAuditoriaDetalle));	
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaEliminarAuditoriaDetalle && this.isPermisoEliminarAuditoriaDetalle));
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarAuditoriaDetalle.setVisible(this.isVisibilidadCeldaCancelarAuditoriaDetalle);							
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosAuditoriaDetalle.setVisible((this.isVisibilidadCeldaGuardarAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));			
			
			}
						
			this.jButtonGuardarCambiosTablaAuditoriaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle));						
			this.jButtonDuplicarToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaDuplicarAuditoriaDetalle && this.isPermisoDuplicarAuditoriaDetalle));						
			this.jButtonCopiarToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaCopiarAuditoriaDetalle && this.isPermisoCopiarAuditoriaDetalle));			
			this.jButtonVerFormToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaVerFormAuditoriaDetalle && this.isPermisoVerFormAuditoriaDetalle));			
			this.jButtonAbrirOrderByToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaOrdenAuditoriaDetalle && this.isPermisoOrdenAuditoriaDetalle));
			this.jButtonNuevoRelacionesToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle));			
			this.jButtonNuevoGuardarCambiosToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));			
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaModificarAuditoriaDetalle && this.isPermisoActualizarAuditoriaDetalle));	
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaActualizarAuditoriaDetalle  && this.isPermisoActualizarAuditoriaDetalle));	
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaEliminarAuditoriaDetalle && this.isPermisoEliminarAuditoriaDetalle));
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarToolBarAuditoriaDetalle.setVisible(this.isVisibilidadCeldaCancelarAuditoriaDetalle);				
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaGuardarAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle));			
			this.jMenuItemDuplicarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaDuplicarAuditoriaDetalle && this.isPermisoDuplicarAuditoriaDetalle));			
			this.jMenuItemCopiarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaCopiarAuditoriaDetalle && this.isPermisoCopiarAuditoriaDetalle));			
			this.jMenuItemVerFormAuditoriaDetalle.setVisible((this.isVisibilidadCeldaVerFormAuditoriaDetalle && this.isPermisoVerFormAuditoriaDetalle));			
			this.jMenuItemAbrirOrderByAuditoriaDetalle.setVisible((this.isVisibilidadCeldaOrdenAuditoriaDetalle && this.isPermisoOrdenAuditoriaDetalle));			
			//this.jMenuItemMostrarOcultarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaOrdenAuditoriaDetalle && this.isPermisoOrdenAuditoriaDetalle));
			this.jMenuItemDetalleAbrirOrderByAuditoriaDetalle.setVisible((this.isVisibilidadCeldaOrdenAuditoriaDetalle && this.isPermisoOrdenAuditoriaDetalle));			
			//this.jMenuItemDetalleMostrarOcultarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaOrdenAuditoriaDetalle && this.isPermisoOrdenAuditoriaDetalle));			
			this.jMenuItemNuevoRelacionesAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle));			
			this.jMenuItemNuevoGuardarCambiosAuditoriaDetalle.setVisible((this.isVisibilidadCeldaNuevoAuditoriaDetalle && this.isPermisoNuevoAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));									
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemModificarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaModificarAuditoriaDetalle && this.isPermisoActualizarAuditoriaDetalle));	
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemActualizarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaActualizarAuditoriaDetalle && this.isPermisoActualizarAuditoriaDetalle));	
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemEliminarAuditoriaDetalle.setVisible((this.isVisibilidadCeldaEliminarAuditoriaDetalle && this.isPermisoEliminarAuditoriaDetalle));
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemCancelarAuditoriaDetalle.setVisible(this.isVisibilidadCeldaCancelarAuditoriaDetalle);				
			}
			
			this.jMenuItemGuardarCambiosAuditoriaDetalle.setVisible((this.isVisibilidadCeldaGuardarAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));						
			this.jMenuItemGuardarCambiosTablaAuditoriaDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=this.jButtonNuevoAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaDuplicarAuditoriaDetalle=this.jButtonDuplicarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaCopiarAuditoriaDetalle=this.jButtonCopiarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaVerFormAuditoriaDetalle=this.jButtonVerFormAuditoriaDetalle.isVisible();
			
			this.isVisibilidadCeldaOrdenAuditoriaDetalle=this.jButtonAbrirOrderByAuditoriaDetalle.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=this.jButtonNuevoRelacionesAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaModificarAuditoriaDetalle=this.jButtonModificarAuditoriaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosAuditoriaDetalle.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=this.jButtonGuardarCambiosTablaAuditoriaDetalle.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=this.jButtonNuevoToolBarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=this.jButtonNuevoRelacionesToolBarAuditoriaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			this.isVisibilidadCeldaModificarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarToolBarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarToolBarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarToolBarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarToolBarAuditoriaDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAuditoriaDetalle=this.jButtonGuardarCambiosToolBarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=this.jButtonGuardarCambiosTablaToolBarAuditoriaDetalle.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=this.jMenuItemNuevoAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=this.jMenuItemNuevoRelacionesAuditoriaDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			this.isVisibilidadCeldaModificarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemModificarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemActualizarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemEliminarAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemCancelarAuditoriaDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAuditoriaDetalle=this.jMenuItemGuardarCambiosAuditoriaDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=this.jMenuItemGuardarCambiosTablaAuditoriaDetalle.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAuditoriaDetalle(Boolean esInicializar) {
		if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {			
			if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
				//if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAuditoriaDetalle();
			}
			
			this.inicializarActualizarBindingBotonesManualAuditoriaDetalle(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAuditoriaDetalle() {
		this.jButtonNuevoAuditoriaDetalle.setVisible(this.isPermisoNuevoAuditoriaDetalle);			
		this.jButtonDuplicarAuditoriaDetalle.setVisible(this.isPermisoDuplicarAuditoriaDetalle);			
		this.jButtonCopiarAuditoriaDetalle.setVisible(this.isPermisoCopiarAuditoriaDetalle);			
		this.jButtonVerFormAuditoriaDetalle.setVisible(this.isPermisoVerFormAuditoriaDetalle);			
		
		this.jButtonAbrirOrderByAuditoriaDetalle.setVisible(this.isPermisoOrdenAuditoriaDetalle);					
		
		this.jButtonNuevoRelacionesAuditoriaDetalle.setVisible(this.isPermisoNuevoAuditoriaDetalle);			
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarAuditoriaDetalle.setVisible(this.isPermisoActualizarAuditoriaDetalle);	
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarAuditoriaDetalle.setVisible(this.isPermisoActualizarAuditoriaDetalle);	
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarAuditoriaDetalle.setVisible(this.isPermisoEliminarAuditoriaDetalle);
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarAuditoriaDetalle.setVisible(this.isVisibilidadCeldaCancelarAuditoriaDetalle);						
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosAuditoriaDetalle.setVisible(this.isPermisoGuardarCambiosAuditoriaDetalle);							
		}
		
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.setVisible(this.isPermisoActualizarAuditoriaDetalle);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAuditoriaDetalle() {
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarAuditoriaDetalle.setVisible(this.isPermisoActualizarAuditoriaDetalle);	
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarAuditoriaDetalle.setVisible(this.isPermisoActualizarAuditoriaDetalle);	
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarAuditoriaDetalle.setVisible(this.isPermisoEliminarAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarAuditoriaDetalle.setVisible(this.isVisibilidadCeldaCancelarAuditoriaDetalle);							
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosAuditoriaDetalle.setVisible((this.isVisibilidadCeldaGuardarAuditoriaDetalle && this.isPermisoGuardarCambiosAuditoriaDetalle));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAuditoriaDetalle() {
		if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAuditoriaDetalle();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAuditoriaDetalle() {
	}
	
	public void jTableDatosAuditoriaDetalleListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAuditoriaDetalle(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAuditoriaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.getauditoriadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoriadetalle==null) {
						this.auditoriadetalle = new AuditoriaDetalle();
					}

					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
				}

				if(this.auditoriadetalle.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.auditoriadetalle.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoriaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_auditoriaAuditoriaDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoauditoria=true;

			idTienePermisoauditoria=this.tienePermisosUsuarioEnPaginaWebAuditoriaDetalle(AuditoriaConstantesFunciones.CLASSNAME);

			if(idTienePermisoauditoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAuditoriaDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAuditoriaDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.getauditoriadetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);

				this.auditoriaBeanSwingJInternalFrame=new AuditoriaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.auditoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.auditoriaBeanSwingJInternalFrame.getAuditoriaLogic().setConnexion(this.auditoriadetalleLogic.getConnexion());

				if(this.auditoriadetalle.getid_auditoria()!=null) {
					this.auditoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.auditoriaBeanSwingJInternalFrame.setIdActual(this.auditoriadetalle.getid_auditoria());
					this.auditoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.auditoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.auditoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaAuditoria();
				}

				JInternalFrameBase jinternalFrame =this.auditoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAuditoriaDetalle=(TitledBorder)this.jScrollPanelDatosAuditoriaDetalle.getBorder();
				TitledBorder titledBorderauditoria=(TitledBorder)this.auditoriaBeanSwingJInternalFrame.jScrollPanelDatosAuditoria.getBorder();

				titledBorderauditoria.setTitle(titledBorderAuditoriaDetalle.getTitle() + " -> Auditoria");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_auditoriaAuditoriaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.getauditoriadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoriadetalle==null) {
						this.auditoriadetalle = new AuditoriaDetalle();
					}

					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
				}

				if(this.auditoriadetalle.getid_auditoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_auditoria = "+this.auditoriadetalle.getid_auditoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoriaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_campoAuditoriaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.getauditoriadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoriadetalle==null) {
						this.auditoriadetalle = new AuditoriaDetalle();
					}

					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
				}

				if(this.auditoriadetalle.getnombre_campo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_campo like '%"+this.auditoriadetalle.getnombre_campo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoriaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_anteriorAuditoriaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.getauditoriadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoriadetalle==null) {
						this.auditoriadetalle = new AuditoriaDetalle();
					}

					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
				}

				if(this.auditoriadetalle.getvalor_anterior()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_anterior like '%"+this.auditoriadetalle.getvalor_anterior()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoriaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_actualAuditoriaDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.getauditoriadetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoriadetalle==null) {
						this.auditoriadetalle = new AuditoriaDetalle();
					}

					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);
				}

				if(this.auditoriadetalle.getvalor_actual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_actual like '%"+this.auditoriadetalle.getvalor_actual()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoriaDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoriaDetalle(false,false);

			this.getAuditoriaDetallesBusquedaPorIdAuditoriaPorNombreCampo();

			this.inicializarActualizarBindingAuditoriaDetalle(false);

			//if(AuditoriaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoriaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAuditoriaAuditoriaDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoriaDetalle(false,false);

			this.getAuditoriaDetallesFK_IdAuditoria();

			this.inicializarActualizarBindingAuditoriaDetalle(false);

			//if(AuditoriaDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoriaDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriadetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAuditoriaDetalle() {
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.setVisible(false);	    			
			this.jInternalFrameDetalleFormAuditoriaDetalle.dispose();
			this.jInternalFrameDetalleFormAuditoriaDetalle=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
			this.jInternalFrameReporteDinamicoAuditoriaDetalle.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAuditoriaDetalle.dispose();
			this.jInternalFrameReporteDinamicoAuditoriaDetalle=null;
		}
		
		if(this.jInternalFrameImportacionAuditoriaDetalle!=null) {
			this.jInternalFrameImportacionAuditoriaDetalle.setVisible(false);	    			
			this.jInternalFrameImportacionAuditoriaDetalle.dispose();
			this.jInternalFrameImportacionAuditoriaDetalle=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAuditoriaDetalle();
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
			
			if(sTipo.equals("NuevoAuditoriaDetalle")) {
				jButtonNuevoAuditoriaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAuditoriaDetalle")) {
				jButtonDuplicarAuditoriaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAuditoriaDetalle")) {
				jButtonCopiarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormAuditoriaDetalle")) {
				jButtonVerFormAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAuditoriaDetalle")) {
				jButtonNuevoAuditoriaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAuditoriaDetalle")) {
				jButtonDuplicarAuditoriaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAuditoriaDetalle")) {
				jButtonNuevoAuditoriaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAuditoriaDetalle")) {
				jButtonDuplicarAuditoriaDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAuditoriaDetalle")) {
				jButtonNuevoAuditoriaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAuditoriaDetalle")) {
				jButtonNuevoAuditoriaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAuditoriaDetalle")) {
				jButtonNuevoAuditoriaDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAuditoriaDetalle")) {
				jButtonModificarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAuditoriaDetalle")) {
				jButtonModificarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAuditoriaDetalle")) {
				jButtonModificarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAuditoriaDetalle")) {
				jButtonActualizarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAuditoriaDetalle")) {
				jButtonActualizarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAuditoriaDetalle")) {
				jButtonActualizarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarAuditoriaDetalle")) {
				jButtonEliminarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAuditoriaDetalle")) {
				jButtonEliminarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAuditoriaDetalle")) {
				jButtonEliminarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarAuditoriaDetalle")) {
				jButtonCancelarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAuditoriaDetalle")) {
				jButtonCancelarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAuditoriaDetalle")) {
				jButtonCancelarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarAuditoriaDetalle")) {
				jButtonCerrarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAuditoriaDetalle")) {
				jButtonCerrarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAuditoriaDetalle")) {
				jButtonCerrarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAuditoriaDetalle")) {
				jButtonMostrarOcultarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAuditoriaDetalle")) {
				jButtonCancelarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAuditoriaDetalle")) {
				jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAuditoriaDetalle")) {
				jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAuditoriaDetalle")) {
				jButtonCopiarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAuditoriaDetalle")) {
				jButtonVerFormAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAuditoriaDetalle")) {
				jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAuditoriaDetalle")) {
				jButtonCopiarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAuditoriaDetalle")) {
				jButtonVerFormAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAuditoriaDetalle")) {
				jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAuditoriaDetalle")) {
				jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAuditoriaDetalle")) {
				jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAuditoriaDetalle")) {
				jButtonRecargarInformacionAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAuditoriaDetalle")) {
				jButtonRecargarInformacionAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAuditoriaDetalle")) {
				jButtonRecargarInformacionAuditoriaDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAuditoriaDetalle")) {
				jButtonAnterioresAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAuditoriaDetalle")) {
				jButtonAnterioresAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAuditoriaDetalle")) {
				jButtonAnterioresAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAuditoriaDetalle")) {
				jButtonSiguientesAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAuditoriaDetalle")) {
				jButtonSiguientesAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAuditoriaDetalle")) {
				jButtonSiguientesAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAuditoriaDetalle") || sTipo.equals("MenuItemDetalleAbrirOrderByAuditoriaDetalle")) {
				jButtonAbrirOrderByAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAuditoriaDetalle") || sTipo.equals("MenuItemDetalleMostrarOcultarAuditoriaDetalle")) {
				jButtonMostrarOcultarAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAuditoriaDetalle")) {
				jButtonNuevoGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAuditoriaDetalle")) {
				jButtonNuevoGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAuditoriaDetalle")) {
				jButtonNuevoGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAuditoriaDetalle")) {
				jButtonCerrarReporteDinamicoAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAuditoriaDetalle")) {
				jButtonGenerarReporteDinamicoAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAuditoriaDetalle")) {
				
				jButtonGenerarExcelReporteDinamicoAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAuditoriaDetalle")) {
				jButtonCerrarImportacionAuditoriaDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAuditoriaDetalle")) {
				
				jButtonGenerarImportacionAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAuditoriaDetalle")) {
				
				jButtonAbrirImportacionAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAuditoriaDetalle")) {
				jComboBoxTiposAccionesAuditoriaDetalleActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAuditoriaDetalle")) {
				jComboBoxTiposRelacionesAuditoriaDetalleActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAuditoriaDetalle")) {
				jComboBoxTiposAccionesAuditoriaDetalleActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAuditoriaDetalle")) {
				
				jComboBoxTiposSeleccionarAuditoriaDetalleActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAuditoriaDetalle")) {
				jTextFieldValorCampoGeneralAuditoriaDetalleActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAuditoriaDetalle")) {
				jButtonAbrirOrderByAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAuditoriaDetalle")) {
				jButtonAbrirOrderByAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAuditoriaDetalle")) {
				jButtonCerrarOrderByAuditoriaDetalleActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAuditoriaDetalleBusqueda")) {
				this.jButtonidAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_auditoriaAuditoriaDetalleUpdate")) {
				this.jButtonid_auditoriaAuditoriaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_auditoriaAuditoriaDetalleBusqueda")) {
				this.jButtonid_auditoriaAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_campoAuditoriaDetalleBusqueda")) {
				this.jButtonnombre_campoAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_anteriorAuditoriaDetalleBusqueda")) {
				this.jButtonvalor_anteriorAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_actualAuditoriaDetalleBusqueda")) {
				this.jButtonvalor_actualAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle")) {
				this.jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdAuditoriaAuditoriaDetalle")) {
				this.jButtonFK_IdAuditoriaAuditoriaDetalleActionPerformed(evt);
			}
			
			;
			
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAuditoriaDetalle();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				


				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AuditoriaDetalle auditoriadetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				auditoriadetalleLocal=this.auditoriadetalle;
			} else {
				auditoriadetalleLocal=this.auditoriadetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
							
				
				


				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
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
			
			


			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
								
						
				


				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
								
				
				


				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
							
				
				


				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
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
			
			


			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
								
				
				


				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAuditoriaDetalle")) {
					jCheckBoxSeleccionarTodosAuditoriaDetalleItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAuditoriaDetalle")) {
					jCheckBoxSeleccionadosAuditoriaDetalleItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAuditoriaDetalle")) {
					
				}
				
				


				
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
												
				
				


				
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaDetalleActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
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
			
			


			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoriadetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoriadetalle);
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
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
				
				


				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AuditoriaDetalle.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AuditoriaDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriadetalleAnterior =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAuditoriaDetalle")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAuditoriaDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAuditoriaDetalle.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.auditoriadetalle =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.auditoriadetalle);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAuditoriaDetalle")) {
				
				}
				
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAuditoriaDetalle")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAuditoriaDetalle.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAuditoriaDetalle")) {
			
			}
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAuditoriaDetalle();
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
			if(sTipo.equals("NuevoAuditoriaDetalle")) {
				jButtonNuevoAuditoriaDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAuditoriaDetalle")) {
				jButtonDuplicarAuditoriaDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAuditoriaDetalle")) {
				jButtonCopiarAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAuditoriaDetalle")) {
				jButtonVerFormAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAuditoriaDetalle")) {
				jButtonNuevoAuditoriaDetalleActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAuditoriaDetalle")) {
				jButtonModificarAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAuditoriaDetalle")) {
				jButtonActualizarAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAuditoriaDetalle")) {
				jButtonEliminarAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAuditoriaDetalle")) {
				jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAuditoriaDetalle")) {
				jButtonCancelarAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAuditoriaDetalle")) {
				jButtonCerrarAuditoriaDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAuditoriaDetalle")) {
				jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAuditoriaDetalle")) {
				jButtonNuevoGuardarCambiosAuditoriaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAuditoriaDetalle")) {
				jButtonAbrirOrderByAuditoriaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAuditoriaDetalle")) {
				jButtonRecargarInformacionAuditoriaDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAuditoriaDetalle")) {
				jButtonAnterioresAuditoriaDetalleActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAuditoriaDetalle")) {
				jButtonSiguientesAuditoriaDetalleActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAuditoriaDetalleBusqueda")) {
				this.jButtonidAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_auditoriaAuditoriaDetalleUpdate")) {
				this.jButtonid_auditoriaAuditoriaDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_auditoriaAuditoriaDetalleBusqueda")) {
				this.jButtonid_auditoriaAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_campoAuditoriaDetalleBusqueda")) {
				this.jButtonnombre_campoAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_anteriorAuditoriaDetalleBusqueda")) {
				this.jButtonvalor_anteriorAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_actualAuditoriaDetalleBusqueda")) {
				this.jButtonvalor_actualAuditoriaDetalleBusquedaActionPerformed(evt);
			}
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAuditoriaDetalle();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAuditoriaDetalle")) {
				closingInternalFrameAuditoriaDetalle();
				
			} else if(sTipo.equals("jButtonCancelarAuditoriaDetalle")) {
				JInternalFrameBase jInternalFrameDetalleFormAuditoriaDetalle = (JInternalFrameBase)evt.getSource();
	            	
	            AuditoriaDetalleBeanSwingJInternalFrame jInternalFrameParent=(AuditoriaDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormAuditoriaDetalle.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAuditoriaDetalleActionPerformed(null);
			}
			
			AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.auditoriadetalle,new Object(),this.auditoriadetalleParameterGeneral,this.auditoriadetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAuditoriaDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAuditoriaDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAuditoriaDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.auditoriadetalle)) {
			if(!esControlTabla) {
				if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);			
				}
				
				if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAuditoriaDetalle(this.auditoriadetalle,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.auditoriadetalleReturnGeneral=auditoriadetalleLogic.procesarEventosAuditoriaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.auditoriadetalleLogic.getAuditoriaDetalles(),this.auditoriadetalle,this.auditoriadetalleParameterGeneral,this.isEsNuevoAuditoriaDetalle,classes);//this.auditoriadetalleLogic.getAuditoriaDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAuditoriaDetalle(this.auditoriadetalleReturnGeneral,this.auditoriadetalleBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAuditoriaDetalle(classes,this.auditoriadetalleReturnGeneral,this.auditoriadetalleBean,false);
					}
						
					if(this.auditoriadetalleReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAuditoriaDetalle(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAuditoriaDetalle(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle());	
					}
						
					if(this.auditoriadetalleReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAuditoriaDetalle(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle(),classes);//this.auditoriadetalleBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAuditoriaDetalle(this.auditoriadetalle,classes);//this.auditoriadetalleBean);									
				}
			
				if(AuditoriaDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAuditoriaDetalle(this.auditoriadetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoriaDetalle(this.auditoriadetalle);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.auditoriadetalleAnterior!=null) {
						this.auditoriadetalle=this.auditoriadetalleAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.auditoriadetalleReturnGeneral=auditoriadetalleLogic.procesarEventosAuditoriaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.auditoriadetalleLogic.getAuditoriaDetalles(),this.auditoriadetalle,this.auditoriadetalleParameterGeneral,this.isEsNuevoAuditoriaDetalle,classes);//this.auditoriadetalleLogic.getAuditoriaDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.auditoriadetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle(),auditoriadetalleLogic.getAuditoriaDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle(),this.auditoriadetalles);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAuditoriaDetalle.repaint();
				
				//((AbstractTableModel) this.jTableDatosAuditoriaDetalle.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAuditoriaDetalle();
			}
		}
	}
	
	public void actualizarVisualTableDatosAuditoriaDetalle() throws Exception {
		
		AuditoriaDetalleModel auditoriadetalleModel=(AuditoriaDetalleModel)this.jTableDatosAuditoriaDetalle.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			auditoriadetalleModel.auditoriadetalles=this.auditoriadetalleLogic.getAuditoriaDetalles();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			auditoriadetalleModel.auditoriadetalles=this.auditoriadetalles;
		}
		
		
		((AuditoriaDetalleModel) this.jTableDatosAuditoriaDetalle.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAuditoriaDetalle() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getauditoriadetalleAnterior(),this.auditoriadetalleLogic.getAuditoriaDetalles());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getauditoriadetalleAnterior(),this.auditoriadetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAuditoriaDetalle();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
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
										
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.auditoriadetalle,new Object(),generalEntityParameterGeneral,this.auditoriadetalleReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AuditoriaDetalleConstantesFunciones.getClassesRelationshipsOfAuditoriaDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AuditoriaDetalleConstantesFunciones.getClassesRelationshipsFromStringsOfAuditoriaDetalle(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAuditoriaDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AuditoriaDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.auditoriadetalle,new Object(),generalEntityParameterGeneral,this.auditoriadetalleReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAuditoriaDetalle(AuditoriaDetalleBean auditoriadetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAuditoriaDetalle(ArrayList<Classe> classes,AuditoriaDetalleReturnGeneral auditoriadetalleReturnGeneral,AuditoriaDetalleBean auditoriadetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.auditoriadetalle)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAuditoriaDetalle = new AuditoriaDetalleDetalleFormJInternalFrame(jDesktopPane,this.auditoriadetalleSessionBean.getConGuardarRelaciones(),this.auditoriadetalleSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.setVisible(false);
		this.jInternalFrameDetalleFormAuditoriaDetalle.setSelected(false);						
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.auditoriadetalleLogic=this.auditoriadetalleLogic;
		
		this.cargarCombosFrameForeignKeyAuditoriaDetalle("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAuditoriaDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAuditoriaDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAuditoriaDetalle("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAuditoriaDetalle();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAuditoriaDetalle"));
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"ModificarAuditoriaDetalle"));

		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarToolBarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarAuditoriaDetalle"));
					
		this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemModificarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarAuditoriaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"ActualizarAuditoriaDetalle"));
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarToolBarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAuditoriaDetalle"));
						
		this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemActualizarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAuditoriaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"EliminarAuditoriaDetalle"));
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarAuditoriaDetalle"));
								
		this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemEliminarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAuditoriaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"CancelarAuditoriaDetalle"));
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarAuditoriaDetalle"));
					
		this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemCancelarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAuditoriaDetalle"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemDetalleCerrarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAuditoriaDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAuditoriaDetalle"));
		
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAuditoriaDetalle"));
		
		
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAuditoriaDetalle"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonidAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idAuditoriaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonid_auditoriaAuditoriaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_auditoriaAuditoriaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonid_auditoriaAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_auditoriaAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonnombre_campoAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_campoAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonvalor_anteriorAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valor_anteriorAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonvalor_actualAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valor_actualAuditoriaDetalleBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAuditoriaDetalle"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAuditoriaDetalle"));
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAuditoriaDetalle"));
		}
		
		this.jTableDatosAuditoriaDetalle.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAuditoriaDetalle"));
		
		this.jTableDatosAuditoriaDetalle.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAuditoriaDetalle"));
		
		this.jButtonNuevoAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"NuevoAuditoriaDetalle"));
		
		this.jButtonDuplicarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"DuplicarAuditoriaDetalle"));
		
		this.jButtonCopiarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"CopiarAuditoriaDetalle"));
		
		this.jButtonVerFormAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"VerFormAuditoriaDetalle"));
		
		
		this.jButtonNuevoToolBarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"NuevoToolBarAuditoriaDetalle"));
			
		this.jButtonDuplicarToolBarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAuditoriaDetalle"));
			
		this.jMenuItemNuevoAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAuditoriaDetalle"));
			
		this.jMenuItemDuplicarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAuditoriaDetalle"));		
		
		
		this.jButtonNuevoRelacionesAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAuditoriaDetalle"));
		
		
		this.jButtonNuevoRelacionesToolBarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAuditoriaDetalle"));
			
		this.jMenuItemNuevoRelacionesAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAuditoriaDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"ModificarAuditoriaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonModificarToolBarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarAuditoriaDetalle"));
			
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemModificarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarAuditoriaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"ActualizarAuditoriaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonActualizarToolBarAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAuditoriaDetalle"));
				
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemActualizarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAuditoriaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"EliminarAuditoriaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonEliminarToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarAuditoriaDetalle"));
						
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemEliminarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAuditoriaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"CancelarAuditoriaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonCancelarToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarAuditoriaDetalle"));
			
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemCancelarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAuditoriaDetalle"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAuditoriaDetalle"));		
		
		
		this.jButtonCerrarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"CerrarAuditoriaDetalle"));
		
		
		this.jButtonCerrarToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"CerrarToolBarAuditoriaDetalle"));
			
		this.jMenuItemCerrarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAuditoriaDetalle"));
			
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jMenuItemDetalleCerrarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAuditoriaDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosAuditoriaDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAuditoriaDetalle"));
		}
		
		this.jButtonCopiarToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"CopiarToolBarAuditoriaDetalle"));
			
		this.jButtonVerFormToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"VerFormToolBarAuditoriaDetalle"));
		
		this.jMenuItemGuardarCambiosAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAuditoriaDetalle"));
			
		this.jMenuItemCopiarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAuditoriaDetalle"));		
		
		this.jMenuItemVerFormAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAuditoriaDetalle"));		
		
		
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAuditoriaDetalle"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAuditoriaDetalle"));
			
		this.jMenuItemGuardarCambiosTablaAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAuditoriaDetalle"));		
		
		
		
		this.jButtonRecargarInformacionAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionAuditoriaDetalle"));
					
		this.jButtonRecargarInformacionToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAuditoriaDetalle"));
		
		this.jMenuItemRecargarInformacionAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAuditoriaDetalle"));		
		
		
		
		this.jButtonAnterioresAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"AnterioresAuditoriaDetalle"));
		
		
		this.jButtonAnterioresToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAuditoriaDetalle"));
		
		this.jMenuItemAnterioresAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAuditoriaDetalle"));		
		
		
		this.jButtonSiguientesAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"SiguientesAuditoriaDetalle"));
		
		
		this.jButtonSiguientesToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAuditoriaDetalle"));
			
		this.jMenuItemSiguientesAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAuditoriaDetalle"));
			
		this.jMenuItemAbrirOrderByAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAuditoriaDetalle"));
			
		this.jMenuItemMostrarOcultarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAuditoriaDetalle"));
			
		this.jMenuItemDetalleAbrirOrderByAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAuditoriaDetalle"));
			
		this.jMenuItemDetalleMostarOcultarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAuditoriaDetalle"));		
		
		
		this.jButtonNuevoGuardarCambiosAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAuditoriaDetalle"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAuditoriaDetalle"));
			
		this.jMenuItemNuevoGuardarCambiosAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAuditoriaDetalle"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAuditoriaDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAuditoriaDetalle"));

		this.jCheckBoxSeleccionadosAuditoriaDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAuditoriaDetalle"));
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAuditoriaDetalle"));
		}
		
		
		this.jComboBoxTiposRelacionesAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"TiposRelacionesAuditoriaDetalle"));
			
		this.jComboBoxTiposAccionesAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesAuditoriaDetalle"));
					
		this.jComboBoxTiposSeleccionarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAuditoriaDetalle"));
			
		this.jTextFieldValorCampoGeneralAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAuditoriaDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonidAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idAuditoriaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonid_auditoriaAuditoriaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_auditoriaAuditoriaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonid_auditoriaAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_auditoriaAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonnombre_campoAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_campoAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonvalor_anteriorAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valor_anteriorAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonvalor_actualAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valor_actualAuditoriaDetalleBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"BusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle"));

			this.jButtonFK_IdAuditoriaAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"FK_IdAuditoriaAuditoriaDetalle"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAuditoriaDetalle!=null) {
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAuditoriaDetalle"));
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAuditoriaDetalle"));
				this.jInternalFrameReporteDinamicoAuditoriaDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAuditoriaDetalle"));
			}
			
			//this.jButtonCerrarReporteDinamicoAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAuditoriaDetalle"));				
			//this.jButtonGenerarReporteDinamicoAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAuditoriaDetalle"));
			//this.jButtonGenerarExcelReporteDinamicoAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAuditoriaDetalle"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAuditoriaDetalle!=null) {
				this.jInternalFrameImportacionAuditoriaDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAuditoriaDetalle"));
				this.jInternalFrameImportacionAuditoriaDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAuditoriaDetalle"));
				this.jInternalFrameImportacionAuditoriaDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAuditoriaDetalle"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByAuditoriaDetalle"));
			
			this.jButtonAbrirOrderByToolBarAuditoriaDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAuditoriaDetalle"));			
			
			if(this.jInternalFrameOrderByAuditoriaDetalle!=null) {
				this.jInternalFrameOrderByAuditoriaDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAuditoriaDetalle"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoriaDetalle.jTabbedPaneRelacionesAuditoriaDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAuditoriaDetalle"));
		
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
            		closingInternalFrameAuditoriaDetalle();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAuditoriaDetalle = (JInternalFrameBase)event.getSource();
	            	
	            AuditoriaDetalleBeanSwingJInternalFrame jInternalFrameParent=(AuditoriaDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormAuditoriaDetalle.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAuditoriaDetalleActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAuditoriaDetalle.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAuditoriaDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAuditoriaDetalle.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAuditoriaDetalle.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAuditoriaDetalle";
		inputMap = this.jButtonNuevoAuditoriaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAuditoriaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAuditoriaDetalleActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAuditoriaDetalle";
		inputMap = this.jButtonNuevoRelacionesAuditoriaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAuditoriaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAuditoriaDetalleActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAuditoriaDetalle";
		inputMap = this.jButtonModificarAuditoriaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAuditoriaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAuditoriaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAuditoriaDetalle";
		inputMap = this.jButtonActualizarAuditoriaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAuditoriaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAuditoriaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAuditoriaDetalle";
		inputMap = this.jButtonEliminarAuditoriaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAuditoriaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAuditoriaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAuditoriaDetalle";
		inputMap = this.jButtonCancelarAuditoriaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAuditoriaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAuditoriaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAuditoriaDetalle";
		inputMap = this.jButtonCerrarAuditoriaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAuditoriaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAuditoriaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAuditoriaDetalle";
		inputMap = this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosAuditoriaDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonGuardarCambiosAuditoriaDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAuditoriaDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAuditoriaDetalle.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAuditoriaDetalleItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAuditoriaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAuditoriaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAuditoriaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAuditoriaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAuditoriaDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAuditoriaDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonidAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idAuditoriaDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonid_auditoriaAuditoriaDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_auditoriaAuditoriaDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonid_auditoriaAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_auditoriaAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonnombre_campoAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"nombre_campoAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonvalor_anteriorAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valor_anteriorAuditoriaDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoriaDetalle.jButtonvalor_actualAuditoriaDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valor_actualAuditoriaDetalleBusqueda"));
		
		
		this.jButtonBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"BusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle"));

		this.jButtonFK_IdAuditoriaAuditoriaDetalle.addActionListener(new ButtonActionListener(this,"FK_IdAuditoriaAuditoriaDetalle"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAuditoriaDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAuditoriaDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAuditoriaDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAuditoriaDetalle.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAuditoriaDetalle(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
					auditoriadetalleAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AuditoriaDetalle auditoriadetalleAux:auditoriadetalles) {
					auditoriadetalleAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAuditoriaDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAuditoriaDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
						auditoriadetalleAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AuditoriaDetalle auditoriadetalleAux:auditoriadetalles) {
						auditoriadetalleAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AuditoriaDetalle auditoriadetalleAux:auditoriadetalles) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAuditoriaDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAuditoriaDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAuditoriaDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAuditoriaDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAuditoriaDetalle.getSelectedRows();
			
			AuditoriaDetalle auditoriadetalleLocal=new AuditoriaDetalle();
			
			//this.seleccionarTodosAuditoriaDetalle(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriadetalleLocal =(AuditoriaDetalle) this.auditoriadetalleLogic.getAuditoriaDetalles().toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					auditoriadetalleLocal =(AuditoriaDetalle) this.auditoriadetalles.toArray()[this.jTableDatosAuditoriaDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				auditoriadetalleLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
						auditoriadetalleAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AuditoriaDetalle auditoriadetalleAux:auditoriadetalles) {
						auditoriadetalleAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAuditoriaDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAuditoriaDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAuditoriaDetalleItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAuditoriaDetalleParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAuditoriaDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAuditoriaDetalle(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAuditoriaDetalle.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalleLogic.getAuditoriaDetalles()) {
				
						if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO)) {
							existe=true;
							auditoriadetalleAux.setnombre_campo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR)) {
							existe=true;
							auditoriadetalleAux.setvalor_anterior(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL)) {
							existe=true;
							auditoriadetalleAux.setvalor_actual(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AuditoriaDetalle auditoriadetalleAux:auditoriadetalles) {
					
						if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO)) {
							existe=true;
							auditoriadetalleAux.setnombre_campo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR)) {
							existe=true;
							auditoriadetalleAux.setvalor_anterior(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL)) {
							existe=true;
							auditoriadetalleAux.setvalor_actual(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAuditoriaDetalleActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAuditoriaDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAuditoriaDetalle=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAuditoriaDetalle.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAuditoriaDetalle) {				
					conSplash=true;//false;										
					
					//this.startProcessAuditoriaDetalle(conSplash);
				
					this.generarReporteAuditoriaDetallesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAuditoriaDetallesSeleccionados();
				//this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAuditoriaDetallesSeleccionados(false);
				//this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAuditoriaDetallesSeleccionados(true);
				//this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAuditoriaDetalle();
				
				this.exportarAuditoriaDetallesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAuditoriaDetalles();
				//this.importarAuditoriaDetalles();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAuditoriaDetalle();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAuditoriaDetallesSeleccionados();
				//this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Auditoria Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAuditoriaDetalle();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAuditoriaDetalle)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAuditoriaDetalle(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setSelectedIndex(0);					
				}	
			} 			
			else if(AuditoriaDetalleBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAuditoriaDetalle) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAuditoriaDetalle(conSplash);
					
						//this.actualizarParametrosGeneralAuditoriaDetalle();
						
						this.generarReporteProcesoAccionAuditoriaDetallesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AuditoriaDetalleBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Auditoria DetalleS SELECCIONADOS?", "MANTENIMIENTO DE Auditoria Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAuditoriaDetalle();
				
						this.actualizarParametrosGeneralAuditoriaDetalle();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.auditoriadetalleReturnGeneral=auditoriadetalleLogic.procesarAccionAuditoriaDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.auditoriadetalleLogic.getAuditoriaDetalles(),this.auditoriadetalleParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAuditoriaDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAuditoriaDetalle();
					
					AuditoriaDetalleBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAuditoriaDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAuditoriaDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAuditoriaDetalle(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAuditoriaDetalleActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAuditoriaDetalle();
			
			if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		
			AuditoriaDetalle auditoriadetalle=new AuditoriaDetalle();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAuditoriaDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAuditoriaDetalle.getSelectedItem();
			
			
			
			
			auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
			//this.sTipoAccion;
			
			if(auditoriadetallesSeleccionados.size()==1) {
				for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesSeleccionados) {
					auditoriadetalle=auditoriadetalleAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAuditoriaDetalle();
			
      		//this.finishProcessAuditoriaDetalle(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAuditoriaDetalleReturnGeneral() throws Exception {
		if(this.auditoriadetalleReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.auditoriadetalleReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.auditoriadetalleReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.auditoriadetalleReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.auditoriadetalleReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.auditoriadetalleReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAuditoriaDetalle(false);
		}
		
		if(this.auditoriadetalleReturnGeneral.getConRetornoLista() || this.auditoriadetalleReturnGeneral.getConRetornoObjeto()) {
			if(this.auditoriadetalleReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.auditoriadetalleLogic.setAuditoriaDetalles(this.auditoriadetalleReturnGeneral.getAuditoriaDetalles());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.auditoriadetalleReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.auditoriadetalleLogic.setAuditoriaDetalle(this.auditoriadetalleReturnGeneral.getAuditoriaDetalle());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAuditoriaDetalle(false);
		}
	}
	
	public void actualizarParametrosGeneralAuditoriaDetalle() throws Exception {
		
		
	}
	
	public ArrayList<AuditoriaDetalle> getAuditoriaDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAuditoriaDetalle) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AuditoriaDetalle auditoriadetalleAux:auditoriadetalleLogic.getAuditoriaDetalles()) {
					if(auditoriadetalleAux.getIsSelected()) {
						auditoriadetallesSeleccionados.add(auditoriadetalleAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AuditoriaDetalle auditoriadetalleAux:this.auditoriadetalles) {
					if(auditoriadetalleAux.getIsSelected()) {
						auditoriadetallesSeleccionados.add(auditoriadetalleAux);				
					}
				}
			}
			
			if(auditoriadetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						auditoriadetallesSeleccionados.addAll(this.auditoriadetalleLogic.getAuditoriaDetalles());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						auditoriadetallesSeleccionados.addAll(this.auditoriadetalles);				
					}
				}
			}
		} else {
			auditoriadetallesSeleccionados.add(this.auditoriadetalle);
		}
		
		return auditoriadetallesSeleccionados;
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
	
	public void generarReporteAuditoriaDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAuditoriaDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAuditoriaDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAuditoriaDetallesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAuditoriaDetallesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Auditoria Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAuditoriaDetallesSeleccionados() throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAuditoriaDetalles("Todos",auditoriadetallesSeleccionados);
		
	}	
	
	public void generarReporteNormalAuditoriaDetallesSeleccionados() throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAuditoriaDetalles("Todos",auditoriadetallesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAuditoriaDetallesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAuditoriaDetalles("Todos",auditoriadetallesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAuditoriaDetallesSeleccionados() throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAuditoriaDetalle();
		
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAuditoriaDetalle();
		
		
		//this.generarReporteAuditoriaDetalles("Todos",auditoriadetallesSeleccionados ,auditoriadetalleImplementable,auditoriadetalleImplementableHome);
	}
	
	public void mostrarImportacionAuditoriaDetalles() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAuditoriaDetalle();
		
		this.abrirFrameImportacionAuditoriaDetalle();		
		
			
		//this.generarReporteAuditoriaDetalles("Todos",auditoriadetallesSeleccionados ,auditoriadetalleImplementable,auditoriadetalleImplementableHome);
	}
	
	public void importarAuditoriaDetalles() throws Exception {		
	
	}
	
	public void exportarAuditoriaDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAuditoriaDetallesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAuditoriaDetallesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAuditoriaDetallesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Auditoria Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAuditoriaDetallesSeleccionados() throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoriadetalle."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAuditoriaDetalle(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAuditoriaDetalle(auditoriadetalleAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//auditoriadetalleAux.setsDetalleGeneralEntityReporte(auditoriadetalleAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAuditoriaDetalle(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AuditoriaDetalleConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaDetalleConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=auditoriadetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoriadetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoriadetalle.getauditoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoriadetalle.getnombre_campo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoriadetalle.getvalor_anterior();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoriadetalle.getvalor_actual();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAuditoriaDetallesSeleccionados() throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoriadetalle.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AuditoriaDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAuditoriaDetalle(row);				
				iRow++;
			}				
			
			for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAuditoriaDetalle(auditoriadetalleAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAuditoriaDetallesSeleccionados() throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();		
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoriadetalle.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("auditoriadetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("auditoriadetalle");
			//elementRoot.appendChild(element);
		
			for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesSeleccionados) {
				element = document.createElement("auditoriadetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAuditoriaDetalle(auditoriadetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAuditoriaDetalle(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(auditoriadetalle.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoriadetalle.getauditoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoriadetalle.getnombre_campo());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoriadetalle.getvalor_anterior());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoriadetalle.getvalor_actual());				
	}
	
	public void setFilaDatosExportarXmlAuditoriaDetalle(AuditoriaDetalle auditoriadetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AuditoriaDetalleConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(auditoriadetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AuditoriaDetalleConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(auditoriadetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementauditoria_descripcion = document.createElement(AuditoriaDetalleConstantesFunciones.IDAUDITORIA);
		elementauditoria_descripcion.appendChild(document.createTextNode(auditoriadetalle.getauditoria_descripcion()));
		element.appendChild(elementauditoria_descripcion);

		Element elementnombre_campo = document.createElement(AuditoriaDetalleConstantesFunciones.NOMBRECAMPO);
		elementnombre_campo.appendChild(document.createTextNode(auditoriadetalle.getnombre_campo().trim()));
		element.appendChild(elementnombre_campo);

		Element elementvalor_anterior = document.createElement(AuditoriaDetalleConstantesFunciones.VALORANTERIOR);
		elementvalor_anterior.appendChild(document.createTextNode(auditoriadetalle.getvalor_anterior().trim()));
		element.appendChild(elementvalor_anterior);

		Element elementvalor_actual = document.createElement(AuditoriaDetalleConstantesFunciones.VALORACTUAL);
		elementvalor_actual.appendChild(document.createTextNode(auditoriadetalle.getvalor_actual().trim()));
		element.appendChild(elementvalor_actual);
	}
	
	public void generarReporteGroupGenericoAuditoriaDetallesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados=new ArrayList<AuditoriaDetalle>();
		
		auditoriadetallesSeleccionados=this.getAuditoriaDetallesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAuditoriaDetalle(auditoriadetallesSeleccionados);
		
		this.generarReporteAuditoriaDetalles("Todos",auditoriadetallesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAuditoriaDetalle(ArrayList<AuditoriaDetalle> auditoriadetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AuditoriaDetalle auditoriadetalleAux:auditoriadetallesSeleccionados) {
				auditoriadetalleAux.setsDetalleGeneralEntityReporte(auditoriadetalleAux.toString());
			
				if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA)) {
					existe=true;
					auditoriadetalleAux.setsDescripcionGeneralEntityReporte1(auditoriadetalleAux.getauditoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO)) {
					existe=true;
					auditoriadetalleAux.setsDescripcionGeneralEntityReporte1(auditoriadetalleAux.getnombre_campo());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR)) {
					existe=true;
					auditoriadetalleAux.setsDescripcionGeneralEntityReporte1(auditoriadetalleAux.getvalor_anterior());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL)) {
					existe=true;
					auditoriadetalleAux.setsDescripcionGeneralEntityReporte1(auditoriadetalleAux.getvalor_actual());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAuditoriaDetalle(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAuditoriaDetalle=true;
				this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=true;
				this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=true;
			}
			
			this.isVisibilidadCeldaModificarAuditoriaDetalle=false;
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=false;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=false;
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=false;
			this.isVisibilidadCeldaModificarAuditoriaDetalle=false;
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=true;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=false;
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=false;
			this.isVisibilidadCeldaModificarAuditoriaDetalle=false;
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=true;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=true;
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=false;
			this.isVisibilidadCeldaModificarAuditoriaDetalle=false;
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=true;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=false;
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=true;
			this.isVisibilidadCeldaModificarAuditoriaDetalle=false;
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=false;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=false;
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=false;
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=false;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=false;
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=false;
			this.isVisibilidadCeldaModificarAuditoriaDetalle=true;
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=false;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=false;
			this.isVisibilidadCeldaCancelarAuditoriaDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarAuditoriaDetalle=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=true;
		} else {
			this.actualizarEstadoPanelsAuditoriaDetalle(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAuditoriaDetalle=false;
			//this.isVisibilidadCeldaVerFormAuditoriaDetalle=false;
			this.isVisibilidadCeldaDuplicarAuditoriaDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!auditoriadetalleSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
		} else {
			this.isVisibilidadCeldaNuevoAuditoriaDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoriaDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			if(!auditoriadetalleSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;												
			}
			
			this.jButtonCerrarAuditoriaDetalle.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAuditoriaDetalle=false;
		}
		
		if(!this.permiteMantenimiento(this.auditoriadetalle)) {
			this.isVisibilidadCeldaActualizarAuditoriaDetalle=false;
			this.isVisibilidadCeldaEliminarAuditoriaDetalle=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAuditoriaDetalle() {
	}
	
	public void actualizarEstadoPanelsAuditoriaDetalle(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAuditoriaDetalle!=null) {
				this.jScrollPanelDatosEdicionAuditoriaDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAuditoriaDetalle!=null) {
				this.jScrollPanelDatosAuditoriaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionAuditoriaDetalle!=null) {
				this.jPanelPaginacionAuditoriaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAuditoriaDetalle!=null) {
				this.jScrollPanelDatosEdicionAuditoriaDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAuditoriaDetalle!=null) {
				this.jScrollPanelDatosAuditoriaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionAuditoriaDetalle!=null) {
				this.jPanelPaginacionAuditoriaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAuditoriaDetalle!=null) {
				this.jScrollPanelDatosEdicionAuditoriaDetalle.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAuditoriaDetalle!=null) {
				this.jScrollPanelDatosAuditoriaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionAuditoriaDetalle!=null) {
				this.jPanelPaginacionAuditoriaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAuditoriaDetalle!=null) {
				this.jScrollPanelDatosEdicionAuditoriaDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAuditoriaDetalle!=null) {
				this.jScrollPanelDatosAuditoriaDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionAuditoriaDetalle!=null) {
				this.jPanelPaginacionAuditoriaDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAuditoriaDetalle!=null) {
				this.jScrollPanelDatosEdicionAuditoriaDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAuditoriaDetalle!=null) {
				this.jScrollPanelDatosAuditoriaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionAuditoriaDetalle!=null) {
				this.jPanelPaginacionAuditoriaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAuditoriaDetalle!=null) {
				this.jScrollPanelDatosEdicionAuditoriaDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAuditoriaDetalle!=null) {
				this.jScrollPanelDatosAuditoriaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionAuditoriaDetalle!=null) {
				this.jPanelPaginacionAuditoriaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAuditoriaDetalle!=null) {
				this.jScrollPanelDatosEdicionAuditoriaDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAuditoriaDetalle!=null) {
				this.jScrollPanelDatosAuditoriaDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionAuditoriaDetalle!=null) {
				this.jPanelPaginacionAuditoriaDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
					this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoriaDetalle!=null) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAuditoriaDetalle!=null) {
				this.jPanelParametrosReportesAuditoriaDetalle.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAuditoria(Boolean isParaAuditoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAuditoriaNegation=!isParaAuditoria;

			this.isVisibilidadBusquedaPorIdAuditoriaPorNombreCampo=isParaAuditoria;
			if(!this.isVisibilidadBusquedaPorIdAuditoriaPorNombreCampo) {this.jTabbedPaneBusquedasAuditoriaDetalle.remove(jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);}

			this.isVisibilidadFK_IdAuditoria=isParaAuditoria;
			if(!this.isVisibilidadFK_IdAuditoria) {this.jTabbedPaneBusquedasAuditoriaDetalle.remove(jPanelFK_IdAuditoriaAuditoriaDetalle);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AuditoriaDetalleSessionBean auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
		
		if(this.auditoriadetalleSessionBean==null) {
			this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
		}
		
		this.auditoriadetalleSessionBean.setsUltimaBusquedaAuditoriaDetalle(this.getsAccionBusqueda());
		this.auditoriadetalleSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.auditoriadetalleSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdAuditoriaPorNombreCampo")) {
			auditoriadetalleSessionBean.setid_auditoria(this.getid_auditoriaBusquedaPorIdAuditoriaPorNombreCampo());	
			auditoriadetalleSessionBean.setnombre_campo(this.getnombre_campoBusquedaPorIdAuditoriaPorNombreCampo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdAuditoria")) {
			auditoriadetalleSessionBean.setid_auditoria(this.getid_auditoriaFK_IdAuditoria());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AuditoriaDetalleSessionBean auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
		
		if(this.auditoriadetalleSessionBean==null) {
			this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
		}
		
		if(this.auditoriadetalleSessionBean.getsUltimaBusquedaAuditoriaDetalle()!=null&&!this.auditoriadetalleSessionBean.getsUltimaBusquedaAuditoriaDetalle().equals("")) {
			this.setsAccionBusqueda(auditoriadetalleSessionBean.getsUltimaBusquedaAuditoriaDetalle());
			this.setiNumeroPaginacion(auditoriadetalleSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(auditoriadetalleSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdAuditoriaPorNombreCampo")) {
				this.setid_auditoriaBusquedaPorIdAuditoriaPorNombreCampo(auditoriadetalleSessionBean.getid_auditoria());
				auditoriadetalleSessionBean.setid_auditoria(-1L);
				this.setnombre_campoBusquedaPorIdAuditoriaPorNombreCampo(auditoriadetalleSessionBean.getnombre_campo());
				auditoriadetalleSessionBean.setnombre_campo("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdAuditoria")) {
				this.setid_auditoriaFK_IdAuditoria(auditoriadetalleSessionBean.getid_auditoria());
				auditoriadetalleSessionBean.setid_auditoria(-1L);
			}
		}
		
		this.auditoriadetalleSessionBean.setsUltimaBusquedaAuditoriaDetalle("");
		this.auditoriadetalleSessionBean.setiNumeroPaginacion(AuditoriaDetalleConstantesFunciones.INUMEROPAGINACION);
		this.auditoriadetalleSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAuditoriaDetalle(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAuditoriaDetalle() {
		this.updateBorderResaltarBusquedasFormularioAuditoriaDetalle();
		this.updateVisibilidadBusquedasFormularioAuditoriaDetalle();
		this.updateHabilitarBusquedasFormularioAuditoriaDetalle();
	}
	
	public void updateBorderResaltarBusquedasFormularioAuditoriaDetalle() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAuditoriaDetalle.getComponents().length>0) {
	

		if(this.auditoriadetalleConstantesFunciones.resaltarBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle!=null) {
			index= this.jTabbedPaneBusquedasAuditoriaDetalle.indexOfComponent(this.jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoriaDetalle.getComponent(index);
				jPanel.setBorder(this.auditoriadetalleConstantesFunciones.resaltarBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
			}
		}

		if(this.auditoriadetalleConstantesFunciones.resaltarFK_IdAuditoriaAuditoriaDetalle!=null) {
			index= this.jTabbedPaneBusquedasAuditoriaDetalle.indexOfComponent(this.jPanelFK_IdAuditoriaAuditoriaDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoriaDetalle.getComponent(index);
				jPanel.setBorder(this.auditoriadetalleConstantesFunciones.resaltarFK_IdAuditoriaAuditoriaDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAuditoriaDetalle() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAuditoriaDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAuditoriaDetalle.indexOfComponent(this.jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoriaDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriadetalleConstantesFunciones.mostrarBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
			if(!this.auditoriadetalleConstantesFunciones.mostrarBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle && index>-1) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasAuditoriaDetalle.indexOfComponent(this.jPanelFK_IdAuditoriaAuditoriaDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoriaDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriadetalleConstantesFunciones.mostrarFK_IdAuditoriaAuditoriaDetalle);
			if(!this.auditoriadetalleConstantesFunciones.mostrarFK_IdAuditoriaAuditoriaDetalle && index>-1) {
				this.jTabbedPaneBusquedasAuditoriaDetalle.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAuditoriaDetalle() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAuditoriaDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAuditoriaDetalle.indexOfComponent(this.jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoriaDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriadetalleConstantesFunciones.activarBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
				this.jTabbedPaneBusquedasAuditoriaDetalle.setEnabledAt(index,this.auditoriadetalleConstantesFunciones.activarBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
			}

			index= this.jTabbedPaneBusquedasAuditoriaDetalle.indexOfComponent(this.jPanelFK_IdAuditoriaAuditoriaDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoriaDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriadetalleConstantesFunciones.activarFK_IdAuditoriaAuditoriaDetalle);
				this.jTabbedPaneBusquedasAuditoriaDetalle.setEnabledAt(index,this.auditoriadetalleConstantesFunciones.activarFK_IdAuditoriaAuditoriaDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAuditoriaDetalle(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdAuditoriaPorNombreCampo")) {
			index= this.jTabbedPaneBusquedasAuditoriaDetalle.indexOfComponent(this.jPanelBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);

			this.jTabbedPaneBusquedasAuditoriaDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoriaDetalle.getComponent(index);

			this.auditoriadetalleConstantesFunciones.setResaltarBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle(resaltar);

			jPanel.setBorder(this.auditoriadetalleConstantesFunciones.resaltarBusquedaPorIdAuditoriaPorNombreCampoAuditoriaDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdAuditoria")) {
			index= this.jTabbedPaneBusquedasAuditoriaDetalle.indexOfComponent(this.jPanelFK_IdAuditoriaAuditoriaDetalle);

			this.jTabbedPaneBusquedasAuditoriaDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoriaDetalle.getComponent(index);

			this.auditoriadetalleConstantesFunciones.setResaltarFK_IdAuditoriaAuditoriaDetalle(resaltar);

			jPanel.setBorder(this.auditoriadetalleConstantesFunciones.resaltarFK_IdAuditoriaAuditoriaDetalle);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAuditoriaDetalle.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAuditoriaDetalle() throws Exception {

		if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAuditoriaDetalle();
		this.updateVisibilidadResaltarControlesFormularioAuditoriaDetalle();
		this.updateHabilitarResaltarControlesFormularioAuditoriaDetalle();
		
	}
	
	public void updateBorderResaltarControlesFormularioAuditoriaDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.auditoriadetalleConstantesFunciones.resaltaridAuditoriaDetalle!=null && this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.setBorder(this.auditoriadetalleConstantesFunciones.resaltaridAuditoriaDetalle);}
		if(this.auditoriadetalleConstantesFunciones.resaltarid_auditoriaAuditoriaDetalle!=null && this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setBorder(this.auditoriadetalleConstantesFunciones.resaltarid_auditoriaAuditoriaDetalle);}
		if(this.auditoriadetalleConstantesFunciones.resaltarnombre_campoAuditoriaDetalle!=null && this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreanombre_campoAuditoriaDetalle.setBorder(this.auditoriadetalleConstantesFunciones.resaltarnombre_campoAuditoriaDetalle);}
		if(this.auditoriadetalleConstantesFunciones.resaltarvalor_anteriorAuditoriaDetalle!=null && this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_anteriorAuditoriaDetalle.setBorder(this.auditoriadetalleConstantesFunciones.resaltarvalor_anteriorAuditoriaDetalle);}
		if(this.auditoriadetalleConstantesFunciones.resaltarvalor_actualAuditoriaDetalle!=null && this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_actualAuditoriaDetalle.setBorder(this.auditoriadetalleConstantesFunciones.resaltarvalor_actualAuditoriaDetalle);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAuditoriaDetalle() throws Exception {		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
	
		//this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostraridAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelidAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostraridAuditoriaDetalle);
		//this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostrarid_auditoriaAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelid_auditoriaAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostrarid_auditoriaAuditoriaDetalle);
		//this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreanombre_campoAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostrarnombre_campoAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelnombre_campoAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostrarnombre_campoAuditoriaDetalle);
		//this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_anteriorAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostrarvalor_anteriorAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelvalor_anteriorAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostrarvalor_anteriorAuditoriaDetalle);
		//this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_actualAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostrarvalor_actualAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jPanelvalor_actualAuditoriaDetalle.setVisible(this.auditoriadetalleConstantesFunciones.mostrarvalor_actualAuditoriaDetalle);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAuditoriaDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormAuditoriaDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAuditoriaDetalle!=null) {
	
		this.jInternalFrameDetalleFormAuditoriaDetalle.jLabelidAuditoriaDetalle.setEnabled(this.auditoriadetalleConstantesFunciones.activaridAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jComboBoxid_auditoriaAuditoriaDetalle.setEnabled(this.auditoriadetalleConstantesFunciones.activarid_auditoriaAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreanombre_campoAuditoriaDetalle.setEnabled(this.auditoriadetalleConstantesFunciones.activarnombre_campoAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_anteriorAuditoriaDetalle.setEnabled(this.auditoriadetalleConstantesFunciones.activarvalor_anteriorAuditoriaDetalle);
		this.jInternalFrameDetalleFormAuditoriaDetalle.jTextAreavalor_actualAuditoriaDetalle.setEnabled(this.auditoriadetalleConstantesFunciones.activarvalor_actualAuditoriaDetalle);
		}
	}
	
		
}