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

import com.bydan.erp.seguridad.util.ParametroSeguridadConstantesFunciones;
import com.bydan.erp.seguridad.util.ParametroSeguridadParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ParametroSeguridadParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ParametroSeguridadBean;
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
public class ParametroSeguridadBeanSwingJInternalFrame extends ParametroSeguridadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroSeguridadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroSeguridad> parametroseguridadValidator = new ClassValidator<ParametroSeguridad>(ParametroSeguridad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroSeguridad parametroseguridad;	
	public ParametroSeguridad parametroseguridadAux;
	public ParametroSeguridad parametroseguridadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroSeguridad parametroseguridadTotales;
	public Long idParametroSeguridadActual;
	public Long iIdNuevoParametroSeguridad=0L;
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
	
	public Boolean isPermisoTodoParametroSeguridad;
	public Boolean isPermisoNuevoParametroSeguridad;
	public Boolean isPermisoActualizarParametroSeguridad;
	public Boolean isPermisoActualizarOriginalParametroSeguridad;
	public Boolean isPermisoEliminarParametroSeguridad;
	public Boolean isPermisoGuardarCambiosParametroSeguridad;
	public Boolean isPermisoConsultaParametroSeguridad;
	public Boolean isPermisoBusquedaParametroSeguridad;
	public Boolean isPermisoReporteParametroSeguridad;
	public Boolean isPermisoPaginacionMedioParametroSeguridad;
	public Boolean isPermisoPaginacionAltoParametroSeguridad;
	public Boolean isPermisoPaginacionTodoParametroSeguridad;
	public Boolean isPermisoCopiarParametroSeguridad;
	public Boolean isPermisoVerFormParametroSeguridad;
	public Boolean isPermisoDuplicarParametroSeguridad;
	public Boolean isPermisoOrdenParametroSeguridad;
	
	
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
	
	public ParametroSeguridadParameterReturnGeneral parametroseguridadReturnGeneral;
	public ParametroSeguridadParameterReturnGeneral parametroseguridadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroSeguridad=false;
	public Boolean esParaAccionDesdeFormularioParametroSeguridad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroSeguridadSessionBeanAdditional parametroseguridadSessionBeanAdditional=null;
	
	public ParametroSeguridadSessionBeanAdditional getParametroSeguridadSessionBeanAdditional() {
		return this.parametroseguridadSessionBeanAdditional;
	}
	
	public void setParametroSeguridadSessionBeanAdditional(ParametroSeguridadSessionBeanAdditional parametroseguridadSessionBeanAdditional) {
		try {
			this.parametroseguridadSessionBeanAdditional=parametroseguridadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroSeguridadBeanSwingJInternalFrameAdditional parametroseguridadBeanSwingJInternalFrameAdditional=null;
	//public class ParametroSeguridadBeanSwingJInternalFrame
	
	public ParametroSeguridadBeanSwingJInternalFrameAdditional getParametroSeguridadBeanSwingJInternalFrameAdditional() {
		return this.parametroseguridadBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroSeguridadBeanSwingJInternalFrameAdditional(ParametroSeguridadBeanSwingJInternalFrameAdditional parametroseguridadBeanSwingJInternalFrameAdditional) {
		try {
			this.parametroseguridadBeanSwingJInternalFrameAdditional=parametroseguridadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroSeguridadLogic parametroseguridadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroSeguridad parametroseguridadBean;
	public ParametroSeguridadConstantesFunciones parametroseguridadConstantesFunciones;
	//public ParametroSeguridadParameterReturnGeneral parametroseguridadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroSeguridad> parametroseguridads;	
	//public List<ParametroSeguridad> parametroseguridadsEliminados;
	//public List<ParametroSeguridad> parametroseguridadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroSeguridad=false;
	public Boolean isVisibilidadCeldaDuplicarParametroSeguridad=true;
	public Boolean isVisibilidadCeldaCopiarParametroSeguridad=true;
	public Boolean isVisibilidadCeldaVerFormParametroSeguridad=true;
	public Boolean isVisibilidadCeldaOrdenParametroSeguridad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
	public Boolean isVisibilidadCeldaModificarParametroSeguridad=false;
	public Boolean isVisibilidadCeldaActualizarParametroSeguridad=false;
	public Boolean isVisibilidadCeldaEliminarParametroSeguridad=false;
	public Boolean isVisibilidadCeldaCancelarParametroSeguridad=false;
	public Boolean isVisibilidadCeldaGuardarParametroSeguridad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroSeguridad=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoParametroSeguridad() {
		return this.iIdNuevoParametroSeguridad;
	}

	public void setiIdNuevoParametroSeguridad(Long iIdNuevoParametroSeguridad) {
		this.iIdNuevoParametroSeguridad = iIdNuevoParametroSeguridad;
	}
	
	public Long getidParametroSeguridadActual() {
		return this.idParametroSeguridadActual;
	}

	public void setidParametroSeguridadActual(Long idParametroSeguridadActual) {
		this.idParametroSeguridadActual = idParametroSeguridadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroSeguridad getparametroseguridad() {
		return this.parametroseguridad;
	}

	public void setparametroseguridad(ParametroSeguridad parametroseguridad) {
		this.parametroseguridad = parametroseguridad;
	}
	
	public ParametroSeguridad getparametroseguridadAux() {
		return this.parametroseguridadAux;
	}

	public void setparametroseguridadAux(ParametroSeguridad parametroseguridadAux) {
		this.parametroseguridadAux = parametroseguridadAux;
	}				
	
	public ParametroSeguridad getparametroseguridadAnterior() {
		return this.parametroseguridadAnterior;
	}

	public void setparametroseguridadAnterior(ParametroSeguridad parametroseguridadAnterior) {
		this.parametroseguridadAnterior = parametroseguridadAnterior;
	}	
	
	public ParametroSeguridad getparametroseguridadTotales() {
		return this.parametroseguridadTotales;
	}

	public void setparametroseguridadTotales(ParametroSeguridad parametroseguridadTotales) {
		this.parametroseguridadTotales = parametroseguridadTotales;
	}	
	
	public ParametroSeguridad getparametroseguridadBean() {
		return this.parametroseguridadBean;
	}

	public void setparametroseguridadBean(ParametroSeguridad parametroseguridadBean) {
		this.parametroseguridadBean = parametroseguridadBean;
	}	
	
	public ParametroSeguridadParameterReturnGeneral getparametroseguridadReturnGeneral() {
		return this.parametroseguridadReturnGeneral;
	}

	public void setparametroseguridadReturnGeneral(ParametroSeguridadParameterReturnGeneral parametroseguridadReturnGeneral) {
		this.parametroseguridadReturnGeneral = parametroseguridadReturnGeneral;
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
	
	
	public ParametroSeguridadLogic getParametroSeguridadLogic()	{		
		return parametroseguridadLogic;
	}

	public void setParametroSeguridadLogic(ParametroSeguridadLogic parametroseguridadLogic) {
		this.parametroseguridadLogic = parametroseguridadLogic;
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
	
	public Boolean getIsEsNuevoParametroSeguridad() {
		return isEsNuevoParametroSeguridad;
	}

	public void setIsEsNuevoParametroSeguridad(Boolean isEsNuevoParametroSeguridad) {
		this.isEsNuevoParametroSeguridad = isEsNuevoParametroSeguridad;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroSeguridad() {
		return esParaAccionDesdeFormularioParametroSeguridad;
	}
	
	public void setEsParaAccionDesdeFormularioParametroSeguridad(Boolean esParaAccionDesdeFormularioParametroSeguridad) {
		this.esParaAccionDesdeFormularioParametroSeguridad = esParaAccionDesdeFormularioParametroSeguridad;
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

			if(this.parametroseguridadSessionBean==null) {
				this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
			}

			if(!this.parametroseguridadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametroseguridadSessionBean.getlidEmpresaActual());
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

					if(this.parametroseguridad!=null) {
						this.parametroseguridad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
						this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroSeguridad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
						if(this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroSeguridadGenerico)throws Exception
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
				jComboBoxid_empresaParametroSeguridadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroSeguridadGenerico!=null && jComboBoxid_empresaParametroSeguridadGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroSeguridadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroSeguridad parametroseguridad,JComboBox jComboBoxid_empresaParametroSeguridadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroSeguridadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroSeguridadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametroseguridad.setid_empresa(empresaAux.getId());
				parametroseguridad.setempresa_descripcion(ParametroSeguridadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametroseguridad.setEmpresa(empresaAux);			}
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

					if(!ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { 
							this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { 
					}

					if(!ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
							this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
							this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesParametroSeguridad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroSeguridadConstantesFunciones.refrescarForeignKeysDescripcionesParametroSeguridad(this.parametroseguridadLogic.getParametroSeguridads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroSeguridadConstantesFunciones.refrescarForeignKeysDescripcionesParametroSeguridad(this.parametroseguridads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametroseguridadLogic.setParametroSeguridads(this.parametroseguridads);
			parametroseguridadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroSeguridadParameterReturnGeneral getParametroSeguridadParameterGeneral() {
		return this.parametroseguridadParameterGeneral;
	}
	
	public void setParametroSeguridadParameterGeneral(ParametroSeguridadParameterReturnGeneral parametroseguridadParameterGeneral) {
		this.parametroseguridadParameterGeneral = parametroseguridadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroSeguridad() {
		return isPermisoTodoParametroSeguridad;
	}

	public void setIsPermisoTodoParametroSeguridad(Boolean isPermisoTodoParametroSeguridad) {
		this.isPermisoTodoParametroSeguridad = isPermisoTodoParametroSeguridad;
	}

	public Boolean getIsPermisoNuevoParametroSeguridad() {
		return isPermisoNuevoParametroSeguridad;
	}

	public void setIsPermisoNuevoParametroSeguridad(Boolean isPermisoNuevoParametroSeguridad) {
		this.isPermisoNuevoParametroSeguridad = isPermisoNuevoParametroSeguridad;
	}

	public Boolean getIsPermisoActualizarParametroSeguridad() {
		return isPermisoActualizarParametroSeguridad;
	}

	public void setIsPermisoActualizarParametroSeguridad(Boolean isPermisoActualizarParametroSeguridad) {
		this.isPermisoActualizarParametroSeguridad = isPermisoActualizarParametroSeguridad;
	}

	public Boolean getIsPermisoEliminarParametroSeguridad() {
		return isPermisoEliminarParametroSeguridad;
	}

	public void setIsPermisoEliminarParametroSeguridad(Boolean isPermisoEliminarParametroSeguridad) {
		this.isPermisoEliminarParametroSeguridad = isPermisoEliminarParametroSeguridad;
	}

	public Boolean getIsPermisoGuardarCambiosParametroSeguridad() {
		return isPermisoGuardarCambiosParametroSeguridad;
	}

	public void setIsPermisoGuardarCambiosParametroSeguridad(Boolean isPermisoGuardarCambiosParametroSeguridad) {
		this.isPermisoGuardarCambiosParametroSeguridad = isPermisoGuardarCambiosParametroSeguridad;
	}
	
	public Boolean getIsPermisoConsultaParametroSeguridad() {
		return isPermisoConsultaParametroSeguridad;
	}

	public void setIsPermisoConsultaParametroSeguridad(Boolean isPermisoConsultaParametroSeguridad) {
		this.isPermisoConsultaParametroSeguridad = isPermisoConsultaParametroSeguridad;
	}

	public Boolean getIsPermisoBusquedaParametroSeguridad() {
		return isPermisoBusquedaParametroSeguridad;
	}

	public void setIsPermisoBusquedaParametroSeguridad(Boolean isPermisoBusquedaParametroSeguridad) {
		this.isPermisoBusquedaParametroSeguridad = isPermisoBusquedaParametroSeguridad;
	}

	public Boolean getIsPermisoReporteParametroSeguridad() {
		return isPermisoReporteParametroSeguridad;
	}

	public void setIsPermisoReporteParametroSeguridad(Boolean isPermisoReporteParametroSeguridad) {
		this.isPermisoReporteParametroSeguridad = isPermisoReporteParametroSeguridad;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroSeguridad() {
		return isPermisoPaginacionMedioParametroSeguridad;
	}

	public void setIsPermisoPaginacionMedioParametroSeguridad(Boolean isPermisoPaginacionMedioParametroSeguridad) {
		this.isPermisoPaginacionMedioParametroSeguridad = isPermisoPaginacionMedioParametroSeguridad;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroSeguridad() {
		return isPermisoPaginacionTodoParametroSeguridad;
	}

	public void setIsPermisoPaginacionTodoParametroSeguridad(Boolean isPermisoPaginacionTodoParametroSeguridad) {
		this.isPermisoPaginacionTodoParametroSeguridad = isPermisoPaginacionTodoParametroSeguridad;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroSeguridad() {
		return isPermisoPaginacionAltoParametroSeguridad;
	}

	public void setIsPermisoPaginacionAltoParametroSeguridad(Boolean isPermisoPaginacionAltoParametroSeguridad) {
		this.isPermisoPaginacionAltoParametroSeguridad = isPermisoPaginacionAltoParametroSeguridad;
	}
	
	public Boolean getIsPermisoCopiarParametroSeguridad() {
		return isPermisoCopiarParametroSeguridad;
	}

	public void setIsPermisoCopiarParametroSeguridad(Boolean isPermisoCopiarParametroSeguridad) {
		this.isPermisoCopiarParametroSeguridad = isPermisoCopiarParametroSeguridad;
	}
	
	public Boolean getIsPermisoVerFormParametroSeguridad() {
		return isPermisoVerFormParametroSeguridad;
	}

	public void setIsPermisoVerFormParametroSeguridad(Boolean isPermisoVerFormParametroSeguridad) {
		this.isPermisoVerFormParametroSeguridad = isPermisoVerFormParametroSeguridad;
	}
	
	public Boolean getIsPermisoDuplicarParametroSeguridad() {
		return isPermisoDuplicarParametroSeguridad;
	}

	public void setIsPermisoDuplicarParametroSeguridad(Boolean isPermisoDuplicarParametroSeguridad) {
		this.isPermisoDuplicarParametroSeguridad = isPermisoDuplicarParametroSeguridad;
	}
	
	public Boolean getIsPermisoOrdenParametroSeguridad() {
		return isPermisoOrdenParametroSeguridad;
	}

	public void setIsPermisoOrdenParametroSeguridad(Boolean isPermisoOrdenParametroSeguridad) {
		this.isPermisoOrdenParametroSeguridad = isPermisoOrdenParametroSeguridad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroSeguridad() {
		return isVisibilidadCeldaNuevoParametroSeguridad;
	}

	public void setIsVisibilidadCeldaNuevoParametroSeguridad(Boolean isVisibilidadCeldaNuevoParametroSeguridad) {
		this.isVisibilidadCeldaNuevoParametroSeguridad = isVisibilidadCeldaNuevoParametroSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroSeguridad() {
		return isVisibilidadCeldaDuplicarParametroSeguridad;
	}

	public void setIsVisibilidadCeldaDuplicarParametroSeguridad(Boolean isVisibilidadCeldaDuplicarParametroSeguridad) {
		this.isVisibilidadCeldaDuplicarParametroSeguridad = isVisibilidadCeldaDuplicarParametroSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroSeguridad() {
		return isVisibilidadCeldaCopiarParametroSeguridad;
	}

	public void setIsVisibilidadCeldaCopiarParametroSeguridad(Boolean isVisibilidadCeldaCopiarParametroSeguridad) {
		this.isVisibilidadCeldaCopiarParametroSeguridad = isVisibilidadCeldaCopiarParametroSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroSeguridad() {
		return isVisibilidadCeldaVerFormParametroSeguridad;
	}

	public void setIsVisibilidadCeldaVerFormParametroSeguridad(Boolean isVisibilidadCeldaVerFormParametroSeguridad) {
		this.isVisibilidadCeldaVerFormParametroSeguridad = isVisibilidadCeldaVerFormParametroSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroSeguridad() {
		return isVisibilidadCeldaOrdenParametroSeguridad;
	}

	public void setIsVisibilidadCeldaOrdenParametroSeguridad(Boolean isVisibilidadCeldaOrdenParametroSeguridad) {
		this.isVisibilidadCeldaOrdenParametroSeguridad = isVisibilidadCeldaOrdenParametroSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroSeguridad() {
		return isVisibilidadCeldaNuevoRelacionesParametroSeguridad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroSeguridad(Boolean isVisibilidadCeldaNuevoRelacionesParametroSeguridad) {
		this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad = isVisibilidadCeldaNuevoRelacionesParametroSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroSeguridad() {
		return isVisibilidadCeldaModificarParametroSeguridad;
	}

	public void setIsVisibilidadCeldaModificarParametroSeguridad(Boolean isVisibilidadCeldaModificarParametroSeguridad) {
		this.isVisibilidadCeldaModificarParametroSeguridad = isVisibilidadCeldaModificarParametroSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroSeguridad() {
		return isVisibilidadCeldaActualizarParametroSeguridad;
	}

	public void setIsVisibilidadCeldaActualizarParametroSeguridad(Boolean isVisibilidadCeldaActualizarParametroSeguridad) {
		this.isVisibilidadCeldaActualizarParametroSeguridad = isVisibilidadCeldaActualizarParametroSeguridad;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroSeguridad() {
		return isVisibilidadCeldaEliminarParametroSeguridad;
	}

	public void setIsVisibilidadCeldaEliminarParametroSeguridad(Boolean isVisibilidadCeldaEliminarParametroSeguridad) {
		this.isVisibilidadCeldaEliminarParametroSeguridad = isVisibilidadCeldaEliminarParametroSeguridad;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroSeguridad() {
		return isVisibilidadCeldaCancelarParametroSeguridad;
	}

	public void setIsVisibilidadCeldaCancelarParametroSeguridad(Boolean isVisibilidadCeldaCancelarParametroSeguridad) {
		this.isVisibilidadCeldaCancelarParametroSeguridad = isVisibilidadCeldaCancelarParametroSeguridad;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroSeguridad() {
		return isVisibilidadCeldaGuardarParametroSeguridad;
	}

	public void setIsVisibilidadCeldaGuardarParametroSeguridad(Boolean isVisibilidadCeldaGuardarParametroSeguridad) {
		this.isVisibilidadCeldaGuardarParametroSeguridad = isVisibilidadCeldaGuardarParametroSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroSeguridad() {
		return isVisibilidadCeldaGuardarCambiosParametroSeguridad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroSeguridad(Boolean isVisibilidadCeldaGuardarCambiosParametroSeguridad) {
		this.isVisibilidadCeldaGuardarCambiosParametroSeguridad = isVisibilidadCeldaGuardarCambiosParametroSeguridad;
	}
		
	public ParametroSeguridadSessionBean getparametroseguridadSessionBean() {
		return this.parametroseguridadSessionBean;
	}
	
	public void setparametroseguridadSessionBean(ParametroSeguridadSessionBean parametroseguridadSessionBean) {
		this.parametroseguridadSessionBean=parametroseguridadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(ParametroSeguridad parametroseguridad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametroseguridad,null);
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
	
	public void bugActualizarReferenciaActual(ParametroSeguridad parametroseguridad,ParametroSeguridad parametroseguridadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroSeguridad(parametroseguridad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametroseguridadAux.setId(parametroseguridad.getId());
		parametroseguridadAux.setVersionRow(parametroseguridad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroSeguridad();
		
			int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametroseguridadValidator.getInvalidValues(this.parametroseguridad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametroseguridadLogic.setDatosCliente(datosCliente);
			parametroseguridadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametroseguridadAux=new  ParametroSeguridad();
				
				parametroseguridadAux.setIsNew(true);
				parametroseguridadAux.setIsChanged(true);
				
				parametroseguridadAux.setParametroSeguridadOriginal(this.parametroseguridad);
				
				parametroseguridadAux.setId(this.parametroseguridad.getId());	
				parametroseguridadAux.setVersionRow(this.parametroseguridad.getVersionRow());	
				parametroseguridadAux.setid_empresa(this.parametroseguridad.getid_empresa());	
				parametroseguridadAux.setcon_cartera(this.parametroseguridad.getcon_cartera());	
				parametroseguridadAux.setcon_copiar_clientes(this.parametroseguridad.getcon_copiar_clientes());	
				parametroseguridadAux.setcon_copiar_proveedores(this.parametroseguridad.getcon_copiar_proveedores());	
				parametroseguridadAux.setcon_generar_cliente_prove(this.parametroseguridad.getcon_generar_cliente_prove());	
				parametroseguridadAux.setcliente_con_secuencial_auto(this.parametroseguridad.getcliente_con_secuencial_auto());	
				parametroseguridadAux.setcliente_num_maximo_iniciales(this.parametroseguridad.getcliente_num_maximo_iniciales());	
				parametroseguridadAux.setprove_con_secuencial_auto(this.parametroseguridad.getprove_con_secuencial_auto());	
				parametroseguridadAux.setprove_num_maximo_iniciales(this.parametroseguridad.getprove_num_maximo_iniciales());	
				parametroseguridadAux.setcon_validar_grupos(this.parametroseguridad.getcon_validar_grupos());	
				parametroseguridadAux.setacti_fijo_con_secuencial_auto(this.parametroseguridad.getacti_fijo_con_secuencial_auto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroseguridadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametroseguridadAux,parametroseguridadLogic.getParametroSeguridads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroseguridadAux,parametroseguridads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroseguridadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroseguridadLogic.saveParametroSeguridads();//WithConnection
						//parametroseguridadLogic.getSetVersionRowParametroSeguridads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroseguridad,parametroseguridadAux);
					
					this.refrescarForeignKeysDescripcionesParametroSeguridad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametroseguridadAux=new  ParametroSeguridad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado() 
					|| (this.parametroseguridadSessionBean.getEsGuardarRelacionado() && this.parametroseguridad.getId()>=0)) {
						
					parametroseguridadAux.setIsNew(false);
				}
				
				parametroseguridadAux.setIsDeleted(false);
			
				parametroseguridadAux.setId(this.parametroseguridad.getId());	
				parametroseguridadAux.setVersionRow(this.parametroseguridad.getVersionRow());	
				parametroseguridadAux.setid_empresa(this.parametroseguridad.getid_empresa());	
				parametroseguridadAux.setcon_cartera(this.parametroseguridad.getcon_cartera());	
				parametroseguridadAux.setcon_copiar_clientes(this.parametroseguridad.getcon_copiar_clientes());	
				parametroseguridadAux.setcon_copiar_proveedores(this.parametroseguridad.getcon_copiar_proveedores());	
				parametroseguridadAux.setcon_generar_cliente_prove(this.parametroseguridad.getcon_generar_cliente_prove());	
				parametroseguridadAux.setcliente_con_secuencial_auto(this.parametroseguridad.getcliente_con_secuencial_auto());	
				parametroseguridadAux.setcliente_num_maximo_iniciales(this.parametroseguridad.getcliente_num_maximo_iniciales());	
				parametroseguridadAux.setprove_con_secuencial_auto(this.parametroseguridad.getprove_con_secuencial_auto());	
				parametroseguridadAux.setprove_num_maximo_iniciales(this.parametroseguridad.getprove_num_maximo_iniciales());	
				parametroseguridadAux.setcon_validar_grupos(this.parametroseguridad.getcon_validar_grupos());	
				parametroseguridadAux.setacti_fijo_con_secuencial_auto(this.parametroseguridad.getacti_fijo_con_secuencial_auto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroseguridadAux,parametroseguridadLogic.getParametroSeguridads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroseguridadAux,parametroseguridads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroseguridadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroseguridadLogic.saveParametroSeguridads();//WithConnection
						//parametroseguridadLogic.getSetVersionRowParametroSeguridads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroseguridad,parametroseguridadAux);
					
					this.refrescarForeignKeysDescripcionesParametroSeguridad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametroseguridadAux=new  ParametroSeguridad();
				
				parametroseguridadAux.setIsNew(false);
				parametroseguridadAux.setIsChanged(false);
				
				parametroseguridadAux.setIsDeleted(true);
				
				parametroseguridadAux.setId(this.parametroseguridad.getId());	
				parametroseguridadAux.setVersionRow(this.parametroseguridad.getVersionRow());	
				parametroseguridadAux.setid_empresa(this.parametroseguridad.getid_empresa());	
				parametroseguridadAux.setcon_cartera(this.parametroseguridad.getcon_cartera());	
				parametroseguridadAux.setcon_copiar_clientes(this.parametroseguridad.getcon_copiar_clientes());	
				parametroseguridadAux.setcon_copiar_proveedores(this.parametroseguridad.getcon_copiar_proveedores());	
				parametroseguridadAux.setcon_generar_cliente_prove(this.parametroseguridad.getcon_generar_cliente_prove());	
				parametroseguridadAux.setcliente_con_secuencial_auto(this.parametroseguridad.getcliente_con_secuencial_auto());	
				parametroseguridadAux.setcliente_num_maximo_iniciales(this.parametroseguridad.getcliente_num_maximo_iniciales());	
				parametroseguridadAux.setprove_con_secuencial_auto(this.parametroseguridad.getprove_con_secuencial_auto());	
				parametroseguridadAux.setprove_num_maximo_iniciales(this.parametroseguridad.getprove_num_maximo_iniciales());	
				parametroseguridadAux.setcon_validar_grupos(this.parametroseguridad.getcon_validar_grupos());	
				parametroseguridadAux.setacti_fijo_con_secuencial_auto(this.parametroseguridad.getacti_fijo_con_secuencial_auto());	
				
				if(this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametroseguridadAux.getId()>=0) {	
						this.parametroseguridadsEliminados.add(parametroseguridadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametroseguridadAux,parametroseguridadLogic.getParametroSeguridads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroseguridadAux,parametroseguridads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroseguridadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroseguridadLogic.saveParametroSeguridads();//WithConnection
						//parametroseguridadLogic.getSetVersionRowParametroSeguridads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametroseguridadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametroseguridadAux,parametroseguridadLogic.getParametroSeguridads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametroseguridadAux,parametroseguridads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getParametroSeguridads().addAll(this.parametroseguridadsEliminados);
					
					parametroseguridadLogic.saveParametroSeguridads();//WithConnection
					//parametroseguridadLogic.getSetVersionRowParametroSeguridads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroSeguridad();
				
				this.parametroseguridadsEliminados= new ArrayList<ParametroSeguridad>();		
			}
			
			if(this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Seguridad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametroseguridad=parametroseguridadAux;
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
      		//this.finishProcessParametroSeguridad();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroSeguridad parametroseguridadLocal) throws Exception {
		
		if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroSeguridad parametroseguridadLocal) throws Exception {	
		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametroseguridadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroSeguridadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametroseguridadValidator.getInvalidValues(this.parametroseguridad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroSeguridad parametroseguridad,List<ParametroSeguridad> parametroseguridads) throws Exception {
		try	{		
			ParametroSeguridadConstantesFunciones.actualizarLista(parametroseguridad,parametroseguridads,this.parametroseguridadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroSeguridad parametroseguridad,List<ParametroSeguridad> parametroseguridads) throws Exception {
		try	{			
			ParametroSeguridadConstantesFunciones.actualizarSelectedLista(parametroseguridad,parametroseguridads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroSeguridad> parametroseguridadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametroseguridadsLocal=this.parametroseguridadLogic.getParametroSeguridads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametroseguridadsLocal=this.parametroseguridads;
			}
			//ARCHITECTURE
		
			for(ParametroSeguridad parametroseguridadLocal:parametroseguridadsLocal) {
				if(this.permiteMantenimiento(parametroseguridadLocal) && parametroseguridadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroSeguridadConstantesFunciones.getParametroSeguridadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelid_empresaParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.CONCARTERA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_carteraParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.CONCOPIARCLIENTES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_copiar_clientesParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.CONCOPIARPROVEEDORES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_copiar_proveedoresParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.CONGENERARCLIENTEPROVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_generar_cliente_proveParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.CLIENTECONSECUENCIALAUTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcliente_con_secuencial_autoParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.CLIENTENUMMAXIMOINICIALES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcliente_num_maximo_inicialesParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.PROVECONSECUENCIALAUTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelprove_con_secuencial_autoParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.PROVENUMMAXIMOINICIALES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelprove_num_maximo_inicialesParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.CONVALIDARGRUPOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_validar_gruposParametroSeguridad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroSeguridadConstantesFunciones.ACTIFIJOCONSECUENCIALAUTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelacti_fijo_con_secuencial_autoParametroSeguridad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelid_empresaParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_carteraParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_copiar_clientesParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_copiar_proveedoresParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_generar_cliente_proveParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcliente_con_secuencial_autoParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcliente_num_maximo_inicialesParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelprove_con_secuencial_autoParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelprove_num_maximo_inicialesParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_validar_gruposParametroSeguridad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroSeguridad.jLabelacti_fijo_con_secuencial_autoParametroSeguridad,"");
		
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
		this.iIdNuevoParametroSeguridad--;	
		
		
		this.parametroseguridadAux=new ParametroSeguridad();
		
		this.parametroseguridadAux.setId(this.iIdNuevoParametroSeguridad);
		this.parametroseguridadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroseguridadLogic.getParametroSeguridads().add(this.parametroseguridadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametroseguridads.add(this.parametroseguridadAux);
		}
		//ARCHITECTURE
		
		this.parametroseguridad=this.parametroseguridadAux;
		
		if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroSeguridad(this.parametroseguridad);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroSeguridad(this.parametroseguridad);
		}
				
		//this.setDefaultControlesParametroSeguridad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroSeguridad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroSeguridad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroSeguridad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroSeguridad(this.parametroseguridadBean,this.parametroseguridad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroSeguridadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
			classes=ParametroSeguridadConstantesFunciones.getClassesRelationshipsOfParametroSeguridad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametroseguridadReturnGeneral=parametroseguridadLogic.procesarEventosParametroSeguridadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroseguridadLogic.getParametroSeguridads(),this.parametroseguridad,this.parametroseguridadParameterGeneral,this.isEsNuevoParametroSeguridad,classes);//this.parametroseguridadLogic.getParametroSeguridad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroSeguridad(this.parametroseguridadReturnGeneral,this.parametroseguridadBean,false);
		
		if(this.parametroseguridadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroSeguridad(this.parametroseguridadReturnGeneral.getParametroSeguridad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroSeguridad(this.parametroseguridadReturnGeneral.getParametroSeguridad());
		}
		
		if(this.parametroseguridadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroSeguridad(this.parametroseguridadReturnGeneral.getParametroSeguridad(),classes);//this.parametroseguridadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroSeguridad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroSeguridad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.RecargarFormParametroSeguridad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroSeguridad(false);
						
			if(parametroseguridadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroSeguridad();
			}
			
			this.actualizarVisualTableDatosParametroSeguridad();
			
			this.jTableDatosParametroSeguridad.setRowSelectionInterval(this.getIndiceNuevoParametroSeguridad(), this.getIndiceNuevoParametroSeguridad());
			
			this.seleccionarFilaTablaParametroSeguridadActual();
						
			this.actualizarEstadoCeldasBotonesParametroSeguridad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroSeguridad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarcon_carteraParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarcon_copiar_clientesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarcon_copiar_proveedoresParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarcon_generar_cliente_proveParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarcliente_con_secuencial_autoParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarcliente_num_maximo_inicialesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarprove_con_secuencial_autoParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldprove_num_maximo_inicialesParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarprove_num_maximo_inicialesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarcon_validar_gruposParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activaracti_fijo_con_secuencial_autoParametroSeguridad);	
		//
		this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setEnabled(isHabilitar && this.parametroseguridadConstantesFunciones.activarid_empresaParametroSeguridad);
	};
	
	public void setDefaultControlesParametroSeguridad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroSeguridad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametroseguridadSessionBean.setConGuardarRelaciones(true);			
			this.parametroseguridadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.setVisible(true);
			
					
		} else {
			//this.parametroseguridadSessionBean.setConGuardarRelaciones(false);			
			this.parametroseguridadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroSeguridad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
				if(parametroseguridadAux.getId().equals(this.iIdNuevoParametroSeguridad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroSeguridad parametroseguridadAux:this.parametroseguridads) {
				if(parametroseguridadAux.getId().equals(this.iIdNuevoParametroSeguridad)) {
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
	
	public int getIndiceActualParametroSeguridad(ParametroSeguridad parametroseguridad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
				if(parametroseguridadAux.getId().equals(parametroseguridad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroSeguridad parametroseguridadAux:this.parametroseguridads) {
				if(parametroseguridadAux.getId().equals(parametroseguridad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroSeguridad(ParametroSeguridad parametroseguridadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
				if(parametroseguridadAux.getParametroSeguridadOriginal().getId().equals(parametroseguridadOriginal.getId())) {
					existe=true;
					parametroseguridadOriginal.setId(parametroseguridadAux.getId());
					parametroseguridadOriginal.setVersionRow(parametroseguridadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroSeguridad parametroseguridadAux:this.parametroseguridads) {
				if(parametroseguridadAux.getParametroSeguridadOriginal().getId().equals(parametroseguridadOriginal.getId())) {
					existe=true;
					parametroseguridadOriginal.setId(parametroseguridadAux.getId());
					parametroseguridadOriginal.setVersionRow(parametroseguridadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroSeguridad(Boolean esParaCancelar) throws Exception {
		parametroseguridadsAux=new ArrayList<ParametroSeguridad>();
		parametroseguridadAux=new ParametroSeguridad();
		
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
					if(parametroseguridadAux.getId()<0) {
						parametroseguridadsAux.add(parametroseguridadAux);
					}		
				}
				this.iIdNuevoParametroSeguridad=0L;
				this.parametroseguridadLogic.getParametroSeguridads().removeAll(parametroseguridadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroSeguridad parametroseguridadAux:this.parametroseguridads) {
					if(parametroseguridadAux.getId()<0) {
						parametroseguridadsAux.add(parametroseguridadAux);
					}		
				}
				this.iIdNuevoParametroSeguridad=0L;
				this.parametroseguridads.removeAll(parametroseguridadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroSeguridad 
					&& this.parametroseguridadLogic.getParametroSeguridads().size()>0
					) {
					parametroseguridadAux=this.parametroseguridadLogic.getParametroSeguridads().get(this.parametroseguridadLogic.getParametroSeguridads().size() - 1);
				
					if(parametroseguridadAux.getId()<0) {
						this.parametroseguridadLogic.getParametroSeguridads().remove(parametroseguridadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroSeguridad && this.parametroseguridads.size()>0) {
					parametroseguridadAux=this.parametroseguridads.get(this.parametroseguridads.size() - 1);
				
					if(parametroseguridadAux.getId()<0) {
						this.parametroseguridads.remove(parametroseguridadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroSeguridad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametroseguridad.getId()<0) {
				this.parametroseguridadLogic.getParametroSeguridads().remove(this.parametroseguridad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametroseguridad.getId()<0) {
				this.parametroseguridads.remove(this.parametroseguridad);
			}
		}			
	}
	
	public void setEstadosInicialesParametroSeguridad(List<ParametroSeguridad> parametroseguridadsAux) throws Exception {
		ParametroSeguridadConstantesFunciones.setEstadosInicialesParametroSeguridad(parametroseguridadsAux);
	}
	
	public void setEstadosInicialesParametroSeguridad(ParametroSeguridad parametroseguridadAux) throws Exception {
		ParametroSeguridadConstantesFunciones.setEstadosInicialesParametroSeguridad(parametroseguridadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroSeguridadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroSeguridadActual()) {
				if(!this.isEsNuevoParametroSeguridad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroSeguridad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroSeguridadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Seguridad ?", "MANTENIMIENTO DE Parametro Seguridad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroSeguridad parametroseguridad) throws Exception {
		ParametroSeguridadConstantesFunciones.seleccionarAsignar(this.parametroseguridad,parametroseguridad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroSeguridad=this.isPermisoActualizarOriginalParametroSeguridad;
			
			
			this.seleccionarAsignar(parametroseguridad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroSeguridadConstantesFunciones.quitarEspaciosParametroSeguridad(this.parametroseguridad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroSeguridad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametroseguridadSessionBean.setsFuncionBusquedaRapida(this.parametroseguridadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroSeguridad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroSeguridad(esParaCancelar);				
				this.cancelarNuevoParametroSeguridad(esParaCancelar);								
			}
			
			this.parametroseguridad=new ParametroSeguridad();
			
			this.inicializarParametroSeguridad();
			
			this.actualizarEstadoCeldasBotonesParametroSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroSeguridad() throws Exception {
		try {
			ParametroSeguridadConstantesFunciones.inicializarParametroSeguridad(this.parametroseguridad);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametroseguridadLogic.getParametroSeguridads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroSeguridads(String sAccionBusqueda,List<ParametroSeguridad> parametroseguridadsParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroSeguridad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroSeguridadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroSeguridadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroSeguridad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Seguridades");		
		parameters.put("busquedapor", ParametroSeguridadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroSeguridad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroSeguridadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroSeguridadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroSeguridad=new JRBeanArrayDataSource(ParametroSeguridadJInternalFrame.TraerParametroSeguridadBeans(parametroseguridadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroSeguridad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroSeguridadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroSeguridadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroSeguridadBean.TraerParametroSeguridadBeans(parametroseguridadsParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroSeguridads(sAccionBusqueda,sTipoArchivoReporte,parametroseguridadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroSeguridads(sAccionBusqueda,sTipoArchivoReporte,parametroseguridadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroSeguridadActionPerformed(null);
					//this.generarExcelReporteParametroSeguridads(sAccionBusqueda,sTipoArchivoReporte,parametroseguridadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroSeguridads(sAccionBusqueda,sTipoArchivoReporte,parametroseguridadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroSeguridads(sAccionBusqueda,sTipoArchivoReporte,parametroseguridadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroSeguridads(sAccionBusqueda,sTipoArchivoReporte,parametroseguridadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroSeguridads(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroSeguridad> parametroseguridadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroseguridad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroSeguridads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroSeguridad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroSeguridad parametroseguridad : parametroseguridadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroSeguridadConstantesFunciones.generarExcelReporteDataParametroSeguridad("NORMAL",row,workbook,parametroseguridad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroSeguridad(String sTipo,Row row,Workbook workbook) {
		
		ParametroSeguridadConstantesFunciones.generarExcelReporteHeaderParametroSeguridad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroSeguridads(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroSeguridad> parametroseguridadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroseguridad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroSeguridads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroSeguridad parametroseguridad : parametroseguridadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroSeguridadConstantesFunciones.getParametroSeguridadDescripcion(parametroseguridad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroseguridad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroseguridad.getcon_cartera()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroseguridad.getcon_copiar_clientes()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroseguridad.getcon_copiar_proveedores()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroseguridad.getcon_generar_cliente_prove()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroseguridad.getcliente_con_secuencial_auto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroseguridad.getcliente_num_maximo_iniciales());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroseguridad.getprove_con_secuencial_auto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroseguridad.getprove_num_maximo_iniciales());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroseguridad.getcon_validar_grupos()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametroseguridad.getacti_fijo_con_secuencial_auto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroSeguridads(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroSeguridad> parametroseguridadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroSeguridad> parametroseguridadsRespaldo=null;
		
		classes=ParametroSeguridadConstantesFunciones.getClassesRelationshipsOfParametroSeguridad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametroseguridadLogic.setDatosCliente(this.datosCliente);
		this.parametroseguridadLogic.setDatosDeep(this.datosDeep);
		this.parametroseguridadLogic.setIsConDeep(true);
		
		parametroseguridadsRespaldo=this.parametroseguridadLogic.getParametroSeguridads();
		
		this.parametroseguridadLogic.setParametroSeguridads(parametroseguridadsParaReportes);	
		this.parametroseguridadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametroseguridadsParaReportes=this.parametroseguridadLogic.getParametroSeguridads();
		this.parametroseguridadLogic.setParametroSeguridads(parametroseguridadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroseguridad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroSeguridads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroSeguridad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroSeguridad parametroseguridad : parametroseguridadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroSeguridad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroSeguridadConstantesFunciones.generarExcelReporteDataParametroSeguridad("NORMAL",row,workbook,parametroseguridad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroSeguridadConstantesFunciones.getParametroSeguridadDescripcion(parametroseguridad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroSeguridad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroSeguridad() throws Exception {		
		this.startProcessParametroSeguridad(true);
	}
	
	public void startProcessParametroSeguridad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroSeguridad ,this.jPanelParametrosReportesParametroSeguridad, this.jScrollPanelDatosParametroSeguridad,this.jPanelPaginacionParametroSeguridad, this.jScrollPanelDatosEdicionParametroSeguridad, this.jPanelAccionesParametroSeguridad,this.jPanelAccionesFormularioParametroSeguridad,this.jmenuBarParametroSeguridad,this.jmenuBarDetalleParametroSeguridad,this.jTtoolBarParametroSeguridad,this.jTtoolBarDetalleParametroSeguridad);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroSeguridad=this.jTabbedPaneBusquedasParametroSeguridad; 
		
		final JPanel jPanelParametrosReportesParametroSeguridad=this.jPanelParametrosReportesParametroSeguridad;
		//final JScrollPane jScrollPanelDatosParametroSeguridad=this.jScrollPanelDatosParametroSeguridad;
		final JTable jTableDatosParametroSeguridad=this.jTableDatosParametroSeguridad;		
		final JPanel jPanelPaginacionParametroSeguridad=this.jPanelPaginacionParametroSeguridad;
		//final JScrollPane jScrollPanelDatosEdicionParametroSeguridad=this.jScrollPanelDatosEdicionParametroSeguridad;
		final JPanel jPanelAccionesParametroSeguridad=this.jPanelAccionesParametroSeguridad;
		
		JPanel jPanelCamposAuxiliarParametroSeguridad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroSeguridad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			jPanelCamposAuxiliarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jPanelCamposParametroSeguridad;
			jPanelAccionesFormularioAuxiliarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jPanelAccionesFormularioParametroSeguridad;
		}
		
		final JPanel jPanelCamposParametroSeguridad=jPanelCamposAuxiliarParametroSeguridad;
		final JPanel jPanelAccionesFormularioParametroSeguridad=jPanelAccionesFormularioAuxiliarParametroSeguridad;
		
		
		final JMenuBar jmenuBarParametroSeguridad=this.jmenuBarParametroSeguridad;
		final JToolBar jTtoolBarParametroSeguridad=this.jTtoolBarParametroSeguridad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroSeguridad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroSeguridad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			jmenuBarDetalleAuxiliarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jmenuBarDetalleParametroSeguridad;
			jTtoolBarDetalleAuxiliarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jTtoolBarDetalleParametroSeguridad;
		}
		
		final JMenuBar jmenuBarDetalleParametroSeguridad=jmenuBarDetalleAuxiliarParametroSeguridad;
		final JToolBar jTtoolBarDetalleParametroSeguridad=jTtoolBarDetalleAuxiliarParametroSeguridad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroSeguridad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroSeguridad;
			processRunnable.jTableDatos=jTableDatosParametroSeguridad;
			processRunnable.jPanelCampos=jPanelCamposParametroSeguridad;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroSeguridad;
			processRunnable.jPanelAcciones=jPanelAccionesParametroSeguridad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroSeguridad;
			
			
			processRunnable.jmenuBar=jmenuBarParametroSeguridad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroSeguridad;
			processRunnable.jTtoolBar=jTtoolBarParametroSeguridad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroSeguridad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroSeguridad ,jPanelParametrosReportesParametroSeguridad,jTableDatosParametroSeguridad, /*jScrollPanelDatosParametroSeguridad,*/jPanelCamposParametroSeguridad,jPanelPaginacionParametroSeguridad, /*jScrollPanelDatosEdicionParametroSeguridad,*/ jPanelAccionesParametroSeguridad,jPanelAccionesFormularioParametroSeguridad,jmenuBarParametroSeguridad,jmenuBarDetalleParametroSeguridad,jTtoolBarParametroSeguridad,jTtoolBarDetalleParametroSeguridad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroSeguridad ,jPanelParametrosReportesParametroSeguridad, jScrollPanelDatosParametroSeguridad,jPanelPaginacionParametroSeguridad, jScrollPanelDatosEdicionParametroSeguridad, jPanelAccionesParametroSeguridad,jPanelAccionesFormularioParametroSeguridad,jmenuBarParametroSeguridad,jmenuBarDetalleParametroSeguridad,jTtoolBarParametroSeguridad,jTtoolBarDetalleParametroSeguridad);
						
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
	
	public void finishProcessParametroSeguridad() {// throws Exception 
		this.finishProcessParametroSeguridad(true);
	}
	
	public void finishProcessParametroSeguridad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroSeguridad ,this.jPanelParametrosReportesParametroSeguridad, this.jScrollPanelDatosParametroSeguridad,this.jPanelPaginacionParametroSeguridad, this.jScrollPanelDatosEdicionParametroSeguridad, this.jPanelAccionesParametroSeguridad,this.jPanelAccionesFormularioParametroSeguridad,this.jmenuBarParametroSeguridad,this.jmenuBarDetalleParametroSeguridad,this.jTtoolBarParametroSeguridad,this.jTtoolBarDetalleParametroSeguridad);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroSeguridad=this.jTabbedPaneBusquedasParametroSeguridad; 
		
		final JPanel jPanelParametrosReportesParametroSeguridad=this.jPanelParametrosReportesParametroSeguridad;
		//final JScrollPane jScrollPanelDatosParametroSeguridad=this.jScrollPanelDatosParametroSeguridad;
		final JTable jTableDatosParametroSeguridad=this.jTableDatosParametroSeguridad;		
		final JPanel jPanelPaginacionParametroSeguridad=this.jPanelPaginacionParametroSeguridad;
		//final JScrollPane jScrollPanelDatosEdicionParametroSeguridad=this.jScrollPanelDatosEdicionParametroSeguridad;
		final JPanel jPanelAccionesParametroSeguridad=this.jPanelAccionesParametroSeguridad;
		
		JPanel jPanelCamposAuxiliarParametroSeguridad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroSeguridad=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			jPanelCamposAuxiliarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jPanelCamposParametroSeguridad;
			jPanelAccionesFormularioAuxiliarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jPanelAccionesFormularioParametroSeguridad;
		}
		
		final JPanel jPanelCamposParametroSeguridad=jPanelCamposAuxiliarParametroSeguridad;
		final JPanel jPanelAccionesFormularioParametroSeguridad=jPanelAccionesFormularioAuxiliarParametroSeguridad;
		
		
		final JMenuBar jmenuBarParametroSeguridad=this.jmenuBarParametroSeguridad;		
		final JToolBar jTtoolBarParametroSeguridad=this.jTtoolBarParametroSeguridad;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroSeguridad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroSeguridad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			jmenuBarDetalleAuxiliarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jmenuBarDetalleParametroSeguridad;
			jTtoolBarDetalleAuxiliarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jTtoolBarDetalleParametroSeguridad;		
		}
		
		final JMenuBar jmenuBarDetalleParametroSeguridad=jmenuBarDetalleAuxiliarParametroSeguridad;
		final JToolBar jTtoolBarDetalleParametroSeguridad=jTtoolBarDetalleAuxiliarParametroSeguridad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroSeguridad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroSeguridad;
			processRunnable.jTableDatos=jTableDatosParametroSeguridad;
			processRunnable.jPanelCampos=jPanelCamposParametroSeguridad;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroSeguridad;
			processRunnable.jPanelAcciones=jPanelAccionesParametroSeguridad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroSeguridad;
			
			
			processRunnable.jmenuBar=jmenuBarParametroSeguridad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroSeguridad;
			processRunnable.jTtoolBar=jTtoolBarParametroSeguridad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroSeguridad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroSeguridad ,jPanelParametrosReportesParametroSeguridad, jTableDatosParametroSeguridad,/*jScrollPanelDatosParametroSeguridad,*/jPanelCamposParametroSeguridad,jPanelPaginacionParametroSeguridad, /*jScrollPanelDatosEdicionParametroSeguridad,*/ jPanelAccionesParametroSeguridad,jPanelAccionesFormularioParametroSeguridad,jmenuBarParametroSeguridad,jmenuBarDetalleParametroSeguridad,jTtoolBarParametroSeguridad,jTtoolBarDetalleParametroSeguridad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroSeguridad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroSeguridad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroSeguridad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroSeguridad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroSeguridad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroSeguridad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroSeguridad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroSeguridad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroSeguridad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametroseguridadConstantesFunciones.getsFinalQueryParametroSeguridad();
		String  finalQueryPaginacionTodos=this.parametroseguridadConstantesFunciones.getsFinalQueryParametroSeguridad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroSeguridadConstantesFunciones.getArrayColumnasGlobalesNoParametroSeguridad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroSeguridadConstantesFunciones.getArrayColumnasGlobalesParametroSeguridad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroSeguridadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametroseguridadsEliminados= new ArrayList<ParametroSeguridad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroSeguridad();
		
				///*ParametroSeguridadSessionBean*/this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
			
			if(this.parametroseguridadSessionBean==null) {
				this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
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
					this.iNumeroPaginacion=ParametroSeguridadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroSeguridadConstantesFunciones.getClassesForeignKeysOfParametroSeguridad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametroseguridad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametroseguridadsAux= new ArrayList<ParametroSeguridad>();
			
				
			parametroseguridadLogic.setDatosCliente(this.datosCliente);
			parametroseguridadLogic.setDatosDeep(this.datosDeep);
			parametroseguridadLogic.setIsConDeep(true);
			
			
			parametroseguridadLogic.getParametroSeguridadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametroseguridadLogic.getTodosParametroSeguridads(finalQueryGlobal,pagination);
					
					//parametroseguridadLogic.getTodosParametroSeguridadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametroseguridadLogic.getParametroSeguridads()==null|| parametroseguridadLogic.getParametroSeguridads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroseguridadsAux= new ArrayList<ParametroSeguridad>();
							parametroseguridadsAux.addAll(parametroseguridadLogic.getParametroSeguridads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroseguridadsAux= new ArrayList<ParametroSeguridad>();
							parametroseguridadsAux.addAll(parametroseguridads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroseguridadLogic.getTodosParametroSeguridads(finalQueryGlobal+"",this.pagination);												
							
							//parametroseguridadLogic.getTodosParametroSeguridadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroSeguridads("Todos",parametroseguridadLogic.getParametroSeguridads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroseguridadLogic.setParametroSeguridads(new ArrayList<ParametroSeguridad>());					
							parametroseguridadLogic.getParametroSeguridads().addAll(parametroseguridadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroseguridads=new ArrayList<ParametroSeguridad>();
							parametroseguridads.addAll(parametroseguridadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroSeguridad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroSeguridad=this.idActual;
				
				} else if(this.idParametroSeguridadActual!=null && this.idParametroSeguridadActual!=0L) {
					idParametroSeguridad=idParametroSeguridadActual;
				}
				
					
				this.sDetalleReporte=ParametroSeguridadConstantesFunciones.getDetalleIndicePorId(idParametroSeguridad);
				
				this.parametroseguridads=new ArrayList<ParametroSeguridad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametroseguridadLogic.getEntity(idParametroSeguridad);
					
					//parametroseguridadLogic.getEntityWithConnection(idParametroSeguridad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroseguridadLogic.setParametroSeguridads(new ArrayList<ParametroSeguridad>());
					parametroseguridadLogic.getParametroSeguridads().add(parametroseguridadLogic.getParametroSeguridad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroseguridads=new ArrayList<ParametroSeguridad>();
					this.parametroseguridads.add(parametroseguridad);
				}
				
				if(parametroseguridadLogic.getParametroSeguridad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroSeguridadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroseguridadLogic.getParametroSeguridadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroSeguridadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroSeguridadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroseguridadLogic.getParametroSeguridads()==null||parametroseguridadLogic.getParametroSeguridads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroseguridads==null|| parametroseguridads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroseguridadsAux=new ArrayList<ParametroSeguridad>();
						parametroseguridadsAux.addAll(parametroseguridadLogic.getParametroSeguridads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroseguridadsAux=new ArrayList<ParametroSeguridad>();
							parametroseguridadsAux.addAll(parametroseguridads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroseguridadLogic.getParametroSeguridadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroSeguridadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroSeguridadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroSeguridads("FK_IdEmpresa",parametroseguridadLogic.getParametroSeguridads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroSeguridads("FK_IdEmpresa",parametroseguridads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroseguridadLogic.setParametroSeguridads(new ArrayList<ParametroSeguridad>());
						parametroseguridadLogic.getParametroSeguridads().addAll(parametroseguridadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroseguridads=new ArrayList<ParametroSeguridad>();
							parametroseguridads.addAll(parametroseguridadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroSeguridad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroSeguridad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroseguridadLogic.getParametroSeguridads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroseguridads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroseguridadLogic.getParametroSeguridads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroseguridads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroSeguridad parametroseguridad) {
		Boolean permite=true;
		
		if(this.parametroseguridad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroSeguridadConstantesFunciones.getOrderByListaParametroSeguridad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroSeguridadConstantesFunciones.getOrderByListaParametroSeguridad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroSeguridad parametroseguridad:parametroseguridadLogic.getParametroSeguridads()) {
				if(parametroseguridad.getsType().equals(Constantes2.S_TOTALES)) {
					parametroseguridadTotales=parametroseguridad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroSeguridad parametroseguridad:this.parametroseguridads) {
				if(parametroseguridad.getsType().equals(Constantes2.S_TOTALES)) {
					parametroseguridadTotales=parametroseguridad;
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
			this.parametroseguridadAux=new ParametroSeguridad();
			this.parametroseguridadAux.setsType(Constantes2.S_TOTALES);
			this.parametroseguridadAux.setIsNew(false);
			this.parametroseguridadAux.setIsChanged(false);
			this.parametroseguridadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroSeguridadConstantesFunciones.TotalizarValoresFilaParametroSeguridad(this.parametroseguridadLogic.getParametroSeguridads(),this.parametroseguridadAux);
				
				this.parametroseguridadLogic.getParametroSeguridads().add(this.parametroseguridadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroSeguridadConstantesFunciones.TotalizarValoresFilaParametroSeguridad(this.parametroseguridads,this.parametroseguridadAux);
				
				this.parametroseguridads.add(this.parametroseguridadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametroseguridadTotales=new ParametroSeguridad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroseguridadLogic.getParametroSeguridads().remove(parametroseguridadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroseguridads.remove(parametroseguridadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametroseguridadTotales=new ParametroSeguridad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroSeguridad parametroseguridad:parametroseguridadLogic.getParametroSeguridads()) {
				if(parametroseguridad.getsType().equals(Constantes2.S_TOTALES)) {
					parametroseguridadTotales=parametroseguridad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroSeguridadConstantesFunciones.TotalizarValoresFilaParametroSeguridad(this.parametroseguridadLogic.getParametroSeguridads(),parametroseguridadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroSeguridad parametroseguridad:this.parametroseguridads) {
				if(parametroseguridad.getsType().equals(Constantes2.S_TOTALES)) {
					parametroseguridadTotales=parametroseguridad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroSeguridadConstantesFunciones.TotalizarValoresFilaParametroSeguridad(this.parametroseguridads,parametroseguridadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroSeguridadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroSeguridadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroseguridadLogic.getParametroSeguridadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosParametroSeguridad() {
		this.isPermisoTodoParametroSeguridad=false;
		this.isPermisoNuevoParametroSeguridad=false;
		this.isPermisoActualizarParametroSeguridad=false;
		this.isPermisoActualizarOriginalParametroSeguridad=false;
		this.isPermisoEliminarParametroSeguridad=false;
		this.isPermisoGuardarCambiosParametroSeguridad=false;
		this.isPermisoConsultaParametroSeguridad=false;
		this.isPermisoBusquedaParametroSeguridad=false;
		this.isPermisoReporteParametroSeguridad=false;		
		this.isPermisoOrdenParametroSeguridad=false;		
		this.isPermisoPaginacionMedioParametroSeguridad=false;		
		this.isPermisoPaginacionAltoParametroSeguridad=false;
		this.isPermisoPaginacionTodoParametroSeguridad=false;
		this.isPermisoCopiarParametroSeguridad=false;		
		this.isPermisoVerFormParametroSeguridad=false;		
		this.isPermisoDuplicarParametroSeguridad=false;		
		this.isPermisoOrdenParametroSeguridad=false;		
	}
	
	public void setPermisosUsuarioParametroSeguridad(Boolean isPermiso) {
		this.isPermisoTodoParametroSeguridad=isPermiso;
		this.isPermisoNuevoParametroSeguridad=isPermiso;
		this.isPermisoActualizarParametroSeguridad=isPermiso;
		this.isPermisoActualizarOriginalParametroSeguridad=isPermiso;
		this.isPermisoEliminarParametroSeguridad=isPermiso;
		this.isPermisoGuardarCambiosParametroSeguridad=isPermiso;
		this.isPermisoConsultaParametroSeguridad=isPermiso;
		this.isPermisoBusquedaParametroSeguridad=isPermiso;
		this.isPermisoReporteParametroSeguridad=isPermiso;
		this.isPermisoOrdenParametroSeguridad=isPermiso;		
		this.isPermisoPaginacionMedioParametroSeguridad=isPermiso;		
		this.isPermisoPaginacionAltoParametroSeguridad=isPermiso;		
		this.isPermisoPaginacionTodoParametroSeguridad=isPermiso;		
		this.isPermisoCopiarParametroSeguridad=isPermiso;		
		this.isPermisoVerFormParametroSeguridad=isPermiso;		
		this.isPermisoDuplicarParametroSeguridad=isPermiso;
		this.isPermisoOrdenParametroSeguridad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroSeguridad(Boolean isPermiso) {
		//this.isPermisoTodoParametroSeguridad=isPermiso;
		this.isPermisoNuevoParametroSeguridad=isPermiso;
		this.isPermisoActualizarParametroSeguridad=isPermiso;
		this.isPermisoActualizarOriginalParametroSeguridad=isPermiso;
		this.isPermisoEliminarParametroSeguridad=isPermiso;
		this.isPermisoGuardarCambiosParametroSeguridad=isPermiso;
		//this.isPermisoConsultaParametroSeguridad=isPermiso;
		//this.isPermisoBusquedaParametroSeguridad=isPermiso;
		//this.isPermisoReporteParametroSeguridad=isPermiso;
		//this.isPermisoOrdenParametroSeguridad=isPermiso;		
		//this.isPermisoPaginacionMedioParametroSeguridad=isPermiso;		
		//this.isPermisoPaginacionAltoParametroSeguridad=isPermiso;		
		//this.isPermisoPaginacionTodoParametroSeguridad=isPermiso;		
		//this.isPermisoCopiarParametroSeguridad=isPermiso;		
		//this.isPermisoDuplicarParametroSeguridad=isPermiso;
		//this.isPermisoOrdenParametroSeguridad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroSeguridadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroSeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroSeguridad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroSeguridadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroSeguridadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroSeguridadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroSeguridadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroSeguridad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroSeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroSeguridadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroSeguridad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroSeguridad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroSeguridad=this.isPermisoActualizarParametroSeguridad;
			this.isPermisoEliminarParametroSeguridad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroSeguridad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroSeguridad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroSeguridad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroSeguridad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroSeguridad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroSeguridad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroSeguridad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroSeguridad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroSeguridad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroSeguridad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroSeguridad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroSeguridad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroSeguridad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroSeguridad.setToolTipText(this.jTableDatosParametroSeguridad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroSeguridad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroSeguridad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroSeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroSeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroSeguridad() throws Exception {
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
	public void inicializarCombosForeignKeyParametroSeguridadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroSeguridadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroSeguridadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroSeguridadListas(false);
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
	
	public void cargarCombosLoteForeignKeyParametroSeguridadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroSeguridadParameterReturnGeneral parametroseguridadReturnGeneral=new ParametroSeguridadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametroseguridadConstantesFunciones.cargarid_empresaParametroSeguridad)
					 || (this.esRecargarFks && this.parametroseguridadConstantesFunciones.cargarid_empresaParametroSeguridad)) {

					if(!this.parametroseguridadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametroseguridadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametroseguridadReturnGeneral=parametroseguridadLogic.cargarCombosLoteForeignKeyParametroSeguridad(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametroseguridadReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroSeguridad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametroseguridadSessionBean==null) {
				this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
			}

			if(!this.parametroseguridadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyParametroSeguridad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroSeguridad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroSeguridad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroSeguridad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroSeguridad(ParametroSeguridad parametroseguridad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroSeguridad(ParametroSeguridad parametroseguridad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroSeguridad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroSeguridad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroSeguridad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroSeguridad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroSeguridad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroSeguridad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroSeguridad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroSeguridad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ParametroSeguridadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroSeguridadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroSeguridadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean(); 
		this.parametroseguridadConstantesFunciones=new ParametroSeguridadConstantesFunciones(); 
		this.parametroseguridadBean=new ParametroSeguridad();//(this.parametroseguridadConstantesFunciones); 		
		this.parametroseguridadReturnGeneral=new ParametroSeguridadParameterReturnGeneral(); 
		
		this.parametroseguridadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroseguridadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroSeguridadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroSeguridadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroSeguridadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroSeguridad(true);
			
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
			
			this.parametroseguridadConstantesFunciones=new ParametroSeguridadConstantesFunciones(); 
			this.parametroseguridadBean=new ParametroSeguridad();//this.parametroseguridadConstantesFunciones); 			
			this.parametroseguridadReturnGeneral=new ParametroSeguridadParameterReturnGeneral(); 
		
			ParametroSeguridadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Seguridad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.parametroseguridad=new ParametroSeguridad();
			this.parametroseguridads = new ArrayList<ParametroSeguridad>();
			this.parametroseguridadsAux = new ArrayList<ParametroSeguridad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic=new ParametroSeguridadLogic();
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}
			
			//this.parametroseguridadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametroseguridadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroSeguridad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroSeguridad);	
					}
					
					if(this.jInternalFrameImportacionParametroSeguridad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroSeguridad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroSeguridad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroSeguridad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroSeguridad);
				this.jInternalFrameDetalleFormParametroSeguridad.setVisible(false);
				this.jInternalFrameDetalleFormParametroSeguridad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroSeguridad);
					this.jInternalFrameReporteDinamicoParametroSeguridad.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroSeguridad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroSeguridad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroSeguridad);
					this.jInternalFrameImportacionParametroSeguridad.setVisible(false);
					this.jInternalFrameImportacionParametroSeguridad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroSeguridad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroSeguridad);
					this.jInternalFrameOrderByParametroSeguridad.setVisible(false);
					this.jInternalFrameOrderByParametroSeguridad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroSeguridadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroSeguridadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametroseguridadReturnGeneral=new ParametroSeguridadParameterReturnGeneral();
			
			this.parametroseguridadParameterGeneral=new ParametroSeguridadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametroseguridadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroSeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroSeguridadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroseguridadSessionBean.getEsGuardarRelacionado(),this.parametroseguridadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroSeguridadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroseguridadSessionBean.getEsGuardarRelacionado(),this.parametroseguridadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroSeguridad=false;
			this.isVisibilidadCeldaDuplicarParametroSeguridad=true;
			this.isVisibilidadCeldaCopiarParametroSeguridad=true;
			this.isVisibilidadCeldaVerFormParametroSeguridad=true;
			this.isVisibilidadCeldaOrdenParametroSeguridad=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
			this.isVisibilidadCeldaModificarParametroSeguridad=false;
			this.isVisibilidadCeldaActualizarParametroSeguridad=false;
			this.isVisibilidadCeldaEliminarParametroSeguridad=false;
			this.isVisibilidadCeldaCancelarParametroSeguridad=false;
			this.isVisibilidadCeldaGuardarParametroSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroSeguridad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroSeguridad(false);
			
			this.setPermisosUsuarioParametroSeguridad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado() 
				|| (this.parametroseguridadSessionBean.getEsGuardarRelacionado() && this.parametroseguridadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroSeguridadClasesRelacionadas();
			}
			
			if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroSeguridadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroSeguridad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroSeguridad();
			}
			
			if(!this.isPermisoBusquedaParametroSeguridad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroSeguridad,this.isPermisoPaginacionMedioParametroSeguridad,this.isPermisoPaginacionTodoParametroSeguridad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroSeguridadConstantesFunciones.getTiposSeleccionarParametroSeguridad());
				
				this.tiposColumnasSelect=ParametroSeguridadConstantesFunciones.getTiposSeleccionarParametroSeguridad(true);
				
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
			//if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroSeguridad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroSeguridad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroSeguridad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroSeguridad() ;
			
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
				parametroseguridadImplementable= (ParametroSeguridadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroSeguridadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametroseguridadImplementableHome= (ParametroSeguridadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroSeguridadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametroseguridads= new ArrayList<ParametroSeguridad>();
			this.parametroseguridadsEliminados= new ArrayList<ParametroSeguridad>();
						
			this.isEsNuevoParametroSeguridad=false;
			this.esParaAccionDesdeFormularioParametroSeguridad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroSeguridad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroSeguridad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroSeguridadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroSeguridadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroSeguridad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroSeguridad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroSeguridad();
			}
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroSeguridad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroSeguridad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroSeguridad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroSeguridad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroSeguridad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroSeguridad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroSeguridad")) {
				iIndex=this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroSeguridad();	
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
	
	public void cargarCombosForeignKeyParametroSeguridad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroSeguridad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroSeguridad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroSeguridadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroSeguridad();
		
		this.cargarCombosFrameForeignKeyParametroSeguridad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroSeguridad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroSeguridad();
		}
	}
	
	
	
	public void jButtonNuevoParametroSeguridadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
			
			if(jTableDatosParametroSeguridad.getRowCount()>=1) {
				jTableDatosParametroSeguridad.removeRowSelectionInterval(0, jTableDatosParametroSeguridad.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroSeguridad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroSeguridad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroSeguridad(true);			
			//this.parametroseguridad=new ParametroSeguridad();
			//this.parametroseguridad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroSeguridad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroSeguridad() ;
			
			if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroSeguridad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametroseguridad);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);				
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
			if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroSeguridad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroSeguridadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroSeguridad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroSeguridad.getSelectedRows().length;			
			}
			
			parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroSeguridad--;			
				//ParametroSeguridad parametroseguridadAux= new ParametroSeguridad();			
				//parametroseguridadAux.setId(this.iIdNuevoParametroSeguridad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroSeguridad parametroseguridadOrigen=new ParametroSeguridad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroSeguridad parametroseguridadOrigen : parametroseguridadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametroseguridadOrigen =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroseguridadOrigen =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroSeguridad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametroseguridad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroSeguridad(parametroseguridadOrigen,this.parametroseguridad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroseguridadLogic.getParametroSeguridads().add(this.parametroseguridadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroseguridads.add(this.parametroseguridadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroSeguridad(false);
				
				this.jTableDatosParametroSeguridad.setRowSelectionInterval(this.getIndiceNuevoParametroSeguridad(), this.getIndiceNuevoParametroSeguridad());
				
				int iLastRow =  this.jTableDatosParametroSeguridad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroSeguridad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroSeguridad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroSeguridad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();									
		
			ParametroSeguridad parametroseguridadOrigen=new ParametroSeguridad();
			ParametroSeguridad parametroseguridadDestino=new ParametroSeguridad();
				
			parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroSeguridad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametroseguridadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroSeguridad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroseguridadOrigen =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroseguridadOrigen =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroseguridadDestino =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroseguridadDestino =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametroseguridadOrigen =parametroseguridadsSeleccionados.get(0);
				parametroseguridadDestino =parametroseguridadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroSeguridad(parametroseguridadOrigen,parametroseguridadDestino,true,false);
				
				parametroseguridadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroseguridadDestino,parametroseguridadLogic.getParametroSeguridads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroseguridadDestino,parametroseguridads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroSeguridad(false);
				
				//this.jTableDatosParametroSeguridad.setRowSelectionInterval(this.getIndiceNuevoParametroSeguridad(), this.getIndiceNuevoParametroSeguridad());
				
				int iLastRow =  this.jTableDatosParametroSeguridad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroSeguridad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroSeguridad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroSeguridad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroSeguridad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroSeguridad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroSeguridad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroSeguridad.setVisible(!isVisible);
			this.jPanelPaginacionParametroSeguridad.setVisible(!isVisible);
			this.jPanelAccionesParametroSeguridad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroSeguridad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroSeguridad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroSeguridad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroSeguridad();
			
			this.abrirFrameOrderByParametroSeguridad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroSeguridad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroSeguridad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroSeguridad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroSeguridad.isMaximum()) {
					this.jInternalFrameDetalleFormParametroSeguridad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroSeguridad.setSize(this.jInternalFrameDetalleFormParametroSeguridad.iWidthFormulario,this.jInternalFrameDetalleFormParametroSeguridad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroSeguridad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroSeguridad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroSeguridad.isMaximum()) {
						this.jInternalFrameDetalleFormParametroSeguridad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroSeguridad.jContentPaneDetalleParametroSeguridad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroSeguridad.jContentPaneDetalleParametroSeguridad.getWidth(),ParametroSeguridadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroSeguridad.jContentPaneDetalleParametroSeguridad.getWidth(),ParametroSeguridadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroSeguridad.jContentPaneDetalleParametroSeguridad.getWidth(),ParametroSeguridadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroSeguridad.setVisible(true);
	        this.jInternalFrameDetalleFormParametroSeguridad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroSeguridad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroSeguridad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroSeguridad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroSeguridad,false,this);
				} else {
					this.jInternalFrameOrderByParametroSeguridad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroSeguridad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroSeguridad);
				this.jInternalFrameOrderByParametroSeguridad.setVisible(false);
				this.jInternalFrameOrderByParametroSeguridad.setSelected(false);
				
				this.jInternalFrameOrderByParametroSeguridad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroSeguridad"));
				
				this.inicializarActualizarBindingTablaOrderByParametroSeguridad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroSeguridad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroSeguridad==null) {
				
				this.jInternalFrameImportacionParametroSeguridad=new ImportacionJInternalFrame(ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroSeguridad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroSeguridad);
				this.jInternalFrameImportacionParametroSeguridad.setVisible(false);
				this.jInternalFrameImportacionParametroSeguridad.setSelected(false);


				this.jInternalFrameImportacionParametroSeguridad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroSeguridad"));
				this.jInternalFrameImportacionParametroSeguridad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroSeguridad"));
				this.jInternalFrameImportacionParametroSeguridad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroSeguridad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroSeguridad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroSeguridad==null) {
				this.jInternalFrameReporteDinamicoParametroSeguridad=new ReporteDinamicoJInternalFrame(ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroSeguridad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroSeguridad);
				this.jInternalFrameReporteDinamicoParametroSeguridad.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroSeguridad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroSeguridad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroSeguridad"));
				this.jInternalFrameReporteDinamicoParametroSeguridad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroSeguridad"));
				this.jInternalFrameReporteDinamicoParametroSeguridad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroSeguridad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroSeguridad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroSeguridad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroSeguridad);
			
	       	this.jInternalFrameDetalleFormParametroSeguridad.setVisible(false);
	        this.jInternalFrameDetalleFormParametroSeguridad.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroSeguridad.dispose();
			//this.jInternalFrameDetalleFormParametroSeguridad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroSeguridad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroSeguridad.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroSeguridad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroSeguridad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroSeguridad.setVisible(true);
	        this.jInternalFrameImportacionParametroSeguridad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroSeguridad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroSeguridad.setVisible(true);
	        this.jInternalFrameOrderByParametroSeguridad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroSeguridad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroSeguridad.setVisible(false);
	        this.jInternalFrameOrderByParametroSeguridad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroSeguridad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroSeguridad.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroSeguridad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroSeguridad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroSeguridad.setVisible(false);
	        this.jInternalFrameImportacionParametroSeguridad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroSeguridad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroSeguridad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroSeguridad(true);
			//this.isEsNuevoParametroSeguridad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroSeguridad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroSeguridad(false) ;
			
			if(parametroseguridadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroSeguridad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroSeguridad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroSeguridadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroSeguridad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroSeguridad(true);
			//this.isEsNuevoParametroSeguridad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametroseguridad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroSeguridad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroSeguridad(false) ;
			
			if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroSeguridad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroSeguridad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroSeguridad(false);
			
			//if(!this.isEsNuevoParametroSeguridad) {								
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				
			}
			
			if(this.permiteMantenimiento(this.parametroseguridad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroSeguridad=true;
					this.inicializarActualizarBindingTablaParametroSeguridad(false);
					this.isEsNuevoParametroSeguridad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroSeguridad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroSeguridad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroSeguridad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroSeguridad(false);
				
				this.habilitarDeshabilitarControlesParametroSeguridad(false);
			
												
				
				if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroSeguridad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroSeguridadActionPerformed(evt,parametroseguridadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroSeguridad(this.parametroseguridad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroSeguridad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametroseguridadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametroseguridad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				this.parametroseguridad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				this.parametroseguridad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametroseguridad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroSeguridadModel) this.jTableDatosParametroSeguridad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroSeguridad=true;
				this.inicializarActualizarBindingTablaParametroSeguridad(false);
				this.isEsNuevoParametroSeguridad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroSeguridad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroSeguridad(false);
				
				this.habilitarDeshabilitarControlesParametroSeguridad(false);
				
				
				
				if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroSeguridad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroSeguridad.getRowCount()>=1) {
				jTableDatosParametroSeguridad.removeRowSelectionInterval(0, jTableDatosParametroSeguridad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroSeguridad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroSeguridad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroSeguridad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroSeguridad(false) ;
			
			this.isEsNuevoParametroSeguridad=false;
			
			if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroSeguridad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroSeguridad(false);
				
				//SI ES MANUAL
				if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroSeguridad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroSeguridad--;			
			//ParametroSeguridad parametroseguridadAux= new ParametroSeguridad();			
			//parametroseguridadAux.setId(this.iIdNuevoParametroSeguridad);
			
			if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroSeguridad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
			
			this.parametroseguridad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametroseguridadLogic.getParametroSeguridads().add(this.parametroseguridadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametroseguridads.add(this.parametroseguridadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroSeguridad(false);
			
			this.jTableDatosParametroSeguridad.setRowSelectionInterval(this.getIndiceNuevoParametroSeguridad(), this.getIndiceNuevoParametroSeguridad());
			
			int iLastRow =  this.jTableDatosParametroSeguridad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroSeguridad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroSeguridad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroSeguridad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroSeguridad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroSeguridad(false);
			
			//SI ES MANUAL
			if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroSeguridad();
			}
			
			//this.abrirFrameTreeParametroSeguridad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro SeguridadES ?", "MANTENIMIENTO DE Parametro Seguridad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroSeguridad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroSeguridad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametroseguridadReturnGeneral=parametroseguridadLogic.procesarImportacionParametroSeguridadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametroseguridadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroSeguridadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroSeguridad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroSeguridad.setFileImportacion(this.jInternalFrameImportacionParametroSeguridad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroSeguridad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroSeguridad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroSeguridad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroSeguridad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		

		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroSeguridadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroSeguridadBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroSeguridads("Todos",parametroseguridadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCartera_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCartera_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCartera_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCartera_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCopiarClientes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCopiarClientes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCopiarClientes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCopiarClientes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCopiarProveedores_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCopiarProveedores_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCopiarProveedores_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCopiarProveedores_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nGenerarClienteProve_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nGenerarClienteProve_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nGenerarClienteProve_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nGenerarClienteProve_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ienteConSecuencialAuto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ienteConSecuencialAuto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ienteConSecuencialAuto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ienteConSecuencialAuto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ienteNumMaximoIniciales_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ienteNumMaximoIniciales_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ienteNumMaximoIniciales_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ienteNumMaximoIniciales_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_oveConSecuencialAuto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_oveConSecuencialAuto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_oveConSecuencialAuto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_oveConSecuencialAuto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_oveNumMaximoIniciales_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_oveNumMaximoIniciales_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_oveNumMaximoIniciales_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_oveNumMaximoIniciales_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nValidarGrupos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nValidarGrupos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nValidarGrupos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nValidarGrupos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tiFijoConSecuencialAuto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tiFijoConSecuencialAuto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tiFijoConSecuencialAuto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tiFijoConSecuencialAuto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroSeguridad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA:
					sNombreCampoCategoria="con_cartera";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES:
					sNombreCampoCategoria="con_copiar_clientes";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES:
					sNombreCampoCategoria="con_copiar_proveedores";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE:
					sNombreCampoCategoria="con_generar_cliente_prove";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO:
					sNombreCampoCategoria="cliente_con_secuencial_auto";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES:
					sNombreCampoCategoria="cliente_num_maximo_iniciales";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO:
					sNombreCampoCategoria="prove_con_secuencial_auto";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES:
					sNombreCampoCategoria="prove_num_maximo_iniciales";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS:
					sNombreCampoCategoria="con_validar_grupos";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO:
					sNombreCampoCategoria="acti_fijo_con_secuencial_auto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA:
					sNombreCampoCategoriaValor="con_cartera";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES:
					sNombreCampoCategoriaValor="con_copiar_clientes";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES:
					sNombreCampoCategoriaValor="con_copiar_proveedores";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE:
					sNombreCampoCategoriaValor="con_generar_cliente_prove";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO:
					sNombreCampoCategoriaValor="cliente_con_secuencial_auto";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES:
					sNombreCampoCategoriaValor="cliente_num_maximo_iniciales";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO:
					sNombreCampoCategoriaValor="prove_con_secuencial_auto";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES:
					sNombreCampoCategoriaValor="prove_num_maximo_iniciales";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS:
					sNombreCampoCategoriaValor="con_validar_grupos";
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO:
					sNombreCampoCategoriaValor="acti_fijo_con_secuencial_auto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cartera",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_cartera");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Copiar Clientes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_copiar_clientes");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Copiar Proveedores",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_copiar_proveedores");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Generar Clientes-Proveedores",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_generar_cliente_prove");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial Automa.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cliente_con_secuencial_auto");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Maximo Iniciales",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cliente_num_maximo_iniciales");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial Automatico",sNombreCampoCategoria,sNombreCampoCategoriaValor,"prove_con_secuencial_auto");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Maximo Iniciales.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"prove_num_maximo_iniciales");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Validar Grupos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_validar_grupos");
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Activos Fijos Sec. Autom.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"acti_fijo_con_secuencial_auto");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroseguridad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroSeguridads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getcon_cartera());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getcon_copiar_clientes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getcon_copiar_proveedores());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getcon_generar_cliente_prove());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getcliente_con_secuencial_auto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getcliente_num_maximo_iniciales());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getprove_con_secuencial_auto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getprove_num_maximo_iniciales());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getcon_validar_grupos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO);
					iRow++;

					for(ParametroSeguridad parametroseguridad:parametroseguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroseguridad.getacti_fijo_con_secuencial_auto());
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
			//	this.getFilaCabeceraExportarExcelParametroSeguridad(row);				
			//	iRow++;
			//}				
			
			//for(ParametroSeguridad parametroseguridadAux:parametroseguridadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroSeguridad(parametroseguridadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroSeguridad(false);
			
			//SI ES MANUAL
			if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroSeguridad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroSeguridad(false);
			
			//SI ES MANUAL
			if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroSeguridad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroSeguridad(false);
			
			//SI ES MANUAL
			if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroSeguridad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroSeguridad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroSeguridad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroSeguridad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroSeguridad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroSeguridad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroSeguridad.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroSeguridad.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroSeguridad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroSeguridad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroSeguridad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroSeguridad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroSeguridad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroSeguridad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroSeguridad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroSeguridad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroSeguridad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroSeguridad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroSeguridad();
		
		this.inicializarActualizarBindingBotonesManualParametroSeguridad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroSeguridad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroSeguridad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroSeguridad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroSeguridad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroSeguridad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroSeguridad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroSeguridad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxPostAccionNuevoParametroSeguridad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxPostAccionSinCerrarParametroSeguridad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxPostAccionSinMensajeParametroSeguridad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroSeguridad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroSeguridad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroSeguridad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
				this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxPostAccionNuevoParametroSeguridad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxPostAccionSinCerrarParametroSeguridad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxPostAccionSinMensajeParametroSeguridad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroSeguridad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroSeguridad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroSeguridad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroSeguridad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroSeguridad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroSeguridad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroSeguridad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroSeguridad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroSeguridad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroSeguridad(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroSeguridad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroSeguridad() throws Exception {
		try	{
			if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroSeguridad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroSeguridad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroSeguridad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroSeguridad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroSeguridad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroSeguridad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroSeguridad.addItem(reporte);
			}
			
			
			if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroSeguridad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroSeguridad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroSeguridad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroSeguridad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroSeguridad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroSeguridad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroSeguridad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroSeguridad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
				this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
				this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroSeguridad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroSeguridad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroSeguridad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroSeguridad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroSeguridad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroSeguridad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroSeguridad(Boolean esInicializar) throws Exception {				
		if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroSeguridad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroSeguridad() throws Exception {
		this.inicializarActualizarBindingTablaParametroSeguridad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroSeguridad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroSeguridadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroSeguridad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametroseguridadLogic.getParametroSeguridads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametroseguridads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroSeguridad.setModel(new ParametroSeguridadModel(this.parametroseguridadLogic.getParametroSeguridads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroSeguridad.setModel(new ParametroSeguridadModel(this.parametroseguridads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroSeguridad!=null && this.jInternalFrameOrderByParametroSeguridad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroSeguridad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO,parametroseguridadConstantesFunciones.resaltarSeleccionarParametroSeguridad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO,parametroseguridadConstantesFunciones.resaltarSeleccionarParametroSeguridad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_ID));

		if(this.parametroseguridadConstantesFunciones.mostraridParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroseguridadConstantesFunciones.resaltaridParametroSeguridad,this.parametroseguridadConstantesFunciones.activaridParametroSeguridad,this,true,"idParametroSeguridad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroseguridadConstantesFunciones.resaltaridParametroSeguridad,this.parametroseguridadConstantesFunciones.activaridParametroSeguridad,this,true,"idParametroSeguridad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametroseguridadConstantesFunciones.mostrarid_empresaParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametroseguridadConstantesFunciones.resaltarid_empresaParametroSeguridad,this,this.parametroseguridadConstantesFunciones.activarid_empresaParametroSeguridad));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametroseguridadConstantesFunciones.resaltarid_empresaParametroSeguridad,this,this.parametroseguridadConstantesFunciones.activarid_empresaParametroSeguridad,false,"id_empresaParametroSeguridad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA));

		if(this.parametroseguridadConstantesFunciones.mostrarcon_carteraParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_carteraParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_carteraParametroSeguridad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_carteraParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_carteraParametroSeguridad,this,true,"con_carteraParametroSeguridad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES));

		if(this.parametroseguridadConstantesFunciones.mostrarcon_copiar_clientesParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_copiar_clientesParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_copiar_clientesParametroSeguridad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_copiar_clientesParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_copiar_clientesParametroSeguridad,this,true,"con_copiar_clientesParametroSeguridad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES));

		if(this.parametroseguridadConstantesFunciones.mostrarcon_copiar_proveedoresParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_copiar_proveedoresParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_copiar_proveedoresParametroSeguridad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_copiar_proveedoresParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_copiar_proveedoresParametroSeguridad,this,true,"con_copiar_proveedoresParametroSeguridad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE));

		if(this.parametroseguridadConstantesFunciones.mostrarcon_generar_cliente_proveParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_generar_cliente_proveParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_generar_cliente_proveParametroSeguridad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_generar_cliente_proveParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_generar_cliente_proveParametroSeguridad,this,true,"con_generar_cliente_proveParametroSeguridad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO));

		if(this.parametroseguridadConstantesFunciones.mostrarcliente_con_secuencial_autoParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroseguridadConstantesFunciones.resaltarcliente_con_secuencial_autoParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcliente_con_secuencial_autoParametroSeguridad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarcliente_con_secuencial_autoParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcliente_con_secuencial_autoParametroSeguridad,this,true,"cliente_con_secuencial_autoParametroSeguridad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES));

		if(this.parametroseguridadConstantesFunciones.mostrarcliente_num_maximo_inicialesParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroseguridadConstantesFunciones.resaltarcliente_num_maximo_inicialesParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcliente_num_maximo_inicialesParametroSeguridad,this,true,"cliente_num_maximo_inicialesParametroSeguridad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarcliente_num_maximo_inicialesParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcliente_num_maximo_inicialesParametroSeguridad,this,true,"cliente_num_maximo_inicialesParametroSeguridad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO));

		if(this.parametroseguridadConstantesFunciones.mostrarprove_con_secuencial_autoParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroseguridadConstantesFunciones.resaltarprove_con_secuencial_autoParametroSeguridad,this.parametroseguridadConstantesFunciones.activarprove_con_secuencial_autoParametroSeguridad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarprove_con_secuencial_autoParametroSeguridad,this.parametroseguridadConstantesFunciones.activarprove_con_secuencial_autoParametroSeguridad,this,true,"prove_con_secuencial_autoParametroSeguridad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES));

		if(this.parametroseguridadConstantesFunciones.mostrarprove_num_maximo_inicialesParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroseguridadConstantesFunciones.resaltarprove_num_maximo_inicialesParametroSeguridad,this.parametroseguridadConstantesFunciones.activarprove_num_maximo_inicialesParametroSeguridad,this,true,"prove_num_maximo_inicialesParametroSeguridad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarprove_num_maximo_inicialesParametroSeguridad,this.parametroseguridadConstantesFunciones.activarprove_num_maximo_inicialesParametroSeguridad,this,true,"prove_num_maximo_inicialesParametroSeguridad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS));

		if(this.parametroseguridadConstantesFunciones.mostrarcon_validar_gruposParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_validar_gruposParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_validar_gruposParametroSeguridad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroseguridadConstantesFunciones.resaltarcon_validar_gruposParametroSeguridad,this.parametroseguridadConstantesFunciones.activarcon_validar_gruposParametroSeguridad,this,true,"con_validar_gruposParametroSeguridad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO));

		if(this.parametroseguridadConstantesFunciones.mostraracti_fijo_con_secuencial_autoParametroSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametroseguridadConstantesFunciones.resaltaracti_fijo_con_secuencial_autoParametroSeguridad,this.parametroseguridadConstantesFunciones.activaracti_fijo_con_secuencial_autoParametroSeguridad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametroseguridadConstantesFunciones.resaltaracti_fijo_con_secuencial_autoParametroSeguridad,this.parametroseguridadConstantesFunciones.activaracti_fijo_con_secuencial_autoParametroSeguridad,this,true,"acti_fijo_con_secuencial_autoParametroSeguridad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroSeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroseguridadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroseguridadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroSeguridad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroseguridadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroseguridadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroSeguridad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametroseguridadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametroseguridadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroSeguridad.addColumn(tableColumn);
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
			
			this.jTableDatosParametroSeguridad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroSeguridad.moveColumn(this.jTableDatosParametroSeguridad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroSeguridad.moveColumn(this.jTableDatosParametroSeguridad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroSeguridad.moveColumn(this.jTableDatosParametroSeguridad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroSeguridad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroSeguridad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroSeguridad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroSeguridad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroSeguridad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroSeguridad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroSeguridad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroSeguridad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametroseguridadLogic.getParametroSeguridads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametroseguridads.size()-1;
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
		//this.jTableDatosParametroSeguridad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroSeguridad();
			
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
				
				//this.isEsNuevoParametroSeguridad=false;
					
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
				if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroSeguridad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroSeguridad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroSeguridad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametroseguridad.getsType().equals("DUPLICADO")
				   || this.parametroseguridad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroSeguridad=true;
				
				} else {
					this.isEsNuevoParametroSeguridad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
					if(this.parametroseguridad.getId()>=0 && !this.parametroseguridad.getIsNew()) {						
						this.isEsNuevoParametroSeguridad=false;
						
					} else {
						this.isEsNuevoParametroSeguridad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroSeguridad(esRelaciones);						
				
				this.seleccionarParametroSeguridad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametroseguridad.getId()<0) {
					this.isEsNuevoParametroSeguridad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroSeguridad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroSeguridad(evt,rowIndex);
				}	
				
				if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroSeguridad: " + this.dDif); 
					}
				}								
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroSeguridad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametroseguridad)) {
					if(this.parametroseguridad.getId()>0) {
						this.parametroseguridad.setIsDeleted(true);
						
						this.parametroseguridadsEliminados.add(this.parametroseguridad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroseguridadLogic.getParametroSeguridads().remove(this.parametroseguridad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroseguridads.remove(this.parametroseguridad);				
					}
					
					
					((ParametroSeguridadModel) this.jTableDatosParametroSeguridad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroSeguridad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroSeguridad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroSeguridad) {
			
			if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroSeguridad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroSeguridad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroSeguridad(this.parametroseguridad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametroseguridadConstantesFunciones.cargarid_empresaParametroSeguridad || this.parametroseguridadConstantesFunciones.event_dependid_empresaParametroSeguridad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametroseguridad.getid_empresa());
									//this.inicializarActualizarBindingParametroSeguridad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametroseguridad.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametroseguridad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametroseguridad.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroSeguridad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroSeguridad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroSeguridad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroSeguridad(ParametroSeguridad parametroseguridad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroSeguridad(parametroseguridad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroSeguridad(ParametroSeguridad parametroseguridad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroSeguridad(parametroseguridad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroSeguridad(parametroseguridad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroSeguridad(parametroseguridad);
	}
	
	public void setVariablesObjetoActualToFormularioParametroSeguridad(ParametroSeguridad parametroseguridad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.setText(parametroseguridad.getId().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.setSelected(parametroseguridad.getcon_cartera());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.setSelected(parametroseguridad.getcon_copiar_clientes());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.setSelected(parametroseguridad.getcon_copiar_proveedores());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.setSelected(parametroseguridad.getcon_generar_cliente_prove());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridad.getcliente_con_secuencial_auto());
			this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setText(parametroseguridad.getcliente_num_maximo_iniciales().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridad.getprove_con_secuencial_auto());
			this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldprove_num_maximo_inicialesParametroSeguridad.setText(parametroseguridad.getprove_num_maximo_iniciales().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.setSelected(parametroseguridad.getcon_validar_grupos());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridad.getacti_fijo_con_secuencial_auto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroSeguridad parametroseguridadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametroseguridadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroSeguridad parametroseguridadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametroseguridadLocal=this.parametroseguridad;
			} else {
				parametroseguridadLocal=this.parametroseguridadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametroseguridadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroSeguridad(parametroseguridadLocal,true);
					
					if(parametroseguridadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametroseguridadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametroseguridadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroSeguridad(ParametroSeguridad parametroseguridad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroSeguridad(parametroseguridad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(parametroseguridad);
	}
	
	public void setVariablesFormularioToObjetoActualParametroSeguridad(ParametroSeguridad parametroseguridad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroSeguridad(parametroseguridad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroSeguridad(ParametroSeguridad parametroseguridad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.getText()==null || this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.getText()=="" || this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.setText("0");
			}

			if(conColumnasBase) {parametroseguridad.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelIdParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setcon_cartera(this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_carteraParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setcon_copiar_clientes(this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_copiar_clientesParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setcon_copiar_proveedores(this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_copiar_proveedoresParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setcon_generar_cliente_prove(this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_generar_cliente_proveParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setcliente_con_secuencial_auto(this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcliente_con_secuencial_autoParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setcliente_num_maximo_iniciales(Integer.parseInt(this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldcliente_num_maximo_inicialesParametroSeguridad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcliente_num_maximo_inicialesParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setprove_con_secuencial_auto(this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelprove_con_secuencial_autoParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setprove_num_maximo_iniciales(Integer.parseInt(this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldprove_num_maximo_inicialesParametroSeguridad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelprove_num_maximo_inicialesParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setcon_validar_grupos(this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelcon_validar_gruposParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroseguridad.setacti_fijo_con_secuencial_auto(this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroSeguridad.jLabelacti_fijo_con_secuencial_autoParametroSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroSeguridad(ParametroSeguridad parametroseguridadBean,ParametroSeguridad parametroseguridad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroSeguridad(ParametroSeguridad parametroseguridadOrigen,ParametroSeguridad parametroseguridad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroseguridadOrigen.getId()!=null && !parametroseguridadOrigen.getId().equals(0L))) {parametroseguridad.setId(parametroseguridadOrigen.getId());}}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getcon_cartera()!=null && !parametroseguridadOrigen.getcon_cartera().equals(false))) {parametroseguridad.setcon_cartera(parametroseguridadOrigen.getcon_cartera());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getcon_copiar_clientes()!=null && !parametroseguridadOrigen.getcon_copiar_clientes().equals(false))) {parametroseguridad.setcon_copiar_clientes(parametroseguridadOrigen.getcon_copiar_clientes());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getcon_copiar_proveedores()!=null && !parametroseguridadOrigen.getcon_copiar_proveedores().equals(false))) {parametroseguridad.setcon_copiar_proveedores(parametroseguridadOrigen.getcon_copiar_proveedores());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getcon_generar_cliente_prove()!=null && !parametroseguridadOrigen.getcon_generar_cliente_prove().equals(false))) {parametroseguridad.setcon_generar_cliente_prove(parametroseguridadOrigen.getcon_generar_cliente_prove());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getcliente_con_secuencial_auto()!=null && !parametroseguridadOrigen.getcliente_con_secuencial_auto().equals(false))) {parametroseguridad.setcliente_con_secuencial_auto(parametroseguridadOrigen.getcliente_con_secuencial_auto());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getcliente_num_maximo_iniciales()!=null && !parametroseguridadOrigen.getcliente_num_maximo_iniciales().equals(0))) {parametroseguridad.setcliente_num_maximo_iniciales(parametroseguridadOrigen.getcliente_num_maximo_iniciales());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getprove_con_secuencial_auto()!=null && !parametroseguridadOrigen.getprove_con_secuencial_auto().equals(false))) {parametroseguridad.setprove_con_secuencial_auto(parametroseguridadOrigen.getprove_con_secuencial_auto());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getprove_num_maximo_iniciales()!=null && !parametroseguridadOrigen.getprove_num_maximo_iniciales().equals(0))) {parametroseguridad.setprove_num_maximo_iniciales(parametroseguridadOrigen.getprove_num_maximo_iniciales());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getcon_validar_grupos()!=null && !parametroseguridadOrigen.getcon_validar_grupos().equals(false))) {parametroseguridad.setcon_validar_grupos(parametroseguridadOrigen.getcon_validar_grupos());}
			if(conDefault || (!conDefault && parametroseguridadOrigen.getacti_fijo_con_secuencial_auto()!=null && !parametroseguridadOrigen.getacti_fijo_con_secuencial_auto().equals(false))) {parametroseguridad.setacti_fijo_con_secuencial_auto(parametroseguridadOrigen.getacti_fijo_con_secuencial_auto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroSeguridad(ParametroSeguridad parametroseguridad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.setText(parametroseguridad.getId().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.setSelected(parametroseguridad.getcon_cartera());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.setSelected(parametroseguridad.getcon_copiar_clientes());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.setSelected(parametroseguridad.getcon_copiar_proveedores());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.setSelected(parametroseguridad.getcon_generar_cliente_prove());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridad.getcliente_con_secuencial_auto());
			this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setText(parametroseguridad.getcliente_num_maximo_iniciales().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridad.getprove_con_secuencial_auto());
			this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldprove_num_maximo_inicialesParametroSeguridad.setText(parametroseguridad.getprove_num_maximo_iniciales().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.setSelected(parametroseguridad.getcon_validar_grupos());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridad.getacti_fijo_con_secuencial_auto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroSeguridad(ParametroSeguridadBean parametroseguridadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.setText(parametroseguridadBean.getId().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.setSelected(parametroseguridadBean.getcon_cartera());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.setSelected(parametroseguridadBean.getcon_copiar_clientes());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.setSelected(parametroseguridadBean.getcon_copiar_proveedores());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.setSelected(parametroseguridadBean.getcon_generar_cliente_prove());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridadBean.getcliente_con_secuencial_auto());
			this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setText(parametroseguridadBean.getcliente_num_maximo_iniciales().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridadBean.getprove_con_secuencial_auto());
			this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldprove_num_maximo_inicialesParametroSeguridad.setText(parametroseguridadBean.getprove_num_maximo_iniciales().toString());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.setSelected(parametroseguridadBean.getcon_validar_grupos());
			this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setSelected(parametroseguridadBean.getacti_fijo_con_secuencial_auto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroSeguridad(ParametroSeguridadParameterReturnGeneral parametroseguridadReturnGeneral,ParametroSeguridadBean parametroseguridadBean,Boolean conDefault) throws Exception { 
		try {
			ParametroSeguridad parametroseguridadLocal=new ParametroSeguridad();
			
			parametroseguridadLocal=parametroseguridadReturnGeneral.getParametroSeguridad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroseguridadLocal.getId()!=null && !parametroseguridadLocal.getId().equals(0L))) {parametroseguridadBean.setId(parametroseguridadLocal.getId());}}
			if(conDefault || (!conDefault && parametroseguridadLocal.getcon_cartera()!=null && !parametroseguridadLocal.getcon_cartera().equals(false))) {parametroseguridadBean.setcon_cartera(parametroseguridadLocal.getcon_cartera());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getcon_copiar_clientes()!=null && !parametroseguridadLocal.getcon_copiar_clientes().equals(false))) {parametroseguridadBean.setcon_copiar_clientes(parametroseguridadLocal.getcon_copiar_clientes());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getcon_copiar_proveedores()!=null && !parametroseguridadLocal.getcon_copiar_proveedores().equals(false))) {parametroseguridadBean.setcon_copiar_proveedores(parametroseguridadLocal.getcon_copiar_proveedores());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getcon_generar_cliente_prove()!=null && !parametroseguridadLocal.getcon_generar_cliente_prove().equals(false))) {parametroseguridadBean.setcon_generar_cliente_prove(parametroseguridadLocal.getcon_generar_cliente_prove());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getcliente_con_secuencial_auto()!=null && !parametroseguridadLocal.getcliente_con_secuencial_auto().equals(false))) {parametroseguridadBean.setcliente_con_secuencial_auto(parametroseguridadLocal.getcliente_con_secuencial_auto());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getcliente_num_maximo_iniciales()!=null && !parametroseguridadLocal.getcliente_num_maximo_iniciales().equals(0))) {parametroseguridadBean.setcliente_num_maximo_iniciales(parametroseguridadLocal.getcliente_num_maximo_iniciales());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getprove_con_secuencial_auto()!=null && !parametroseguridadLocal.getprove_con_secuencial_auto().equals(false))) {parametroseguridadBean.setprove_con_secuencial_auto(parametroseguridadLocal.getprove_con_secuencial_auto());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getprove_num_maximo_iniciales()!=null && !parametroseguridadLocal.getprove_num_maximo_iniciales().equals(0))) {parametroseguridadBean.setprove_num_maximo_iniciales(parametroseguridadLocal.getprove_num_maximo_iniciales());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getcon_validar_grupos()!=null && !parametroseguridadLocal.getcon_validar_grupos().equals(false))) {parametroseguridadBean.setcon_validar_grupos(parametroseguridadLocal.getcon_validar_grupos());}
			if(conDefault || (!conDefault && parametroseguridadLocal.getacti_fijo_con_secuencial_auto()!=null && !parametroseguridadLocal.getacti_fijo_con_secuencial_auto().equals(false))) {parametroseguridadBean.setacti_fijo_con_secuencial_auto(parametroseguridadLocal.getacti_fijo_con_secuencial_auto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroSeguridadGenerico(Long idParametroSeguridadSeleccionado,JComboBox jComboBoxParametroSeguridad,List<ParametroSeguridad> parametroseguridadsLocal)throws Exception {
		try {
			ParametroSeguridad  parametroseguridadTemp=null;

			for(ParametroSeguridad parametroseguridadAux:parametroseguridadsLocal) {
				if(parametroseguridadAux.getId()!=null && parametroseguridadAux.getId().equals(idParametroSeguridadSeleccionado)) {
					parametroseguridadTemp=parametroseguridadAux;
					break;
				}
			}

			jComboBoxParametroSeguridad.setSelectedItem(parametroseguridadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroSeguridadGenerico(JComboBox jComboBoxParametroSeguridad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroSeguridad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroSeguridad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroSeguridad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroSeguridad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroseguridad=(ParametroSeguridad) parametroseguridadLogic.getParametroSeguridads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroseguridad =(ParametroSeguridad) parametroseguridads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametroseguridad.getIsNew() && !parametroseguridad.getIsChanged() && !parametroseguridad.getIsDeleted()) {
				sDescripcion=parametroseguridad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametroseguridad.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroSeguridad parametroseguridadRow=new ParametroSeguridad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroseguridadRow=(ParametroSeguridad) parametroseguridadLogic.getParametroSeguridads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroseguridadRow=(ParametroSeguridad) parametroseguridads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroSeguridad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoParametroSeguridad && this.isPermisoNuevoParametroSeguridad));			
			this.jButtonDuplicarParametroSeguridad.setVisible((this.isVisibilidadCeldaDuplicarParametroSeguridad && this.isPermisoDuplicarParametroSeguridad));			
			this.jButtonCopiarParametroSeguridad.setVisible((this.isVisibilidadCeldaCopiarParametroSeguridad && this.isPermisoCopiarParametroSeguridad));
			this.jButtonVerFormParametroSeguridad.setVisible((this.isVisibilidadCeldaVerFormParametroSeguridad && this.isPermisoVerFormParametroSeguridad));
			
			this.jButtonAbrirOrderByParametroSeguridad.setVisible((this.isVisibilidadCeldaOrdenParametroSeguridad && this.isPermisoOrdenParametroSeguridad));			
			
			this.jButtonNuevoRelacionesParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad && this.isPermisoNuevoParametroSeguridad));			
			this.jButtonNuevoGuardarCambiosParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoParametroSeguridad && this.isPermisoNuevoParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));
			
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarParametroSeguridad.setVisible((this.isVisibilidadCeldaModificarParametroSeguridad && this.isPermisoActualizarParametroSeguridad));	
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarParametroSeguridad.setVisible((this.isVisibilidadCeldaActualizarParametroSeguridad && this.isPermisoActualizarParametroSeguridad));	
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarParametroSeguridad.setVisible((this.isVisibilidadCeldaEliminarParametroSeguridad && this.isPermisoEliminarParametroSeguridad));
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarParametroSeguridad.setVisible(this.isVisibilidadCeldaCancelarParametroSeguridad);							
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosParametroSeguridad.setVisible((this.isVisibilidadCeldaGuardarParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroSeguridad.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoParametroSeguridad && this.isPermisoNuevoParametroSeguridad));						
			this.jButtonDuplicarToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaDuplicarParametroSeguridad && this.isPermisoDuplicarParametroSeguridad));						
			this.jButtonCopiarToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaCopiarParametroSeguridad && this.isPermisoCopiarParametroSeguridad));			
			this.jButtonVerFormToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaVerFormParametroSeguridad && this.isPermisoVerFormParametroSeguridad));			
			this.jButtonAbrirOrderByToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaOrdenParametroSeguridad && this.isPermisoOrdenParametroSeguridad));
			this.jButtonNuevoRelacionesToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad && this.isPermisoNuevoParametroSeguridad));			
			this.jButtonNuevoGuardarCambiosToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoParametroSeguridad && this.isPermisoNuevoParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));			
			
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaModificarParametroSeguridad && this.isPermisoActualizarParametroSeguridad));	
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaActualizarParametroSeguridad  && this.isPermisoActualizarParametroSeguridad));	
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaEliminarParametroSeguridad && this.isPermisoEliminarParametroSeguridad));
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarToolBarParametroSeguridad.setVisible(this.isVisibilidadCeldaCancelarParametroSeguridad);				
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaGuardarParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroSeguridad.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoParametroSeguridad && this.isPermisoNuevoParametroSeguridad));			
			this.jMenuItemDuplicarParametroSeguridad.setVisible((this.isVisibilidadCeldaDuplicarParametroSeguridad && this.isPermisoDuplicarParametroSeguridad));			
			this.jMenuItemCopiarParametroSeguridad.setVisible((this.isVisibilidadCeldaCopiarParametroSeguridad && this.isPermisoCopiarParametroSeguridad));			
			this.jMenuItemVerFormParametroSeguridad.setVisible((this.isVisibilidadCeldaVerFormParametroSeguridad && this.isPermisoVerFormParametroSeguridad));			
			this.jMenuItemAbrirOrderByParametroSeguridad.setVisible((this.isVisibilidadCeldaOrdenParametroSeguridad && this.isPermisoOrdenParametroSeguridad));			
			//this.jMenuItemMostrarOcultarParametroSeguridad.setVisible((this.isVisibilidadCeldaOrdenParametroSeguridad && this.isPermisoOrdenParametroSeguridad));
			this.jMenuItemDetalleAbrirOrderByParametroSeguridad.setVisible((this.isVisibilidadCeldaOrdenParametroSeguridad && this.isPermisoOrdenParametroSeguridad));			
			//this.jMenuItemDetalleMostrarOcultarParametroSeguridad.setVisible((this.isVisibilidadCeldaOrdenParametroSeguridad && this.isPermisoOrdenParametroSeguridad));			
			this.jMenuItemNuevoRelacionesParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad && this.isPermisoNuevoParametroSeguridad));			
			this.jMenuItemNuevoGuardarCambiosParametroSeguridad.setVisible((this.isVisibilidadCeldaNuevoParametroSeguridad && this.isPermisoNuevoParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));									
			
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemModificarParametroSeguridad.setVisible((this.isVisibilidadCeldaModificarParametroSeguridad && this.isPermisoActualizarParametroSeguridad));	
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemActualizarParametroSeguridad.setVisible((this.isVisibilidadCeldaActualizarParametroSeguridad && this.isPermisoActualizarParametroSeguridad));	
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemEliminarParametroSeguridad.setVisible((this.isVisibilidadCeldaEliminarParametroSeguridad && this.isPermisoEliminarParametroSeguridad));
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemCancelarParametroSeguridad.setVisible(this.isVisibilidadCeldaCancelarParametroSeguridad);				
			}
			
			this.jMenuItemGuardarCambiosParametroSeguridad.setVisible((this.isVisibilidadCeldaGuardarParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));						
			this.jMenuItemGuardarCambiosTablaParametroSeguridad.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroSeguridad=this.jButtonNuevoParametroSeguridad.isVisible();
			this.isVisibilidadCeldaDuplicarParametroSeguridad=this.jButtonDuplicarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaCopiarParametroSeguridad=this.jButtonCopiarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaVerFormParametroSeguridad=this.jButtonVerFormParametroSeguridad.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroSeguridad=this.jButtonAbrirOrderByParametroSeguridad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=this.jButtonNuevoRelacionesParametroSeguridad.isVisible();
			this.isVisibilidadCeldaModificarParametroSeguridad=this.jButtonModificarParametroSeguridad.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			this.isVisibilidadCeldaActualizarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaEliminarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaCancelarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaGuardarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosParametroSeguridad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=this.jButtonGuardarCambiosTablaParametroSeguridad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroSeguridad=this.jButtonNuevoToolBarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=this.jButtonNuevoRelacionesToolBarParametroSeguridad.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			this.isVisibilidadCeldaModificarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarToolBarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaActualizarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarToolBarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaEliminarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarToolBarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaCancelarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarToolBarParametroSeguridad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroSeguridad=this.jButtonGuardarCambiosToolBarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=this.jButtonGuardarCambiosTablaToolBarParametroSeguridad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroSeguridad=this.jMenuItemNuevoParametroSeguridad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=this.jMenuItemNuevoRelacionesParametroSeguridad.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			this.isVisibilidadCeldaModificarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemModificarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaActualizarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemActualizarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaEliminarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemEliminarParametroSeguridad.isVisible();
			this.isVisibilidadCeldaCancelarParametroSeguridad=this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemCancelarParametroSeguridad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroSeguridad=this.jMenuItemGuardarCambiosParametroSeguridad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=this.jMenuItemGuardarCambiosTablaParametroSeguridad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroSeguridad(Boolean esInicializar) {
		if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
				//if(this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroSeguridad();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroSeguridad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroSeguridad() {
		this.jButtonNuevoParametroSeguridad.setVisible(this.isPermisoNuevoParametroSeguridad);			
		this.jButtonDuplicarParametroSeguridad.setVisible(this.isPermisoDuplicarParametroSeguridad);			
		this.jButtonCopiarParametroSeguridad.setVisible(this.isPermisoCopiarParametroSeguridad);			
		this.jButtonVerFormParametroSeguridad.setVisible(this.isPermisoVerFormParametroSeguridad);			
		
		this.jButtonAbrirOrderByParametroSeguridad.setVisible(this.isPermisoOrdenParametroSeguridad);					
		
		this.jButtonNuevoRelacionesParametroSeguridad.setVisible(this.isPermisoNuevoParametroSeguridad);			
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarParametroSeguridad.setVisible(this.isPermisoActualizarParametroSeguridad);	
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarParametroSeguridad.setVisible(this.isPermisoActualizarParametroSeguridad);	
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarParametroSeguridad.setVisible(this.isPermisoEliminarParametroSeguridad);
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarParametroSeguridad.setVisible(this.isVisibilidadCeldaCancelarParametroSeguridad);						
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosParametroSeguridad.setVisible(this.isPermisoGuardarCambiosParametroSeguridad);							
		}
		
		this.jButtonGuardarCambiosTablaParametroSeguridad.setVisible(this.isPermisoActualizarParametroSeguridad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroSeguridad() {
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarParametroSeguridad.setVisible(this.isPermisoActualizarParametroSeguridad);	
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarParametroSeguridad.setVisible(this.isPermisoActualizarParametroSeguridad);	
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarParametroSeguridad.setVisible(this.isPermisoEliminarParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarParametroSeguridad.setVisible(this.isVisibilidadCeldaCancelarParametroSeguridad);							
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosParametroSeguridad.setVisible((this.isVisibilidadCeldaGuardarParametroSeguridad && this.isPermisoGuardarCambiosParametroSeguridad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroSeguridad() {
		if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroSeguridad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroSeguridad() {
	}
	
	public void jTableDatosParametroSeguridadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroSeguridad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametroseguridad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroSeguridadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroSeguridad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroSeguridad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroSeguridad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametroseguridadLogic.getConnexion());

				if(this.parametroseguridad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametroseguridad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroSeguridad=(TitledBorder)this.jScrollPanelDatosParametroSeguridad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroSeguridad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametroseguridad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_carteraParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getcon_cartera()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_cartera = "+this.parametroseguridad.getcon_cartera().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_copiar_clientesParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getcon_copiar_clientes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_copiar_clientes = "+this.parametroseguridad.getcon_copiar_clientes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_copiar_proveedoresParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getcon_copiar_proveedores()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_copiar_proveedores = "+this.parametroseguridad.getcon_copiar_proveedores().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_generar_cliente_proveParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getcon_generar_cliente_prove()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_generar_cliente_prove = "+this.parametroseguridad.getcon_generar_cliente_prove().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncliente_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getcliente_con_secuencial_auto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cliente_con_secuencial_auto = "+this.parametroseguridad.getcliente_con_secuencial_auto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncliente_num_maximo_inicialesParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getcliente_num_maximo_iniciales()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cliente_num_maximo_iniciales = "+this.parametroseguridad.getcliente_num_maximo_iniciales().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprove_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getprove_con_secuencial_auto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where prove_con_secuencial_auto = "+this.parametroseguridad.getprove_con_secuencial_auto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprove_num_maximo_inicialesParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getprove_num_maximo_iniciales()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where prove_num_maximo_iniciales = "+this.parametroseguridad.getprove_num_maximo_iniciales().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_validar_gruposParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getcon_validar_grupos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_validar_grupos = "+this.parametroseguridad.getcon_validar_grupos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.getparametroseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroseguridad==null) {
						this.parametroseguridad = new ParametroSeguridad();
					}

					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);
				}

				if(this.parametroseguridad.getacti_fijo_con_secuencial_auto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where acti_fijo_con_secuencial_auto = "+this.parametroseguridad.getacti_fijo_con_secuencial_auto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaParametroSeguridadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroSeguridad(false,false);

			this.getParametroSeguridadsFK_IdEmpresa();

			this.inicializarActualizarBindingParametroSeguridad(false);

			//if(ParametroSeguridadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroSeguridad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroseguridadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroSeguridad() {
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
			this.jInternalFrameDetalleFormParametroSeguridad.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroSeguridad.dispose();
			this.jInternalFrameDetalleFormParametroSeguridad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
			this.jInternalFrameReporteDinamicoParametroSeguridad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroSeguridad.dispose();
			this.jInternalFrameReporteDinamicoParametroSeguridad=null;
		}
		
		if(this.jInternalFrameImportacionParametroSeguridad!=null) {
			this.jInternalFrameImportacionParametroSeguridad.setVisible(false);	    			
			this.jInternalFrameImportacionParametroSeguridad.dispose();
			this.jInternalFrameImportacionParametroSeguridad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroSeguridad();
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroSeguridad")) {
				jButtonNuevoParametroSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroSeguridad")) {
				jButtonDuplicarParametroSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroSeguridad")) {
				jButtonCopiarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroSeguridad")) {
				jButtonVerFormParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroSeguridad")) {
				jButtonNuevoParametroSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroSeguridad")) {
				jButtonDuplicarParametroSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroSeguridad")) {
				jButtonNuevoParametroSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroSeguridad")) {
				jButtonDuplicarParametroSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroSeguridad")) {
				jButtonNuevoParametroSeguridadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroSeguridad")) {
				jButtonNuevoParametroSeguridadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroSeguridad")) {
				jButtonNuevoParametroSeguridadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroSeguridad")) {
				jButtonModificarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroSeguridad")) {
				jButtonModificarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroSeguridad")) {
				jButtonModificarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroSeguridad")) {
				jButtonActualizarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroSeguridad")) {
				jButtonActualizarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroSeguridad")) {
				jButtonActualizarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroSeguridad")) {
				jButtonEliminarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroSeguridad")) {
				jButtonEliminarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroSeguridad")) {
				jButtonEliminarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroSeguridad")) {
				jButtonCancelarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroSeguridad")) {
				jButtonCancelarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroSeguridad")) {
				jButtonCancelarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroSeguridad")) {
				jButtonCerrarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroSeguridad")) {
				jButtonCerrarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroSeguridad")) {
				jButtonCerrarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroSeguridad")) {
				jButtonMostrarOcultarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroSeguridad")) {
				jButtonCancelarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroSeguridad")) {
				jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroSeguridad")) {
				jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroSeguridad")) {
				jButtonCopiarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroSeguridad")) {
				jButtonVerFormParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroSeguridad")) {
				jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroSeguridad")) {
				jButtonCopiarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroSeguridad")) {
				jButtonVerFormParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroSeguridad")) {
				jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroSeguridad")) {
				jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroSeguridad")) {
				jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroSeguridad")) {
				jButtonRecargarInformacionParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroSeguridad")) {
				jButtonRecargarInformacionParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroSeguridad")) {
				jButtonRecargarInformacionParametroSeguridadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroSeguridad")) {
				jButtonAnterioresParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroSeguridad")) {
				jButtonAnterioresParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroSeguridad")) {
				jButtonAnterioresParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroSeguridad")) {
				jButtonSiguientesParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroSeguridad")) {
				jButtonSiguientesParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroSeguridad")) {
				jButtonSiguientesParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroSeguridad") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroSeguridad")) {
				jButtonAbrirOrderByParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroSeguridad") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroSeguridad")) {
				jButtonMostrarOcultarParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroSeguridad")) {
				jButtonNuevoGuardarCambiosParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroSeguridad")) {
				jButtonNuevoGuardarCambiosParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroSeguridad")) {
				jButtonNuevoGuardarCambiosParametroSeguridadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroSeguridad")) {
				jButtonCerrarReporteDinamicoParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroSeguridad")) {
				jButtonGenerarReporteDinamicoParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroSeguridad")) {
				
				jButtonGenerarExcelReporteDinamicoParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroSeguridad")) {
				jButtonCerrarImportacionParametroSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroSeguridad")) {
				
				jButtonGenerarImportacionParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroSeguridad")) {
				
				jButtonAbrirImportacionParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroSeguridad")) {
				jComboBoxTiposAccionesParametroSeguridadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroSeguridad")) {
				jComboBoxTiposRelacionesParametroSeguridadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroSeguridad")) {
				jComboBoxTiposAccionesParametroSeguridadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroSeguridad")) {
				
				jComboBoxTiposSeleccionarParametroSeguridadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroSeguridad")) {
				jTextFieldValorCampoGeneralParametroSeguridadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroSeguridad")) {
				jButtonAbrirOrderByParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroSeguridad")) {
				jButtonAbrirOrderByParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroSeguridad")) {
				jButtonCerrarOrderByParametroSeguridadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroSeguridadBusqueda")) {
				this.jButtonidParametroSeguridadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroSeguridadUpdate")) {
				this.jButtonid_empresaParametroSeguridadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroSeguridadBusqueda")) {
				this.jButtonid_empresaParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_carteraParametroSeguridadBusqueda")) {
				this.jButtoncon_carteraParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copiar_clientesParametroSeguridadBusqueda")) {
				this.jButtoncon_copiar_clientesParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copiar_proveedoresParametroSeguridadBusqueda")) {
				this.jButtoncon_copiar_proveedoresParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_generar_cliente_proveParametroSeguridadBusqueda")) {
				this.jButtoncon_generar_cliente_proveParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cliente_con_secuencial_autoParametroSeguridadBusqueda")) {
				this.jButtoncliente_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cliente_num_maximo_inicialesParametroSeguridadBusqueda")) {
				this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("prove_con_secuencial_autoParametroSeguridadBusqueda")) {
				this.jButtonprove_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("prove_num_maximo_inicialesParametroSeguridadBusqueda")) {
				this.jButtonprove_num_maximo_inicialesParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_validar_gruposParametroSeguridadBusqueda")) {
				this.jButtoncon_validar_gruposParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acti_fijo_con_secuencial_autoParametroSeguridadBusqueda")) {
				this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroSeguridad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroSeguridadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				


				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroSeguridad parametroseguridadLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametroseguridadLocal=this.parametroseguridad;
			} else {
				parametroseguridadLocal=this.parametroseguridadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
							
				
				


				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
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
			
			


			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroSeguridadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
								
						
				


				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
								
				
				


				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroSeguridadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
							
				
				


				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroSeguridadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
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
			
			


			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroSeguridadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
								
				
				


				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroSeguridadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroSeguridadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroSeguridad")) {
					jCheckBoxSeleccionarTodosParametroSeguridadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroSeguridad")) {
					jCheckBoxSeleccionadosParametroSeguridadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroSeguridad")) {
					
				}
				
				


				
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
												
				
				


				
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroSeguridadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroSeguridadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
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
			
			


			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroSeguridadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroseguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroseguridad);
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
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
				
				


				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroSeguridad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroSeguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroseguridadAnterior =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroSeguridad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroSeguridadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroSeguridad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametroseguridad =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametroseguridad =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametroseguridad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroSeguridad")) {
				
				}
				
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroSeguridad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroSeguridad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroSeguridad")) {
			
			}
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroSeguridad();
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
			if(sTipo.equals("NuevoParametroSeguridad")) {
				jButtonNuevoParametroSeguridadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroSeguridad")) {
				jButtonDuplicarParametroSeguridadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroSeguridad")) {
				jButtonCopiarParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroSeguridad")) {
				jButtonVerFormParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroSeguridad")) {
				jButtonNuevoParametroSeguridadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroSeguridad")) {
				jButtonModificarParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroSeguridad")) {
				jButtonActualizarParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroSeguridad")) {
				jButtonEliminarParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroSeguridad")) {
				jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroSeguridad")) {
				jButtonCancelarParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroSeguridad")) {
				jButtonCerrarParametroSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroSeguridad")) {
				jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroSeguridad")) {
				jButtonNuevoGuardarCambiosParametroSeguridadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroSeguridad")) {
				jButtonAbrirOrderByParametroSeguridadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroSeguridad")) {
				jButtonRecargarInformacionParametroSeguridadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroSeguridad")) {
				jButtonAnterioresParametroSeguridadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroSeguridad")) {
				jButtonSiguientesParametroSeguridadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroSeguridadBusqueda")) {
				this.jButtonidParametroSeguridadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroSeguridadUpdate")) {
				this.jButtonid_empresaParametroSeguridadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroSeguridadBusqueda")) {
				this.jButtonid_empresaParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_carteraParametroSeguridadBusqueda")) {
				this.jButtoncon_carteraParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copiar_clientesParametroSeguridadBusqueda")) {
				this.jButtoncon_copiar_clientesParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_copiar_proveedoresParametroSeguridadBusqueda")) {
				this.jButtoncon_copiar_proveedoresParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_generar_cliente_proveParametroSeguridadBusqueda")) {
				this.jButtoncon_generar_cliente_proveParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cliente_con_secuencial_autoParametroSeguridadBusqueda")) {
				this.jButtoncliente_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cliente_num_maximo_inicialesParametroSeguridadBusqueda")) {
				this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("prove_con_secuencial_autoParametroSeguridadBusqueda")) {
				this.jButtonprove_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("prove_num_maximo_inicialesParametroSeguridadBusqueda")) {
				this.jButtonprove_num_maximo_inicialesParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_validar_gruposParametroSeguridadBusqueda")) {
				this.jButtoncon_validar_gruposParametroSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("acti_fijo_con_secuencial_autoParametroSeguridadBusqueda")) {
				this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusquedaActionPerformed(evt);
			}
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroSeguridad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroSeguridad")) {
				closingInternalFrameParametroSeguridad();
				
			} else if(sTipo.equals("jButtonCancelarParametroSeguridad")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroSeguridad = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroSeguridadBeanSwingJInternalFrame jInternalFrameParent=(ParametroSeguridadBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroSeguridad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroSeguridadActionPerformed(null);
			}
			
			ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroseguridad,new Object(),this.parametroseguridadParameterGeneral,this.parametroseguridadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroSeguridad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroSeguridad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroSeguridad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametroseguridad)) {
			if(!esControlTabla) {
				if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);			
				}
				
				if(this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroSeguridad(this.parametroseguridad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroseguridadReturnGeneral=parametroseguridadLogic.procesarEventosParametroSeguridadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroseguridadLogic.getParametroSeguridads(),this.parametroseguridad,this.parametroseguridadParameterGeneral,this.isEsNuevoParametroSeguridad,classes);//this.parametroseguridadLogic.getParametroSeguridad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroSeguridad(this.parametroseguridadReturnGeneral,this.parametroseguridadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroSeguridad(classes,this.parametroseguridadReturnGeneral,this.parametroseguridadBean,false);
					}
						
					if(this.parametroseguridadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroSeguridad(this.parametroseguridadReturnGeneral.getParametroSeguridad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroSeguridad(this.parametroseguridadReturnGeneral.getParametroSeguridad());	
					}
						
					if(this.parametroseguridadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroSeguridad(this.parametroseguridadReturnGeneral.getParametroSeguridad(),classes);//this.parametroseguridadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroSeguridad(this.parametroseguridad,classes);//this.parametroseguridadBean);									
				}
			
				if(ParametroSeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroSeguridad(this.parametroseguridad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroSeguridad(this.parametroseguridad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametroseguridadAnterior!=null) {
						this.parametroseguridad=this.parametroseguridadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroseguridadReturnGeneral=parametroseguridadLogic.procesarEventosParametroSeguridadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroseguridadLogic.getParametroSeguridads(),this.parametroseguridad,this.parametroseguridadParameterGeneral,this.isEsNuevoParametroSeguridad,classes);//this.parametroseguridadLogic.getParametroSeguridad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroseguridadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametroseguridadReturnGeneral.getParametroSeguridad(),parametroseguridadLogic.getParametroSeguridads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametroseguridadReturnGeneral.getParametroSeguridad(),this.parametroseguridads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroSeguridad.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroSeguridad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroSeguridad();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroSeguridad() throws Exception {
		
		ParametroSeguridadModel parametroseguridadModel=(ParametroSeguridadModel)this.jTableDatosParametroSeguridad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroseguridadModel.parametroseguridads=this.parametroseguridadLogic.getParametroSeguridads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametroseguridadModel.parametroseguridads=this.parametroseguridads;
		}
		
		
		((ParametroSeguridadModel) this.jTableDatosParametroSeguridad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroSeguridad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametroseguridadAnterior(),this.parametroseguridadLogic.getParametroSeguridads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametroseguridadAnterior(),this.parametroseguridads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroSeguridad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroSeguridad(ParametroSeguridad parametroseguridad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
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
										
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroseguridad,new Object(),generalEntityParameterGeneral,this.parametroseguridadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroSeguridadConstantesFunciones.getClassesRelationshipsOfParametroSeguridad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroSeguridadConstantesFunciones.getClassesRelationshipsFromStringsOfParametroSeguridad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroSeguridad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroSeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroseguridad,new Object(),generalEntityParameterGeneral,this.parametroseguridadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroSeguridad(ParametroSeguridadBean parametroseguridadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroSeguridad(ArrayList<Classe> classes,ParametroSeguridadReturnGeneral parametroseguridadReturnGeneral,ParametroSeguridadBean parametroseguridadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroSeguridad(ParametroSeguridad parametroseguridad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametroseguridad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroSeguridad = new ParametroSeguridadDetalleFormJInternalFrame(jDesktopPane,this.parametroseguridadSessionBean.getConGuardarRelaciones(),this.parametroseguridadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.setVisible(false);
		this.jInternalFrameDetalleFormParametroSeguridad.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroSeguridad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroSeguridad.parametroseguridadLogic=this.parametroseguridadLogic;
		
		this.cargarCombosFrameForeignKeyParametroSeguridad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroSeguridad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroSeguridad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroSeguridad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroSeguridad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroSeguridad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroSeguridad"));
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarParametroSeguridad.addActionListener(new ButtonActionListener(this,"ModificarParametroSeguridad"));

		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarToolBarParametroSeguridad.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroSeguridad"));
					
		this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemModificarParametroSeguridad.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroSeguridad"));		
		
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarParametroSeguridad.addActionListener (new ButtonActionListener(this,"ActualizarParametroSeguridad"));
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarToolBarParametroSeguridad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroSeguridad"));
						
		this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemActualizarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroSeguridad"));		
		
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarParametroSeguridad.addActionListener (new ButtonActionListener(this,"EliminarParametroSeguridad"));
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroSeguridad"));
								
		this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemEliminarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroSeguridad"));		
		
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarParametroSeguridad.addActionListener (new ButtonActionListener(this,"CancelarParametroSeguridad"));
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroSeguridad"));
					
		this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemCancelarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroSeguridad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemDetalleCerrarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroSeguridad"));		
		
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroSeguridad"));
		
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroSeguridad"));
		
		
		
		this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroSeguridad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonidParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"idParametroSeguridadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonid_empresaParametroSeguridadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroSeguridadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonid_empresaParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_carteraParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_carteraParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_copiar_clientesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_clientesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_proveedoresParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_generar_cliente_proveParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"cliente_con_secuencial_autoParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"cliente_num_maximo_inicialesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"prove_con_secuencial_autoParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"prove_num_maximo_inicialesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_validar_gruposParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_validar_gruposParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"acti_fijo_con_secuencial_autoParametroSeguridadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroSeguridad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroSeguridad"));
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroSeguridad"));
		}
		
		this.jTableDatosParametroSeguridad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroSeguridad"));
		
		this.jTableDatosParametroSeguridad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroSeguridad"));
		
		this.jButtonNuevoParametroSeguridad.addActionListener(new ButtonActionListener(this,"NuevoParametroSeguridad"));
		
		this.jButtonDuplicarParametroSeguridad.addActionListener(new ButtonActionListener(this,"DuplicarParametroSeguridad"));
		
		this.jButtonCopiarParametroSeguridad.addActionListener(new ButtonActionListener(this,"CopiarParametroSeguridad"));
		
		this.jButtonVerFormParametroSeguridad.addActionListener(new ButtonActionListener(this,"VerFormParametroSeguridad"));
		
		
		this.jButtonNuevoToolBarParametroSeguridad.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroSeguridad"));
			
		this.jButtonDuplicarToolBarParametroSeguridad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroSeguridad"));
			
		this.jMenuItemNuevoParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroSeguridad"));
			
		this.jMenuItemDuplicarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroSeguridad"));		
		
		
		this.jButtonNuevoRelacionesParametroSeguridad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroSeguridad"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroSeguridad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroSeguridad"));
			
		this.jMenuItemNuevoRelacionesParametroSeguridad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroSeguridad"));		
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarParametroSeguridad.addActionListener(new ButtonActionListener(this,"ModificarParametroSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonModificarToolBarParametroSeguridad.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroSeguridad"));
			
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemModificarParametroSeguridad.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroSeguridad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarParametroSeguridad.addActionListener (new ButtonActionListener(this,"ActualizarParametroSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonActualizarToolBarParametroSeguridad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroSeguridad"));
				
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemActualizarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroSeguridad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarParametroSeguridad.addActionListener (new ButtonActionListener(this,"EliminarParametroSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonEliminarToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroSeguridad"));
						
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemEliminarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroSeguridad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarParametroSeguridad.addActionListener (new ButtonActionListener(this,"CancelarParametroSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonCancelarToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroSeguridad"));
			
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemCancelarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroSeguridad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroSeguridad"));		
		
		
		this.jButtonCerrarParametroSeguridad.addActionListener (new ButtonActionListener(this,"CerrarParametroSeguridad"));
		
		
		this.jButtonCerrarToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroSeguridad"));
			
		this.jMenuItemCerrarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroSeguridad"));
			
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jMenuItemDetalleCerrarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroSeguridad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosParametroSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroSeguridad"));
		}
		
		this.jButtonCopiarToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroSeguridad"));
			
		this.jButtonVerFormToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroSeguridad"));
		
		this.jMenuItemGuardarCambiosParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroSeguridad"));
			
		this.jMenuItemCopiarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroSeguridad"));		
		
		this.jMenuItemVerFormParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroSeguridad"));		
		
		
		this.jButtonGuardarCambiosTablaParametroSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroSeguridad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroSeguridad"));
			
		this.jMenuItemGuardarCambiosTablaParametroSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroSeguridad"));		
		
		
		
		this.jButtonRecargarInformacionParametroSeguridad.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroSeguridad"));
					
		this.jButtonRecargarInformacionToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroSeguridad"));
		
		this.jMenuItemRecargarInformacionParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroSeguridad"));		
		
		
		
		this.jButtonAnterioresParametroSeguridad.addActionListener (new ButtonActionListener(this,"AnterioresParametroSeguridad"));
		
		
		this.jButtonAnterioresToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroSeguridad"));
		
		this.jMenuItemAnterioresParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroSeguridad"));		
		
		
		this.jButtonSiguientesParametroSeguridad.addActionListener (new ButtonActionListener(this,"SiguientesParametroSeguridad"));
		
		
		this.jButtonSiguientesToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroSeguridad"));
			
		this.jMenuItemSiguientesParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroSeguridad"));
			
		this.jMenuItemAbrirOrderByParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroSeguridad"));
			
		this.jMenuItemMostrarOcultarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroSeguridad"));
			
		this.jMenuItemDetalleAbrirOrderByParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroSeguridad"));
			
		this.jMenuItemDetalleMostarOcultarParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroSeguridad"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroSeguridad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroSeguridad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroSeguridad"));
			
		this.jMenuItemNuevoGuardarCambiosParametroSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroSeguridad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroSeguridad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroSeguridad"));

		this.jCheckBoxSeleccionadosParametroSeguridad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroSeguridad"));
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroSeguridad"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroSeguridad.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroSeguridad"));
			
		this.jComboBoxTiposAccionesParametroSeguridad.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroSeguridad"));
					
		this.jComboBoxTiposSeleccionarParametroSeguridad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroSeguridad"));
			
		this.jTextFieldValorCampoGeneralParametroSeguridad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroSeguridad"));		
		
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonidParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"idParametroSeguridadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonid_empresaParametroSeguridadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroSeguridadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonid_empresaParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_carteraParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_carteraParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_copiar_clientesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_clientesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_proveedoresParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_generar_cliente_proveParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"cliente_con_secuencial_autoParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"cliente_num_maximo_inicialesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"prove_con_secuencial_autoParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"prove_num_maximo_inicialesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_validar_gruposParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_validar_gruposParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"acti_fijo_con_secuencial_autoParametroSeguridadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroSeguridad!=null) {
				this.jInternalFrameReporteDinamicoParametroSeguridad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroSeguridad"));
				this.jInternalFrameReporteDinamicoParametroSeguridad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroSeguridad"));
				this.jInternalFrameReporteDinamicoParametroSeguridad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroSeguridad"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroSeguridad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroSeguridad"));				
			//this.jButtonGenerarReporteDinamicoParametroSeguridad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroSeguridad"));
			//this.jButtonGenerarExcelReporteDinamicoParametroSeguridad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroSeguridad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroSeguridad!=null) {
				this.jInternalFrameImportacionParametroSeguridad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroSeguridad"));
				this.jInternalFrameImportacionParametroSeguridad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroSeguridad"));
				this.jInternalFrameImportacionParametroSeguridad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroSeguridad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroSeguridad.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroSeguridad"));
			
			this.jButtonAbrirOrderByToolBarParametroSeguridad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroSeguridad"));			
			
			if(this.jInternalFrameOrderByParametroSeguridad!=null) {
				this.jInternalFrameOrderByParametroSeguridad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroSeguridad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroSeguridad.jTabbedPaneRelacionesParametroSeguridad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroSeguridad"));
		
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
            		closingInternalFrameParametroSeguridad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroSeguridad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroSeguridad = (JInternalFrameBase)event.getSource();
	            	
	            ParametroSeguridadBeanSwingJInternalFrame jInternalFrameParent=(ParametroSeguridadBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroSeguridad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroSeguridadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroSeguridad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroSeguridadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroSeguridad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroSeguridad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroSeguridadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroSeguridadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroSeguridadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroSeguridad";
		inputMap = this.jButtonNuevoParametroSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroSeguridadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroSeguridadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroSeguridadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroSeguridadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroSeguridad";
		inputMap = this.jButtonNuevoRelacionesParametroSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroSeguridadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroSeguridad";
		inputMap = this.jButtonModificarParametroSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroSeguridad";
		inputMap = this.jButtonActualizarParametroSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroSeguridad";
		inputMap = this.jButtonEliminarParametroSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroSeguridad";
		inputMap = this.jButtonCancelarParametroSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroSeguridad";
		inputMap = this.jButtonCerrarParametroSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroSeguridad";
		inputMap = this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosParametroSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonGuardarCambiosParametroSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroSeguridad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroSeguridadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroSeguridad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroSeguridadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroSeguridad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroSeguridadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroSeguridad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroSeguridadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonidParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"idParametroSeguridadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonid_empresaParametroSeguridadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroSeguridadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonid_empresaParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_carteraParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_carteraParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_copiar_clientesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_clientesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_copiar_proveedoresParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_generar_cliente_proveParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"cliente_con_secuencial_autoParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"cliente_num_maximo_inicialesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"prove_con_secuencial_autoParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"prove_num_maximo_inicialesParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtoncon_validar_gruposParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"con_validar_gruposParametroSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroSeguridad.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"acti_fijo_con_secuencial_autoParametroSeguridadBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroSeguridadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroSeguridad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroSeguridad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
					parametroseguridadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroSeguridad parametroseguridadAux:parametroseguridads) {
					parametroseguridadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroSeguridadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroSeguridad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
						parametroseguridadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroSeguridad parametroseguridadAux:parametroseguridads) {
						parametroseguridadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
					
						if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA)) {
							existe=true;
							parametroseguridadAux.setcon_cartera(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES)) {
							existe=true;
							parametroseguridadAux.setcon_copiar_clientes(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES)) {
							existe=true;
							parametroseguridadAux.setcon_copiar_proveedores(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE)) {
							existe=true;
							parametroseguridadAux.setcon_generar_cliente_prove(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO)) {
							existe=true;
							parametroseguridadAux.setcliente_con_secuencial_auto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO)) {
							existe=true;
							parametroseguridadAux.setprove_con_secuencial_auto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS)) {
							existe=true;
							parametroseguridadAux.setcon_validar_grupos(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO)) {
							existe=true;
							parametroseguridadAux.setacti_fijo_con_secuencial_auto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroSeguridad parametroseguridadAux:parametroseguridads) {
						
						if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA)) {
							existe=true;
							parametroseguridadAux.setcon_cartera(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES)) {
							existe=true;
							parametroseguridadAux.setcon_copiar_clientes(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES)) {
							existe=true;
							parametroseguridadAux.setcon_copiar_proveedores(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE)) {
							existe=true;
							parametroseguridadAux.setcon_generar_cliente_prove(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO)) {
							existe=true;
							parametroseguridadAux.setcliente_con_secuencial_auto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO)) {
							existe=true;
							parametroseguridadAux.setprove_con_secuencial_auto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS)) {
							existe=true;
							parametroseguridadAux.setcon_validar_grupos(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO)) {
							existe=true;
							parametroseguridadAux.setacti_fijo_con_secuencial_auto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroSeguridad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroSeguridad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroSeguridad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroSeguridadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroSeguridad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroSeguridad.getSelectedRows();
			
			ParametroSeguridad parametroseguridadLocal=new ParametroSeguridad();
			
			//this.seleccionarTodosParametroSeguridad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroseguridadLocal =(ParametroSeguridad) this.parametroseguridadLogic.getParametroSeguridads().toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametroseguridadLocal =(ParametroSeguridad) this.parametroseguridads.toArray()[this.jTableDatosParametroSeguridad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametroseguridadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
						parametroseguridadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroSeguridad parametroseguridadAux:parametroseguridads) {
						parametroseguridadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroSeguridad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroSeguridad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroSeguridad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroSeguridad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroSeguridadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroSeguridadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroSeguridadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroSeguridad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroSeguridad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroSeguridad parametroseguridadAux:this.parametroseguridadLogic.getParametroSeguridads()) {
				
						if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES)) {
							existe=true;
							parametroseguridadAux.setcliente_num_maximo_iniciales(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES)) {
							existe=true;
							parametroseguridadAux.setprove_num_maximo_iniciales(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroSeguridad parametroseguridadAux:parametroseguridads) {
					
						if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES)) {
							existe=true;
							parametroseguridadAux.setcliente_num_maximo_iniciales(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES)) {
							existe=true;
							parametroseguridadAux.setprove_num_maximo_iniciales(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroSeguridad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroSeguridadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroSeguridad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroSeguridad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroSeguridad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroSeguridad) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroSeguridad(conSplash);
				
					this.generarReporteParametroSeguridadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroSeguridadsSeleccionados();
				//this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroSeguridadsSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroSeguridadsSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroSeguridad();
				
				this.exportarParametroSeguridadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroSeguridads();
				//this.importarParametroSeguridads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroSeguridad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroSeguridadsSeleccionados();
				//this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Seguridad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroSeguridad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroSeguridad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroSeguridad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroSeguridadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroSeguridad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroSeguridad(conSplash);
					
						//this.actualizarParametrosGeneralParametroSeguridad();
						
						this.generarReporteProcesoAccionParametroSeguridadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroSeguridadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro SeguridadES SELECCIONADOS?", "MANTENIMIENTO DE Parametro Seguridad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroSeguridad();
				
						this.actualizarParametrosGeneralParametroSeguridad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametroseguridadReturnGeneral=parametroseguridadLogic.procesarAccionParametroSeguridadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametroseguridadLogic.getParametroSeguridads(),this.parametroseguridadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroSeguridadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroSeguridad();
					
					ParametroSeguridadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroSeguridadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroSeguridad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxTiposAccionesFormularioParametroSeguridad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroSeguridad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroSeguridadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroSeguridad();
			
			if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		
			ParametroSeguridad parametroseguridad=new ParametroSeguridad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroSeguridad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroSeguridad.getSelectedItem();
			
			
			
			
			parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametroseguridadsSeleccionados.size()==1) {
				for(ParametroSeguridad parametroseguridadAux:parametroseguridadsSeleccionados) {
					parametroseguridad=parametroseguridadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroSeguridad();
			
      		//this.finishProcessParametroSeguridad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroSeguridadReturnGeneral() throws Exception {
		if(this.parametroseguridadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametroseguridadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametroseguridadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametroseguridadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametroseguridadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametroseguridadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroSeguridad(false);
		}
		
		if(this.parametroseguridadReturnGeneral.getConRetornoLista() || this.parametroseguridadReturnGeneral.getConRetornoObjeto()) {
			if(this.parametroseguridadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroseguridadLogic.setParametroSeguridads(this.parametroseguridadReturnGeneral.getParametroSeguridads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametroseguridadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroseguridadLogic.setParametroSeguridad(this.parametroseguridadReturnGeneral.getParametroSeguridad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroSeguridad(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroSeguridad() throws Exception {
		
		
	}
	
	public ArrayList<ParametroSeguridad> getParametroSeguridadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroSeguridad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroSeguridad parametroseguridadAux:parametroseguridadLogic.getParametroSeguridads()) {
					if(parametroseguridadAux.getIsSelected()) {
						parametroseguridadsSeleccionados.add(parametroseguridadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroSeguridad parametroseguridadAux:this.parametroseguridads) {
					if(parametroseguridadAux.getIsSelected()) {
						parametroseguridadsSeleccionados.add(parametroseguridadAux);				
					}
				}
			}
			
			if(parametroseguridadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametroseguridadsSeleccionados.addAll(this.parametroseguridadLogic.getParametroSeguridads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametroseguridadsSeleccionados.addAll(this.parametroseguridads);				
					}
				}
			}
		} else {
			parametroseguridadsSeleccionados.add(this.parametroseguridad);
		}
		
		return parametroseguridadsSeleccionados;
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
	
	public void generarReporteParametroSeguridadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroSeguridadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroSeguridadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroSeguridadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroSeguridadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Seguridad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroSeguridadsSeleccionados() throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroSeguridads("Todos",parametroseguridadsSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroSeguridadsSeleccionados() throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroSeguridads("Todos",parametroseguridadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroSeguridadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroSeguridads("Todos",parametroseguridadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroSeguridadsSeleccionados() throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroSeguridad();
		
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroSeguridad();
		
		
		//this.generarReporteParametroSeguridads("Todos",parametroseguridadsSeleccionados ,parametroseguridadImplementable,parametroseguridadImplementableHome);
	}
	
	public void mostrarImportacionParametroSeguridads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroSeguridad();
		
		this.abrirFrameImportacionParametroSeguridad();		
		
			
		//this.generarReporteParametroSeguridads("Todos",parametroseguridadsSeleccionados ,parametroseguridadImplementable,parametroseguridadImplementableHome);
	}
	
	public void importarParametroSeguridads() throws Exception {		
	
	}
	
	public void exportarParametroSeguridadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroSeguridadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroSeguridadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroSeguridadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Seguridad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroSeguridadsSeleccionados() throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroseguridad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroSeguridad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroSeguridad parametroseguridadAux:parametroseguridadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroSeguridad(parametroseguridadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametroseguridadAux.setsDetalleGeneralEntityReporte(parametroseguridadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroSeguridad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroSeguridad(ParametroSeguridad parametroseguridad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametroseguridad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getcon_cartera().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getcon_copiar_clientes().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getcon_copiar_proveedores().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getcon_generar_cliente_prove().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getcliente_con_secuencial_auto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getcliente_num_maximo_iniciales().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getprove_con_secuencial_auto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getprove_num_maximo_iniciales().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getcon_validar_grupos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroseguridad.getacti_fijo_con_secuencial_auto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroSeguridadsSeleccionados() throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroseguridad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroSeguridads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroSeguridad(row);				
				iRow++;
			}				
			
			for(ParametroSeguridad parametroseguridadAux:parametroseguridadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroSeguridad(parametroseguridadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroSeguridadsSeleccionados() throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();		
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroseguridad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametroseguridads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametroseguridad");
			//elementRoot.appendChild(element);
		
			for(ParametroSeguridad parametroseguridadAux:parametroseguridadsSeleccionados) {
				element = document.createElement("parametroseguridad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroSeguridad(parametroseguridadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Seguridad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroSeguridad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroSeguridad(ParametroSeguridad parametroseguridad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getcon_cartera());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getcon_copiar_clientes());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getcon_copiar_proveedores());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getcon_generar_cliente_prove());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getcliente_con_secuencial_auto());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getcliente_num_maximo_iniciales());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getprove_con_secuencial_auto());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getprove_num_maximo_iniciales());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getcon_validar_grupos());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroseguridad.getacti_fijo_con_secuencial_auto());				
	}
	
	public void setFilaDatosExportarXmlParametroSeguridad(ParametroSeguridad parametroseguridad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroSeguridadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametroseguridad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroSeguridadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametroseguridad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroSeguridadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametroseguridad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcon_cartera = document.createElement(ParametroSeguridadConstantesFunciones.CONCARTERA);
		elementcon_cartera.appendChild(document.createTextNode(parametroseguridad.getcon_cartera().toString().trim()));
		element.appendChild(elementcon_cartera);

		Element elementcon_copiar_clientes = document.createElement(ParametroSeguridadConstantesFunciones.CONCOPIARCLIENTES);
		elementcon_copiar_clientes.appendChild(document.createTextNode(parametroseguridad.getcon_copiar_clientes().toString().trim()));
		element.appendChild(elementcon_copiar_clientes);

		Element elementcon_copiar_proveedores = document.createElement(ParametroSeguridadConstantesFunciones.CONCOPIARPROVEEDORES);
		elementcon_copiar_proveedores.appendChild(document.createTextNode(parametroseguridad.getcon_copiar_proveedores().toString().trim()));
		element.appendChild(elementcon_copiar_proveedores);

		Element elementcon_generar_cliente_prove = document.createElement(ParametroSeguridadConstantesFunciones.CONGENERARCLIENTEPROVE);
		elementcon_generar_cliente_prove.appendChild(document.createTextNode(parametroseguridad.getcon_generar_cliente_prove().toString().trim()));
		element.appendChild(elementcon_generar_cliente_prove);

		Element elementcliente_con_secuencial_auto = document.createElement(ParametroSeguridadConstantesFunciones.CLIENTECONSECUENCIALAUTO);
		elementcliente_con_secuencial_auto.appendChild(document.createTextNode(parametroseguridad.getcliente_con_secuencial_auto().toString().trim()));
		element.appendChild(elementcliente_con_secuencial_auto);

		Element elementcliente_num_maximo_iniciales = document.createElement(ParametroSeguridadConstantesFunciones.CLIENTENUMMAXIMOINICIALES);
		elementcliente_num_maximo_iniciales.appendChild(document.createTextNode(parametroseguridad.getcliente_num_maximo_iniciales().toString().trim()));
		element.appendChild(elementcliente_num_maximo_iniciales);

		Element elementprove_con_secuencial_auto = document.createElement(ParametroSeguridadConstantesFunciones.PROVECONSECUENCIALAUTO);
		elementprove_con_secuencial_auto.appendChild(document.createTextNode(parametroseguridad.getprove_con_secuencial_auto().toString().trim()));
		element.appendChild(elementprove_con_secuencial_auto);

		Element elementprove_num_maximo_iniciales = document.createElement(ParametroSeguridadConstantesFunciones.PROVENUMMAXIMOINICIALES);
		elementprove_num_maximo_iniciales.appendChild(document.createTextNode(parametroseguridad.getprove_num_maximo_iniciales().toString().trim()));
		element.appendChild(elementprove_num_maximo_iniciales);

		Element elementcon_validar_grupos = document.createElement(ParametroSeguridadConstantesFunciones.CONVALIDARGRUPOS);
		elementcon_validar_grupos.appendChild(document.createTextNode(parametroseguridad.getcon_validar_grupos().toString().trim()));
		element.appendChild(elementcon_validar_grupos);

		Element elementacti_fijo_con_secuencial_auto = document.createElement(ParametroSeguridadConstantesFunciones.ACTIFIJOCONSECUENCIALAUTO);
		elementacti_fijo_con_secuencial_auto.appendChild(document.createTextNode(parametroseguridad.getacti_fijo_con_secuencial_auto().toString().trim()));
		element.appendChild(elementacti_fijo_con_secuencial_auto);
	}
	
	public void generarReporteGroupGenericoParametroSeguridadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados=new ArrayList<ParametroSeguridad>();
		
		parametroseguridadsSeleccionados=this.getParametroSeguridadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroSeguridad(parametroseguridadsSeleccionados);
		
		this.generarReporteParametroSeguridads("Todos",parametroseguridadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroSeguridad(ArrayList<ParametroSeguridad> parametroseguridadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroSeguridad parametroseguridadAux:parametroseguridadsSeleccionados) {
				parametroseguridadAux.setsDetalleGeneralEntityReporte(parametroseguridadAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(parametroseguridadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroseguridadAux.getcon_cartera()));
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroseguridadAux.getcon_copiar_clientes()));
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroseguridadAux.getcon_copiar_proveedores()));
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroseguridadAux.getcon_generar_cliente_prove()));
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroseguridadAux.getcliente_con_secuencial_auto()));
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(parametroseguridadAux.getcliente_num_maximo_iniciales().toString());
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroseguridadAux.getprove_con_secuencial_auto()));
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(parametroseguridadAux.getprove_num_maximo_iniciales().toString());
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroseguridadAux.getcon_validar_grupos()));
				}
				 else if(sTipoSeleccionar.equals(ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO)) {
					existe=true;
					parametroseguridadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametroseguridadAux.getacti_fijo_con_secuencial_auto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroSeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroSeguridad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroSeguridad=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=true;
				this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=true;
			}
			
			this.isVisibilidadCeldaModificarParametroSeguridad=false;
			this.isVisibilidadCeldaActualizarParametroSeguridad=false;
			this.isVisibilidadCeldaEliminarParametroSeguridad=false;
			this.isVisibilidadCeldaCancelarParametroSeguridad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroSeguridad=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=false;
			this.isVisibilidadCeldaModificarParametroSeguridad=false;
			this.isVisibilidadCeldaActualizarParametroSeguridad=true;
			this.isVisibilidadCeldaEliminarParametroSeguridad=false;
			this.isVisibilidadCeldaCancelarParametroSeguridad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroSeguridad=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=false;
			this.isVisibilidadCeldaModificarParametroSeguridad=false;
			this.isVisibilidadCeldaActualizarParametroSeguridad=true;
			this.isVisibilidadCeldaEliminarParametroSeguridad=true;
			this.isVisibilidadCeldaCancelarParametroSeguridad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroSeguridad=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=false;
			this.isVisibilidadCeldaModificarParametroSeguridad=false;
			this.isVisibilidadCeldaActualizarParametroSeguridad=true;
			this.isVisibilidadCeldaEliminarParametroSeguridad=false;
			this.isVisibilidadCeldaCancelarParametroSeguridad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroSeguridad=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=true;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=true;
			this.isVisibilidadCeldaModificarParametroSeguridad=false;
			this.isVisibilidadCeldaActualizarParametroSeguridad=false;
			this.isVisibilidadCeldaEliminarParametroSeguridad=false;
			this.isVisibilidadCeldaCancelarParametroSeguridad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroSeguridad=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=false;
			this.isVisibilidadCeldaActualizarParametroSeguridad=false;
			this.isVisibilidadCeldaEliminarParametroSeguridad=false;
			this.isVisibilidadCeldaCancelarParametroSeguridad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=false;
			this.isVisibilidadCeldaModificarParametroSeguridad=true;
			this.isVisibilidadCeldaActualizarParametroSeguridad=false;
			this.isVisibilidadCeldaEliminarParametroSeguridad=false;
			this.isVisibilidadCeldaCancelarParametroSeguridad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroSeguridad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroSeguridad=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=true;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=true;
		} else {
			this.actualizarEstadoPanelsParametroSeguridad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroSeguridad=false;
			//this.isVisibilidadCeldaVerFormParametroSeguridad=false;
			this.isVisibilidadCeldaDuplicarParametroSeguridad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametroseguridadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosParametroSeguridad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			if(!parametroseguridadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;												
			}
			
			this.jButtonCerrarParametroSeguridad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroSeguridad=false;
		}
		
		if(!this.permiteMantenimiento(this.parametroseguridad)) {
			this.isVisibilidadCeldaActualizarParametroSeguridad=false;
			this.isVisibilidadCeldaEliminarParametroSeguridad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroSeguridad() {
	}
	
	public void actualizarEstadoPanelsParametroSeguridad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroSeguridad!=null) {
				this.jScrollPanelDatosEdicionParametroSeguridad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroSeguridad!=null) {
				this.jScrollPanelDatosParametroSeguridad.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroSeguridad!=null) {
				this.jPanelPaginacionParametroSeguridad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroSeguridad!=null) {
				this.jScrollPanelDatosEdicionParametroSeguridad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroSeguridad!=null) {
				this.jScrollPanelDatosParametroSeguridad.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroSeguridad!=null) {
				this.jPanelPaginacionParametroSeguridad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroSeguridad!=null) {
				this.jScrollPanelDatosEdicionParametroSeguridad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroSeguridad!=null) {
				this.jScrollPanelDatosParametroSeguridad.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroSeguridad!=null) {
				this.jPanelPaginacionParametroSeguridad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroSeguridad!=null) {
				this.jScrollPanelDatosEdicionParametroSeguridad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroSeguridad!=null) {
				this.jScrollPanelDatosParametroSeguridad.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroSeguridad!=null) {
				this.jPanelPaginacionParametroSeguridad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroSeguridad!=null) {
				this.jScrollPanelDatosEdicionParametroSeguridad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroSeguridad!=null) {
				this.jScrollPanelDatosParametroSeguridad.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroSeguridad!=null) {
				this.jPanelPaginacionParametroSeguridad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroSeguridad!=null) {
				this.jScrollPanelDatosEdicionParametroSeguridad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroSeguridad!=null) {
				this.jScrollPanelDatosParametroSeguridad.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroSeguridad!=null) {
				this.jPanelPaginacionParametroSeguridad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroSeguridad!=null) {
				this.jScrollPanelDatosEdicionParametroSeguridad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroSeguridad!=null) {
				this.jScrollPanelDatosParametroSeguridad.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroSeguridad!=null) {
				this.jPanelPaginacionParametroSeguridad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
					this.jTabbedPaneBusquedasParametroSeguridad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroSeguridad!=null) {
				this.jTabbedPaneBusquedasParametroSeguridad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroSeguridad!=null) {
				this.jPanelParametrosReportesParametroSeguridad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroSeguridadSessionBean parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
		
		if(this.parametroseguridadSessionBean==null) {
			this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
		}
		
		this.parametroseguridadSessionBean.setsUltimaBusquedaParametroSeguridad(this.getsAccionBusqueda());
		this.parametroseguridadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametroseguridadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametroseguridadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroSeguridadSessionBean parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
		
		if(this.parametroseguridadSessionBean==null) {
			this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
		}
		
		if(this.parametroseguridadSessionBean.getsUltimaBusquedaParametroSeguridad()!=null&&!this.parametroseguridadSessionBean.getsUltimaBusquedaParametroSeguridad().equals("")) {
			this.setsAccionBusqueda(parametroseguridadSessionBean.getsUltimaBusquedaParametroSeguridad());
			this.setiNumeroPaginacion(parametroseguridadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametroseguridadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametroseguridadSessionBean.getid_empresa());
				parametroseguridadSessionBean.setid_empresa(-1L);
			}
		}
		
		this.parametroseguridadSessionBean.setsUltimaBusquedaParametroSeguridad("");
		this.parametroseguridadSessionBean.setiNumeroPaginacion(ParametroSeguridadConstantesFunciones.INUMEROPAGINACION);
		this.parametroseguridadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroSeguridad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroSeguridad() {
		this.updateBorderResaltarBusquedasFormularioParametroSeguridad();
		this.updateVisibilidadBusquedasFormularioParametroSeguridad();
		this.updateHabilitarBusquedasFormularioParametroSeguridad();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroSeguridad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroSeguridad.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroSeguridad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroSeguridad.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroSeguridad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroSeguridad.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroSeguridad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarParametroSeguridad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroSeguridad() throws Exception {

		if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroSeguridad();
		this.updateVisibilidadResaltarControlesFormularioParametroSeguridad();
		this.updateHabilitarResaltarControlesFormularioParametroSeguridad();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroSeguridad() throws Exception {
		if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametroseguridadConstantesFunciones.resaltaridParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltaridParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarid_empresaParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarid_empresaParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarcon_carteraParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.setBorderPainted(true);this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarcon_carteraParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarcon_copiar_clientesParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.setBorderPainted(true);this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarcon_copiar_clientesParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarcon_copiar_proveedoresParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.setBorderPainted(true);this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarcon_copiar_proveedoresParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarcon_generar_cliente_proveParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.setBorderPainted(true);this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarcon_generar_cliente_proveParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarcliente_con_secuencial_autoParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setBorderPainted(true);this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarcliente_con_secuencial_autoParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarcliente_num_maximo_inicialesParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarcliente_num_maximo_inicialesParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarprove_con_secuencial_autoParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.setBorderPainted(true);this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarprove_con_secuencial_autoParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarprove_num_maximo_inicialesParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldprove_num_maximo_inicialesParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarprove_num_maximo_inicialesParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltarcon_validar_gruposParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.setBorderPainted(true);this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltarcon_validar_gruposParametroSeguridad);}
		if(this.parametroseguridadConstantesFunciones.resaltaracti_fijo_con_secuencial_autoParametroSeguridad!=null && this.jInternalFrameDetalleFormParametroSeguridad!=null) {this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setBorderPainted(true);this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setBorder(this.parametroseguridadConstantesFunciones.resaltaracti_fijo_con_secuencial_autoParametroSeguridad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroSeguridad() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
	
		//this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostraridParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelidParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostraridParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarid_empresaParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelid_empresaParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarid_empresaParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_carteraParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelcon_carteraParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_carteraParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_copiar_clientesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelcon_copiar_clientesParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_copiar_clientesParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_copiar_proveedoresParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelcon_copiar_proveedoresParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_copiar_proveedoresParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_generar_cliente_proveParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelcon_generar_cliente_proveParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_generar_cliente_proveParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcliente_con_secuencial_autoParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelcliente_con_secuencial_autoParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcliente_con_secuencial_autoParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcliente_num_maximo_inicialesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelcliente_num_maximo_inicialesParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcliente_num_maximo_inicialesParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarprove_con_secuencial_autoParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelprove_con_secuencial_autoParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarprove_con_secuencial_autoParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldprove_num_maximo_inicialesParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarprove_num_maximo_inicialesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelprove_num_maximo_inicialesParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarprove_num_maximo_inicialesParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_validar_gruposParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelcon_validar_gruposParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostrarcon_validar_gruposParametroSeguridad);
		//this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostraracti_fijo_con_secuencial_autoParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jPanelacti_fijo_con_secuencial_autoParametroSeguridad.setVisible(this.parametroseguridadConstantesFunciones.mostraracti_fijo_con_secuencial_autoParametroSeguridad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroSeguridad() throws Exception {
		if(this.jInternalFrameDetalleFormParametroSeguridad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroSeguridad!=null) {
	
		this.jInternalFrameDetalleFormParametroSeguridad.jLabelidParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activaridParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jComboBoxid_empresaParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarid_empresaParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_carteraParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarcon_carteraParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_clientesParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarcon_copiar_clientesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_copiar_proveedoresParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarcon_copiar_proveedoresParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_generar_cliente_proveParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarcon_generar_cliente_proveParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarcliente_con_secuencial_autoParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarcliente_num_maximo_inicialesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxprove_con_secuencial_autoParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarprove_con_secuencial_autoParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jTextFieldprove_num_maximo_inicialesParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarprove_num_maximo_inicialesParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxcon_validar_gruposParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activarcon_validar_gruposParametroSeguridad);
		this.jInternalFrameDetalleFormParametroSeguridad.jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setEnabled(this.parametroseguridadConstantesFunciones.activaracti_fijo_con_secuencial_autoParametroSeguridad);
		}
	}
	
		
}