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

import com.bydan.erp.seguridad.util.AuditoriaConstantesFunciones;
import com.bydan.erp.seguridad.util.AuditoriaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.AuditoriaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.AuditoriaBean;
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
public class AuditoriaBeanSwingJInternalFrame extends AuditoriaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AuditoriaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Auditoria> auditoriaValidator = new ClassValidator<Auditoria>(Auditoria.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Auditoria auditoria;	
	public Auditoria auditoriaAux;
	public Auditoria auditoriaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Auditoria auditoriaTotales;
	public Long idAuditoriaActual;
	public Long iIdNuevoAuditoria=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosAuditoriaDetalle=false;

	public Boolean getIsTienePermisosAuditoriaDetalle() {
		return isTienePermisosAuditoriaDetalle;
	}

	public void setIsTienePermisosAuditoriaDetalle(Boolean isTienePermisosAuditoriaDetalle) {
		this.isTienePermisosAuditoriaDetalle= isTienePermisosAuditoriaDetalle;
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
	
	public Boolean isPermisoTodoAuditoria;
	public Boolean isPermisoNuevoAuditoria;
	public Boolean isPermisoActualizarAuditoria;
	public Boolean isPermisoActualizarOriginalAuditoria;
	public Boolean isPermisoEliminarAuditoria;
	public Boolean isPermisoGuardarCambiosAuditoria;
	public Boolean isPermisoConsultaAuditoria;
	public Boolean isPermisoBusquedaAuditoria;
	public Boolean isPermisoReporteAuditoria;
	public Boolean isPermisoPaginacionMedioAuditoria;
	public Boolean isPermisoPaginacionAltoAuditoria;
	public Boolean isPermisoPaginacionTodoAuditoria;
	public Boolean isPermisoCopiarAuditoria;
	public Boolean isPermisoVerFormAuditoria;
	public Boolean isPermisoDuplicarAuditoria;
	public Boolean isPermisoOrdenAuditoria;
	
	
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
	
	public AuditoriaParameterReturnGeneral auditoriaReturnGeneral;
	public AuditoriaParameterReturnGeneral auditoriaParameterGeneral;
	
	

	public AuditoriaDetalleLogic auditoriadetalleLogic=null;

	public AuditoriaDetalleLogic getAuditoriaDetalleLogic() {
		return auditoriadetalleLogic;
	}

	public void setAuditoriaDetalleLogic(AuditoriaDetalleLogic auditoriadetalleLogic) {
		this.auditoriadetalleLogic = auditoriadetalleLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAuditoria=false;
	public Boolean esParaAccionDesdeFormularioAuditoria=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AuditoriaSessionBeanAdditional auditoriaSessionBeanAdditional=null;
	
	public AuditoriaSessionBeanAdditional getAuditoriaSessionBeanAdditional() {
		return this.auditoriaSessionBeanAdditional;
	}
	
	public void setAuditoriaSessionBeanAdditional(AuditoriaSessionBeanAdditional auditoriaSessionBeanAdditional) {
		try {
			this.auditoriaSessionBeanAdditional=auditoriaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AuditoriaBeanSwingJInternalFrameAdditional auditoriaBeanSwingJInternalFrameAdditional=null;
	//public class AuditoriaBeanSwingJInternalFrame
	
	public AuditoriaBeanSwingJInternalFrameAdditional getAuditoriaBeanSwingJInternalFrameAdditional() {
		return this.auditoriaBeanSwingJInternalFrameAdditional;
	}
	
	public void setAuditoriaBeanSwingJInternalFrameAdditional(AuditoriaBeanSwingJInternalFrameAdditional auditoriaBeanSwingJInternalFrameAdditional) {
		try {
			this.auditoriaBeanSwingJInternalFrameAdditional=auditoriaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AuditoriaLogic auditoriaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Auditoria auditoriaBean;
	public AuditoriaConstantesFunciones auditoriaConstantesFunciones;
	//public AuditoriaParameterReturnGeneral auditoriaReturnGeneral;
	
	//FK
	
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<Auditoria> auditorias;	
	//public List<Auditoria> auditoriasEliminados;
	//public List<Auditoria> auditoriasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAuditoria=false;
	public Boolean isVisibilidadCeldaDuplicarAuditoria=true;
	public Boolean isVisibilidadCeldaCopiarAuditoria=true;
	public Boolean isVisibilidadCeldaVerFormAuditoria=true;
	public Boolean isVisibilidadCeldaOrdenAuditoria=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAuditoria=false;
	public Boolean isVisibilidadCeldaModificarAuditoria=false;
	public Boolean isVisibilidadCeldaActualizarAuditoria=false;
	public Boolean isVisibilidadCeldaEliminarAuditoria=false;
	public Boolean isVisibilidadCeldaCancelarAuditoria=false;
	public Boolean isVisibilidadCeldaGuardarAuditoria=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAuditoria=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdUsuarioPorFechaHora=false;
	public Boolean isVisibilidadBusquedaPorIPPCPorFechaHora=false;
	public Boolean isVisibilidadBusquedaPorNombrePCPorFechaHora=false;
	public Boolean isVisibilidadBusquedaPorNombreTablaPorFechaHora=false;
	public Boolean isVisibilidadBusquedaPorObservacionesPorFechaHora=false;
	public Boolean isVisibilidadBusquedaPorProcesoPorFechaHora=false;
	public Boolean isVisibilidadBusquedaPorUsuarioPCPorFechaHora=false;
	public Boolean isVisibilidadFK_IdAuditoria=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoAuditoria() {
		return this.iIdNuevoAuditoria;
	}

	public void setiIdNuevoAuditoria(Long iIdNuevoAuditoria) {
		this.iIdNuevoAuditoria = iIdNuevoAuditoria;
	}
	
	public Long getidAuditoriaActual() {
		return this.idAuditoriaActual;
	}

	public void setidAuditoriaActual(Long idAuditoriaActual) {
		this.idAuditoriaActual = idAuditoriaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Auditoria getauditoria() {
		return this.auditoria;
	}

	public void setauditoria(Auditoria auditoria) {
		this.auditoria = auditoria;
	}
	
	public Auditoria getauditoriaAux() {
		return this.auditoriaAux;
	}

	public void setauditoriaAux(Auditoria auditoriaAux) {
		this.auditoriaAux = auditoriaAux;
	}				
	
	public Auditoria getauditoriaAnterior() {
		return this.auditoriaAnterior;
	}

	public void setauditoriaAnterior(Auditoria auditoriaAnterior) {
		this.auditoriaAnterior = auditoriaAnterior;
	}	
	
	public Auditoria getauditoriaTotales() {
		return this.auditoriaTotales;
	}

	public void setauditoriaTotales(Auditoria auditoriaTotales) {
		this.auditoriaTotales = auditoriaTotales;
	}	
	
	public Auditoria getauditoriaBean() {
		return this.auditoriaBean;
	}

	public void setauditoriaBean(Auditoria auditoriaBean) {
		this.auditoriaBean = auditoriaBean;
	}	
	
	public AuditoriaParameterReturnGeneral getauditoriaReturnGeneral() {
		return this.auditoriaReturnGeneral;
	}

	public void setauditoriaReturnGeneral(AuditoriaParameterReturnGeneral auditoriaReturnGeneral) {
		this.auditoriaReturnGeneral = auditoriaReturnGeneral;
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

	public Timestamp fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorIdUsuarioPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorIdUsuarioPorFechaHora(Timestamp fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora = fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora;
	}

	public String ip_pcBusquedaPorIPPCPorFechaHora="";

	public String getip_pcBusquedaPorIPPCPorFechaHora() {
		return this.ip_pcBusquedaPorIPPCPorFechaHora;
	}

	public void setip_pcBusquedaPorIPPCPorFechaHora(String ip_pcBusquedaPorIPPCPorFechaHora) {
		this.ip_pcBusquedaPorIPPCPorFechaHora = ip_pcBusquedaPorIPPCPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorIPPCPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorIPPCPorFechaHora() {
		return this.fecha_horaBusquedaPorIPPCPorFechaHora;
	}

	public void setfecha_horaBusquedaPorIPPCPorFechaHora(Timestamp fecha_horaBusquedaPorIPPCPorFechaHora) {
		this.fecha_horaBusquedaPorIPPCPorFechaHora = fecha_horaBusquedaPorIPPCPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorIPPCPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorIPPCPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorIPPCPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorIPPCPorFechaHora(Timestamp fecha_horaFinalBusquedaPorIPPCPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorIPPCPorFechaHora = fecha_horaFinalBusquedaPorIPPCPorFechaHora;
	}

	public String nombre_p_cBusquedaPorNombrePCPorFechaHora="";

	public String getnombre_p_cBusquedaPorNombrePCPorFechaHora() {
		return this.nombre_p_cBusquedaPorNombrePCPorFechaHora;
	}

	public void setnombre_p_cBusquedaPorNombrePCPorFechaHora(String nombre_p_cBusquedaPorNombrePCPorFechaHora) {
		this.nombre_p_cBusquedaPorNombrePCPorFechaHora = nombre_p_cBusquedaPorNombrePCPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorNombrePCPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorNombrePCPorFechaHora() {
		return this.fecha_horaBusquedaPorNombrePCPorFechaHora;
	}

	public void setfecha_horaBusquedaPorNombrePCPorFechaHora(Timestamp fecha_horaBusquedaPorNombrePCPorFechaHora) {
		this.fecha_horaBusquedaPorNombrePCPorFechaHora = fecha_horaBusquedaPorNombrePCPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorNombrePCPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorNombrePCPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorNombrePCPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorNombrePCPorFechaHora(Timestamp fecha_horaFinalBusquedaPorNombrePCPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorNombrePCPorFechaHora = fecha_horaFinalBusquedaPorNombrePCPorFechaHora;
	}

	public String nombre_tablaBusquedaPorNombreTablaPorFechaHora="";

	public String getnombre_tablaBusquedaPorNombreTablaPorFechaHora() {
		return this.nombre_tablaBusquedaPorNombreTablaPorFechaHora;
	}

	public void setnombre_tablaBusquedaPorNombreTablaPorFechaHora(String nombre_tablaBusquedaPorNombreTablaPorFechaHora) {
		this.nombre_tablaBusquedaPorNombreTablaPorFechaHora = nombre_tablaBusquedaPorNombreTablaPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorNombreTablaPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorNombreTablaPorFechaHora() {
		return this.fecha_horaBusquedaPorNombreTablaPorFechaHora;
	}

	public void setfecha_horaBusquedaPorNombreTablaPorFechaHora(Timestamp fecha_horaBusquedaPorNombreTablaPorFechaHora) {
		this.fecha_horaBusquedaPorNombreTablaPorFechaHora = fecha_horaBusquedaPorNombreTablaPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorNombreTablaPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorNombreTablaPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorNombreTablaPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorNombreTablaPorFechaHora(Timestamp fecha_horaFinalBusquedaPorNombreTablaPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorNombreTablaPorFechaHora = fecha_horaFinalBusquedaPorNombreTablaPorFechaHora;
	}

	public Timestamp fecha_horaBusquedaPorObservacionesPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorObservacionesPorFechaHora() {
		return this.fecha_horaBusquedaPorObservacionesPorFechaHora;
	}

	public void setfecha_horaBusquedaPorObservacionesPorFechaHora(Timestamp fecha_horaBusquedaPorObservacionesPorFechaHora) {
		this.fecha_horaBusquedaPorObservacionesPorFechaHora = fecha_horaBusquedaPorObservacionesPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorObservacionesPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorObservacionesPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorObservacionesPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorObservacionesPorFechaHora(Timestamp fecha_horaFinalBusquedaPorObservacionesPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorObservacionesPorFechaHora = fecha_horaFinalBusquedaPorObservacionesPorFechaHora;
	}

;
	public String observacionBusquedaPorObservacionesPorFechaHora="";

	public String getobservacionBusquedaPorObservacionesPorFechaHora() {
		return this.observacionBusquedaPorObservacionesPorFechaHora;
	}

	public void setobservacionBusquedaPorObservacionesPorFechaHora(String observacionBusquedaPorObservacionesPorFechaHora) {
		this.observacionBusquedaPorObservacionesPorFechaHora = observacionBusquedaPorObservacionesPorFechaHora;
	}

	public String procesoBusquedaPorProcesoPorFechaHora="";

	public String getprocesoBusquedaPorProcesoPorFechaHora() {
		return this.procesoBusquedaPorProcesoPorFechaHora;
	}

	public void setprocesoBusquedaPorProcesoPorFechaHora(String procesoBusquedaPorProcesoPorFechaHora) {
		this.procesoBusquedaPorProcesoPorFechaHora = procesoBusquedaPorProcesoPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorProcesoPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorProcesoPorFechaHora() {
		return this.fecha_horaBusquedaPorProcesoPorFechaHora;
	}

	public void setfecha_horaBusquedaPorProcesoPorFechaHora(Timestamp fecha_horaBusquedaPorProcesoPorFechaHora) {
		this.fecha_horaBusquedaPorProcesoPorFechaHora = fecha_horaBusquedaPorProcesoPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorProcesoPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorProcesoPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorProcesoPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorProcesoPorFechaHora(Timestamp fecha_horaFinalBusquedaPorProcesoPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorProcesoPorFechaHora = fecha_horaFinalBusquedaPorProcesoPorFechaHora;
	}

	public String usuario_p_cBusquedaPorUsuarioPCPorFechaHora="";

	public String getusuario_p_cBusquedaPorUsuarioPCPorFechaHora() {
		return this.usuario_p_cBusquedaPorUsuarioPCPorFechaHora;
	}

	public void setusuario_p_cBusquedaPorUsuarioPCPorFechaHora(String usuario_p_cBusquedaPorUsuarioPCPorFechaHora) {
		this.usuario_p_cBusquedaPorUsuarioPCPorFechaHora = usuario_p_cBusquedaPorUsuarioPCPorFechaHora;
	}

;
	public Timestamp fecha_horaBusquedaPorUsuarioPCPorFechaHora=new Timestamp((new Date()).getTime());

	public Timestamp getfecha_horaBusquedaPorUsuarioPCPorFechaHora() {
		return this.fecha_horaBusquedaPorUsuarioPCPorFechaHora;
	}

	public void setfecha_horaBusquedaPorUsuarioPCPorFechaHora(Timestamp fecha_horaBusquedaPorUsuarioPCPorFechaHora) {
		this.fecha_horaBusquedaPorUsuarioPCPorFechaHora = fecha_horaBusquedaPorUsuarioPCPorFechaHora;
	}

	public Timestamp fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora;

	public Timestamp getfecha_horaFinalBusquedaPorUsuarioPCPorFechaHora()
	{
		return this.fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora;
	}

	public void setfecha_horaFinalBusquedaPorUsuarioPCPorFechaHora(Timestamp fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora) 
	{
		this.fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora = fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora;
	}

	public Long id_filaFK_IdAuditoria=0L;

	public Long getid_filaFK_IdAuditoria() {
		return this.id_filaFK_IdAuditoria;
	}

	public void setid_filaFK_IdAuditoria(Long id_filaFK_IdAuditoria) {
		this.id_filaFK_IdAuditoria = id_filaFK_IdAuditoria;
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
	
	
	public AuditoriaLogic getAuditoriaLogic()	{		
		return auditoriaLogic;
	}

	public void setAuditoriaLogic(AuditoriaLogic auditoriaLogic) {
		this.auditoriaLogic = auditoriaLogic;
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
	
	public Boolean getIsEsNuevoAuditoria() {
		return isEsNuevoAuditoria;
	}

	public void setIsEsNuevoAuditoria(Boolean isEsNuevoAuditoria) {
		this.isEsNuevoAuditoria = isEsNuevoAuditoria;
	}

	public Boolean getEsParaAccionDesdeFormularioAuditoria() {
		return esParaAccionDesdeFormularioAuditoria;
	}
	
	public void setEsParaAccionDesdeFormularioAuditoria(Boolean esParaAccionDesdeFormularioAuditoria) {
		this.esParaAccionDesdeFormularioAuditoria = esParaAccionDesdeFormularioAuditoria;
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

			if(this.auditoriaSessionBean==null) {
				this.auditoriaSessionBean=new AuditoriaSessionBean();
			}

			if(!this.auditoriaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(auditoriaSessionBean.getlidUsuarioActual());
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

					if(this.auditoria!=null) {
						this.auditoria.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormAuditoria!=null) {
						this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioAuditoria.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormAuditoria!=null) {
						if(this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.getItemCount()>0) {
							this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria!=null) {
						jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria!=null) {
							//jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.getItemCount()>0) {
								jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioAuditoriaGenerico)throws Exception
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
				jComboBoxid_usuarioAuditoriaGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioAuditoriaGenerico!=null && jComboBoxid_usuarioAuditoriaGenerico.getItemCount()>0) {
					jComboBoxid_usuarioAuditoriaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(Auditoria auditoria,JComboBox jComboBoxid_usuarioAuditoriaGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioAuditoriaGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioAuditoriaGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				auditoria.setid_usuario(usuarioAux.getId());
				auditoria.setusuario_descripcion(AuditoriaConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				auditoria.setUsuario(usuarioAux);			}
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

					if(!AuditoriaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAuditoria!=null) { 
							this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAuditoria!=null) { 
					}

					if(!AuditoriaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AuditoriaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.addItem(usuario);
							}
						}

						if(!AuditoriaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAuditoria!=null) {
							this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormAuditoria!=null) {
							this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAuditoria() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AuditoriaConstantesFunciones.refrescarForeignKeysDescripcionesAuditoria(this.auditoriaLogic.getAuditorias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AuditoriaConstantesFunciones.refrescarForeignKeysDescripcionesAuditoria(this.auditorias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Usuario.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//auditoriaLogic.setAuditorias(this.auditorias);
			auditoriaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AuditoriaParameterReturnGeneral getAuditoriaParameterGeneral() {
		return this.auditoriaParameterGeneral;
	}
	
	public void setAuditoriaParameterGeneral(AuditoriaParameterReturnGeneral auditoriaParameterGeneral) {
		this.auditoriaParameterGeneral = auditoriaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAuditoria() {
		return isPermisoTodoAuditoria;
	}

	public void setIsPermisoTodoAuditoria(Boolean isPermisoTodoAuditoria) {
		this.isPermisoTodoAuditoria = isPermisoTodoAuditoria;
	}

	public Boolean getIsPermisoNuevoAuditoria() {
		return isPermisoNuevoAuditoria;
	}

	public void setIsPermisoNuevoAuditoria(Boolean isPermisoNuevoAuditoria) {
		this.isPermisoNuevoAuditoria = isPermisoNuevoAuditoria;
	}

	public Boolean getIsPermisoActualizarAuditoria() {
		return isPermisoActualizarAuditoria;
	}

	public void setIsPermisoActualizarAuditoria(Boolean isPermisoActualizarAuditoria) {
		this.isPermisoActualizarAuditoria = isPermisoActualizarAuditoria;
	}

	public Boolean getIsPermisoEliminarAuditoria() {
		return isPermisoEliminarAuditoria;
	}

	public void setIsPermisoEliminarAuditoria(Boolean isPermisoEliminarAuditoria) {
		this.isPermisoEliminarAuditoria = isPermisoEliminarAuditoria;
	}

	public Boolean getIsPermisoGuardarCambiosAuditoria() {
		return isPermisoGuardarCambiosAuditoria;
	}

	public void setIsPermisoGuardarCambiosAuditoria(Boolean isPermisoGuardarCambiosAuditoria) {
		this.isPermisoGuardarCambiosAuditoria = isPermisoGuardarCambiosAuditoria;
	}
	
	public Boolean getIsPermisoConsultaAuditoria() {
		return isPermisoConsultaAuditoria;
	}

	public void setIsPermisoConsultaAuditoria(Boolean isPermisoConsultaAuditoria) {
		this.isPermisoConsultaAuditoria = isPermisoConsultaAuditoria;
	}

	public Boolean getIsPermisoBusquedaAuditoria() {
		return isPermisoBusquedaAuditoria;
	}

	public void setIsPermisoBusquedaAuditoria(Boolean isPermisoBusquedaAuditoria) {
		this.isPermisoBusquedaAuditoria = isPermisoBusquedaAuditoria;
	}

	public Boolean getIsPermisoReporteAuditoria() {
		return isPermisoReporteAuditoria;
	}

	public void setIsPermisoReporteAuditoria(Boolean isPermisoReporteAuditoria) {
		this.isPermisoReporteAuditoria = isPermisoReporteAuditoria;
	}
	
	public Boolean getIsPermisoPaginacionMedioAuditoria() {
		return isPermisoPaginacionMedioAuditoria;
	}

	public void setIsPermisoPaginacionMedioAuditoria(Boolean isPermisoPaginacionMedioAuditoria) {
		this.isPermisoPaginacionMedioAuditoria = isPermisoPaginacionMedioAuditoria;
	}
	
	public Boolean getIsPermisoPaginacionTodoAuditoria() {
		return isPermisoPaginacionTodoAuditoria;
	}

	public void setIsPermisoPaginacionTodoAuditoria(Boolean isPermisoPaginacionTodoAuditoria) {
		this.isPermisoPaginacionTodoAuditoria = isPermisoPaginacionTodoAuditoria;
	}
	
	public Boolean getIsPermisoPaginacionAltoAuditoria() {
		return isPermisoPaginacionAltoAuditoria;
	}

	public void setIsPermisoPaginacionAltoAuditoria(Boolean isPermisoPaginacionAltoAuditoria) {
		this.isPermisoPaginacionAltoAuditoria = isPermisoPaginacionAltoAuditoria;
	}
	
	public Boolean getIsPermisoCopiarAuditoria() {
		return isPermisoCopiarAuditoria;
	}

	public void setIsPermisoCopiarAuditoria(Boolean isPermisoCopiarAuditoria) {
		this.isPermisoCopiarAuditoria = isPermisoCopiarAuditoria;
	}
	
	public Boolean getIsPermisoVerFormAuditoria() {
		return isPermisoVerFormAuditoria;
	}

	public void setIsPermisoVerFormAuditoria(Boolean isPermisoVerFormAuditoria) {
		this.isPermisoVerFormAuditoria = isPermisoVerFormAuditoria;
	}
	
	public Boolean getIsPermisoDuplicarAuditoria() {
		return isPermisoDuplicarAuditoria;
	}

	public void setIsPermisoDuplicarAuditoria(Boolean isPermisoDuplicarAuditoria) {
		this.isPermisoDuplicarAuditoria = isPermisoDuplicarAuditoria;
	}
	
	public Boolean getIsPermisoOrdenAuditoria() {
		return isPermisoOrdenAuditoria;
	}

	public void setIsPermisoOrdenAuditoria(Boolean isPermisoOrdenAuditoria) {
		this.isPermisoOrdenAuditoria = isPermisoOrdenAuditoria;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAuditoria() {
		return isVisibilidadCeldaNuevoAuditoria;
	}

	public void setIsVisibilidadCeldaNuevoAuditoria(Boolean isVisibilidadCeldaNuevoAuditoria) {
		this.isVisibilidadCeldaNuevoAuditoria = isVisibilidadCeldaNuevoAuditoria;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAuditoria() {
		return isVisibilidadCeldaDuplicarAuditoria;
	}

	public void setIsVisibilidadCeldaDuplicarAuditoria(Boolean isVisibilidadCeldaDuplicarAuditoria) {
		this.isVisibilidadCeldaDuplicarAuditoria = isVisibilidadCeldaDuplicarAuditoria;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAuditoria() {
		return isVisibilidadCeldaCopiarAuditoria;
	}

	public void setIsVisibilidadCeldaCopiarAuditoria(Boolean isVisibilidadCeldaCopiarAuditoria) {
		this.isVisibilidadCeldaCopiarAuditoria = isVisibilidadCeldaCopiarAuditoria;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAuditoria() {
		return isVisibilidadCeldaVerFormAuditoria;
	}

	public void setIsVisibilidadCeldaVerFormAuditoria(Boolean isVisibilidadCeldaVerFormAuditoria) {
		this.isVisibilidadCeldaVerFormAuditoria = isVisibilidadCeldaVerFormAuditoria;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAuditoria() {
		return isVisibilidadCeldaOrdenAuditoria;
	}

	public void setIsVisibilidadCeldaOrdenAuditoria(Boolean isVisibilidadCeldaOrdenAuditoria) {
		this.isVisibilidadCeldaOrdenAuditoria = isVisibilidadCeldaOrdenAuditoria;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAuditoria() {
		return isVisibilidadCeldaNuevoRelacionesAuditoria;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAuditoria(Boolean isVisibilidadCeldaNuevoRelacionesAuditoria) {
		this.isVisibilidadCeldaNuevoRelacionesAuditoria = isVisibilidadCeldaNuevoRelacionesAuditoria;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAuditoria() {
		return isVisibilidadCeldaModificarAuditoria;
	}

	public void setIsVisibilidadCeldaModificarAuditoria(Boolean isVisibilidadCeldaModificarAuditoria) {
		this.isVisibilidadCeldaModificarAuditoria = isVisibilidadCeldaModificarAuditoria;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAuditoria() {
		return isVisibilidadCeldaActualizarAuditoria;
	}

	public void setIsVisibilidadCeldaActualizarAuditoria(Boolean isVisibilidadCeldaActualizarAuditoria) {
		this.isVisibilidadCeldaActualizarAuditoria = isVisibilidadCeldaActualizarAuditoria;
	}

	public Boolean getIsVisibilidadCeldaEliminarAuditoria() {
		return isVisibilidadCeldaEliminarAuditoria;
	}

	public void setIsVisibilidadCeldaEliminarAuditoria(Boolean isVisibilidadCeldaEliminarAuditoria) {
		this.isVisibilidadCeldaEliminarAuditoria = isVisibilidadCeldaEliminarAuditoria;
	}

	public Boolean getIsVisibilidadCeldaCancelarAuditoria() {
		return isVisibilidadCeldaCancelarAuditoria;
	}

	public void setIsVisibilidadCeldaCancelarAuditoria(Boolean isVisibilidadCeldaCancelarAuditoria) {
		this.isVisibilidadCeldaCancelarAuditoria = isVisibilidadCeldaCancelarAuditoria;
	}

	public Boolean getIsVisibilidadCeldaGuardarAuditoria() {
		return isVisibilidadCeldaGuardarAuditoria;
	}

	public void setIsVisibilidadCeldaGuardarAuditoria(Boolean isVisibilidadCeldaGuardarAuditoria) {
		this.isVisibilidadCeldaGuardarAuditoria = isVisibilidadCeldaGuardarAuditoria;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAuditoria() {
		return isVisibilidadCeldaGuardarCambiosAuditoria;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAuditoria(Boolean isVisibilidadCeldaGuardarCambiosAuditoria) {
		this.isVisibilidadCeldaGuardarCambiosAuditoria = isVisibilidadCeldaGuardarCambiosAuditoria;
	}
		
	public AuditoriaSessionBean getauditoriaSessionBean() {
		return this.auditoriaSessionBean;
	}
	
	public void setauditoriaSessionBean(AuditoriaSessionBean auditoriaSessionBean) {
		this.auditoriaSessionBean=auditoriaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdUsuarioPorFechaHora() {
		return this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora;
	}

	public void setisVisibilidadBusquedaPorIdUsuarioPorFechaHora(Boolean isVisibilidadBusquedaPorIdUsuarioPorFechaHora) {
		this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora=isVisibilidadBusquedaPorIdUsuarioPorFechaHora;
	}

	public Boolean getisVisibilidadBusquedaPorIPPCPorFechaHora() {
		return this.isVisibilidadBusquedaPorIPPCPorFechaHora;
	}

	public void setisVisibilidadBusquedaPorIPPCPorFechaHora(Boolean isVisibilidadBusquedaPorIPPCPorFechaHora) {
		this.isVisibilidadBusquedaPorIPPCPorFechaHora=isVisibilidadBusquedaPorIPPCPorFechaHora;
	}

	public Boolean getisVisibilidadBusquedaPorNombrePCPorFechaHora() {
		return this.isVisibilidadBusquedaPorNombrePCPorFechaHora;
	}

	public void setisVisibilidadBusquedaPorNombrePCPorFechaHora(Boolean isVisibilidadBusquedaPorNombrePCPorFechaHora) {
		this.isVisibilidadBusquedaPorNombrePCPorFechaHora=isVisibilidadBusquedaPorNombrePCPorFechaHora;
	}

	public Boolean getisVisibilidadBusquedaPorNombreTablaPorFechaHora() {
		return this.isVisibilidadBusquedaPorNombreTablaPorFechaHora;
	}

	public void setisVisibilidadBusquedaPorNombreTablaPorFechaHora(Boolean isVisibilidadBusquedaPorNombreTablaPorFechaHora) {
		this.isVisibilidadBusquedaPorNombreTablaPorFechaHora=isVisibilidadBusquedaPorNombreTablaPorFechaHora;
	}

	public Boolean getisVisibilidadBusquedaPorObservacionesPorFechaHora() {
		return this.isVisibilidadBusquedaPorObservacionesPorFechaHora;
	}

	public void setisVisibilidadBusquedaPorObservacionesPorFechaHora(Boolean isVisibilidadBusquedaPorObservacionesPorFechaHora) {
		this.isVisibilidadBusquedaPorObservacionesPorFechaHora=isVisibilidadBusquedaPorObservacionesPorFechaHora;
	}

	public Boolean getisVisibilidadBusquedaPorProcesoPorFechaHora() {
		return this.isVisibilidadBusquedaPorProcesoPorFechaHora;
	}

	public void setisVisibilidadBusquedaPorProcesoPorFechaHora(Boolean isVisibilidadBusquedaPorProcesoPorFechaHora) {
		this.isVisibilidadBusquedaPorProcesoPorFechaHora=isVisibilidadBusquedaPorProcesoPorFechaHora;
	}

	public Boolean getisVisibilidadBusquedaPorUsuarioPCPorFechaHora() {
		return this.isVisibilidadBusquedaPorUsuarioPCPorFechaHora;
	}

	public void setisVisibilidadBusquedaPorUsuarioPCPorFechaHora(Boolean isVisibilidadBusquedaPorUsuarioPCPorFechaHora) {
		this.isVisibilidadBusquedaPorUsuarioPCPorFechaHora=isVisibilidadBusquedaPorUsuarioPCPorFechaHora;
	}

	public Boolean getisVisibilidadFK_IdAuditoria() {
		return this.isVisibilidadFK_IdAuditoria;
	}

	public void setisVisibilidadFK_IdAuditoria(Boolean isVisibilidadFK_IdAuditoria) {
		this.isVisibilidadFK_IdAuditoria=isVisibilidadFK_IdAuditoria;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAuditoria(Auditoria auditoria)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioForeignKey(auditoria,null);
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
	
	public void bugActualizarReferenciaActual(Auditoria auditoria,Auditoria auditoriaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAuditoria(auditoria);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		auditoriaAux.setId(auditoria.getId());
		auditoriaAux.setVersionRow(auditoria.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAuditoria();
		
			int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = auditoriaValidator.getInvalidValues(this.auditoria);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			auditoriaLogic.setDatosCliente(datosCliente);
			auditoriaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				auditoriaAux=new  Auditoria();
				
				auditoriaAux.setIsNew(true);
				auditoriaAux.setIsChanged(true);
				
				auditoriaAux.setAuditoriaOriginal(this.auditoria);
				
				auditoriaAux.setId(this.auditoria.getId());	
				auditoriaAux.setVersionRow(this.auditoria.getVersionRow());	
				auditoriaAux.setid_usuario(this.auditoria.getid_usuario());	
				auditoriaAux.setnombre_tabla(this.auditoria.getnombre_tabla());	
				auditoriaAux.setid_fila(this.auditoria.getid_fila());	
				auditoriaAux.setaccion(this.auditoria.getaccion());	
				auditoriaAux.setproceso(this.auditoria.getproceso());	
				auditoriaAux.setnombre_p_c(this.auditoria.getnombre_p_c());	
				auditoriaAux.setip_pc(this.auditoria.getip_pc());	
				auditoriaAux.setusuario_p_c(this.auditoria.getusuario_p_c());	
				auditoriaAux.setfecha_hora(this.auditoria.getfecha_hora());	
				auditoriaAux.setobservacion(this.auditoria.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.auditoriaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(auditoriaAux,auditoriaLogic.getAuditorias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(auditoriaAux,auditorias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.auditoriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.auditoriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.saveAuditorias();//WithConnection
						//auditoriaLogic.getSetVersionRowAuditorias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.auditoria,auditoriaAux);
					
					this.refrescarForeignKeysDescripcionesAuditoria();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles().addAll(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalles.addAll(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetallesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								auditoriaLogic.saveAuditoriaRelaciones(auditoriaAux,this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles());//WithConnection
								//auditoriaLogic.getSetVersionRowAuditorias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.auditoria,auditoriaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.setAuditoriaDetalles(new ArrayList<AuditoriaDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalles= new ArrayList<AuditoriaDetalle>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							auditoriaAux.setAuditoriaDetalles(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.auditoriaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(auditoriaAux,auditoriaLogic.getAuditorias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(auditoriaAux,auditorias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.auditoria,auditoriaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				auditoriaAux=new  Auditoria();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.auditoriaSessionBean.getEsGuardarRelacionado() 
					|| (this.auditoriaSessionBean.getEsGuardarRelacionado() && this.auditoria.getId()>=0)) {
						
					auditoriaAux.setIsNew(false);
				}
				
				auditoriaAux.setIsDeleted(false);
			
				auditoriaAux.setId(this.auditoria.getId());	
				auditoriaAux.setVersionRow(this.auditoria.getVersionRow());	
				auditoriaAux.setid_usuario(this.auditoria.getid_usuario());	
				auditoriaAux.setnombre_tabla(this.auditoria.getnombre_tabla());	
				auditoriaAux.setid_fila(this.auditoria.getid_fila());	
				auditoriaAux.setaccion(this.auditoria.getaccion());	
				auditoriaAux.setproceso(this.auditoria.getproceso());	
				auditoriaAux.setnombre_p_c(this.auditoria.getnombre_p_c());	
				auditoriaAux.setip_pc(this.auditoria.getip_pc());	
				auditoriaAux.setusuario_p_c(this.auditoria.getusuario_p_c());	
				auditoriaAux.setfecha_hora(this.auditoria.getfecha_hora());	
				auditoriaAux.setobservacion(this.auditoria.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(auditoriaAux,auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(auditoriaAux,auditorias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.auditoriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.auditoriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.saveAuditorias();//WithConnection
						//auditoriaLogic.getSetVersionRowAuditorias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.auditoria,auditoriaAux);
					
					this.refrescarForeignKeysDescripcionesAuditoria();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles().addAll(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalles.addAll(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetallesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								auditoriaLogic.saveAuditoriaRelaciones(auditoriaAux,this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles());//WithConnection
								//auditoriaLogic.getSetVersionRowAuditorias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.auditoria,auditoriaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.setAuditoriaDetalles(new ArrayList<AuditoriaDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalles= new ArrayList<AuditoriaDetalle>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							auditoriaAux.setAuditoriaDetalles(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.auditoriaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(auditoriaAux,auditoriaLogic.getAuditorias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(auditoriaAux,auditorias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.auditoria,auditoriaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				auditoriaAux=new  Auditoria();
				
				auditoriaAux.setIsNew(false);
				auditoriaAux.setIsChanged(false);
				
				auditoriaAux.setIsDeleted(true);
				
				auditoriaAux.setId(this.auditoria.getId());	
				auditoriaAux.setVersionRow(this.auditoria.getVersionRow());	
				auditoriaAux.setid_usuario(this.auditoria.getid_usuario());	
				auditoriaAux.setnombre_tabla(this.auditoria.getnombre_tabla());	
				auditoriaAux.setid_fila(this.auditoria.getid_fila());	
				auditoriaAux.setaccion(this.auditoria.getaccion());	
				auditoriaAux.setproceso(this.auditoria.getproceso());	
				auditoriaAux.setnombre_p_c(this.auditoria.getnombre_p_c());	
				auditoriaAux.setip_pc(this.auditoria.getip_pc());	
				auditoriaAux.setusuario_p_c(this.auditoria.getusuario_p_c());	
				auditoriaAux.setfecha_hora(this.auditoria.getfecha_hora());	
				auditoriaAux.setobservacion(this.auditoria.getobservacion());	
				
				if(this.auditoriaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.auditoriaAux.getId()>=0) {	
						this.auditoriasEliminados.add(auditoriaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(auditoriaAux,auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(auditoriaAux,auditorias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.auditoriaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.auditoriaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.saveAuditorias();//WithConnection
						//auditoriaLogic.getSetVersionRowAuditorias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles().addAll(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetallesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalles.addAll(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetallesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								auditoriaLogic.saveAuditoriaRelaciones(auditoriaAux,this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles());//WithConnection
								//auditoriaLogic.getSetVersionRowAuditorias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.setAuditoriaDetalles(new ArrayList<AuditoriaDetalle>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalles= new ArrayList<AuditoriaDetalle>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							auditoriaAux.setAuditoriaDetalles(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.auditoriaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(auditoriaAux,auditoriaLogic.getAuditorias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(auditoriaAux,auditorias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getAuditorias().addAll(this.auditoriasEliminados);
					
					auditoriaLogic.saveAuditorias();//WithConnection
					//auditoriaLogic.getSetVersionRowAuditorias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAuditoria();
				
				this.auditoriasEliminados= new ArrayList<Auditoria>();		
			}
			
			if(this.auditoriaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Auditoria GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.auditoria=auditoriaAux;
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
      		//this.finishProcessAuditoria();
      	}
		
	}	
	
	public void actualizarRelaciones(Auditoria auditoriaLocal) throws Exception {
		
		if(this.auditoriaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				auditoriaLocal.setAuditoriaDetalles(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles());
			
			} else {
			
				auditoriaLocal.setAuditoriaDetalles(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalles);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Auditoria auditoriaLocal) throws Exception {	
		if(this.auditoriaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				auditoriaLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAuditoriaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = auditoriaValidator.getInvalidValues(this.auditoria);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Auditoria auditoria,List<Auditoria> auditorias) throws Exception {
		try	{		
			AuditoriaConstantesFunciones.actualizarLista(auditoria,auditorias,this.auditoriaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Auditoria auditoria,List<Auditoria> auditorias) throws Exception {
		try	{			
			AuditoriaConstantesFunciones.actualizarSelectedLista(auditoria,auditorias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Auditoria> auditoriasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				auditoriasLocal=this.auditoriaLogic.getAuditorias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				auditoriasLocal=this.auditorias;
			}
			//ARCHITECTURE
		
			for(Auditoria auditoriaLocal:auditoriasLocal) {
				if(this.permiteMantenimiento(auditoriaLocal) && auditoriaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AuditoriaConstantesFunciones.getAuditoriaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelid_usuarioAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.NOMBRETABLA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelnombre_tablaAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.IDFILA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelid_filaAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.ACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelaccionAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.PROCESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelprocesoAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.NOMBREPC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelnombre_p_cAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.IPPC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelip_pcAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.USUARIOPC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelusuario_p_cAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.FECHAHORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelfecha_horaAuditoria,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AuditoriaConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelobservacionAuditoria,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelid_usuarioAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelnombre_tablaAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelid_filaAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelaccionAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelprocesoAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelnombre_p_cAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelip_pcAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelusuario_p_cAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelfecha_horaAuditoria,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAuditoria.jLabelobservacionAuditoria,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("AuditoriaDetalle")) {
			if(this.auditoria==null) {
				this.auditoria= new Auditoria();
			}

			if(this.auditoriaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoAuditoria
				this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);

				this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.getauditoriadetalle().setAuditoria(this.auditoria);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoAuditoria--;	
		
		
		this.auditoriaAux=new Auditoria();
		
		this.auditoriaAux.setId(this.iIdNuevoAuditoria);
		this.auditoriaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.auditoriaLogic.getAuditorias().add(this.auditoriaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.auditorias.add(this.auditoriaAux);
		}
		//ARCHITECTURE
		
		this.auditoria=this.auditoriaAux;
		
		if(AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAuditoria(this.auditoria);
			this.setVariablesObjetoActualToFormularioForeignKeyAuditoria(this.auditoria);
		}
				
		//this.setDefaultControlesAuditoria();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAuditoria();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAuditoria();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAuditoria();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAuditoria(this.auditoriaBean,this.auditoria,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AuditoriaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
			classes=AuditoriaConstantesFunciones.getClassesRelationshipsOfAuditoria(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.auditoriaReturnGeneral=auditoriaLogic.procesarEventosAuditoriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.auditoriaLogic.getAuditorias(),this.auditoria,this.auditoriaParameterGeneral,this.isEsNuevoAuditoria,classes);//this.auditoriaLogic.getAuditoria()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAuditoria(this.auditoriaReturnGeneral,this.auditoriaBean,false);
		
		if(this.auditoriaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAuditoria(this.auditoriaReturnGeneral.getAuditoria());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAuditoria(this.auditoriaReturnGeneral.getAuditoria());
		}
		
		if(this.auditoriaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAuditoria(this.auditoriaReturnGeneral.getAuditoria(),classes);//this.auditoriaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAuditoria();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAuditoria();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AuditoriaBeanSwingJInternalFrameAdditional.RecargarFormAuditoria(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAuditoria(false);
						
			if(auditoriaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.getEsGuardarRelacionado() && AuditoriaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAuditoriaDetalleActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAuditoria();
			}
			
			this.actualizarVisualTableDatosAuditoria();
			
			this.jTableDatosAuditoria.setRowSelectionInterval(this.getIndiceNuevoAuditoria(), this.getIndiceNuevoAuditoria());
			
			this.seleccionarFilaTablaAuditoriaActual();
						
			this.actualizarEstadoCeldasBotonesAuditoria("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAuditoria(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAuditoria.jTextAreanombre_tablaAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarnombre_tablaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldid_filaAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarid_filaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldaccionAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activaraccionAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextAreaprocesoAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarprocesoAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldnombre_p_cAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarnombre_p_cAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldip_pcAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarip_pcAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldusuario_p_cAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarusuario_p_cAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jDateChooserfecha_horaAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarfecha_horaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextAreaobservacionAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarobservacionAuditoria);	
		//
		this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setEnabled(isHabilitar && this.auditoriaConstantesFunciones.activarid_usuarioAuditoria);
	};
	
	public void setDefaultControlesAuditoria() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAuditoria(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.auditoriaSessionBean.setConGuardarRelaciones(true);			
			this.auditoriaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.auditoriaSessionBean.setConGuardarRelaciones(false);			
			this.auditoriaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoAuditoria() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
				if(auditoriaAux.getId().equals(this.iIdNuevoAuditoria)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Auditoria auditoriaAux:this.auditorias) {
				if(auditoriaAux.getId().equals(this.iIdNuevoAuditoria)) {
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
	
	public int getIndiceActualAuditoria(Auditoria auditoria,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
				if(auditoriaAux.getId().equals(auditoria.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Auditoria auditoriaAux:this.auditorias) {
				if(auditoriaAux.getId().equals(auditoria.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAuditoria(Auditoria auditoriaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
				if(auditoriaAux.getAuditoriaOriginal().getId().equals(auditoriaOriginal.getId())) {
					existe=true;
					auditoriaOriginal.setId(auditoriaAux.getId());
					auditoriaOriginal.setVersionRow(auditoriaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Auditoria auditoriaAux:this.auditorias) {
				if(auditoriaAux.getAuditoriaOriginal().getId().equals(auditoriaOriginal.getId())) {
					existe=true;
					auditoriaOriginal.setId(auditoriaAux.getId());
					auditoriaOriginal.setVersionRow(auditoriaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAuditoria(Boolean esParaCancelar) throws Exception {
		auditoriasAux=new ArrayList<Auditoria>();
		auditoriaAux=new Auditoria();
		
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
					if(auditoriaAux.getId()<0) {
						auditoriasAux.add(auditoriaAux);
					}		
				}
				this.iIdNuevoAuditoria=0L;
				this.auditoriaLogic.getAuditorias().removeAll(auditoriasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Auditoria auditoriaAux:this.auditorias) {
					if(auditoriaAux.getId()<0) {
						auditoriasAux.add(auditoriaAux);
					}		
				}
				this.iIdNuevoAuditoria=0L;
				this.auditorias.removeAll(auditoriasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAuditoria 
					&& this.auditoriaLogic.getAuditorias().size()>0
					) {
					auditoriaAux=this.auditoriaLogic.getAuditorias().get(this.auditoriaLogic.getAuditorias().size() - 1);
				
					if(auditoriaAux.getId()<0) {
						this.auditoriaLogic.getAuditorias().remove(auditoriaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAuditoria && this.auditorias.size()>0) {
					auditoriaAux=this.auditorias.get(this.auditorias.size() - 1);
				
					if(auditoriaAux.getId()<0) {
						this.auditorias.remove(auditoriaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAuditoria(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(auditoria.getId()<0) {
				this.auditoriaLogic.getAuditorias().remove(this.auditoria);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(auditoria.getId()<0) {
				this.auditorias.remove(this.auditoria);
			}
		}			
	}
	
	public void setEstadosInicialesAuditoria(List<Auditoria> auditoriasAux) throws Exception {
		AuditoriaConstantesFunciones.setEstadosInicialesAuditoria(auditoriasAux);
	}
	
	public void setEstadosInicialesAuditoria(Auditoria auditoriaAux) throws Exception {
		AuditoriaConstantesFunciones.setEstadosInicialesAuditoria(auditoriaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAuditoriaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAuditoria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAuditoriaActual()) {
				if(!this.isEsNuevoAuditoria) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAuditoria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAuditoria=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAuditoriaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Auditoria ?", "MANTENIMIENTO DE Auditoria", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAuditoria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Auditoria auditoria) throws Exception {
		AuditoriaConstantesFunciones.seleccionarAsignar(this.auditoria,auditoria);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAuditoria=this.isPermisoActualizarOriginalAuditoria;
			
			
			this.seleccionarAsignar(auditoria);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AuditoriaConstantesFunciones.quitarEspaciosAuditoria(this.auditoria,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAuditoria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.auditoriaSessionBean.setsFuncionBusquedaRapida(this.auditoriaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAuditoria) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAuditoria(esParaCancelar);				
				this.cancelarNuevoAuditoria(esParaCancelar);								
			}
			
			this.auditoria=new Auditoria();
			
			this.inicializarAuditoria();
			
			this.actualizarEstadoCeldasBotonesAuditoria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAuditoria() throws Exception {
		try {
			AuditoriaConstantesFunciones.inicializarAuditoria(this.auditoria);
			
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
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.auditoriaLogic.getAuditorias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAuditorias(String sAccionBusqueda,List<Auditoria> auditoriasParaReportes) throws Exception {
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
					sPathReporteFinal="Auditoria"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AuditoriaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AuditoriaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Auditoria"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Auditorias");		
		parameters.put("busquedapor", AuditoriaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(AuditoriaDetalle.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					AuditoriaLogic auditoriaLogicAuxiliar=new AuditoriaLogic();
					auditoriaLogicAuxiliar.setDatosCliente(auditoriaLogic.getDatosCliente());				
					auditoriaLogicAuxiliar.setAuditorias(auditoriasParaReportes);
					
					auditoriaLogicAuxiliar.cargarRelacionesLoteForeignKeyAuditoriaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					auditoriasParaReportes=auditoriaLogicAuxiliar.getAuditorias();
					
					//auditoriaLogic.getNewConnexionToDeep();
					
					//for (Auditoria auditoria:auditoriasParaReportes) {
					//	auditoriaLogic.deepLoad(auditoria, false, DeepLoadType.INCLUDE, classes);
					//}						
					//auditoriaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//auditoriaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileAuditoriaDetalle = AuxiliarReportes.class.getResourceAsStream("AuditoriaDetalleDetalleRelacionesDesign.jasper");
			parameters.put("subreport_auditoriadetalle", reportFileAuditoriaDetalle);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAuditoria=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AuditoriaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AuditoriaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAuditoria=new JRBeanArrayDataSource(AuditoriaJInternalFrame.TraerAuditoriaBeans(auditoriasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAuditoria);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AuditoriaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AuditoriaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AuditoriaBean.TraerAuditoriaBeans(auditoriasParaReportes).toArray()));
							
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
				this.generarExcelReporteAuditorias(sAccionBusqueda,sTipoArchivoReporte,auditoriasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAuditorias(sAccionBusqueda,sTipoArchivoReporte,auditoriasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAuditoriaActionPerformed(null);
					//this.generarExcelReporteAuditorias(sAccionBusqueda,sTipoArchivoReporte,auditoriasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAuditorias(sAccionBusqueda,sTipoArchivoReporte,auditoriasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAuditorias(sAccionBusqueda,sTipoArchivoReporte,auditoriasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAuditorias(sAccionBusqueda,sTipoArchivoReporte,auditoriasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAuditorias(String sAccionBusqueda,String sTipoArchivoReporte,List<Auditoria> auditoriasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Auditorias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAuditoria("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Auditoria auditoria : auditoriasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AuditoriaConstantesFunciones.generarExcelReporteDataAuditoria("NORMAL",row,workbook,auditoria,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAuditoria(String sTipo,Row row,Workbook workbook) {
		
		AuditoriaConstantesFunciones.generarExcelReporteHeaderAuditoria(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAuditorias(String sAccionBusqueda,String sTipoArchivoReporte,List<Auditoria> auditoriasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Auditorias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Auditoria auditoria : auditoriasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AuditoriaConstantesFunciones.getAuditoriaDescripcion(auditoria));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_NOMBRETABLA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_NOMBRETABLA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getnombre_tabla());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_IDFILA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IDFILA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getid_fila());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_ACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_ACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_PROCESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_PROCESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getproceso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_NOMBREPC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_NOMBREPC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getnombre_p_c());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_IPPC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IPPC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getip_pc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_USUARIOPC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_USUARIOPC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getusuario_p_c());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_FECHAHORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_FECHAHORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getfecha_hora());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AuditoriaConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AuditoriaConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(auditoria.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAuditorias(String sAccionBusqueda,String sTipoArchivoReporte,List<Auditoria> auditoriasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Auditoria> auditoriasRespaldo=null;
		
		classes=AuditoriaConstantesFunciones.getClassesRelationshipsOfAuditoria(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.auditoriaLogic.setDatosCliente(this.datosCliente);
		this.auditoriaLogic.setDatosDeep(this.datosDeep);
		this.auditoriaLogic.setIsConDeep(true);
		
		auditoriasRespaldo=this.auditoriaLogic.getAuditorias();
		
		this.auditoriaLogic.setAuditorias(auditoriasParaReportes);	
		this.auditoriaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		auditoriasParaReportes=this.auditoriaLogic.getAuditorias();
		this.auditoriaLogic.setAuditorias(auditoriasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Auditorias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAuditoria("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Auditoria auditoria : auditoriasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAuditoria("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AuditoriaConstantesFunciones.generarExcelReporteDataAuditoria("NORMAL",row,workbook,auditoria,cellStyleDataAux);
		
			
			


				//AuditoriaDetalle
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO))) {

				if(auditoria.getAuditoriaDetalles()!=null && auditoria.getAuditoriaDetalles().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AuditoriaDetalleConstantesFunciones.generarExcelReporteHeaderAuditoriaDetalle("RELACIONADO",row,workbook);
				}

				if(auditoria.getAuditoriaDetalles()!=null) {
					i2=0;
					for(AuditoriaDetalle auditoriadetalle : auditoria.getAuditoriaDetalles()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AuditoriaDetalleConstantesFunciones.generarExcelReporteDataAuditoriaDetalle("RELACIONADO",row,workbook,auditoriadetalle,cellStyleDataAuxHijo);
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
		cell.setCellValue(AuditoriaConstantesFunciones.getAuditoriaDescripcion(auditoria));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAuditoria.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAuditoria() throws Exception {		
		this.startProcessAuditoria(true);
	}
	
	public void startProcessAuditoria(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAuditoria ,this.jPanelParametrosReportesAuditoria, this.jScrollPanelDatosAuditoria,this.jPanelPaginacionAuditoria, this.jScrollPanelDatosEdicionAuditoria, this.jPanelAccionesAuditoria,this.jPanelAccionesFormularioAuditoria,this.jmenuBarAuditoria,this.jmenuBarDetalleAuditoria,this.jTtoolBarAuditoria,this.jTtoolBarDetalleAuditoria);		
		
		final JTabbedPane jTabbedPaneBusquedasAuditoria=this.jTabbedPaneBusquedasAuditoria; 
		
		final JPanel jPanelParametrosReportesAuditoria=this.jPanelParametrosReportesAuditoria;
		//final JScrollPane jScrollPanelDatosAuditoria=this.jScrollPanelDatosAuditoria;
		final JTable jTableDatosAuditoria=this.jTableDatosAuditoria;		
		final JPanel jPanelPaginacionAuditoria=this.jPanelPaginacionAuditoria;
		//final JScrollPane jScrollPanelDatosEdicionAuditoria=this.jScrollPanelDatosEdicionAuditoria;
		final JPanel jPanelAccionesAuditoria=this.jPanelAccionesAuditoria;
		
		JPanel jPanelCamposAuxiliarAuditoria=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAuditoria=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
			jPanelCamposAuxiliarAuditoria=this.jInternalFrameDetalleFormAuditoria.jPanelCamposAuditoria;
			jPanelAccionesFormularioAuxiliarAuditoria=this.jInternalFrameDetalleFormAuditoria.jPanelAccionesFormularioAuditoria;
		}
		
		final JPanel jPanelCamposAuditoria=jPanelCamposAuxiliarAuditoria;
		final JPanel jPanelAccionesFormularioAuditoria=jPanelAccionesFormularioAuxiliarAuditoria;
		
		
		final JMenuBar jmenuBarAuditoria=this.jmenuBarAuditoria;
		final JToolBar jTtoolBarAuditoria=this.jTtoolBarAuditoria;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAuditoria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAuditoria=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
			jmenuBarDetalleAuxiliarAuditoria=this.jInternalFrameDetalleFormAuditoria.jmenuBarDetalleAuditoria;
			jTtoolBarDetalleAuxiliarAuditoria=this.jInternalFrameDetalleFormAuditoria.jTtoolBarDetalleAuditoria;
		}
		
		final JMenuBar jmenuBarDetalleAuditoria=jmenuBarDetalleAuxiliarAuditoria;
		final JToolBar jTtoolBarDetalleAuditoria=jTtoolBarDetalleAuxiliarAuditoria;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAuditoria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAuditoria;
			processRunnable.jTableDatos=jTableDatosAuditoria;
			processRunnable.jPanelCampos=jPanelCamposAuditoria;
			processRunnable.jPanelPaginacion=jPanelPaginacionAuditoria;
			processRunnable.jPanelAcciones=jPanelAccionesAuditoria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAuditoria;
			
			
			processRunnable.jmenuBar=jmenuBarAuditoria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAuditoria;
			processRunnable.jTtoolBar=jTtoolBarAuditoria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAuditoria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAuditoria ,jPanelParametrosReportesAuditoria,jTableDatosAuditoria, /*jScrollPanelDatosAuditoria,*/jPanelCamposAuditoria,jPanelPaginacionAuditoria, /*jScrollPanelDatosEdicionAuditoria,*/ jPanelAccionesAuditoria,jPanelAccionesFormularioAuditoria,jmenuBarAuditoria,jmenuBarDetalleAuditoria,jTtoolBarAuditoria,jTtoolBarDetalleAuditoria);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAuditoria ,jPanelParametrosReportesAuditoria, jScrollPanelDatosAuditoria,jPanelPaginacionAuditoria, jScrollPanelDatosEdicionAuditoria, jPanelAccionesAuditoria,jPanelAccionesFormularioAuditoria,jmenuBarAuditoria,jmenuBarDetalleAuditoria,jTtoolBarAuditoria,jTtoolBarDetalleAuditoria);
						
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
	
	public void finishProcessAuditoria() {// throws Exception 
		this.finishProcessAuditoria(true);
	}
	
	public void finishProcessAuditoria(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAuditoria ,this.jPanelParametrosReportesAuditoria, this.jScrollPanelDatosAuditoria,this.jPanelPaginacionAuditoria, this.jScrollPanelDatosEdicionAuditoria, this.jPanelAccionesAuditoria,this.jPanelAccionesFormularioAuditoria,this.jmenuBarAuditoria,this.jmenuBarDetalleAuditoria,this.jTtoolBarAuditoria,this.jTtoolBarDetalleAuditoria);		
		
		final JTabbedPane jTabbedPaneBusquedasAuditoria=this.jTabbedPaneBusquedasAuditoria; 
		
		final JPanel jPanelParametrosReportesAuditoria=this.jPanelParametrosReportesAuditoria;
		//final JScrollPane jScrollPanelDatosAuditoria=this.jScrollPanelDatosAuditoria;
		final JTable jTableDatosAuditoria=this.jTableDatosAuditoria;		
		final JPanel jPanelPaginacionAuditoria=this.jPanelPaginacionAuditoria;
		//final JScrollPane jScrollPanelDatosEdicionAuditoria=this.jScrollPanelDatosEdicionAuditoria;
		final JPanel jPanelAccionesAuditoria=this.jPanelAccionesAuditoria;
		
		JPanel jPanelCamposAuxiliarAuditoria=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAuditoria=new JPanel();
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
			jPanelCamposAuxiliarAuditoria=this.jInternalFrameDetalleFormAuditoria.jPanelCamposAuditoria;
			jPanelAccionesFormularioAuxiliarAuditoria=this.jInternalFrameDetalleFormAuditoria.jPanelAccionesFormularioAuditoria;
		}
		
		final JPanel jPanelCamposAuditoria=jPanelCamposAuxiliarAuditoria;
		final JPanel jPanelAccionesFormularioAuditoria=jPanelAccionesFormularioAuxiliarAuditoria;
		
		
		final JMenuBar jmenuBarAuditoria=this.jmenuBarAuditoria;		
		final JToolBar jTtoolBarAuditoria=this.jTtoolBarAuditoria;
				
		JMenuBar jmenuBarDetalleAuxiliarAuditoria=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAuditoria=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
			jmenuBarDetalleAuxiliarAuditoria=this.jInternalFrameDetalleFormAuditoria.jmenuBarDetalleAuditoria;
			jTtoolBarDetalleAuxiliarAuditoria=this.jInternalFrameDetalleFormAuditoria.jTtoolBarDetalleAuditoria;		
		}
		
		final JMenuBar jmenuBarDetalleAuditoria=jmenuBarDetalleAuxiliarAuditoria;
		final JToolBar jTtoolBarDetalleAuditoria=jTtoolBarDetalleAuxiliarAuditoria;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAuditoria;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAuditoria;
			processRunnable.jTableDatos=jTableDatosAuditoria;
			processRunnable.jPanelCampos=jPanelCamposAuditoria;
			processRunnable.jPanelPaginacion=jPanelPaginacionAuditoria;
			processRunnable.jPanelAcciones=jPanelAccionesAuditoria;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAuditoria;
			
			
			processRunnable.jmenuBar=jmenuBarAuditoria;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAuditoria;
			processRunnable.jTtoolBar=jTtoolBarAuditoria;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAuditoria;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAuditoria ,jPanelParametrosReportesAuditoria, jTableDatosAuditoria,/*jScrollPanelDatosAuditoria,*/jPanelCamposAuditoria,jPanelPaginacionAuditoria, /*jScrollPanelDatosEdicionAuditoria,*/ jPanelAccionesAuditoria,jPanelAccionesFormularioAuditoria,jmenuBarAuditoria,jmenuBarDetalleAuditoria,jTtoolBarAuditoria,jTtoolBarDetalleAuditoria));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAuditoria(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAuditoria(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAuditoria(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAuditoria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAuditoria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAuditoria,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAuditoria(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAuditoria,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAuditoria,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.auditoriaConstantesFunciones.getsFinalQueryAuditoria();
		String  finalQueryPaginacionTodos=this.auditoriaConstantesFunciones.getsFinalQueryAuditoria();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AuditoriaConstantesFunciones.getArrayColumnasGlobalesNoAuditoria(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AuditoriaConstantesFunciones.getArrayColumnasGlobalesAuditoria(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AuditoriaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.auditoriasEliminados= new ArrayList<Auditoria>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAuditoria();
		
				///*AuditoriaSessionBean*/this.auditoriaSessionBean=new AuditoriaSessionBean();
			
			if(this.auditoriaSessionBean==null) {
				this.auditoriaSessionBean=new AuditoriaSessionBean();
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
					this.iNumeroPaginacion=AuditoriaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AuditoriaConstantesFunciones.getClassesForeignKeysOfAuditoria(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/auditoria."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			auditoriasAux= new ArrayList<Auditoria>();
			
				
			auditoriaLogic.setDatosCliente(this.datosCliente);
			auditoriaLogic.setDatosDeep(this.datosDeep);
			auditoriaLogic.setIsConDeep(true);
			
			
			auditoriaLogic.getAuditoriaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					auditoriaLogic.getTodosAuditorias(finalQueryGlobal,pagination);
					
					//auditoriaLogic.getTodosAuditoriasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(auditoriaLogic.getAuditorias()==null|| auditoriaLogic.getAuditorias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							auditoriasAux= new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditoriaLogic.getAuditorias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux= new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							auditoriaLogic.getTodosAuditorias(finalQueryGlobal+"",this.pagination);												
							
							//auditoriaLogic.getTodosAuditoriasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAuditorias("Todos",auditoriaLogic.getAuditorias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());					
							auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAuditoria=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAuditoria=this.idActual;
				
				} else if(this.idAuditoriaActual!=null && this.idAuditoriaActual!=0L) {
					idAuditoria=idAuditoriaActual;
				}
				
					
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndicePorId(idAuditoria);
				
				this.auditorias=new ArrayList<Auditoria>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					auditoriaLogic.getEntity(idAuditoria);
					
					//auditoriaLogic.getEntityWithConnection(idAuditoria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
					auditoriaLogic.getAuditorias().add(auditoriaLogic.getAuditoria());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.auditorias=new ArrayList<Auditoria>();
					this.auditorias.add(auditoria);
				}
				
				if(auditoriaLogic.getAuditoria()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora")) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora,fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriaLogic.getAuditoriasBusquedaPorIdUsuarioPorFechaHora(finalQueryGlobal,pagination,id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora,fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora,fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora,fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriaLogic.getAuditorias()==null||auditoriaLogic.getAuditorias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditorias==null|| auditorias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriasAux=new ArrayList<Auditoria>();
						auditoriasAux.addAll(auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux=new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriaLogic.getAuditoriasBusquedaPorIdUsuarioPorFechaHora(finalQueryGlobal,pagination,id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora,fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora,fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIdUsuarioPorFechaHora(id_usuarioBusquedaPorIdUsuarioPorFechaHora,fecha_horaBusquedaPorIdUsuarioPorFechaHora,fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditorias("BusquedaPorIdUsuarioPorFechaHora",auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditorias("BusquedaPorIdUsuarioPorFechaHora",auditorias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
						auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorIPPCPorFechaHora")) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIPPCPorFechaHora(ip_pcBusquedaPorIPPCPorFechaHora,fecha_horaBusquedaPorIPPCPorFechaHora,fecha_horaFinalBusquedaPorIPPCPorFechaHora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriaLogic.getAuditoriasBusquedaPorIPPCPorFechaHora(finalQueryGlobal,pagination,ip_pcBusquedaPorIPPCPorFechaHora,fecha_horaBusquedaPorIPPCPorFechaHora,fecha_horaFinalBusquedaPorIPPCPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIPPCPorFechaHora(ip_pcBusquedaPorIPPCPorFechaHora,fecha_horaBusquedaPorIPPCPorFechaHora,fecha_horaFinalBusquedaPorIPPCPorFechaHora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIPPCPorFechaHora(ip_pcBusquedaPorIPPCPorFechaHora,fecha_horaBusquedaPorIPPCPorFechaHora,fecha_horaFinalBusquedaPorIPPCPorFechaHora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriaLogic.getAuditorias()==null||auditoriaLogic.getAuditorias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditorias==null|| auditorias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriasAux=new ArrayList<Auditoria>();
						auditoriasAux.addAll(auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux=new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriaLogic.getAuditoriasBusquedaPorIPPCPorFechaHora(finalQueryGlobal,pagination,ip_pcBusquedaPorIPPCPorFechaHora,fecha_horaBusquedaPorIPPCPorFechaHora,fecha_horaFinalBusquedaPorIPPCPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIPPCPorFechaHora(ip_pcBusquedaPorIPPCPorFechaHora,fecha_horaBusquedaPorIPPCPorFechaHora,fecha_horaFinalBusquedaPorIPPCPorFechaHora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorIPPCPorFechaHora(ip_pcBusquedaPorIPPCPorFechaHora,fecha_horaBusquedaPorIPPCPorFechaHora,fecha_horaFinalBusquedaPorIPPCPorFechaHora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditorias("BusquedaPorIPPCPorFechaHora",auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditorias("BusquedaPorIPPCPorFechaHora",auditorias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
						auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombrePCPorFechaHora")) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePCPorFechaHora(nombre_p_cBusquedaPorNombrePCPorFechaHora,fecha_horaBusquedaPorNombrePCPorFechaHora,fecha_horaFinalBusquedaPorNombrePCPorFechaHora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriaLogic.getAuditoriasBusquedaPorNombrePCPorFechaHora(finalQueryGlobal,pagination,nombre_p_cBusquedaPorNombrePCPorFechaHora,fecha_horaBusquedaPorNombrePCPorFechaHora,fecha_horaFinalBusquedaPorNombrePCPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePCPorFechaHora(nombre_p_cBusquedaPorNombrePCPorFechaHora,fecha_horaBusquedaPorNombrePCPorFechaHora,fecha_horaFinalBusquedaPorNombrePCPorFechaHora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePCPorFechaHora(nombre_p_cBusquedaPorNombrePCPorFechaHora,fecha_horaBusquedaPorNombrePCPorFechaHora,fecha_horaFinalBusquedaPorNombrePCPorFechaHora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriaLogic.getAuditorias()==null||auditoriaLogic.getAuditorias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditorias==null|| auditorias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriasAux=new ArrayList<Auditoria>();
						auditoriasAux.addAll(auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux=new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriaLogic.getAuditoriasBusquedaPorNombrePCPorFechaHora(finalQueryGlobal,pagination,nombre_p_cBusquedaPorNombrePCPorFechaHora,fecha_horaBusquedaPorNombrePCPorFechaHora,fecha_horaFinalBusquedaPorNombrePCPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePCPorFechaHora(nombre_p_cBusquedaPorNombrePCPorFechaHora,fecha_horaBusquedaPorNombrePCPorFechaHora,fecha_horaFinalBusquedaPorNombrePCPorFechaHora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombrePCPorFechaHora(nombre_p_cBusquedaPorNombrePCPorFechaHora,fecha_horaBusquedaPorNombrePCPorFechaHora,fecha_horaFinalBusquedaPorNombrePCPorFechaHora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditorias("BusquedaPorNombrePCPorFechaHora",auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditorias("BusquedaPorNombrePCPorFechaHora",auditorias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
						auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombreTablaPorFechaHora")) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombreTablaPorFechaHora(nombre_tablaBusquedaPorNombreTablaPorFechaHora,fecha_horaBusquedaPorNombreTablaPorFechaHora,fecha_horaFinalBusquedaPorNombreTablaPorFechaHora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriaLogic.getAuditoriasBusquedaPorNombreTablaPorFechaHora(finalQueryGlobal,pagination,nombre_tablaBusquedaPorNombreTablaPorFechaHora,fecha_horaBusquedaPorNombreTablaPorFechaHora,fecha_horaFinalBusquedaPorNombreTablaPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombreTablaPorFechaHora(nombre_tablaBusquedaPorNombreTablaPorFechaHora,fecha_horaBusquedaPorNombreTablaPorFechaHora,fecha_horaFinalBusquedaPorNombreTablaPorFechaHora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombreTablaPorFechaHora(nombre_tablaBusquedaPorNombreTablaPorFechaHora,fecha_horaBusquedaPorNombreTablaPorFechaHora,fecha_horaFinalBusquedaPorNombreTablaPorFechaHora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriaLogic.getAuditorias()==null||auditoriaLogic.getAuditorias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditorias==null|| auditorias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriasAux=new ArrayList<Auditoria>();
						auditoriasAux.addAll(auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux=new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriaLogic.getAuditoriasBusquedaPorNombreTablaPorFechaHora(finalQueryGlobal,pagination,nombre_tablaBusquedaPorNombreTablaPorFechaHora,fecha_horaBusquedaPorNombreTablaPorFechaHora,fecha_horaFinalBusquedaPorNombreTablaPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombreTablaPorFechaHora(nombre_tablaBusquedaPorNombreTablaPorFechaHora,fecha_horaBusquedaPorNombreTablaPorFechaHora,fecha_horaFinalBusquedaPorNombreTablaPorFechaHora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorNombreTablaPorFechaHora(nombre_tablaBusquedaPorNombreTablaPorFechaHora,fecha_horaBusquedaPorNombreTablaPorFechaHora,fecha_horaFinalBusquedaPorNombreTablaPorFechaHora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditorias("BusquedaPorNombreTablaPorFechaHora",auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditorias("BusquedaPorNombreTablaPorFechaHora",auditorias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
						auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorObservacionesPorFechaHora")) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorObservacionesPorFechaHora(fecha_horaBusquedaPorObservacionesPorFechaHora,fecha_horaFinalBusquedaPorObservacionesPorFechaHora,observacionBusquedaPorObservacionesPorFechaHora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriaLogic.getAuditoriasBusquedaPorObservacionesPorFechaHora(finalQueryGlobal,pagination,fecha_horaBusquedaPorObservacionesPorFechaHora,fecha_horaFinalBusquedaPorObservacionesPorFechaHora,observacionBusquedaPorObservacionesPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorObservacionesPorFechaHora(fecha_horaBusquedaPorObservacionesPorFechaHora,fecha_horaFinalBusquedaPorObservacionesPorFechaHora,observacionBusquedaPorObservacionesPorFechaHora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorObservacionesPorFechaHora(fecha_horaBusquedaPorObservacionesPorFechaHora,fecha_horaFinalBusquedaPorObservacionesPorFechaHora,observacionBusquedaPorObservacionesPorFechaHora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriaLogic.getAuditorias()==null||auditoriaLogic.getAuditorias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditorias==null|| auditorias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriasAux=new ArrayList<Auditoria>();
						auditoriasAux.addAll(auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux=new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriaLogic.getAuditoriasBusquedaPorObservacionesPorFechaHora(finalQueryGlobal,pagination,fecha_horaBusquedaPorObservacionesPorFechaHora,fecha_horaFinalBusquedaPorObservacionesPorFechaHora,observacionBusquedaPorObservacionesPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorObservacionesPorFechaHora(fecha_horaBusquedaPorObservacionesPorFechaHora,fecha_horaFinalBusquedaPorObservacionesPorFechaHora,observacionBusquedaPorObservacionesPorFechaHora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorObservacionesPorFechaHora(fecha_horaBusquedaPorObservacionesPorFechaHora,fecha_horaFinalBusquedaPorObservacionesPorFechaHora,observacionBusquedaPorObservacionesPorFechaHora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditorias("BusquedaPorObservacionesPorFechaHora",auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditorias("BusquedaPorObservacionesPorFechaHora",auditorias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
						auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorProcesoPorFechaHora")) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorProcesoPorFechaHora(procesoBusquedaPorProcesoPorFechaHora,fecha_horaBusquedaPorProcesoPorFechaHora,fecha_horaFinalBusquedaPorProcesoPorFechaHora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriaLogic.getAuditoriasBusquedaPorProcesoPorFechaHora(finalQueryGlobal,pagination,procesoBusquedaPorProcesoPorFechaHora,fecha_horaBusquedaPorProcesoPorFechaHora,fecha_horaFinalBusquedaPorProcesoPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorProcesoPorFechaHora(procesoBusquedaPorProcesoPorFechaHora,fecha_horaBusquedaPorProcesoPorFechaHora,fecha_horaFinalBusquedaPorProcesoPorFechaHora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorProcesoPorFechaHora(procesoBusquedaPorProcesoPorFechaHora,fecha_horaBusquedaPorProcesoPorFechaHora,fecha_horaFinalBusquedaPorProcesoPorFechaHora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriaLogic.getAuditorias()==null||auditoriaLogic.getAuditorias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditorias==null|| auditorias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriasAux=new ArrayList<Auditoria>();
						auditoriasAux.addAll(auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux=new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriaLogic.getAuditoriasBusquedaPorProcesoPorFechaHora(finalQueryGlobal,pagination,procesoBusquedaPorProcesoPorFechaHora,fecha_horaBusquedaPorProcesoPorFechaHora,fecha_horaFinalBusquedaPorProcesoPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorProcesoPorFechaHora(procesoBusquedaPorProcesoPorFechaHora,fecha_horaBusquedaPorProcesoPorFechaHora,fecha_horaFinalBusquedaPorProcesoPorFechaHora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorProcesoPorFechaHora(procesoBusquedaPorProcesoPorFechaHora,fecha_horaBusquedaPorProcesoPorFechaHora,fecha_horaFinalBusquedaPorProcesoPorFechaHora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditorias("BusquedaPorProcesoPorFechaHora",auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditorias("BusquedaPorProcesoPorFechaHora",auditorias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
						auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorUsuarioPCPorFechaHora")) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorUsuarioPCPorFechaHora(usuario_p_cBusquedaPorUsuarioPCPorFechaHora,fecha_horaBusquedaPorUsuarioPCPorFechaHora,fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriaLogic.getAuditoriasBusquedaPorUsuarioPCPorFechaHora(finalQueryGlobal,pagination,usuario_p_cBusquedaPorUsuarioPCPorFechaHora,fecha_horaBusquedaPorUsuarioPCPorFechaHora,fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorUsuarioPCPorFechaHora(usuario_p_cBusquedaPorUsuarioPCPorFechaHora,fecha_horaBusquedaPorUsuarioPCPorFechaHora,fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorUsuarioPCPorFechaHora(usuario_p_cBusquedaPorUsuarioPCPorFechaHora,fecha_horaBusquedaPorUsuarioPCPorFechaHora,fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriaLogic.getAuditorias()==null||auditoriaLogic.getAuditorias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditorias==null|| auditorias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriasAux=new ArrayList<Auditoria>();
						auditoriasAux.addAll(auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux=new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriaLogic.getAuditoriasBusquedaPorUsuarioPCPorFechaHora(finalQueryGlobal,pagination,usuario_p_cBusquedaPorUsuarioPCPorFechaHora,fecha_horaBusquedaPorUsuarioPCPorFechaHora,fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorUsuarioPCPorFechaHora(usuario_p_cBusquedaPorUsuarioPCPorFechaHora,fecha_horaBusquedaPorUsuarioPCPorFechaHora,fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceBusquedaPorUsuarioPCPorFechaHora(usuario_p_cBusquedaPorUsuarioPCPorFechaHora,fecha_horaBusquedaPorUsuarioPCPorFechaHora,fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditorias("BusquedaPorUsuarioPCPorFechaHora",auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditorias("BusquedaPorUsuarioPCPorFechaHora",auditorias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
						auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					auditoriaLogic.getAuditoriasFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=auditoriaLogic.getAuditorias()==null||auditoriaLogic.getAuditorias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=auditorias==null|| auditorias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriasAux=new ArrayList<Auditoria>();
						auditoriasAux.addAll(auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriasAux=new ArrayList<Auditoria>();
							auditoriasAux.addAll(auditorias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							auditoriaLogic.getAuditoriasFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AuditoriaConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAuditorias("FK_IdUsuario",auditoriaLogic.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAuditorias("FK_IdUsuario",auditorias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaLogic.setAuditorias(new ArrayList<Auditoria>());
						auditoriaLogic.getAuditorias().addAll(auditoriasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditorias=new ArrayList<Auditoria>();
							auditorias.addAll(auditoriasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAuditoria();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAuditoria();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=auditoriaLogic.getAuditorias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=auditorias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=auditoriaLogic.getAuditorias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=auditorias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Auditoria auditoria) {
		Boolean permite=true;
		
		if(this.auditoria.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AuditoriaConstantesFunciones.getOrderByListaAuditoria();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AuditoriaConstantesFunciones.getOrderByListaAuditoria();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Auditoria auditoria:auditoriaLogic.getAuditorias()) {
				if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriaTotales=auditoria;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Auditoria auditoria:this.auditorias) {
				if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriaTotales=auditoria;
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
			this.auditoriaAux=new Auditoria();
			this.auditoriaAux.setsType(Constantes2.S_TOTALES);
			this.auditoriaAux.setIsNew(false);
			this.auditoriaAux.setIsChanged(false);
			this.auditoriaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AuditoriaConstantesFunciones.TotalizarValoresFilaAuditoria(this.auditoriaLogic.getAuditorias(),this.auditoriaAux);
				
				this.auditoriaLogic.getAuditorias().add(this.auditoriaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AuditoriaConstantesFunciones.TotalizarValoresFilaAuditoria(this.auditorias,this.auditoriaAux);
				
				this.auditorias.add(this.auditoriaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		auditoriaTotales=new Auditoria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.auditoriaLogic.getAuditorias().remove(auditoriaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.auditorias.remove(auditoriaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		auditoriaTotales=new Auditoria();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Auditoria auditoria:auditoriaLogic.getAuditorias()) {
				if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriaTotales=auditoria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AuditoriaConstantesFunciones.TotalizarValoresFilaAuditoria(this.auditoriaLogic.getAuditorias(),auditoriaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Auditoria auditoria:this.auditorias) {
				if(auditoria.getsType().equals(Constantes2.S_TOTALES)) {
					auditoriaTotales=auditoria;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AuditoriaConstantesFunciones.TotalizarValoresFilaAuditoria(this.auditorias,auditoriaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAuditoriasBusquedaPorIdUsuarioPorFechaHora()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdUsuarioPorFechaHora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriasBusquedaPorIPPCPorFechaHora()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIPPCPorFechaHora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriasBusquedaPorNombrePCPorFechaHora()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombrePCPorFechaHora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriasBusquedaPorNombreTablaPorFechaHora()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombreTablaPorFechaHora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriasBusquedaPorObservacionesPorFechaHora()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorObservacionesPorFechaHora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriasBusquedaPorProcesoPorFechaHora()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorProcesoPorFechaHora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriasBusquedaPorUsuarioPCPorFechaHora()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorUsuarioPCPorFechaHora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriasFK_IdAuditoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdAuditoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAuditoriasFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAuditoriasBusquedaPorIdUsuarioPorFechaHora(String sFinalQuery,Long id_usuario,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasBusquedaPorIdUsuarioPorFechaHora(sFinalQuery,this.pagination,id_usuario,fecha_hora,fecha_horaFinal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriasBusquedaPorIPPCPorFechaHora(String sFinalQuery,String ip_pc,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasBusquedaPorIPPCPorFechaHora(sFinalQuery,this.pagination,ip_pc,fecha_hora,fecha_horaFinal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriasBusquedaPorNombrePCPorFechaHora(String sFinalQuery,String nombre_p_c,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasBusquedaPorNombrePCPorFechaHora(sFinalQuery,this.pagination,nombre_p_c,fecha_hora,fecha_horaFinal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriasBusquedaPorNombreTablaPorFechaHora(String sFinalQuery,String nombre_tabla,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasBusquedaPorNombreTablaPorFechaHora(sFinalQuery,this.pagination,nombre_tabla,fecha_hora,fecha_horaFinal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriasBusquedaPorObservacionesPorFechaHora(String sFinalQuery,Timestamp fecha_hora,Timestamp fecha_horaFinal,String observacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasBusquedaPorObservacionesPorFechaHora(sFinalQuery,this.pagination,fecha_hora,fecha_horaFinal,observacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriasBusquedaPorProcesoPorFechaHora(String sFinalQuery,String proceso,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasBusquedaPorProcesoPorFechaHora(sFinalQuery,this.pagination,proceso,fecha_hora,fecha_horaFinal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriasBusquedaPorUsuarioPCPorFechaHora(String sFinalQuery,String usuario_p_c,Timestamp fecha_hora,Timestamp fecha_horaFinal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasBusquedaPorUsuarioPCPorFechaHora(sFinalQuery,this.pagination,usuario_p_c,fecha_hora,fecha_horaFinal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriasFK_IdAuditoria(String sFinalQuery,Long id_fila)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasFK_IdAuditoria(sFinalQuery,this.pagination,id_fila);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAuditoriasFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLogic.getAuditoriasFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosAuditoria() {
		this.isPermisoTodoAuditoria=false;
		this.isPermisoNuevoAuditoria=false;
		this.isPermisoActualizarAuditoria=false;
		this.isPermisoActualizarOriginalAuditoria=false;
		this.isPermisoEliminarAuditoria=false;
		this.isPermisoGuardarCambiosAuditoria=false;
		this.isPermisoConsultaAuditoria=false;
		this.isPermisoBusquedaAuditoria=false;
		this.isPermisoReporteAuditoria=false;		
		this.isPermisoOrdenAuditoria=false;		
		this.isPermisoPaginacionMedioAuditoria=false;		
		this.isPermisoPaginacionAltoAuditoria=false;
		this.isPermisoPaginacionTodoAuditoria=false;
		this.isPermisoCopiarAuditoria=false;		
		this.isPermisoVerFormAuditoria=false;		
		this.isPermisoDuplicarAuditoria=false;		
		this.isPermisoOrdenAuditoria=false;		
	}
	
	public void setPermisosUsuarioAuditoria(Boolean isPermiso) {
		this.isPermisoTodoAuditoria=isPermiso;
		this.isPermisoNuevoAuditoria=isPermiso;
		this.isPermisoActualizarAuditoria=isPermiso;
		this.isPermisoActualizarOriginalAuditoria=isPermiso;
		this.isPermisoEliminarAuditoria=isPermiso;
		this.isPermisoGuardarCambiosAuditoria=isPermiso;
		this.isPermisoConsultaAuditoria=isPermiso;
		this.isPermisoBusquedaAuditoria=isPermiso;
		this.isPermisoReporteAuditoria=isPermiso;
		this.isPermisoOrdenAuditoria=isPermiso;		
		this.isPermisoPaginacionMedioAuditoria=isPermiso;		
		this.isPermisoPaginacionAltoAuditoria=isPermiso;		
		this.isPermisoPaginacionTodoAuditoria=isPermiso;		
		this.isPermisoCopiarAuditoria=isPermiso;		
		this.isPermisoVerFormAuditoria=isPermiso;		
		this.isPermisoDuplicarAuditoria=isPermiso;
		this.isPermisoOrdenAuditoria=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAuditoria(Boolean isPermiso) {
		//this.isPermisoTodoAuditoria=isPermiso;
		this.isPermisoNuevoAuditoria=isPermiso;
		this.isPermisoActualizarAuditoria=isPermiso;
		this.isPermisoActualizarOriginalAuditoria=isPermiso;
		this.isPermisoEliminarAuditoria=isPermiso;
		this.isPermisoGuardarCambiosAuditoria=isPermiso;
		//this.isPermisoConsultaAuditoria=isPermiso;
		//this.isPermisoBusquedaAuditoria=isPermiso;
		//this.isPermisoReporteAuditoria=isPermiso;
		//this.isPermisoOrdenAuditoria=isPermiso;		
		//this.isPermisoPaginacionMedioAuditoria=isPermiso;		
		//this.isPermisoPaginacionAltoAuditoria=isPermiso;		
		//this.isPermisoPaginacionTodoAuditoria=isPermiso;		
		//this.isPermisoCopiarAuditoria=isPermiso;		
		//this.isPermisoDuplicarAuditoria=isPermiso;
		//this.isPermisoOrdenAuditoria=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAuditoriaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(AuditoriaDetalleConstantesFunciones.SNOMBREOPCION);
		
		if(AuditoriaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosAuditoriaDetalle=false;
		this.isTienePermisosAuditoriaDetalle=this.verificarGetPermisosUsuarioOpcionAuditoriaClaseRelacionada(this.opcionsRelacionadas,AuditoriaDetalleConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebAuditoria(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAuditoriaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosAuditoriaDetalle=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioAuditoriaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAuditoriaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAuditoriaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosAuditoriaDetalle && this.jInternalFrameDetalleFormAuditoria!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.remove(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioAuditoria() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AuditoriaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.auditoriaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AuditoriaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAuditoria=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAuditoria=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAuditoria=this.isPermisoActualizarAuditoria;
			this.isPermisoEliminarAuditoria=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAuditoria=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAuditoria=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAuditoria=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAuditoria=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAuditoria=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAuditoria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAuditoria=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAuditoria=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAuditoria=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAuditoria=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAuditoria=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAuditoria=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAuditoria=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.auditoriaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAuditoria.setToolTipText(this.jTableDatosAuditoria.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAuditoria(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAuditoria(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AuditoriaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AuditoriaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAuditoria() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosAuditoriaDetalle && this.auditoriaConstantesFunciones.mostrarAuditoriaDetalleAuditoria && !AuditoriaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Auditoria Detalle");
			reporte.setsDescripcion("Auditoria Detalle");
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
	public void inicializarCombosForeignKeyAuditoriaListas()throws Exception {
		try	{						
			
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAuditoriaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AuditoriaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAuditoriaListas(false);
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
	
	public void cargarCombosLoteForeignKeyAuditoriaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AuditoriaParameterReturnGeneral auditoriaReturnGeneral=new AuditoriaParameterReturnGeneral();
						
			


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.auditoriaConstantesFunciones.cargarid_usuarioAuditoria)
					 || (this.esRecargarFks && this.auditoriaConstantesFunciones.cargarid_usuarioAuditoria)) {

					if(!this.auditoriaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+auditoriaSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				auditoriaReturnGeneral=auditoriaLogic.cargarCombosLoteForeignKeyAuditoria(finalQueryGlobalUsuario);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=auditoriaReturnGeneral.getusuariosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAuditoria()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {
			if(this.auditoriaSessionBean==null) {
				this.auditoriaSessionBean=new AuditoriaSessionBean();
			}

			if(!this.auditoriaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
	
	public void initActionsCombosTodosForeignKeyAuditoria()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAuditoria(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAuditoria()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAuditoria();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAuditoria(Auditoria auditoria)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAuditoria(Auditoria auditoria,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAuditoria()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAuditoria()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAuditoria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAuditoria()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAuditoria()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAuditoria()throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAuditoria(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAuditoria()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria!=null && this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.getItemCount()>0) {
				this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public AuditoriaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AuditoriaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AuditoriaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.auditoriaSessionBean=new AuditoriaSessionBean(); 
		this.auditoriaConstantesFunciones=new AuditoriaConstantesFunciones(); 
		this.auditoriaBean=new Auditoria();//(this.auditoriaConstantesFunciones); 		
		this.auditoriaReturnGeneral=new AuditoriaParameterReturnGeneral(); 
		
		this.auditoriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.auditoriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AuditoriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AuditoriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AuditoriaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAuditoria(true);
			
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
			
			this.auditoriaConstantesFunciones=new AuditoriaConstantesFunciones(); 
			this.auditoriaBean=new Auditoria();//this.auditoriaConstantesFunciones); 			
			this.auditoriaReturnGeneral=new AuditoriaParameterReturnGeneral(); 
		
			AuditoriaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Auditoria Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.auditoria=new Auditoria();
			this.auditorias = new ArrayList<Auditoria>();
			this.auditoriasAux = new ArrayList<Auditoria>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic=new AuditoriaLogic();
				this.auditoriaLogic.getNewConnexionToDeep("");
			}
			
			//this.auditoriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.auditoriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAuditoria);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAuditoria);	
					}
					
					if(this.jInternalFrameImportacionAuditoria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAuditoria);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAuditoria!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAuditoria);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAuditoria!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAuditoria);
				this.jInternalFrameDetalleFormAuditoria.setVisible(false);
				this.jInternalFrameDetalleFormAuditoria.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAuditoria);
					this.jInternalFrameReporteDinamicoAuditoria.setVisible(false);
					this.jInternalFrameReporteDinamicoAuditoria.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAuditoria!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAuditoria);
					this.jInternalFrameImportacionAuditoria.setVisible(false);
					this.jInternalFrameImportacionAuditoria.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAuditoria!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAuditoria);
					this.jInternalFrameOrderByAuditoria.setVisible(false);
					this.jInternalFrameOrderByAuditoria.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAuditoriaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AuditoriaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.auditoriaReturnGeneral=new AuditoriaParameterReturnGeneral();
			
			this.auditoriaParameterGeneral=new AuditoriaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.auditoriaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AuditoriaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.auditoriaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(AuditoriaDetalleConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AuditoriaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.auditoriaSessionBean.getEsGuardarRelacionado(),this.auditoriaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AuditoriaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.auditoriaSessionBean.getEsGuardarRelacionado(),this.auditoriaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAuditoria=false;
			this.isVisibilidadCeldaDuplicarAuditoria=true;
			this.isVisibilidadCeldaCopiarAuditoria=true;
			this.isVisibilidadCeldaVerFormAuditoria=true;
			this.isVisibilidadCeldaOrdenAuditoria=true;
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;
			this.isVisibilidadCeldaModificarAuditoria=false;
			this.isVisibilidadCeldaActualizarAuditoria=false;
			this.isVisibilidadCeldaEliminarAuditoria=false;
			this.isVisibilidadCeldaCancelarAuditoria=false;
			this.isVisibilidadCeldaGuardarAuditoria=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=false;
			
			
			this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora=true;
			this.isVisibilidadBusquedaPorIPPCPorFechaHora=true;
			this.isVisibilidadBusquedaPorNombrePCPorFechaHora=true;
			this.isVisibilidadBusquedaPorNombreTablaPorFechaHora=true;
			this.isVisibilidadBusquedaPorObservacionesPorFechaHora=true;
			this.isVisibilidadBusquedaPorProcesoPorFechaHora=true;
			this.isVisibilidadBusquedaPorUsuarioPCPorFechaHora=true;
			this.isVisibilidadFK_IdAuditoria=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAuditoria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAuditoria();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAuditoria(false);
			
			this.setPermisosUsuarioAuditoria();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.auditoriaSessionBean.getEsGuardarRelacionado() 
				|| (this.auditoriaSessionBean.getEsGuardarRelacionado() && this.auditoriaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAuditoriaClasesRelacionadas();
			}
			
			if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAuditoriaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AuditoriaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAuditoria();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAuditoria();
			}
			
			if(!this.isPermisoBusquedaAuditoria) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAuditoria.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAuditoria,this.isPermisoPaginacionMedioAuditoria,this.isPermisoPaginacionTodoAuditoria);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AuditoriaConstantesFunciones.getTiposSeleccionarAuditoria());
				
				this.tiposColumnasSelect=AuditoriaConstantesFunciones.getTiposSeleccionarAuditoria(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectAuditoria();				
				//this.tiposRelacionesSelect=AuditoriaConstantesFunciones.getTiposRelacionesAuditoria(true);
				
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
			//if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAuditoria();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAuditoria(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAuditoria(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAuditoria() ;
			
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
			
			
			this.auditoriadetalleLogic=new AuditoriaDetalleLogic(); 
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
				auditoriaImplementable= (AuditoriaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AuditoriaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				auditoriaImplementableHome= (AuditoriaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AuditoriaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.auditorias= new ArrayList<Auditoria>();
			this.auditoriasEliminados= new ArrayList<Auditoria>();
						
			this.isEsNuevoAuditoria=false;
			this.esParaAccionDesdeFormularioAuditoria=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAuditoria(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAuditoria();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AuditoriaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AuditoriaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAuditoria("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAuditoria(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAuditoria!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAuditoria();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAuditoria();
			}
			
			AuditoriaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAuditoria.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAuditoria(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Auditoria: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAuditoria() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAuditoria")) {
				iIndex=this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();	
				
				

				if(sTitle.equals("Auditoria Detalles")) {
					if(!AuditoriaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessAuditoria();

						this.cargarParteTabPanelRelacionadaAuditoriaDetalle(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAuditoria();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAuditoriaDetalle(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormAuditoria.cargarSessionConBeanSwingJInternalFrameAuditoriaDetalle(false,true,iIndex);
		this.jButtonAuditoriaDetalleActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAuditoriaDetalle();

		//this.jTabbedPaneRelacionesAuditoria.updateUI();
		//this.jTabbedPaneRelacionesAuditoria.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesAuditoria.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("AuditoriaDetalle")) {
				int row=this.jTableDatosAuditoria.getSelectedRow();
				jButtonAuditoriaDetalleActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Auditoria Detalle")) {

					if(this.isTienePermisosAuditoriaDetalle && this.auditoriaConstantesFunciones.mostrarAuditoriaDetalleAuditoria && !AuditoriaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Auditoria Detalles"+"("+AuditoriaDetalleConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Auditoria Detalles");

						if(auditoriaConstantesFunciones.resaltarAuditoriaDetalleAuditoria!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(auditoriaConstantesFunciones.resaltarAuditoriaDetalleAuditoria);
						}

						jmenuItem.setEnabled(this.auditoriaConstantesFunciones.activarAuditoriaDetalleAuditoria);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AuditoriaDetalle"));

						

						this.jInternalFrameDetalleFormAuditoria.jmenuDetalleAuditoria.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyAuditoria(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAuditoria(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAuditoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAuditoriaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAuditoria();
		
		this.cargarCombosFrameForeignKeyAuditoria();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAuditoria();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAuditoria();
		}
	}
	
	
	
	public void jButtonNuevoAuditoriaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
			
			if(jTableDatosAuditoria.getRowCount()>=1) {
				jTableDatosAuditoria.removeRowSelectionInterval(0, jTableDatosAuditoria.getRowCount()-1);						
			}
			
			this.isEsNuevoAuditoria=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAuditoria(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAuditoria(true);			
			//this.auditoria=new Auditoria();
			//this.auditoria.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAuditoria(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAuditoria() ;
			
			if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAuditoria(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.auditoria);	
			this.actualizarInformacion("INFO_PADRE",false,this.auditoria);				
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
			if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Auditoria: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAuditoriaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAuditoria.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAuditoria.getSelectedRows().length;			
			}
			
			auditoriasSeleccionados=this.getAuditoriasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAuditoria--;			
				//Auditoria auditoriaAux= new Auditoria();			
				//auditoriaAux.setId(this.iIdNuevoAuditoria);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Auditoria auditoriaOrigen=new Auditoria();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Auditoria auditoriaOrigen : auditoriasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							auditoriaOrigen =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							auditoriaOrigen =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAuditoria();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.auditoria.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAuditoria(auditoriaOrigen,this.auditoria,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.auditoriaLogic.getAuditorias().add(this.auditoriaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.auditorias.add(this.auditoriaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAuditoria(false);
				
				this.jTableDatosAuditoria.setRowSelectionInterval(this.getIndiceNuevoAuditoria(), this.getIndiceNuevoAuditoria());
				
				int iLastRow =  this.jTableDatosAuditoria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAuditoria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAuditoria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAuditoria(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();									
		
			Auditoria auditoriaOrigen=new Auditoria();
			Auditoria auditoriaDestino=new Auditoria();
				
			auditoriasSeleccionados=this.getAuditoriasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAuditoria.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || auditoriasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAuditoria.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaOrigen =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						auditoriaOrigen =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						auditoriaDestino =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						auditoriaDestino =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				auditoriaOrigen =auditoriasSeleccionados.get(0);
				auditoriaDestino =auditoriasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAuditoria(auditoriaOrigen,auditoriaDestino,true,false);
				
				auditoriaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(auditoriaDestino,auditoriaLogic.getAuditorias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(auditoriaDestino,auditorias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAuditoria(false);
				
				//this.jTableDatosAuditoria.setRowSelectionInterval(this.getIndiceNuevoAuditoria(), this.getIndiceNuevoAuditoria());
				
				int iLastRow =  this.jTableDatosAuditoria.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAuditoria.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAuditoria.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAuditoria(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAuditoria.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAuditoria.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAuditoria.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAuditoria.setVisible(!isVisible);
			this.jPanelPaginacionAuditoria.setVisible(!isVisible);
			this.jPanelAccionesAuditoria.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAuditoria();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAuditoria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAuditoria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAuditoria();
			
			this.abrirFrameOrderByAuditoria();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAuditoria();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAuditoria(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAuditoria);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAuditoria.isMaximum()) {
					this.jInternalFrameDetalleFormAuditoria.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAuditoria.setSize(this.jInternalFrameDetalleFormAuditoria.iWidthFormulario,this.jInternalFrameDetalleFormAuditoria.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAuditoria.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAuditoria.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAuditoria.isMaximum()) {
						this.jInternalFrameDetalleFormAuditoria.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAuditoria.jContentPaneDetalleAuditoria.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAuditoria.jContentPaneDetalleAuditoria.getWidth(),AuditoriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAuditoria.jContentPaneDetalleAuditoria.getWidth(),AuditoriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAuditoria.jContentPaneDetalleAuditoria.getWidth(),AuditoriaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AuditoriaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAuditoriaDetalle();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAuditoria.setVisible(true);
	        this.jInternalFrameDetalleFormAuditoria.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAuditoria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAuditoria==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAuditoria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoria,false,this);
				} else {
					this.jInternalFrameOrderByAuditoria=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAuditoria,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAuditoria);
				this.jInternalFrameOrderByAuditoria.setVisible(false);
				this.jInternalFrameOrderByAuditoria.setSelected(false);
				
				this.jInternalFrameOrderByAuditoria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAuditoria"));
				
				this.inicializarActualizarBindingTablaOrderByAuditoria();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAuditoria() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAuditoria==null) {
				
				this.jInternalFrameImportacionAuditoria=new ImportacionJInternalFrame(AuditoriaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAuditoria);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAuditoria);
				this.jInternalFrameImportacionAuditoria.setVisible(false);
				this.jInternalFrameImportacionAuditoria.setSelected(false);


				this.jInternalFrameImportacionAuditoria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAuditoria"));
				this.jInternalFrameImportacionAuditoria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAuditoria"));
				this.jInternalFrameImportacionAuditoria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAuditoria"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAuditoria() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAuditoria==null) {
				this.jInternalFrameReporteDinamicoAuditoria=new ReporteDinamicoJInternalFrame(AuditoriaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAuditoria);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAuditoria);
				this.jInternalFrameReporteDinamicoAuditoria.setVisible(false);
				this.jInternalFrameReporteDinamicoAuditoria.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAuditoria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAuditoria"));
				this.jInternalFrameReporteDinamicoAuditoria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAuditoria"));
				this.jInternalFrameReporteDinamicoAuditoria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAuditoria"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAuditoria();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAuditoriaDetalle() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.jScrollPanelDatosAuditoriaDetalle.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormAuditoria.jContentPaneDetalleAuditoria.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.jScrollPanelDatosAuditoriaDetalle.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.jScrollPanelDatosAuditoriaDetalle.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.jScrollPanelDatosAuditoriaDetalle.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleAuditoria() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAuditoria);
			
	       	this.jInternalFrameDetalleFormAuditoria.setVisible(false);
	        this.jInternalFrameDetalleFormAuditoria.setSelected(false);
			
			//this.jInternalFrameDetalleFormAuditoria.dispose();
			//this.jInternalFrameDetalleFormAuditoria=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAuditoria() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAuditoria.setVisible(true);
	        this.jInternalFrameReporteDinamicoAuditoria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAuditoria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAuditoria.setVisible(true);
	        this.jInternalFrameImportacionAuditoria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAuditoria() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAuditoria.setVisible(true);
	        this.jInternalFrameOrderByAuditoria.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAuditoria() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAuditoria.setVisible(false);
	        this.jInternalFrameOrderByAuditoria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAuditoria() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAuditoria.setVisible(false);
	        this.jInternalFrameReporteDinamicoAuditoria.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAuditoria() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAuditoria.setVisible(false);
	        this.jInternalFrameImportacionAuditoria.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAuditoria(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAuditoria(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAuditoria(true);
			//this.isEsNuevoAuditoria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAuditoria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAuditoria(false) ;
			
			if(auditoriaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.getEsGuardarRelacionado() && AuditoriaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAuditoriaDetalleActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAuditoria(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAuditoria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAuditoriaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAuditoria(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAuditoria(true);
			//this.isEsNuevoAuditoria=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.auditoria.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAuditoria("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAuditoria(false) ;
			
			if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAuditoria(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAuditoria(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAuditoria(false);
			
			//if(!this.isEsNuevoAuditoria) {								
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				
			}
			
			if(this.permiteMantenimiento(this.auditoria)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAuditoria=true;
					this.inicializarActualizarBindingTablaAuditoria(false);
					this.isEsNuevoAuditoria=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAuditoria=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAuditoria=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAuditoria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAuditoria(false);
				
				this.habilitarDeshabilitarControlesAuditoria(false);
			
												
				
				if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAuditoria();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAuditoriaActionPerformed(evt,auditoriaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAuditoria(this.auditoria,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAuditoria.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,auditoriaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.auditoria.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAuditoriaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				this.auditoria.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				this.auditoria.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.auditoria)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AuditoriaModel) this.jTableDatosAuditoria.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAuditoria=true;
				this.inicializarActualizarBindingTablaAuditoria(false);
				this.isEsNuevoAuditoria=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAuditoria(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAuditoria(false);
				
				this.habilitarDeshabilitarControlesAuditoria(false);
				
				
				
				if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAuditoria();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAuditoriaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAuditoria.getRowCount()>=1) {
				jTableDatosAuditoria.removeRowSelectionInterval(0, jTableDatosAuditoria.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAuditoria(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAuditoria(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAuditoria(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAuditoria(false) ;
			
			this.isEsNuevoAuditoria=false;
			
			if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAuditoria();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAuditoriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAuditoria(false);
				
				//SI ES MANUAL
				if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAuditoria();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAuditoriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAuditoria--;			
			//Auditoria auditoriaAux= new Auditoria();			
			//auditoriaAux.setId(this.iIdNuevoAuditoria);
			
			if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAuditoria();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
			
			this.auditoria.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.auditoriaLogic.getAuditorias().add(this.auditoriaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.auditorias.add(this.auditoriaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAuditoria(false);
			
			this.jTableDatosAuditoria.setRowSelectionInterval(this.getIndiceNuevoAuditoria(), this.getIndiceNuevoAuditoria());
			
			int iLastRow =  this.jTableDatosAuditoria.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAuditoria.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAuditoria.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAuditoria(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAuditoriaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAuditoria(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAuditoria(false);
			
			//SI ES MANUAL
			if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAuditoria();
			}
			
			//this.abrirFrameTreeAuditoria();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAuditoriaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AuditoriaS ?", "MANTENIMIENTO DE Auditoria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAuditoria.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAuditoria();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.auditoriaReturnGeneral=auditoriaLogic.procesarImportacionAuditoriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.auditoriaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAuditoriaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAuditoriaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAuditoria.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAuditoria.setFileImportacion(this.jInternalFrameImportacionAuditoria.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAuditoria.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAuditoria.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAuditoria.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAuditoria.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAuditoriaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		

		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AuditoriaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AuditoriaBaseDesign.jrxml";
			
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
			
			this.generarReporteAuditorias("Todos",auditoriasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AuditoriaConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBRETABLA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTabla_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTabla_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTabla_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTabla_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_IDFILA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Fila_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Fila_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Fila_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Fila_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_ACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_PROCESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_oceso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_oceso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_oceso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_oceso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBREPC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbrePC_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbrePC_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbrePC_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbrePC_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_IPPC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PC_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PC_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PC_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PC_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_USUARIOPC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_uarioPC_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_uarioPC_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_uarioPC_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_uarioPC_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_FECHAHORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaHora_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaHora_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaHora_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaHora_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AuditoriaConstantesFunciones.LABEL_OBSERVACION:
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
		
		if(this.jInternalFrameReporteDinamicoAuditoria.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AuditoriaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBRETABLA:
					sNombreCampoCategoria="nombre_tabla";
					break;

				case AuditoriaConstantesFunciones.LABEL_IDFILA:
					sNombreCampoCategoria="id_fila";
					break;

				case AuditoriaConstantesFunciones.LABEL_ACCION:
					sNombreCampoCategoria="accion";
					break;

				case AuditoriaConstantesFunciones.LABEL_PROCESO:
					sNombreCampoCategoria="proceso";
					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBREPC:
					sNombreCampoCategoria="nombre_p_c";
					break;

				case AuditoriaConstantesFunciones.LABEL_IPPC:
					sNombreCampoCategoria="ip_pc";
					break;

				case AuditoriaConstantesFunciones.LABEL_USUARIOPC:
					sNombreCampoCategoria="usuario_p_c";
					break;

				case AuditoriaConstantesFunciones.LABEL_FECHAHORA:
					sNombreCampoCategoria="fecha_hora";
					break;

				case AuditoriaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AuditoriaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBRETABLA:
					sNombreCampoCategoriaValor="nombre_tabla";
					break;

				case AuditoriaConstantesFunciones.LABEL_IDFILA:
					sNombreCampoCategoriaValor="id_fila";
					break;

				case AuditoriaConstantesFunciones.LABEL_ACCION:
					sNombreCampoCategoriaValor="accion";
					break;

				case AuditoriaConstantesFunciones.LABEL_PROCESO:
					sNombreCampoCategoriaValor="proceso";
					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBREPC:
					sNombreCampoCategoriaValor="nombre_p_c";
					break;

				case AuditoriaConstantesFunciones.LABEL_IPPC:
					sNombreCampoCategoriaValor="ip_pc";
					break;

				case AuditoriaConstantesFunciones.LABEL_USUARIOPC:
					sNombreCampoCategoriaValor="usuario_p_c";
					break;

				case AuditoriaConstantesFunciones.LABEL_FECHAHORA:
					sNombreCampoCategoriaValor="fecha_hora";
					break;

				case AuditoriaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AuditoriaConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBRETABLA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre De La Tabla",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tabla");
					break;

				case AuditoriaConstantesFunciones.LABEL_IDFILA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fila",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_fila");
					break;

				case AuditoriaConstantesFunciones.LABEL_ACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Accion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"accion");
					break;

				case AuditoriaConstantesFunciones.LABEL_PROCESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Proceso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"proceso");
					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBREPC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre De Pc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_p_c");
					break;

				case AuditoriaConstantesFunciones.LABEL_IPPC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ip Del Pc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ip_pc");
					break;

				case AuditoriaConstantesFunciones.LABEL_USUARIOPC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario Del Pc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"usuario_p_c");
					break;

				case AuditoriaConstantesFunciones.LABEL_FECHAHORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Y Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_hora");
					break;

				case AuditoriaConstantesFunciones.LABEL_OBSERVACION:
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
	
	public void jButtonGenerarExcelReporteDinamicoAuditoriaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Auditorias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AuditoriaConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBRETABLA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_NOMBRETABLA);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getnombre_tabla());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_IDFILA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IDFILA);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getid_fila());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_ACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_ACCION);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_PROCESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_PROCESO);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getproceso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_NOMBREPC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_NOMBREPC);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getnombre_p_c());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_IPPC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IPPC);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getip_pc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_USUARIOPC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_USUARIOPC);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getusuario_p_c());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_FECHAHORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_FECHAHORA);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getfecha_hora());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AuditoriaConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AuditoriaConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(Auditoria auditoria:auditoriasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(auditoria.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelAuditoria(row);				
			//	iRow++;
			//}				
			
			//for(Auditoria auditoriaAux:auditoriasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAuditoria(auditoriaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
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
				this.auditoriaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAuditoria(false);
			
			//SI ES MANUAL
			if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAuditoria();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAuditoriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAuditoria(false);
			
			//SI ES MANUAL
			if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAuditoria();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAuditoriaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAuditoria(false);
			
			//SI ES MANUAL
			if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAuditoria();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAuditoria() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAuditoria.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAuditoria.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAuditoria.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAuditoria.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAuditoria.setMinimumSize(dimensionMinimum);
		this.jTableDatosAuditoria.setMaximumSize(dimensionMaximum);
		this.jTableDatosAuditoria.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAuditoria(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAuditoria(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAuditoria(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAuditoria(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAuditoria(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAuditoria(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAuditoria(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAuditoria(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AuditoriaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAuditoria() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAuditoria();
		
		this.inicializarActualizarBindingBotonesManualAuditoria(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAuditoria();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAuditoria() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAuditoria(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAuditoria(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAuditoria.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAuditoria.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAuditoria.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAuditoria!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAuditoria.jCheckBoxPostAccionNuevoAuditoria.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAuditoria.jCheckBoxPostAccionSinCerrarAuditoria.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAuditoria.jCheckBoxPostAccionSinMensajeAuditoria.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAuditoria.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAuditoria.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAuditoria.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAuditoria!=null) {
				this.jInternalFrameDetalleFormAuditoria.jCheckBoxPostAccionNuevoAuditoria.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAuditoria.jCheckBoxPostAccionSinCerrarAuditoria.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAuditoria.jCheckBoxPostAccionSinMensajeAuditoria.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAuditoria.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAuditoria.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAuditoria!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAuditoria.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAuditoria.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAuditoria.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAuditoria.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAuditoria.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAuditoria.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAuditoria.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAuditoria(Boolean esInicializar) throws Exception {
		try	{	
			if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAuditoria(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAuditoria() throws Exception {
		try	{
			if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAuditoria();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAuditoria() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAuditoria() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAuditoria.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAuditoria.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAuditoria.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAuditoria.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAuditoria.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAuditoria.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAuditoria.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAuditoria.addItem(reporte);
			}
			
			
			if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAuditoria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAuditoria.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAuditoria.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAuditoria.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAuditoria.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAuditoria.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAuditoria.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAuditoria.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAuditoria.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAuditoria();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAuditoria() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
				this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
				this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAuditoria.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
				
				if(this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAuditoria.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAuditoria.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAuditoria.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAuditoria.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAuditoria()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.getSelectedItem()!=null){this.id_usuarioBusquedaPorIdUsuarioPorFechaHora=((Usuario)this.jComboBoxid_usuarioBusquedaPorIdUsuarioPorFechaHoraAuditoria.getSelectedItem()).getId();}
		this.fecha_horaBusquedaPorIdUsuarioPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraAuditoria.getDate().getTime());
		this.fecha_horaFinalBusquedaPorIdUsuarioPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorIdUsuarioPorFechaHoraFinalAuditoria.getDate().getTime());
		this.ip_pcBusquedaPorIPPCPorFechaHora=this.jTextFieldip_pcBusquedaPorIPPCPorFechaHoraAuditoria.getText();
		this.fecha_horaBusquedaPorIPPCPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraAuditoria.getDate().getTime());
		this.fecha_horaFinalBusquedaPorIPPCPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorIPPCPorFechaHoraFinalAuditoria.getDate().getTime());
		this.nombre_p_cBusquedaPorNombrePCPorFechaHora=this.jTextFieldnombre_p_cBusquedaPorNombrePCPorFechaHoraAuditoria.getText();
		this.fecha_horaBusquedaPorNombrePCPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraAuditoria.getDate().getTime());
		this.fecha_horaFinalBusquedaPorNombrePCPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorNombrePCPorFechaHoraFinalAuditoria.getDate().getTime());
		this.nombre_tablaBusquedaPorNombreTablaPorFechaHora=this.jTextAreanombre_tablaBusquedaPorNombreTablaPorFechaHoraAuditoria.getText();
		this.fecha_horaBusquedaPorNombreTablaPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraAuditoria.getDate().getTime());
		this.fecha_horaFinalBusquedaPorNombreTablaPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorNombreTablaPorFechaHoraFinalAuditoria.getDate().getTime());
		this.fecha_horaBusquedaPorObservacionesPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraAuditoria.getDate().getTime());
		this.fecha_horaFinalBusquedaPorObservacionesPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorObservacionesPorFechaHoraFinalAuditoria.getDate().getTime());
		this.observacionBusquedaPorObservacionesPorFechaHora=this.jTextAreaobservacionBusquedaPorObservacionesPorFechaHoraAuditoria.getText();
		this.procesoBusquedaPorProcesoPorFechaHora=this.jTextAreaprocesoBusquedaPorProcesoPorFechaHoraAuditoria.getText();
		this.fecha_horaBusquedaPorProcesoPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraAuditoria.getDate().getTime());
		this.fecha_horaFinalBusquedaPorProcesoPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorProcesoPorFechaHoraFinalAuditoria.getDate().getTime());
		this.usuario_p_cBusquedaPorUsuarioPCPorFechaHora=this.jTextFieldusuario_p_cBusquedaPorUsuarioPCPorFechaHoraAuditoria.getText();
		this.fecha_horaBusquedaPorUsuarioPCPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraAuditoria.getDate().getTime());
		this.fecha_horaFinalBusquedaPorUsuarioPCPorFechaHora=new Timestamp(this.jDateChooserfecha_horaBusquedaPorUsuarioPCPorFechaHoraFinalAuditoria.getDate().getTime());
		this.id_filaFK_IdAuditoria=Long.parseLong(this.jTextFieldid_filaFK_IdAuditoriaAuditoria.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAuditoria(Boolean esInicializar) throws Exception {				
		if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAuditoria();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAuditoria() throws Exception {
		this.inicializarActualizarBindingTablaAuditoria(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAuditoria() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAuditoriaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoriaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAuditoria(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=auditoriaLogic.getAuditorias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=auditorias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAuditoria.setModel(new AuditoriaModel(this.auditoriaLogic.getAuditorias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAuditoria.setModel(new AuditoriaModel(this.auditorias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAuditoria!=null && this.jInternalFrameOrderByAuditoria.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAuditoria();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AuditoriaConstantesFunciones.SCLASSWEBTITULO,auditoriaConstantesFunciones.resaltarSeleccionarAuditoria,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AuditoriaConstantesFunciones.SCLASSWEBTITULO,auditoriaConstantesFunciones.resaltarSeleccionarAuditoria,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_ID));

		if(this.auditoriaConstantesFunciones.mostraridAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.auditoriaConstantesFunciones.resaltaridAuditoria,this.auditoriaConstantesFunciones.activaridAuditoria,this,true,"idAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltaridAuditoria,this.auditoriaConstantesFunciones.activaridAuditoria,this,true,"idAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_IDUSUARIO));

		if(this.auditoriaConstantesFunciones.mostrarid_usuarioAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.auditoriaConstantesFunciones.resaltarid_usuarioAuditoria,this,this.auditoriaConstantesFunciones.activarid_usuarioAuditoria));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.auditoriaConstantesFunciones.resaltarid_usuarioAuditoria,this,this.auditoriaConstantesFunciones.activarid_usuarioAuditoria,false,"id_usuarioAuditoria","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_NOMBRETABLA));

		if(this.auditoriaConstantesFunciones.mostrarnombre_tablaAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_NOMBRETABLA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFunciones.resaltarnombre_tablaAuditoria,this.auditoriaConstantesFunciones.activarnombre_tablaAuditoria,this,true,"nombre_tablaAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltarnombre_tablaAuditoria,this.auditoriaConstantesFunciones.activarnombre_tablaAuditoria,this,true,"nombre_tablaAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_IDFILA));

		if(this.auditoriaConstantesFunciones.mostrarid_filaAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_IDFILA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.auditoriaConstantesFunciones.resaltarid_filaAuditoria,this.auditoriaConstantesFunciones.activarid_filaAuditoria,this,true,"id_filaAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltarid_filaAuditoria,this.auditoriaConstantesFunciones.activarid_filaAuditoria,this,true,"id_filaAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_ACCION));

		if(this.auditoriaConstantesFunciones.mostraraccionAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_ACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFunciones.resaltaraccionAuditoria,this.auditoriaConstantesFunciones.activaraccionAuditoria,this,true,"accionAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltaraccionAuditoria,this.auditoriaConstantesFunciones.activaraccionAuditoria,this,true,"accionAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_PROCESO));

		if(this.auditoriaConstantesFunciones.mostrarprocesoAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_PROCESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFunciones.resaltarprocesoAuditoria,this.auditoriaConstantesFunciones.activarprocesoAuditoria,this,true,"procesoAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltarprocesoAuditoria,this.auditoriaConstantesFunciones.activarprocesoAuditoria,this,true,"procesoAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_NOMBREPC));

		if(this.auditoriaConstantesFunciones.mostrarnombre_p_cAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_NOMBREPC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFunciones.resaltarnombre_p_cAuditoria,this.auditoriaConstantesFunciones.activarnombre_p_cAuditoria,this,true,"nombre_p_cAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltarnombre_p_cAuditoria,this.auditoriaConstantesFunciones.activarnombre_p_cAuditoria,this,true,"nombre_p_cAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_IPPC));

		if(this.auditoriaConstantesFunciones.mostrarip_pcAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_IPPC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFunciones.resaltarip_pcAuditoria,this.auditoriaConstantesFunciones.activarip_pcAuditoria,this,true,"ip_pcAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltarip_pcAuditoria,this.auditoriaConstantesFunciones.activarip_pcAuditoria,this,true,"ip_pcAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_USUARIOPC));

		if(this.auditoriaConstantesFunciones.mostrarusuario_p_cAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_USUARIOPC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFunciones.resaltarusuario_p_cAuditoria,this.auditoriaConstantesFunciones.activarusuario_p_cAuditoria,this,true,"usuario_p_cAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltarusuario_p_cAuditoria,this.auditoriaConstantesFunciones.activarusuario_p_cAuditoria,this,true,"usuario_p_cAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_FECHAHORA));

		if(this.auditoriaConstantesFunciones.mostrarfecha_horaAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_FECHAHORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateTimeRenderer(this.auditoriaConstantesFunciones.resaltarfecha_horaAuditoria,this.auditoriaConstantesFunciones.activarfecha_horaAuditoria));
			tableColumn.setCellEditor(new DateTimeEditorRenderer(this.auditoriaConstantesFunciones.resaltarfecha_horaAuditoria,this.auditoriaConstantesFunciones.activarfecha_horaAuditoria));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,AuditoriaConstantesFunciones.LABEL_OBSERVACION));

		if(this.auditoriaConstantesFunciones.mostrarobservacionAuditoria && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AuditoriaConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.auditoriaConstantesFunciones.resaltarobservacionAuditoria,this.auditoriaConstantesFunciones.activarobservacionAuditoria,this,true,"observacionAuditoria","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.auditoriaConstantesFunciones.resaltarobservacionAuditoria,this.auditoriaConstantesFunciones.activarobservacionAuditoria,this,true,"observacionAuditoria","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AuditoriaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosAuditoriaDetalle && this.auditoriaConstantesFunciones.mostrarAuditoriaDetalleAuditoria && !AuditoriaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Auditoria Detalles");
				tableColumn.setHeaderValue("Auditoria Detalles");
				tableColumn.setCellRenderer(new AuditoriaDetalleTableCell(auditoriaConstantesFunciones.resaltarAuditoriaDetalleAuditoria,this,this.auditoriaConstantesFunciones.activarAuditoriaDetalleAuditoria));
				tableColumn.setCellEditor(new AuditoriaDetalleTableCell(auditoriaConstantesFunciones.resaltarAuditoriaDetalleAuditoria,this,this.auditoriaConstantesFunciones.activarAuditoriaDetalleAuditoria));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosAuditoria.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.auditoriaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.auditoriaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAuditoria.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.auditoriaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.auditoriaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAuditoria.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAuditoria && this.isPermisoGuardarCambiosAuditoria) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.auditoriaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.auditoriaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAuditoria.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.auditoriaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosAuditoria.addColumn(tableColumn);
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
			
			this.jTableDatosAuditoria.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAuditoria && this.isPermisoGuardarCambiosAuditoria) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.auditoriaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAuditoria && this.isPermisoGuardarCambiosAuditoria) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAuditoria.moveColumn(this.jTableDatosAuditoria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAuditoria.moveColumn(this.jTableDatosAuditoria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.auditoriaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosAuditoria.moveColumn(this.jTableDatosAuditoria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAuditoria.moveColumn(this.jTableDatosAuditoria.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAuditoria.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAuditoria.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAuditoria,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAuditoria.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAuditoria.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAuditoria.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAuditoria.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAuditoria.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=auditoriaLogic.getAuditorias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=auditorias.size()-1;
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
		//this.jTableDatosAuditoria.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAuditoria.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAuditoria();
			
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
				
				//this.isEsNuevoAuditoria=false;
					
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
				if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAuditoria==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAuditoria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAuditoria.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.auditoria.getsType().equals("DUPLICADO")
				   || this.auditoria.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAuditoria=true;
				
				} else {
					this.isEsNuevoAuditoria=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
					if(this.auditoria.getId()>=0 && !this.auditoria.getIsNew()) {						
						this.isEsNuevoAuditoria=false;
						
					} else {
						this.isEsNuevoAuditoria=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAuditoria(esRelaciones);						
				
				this.seleccionarAuditoria(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.auditoria.getId()<0) {
					this.isEsNuevoAuditoria=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAuditoria(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAuditoria(evt,rowIndex);
				}	
				
				if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Auditoria: " + this.dDif); 
					}
				}								
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAuditoria(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.auditoria)) {
					if(this.auditoria.getId()>0) {
						this.auditoria.setIsDeleted(true);
						
						this.auditoriasEliminados.add(this.auditoria);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.auditoriaLogic.getAuditorias().remove(this.auditoria);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.auditorias.remove(this.auditoria);				
					}
					
					
					((AuditoriaModel) this.jTableDatosAuditoria.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAuditoria(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAuditoria(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAuditoria) {
			
			if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAuditoria.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAuditoria.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAuditoria(this.auditoria);
				}
				
				//ARCHITECTURE
				try {
					

					//Usuario
					if(!this.auditoriaConstantesFunciones.cargarid_usuarioAuditoria || this.auditoriaConstantesFunciones.event_dependid_usuarioAuditoria) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.auditoria.getid_usuario());
									//this.inicializarActualizarBindingAuditoria(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(auditoria.getUsuario()!=null) {
							this.usuariosForeignKey.add(auditoria.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.auditoria.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAuditoria("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAuditoria(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAuditoria() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAuditoria(Auditoria auditoria) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAuditoria(auditoria,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAuditoria(Auditoria auditoria,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAuditoria(auditoria);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAuditoria(auditoria,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAuditoria(auditoria);
	}
	
	public void setVariablesObjetoActualToFormularioAuditoria(Auditoria auditoria) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.setText(auditoria.getId().toString());
			this.jInternalFrameDetalleFormAuditoria.jTextAreanombre_tablaAuditoria.setText(auditoria.getnombre_tabla());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldid_filaAuditoria.setText(auditoria.getid_fila().toString());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldaccionAuditoria.setText(auditoria.getaccion());
			this.jInternalFrameDetalleFormAuditoria.jTextAreaprocesoAuditoria.setText(auditoria.getproceso());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldnombre_p_cAuditoria.setText(auditoria.getnombre_p_c());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldip_pcAuditoria.setText(auditoria.getip_pc());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldusuario_p_cAuditoria.setText(auditoria.getusuario_p_c());
			this.jInternalFrameDetalleFormAuditoria.jDateChooserfecha_horaAuditoria.setDate(auditoria.getfecha_hora());
			this.jInternalFrameDetalleFormAuditoria.jTextAreaobservacionAuditoria.setText(auditoria.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Auditoria auditoriaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,auditoriaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Auditoria auditoriaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				auditoriaLocal=this.auditoria;
			} else {
				auditoriaLocal=this.auditoriaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(auditoriaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAuditoria(auditoriaLocal,true);
					
					if(auditoriaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(auditoriaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.auditoriaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(auditoriaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAuditoria(Auditoria auditoria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAuditoria(auditoria,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(auditoria);
	}
	
	public void setVariablesFormularioToObjetoActualAuditoria(Auditoria auditoria,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAuditoria(auditoria,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAuditoria(Auditoria auditoria,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.getText()==null || this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.getText()=="" || this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.getText()=="Id") {
				this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.setText("0");
			}

			if(conColumnasBase) {auditoria.setId(Long.parseLong(this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelIdAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setnombre_tabla(this.jInternalFrameDetalleFormAuditoria.jTextAreanombre_tablaAuditoria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_NOMBRETABLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelnombre_tablaAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setid_fila(Long.parseLong(this.jInternalFrameDetalleFormAuditoria.jTextFieldid_filaAuditoria.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_IDFILA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelid_filaAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setaccion(this.jInternalFrameDetalleFormAuditoria.jTextFieldaccionAuditoria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_ACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelaccionAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setproceso(this.jInternalFrameDetalleFormAuditoria.jTextAreaprocesoAuditoria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_PROCESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelprocesoAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setnombre_p_c(this.jInternalFrameDetalleFormAuditoria.jTextFieldnombre_p_cAuditoria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_NOMBREPC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelnombre_p_cAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setip_pc(this.jInternalFrameDetalleFormAuditoria.jTextFieldip_pcAuditoria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_IPPC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelip_pcAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setusuario_p_c(this.jInternalFrameDetalleFormAuditoria.jTextFieldusuario_p_cAuditoria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_USUARIOPC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelusuario_p_cAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setfecha_hora(new Timestamp(this.jInternalFrameDetalleFormAuditoria.jDateChooserfecha_horaAuditoria.getDate().getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_FECHAHORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelfecha_horaAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			auditoria.setobservacion(this.jInternalFrameDetalleFormAuditoria.jTextAreaobservacionAuditoria.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AuditoriaConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAuditoria.jLabelobservacionAuditoria,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAuditoria(Auditoria auditoriaBean,Auditoria auditoria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAuditoria(Auditoria auditoriaOrigen,Auditoria auditoria,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && auditoriaOrigen.getId()!=null && !auditoriaOrigen.getId().equals(0L))) {auditoria.setId(auditoriaOrigen.getId());}}
			if(conDefault || (!conDefault && auditoriaOrigen.getnombre_tabla()!=null && !auditoriaOrigen.getnombre_tabla().equals(""))) {auditoria.setnombre_tabla(auditoriaOrigen.getnombre_tabla());}
			if(conDefault || (!conDefault && auditoriaOrigen.getid_fila()!=null && !auditoriaOrigen.getid_fila().equals(0L))) {auditoria.setid_fila(auditoriaOrigen.getid_fila());}
			if(conDefault || (!conDefault && auditoriaOrigen.getaccion()!=null && !auditoriaOrigen.getaccion().equals(""))) {auditoria.setaccion(auditoriaOrigen.getaccion());}
			if(conDefault || (!conDefault && auditoriaOrigen.getproceso()!=null && !auditoriaOrigen.getproceso().equals(""))) {auditoria.setproceso(auditoriaOrigen.getproceso());}
			if(conDefault || (!conDefault && auditoriaOrigen.getnombre_p_c()!=null && !auditoriaOrigen.getnombre_p_c().equals(""))) {auditoria.setnombre_p_c(auditoriaOrigen.getnombre_p_c());}
			if(conDefault || (!conDefault && auditoriaOrigen.getip_pc()!=null && !auditoriaOrigen.getip_pc().equals(""))) {auditoria.setip_pc(auditoriaOrigen.getip_pc());}
			if(conDefault || (!conDefault && auditoriaOrigen.getusuario_p_c()!=null && !auditoriaOrigen.getusuario_p_c().equals(""))) {auditoria.setusuario_p_c(auditoriaOrigen.getusuario_p_c());}
			if(conDefault || (!conDefault && auditoriaOrigen.getfecha_hora()!=null && !auditoriaOrigen.getfecha_hora().equals(new Timestamp((new Date()).getTime())))) {auditoria.setfecha_hora(auditoriaOrigen.getfecha_hora());}
			if(conDefault || (!conDefault && auditoriaOrigen.getobservacion()!=null && !auditoriaOrigen.getobservacion().equals(""))) {auditoria.setobservacion(auditoriaOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAuditoria(Auditoria auditoria) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.setText(auditoria.getId().toString());
			this.jInternalFrameDetalleFormAuditoria.jTextAreanombre_tablaAuditoria.setText(auditoria.getnombre_tabla());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldid_filaAuditoria.setText(auditoria.getid_fila().toString());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldaccionAuditoria.setText(auditoria.getaccion());
			this.jInternalFrameDetalleFormAuditoria.jTextAreaprocesoAuditoria.setText(auditoria.getproceso());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldnombre_p_cAuditoria.setText(auditoria.getnombre_p_c());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldip_pcAuditoria.setText(auditoria.getip_pc());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldusuario_p_cAuditoria.setText(auditoria.getusuario_p_c());
			this.jInternalFrameDetalleFormAuditoria.jDateChooserfecha_horaAuditoria.setDate(auditoria.getfecha_hora());
			this.jInternalFrameDetalleFormAuditoria.jTextAreaobservacionAuditoria.setText(auditoria.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAuditoria(AuditoriaBean auditoriaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.setText(auditoriaBean.getId().toString());
			this.jInternalFrameDetalleFormAuditoria.jTextAreanombre_tablaAuditoria.setText(auditoriaBean.getnombre_tabla());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldid_filaAuditoria.setText(auditoriaBean.getid_fila().toString());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldaccionAuditoria.setText(auditoriaBean.getaccion());
			this.jInternalFrameDetalleFormAuditoria.jTextAreaprocesoAuditoria.setText(auditoriaBean.getproceso());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldnombre_p_cAuditoria.setText(auditoriaBean.getnombre_p_c());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldip_pcAuditoria.setText(auditoriaBean.getip_pc());
			this.jInternalFrameDetalleFormAuditoria.jTextFieldusuario_p_cAuditoria.setText(auditoriaBean.getusuario_p_c());
			this.jInternalFrameDetalleFormAuditoria.jDateChooserfecha_horaAuditoria.setDate(auditoriaBean.getfecha_hora());
			this.jInternalFrameDetalleFormAuditoria.jTextAreaobservacionAuditoria.setText(auditoriaBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAuditoria(AuditoriaParameterReturnGeneral auditoriaReturnGeneral,AuditoriaBean auditoriaBean,Boolean conDefault) throws Exception { 
		try {
			Auditoria auditoriaLocal=new Auditoria();
			
			auditoriaLocal=auditoriaReturnGeneral.getAuditoria();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && auditoriaLocal.getId()!=null && !auditoriaLocal.getId().equals(0L))) {auditoriaBean.setId(auditoriaLocal.getId());}}
			if(conDefault || (!conDefault && auditoriaLocal.getnombre_tabla()!=null && !auditoriaLocal.getnombre_tabla().equals(""))) {auditoriaBean.setnombre_tabla(auditoriaLocal.getnombre_tabla());}
			if(conDefault || (!conDefault && auditoriaLocal.getid_fila()!=null && !auditoriaLocal.getid_fila().equals(0L))) {auditoriaBean.setid_fila(auditoriaLocal.getid_fila());}
			if(conDefault || (!conDefault && auditoriaLocal.getaccion()!=null && !auditoriaLocal.getaccion().equals(""))) {auditoriaBean.setaccion(auditoriaLocal.getaccion());}
			if(conDefault || (!conDefault && auditoriaLocal.getproceso()!=null && !auditoriaLocal.getproceso().equals(""))) {auditoriaBean.setproceso(auditoriaLocal.getproceso());}
			if(conDefault || (!conDefault && auditoriaLocal.getnombre_p_c()!=null && !auditoriaLocal.getnombre_p_c().equals(""))) {auditoriaBean.setnombre_p_c(auditoriaLocal.getnombre_p_c());}
			if(conDefault || (!conDefault && auditoriaLocal.getip_pc()!=null && !auditoriaLocal.getip_pc().equals(""))) {auditoriaBean.setip_pc(auditoriaLocal.getip_pc());}
			if(conDefault || (!conDefault && auditoriaLocal.getusuario_p_c()!=null && !auditoriaLocal.getusuario_p_c().equals(""))) {auditoriaBean.setusuario_p_c(auditoriaLocal.getusuario_p_c());}
			if(conDefault || (!conDefault && auditoriaLocal.getfecha_hora()!=null && !auditoriaLocal.getfecha_hora().equals(new Timestamp((new Date()).getTime())))) {auditoriaBean.setfecha_hora(auditoriaLocal.getfecha_hora());}
			if(conDefault || (!conDefault && auditoriaLocal.getobservacion()!=null && !auditoriaLocal.getobservacion().equals(""))) {auditoriaBean.setobservacion(auditoriaLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAuditoriaGenerico(Long idAuditoriaSeleccionado,JComboBox jComboBoxAuditoria,List<Auditoria> auditoriasLocal)throws Exception {
		try {
			Auditoria  auditoriaTemp=null;

			for(Auditoria auditoriaAux:auditoriasLocal) {
				if(auditoriaAux.getId()!=null && auditoriaAux.getId().equals(idAuditoriaSeleccionado)) {
					auditoriaTemp=auditoriaAux;
					break;
				}
			}

			jComboBoxAuditoria.setSelectedItem(auditoriaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAuditoriaGenerico(JComboBox jComboBoxAuditoria,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAuditoria.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAuditoria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAuditoria.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAuditoria.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("AuditoriaDetalle")) {
			jButtonAuditoriaDetalleActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			auditoria=(Auditoria) auditoriaLogic.getAuditorias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			auditoria =(Auditoria) auditorias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!auditoria.getIsNew() && !auditoria.getIsChanged() && !auditoria.getIsDeleted()) {
				sDescripcion=auditoria.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=auditoria.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Auditoria auditoriaRow=new Auditoria();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			auditoriaRow=(Auditoria) auditoriaLogic.getAuditorias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			auditoriaRow=(Auditoria) auditorias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonAuditoriaDetalleActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Auditoria auditoria) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormAuditoria==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria = (Auditoria)this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.auditoria = (Auditoria)this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(auditoria!=null) {
						this.auditoria = auditoria;
					} else {
						this.auditoria = new Auditoria();
					}
				}

				if(this.isTienePermisosAuditoriaDetalle && this.permiteMantenimiento(this.auditoria)) {
					AuditoriaDetalleBeanSwingJInternalFrame auditoriadetalleBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFramePopup=new AuditoriaDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						auditoriadetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFramePopup;
					} else {
						auditoriadetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame;
					}

					List<Auditoria> auditorias=new ArrayList<Auditoria>();
					auditorias.add(this.auditoria);
					if(!esRelacionado) {
						//auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.setConGuardarRelaciones(false);
						//auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					auditoriadetalleBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormAuditoria.cargarAuditoriaDetalleBeanSwingJInternalFrame(auditorias,this.auditoria,auditoriadetalleBeanSwingJInternalFrame,/*conInicializar,*/auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.getConGuardarRelaciones(),auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.getEsGuardarRelacionado());
					auditoriadetalleBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						auditoriadetalleBeanSwingJInternalFrame.actualizarEstadoPanelsAuditoriaDetalle("no_relacionado");

						auditoriadetalleBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AuditoriaDetalleConstantesFunciones.ITAMANIOFILATABLA + (AuditoriaDetalleConstantesFunciones.ITAMANIOFILATABLA/2));

						auditoriadetalleBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderAuditoria=(TitledBorder)this.jScrollPanelDatosAuditoria.getBorder();
						TitledBorder titledBorderAuditoriaDetalle=(TitledBorder)auditoriadetalleBeanSwingJInternalFrame.jScrollPanelDatosAuditoriaDetalle.getBorder();

						titledBorderAuditoriaDetalle.setTitle(titledBorderAuditoria.getTitle() + " -> Auditoria Detalle");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,auditoriadetalleBeanSwingJInternalFrame);
						}

						auditoriadetalleBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(auditoriadetalleBeanSwingJInternalFrame);

						auditoriadetalleBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.auditoriaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Auditoria Detalle",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAuditoria(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAuditoria.setVisible((this.isVisibilidadCeldaNuevoAuditoria && this.isPermisoNuevoAuditoria));			
			this.jButtonDuplicarAuditoria.setVisible((this.isVisibilidadCeldaDuplicarAuditoria && this.isPermisoDuplicarAuditoria));			
			this.jButtonCopiarAuditoria.setVisible((this.isVisibilidadCeldaCopiarAuditoria && this.isPermisoCopiarAuditoria));
			this.jButtonVerFormAuditoria.setVisible((this.isVisibilidadCeldaVerFormAuditoria && this.isPermisoVerFormAuditoria));
			
			this.jButtonAbrirOrderByAuditoria.setVisible((this.isVisibilidadCeldaOrdenAuditoria && this.isPermisoOrdenAuditoria));			
			
			this.jButtonNuevoRelacionesAuditoria.setVisible((this.isVisibilidadCeldaNuevoRelacionesAuditoria && this.isPermisoNuevoAuditoria));			
			this.jButtonNuevoGuardarCambiosAuditoria.setVisible((this.isVisibilidadCeldaNuevoAuditoria && this.isPermisoNuevoAuditoria && this.isPermisoGuardarCambiosAuditoria));
			
			if(this.jInternalFrameDetalleFormAuditoria!=null) {
			this.jInternalFrameDetalleFormAuditoria.jButtonModificarAuditoria.setVisible((this.isVisibilidadCeldaModificarAuditoria && this.isPermisoActualizarAuditoria));	
			this.jInternalFrameDetalleFormAuditoria.jButtonActualizarAuditoria.setVisible((this.isVisibilidadCeldaActualizarAuditoria && this.isPermisoActualizarAuditoria));	
			this.jInternalFrameDetalleFormAuditoria.jButtonEliminarAuditoria.setVisible((this.isVisibilidadCeldaEliminarAuditoria && this.isPermisoEliminarAuditoria));
			this.jInternalFrameDetalleFormAuditoria.jButtonCancelarAuditoria.setVisible(this.isVisibilidadCeldaCancelarAuditoria);							
			this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosAuditoria.setVisible((this.isVisibilidadCeldaGuardarAuditoria && this.isPermisoGuardarCambiosAuditoria));			
			
			}
						
			this.jButtonGuardarCambiosTablaAuditoria.setVisible((this.isVisibilidadCeldaGuardarCambiosAuditoria && this.isPermisoGuardarCambiosAuditoria));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAuditoria.setVisible((this.isVisibilidadCeldaNuevoAuditoria && this.isPermisoNuevoAuditoria));						
			this.jButtonDuplicarToolBarAuditoria.setVisible((this.isVisibilidadCeldaDuplicarAuditoria && this.isPermisoDuplicarAuditoria));						
			this.jButtonCopiarToolBarAuditoria.setVisible((this.isVisibilidadCeldaCopiarAuditoria && this.isPermisoCopiarAuditoria));			
			this.jButtonVerFormToolBarAuditoria.setVisible((this.isVisibilidadCeldaVerFormAuditoria && this.isPermisoVerFormAuditoria));			
			this.jButtonAbrirOrderByToolBarAuditoria.setVisible((this.isVisibilidadCeldaOrdenAuditoria && this.isPermisoOrdenAuditoria));
			this.jButtonNuevoRelacionesToolBarAuditoria.setVisible((this.isVisibilidadCeldaNuevoRelacionesAuditoria && this.isPermisoNuevoAuditoria));			
			this.jButtonNuevoGuardarCambiosToolBarAuditoria.setVisible((this.isVisibilidadCeldaNuevoAuditoria && this.isPermisoNuevoAuditoria && this.isPermisoGuardarCambiosAuditoria));			
			
			if(this.jInternalFrameDetalleFormAuditoria!=null) {
			this.jInternalFrameDetalleFormAuditoria.jButtonModificarToolBarAuditoria.setVisible((this.isVisibilidadCeldaModificarAuditoria && this.isPermisoActualizarAuditoria));	
			this.jInternalFrameDetalleFormAuditoria.jButtonActualizarToolBarAuditoria.setVisible((this.isVisibilidadCeldaActualizarAuditoria  && this.isPermisoActualizarAuditoria));	
			this.jInternalFrameDetalleFormAuditoria.jButtonEliminarToolBarAuditoria.setVisible((this.isVisibilidadCeldaEliminarAuditoria && this.isPermisoEliminarAuditoria));
			this.jInternalFrameDetalleFormAuditoria.jButtonCancelarToolBarAuditoria.setVisible(this.isVisibilidadCeldaCancelarAuditoria);				
			this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosToolBarAuditoria.setVisible((this.isVisibilidadCeldaGuardarAuditoria && this.isPermisoGuardarCambiosAuditoria));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAuditoria.setVisible((this.isVisibilidadCeldaGuardarCambiosAuditoria && this.isPermisoGuardarCambiosAuditoria));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAuditoria.setVisible((this.isVisibilidadCeldaNuevoAuditoria && this.isPermisoNuevoAuditoria));			
			this.jMenuItemDuplicarAuditoria.setVisible((this.isVisibilidadCeldaDuplicarAuditoria && this.isPermisoDuplicarAuditoria));			
			this.jMenuItemCopiarAuditoria.setVisible((this.isVisibilidadCeldaCopiarAuditoria && this.isPermisoCopiarAuditoria));			
			this.jMenuItemVerFormAuditoria.setVisible((this.isVisibilidadCeldaVerFormAuditoria && this.isPermisoVerFormAuditoria));			
			this.jMenuItemAbrirOrderByAuditoria.setVisible((this.isVisibilidadCeldaOrdenAuditoria && this.isPermisoOrdenAuditoria));			
			//this.jMenuItemMostrarOcultarAuditoria.setVisible((this.isVisibilidadCeldaOrdenAuditoria && this.isPermisoOrdenAuditoria));
			this.jMenuItemDetalleAbrirOrderByAuditoria.setVisible((this.isVisibilidadCeldaOrdenAuditoria && this.isPermisoOrdenAuditoria));			
			//this.jMenuItemDetalleMostrarOcultarAuditoria.setVisible((this.isVisibilidadCeldaOrdenAuditoria && this.isPermisoOrdenAuditoria));			
			this.jMenuItemNuevoRelacionesAuditoria.setVisible((this.isVisibilidadCeldaNuevoRelacionesAuditoria && this.isPermisoNuevoAuditoria));			
			this.jMenuItemNuevoGuardarCambiosAuditoria.setVisible((this.isVisibilidadCeldaNuevoAuditoria && this.isPermisoNuevoAuditoria && this.isPermisoGuardarCambiosAuditoria));									
			
			if(this.jInternalFrameDetalleFormAuditoria!=null) {
			this.jInternalFrameDetalleFormAuditoria.jMenuItemModificarAuditoria.setVisible((this.isVisibilidadCeldaModificarAuditoria && this.isPermisoActualizarAuditoria));	
			this.jInternalFrameDetalleFormAuditoria.jMenuItemActualizarAuditoria.setVisible((this.isVisibilidadCeldaActualizarAuditoria && this.isPermisoActualizarAuditoria));	
			this.jInternalFrameDetalleFormAuditoria.jMenuItemEliminarAuditoria.setVisible((this.isVisibilidadCeldaEliminarAuditoria && this.isPermisoEliminarAuditoria));
			this.jInternalFrameDetalleFormAuditoria.jMenuItemCancelarAuditoria.setVisible(this.isVisibilidadCeldaCancelarAuditoria);				
			}
			
			this.jMenuItemGuardarCambiosAuditoria.setVisible((this.isVisibilidadCeldaGuardarAuditoria && this.isPermisoGuardarCambiosAuditoria));						
			this.jMenuItemGuardarCambiosTablaAuditoria.setVisible((this.isVisibilidadCeldaGuardarCambiosAuditoria && this.isPermisoGuardarCambiosAuditoria));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAuditoria=this.jButtonNuevoAuditoria.isVisible();
			this.isVisibilidadCeldaDuplicarAuditoria=this.jButtonDuplicarAuditoria.isVisible();
			this.isVisibilidadCeldaCopiarAuditoria=this.jButtonCopiarAuditoria.isVisible();
			this.isVisibilidadCeldaVerFormAuditoria=this.jButtonVerFormAuditoria.isVisible();
			
			this.isVisibilidadCeldaOrdenAuditoria=this.jButtonAbrirOrderByAuditoria.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=this.jButtonNuevoRelacionesAuditoria.isVisible();
			this.isVisibilidadCeldaModificarAuditoria=this.jButtonModificarAuditoria.isVisible();
			
			if(this.jInternalFrameDetalleFormAuditoria!=null) {
			this.isVisibilidadCeldaActualizarAuditoria=this.jInternalFrameDetalleFormAuditoria.jButtonActualizarAuditoria.isVisible();
			this.isVisibilidadCeldaEliminarAuditoria=this.jInternalFrameDetalleFormAuditoria.jButtonEliminarAuditoria.isVisible();
			this.isVisibilidadCeldaCancelarAuditoria=this.jInternalFrameDetalleFormAuditoria.jButtonCancelarAuditoria.isVisible();
			this.isVisibilidadCeldaGuardarAuditoria=this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosAuditoria.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAuditoria=this.jButtonGuardarCambiosTablaAuditoria.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAuditoria=this.jButtonNuevoToolBarAuditoria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=this.jButtonNuevoRelacionesToolBarAuditoria.isVisible();
			
			if(this.jInternalFrameDetalleFormAuditoria!=null) {
			this.isVisibilidadCeldaModificarAuditoria=this.jInternalFrameDetalleFormAuditoria.jButtonModificarToolBarAuditoria.isVisible();
			this.isVisibilidadCeldaActualizarAuditoria=this.jInternalFrameDetalleFormAuditoria.jButtonActualizarToolBarAuditoria.isVisible();
			this.isVisibilidadCeldaEliminarAuditoria=this.jInternalFrameDetalleFormAuditoria.jButtonEliminarToolBarAuditoria.isVisible();
			this.isVisibilidadCeldaCancelarAuditoria=this.jInternalFrameDetalleFormAuditoria.jButtonCancelarToolBarAuditoria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAuditoria=this.jButtonGuardarCambiosToolBarAuditoria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAuditoria=this.jButtonGuardarCambiosTablaToolBarAuditoria.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAuditoria=this.jMenuItemNuevoAuditoria.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=this.jMenuItemNuevoRelacionesAuditoria.isVisible();
			
			if(this.jInternalFrameDetalleFormAuditoria!=null) {
			this.isVisibilidadCeldaModificarAuditoria=this.jInternalFrameDetalleFormAuditoria.jMenuItemModificarAuditoria.isVisible();
			this.isVisibilidadCeldaActualizarAuditoria=this.jInternalFrameDetalleFormAuditoria.jMenuItemActualizarAuditoria.isVisible();
			this.isVisibilidadCeldaEliminarAuditoria=this.jInternalFrameDetalleFormAuditoria.jMenuItemEliminarAuditoria.isVisible();
			this.isVisibilidadCeldaCancelarAuditoria=this.jInternalFrameDetalleFormAuditoria.jMenuItemCancelarAuditoria.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAuditoria=this.jMenuItemGuardarCambiosAuditoria.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAuditoria=this.jMenuItemGuardarCambiosTablaAuditoria.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAuditoria(Boolean esInicializar) {
		if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
				//if(this.auditoriaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAuditoria();
			}
			
			this.inicializarActualizarBindingBotonesManualAuditoria(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAuditoria() {
		this.jButtonNuevoAuditoria.setVisible(this.isPermisoNuevoAuditoria);			
		this.jButtonDuplicarAuditoria.setVisible(this.isPermisoDuplicarAuditoria);			
		this.jButtonCopiarAuditoria.setVisible(this.isPermisoCopiarAuditoria);			
		this.jButtonVerFormAuditoria.setVisible(this.isPermisoVerFormAuditoria);			
		
		this.jButtonAbrirOrderByAuditoria.setVisible(this.isPermisoOrdenAuditoria);					
		
		this.jButtonNuevoRelacionesAuditoria.setVisible(this.isPermisoNuevoAuditoria);			
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonModificarAuditoria.setVisible(this.isPermisoActualizarAuditoria);	
			this.jInternalFrameDetalleFormAuditoria.jButtonActualizarAuditoria.setVisible(this.isPermisoActualizarAuditoria);	
			this.jInternalFrameDetalleFormAuditoria.jButtonEliminarAuditoria.setVisible(this.isPermisoEliminarAuditoria);
			this.jInternalFrameDetalleFormAuditoria.jButtonCancelarAuditoria.setVisible(this.isVisibilidadCeldaCancelarAuditoria);						
			this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosAuditoria.setVisible(this.isPermisoGuardarCambiosAuditoria);							
		}
		
		this.jButtonGuardarCambiosTablaAuditoria.setVisible(this.isPermisoActualizarAuditoria);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAuditoria() {
		this.jInternalFrameDetalleFormAuditoria.jButtonModificarAuditoria.setVisible(this.isPermisoActualizarAuditoria);	
		this.jInternalFrameDetalleFormAuditoria.jButtonActualizarAuditoria.setVisible(this.isPermisoActualizarAuditoria);	
		this.jInternalFrameDetalleFormAuditoria.jButtonEliminarAuditoria.setVisible(this.isPermisoEliminarAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jButtonCancelarAuditoria.setVisible(this.isVisibilidadCeldaCancelarAuditoria);							
		this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosAuditoria.setVisible((this.isVisibilidadCeldaGuardarAuditoria && this.isPermisoGuardarCambiosAuditoria));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAuditoria() {
		if(AuditoriaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAuditoria();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAuditoria() {
	}
	
	public void jTableDatosAuditoriaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAuditoria(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.auditoria.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioAuditoriaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebAuditoria(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAuditoria.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAuditoria.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.auditoriaLogic.getConnexion());

				if(this.auditoria.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.auditoria.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAuditoria=(TitledBorder)this.jScrollPanelDatosAuditoria.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderAuditoria.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.auditoria.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tablaAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getnombre_tabla()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tabla like '%"+this.auditoria.getnombre_tabla()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_filaAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getid_fila()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_fila = "+this.auditoria.getid_fila().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonaccionAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where accion like '%"+this.auditoria.getaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprocesoAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getproceso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where proceso like '%"+this.auditoria.getproceso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_p_cAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getnombre_p_c()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_p_c like '%"+this.auditoria.getnombre_p_c()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonip_pcAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getip_pc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ip_pc like '%"+this.auditoria.getip_pc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonusuario_p_cAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getusuario_p_c()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where usuario_p_c like '%"+this.auditoria.getusuario_p_c()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_horaAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getfecha_hora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hora = "+this.auditoria.getfecha_hora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionAuditoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.getauditoria(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.auditoria==null) {
						this.auditoria = new Auditoria();
					}

					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);
				}

				if(this.auditoria.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.auditoria.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAuditoria(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasBusquedaPorIdUsuarioPorFechaHora();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIPPCPorFechaHoraAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasBusquedaPorIPPCPorFechaHora();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombrePCPorFechaHoraAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasBusquedaPorNombrePCPorFechaHora();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTablaPorFechaHoraAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasBusquedaPorNombreTablaPorFechaHora();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorObservacionesPorFechaHoraAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasBusquedaPorObservacionesPorFechaHora();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorProcesoPorFechaHoraAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasBusquedaPorProcesoPorFechaHora();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasBusquedaPorUsuarioPCPorFechaHora();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAuditoriaAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasFK_IdAuditoria();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioAuditoriaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAuditoria(false,false);

			this.getAuditoriasFK_IdUsuario();

			this.inicializarActualizarBindingAuditoria(false);

			//if(AuditoriaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAuditoria(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.auditoriaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAuditoria() {
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
		

		if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
			this.jInternalFrameDetalleFormAuditoria.setVisible(false);	    			
			this.jInternalFrameDetalleFormAuditoria.dispose();
			this.jInternalFrameDetalleFormAuditoria=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
			this.jInternalFrameReporteDinamicoAuditoria.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAuditoria.dispose();
			this.jInternalFrameReporteDinamicoAuditoria=null;
		}
		
		if(this.jInternalFrameImportacionAuditoria!=null) {
			this.jInternalFrameImportacionAuditoria.setVisible(false);	    			
			this.jInternalFrameImportacionAuditoria.dispose();
			this.jInternalFrameImportacionAuditoria=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAuditoria();
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
			
			if(sTipo.equals("NuevoAuditoria")) {
				jButtonNuevoAuditoriaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAuditoria")) {
				jButtonDuplicarAuditoriaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAuditoria")) {
				jButtonCopiarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("VerFormAuditoria")) {
				jButtonVerFormAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAuditoria")) {
				jButtonNuevoAuditoriaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAuditoria")) {
				jButtonDuplicarAuditoriaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAuditoria")) {
				jButtonNuevoAuditoriaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAuditoria")) {
				jButtonDuplicarAuditoriaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAuditoria")) {
				jButtonNuevoAuditoriaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAuditoria")) {
				jButtonNuevoAuditoriaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAuditoria")) {
				jButtonNuevoAuditoriaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAuditoria")) {
				jButtonModificarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAuditoria")) {
				jButtonModificarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAuditoria")) {
				jButtonModificarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAuditoria")) {
				jButtonActualizarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAuditoria")) {
				jButtonActualizarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAuditoria")) {
				jButtonActualizarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("EliminarAuditoria")) {
				jButtonEliminarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAuditoria")) {
				jButtonEliminarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAuditoria")) {
				jButtonEliminarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("CancelarAuditoria")) {
				jButtonCancelarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAuditoria")) {
				jButtonCancelarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAuditoria")) {
				jButtonCancelarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("CerrarAuditoria")) {
				jButtonCerrarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAuditoria")) {
				jButtonCerrarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAuditoria")) {
				jButtonCerrarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAuditoria")) {
				jButtonMostrarOcultarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAuditoria")) {
				jButtonCancelarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAuditoria")) {
				jButtonGuardarCambiosAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAuditoria")) {
				jButtonGuardarCambiosAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAuditoria")) {
				jButtonCopiarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAuditoria")) {
				jButtonVerFormAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAuditoria")) {
				jButtonGuardarCambiosAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAuditoria")) {
				jButtonCopiarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAuditoria")) {
				jButtonVerFormAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAuditoria")) {
				jButtonGuardarCambiosAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAuditoria")) {
				jButtonGuardarCambiosAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAuditoria")) {
				jButtonGuardarCambiosAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAuditoria")) {
				jButtonRecargarInformacionAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAuditoria")) {
				jButtonRecargarInformacionAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAuditoria")) {
				jButtonRecargarInformacionAuditoriaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAuditoria")) {
				jButtonAnterioresAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAuditoria")) {
				jButtonAnterioresAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAuditoria")) {
				jButtonAnterioresAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAuditoria")) {
				jButtonSiguientesAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAuditoria")) {
				jButtonSiguientesAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAuditoria")) {
				jButtonSiguientesAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAuditoria") || sTipo.equals("MenuItemDetalleAbrirOrderByAuditoria")) {
				jButtonAbrirOrderByAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAuditoria") || sTipo.equals("MenuItemDetalleMostrarOcultarAuditoria")) {
				jButtonMostrarOcultarAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAuditoria")) {
				jButtonNuevoGuardarCambiosAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAuditoria")) {
				jButtonNuevoGuardarCambiosAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAuditoria")) {
				jButtonNuevoGuardarCambiosAuditoriaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAuditoria")) {
				jButtonCerrarReporteDinamicoAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAuditoria")) {
				jButtonGenerarReporteDinamicoAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAuditoria")) {
				
				jButtonGenerarExcelReporteDinamicoAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAuditoria")) {
				jButtonCerrarImportacionAuditoriaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAuditoria")) {
				
				jButtonGenerarImportacionAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAuditoria")) {
				
				jButtonAbrirImportacionAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAuditoria")) {
				jComboBoxTiposAccionesAuditoriaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAuditoria")) {
				jComboBoxTiposRelacionesAuditoriaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAuditoria")) {
				jComboBoxTiposAccionesAuditoriaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAuditoria")) {
				
				jComboBoxTiposSeleccionarAuditoriaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAuditoria")) {
				jTextFieldValorCampoGeneralAuditoriaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAuditoria")) {
				jButtonAbrirOrderByAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAuditoria")) {
				jButtonAbrirOrderByAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAuditoria")) {
				jButtonCerrarOrderByAuditoriaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAuditoriaBusqueda")) {
				this.jButtonidAuditoriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioAuditoriaUpdate")) {
				this.jButtonid_usuarioAuditoriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioAuditoriaBusqueda")) {
				this.jButtonid_usuarioAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tablaAuditoriaBusqueda")) {
				this.jButtonnombre_tablaAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_filaAuditoriaBusqueda")) {
				this.jButtonid_filaAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("accionAuditoriaBusqueda")) {
				this.jButtonaccionAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("procesoAuditoriaBusqueda")) {
				this.jButtonprocesoAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_p_cAuditoriaBusqueda")) {
				this.jButtonnombre_p_cAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ip_pcAuditoriaBusqueda")) {
				this.jButtonip_pcAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("usuario_p_cAuditoriaBusqueda")) {
				this.jButtonusuario_p_cAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_horaAuditoriaBusqueda")) {
				this.jButtonfecha_horaAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionAuditoriaBusqueda")) {
				this.jButtonobservacionAuditoriaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdUsuarioPorFechaHoraAuditoria")) {
				this.jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoriaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIPPCPorFechaHoraAuditoria")) {
				this.jButtonBusquedaPorIPPCPorFechaHoraAuditoriaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombrePCPorFechaHoraAuditoria")) {
				this.jButtonBusquedaPorNombrePCPorFechaHoraAuditoriaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTablaPorFechaHoraAuditoria")) {
				this.jButtonBusquedaPorNombreTablaPorFechaHoraAuditoriaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorObservacionesPorFechaHoraAuditoria")) {
				this.jButtonBusquedaPorObservacionesPorFechaHoraAuditoriaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorProcesoPorFechaHoraAuditoria")) {
				this.jButtonBusquedaPorProcesoPorFechaHoraAuditoriaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorUsuarioPCPorFechaHoraAuditoria")) {
				this.jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoriaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdAuditoriaAuditoria")) {
				this.jButtonFK_IdAuditoriaAuditoriaActionPerformed(evt);
			}
			
			;
			
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAuditoria();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				


				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Auditoria auditoriaLocal=null;
			
			if(!this.getEsControlTabla()) {
				auditoriaLocal=this.auditoria;
			} else {
				auditoriaLocal=this.auditoriaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
							
				
				


				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaAnterior =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriaAnterior =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
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
			
			


			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
								
						
				


				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
								
				
				


				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaAnterior =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriaAnterior =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaAnterior =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriaAnterior =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
							
				
				


				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriaAnterior =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.auditoriaAnterior =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
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
			
			


			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
								
				
				


				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaAnterior =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriaAnterior =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
			
			this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAuditoria")) {
					jCheckBoxSeleccionarTodosAuditoriaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAuditoria")) {
					jCheckBoxSeleccionadosAuditoriaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAuditoria")) {
					
				}
				
				


				
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
												
				
				


				
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.auditoriaAnterior =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.auditoriaAnterior =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
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
			
			


			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAuditoriaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.auditoria);
				
				this.actualizarInformacion("INFO_PADRE",false,this.auditoria);
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
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
				
				


				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Auditoria.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Auditoria.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAuditoriaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.auditoriaAnterior =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.auditoriaAnterior =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAuditoria")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAuditoriaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAuditoria.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.auditoria =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.auditoria =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.auditoria);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAuditoria")) {
				
				}
				
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAuditoria")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAuditoria.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAuditoria")) {
			
			}
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAuditoria();
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
			if(sTipo.equals("NuevoAuditoria")) {
				jButtonNuevoAuditoriaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAuditoria")) {
				jButtonDuplicarAuditoriaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAuditoria")) {
				jButtonCopiarAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAuditoria")) {
				jButtonVerFormAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAuditoria")) {
				jButtonNuevoAuditoriaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAuditoria")) {
				jButtonModificarAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAuditoria")) {
				jButtonActualizarAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAuditoria")) {
				jButtonEliminarAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAuditoria")) {
				jButtonGuardarCambiosAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAuditoria")) {
				jButtonCancelarAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAuditoria")) {
				jButtonCerrarAuditoriaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAuditoria")) {
				jButtonGuardarCambiosAuditoriaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAuditoria")) {
				jButtonNuevoGuardarCambiosAuditoriaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAuditoria")) {
				jButtonAbrirOrderByAuditoriaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAuditoria")) {
				jButtonRecargarInformacionAuditoriaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAuditoria")) {
				jButtonAnterioresAuditoriaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAuditoria")) {
				jButtonSiguientesAuditoriaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAuditoriaBusqueda")) {
				this.jButtonidAuditoriaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioAuditoriaUpdate")) {
				this.jButtonid_usuarioAuditoriaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioAuditoriaBusqueda")) {
				this.jButtonid_usuarioAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tablaAuditoriaBusqueda")) {
				this.jButtonnombre_tablaAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_filaAuditoriaBusqueda")) {
				this.jButtonid_filaAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("accionAuditoriaBusqueda")) {
				this.jButtonaccionAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("procesoAuditoriaBusqueda")) {
				this.jButtonprocesoAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_p_cAuditoriaBusqueda")) {
				this.jButtonnombre_p_cAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ip_pcAuditoriaBusqueda")) {
				this.jButtonip_pcAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("usuario_p_cAuditoriaBusqueda")) {
				this.jButtonusuario_p_cAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_horaAuditoriaBusqueda")) {
				this.jButtonfecha_horaAuditoriaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionAuditoriaBusqueda")) {
				this.jButtonobservacionAuditoriaBusquedaActionPerformed(evt);
			}
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAuditoria();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAuditoria")) {
				closingInternalFrameAuditoria();
				
			} else if(sTipo.equals("jButtonCancelarAuditoria")) {
				JInternalFrameBase jInternalFrameDetalleFormAuditoria = (JInternalFrameBase)evt.getSource();
	            	
	            AuditoriaBeanSwingJInternalFrame jInternalFrameParent=(AuditoriaBeanSwingJInternalFrame)jInternalFrameDetalleFormAuditoria.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAuditoriaActionPerformed(null);
			}
			
			AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.auditoria,new Object(),this.auditoriaParameterGeneral,this.auditoriaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAuditoria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAuditoria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAuditoria(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.auditoria)) {
			if(!esControlTabla) {
				if(AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);			
				}
				
				if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAuditoria(this.auditoria,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.auditoriaReturnGeneral=auditoriaLogic.procesarEventosAuditoriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.auditoriaLogic.getAuditorias(),this.auditoria,this.auditoriaParameterGeneral,this.isEsNuevoAuditoria,classes);//this.auditoriaLogic.getAuditoria()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAuditoria(this.auditoriaReturnGeneral,this.auditoriaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAuditoria(classes,this.auditoriaReturnGeneral,this.auditoriaBean,false);
					}
						
					if(this.auditoriaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAuditoria(this.auditoriaReturnGeneral.getAuditoria());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAuditoria(this.auditoriaReturnGeneral.getAuditoria());	
					}
						
					if(this.auditoriaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAuditoria(this.auditoriaReturnGeneral.getAuditoria(),classes);//this.auditoriaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAuditoria(this.auditoria,classes);//this.auditoriaBean);									
				}
			
				if(AuditoriaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAuditoria(this.auditoria,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAuditoria(this.auditoria);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.auditoriaAnterior!=null) {
						this.auditoria=this.auditoriaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.auditoriaReturnGeneral=auditoriaLogic.procesarEventosAuditoriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.auditoriaLogic.getAuditorias(),this.auditoria,this.auditoriaParameterGeneral,this.isEsNuevoAuditoria,classes);//this.auditoriaLogic.getAuditoria()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.auditoriaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.auditoriaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.auditoriaReturnGeneral.getAuditoria(),auditoriaLogic.getAuditorias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.auditoriaReturnGeneral.getAuditoria(),this.auditorias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAuditoria.repaint();
				
				//((AbstractTableModel) this.jTableDatosAuditoria.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAuditoria();
			}
		}
	}
	
	public void actualizarVisualTableDatosAuditoria() throws Exception {
		
		AuditoriaModel auditoriaModel=(AuditoriaModel)this.jTableDatosAuditoria.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			auditoriaModel.auditorias=this.auditoriaLogic.getAuditorias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			auditoriaModel.auditorias=this.auditorias;
		}
		
		
		((AuditoriaModel) this.jTableDatosAuditoria.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAuditoria() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getauditoriaAnterior(),this.auditoriaLogic.getAuditorias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getauditoriaAnterior(),this.auditorias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAuditoria();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAuditoria(Auditoria auditoria,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AuditoriaDetalle.class)) {
					this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.setAuditoriaDetalles(auditoria.getAuditoriaDetalles());
					this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaAuditoriaDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
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
										
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.auditoria,new Object(),generalEntityParameterGeneral,this.auditoriaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AuditoriaConstantesFunciones.getClassesRelationshipsOfAuditoria(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AuditoriaConstantesFunciones.getClassesRelationshipsFromStringsOfAuditoria(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAuditoria(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AuditoriaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.auditoria,new Object(),generalEntityParameterGeneral,this.auditoriaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAuditoria(AuditoriaBean auditoriaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AuditoriaDetalle.class)) {
					this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.setAuditoriaDetalles(auditoria.getAuditoriaDetalles());
					this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaAuditoriaDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAuditoria(ArrayList<Classe> classes,AuditoriaReturnGeneral auditoriaReturnGeneral,AuditoriaBean auditoriaBean,Boolean conDefault) throws Exception {
		
			this.auditoriaBean.setAuditoriaDetalles(auditoriaReturnGeneral.getAuditoria().getAuditoriaDetalles());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAuditoria(Auditoria auditoria,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(AuditoriaDetalle.class)) {
					auditoria.setAuditoriaDetalles(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleLogic.getAuditoriaDetalles());
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
		if(!paraTabla && !this.permiteMantenimiento(this.auditoria)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAuditoria = new AuditoriaDetalleFormJInternalFrame(jDesktopPane,this.auditoriaSessionBean.getConGuardarRelaciones(),this.auditoriaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAuditoria);
		this.jInternalFrameDetalleFormAuditoria.setVisible(false);
		this.jInternalFrameDetalleFormAuditoria.setSelected(false);						
		
		this.jInternalFrameDetalleFormAuditoria.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAuditoria.auditoriaLogic=this.auditoriaLogic;
		
		this.cargarCombosFrameForeignKeyAuditoria("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAuditoria();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAuditoria();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAuditoria("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAuditoria();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAuditoria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAuditoria"));
		
		this.jInternalFrameDetalleFormAuditoria.jButtonModificarAuditoria.addActionListener(new ButtonActionListener(this,"ModificarAuditoria"));

		
		this.jInternalFrameDetalleFormAuditoria.jButtonModificarToolBarAuditoria.addActionListener(new ButtonActionListener(this,"ModificarToolBarAuditoria"));
					
		this.jInternalFrameDetalleFormAuditoria.jMenuItemModificarAuditoria.addActionListener(new ButtonActionListener(this,"MenuItemModificarAuditoria"));		
		
		
		
		this.jInternalFrameDetalleFormAuditoria.jButtonActualizarAuditoria.addActionListener (new ButtonActionListener(this,"ActualizarAuditoria"));
		
		
		this.jInternalFrameDetalleFormAuditoria.jButtonActualizarToolBarAuditoria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAuditoria"));
						
		this.jInternalFrameDetalleFormAuditoria.jMenuItemActualizarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAuditoria"));		
		
		
		
		this.jInternalFrameDetalleFormAuditoria.jButtonEliminarAuditoria.addActionListener (new ButtonActionListener(this,"EliminarAuditoria"));
		
		
		this.jInternalFrameDetalleFormAuditoria.jButtonEliminarToolBarAuditoria.addActionListener (new ButtonActionListener(this,"EliminarToolBarAuditoria"));
								
		this.jInternalFrameDetalleFormAuditoria.jMenuItemEliminarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAuditoria"));		
		
		
		
		this.jInternalFrameDetalleFormAuditoria.jButtonCancelarAuditoria.addActionListener (new ButtonActionListener(this,"CancelarAuditoria"));
		
		
		this.jInternalFrameDetalleFormAuditoria.jButtonCancelarToolBarAuditoria.addActionListener (new ButtonActionListener(this,"CancelarToolBarAuditoria"));
					
		this.jInternalFrameDetalleFormAuditoria.jMenuItemCancelarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAuditoria"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAuditoria.jMenuItemDetalleCerrarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAuditoria"));		
		
		
		
		this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosToolBarAuditoria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAuditoria"));
		
		
		
		this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosToolBarAuditoria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAuditoria"));
		
		
		
		this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAuditoria"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonidAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"idAuditoriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAuditoria.jButtonid_usuarioAuditoriaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAuditoriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonid_usuarioAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonnombre_tablaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tablaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonid_filaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"id_filaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonaccionAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"accionAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonprocesoAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"procesoAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonnombre_p_cAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_p_cAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonip_pcAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"ip_pcAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonusuario_p_cAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"usuario_p_cAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonfecha_horaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_horaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonobservacionAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"observacionAuditoriaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAuditoria"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAuditoria"));
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAuditoria"));
		}
		
		this.jTableDatosAuditoria.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAuditoria"));
		
		this.jTableDatosAuditoria.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAuditoria"));
		
		this.jButtonNuevoAuditoria.addActionListener(new ButtonActionListener(this,"NuevoAuditoria"));
		
		this.jButtonDuplicarAuditoria.addActionListener(new ButtonActionListener(this,"DuplicarAuditoria"));
		
		this.jButtonCopiarAuditoria.addActionListener(new ButtonActionListener(this,"CopiarAuditoria"));
		
		this.jButtonVerFormAuditoria.addActionListener(new ButtonActionListener(this,"VerFormAuditoria"));
		
		
		this.jButtonNuevoToolBarAuditoria.addActionListener(new ButtonActionListener(this,"NuevoToolBarAuditoria"));
			
		this.jButtonDuplicarToolBarAuditoria.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAuditoria"));
			
		this.jMenuItemNuevoAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAuditoria"));
			
		this.jMenuItemDuplicarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAuditoria"));		
		
		
		this.jButtonNuevoRelacionesAuditoria.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAuditoria"));
		
		
		this.jButtonNuevoRelacionesToolBarAuditoria.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAuditoria"));
			
		this.jMenuItemNuevoRelacionesAuditoria.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAuditoria"));		
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonModificarAuditoria.addActionListener(new ButtonActionListener(this,"ModificarAuditoria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonModificarToolBarAuditoria.addActionListener(new ButtonActionListener(this,"ModificarToolBarAuditoria"));
			
			this.jInternalFrameDetalleFormAuditoria.jMenuItemModificarAuditoria.addActionListener(new ButtonActionListener(this,"MenuItemModificarAuditoria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAuditoria.jButtonActualizarAuditoria.addActionListener (new ButtonActionListener(this,"ActualizarAuditoria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonActualizarToolBarAuditoria.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAuditoria"));
				
			this.jInternalFrameDetalleFormAuditoria.jMenuItemActualizarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAuditoria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonEliminarAuditoria.addActionListener (new ButtonActionListener(this,"EliminarAuditoria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonEliminarToolBarAuditoria.addActionListener (new ButtonActionListener(this,"EliminarToolBarAuditoria"));
						
			this.jInternalFrameDetalleFormAuditoria.jMenuItemEliminarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAuditoria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonCancelarAuditoria.addActionListener (new ButtonActionListener(this,"CancelarAuditoria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonCancelarToolBarAuditoria.addActionListener (new ButtonActionListener(this,"CancelarToolBarAuditoria"));
			
			this.jInternalFrameDetalleFormAuditoria.jMenuItemCancelarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAuditoria"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAuditoria.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAuditoria"));		
		
		
		this.jButtonCerrarAuditoria.addActionListener (new ButtonActionListener(this,"CerrarAuditoria"));
		
		
		this.jButtonCerrarToolBarAuditoria.addActionListener (new ButtonActionListener(this,"CerrarToolBarAuditoria"));
			
		this.jMenuItemCerrarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAuditoria"));
			
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jMenuItemDetalleCerrarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAuditoria"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosAuditoria.addActionListener (new ButtonActionListener(this,"GuardarCambiosAuditoria"));
		}
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosToolBarAuditoria.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAuditoria"));
		}
		
		this.jButtonCopiarToolBarAuditoria.addActionListener (new ButtonActionListener(this,"CopiarToolBarAuditoria"));
			
		this.jButtonVerFormToolBarAuditoria.addActionListener (new ButtonActionListener(this,"VerFormToolBarAuditoria"));
		
		this.jMenuItemGuardarCambiosAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAuditoria"));
			
		this.jMenuItemCopiarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAuditoria"));		
		
		this.jMenuItemVerFormAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAuditoria"));		
		
		
		this.jButtonGuardarCambiosTablaAuditoria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAuditoria"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAuditoria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAuditoria"));
			
		this.jMenuItemGuardarCambiosTablaAuditoria.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAuditoria"));		
		
		
		
		this.jButtonRecargarInformacionAuditoria.addActionListener (new ButtonActionListener(this,"RecargarInformacionAuditoria"));
					
		this.jButtonRecargarInformacionToolBarAuditoria.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAuditoria"));
		
		this.jMenuItemRecargarInformacionAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAuditoria"));		
		
		
		
		this.jButtonAnterioresAuditoria.addActionListener (new ButtonActionListener(this,"AnterioresAuditoria"));
		
		
		this.jButtonAnterioresToolBarAuditoria.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAuditoria"));
		
		this.jMenuItemAnterioresAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAuditoria"));		
		
		
		this.jButtonSiguientesAuditoria.addActionListener (new ButtonActionListener(this,"SiguientesAuditoria"));
		
		
		this.jButtonSiguientesToolBarAuditoria.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAuditoria"));
			
		this.jMenuItemSiguientesAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAuditoria"));
			
		this.jMenuItemAbrirOrderByAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAuditoria"));
			
		this.jMenuItemMostrarOcultarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAuditoria"));
			
		this.jMenuItemDetalleAbrirOrderByAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAuditoria"));
			
		this.jMenuItemDetalleMostarOcultarAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAuditoria"));		
		
		
		this.jButtonNuevoGuardarCambiosAuditoria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAuditoria"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAuditoria.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAuditoria"));
			
		this.jMenuItemNuevoGuardarCambiosAuditoria.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAuditoria"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAuditoria.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAuditoria"));

		this.jCheckBoxSeleccionadosAuditoria.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAuditoria"));
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAuditoria"));
		}
		
		
		this.jComboBoxTiposRelacionesAuditoria.addActionListener (new ButtonActionListener(this,"TiposRelacionesAuditoria"));
			
		this.jComboBoxTiposAccionesAuditoria.addActionListener (new ButtonActionListener(this,"TiposAccionesAuditoria"));
					
		this.jComboBoxTiposSeleccionarAuditoria.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAuditoria"));
			
		this.jTextFieldValorCampoGeneralAuditoria.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAuditoria"));		
		
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonidAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"idAuditoriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAuditoria.jButtonid_usuarioAuditoriaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAuditoriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonid_usuarioAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonnombre_tablaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tablaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonid_filaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"id_filaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonaccionAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"accionAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonprocesoAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"procesoAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonnombre_p_cAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_p_cAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonip_pcAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"ip_pcAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonusuario_p_cAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"usuario_p_cAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonfecha_horaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_horaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonobservacionAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"observacionAuditoriaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorIdUsuarioPorFechaHoraAuditoria"));

			this.jButtonBusquedaPorIPPCPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorIPPCPorFechaHoraAuditoria"));

			this.jButtonBusquedaPorNombrePCPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePCPorFechaHoraAuditoria"));

			this.jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTablaPorFechaHoraAuditoria"));

			this.jButtonBusquedaPorObservacionesPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorObservacionesPorFechaHoraAuditoria"));

			this.jButtonBusquedaPorProcesoPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorProcesoPorFechaHoraAuditoria"));

			this.jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorUsuarioPCPorFechaHoraAuditoria"));

			this.jButtonFK_IdAuditoriaAuditoria.addActionListener(new ButtonActionListener(this,"FK_IdAuditoriaAuditoria"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAuditoria!=null) {
				this.jInternalFrameReporteDinamicoAuditoria.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAuditoria"));
				this.jInternalFrameReporteDinamicoAuditoria.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAuditoria"));
				this.jInternalFrameReporteDinamicoAuditoria.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAuditoria"));
			}
			
			//this.jButtonCerrarReporteDinamicoAuditoria.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAuditoria"));				
			//this.jButtonGenerarReporteDinamicoAuditoria.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAuditoria"));
			//this.jButtonGenerarExcelReporteDinamicoAuditoria.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAuditoria"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAuditoria!=null) {
				this.jInternalFrameImportacionAuditoria.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAuditoria"));
				this.jInternalFrameImportacionAuditoria.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAuditoria"));
				this.jInternalFrameImportacionAuditoria.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAuditoria"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAuditoria.addActionListener (new ButtonActionListener(this,"AbrirOrderByAuditoria"));
			
			this.jButtonAbrirOrderByToolBarAuditoria.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAuditoria"));			
			
			if(this.jInternalFrameOrderByAuditoria!=null) {
				this.jInternalFrameOrderByAuditoria.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAuditoria"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAuditoria!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAuditoria.jTabbedPaneRelacionesAuditoria.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAuditoria"));
		
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
            		closingInternalFrameAuditoria();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAuditoria.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAuditoria = (JInternalFrameBase)event.getSource();
	            	
	            AuditoriaBeanSwingJInternalFrame jInternalFrameParent=(AuditoriaBeanSwingJInternalFrame)jInternalFrameDetalleFormAuditoria.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAuditoriaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAuditoria.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAuditoriaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAuditoria.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAuditoria.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAuditoria";
		inputMap = this.jButtonNuevoAuditoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAuditoria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAuditoriaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAuditoriaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAuditoria";
		inputMap = this.jButtonNuevoRelacionesAuditoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAuditoria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAuditoriaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAuditoria";
		inputMap = this.jButtonModificarAuditoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAuditoria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAuditoriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAuditoria";
		inputMap = this.jButtonActualizarAuditoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAuditoria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAuditoriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAuditoria";
		inputMap = this.jButtonEliminarAuditoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAuditoria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAuditoriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAuditoria";
		inputMap = this.jButtonCancelarAuditoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAuditoria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAuditoriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAuditoria";
		inputMap = this.jButtonCerrarAuditoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAuditoria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAuditoriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAuditoria";
		inputMap = this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosAuditoria.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAuditoria.jButtonGuardarCambiosAuditoria.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAuditoriaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAuditoria.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAuditoriaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAuditoria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAuditoriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAuditoria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAuditoriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAuditoria.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAuditoriaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonidAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"idAuditoriaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAuditoria.jButtonid_usuarioAuditoriaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioAuditoriaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonid_usuarioAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonnombre_tablaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tablaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonid_filaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"id_filaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonaccionAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"accionAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonprocesoAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"procesoAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonnombre_p_cAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_p_cAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonip_pcAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"ip_pcAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonusuario_p_cAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"usuario_p_cAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonfecha_horaAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_horaAuditoriaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAuditoria.jButtonobservacionAuditoriaBusqueda.addActionListener(new ButtonActionListener(this,"observacionAuditoriaBusqueda"));
		
		
		this.jButtonBusquedaPorIdUsuarioPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorIdUsuarioPorFechaHoraAuditoria"));

		this.jButtonBusquedaPorIPPCPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorIPPCPorFechaHoraAuditoria"));

		this.jButtonBusquedaPorNombrePCPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePCPorFechaHoraAuditoria"));

		this.jButtonBusquedaPorNombreTablaPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTablaPorFechaHoraAuditoria"));

		this.jButtonBusquedaPorObservacionesPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorObservacionesPorFechaHoraAuditoria"));

		this.jButtonBusquedaPorProcesoPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorProcesoPorFechaHoraAuditoria"));

		this.jButtonBusquedaPorUsuarioPCPorFechaHoraAuditoria.addActionListener(new ButtonActionListener(this,"BusquedaPorUsuarioPCPorFechaHoraAuditoria"));

		this.jButtonFK_IdAuditoriaAuditoria.addActionListener(new ButtonActionListener(this,"FK_IdAuditoriaAuditoria"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAuditoria.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAuditoriaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAuditoriaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAuditoria.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAuditoria(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
					auditoriaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Auditoria auditoriaAux:auditorias) {
					auditoriaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAuditoriaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAuditoria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
						auditoriaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Auditoria auditoriaAux:auditorias) {
						auditoriaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Auditoria auditoriaAux:auditorias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAuditoria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAuditoria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAuditoria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAuditoriaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAuditoria(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAuditoria.getSelectedRows();
			
			Auditoria auditoriaLocal=new Auditoria();
			
			//this.seleccionarTodosAuditoria(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					auditoriaLocal =(Auditoria) this.auditoriaLogic.getAuditorias().toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					auditoriaLocal =(Auditoria) this.auditorias.toArray()[this.jTableDatosAuditoria.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				auditoriaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
						auditoriaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Auditoria auditoriaAux:auditorias) {
						auditoriaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAuditoria(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAuditoria.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAuditoria.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAuditoria,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAuditoriaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAuditoriaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAuditoriaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAuditoria(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAuditoria.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Auditoria auditoriaAux:this.auditoriaLogic.getAuditorias()) {
				
						if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_NOMBRETABLA)) {
							existe=true;
							auditoriaAux.setnombre_tabla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_IDFILA)) {
							existe=true;
							auditoriaAux.setid_fila(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_ACCION)) {
							existe=true;
							auditoriaAux.setaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_PROCESO)) {
							existe=true;
							auditoriaAux.setproceso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_NOMBREPC)) {
							existe=true;
							auditoriaAux.setnombre_p_c(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_IPPC)) {
							existe=true;
							auditoriaAux.setip_pc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_USUARIOPC)) {
							existe=true;
							auditoriaAux.setusuario_p_c(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_FECHAHORA)) {
							existe=true;
							auditoriaAux.setfecha_hora(Timestamp.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							auditoriaAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Auditoria auditoriaAux:auditorias) {
					
						if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_NOMBRETABLA)) {
							existe=true;
							auditoriaAux.setnombre_tabla(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_IDFILA)) {
							existe=true;
							auditoriaAux.setid_fila(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_ACCION)) {
							existe=true;
							auditoriaAux.setaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_PROCESO)) {
							existe=true;
							auditoriaAux.setproceso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_NOMBREPC)) {
							existe=true;
							auditoriaAux.setnombre_p_c(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_IPPC)) {
							existe=true;
							auditoriaAux.setip_pc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_USUARIOPC)) {
							existe=true;
							auditoriaAux.setusuario_p_c(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_FECHAHORA)) {
							existe=true;
							auditoriaAux.setfecha_hora(Timestamp.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							auditoriaAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAuditoria(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAuditoriaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAuditoria(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAuditoria=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAuditoria.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAuditoria) {				
					conSplash=true;//false;										
					
					//this.startProcessAuditoria(conSplash);
				
					this.generarReporteAuditoriasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAuditoriasSeleccionados();
				//this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAuditoriasSeleccionados(false);
				//this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAuditoriasSeleccionados(true);
				//this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAuditoria();
				
				this.exportarAuditoriasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAuditorias();
				//this.importarAuditorias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAuditoria();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAuditoriasSeleccionados();
				//this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Auditoria", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAuditoria();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAuditoria)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAuditoria(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.setSelectedIndex(0);					
				}	
			} 			
			else if(AuditoriaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAuditoria) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAuditoria(conSplash);
					
						//this.actualizarParametrosGeneralAuditoria();
						
						this.generarReporteProcesoAccionAuditoriasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AuditoriaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO AuditoriaS SELECCIONADOS?", "MANTENIMIENTO DE Auditoria", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAuditoria();
				
						this.actualizarParametrosGeneralAuditoria();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.auditoriaReturnGeneral=auditoriaLogic.procesarAccionAuditoriasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.auditoriaLogic.getAuditorias(),this.auditoriaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAuditoriaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAuditoria();
					
					AuditoriaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAuditoriaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAuditoria.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAuditoria.jComboBoxTiposAccionesFormularioAuditoria.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAuditoria(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAuditoriaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAuditoria();
			
			if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
			Auditoria auditoria=new Auditoria();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAuditoria(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAuditoria.getSelectedItem();
			
			
			
			
			auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
			//this.sTipoAccion;
			
			if(auditoriasSeleccionados.size()==1) {
				for(Auditoria auditoriaAux:auditoriasSeleccionados) {
					auditoria=auditoriaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Auditoria Detalle")) {
					jButtonAuditoriaDetalleActionPerformed(null,rowIndex,true,false,auditoria);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAuditoria();
			
      		//this.finishProcessAuditoria(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAuditoriaReturnGeneral() throws Exception {
		if(this.auditoriaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.auditoriaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.auditoriaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.auditoriaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.auditoriaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.auditoriaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAuditoria(false);
		}
		
		if(this.auditoriaReturnGeneral.getConRetornoLista() || this.auditoriaReturnGeneral.getConRetornoObjeto()) {
			if(this.auditoriaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.auditoriaLogic.setAuditorias(this.auditoriaReturnGeneral.getAuditorias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.auditoriaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.auditoriaLogic.setAuditoria(this.auditoriaReturnGeneral.getAuditoria());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAuditoria(false);
		}
	}
	
	public void actualizarParametrosGeneralAuditoria() throws Exception {
		
		
	}
	
	public ArrayList<Auditoria> getAuditoriasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAuditoria) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Auditoria auditoriaAux:auditoriaLogic.getAuditorias()) {
					if(auditoriaAux.getIsSelected()) {
						auditoriasSeleccionados.add(auditoriaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Auditoria auditoriaAux:this.auditorias) {
					if(auditoriaAux.getIsSelected()) {
						auditoriasSeleccionados.add(auditoriaAux);				
					}
				}
			}
			
			if(auditoriasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						auditoriasSeleccionados.addAll(this.auditoriaLogic.getAuditorias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						auditoriasSeleccionados.addAll(this.auditorias);				
					}
				}
			}
		} else {
			auditoriasSeleccionados.add(this.auditoria);
		}
		
		return auditoriasSeleccionados;
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
	
	public void generarReporteAuditoriasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAuditoriasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAuditoriasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAuditoriasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAuditoriasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesAuditoriasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Auditoria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAuditoriasSeleccionados() throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAuditorias("Todos",auditoriasSeleccionados);
		
	}	
	
	public void generarReporteNormalAuditoriasSeleccionados() throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAuditorias("Todos",auditoriasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAuditoriasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAuditorias("Todos",auditoriasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAuditoriasSeleccionados() throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAuditoria();
		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAuditoria();
		
		
		//this.generarReporteAuditorias("Todos",auditoriasSeleccionados ,auditoriaImplementable,auditoriaImplementableHome);
	}
	
	public void mostrarImportacionAuditorias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAuditoria();
		
		this.abrirFrameImportacionAuditoria();		
		
			
		//this.generarReporteAuditorias("Todos",auditoriasSeleccionados ,auditoriaImplementable,auditoriaImplementableHome);
	}
	
	public void importarAuditorias() throws Exception {		
	
	}
	
	public void exportarAuditoriasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAuditoriasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAuditoriasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAuditoriasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Auditoria",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAuditoriasSeleccionados() throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAuditoria(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Auditoria auditoriaAux:auditoriasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAuditoria(auditoriaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//auditoriaAux.setsDetalleGeneralEntityReporte(auditoriaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAuditoria(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_NOMBRETABLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_IDFILA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_ACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_PROCESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_NOMBREPC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_IPPC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_USUARIOPC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_FECHAHORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AuditoriaConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAuditoria(Auditoria auditoria,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=auditoria.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getnombre_tabla();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getid_fila().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getproceso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getnombre_p_c();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getip_pc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getusuario_p_c();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getfecha_hora().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=auditoria.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAuditoriasSeleccionados() throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Auditorias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAuditoria(row);				
				iRow++;
			}				
			
			for(Auditoria auditoriaAux:auditoriasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAuditoria(auditoriaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAuditoriasSeleccionados() throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();		
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"auditoria.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("auditorias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("auditoria");
			//elementRoot.appendChild(element);
		
			for(Auditoria auditoriaAux:auditoriasSeleccionados) {
				element = document.createElement("auditoria");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAuditoria(auditoriaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Auditoria",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAuditoria(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_NOMBRETABLA);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IDFILA);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_ACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_PROCESO);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_NOMBREPC);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_IPPC);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_USUARIOPC);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_FECHAHORA);
		cell = row.createCell(iColumn++);cell.setCellValue(AuditoriaConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAuditoria(Auditoria auditoria,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getnombre_tabla());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getid_fila());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getproceso());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getnombre_p_c());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getip_pc());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getusuario_p_c());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getfecha_hora());
		cell = row.createCell(iColumn++);cell.setCellValue(auditoria.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlAuditoria(Auditoria auditoria,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AuditoriaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(auditoria.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AuditoriaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(auditoria.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementusuario_descripcion = document.createElement(AuditoriaConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(auditoria.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementnombre_tabla = document.createElement(AuditoriaConstantesFunciones.NOMBRETABLA);
		elementnombre_tabla.appendChild(document.createTextNode(auditoria.getnombre_tabla().trim()));
		element.appendChild(elementnombre_tabla);

		Element elementid_fila = document.createElement(AuditoriaConstantesFunciones.IDFILA);
		elementid_fila.appendChild(document.createTextNode(auditoria.getid_fila().toString().trim()));
		element.appendChild(elementid_fila);

		Element elementaccion = document.createElement(AuditoriaConstantesFunciones.ACCION);
		elementaccion.appendChild(document.createTextNode(auditoria.getaccion().trim()));
		element.appendChild(elementaccion);

		Element elementproceso = document.createElement(AuditoriaConstantesFunciones.PROCESO);
		elementproceso.appendChild(document.createTextNode(auditoria.getproceso().trim()));
		element.appendChild(elementproceso);

		Element elementnombre_p_c = document.createElement(AuditoriaConstantesFunciones.NOMBREPC);
		elementnombre_p_c.appendChild(document.createTextNode(auditoria.getnombre_p_c().trim()));
		element.appendChild(elementnombre_p_c);

		Element elementip_pc = document.createElement(AuditoriaConstantesFunciones.IPPC);
		elementip_pc.appendChild(document.createTextNode(auditoria.getip_pc().trim()));
		element.appendChild(elementip_pc);

		Element elementusuario_p_c = document.createElement(AuditoriaConstantesFunciones.USUARIOPC);
		elementusuario_p_c.appendChild(document.createTextNode(auditoria.getusuario_p_c().trim()));
		element.appendChild(elementusuario_p_c);

		Element elementfecha_hora = document.createElement(AuditoriaConstantesFunciones.FECHAHORA);
		elementfecha_hora.appendChild(document.createTextNode(auditoria.getfecha_hora().toString().trim()));
		element.appendChild(elementfecha_hora);

		Element elementobservacion = document.createElement(AuditoriaConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(auditoria.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoAuditoriasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Auditoria> auditoriasSeleccionados=new ArrayList<Auditoria>();
		
		auditoriasSeleccionados=this.getAuditoriasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAuditoria(auditoriasSeleccionados);
		
		this.generarReporteAuditorias("Todos",auditoriasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAuditoria(ArrayList<Auditoria> auditoriasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Auditoria auditoriaAux:auditoriasSeleccionados) {
				auditoriaAux.setsDetalleGeneralEntityReporte(auditoriaAux.toString());
			
				if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_NOMBRETABLA)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getnombre_tabla());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_IDFILA)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getid_fila().toString());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_ACCION)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getaccion());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_PROCESO)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getproceso());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_NOMBREPC)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getnombre_p_c());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_IPPC)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getip_pc());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_USUARIOPC)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getusuario_p_c());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_FECHAHORA)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getfecha_hora().toString());
				}
				 else if(sTipoSeleccionar.equals(AuditoriaConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					auditoriaAux.setsDescripcionGeneralEntityReporte1(auditoriaAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AuditoriaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAuditoria(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAuditoria=true;
				this.isVisibilidadCeldaNuevoRelacionesAuditoria=true;
				this.isVisibilidadCeldaGuardarCambiosAuditoria=true;
			}
			
			this.isVisibilidadCeldaModificarAuditoria=false;
			this.isVisibilidadCeldaActualizarAuditoria=false;
			this.isVisibilidadCeldaEliminarAuditoria=false;
			this.isVisibilidadCeldaCancelarAuditoria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoria=true;
				} else {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAuditoria=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=false;
			this.isVisibilidadCeldaModificarAuditoria=false;
			this.isVisibilidadCeldaActualizarAuditoria=true;
			this.isVisibilidadCeldaEliminarAuditoria=false;
			this.isVisibilidadCeldaCancelarAuditoria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoria=true;
				} else {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAuditoria=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=false;
			this.isVisibilidadCeldaModificarAuditoria=false;
			this.isVisibilidadCeldaActualizarAuditoria=true;
			this.isVisibilidadCeldaEliminarAuditoria=true;
			this.isVisibilidadCeldaCancelarAuditoria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoria=true;
				} else {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAuditoria=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=false;
			this.isVisibilidadCeldaModificarAuditoria=false;
			this.isVisibilidadCeldaActualizarAuditoria=true;
			this.isVisibilidadCeldaEliminarAuditoria=false;
			this.isVisibilidadCeldaCancelarAuditoria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				} else {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAuditoria=true;
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=true;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=true;
			this.isVisibilidadCeldaModificarAuditoria=false;
			this.isVisibilidadCeldaActualizarAuditoria=false;
			this.isVisibilidadCeldaEliminarAuditoria=false;
			this.isVisibilidadCeldaCancelarAuditoria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoria=true;
				} else {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAuditoria=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=false;
			this.isVisibilidadCeldaActualizarAuditoria=false;
			this.isVisibilidadCeldaEliminarAuditoria=false;
			this.isVisibilidadCeldaCancelarAuditoria=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				} else {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAuditoria=false;
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=false;
			this.isVisibilidadCeldaModificarAuditoria=true;
			this.isVisibilidadCeldaActualizarAuditoria=false;
			this.isVisibilidadCeldaEliminarAuditoria=false;
			this.isVisibilidadCeldaCancelarAuditoria=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				} else {
					this.isVisibilidadCeldaGuardarAuditoria=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AuditoriaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAuditoria=true;
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=true;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=true;
		} else {
			this.actualizarEstadoPanelsAuditoria(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAuditoria=false;
			//this.isVisibilidadCeldaVerFormAuditoria=false;
			this.isVisibilidadCeldaDuplicarAuditoria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!auditoriaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;
		} else {
			this.isVisibilidadCeldaNuevoAuditoria=false;
			this.isVisibilidadCeldaGuardarCambiosAuditoria=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(auditoriaSessionBean.getEsGuardarRelacionado()) {
			if(!auditoriaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;												
			}
			
			this.jButtonCerrarAuditoria.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAuditoria=false;
		}
		
		if(!this.permiteMantenimiento(this.auditoria)) {
			this.isVisibilidadCeldaActualizarAuditoria=false;
			this.isVisibilidadCeldaEliminarAuditoria=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAuditoria() {
		this.isVisibilidadCeldaNuevoAuditoria=false;
		this.isVisibilidadCeldaGuardarCambiosAuditoria=false;
	}
	
	public void actualizarEstadoPanelsAuditoria(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAuditoria!=null) {
				this.jScrollPanelDatosEdicionAuditoria.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoria!=null) {
				this.jTabbedPaneBusquedasAuditoria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAuditoria!=null) {
				this.jScrollPanelDatosAuditoria.setVisible(true);
			}
			
			if(this.jPanelPaginacionAuditoria!=null) {
				this.jPanelPaginacionAuditoria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAuditoria!=null) {
				this.jScrollPanelDatosEdicionAuditoria.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoria!=null) {
				this.jTabbedPaneBusquedasAuditoria.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAuditoria!=null) {
				this.jScrollPanelDatosAuditoria.setVisible(false);
			}
			
			if(this.jPanelPaginacionAuditoria!=null) {
				this.jPanelPaginacionAuditoria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAuditoria!=null) {
				this.jScrollPanelDatosEdicionAuditoria.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoria!=null) {
				this.jTabbedPaneBusquedasAuditoria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAuditoria!=null) {
				this.jScrollPanelDatosAuditoria.setVisible(false);
			}
			
			if(this.jPanelPaginacionAuditoria!=null) {
				this.jPanelPaginacionAuditoria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAuditoria!=null) {
				this.jScrollPanelDatosEdicionAuditoria.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoria!=null) {
				this.jTabbedPaneBusquedasAuditoria.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAuditoria!=null) {
				this.jScrollPanelDatosAuditoria.setVisible(false);
			}
			
			if(this.jPanelPaginacionAuditoria!=null) {
				this.jPanelPaginacionAuditoria.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAuditoria!=null) {
				this.jScrollPanelDatosEdicionAuditoria.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoria!=null) {
				this.jTabbedPaneBusquedasAuditoria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAuditoria!=null) {
				this.jScrollPanelDatosAuditoria.setVisible(true);
			}
			
			if(this.jPanelPaginacionAuditoria!=null) {
				this.jPanelPaginacionAuditoria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAuditoria!=null) {
				this.jScrollPanelDatosEdicionAuditoria.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoria!=null) {
				this.jTabbedPaneBusquedasAuditoria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAuditoria!=null) {
				this.jScrollPanelDatosAuditoria.setVisible(true);
			}
			
			if(this.jPanelPaginacionAuditoria!=null) {
				this.jPanelPaginacionAuditoria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAuditoria!=null) {
				this.jScrollPanelDatosEdicionAuditoria.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoria!=null) {
				this.jTabbedPaneBusquedasAuditoria.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAuditoria!=null) {
				this.jScrollPanelDatosAuditoria.setVisible(true);
			}
			
			if(this.jPanelPaginacionAuditoria!=null) {
				this.jPanelPaginacionAuditoria.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAuditoria!=null) {
					this.jTabbedPaneBusquedasAuditoria.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAuditoria!=null) {
				this.jTabbedPaneBusquedasAuditoria.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAuditoria!=null) {
				this.jPanelParametrosReportesAuditoria.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora=isParaUsuario;
			if(!this.isVisibilidadBusquedaPorIdUsuarioPorFechaHora) {this.jTabbedPaneBusquedasAuditoria.remove(jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria);}

			this.isVisibilidadBusquedaPorIPPCPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorIPPCPorFechaHora) {this.jTabbedPaneBusquedasAuditoria.remove(jPanelBusquedaPorIPPCPorFechaHoraAuditoria);}

			this.isVisibilidadBusquedaPorNombrePCPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorNombrePCPorFechaHora) {this.jTabbedPaneBusquedasAuditoria.remove(jPanelBusquedaPorNombrePCPorFechaHoraAuditoria);}

			this.isVisibilidadBusquedaPorNombreTablaPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorNombreTablaPorFechaHora) {this.jTabbedPaneBusquedasAuditoria.remove(jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria);}

			this.isVisibilidadBusquedaPorObservacionesPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorObservacionesPorFechaHora) {this.jTabbedPaneBusquedasAuditoria.remove(jPanelBusquedaPorObservacionesPorFechaHoraAuditoria);}

			this.isVisibilidadBusquedaPorProcesoPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorProcesoPorFechaHora) {this.jTabbedPaneBusquedasAuditoria.remove(jPanelBusquedaPorProcesoPorFechaHoraAuditoria);}

			this.isVisibilidadBusquedaPorUsuarioPCPorFechaHora=isParaUsuarioNegation;
			if(!this.isVisibilidadBusquedaPorUsuarioPCPorFechaHora) {this.jTabbedPaneBusquedasAuditoria.remove(jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria);}

			this.isVisibilidadFK_IdAuditoria=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdAuditoria) {this.jTabbedPaneBusquedasAuditoria.remove(jPanelFK_IdAuditoriaAuditoria);}
		}
		
	}
	
	

	public String registrarSesionAuditoriaParaAuditoriaDetalles() throws Exception {
		Boolean isPaginaPopupAuditoriaDetalle=false;

		try {

			if(this.auditoriaSessionBean==null) {
				this.auditoriaSessionBean=new AuditoriaSessionBean();
			}

			if(this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean==null) {
				this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
			}

			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean.setsPathNavegacionActual(auditoriaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAuditoriaDetalle=this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAuditoriaDetalle(false);
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoriaDetalle(AuditoriaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean.setisBusquedaDesdeForeignKeySesionAuditoria(true);
			this.jInternalFrameDetalleFormAuditoria.auditoriadetalleSessionBean.setlidAuditoriaActual(this.idAuditoriaActual);

			auditoriaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAuditoria(true);
			auditoriaSessionBean.setlIdAuditoriaActualForeignKey(this.idAuditoriaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AuditoriaSessionBean auditoriaSessionBean=new AuditoriaSessionBean();
		
		if(this.auditoriaSessionBean==null) {
			this.auditoriaSessionBean=new AuditoriaSessionBean();
		}
		
		this.auditoriaSessionBean.setsUltimaBusquedaAuditoria(this.getsAccionBusqueda());
		this.auditoriaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.auditoriaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdUsuarioPorFechaHora")) {
			auditoriaSessionBean.setid_usuario(this.getid_usuarioBusquedaPorIdUsuarioPorFechaHora());	
			auditoriaSessionBean.setfecha_hora(this.getfecha_horaBusquedaPorIdUsuarioPorFechaHora());	
			auditoriaSessionBean.setfecha_horaFinal(this.getfecha_horaFinalBusquedaPorIdUsuarioPorFechaHora());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorIPPCPorFechaHora")) {
			auditoriaSessionBean.setip_pc(this.getip_pcBusquedaPorIPPCPorFechaHora());	
			auditoriaSessionBean.setfecha_hora(this.getfecha_horaBusquedaPorIPPCPorFechaHora());	
			auditoriaSessionBean.setfecha_horaFinal(this.getfecha_horaFinalBusquedaPorIPPCPorFechaHora());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombrePCPorFechaHora")) {
			auditoriaSessionBean.setnombre_p_c(this.getnombre_p_cBusquedaPorNombrePCPorFechaHora());	
			auditoriaSessionBean.setfecha_hora(this.getfecha_horaBusquedaPorNombrePCPorFechaHora());	
			auditoriaSessionBean.setfecha_horaFinal(this.getfecha_horaFinalBusquedaPorNombrePCPorFechaHora());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombreTablaPorFechaHora")) {
			auditoriaSessionBean.setnombre_tabla(this.getnombre_tablaBusquedaPorNombreTablaPorFechaHora());	
			auditoriaSessionBean.setfecha_hora(this.getfecha_horaBusquedaPorNombreTablaPorFechaHora());	
			auditoriaSessionBean.setfecha_horaFinal(this.getfecha_horaFinalBusquedaPorNombreTablaPorFechaHora());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorObservacionesPorFechaHora")) {
			auditoriaSessionBean.setfecha_hora(this.getfecha_horaBusquedaPorObservacionesPorFechaHora());	
			auditoriaSessionBean.setfecha_horaFinal(this.getfecha_horaFinalBusquedaPorObservacionesPorFechaHora());	
			auditoriaSessionBean.setobservacion(this.getobservacionBusquedaPorObservacionesPorFechaHora());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorProcesoPorFechaHora")) {
			auditoriaSessionBean.setproceso(this.getprocesoBusquedaPorProcesoPorFechaHora());	
			auditoriaSessionBean.setfecha_hora(this.getfecha_horaBusquedaPorProcesoPorFechaHora());	
			auditoriaSessionBean.setfecha_horaFinal(this.getfecha_horaFinalBusquedaPorProcesoPorFechaHora());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorUsuarioPCPorFechaHora")) {
			auditoriaSessionBean.setusuario_p_c(this.getusuario_p_cBusquedaPorUsuarioPCPorFechaHora());	
			auditoriaSessionBean.setfecha_hora(this.getfecha_horaBusquedaPorUsuarioPCPorFechaHora());	
			auditoriaSessionBean.setfecha_horaFinal(this.getfecha_horaFinalBusquedaPorUsuarioPCPorFechaHora());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdAuditoria")) {
			auditoriaSessionBean.setid_fila(this.getid_filaFK_IdAuditoria());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			auditoriaSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AuditoriaSessionBean auditoriaSessionBean=new AuditoriaSessionBean();
		
		if(this.auditoriaSessionBean==null) {
			this.auditoriaSessionBean=new AuditoriaSessionBean();
		}
		
		if(this.auditoriaSessionBean.getsUltimaBusquedaAuditoria()!=null&&!this.auditoriaSessionBean.getsUltimaBusquedaAuditoria().equals("")) {
			this.setsAccionBusqueda(auditoriaSessionBean.getsUltimaBusquedaAuditoria());
			this.setiNumeroPaginacion(auditoriaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(auditoriaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdUsuarioPorFechaHora")) {
				this.setid_usuarioBusquedaPorIdUsuarioPorFechaHora(auditoriaSessionBean.getid_usuario());
				auditoriaSessionBean.setid_usuario(-1L);
				this.setfecha_horaBusquedaPorIdUsuarioPorFechaHora(auditoriaSessionBean.getfecha_hora());
				auditoriaSessionBean.setfecha_hora(new Timestamp((new Date()).getTime()));
				this.setfecha_horaFinalBusquedaPorIdUsuarioPorFechaHora(auditoriaSessionBean.getfecha_horaFinal());
				auditoriaSessionBean.setfecha_horaFinal(new Timestamp((new Date()).getTime()));
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorIPPCPorFechaHora")) {
				this.setip_pcBusquedaPorIPPCPorFechaHora(auditoriaSessionBean.getip_pc());
				auditoriaSessionBean.setip_pc("");
				this.setfecha_horaBusquedaPorIPPCPorFechaHora(auditoriaSessionBean.getfecha_hora());
				auditoriaSessionBean.setfecha_hora(new Timestamp((new Date()).getTime()));
				this.setfecha_horaFinalBusquedaPorIPPCPorFechaHora(auditoriaSessionBean.getfecha_horaFinal());
				auditoriaSessionBean.setfecha_horaFinal(new Timestamp((new Date()).getTime()));
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombrePCPorFechaHora")) {
				this.setnombre_p_cBusquedaPorNombrePCPorFechaHora(auditoriaSessionBean.getnombre_p_c());
				auditoriaSessionBean.setnombre_p_c("");
				this.setfecha_horaBusquedaPorNombrePCPorFechaHora(auditoriaSessionBean.getfecha_hora());
				auditoriaSessionBean.setfecha_hora(new Timestamp((new Date()).getTime()));
				this.setfecha_horaFinalBusquedaPorNombrePCPorFechaHora(auditoriaSessionBean.getfecha_horaFinal());
				auditoriaSessionBean.setfecha_horaFinal(new Timestamp((new Date()).getTime()));
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombreTablaPorFechaHora")) {
				this.setnombre_tablaBusquedaPorNombreTablaPorFechaHora(auditoriaSessionBean.getnombre_tabla());
				auditoriaSessionBean.setnombre_tabla("");
				this.setfecha_horaBusquedaPorNombreTablaPorFechaHora(auditoriaSessionBean.getfecha_hora());
				auditoriaSessionBean.setfecha_hora(new Timestamp((new Date()).getTime()));
				this.setfecha_horaFinalBusquedaPorNombreTablaPorFechaHora(auditoriaSessionBean.getfecha_horaFinal());
				auditoriaSessionBean.setfecha_horaFinal(new Timestamp((new Date()).getTime()));
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorObservacionesPorFechaHora")) {
				this.setfecha_horaBusquedaPorObservacionesPorFechaHora(auditoriaSessionBean.getfecha_hora());
				auditoriaSessionBean.setfecha_hora(new Timestamp((new Date()).getTime()));
				this.setfecha_horaFinalBusquedaPorObservacionesPorFechaHora(auditoriaSessionBean.getfecha_horaFinal());
				auditoriaSessionBean.setfecha_horaFinal(new Timestamp((new Date()).getTime()));
				this.setobservacionBusquedaPorObservacionesPorFechaHora(auditoriaSessionBean.getobservacion());
				auditoriaSessionBean.setobservacion("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorProcesoPorFechaHora")) {
				this.setprocesoBusquedaPorProcesoPorFechaHora(auditoriaSessionBean.getproceso());
				auditoriaSessionBean.setproceso("");
				this.setfecha_horaBusquedaPorProcesoPorFechaHora(auditoriaSessionBean.getfecha_hora());
				auditoriaSessionBean.setfecha_hora(new Timestamp((new Date()).getTime()));
				this.setfecha_horaFinalBusquedaPorProcesoPorFechaHora(auditoriaSessionBean.getfecha_horaFinal());
				auditoriaSessionBean.setfecha_horaFinal(new Timestamp((new Date()).getTime()));
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorUsuarioPCPorFechaHora")) {
				this.setusuario_p_cBusquedaPorUsuarioPCPorFechaHora(auditoriaSessionBean.getusuario_p_c());
				auditoriaSessionBean.setusuario_p_c("");
				this.setfecha_horaBusquedaPorUsuarioPCPorFechaHora(auditoriaSessionBean.getfecha_hora());
				auditoriaSessionBean.setfecha_hora(new Timestamp((new Date()).getTime()));
				this.setfecha_horaFinalBusquedaPorUsuarioPCPorFechaHora(auditoriaSessionBean.getfecha_horaFinal());
				auditoriaSessionBean.setfecha_horaFinal(new Timestamp((new Date()).getTime()));
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdAuditoria")) {
				this.setid_filaFK_IdAuditoria(auditoriaSessionBean.getid_fila());
				auditoriaSessionBean.setid_fila(0L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(auditoriaSessionBean.getid_usuario());
				auditoriaSessionBean.setid_usuario(-1L);
			}
		}
		
		this.auditoriaSessionBean.setsUltimaBusquedaAuditoria("");
		this.auditoriaSessionBean.setiNumeroPaginacion(AuditoriaConstantesFunciones.INUMEROPAGINACION);
		this.auditoriaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAuditoria(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAuditoria() {
		this.updateBorderResaltarBusquedasFormularioAuditoria();
		this.updateVisibilidadBusquedasFormularioAuditoria();
		this.updateHabilitarBusquedasFormularioAuditoria();
	}
	
	public void updateBorderResaltarBusquedasFormularioAuditoria() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAuditoria.getComponents().length>0) {
	

		if(this.auditoriaConstantesFunciones.resaltarBusquedaPorIdUsuarioPorFechaHoraAuditoria!=null) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorIdUsuarioPorFechaHoraAuditoria);
			}
		}

		if(this.auditoriaConstantesFunciones.resaltarBusquedaPorIPPCPorFechaHoraAuditoria!=null) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorIPPCPorFechaHoraAuditoria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorIPPCPorFechaHoraAuditoria);
			}
		}

		if(this.auditoriaConstantesFunciones.resaltarBusquedaPorNombrePCPorFechaHoraAuditoria!=null) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorNombrePCPorFechaHoraAuditoria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorNombrePCPorFechaHoraAuditoria);
			}
		}

		if(this.auditoriaConstantesFunciones.resaltarBusquedaPorNombreTablaPorFechaHoraAuditoria!=null) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorNombreTablaPorFechaHoraAuditoria);
			}
		}

		if(this.auditoriaConstantesFunciones.resaltarBusquedaPorObservacionesPorFechaHoraAuditoria!=null) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorObservacionesPorFechaHoraAuditoria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorObservacionesPorFechaHoraAuditoria);
			}
		}

		if(this.auditoriaConstantesFunciones.resaltarBusquedaPorProcesoPorFechaHoraAuditoria!=null) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorProcesoPorFechaHoraAuditoria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorProcesoPorFechaHoraAuditoria);
			}
		}

		if(this.auditoriaConstantesFunciones.resaltarBusquedaPorUsuarioPCPorFechaHoraAuditoria!=null) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorUsuarioPCPorFechaHoraAuditoria);
			}
		}

		if(this.auditoriaConstantesFunciones.resaltarFK_IdAuditoriaAuditoria!=null) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelFK_IdAuditoriaAuditoria);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarFK_IdAuditoriaAuditoria);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAuditoria() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAuditoria.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFunciones.mostrarBusquedaPorIdUsuarioPorFechaHoraAuditoria);
			if(!this.auditoriaConstantesFunciones.mostrarBusquedaPorIdUsuarioPorFechaHoraAuditoria && index>-1) {
				this.jTabbedPaneBusquedasAuditoria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorIPPCPorFechaHoraAuditoria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFunciones.mostrarBusquedaPorIPPCPorFechaHoraAuditoria);
			if(!this.auditoriaConstantesFunciones.mostrarBusquedaPorIPPCPorFechaHoraAuditoria && index>-1) {
				this.jTabbedPaneBusquedasAuditoria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorNombrePCPorFechaHoraAuditoria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFunciones.mostrarBusquedaPorNombrePCPorFechaHoraAuditoria);
			if(!this.auditoriaConstantesFunciones.mostrarBusquedaPorNombrePCPorFechaHoraAuditoria && index>-1) {
				this.jTabbedPaneBusquedasAuditoria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFunciones.mostrarBusquedaPorNombreTablaPorFechaHoraAuditoria);
			if(!this.auditoriaConstantesFunciones.mostrarBusquedaPorNombreTablaPorFechaHoraAuditoria && index>-1) {
				this.jTabbedPaneBusquedasAuditoria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorObservacionesPorFechaHoraAuditoria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFunciones.mostrarBusquedaPorObservacionesPorFechaHoraAuditoria);
			if(!this.auditoriaConstantesFunciones.mostrarBusquedaPorObservacionesPorFechaHoraAuditoria && index>-1) {
				this.jTabbedPaneBusquedasAuditoria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorProcesoPorFechaHoraAuditoria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFunciones.mostrarBusquedaPorProcesoPorFechaHoraAuditoria);
			if(!this.auditoriaConstantesFunciones.mostrarBusquedaPorProcesoPorFechaHoraAuditoria && index>-1) {
				this.jTabbedPaneBusquedasAuditoria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFunciones.mostrarBusquedaPorUsuarioPCPorFechaHoraAuditoria);
			if(!this.auditoriaConstantesFunciones.mostrarBusquedaPorUsuarioPCPorFechaHoraAuditoria && index>-1) {
				this.jTabbedPaneBusquedasAuditoria.remove(index);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelFK_IdAuditoriaAuditoria);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.auditoriaConstantesFunciones.mostrarFK_IdAuditoriaAuditoria);
			if(!this.auditoriaConstantesFunciones.mostrarFK_IdAuditoriaAuditoria && index>-1) {
				this.jTabbedPaneBusquedasAuditoria.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAuditoria() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAuditoria.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFunciones.activarBusquedaPorIdUsuarioPorFechaHoraAuditoria);
				this.jTabbedPaneBusquedasAuditoria.setEnabledAt(index,this.auditoriaConstantesFunciones.activarBusquedaPorIdUsuarioPorFechaHoraAuditoria);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorIPPCPorFechaHoraAuditoria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFunciones.activarBusquedaPorIPPCPorFechaHoraAuditoria);
				this.jTabbedPaneBusquedasAuditoria.setEnabledAt(index,this.auditoriaConstantesFunciones.activarBusquedaPorIPPCPorFechaHoraAuditoria);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorNombrePCPorFechaHoraAuditoria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFunciones.activarBusquedaPorNombrePCPorFechaHoraAuditoria);
				this.jTabbedPaneBusquedasAuditoria.setEnabledAt(index,this.auditoriaConstantesFunciones.activarBusquedaPorNombrePCPorFechaHoraAuditoria);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFunciones.activarBusquedaPorNombreTablaPorFechaHoraAuditoria);
				this.jTabbedPaneBusquedasAuditoria.setEnabledAt(index,this.auditoriaConstantesFunciones.activarBusquedaPorNombreTablaPorFechaHoraAuditoria);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorObservacionesPorFechaHoraAuditoria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFunciones.activarBusquedaPorObservacionesPorFechaHoraAuditoria);
				this.jTabbedPaneBusquedasAuditoria.setEnabledAt(index,this.auditoriaConstantesFunciones.activarBusquedaPorObservacionesPorFechaHoraAuditoria);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorProcesoPorFechaHoraAuditoria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFunciones.activarBusquedaPorProcesoPorFechaHoraAuditoria);
				this.jTabbedPaneBusquedasAuditoria.setEnabledAt(index,this.auditoriaConstantesFunciones.activarBusquedaPorProcesoPorFechaHoraAuditoria);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFunciones.activarBusquedaPorUsuarioPCPorFechaHoraAuditoria);
				this.jTabbedPaneBusquedasAuditoria.setEnabledAt(index,this.auditoriaConstantesFunciones.activarBusquedaPorUsuarioPCPorFechaHoraAuditoria);
			}

			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelFK_IdAuditoriaAuditoria);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.auditoriaConstantesFunciones.activarFK_IdAuditoriaAuditoria);
				this.jTabbedPaneBusquedasAuditoria.setEnabledAt(index,this.auditoriaConstantesFunciones.activarFK_IdAuditoriaAuditoria);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAuditoria(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdUsuarioPorFechaHora")) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorIdUsuarioPorFechaHoraAuditoria);

			this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);

			this.auditoriaConstantesFunciones.setResaltarBusquedaPorIdUsuarioPorFechaHoraAuditoria(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorIdUsuarioPorFechaHoraAuditoria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorIPPCPorFechaHora")) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorIPPCPorFechaHoraAuditoria);

			this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);

			this.auditoriaConstantesFunciones.setResaltarBusquedaPorIPPCPorFechaHoraAuditoria(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorIPPCPorFechaHoraAuditoria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombrePCPorFechaHora")) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorNombrePCPorFechaHoraAuditoria);

			this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);

			this.auditoriaConstantesFunciones.setResaltarBusquedaPorNombrePCPorFechaHoraAuditoria(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorNombrePCPorFechaHoraAuditoria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombreTablaPorFechaHora")) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorNombreTablaPorFechaHoraAuditoria);

			this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);

			this.auditoriaConstantesFunciones.setResaltarBusquedaPorNombreTablaPorFechaHoraAuditoria(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorNombreTablaPorFechaHoraAuditoria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorObservacionesPorFechaHora")) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorObservacionesPorFechaHoraAuditoria);

			this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);

			this.auditoriaConstantesFunciones.setResaltarBusquedaPorObservacionesPorFechaHoraAuditoria(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorObservacionesPorFechaHoraAuditoria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorProcesoPorFechaHora")) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorProcesoPorFechaHoraAuditoria);

			this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);

			this.auditoriaConstantesFunciones.setResaltarBusquedaPorProcesoPorFechaHoraAuditoria(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorProcesoPorFechaHoraAuditoria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorUsuarioPCPorFechaHora")) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelBusquedaPorUsuarioPCPorFechaHoraAuditoria);

			this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);

			this.auditoriaConstantesFunciones.setResaltarBusquedaPorUsuarioPCPorFechaHoraAuditoria(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarBusquedaPorUsuarioPCPorFechaHoraAuditoria);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdAuditoria")) {
			index= this.jTabbedPaneBusquedasAuditoria.indexOfComponent(this.jPanelFK_IdAuditoriaAuditoria);

			this.jTabbedPaneBusquedasAuditoria.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAuditoria.getComponent(index);

			this.auditoriaConstantesFunciones.setResaltarFK_IdAuditoriaAuditoria(resaltar);

			jPanel.setBorder(this.auditoriaConstantesFunciones.resaltarFK_IdAuditoriaAuditoria);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAuditoria.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAuditoria() throws Exception {

		if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAuditoria();
		this.updateVisibilidadResaltarControlesFormularioAuditoria();
		this.updateHabilitarResaltarControlesFormularioAuditoria();
		
	}
	
	public void updateBorderResaltarControlesFormularioAuditoria() throws Exception {
		if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.auditoriaConstantesFunciones.resaltaridAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltaridAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarid_usuarioAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarid_usuarioAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarnombre_tablaAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jTextAreanombre_tablaAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarnombre_tablaAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarid_filaAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jTextFieldid_filaAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarid_filaAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltaraccionAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jTextFieldaccionAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltaraccionAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarprocesoAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jTextAreaprocesoAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarprocesoAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarnombre_p_cAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jTextFieldnombre_p_cAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarnombre_p_cAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarip_pcAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jTextFieldip_pcAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarip_pcAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarusuario_p_cAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jTextFieldusuario_p_cAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarusuario_p_cAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarfecha_horaAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jDateChooserfecha_horaAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarfecha_horaAuditoria);}
		if(this.auditoriaConstantesFunciones.resaltarobservacionAuditoria!=null && this.jInternalFrameDetalleFormAuditoria!=null) {this.jInternalFrameDetalleFormAuditoria.jTextAreaobservacionAuditoria.setBorder(this.auditoriaConstantesFunciones.resaltarobservacionAuditoria);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAuditoria() throws Exception {		
		if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
	
		//this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.setVisible(this.auditoriaConstantesFunciones.mostraridAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelidAuditoria.setVisible(this.auditoriaConstantesFunciones.mostraridAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarid_usuarioAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelid_usuarioAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarid_usuarioAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jTextAreanombre_tablaAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarnombre_tablaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelnombre_tablaAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarnombre_tablaAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jTextFieldid_filaAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarid_filaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelid_filaAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarid_filaAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jTextFieldaccionAuditoria.setVisible(this.auditoriaConstantesFunciones.mostraraccionAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelaccionAuditoria.setVisible(this.auditoriaConstantesFunciones.mostraraccionAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jTextAreaprocesoAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarprocesoAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelprocesoAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarprocesoAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jTextFieldnombre_p_cAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarnombre_p_cAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelnombre_p_cAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarnombre_p_cAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jTextFieldip_pcAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarip_pcAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelip_pcAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarip_pcAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jTextFieldusuario_p_cAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarusuario_p_cAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelusuario_p_cAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarusuario_p_cAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jDateChooserfecha_horaAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarfecha_horaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelfecha_horaAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarfecha_horaAuditoria);
		//this.jInternalFrameDetalleFormAuditoria.jTextAreaobservacionAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarobservacionAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jPanelobservacionAuditoria.setVisible(this.auditoriaConstantesFunciones.mostrarobservacionAuditoria);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAuditoria() throws Exception {
		if(this.jInternalFrameDetalleFormAuditoria==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAuditoria!=null) {
	
		this.jInternalFrameDetalleFormAuditoria.jLabelidAuditoria.setEnabled(this.auditoriaConstantesFunciones.activaridAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jComboBoxid_usuarioAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarid_usuarioAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextAreanombre_tablaAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarnombre_tablaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldid_filaAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarid_filaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldaccionAuditoria.setEnabled(this.auditoriaConstantesFunciones.activaraccionAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextAreaprocesoAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarprocesoAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldnombre_p_cAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarnombre_p_cAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldip_pcAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarip_pcAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextFieldusuario_p_cAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarusuario_p_cAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jDateChooserfecha_horaAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarfecha_horaAuditoria);
		this.jInternalFrameDetalleFormAuditoria.jTextAreaobservacionAuditoria.setEnabled(this.auditoriaConstantesFunciones.activarobservacionAuditoria);
		}
	}
	
		
}