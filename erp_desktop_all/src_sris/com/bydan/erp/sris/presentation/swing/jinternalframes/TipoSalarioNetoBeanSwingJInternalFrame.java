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
package com.bydan.erp.sris.presentation.swing.jinternalframes;




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

import com.bydan.erp.sris.util.TipoSalarioNetoConstantesFunciones;
import com.bydan.erp.sris.util.TipoSalarioNetoParameterReturnGeneral;
//import com.bydan.erp.sris.util.TipoSalarioNetoParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.TipoSalarioNetoBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
public class TipoSalarioNetoBeanSwingJInternalFrame extends TipoSalarioNetoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoSalarioNetoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoSalarioNeto> tiposalarionetoValidator = new ClassValidator<TipoSalarioNeto>(TipoSalarioNeto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoSalarioNeto tiposalarioneto;	
	public TipoSalarioNeto tiposalarionetoAux;
	public TipoSalarioNeto tiposalarionetoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoSalarioNeto tiposalarionetoTotales;
	public Long idTipoSalarioNetoActual;
	public Long iIdNuevoTipoSalarioNeto=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoTipoSalarioNeto;
	public Boolean isPermisoNuevoTipoSalarioNeto;
	public Boolean isPermisoActualizarTipoSalarioNeto;
	public Boolean isPermisoActualizarOriginalTipoSalarioNeto;
	public Boolean isPermisoEliminarTipoSalarioNeto;
	public Boolean isPermisoGuardarCambiosTipoSalarioNeto;
	public Boolean isPermisoConsultaTipoSalarioNeto;
	public Boolean isPermisoBusquedaTipoSalarioNeto;
	public Boolean isPermisoReporteTipoSalarioNeto;
	public Boolean isPermisoPaginacionMedioTipoSalarioNeto;
	public Boolean isPermisoPaginacionAltoTipoSalarioNeto;
	public Boolean isPermisoPaginacionTodoTipoSalarioNeto;
	public Boolean isPermisoCopiarTipoSalarioNeto;
	public Boolean isPermisoVerFormTipoSalarioNeto;
	public Boolean isPermisoDuplicarTipoSalarioNeto;
	public Boolean isPermisoOrdenTipoSalarioNeto;
	
	
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
	
	public TipoSalarioNetoParameterReturnGeneral tiposalarionetoReturnGeneral;
	public TipoSalarioNetoParameterReturnGeneral tiposalarionetoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoSalarioNeto=false;
	public Boolean esParaAccionDesdeFormularioTipoSalarioNeto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoSalarioNetoSessionBeanAdditional tiposalarionetoSessionBeanAdditional=null;
	
	public TipoSalarioNetoSessionBeanAdditional getTipoSalarioNetoSessionBeanAdditional() {
		return this.tiposalarionetoSessionBeanAdditional;
	}
	
	public void setTipoSalarioNetoSessionBeanAdditional(TipoSalarioNetoSessionBeanAdditional tiposalarionetoSessionBeanAdditional) {
		try {
			this.tiposalarionetoSessionBeanAdditional=tiposalarionetoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoSalarioNetoBeanSwingJInternalFrameAdditional tiposalarionetoBeanSwingJInternalFrameAdditional=null;
	//public class TipoSalarioNetoBeanSwingJInternalFrame
	
	public TipoSalarioNetoBeanSwingJInternalFrameAdditional getTipoSalarioNetoBeanSwingJInternalFrameAdditional() {
		return this.tiposalarionetoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoSalarioNetoBeanSwingJInternalFrameAdditional(TipoSalarioNetoBeanSwingJInternalFrameAdditional tiposalarionetoBeanSwingJInternalFrameAdditional) {
		try {
			this.tiposalarionetoBeanSwingJInternalFrameAdditional=tiposalarionetoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoSalarioNetoLogic tiposalarionetoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoSalarioNeto tiposalarionetoBean;
	public TipoSalarioNetoConstantesFunciones tiposalarionetoConstantesFunciones;
	//public TipoSalarioNetoParameterReturnGeneral tiposalarionetoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoSalarioNeto> tiposalarionetos;	
	//public List<TipoSalarioNeto> tiposalarionetosEliminados;
	//public List<TipoSalarioNeto> tiposalarionetosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoSalarioNeto=false;
	public Boolean isVisibilidadCeldaDuplicarTipoSalarioNeto=true;
	public Boolean isVisibilidadCeldaCopiarTipoSalarioNeto=true;
	public Boolean isVisibilidadCeldaVerFormTipoSalarioNeto=true;
	public Boolean isVisibilidadCeldaOrdenTipoSalarioNeto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
	public Boolean isVisibilidadCeldaModificarTipoSalarioNeto=false;
	public Boolean isVisibilidadCeldaActualizarTipoSalarioNeto=false;
	public Boolean isVisibilidadCeldaEliminarTipoSalarioNeto=false;
	public Boolean isVisibilidadCeldaCancelarTipoSalarioNeto=false;
	public Boolean isVisibilidadCeldaGuardarTipoSalarioNeto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=false;	
	
	
	
	public Long getiIdNuevoTipoSalarioNeto() {
		return this.iIdNuevoTipoSalarioNeto;
	}

	public void setiIdNuevoTipoSalarioNeto(Long iIdNuevoTipoSalarioNeto) {
		this.iIdNuevoTipoSalarioNeto = iIdNuevoTipoSalarioNeto;
	}
	
	public Long getidTipoSalarioNetoActual() {
		return this.idTipoSalarioNetoActual;
	}

	public void setidTipoSalarioNetoActual(Long idTipoSalarioNetoActual) {
		this.idTipoSalarioNetoActual = idTipoSalarioNetoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoSalarioNeto gettiposalarioneto() {
		return this.tiposalarioneto;
	}

	public void settiposalarioneto(TipoSalarioNeto tiposalarioneto) {
		this.tiposalarioneto = tiposalarioneto;
	}
	
	public TipoSalarioNeto gettiposalarionetoAux() {
		return this.tiposalarionetoAux;
	}

	public void settiposalarionetoAux(TipoSalarioNeto tiposalarionetoAux) {
		this.tiposalarionetoAux = tiposalarionetoAux;
	}				
	
	public TipoSalarioNeto gettiposalarionetoAnterior() {
		return this.tiposalarionetoAnterior;
	}

	public void settiposalarionetoAnterior(TipoSalarioNeto tiposalarionetoAnterior) {
		this.tiposalarionetoAnterior = tiposalarionetoAnterior;
	}	
	
	public TipoSalarioNeto gettiposalarionetoTotales() {
		return this.tiposalarionetoTotales;
	}

	public void settiposalarionetoTotales(TipoSalarioNeto tiposalarionetoTotales) {
		this.tiposalarionetoTotales = tiposalarionetoTotales;
	}	
	
	public TipoSalarioNeto gettiposalarionetoBean() {
		return this.tiposalarionetoBean;
	}

	public void settiposalarionetoBean(TipoSalarioNeto tiposalarionetoBean) {
		this.tiposalarionetoBean = tiposalarionetoBean;
	}	
	
	public TipoSalarioNetoParameterReturnGeneral gettiposalarionetoReturnGeneral() {
		return this.tiposalarionetoReturnGeneral;
	}

	public void settiposalarionetoReturnGeneral(TipoSalarioNetoParameterReturnGeneral tiposalarionetoReturnGeneral) {
		this.tiposalarionetoReturnGeneral = tiposalarionetoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoSalarioNetoLogic getTipoSalarioNetoLogic()	{		
		return tiposalarionetoLogic;
	}

	public void setTipoSalarioNetoLogic(TipoSalarioNetoLogic tiposalarionetoLogic) {
		this.tiposalarionetoLogic = tiposalarionetoLogic;
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
	
	public Boolean getIsEsNuevoTipoSalarioNeto() {
		return isEsNuevoTipoSalarioNeto;
	}

	public void setIsEsNuevoTipoSalarioNeto(Boolean isEsNuevoTipoSalarioNeto) {
		this.isEsNuevoTipoSalarioNeto = isEsNuevoTipoSalarioNeto;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoSalarioNeto() {
		return esParaAccionDesdeFormularioTipoSalarioNeto;
	}
	
	public void setEsParaAccionDesdeFormularioTipoSalarioNeto(Boolean esParaAccionDesdeFormularioTipoSalarioNeto) {
		this.esParaAccionDesdeFormularioTipoSalarioNeto = esParaAccionDesdeFormularioTipoSalarioNeto;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoSalarioNeto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoSalarioNetoConstantesFunciones.refrescarForeignKeysDescripcionesTipoSalarioNeto(this.tiposalarionetoLogic.getTipoSalarioNetos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoSalarioNetoConstantesFunciones.refrescarForeignKeysDescripcionesTipoSalarioNeto(this.tiposalarionetos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiposalarionetoLogic.setTipoSalarioNetos(this.tiposalarionetos);
			tiposalarionetoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoSalarioNetoParameterReturnGeneral getTipoSalarioNetoParameterGeneral() {
		return this.tiposalarionetoParameterGeneral;
	}
	
	public void setTipoSalarioNetoParameterGeneral(TipoSalarioNetoParameterReturnGeneral tiposalarionetoParameterGeneral) {
		this.tiposalarionetoParameterGeneral = tiposalarionetoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoSalarioNeto() {
		return isPermisoTodoTipoSalarioNeto;
	}

	public void setIsPermisoTodoTipoSalarioNeto(Boolean isPermisoTodoTipoSalarioNeto) {
		this.isPermisoTodoTipoSalarioNeto = isPermisoTodoTipoSalarioNeto;
	}

	public Boolean getIsPermisoNuevoTipoSalarioNeto() {
		return isPermisoNuevoTipoSalarioNeto;
	}

	public void setIsPermisoNuevoTipoSalarioNeto(Boolean isPermisoNuevoTipoSalarioNeto) {
		this.isPermisoNuevoTipoSalarioNeto = isPermisoNuevoTipoSalarioNeto;
	}

	public Boolean getIsPermisoActualizarTipoSalarioNeto() {
		return isPermisoActualizarTipoSalarioNeto;
	}

	public void setIsPermisoActualizarTipoSalarioNeto(Boolean isPermisoActualizarTipoSalarioNeto) {
		this.isPermisoActualizarTipoSalarioNeto = isPermisoActualizarTipoSalarioNeto;
	}

	public Boolean getIsPermisoEliminarTipoSalarioNeto() {
		return isPermisoEliminarTipoSalarioNeto;
	}

	public void setIsPermisoEliminarTipoSalarioNeto(Boolean isPermisoEliminarTipoSalarioNeto) {
		this.isPermisoEliminarTipoSalarioNeto = isPermisoEliminarTipoSalarioNeto;
	}

	public Boolean getIsPermisoGuardarCambiosTipoSalarioNeto() {
		return isPermisoGuardarCambiosTipoSalarioNeto;
	}

	public void setIsPermisoGuardarCambiosTipoSalarioNeto(Boolean isPermisoGuardarCambiosTipoSalarioNeto) {
		this.isPermisoGuardarCambiosTipoSalarioNeto = isPermisoGuardarCambiosTipoSalarioNeto;
	}
	
	public Boolean getIsPermisoConsultaTipoSalarioNeto() {
		return isPermisoConsultaTipoSalarioNeto;
	}

	public void setIsPermisoConsultaTipoSalarioNeto(Boolean isPermisoConsultaTipoSalarioNeto) {
		this.isPermisoConsultaTipoSalarioNeto = isPermisoConsultaTipoSalarioNeto;
	}

	public Boolean getIsPermisoBusquedaTipoSalarioNeto() {
		return isPermisoBusquedaTipoSalarioNeto;
	}

	public void setIsPermisoBusquedaTipoSalarioNeto(Boolean isPermisoBusquedaTipoSalarioNeto) {
		this.isPermisoBusquedaTipoSalarioNeto = isPermisoBusquedaTipoSalarioNeto;
	}

	public Boolean getIsPermisoReporteTipoSalarioNeto() {
		return isPermisoReporteTipoSalarioNeto;
	}

	public void setIsPermisoReporteTipoSalarioNeto(Boolean isPermisoReporteTipoSalarioNeto) {
		this.isPermisoReporteTipoSalarioNeto = isPermisoReporteTipoSalarioNeto;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoSalarioNeto() {
		return isPermisoPaginacionMedioTipoSalarioNeto;
	}

	public void setIsPermisoPaginacionMedioTipoSalarioNeto(Boolean isPermisoPaginacionMedioTipoSalarioNeto) {
		this.isPermisoPaginacionMedioTipoSalarioNeto = isPermisoPaginacionMedioTipoSalarioNeto;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoSalarioNeto() {
		return isPermisoPaginacionTodoTipoSalarioNeto;
	}

	public void setIsPermisoPaginacionTodoTipoSalarioNeto(Boolean isPermisoPaginacionTodoTipoSalarioNeto) {
		this.isPermisoPaginacionTodoTipoSalarioNeto = isPermisoPaginacionTodoTipoSalarioNeto;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoSalarioNeto() {
		return isPermisoPaginacionAltoTipoSalarioNeto;
	}

	public void setIsPermisoPaginacionAltoTipoSalarioNeto(Boolean isPermisoPaginacionAltoTipoSalarioNeto) {
		this.isPermisoPaginacionAltoTipoSalarioNeto = isPermisoPaginacionAltoTipoSalarioNeto;
	}
	
	public Boolean getIsPermisoCopiarTipoSalarioNeto() {
		return isPermisoCopiarTipoSalarioNeto;
	}

	public void setIsPermisoCopiarTipoSalarioNeto(Boolean isPermisoCopiarTipoSalarioNeto) {
		this.isPermisoCopiarTipoSalarioNeto = isPermisoCopiarTipoSalarioNeto;
	}
	
	public Boolean getIsPermisoVerFormTipoSalarioNeto() {
		return isPermisoVerFormTipoSalarioNeto;
	}

	public void setIsPermisoVerFormTipoSalarioNeto(Boolean isPermisoVerFormTipoSalarioNeto) {
		this.isPermisoVerFormTipoSalarioNeto = isPermisoVerFormTipoSalarioNeto;
	}
	
	public Boolean getIsPermisoDuplicarTipoSalarioNeto() {
		return isPermisoDuplicarTipoSalarioNeto;
	}

	public void setIsPermisoDuplicarTipoSalarioNeto(Boolean isPermisoDuplicarTipoSalarioNeto) {
		this.isPermisoDuplicarTipoSalarioNeto = isPermisoDuplicarTipoSalarioNeto;
	}
	
	public Boolean getIsPermisoOrdenTipoSalarioNeto() {
		return isPermisoOrdenTipoSalarioNeto;
	}

	public void setIsPermisoOrdenTipoSalarioNeto(Boolean isPermisoOrdenTipoSalarioNeto) {
		this.isPermisoOrdenTipoSalarioNeto = isPermisoOrdenTipoSalarioNeto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoSalarioNeto() {
		return isVisibilidadCeldaNuevoTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaNuevoTipoSalarioNeto(Boolean isVisibilidadCeldaNuevoTipoSalarioNeto) {
		this.isVisibilidadCeldaNuevoTipoSalarioNeto = isVisibilidadCeldaNuevoTipoSalarioNeto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoSalarioNeto() {
		return isVisibilidadCeldaDuplicarTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaDuplicarTipoSalarioNeto(Boolean isVisibilidadCeldaDuplicarTipoSalarioNeto) {
		this.isVisibilidadCeldaDuplicarTipoSalarioNeto = isVisibilidadCeldaDuplicarTipoSalarioNeto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoSalarioNeto() {
		return isVisibilidadCeldaCopiarTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaCopiarTipoSalarioNeto(Boolean isVisibilidadCeldaCopiarTipoSalarioNeto) {
		this.isVisibilidadCeldaCopiarTipoSalarioNeto = isVisibilidadCeldaCopiarTipoSalarioNeto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoSalarioNeto() {
		return isVisibilidadCeldaVerFormTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaVerFormTipoSalarioNeto(Boolean isVisibilidadCeldaVerFormTipoSalarioNeto) {
		this.isVisibilidadCeldaVerFormTipoSalarioNeto = isVisibilidadCeldaVerFormTipoSalarioNeto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoSalarioNeto() {
		return isVisibilidadCeldaOrdenTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaOrdenTipoSalarioNeto(Boolean isVisibilidadCeldaOrdenTipoSalarioNeto) {
		this.isVisibilidadCeldaOrdenTipoSalarioNeto = isVisibilidadCeldaOrdenTipoSalarioNeto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoSalarioNeto() {
		return isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoSalarioNeto(Boolean isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto) {
		this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto = isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoSalarioNeto() {
		return isVisibilidadCeldaModificarTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaModificarTipoSalarioNeto(Boolean isVisibilidadCeldaModificarTipoSalarioNeto) {
		this.isVisibilidadCeldaModificarTipoSalarioNeto = isVisibilidadCeldaModificarTipoSalarioNeto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoSalarioNeto() {
		return isVisibilidadCeldaActualizarTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaActualizarTipoSalarioNeto(Boolean isVisibilidadCeldaActualizarTipoSalarioNeto) {
		this.isVisibilidadCeldaActualizarTipoSalarioNeto = isVisibilidadCeldaActualizarTipoSalarioNeto;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoSalarioNeto() {
		return isVisibilidadCeldaEliminarTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaEliminarTipoSalarioNeto(Boolean isVisibilidadCeldaEliminarTipoSalarioNeto) {
		this.isVisibilidadCeldaEliminarTipoSalarioNeto = isVisibilidadCeldaEliminarTipoSalarioNeto;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoSalarioNeto() {
		return isVisibilidadCeldaCancelarTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaCancelarTipoSalarioNeto(Boolean isVisibilidadCeldaCancelarTipoSalarioNeto) {
		this.isVisibilidadCeldaCancelarTipoSalarioNeto = isVisibilidadCeldaCancelarTipoSalarioNeto;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoSalarioNeto() {
		return isVisibilidadCeldaGuardarTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaGuardarTipoSalarioNeto(Boolean isVisibilidadCeldaGuardarTipoSalarioNeto) {
		this.isVisibilidadCeldaGuardarTipoSalarioNeto = isVisibilidadCeldaGuardarTipoSalarioNeto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoSalarioNeto() {
		return isVisibilidadCeldaGuardarCambiosTipoSalarioNeto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoSalarioNeto(Boolean isVisibilidadCeldaGuardarCambiosTipoSalarioNeto) {
		this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto = isVisibilidadCeldaGuardarCambiosTipoSalarioNeto;
	}
		
	public TipoSalarioNetoSessionBean gettiposalarionetoSessionBean() {
		return this.tiposalarionetoSessionBean;
	}
	
	public void settiposalarionetoSessionBean(TipoSalarioNetoSessionBean tiposalarionetoSessionBean) {
		this.tiposalarionetoSessionBean=tiposalarionetoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(TipoSalarioNeto tiposalarioneto)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoSalarioNeto tiposalarioneto,TipoSalarioNeto tiposalarionetoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoSalarioNeto(tiposalarioneto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiposalarionetoAux.setId(tiposalarioneto.getId());
		tiposalarionetoAux.setVersionRow(tiposalarioneto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoSalarioNeto();
		
			int intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.tiposalarioneto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiposalarionetoValidator.getInvalidValues(this.tiposalarioneto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiposalarionetoLogic.setDatosCliente(datosCliente);
			tiposalarionetoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiposalarionetoAux=new  TipoSalarioNeto();
				
				tiposalarionetoAux.setIsNew(true);
				tiposalarionetoAux.setIsChanged(true);
				
				tiposalarionetoAux.setTipoSalarioNetoOriginal(this.tiposalarioneto);
				
				tiposalarionetoAux.setId(this.tiposalarioneto.getId());	
				tiposalarionetoAux.setVersionRow(this.tiposalarioneto.getVersionRow());	
				tiposalarionetoAux.setnombre(this.tiposalarioneto.getnombre());	
				tiposalarionetoAux.setdescripcion(this.tiposalarioneto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposalarionetoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiposalarionetoAux,tiposalarionetoLogic.getTipoSalarioNetos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposalarionetoAux,tiposalarionetos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposalarionetoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposalarionetoLogic.saveTipoSalarioNetos();//WithConnection
						//tiposalarionetoLogic.getSetVersionRowTipoSalarioNetos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposalarioneto,tiposalarionetoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiposalarionetoAux=new  TipoSalarioNeto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado() 
					|| (this.tiposalarionetoSessionBean.getEsGuardarRelacionado() && this.tiposalarioneto.getId()>=0)) {
						
					tiposalarionetoAux.setIsNew(false);
				}
				
				tiposalarionetoAux.setIsDeleted(false);
			
				tiposalarionetoAux.setId(this.tiposalarioneto.getId());	
				tiposalarionetoAux.setVersionRow(this.tiposalarioneto.getVersionRow());	
				tiposalarionetoAux.setnombre(this.tiposalarioneto.getnombre());	
				tiposalarionetoAux.setdescripcion(this.tiposalarioneto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposalarionetoAux,tiposalarionetoLogic.getTipoSalarioNetos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposalarionetoAux,tiposalarionetos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposalarionetoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposalarionetoLogic.saveTipoSalarioNetos();//WithConnection
						//tiposalarionetoLogic.getSetVersionRowTipoSalarioNetos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposalarioneto,tiposalarionetoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiposalarionetoAux=new  TipoSalarioNeto();
				
				tiposalarionetoAux.setIsNew(false);
				tiposalarionetoAux.setIsChanged(false);
				
				tiposalarionetoAux.setIsDeleted(true);
				
				tiposalarionetoAux.setId(this.tiposalarioneto.getId());	
				tiposalarionetoAux.setVersionRow(this.tiposalarioneto.getVersionRow());	
				tiposalarionetoAux.setnombre(this.tiposalarioneto.getnombre());	
				tiposalarionetoAux.setdescripcion(this.tiposalarioneto.getdescripcion());	
				
				if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiposalarionetoAux.getId()>=0) {	
						this.tiposalarionetosEliminados.add(tiposalarionetoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiposalarionetoAux,tiposalarionetoLogic.getTipoSalarioNetos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposalarionetoAux,tiposalarionetos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposalarionetoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposalarionetoLogic.saveTipoSalarioNetos();//WithConnection
						//tiposalarionetoLogic.getSetVersionRowTipoSalarioNetos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiposalarionetoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiposalarionetoAux,tiposalarionetoLogic.getTipoSalarioNetos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiposalarionetoAux,tiposalarionetos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.getTipoSalarioNetos().addAll(this.tiposalarionetosEliminados);
					
					tiposalarionetoLogic.saveTipoSalarioNetos();//WithConnection
					//tiposalarionetoLogic.getSetVersionRowTipoSalarioNetos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiposalarionetosEliminados= new ArrayList<TipoSalarioNeto>();		
			}
			
			if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Salario Neto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiposalarioneto=tiposalarionetoAux;
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
      		//this.finishProcessTipoSalarioNeto();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoSalarioNeto tiposalarionetoLocal) throws Exception {
		
		if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoSalarioNeto tiposalarionetoLocal) throws Exception {	
		if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoSalarioNetoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiposalarionetoValidator.getInvalidValues(this.tiposalarioneto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoSalarioNeto tiposalarioneto,List<TipoSalarioNeto> tiposalarionetos) throws Exception {
		try	{		
			TipoSalarioNetoConstantesFunciones.actualizarLista(tiposalarioneto,tiposalarionetos,this.tiposalarionetoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoSalarioNeto tiposalarioneto,List<TipoSalarioNeto> tiposalarionetos) throws Exception {
		try	{			
			TipoSalarioNetoConstantesFunciones.actualizarSelectedLista(tiposalarioneto,tiposalarionetos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoSalarioNeto> tiposalarionetosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiposalarionetosLocal=this.tiposalarionetoLogic.getTipoSalarioNetos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiposalarionetosLocal=this.tiposalarionetos;
			}
			//ARCHITECTURE
		
			for(TipoSalarioNeto tiposalarionetoLocal:tiposalarionetosLocal) {
				if(this.permiteMantenimiento(tiposalarionetoLocal) && tiposalarionetoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoSalarioNetoConstantesFunciones.getTipoSalarioNetoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoSalarioNetoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSalarioNeto.jLabelnombreTipoSalarioNeto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSalarioNetoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSalarioNeto.jLabeldescripcionTipoSalarioNeto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSalarioNeto.jLabelnombreTipoSalarioNeto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSalarioNeto.jLabeldescripcionTipoSalarioNeto,"");
		
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
		this.iIdNuevoTipoSalarioNeto--;	
		
		
		this.tiposalarionetoAux=new TipoSalarioNeto();
		
		this.tiposalarionetoAux.setId(this.iIdNuevoTipoSalarioNeto);
		this.tiposalarionetoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposalarionetoLogic.getTipoSalarioNetos().add(this.tiposalarionetoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiposalarionetos.add(this.tiposalarionetoAux);
		}
		//ARCHITECTURE
		
		this.tiposalarioneto=this.tiposalarionetoAux;
		
		if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoSalarioNeto(this.tiposalarioneto);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSalarioNeto(this.tiposalarioneto);
		}
				
		//this.setDefaultControlesTipoSalarioNeto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoSalarioNeto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoSalarioNeto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSalarioNeto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSalarioNeto(this.tiposalarionetoBean,this.tiposalarioneto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
			classes=TipoSalarioNetoConstantesFunciones.getClassesRelationshipsOfTipoSalarioNeto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiposalarionetoReturnGeneral=tiposalarionetoLogic.procesarEventosTipoSalarioNetosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposalarionetoLogic.getTipoSalarioNetos(),this.tiposalarioneto,this.tiposalarionetoParameterGeneral,this.isEsNuevoTipoSalarioNeto,classes);//this.tiposalarionetoLogic.getTipoSalarioNeto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoSalarioNeto(this.tiposalarionetoReturnGeneral,this.tiposalarionetoBean,false);
		
		if(this.tiposalarionetoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSalarioNeto(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoSalarioNeto(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto());
		}
		
		if(this.tiposalarionetoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoSalarioNeto(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto(),classes);//this.tiposalarionetoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.tiposalarioneto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoSalarioNeto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoSalarioNeto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.RecargarFormTipoSalarioNeto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoSalarioNeto(false);
						
			if(tiposalarionetoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSalarioNeto();
			}
			
			this.actualizarVisualTableDatosTipoSalarioNeto();
			
			this.jTableDatosTipoSalarioNeto.setRowSelectionInterval(this.getIndiceNuevoTipoSalarioNeto(), this.getIndiceNuevoTipoSalarioNeto());
			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
						
			this.actualizarEstadoCeldasBotonesTipoSalarioNeto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoSalarioNeto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreanombreTipoSalarioNeto.setEnabled(isHabilitar && this.tiposalarionetoConstantesFunciones.activarnombreTipoSalarioNeto);
		this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreadescripcionTipoSalarioNeto.setEnabled(isHabilitar && this.tiposalarionetoConstantesFunciones.activardescripcionTipoSalarioNeto);	
		
	};
	
	public void setDefaultControlesTipoSalarioNeto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoSalarioNeto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiposalarionetoSessionBean.setConGuardarRelaciones(true);			
			this.tiposalarionetoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.setVisible(true);
			
					
		} else {
			//this.tiposalarionetoSessionBean.setConGuardarRelaciones(false);			
			this.tiposalarionetoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoSalarioNeto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
				if(tiposalarionetoAux.getId().equals(this.iIdNuevoTipoSalarioNeto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetos) {
				if(tiposalarionetoAux.getId().equals(this.iIdNuevoTipoSalarioNeto)) {
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
	
	public int getIndiceActualTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
				if(tiposalarionetoAux.getId().equals(tiposalarioneto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetos) {
				if(tiposalarionetoAux.getId().equals(tiposalarioneto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoSalarioNeto(TipoSalarioNeto tiposalarionetoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
				if(tiposalarionetoAux.getTipoSalarioNetoOriginal().getId().equals(tiposalarionetoOriginal.getId())) {
					existe=true;
					tiposalarionetoOriginal.setId(tiposalarionetoAux.getId());
					tiposalarionetoOriginal.setVersionRow(tiposalarionetoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetos) {
				if(tiposalarionetoAux.getTipoSalarioNetoOriginal().getId().equals(tiposalarionetoOriginal.getId())) {
					existe=true;
					tiposalarionetoOriginal.setId(tiposalarionetoAux.getId());
					tiposalarionetoOriginal.setVersionRow(tiposalarionetoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoSalarioNeto(Boolean esParaCancelar) throws Exception {
		tiposalarionetosAux=new ArrayList<TipoSalarioNeto>();
		tiposalarionetoAux=new TipoSalarioNeto();
		
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
					if(tiposalarionetoAux.getId()<0) {
						tiposalarionetosAux.add(tiposalarionetoAux);
					}		
				}
				this.iIdNuevoTipoSalarioNeto=0L;
				this.tiposalarionetoLogic.getTipoSalarioNetos().removeAll(tiposalarionetosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetos) {
					if(tiposalarionetoAux.getId()<0) {
						tiposalarionetosAux.add(tiposalarionetoAux);
					}		
				}
				this.iIdNuevoTipoSalarioNeto=0L;
				this.tiposalarionetos.removeAll(tiposalarionetosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoSalarioNeto 
					&& this.tiposalarionetoLogic.getTipoSalarioNetos().size()>0
					) {
					tiposalarionetoAux=this.tiposalarionetoLogic.getTipoSalarioNetos().get(this.tiposalarionetoLogic.getTipoSalarioNetos().size() - 1);
				
					if(tiposalarionetoAux.getId()<0) {
						this.tiposalarionetoLogic.getTipoSalarioNetos().remove(tiposalarionetoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoSalarioNeto && this.tiposalarionetos.size()>0) {
					tiposalarionetoAux=this.tiposalarionetos.get(this.tiposalarionetos.size() - 1);
				
					if(tiposalarionetoAux.getId()<0) {
						this.tiposalarionetos.remove(tiposalarionetoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoSalarioNeto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiposalarioneto.getId()<0) {
				this.tiposalarionetoLogic.getTipoSalarioNetos().remove(this.tiposalarioneto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiposalarioneto.getId()<0) {
				this.tiposalarionetos.remove(this.tiposalarioneto);
			}
		}			
	}
	
	public void setEstadosInicialesTipoSalarioNeto(List<TipoSalarioNeto> tiposalarionetosAux) throws Exception {
		TipoSalarioNetoConstantesFunciones.setEstadosInicialesTipoSalarioNeto(tiposalarionetosAux);
	}
	
	public void setEstadosInicialesTipoSalarioNeto(TipoSalarioNeto tiposalarionetoAux) throws Exception {
		TipoSalarioNetoConstantesFunciones.setEstadosInicialesTipoSalarioNeto(tiposalarionetoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoSalarioNetoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoSalarioNeto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoSalarioNetoActual()) {
				if(!this.isEsNuevoTipoSalarioNeto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoSalarioNeto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoSalarioNeto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoSalarioNetoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Salario Neto ?", "MANTENIMIENTO DE Tipo Salario Neto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoSalarioNeto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoSalarioNeto tiposalarioneto) throws Exception {
		TipoSalarioNetoConstantesFunciones.seleccionarAsignar(this.tiposalarioneto,tiposalarioneto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoSalarioNeto=this.isPermisoActualizarOriginalTipoSalarioNeto;
			
			
			this.seleccionarAsignar(tiposalarioneto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSalarioNetoConstantesFunciones.quitarEspaciosTipoSalarioNeto(this.tiposalarioneto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoSalarioNeto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiposalarionetoSessionBean.setsFuncionBusquedaRapida(this.tiposalarionetoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoSalarioNeto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoSalarioNeto(esParaCancelar);				
				this.cancelarNuevoTipoSalarioNeto(esParaCancelar);								
			}
			
			this.tiposalarioneto=new TipoSalarioNeto();
			
			this.inicializarTipoSalarioNeto();
			
			this.actualizarEstadoCeldasBotonesTipoSalarioNeto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoSalarioNeto() throws Exception {
		try {
			TipoSalarioNetoConstantesFunciones.inicializarTipoSalarioNeto(this.tiposalarioneto);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiposalarionetoLogic.getTipoSalarioNetos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoSalarioNetos(String sAccionBusqueda,List<TipoSalarioNeto> tiposalarionetosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoSalarioNeto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoSalarioNetoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoSalarioNetoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoSalarioNeto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Salario Netos");		
		parameters.put("busquedapor", TipoSalarioNetoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoSalarioNeto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoSalarioNetoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoSalarioNetoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoSalarioNeto=new JRBeanArrayDataSource(TipoSalarioNetoJInternalFrame.TraerTipoSalarioNetoBeans(tiposalarionetosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoSalarioNeto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoSalarioNetoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoSalarioNetoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoSalarioNetoBean.TraerTipoSalarioNetoBeans(tiposalarionetosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoSalarioNetos(sAccionBusqueda,sTipoArchivoReporte,tiposalarionetosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoSalarioNetos(sAccionBusqueda,sTipoArchivoReporte,tiposalarionetosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoSalarioNetoActionPerformed(null);
					//this.generarExcelReporteTipoSalarioNetos(sAccionBusqueda,sTipoArchivoReporte,tiposalarionetosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoSalarioNetos(sAccionBusqueda,sTipoArchivoReporte,tiposalarionetosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoSalarioNetos(sAccionBusqueda,sTipoArchivoReporte,tiposalarionetosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoSalarioNetos(sAccionBusqueda,sTipoArchivoReporte,tiposalarionetosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoSalarioNetos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSalarioNeto> tiposalarionetosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposalarioneto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSalarioNetos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSalarioNeto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoSalarioNeto tiposalarioneto : tiposalarionetosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoSalarioNetoConstantesFunciones.generarExcelReporteDataTipoSalarioNeto("NORMAL",row,workbook,tiposalarioneto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoSalarioNeto(String sTipo,Row row,Workbook workbook) {
		
		TipoSalarioNetoConstantesFunciones.generarExcelReporteHeaderTipoSalarioNeto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoSalarioNetos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSalarioNeto> tiposalarionetosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposalarioneto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSalarioNetos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoSalarioNeto tiposalarioneto : tiposalarionetosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoSalarioNetoConstantesFunciones.getTipoSalarioNetoDescripcion(tiposalarioneto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposalarioneto.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposalarioneto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoSalarioNetos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSalarioNeto> tiposalarionetosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoSalarioNeto> tiposalarionetosRespaldo=null;
		
		classes=TipoSalarioNetoConstantesFunciones.getClassesRelationshipsOfTipoSalarioNeto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiposalarionetoLogic.setDatosCliente(this.datosCliente);
		this.tiposalarionetoLogic.setDatosDeep(this.datosDeep);
		this.tiposalarionetoLogic.setIsConDeep(true);
		
		tiposalarionetosRespaldo=this.tiposalarionetoLogic.getTipoSalarioNetos();
		
		this.tiposalarionetoLogic.setTipoSalarioNetos(tiposalarionetosParaReportes);	
		this.tiposalarionetoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiposalarionetosParaReportes=this.tiposalarionetoLogic.getTipoSalarioNetos();
		this.tiposalarionetoLogic.setTipoSalarioNetos(tiposalarionetosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposalarioneto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSalarioNetos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSalarioNeto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoSalarioNeto tiposalarioneto : tiposalarionetosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoSalarioNeto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoSalarioNetoConstantesFunciones.generarExcelReporteDataTipoSalarioNeto("NORMAL",row,workbook,tiposalarioneto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoSalarioNetoConstantesFunciones.getTipoSalarioNetoDescripcion(tiposalarioneto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoSalarioNeto() throws Exception {		
		this.startProcessTipoSalarioNeto(true);
	}
	
	public void startProcessTipoSalarioNeto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoSalarioNeto, this.jScrollPanelDatosTipoSalarioNeto,this.jPanelPaginacionTipoSalarioNeto, this.jScrollPanelDatosEdicionTipoSalarioNeto, this.jPanelAccionesTipoSalarioNeto,this.jPanelAccionesFormularioTipoSalarioNeto,this.jmenuBarTipoSalarioNeto,this.jmenuBarDetalleTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,this.jTtoolBarDetalleTipoSalarioNeto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSalarioNeto=null; 
		
		final JPanel jPanelParametrosReportesTipoSalarioNeto=this.jPanelParametrosReportesTipoSalarioNeto;
		//final JScrollPane jScrollPanelDatosTipoSalarioNeto=this.jScrollPanelDatosTipoSalarioNeto;
		final JTable jTableDatosTipoSalarioNeto=this.jTableDatosTipoSalarioNeto;		
		final JPanel jPanelPaginacionTipoSalarioNeto=this.jPanelPaginacionTipoSalarioNeto;
		//final JScrollPane jScrollPanelDatosEdicionTipoSalarioNeto=this.jScrollPanelDatosEdicionTipoSalarioNeto;
		final JPanel jPanelAccionesTipoSalarioNeto=this.jPanelAccionesTipoSalarioNeto;
		
		JPanel jPanelCamposAuxiliarTipoSalarioNeto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoSalarioNeto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			jPanelCamposAuxiliarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jPanelCamposTipoSalarioNeto;
			jPanelAccionesFormularioAuxiliarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jPanelAccionesFormularioTipoSalarioNeto;
		}
		
		final JPanel jPanelCamposTipoSalarioNeto=jPanelCamposAuxiliarTipoSalarioNeto;
		final JPanel jPanelAccionesFormularioTipoSalarioNeto=jPanelAccionesFormularioAuxiliarTipoSalarioNeto;
		
		
		final JMenuBar jmenuBarTipoSalarioNeto=this.jmenuBarTipoSalarioNeto;
		final JToolBar jTtoolBarTipoSalarioNeto=this.jTtoolBarTipoSalarioNeto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoSalarioNeto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSalarioNeto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			jmenuBarDetalleAuxiliarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jmenuBarDetalleTipoSalarioNeto;
			jTtoolBarDetalleAuxiliarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jTtoolBarDetalleTipoSalarioNeto;
		}
		
		final JMenuBar jmenuBarDetalleTipoSalarioNeto=jmenuBarDetalleAuxiliarTipoSalarioNeto;
		final JToolBar jTtoolBarDetalleTipoSalarioNeto=jTtoolBarDetalleAuxiliarTipoSalarioNeto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSalarioNeto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSalarioNeto;
			processRunnable.jTableDatos=jTableDatosTipoSalarioNeto;
			processRunnable.jPanelCampos=jPanelCamposTipoSalarioNeto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSalarioNeto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSalarioNeto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSalarioNeto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSalarioNeto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSalarioNeto;
			processRunnable.jTtoolBar=jTtoolBarTipoSalarioNeto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSalarioNeto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSalarioNeto ,jPanelParametrosReportesTipoSalarioNeto,jTableDatosTipoSalarioNeto, /*jScrollPanelDatosTipoSalarioNeto,*/jPanelCamposTipoSalarioNeto,jPanelPaginacionTipoSalarioNeto, /*jScrollPanelDatosEdicionTipoSalarioNeto,*/ jPanelAccionesTipoSalarioNeto,jPanelAccionesFormularioTipoSalarioNeto,jmenuBarTipoSalarioNeto,jmenuBarDetalleTipoSalarioNeto,jTtoolBarTipoSalarioNeto,jTtoolBarDetalleTipoSalarioNeto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoSalarioNeto, jScrollPanelDatosTipoSalarioNeto,jPanelPaginacionTipoSalarioNeto, jScrollPanelDatosEdicionTipoSalarioNeto, jPanelAccionesTipoSalarioNeto,jPanelAccionesFormularioTipoSalarioNeto,jmenuBarTipoSalarioNeto,jmenuBarDetalleTipoSalarioNeto,jTtoolBarTipoSalarioNeto,jTtoolBarDetalleTipoSalarioNeto);
						
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
	
	public void finishProcessTipoSalarioNeto() {// throws Exception 
		this.finishProcessTipoSalarioNeto(true);
	}
	
	public void finishProcessTipoSalarioNeto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoSalarioNeto, this.jScrollPanelDatosTipoSalarioNeto,this.jPanelPaginacionTipoSalarioNeto, this.jScrollPanelDatosEdicionTipoSalarioNeto, this.jPanelAccionesTipoSalarioNeto,this.jPanelAccionesFormularioTipoSalarioNeto,this.jmenuBarTipoSalarioNeto,this.jmenuBarDetalleTipoSalarioNeto,this.jTtoolBarTipoSalarioNeto,this.jTtoolBarDetalleTipoSalarioNeto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSalarioNeto=null; 
		
		final JPanel jPanelParametrosReportesTipoSalarioNeto=this.jPanelParametrosReportesTipoSalarioNeto;
		//final JScrollPane jScrollPanelDatosTipoSalarioNeto=this.jScrollPanelDatosTipoSalarioNeto;
		final JTable jTableDatosTipoSalarioNeto=this.jTableDatosTipoSalarioNeto;		
		final JPanel jPanelPaginacionTipoSalarioNeto=this.jPanelPaginacionTipoSalarioNeto;
		//final JScrollPane jScrollPanelDatosEdicionTipoSalarioNeto=this.jScrollPanelDatosEdicionTipoSalarioNeto;
		final JPanel jPanelAccionesTipoSalarioNeto=this.jPanelAccionesTipoSalarioNeto;
		
		JPanel jPanelCamposAuxiliarTipoSalarioNeto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoSalarioNeto=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			jPanelCamposAuxiliarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jPanelCamposTipoSalarioNeto;
			jPanelAccionesFormularioAuxiliarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jPanelAccionesFormularioTipoSalarioNeto;
		}
		
		final JPanel jPanelCamposTipoSalarioNeto=jPanelCamposAuxiliarTipoSalarioNeto;
		final JPanel jPanelAccionesFormularioTipoSalarioNeto=jPanelAccionesFormularioAuxiliarTipoSalarioNeto;
		
		
		final JMenuBar jmenuBarTipoSalarioNeto=this.jmenuBarTipoSalarioNeto;		
		final JToolBar jTtoolBarTipoSalarioNeto=this.jTtoolBarTipoSalarioNeto;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoSalarioNeto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSalarioNeto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			jmenuBarDetalleAuxiliarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jmenuBarDetalleTipoSalarioNeto;
			jTtoolBarDetalleAuxiliarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jTtoolBarDetalleTipoSalarioNeto;		
		}
		
		final JMenuBar jmenuBarDetalleTipoSalarioNeto=jmenuBarDetalleAuxiliarTipoSalarioNeto;
		final JToolBar jTtoolBarDetalleTipoSalarioNeto=jTtoolBarDetalleAuxiliarTipoSalarioNeto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSalarioNeto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSalarioNeto;
			processRunnable.jTableDatos=jTableDatosTipoSalarioNeto;
			processRunnable.jPanelCampos=jPanelCamposTipoSalarioNeto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSalarioNeto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSalarioNeto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSalarioNeto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSalarioNeto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSalarioNeto;
			processRunnable.jTtoolBar=jTtoolBarTipoSalarioNeto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSalarioNeto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoSalarioNeto ,jPanelParametrosReportesTipoSalarioNeto, jTableDatosTipoSalarioNeto,/*jScrollPanelDatosTipoSalarioNeto,*/jPanelCamposTipoSalarioNeto,jPanelPaginacionTipoSalarioNeto, /*jScrollPanelDatosEdicionTipoSalarioNeto,*/ jPanelAccionesTipoSalarioNeto,jPanelAccionesFormularioTipoSalarioNeto,jmenuBarTipoSalarioNeto,jmenuBarDetalleTipoSalarioNeto,jTtoolBarTipoSalarioNeto,jTtoolBarDetalleTipoSalarioNeto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoSalarioNeto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoSalarioNeto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoSalarioNeto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoSalarioNeto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoSalarioNeto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoSalarioNeto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoSalarioNeto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoSalarioNeto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoSalarioNeto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiposalarionetoConstantesFunciones.getsFinalQueryTipoSalarioNeto();
		String  finalQueryPaginacionTodos=this.tiposalarionetoConstantesFunciones.getsFinalQueryTipoSalarioNeto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoSalarioNetoConstantesFunciones.getArrayColumnasGlobalesNoTipoSalarioNeto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoSalarioNetoConstantesFunciones.getArrayColumnasGlobalesTipoSalarioNeto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoSalarioNetoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiposalarionetosEliminados= new ArrayList<TipoSalarioNeto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoSalarioNeto();
		
				///*TipoSalarioNetoSessionBean*/this.tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean();
			
			if(this.tiposalarionetoSessionBean==null) {
				this.tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean();
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
					this.iNumeroPaginacion=TipoSalarioNetoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoSalarioNetoConstantesFunciones.getClassesForeignKeysOfTipoSalarioNeto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiposalarioneto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiposalarionetosAux= new ArrayList<TipoSalarioNeto>();
			
				
			tiposalarionetoLogic.setDatosCliente(this.datosCliente);
			tiposalarionetoLogic.setDatosDeep(this.datosDeep);
			tiposalarionetoLogic.setIsConDeep(true);
			
			
			tiposalarionetoLogic.getTipoSalarioNetoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiposalarionetoLogic.getTodosTipoSalarioNetos(finalQueryGlobal,pagination);
					
					//tiposalarionetoLogic.getTodosTipoSalarioNetosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiposalarionetoLogic.getTipoSalarioNetos()==null|| tiposalarionetoLogic.getTipoSalarioNetos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposalarionetosAux= new ArrayList<TipoSalarioNeto>();
							tiposalarionetosAux.addAll(tiposalarionetoLogic.getTipoSalarioNetos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposalarionetosAux= new ArrayList<TipoSalarioNeto>();
							tiposalarionetosAux.addAll(tiposalarionetos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposalarionetoLogic.getTodosTipoSalarioNetos(finalQueryGlobal+"",this.pagination);												
							
							//tiposalarionetoLogic.getTodosTipoSalarioNetosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoSalarioNetos("Todos",tiposalarionetoLogic.getTipoSalarioNetos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposalarionetoLogic.setTipoSalarioNetos(new ArrayList<TipoSalarioNeto>());					
							tiposalarionetoLogic.getTipoSalarioNetos().addAll(tiposalarionetosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposalarionetos=new ArrayList<TipoSalarioNeto>();
							tiposalarionetos.addAll(tiposalarionetosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoSalarioNeto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoSalarioNeto=this.idActual;
				
				} else if(this.idTipoSalarioNetoActual!=null && this.idTipoSalarioNetoActual!=0L) {
					idTipoSalarioNeto=idTipoSalarioNetoActual;
				}
				
					
				this.sDetalleReporte=TipoSalarioNetoConstantesFunciones.getDetalleIndicePorId(idTipoSalarioNeto);
				
				this.tiposalarionetos=new ArrayList<TipoSalarioNeto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiposalarionetoLogic.getEntity(idTipoSalarioNeto);
					
					//tiposalarionetoLogic.getEntityWithConnection(idTipoSalarioNeto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposalarionetoLogic.setTipoSalarioNetos(new ArrayList<TipoSalarioNeto>());
					tiposalarionetoLogic.getTipoSalarioNetos().add(tiposalarionetoLogic.getTipoSalarioNeto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposalarionetos=new ArrayList<TipoSalarioNeto>();
					this.tiposalarionetos.add(tiposalarioneto);
				}
				
				if(tiposalarionetoLogic.getTipoSalarioNeto()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoSalarioNeto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoSalarioNeto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposalarionetoLogic.getTipoSalarioNetos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposalarionetos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposalarionetoLogic.getTipoSalarioNetos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposalarionetos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoSalarioNeto tiposalarioneto) {
		Boolean permite=true;
		
		if(this.tiposalarioneto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoSalarioNetoConstantesFunciones.getOrderByListaTipoSalarioNeto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoSalarioNetoConstantesFunciones.getOrderByListaTipoSalarioNeto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSalarioNeto tiposalarioneto:tiposalarionetoLogic.getTipoSalarioNetos()) {
				if(tiposalarioneto.getsType().equals(Constantes2.S_TOTALES)) {
					tiposalarionetoTotales=tiposalarioneto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSalarioNeto tiposalarioneto:this.tiposalarionetos) {
				if(tiposalarioneto.getsType().equals(Constantes2.S_TOTALES)) {
					tiposalarionetoTotales=tiposalarioneto;
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
			this.tiposalarionetoAux=new TipoSalarioNeto();
			this.tiposalarionetoAux.setsType(Constantes2.S_TOTALES);
			this.tiposalarionetoAux.setIsNew(false);
			this.tiposalarionetoAux.setIsChanged(false);
			this.tiposalarionetoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoSalarioNetoConstantesFunciones.TotalizarValoresFilaTipoSalarioNeto(this.tiposalarionetoLogic.getTipoSalarioNetos(),this.tiposalarionetoAux);
				
				this.tiposalarionetoLogic.getTipoSalarioNetos().add(this.tiposalarionetoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoSalarioNetoConstantesFunciones.TotalizarValoresFilaTipoSalarioNeto(this.tiposalarionetos,this.tiposalarionetoAux);
				
				this.tiposalarionetos.add(this.tiposalarionetoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiposalarionetoTotales=new TipoSalarioNeto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposalarionetoLogic.getTipoSalarioNetos().remove(tiposalarionetoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposalarionetos.remove(tiposalarionetoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiposalarionetoTotales=new TipoSalarioNeto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSalarioNeto tiposalarioneto:tiposalarionetoLogic.getTipoSalarioNetos()) {
				if(tiposalarioneto.getsType().equals(Constantes2.S_TOTALES)) {
					tiposalarionetoTotales=tiposalarioneto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSalarioNetoConstantesFunciones.TotalizarValoresFilaTipoSalarioNeto(this.tiposalarionetoLogic.getTipoSalarioNetos(),tiposalarionetoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSalarioNeto tiposalarioneto:this.tiposalarionetos) {
				if(tiposalarioneto.getsType().equals(Constantes2.S_TOTALES)) {
					tiposalarionetoTotales=tiposalarioneto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSalarioNetoConstantesFunciones.TotalizarValoresFilaTipoSalarioNeto(this.tiposalarionetos,tiposalarionetoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoSalarioNeto() {
		this.isPermisoTodoTipoSalarioNeto=false;
		this.isPermisoNuevoTipoSalarioNeto=false;
		this.isPermisoActualizarTipoSalarioNeto=false;
		this.isPermisoActualizarOriginalTipoSalarioNeto=false;
		this.isPermisoEliminarTipoSalarioNeto=false;
		this.isPermisoGuardarCambiosTipoSalarioNeto=false;
		this.isPermisoConsultaTipoSalarioNeto=false;
		this.isPermisoBusquedaTipoSalarioNeto=false;
		this.isPermisoReporteTipoSalarioNeto=false;		
		this.isPermisoOrdenTipoSalarioNeto=false;		
		this.isPermisoPaginacionMedioTipoSalarioNeto=false;		
		this.isPermisoPaginacionAltoTipoSalarioNeto=false;
		this.isPermisoPaginacionTodoTipoSalarioNeto=false;
		this.isPermisoCopiarTipoSalarioNeto=false;		
		this.isPermisoVerFormTipoSalarioNeto=false;		
		this.isPermisoDuplicarTipoSalarioNeto=false;		
		this.isPermisoOrdenTipoSalarioNeto=false;		
	}
	
	public void setPermisosUsuarioTipoSalarioNeto(Boolean isPermiso) {
		this.isPermisoTodoTipoSalarioNeto=isPermiso;
		this.isPermisoNuevoTipoSalarioNeto=isPermiso;
		this.isPermisoActualizarTipoSalarioNeto=isPermiso;
		this.isPermisoActualizarOriginalTipoSalarioNeto=isPermiso;
		this.isPermisoEliminarTipoSalarioNeto=isPermiso;
		this.isPermisoGuardarCambiosTipoSalarioNeto=isPermiso;
		this.isPermisoConsultaTipoSalarioNeto=isPermiso;
		this.isPermisoBusquedaTipoSalarioNeto=isPermiso;
		this.isPermisoReporteTipoSalarioNeto=isPermiso;
		this.isPermisoOrdenTipoSalarioNeto=isPermiso;		
		this.isPermisoPaginacionMedioTipoSalarioNeto=isPermiso;		
		this.isPermisoPaginacionAltoTipoSalarioNeto=isPermiso;		
		this.isPermisoPaginacionTodoTipoSalarioNeto=isPermiso;		
		this.isPermisoCopiarTipoSalarioNeto=isPermiso;		
		this.isPermisoVerFormTipoSalarioNeto=isPermiso;		
		this.isPermisoDuplicarTipoSalarioNeto=isPermiso;
		this.isPermisoOrdenTipoSalarioNeto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoSalarioNeto(Boolean isPermiso) {
		//this.isPermisoTodoTipoSalarioNeto=isPermiso;
		this.isPermisoNuevoTipoSalarioNeto=isPermiso;
		this.isPermisoActualizarTipoSalarioNeto=isPermiso;
		this.isPermisoActualizarOriginalTipoSalarioNeto=isPermiso;
		this.isPermisoEliminarTipoSalarioNeto=isPermiso;
		this.isPermisoGuardarCambiosTipoSalarioNeto=isPermiso;
		//this.isPermisoConsultaTipoSalarioNeto=isPermiso;
		//this.isPermisoBusquedaTipoSalarioNeto=isPermiso;
		//this.isPermisoReporteTipoSalarioNeto=isPermiso;
		//this.isPermisoOrdenTipoSalarioNeto=isPermiso;		
		//this.isPermisoPaginacionMedioTipoSalarioNeto=isPermiso;		
		//this.isPermisoPaginacionAltoTipoSalarioNeto=isPermiso;		
		//this.isPermisoPaginacionTodoTipoSalarioNeto=isPermiso;		
		//this.isPermisoCopiarTipoSalarioNeto=isPermiso;		
		//this.isPermisoDuplicarTipoSalarioNeto=isPermiso;
		//this.isPermisoOrdenTipoSalarioNeto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoSalarioNetoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoSalarioNetoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoSalarioNeto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoSalarioNetoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoSalarioNetoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoSalarioNetoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoSalarioNetoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoSalarioNeto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoSalarioNetoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoSalarioNetoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoSalarioNeto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoSalarioNeto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoSalarioNeto=this.isPermisoActualizarTipoSalarioNeto;
			this.isPermisoEliminarTipoSalarioNeto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoSalarioNeto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoSalarioNeto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoSalarioNeto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoSalarioNeto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoSalarioNeto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSalarioNeto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoSalarioNeto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoSalarioNeto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoSalarioNeto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoSalarioNeto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoSalarioNeto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoSalarioNeto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSalarioNeto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoSalarioNeto.setToolTipText(this.jTableDatosTipoSalarioNeto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoSalarioNeto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoSalarioNeto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoSalarioNetoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoSalarioNetoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoSalarioNeto() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoSalarioNetoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoSalarioNetoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoSalarioNetoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoSalarioNetoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoSalarioNetoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoSalarioNeto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoSalarioNeto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoSalarioNeto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoSalarioNeto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSalarioNeto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoSalarioNeto(TipoSalarioNeto tiposalarioneto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoSalarioNeto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSalarioNeto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoSalarioNeto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoSalarioNeto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoSalarioNeto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoSalarioNeto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoSalarioNeto(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoSalarioNeto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoSalarioNetoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoSalarioNetoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoSalarioNetoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean(); 
		this.tiposalarionetoConstantesFunciones=new TipoSalarioNetoConstantesFunciones(); 
		this.tiposalarionetoBean=new TipoSalarioNeto();//(this.tiposalarionetoConstantesFunciones); 		
		this.tiposalarionetoReturnGeneral=new TipoSalarioNetoParameterReturnGeneral(); 
		
		this.tiposalarionetoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposalarionetoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoSalarioNetoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoSalarioNetoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoSalarioNetoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoSalarioNeto(true);
			
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
			
			this.tiposalarionetoConstantesFunciones=new TipoSalarioNetoConstantesFunciones(); 
			this.tiposalarionetoBean=new TipoSalarioNeto();//this.tiposalarionetoConstantesFunciones); 			
			this.tiposalarionetoReturnGeneral=new TipoSalarioNetoParameterReturnGeneral(); 
		
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Salario Neto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiposalarioneto=new TipoSalarioNeto();
			this.tiposalarionetos = new ArrayList<TipoSalarioNeto>();
			this.tiposalarionetosAux = new ArrayList<TipoSalarioNeto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic=new TipoSalarioNetoLogic();
				this.tiposalarionetoLogic.getNewConnexionToDeep("");
			}
			
			//this.tiposalarionetoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiposalarionetoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoSalarioNeto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSalarioNeto);	
					}
					
					if(this.jInternalFrameImportacionTipoSalarioNeto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSalarioNeto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoSalarioNeto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoSalarioNeto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSalarioNeto);
				this.jInternalFrameDetalleFormTipoSalarioNeto.setVisible(false);
				this.jInternalFrameDetalleFormTipoSalarioNeto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSalarioNeto);
					this.jInternalFrameReporteDinamicoTipoSalarioNeto.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoSalarioNeto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoSalarioNeto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoSalarioNeto);
					this.jInternalFrameImportacionTipoSalarioNeto.setVisible(false);
					this.jInternalFrameImportacionTipoSalarioNeto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoSalarioNeto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoSalarioNeto);
					this.jInternalFrameOrderByTipoSalarioNeto.setVisible(false);
					this.jInternalFrameOrderByTipoSalarioNeto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoSalarioNetoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoSalarioNetoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiposalarionetoReturnGeneral=new TipoSalarioNetoParameterReturnGeneral();
			
			this.tiposalarionetoParameterGeneral=new TipoSalarioNetoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiposalarionetoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoSalarioNetoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSalarioNetoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposalarionetoSessionBean.getEsGuardarRelacionado(),this.tiposalarionetoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSalarioNetoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposalarionetoSessionBean.getEsGuardarRelacionado(),this.tiposalarionetoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=false;
			this.isVisibilidadCeldaDuplicarTipoSalarioNeto=true;
			this.isVisibilidadCeldaCopiarTipoSalarioNeto=true;
			this.isVisibilidadCeldaVerFormTipoSalarioNeto=true;
			this.isVisibilidadCeldaOrdenTipoSalarioNeto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
			this.isVisibilidadCeldaModificarTipoSalarioNeto=false;
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=false;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=false;
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=false;
			this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoSalarioNeto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoSalarioNeto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoSalarioNeto(false);
			
			this.setPermisosUsuarioTipoSalarioNeto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado() 
				|| (this.tiposalarionetoSessionBean.getEsGuardarRelacionado() && this.tiposalarionetoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoSalarioNetoClasesRelacionadas();
			}
			
			if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoSalarioNetoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoSalarioNeto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoSalarioNeto();
			}
			
			if(!this.isPermisoBusquedaTipoSalarioNeto) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoSalarioNeto,this.isPermisoPaginacionMedioTipoSalarioNeto,this.isPermisoPaginacionTodoTipoSalarioNeto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoSalarioNetoConstantesFunciones.getTiposSeleccionarTipoSalarioNeto());
				
				this.tiposColumnasSelect=TipoSalarioNetoConstantesFunciones.getTiposSeleccionarTipoSalarioNeto(true);
				
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
			//if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoSalarioNeto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoSalarioNeto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoSalarioNeto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSalarioNeto() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tiposalarionetoImplementable= (TipoSalarioNetoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSalarioNetoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiposalarionetoImplementableHome= (TipoSalarioNetoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSalarioNetoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiposalarionetos= new ArrayList<TipoSalarioNeto>();
			this.tiposalarionetosEliminados= new ArrayList<TipoSalarioNeto>();
						
			this.isEsNuevoTipoSalarioNeto=false;
			this.esParaAccionDesdeFormularioTipoSalarioNeto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoSalarioNeto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoSalarioNeto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoSalarioNetoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoSalarioNeto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoSalarioNeto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoSalarioNeto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoSalarioNeto();
			}
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoSalarioNeto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoSalarioNeto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoSalarioNeto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoSalarioNeto")) {
				iIndex=this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoSalarioNeto();	
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
	
	public void cargarCombosForeignKeyTipoSalarioNeto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoSalarioNeto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoSalarioNeto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoSalarioNetoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoSalarioNeto();
		
		this.cargarCombosFrameForeignKeyTipoSalarioNeto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoSalarioNeto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoSalarioNeto();
		}
	}
	
	
	
	public void jButtonNuevoTipoSalarioNetoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
			
			if(jTableDatosTipoSalarioNeto.getRowCount()>=1) {
				jTableDatosTipoSalarioNeto.removeRowSelectionInterval(0, jTableDatosTipoSalarioNeto.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoSalarioNeto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoSalarioNeto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoSalarioNeto(true);			
			//this.tiposalarioneto=new TipoSalarioNeto();
			//this.tiposalarioneto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSalarioNeto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSalarioNeto() ;
			
			if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSalarioNeto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiposalarioneto);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);				
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
			if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoSalarioNeto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoSalarioNetoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoSalarioNeto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoSalarioNeto.getSelectedRows().length;			
			}
			
			tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoSalarioNeto--;			
				//TipoSalarioNeto tiposalarionetoAux= new TipoSalarioNeto();			
				//tiposalarionetoAux.setId(this.iIdNuevoTipoSalarioNeto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoSalarioNeto tiposalarionetoOrigen=new TipoSalarioNeto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoSalarioNeto tiposalarionetoOrigen : tiposalarionetosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiposalarionetoOrigen =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposalarionetoOrigen =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoSalarioNeto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiposalarioneto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoSalarioNeto(tiposalarionetoOrigen,this.tiposalarioneto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposalarionetoLogic.getTipoSalarioNetos().add(this.tiposalarionetoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposalarionetos.add(this.tiposalarionetoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
				
				this.jTableDatosTipoSalarioNeto.setRowSelectionInterval(this.getIndiceNuevoTipoSalarioNeto(), this.getIndiceNuevoTipoSalarioNeto());
				
				int iLastRow =  this.jTableDatosTipoSalarioNeto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSalarioNeto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSalarioNeto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();									
		
			TipoSalarioNeto tiposalarionetoOrigen=new TipoSalarioNeto();
			TipoSalarioNeto tiposalarionetoDestino=new TipoSalarioNeto();
				
			tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoSalarioNeto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiposalarionetosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoSalarioNeto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposalarionetoOrigen =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposalarionetoOrigen =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposalarionetoDestino =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposalarionetoDestino =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiposalarionetoOrigen =tiposalarionetosSeleccionados.get(0);
				tiposalarionetoDestino =tiposalarionetosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoSalarioNeto(tiposalarionetoOrigen,tiposalarionetoDestino,true,false);
				
				tiposalarionetoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposalarionetoDestino,tiposalarionetoLogic.getTipoSalarioNetos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposalarionetoDestino,tiposalarionetos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
				
				//this.jTableDatosTipoSalarioNeto.setRowSelectionInterval(this.getIndiceNuevoTipoSalarioNeto(), this.getIndiceNuevoTipoSalarioNeto());
				
				int iLastRow =  this.jTableDatosTipoSalarioNeto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSalarioNeto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSalarioNeto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoSalarioNeto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoSalarioNeto.isVisible();
			
			
			this.jPanelParametrosReportesTipoSalarioNeto.setVisible(!isVisible);
			this.jPanelPaginacionTipoSalarioNeto.setVisible(!isVisible);
			this.jPanelAccionesTipoSalarioNeto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoSalarioNeto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoSalarioNeto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoSalarioNeto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoSalarioNeto();
			
			this.abrirFrameOrderByTipoSalarioNeto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoSalarioNeto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoSalarioNeto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSalarioNeto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoSalarioNeto.isMaximum()) {
					this.jInternalFrameDetalleFormTipoSalarioNeto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoSalarioNeto.setSize(this.jInternalFrameDetalleFormTipoSalarioNeto.iWidthFormulario,this.jInternalFrameDetalleFormTipoSalarioNeto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoSalarioNeto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoSalarioNeto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoSalarioNeto.isMaximum()) {
						this.jInternalFrameDetalleFormTipoSalarioNeto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoSalarioNeto.jContentPaneDetalleTipoSalarioNeto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoSalarioNeto.jContentPaneDetalleTipoSalarioNeto.getWidth(),TipoSalarioNetoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoSalarioNeto.jContentPaneDetalleTipoSalarioNeto.getWidth(),TipoSalarioNetoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoSalarioNeto.jContentPaneDetalleTipoSalarioNeto.getWidth(),TipoSalarioNetoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoSalarioNeto.setVisible(true);
	        this.jInternalFrameDetalleFormTipoSalarioNeto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoSalarioNeto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoSalarioNeto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoSalarioNeto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSalarioNeto,false,this);
				} else {
					this.jInternalFrameOrderByTipoSalarioNeto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSalarioNeto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoSalarioNeto);
				this.jInternalFrameOrderByTipoSalarioNeto.setVisible(false);
				this.jInternalFrameOrderByTipoSalarioNeto.setSelected(false);
				
				this.jInternalFrameOrderByTipoSalarioNeto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSalarioNeto"));
				
				this.inicializarActualizarBindingTablaOrderByTipoSalarioNeto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoSalarioNeto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoSalarioNeto==null) {
				
				this.jInternalFrameImportacionTipoSalarioNeto=new ImportacionJInternalFrame(TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSalarioNeto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoSalarioNeto);
				this.jInternalFrameImportacionTipoSalarioNeto.setVisible(false);
				this.jInternalFrameImportacionTipoSalarioNeto.setSelected(false);


				this.jInternalFrameImportacionTipoSalarioNeto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSalarioNeto"));
				this.jInternalFrameImportacionTipoSalarioNeto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSalarioNeto"));
				this.jInternalFrameImportacionTipoSalarioNeto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSalarioNeto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoSalarioNeto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoSalarioNeto==null) {
				this.jInternalFrameReporteDinamicoTipoSalarioNeto=new ReporteDinamicoJInternalFrame(TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSalarioNeto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSalarioNeto);
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSalarioNeto"));
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSalarioNeto"));
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSalarioNeto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSalarioNeto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoSalarioNeto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSalarioNeto);
			
	       	this.jInternalFrameDetalleFormTipoSalarioNeto.setVisible(false);
	        this.jInternalFrameDetalleFormTipoSalarioNeto.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoSalarioNeto.dispose();
			//this.jInternalFrameDetalleFormTipoSalarioNeto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoSalarioNeto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoSalarioNeto.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoSalarioNeto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoSalarioNeto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoSalarioNeto.setVisible(true);
	        this.jInternalFrameImportacionTipoSalarioNeto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoSalarioNeto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoSalarioNeto.setVisible(true);
	        this.jInternalFrameOrderByTipoSalarioNeto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoSalarioNeto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoSalarioNeto.setVisible(false);
	        this.jInternalFrameOrderByTipoSalarioNeto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoSalarioNeto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoSalarioNeto.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoSalarioNeto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoSalarioNeto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoSalarioNeto.setVisible(false);
	        this.jInternalFrameImportacionTipoSalarioNeto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoSalarioNeto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoSalarioNeto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoSalarioNeto(true);
			//this.isEsNuevoTipoSalarioNeto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoSalarioNeto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSalarioNeto(false) ;
			
			if(tiposalarionetoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSalarioNeto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSalarioNeto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoSalarioNetoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoSalarioNeto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoSalarioNeto(true);
			//this.isEsNuevoTipoSalarioNeto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiposalarioneto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoSalarioNeto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoSalarioNeto(false) ;
			
			if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSalarioNeto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSalarioNeto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoSalarioNeto(false);
			
			//if(!this.isEsNuevoTipoSalarioNeto) {								
				int intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.tiposalarioneto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
				
			}
			
			if(this.permiteMantenimiento(this.tiposalarioneto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoSalarioNeto=true;
					this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
					this.isEsNuevoTipoSalarioNeto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoSalarioNeto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoSalarioNeto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSalarioNeto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSalarioNeto(false);
				
				this.habilitarDeshabilitarControlesTipoSalarioNeto(false);
			
												
				
				if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoSalarioNeto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoSalarioNetoActionPerformed(evt,tiposalarionetoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoSalarioNeto(this.tiposalarioneto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoSalarioNeto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiposalarionetoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiposalarioneto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				this.tiposalarioneto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				this.tiposalarioneto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiposalarioneto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoSalarioNetoModel) this.jTableDatosTipoSalarioNeto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoSalarioNeto=true;
				this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
				this.isEsNuevoTipoSalarioNeto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSalarioNeto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSalarioNeto(false);
				
				this.habilitarDeshabilitarControlesTipoSalarioNeto(false);
				
				
				
				if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoSalarioNeto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoSalarioNeto.getRowCount()>=1) {
				jTableDatosTipoSalarioNeto.removeRowSelectionInterval(0, jTableDatosTipoSalarioNeto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoSalarioNeto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSalarioNeto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSalarioNeto(false) ;
			
			this.isEsNuevoTipoSalarioNeto=false;
			
			if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoSalarioNeto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoSalarioNeto(false);
				
				//SI ES MANUAL
				if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoSalarioNeto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoSalarioNeto--;			
			//TipoSalarioNeto tiposalarionetoAux= new TipoSalarioNeto();			
			//tiposalarionetoAux.setId(this.iIdNuevoTipoSalarioNeto);
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoSalarioNeto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
			
			this.tiposalarioneto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiposalarionetoLogic.getTipoSalarioNetos().add(this.tiposalarionetoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiposalarionetos.add(this.tiposalarionetoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
			
			this.jTableDatosTipoSalarioNeto.setRowSelectionInterval(this.getIndiceNuevoTipoSalarioNeto(), this.getIndiceNuevoTipoSalarioNeto());
			
			int iLastRow =  this.jTableDatosTipoSalarioNeto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoSalarioNeto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoSalarioNeto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoSalarioNeto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSalarioNeto(false);
			
			//SI ES MANUAL
			if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSalarioNeto();
			}
			
			//this.abrirFrameTreeTipoSalarioNeto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Salario NetoS ?", "MANTENIMIENTO DE Tipo Salario Neto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoSalarioNeto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoSalarioNeto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiposalarionetoReturnGeneral=tiposalarionetoLogic.procesarImportacionTipoSalarioNetosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiposalarionetoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoSalarioNetoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoSalarioNeto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoSalarioNeto.setFileImportacion(this.jInternalFrameImportacionTipoSalarioNeto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoSalarioNeto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoSalarioNeto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoSalarioNeto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoSalarioNeto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		

		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoSalarioNetoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoSalarioNetoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoSalarioNetos("Todos",tiposalarionetosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposalarioneto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoSalarioNetos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoSalarioNeto tiposalarioneto:tiposalarionetosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposalarioneto.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoSalarioNeto tiposalarioneto:tiposalarionetosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposalarioneto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoSalarioNeto(row);				
			//	iRow++;
			//}				
			
			//for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoSalarioNeto(tiposalarionetoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiposalarionetoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSalarioNeto(false);
			
			//SI ES MANUAL
			if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSalarioNeto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSalarioNeto(false);
			
			//SI ES MANUAL
			if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSalarioNeto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoSalarioNetoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSalarioNeto(false);
			
			//SI ES MANUAL
			if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSalarioNeto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposalarionetoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoSalarioNeto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoSalarioNeto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoSalarioNeto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoSalarioNeto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoSalarioNeto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoSalarioNeto.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoSalarioNeto.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoSalarioNeto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoSalarioNeto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoSalarioNeto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoSalarioNeto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoSalarioNeto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoSalarioNeto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoSalarioNeto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSalarioNeto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoSalarioNeto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoSalarioNeto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoSalarioNeto();
		
		this.inicializarActualizarBindingBotonesManualTipoSalarioNeto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSalarioNeto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSalarioNeto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSalarioNeto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSalarioNeto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoSalarioNeto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoSalarioNeto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoSalarioNeto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoSalarioNeto.jCheckBoxPostAccionNuevoTipoSalarioNeto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoSalarioNeto.jCheckBoxPostAccionSinCerrarTipoSalarioNeto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoSalarioNeto.jCheckBoxPostAccionSinMensajeTipoSalarioNeto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoSalarioNeto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoSalarioNeto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoSalarioNeto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
				this.jInternalFrameDetalleFormTipoSalarioNeto.jCheckBoxPostAccionNuevoTipoSalarioNeto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoSalarioNeto.jCheckBoxPostAccionSinCerrarTipoSalarioNeto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoSalarioNeto.jCheckBoxPostAccionSinMensajeTipoSalarioNeto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoSalarioNeto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoSalarioNeto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoSalarioNeto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoSalarioNeto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoSalarioNeto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoSalarioNeto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoSalarioNeto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoSalarioNeto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoSalarioNeto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoSalarioNeto(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSalarioNeto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoSalarioNeto() throws Exception {
		try	{
			if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSalarioNeto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSalarioNeto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSalarioNeto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoSalarioNeto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoSalarioNeto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoSalarioNeto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoSalarioNeto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoSalarioNeto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoSalarioNeto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoSalarioNeto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoSalarioNeto.addItem(reporte);
			}
			
			
			if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoSalarioNeto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoSalarioNeto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoSalarioNeto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoSalarioNeto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoSalarioNeto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoSalarioNeto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoSalarioNeto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoSalarioNeto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoSalarioNeto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSalarioNeto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSalarioNeto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoSalarioNeto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoSalarioNeto(Boolean esInicializar) throws Exception {				
		if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSalarioNeto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoSalarioNeto() throws Exception {
		this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoSalarioNeto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoSalarioNetoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoSalarioNetoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoSalarioNetoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSalarioNetoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoSalarioNetoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoSalarioNetoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoSalarioNeto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiposalarionetoLogic.getTipoSalarioNetos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiposalarionetos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoSalarioNeto.setModel(new TipoSalarioNetoModel(this.tiposalarionetoLogic.getTipoSalarioNetos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoSalarioNeto.setModel(new TipoSalarioNetoModel(this.tiposalarionetos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoSalarioNeto!=null && this.jInternalFrameOrderByTipoSalarioNeto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoSalarioNeto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoSalarioNeto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSalarioNeto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoSalarioNetoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO,tiposalarionetoConstantesFunciones.resaltarSeleccionarTipoSalarioNeto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoSalarioNetoConstantesFunciones.SCLASSWEBTITULO,tiposalarionetoConstantesFunciones.resaltarSeleccionarTipoSalarioNeto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoSalarioNeto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSalarioNeto,TipoSalarioNetoConstantesFunciones.LABEL_ID));

		if(this.tiposalarionetoConstantesFunciones.mostraridTipoSalarioNeto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSalarioNetoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiposalarionetoConstantesFunciones.resaltaridTipoSalarioNeto,this.tiposalarionetoConstantesFunciones.activaridTipoSalarioNeto,this,true,"idTipoSalarioNeto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposalarionetoConstantesFunciones.resaltaridTipoSalarioNeto,this.tiposalarionetoConstantesFunciones.activaridTipoSalarioNeto,this,true,"idTipoSalarioNeto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSalarioNeto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSalarioNeto,TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE));

		if(this.tiposalarionetoConstantesFunciones.mostrarnombreTipoSalarioNeto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposalarionetoConstantesFunciones.resaltarnombreTipoSalarioNeto,this.tiposalarionetoConstantesFunciones.activarnombreTipoSalarioNeto,this,true,"nombreTipoSalarioNeto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposalarionetoConstantesFunciones.resaltarnombreTipoSalarioNeto,this.tiposalarionetoConstantesFunciones.activarnombreTipoSalarioNeto,this,true,"nombreTipoSalarioNeto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSalarioNetoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSalarioNeto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSalarioNeto,TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tiposalarionetoConstantesFunciones.mostrardescripcionTipoSalarioNeto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposalarionetoConstantesFunciones.resaltardescripcionTipoSalarioNeto,this.tiposalarionetoConstantesFunciones.activardescripcionTipoSalarioNeto,this,true,"descripcionTipoSalarioNeto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposalarionetoConstantesFunciones.resaltardescripcionTipoSalarioNeto,this.tiposalarionetoConstantesFunciones.activardescripcionTipoSalarioNeto,this,true,"descripcionTipoSalarioNeto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSalarioNetoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposalarionetoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposalarionetoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSalarioNeto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposalarionetoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposalarionetoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSalarioNeto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiposalarionetoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiposalarionetoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoSalarioNeto.addColumn(tableColumn);
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
			
			this.jTableDatosTipoSalarioNeto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoSalarioNeto.moveColumn(this.jTableDatosTipoSalarioNeto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoSalarioNeto.moveColumn(this.jTableDatosTipoSalarioNeto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoSalarioNeto.moveColumn(this.jTableDatosTipoSalarioNeto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoSalarioNeto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoSalarioNeto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoSalarioNeto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoSalarioNeto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoSalarioNeto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoSalarioNeto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoSalarioNeto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoSalarioNeto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiposalarionetoLogic.getTipoSalarioNetos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiposalarionetos.size()-1;
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
		//this.jTableDatosTipoSalarioNeto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoSalarioNeto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoSalarioNeto();
			
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
				
				//this.isEsNuevoTipoSalarioNeto=false;
					
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
				if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSalarioNeto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSalarioNeto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiposalarioneto.getsType().equals("DUPLICADO")
				   || this.tiposalarioneto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoSalarioNeto=true;
				
				} else {
					this.isEsNuevoTipoSalarioNeto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
					if(this.tiposalarioneto.getId()>=0 && !this.tiposalarioneto.getIsNew()) {						
						this.isEsNuevoTipoSalarioNeto=false;
						
					} else {
						this.isEsNuevoTipoSalarioNeto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoSalarioNeto(esRelaciones);						
				
				this.seleccionarTipoSalarioNeto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiposalarioneto.getId()<0) {
					this.isEsNuevoTipoSalarioNeto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoSalarioNeto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoSalarioNeto(evt,rowIndex);
				}	
				
				if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoSalarioNeto: " + this.dDif); 
					}
				}								
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoSalarioNeto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiposalarioneto)) {
					if(this.tiposalarioneto.getId()>0) {
						this.tiposalarioneto.setIsDeleted(true);
						
						this.tiposalarionetosEliminados.add(this.tiposalarioneto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposalarionetoLogic.getTipoSalarioNetos().remove(this.tiposalarioneto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposalarionetos.remove(this.tiposalarioneto);				
					}
					
					
					((TipoSalarioNetoModel) this.jTableDatosTipoSalarioNeto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSalarioNeto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoSalarioNeto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoSalarioNeto) {
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSalarioNeto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSalarioNeto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoSalarioNeto(this.tiposalarioneto);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoSalarioNeto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoSalarioNeto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSalarioNeto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSalarioNeto(TipoSalarioNeto tiposalarioneto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoSalarioNeto(tiposalarioneto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoSalarioNeto(tiposalarioneto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoSalarioNeto(tiposalarioneto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoSalarioNeto(tiposalarioneto);
	}
	
	public void setVariablesObjetoActualToFormularioTipoSalarioNeto(TipoSalarioNeto tiposalarioneto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.setText(tiposalarioneto.getId().toString());
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreanombreTipoSalarioNeto.setText(tiposalarioneto.getnombre());
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreadescripcionTipoSalarioNeto.setText(tiposalarioneto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoSalarioNeto tiposalarionetoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiposalarionetoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoSalarioNeto tiposalarionetoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiposalarionetoLocal=this.tiposalarioneto;
			} else {
				tiposalarionetoLocal=this.tiposalarionetoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiposalarionetoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoSalarioNeto(tiposalarionetoLocal,true);
					
					if(tiposalarionetoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiposalarionetoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiposalarionetoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSalarioNeto(tiposalarioneto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(tiposalarioneto);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSalarioNeto(tiposalarioneto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.getText()==null || this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.getText()=="" || this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.setText("0");
			}

			if(conColumnasBase) {tiposalarioneto.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSalarioNetoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSalarioNeto.jLabelIdTipoSalarioNeto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposalarioneto.setnombre(this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreanombreTipoSalarioNeto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSalarioNeto.jLabelnombreTipoSalarioNeto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposalarioneto.setdescripcion(this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreadescripcionTipoSalarioNeto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSalarioNeto.jLabeldescripcionTipoSalarioNeto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSalarioNeto(TipoSalarioNeto tiposalarionetoBean,TipoSalarioNeto tiposalarioneto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoSalarioNeto(TipoSalarioNeto tiposalarionetoOrigen,TipoSalarioNeto tiposalarioneto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposalarionetoOrigen.getId()!=null && !tiposalarionetoOrigen.getId().equals(0L))) {tiposalarioneto.setId(tiposalarionetoOrigen.getId());}}
			if(conDefault || (!conDefault && tiposalarionetoOrigen.getnombre()!=null && !tiposalarionetoOrigen.getnombre().equals(""))) {tiposalarioneto.setnombre(tiposalarionetoOrigen.getnombre());}
			if(conDefault || (!conDefault && tiposalarionetoOrigen.getdescripcion()!=null && !tiposalarionetoOrigen.getdescripcion().equals(""))) {tiposalarioneto.setdescripcion(tiposalarionetoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSalarioNeto(TipoSalarioNeto tiposalarioneto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.setText(tiposalarioneto.getId().toString());
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreanombreTipoSalarioNeto.setText(tiposalarioneto.getnombre());
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreadescripcionTipoSalarioNeto.setText(tiposalarioneto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSalarioNeto(TipoSalarioNetoBean tiposalarionetoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.setText(tiposalarionetoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreanombreTipoSalarioNeto.setText(tiposalarionetoBean.getnombre());
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreadescripcionTipoSalarioNeto.setText(tiposalarionetoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoSalarioNeto(TipoSalarioNetoParameterReturnGeneral tiposalarionetoReturnGeneral,TipoSalarioNetoBean tiposalarionetoBean,Boolean conDefault) throws Exception { 
		try {
			TipoSalarioNeto tiposalarionetoLocal=new TipoSalarioNeto();
			
			tiposalarionetoLocal=tiposalarionetoReturnGeneral.getTipoSalarioNeto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposalarionetoLocal.getId()!=null && !tiposalarionetoLocal.getId().equals(0L))) {tiposalarionetoBean.setId(tiposalarionetoLocal.getId());}}
			if(conDefault || (!conDefault && tiposalarionetoLocal.getnombre()!=null && !tiposalarionetoLocal.getnombre().equals(""))) {tiposalarionetoBean.setnombre(tiposalarionetoLocal.getnombre());}
			if(conDefault || (!conDefault && tiposalarionetoLocal.getdescripcion()!=null && !tiposalarionetoLocal.getdescripcion().equals(""))) {tiposalarionetoBean.setdescripcion(tiposalarionetoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoSalarioNetoGenerico(Long idTipoSalarioNetoSeleccionado,JComboBox jComboBoxTipoSalarioNeto,List<TipoSalarioNeto> tiposalarionetosLocal)throws Exception {
		try {
			TipoSalarioNeto  tiposalarionetoTemp=null;

			for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetosLocal) {
				if(tiposalarionetoAux.getId()!=null && tiposalarionetoAux.getId().equals(idTipoSalarioNetoSeleccionado)) {
					tiposalarionetoTemp=tiposalarionetoAux;
					break;
				}
			}

			jComboBoxTipoSalarioNeto.setSelectedItem(tiposalarionetoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoSalarioNetoGenerico(JComboBox jComboBoxTipoSalarioNeto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoSalarioNeto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSalarioNeto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoSalarioNeto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSalarioNeto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSalarioNeto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoSalarioNeto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSalarioNeto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoSalarioNeto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoSalarioNeto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoSalarioNeto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposalarioneto=(TipoSalarioNeto) tiposalarionetoLogic.getTipoSalarioNetos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposalarioneto =(TipoSalarioNeto) tiposalarionetos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoSalarioNeto tiposalarionetoRow=new TipoSalarioNeto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposalarionetoRow=(TipoSalarioNeto) tiposalarionetoLogic.getTipoSalarioNetos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposalarionetoRow=(TipoSalarioNeto) tiposalarionetos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoSalarioNeto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto));			
			this.jButtonDuplicarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaDuplicarTipoSalarioNeto && this.isPermisoDuplicarTipoSalarioNeto));			
			this.jButtonCopiarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaCopiarTipoSalarioNeto && this.isPermisoCopiarTipoSalarioNeto));
			this.jButtonVerFormTipoSalarioNeto.setVisible((this.isVisibilidadCeldaVerFormTipoSalarioNeto && this.isPermisoVerFormTipoSalarioNeto));
			
			this.jButtonAbrirOrderByTipoSalarioNeto.setVisible((this.isVisibilidadCeldaOrdenTipoSalarioNeto && this.isPermisoOrdenTipoSalarioNeto));			
			
			this.jButtonNuevoRelacionesTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto));			
			this.jButtonNuevoGuardarCambiosTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaModificarTipoSalarioNeto && this.isPermisoActualizarTipoSalarioNeto));	
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaActualizarTipoSalarioNeto && this.isPermisoActualizarTipoSalarioNeto));	
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaEliminarTipoSalarioNeto && this.isPermisoEliminarTipoSalarioNeto));
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarTipoSalarioNeto.setVisible(this.isVisibilidadCeldaCancelarTipoSalarioNeto);							
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosTipoSalarioNeto.setVisible((this.isVisibilidadCeldaGuardarTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoSalarioNeto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto));						
			this.jButtonDuplicarToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaDuplicarTipoSalarioNeto && this.isPermisoDuplicarTipoSalarioNeto));						
			this.jButtonCopiarToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaCopiarTipoSalarioNeto && this.isPermisoCopiarTipoSalarioNeto));			
			this.jButtonVerFormToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaVerFormTipoSalarioNeto && this.isPermisoVerFormTipoSalarioNeto));			
			this.jButtonAbrirOrderByToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaOrdenTipoSalarioNeto && this.isPermisoOrdenTipoSalarioNeto));
			this.jButtonNuevoRelacionesToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto));			
			this.jButtonNuevoGuardarCambiosToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));			
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaModificarTipoSalarioNeto && this.isPermisoActualizarTipoSalarioNeto));	
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaActualizarTipoSalarioNeto  && this.isPermisoActualizarTipoSalarioNeto));	
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaEliminarTipoSalarioNeto && this.isPermisoEliminarTipoSalarioNeto));
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarToolBarTipoSalarioNeto.setVisible(this.isVisibilidadCeldaCancelarTipoSalarioNeto);				
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaGuardarTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto));			
			this.jMenuItemDuplicarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaDuplicarTipoSalarioNeto && this.isPermisoDuplicarTipoSalarioNeto));			
			this.jMenuItemCopiarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaCopiarTipoSalarioNeto && this.isPermisoCopiarTipoSalarioNeto));			
			this.jMenuItemVerFormTipoSalarioNeto.setVisible((this.isVisibilidadCeldaVerFormTipoSalarioNeto && this.isPermisoVerFormTipoSalarioNeto));			
			this.jMenuItemAbrirOrderByTipoSalarioNeto.setVisible((this.isVisibilidadCeldaOrdenTipoSalarioNeto && this.isPermisoOrdenTipoSalarioNeto));			
			//this.jMenuItemMostrarOcultarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaOrdenTipoSalarioNeto && this.isPermisoOrdenTipoSalarioNeto));
			this.jMenuItemDetalleAbrirOrderByTipoSalarioNeto.setVisible((this.isVisibilidadCeldaOrdenTipoSalarioNeto && this.isPermisoOrdenTipoSalarioNeto));			
			//this.jMenuItemDetalleMostrarOcultarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaOrdenTipoSalarioNeto && this.isPermisoOrdenTipoSalarioNeto));			
			this.jMenuItemNuevoRelacionesTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto));			
			this.jMenuItemNuevoGuardarCambiosTipoSalarioNeto.setVisible((this.isVisibilidadCeldaNuevoTipoSalarioNeto && this.isPermisoNuevoTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));									
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemModificarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaModificarTipoSalarioNeto && this.isPermisoActualizarTipoSalarioNeto));	
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemActualizarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaActualizarTipoSalarioNeto && this.isPermisoActualizarTipoSalarioNeto));	
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemEliminarTipoSalarioNeto.setVisible((this.isVisibilidadCeldaEliminarTipoSalarioNeto && this.isPermisoEliminarTipoSalarioNeto));
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemCancelarTipoSalarioNeto.setVisible(this.isVisibilidadCeldaCancelarTipoSalarioNeto);				
			}
			
			this.jMenuItemGuardarCambiosTipoSalarioNeto.setVisible((this.isVisibilidadCeldaGuardarTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));						
			this.jMenuItemGuardarCambiosTablaTipoSalarioNeto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=this.jButtonNuevoTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaDuplicarTipoSalarioNeto=this.jButtonDuplicarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaCopiarTipoSalarioNeto=this.jButtonCopiarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaVerFormTipoSalarioNeto=this.jButtonVerFormTipoSalarioNeto.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoSalarioNeto=this.jButtonAbrirOrderByTipoSalarioNeto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=this.jButtonNuevoRelacionesTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaModificarTipoSalarioNeto=this.jButtonModificarTipoSalarioNeto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaGuardarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosTipoSalarioNeto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=this.jButtonGuardarCambiosTablaTipoSalarioNeto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=this.jButtonNuevoToolBarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=this.jButtonNuevoRelacionesToolBarTipoSalarioNeto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			this.isVisibilidadCeldaModificarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarToolBarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarToolBarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarToolBarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarToolBarTipoSalarioNeto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSalarioNeto=this.jButtonGuardarCambiosToolBarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=this.jButtonGuardarCambiosTablaToolBarTipoSalarioNeto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=this.jMenuItemNuevoTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=this.jMenuItemNuevoRelacionesTipoSalarioNeto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			this.isVisibilidadCeldaModificarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemModificarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemActualizarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemEliminarTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemCancelarTipoSalarioNeto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSalarioNeto=this.jMenuItemGuardarCambiosTipoSalarioNeto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=this.jMenuItemGuardarCambiosTablaTipoSalarioNeto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoSalarioNeto(Boolean esInicializar) {
		if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
				//if(this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSalarioNeto();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoSalarioNeto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoSalarioNeto() {
		this.jButtonNuevoTipoSalarioNeto.setVisible(this.isPermisoNuevoTipoSalarioNeto);			
		this.jButtonDuplicarTipoSalarioNeto.setVisible(this.isPermisoDuplicarTipoSalarioNeto);			
		this.jButtonCopiarTipoSalarioNeto.setVisible(this.isPermisoCopiarTipoSalarioNeto);			
		this.jButtonVerFormTipoSalarioNeto.setVisible(this.isPermisoVerFormTipoSalarioNeto);			
		
		this.jButtonAbrirOrderByTipoSalarioNeto.setVisible(this.isPermisoOrdenTipoSalarioNeto);					
		
		this.jButtonNuevoRelacionesTipoSalarioNeto.setVisible(this.isPermisoNuevoTipoSalarioNeto);			
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarTipoSalarioNeto.setVisible(this.isPermisoActualizarTipoSalarioNeto);	
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarTipoSalarioNeto.setVisible(this.isPermisoActualizarTipoSalarioNeto);	
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarTipoSalarioNeto.setVisible(this.isPermisoEliminarTipoSalarioNeto);
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarTipoSalarioNeto.setVisible(this.isVisibilidadCeldaCancelarTipoSalarioNeto);						
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosTipoSalarioNeto.setVisible(this.isPermisoGuardarCambiosTipoSalarioNeto);							
		}
		
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.setVisible(this.isPermisoActualizarTipoSalarioNeto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSalarioNeto() {
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarTipoSalarioNeto.setVisible(this.isPermisoActualizarTipoSalarioNeto);	
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarTipoSalarioNeto.setVisible(this.isPermisoActualizarTipoSalarioNeto);	
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarTipoSalarioNeto.setVisible(this.isPermisoEliminarTipoSalarioNeto);
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarTipoSalarioNeto.setVisible(this.isVisibilidadCeldaCancelarTipoSalarioNeto);							
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosTipoSalarioNeto.setVisible((this.isVisibilidadCeldaGuardarTipoSalarioNeto && this.isPermisoGuardarCambiosTipoSalarioNeto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoSalarioNeto() {
		if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoSalarioNeto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoSalarioNeto() {
	}
	
	public void jTableDatosTipoSalarioNetoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoSalarioNeto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoSalarioNetoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.gettiposalarioneto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposalarioneto==null) {
						this.tiposalarioneto = new TipoSalarioNeto();
					}

					this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.tiposalarioneto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
				}

				if(this.tiposalarioneto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiposalarioneto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSalarioNeto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoSalarioNetoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.gettiposalarioneto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposalarioneto==null) {
						this.tiposalarioneto = new TipoSalarioNeto();
					}

					this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.tiposalarioneto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
				}

				if(this.tiposalarioneto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiposalarioneto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSalarioNeto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoSalarioNetoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.gettiposalarioneto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposalarioneto==null) {
						this.tiposalarioneto = new TipoSalarioNeto();
					}

					this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.tiposalarioneto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);
				}

				if(this.tiposalarioneto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tiposalarioneto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSalarioNeto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoSalarioNeto() {
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoSalarioNeto.dispose();
			this.jInternalFrameDetalleFormTipoSalarioNeto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
			this.jInternalFrameReporteDinamicoTipoSalarioNeto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoSalarioNeto.dispose();
			this.jInternalFrameReporteDinamicoTipoSalarioNeto=null;
		}
		
		if(this.jInternalFrameImportacionTipoSalarioNeto!=null) {
			this.jInternalFrameImportacionTipoSalarioNeto.setVisible(false);	    			
			this.jInternalFrameImportacionTipoSalarioNeto.dispose();
			this.jInternalFrameImportacionTipoSalarioNeto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoSalarioNeto();
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoSalarioNeto")) {
				jButtonNuevoTipoSalarioNetoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoSalarioNeto")) {
				jButtonDuplicarTipoSalarioNetoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoSalarioNeto")) {
				jButtonCopiarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoSalarioNeto")) {
				jButtonVerFormTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoSalarioNeto")) {
				jButtonNuevoTipoSalarioNetoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoSalarioNeto")) {
				jButtonDuplicarTipoSalarioNetoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoSalarioNeto")) {
				jButtonNuevoTipoSalarioNetoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoSalarioNeto")) {
				jButtonDuplicarTipoSalarioNetoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoSalarioNeto")) {
				jButtonNuevoTipoSalarioNetoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoSalarioNeto")) {
				jButtonNuevoTipoSalarioNetoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoSalarioNeto")) {
				jButtonNuevoTipoSalarioNetoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoSalarioNeto")) {
				jButtonModificarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoSalarioNeto")) {
				jButtonModificarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoSalarioNeto")) {
				jButtonModificarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoSalarioNeto")) {
				jButtonActualizarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoSalarioNeto")) {
				jButtonActualizarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoSalarioNeto")) {
				jButtonActualizarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoSalarioNeto")) {
				jButtonEliminarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoSalarioNeto")) {
				jButtonEliminarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoSalarioNeto")) {
				jButtonEliminarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoSalarioNeto")) {
				jButtonCancelarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoSalarioNeto")) {
				jButtonCancelarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoSalarioNeto")) {
				jButtonCancelarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoSalarioNeto")) {
				jButtonCerrarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoSalarioNeto")) {
				jButtonCerrarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoSalarioNeto")) {
				jButtonCerrarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoSalarioNeto")) {
				jButtonMostrarOcultarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoSalarioNeto")) {
				jButtonCancelarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoSalarioNeto")) {
				jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoSalarioNeto")) {
				jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoSalarioNeto")) {
				jButtonCopiarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoSalarioNeto")) {
				jButtonVerFormTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoSalarioNeto")) {
				jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoSalarioNeto")) {
				jButtonCopiarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoSalarioNeto")) {
				jButtonVerFormTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoSalarioNeto")) {
				jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoSalarioNeto")) {
				jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoSalarioNeto")) {
				jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoSalarioNeto")) {
				jButtonRecargarInformacionTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoSalarioNeto")) {
				jButtonRecargarInformacionTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoSalarioNeto")) {
				jButtonRecargarInformacionTipoSalarioNetoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoSalarioNeto")) {
				jButtonAnterioresTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoSalarioNeto")) {
				jButtonAnterioresTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoSalarioNeto")) {
				jButtonAnterioresTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoSalarioNeto")) {
				jButtonSiguientesTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoSalarioNeto")) {
				jButtonSiguientesTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoSalarioNeto")) {
				jButtonSiguientesTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoSalarioNeto") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoSalarioNeto")) {
				jButtonAbrirOrderByTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoSalarioNeto") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoSalarioNeto")) {
				jButtonMostrarOcultarTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSalarioNeto")) {
				jButtonNuevoGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoSalarioNeto")) {
				jButtonNuevoGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoSalarioNeto")) {
				jButtonNuevoGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoSalarioNeto")) {
				jButtonCerrarReporteDinamicoTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoSalarioNeto")) {
				jButtonGenerarReporteDinamicoTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoSalarioNeto")) {
				
				jButtonGenerarExcelReporteDinamicoTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoSalarioNeto")) {
				jButtonCerrarImportacionTipoSalarioNetoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoSalarioNeto")) {
				
				jButtonGenerarImportacionTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoSalarioNeto")) {
				
				jButtonAbrirImportacionTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoSalarioNeto")) {
				jComboBoxTiposAccionesTipoSalarioNetoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoSalarioNeto")) {
				jComboBoxTiposRelacionesTipoSalarioNetoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoSalarioNeto")) {
				jComboBoxTiposAccionesTipoSalarioNetoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoSalarioNeto")) {
				
				jComboBoxTiposSeleccionarTipoSalarioNetoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoSalarioNeto")) {
				jTextFieldValorCampoGeneralTipoSalarioNetoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoSalarioNeto")) {
				jButtonAbrirOrderByTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoSalarioNeto")) {
				jButtonAbrirOrderByTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoSalarioNeto")) {
				jButtonCerrarOrderByTipoSalarioNetoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSalarioNetoBusqueda")) {
				this.jButtonidTipoSalarioNetoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSalarioNetoBusqueda")) {
				this.jButtonnombreTipoSalarioNetoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoSalarioNetoBusqueda")) {
				this.jButtondescripcionTipoSalarioNetoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoSalarioNeto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSalarioNetoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				


				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoSalarioNeto tiposalarionetoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiposalarionetoLocal=this.tiposalarioneto;
			} else {
				tiposalarionetoLocal=this.tiposalarionetoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
							
				
				


				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
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
			
			


			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSalarioNetoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
								
						
				


				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
								
				
				


				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
							
				
				


				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSalarioNetoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
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
			
			


			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
								
				
				


				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSalarioNetoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoSalarioNeto")) {
					jCheckBoxSeleccionarTodosTipoSalarioNetoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoSalarioNeto")) {
					jCheckBoxSeleccionadosTipoSalarioNetoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoSalarioNeto")) {
					
				}
				
				


				
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
												
				
				


				
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSalarioNetoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSalarioNetoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
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
			
			


			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSalarioNetoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposalarioneto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposalarioneto);
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
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
				
				


				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSalarioNeto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSalarioNeto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSalarioNetoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposalarionetoAnterior =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoSalarioNeto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoSalarioNetoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoSalarioNeto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiposalarioneto =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiposalarioneto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoSalarioNeto")) {
				
				}
				
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoSalarioNeto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoSalarioNeto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoSalarioNeto")) {
			
			}
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoSalarioNeto();
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoSalarioNeto")) {
				jButtonNuevoTipoSalarioNetoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoSalarioNeto")) {
				jButtonDuplicarTipoSalarioNetoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoSalarioNeto")) {
				jButtonCopiarTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoSalarioNeto")) {
				jButtonVerFormTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoSalarioNeto")) {
				jButtonNuevoTipoSalarioNetoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoSalarioNeto")) {
				jButtonModificarTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoSalarioNeto")) {
				jButtonActualizarTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoSalarioNeto")) {
				jButtonEliminarTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoSalarioNeto")) {
				jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoSalarioNeto")) {
				jButtonCancelarTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoSalarioNeto")) {
				jButtonCerrarTipoSalarioNetoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoSalarioNeto")) {
				jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSalarioNeto")) {
				jButtonNuevoGuardarCambiosTipoSalarioNetoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoSalarioNeto")) {
				jButtonAbrirOrderByTipoSalarioNetoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoSalarioNeto")) {
				jButtonRecargarInformacionTipoSalarioNetoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoSalarioNeto")) {
				jButtonAnterioresTipoSalarioNetoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoSalarioNeto")) {
				jButtonSiguientesTipoSalarioNetoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSalarioNetoBusqueda")) {
				this.jButtonidTipoSalarioNetoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSalarioNetoBusqueda")) {
				this.jButtonnombreTipoSalarioNetoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoSalarioNetoBusqueda")) {
				this.jButtondescripcionTipoSalarioNetoBusquedaActionPerformed(evt);
			}
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoSalarioNeto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoSalarioNeto")) {
				closingInternalFrameTipoSalarioNeto();
				
			} else if(sTipo.equals("jButtonCancelarTipoSalarioNeto")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoSalarioNeto = (JInternalFrameBase)evt.getSource();
	            	
	            TipoSalarioNetoBeanSwingJInternalFrame jInternalFrameParent=(TipoSalarioNetoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSalarioNeto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoSalarioNetoActionPerformed(null);
			}
			
			TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposalarioneto,new Object(),this.tiposalarionetoParameterGeneral,this.tiposalarionetoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoSalarioNeto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoSalarioNeto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoSalarioNeto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiposalarioneto)) {
			if(!esControlTabla) {
				if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.tiposalarioneto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);			
				}
				
				if(this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoSalarioNeto(this.tiposalarioneto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposalarionetoReturnGeneral=tiposalarionetoLogic.procesarEventosTipoSalarioNetosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposalarionetoLogic.getTipoSalarioNetos(),this.tiposalarioneto,this.tiposalarionetoParameterGeneral,this.isEsNuevoTipoSalarioNeto,classes);//this.tiposalarionetoLogic.getTipoSalarioNeto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoSalarioNeto(this.tiposalarionetoReturnGeneral,this.tiposalarionetoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoSalarioNeto(classes,this.tiposalarionetoReturnGeneral,this.tiposalarionetoBean,false);
					}
						
					if(this.tiposalarionetoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoSalarioNeto(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoSalarioNeto(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto());	
					}
						
					if(this.tiposalarionetoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoSalarioNeto(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto(),classes);//this.tiposalarionetoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoSalarioNeto(this.tiposalarioneto,classes);//this.tiposalarionetoBean);									
				}
			
				if(TipoSalarioNetoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoSalarioNeto(this.tiposalarioneto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSalarioNeto(this.tiposalarioneto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiposalarionetoAnterior!=null) {
						this.tiposalarioneto=this.tiposalarionetoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposalarionetoReturnGeneral=tiposalarionetoLogic.procesarEventosTipoSalarioNetosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposalarionetoLogic.getTipoSalarioNetos(),this.tiposalarioneto,this.tiposalarionetoParameterGeneral,this.isEsNuevoTipoSalarioNeto,classes);//this.tiposalarionetoLogic.getTipoSalarioNeto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposalarionetoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposalarionetoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto(),tiposalarionetoLogic.getTipoSalarioNetos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto(),this.tiposalarionetos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoSalarioNeto.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoSalarioNeto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoSalarioNeto();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoSalarioNeto() throws Exception {
		
		TipoSalarioNetoModel tiposalarionetoModel=(TipoSalarioNetoModel)this.jTableDatosTipoSalarioNeto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposalarionetoModel.tiposalarionetos=this.tiposalarionetoLogic.getTipoSalarioNetos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiposalarionetoModel.tiposalarionetos=this.tiposalarionetos;
		}
		
		
		((TipoSalarioNetoModel) this.jTableDatosTipoSalarioNeto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoSalarioNeto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiposalarionetoAnterior(),this.tiposalarionetoLogic.getTipoSalarioNetos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiposalarionetoAnterior(),this.tiposalarionetos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoSalarioNeto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
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
										
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposalarioneto,new Object(),generalEntityParameterGeneral,this.tiposalarionetoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiposalarionetoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoSalarioNetoConstantesFunciones.getClassesRelationshipsOfTipoSalarioNeto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoSalarioNetoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoSalarioNeto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoSalarioNeto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoSalarioNetoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposalarioneto,new Object(),generalEntityParameterGeneral,this.tiposalarionetoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoSalarioNeto(TipoSalarioNetoBean tiposalarionetoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoSalarioNeto(ArrayList<Classe> classes,TipoSalarioNetoReturnGeneral tiposalarionetoReturnGeneral,TipoSalarioNetoBean tiposalarionetoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiposalarioneto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoSalarioNeto = new TipoSalarioNetoDetalleFormJInternalFrame(jDesktopPane,this.tiposalarionetoSessionBean.getConGuardarRelaciones(),this.tiposalarionetoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSalarioNeto);
		this.jInternalFrameDetalleFormTipoSalarioNeto.setVisible(false);
		this.jInternalFrameDetalleFormTipoSalarioNeto.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.tiposalarionetoLogic=this.tiposalarionetoLogic;
		
		this.cargarCombosFrameForeignKeyTipoSalarioNeto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSalarioNeto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSalarioNeto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoSalarioNeto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoSalarioNeto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSalarioNeto"));
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"ModificarTipoSalarioNeto"));

		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarToolBarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSalarioNeto"));
					
		this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemModificarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSalarioNeto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"ActualizarTipoSalarioNeto"));
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarToolBarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSalarioNeto"));
						
		this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemActualizarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSalarioNeto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"EliminarTipoSalarioNeto"));
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSalarioNeto"));
								
		this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemEliminarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSalarioNeto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"CancelarTipoSalarioNeto"));
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSalarioNeto"));
					
		this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemCancelarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSalarioNeto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemDetalleCerrarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSalarioNeto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSalarioNeto"));
		
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSalarioNeto"));
		
		
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSalarioNeto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonidTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSalarioNetoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonnombreTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSalarioNetoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtondescripcionTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoSalarioNetoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSalarioNeto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoSalarioNeto"));
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSalarioNeto"));
		}
		
		this.jTableDatosTipoSalarioNeto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoSalarioNeto"));
		
		this.jTableDatosTipoSalarioNeto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoSalarioNeto"));
		
		this.jButtonNuevoTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"NuevoTipoSalarioNeto"));
		
		this.jButtonDuplicarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"DuplicarTipoSalarioNeto"));
		
		this.jButtonCopiarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"CopiarTipoSalarioNeto"));
		
		this.jButtonVerFormTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"VerFormTipoSalarioNeto"));
		
		
		this.jButtonNuevoToolBarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoSalarioNeto"));
			
		this.jButtonDuplicarToolBarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoSalarioNeto"));
			
		this.jMenuItemNuevoTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoSalarioNeto"));
			
		this.jMenuItemDuplicarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoSalarioNeto"));		
		
		
		this.jButtonNuevoRelacionesTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoSalarioNeto"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoSalarioNeto"));
			
		this.jMenuItemNuevoRelacionesTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoSalarioNeto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"ModificarTipoSalarioNeto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonModificarToolBarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSalarioNeto"));
			
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemModificarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSalarioNeto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"ActualizarTipoSalarioNeto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonActualizarToolBarTipoSalarioNeto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSalarioNeto"));
				
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemActualizarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSalarioNeto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"EliminarTipoSalarioNeto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonEliminarToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSalarioNeto"));
						
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemEliminarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSalarioNeto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"CancelarTipoSalarioNeto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonCancelarToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSalarioNeto"));
			
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemCancelarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSalarioNeto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoSalarioNeto"));		
		
		
		this.jButtonCerrarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"CerrarTipoSalarioNeto"));
		
		
		this.jButtonCerrarToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoSalarioNeto"));
			
		this.jMenuItemCerrarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoSalarioNeto"));
			
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jMenuItemDetalleCerrarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSalarioNeto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoSalarioNeto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSalarioNeto"));
		}
		
		this.jButtonCopiarToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoSalarioNeto"));
			
		this.jButtonVerFormToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoSalarioNeto"));
		
		this.jMenuItemGuardarCambiosTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoSalarioNeto"));
			
		this.jMenuItemCopiarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoSalarioNeto"));		
		
		this.jMenuItemVerFormTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoSalarioNeto"));		
		
		
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSalarioNeto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoSalarioNeto"));
			
		this.jMenuItemGuardarCambiosTablaTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSalarioNeto"));		
		
		
		
		this.jButtonRecargarInformacionTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoSalarioNeto"));
					
		this.jButtonRecargarInformacionToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoSalarioNeto"));
		
		this.jMenuItemRecargarInformacionTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoSalarioNeto"));		
		
		
		
		this.jButtonAnterioresTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"AnterioresTipoSalarioNeto"));
		
		
		this.jButtonAnterioresToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoSalarioNeto"));
		
		this.jMenuItemAnterioresTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoSalarioNeto"));		
		
		
		this.jButtonSiguientesTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"SiguientesTipoSalarioNeto"));
		
		
		this.jButtonSiguientesToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoSalarioNeto"));
			
		this.jMenuItemSiguientesTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoSalarioNeto"));
			
		this.jMenuItemAbrirOrderByTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoSalarioNeto"));
			
		this.jMenuItemMostrarOcultarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoSalarioNeto"));
			
		this.jMenuItemDetalleAbrirOrderByTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoSalarioNeto"));
			
		this.jMenuItemDetalleMostarOcultarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoSalarioNeto"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoSalarioNeto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoSalarioNeto"));
			
		this.jMenuItemNuevoGuardarCambiosTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoSalarioNeto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoSalarioNeto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoSalarioNeto"));

		this.jCheckBoxSeleccionadosTipoSalarioNeto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoSalarioNeto"));
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSalarioNeto"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoSalarioNeto"));
			
		this.jComboBoxTiposAccionesTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoSalarioNeto"));
					
		this.jComboBoxTiposSeleccionarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoSalarioNeto"));
			
		this.jTextFieldValorCampoGeneralTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoSalarioNeto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonidTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSalarioNetoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonnombreTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSalarioNetoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtondescripcionTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoSalarioNetoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoSalarioNeto!=null) {
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSalarioNeto"));
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSalarioNeto"));
				this.jInternalFrameReporteDinamicoTipoSalarioNeto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSalarioNeto"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSalarioNeto"));				
			//this.jButtonGenerarReporteDinamicoTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSalarioNeto"));
			//this.jButtonGenerarExcelReporteDinamicoTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSalarioNeto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoSalarioNeto!=null) {
				this.jInternalFrameImportacionTipoSalarioNeto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSalarioNeto"));
				this.jInternalFrameImportacionTipoSalarioNeto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSalarioNeto"));
				this.jInternalFrameImportacionTipoSalarioNeto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSalarioNeto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoSalarioNeto"));
			
			this.jButtonAbrirOrderByToolBarTipoSalarioNeto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoSalarioNeto"));			
			
			if(this.jInternalFrameOrderByTipoSalarioNeto!=null) {
				this.jInternalFrameOrderByTipoSalarioNeto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSalarioNeto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSalarioNeto.jTabbedPaneRelacionesTipoSalarioNeto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSalarioNeto"));
		
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
            		closingInternalFrameTipoSalarioNeto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoSalarioNeto = (JInternalFrameBase)event.getSource();
	            	
	            TipoSalarioNetoBeanSwingJInternalFrame jInternalFrameParent=(TipoSalarioNetoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSalarioNeto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoSalarioNetoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoSalarioNeto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoSalarioNetoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoSalarioNeto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoSalarioNeto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSalarioNetoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSalarioNetoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSalarioNetoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoSalarioNeto";
		inputMap = this.jButtonNuevoTipoSalarioNeto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoSalarioNeto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSalarioNetoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSalarioNetoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSalarioNetoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSalarioNetoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoSalarioNeto";
		inputMap = this.jButtonNuevoRelacionesTipoSalarioNeto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoSalarioNeto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSalarioNetoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoSalarioNeto";
		inputMap = this.jButtonModificarTipoSalarioNeto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoSalarioNeto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoSalarioNetoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoSalarioNeto";
		inputMap = this.jButtonActualizarTipoSalarioNeto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoSalarioNeto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoSalarioNetoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoSalarioNeto";
		inputMap = this.jButtonEliminarTipoSalarioNeto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoSalarioNeto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoSalarioNetoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoSalarioNeto";
		inputMap = this.jButtonCancelarTipoSalarioNeto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoSalarioNeto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoSalarioNetoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoSalarioNeto";
		inputMap = this.jButtonCerrarTipoSalarioNeto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoSalarioNeto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoSalarioNetoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoSalarioNeto";
		inputMap = this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosTipoSalarioNeto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonGuardarCambiosTipoSalarioNeto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoSalarioNetoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoSalarioNeto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoSalarioNetoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoSalarioNeto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoSalarioNetoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoSalarioNeto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoSalarioNetoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoSalarioNeto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoSalarioNetoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonidTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSalarioNetoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtonnombreTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSalarioNetoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSalarioNeto.jButtondescripcionTipoSalarioNetoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoSalarioNetoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoSalarioNeto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoSalarioNetoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoSalarioNetoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoSalarioNeto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoSalarioNeto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
					tiposalarionetoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetos) {
					tiposalarionetoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoSalarioNetoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSalarioNeto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
						tiposalarionetoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetos) {
						tiposalarionetoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSalarioNeto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSalarioNeto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSalarioNeto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoSalarioNetoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSalarioNeto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoSalarioNeto.getSelectedRows();
			
			TipoSalarioNeto tiposalarionetoLocal=new TipoSalarioNeto();
			
			//this.seleccionarTodosTipoSalarioNeto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposalarionetoLocal =(TipoSalarioNeto) this.tiposalarionetoLogic.getTipoSalarioNetos().toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiposalarionetoLocal =(TipoSalarioNeto) this.tiposalarionetos.toArray()[this.jTableDatosTipoSalarioNeto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiposalarionetoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
						tiposalarionetoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetos) {
						tiposalarionetoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSalarioNeto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSalarioNeto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSalarioNeto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoSalarioNetoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoSalarioNetoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoSalarioNetoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoSalarioNeto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoSalarioNeto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetoLogic.getTipoSalarioNetos()) {
				
						if(sTipoSeleccionar.equals(TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposalarionetoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tiposalarionetoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetos) {
					
						if(sTipoSeleccionar.equals(TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposalarionetoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tiposalarionetoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoSalarioNetoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoSalarioNeto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoSalarioNeto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoSalarioNeto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoSalarioNeto) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoSalarioNeto(conSplash);
				
					this.generarReporteTipoSalarioNetosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoSalarioNetosSeleccionados();
				//this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSalarioNetosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSalarioNetosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSalarioNeto();
				
				this.exportarTipoSalarioNetosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoSalarioNetos();
				//this.importarTipoSalarioNetos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSalarioNeto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoSalarioNetosSeleccionados();
				//this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Salario Neto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoSalarioNeto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoSalarioNeto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoSalarioNeto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoSalarioNetoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoSalarioNeto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoSalarioNeto(conSplash);
					
						//this.actualizarParametrosGeneralTipoSalarioNeto();
						
						this.generarReporteProcesoAccionTipoSalarioNetosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoSalarioNetoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Salario NetoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Salario Neto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoSalarioNeto();
				
						this.actualizarParametrosGeneralTipoSalarioNeto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiposalarionetoReturnGeneral=tiposalarionetoLogic.procesarAccionTipoSalarioNetosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiposalarionetoLogic.getTipoSalarioNetos(),this.tiposalarionetoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoSalarioNetoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoSalarioNeto();
					
					TipoSalarioNetoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoSalarioNetoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSalarioNeto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSalarioNeto.jComboBoxTiposAccionesFormularioTipoSalarioNeto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoSalarioNeto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoSalarioNetoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoSalarioNeto();
			
			if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		
			TipoSalarioNeto tiposalarioneto=new TipoSalarioNeto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoSalarioNeto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoSalarioNeto.getSelectedItem();
			
			
			
			
			tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiposalarionetosSeleccionados.size()==1) {
				for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetosSeleccionados) {
					tiposalarioneto=tiposalarionetoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoSalarioNeto();
			
      		//this.finishProcessTipoSalarioNeto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoSalarioNetoReturnGeneral() throws Exception {
		if(this.tiposalarionetoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiposalarionetoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiposalarionetoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiposalarionetoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiposalarionetoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiposalarionetoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoSalarioNeto(false);
		}
		
		if(this.tiposalarionetoReturnGeneral.getConRetornoLista() || this.tiposalarionetoReturnGeneral.getConRetornoObjeto()) {
			if(this.tiposalarionetoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposalarionetoLogic.setTipoSalarioNetos(this.tiposalarionetoReturnGeneral.getTipoSalarioNetos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiposalarionetoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposalarionetoLogic.setTipoSalarioNeto(this.tiposalarionetoReturnGeneral.getTipoSalarioNeto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoSalarioNeto(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoSalarioNeto() throws Exception {
		
		
	}
	
	public ArrayList<TipoSalarioNeto> getTipoSalarioNetosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoSalarioNeto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetoLogic.getTipoSalarioNetos()) {
					if(tiposalarionetoAux.getIsSelected()) {
						tiposalarionetosSeleccionados.add(tiposalarionetoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSalarioNeto tiposalarionetoAux:this.tiposalarionetos) {
					if(tiposalarionetoAux.getIsSelected()) {
						tiposalarionetosSeleccionados.add(tiposalarionetoAux);				
					}
				}
			}
			
			if(tiposalarionetosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiposalarionetosSeleccionados.addAll(this.tiposalarionetoLogic.getTipoSalarioNetos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiposalarionetosSeleccionados.addAll(this.tiposalarionetos);				
					}
				}
			}
		} else {
			tiposalarionetosSeleccionados.add(this.tiposalarioneto);
		}
		
		return tiposalarionetosSeleccionados;
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
	
	public void generarReporteTipoSalarioNetosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoSalarioNetosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoSalarioNetosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSalarioNetosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSalarioNetosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Salario Neto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoSalarioNetosSeleccionados() throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoSalarioNetos("Todos",tiposalarionetosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoSalarioNetosSeleccionados() throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoSalarioNetos("Todos",tiposalarionetosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoSalarioNetosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoSalarioNetos("Todos",tiposalarionetosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoSalarioNetosSeleccionados() throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoSalarioNeto();
		
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoSalarioNeto();
		
		
		//this.generarReporteTipoSalarioNetos("Todos",tiposalarionetosSeleccionados ,tiposalarionetoImplementable,tiposalarionetoImplementableHome);
	}
	
	public void mostrarImportacionTipoSalarioNetos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoSalarioNeto();
		
		this.abrirFrameImportacionTipoSalarioNeto();		
		
			
		//this.generarReporteTipoSalarioNetos("Todos",tiposalarionetosSeleccionados ,tiposalarionetoImplementable,tiposalarionetoImplementableHome);
	}
	
	public void importarTipoSalarioNetos() throws Exception {		
	
	}
	
	public void exportarTipoSalarioNetosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoSalarioNetosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoSalarioNetosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoSalarioNetosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Salario Neto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoSalarioNetosSeleccionados() throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposalarioneto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoSalarioNeto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoSalarioNeto(tiposalarionetoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiposalarionetoAux.setsDetalleGeneralEntityReporte(tiposalarionetoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoSalarioNeto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoSalarioNetoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSalarioNetoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiposalarioneto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposalarioneto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposalarioneto.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposalarioneto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoSalarioNetosSeleccionados() throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposalarioneto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoSalarioNetos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoSalarioNeto(row);				
				iRow++;
			}				
			
			for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoSalarioNeto(tiposalarionetoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoSalarioNetosSeleccionados() throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();		
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposalarioneto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiposalarionetos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiposalarioneto");
			//elementRoot.appendChild(element);
		
			for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetosSeleccionados) {
				element = document.createElement("tiposalarioneto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoSalarioNeto(tiposalarionetoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Salario Neto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoSalarioNeto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSalarioNetoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSalarioNetoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiposalarioneto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposalarioneto.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposalarioneto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoSalarioNeto(TipoSalarioNeto tiposalarioneto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoSalarioNetoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiposalarioneto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoSalarioNetoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiposalarioneto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoSalarioNetoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiposalarioneto.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(TipoSalarioNetoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tiposalarioneto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoSalarioNetosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados=new ArrayList<TipoSalarioNeto>();
		
		tiposalarionetosSeleccionados=this.getTipoSalarioNetosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoSalarioNeto(tiposalarionetosSeleccionados);
		
		this.generarReporteTipoSalarioNetos("Todos",tiposalarionetosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoSalarioNeto(ArrayList<TipoSalarioNeto> tiposalarionetosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoSalarioNeto tiposalarionetoAux:tiposalarionetosSeleccionados) {
				tiposalarionetoAux.setsDetalleGeneralEntityReporte(tiposalarionetoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoSalarioNetoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiposalarionetoAux.setsDescripcionGeneralEntityReporte1(tiposalarionetoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoSalarioNetoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tiposalarionetoAux.setsDescripcionGeneralEntityReporte1(tiposalarionetoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSalarioNetoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoSalarioNeto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoSalarioNeto=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=true;
				this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=true;
			}
			
			this.isVisibilidadCeldaModificarTipoSalarioNeto=false;
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=false;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=false;
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=false;
			this.isVisibilidadCeldaModificarTipoSalarioNeto=false;
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=true;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=false;
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=false;
			this.isVisibilidadCeldaModificarTipoSalarioNeto=false;
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=true;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=true;
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=false;
			this.isVisibilidadCeldaModificarTipoSalarioNeto=false;
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=true;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=false;
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=true;
			this.isVisibilidadCeldaModificarTipoSalarioNeto=false;
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=false;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=false;
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=false;
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=false;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=false;
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=false;
			this.isVisibilidadCeldaModificarTipoSalarioNeto=true;
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=false;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=false;
			this.isVisibilidadCeldaCancelarTipoSalarioNeto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSalarioNeto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoSalarioNetoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=true;
		} else {
			this.actualizarEstadoPanelsTipoSalarioNeto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoSalarioNeto=false;
			//this.isVisibilidadCeldaVerFormTipoSalarioNeto=false;
			this.isVisibilidadCeldaDuplicarTipoSalarioNeto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiposalarionetoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoSalarioNeto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSalarioNeto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
			if(!tiposalarionetoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;												
			}
			
			this.jButtonCerrarTipoSalarioNeto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSalarioNeto=false;
		}
		
		if(!this.permiteMantenimiento(this.tiposalarioneto)) {
			this.isVisibilidadCeldaActualizarTipoSalarioNeto=false;
			this.isVisibilidadCeldaEliminarTipoSalarioNeto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSalarioNeto() {
	}
	
	public void actualizarEstadoPanelsTipoSalarioNeto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoSalarioNeto!=null) {
				this.jScrollPanelDatosEdicionTipoSalarioNeto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSalarioNeto!=null) {
				this.jScrollPanelDatosTipoSalarioNeto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSalarioNeto!=null) {
				this.jPanelPaginacionTipoSalarioNeto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSalarioNeto!=null) {
				this.jPanelParametrosReportesTipoSalarioNeto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoSalarioNeto!=null) {
				this.jScrollPanelDatosEdicionTipoSalarioNeto.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoSalarioNeto!=null) {
				this.jScrollPanelDatosTipoSalarioNeto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSalarioNeto!=null) {
				this.jPanelPaginacionTipoSalarioNeto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSalarioNeto!=null) {
				this.jPanelParametrosReportesTipoSalarioNeto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoSalarioNeto!=null) {
				this.jScrollPanelDatosEdicionTipoSalarioNeto.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoSalarioNeto!=null) {
				this.jScrollPanelDatosTipoSalarioNeto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSalarioNeto!=null) {
				this.jPanelPaginacionTipoSalarioNeto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSalarioNeto!=null) {
				this.jPanelParametrosReportesTipoSalarioNeto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoSalarioNeto!=null) {
				this.jScrollPanelDatosEdicionTipoSalarioNeto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSalarioNeto!=null) {
				this.jScrollPanelDatosTipoSalarioNeto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSalarioNeto!=null) {
				this.jPanelPaginacionTipoSalarioNeto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSalarioNeto!=null) {
				this.jPanelParametrosReportesTipoSalarioNeto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoSalarioNeto!=null) {
				this.jScrollPanelDatosEdicionTipoSalarioNeto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSalarioNeto!=null) {
				this.jScrollPanelDatosTipoSalarioNeto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSalarioNeto!=null) {
				this.jPanelPaginacionTipoSalarioNeto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSalarioNeto!=null) {
				this.jPanelParametrosReportesTipoSalarioNeto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoSalarioNeto!=null) {
				this.jScrollPanelDatosEdicionTipoSalarioNeto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoSalarioNeto!=null) {
				this.jScrollPanelDatosTipoSalarioNeto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSalarioNeto!=null) {
				this.jPanelPaginacionTipoSalarioNeto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSalarioNeto!=null) {
				this.jPanelParametrosReportesTipoSalarioNeto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoSalarioNeto!=null) {
				this.jScrollPanelDatosEdicionTipoSalarioNeto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoSalarioNeto!=null) {
				this.jScrollPanelDatosTipoSalarioNeto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSalarioNeto!=null) {
				this.jPanelPaginacionTipoSalarioNeto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSalarioNeto!=null) {
				this.jPanelParametrosReportesTipoSalarioNeto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tiposalarionetoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoSalarioNetoSessionBean tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean();
		
		if(this.tiposalarionetoSessionBean==null) {
			this.tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean();
		}
		
		this.tiposalarionetoSessionBean.setsUltimaBusquedaTipoSalarioNeto(this.getsAccionBusqueda());
		this.tiposalarionetoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiposalarionetoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoSalarioNetoSessionBean tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean();
		
		if(this.tiposalarionetoSessionBean==null) {
			this.tiposalarionetoSessionBean=new TipoSalarioNetoSessionBean();
		}
		
		if(this.tiposalarionetoSessionBean.getsUltimaBusquedaTipoSalarioNeto()!=null&&!this.tiposalarionetoSessionBean.getsUltimaBusquedaTipoSalarioNeto().equals("")) {
			this.setsAccionBusqueda(tiposalarionetoSessionBean.getsUltimaBusquedaTipoSalarioNeto());
			this.setiNumeroPaginacion(tiposalarionetoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiposalarionetoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tiposalarionetoSessionBean.setsUltimaBusquedaTipoSalarioNeto("");
		this.tiposalarionetoSessionBean.setiNumeroPaginacion(TipoSalarioNetoConstantesFunciones.INUMEROPAGINACION);
		this.tiposalarionetoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoSalarioNeto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoSalarioNeto() {
		this.updateBorderResaltarBusquedasFormularioTipoSalarioNeto();
		this.updateVisibilidadBusquedasFormularioTipoSalarioNeto();
		this.updateHabilitarBusquedasFormularioTipoSalarioNeto();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoSalarioNeto() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoSalarioNeto() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoSalarioNeto() {
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
	
	public void updateControlesFormularioTipoSalarioNeto() throws Exception {

		if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoSalarioNeto();
		this.updateVisibilidadResaltarControlesFormularioTipoSalarioNeto();
		this.updateHabilitarResaltarControlesFormularioTipoSalarioNeto();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoSalarioNeto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiposalarionetoConstantesFunciones.resaltaridTipoSalarioNeto!=null && this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.setBorder(this.tiposalarionetoConstantesFunciones.resaltaridTipoSalarioNeto);}
		if(this.tiposalarionetoConstantesFunciones.resaltarnombreTipoSalarioNeto!=null && this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreanombreTipoSalarioNeto.setBorder(this.tiposalarionetoConstantesFunciones.resaltarnombreTipoSalarioNeto);}
		if(this.tiposalarionetoConstantesFunciones.resaltardescripcionTipoSalarioNeto!=null && this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreadescripcionTipoSalarioNeto.setBorder(this.tiposalarionetoConstantesFunciones.resaltardescripcionTipoSalarioNeto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoSalarioNeto() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
	
		//this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.setVisible(this.tiposalarionetoConstantesFunciones.mostraridTipoSalarioNeto);
		this.jInternalFrameDetalleFormTipoSalarioNeto.jPanelidTipoSalarioNeto.setVisible(this.tiposalarionetoConstantesFunciones.mostraridTipoSalarioNeto);
		//this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreanombreTipoSalarioNeto.setVisible(this.tiposalarionetoConstantesFunciones.mostrarnombreTipoSalarioNeto);
		this.jInternalFrameDetalleFormTipoSalarioNeto.jPanelnombreTipoSalarioNeto.setVisible(this.tiposalarionetoConstantesFunciones.mostrarnombreTipoSalarioNeto);
		//this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreadescripcionTipoSalarioNeto.setVisible(this.tiposalarionetoConstantesFunciones.mostrardescripcionTipoSalarioNeto);
		this.jInternalFrameDetalleFormTipoSalarioNeto.jPaneldescripcionTipoSalarioNeto.setVisible(this.tiposalarionetoConstantesFunciones.mostrardescripcionTipoSalarioNeto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoSalarioNeto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSalarioNeto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSalarioNeto!=null) {
	
		this.jInternalFrameDetalleFormTipoSalarioNeto.jTextFieldidTipoSalarioNeto.setEnabled(this.tiposalarionetoConstantesFunciones.activaridTipoSalarioNeto);
		this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreanombreTipoSalarioNeto.setEnabled(this.tiposalarionetoConstantesFunciones.activarnombreTipoSalarioNeto);
		this.jInternalFrameDetalleFormTipoSalarioNeto.jTextAreadescripcionTipoSalarioNeto.setEnabled(this.tiposalarionetoConstantesFunciones.activardescripcionTipoSalarioNeto);
		}
	}
	
		
}