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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.NotasCreditosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.NotasCreditosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.NotasCreditosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.NotasCreditosBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class NotasCreditosBeanSwingJInternalFrame extends NotasCreditosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NotasCreditosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NotasCreditos> notascreditosValidator = new ClassValidator<NotasCreditos>(NotasCreditos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NotasCreditos notascreditos;	
	public NotasCreditos notascreditosAux;
	public NotasCreditos notascreditosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NotasCreditos notascreditosTotales;
	public Long idNotasCreditosActual;
	public Long iIdNuevoNotasCreditos=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
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
	
	public Boolean isPermisoTodoNotasCreditos;
	public Boolean isPermisoNuevoNotasCreditos;
	public Boolean isPermisoActualizarNotasCreditos;
	public Boolean isPermisoActualizarOriginalNotasCreditos;
	public Boolean isPermisoEliminarNotasCreditos;
	public Boolean isPermisoGuardarCambiosNotasCreditos;
	public Boolean isPermisoConsultaNotasCreditos;
	public Boolean isPermisoBusquedaNotasCreditos;
	public Boolean isPermisoReporteNotasCreditos;
	public Boolean isPermisoPaginacionMedioNotasCreditos;
	public Boolean isPermisoPaginacionAltoNotasCreditos;
	public Boolean isPermisoPaginacionTodoNotasCreditos;
	public Boolean isPermisoCopiarNotasCreditos;
	public Boolean isPermisoVerFormNotasCreditos;
	public Boolean isPermisoDuplicarNotasCreditos;
	public Boolean isPermisoOrdenNotasCreditos;
	
	
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
	
	public NotasCreditosParameterReturnGeneral notascreditosReturnGeneral;
	public NotasCreditosParameterReturnGeneral notascreditosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNotasCreditos=false;
	public Boolean esParaAccionDesdeFormularioNotasCreditos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NotasCreditosSessionBeanAdditional notascreditosSessionBeanAdditional=null;
	
	public NotasCreditosSessionBeanAdditional getNotasCreditosSessionBeanAdditional() {
		return this.notascreditosSessionBeanAdditional;
	}
	
	public void setNotasCreditosSessionBeanAdditional(NotasCreditosSessionBeanAdditional notascreditosSessionBeanAdditional) {
		try {
			this.notascreditosSessionBeanAdditional=notascreditosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NotasCreditosBeanSwingJInternalFrameAdditional notascreditosBeanSwingJInternalFrameAdditional=null;
	//public class NotasCreditosBeanSwingJInternalFrame
	
	public NotasCreditosBeanSwingJInternalFrameAdditional getNotasCreditosBeanSwingJInternalFrameAdditional() {
		return this.notascreditosBeanSwingJInternalFrameAdditional;
	}
	
	public void setNotasCreditosBeanSwingJInternalFrameAdditional(NotasCreditosBeanSwingJInternalFrameAdditional notascreditosBeanSwingJInternalFrameAdditional) {
		try {
			this.notascreditosBeanSwingJInternalFrameAdditional=notascreditosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NotasCreditosLogic notascreditosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NotasCreditos notascreditosBean;
	public NotasCreditosConstantesFunciones notascreditosConstantesFunciones;
	//public NotasCreditosParameterReturnGeneral notascreditosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<NotasCreditos> notascreditoss;	
	//public List<NotasCreditos> notascreditossEliminados;
	//public List<NotasCreditos> notascreditossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNotasCreditos=false;
	public Boolean isVisibilidadCeldaDuplicarNotasCreditos=true;
	public Boolean isVisibilidadCeldaCopiarNotasCreditos=true;
	public Boolean isVisibilidadCeldaVerFormNotasCreditos=true;
	public Boolean isVisibilidadCeldaOrdenNotasCreditos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
	public Boolean isVisibilidadCeldaModificarNotasCreditos=false;
	public Boolean isVisibilidadCeldaActualizarNotasCreditos=false;
	public Boolean isVisibilidadCeldaEliminarNotasCreditos=false;
	public Boolean isVisibilidadCeldaCancelarNotasCreditos=false;
	public Boolean isVisibilidadCeldaGuardarNotasCreditos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNotasCreditos=false;	
	
	
	public Boolean isVisibilidadBusquedaNotasCreditos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoNotasCreditos() {
		return this.iIdNuevoNotasCreditos;
	}

	public void setiIdNuevoNotasCreditos(Long iIdNuevoNotasCreditos) {
		this.iIdNuevoNotasCreditos = iIdNuevoNotasCreditos;
	}
	
	public Long getidNotasCreditosActual() {
		return this.idNotasCreditosActual;
	}

	public void setidNotasCreditosActual(Long idNotasCreditosActual) {
		this.idNotasCreditosActual = idNotasCreditosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NotasCreditos getnotascreditos() {
		return this.notascreditos;
	}

	public void setnotascreditos(NotasCreditos notascreditos) {
		this.notascreditos = notascreditos;
	}
	
	public NotasCreditos getnotascreditosAux() {
		return this.notascreditosAux;
	}

	public void setnotascreditosAux(NotasCreditos notascreditosAux) {
		this.notascreditosAux = notascreditosAux;
	}				
	
	public NotasCreditos getnotascreditosAnterior() {
		return this.notascreditosAnterior;
	}

	public void setnotascreditosAnterior(NotasCreditos notascreditosAnterior) {
		this.notascreditosAnterior = notascreditosAnterior;
	}	
	
	public NotasCreditos getnotascreditosTotales() {
		return this.notascreditosTotales;
	}

	public void setnotascreditosTotales(NotasCreditos notascreditosTotales) {
		this.notascreditosTotales = notascreditosTotales;
	}	
	
	public NotasCreditos getnotascreditosBean() {
		return this.notascreditosBean;
	}

	public void setnotascreditosBean(NotasCreditos notascreditosBean) {
		this.notascreditosBean = notascreditosBean;
	}	
	
	public NotasCreditosParameterReturnGeneral getnotascreditosReturnGeneral() {
		return this.notascreditosReturnGeneral;
	}

	public void setnotascreditosReturnGeneral(NotasCreditosParameterReturnGeneral notascreditosReturnGeneral) {
		this.notascreditosReturnGeneral = notascreditosReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaNotasCreditos=new Date();

	public Date getfecha_emision_desdeBusquedaNotasCreditos() {
		return this.fecha_emision_desdeBusquedaNotasCreditos;
	}

	public void setfecha_emision_desdeBusquedaNotasCreditos(Date fecha_emision_desdeBusquedaNotasCreditos) {
		this.fecha_emision_desdeBusquedaNotasCreditos = fecha_emision_desdeBusquedaNotasCreditos;
	}

;
	public Date fecha_emision_hastaBusquedaNotasCreditos=new Date();

	public Date getfecha_emision_hastaBusquedaNotasCreditos() {
		return this.fecha_emision_hastaBusquedaNotasCreditos;
	}

	public void setfecha_emision_hastaBusquedaNotasCreditos(Date fecha_emision_hastaBusquedaNotasCreditos) {
		this.fecha_emision_hastaBusquedaNotasCreditos = fecha_emision_hastaBusquedaNotasCreditos;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NotasCreditosLogic getNotasCreditosLogic()	{		
		return notascreditosLogic;
	}

	public void setNotasCreditosLogic(NotasCreditosLogic notascreditosLogic) {
		this.notascreditosLogic = notascreditosLogic;
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
	
	public Boolean getIsEsNuevoNotasCreditos() {
		return isEsNuevoNotasCreditos;
	}

	public void setIsEsNuevoNotasCreditos(Boolean isEsNuevoNotasCreditos) {
		this.isEsNuevoNotasCreditos = isEsNuevoNotasCreditos;
	}

	public Boolean getEsParaAccionDesdeFormularioNotasCreditos() {
		return esParaAccionDesdeFormularioNotasCreditos;
	}
	
	public void setEsParaAccionDesdeFormularioNotasCreditos(Boolean esParaAccionDesdeFormularioNotasCreditos) {
		this.esParaAccionDesdeFormularioNotasCreditos = esParaAccionDesdeFormularioNotasCreditos;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.notascreditosSessionBean==null) {
				this.notascreditosSessionBean=new NotasCreditosSessionBean();
			}

			if(!this.notascreditosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(notascreditosSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.notascreditos!=null) {
						this.notascreditos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
						this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNotasCreditos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
						if(this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.getItemCount()>0) {
							this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setSelectedIndex(0);
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

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNotasCreditosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaNotasCreditosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNotasCreditosGenerico!=null && jComboBoxid_empresaNotasCreditosGenerico.getItemCount()>0) {
					jComboBoxid_empresaNotasCreditosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(NotasCreditos notascreditos,JComboBox jComboBoxid_empresaNotasCreditosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNotasCreditosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNotasCreditosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				notascreditos.setid_empresa(empresaAux.getId());
				notascreditos.setempresa_descripcion(NotasCreditosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				notascreditos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNotasCreditos!=null) { 
							this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNotasCreditos!=null) { 
					}

					if(!NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
							this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
							this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesNotasCreditos() throws Exception {
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
		
	public NotasCreditosParameterReturnGeneral getNotasCreditosParameterGeneral() {
		return this.notascreditosParameterGeneral;
	}
	
	public void setNotasCreditosParameterGeneral(NotasCreditosParameterReturnGeneral notascreditosParameterGeneral) {
		this.notascreditosParameterGeneral = notascreditosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNotasCreditos() {
		return isPermisoTodoNotasCreditos;
	}

	public void setIsPermisoTodoNotasCreditos(Boolean isPermisoTodoNotasCreditos) {
		this.isPermisoTodoNotasCreditos = isPermisoTodoNotasCreditos;
	}

	public Boolean getIsPermisoNuevoNotasCreditos() {
		return isPermisoNuevoNotasCreditos;
	}

	public void setIsPermisoNuevoNotasCreditos(Boolean isPermisoNuevoNotasCreditos) {
		this.isPermisoNuevoNotasCreditos = isPermisoNuevoNotasCreditos;
	}

	public Boolean getIsPermisoActualizarNotasCreditos() {
		return isPermisoActualizarNotasCreditos;
	}

	public void setIsPermisoActualizarNotasCreditos(Boolean isPermisoActualizarNotasCreditos) {
		this.isPermisoActualizarNotasCreditos = isPermisoActualizarNotasCreditos;
	}

	public Boolean getIsPermisoEliminarNotasCreditos() {
		return isPermisoEliminarNotasCreditos;
	}

	public void setIsPermisoEliminarNotasCreditos(Boolean isPermisoEliminarNotasCreditos) {
		this.isPermisoEliminarNotasCreditos = isPermisoEliminarNotasCreditos;
	}

	public Boolean getIsPermisoGuardarCambiosNotasCreditos() {
		return isPermisoGuardarCambiosNotasCreditos;
	}

	public void setIsPermisoGuardarCambiosNotasCreditos(Boolean isPermisoGuardarCambiosNotasCreditos) {
		this.isPermisoGuardarCambiosNotasCreditos = isPermisoGuardarCambiosNotasCreditos;
	}
	
	public Boolean getIsPermisoConsultaNotasCreditos() {
		return isPermisoConsultaNotasCreditos;
	}

	public void setIsPermisoConsultaNotasCreditos(Boolean isPermisoConsultaNotasCreditos) {
		this.isPermisoConsultaNotasCreditos = isPermisoConsultaNotasCreditos;
	}

	public Boolean getIsPermisoBusquedaNotasCreditos() {
		return isPermisoBusquedaNotasCreditos;
	}

	public void setIsPermisoBusquedaNotasCreditos(Boolean isPermisoBusquedaNotasCreditos) {
		this.isPermisoBusquedaNotasCreditos = isPermisoBusquedaNotasCreditos;
	}

	public Boolean getIsPermisoReporteNotasCreditos() {
		return isPermisoReporteNotasCreditos;
	}

	public void setIsPermisoReporteNotasCreditos(Boolean isPermisoReporteNotasCreditos) {
		this.isPermisoReporteNotasCreditos = isPermisoReporteNotasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionMedioNotasCreditos() {
		return isPermisoPaginacionMedioNotasCreditos;
	}

	public void setIsPermisoPaginacionMedioNotasCreditos(Boolean isPermisoPaginacionMedioNotasCreditos) {
		this.isPermisoPaginacionMedioNotasCreditos = isPermisoPaginacionMedioNotasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionTodoNotasCreditos() {
		return isPermisoPaginacionTodoNotasCreditos;
	}

	public void setIsPermisoPaginacionTodoNotasCreditos(Boolean isPermisoPaginacionTodoNotasCreditos) {
		this.isPermisoPaginacionTodoNotasCreditos = isPermisoPaginacionTodoNotasCreditos;
	}
	
	public Boolean getIsPermisoPaginacionAltoNotasCreditos() {
		return isPermisoPaginacionAltoNotasCreditos;
	}

	public void setIsPermisoPaginacionAltoNotasCreditos(Boolean isPermisoPaginacionAltoNotasCreditos) {
		this.isPermisoPaginacionAltoNotasCreditos = isPermisoPaginacionAltoNotasCreditos;
	}
	
	public Boolean getIsPermisoCopiarNotasCreditos() {
		return isPermisoCopiarNotasCreditos;
	}

	public void setIsPermisoCopiarNotasCreditos(Boolean isPermisoCopiarNotasCreditos) {
		this.isPermisoCopiarNotasCreditos = isPermisoCopiarNotasCreditos;
	}
	
	public Boolean getIsPermisoVerFormNotasCreditos() {
		return isPermisoVerFormNotasCreditos;
	}

	public void setIsPermisoVerFormNotasCreditos(Boolean isPermisoVerFormNotasCreditos) {
		this.isPermisoVerFormNotasCreditos = isPermisoVerFormNotasCreditos;
	}
	
	public Boolean getIsPermisoDuplicarNotasCreditos() {
		return isPermisoDuplicarNotasCreditos;
	}

	public void setIsPermisoDuplicarNotasCreditos(Boolean isPermisoDuplicarNotasCreditos) {
		this.isPermisoDuplicarNotasCreditos = isPermisoDuplicarNotasCreditos;
	}
	
	public Boolean getIsPermisoOrdenNotasCreditos() {
		return isPermisoOrdenNotasCreditos;
	}

	public void setIsPermisoOrdenNotasCreditos(Boolean isPermisoOrdenNotasCreditos) {
		this.isPermisoOrdenNotasCreditos = isPermisoOrdenNotasCreditos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNotasCreditos() {
		return isVisibilidadCeldaNuevoNotasCreditos;
	}

	public void setIsVisibilidadCeldaNuevoNotasCreditos(Boolean isVisibilidadCeldaNuevoNotasCreditos) {
		this.isVisibilidadCeldaNuevoNotasCreditos = isVisibilidadCeldaNuevoNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNotasCreditos() {
		return isVisibilidadCeldaDuplicarNotasCreditos;
	}

	public void setIsVisibilidadCeldaDuplicarNotasCreditos(Boolean isVisibilidadCeldaDuplicarNotasCreditos) {
		this.isVisibilidadCeldaDuplicarNotasCreditos = isVisibilidadCeldaDuplicarNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNotasCreditos() {
		return isVisibilidadCeldaCopiarNotasCreditos;
	}

	public void setIsVisibilidadCeldaCopiarNotasCreditos(Boolean isVisibilidadCeldaCopiarNotasCreditos) {
		this.isVisibilidadCeldaCopiarNotasCreditos = isVisibilidadCeldaCopiarNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNotasCreditos() {
		return isVisibilidadCeldaVerFormNotasCreditos;
	}

	public void setIsVisibilidadCeldaVerFormNotasCreditos(Boolean isVisibilidadCeldaVerFormNotasCreditos) {
		this.isVisibilidadCeldaVerFormNotasCreditos = isVisibilidadCeldaVerFormNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNotasCreditos() {
		return isVisibilidadCeldaOrdenNotasCreditos;
	}

	public void setIsVisibilidadCeldaOrdenNotasCreditos(Boolean isVisibilidadCeldaOrdenNotasCreditos) {
		this.isVisibilidadCeldaOrdenNotasCreditos = isVisibilidadCeldaOrdenNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNotasCreditos() {
		return isVisibilidadCeldaNuevoRelacionesNotasCreditos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNotasCreditos(Boolean isVisibilidadCeldaNuevoRelacionesNotasCreditos) {
		this.isVisibilidadCeldaNuevoRelacionesNotasCreditos = isVisibilidadCeldaNuevoRelacionesNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNotasCreditos() {
		return isVisibilidadCeldaModificarNotasCreditos;
	}

	public void setIsVisibilidadCeldaModificarNotasCreditos(Boolean isVisibilidadCeldaModificarNotasCreditos) {
		this.isVisibilidadCeldaModificarNotasCreditos = isVisibilidadCeldaModificarNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNotasCreditos() {
		return isVisibilidadCeldaActualizarNotasCreditos;
	}

	public void setIsVisibilidadCeldaActualizarNotasCreditos(Boolean isVisibilidadCeldaActualizarNotasCreditos) {
		this.isVisibilidadCeldaActualizarNotasCreditos = isVisibilidadCeldaActualizarNotasCreditos;
	}

	public Boolean getIsVisibilidadCeldaEliminarNotasCreditos() {
		return isVisibilidadCeldaEliminarNotasCreditos;
	}

	public void setIsVisibilidadCeldaEliminarNotasCreditos(Boolean isVisibilidadCeldaEliminarNotasCreditos) {
		this.isVisibilidadCeldaEliminarNotasCreditos = isVisibilidadCeldaEliminarNotasCreditos;
	}

	public Boolean getIsVisibilidadCeldaCancelarNotasCreditos() {
		return isVisibilidadCeldaCancelarNotasCreditos;
	}

	public void setIsVisibilidadCeldaCancelarNotasCreditos(Boolean isVisibilidadCeldaCancelarNotasCreditos) {
		this.isVisibilidadCeldaCancelarNotasCreditos = isVisibilidadCeldaCancelarNotasCreditos;
	}

	public Boolean getIsVisibilidadCeldaGuardarNotasCreditos() {
		return isVisibilidadCeldaGuardarNotasCreditos;
	}

	public void setIsVisibilidadCeldaGuardarNotasCreditos(Boolean isVisibilidadCeldaGuardarNotasCreditos) {
		this.isVisibilidadCeldaGuardarNotasCreditos = isVisibilidadCeldaGuardarNotasCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNotasCreditos() {
		return isVisibilidadCeldaGuardarCambiosNotasCreditos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNotasCreditos(Boolean isVisibilidadCeldaGuardarCambiosNotasCreditos) {
		this.isVisibilidadCeldaGuardarCambiosNotasCreditos = isVisibilidadCeldaGuardarCambiosNotasCreditos;
	}
		
	public NotasCreditosSessionBean getnotascreditosSessionBean() {
		return this.notascreditosSessionBean;
	}
	
	public void setnotascreditosSessionBean(NotasCreditosSessionBean notascreditosSessionBean) {
		this.notascreditosSessionBean=notascreditosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaNotasCreditos() {
		return this.isVisibilidadBusquedaNotasCreditos;
	}

	public void setisVisibilidadBusquedaNotasCreditos(Boolean isVisibilidadBusquedaNotasCreditos) {
		this.isVisibilidadBusquedaNotasCreditos=isVisibilidadBusquedaNotasCreditos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(NotasCreditos notascreditos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(notascreditos,null);
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
	
	public void bugActualizarReferenciaActual(NotasCreditos notascreditos,NotasCreditos notascreditosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNotasCreditos(notascreditos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		notascreditosAux.setId(notascreditos.getId());
		notascreditosAux.setVersionRow(notascreditos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(NotasCreditos notascreditosLocal) throws Exception {
		
		if(this.notascreditosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NotasCreditos notascreditosLocal) throws Exception {	
		if(this.notascreditosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				notascreditosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNotasCreditosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = notascreditosValidator.getInvalidValues(this.notascreditos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NotasCreditos notascreditos,List<NotasCreditos> notascreditoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(NotasCreditos notascreditos,List<NotasCreditos> notascreditoss) throws Exception {
		try	{			
			NotasCreditosConstantesFunciones.actualizarSelectedLista(notascreditos,notascreditoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NotasCreditos> notascreditossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				notascreditossLocal=this.notascreditosLogic.getNotasCreditoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				notascreditossLocal=this.notascreditoss;
			}
			//ARCHITECTURE
		
			for(NotasCreditos notascreditosLocal:notascreditossLocal) {
				if(this.permiteMantenimiento(notascreditosLocal) && notascreditosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NotasCreditosConstantesFunciones.getNotasCreditosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelnombre_completo_clienteNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.NUMEROPREIMPRESOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelnumero_pre_impreso_facturaNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelnumero_pre_impresoNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelfecha_emisionNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelfecha_vencimientoNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelivaNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.DESCUENTOVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabeldescuento_valorNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.OTROVALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelotro_valorNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelsub_totalNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabeltotalNotasCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NotasCreditosConstantesFunciones.NOMBREESTADONOTACREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelnombre_estado_nota_creditoNotasCreditos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelnombre_completo_clienteNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelnumero_pre_impreso_facturaNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelnumero_pre_impresoNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelfecha_emisionNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelfecha_vencimientoNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelivaNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabeldescuento_valorNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelotro_valorNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelsub_totalNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabeltotalNotasCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNotasCreditos.jLabelnombre_estado_nota_creditoNotasCreditos,"");
		
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
		this.iIdNuevoNotasCreditos--;	
		
		
		this.notascreditosAux=new NotasCreditos();
		
		this.notascreditosAux.setId(this.iIdNuevoNotasCreditos);
		this.notascreditosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.notascreditosLogic.getNotasCreditoss().add(this.notascreditosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.notascreditoss.add(this.notascreditosAux);
		}
		//ARCHITECTURE
		
		this.notascreditos=this.notascreditosAux;
		
		if(NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNotasCreditos(this.notascreditos);
			this.setVariablesObjetoActualToFormularioForeignKeyNotasCreditos(this.notascreditos);
		}
				
		//this.setDefaultControlesNotasCreditos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNotasCreditos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNotasCreditos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNotasCreditos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNotasCreditos(this.notascreditosBean,this.notascreditos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNotasCreditos(this.notascreditosReturnGeneral,this.notascreditosBean,false);
		
		if(this.notascreditosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNotasCreditos(this.notascreditosReturnGeneral.getNotasCreditos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNotasCreditos(this.notascreditosReturnGeneral.getNotasCreditos());
		}
		
		if(this.notascreditosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNotasCreditos(this.notascreditosReturnGeneral.getNotasCreditos(),classes);//this.notascreditosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNotasCreditos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNotasCreditos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NotasCreditosBeanSwingJInternalFrameAdditional.RecargarFormNotasCreditos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNotasCreditos(false);
						
			if(notascreditosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNotasCreditos();
			}
			
			this.actualizarVisualTableDatosNotasCreditos();
			
			this.jTableDatosNotasCreditos.setRowSelectionInterval(this.getIndiceNuevoNotasCreditos(), this.getIndiceNuevoNotasCreditos());
			
			this.seleccionarFilaTablaNotasCreditosActual();
						
			this.actualizarEstadoCeldasBotonesNotasCreditos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNotasCreditos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emision_desdeNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarfecha_emision_desdeNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emision_hastaNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarfecha_emision_hastaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_completo_clienteNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarnombre_completo_clienteNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impreso_facturaNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarnumero_pre_impreso_facturaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impresoNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarnumero_pre_impresoNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emisionNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarfecha_emisionNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_vencimientoNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarfecha_vencimientoNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldivaNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarivaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFielddescuento_valorNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activardescuento_valorNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldotro_valorNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarotro_valorNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldsub_totalNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarsub_totalNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldtotalNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activartotalNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_estado_nota_creditoNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarnombre_estado_nota_creditoNotasCreditos);	
		//
		this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setEnabled(isHabilitar && this.notascreditosConstantesFunciones.activarid_empresaNotasCreditos);
	};
	
	public void setDefaultControlesNotasCreditos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNotasCreditos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.notascreditosSessionBean.setConGuardarRelaciones(true);			
			this.notascreditosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.setVisible(true);
			
					
		} else {
			//this.notascreditosSessionBean.setConGuardarRelaciones(false);			
			this.notascreditosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoNotasCreditos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
				if(notascreditosAux.getId().equals(this.iIdNuevoNotasCreditos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NotasCreditos notascreditosAux:this.notascreditoss) {
				if(notascreditosAux.getId().equals(this.iIdNuevoNotasCreditos)) {
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
	
	public int getIndiceActualNotasCreditos(NotasCreditos notascreditos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
				if(notascreditosAux.getId().equals(notascreditos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NotasCreditos notascreditosAux:this.notascreditoss) {
				if(notascreditosAux.getId().equals(notascreditos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNotasCreditos(NotasCreditos notascreditosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
				if(notascreditosAux.getNotasCreditosOriginal().getId().equals(notascreditosOriginal.getId())) {
					existe=true;
					notascreditosOriginal.setId(notascreditosAux.getId());
					notascreditosOriginal.setVersionRow(notascreditosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NotasCreditos notascreditosAux:this.notascreditoss) {
				if(notascreditosAux.getNotasCreditosOriginal().getId().equals(notascreditosOriginal.getId())) {
					existe=true;
					notascreditosOriginal.setId(notascreditosAux.getId());
					notascreditosOriginal.setVersionRow(notascreditosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNotasCreditos(Boolean esParaCancelar) throws Exception {
		notascreditossAux=new ArrayList<NotasCreditos>();
		notascreditosAux=new NotasCreditos();
		
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
					if(notascreditosAux.getId()<0) {
						notascreditossAux.add(notascreditosAux);
					}		
				}
				this.iIdNuevoNotasCreditos=0L;
				this.notascreditosLogic.getNotasCreditoss().removeAll(notascreditossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NotasCreditos notascreditosAux:this.notascreditoss) {
					if(notascreditosAux.getId()<0) {
						notascreditossAux.add(notascreditosAux);
					}		
				}
				this.iIdNuevoNotasCreditos=0L;
				this.notascreditoss.removeAll(notascreditossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNotasCreditos 
					&& this.notascreditosLogic.getNotasCreditoss().size()>0
					) {
					notascreditosAux=this.notascreditosLogic.getNotasCreditoss().get(this.notascreditosLogic.getNotasCreditoss().size() - 1);
				
					if(notascreditosAux.getId()<0) {
						this.notascreditosLogic.getNotasCreditoss().remove(notascreditosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNotasCreditos && this.notascreditoss.size()>0) {
					notascreditosAux=this.notascreditoss.get(this.notascreditoss.size() - 1);
				
					if(notascreditosAux.getId()<0) {
						this.notascreditoss.remove(notascreditosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNotasCreditos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(notascreditos.getId()<0) {
				this.notascreditosLogic.getNotasCreditoss().remove(this.notascreditos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(notascreditos.getId()<0) {
				this.notascreditoss.remove(this.notascreditos);
			}
		}			
	}
	
	public void setEstadosInicialesNotasCreditos(List<NotasCreditos> notascreditossAux) throws Exception {
		NotasCreditosConstantesFunciones.setEstadosInicialesNotasCreditos(notascreditossAux);
	}
	
	public void setEstadosInicialesNotasCreditos(NotasCreditos notascreditosAux) throws Exception {
		NotasCreditosConstantesFunciones.setEstadosInicialesNotasCreditos(notascreditosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNotasCreditosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNotasCreditosActual()) {
				if(!this.isEsNuevoNotasCreditos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNotasCreditos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNotasCreditosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Notas Creditos ?", "MANTENIMIENTO DE Notas Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NotasCreditos notascreditos) throws Exception {
		NotasCreditosConstantesFunciones.seleccionarAsignar(this.notascreditos,notascreditos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNotasCreditos=this.isPermisoActualizarOriginalNotasCreditos;
			
			
			this.seleccionarAsignar(notascreditos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesNotasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.notascreditosSessionBean.setsFuncionBusquedaRapida(this.notascreditosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNotasCreditos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNotasCreditos(esParaCancelar);				
				this.cancelarNuevoNotasCreditos(esParaCancelar);								
			}
			
			this.notascreditos=new NotasCreditos();
			
			this.inicializarNotasCreditos();
			
			this.actualizarEstadoCeldasBotonesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNotasCreditos() throws Exception {
		try {
			NotasCreditosConstantesFunciones.inicializarNotasCreditos(this.notascreditos);
			
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
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.notascreditosLogic.getNotasCreditoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNotasCreditoss(String sAccionBusqueda,List<NotasCreditos> notascreditossParaReportes) throws Exception {
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
					sPathReporteFinal="NotasCreditos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NotasCreditosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NotasCreditosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NotasCreditos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Notas Creditoses");		
		parameters.put("busquedapor", NotasCreditosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNotasCreditos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NotasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NotasCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNotasCreditos=new JRBeanArrayDataSource(NotasCreditosJInternalFrame.TraerNotasCreditosBeans(notascreditossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNotasCreditos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NotasCreditosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NotasCreditosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NotasCreditosBean.TraerNotasCreditosBeans(notascreditossParaReportes).toArray()));
							
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
				this.generarExcelReporteNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,notascreditossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,notascreditossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNotasCreditosActionPerformed(null);
					//this.generarExcelReporteNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,notascreditossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,notascreditossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,notascreditossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNotasCreditoss(sAccionBusqueda,sTipoArchivoReporte,notascreditossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNotasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<NotasCreditos> notascreditossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"notascreditos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NotasCreditoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNotasCreditos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NotasCreditos notascreditos : notascreditossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NotasCreditosConstantesFunciones.generarExcelReporteDataNotasCreditos("NORMAL",row,workbook,notascreditos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNotasCreditos(String sTipo,Row row,Workbook workbook) {
		
		NotasCreditosConstantesFunciones.generarExcelReporteHeaderNotasCreditos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNotasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<NotasCreditos> notascreditossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"notascreditos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NotasCreditoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NotasCreditos notascreditos : notascreditossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NotasCreditosConstantesFunciones.getNotasCreditosDescripcion(notascreditos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getnumero_pre_impreso_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getdescuento_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_OTROVALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_OTROVALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getotro_valor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getsub_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(notascreditos.getnombre_estado_nota_credito());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNotasCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<NotasCreditos> notascreditossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NotasCreditos> notascreditossRespaldo=null;
		
		classes=NotasCreditosConstantesFunciones.getClassesRelationshipsOfNotasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.notascreditosLogic.setDatosCliente(this.datosCliente);
		this.notascreditosLogic.setDatosDeep(this.datosDeep);
		this.notascreditosLogic.setIsConDeep(true);
		
		notascreditossRespaldo=this.notascreditosLogic.getNotasCreditoss();
		
		this.notascreditosLogic.setNotasCreditoss(notascreditossParaReportes);	
		this.notascreditosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		notascreditossParaReportes=this.notascreditosLogic.getNotasCreditoss();
		this.notascreditosLogic.setNotasCreditoss(notascreditossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"notascreditos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NotasCreditoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNotasCreditos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NotasCreditos notascreditos : notascreditossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNotasCreditos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NotasCreditosConstantesFunciones.generarExcelReporteDataNotasCreditos("NORMAL",row,workbook,notascreditos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(NotasCreditosConstantesFunciones.getNotasCreditosDescripcion(notascreditos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNotasCreditos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNotasCreditos() throws Exception {		
		this.startProcessNotasCreditos(true);
	}
	
	public void startProcessNotasCreditos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNotasCreditos ,this.jPanelParametrosReportesNotasCreditos, this.jScrollPanelDatosNotasCreditos,this.jPanelPaginacionNotasCreditos, this.jScrollPanelDatosEdicionNotasCreditos, this.jPanelAccionesNotasCreditos,this.jPanelAccionesFormularioNotasCreditos,this.jmenuBarNotasCreditos,this.jmenuBarDetalleNotasCreditos,this.jTtoolBarNotasCreditos,this.jTtoolBarDetalleNotasCreditos);		
		
		final JTabbedPane jTabbedPaneBusquedasNotasCreditos=this.jTabbedPaneBusquedasNotasCreditos; 
		
		final JPanel jPanelParametrosReportesNotasCreditos=this.jPanelParametrosReportesNotasCreditos;
		//final JScrollPane jScrollPanelDatosNotasCreditos=this.jScrollPanelDatosNotasCreditos;
		final JTable jTableDatosNotasCreditos=this.jTableDatosNotasCreditos;		
		final JPanel jPanelPaginacionNotasCreditos=this.jPanelPaginacionNotasCreditos;
		//final JScrollPane jScrollPanelDatosEdicionNotasCreditos=this.jScrollPanelDatosEdicionNotasCreditos;
		final JPanel jPanelAccionesNotasCreditos=this.jPanelAccionesNotasCreditos;
		
		JPanel jPanelCamposAuxiliarNotasCreditos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNotasCreditos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			jPanelCamposAuxiliarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jPanelCamposNotasCreditos;
			jPanelAccionesFormularioAuxiliarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jPanelAccionesFormularioNotasCreditos;
		}
		
		final JPanel jPanelCamposNotasCreditos=jPanelCamposAuxiliarNotasCreditos;
		final JPanel jPanelAccionesFormularioNotasCreditos=jPanelAccionesFormularioAuxiliarNotasCreditos;
		
		
		final JMenuBar jmenuBarNotasCreditos=this.jmenuBarNotasCreditos;
		final JToolBar jTtoolBarNotasCreditos=this.jTtoolBarNotasCreditos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNotasCreditos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNotasCreditos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			jmenuBarDetalleAuxiliarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jmenuBarDetalleNotasCreditos;
			jTtoolBarDetalleAuxiliarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jTtoolBarDetalleNotasCreditos;
		}
		
		final JMenuBar jmenuBarDetalleNotasCreditos=jmenuBarDetalleAuxiliarNotasCreditos;
		final JToolBar jTtoolBarDetalleNotasCreditos=jTtoolBarDetalleAuxiliarNotasCreditos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNotasCreditos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNotasCreditos;
			processRunnable.jTableDatos=jTableDatosNotasCreditos;
			processRunnable.jPanelCampos=jPanelCamposNotasCreditos;
			processRunnable.jPanelPaginacion=jPanelPaginacionNotasCreditos;
			processRunnable.jPanelAcciones=jPanelAccionesNotasCreditos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNotasCreditos;
			
			
			processRunnable.jmenuBar=jmenuBarNotasCreditos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNotasCreditos;
			processRunnable.jTtoolBar=jTtoolBarNotasCreditos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNotasCreditos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNotasCreditos ,jPanelParametrosReportesNotasCreditos,jTableDatosNotasCreditos, /*jScrollPanelDatosNotasCreditos,*/jPanelCamposNotasCreditos,jPanelPaginacionNotasCreditos, /*jScrollPanelDatosEdicionNotasCreditos,*/ jPanelAccionesNotasCreditos,jPanelAccionesFormularioNotasCreditos,jmenuBarNotasCreditos,jmenuBarDetalleNotasCreditos,jTtoolBarNotasCreditos,jTtoolBarDetalleNotasCreditos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNotasCreditos ,jPanelParametrosReportesNotasCreditos, jScrollPanelDatosNotasCreditos,jPanelPaginacionNotasCreditos, jScrollPanelDatosEdicionNotasCreditos, jPanelAccionesNotasCreditos,jPanelAccionesFormularioNotasCreditos,jmenuBarNotasCreditos,jmenuBarDetalleNotasCreditos,jTtoolBarNotasCreditos,jTtoolBarDetalleNotasCreditos);
						
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
	
	public void finishProcessNotasCreditos() {// throws Exception 
		this.finishProcessNotasCreditos(true);
	}
	
	public void finishProcessNotasCreditos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNotasCreditos ,this.jPanelParametrosReportesNotasCreditos, this.jScrollPanelDatosNotasCreditos,this.jPanelPaginacionNotasCreditos, this.jScrollPanelDatosEdicionNotasCreditos, this.jPanelAccionesNotasCreditos,this.jPanelAccionesFormularioNotasCreditos,this.jmenuBarNotasCreditos,this.jmenuBarDetalleNotasCreditos,this.jTtoolBarNotasCreditos,this.jTtoolBarDetalleNotasCreditos);		
		
		final JTabbedPane jTabbedPaneBusquedasNotasCreditos=this.jTabbedPaneBusquedasNotasCreditos; 
		
		final JPanel jPanelParametrosReportesNotasCreditos=this.jPanelParametrosReportesNotasCreditos;
		//final JScrollPane jScrollPanelDatosNotasCreditos=this.jScrollPanelDatosNotasCreditos;
		final JTable jTableDatosNotasCreditos=this.jTableDatosNotasCreditos;		
		final JPanel jPanelPaginacionNotasCreditos=this.jPanelPaginacionNotasCreditos;
		//final JScrollPane jScrollPanelDatosEdicionNotasCreditos=this.jScrollPanelDatosEdicionNotasCreditos;
		final JPanel jPanelAccionesNotasCreditos=this.jPanelAccionesNotasCreditos;
		
		JPanel jPanelCamposAuxiliarNotasCreditos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNotasCreditos=new JPanel();
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			jPanelCamposAuxiliarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jPanelCamposNotasCreditos;
			jPanelAccionesFormularioAuxiliarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jPanelAccionesFormularioNotasCreditos;
		}
		
		final JPanel jPanelCamposNotasCreditos=jPanelCamposAuxiliarNotasCreditos;
		final JPanel jPanelAccionesFormularioNotasCreditos=jPanelAccionesFormularioAuxiliarNotasCreditos;
		
		
		final JMenuBar jmenuBarNotasCreditos=this.jmenuBarNotasCreditos;		
		final JToolBar jTtoolBarNotasCreditos=this.jTtoolBarNotasCreditos;
				
		JMenuBar jmenuBarDetalleAuxiliarNotasCreditos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNotasCreditos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			jmenuBarDetalleAuxiliarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jmenuBarDetalleNotasCreditos;
			jTtoolBarDetalleAuxiliarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jTtoolBarDetalleNotasCreditos;		
		}
		
		final JMenuBar jmenuBarDetalleNotasCreditos=jmenuBarDetalleAuxiliarNotasCreditos;
		final JToolBar jTtoolBarDetalleNotasCreditos=jTtoolBarDetalleAuxiliarNotasCreditos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNotasCreditos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNotasCreditos;
			processRunnable.jTableDatos=jTableDatosNotasCreditos;
			processRunnable.jPanelCampos=jPanelCamposNotasCreditos;
			processRunnable.jPanelPaginacion=jPanelPaginacionNotasCreditos;
			processRunnable.jPanelAcciones=jPanelAccionesNotasCreditos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNotasCreditos;
			
			
			processRunnable.jmenuBar=jmenuBarNotasCreditos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNotasCreditos;
			processRunnable.jTtoolBar=jTtoolBarNotasCreditos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNotasCreditos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNotasCreditos ,jPanelParametrosReportesNotasCreditos, jTableDatosNotasCreditos,/*jScrollPanelDatosNotasCreditos,*/jPanelCamposNotasCreditos,jPanelPaginacionNotasCreditos, /*jScrollPanelDatosEdicionNotasCreditos,*/ jPanelAccionesNotasCreditos,jPanelAccionesFormularioNotasCreditos,jmenuBarNotasCreditos,jmenuBarDetalleNotasCreditos,jTtoolBarNotasCreditos,jTtoolBarDetalleNotasCreditos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNotasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNotasCreditos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNotasCreditos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNotasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNotasCreditos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNotasCreditos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNotasCreditos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNotasCreditos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNotasCreditos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.notascreditosConstantesFunciones.getsFinalQueryNotasCreditos();
		String  finalQueryPaginacionTodos=this.notascreditosConstantesFunciones.getsFinalQueryNotasCreditos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NotasCreditosConstantesFunciones.getArrayColumnasGlobalesNoNotasCreditos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NotasCreditosConstantesFunciones.getArrayColumnasGlobalesNotasCreditos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NotasCreditosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.notascreditossEliminados= new ArrayList<NotasCreditos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNotasCreditos();
		
				///*NotasCreditosSessionBean*/this.notascreditosSessionBean=new NotasCreditosSessionBean();
			
			if(this.notascreditosSessionBean==null) {
				this.notascreditosSessionBean=new NotasCreditosSessionBean();
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
					this.iNumeroPaginacion=NotasCreditosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NotasCreditosConstantesFunciones.getClassesForeignKeysOfNotasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/notascreditos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			notascreditossAux= new ArrayList<NotasCreditos>();
			
				
			notascreditosLogic.setDatosCliente(this.datosCliente);
			notascreditosLogic.setDatosDeep(this.datosDeep);
			notascreditosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaNotasCreditos")) {
				this.sDetalleReporte=NotasCreditosConstantesFunciones.getDetalleIndiceBusquedaNotasCreditos(fecha_emision_desdeBusquedaNotasCreditos,fecha_emision_hastaBusquedaNotasCreditos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					notascreditosLogic.getNotasCreditossBusquedaNotasCreditos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaNotasCreditos,fecha_emision_hastaBusquedaNotasCreditos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NotasCreditosConstantesFunciones.getDetalleIndiceBusquedaNotasCreditos(fecha_emision_desdeBusquedaNotasCreditos,fecha_emision_hastaBusquedaNotasCreditos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NotasCreditosConstantesFunciones.getDetalleIndiceBusquedaNotasCreditos(fecha_emision_desdeBusquedaNotasCreditos,fecha_emision_hastaBusquedaNotasCreditos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=notascreditosLogic.getNotasCreditoss()==null||notascreditosLogic.getNotasCreditoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=notascreditoss==null|| notascreditoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						notascreditossAux=new ArrayList<NotasCreditos>();
						notascreditossAux.addAll(notascreditosLogic.getNotasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							notascreditossAux=new ArrayList<NotasCreditos>();
							notascreditossAux.addAll(notascreditoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							notascreditosLogic.getNotasCreditossBusquedaNotasCreditos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaNotasCreditos,fecha_emision_hastaBusquedaNotasCreditos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NotasCreditosConstantesFunciones.getDetalleIndiceBusquedaNotasCreditos(fecha_emision_desdeBusquedaNotasCreditos,fecha_emision_hastaBusquedaNotasCreditos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NotasCreditosConstantesFunciones.getDetalleIndiceBusquedaNotasCreditos(fecha_emision_desdeBusquedaNotasCreditos,fecha_emision_hastaBusquedaNotasCreditos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNotasCreditoss("BusquedaNotasCreditos",notascreditosLogic.getNotasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNotasCreditoss("BusquedaNotasCreditos",notascreditoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						notascreditosLogic.setNotasCreditoss(new ArrayList<NotasCreditos>());
						notascreditosLogic.getNotasCreditoss().addAll(notascreditossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							notascreditoss=new ArrayList<NotasCreditos>();
							notascreditoss.addAll(notascreditossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNotasCreditos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNotasCreditos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=notascreditosLogic.getNotasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=notascreditoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=notascreditosLogic.getNotasCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=notascreditoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NotasCreditos notascreditos) {
		Boolean permite=true;
		
		if(this.notascreditos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NotasCreditosConstantesFunciones.getOrderByListaNotasCreditos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NotasCreditosConstantesFunciones.getOrderByListaNotasCreditos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NotasCreditos notascreditos:notascreditosLogic.getNotasCreditoss()) {
				if(notascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					notascreditosTotales=notascreditos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NotasCreditos notascreditos:this.notascreditoss) {
				if(notascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					notascreditosTotales=notascreditos;
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
			this.notascreditosAux=new NotasCreditos();
			this.notascreditosAux.setsType(Constantes2.S_TOTALES);
			this.notascreditosAux.setIsNew(false);
			this.notascreditosAux.setIsChanged(false);
			this.notascreditosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//NotasCreditosConstantesFunciones.TotalizarValoresFilaNotasCreditos(this.notascreditosLogic.getNotasCreditoss(),this.notascreditosAux);
				
				//this.notascreditosLogic.getNotasCreditoss().add(this.notascreditosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NotasCreditosConstantesFunciones.TotalizarValoresFilaNotasCreditos(this.notascreditoss,this.notascreditosAux);
				
				this.notascreditoss.add(this.notascreditosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		notascreditosTotales=new NotasCreditos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.notascreditosLogic.getNotasCreditoss().remove(notascreditosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.notascreditoss.remove(notascreditosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		notascreditosTotales=new NotasCreditos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NotasCreditos notascreditos:notascreditosLogic.getNotasCreditoss()) {
				if(notascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					notascreditosTotales=notascreditos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NotasCreditosConstantesFunciones.TotalizarValoresFilaNotasCreditos(this.notascreditosLogic.getNotasCreditoss(),notascreditosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NotasCreditos notascreditos:this.notascreditoss) {
				if(notascreditos.getsType().equals(Constantes2.S_TOTALES)) {
					notascreditosTotales=notascreditos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NotasCreditosConstantesFunciones.TotalizarValoresFilaNotasCreditos(this.notascreditoss,notascreditosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNotasCreditossBusquedaNotasCreditos()throws Exception {
		try {
			sAccionBusqueda="BusquedaNotasCreditos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNotasCreditossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNotasCreditossBusquedaNotasCreditos(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//notascreditosLogic.getNotasCreditossBusquedaNotasCreditos(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNotasCreditossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//notascreditosLogic.getNotasCreditossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosNotasCreditos() {
		this.isPermisoTodoNotasCreditos=false;
		this.isPermisoNuevoNotasCreditos=false;
		this.isPermisoActualizarNotasCreditos=false;
		this.isPermisoActualizarOriginalNotasCreditos=false;
		this.isPermisoEliminarNotasCreditos=false;
		this.isPermisoGuardarCambiosNotasCreditos=false;
		this.isPermisoConsultaNotasCreditos=true;
		this.isPermisoBusquedaNotasCreditos=true;
		this.isPermisoReporteNotasCreditos=true;
		this.isPermisoOrdenNotasCreditos=false;		
		this.isPermisoPaginacionMedioNotasCreditos=false;		
		this.isPermisoPaginacionAltoNotasCreditos=false;		
		this.isPermisoPaginacionTodoNotasCreditos=false;		
		this.isPermisoCopiarNotasCreditos=false;		
		this.isPermisoVerFormNotasCreditos=false;		
		this.isPermisoDuplicarNotasCreditos=false;
		this.isPermisoOrdenNotasCreditos=false;
	}
	
	public void setPermisosUsuarioNotasCreditos(Boolean isPermiso) {
		this.isPermisoTodoNotasCreditos=isPermiso;
		this.isPermisoNuevoNotasCreditos=isPermiso;
		this.isPermisoActualizarNotasCreditos=isPermiso;
		this.isPermisoActualizarOriginalNotasCreditos=isPermiso;
		this.isPermisoEliminarNotasCreditos=isPermiso;
		this.isPermisoGuardarCambiosNotasCreditos=isPermiso;
		this.isPermisoConsultaNotasCreditos=isPermiso;
		this.isPermisoBusquedaNotasCreditos=isPermiso;
		this.isPermisoReporteNotasCreditos=isPermiso;
		this.isPermisoOrdenNotasCreditos=isPermiso;		
		this.isPermisoPaginacionMedioNotasCreditos=isPermiso;		
		this.isPermisoPaginacionAltoNotasCreditos=isPermiso;		
		this.isPermisoPaginacionTodoNotasCreditos=isPermiso;		
		this.isPermisoCopiarNotasCreditos=isPermiso;		
		this.isPermisoVerFormNotasCreditos=isPermiso;		
		this.isPermisoDuplicarNotasCreditos=isPermiso;
		this.isPermisoOrdenNotasCreditos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNotasCreditos(Boolean isPermiso) {
		//this.isPermisoTodoNotasCreditos=isPermiso;
		this.isPermisoNuevoNotasCreditos=isPermiso;
		this.isPermisoActualizarNotasCreditos=isPermiso;
		this.isPermisoActualizarOriginalNotasCreditos=isPermiso;
		this.isPermisoEliminarNotasCreditos=isPermiso;
		this.isPermisoGuardarCambiosNotasCreditos=isPermiso;
		//this.isPermisoConsultaNotasCreditos=isPermiso;
		//this.isPermisoBusquedaNotasCreditos=isPermiso;
		//this.isPermisoReporteNotasCreditos=isPermiso;
		//this.isPermisoOrdenNotasCreditos=isPermiso;		
		//this.isPermisoPaginacionMedioNotasCreditos=isPermiso;		
		//this.isPermisoPaginacionAltoNotasCreditos=isPermiso;		
		//this.isPermisoPaginacionTodoNotasCreditos=isPermiso;		
		//this.isPermisoCopiarNotasCreditos=isPermiso;		
		//this.isPermisoDuplicarNotasCreditos=isPermiso;
		//this.isPermisoOrdenNotasCreditos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNotasCreditosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(NotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebNotasCreditos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNotasCreditosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioNotasCreditosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNotasCreditosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNotasCreditosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioNotasCreditos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.notascreditosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NotasCreditosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNotasCreditos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNotasCreditos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNotasCreditos=this.isPermisoActualizarNotasCreditos;
			this.isPermisoEliminarNotasCreditos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNotasCreditos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNotasCreditos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNotasCreditos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNotasCreditos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNotasCreditos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNotasCreditos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNotasCreditos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNotasCreditos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNotasCreditos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNotasCreditos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNotasCreditos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNotasCreditos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNotasCreditos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.notascreditosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNotasCreditos.setToolTipText(this.jTableDatosNotasCreditos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNotasCreditos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNotasCreditos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNotasCreditos() throws Exception {
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
	public void inicializarCombosForeignKeyNotasCreditosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNotasCreditosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NotasCreditosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyNotasCreditos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.notascreditosSessionBean==null) {
				this.notascreditosSessionBean=new NotasCreditosSessionBean();
			}

			if(!this.notascreditosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyNotasCreditos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNotasCreditos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNotasCreditos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNotasCreditos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNotasCreditos(NotasCreditos notascreditos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNotasCreditos(NotasCreditos notascreditos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNotasCreditos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNotasCreditos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNotasCreditos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNotasCreditos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNotasCreditos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNotasCreditos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNotasCreditos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNotasCreditos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.getItemCount()>0) {
				this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public NotasCreditosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NotasCreditosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NotasCreditosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.notascreditosSessionBean=new NotasCreditosSessionBean(); 
		this.notascreditosConstantesFunciones=new NotasCreditosConstantesFunciones(); 
		this.notascreditosBean=new NotasCreditos();//(this.notascreditosConstantesFunciones); 		
		this.notascreditosReturnGeneral=new NotasCreditosParameterReturnGeneral(); 
		
		this.notascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NotasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NotasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NotasCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNotasCreditos(true);
			
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
			
			this.notascreditosConstantesFunciones=new NotasCreditosConstantesFunciones(); 
			this.notascreditosBean=new NotasCreditos();//this.notascreditosConstantesFunciones); 			
			this.notascreditosReturnGeneral=new NotasCreditosParameterReturnGeneral(); 
		
			NotasCreditosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Notas Creditos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.notascreditos=new NotasCreditos();
			this.notascreditoss = new ArrayList<NotasCreditos>();
			this.notascreditossAux = new ArrayList<NotasCreditos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic=new NotasCreditosLogic();
				this.notascreditosLogic.getNewConnexionToDeep("");
			}
			
			//this.notascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.notascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNotasCreditos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNotasCreditos);	
					}
					
					if(this.jInternalFrameImportacionNotasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNotasCreditos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNotasCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNotasCreditos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNotasCreditos);
				this.jInternalFrameDetalleFormNotasCreditos.setVisible(false);
				this.jInternalFrameDetalleFormNotasCreditos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNotasCreditos);
					this.jInternalFrameReporteDinamicoNotasCreditos.setVisible(false);
					this.jInternalFrameReporteDinamicoNotasCreditos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNotasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNotasCreditos);
					this.jInternalFrameImportacionNotasCreditos.setVisible(false);
					this.jInternalFrameImportacionNotasCreditos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNotasCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNotasCreditos);
					this.jInternalFrameOrderByNotasCreditos.setVisible(false);
					this.jInternalFrameOrderByNotasCreditos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNotasCreditosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NotasCreditosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.notascreditosReturnGeneral=new NotasCreditosParameterReturnGeneral();
			
			this.notascreditosParameterGeneral=new NotasCreditosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.notascreditosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NotasCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.notascreditosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NotasCreditosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.notascreditosSessionBean.getEsGuardarRelacionado(),this.notascreditosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NotasCreditosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.notascreditosSessionBean.getEsGuardarRelacionado(),this.notascreditosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNotasCreditos=false;
			this.isVisibilidadCeldaDuplicarNotasCreditos=true;
			this.isVisibilidadCeldaCopiarNotasCreditos=true;
			this.isVisibilidadCeldaVerFormNotasCreditos=true;
			this.isVisibilidadCeldaOrdenNotasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
			this.isVisibilidadCeldaModificarNotasCreditos=false;
			this.isVisibilidadCeldaActualizarNotasCreditos=false;
			this.isVisibilidadCeldaEliminarNotasCreditos=false;
			this.isVisibilidadCeldaCancelarNotasCreditos=false;
			this.isVisibilidadCeldaGuardarNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=false;
			
			
			this.isVisibilidadBusquedaNotasCreditos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNotasCreditos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNotasCreditos(false);
			
			this.setPermisosUsuarioNotasCreditos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.notascreditosSessionBean.getEsGuardarRelacionado() 
				|| (this.notascreditosSessionBean.getEsGuardarRelacionado() && this.notascreditosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNotasCreditosClasesRelacionadas();
			}
			
			if(this.notascreditosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNotasCreditosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNotasCreditos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNotasCreditos();
			}
			
			if(!this.isPermisoBusquedaNotasCreditos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NotasCreditosConstantesFunciones.getTiposSeleccionarNotasCreditos());
				
				this.tiposColumnasSelect=NotasCreditosConstantesFunciones.getTiposSeleccionarNotasCreditos(true);
				
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
			//if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNotasCreditos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioNotasCreditos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioNotasCreditos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNotasCreditos() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				notascreditosImplementable= (NotasCreditosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NotasCreditosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				notascreditosImplementableHome= (NotasCreditosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NotasCreditosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.notascreditoss= new ArrayList<NotasCreditos>();
			this.notascreditossEliminados= new ArrayList<NotasCreditos>();
						
			this.isEsNuevoNotasCreditos=false;
			this.esParaAccionDesdeFormularioNotasCreditos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNotasCreditos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNotasCreditos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NotasCreditosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NotasCreditosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNotasCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNotasCreditos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNotasCreditos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNotasCreditos();
			}
			
			NotasCreditosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNotasCreditos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNotasCreditos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNotasCreditos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNotasCreditos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NotasCreditos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNotasCreditos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNotasCreditos")) {
				iIndex=this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNotasCreditos();	
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
	
	public void cargarCombosForeignKeyNotasCreditos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNotasCreditos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNotasCreditos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNotasCreditosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNotasCreditos();
		
		this.cargarCombosFrameForeignKeyNotasCreditos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNotasCreditos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNotasCreditos();
		}
	}
	
	
	
	public void jButtonNuevoNotasCreditosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.notascreditosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
			
			if(jTableDatosNotasCreditos.getRowCount()>=1) {
				jTableDatosNotasCreditos.removeRowSelectionInterval(0, jTableDatosNotasCreditos.getRowCount()-1);						
			}
			
			this.isEsNuevoNotasCreditos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNotasCreditos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNotasCreditos(true);			
			//this.notascreditos=new NotasCreditos();
			//this.notascreditos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNotasCreditos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNotasCreditos() ;
			
			if(NotasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNotasCreditos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.notascreditos);	
			this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);				
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
			if(this.notascreditosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NotasCreditos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNotasCreditosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNotasCreditos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNotasCreditos.getSelectedRows().length;			
			}
			
			notascreditossSeleccionados=this.getNotasCreditossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNotasCreditos--;			
				//NotasCreditos notascreditosAux= new NotasCreditos();			
				//notascreditosAux.setId(this.iIdNuevoNotasCreditos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NotasCreditos notascreditosOrigen=new NotasCreditos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NotasCreditos notascreditosOrigen : notascreditossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							notascreditosOrigen =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							notascreditosOrigen =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNotasCreditos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.notascreditos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNotasCreditos(notascreditosOrigen,this.notascreditos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.notascreditosLogic.getNotasCreditoss().add(this.notascreditosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.notascreditoss.add(this.notascreditosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNotasCreditos(false);
				
				this.jTableDatosNotasCreditos.setRowSelectionInterval(this.getIndiceNuevoNotasCreditos(), this.getIndiceNuevoNotasCreditos());
				
				int iLastRow =  this.jTableDatosNotasCreditos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNotasCreditos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNotasCreditos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNotasCreditos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();									
		
			NotasCreditos notascreditosOrigen=new NotasCreditos();
			NotasCreditos notascreditosDestino=new NotasCreditos();
				
			notascreditossSeleccionados=this.getNotasCreditossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNotasCreditos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || notascreditossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNotasCreditos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						notascreditosOrigen =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						notascreditosOrigen =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						notascreditosDestino =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						notascreditosDestino =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				notascreditosOrigen =notascreditossSeleccionados.get(0);
				notascreditosDestino =notascreditossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNotasCreditos(notascreditosOrigen,notascreditosDestino,true,false);
				
				notascreditosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(notascreditosDestino,notascreditosLogic.getNotasCreditoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(notascreditosDestino,notascreditoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNotasCreditos(false);
				
				//this.jTableDatosNotasCreditos.setRowSelectionInterval(this.getIndiceNuevoNotasCreditos(), this.getIndiceNuevoNotasCreditos());
				
				int iLastRow =  this.jTableDatosNotasCreditos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNotasCreditos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNotasCreditos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNotasCreditos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNotasCreditos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNotasCreditos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNotasCreditos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNotasCreditos.setVisible(!isVisible);
			this.jPanelPaginacionNotasCreditos.setVisible(!isVisible);
			this.jPanelAccionesNotasCreditos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNotasCreditos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNotasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNotasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNotasCreditos();
			
			this.abrirFrameOrderByNotasCreditos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNotasCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNotasCreditos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNotasCreditos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNotasCreditos.isMaximum()) {
					this.jInternalFrameDetalleFormNotasCreditos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNotasCreditos.setSize(this.jInternalFrameDetalleFormNotasCreditos.iWidthFormulario,this.jInternalFrameDetalleFormNotasCreditos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNotasCreditos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNotasCreditos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNotasCreditos.isMaximum()) {
						this.jInternalFrameDetalleFormNotasCreditos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNotasCreditos.jContentPaneDetalleNotasCreditos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNotasCreditos.jContentPaneDetalleNotasCreditos.getWidth(),NotasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNotasCreditos.jContentPaneDetalleNotasCreditos.getWidth(),NotasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNotasCreditos.jContentPaneDetalleNotasCreditos.getWidth(),NotasCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNotasCreditos.setVisible(true);
	        this.jInternalFrameDetalleFormNotasCreditos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNotasCreditos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNotasCreditos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNotasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotasCreditos,false,this);
				} else {
					this.jInternalFrameOrderByNotasCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNotasCreditos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNotasCreditos);
				this.jInternalFrameOrderByNotasCreditos.setVisible(false);
				this.jInternalFrameOrderByNotasCreditos.setSelected(false);
				
				this.jInternalFrameOrderByNotasCreditos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNotasCreditos"));
				
				this.inicializarActualizarBindingTablaOrderByNotasCreditos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNotasCreditos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNotasCreditos==null) {
				
				this.jInternalFrameImportacionNotasCreditos=new ImportacionJInternalFrame(NotasCreditosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNotasCreditos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNotasCreditos);
				this.jInternalFrameImportacionNotasCreditos.setVisible(false);
				this.jInternalFrameImportacionNotasCreditos.setSelected(false);


				this.jInternalFrameImportacionNotasCreditos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNotasCreditos"));
				this.jInternalFrameImportacionNotasCreditos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNotasCreditos"));
				this.jInternalFrameImportacionNotasCreditos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNotasCreditos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNotasCreditos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNotasCreditos==null) {
				this.jInternalFrameReporteDinamicoNotasCreditos=new ReporteDinamicoJInternalFrame(NotasCreditosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNotasCreditos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNotasCreditos);
				this.jInternalFrameReporteDinamicoNotasCreditos.setVisible(false);
				this.jInternalFrameReporteDinamicoNotasCreditos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNotasCreditos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNotasCreditos"));
				this.jInternalFrameReporteDinamicoNotasCreditos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNotasCreditos"));
				this.jInternalFrameReporteDinamicoNotasCreditos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNotasCreditos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNotasCreditos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleNotasCreditos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNotasCreditos);
			
	       	this.jInternalFrameDetalleFormNotasCreditos.setVisible(false);
	        this.jInternalFrameDetalleFormNotasCreditos.setSelected(false);
			
			//this.jInternalFrameDetalleFormNotasCreditos.dispose();
			//this.jInternalFrameDetalleFormNotasCreditos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNotasCreditos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNotasCreditos.setVisible(true);
	        this.jInternalFrameReporteDinamicoNotasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNotasCreditos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNotasCreditos.setVisible(true);
	        this.jInternalFrameImportacionNotasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNotasCreditos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNotasCreditos.setVisible(true);
	        this.jInternalFrameOrderByNotasCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNotasCreditos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNotasCreditos.setVisible(false);
	        this.jInternalFrameOrderByNotasCreditos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNotasCreditos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNotasCreditos.setVisible(false);
	        this.jInternalFrameReporteDinamicoNotasCreditos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNotasCreditos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNotasCreditos.setVisible(false);
	        this.jInternalFrameImportacionNotasCreditos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNotasCreditos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNotasCreditos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNotasCreditos(true);
			//this.isEsNuevoNotasCreditos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNotasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNotasCreditos(false) ;
			
			if(notascreditosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(NotasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNotasCreditos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNotasCreditos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNotasCreditosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNotasCreditos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNotasCreditos(true);
			//this.isEsNuevoNotasCreditos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.notascreditos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNotasCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNotasCreditos(false) ;
			
			if(NotasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNotasCreditos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNotasCreditos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNotasCreditos(false);
			
			//if(!this.isEsNuevoNotasCreditos) {								
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				
			}
			
			if(this.permiteMantenimiento(this.notascreditos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNotasCreditos=true;
					this.inicializarActualizarBindingTablaNotasCreditos(false);
					this.isEsNuevoNotasCreditos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNotasCreditos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNotasCreditos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNotasCreditos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNotasCreditos(false);
				
				this.habilitarDeshabilitarControlesNotasCreditos(false);
			
												
				
				if(NotasCreditosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNotasCreditos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNotasCreditosActionPerformed(evt,notascreditosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNotasCreditos(this.notascreditos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNotasCreditos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,notascreditosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.notascreditos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNotasCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				this.notascreditos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				this.notascreditos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.notascreditos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NotasCreditosModel) this.jTableDatosNotasCreditos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNotasCreditos=true;
				this.inicializarActualizarBindingTablaNotasCreditos(false);
				this.isEsNuevoNotasCreditos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNotasCreditos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNotasCreditos(false);
				
				this.habilitarDeshabilitarControlesNotasCreditos(false);
				
				
				
				if(NotasCreditosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNotasCreditos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNotasCreditosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNotasCreditos.getRowCount()>=1) {
				jTableDatosNotasCreditos.removeRowSelectionInterval(0, jTableDatosNotasCreditos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNotasCreditos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNotasCreditos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNotasCreditos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNotasCreditos(false) ;
			
			this.isEsNuevoNotasCreditos=false;
			
			if(NotasCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNotasCreditos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNotasCreditos(false);
				
				//SI ES MANUAL
				if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNotasCreditos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNotasCreditos--;			
			//NotasCreditos notascreditosAux= new NotasCreditos();			
			//notascreditosAux.setId(this.iIdNuevoNotasCreditos);
			
			if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNotasCreditos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
			
			this.notascreditos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.notascreditosLogic.getNotasCreditoss().add(this.notascreditosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.notascreditoss.add(this.notascreditosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNotasCreditos(false);
			
			this.jTableDatosNotasCreditos.setRowSelectionInterval(this.getIndiceNuevoNotasCreditos(), this.getIndiceNuevoNotasCreditos());
			
			int iLastRow =  this.jTableDatosNotasCreditos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNotasCreditos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNotasCreditos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNotasCreditos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNotasCreditos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNotasCreditos(false);
			
			//SI ES MANUAL
			if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNotasCreditos();
			}
			
			//this.abrirFrameTreeNotasCreditos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNotasCreditos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNotasCreditos.setFileImportacion(this.jInternalFrameImportacionNotasCreditos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNotasCreditos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNotasCreditos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNotasCreditos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNotasCreditos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		

		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NotasCreditosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NotasCreditosBaseDesign.jrxml";
			
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
			
			this.generarReporteNotasCreditoss("Todos",notascreditossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpresoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpresoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpresoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpresoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuentoValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuentoValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuentoValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuentoValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_OTROVALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_roValor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_roValor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_roValor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_roValor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEstadoNotaCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEstadoNotaCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEstadoNotaCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEstadoNotaCredito_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNotasCreditos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoria="numero_pre_impreso_factura";
					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case NotasCreditosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR:
					sNombreCampoCategoria="descuento_valor";
					break;

				case NotasCreditosConstantesFunciones.LABEL_OTROVALOR:
					sNombreCampoCategoria="otro_valor";
					break;

				case NotasCreditosConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="sub_total";
					break;

				case NotasCreditosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO:
					sNombreCampoCategoria="nombre_estado_nota_credito";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoriaValor="numero_pre_impreso_factura";
					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case NotasCreditosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR:
					sNombreCampoCategoriaValor="descuento_valor";
					break;

				case NotasCreditosConstantesFunciones.LABEL_OTROVALOR:
					sNombreCampoCategoriaValor="otro_valor";
					break;

				case NotasCreditosConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="sub_total";
					break;

				case NotasCreditosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO:
					sNombreCampoCategoriaValor="nombre_estado_nota_credito";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso_factura");
					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case NotasCreditosConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento_valor");
					break;

				case NotasCreditosConstantesFunciones.LABEL_OTROVALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Otro Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"otro_valor");
					break;

				case NotasCreditosConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sub Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sub_total");
					break;

				case NotasCreditosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Estado Nota Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_estado_nota_credito");
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
	
	public void jButtonGenerarExcelReporteDinamicoNotasCreditosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"notascreditos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NotasCreditoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NotasCreditosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getnumero_pre_impreso_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_IVA);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getdescuento_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_OTROVALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_OTROVALOR);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getotro_valor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getsub_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO);
					iRow++;

					for(NotasCreditos notascreditos:notascreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(notascreditos.getnombre_estado_nota_credito());
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
			//	this.getFilaCabeceraExportarExcelNotasCreditos(row);				
			//	iRow++;
			//}				
			
			//for(NotasCreditos notascreditosAux:notascreditossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNotasCreditos(notascreditosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
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
				this.notascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNotasCreditos(false);
			
			//SI ES MANUAL
			if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNotasCreditos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNotasCreditos(false);
			
			//SI ES MANUAL
			if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNotasCreditos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNotasCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNotasCreditos(false);
			
			//SI ES MANUAL
			if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNotasCreditos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNotasCreditos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNotasCreditos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNotasCreditos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNotasCreditos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNotasCreditos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNotasCreditos.setMinimumSize(dimensionMinimum);
		this.jTableDatosNotasCreditos.setMaximumSize(dimensionMaximum);
		this.jTableDatosNotasCreditos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNotasCreditos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNotasCreditos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNotasCreditos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNotasCreditos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNotasCreditos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNotasCreditos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNotasCreditos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNotasCreditos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNotasCreditos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNotasCreditos();
		
		this.inicializarActualizarBindingBotonesManualNotasCreditos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNotasCreditos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNotasCreditos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNotasCreditos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNotasCreditos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNotasCreditos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNotasCreditos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNotasCreditos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNotasCreditos.jCheckBoxPostAccionNuevoNotasCreditos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNotasCreditos.jCheckBoxPostAccionSinCerrarNotasCreditos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNotasCreditos.jCheckBoxPostAccionSinMensajeNotasCreditos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNotasCreditos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNotasCreditos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNotasCreditos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
				this.jInternalFrameDetalleFormNotasCreditos.jCheckBoxPostAccionNuevoNotasCreditos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNotasCreditos.jCheckBoxPostAccionSinCerrarNotasCreditos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNotasCreditos.jCheckBoxPostAccionSinMensajeNotasCreditos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNotasCreditos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNotasCreditos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNotasCreditos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNotasCreditos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNotasCreditos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNotasCreditos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNotasCreditos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNotasCreditos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNotasCreditos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNotasCreditos(Boolean esInicializar) throws Exception {
		try	{	
			if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNotasCreditos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNotasCreditos() throws Exception {
		try	{
			if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNotasCreditos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNotasCreditos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNotasCreditos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNotasCreditos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNotasCreditos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNotasCreditos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNotasCreditos.addItem(reporte);
			}
			
			
			if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNotasCreditos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNotasCreditos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNotasCreditos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNotasCreditos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNotasCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNotasCreditos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNotasCreditos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNotasCreditos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNotasCreditos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
				this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
				this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
				
				if(this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNotasCreditos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNotasCreditos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNotasCreditos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=NotasCreditosConstantesFunciones.getTiposSeleccionarNotasCreditos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=NotasCreditosConstantesFunciones.getTiposSeleccionarNotasCreditos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=NotasCreditosConstantesFunciones.getTiposSeleccionarNotasCreditos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNotasCreditos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoNotasCreditos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNotasCreditos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaNotasCreditos=new Date(this.jDateChooserfecha_emision_desdeBusquedaNotasCreditosNotasCreditos.getDate().getTime());
		this.fecha_emision_hastaBusquedaNotasCreditos=new Date(this.jDateChooserfecha_emision_hastaBusquedaNotasCreditosNotasCreditos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNotasCreditos(Boolean esInicializar) throws Exception {				
		if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNotasCreditos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNotasCreditos() throws Exception {
		this.inicializarActualizarBindingTablaNotasCreditos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNotasCreditos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNotasCreditosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNotasCreditos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=notascreditosLogic.getNotasCreditoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=notascreditoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNotasCreditos.setModel(new NotasCreditosModel(this.notascreditosLogic.getNotasCreditoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNotasCreditos.setModel(new NotasCreditosModel(this.notascreditoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNotasCreditos!=null && this.jInternalFrameOrderByNotasCreditos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNotasCreditos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO,notascreditosConstantesFunciones.resaltarSeleccionarNotasCreditos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO,notascreditosConstantesFunciones.resaltarSeleccionarNotasCreditos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_ID));

		if(this.notascreditosConstantesFunciones.mostraridNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.notascreditosConstantesFunciones.resaltaridNotasCreditos,this.notascreditosConstantesFunciones.activaridNotasCreditos,iSizeTabla,this,true,"idNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltaridNotasCreditos,this.notascreditosConstantesFunciones.activaridNotasCreditos,this,true,"idNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.notascreditosConstantesFunciones.mostrarnombre_completo_clienteNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.notascreditosConstantesFunciones.resaltarnombre_completo_clienteNotasCreditos,this.notascreditosConstantesFunciones.activarnombre_completo_clienteNotasCreditos,iSizeTabla,this,true,"nombre_completo_clienteNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltarnombre_completo_clienteNotasCreditos,this.notascreditosConstantesFunciones.activarnombre_completo_clienteNotasCreditos,this,true,"nombre_completo_clienteNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA));

		if(this.notascreditosConstantesFunciones.mostrarnumero_pre_impreso_facturaNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.notascreditosConstantesFunciones.resaltarnumero_pre_impreso_facturaNotasCreditos,this.notascreditosConstantesFunciones.activarnumero_pre_impreso_facturaNotasCreditos,iSizeTabla,this,true,"numero_pre_impreso_facturaNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltarnumero_pre_impreso_facturaNotasCreditos,this.notascreditosConstantesFunciones.activarnumero_pre_impreso_facturaNotasCreditos,this,true,"numero_pre_impreso_facturaNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.notascreditosConstantesFunciones.mostrarnumero_pre_impresoNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.notascreditosConstantesFunciones.resaltarnumero_pre_impresoNotasCreditos,this.notascreditosConstantesFunciones.activarnumero_pre_impresoNotasCreditos,iSizeTabla,this,true,"numero_pre_impresoNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltarnumero_pre_impresoNotasCreditos,this.notascreditosConstantesFunciones.activarnumero_pre_impresoNotasCreditos,this,true,"numero_pre_impresoNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.notascreditosConstantesFunciones.mostrarfecha_emisionNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.notascreditosConstantesFunciones.resaltarfecha_emisionNotasCreditos,this.notascreditosConstantesFunciones.activarfecha_emisionNotasCreditos,iSizeTabla,this,true,"fecha_emisionNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.notascreditosConstantesFunciones.resaltarfecha_emisionNotasCreditos,this.notascreditosConstantesFunciones.activarfecha_emisionNotasCreditos,this,true,"fecha_emisionNotasCreditos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.notascreditosConstantesFunciones.mostrarfecha_vencimientoNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.notascreditosConstantesFunciones.resaltarfecha_vencimientoNotasCreditos,this.notascreditosConstantesFunciones.activarfecha_vencimientoNotasCreditos,iSizeTabla,this,true,"fecha_vencimientoNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.notascreditosConstantesFunciones.resaltarfecha_vencimientoNotasCreditos,this.notascreditosConstantesFunciones.activarfecha_vencimientoNotasCreditos,this,true,"fecha_vencimientoNotasCreditos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_IVA));

		if(this.notascreditosConstantesFunciones.mostrarivaNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.notascreditosConstantesFunciones.resaltarivaNotasCreditos,this.notascreditosConstantesFunciones.activarivaNotasCreditos,iSizeTabla,this,true,"ivaNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltarivaNotasCreditos,this.notascreditosConstantesFunciones.activarivaNotasCreditos,this,true,"ivaNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR));

		if(this.notascreditosConstantesFunciones.mostrardescuento_valorNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.notascreditosConstantesFunciones.resaltardescuento_valorNotasCreditos,this.notascreditosConstantesFunciones.activardescuento_valorNotasCreditos,iSizeTabla,this,true,"descuento_valorNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltardescuento_valorNotasCreditos,this.notascreditosConstantesFunciones.activardescuento_valorNotasCreditos,this,true,"descuento_valorNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_OTROVALOR));

		if(this.notascreditosConstantesFunciones.mostrarotro_valorNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_OTROVALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.notascreditosConstantesFunciones.resaltarotro_valorNotasCreditos,this.notascreditosConstantesFunciones.activarotro_valorNotasCreditos,iSizeTabla,this,true,"otro_valorNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltarotro_valorNotasCreditos,this.notascreditosConstantesFunciones.activarotro_valorNotasCreditos,this,true,"otro_valorNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_SUBTOTAL));

		if(this.notascreditosConstantesFunciones.mostrarsub_totalNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.notascreditosConstantesFunciones.resaltarsub_totalNotasCreditos,this.notascreditosConstantesFunciones.activarsub_totalNotasCreditos,iSizeTabla,this,true,"sub_totalNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltarsub_totalNotasCreditos,this.notascreditosConstantesFunciones.activarsub_totalNotasCreditos,this,true,"sub_totalNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_TOTAL));

		if(this.notascreditosConstantesFunciones.mostrartotalNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.notascreditosConstantesFunciones.resaltartotalNotasCreditos,this.notascreditosConstantesFunciones.activartotalNotasCreditos,iSizeTabla,this,true,"totalNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltartotalNotasCreditos,this.notascreditosConstantesFunciones.activartotalNotasCreditos,this,true,"totalNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO));

		if(this.notascreditosConstantesFunciones.mostrarnombre_estado_nota_creditoNotasCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.notascreditosConstantesFunciones.resaltarnombre_estado_nota_creditoNotasCreditos,this.notascreditosConstantesFunciones.activarnombre_estado_nota_creditoNotasCreditos,iSizeTabla,this,true,"nombre_estado_nota_creditoNotasCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.notascreditosConstantesFunciones.resaltarnombre_estado_nota_creditoNotasCreditos,this.notascreditosConstantesFunciones.activarnombre_estado_nota_creditoNotasCreditos,this,true,"nombre_estado_nota_creditoNotasCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NotasCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.notascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.notascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNotasCreditos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.notascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.notascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNotasCreditos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.notascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.notascreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNotasCreditos.addColumn(tableColumn);
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
			
			this.jTableDatosNotasCreditos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNotasCreditos.moveColumn(this.jTableDatosNotasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNotasCreditos.moveColumn(this.jTableDatosNotasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNotasCreditos.moveColumn(this.jTableDatosNotasCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNotasCreditos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNotasCreditos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNotasCreditos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNotasCreditos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNotasCreditos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNotasCreditos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNotasCreditos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNotasCreditos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=notascreditosLogic.getNotasCreditoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=notascreditoss.size()-1;
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
		//this.jTableDatosNotasCreditos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNotasCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNotasCreditos();
			
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
				
				//this.isEsNuevoNotasCreditos=false;
					
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
				if(this.notascreditosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNotasCreditos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNotasCreditos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNotasCreditos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.notascreditos.getsType().equals("DUPLICADO")
				   || this.notascreditos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNotasCreditos=true;
				
				} else {
					this.isEsNuevoNotasCreditos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
					if(this.notascreditos.getId()>=0 && !this.notascreditos.getIsNew()) {						
						this.isEsNuevoNotasCreditos=false;
						
					} else {
						this.isEsNuevoNotasCreditos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNotasCreditos(esRelaciones);						
				
				this.seleccionarNotasCreditos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.notascreditos.getId()<0) {
					this.isEsNuevoNotasCreditos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNotasCreditos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNotasCreditos(evt,rowIndex);
				}	
				
				if(this.notascreditosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NotasCreditos: " + this.dDif); 
					}
				}								
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNotasCreditos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.notascreditos)) {
					if(this.notascreditos.getId()>0) {
						this.notascreditos.setIsDeleted(true);
						
						this.notascreditossEliminados.add(this.notascreditos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.notascreditosLogic.getNotasCreditoss().remove(this.notascreditos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.notascreditoss.remove(this.notascreditos);				
					}
					
					
					((NotasCreditosModel) this.jTableDatosNotasCreditos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNotasCreditos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNotasCreditos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNotasCreditos) {
			
			if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNotasCreditos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNotasCreditos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNotasCreditos(this.notascreditos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNotasCreditos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNotasCreditos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNotasCreditos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNotasCreditos(NotasCreditos notascreditos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNotasCreditos(notascreditos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNotasCreditos(NotasCreditos notascreditos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNotasCreditos(notascreditos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNotasCreditos(notascreditos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNotasCreditos(notascreditos);
	}
	
	public void setVariablesObjetoActualToFormularioNotasCreditos(NotasCreditos notascreditos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.setText(notascreditos.getId().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_completo_clienteNotasCreditos.setText(notascreditos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impreso_facturaNotasCreditos.setText(notascreditos.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impresoNotasCreditos.setText(notascreditos.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emisionNotasCreditos.setDate(notascreditos.getfecha_emision());
			this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_vencimientoNotasCreditos.setDate(notascreditos.getfecha_vencimiento());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldivaNotasCreditos.setText(notascreditos.getiva().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFielddescuento_valorNotasCreditos.setText(notascreditos.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldotro_valorNotasCreditos.setText(notascreditos.getotro_valor().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldsub_totalNotasCreditos.setText(notascreditos.getsub_total().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldtotalNotasCreditos.setText(notascreditos.gettotal().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_estado_nota_creditoNotasCreditos.setText(notascreditos.getnombre_estado_nota_credito());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NotasCreditos notascreditosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,notascreditosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NotasCreditos notascreditosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				notascreditosLocal=this.notascreditos;
			} else {
				notascreditosLocal=this.notascreditosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(notascreditosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNotasCreditos(notascreditosLocal,true);
					
					if(notascreditosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(notascreditosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.notascreditosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(notascreditosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNotasCreditos(NotasCreditos notascreditos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNotasCreditos(notascreditos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(notascreditos);
	}
	
	public void setVariablesFormularioToObjetoActualNotasCreditos(NotasCreditos notascreditos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNotasCreditos(notascreditos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNotasCreditos(NotasCreditos notascreditos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.getText()==null || this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.getText()=="" || this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.getText()=="Id") {
				this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.setText("0");
			}

			if(conColumnasBase) {notascreditos.setId(Long.parseLong(this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelIdNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setnombre_completo_cliente(this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_completo_clienteNotasCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelnombre_completo_clienteNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setnumero_pre_impreso_factura(this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impreso_facturaNotasCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelnumero_pre_impreso_facturaNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setnumero_pre_impreso(this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impresoNotasCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelnumero_pre_impresoNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setfecha_emision(this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emisionNotasCreditos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelfecha_emisionNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setfecha_vencimiento(this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_vencimientoNotasCreditos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelfecha_vencimientoNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setiva(Double.parseDouble(this.jInternalFrameDetalleFormNotasCreditos.jTextFieldivaNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelivaNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setdescuento_valor(Double.parseDouble(this.jInternalFrameDetalleFormNotasCreditos.jTextFielddescuento_valorNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabeldescuento_valorNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setotro_valor(Double.parseDouble(this.jInternalFrameDetalleFormNotasCreditos.jTextFieldotro_valorNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_OTROVALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelotro_valorNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setsub_total(Double.parseDouble(this.jInternalFrameDetalleFormNotasCreditos.jTextFieldsub_totalNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelsub_totalNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormNotasCreditos.jTextFieldtotalNotasCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabeltotalNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			notascreditos.setnombre_estado_nota_credito(this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_estado_nota_creditoNotasCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNotasCreditos.jLabelnombre_estado_nota_creditoNotasCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNotasCreditos(NotasCreditos notascreditosBean,NotasCreditos notascreditos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNotasCreditos(NotasCreditos notascreditosOrigen,NotasCreditos notascreditos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && notascreditosOrigen.getId()!=null && !notascreditosOrigen.getId().equals(0L))) {notascreditos.setId(notascreditosOrigen.getId());}}
			if(conDefault || (!conDefault && notascreditosOrigen.getfecha_emision_desde()!=null && !notascreditosOrigen.getfecha_emision_desde().equals(new Date()))) {notascreditos.setfecha_emision_desde(notascreditosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && notascreditosOrigen.getfecha_emision_hasta()!=null && !notascreditosOrigen.getfecha_emision_hasta().equals(new Date()))) {notascreditos.setfecha_emision_hasta(notascreditosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && notascreditosOrigen.getnombre_completo_cliente()!=null && !notascreditosOrigen.getnombre_completo_cliente().equals(""))) {notascreditos.setnombre_completo_cliente(notascreditosOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && notascreditosOrigen.getnumero_pre_impreso_factura()!=null && !notascreditosOrigen.getnumero_pre_impreso_factura().equals(""))) {notascreditos.setnumero_pre_impreso_factura(notascreditosOrigen.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && notascreditosOrigen.getnumero_pre_impreso()!=null && !notascreditosOrigen.getnumero_pre_impreso().equals(""))) {notascreditos.setnumero_pre_impreso(notascreditosOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && notascreditosOrigen.getfecha_emision()!=null && !notascreditosOrigen.getfecha_emision().equals(new Date()))) {notascreditos.setfecha_emision(notascreditosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && notascreditosOrigen.getfecha_vencimiento()!=null && !notascreditosOrigen.getfecha_vencimiento().equals(new Date()))) {notascreditos.setfecha_vencimiento(notascreditosOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && notascreditosOrigen.getiva()!=null && !notascreditosOrigen.getiva().equals(0.0))) {notascreditos.setiva(notascreditosOrigen.getiva());}
			if(conDefault || (!conDefault && notascreditosOrigen.getdescuento_valor()!=null && !notascreditosOrigen.getdescuento_valor().equals(0.0))) {notascreditos.setdescuento_valor(notascreditosOrigen.getdescuento_valor());}
			if(conDefault || (!conDefault && notascreditosOrigen.getotro_valor()!=null && !notascreditosOrigen.getotro_valor().equals(0.0))) {notascreditos.setotro_valor(notascreditosOrigen.getotro_valor());}
			if(conDefault || (!conDefault && notascreditosOrigen.getsub_total()!=null && !notascreditosOrigen.getsub_total().equals(0.0))) {notascreditos.setsub_total(notascreditosOrigen.getsub_total());}
			if(conDefault || (!conDefault && notascreditosOrigen.gettotal()!=null && !notascreditosOrigen.gettotal().equals(0.0))) {notascreditos.settotal(notascreditosOrigen.gettotal());}
			if(conDefault || (!conDefault && notascreditosOrigen.getnombre_estado_nota_credito()!=null && !notascreditosOrigen.getnombre_estado_nota_credito().equals(""))) {notascreditos.setnombre_estado_nota_credito(notascreditosOrigen.getnombre_estado_nota_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNotasCreditos(NotasCreditos notascreditos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.setText(notascreditos.getId().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_completo_clienteNotasCreditos.setText(notascreditos.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impreso_facturaNotasCreditos.setText(notascreditos.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impresoNotasCreditos.setText(notascreditos.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emisionNotasCreditos.setDate(notascreditos.getfecha_emision());
			this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_vencimientoNotasCreditos.setDate(notascreditos.getfecha_vencimiento());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldivaNotasCreditos.setText(notascreditos.getiva().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFielddescuento_valorNotasCreditos.setText(notascreditos.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldotro_valorNotasCreditos.setText(notascreditos.getotro_valor().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldsub_totalNotasCreditos.setText(notascreditos.getsub_total().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldtotalNotasCreditos.setText(notascreditos.gettotal().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_estado_nota_creditoNotasCreditos.setText(notascreditos.getnombre_estado_nota_credito());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNotasCreditos(NotasCreditosBean notascreditosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.setText(notascreditosBean.getId().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_completo_clienteNotasCreditos.setText(notascreditosBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impreso_facturaNotasCreditos.setText(notascreditosBean.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impresoNotasCreditos.setText(notascreditosBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emisionNotasCreditos.setDate(notascreditosBean.getfecha_emision());
			this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_vencimientoNotasCreditos.setDate(notascreditosBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldivaNotasCreditos.setText(notascreditosBean.getiva().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFielddescuento_valorNotasCreditos.setText(notascreditosBean.getdescuento_valor().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldotro_valorNotasCreditos.setText(notascreditosBean.getotro_valor().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldsub_totalNotasCreditos.setText(notascreditosBean.getsub_total().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextFieldtotalNotasCreditos.setText(notascreditosBean.gettotal().toString());
			this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_estado_nota_creditoNotasCreditos.setText(notascreditosBean.getnombre_estado_nota_credito());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNotasCreditos(NotasCreditosParameterReturnGeneral notascreditosReturnGeneral,NotasCreditosBean notascreditosBean,Boolean conDefault) throws Exception { 
		try {
			NotasCreditos notascreditosLocal=new NotasCreditos();
			
			notascreditosLocal=notascreditosReturnGeneral.getNotasCreditos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && notascreditosLocal.getId()!=null && !notascreditosLocal.getId().equals(0L))) {notascreditosBean.setId(notascreditosLocal.getId());}}
			if(conDefault || (!conDefault && notascreditosLocal.getnombre_completo_cliente()!=null && !notascreditosLocal.getnombre_completo_cliente().equals(""))) {notascreditosBean.setnombre_completo_cliente(notascreditosLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && notascreditosLocal.getnumero_pre_impreso_factura()!=null && !notascreditosLocal.getnumero_pre_impreso_factura().equals(""))) {notascreditosBean.setnumero_pre_impreso_factura(notascreditosLocal.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && notascreditosLocal.getnumero_pre_impreso()!=null && !notascreditosLocal.getnumero_pre_impreso().equals(""))) {notascreditosBean.setnumero_pre_impreso(notascreditosLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && notascreditosLocal.getfecha_emision()!=null && !notascreditosLocal.getfecha_emision().equals(new Date()))) {notascreditosBean.setfecha_emision(notascreditosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && notascreditosLocal.getfecha_vencimiento()!=null && !notascreditosLocal.getfecha_vencimiento().equals(new Date()))) {notascreditosBean.setfecha_vencimiento(notascreditosLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && notascreditosLocal.getiva()!=null && !notascreditosLocal.getiva().equals(0.0))) {notascreditosBean.setiva(notascreditosLocal.getiva());}
			if(conDefault || (!conDefault && notascreditosLocal.getdescuento_valor()!=null && !notascreditosLocal.getdescuento_valor().equals(0.0))) {notascreditosBean.setdescuento_valor(notascreditosLocal.getdescuento_valor());}
			if(conDefault || (!conDefault && notascreditosLocal.getotro_valor()!=null && !notascreditosLocal.getotro_valor().equals(0.0))) {notascreditosBean.setotro_valor(notascreditosLocal.getotro_valor());}
			if(conDefault || (!conDefault && notascreditosLocal.getsub_total()!=null && !notascreditosLocal.getsub_total().equals(0.0))) {notascreditosBean.setsub_total(notascreditosLocal.getsub_total());}
			if(conDefault || (!conDefault && notascreditosLocal.gettotal()!=null && !notascreditosLocal.gettotal().equals(0.0))) {notascreditosBean.settotal(notascreditosLocal.gettotal());}
			if(conDefault || (!conDefault && notascreditosLocal.getnombre_estado_nota_credito()!=null && !notascreditosLocal.getnombre_estado_nota_credito().equals(""))) {notascreditosBean.setnombre_estado_nota_credito(notascreditosLocal.getnombre_estado_nota_credito());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNotasCreditosGenerico(Long idNotasCreditosSeleccionado,JComboBox jComboBoxNotasCreditos,List<NotasCreditos> notascreditossLocal)throws Exception {
		try {
			NotasCreditos  notascreditosTemp=null;

			for(NotasCreditos notascreditosAux:notascreditossLocal) {
				if(notascreditosAux.getId()!=null && notascreditosAux.getId().equals(idNotasCreditosSeleccionado)) {
					notascreditosTemp=notascreditosAux;
					break;
				}
			}

			jComboBoxNotasCreditos.setSelectedItem(notascreditosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNotasCreditosGenerico(JComboBox jComboBoxNotasCreditos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNotasCreditos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNotasCreditos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNotasCreditos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNotasCreditos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			notascreditos=(NotasCreditos) notascreditosLogic.getNotasCreditoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			notascreditos =(NotasCreditos) notascreditoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!notascreditos.getIsNew() && !notascreditos.getIsChanged() && !notascreditos.getIsDeleted()) {
				sDescripcion=notascreditos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=notascreditos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NotasCreditos notascreditosRow=new NotasCreditos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			notascreditosRow=(NotasCreditos) notascreditosLogic.getNotasCreditoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			notascreditosRow=(NotasCreditos) notascreditoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNotasCreditos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoNotasCreditos && this.isPermisoNuevoNotasCreditos));			
			this.jButtonDuplicarNotasCreditos.setVisible((this.isVisibilidadCeldaDuplicarNotasCreditos && this.isPermisoDuplicarNotasCreditos));			
			this.jButtonCopiarNotasCreditos.setVisible((this.isVisibilidadCeldaCopiarNotasCreditos && this.isPermisoCopiarNotasCreditos));
			this.jButtonVerFormNotasCreditos.setVisible((this.isVisibilidadCeldaVerFormNotasCreditos && this.isPermisoVerFormNotasCreditos));
			
			this.jButtonAbrirOrderByNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenNotasCreditos && this.isPermisoOrdenNotasCreditos));			
			
			this.jButtonNuevoRelacionesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesNotasCreditos && this.isPermisoNuevoNotasCreditos));			
			this.jButtonNuevoGuardarCambiosNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoNotasCreditos && this.isPermisoNuevoNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));
			
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarNotasCreditos.setVisible((this.isVisibilidadCeldaModificarNotasCreditos && this.isPermisoActualizarNotasCreditos));	
			this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarNotasCreditos.setVisible((this.isVisibilidadCeldaActualizarNotasCreditos && this.isPermisoActualizarNotasCreditos));	
			this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarNotasCreditos.setVisible((this.isVisibilidadCeldaEliminarNotasCreditos && this.isPermisoEliminarNotasCreditos));
			this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarNotasCreditos);							
			this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));			
			
			}
						
			this.jButtonGuardarCambiosTablaNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoNotasCreditos && this.isPermisoNuevoNotasCreditos));						
			this.jButtonDuplicarToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaDuplicarNotasCreditos && this.isPermisoDuplicarNotasCreditos));						
			this.jButtonCopiarToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaCopiarNotasCreditos && this.isPermisoCopiarNotasCreditos));			
			this.jButtonVerFormToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaVerFormNotasCreditos && this.isPermisoVerFormNotasCreditos));			
			this.jButtonAbrirOrderByToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenNotasCreditos && this.isPermisoOrdenNotasCreditos));
			this.jButtonNuevoRelacionesToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesNotasCreditos && this.isPermisoNuevoNotasCreditos));			
			this.jButtonNuevoGuardarCambiosToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoNotasCreditos && this.isPermisoNuevoNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));			
			
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaModificarNotasCreditos && this.isPermisoActualizarNotasCreditos));	
			this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaActualizarNotasCreditos  && this.isPermisoActualizarNotasCreditos));	
			this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaEliminarNotasCreditos && this.isPermisoEliminarNotasCreditos));
			this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarToolBarNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarNotasCreditos);				
			this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoNotasCreditos && this.isPermisoNuevoNotasCreditos));			
			this.jMenuItemDuplicarNotasCreditos.setVisible((this.isVisibilidadCeldaDuplicarNotasCreditos && this.isPermisoDuplicarNotasCreditos));			
			this.jMenuItemCopiarNotasCreditos.setVisible((this.isVisibilidadCeldaCopiarNotasCreditos && this.isPermisoCopiarNotasCreditos));			
			this.jMenuItemVerFormNotasCreditos.setVisible((this.isVisibilidadCeldaVerFormNotasCreditos && this.isPermisoVerFormNotasCreditos));			
			this.jMenuItemAbrirOrderByNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenNotasCreditos && this.isPermisoOrdenNotasCreditos));			
			//this.jMenuItemMostrarOcultarNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenNotasCreditos && this.isPermisoOrdenNotasCreditos));
			this.jMenuItemDetalleAbrirOrderByNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenNotasCreditos && this.isPermisoOrdenNotasCreditos));			
			//this.jMenuItemDetalleMostrarOcultarNotasCreditos.setVisible((this.isVisibilidadCeldaOrdenNotasCreditos && this.isPermisoOrdenNotasCreditos));			
			this.jMenuItemNuevoRelacionesNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesNotasCreditos && this.isPermisoNuevoNotasCreditos));			
			this.jMenuItemNuevoGuardarCambiosNotasCreditos.setVisible((this.isVisibilidadCeldaNuevoNotasCreditos && this.isPermisoNuevoNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));									
			
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemModificarNotasCreditos.setVisible((this.isVisibilidadCeldaModificarNotasCreditos && this.isPermisoActualizarNotasCreditos));	
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemActualizarNotasCreditos.setVisible((this.isVisibilidadCeldaActualizarNotasCreditos && this.isPermisoActualizarNotasCreditos));	
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemEliminarNotasCreditos.setVisible((this.isVisibilidadCeldaEliminarNotasCreditos && this.isPermisoEliminarNotasCreditos));
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemCancelarNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarNotasCreditos);				
			}
			
			this.jMenuItemGuardarCambiosNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));						
			this.jMenuItemGuardarCambiosTablaNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNotasCreditos=this.jButtonNuevoNotasCreditos.isVisible();
			this.isVisibilidadCeldaDuplicarNotasCreditos=this.jButtonDuplicarNotasCreditos.isVisible();
			this.isVisibilidadCeldaCopiarNotasCreditos=this.jButtonCopiarNotasCreditos.isVisible();
			this.isVisibilidadCeldaVerFormNotasCreditos=this.jButtonVerFormNotasCreditos.isVisible();
			
			this.isVisibilidadCeldaOrdenNotasCreditos=this.jButtonAbrirOrderByNotasCreditos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=this.jButtonNuevoRelacionesNotasCreditos.isVisible();
			this.isVisibilidadCeldaModificarNotasCreditos=this.jButtonModificarNotasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			this.isVisibilidadCeldaActualizarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarNotasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarNotasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarNotasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosNotasCreditos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=this.jButtonGuardarCambiosTablaNotasCreditos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNotasCreditos=this.jButtonNuevoToolBarNotasCreditos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=this.jButtonNuevoRelacionesToolBarNotasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			this.isVisibilidadCeldaModificarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarToolBarNotasCreditos.isVisible();
			this.isVisibilidadCeldaActualizarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarToolBarNotasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarToolBarNotasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarToolBarNotasCreditos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNotasCreditos=this.jButtonGuardarCambiosToolBarNotasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=this.jButtonGuardarCambiosTablaToolBarNotasCreditos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNotasCreditos=this.jMenuItemNuevoNotasCreditos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=this.jMenuItemNuevoRelacionesNotasCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			this.isVisibilidadCeldaModificarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jMenuItemModificarNotasCreditos.isVisible();
			this.isVisibilidadCeldaActualizarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jMenuItemActualizarNotasCreditos.isVisible();
			this.isVisibilidadCeldaEliminarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jMenuItemEliminarNotasCreditos.isVisible();
			this.isVisibilidadCeldaCancelarNotasCreditos=this.jInternalFrameDetalleFormNotasCreditos.jMenuItemCancelarNotasCreditos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNotasCreditos=this.jMenuItemGuardarCambiosNotasCreditos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=this.jMenuItemGuardarCambiosTablaNotasCreditos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNotasCreditos(Boolean esInicializar) {
		if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.notascreditosSessionBean.getConGuardarRelaciones()) {
				//if(this.notascreditosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNotasCreditos();
			}
			
			this.inicializarActualizarBindingBotonesManualNotasCreditos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNotasCreditos() {
		this.jButtonNuevoNotasCreditos.setVisible(this.isPermisoNuevoNotasCreditos);			
		this.jButtonDuplicarNotasCreditos.setVisible(this.isPermisoDuplicarNotasCreditos);			
		this.jButtonCopiarNotasCreditos.setVisible(this.isPermisoCopiarNotasCreditos);			
		this.jButtonVerFormNotasCreditos.setVisible(this.isPermisoVerFormNotasCreditos);			
		
		this.jButtonAbrirOrderByNotasCreditos.setVisible(this.isPermisoOrdenNotasCreditos);					
		
		this.jButtonNuevoRelacionesNotasCreditos.setVisible(this.isPermisoNuevoNotasCreditos);			
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarNotasCreditos.setVisible(this.isPermisoActualizarNotasCreditos);	
			this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarNotasCreditos.setVisible(this.isPermisoActualizarNotasCreditos);	
			this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarNotasCreditos.setVisible(this.isPermisoEliminarNotasCreditos);
			this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarNotasCreditos);						
			this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosNotasCreditos.setVisible(this.isPermisoGuardarCambiosNotasCreditos);							
		}
		
		this.jButtonGuardarCambiosTablaNotasCreditos.setVisible(this.isPermisoActualizarNotasCreditos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNotasCreditos() {
		this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarNotasCreditos.setVisible(this.isPermisoActualizarNotasCreditos);	
		this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarNotasCreditos.setVisible(this.isPermisoActualizarNotasCreditos);	
		this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarNotasCreditos.setVisible(this.isPermisoEliminarNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarNotasCreditos.setVisible(this.isVisibilidadCeldaCancelarNotasCreditos);							
		this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosNotasCreditos.setVisible((this.isVisibilidadCeldaGuardarNotasCreditos && this.isPermisoGuardarCambiosNotasCreditos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNotasCreditos() {
		if(NotasCreditosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNotasCreditos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNotasCreditos() {
	}
	
	public void jTableDatosNotasCreditosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNotasCreditos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.notascreditos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNotasCreditosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNotasCreditos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNotasCreditos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNotasCreditos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.notascreditosLogic.getConnexion());

				if(this.notascreditos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.notascreditos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNotasCreditos=(TitledBorder)this.jScrollPanelDatosNotasCreditos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNotasCreditos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.notascreditos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.notascreditos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.notascreditos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.notascreditos.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impreso_facturaNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getnumero_pre_impreso_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso_factura like '%"+this.notascreditos.getnumero_pre_impreso_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.notascreditos.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.notascreditos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.notascreditos.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.notascreditos.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento_valorNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getdescuento_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento_valor = "+this.notascreditos.getdescuento_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonotro_valorNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getotro_valor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where otro_valor = "+this.notascreditos.getotro_valor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsub_totalNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getsub_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sub_total = "+this.notascreditos.getsub_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.notascreditos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_estado_nota_creditoNotasCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.getnotascreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.notascreditos==null) {
						this.notascreditos = new NotasCreditos();
					}

					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);
				}

				if(this.notascreditos.getnombre_estado_nota_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_estado_nota_credito like '%"+this.notascreditos.getnombre_estado_nota_credito()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNotasCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaNotasCreditosNotasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNotasCreditos(false,false);

			this.getNotasCreditossBusquedaNotasCreditos();

			this.inicializarActualizarBindingNotasCreditos(false);

			//if(NotasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNotasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaNotasCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNotasCreditos(false,false);

			this.getNotasCreditossFK_IdEmpresa();

			this.inicializarActualizarBindingNotasCreditos(false);

			//if(NotasCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNotasCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.notascreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNotasCreditos() {
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
			this.jInternalFrameDetalleFormNotasCreditos.setVisible(false);	    			
			this.jInternalFrameDetalleFormNotasCreditos.dispose();
			this.jInternalFrameDetalleFormNotasCreditos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
			this.jInternalFrameReporteDinamicoNotasCreditos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNotasCreditos.dispose();
			this.jInternalFrameReporteDinamicoNotasCreditos=null;
		}
		
		if(this.jInternalFrameImportacionNotasCreditos!=null) {
			this.jInternalFrameImportacionNotasCreditos.setVisible(false);	    			
			this.jInternalFrameImportacionNotasCreditos.dispose();
			this.jInternalFrameImportacionNotasCreditos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNotasCreditos();
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
			
			if(sTipo.equals("NuevoNotasCreditos")) {
				jButtonNuevoNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNotasCreditos")) {
				jButtonDuplicarNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNotasCreditos")) {
				jButtonCopiarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("VerFormNotasCreditos")) {
				jButtonVerFormNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNotasCreditos")) {
				jButtonNuevoNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNotasCreditos")) {
				jButtonDuplicarNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNotasCreditos")) {
				jButtonNuevoNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNotasCreditos")) {
				jButtonDuplicarNotasCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNotasCreditos")) {
				jButtonNuevoNotasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNotasCreditos")) {
				jButtonNuevoNotasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNotasCreditos")) {
				jButtonNuevoNotasCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNotasCreditos")) {
				jButtonModificarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNotasCreditos")) {
				jButtonModificarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNotasCreditos")) {
				jButtonModificarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNotasCreditos")) {
				jButtonActualizarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNotasCreditos")) {
				jButtonActualizarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNotasCreditos")) {
				jButtonActualizarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("EliminarNotasCreditos")) {
				jButtonEliminarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNotasCreditos")) {
				jButtonEliminarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNotasCreditos")) {
				jButtonEliminarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CancelarNotasCreditos")) {
				jButtonCancelarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNotasCreditos")) {
				jButtonCancelarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNotasCreditos")) {
				jButtonCancelarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CerrarNotasCreditos")) {
				jButtonCerrarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNotasCreditos")) {
				jButtonCerrarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNotasCreditos")) {
				jButtonCerrarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNotasCreditos")) {
				jButtonMostrarOcultarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNotasCreditos")) {
				jButtonCancelarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNotasCreditos")) {
				jButtonGuardarCambiosNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNotasCreditos")) {
				jButtonGuardarCambiosNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNotasCreditos")) {
				jButtonCopiarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNotasCreditos")) {
				jButtonVerFormNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNotasCreditos")) {
				jButtonGuardarCambiosNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNotasCreditos")) {
				jButtonCopiarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNotasCreditos")) {
				jButtonVerFormNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNotasCreditos")) {
				jButtonGuardarCambiosNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNotasCreditos")) {
				jButtonGuardarCambiosNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNotasCreditos")) {
				jButtonGuardarCambiosNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNotasCreditos")) {
				jButtonRecargarInformacionNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNotasCreditos")) {
				jButtonRecargarInformacionNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNotasCreditos")) {
				jButtonRecargarInformacionNotasCreditosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNotasCreditos")) {
				jButtonAnterioresNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNotasCreditos")) {
				jButtonAnterioresNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNotasCreditos")) {
				jButtonAnterioresNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNotasCreditos")) {
				jButtonSiguientesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNotasCreditos")) {
				jButtonSiguientesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNotasCreditos")) {
				jButtonSiguientesNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNotasCreditos") || sTipo.equals("MenuItemDetalleAbrirOrderByNotasCreditos")) {
				jButtonAbrirOrderByNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNotasCreditos") || sTipo.equals("MenuItemDetalleMostrarOcultarNotasCreditos")) {
				jButtonMostrarOcultarNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNotasCreditos")) {
				jButtonNuevoGuardarCambiosNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNotasCreditos")) {
				jButtonNuevoGuardarCambiosNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNotasCreditos")) {
				jButtonNuevoGuardarCambiosNotasCreditosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNotasCreditos")) {
				jButtonCerrarReporteDinamicoNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNotasCreditos")) {
				jButtonGenerarReporteDinamicoNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNotasCreditos")) {
				
				jButtonGenerarExcelReporteDinamicoNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNotasCreditos")) {
				jButtonCerrarImportacionNotasCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNotasCreditos")) {
				
				jButtonGenerarImportacionNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNotasCreditos")) {
				
				jButtonAbrirImportacionNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNotasCreditos")) {
				jComboBoxTiposAccionesNotasCreditosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNotasCreditos")) {
				jComboBoxTiposRelacionesNotasCreditosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNotasCreditos")) {
				jComboBoxTiposAccionesNotasCreditosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNotasCreditos")) {
				
				jComboBoxTiposSeleccionarNotasCreditosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNotasCreditos")) {
				jTextFieldValorCampoGeneralNotasCreditosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNotasCreditos")) {
				jButtonAbrirOrderByNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNotasCreditos")) {
				jButtonAbrirOrderByNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNotasCreditos")) {
				jButtonCerrarOrderByNotasCreditosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNotasCreditosBusqueda")) {
				this.jButtonidNotasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNotasCreditosUpdate")) {
				this.jButtonid_empresaNotasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNotasCreditosBusqueda")) {
				this.jButtonid_empresaNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeNotasCreditosBusqueda")) {
				this.jButtonfecha_emision_desdeNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaNotasCreditosBusqueda")) {
				this.jButtonfecha_emision_hastaNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteNotasCreditosBusqueda")) {
				this.jButtonnombre_completo_clienteNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaNotasCreditosBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoNotasCreditosBusqueda")) {
				this.jButtonnumero_pre_impresoNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionNotasCreditosBusqueda")) {
				this.jButtonfecha_emisionNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoNotasCreditosBusqueda")) {
				this.jButtonfecha_vencimientoNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaNotasCreditosBusqueda")) {
				this.jButtonivaNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_valorNotasCreditosBusqueda")) {
				this.jButtondescuento_valorNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("otro_valorNotasCreditosBusqueda")) {
				this.jButtonotro_valorNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalNotasCreditosBusqueda")) {
				this.jButtonsub_totalNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalNotasCreditosBusqueda")) {
				this.jButtontotalNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_estado_nota_creditoNotasCreditosBusqueda")) {
				this.jButtonnombre_estado_nota_creditoNotasCreditosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaNotasCreditosNotasCreditos")) {
				this.jButtonBusquedaNotasCreditosNotasCreditosActionPerformed(evt);
			}
			
			;
			
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNotasCreditos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNotasCreditosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				


				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NotasCreditos notascreditosLocal=null;
			
			if(!this.getEsControlTabla()) {
				notascreditosLocal=this.notascreditos;
			} else {
				notascreditosLocal=this.notascreditosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
							
				
				


				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
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
			
			


			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNotasCreditosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
								
						
				


				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
								
				
				


				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNotasCreditosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
							
				
				


				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNotasCreditosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditosAnterior =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.notascreditosAnterior =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
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
			
			


			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNotasCreditosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
								
				
				


				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNotasCreditosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNotasCreditosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNotasCreditos")) {
					jCheckBoxSeleccionarTodosNotasCreditosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNotasCreditos")) {
					jCheckBoxSeleccionadosNotasCreditosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNotasCreditos")) {
					
				}
				
				


				
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
												
				
				


				
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNotasCreditosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.notascreditosAnterior =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.notascreditosAnterior =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNotasCreditosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
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
			
			


			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNotasCreditosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.notascreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.notascreditos);
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
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
				
				


				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NotasCreditos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NotasCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNotasCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.notascreditosAnterior =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNotasCreditos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNotasCreditosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNotasCreditos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.notascreditos =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.notascreditos =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.notascreditos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNotasCreditos")) {
				
				}
				
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNotasCreditos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNotasCreditos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNotasCreditos")) {
			
			}
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNotasCreditos();
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
			if(sTipo.equals("NuevoNotasCreditos")) {
				jButtonNuevoNotasCreditosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNotasCreditos")) {
				jButtonDuplicarNotasCreditosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNotasCreditos")) {
				jButtonCopiarNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNotasCreditos")) {
				jButtonVerFormNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNotasCreditos")) {
				jButtonNuevoNotasCreditosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNotasCreditos")) {
				jButtonModificarNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNotasCreditos")) {
				jButtonActualizarNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNotasCreditos")) {
				jButtonEliminarNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNotasCreditos")) {
				jButtonGuardarCambiosNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNotasCreditos")) {
				jButtonCancelarNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNotasCreditos")) {
				jButtonCerrarNotasCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNotasCreditos")) {
				jButtonGuardarCambiosNotasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNotasCreditos")) {
				jButtonNuevoGuardarCambiosNotasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNotasCreditos")) {
				jButtonAbrirOrderByNotasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNotasCreditos")) {
				jButtonRecargarInformacionNotasCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNotasCreditos")) {
				jButtonAnterioresNotasCreditosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNotasCreditos")) {
				jButtonSiguientesNotasCreditosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNotasCreditosBusqueda")) {
				this.jButtonidNotasCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNotasCreditosUpdate")) {
				this.jButtonid_empresaNotasCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNotasCreditosBusqueda")) {
				this.jButtonid_empresaNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeNotasCreditosBusqueda")) {
				this.jButtonfecha_emision_desdeNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaNotasCreditosBusqueda")) {
				this.jButtonfecha_emision_hastaNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteNotasCreditosBusqueda")) {
				this.jButtonnombre_completo_clienteNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaNotasCreditosBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoNotasCreditosBusqueda")) {
				this.jButtonnumero_pre_impresoNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionNotasCreditosBusqueda")) {
				this.jButtonfecha_emisionNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoNotasCreditosBusqueda")) {
				this.jButtonfecha_vencimientoNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaNotasCreditosBusqueda")) {
				this.jButtonivaNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_valorNotasCreditosBusqueda")) {
				this.jButtondescuento_valorNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("otro_valorNotasCreditosBusqueda")) {
				this.jButtonotro_valorNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sub_totalNotasCreditosBusqueda")) {
				this.jButtonsub_totalNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalNotasCreditosBusqueda")) {
				this.jButtontotalNotasCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_estado_nota_creditoNotasCreditosBusqueda")) {
				this.jButtonnombre_estado_nota_creditoNotasCreditosBusquedaActionPerformed(evt);
			}
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNotasCreditos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNotasCreditos")) {
				closingInternalFrameNotasCreditos();
				
			} else if(sTipo.equals("jButtonCancelarNotasCreditos")) {
				JInternalFrameBase jInternalFrameDetalleFormNotasCreditos = (JInternalFrameBase)evt.getSource();
	            	
	            NotasCreditosBeanSwingJInternalFrame jInternalFrameParent=(NotasCreditosBeanSwingJInternalFrame)jInternalFrameDetalleFormNotasCreditos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNotasCreditosActionPerformed(null);
			}
			
			NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.notascreditos,new Object(),this.notascreditosParameterGeneral,this.notascreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNotasCreditos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNotasCreditos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNotasCreditos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.notascreditos)) {
			if(!esControlTabla) {
				if(NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);			
				}
				
				if(this.notascreditosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNotasCreditos(this.notascreditos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNotasCreditos(this.notascreditosReturnGeneral,this.notascreditosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.notascreditosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNotasCreditos(classes,this.notascreditosReturnGeneral,this.notascreditosBean,false);
					}
						
					if(this.notascreditosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNotasCreditos(this.notascreditosReturnGeneral.getNotasCreditos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNotasCreditos(this.notascreditosReturnGeneral.getNotasCreditos());	
					}
						
					if(this.notascreditosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNotasCreditos(this.notascreditosReturnGeneral.getNotasCreditos(),classes);//this.notascreditosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNotasCreditos(this.notascreditos,classes);//this.notascreditosBean);									
				}
			
				if(NotasCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNotasCreditos(this.notascreditos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNotasCreditos(this.notascreditos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.notascreditosAnterior!=null) {
						this.notascreditos=this.notascreditosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.notascreditosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.notascreditosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.notascreditosReturnGeneral.getNotasCreditos(),notascreditosLogic.getNotasCreditoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.notascreditosReturnGeneral.getNotasCreditos(),this.notascreditoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNotasCreditos.repaint();
				
				//((AbstractTableModel) this.jTableDatosNotasCreditos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNotasCreditos();
			}
		}
	}
	
	public void actualizarVisualTableDatosNotasCreditos() throws Exception {
		
		NotasCreditosModel notascreditosModel=(NotasCreditosModel)this.jTableDatosNotasCreditos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			notascreditosModel.notascreditoss=this.notascreditosLogic.getNotasCreditoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			notascreditosModel.notascreditoss=this.notascreditoss;
		}
		
		
		((NotasCreditosModel) this.jTableDatosNotasCreditos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNotasCreditos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnotascreditosAnterior(),this.notascreditosLogic.getNotasCreditoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnotascreditosAnterior(),this.notascreditoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNotasCreditos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNotasCreditos(NotasCreditos notascreditos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
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
										
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.notascreditos,new Object(),generalEntityParameterGeneral,this.notascreditosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.notascreditosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NotasCreditosConstantesFunciones.getClassesRelationshipsOfNotasCreditos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NotasCreditosConstantesFunciones.getClassesRelationshipsFromStringsOfNotasCreditos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNotasCreditos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NotasCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.notascreditos,new Object(),generalEntityParameterGeneral,this.notascreditosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNotasCreditos(NotasCreditosBean notascreditosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNotasCreditos(ArrayList<Classe> classes,NotasCreditosReturnGeneral notascreditosReturnGeneral,NotasCreditosBean notascreditosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNotasCreditos(NotasCreditos notascreditos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.notascreditos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNotasCreditos = new NotasCreditosDetalleFormJInternalFrame(jDesktopPane,this.notascreditosSessionBean.getConGuardarRelaciones(),this.notascreditosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.setVisible(false);
		this.jInternalFrameDetalleFormNotasCreditos.setSelected(false);						
		
		this.jInternalFrameDetalleFormNotasCreditos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNotasCreditos.notascreditosLogic=this.notascreditosLogic;
		
		this.cargarCombosFrameForeignKeyNotasCreditos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNotasCreditos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNotasCreditos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNotasCreditos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNotasCreditos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNotasCreditos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNotasCreditos"));
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarNotasCreditos.addActionListener(new ButtonActionListener(this,"ModificarNotasCreditos"));

		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarToolBarNotasCreditos.addActionListener(new ButtonActionListener(this,"ModificarToolBarNotasCreditos"));
					
		this.jInternalFrameDetalleFormNotasCreditos.jMenuItemModificarNotasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemModificarNotasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarNotasCreditos.addActionListener (new ButtonActionListener(this,"ActualizarNotasCreditos"));
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarToolBarNotasCreditos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNotasCreditos"));
						
		this.jInternalFrameDetalleFormNotasCreditos.jMenuItemActualizarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNotasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarNotasCreditos.addActionListener (new ButtonActionListener(this,"EliminarNotasCreditos"));
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"EliminarToolBarNotasCreditos"));
								
		this.jInternalFrameDetalleFormNotasCreditos.jMenuItemEliminarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNotasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarNotasCreditos.addActionListener (new ButtonActionListener(this,"CancelarNotasCreditos"));
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"CancelarToolBarNotasCreditos"));
					
		this.jInternalFrameDetalleFormNotasCreditos.jMenuItemCancelarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNotasCreditos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jMenuItemDetalleCerrarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNotasCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNotasCreditos"));
		
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNotasCreditos"));
		
		
		
		this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNotasCreditos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonidNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNotasCreditos.jButtonid_empresaNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonid_empresaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emision_desdeNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emision_hastaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnombre_completo_clienteNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnumero_pre_impresoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emisionNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_vencimientoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonivaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ivaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtondescuento_valorNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonotro_valorNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"otro_valorNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonsub_totalNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtontotalNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estado_nota_creditoNotasCreditosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNotasCreditos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNotasCreditos"));
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNotasCreditos"));
		}
		
		this.jTableDatosNotasCreditos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNotasCreditos"));
		
		this.jTableDatosNotasCreditos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNotasCreditos"));
		
		this.jButtonNuevoNotasCreditos.addActionListener(new ButtonActionListener(this,"NuevoNotasCreditos"));
		
		this.jButtonDuplicarNotasCreditos.addActionListener(new ButtonActionListener(this,"DuplicarNotasCreditos"));
		
		this.jButtonCopiarNotasCreditos.addActionListener(new ButtonActionListener(this,"CopiarNotasCreditos"));
		
		this.jButtonVerFormNotasCreditos.addActionListener(new ButtonActionListener(this,"VerFormNotasCreditos"));
		
		
		this.jButtonNuevoToolBarNotasCreditos.addActionListener(new ButtonActionListener(this,"NuevoToolBarNotasCreditos"));
			
		this.jButtonDuplicarToolBarNotasCreditos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNotasCreditos"));
			
		this.jMenuItemNuevoNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNotasCreditos"));
			
		this.jMenuItemDuplicarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNotasCreditos"));		
		
		
		this.jButtonNuevoRelacionesNotasCreditos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNotasCreditos"));
		
		
		this.jButtonNuevoRelacionesToolBarNotasCreditos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNotasCreditos"));
			
		this.jMenuItemNuevoRelacionesNotasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNotasCreditos"));		
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarNotasCreditos.addActionListener(new ButtonActionListener(this,"ModificarNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonModificarToolBarNotasCreditos.addActionListener(new ButtonActionListener(this,"ModificarToolBarNotasCreditos"));
			
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemModificarNotasCreditos.addActionListener(new ButtonActionListener(this,"MenuItemModificarNotasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarNotasCreditos.addActionListener (new ButtonActionListener(this,"ActualizarNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonActualizarToolBarNotasCreditos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNotasCreditos"));
				
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemActualizarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNotasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarNotasCreditos.addActionListener (new ButtonActionListener(this,"EliminarNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonEliminarToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"EliminarToolBarNotasCreditos"));
						
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemEliminarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNotasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarNotasCreditos.addActionListener (new ButtonActionListener(this,"CancelarNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonCancelarToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"CancelarToolBarNotasCreditos"));
			
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemCancelarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNotasCreditos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNotasCreditos"));		
		
		
		this.jButtonCerrarNotasCreditos.addActionListener (new ButtonActionListener(this,"CerrarNotasCreditos"));
		
		
		this.jButtonCerrarToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"CerrarToolBarNotasCreditos"));
			
		this.jMenuItemCerrarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNotasCreditos"));
			
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jMenuItemDetalleCerrarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNotasCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosNotasCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNotasCreditos"));
		}
		
		this.jButtonCopiarToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"CopiarToolBarNotasCreditos"));
			
		this.jButtonVerFormToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"VerFormToolBarNotasCreditos"));
		
		this.jMenuItemGuardarCambiosNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNotasCreditos"));
			
		this.jMenuItemCopiarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNotasCreditos"));		
		
		this.jMenuItemVerFormNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNotasCreditos"));		
		
		
		this.jButtonGuardarCambiosTablaNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNotasCreditos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNotasCreditos"));
			
		this.jMenuItemGuardarCambiosTablaNotasCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNotasCreditos"));		
		
		
		
		this.jButtonRecargarInformacionNotasCreditos.addActionListener (new ButtonActionListener(this,"RecargarInformacionNotasCreditos"));
					
		this.jButtonRecargarInformacionToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNotasCreditos"));
		
		this.jMenuItemRecargarInformacionNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNotasCreditos"));		
		
		
		
		this.jButtonAnterioresNotasCreditos.addActionListener (new ButtonActionListener(this,"AnterioresNotasCreditos"));
		
		
		this.jButtonAnterioresToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNotasCreditos"));
		
		this.jMenuItemAnterioresNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNotasCreditos"));		
		
		
		this.jButtonSiguientesNotasCreditos.addActionListener (new ButtonActionListener(this,"SiguientesNotasCreditos"));
		
		
		this.jButtonSiguientesToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNotasCreditos"));
			
		this.jMenuItemSiguientesNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNotasCreditos"));
			
		this.jMenuItemAbrirOrderByNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNotasCreditos"));
			
		this.jMenuItemMostrarOcultarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNotasCreditos"));
			
		this.jMenuItemDetalleAbrirOrderByNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNotasCreditos"));
			
		this.jMenuItemDetalleMostarOcultarNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNotasCreditos"));		
		
		
		this.jButtonNuevoGuardarCambiosNotasCreditos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNotasCreditos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNotasCreditos"));
			
		this.jMenuItemNuevoGuardarCambiosNotasCreditos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNotasCreditos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNotasCreditos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNotasCreditos"));

		this.jCheckBoxSeleccionadosNotasCreditos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNotasCreditos"));
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNotasCreditos"));
		}
		
		
		this.jComboBoxTiposRelacionesNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposRelacionesNotasCreditos"));
			
		this.jComboBoxTiposAccionesNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesNotasCreditos"));
					
		this.jComboBoxTiposSeleccionarNotasCreditos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNotasCreditos"));
			
		this.jTextFieldValorCampoGeneralNotasCreditos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNotasCreditos"));		
		
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonidNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNotasCreditos.jButtonid_empresaNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonid_empresaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emision_desdeNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emision_hastaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnombre_completo_clienteNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnumero_pre_impresoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emisionNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_vencimientoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonivaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ivaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtondescuento_valorNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonotro_valorNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"otro_valorNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonsub_totalNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtontotalNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estado_nota_creditoNotasCreditosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaNotasCreditosNotasCreditos.addActionListener(new ButtonActionListener(this,"BusquedaNotasCreditosNotasCreditos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNotasCreditos!=null) {
				this.jInternalFrameReporteDinamicoNotasCreditos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNotasCreditos"));
				this.jInternalFrameReporteDinamicoNotasCreditos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNotasCreditos"));
				this.jInternalFrameReporteDinamicoNotasCreditos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNotasCreditos"));
			}
			
			//this.jButtonCerrarReporteDinamicoNotasCreditos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNotasCreditos"));				
			//this.jButtonGenerarReporteDinamicoNotasCreditos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNotasCreditos"));
			//this.jButtonGenerarExcelReporteDinamicoNotasCreditos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNotasCreditos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNotasCreditos!=null) {
				this.jInternalFrameImportacionNotasCreditos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNotasCreditos"));
				this.jInternalFrameImportacionNotasCreditos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNotasCreditos"));
				this.jInternalFrameImportacionNotasCreditos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNotasCreditos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNotasCreditos.addActionListener (new ButtonActionListener(this,"AbrirOrderByNotasCreditos"));
			
			this.jButtonAbrirOrderByToolBarNotasCreditos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNotasCreditos"));			
			
			if(this.jInternalFrameOrderByNotasCreditos!=null) {
				this.jInternalFrameOrderByNotasCreditos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNotasCreditos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNotasCreditos.jTabbedPaneRelacionesNotasCreditos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNotasCreditos"));
		
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
            		closingInternalFrameNotasCreditos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNotasCreditos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNotasCreditos = (JInternalFrameBase)event.getSource();
	            	
	            NotasCreditosBeanSwingJInternalFrame jInternalFrameParent=(NotasCreditosBeanSwingJInternalFrame)jInternalFrameDetalleFormNotasCreditos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNotasCreditosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNotasCreditos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNotasCreditosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNotasCreditos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNotasCreditos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNotasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNotasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNotasCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNotasCreditos";
		inputMap = this.jButtonNuevoNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNotasCreditosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNotasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNotasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNotasCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNotasCreditos";
		inputMap = this.jButtonNuevoRelacionesNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNotasCreditosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNotasCreditos";
		inputMap = this.jButtonModificarNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNotasCreditos";
		inputMap = this.jButtonActualizarNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNotasCreditos";
		inputMap = this.jButtonEliminarNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNotasCreditos";
		inputMap = this.jButtonCancelarNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNotasCreditos";
		inputMap = this.jButtonCerrarNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNotasCreditos";
		inputMap = this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosNotasCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNotasCreditos.jButtonGuardarCambiosNotasCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNotasCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNotasCreditos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNotasCreditosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNotasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNotasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNotasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNotasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNotasCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNotasCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonidNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idNotasCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNotasCreditos.jButtonid_empresaNotasCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNotasCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonid_empresaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emision_desdeNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emision_hastaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnombre_completo_clienteNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnumero_pre_impresoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_emisionNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonfecha_vencimientoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonivaNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"ivaNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtondescuento_valorNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"descuento_valorNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonotro_valorNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"otro_valorNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonsub_totalNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"sub_totalNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtontotalNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"totalNotasCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNotasCreditos.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estado_nota_creditoNotasCreditosBusqueda"));
		
		
		this.jButtonBusquedaNotasCreditosNotasCreditos.addActionListener(new ButtonActionListener(this,"BusquedaNotasCreditosNotasCreditos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNotasCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNotasCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNotasCreditosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNotasCreditos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNotasCreditos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
					notascreditosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NotasCreditos notascreditosAux:notascreditoss) {
					notascreditosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNotasCreditosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNotasCreditos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
						notascreditosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NotasCreditos notascreditosAux:notascreditoss) {
						notascreditosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NotasCreditos notascreditosAux:notascreditoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNotasCreditos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNotasCreditos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNotasCreditos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNotasCreditosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNotasCreditos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNotasCreditos.getSelectedRows();
			
			NotasCreditos notascreditosLocal=new NotasCreditos();
			
			//this.seleccionarTodosNotasCreditos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					notascreditosLocal =(NotasCreditos) this.notascreditosLogic.getNotasCreditoss().toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					notascreditosLocal =(NotasCreditos) this.notascreditoss.toArray()[this.jTableDatosNotasCreditos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				notascreditosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
						notascreditosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NotasCreditos notascreditosAux:notascreditoss) {
						notascreditosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNotasCreditos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNotasCreditos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNotasCreditos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNotasCreditos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNotasCreditosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNotasCreditosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNotasCreditosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNotasCreditos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNotasCreditos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NotasCreditos notascreditosAux:this.notascreditosLogic.getNotasCreditoss()) {
				
						if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							notascreditosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							notascreditosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							notascreditosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							notascreditosAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							notascreditosAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							notascreditosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							notascreditosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							notascreditosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR)) {
							existe=true;
							notascreditosAux.setdescuento_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_OTROVALOR)) {
							existe=true;
							notascreditosAux.setotro_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							notascreditosAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							notascreditosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO)) {
							existe=true;
							notascreditosAux.setnombre_estado_nota_credito(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NotasCreditos notascreditosAux:notascreditoss) {
					
						if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							notascreditosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							notascreditosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							notascreditosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							notascreditosAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							notascreditosAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							notascreditosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							notascreditosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							notascreditosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR)) {
							existe=true;
							notascreditosAux.setdescuento_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_OTROVALOR)) {
							existe=true;
							notascreditosAux.setotro_valor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							notascreditosAux.setsub_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							notascreditosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO)) {
							existe=true;
							notascreditosAux.setnombre_estado_nota_credito(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNotasCreditos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNotasCreditosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNotasCreditos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNotasCreditos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNotasCreditos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNotasCreditos) {				
					conSplash=true;//false;										
					
					//this.startProcessNotasCreditos(conSplash);
				
					this.generarReporteNotasCreditossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNotasCreditossSeleccionados();
				//this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNotasCreditossSeleccionados(false);
				//this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNotasCreditossSeleccionados(true);
				//this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNotasCreditos();
				
				this.exportarNotasCreditossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNotasCreditoss();
				//this.importarNotasCreditoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNotasCreditos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNotasCreditossSeleccionados();
				//this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Notas Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNotasCreditos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNotasCreditos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNotasCreditos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.setSelectedIndex(0);					
				}	
			} 			
			else if(NotasCreditosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNotasCreditos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNotasCreditos(conSplash);
					
						//this.actualizarParametrosGeneralNotasCreditos();
						
						this.generarReporteProcesoAccionNotasCreditossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NotasCreditosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Notas CreditosES SELECCIONADOS?", "MANTENIMIENTO DE Notas Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNotasCreditos();
				
						this.actualizarParametrosGeneralNotasCreditos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.notascreditosReturnGeneral=notascreditosLogic.procesarAccionNotasCreditossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.notascreditosLogic.getNotasCreditoss(),this.notascreditosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNotasCreditosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNotasCreditos();
					
					NotasCreditosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNotasCreditosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNotasCreditos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNotasCreditos.jComboBoxTiposAccionesFormularioNotasCreditos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNotasCreditos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNotasCreditosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNotasCreditos();
			
			if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		
			NotasCreditos notascreditos=new NotasCreditos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNotasCreditos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNotasCreditos.getSelectedItem();
			
			
			
			
			notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
			//this.sTipoAccion;
			
			if(notascreditossSeleccionados.size()==1) {
				for(NotasCreditos notascreditosAux:notascreditossSeleccionados) {
					notascreditos=notascreditosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNotasCreditos();
			
      		//this.finishProcessNotasCreditos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNotasCreditosReturnGeneral() throws Exception {
		if(this.notascreditosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.notascreditosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.notascreditosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.notascreditosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.notascreditosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.notascreditosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNotasCreditos(false);
		}
		
		if(this.notascreditosReturnGeneral.getConRetornoLista() || this.notascreditosReturnGeneral.getConRetornoObjeto()) {
			if(this.notascreditosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.notascreditosLogic.setNotasCreditoss(this.notascreditosReturnGeneral.getNotasCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingNotasCreditos(false);
		}
	}
	
	public void actualizarParametrosGeneralNotasCreditos() throws Exception {
		
		
	}
	
	public ArrayList<NotasCreditos> getNotasCreditossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNotasCreditos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NotasCreditos notascreditosAux:notascreditosLogic.getNotasCreditoss()) {
					if(notascreditosAux.getIsSelected()) {
						notascreditossSeleccionados.add(notascreditosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NotasCreditos notascreditosAux:this.notascreditoss) {
					if(notascreditosAux.getIsSelected()) {
						notascreditossSeleccionados.add(notascreditosAux);				
					}
				}
			}
			
			if(notascreditossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						notascreditossSeleccionados.addAll(this.notascreditosLogic.getNotasCreditoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						notascreditossSeleccionados.addAll(this.notascreditoss);				
					}
				}
			}
		} else {
			notascreditossSeleccionados.add(this.notascreditos);
		}
		
		return notascreditossSeleccionados;
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
	
	public void generarReporteNotasCreditossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNotasCreditossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNotasCreditossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNotasCreditossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNotasCreditossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Notas Creditos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNotasCreditossSeleccionados() throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNotasCreditoss("Todos",notascreditossSeleccionados);
		
	}	
	
	public void generarReporteNormalNotasCreditossSeleccionados() throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNotasCreditoss("Todos",notascreditossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNotasCreditossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNotasCreditoss("Todos",notascreditossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNotasCreditossSeleccionados() throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNotasCreditos();
		
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNotasCreditos();
		
		
		//this.generarReporteNotasCreditoss("Todos",notascreditossSeleccionados ,notascreditosImplementable,notascreditosImplementableHome);
	}
	
	public void mostrarImportacionNotasCreditoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNotasCreditos();
		
		this.abrirFrameImportacionNotasCreditos();		
		
			
		//this.generarReporteNotasCreditoss("Todos",notascreditossSeleccionados ,notascreditosImplementable,notascreditosImplementableHome);
	}
	
	public void importarNotasCreditoss() throws Exception {		
	
	}
	
	public void exportarNotasCreditossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNotasCreditossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNotasCreditossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNotasCreditossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Notas Creditos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNotasCreditossSeleccionados() throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"notascreditos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNotasCreditos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NotasCreditos notascreditosAux:notascreditossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNotasCreditos(notascreditosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//notascreditosAux.setsDetalleGeneralEntityReporte(notascreditosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNotasCreditos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_OTROVALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNotasCreditos(NotasCreditos notascreditos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=notascreditos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getnumero_pre_impreso_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getdescuento_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getotro_valor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getsub_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=notascreditos.getnombre_estado_nota_credito();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNotasCreditossSeleccionados() throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"notascreditos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NotasCreditoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNotasCreditos(row);				
				iRow++;
			}				
			
			for(NotasCreditos notascreditosAux:notascreditossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNotasCreditos(notascreditosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNotasCreditossSeleccionados() throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();		
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"notascreditos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("notascreditoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("notascreditos");
			//elementRoot.appendChild(element);
		
			for(NotasCreditos notascreditosAux:notascreditossSeleccionados) {
				element = document.createElement("notascreditos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNotasCreditos(notascreditosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Notas Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNotasCreditos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_OTROVALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNotasCreditos(NotasCreditos notascreditos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getnumero_pre_impreso_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getdescuento_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getotro_valor());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getsub_total());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(notascreditos.getnombre_estado_nota_credito());				
	}
	
	public void setFilaDatosExportarXmlNotasCreditos(NotasCreditos notascreditos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NotasCreditosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(notascreditos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NotasCreditosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(notascreditos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NotasCreditosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(notascreditos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_emision_desde = document.createElement(NotasCreditosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(notascreditos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(NotasCreditosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(notascreditos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo_cliente = document.createElement(NotasCreditosConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(notascreditos.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnumero_pre_impreso_factura = document.createElement(NotasCreditosConstantesFunciones.NUMEROPREIMPRESOFACTURA);
		elementnumero_pre_impreso_factura.appendChild(document.createTextNode(notascreditos.getnumero_pre_impreso_factura().trim()));
		element.appendChild(elementnumero_pre_impreso_factura);

		Element elementnumero_pre_impreso = document.createElement(NotasCreditosConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(notascreditos.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementfecha_emision = document.createElement(NotasCreditosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(notascreditos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(NotasCreditosConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(notascreditos.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementiva = document.createElement(NotasCreditosConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(notascreditos.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento_valor = document.createElement(NotasCreditosConstantesFunciones.DESCUENTOVALOR);
		elementdescuento_valor.appendChild(document.createTextNode(notascreditos.getdescuento_valor().toString().trim()));
		element.appendChild(elementdescuento_valor);

		Element elementotro_valor = document.createElement(NotasCreditosConstantesFunciones.OTROVALOR);
		elementotro_valor.appendChild(document.createTextNode(notascreditos.getotro_valor().toString().trim()));
		element.appendChild(elementotro_valor);

		Element elementsub_total = document.createElement(NotasCreditosConstantesFunciones.SUBTOTAL);
		elementsub_total.appendChild(document.createTextNode(notascreditos.getsub_total().toString().trim()));
		element.appendChild(elementsub_total);

		Element elementtotal = document.createElement(NotasCreditosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(notascreditos.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementnombre_estado_nota_credito = document.createElement(NotasCreditosConstantesFunciones.NOMBREESTADONOTACREDITO);
		elementnombre_estado_nota_credito.appendChild(document.createTextNode(notascreditos.getnombre_estado_nota_credito().trim()));
		element.appendChild(elementnombre_estado_nota_credito);
	}
	
	public void generarReporteGroupGenericoNotasCreditossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NotasCreditos> notascreditossSeleccionados=new ArrayList<NotasCreditos>();
		
		notascreditossSeleccionados=this.getNotasCreditossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNotasCreditos(notascreditossSeleccionados);
		
		this.generarReporteNotasCreditoss("Todos",notascreditossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNotasCreditos(ArrayList<NotasCreditos> notascreditossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NotasCreditos notascreditosAux:notascreditossSeleccionados) {
				notascreditosAux.setsDetalleGeneralEntityReporte(notascreditosAux.toString());
			
				if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(notascreditosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(notascreditosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(notascreditosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(notascreditosAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(notascreditosAux.getnumero_pre_impreso_factura());
				}
				 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(notascreditosAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(notascreditosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(notascreditosAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO)) {
					existe=true;
					notascreditosAux.setsDescripcionGeneralEntityReporte1(notascreditosAux.getnombre_estado_nota_credito());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NotasCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNotasCreditos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNotasCreditos=true;
				this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=true;
				this.isVisibilidadCeldaGuardarCambiosNotasCreditos=true;
			}
			
			this.isVisibilidadCeldaModificarNotasCreditos=false;
			this.isVisibilidadCeldaActualizarNotasCreditos=false;
			this.isVisibilidadCeldaEliminarNotasCreditos=false;
			this.isVisibilidadCeldaCancelarNotasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNotasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=false;
			this.isVisibilidadCeldaModificarNotasCreditos=false;
			this.isVisibilidadCeldaActualizarNotasCreditos=true;
			this.isVisibilidadCeldaEliminarNotasCreditos=false;
			this.isVisibilidadCeldaCancelarNotasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNotasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=false;
			this.isVisibilidadCeldaModificarNotasCreditos=false;
			this.isVisibilidadCeldaActualizarNotasCreditos=true;
			this.isVisibilidadCeldaEliminarNotasCreditos=true;
			this.isVisibilidadCeldaCancelarNotasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNotasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=false;
			this.isVisibilidadCeldaModificarNotasCreditos=false;
			this.isVisibilidadCeldaActualizarNotasCreditos=true;
			this.isVisibilidadCeldaEliminarNotasCreditos=false;
			this.isVisibilidadCeldaCancelarNotasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNotasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=true;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=true;
			this.isVisibilidadCeldaModificarNotasCreditos=false;
			this.isVisibilidadCeldaActualizarNotasCreditos=false;
			this.isVisibilidadCeldaEliminarNotasCreditos=false;
			this.isVisibilidadCeldaCancelarNotasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNotasCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=false;
			this.isVisibilidadCeldaActualizarNotasCreditos=false;
			this.isVisibilidadCeldaEliminarNotasCreditos=false;
			this.isVisibilidadCeldaCancelarNotasCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNotasCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=false;
			this.isVisibilidadCeldaModificarNotasCreditos=true;
			this.isVisibilidadCeldaActualizarNotasCreditos=false;
			this.isVisibilidadCeldaEliminarNotasCreditos=false;
			this.isVisibilidadCeldaCancelarNotasCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarNotasCreditos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NotasCreditosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNotasCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=true;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=true;
		} else {
			this.actualizarEstadoPanelsNotasCreditos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNotasCreditos=false;
			//this.isVisibilidadCeldaVerFormNotasCreditos=false;
			this.isVisibilidadCeldaDuplicarNotasCreditos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!notascreditosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
		} else {
			this.isVisibilidadCeldaNuevoNotasCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosNotasCreditos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(notascreditosSessionBean.getEsGuardarRelacionado()) {
			if(!notascreditosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;												
			}
			
			this.jButtonCerrarNotasCreditos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
		}
		
		if(!this.permiteMantenimiento(this.notascreditos)) {
			this.isVisibilidadCeldaActualizarNotasCreditos=false;
			this.isVisibilidadCeldaEliminarNotasCreditos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoNotasCreditos=false;
		this.isVisibilidadCeldaNuevoRelacionesNotasCreditos=false;
		this.isVisibilidadCeldaGuardarCambiosNotasCreditos=false;
		//this.isVisibilidadCeldaModificarNotasCreditos=true;
		this.isVisibilidadCeldaActualizarNotasCreditos=false;
		this.isVisibilidadCeldaEliminarNotasCreditos=false;
		//this.isVisibilidadCeldaCancelarNotasCreditos=true;			
		this.isVisibilidadCeldaGuardarNotasCreditos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNotasCreditos() {
	}
	
	public void actualizarEstadoPanelsNotasCreditos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionNotasCreditos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNotasCreditos!=null) {
				this.jScrollPanelDatosNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionNotasCreditos!=null) {
				this.jPanelPaginacionNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionNotasCreditos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNotasCreditos!=null) {
				this.jScrollPanelDatosNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionNotasCreditos!=null) {
				this.jPanelPaginacionNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionNotasCreditos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNotasCreditos!=null) {
				this.jScrollPanelDatosNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionNotasCreditos!=null) {
				this.jPanelPaginacionNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionNotasCreditos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNotasCreditos!=null) {
				this.jScrollPanelDatosNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionNotasCreditos!=null) {
				this.jPanelPaginacionNotasCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionNotasCreditos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNotasCreditos!=null) {
				this.jScrollPanelDatosNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionNotasCreditos!=null) {
				this.jPanelPaginacionNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionNotasCreditos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNotasCreditos!=null) {
				this.jScrollPanelDatosNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionNotasCreditos!=null) {
				this.jPanelPaginacionNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNotasCreditos!=null) {
				this.jScrollPanelDatosEdicionNotasCreditos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNotasCreditos!=null) {
				this.jScrollPanelDatosNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionNotasCreditos!=null) {
				this.jPanelPaginacionNotasCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
					this.jTabbedPaneBusquedasNotasCreditos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNotasCreditos!=null) {
				this.jTabbedPaneBusquedasNotasCreditos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNotasCreditos!=null) {
				this.jPanelParametrosReportesNotasCreditos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaNotasCreditos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaNotasCreditos) {this.jTabbedPaneBusquedasNotasCreditos.remove(jPanelBusquedaNotasCreditosNotasCreditos);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNotasCreditos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNotasCreditos() {
		this.updateBorderResaltarBusquedasFormularioNotasCreditos();
		this.updateVisibilidadBusquedasFormularioNotasCreditos();
		this.updateHabilitarBusquedasFormularioNotasCreditos();
	}
	
	public void updateBorderResaltarBusquedasFormularioNotasCreditos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNotasCreditos.getComponents().length>0) {
	

		if(this.notascreditosConstantesFunciones.resaltarBusquedaNotasCreditosNotasCreditos!=null) {
			index= this.jTabbedPaneBusquedasNotasCreditos.indexOfComponent(this.jPanelBusquedaNotasCreditosNotasCreditos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNotasCreditos.getComponent(index);
				jPanel.setBorder(this.notascreditosConstantesFunciones.resaltarBusquedaNotasCreditosNotasCreditos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNotasCreditos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNotasCreditos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNotasCreditos.indexOfComponent(this.jPanelBusquedaNotasCreditosNotasCreditos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNotasCreditos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.notascreditosConstantesFunciones.mostrarBusquedaNotasCreditosNotasCreditos);
			if(!this.notascreditosConstantesFunciones.mostrarBusquedaNotasCreditosNotasCreditos && index>-1) {
				this.jTabbedPaneBusquedasNotasCreditos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNotasCreditos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNotasCreditos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNotasCreditos.indexOfComponent(this.jPanelBusquedaNotasCreditosNotasCreditos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNotasCreditos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.notascreditosConstantesFunciones.activarBusquedaNotasCreditosNotasCreditos);
				this.jTabbedPaneBusquedasNotasCreditos.setEnabledAt(index,this.notascreditosConstantesFunciones.activarBusquedaNotasCreditosNotasCreditos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNotasCreditos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaNotasCreditos")) {
			index= this.jTabbedPaneBusquedasNotasCreditos.indexOfComponent(this.jPanelBusquedaNotasCreditosNotasCreditos);

			this.jTabbedPaneBusquedasNotasCreditos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNotasCreditos.getComponent(index);

			this.notascreditosConstantesFunciones.setResaltarBusquedaNotasCreditosNotasCreditos(resaltar);

			jPanel.setBorder(this.notascreditosConstantesFunciones.resaltarBusquedaNotasCreditosNotasCreditos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarNotasCreditos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNotasCreditos() throws Exception {

		if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNotasCreditos();
		this.updateVisibilidadResaltarControlesFormularioNotasCreditos();
		this.updateHabilitarResaltarControlesFormularioNotasCreditos();
		
	}
	
	public void updateBorderResaltarControlesFormularioNotasCreditos() throws Exception {
		if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.notascreditosConstantesFunciones.resaltaridNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltaridNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarid_empresaNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarid_empresaNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarfecha_emision_desdeNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emision_desdeNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarfecha_emision_desdeNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarfecha_emision_hastaNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emision_hastaNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarfecha_emision_hastaNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarnombre_completo_clienteNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_completo_clienteNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarnombre_completo_clienteNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarnumero_pre_impreso_facturaNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impreso_facturaNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarnumero_pre_impreso_facturaNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarnumero_pre_impresoNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impresoNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarnumero_pre_impresoNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarfecha_emisionNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emisionNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarfecha_emisionNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarfecha_vencimientoNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_vencimientoNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarfecha_vencimientoNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarivaNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextFieldivaNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarivaNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltardescuento_valorNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextFielddescuento_valorNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltardescuento_valorNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarotro_valorNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextFieldotro_valorNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarotro_valorNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarsub_totalNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextFieldsub_totalNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarsub_totalNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltartotalNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextFieldtotalNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltartotalNotasCreditos);}
		if(this.notascreditosConstantesFunciones.resaltarnombre_estado_nota_creditoNotasCreditos!=null && this.jInternalFrameDetalleFormNotasCreditos!=null) {this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_estado_nota_creditoNotasCreditos.setBorder(this.notascreditosConstantesFunciones.resaltarnombre_estado_nota_creditoNotasCreditos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNotasCreditos() throws Exception {		
		if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
	
		//this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostraridNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelidNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostraridNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarid_empresaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelid_empresaNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarid_empresaNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emision_desdeNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarfecha_emision_desdeNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelfecha_emision_desdeNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarfecha_emision_desdeNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emision_hastaNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarfecha_emision_hastaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelfecha_emision_hastaNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarfecha_emision_hastaNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_completo_clienteNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarnombre_completo_clienteNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelnombre_completo_clienteNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarnombre_completo_clienteNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impreso_facturaNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarnumero_pre_impreso_facturaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelnumero_pre_impreso_facturaNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarnumero_pre_impreso_facturaNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impresoNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarnumero_pre_impresoNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelnumero_pre_impresoNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarnumero_pre_impresoNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emisionNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarfecha_emisionNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelfecha_emisionNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarfecha_emisionNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_vencimientoNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarfecha_vencimientoNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelfecha_vencimientoNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarfecha_vencimientoNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextFieldivaNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarivaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelivaNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarivaNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextFielddescuento_valorNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrardescuento_valorNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPaneldescuento_valorNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrardescuento_valorNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextFieldotro_valorNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarotro_valorNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelotro_valorNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarotro_valorNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextFieldsub_totalNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarsub_totalNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelsub_totalNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarsub_totalNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextFieldtotalNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrartotalNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPaneltotalNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrartotalNotasCreditos);
		//this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_estado_nota_creditoNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarnombre_estado_nota_creditoNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jPanelnombre_estado_nota_creditoNotasCreditos.setVisible(this.notascreditosConstantesFunciones.mostrarnombre_estado_nota_creditoNotasCreditos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNotasCreditos() throws Exception {
		if(this.jInternalFrameDetalleFormNotasCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNotasCreditos!=null) {
	
		this.jInternalFrameDetalleFormNotasCreditos.jLabelidNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activaridNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jComboBoxid_empresaNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarid_empresaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emision_desdeNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarfecha_emision_desdeNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emision_hastaNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarfecha_emision_hastaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_completo_clienteNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarnombre_completo_clienteNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impreso_facturaNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarnumero_pre_impreso_facturaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldnumero_pre_impresoNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarnumero_pre_impresoNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_emisionNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarfecha_emisionNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jDateChooserfecha_vencimientoNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarfecha_vencimientoNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldivaNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarivaNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFielddescuento_valorNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activardescuento_valorNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldotro_valorNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarotro_valorNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldsub_totalNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarsub_totalNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextFieldtotalNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activartotalNotasCreditos);
		this.jInternalFrameDetalleFormNotasCreditos.jTextAreanombre_estado_nota_creditoNotasCreditos.setEnabled(this.notascreditosConstantesFunciones.activarnombre_estado_nota_creditoNotasCreditos);
		}
	}
	
		
}