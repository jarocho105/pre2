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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.TipoAsistenciaConstantesFunciones;
import com.bydan.erp.nomina.util.TipoAsistenciaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoAsistenciaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoAsistenciaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class TipoAsistenciaBeanSwingJInternalFrame extends TipoAsistenciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoAsistenciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoAsistencia> tipoasistenciaValidator = new ClassValidator<TipoAsistencia>(TipoAsistencia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoAsistencia tipoasistencia;	
	public TipoAsistencia tipoasistenciaAux;
	public TipoAsistencia tipoasistenciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoAsistencia tipoasistenciaTotales;
	public Long idTipoAsistenciaActual;
	public Long iIdNuevoTipoAsistencia=0L;
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
	
	public Boolean isPermisoTodoTipoAsistencia;
	public Boolean isPermisoNuevoTipoAsistencia;
	public Boolean isPermisoActualizarTipoAsistencia;
	public Boolean isPermisoActualizarOriginalTipoAsistencia;
	public Boolean isPermisoEliminarTipoAsistencia;
	public Boolean isPermisoGuardarCambiosTipoAsistencia;
	public Boolean isPermisoConsultaTipoAsistencia;
	public Boolean isPermisoBusquedaTipoAsistencia;
	public Boolean isPermisoReporteTipoAsistencia;
	public Boolean isPermisoPaginacionMedioTipoAsistencia;
	public Boolean isPermisoPaginacionAltoTipoAsistencia;
	public Boolean isPermisoPaginacionTodoTipoAsistencia;
	public Boolean isPermisoCopiarTipoAsistencia;
	public Boolean isPermisoVerFormTipoAsistencia;
	public Boolean isPermisoDuplicarTipoAsistencia;
	public Boolean isPermisoOrdenTipoAsistencia;
	
	
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
	
	public TipoAsistenciaParameterReturnGeneral tipoasistenciaReturnGeneral;
	public TipoAsistenciaParameterReturnGeneral tipoasistenciaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoAsistencia=false;
	public Boolean esParaAccionDesdeFormularioTipoAsistencia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoAsistenciaSessionBeanAdditional tipoasistenciaSessionBeanAdditional=null;
	
	public TipoAsistenciaSessionBeanAdditional getTipoAsistenciaSessionBeanAdditional() {
		return this.tipoasistenciaSessionBeanAdditional;
	}
	
	public void setTipoAsistenciaSessionBeanAdditional(TipoAsistenciaSessionBeanAdditional tipoasistenciaSessionBeanAdditional) {
		try {
			this.tipoasistenciaSessionBeanAdditional=tipoasistenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoAsistenciaBeanSwingJInternalFrameAdditional tipoasistenciaBeanSwingJInternalFrameAdditional=null;
	//public class TipoAsistenciaBeanSwingJInternalFrame
	
	public TipoAsistenciaBeanSwingJInternalFrameAdditional getTipoAsistenciaBeanSwingJInternalFrameAdditional() {
		return this.tipoasistenciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoAsistenciaBeanSwingJInternalFrameAdditional(TipoAsistenciaBeanSwingJInternalFrameAdditional tipoasistenciaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoasistenciaBeanSwingJInternalFrameAdditional=tipoasistenciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoAsistenciaLogic tipoasistenciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoAsistencia tipoasistenciaBean;
	public TipoAsistenciaConstantesFunciones tipoasistenciaConstantesFunciones;
	//public TipoAsistenciaParameterReturnGeneral tipoasistenciaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoAsistencia> tipoasistencias;	
	//public List<TipoAsistencia> tipoasistenciasEliminados;
	//public List<TipoAsistencia> tipoasistenciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoAsistencia=false;
	public Boolean isVisibilidadCeldaDuplicarTipoAsistencia=true;
	public Boolean isVisibilidadCeldaCopiarTipoAsistencia=true;
	public Boolean isVisibilidadCeldaVerFormTipoAsistencia=true;
	public Boolean isVisibilidadCeldaOrdenTipoAsistencia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
	public Boolean isVisibilidadCeldaModificarTipoAsistencia=false;
	public Boolean isVisibilidadCeldaActualizarTipoAsistencia=false;
	public Boolean isVisibilidadCeldaEliminarTipoAsistencia=false;
	public Boolean isVisibilidadCeldaCancelarTipoAsistencia=false;
	public Boolean isVisibilidadCeldaGuardarTipoAsistencia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoAsistencia=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoAsistencia() {
		return this.iIdNuevoTipoAsistencia;
	}

	public void setiIdNuevoTipoAsistencia(Long iIdNuevoTipoAsistencia) {
		this.iIdNuevoTipoAsistencia = iIdNuevoTipoAsistencia;
	}
	
	public Long getidTipoAsistenciaActual() {
		return this.idTipoAsistenciaActual;
	}

	public void setidTipoAsistenciaActual(Long idTipoAsistenciaActual) {
		this.idTipoAsistenciaActual = idTipoAsistenciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoAsistencia gettipoasistencia() {
		return this.tipoasistencia;
	}

	public void settipoasistencia(TipoAsistencia tipoasistencia) {
		this.tipoasistencia = tipoasistencia;
	}
	
	public TipoAsistencia gettipoasistenciaAux() {
		return this.tipoasistenciaAux;
	}

	public void settipoasistenciaAux(TipoAsistencia tipoasistenciaAux) {
		this.tipoasistenciaAux = tipoasistenciaAux;
	}				
	
	public TipoAsistencia gettipoasistenciaAnterior() {
		return this.tipoasistenciaAnterior;
	}

	public void settipoasistenciaAnterior(TipoAsistencia tipoasistenciaAnterior) {
		this.tipoasistenciaAnterior = tipoasistenciaAnterior;
	}	
	
	public TipoAsistencia gettipoasistenciaTotales() {
		return this.tipoasistenciaTotales;
	}

	public void settipoasistenciaTotales(TipoAsistencia tipoasistenciaTotales) {
		this.tipoasistenciaTotales = tipoasistenciaTotales;
	}	
	
	public TipoAsistencia gettipoasistenciaBean() {
		return this.tipoasistenciaBean;
	}

	public void settipoasistenciaBean(TipoAsistencia tipoasistenciaBean) {
		this.tipoasistenciaBean = tipoasistenciaBean;
	}	
	
	public TipoAsistenciaParameterReturnGeneral gettipoasistenciaReturnGeneral() {
		return this.tipoasistenciaReturnGeneral;
	}

	public void settipoasistenciaReturnGeneral(TipoAsistenciaParameterReturnGeneral tipoasistenciaReturnGeneral) {
		this.tipoasistenciaReturnGeneral = tipoasistenciaReturnGeneral;
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
	
	
	public TipoAsistenciaLogic getTipoAsistenciaLogic()	{		
		return tipoasistenciaLogic;
	}

	public void setTipoAsistenciaLogic(TipoAsistenciaLogic tipoasistenciaLogic) {
		this.tipoasistenciaLogic = tipoasistenciaLogic;
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
	
	public Boolean getIsEsNuevoTipoAsistencia() {
		return isEsNuevoTipoAsistencia;
	}

	public void setIsEsNuevoTipoAsistencia(Boolean isEsNuevoTipoAsistencia) {
		this.isEsNuevoTipoAsistencia = isEsNuevoTipoAsistencia;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoAsistencia() {
		return esParaAccionDesdeFormularioTipoAsistencia;
	}
	
	public void setEsParaAccionDesdeFormularioTipoAsistencia(Boolean esParaAccionDesdeFormularioTipoAsistencia) {
		this.esParaAccionDesdeFormularioTipoAsistencia = esParaAccionDesdeFormularioTipoAsistencia;
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

			if(this.tipoasistenciaSessionBean==null) {
				this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
			}

			if(!this.tipoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoasistenciaSessionBean.getlidEmpresaActual());
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

					if(this.tipoasistencia!=null) {
						this.tipoasistencia.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
						this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoAsistencia.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
						if(this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoAsistenciaGenerico)throws Exception
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
				jComboBoxid_empresaTipoAsistenciaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoAsistenciaGenerico!=null && jComboBoxid_empresaTipoAsistenciaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoAsistenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoAsistencia tipoasistencia,JComboBox jComboBoxid_empresaTipoAsistenciaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoAsistenciaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoAsistenciaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoasistencia.setid_empresa(empresaAux.getId());
				tipoasistencia.setempresa_descripcion(TipoAsistenciaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoasistencia.setEmpresa(empresaAux);			}
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

					if(!TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { 
							this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { 
					}

					if(!TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
							this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
							this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoAsistencia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoAsistenciaConstantesFunciones.refrescarForeignKeysDescripcionesTipoAsistencia(this.tipoasistenciaLogic.getTipoAsistencias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoAsistenciaConstantesFunciones.refrescarForeignKeysDescripcionesTipoAsistencia(this.tipoasistencias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoasistenciaLogic.setTipoAsistencias(this.tipoasistencias);
			tipoasistenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoAsistenciaParameterReturnGeneral getTipoAsistenciaParameterGeneral() {
		return this.tipoasistenciaParameterGeneral;
	}
	
	public void setTipoAsistenciaParameterGeneral(TipoAsistenciaParameterReturnGeneral tipoasistenciaParameterGeneral) {
		this.tipoasistenciaParameterGeneral = tipoasistenciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoAsistencia() {
		return isPermisoTodoTipoAsistencia;
	}

	public void setIsPermisoTodoTipoAsistencia(Boolean isPermisoTodoTipoAsistencia) {
		this.isPermisoTodoTipoAsistencia = isPermisoTodoTipoAsistencia;
	}

	public Boolean getIsPermisoNuevoTipoAsistencia() {
		return isPermisoNuevoTipoAsistencia;
	}

	public void setIsPermisoNuevoTipoAsistencia(Boolean isPermisoNuevoTipoAsistencia) {
		this.isPermisoNuevoTipoAsistencia = isPermisoNuevoTipoAsistencia;
	}

	public Boolean getIsPermisoActualizarTipoAsistencia() {
		return isPermisoActualizarTipoAsistencia;
	}

	public void setIsPermisoActualizarTipoAsistencia(Boolean isPermisoActualizarTipoAsistencia) {
		this.isPermisoActualizarTipoAsistencia = isPermisoActualizarTipoAsistencia;
	}

	public Boolean getIsPermisoEliminarTipoAsistencia() {
		return isPermisoEliminarTipoAsistencia;
	}

	public void setIsPermisoEliminarTipoAsistencia(Boolean isPermisoEliminarTipoAsistencia) {
		this.isPermisoEliminarTipoAsistencia = isPermisoEliminarTipoAsistencia;
	}

	public Boolean getIsPermisoGuardarCambiosTipoAsistencia() {
		return isPermisoGuardarCambiosTipoAsistencia;
	}

	public void setIsPermisoGuardarCambiosTipoAsistencia(Boolean isPermisoGuardarCambiosTipoAsistencia) {
		this.isPermisoGuardarCambiosTipoAsistencia = isPermisoGuardarCambiosTipoAsistencia;
	}
	
	public Boolean getIsPermisoConsultaTipoAsistencia() {
		return isPermisoConsultaTipoAsistencia;
	}

	public void setIsPermisoConsultaTipoAsistencia(Boolean isPermisoConsultaTipoAsistencia) {
		this.isPermisoConsultaTipoAsistencia = isPermisoConsultaTipoAsistencia;
	}

	public Boolean getIsPermisoBusquedaTipoAsistencia() {
		return isPermisoBusquedaTipoAsistencia;
	}

	public void setIsPermisoBusquedaTipoAsistencia(Boolean isPermisoBusquedaTipoAsistencia) {
		this.isPermisoBusquedaTipoAsistencia = isPermisoBusquedaTipoAsistencia;
	}

	public Boolean getIsPermisoReporteTipoAsistencia() {
		return isPermisoReporteTipoAsistencia;
	}

	public void setIsPermisoReporteTipoAsistencia(Boolean isPermisoReporteTipoAsistencia) {
		this.isPermisoReporteTipoAsistencia = isPermisoReporteTipoAsistencia;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoAsistencia() {
		return isPermisoPaginacionMedioTipoAsistencia;
	}

	public void setIsPermisoPaginacionMedioTipoAsistencia(Boolean isPermisoPaginacionMedioTipoAsistencia) {
		this.isPermisoPaginacionMedioTipoAsistencia = isPermisoPaginacionMedioTipoAsistencia;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoAsistencia() {
		return isPermisoPaginacionTodoTipoAsistencia;
	}

	public void setIsPermisoPaginacionTodoTipoAsistencia(Boolean isPermisoPaginacionTodoTipoAsistencia) {
		this.isPermisoPaginacionTodoTipoAsistencia = isPermisoPaginacionTodoTipoAsistencia;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoAsistencia() {
		return isPermisoPaginacionAltoTipoAsistencia;
	}

	public void setIsPermisoPaginacionAltoTipoAsistencia(Boolean isPermisoPaginacionAltoTipoAsistencia) {
		this.isPermisoPaginacionAltoTipoAsistencia = isPermisoPaginacionAltoTipoAsistencia;
	}
	
	public Boolean getIsPermisoCopiarTipoAsistencia() {
		return isPermisoCopiarTipoAsistencia;
	}

	public void setIsPermisoCopiarTipoAsistencia(Boolean isPermisoCopiarTipoAsistencia) {
		this.isPermisoCopiarTipoAsistencia = isPermisoCopiarTipoAsistencia;
	}
	
	public Boolean getIsPermisoVerFormTipoAsistencia() {
		return isPermisoVerFormTipoAsistencia;
	}

	public void setIsPermisoVerFormTipoAsistencia(Boolean isPermisoVerFormTipoAsistencia) {
		this.isPermisoVerFormTipoAsistencia = isPermisoVerFormTipoAsistencia;
	}
	
	public Boolean getIsPermisoDuplicarTipoAsistencia() {
		return isPermisoDuplicarTipoAsistencia;
	}

	public void setIsPermisoDuplicarTipoAsistencia(Boolean isPermisoDuplicarTipoAsistencia) {
		this.isPermisoDuplicarTipoAsistencia = isPermisoDuplicarTipoAsistencia;
	}
	
	public Boolean getIsPermisoOrdenTipoAsistencia() {
		return isPermisoOrdenTipoAsistencia;
	}

	public void setIsPermisoOrdenTipoAsistencia(Boolean isPermisoOrdenTipoAsistencia) {
		this.isPermisoOrdenTipoAsistencia = isPermisoOrdenTipoAsistencia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoAsistencia() {
		return isVisibilidadCeldaNuevoTipoAsistencia;
	}

	public void setIsVisibilidadCeldaNuevoTipoAsistencia(Boolean isVisibilidadCeldaNuevoTipoAsistencia) {
		this.isVisibilidadCeldaNuevoTipoAsistencia = isVisibilidadCeldaNuevoTipoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoAsistencia() {
		return isVisibilidadCeldaDuplicarTipoAsistencia;
	}

	public void setIsVisibilidadCeldaDuplicarTipoAsistencia(Boolean isVisibilidadCeldaDuplicarTipoAsistencia) {
		this.isVisibilidadCeldaDuplicarTipoAsistencia = isVisibilidadCeldaDuplicarTipoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoAsistencia() {
		return isVisibilidadCeldaCopiarTipoAsistencia;
	}

	public void setIsVisibilidadCeldaCopiarTipoAsistencia(Boolean isVisibilidadCeldaCopiarTipoAsistencia) {
		this.isVisibilidadCeldaCopiarTipoAsistencia = isVisibilidadCeldaCopiarTipoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoAsistencia() {
		return isVisibilidadCeldaVerFormTipoAsistencia;
	}

	public void setIsVisibilidadCeldaVerFormTipoAsistencia(Boolean isVisibilidadCeldaVerFormTipoAsistencia) {
		this.isVisibilidadCeldaVerFormTipoAsistencia = isVisibilidadCeldaVerFormTipoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoAsistencia() {
		return isVisibilidadCeldaOrdenTipoAsistencia;
	}

	public void setIsVisibilidadCeldaOrdenTipoAsistencia(Boolean isVisibilidadCeldaOrdenTipoAsistencia) {
		this.isVisibilidadCeldaOrdenTipoAsistencia = isVisibilidadCeldaOrdenTipoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoAsistencia() {
		return isVisibilidadCeldaNuevoRelacionesTipoAsistencia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoAsistencia(Boolean isVisibilidadCeldaNuevoRelacionesTipoAsistencia) {
		this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia = isVisibilidadCeldaNuevoRelacionesTipoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoAsistencia() {
		return isVisibilidadCeldaModificarTipoAsistencia;
	}

	public void setIsVisibilidadCeldaModificarTipoAsistencia(Boolean isVisibilidadCeldaModificarTipoAsistencia) {
		this.isVisibilidadCeldaModificarTipoAsistencia = isVisibilidadCeldaModificarTipoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoAsistencia() {
		return isVisibilidadCeldaActualizarTipoAsistencia;
	}

	public void setIsVisibilidadCeldaActualizarTipoAsistencia(Boolean isVisibilidadCeldaActualizarTipoAsistencia) {
		this.isVisibilidadCeldaActualizarTipoAsistencia = isVisibilidadCeldaActualizarTipoAsistencia;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoAsistencia() {
		return isVisibilidadCeldaEliminarTipoAsistencia;
	}

	public void setIsVisibilidadCeldaEliminarTipoAsistencia(Boolean isVisibilidadCeldaEliminarTipoAsistencia) {
		this.isVisibilidadCeldaEliminarTipoAsistencia = isVisibilidadCeldaEliminarTipoAsistencia;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoAsistencia() {
		return isVisibilidadCeldaCancelarTipoAsistencia;
	}

	public void setIsVisibilidadCeldaCancelarTipoAsistencia(Boolean isVisibilidadCeldaCancelarTipoAsistencia) {
		this.isVisibilidadCeldaCancelarTipoAsistencia = isVisibilidadCeldaCancelarTipoAsistencia;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoAsistencia() {
		return isVisibilidadCeldaGuardarTipoAsistencia;
	}

	public void setIsVisibilidadCeldaGuardarTipoAsistencia(Boolean isVisibilidadCeldaGuardarTipoAsistencia) {
		this.isVisibilidadCeldaGuardarTipoAsistencia = isVisibilidadCeldaGuardarTipoAsistencia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoAsistencia() {
		return isVisibilidadCeldaGuardarCambiosTipoAsistencia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoAsistencia(Boolean isVisibilidadCeldaGuardarCambiosTipoAsistencia) {
		this.isVisibilidadCeldaGuardarCambiosTipoAsistencia = isVisibilidadCeldaGuardarCambiosTipoAsistencia;
	}
		
	public TipoAsistenciaSessionBean gettipoasistenciaSessionBean() {
		return this.tipoasistenciaSessionBean;
	}
	
	public void settipoasistenciaSessionBean(TipoAsistenciaSessionBean tipoasistenciaSessionBean) {
		this.tipoasistenciaSessionBean=tipoasistenciaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(TipoAsistencia tipoasistencia)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoasistencia,null);
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
	
	public void bugActualizarReferenciaActual(TipoAsistencia tipoasistencia,TipoAsistencia tipoasistenciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoAsistencia(tipoasistencia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoasistenciaAux.setId(tipoasistencia.getId());
		tipoasistenciaAux.setVersionRow(tipoasistencia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoAsistencia();
		
			int intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoAsistencia(this.tipoasistencia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoasistenciaValidator.getInvalidValues(this.tipoasistencia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoasistenciaLogic.setDatosCliente(datosCliente);
			tipoasistenciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoasistenciaAux=new  TipoAsistencia();
				
				tipoasistenciaAux.setIsNew(true);
				tipoasistenciaAux.setIsChanged(true);
				
				tipoasistenciaAux.setTipoAsistenciaOriginal(this.tipoasistencia);
				
				tipoasistenciaAux.setId(this.tipoasistencia.getId());	
				tipoasistenciaAux.setVersionRow(this.tipoasistencia.getVersionRow());	
				tipoasistenciaAux.setid_empresa(this.tipoasistencia.getid_empresa());	
				tipoasistenciaAux.setnombre(this.tipoasistencia.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoasistenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoasistenciaAux,tipoasistenciaLogic.getTipoAsistencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoasistenciaAux,tipoasistencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoasistenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoasistenciaLogic.saveTipoAsistencias();//WithConnection
						//tipoasistenciaLogic.getSetVersionRowTipoAsistencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoasistencia,tipoasistenciaAux);
					
					this.refrescarForeignKeysDescripcionesTipoAsistencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoasistenciaLogic.saveTipoAsistenciaRelaciones(tipoasistenciaAux);//WithConnection
								//tipoasistenciaLogic.getSetVersionRowTipoAsistencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoasistencia,tipoasistenciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoasistenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoasistenciaAux,tipoasistenciaLogic.getTipoAsistencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoasistenciaAux,tipoasistencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoasistencia,tipoasistenciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoasistenciaAux=new  TipoAsistencia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoasistenciaSessionBean.getEsGuardarRelacionado() && this.tipoasistencia.getId()>=0)) {
						
					tipoasistenciaAux.setIsNew(false);
				}
				
				tipoasistenciaAux.setIsDeleted(false);
			
				tipoasistenciaAux.setId(this.tipoasistencia.getId());	
				tipoasistenciaAux.setVersionRow(this.tipoasistencia.getVersionRow());	
				tipoasistenciaAux.setid_empresa(this.tipoasistencia.getid_empresa());	
				tipoasistenciaAux.setnombre(this.tipoasistencia.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoasistenciaAux,tipoasistenciaLogic.getTipoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoasistenciaAux,tipoasistencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoasistenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoasistenciaLogic.saveTipoAsistencias();//WithConnection
						//tipoasistenciaLogic.getSetVersionRowTipoAsistencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoasistencia,tipoasistenciaAux);
					
					this.refrescarForeignKeysDescripcionesTipoAsistencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoasistenciaLogic.saveTipoAsistenciaRelaciones(tipoasistenciaAux);//WithConnection
								//tipoasistenciaLogic.getSetVersionRowTipoAsistencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoasistencia,tipoasistenciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoasistenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoasistenciaAux,tipoasistenciaLogic.getTipoAsistencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoasistenciaAux,tipoasistencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoasistencia,tipoasistenciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoasistenciaAux=new  TipoAsistencia();
				
				tipoasistenciaAux.setIsNew(false);
				tipoasistenciaAux.setIsChanged(false);
				
				tipoasistenciaAux.setIsDeleted(true);
				
				tipoasistenciaAux.setId(this.tipoasistencia.getId());	
				tipoasistenciaAux.setVersionRow(this.tipoasistencia.getVersionRow());	
				tipoasistenciaAux.setid_empresa(this.tipoasistencia.getid_empresa());	
				tipoasistenciaAux.setnombre(this.tipoasistencia.getnombre());	
				
				if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoasistenciaAux.getId()>=0) {	
						this.tipoasistenciasEliminados.add(tipoasistenciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoasistenciaAux,tipoasistenciaLogic.getTipoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoasistenciaAux,tipoasistencias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoasistenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoasistenciaLogic.saveTipoAsistencias();//WithConnection
						//tipoasistenciaLogic.getSetVersionRowTipoAsistencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoasistenciaLogic.saveTipoAsistenciaRelaciones(tipoasistenciaAux);//WithConnection
								//tipoasistenciaLogic.getSetVersionRowTipoAsistencias();//WithConnection
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
							if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoasistenciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoasistenciaAux,tipoasistenciaLogic.getTipoAsistencias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoasistenciaAux,tipoasistencias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.getTipoAsistencias().addAll(this.tipoasistenciasEliminados);
					
					tipoasistenciaLogic.saveTipoAsistencias();//WithConnection
					//tipoasistenciaLogic.getSetVersionRowTipoAsistencias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoAsistencia();
				
				this.tipoasistenciasEliminados= new ArrayList<TipoAsistencia>();		
			}
			
			if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Asistencia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoasistencia=tipoasistenciaAux;
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
      		//this.finishProcessTipoAsistencia();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoAsistencia tipoasistenciaLocal) throws Exception {
		
		if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoAsistencia tipoasistenciaLocal) throws Exception {	
		if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoasistenciaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoAsistenciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoasistenciaValidator.getInvalidValues(this.tipoasistencia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoAsistencia tipoasistencia,List<TipoAsistencia> tipoasistencias) throws Exception {
		try	{		
			TipoAsistenciaConstantesFunciones.actualizarLista(tipoasistencia,tipoasistencias,this.tipoasistenciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoAsistencia tipoasistencia,List<TipoAsistencia> tipoasistencias) throws Exception {
		try	{			
			TipoAsistenciaConstantesFunciones.actualizarSelectedLista(tipoasistencia,tipoasistencias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoAsistencia> tipoasistenciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoasistenciasLocal=this.tipoasistenciaLogic.getTipoAsistencias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoasistenciasLocal=this.tipoasistencias;
			}
			//ARCHITECTURE
		
			for(TipoAsistencia tipoasistenciaLocal:tipoasistenciasLocal) {
				if(this.permiteMantenimiento(tipoasistenciaLocal) && tipoasistenciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoAsistenciaConstantesFunciones.getTipoAsistenciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoAsistenciaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAsistencia.jLabelid_empresaTipoAsistencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAsistenciaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAsistencia.jLabelnombreTipoAsistencia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAsistencia.jLabelid_empresaTipoAsistencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAsistencia.jLabelnombreTipoAsistencia,"");
		
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
		this.iIdNuevoTipoAsistencia--;	
		
		
		this.tipoasistenciaAux=new TipoAsistencia();
		
		this.tipoasistenciaAux.setId(this.iIdNuevoTipoAsistencia);
		this.tipoasistenciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoasistenciaLogic.getTipoAsistencias().add(this.tipoasistenciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoasistencias.add(this.tipoasistenciaAux);
		}
		//ARCHITECTURE
		
		this.tipoasistencia=this.tipoasistenciaAux;
		
		if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoAsistencia(this.tipoasistencia);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAsistencia(this.tipoasistencia);
		}
				
		//this.setDefaultControlesTipoAsistencia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoAsistencia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoAsistencia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAsistencia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAsistencia(this.tipoasistenciaBean,this.tipoasistencia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoAsistenciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
			classes=TipoAsistenciaConstantesFunciones.getClassesRelationshipsOfTipoAsistencia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoasistenciaReturnGeneral=tipoasistenciaLogic.procesarEventosTipoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoasistenciaLogic.getTipoAsistencias(),this.tipoasistencia,this.tipoasistenciaParameterGeneral,this.isEsNuevoTipoAsistencia,classes);//this.tipoasistenciaLogic.getTipoAsistencia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoAsistencia(this.tipoasistenciaReturnGeneral,this.tipoasistenciaBean,false);
		
		if(this.tipoasistenciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAsistencia(this.tipoasistenciaReturnGeneral.getTipoAsistencia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoAsistencia(this.tipoasistenciaReturnGeneral.getTipoAsistencia());
		}
		
		if(this.tipoasistenciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoAsistencia(this.tipoasistenciaReturnGeneral.getTipoAsistencia(),classes);//this.tipoasistenciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoAsistencia(this.tipoasistencia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoAsistencia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoAsistencia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.RecargarFormTipoAsistencia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoAsistencia(false);
						
			if(tipoasistenciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAsistencia();
			}
			
			this.actualizarVisualTableDatosTipoAsistencia();
			
			this.jTableDatosTipoAsistencia.setRowSelectionInterval(this.getIndiceNuevoTipoAsistencia(), this.getIndiceNuevoTipoAsistencia());
			
			this.seleccionarFilaTablaTipoAsistenciaActual();
						
			this.actualizarEstadoCeldasBotonesTipoAsistencia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoAsistencia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoAsistencia.jTextFieldnombreTipoAsistencia.setEnabled(isHabilitar && this.tipoasistenciaConstantesFunciones.activarnombreTipoAsistencia);	
		//
		this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setEnabled(isHabilitar && this.tipoasistenciaConstantesFunciones.activarid_empresaTipoAsistencia);
	};
	
	public void setDefaultControlesTipoAsistencia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoAsistencia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoasistenciaSessionBean.setConGuardarRelaciones(true);			
			this.tipoasistenciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.setVisible(true);
			
					
		} else {
			//this.tipoasistenciaSessionBean.setConGuardarRelaciones(false);			
			this.tipoasistenciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoAsistencia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
				if(tipoasistenciaAux.getId().equals(this.iIdNuevoTipoAsistencia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAsistencia tipoasistenciaAux:this.tipoasistencias) {
				if(tipoasistenciaAux.getId().equals(this.iIdNuevoTipoAsistencia)) {
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
	
	public int getIndiceActualTipoAsistencia(TipoAsistencia tipoasistencia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
				if(tipoasistenciaAux.getId().equals(tipoasistencia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAsistencia tipoasistenciaAux:this.tipoasistencias) {
				if(tipoasistenciaAux.getId().equals(tipoasistencia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoAsistencia(TipoAsistencia tipoasistenciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
				if(tipoasistenciaAux.getTipoAsistenciaOriginal().getId().equals(tipoasistenciaOriginal.getId())) {
					existe=true;
					tipoasistenciaOriginal.setId(tipoasistenciaAux.getId());
					tipoasistenciaOriginal.setVersionRow(tipoasistenciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAsistencia tipoasistenciaAux:this.tipoasistencias) {
				if(tipoasistenciaAux.getTipoAsistenciaOriginal().getId().equals(tipoasistenciaOriginal.getId())) {
					existe=true;
					tipoasistenciaOriginal.setId(tipoasistenciaAux.getId());
					tipoasistenciaOriginal.setVersionRow(tipoasistenciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoAsistencia(Boolean esParaCancelar) throws Exception {
		tipoasistenciasAux=new ArrayList<TipoAsistencia>();
		tipoasistenciaAux=new TipoAsistencia();
		
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
					if(tipoasistenciaAux.getId()<0) {
						tipoasistenciasAux.add(tipoasistenciaAux);
					}		
				}
				this.iIdNuevoTipoAsistencia=0L;
				this.tipoasistenciaLogic.getTipoAsistencias().removeAll(tipoasistenciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAsistencia tipoasistenciaAux:this.tipoasistencias) {
					if(tipoasistenciaAux.getId()<0) {
						tipoasistenciasAux.add(tipoasistenciaAux);
					}		
				}
				this.iIdNuevoTipoAsistencia=0L;
				this.tipoasistencias.removeAll(tipoasistenciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoAsistencia 
					&& this.tipoasistenciaLogic.getTipoAsistencias().size()>0
					) {
					tipoasistenciaAux=this.tipoasistenciaLogic.getTipoAsistencias().get(this.tipoasistenciaLogic.getTipoAsistencias().size() - 1);
				
					if(tipoasistenciaAux.getId()<0) {
						this.tipoasistenciaLogic.getTipoAsistencias().remove(tipoasistenciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoAsistencia && this.tipoasistencias.size()>0) {
					tipoasistenciaAux=this.tipoasistencias.get(this.tipoasistencias.size() - 1);
				
					if(tipoasistenciaAux.getId()<0) {
						this.tipoasistencias.remove(tipoasistenciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoAsistencia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoasistencia.getId()<0) {
				this.tipoasistenciaLogic.getTipoAsistencias().remove(this.tipoasistencia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoasistencia.getId()<0) {
				this.tipoasistencias.remove(this.tipoasistencia);
			}
		}			
	}
	
	public void setEstadosInicialesTipoAsistencia(List<TipoAsistencia> tipoasistenciasAux) throws Exception {
		TipoAsistenciaConstantesFunciones.setEstadosInicialesTipoAsistencia(tipoasistenciasAux);
	}
	
	public void setEstadosInicialesTipoAsistencia(TipoAsistencia tipoasistenciaAux) throws Exception {
		TipoAsistenciaConstantesFunciones.setEstadosInicialesTipoAsistencia(tipoasistenciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoAsistenciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoAsistenciaActual()) {
				if(!this.isEsNuevoTipoAsistencia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoAsistencia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoAsistenciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Asistencia ?", "MANTENIMIENTO DE Tipo Asistencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoAsistencia tipoasistencia) throws Exception {
		TipoAsistenciaConstantesFunciones.seleccionarAsignar(this.tipoasistencia,tipoasistencia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoAsistencia=this.isPermisoActualizarOriginalTipoAsistencia;
			
			
			this.seleccionarAsignar(tipoasistencia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAsistenciaConstantesFunciones.quitarEspaciosTipoAsistencia(this.tipoasistencia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoAsistencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoasistenciaSessionBean.setsFuncionBusquedaRapida(this.tipoasistenciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoAsistencia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoAsistencia(esParaCancelar);				
				this.cancelarNuevoTipoAsistencia(esParaCancelar);								
			}
			
			this.tipoasistencia=new TipoAsistencia();
			
			this.inicializarTipoAsistencia();
			
			this.actualizarEstadoCeldasBotonesTipoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoAsistencia() throws Exception {
		try {
			TipoAsistenciaConstantesFunciones.inicializarTipoAsistencia(this.tipoasistencia);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoasistenciaLogic.getTipoAsistencias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoAsistencias(String sAccionBusqueda,List<TipoAsistencia> tipoasistenciasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoAsistencia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoAsistenciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoAsistenciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoAsistencia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Asistencias");		
		parameters.put("busquedapor", TipoAsistenciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoAsistencia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoAsistenciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoAsistenciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoAsistencia=new JRBeanArrayDataSource(TipoAsistenciaJInternalFrame.TraerTipoAsistenciaBeans(tipoasistenciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoAsistencia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoAsistenciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoAsistenciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoAsistenciaBean.TraerTipoAsistenciaBeans(tipoasistenciasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoAsistencias(sAccionBusqueda,sTipoArchivoReporte,tipoasistenciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoAsistencias(sAccionBusqueda,sTipoArchivoReporte,tipoasistenciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoAsistenciaActionPerformed(null);
					//this.generarExcelReporteTipoAsistencias(sAccionBusqueda,sTipoArchivoReporte,tipoasistenciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoAsistencias(sAccionBusqueda,sTipoArchivoReporte,tipoasistenciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoAsistencias(sAccionBusqueda,sTipoArchivoReporte,tipoasistenciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoAsistencias(sAccionBusqueda,sTipoArchivoReporte,tipoasistenciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoAsistencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAsistencia> tipoasistenciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoasistencia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAsistencias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAsistencia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoAsistencia tipoasistencia : tipoasistenciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoAsistenciaConstantesFunciones.generarExcelReporteDataTipoAsistencia("NORMAL",row,workbook,tipoasistencia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoAsistencia(String sTipo,Row row,Workbook workbook) {
		
		TipoAsistenciaConstantesFunciones.generarExcelReporteHeaderTipoAsistencia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoAsistencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAsistencia> tipoasistenciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoasistencia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAsistencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoAsistencia tipoasistencia : tipoasistenciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoAsistenciaConstantesFunciones.getTipoAsistenciaDescripcion(tipoasistencia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoasistencia.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAsistenciaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAsistenciaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoasistencia.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoAsistencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAsistencia> tipoasistenciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoAsistencia> tipoasistenciasRespaldo=null;
		
		classes=TipoAsistenciaConstantesFunciones.getClassesRelationshipsOfTipoAsistencia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoasistenciaLogic.setDatosCliente(this.datosCliente);
		this.tipoasistenciaLogic.setDatosDeep(this.datosDeep);
		this.tipoasistenciaLogic.setIsConDeep(true);
		
		tipoasistenciasRespaldo=this.tipoasistenciaLogic.getTipoAsistencias();
		
		this.tipoasistenciaLogic.setTipoAsistencias(tipoasistenciasParaReportes);	
		this.tipoasistenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoasistenciasParaReportes=this.tipoasistenciaLogic.getTipoAsistencias();
		this.tipoasistenciaLogic.setTipoAsistencias(tipoasistenciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoasistencia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAsistencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAsistencia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoAsistencia tipoasistencia : tipoasistenciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoAsistencia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoAsistenciaConstantesFunciones.generarExcelReporteDataTipoAsistencia("NORMAL",row,workbook,tipoasistencia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoAsistenciaConstantesFunciones.getTipoAsistenciaDescripcion(tipoasistencia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAsistencia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoAsistencia() throws Exception {		
		this.startProcessTipoAsistencia(true);
	}
	
	public void startProcessTipoAsistencia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoAsistencia ,this.jPanelParametrosReportesTipoAsistencia, this.jScrollPanelDatosTipoAsistencia,this.jPanelPaginacionTipoAsistencia, this.jScrollPanelDatosEdicionTipoAsistencia, this.jPanelAccionesTipoAsistencia,this.jPanelAccionesFormularioTipoAsistencia,this.jmenuBarTipoAsistencia,this.jmenuBarDetalleTipoAsistencia,this.jTtoolBarTipoAsistencia,this.jTtoolBarDetalleTipoAsistencia);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAsistencia=this.jTabbedPaneBusquedasTipoAsistencia; 
		
		final JPanel jPanelParametrosReportesTipoAsistencia=this.jPanelParametrosReportesTipoAsistencia;
		//final JScrollPane jScrollPanelDatosTipoAsistencia=this.jScrollPanelDatosTipoAsistencia;
		final JTable jTableDatosTipoAsistencia=this.jTableDatosTipoAsistencia;		
		final JPanel jPanelPaginacionTipoAsistencia=this.jPanelPaginacionTipoAsistencia;
		//final JScrollPane jScrollPanelDatosEdicionTipoAsistencia=this.jScrollPanelDatosEdicionTipoAsistencia;
		final JPanel jPanelAccionesTipoAsistencia=this.jPanelAccionesTipoAsistencia;
		
		JPanel jPanelCamposAuxiliarTipoAsistencia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoAsistencia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			jPanelCamposAuxiliarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jPanelCamposTipoAsistencia;
			jPanelAccionesFormularioAuxiliarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jPanelAccionesFormularioTipoAsistencia;
		}
		
		final JPanel jPanelCamposTipoAsistencia=jPanelCamposAuxiliarTipoAsistencia;
		final JPanel jPanelAccionesFormularioTipoAsistencia=jPanelAccionesFormularioAuxiliarTipoAsistencia;
		
		
		final JMenuBar jmenuBarTipoAsistencia=this.jmenuBarTipoAsistencia;
		final JToolBar jTtoolBarTipoAsistencia=this.jTtoolBarTipoAsistencia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoAsistencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAsistencia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			jmenuBarDetalleAuxiliarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jmenuBarDetalleTipoAsistencia;
			jTtoolBarDetalleAuxiliarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jTtoolBarDetalleTipoAsistencia;
		}
		
		final JMenuBar jmenuBarDetalleTipoAsistencia=jmenuBarDetalleAuxiliarTipoAsistencia;
		final JToolBar jTtoolBarDetalleTipoAsistencia=jTtoolBarDetalleAuxiliarTipoAsistencia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAsistencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAsistencia;
			processRunnable.jTableDatos=jTableDatosTipoAsistencia;
			processRunnable.jPanelCampos=jPanelCamposTipoAsistencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAsistencia;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAsistencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAsistencia;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAsistencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAsistencia;
			processRunnable.jTtoolBar=jTtoolBarTipoAsistencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAsistencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAsistencia ,jPanelParametrosReportesTipoAsistencia,jTableDatosTipoAsistencia, /*jScrollPanelDatosTipoAsistencia,*/jPanelCamposTipoAsistencia,jPanelPaginacionTipoAsistencia, /*jScrollPanelDatosEdicionTipoAsistencia,*/ jPanelAccionesTipoAsistencia,jPanelAccionesFormularioTipoAsistencia,jmenuBarTipoAsistencia,jmenuBarDetalleTipoAsistencia,jTtoolBarTipoAsistencia,jTtoolBarDetalleTipoAsistencia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAsistencia ,jPanelParametrosReportesTipoAsistencia, jScrollPanelDatosTipoAsistencia,jPanelPaginacionTipoAsistencia, jScrollPanelDatosEdicionTipoAsistencia, jPanelAccionesTipoAsistencia,jPanelAccionesFormularioTipoAsistencia,jmenuBarTipoAsistencia,jmenuBarDetalleTipoAsistencia,jTtoolBarTipoAsistencia,jTtoolBarDetalleTipoAsistencia);
						
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
	
	public void finishProcessTipoAsistencia() {// throws Exception 
		this.finishProcessTipoAsistencia(true);
	}
	
	public void finishProcessTipoAsistencia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoAsistencia ,this.jPanelParametrosReportesTipoAsistencia, this.jScrollPanelDatosTipoAsistencia,this.jPanelPaginacionTipoAsistencia, this.jScrollPanelDatosEdicionTipoAsistencia, this.jPanelAccionesTipoAsistencia,this.jPanelAccionesFormularioTipoAsistencia,this.jmenuBarTipoAsistencia,this.jmenuBarDetalleTipoAsistencia,this.jTtoolBarTipoAsistencia,this.jTtoolBarDetalleTipoAsistencia);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAsistencia=this.jTabbedPaneBusquedasTipoAsistencia; 
		
		final JPanel jPanelParametrosReportesTipoAsistencia=this.jPanelParametrosReportesTipoAsistencia;
		//final JScrollPane jScrollPanelDatosTipoAsistencia=this.jScrollPanelDatosTipoAsistencia;
		final JTable jTableDatosTipoAsistencia=this.jTableDatosTipoAsistencia;		
		final JPanel jPanelPaginacionTipoAsistencia=this.jPanelPaginacionTipoAsistencia;
		//final JScrollPane jScrollPanelDatosEdicionTipoAsistencia=this.jScrollPanelDatosEdicionTipoAsistencia;
		final JPanel jPanelAccionesTipoAsistencia=this.jPanelAccionesTipoAsistencia;
		
		JPanel jPanelCamposAuxiliarTipoAsistencia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoAsistencia=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			jPanelCamposAuxiliarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jPanelCamposTipoAsistencia;
			jPanelAccionesFormularioAuxiliarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jPanelAccionesFormularioTipoAsistencia;
		}
		
		final JPanel jPanelCamposTipoAsistencia=jPanelCamposAuxiliarTipoAsistencia;
		final JPanel jPanelAccionesFormularioTipoAsistencia=jPanelAccionesFormularioAuxiliarTipoAsistencia;
		
		
		final JMenuBar jmenuBarTipoAsistencia=this.jmenuBarTipoAsistencia;		
		final JToolBar jTtoolBarTipoAsistencia=this.jTtoolBarTipoAsistencia;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoAsistencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAsistencia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			jmenuBarDetalleAuxiliarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jmenuBarDetalleTipoAsistencia;
			jTtoolBarDetalleAuxiliarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jTtoolBarDetalleTipoAsistencia;		
		}
		
		final JMenuBar jmenuBarDetalleTipoAsistencia=jmenuBarDetalleAuxiliarTipoAsistencia;
		final JToolBar jTtoolBarDetalleTipoAsistencia=jTtoolBarDetalleAuxiliarTipoAsistencia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAsistencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAsistencia;
			processRunnable.jTableDatos=jTableDatosTipoAsistencia;
			processRunnable.jPanelCampos=jPanelCamposTipoAsistencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAsistencia;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAsistencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAsistencia;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAsistencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAsistencia;
			processRunnable.jTtoolBar=jTtoolBarTipoAsistencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAsistencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoAsistencia ,jPanelParametrosReportesTipoAsistencia, jTableDatosTipoAsistencia,/*jScrollPanelDatosTipoAsistencia,*/jPanelCamposTipoAsistencia,jPanelPaginacionTipoAsistencia, /*jScrollPanelDatosEdicionTipoAsistencia,*/ jPanelAccionesTipoAsistencia,jPanelAccionesFormularioTipoAsistencia,jmenuBarTipoAsistencia,jmenuBarDetalleTipoAsistencia,jTtoolBarTipoAsistencia,jTtoolBarDetalleTipoAsistencia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoAsistencia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoAsistencia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoAsistencia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoAsistencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoAsistencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoAsistencia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoAsistencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoAsistencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoAsistencia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoasistenciaConstantesFunciones.getsFinalQueryTipoAsistencia();
		String  finalQueryPaginacionTodos=this.tipoasistenciaConstantesFunciones.getsFinalQueryTipoAsistencia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoAsistenciaConstantesFunciones.getArrayColumnasGlobalesNoTipoAsistencia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoAsistenciaConstantesFunciones.getArrayColumnasGlobalesTipoAsistencia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoAsistenciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoasistenciasEliminados= new ArrayList<TipoAsistencia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoAsistencia();
		
				///*TipoAsistenciaSessionBean*/this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
			
			if(this.tipoasistenciaSessionBean==null) {
				this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
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
					this.iNumeroPaginacion=TipoAsistenciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoAsistenciaConstantesFunciones.getClassesForeignKeysOfTipoAsistencia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoasistencia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoasistenciasAux= new ArrayList<TipoAsistencia>();
			
				
			tipoasistenciaLogic.setDatosCliente(this.datosCliente);
			tipoasistenciaLogic.setDatosDeep(this.datosDeep);
			tipoasistenciaLogic.setIsConDeep(true);
			
			
			tipoasistenciaLogic.getTipoAsistenciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoasistenciaLogic.getTodosTipoAsistencias(finalQueryGlobal,pagination);
					
					//tipoasistenciaLogic.getTodosTipoAsistenciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoasistenciaLogic.getTipoAsistencias()==null|| tipoasistenciaLogic.getTipoAsistencias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoasistenciasAux= new ArrayList<TipoAsistencia>();
							tipoasistenciasAux.addAll(tipoasistenciaLogic.getTipoAsistencias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoasistenciasAux= new ArrayList<TipoAsistencia>();
							tipoasistenciasAux.addAll(tipoasistencias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoasistenciaLogic.getTodosTipoAsistencias(finalQueryGlobal+"",this.pagination);												
							
							//tipoasistenciaLogic.getTodosTipoAsistenciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoAsistencias("Todos",tipoasistenciaLogic.getTipoAsistencias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoasistenciaLogic.setTipoAsistencias(new ArrayList<TipoAsistencia>());					
							tipoasistenciaLogic.getTipoAsistencias().addAll(tipoasistenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoasistencias=new ArrayList<TipoAsistencia>();
							tipoasistencias.addAll(tipoasistenciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoAsistencia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoAsistencia=this.idActual;
				
				} else if(this.idTipoAsistenciaActual!=null && this.idTipoAsistenciaActual!=0L) {
					idTipoAsistencia=idTipoAsistenciaActual;
				}
				
					
				this.sDetalleReporte=TipoAsistenciaConstantesFunciones.getDetalleIndicePorId(idTipoAsistencia);
				
				this.tipoasistencias=new ArrayList<TipoAsistencia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoasistenciaLogic.getEntity(idTipoAsistencia);
					
					//tipoasistenciaLogic.getEntityWithConnection(idTipoAsistencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoasistenciaLogic.setTipoAsistencias(new ArrayList<TipoAsistencia>());
					tipoasistenciaLogic.getTipoAsistencias().add(tipoasistenciaLogic.getTipoAsistencia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoasistencias=new ArrayList<TipoAsistencia>();
					this.tipoasistencias.add(tipoasistencia);
				}
				
				if(tipoasistenciaLogic.getTipoAsistencia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoasistenciaLogic.getTipoAsistenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoasistenciaLogic.getTipoAsistencias()==null||tipoasistenciaLogic.getTipoAsistencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoasistencias==null|| tipoasistencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoasistenciasAux=new ArrayList<TipoAsistencia>();
						tipoasistenciasAux.addAll(tipoasistenciaLogic.getTipoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoasistenciasAux=new ArrayList<TipoAsistencia>();
							tipoasistenciasAux.addAll(tipoasistencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoasistenciaLogic.getTipoAsistenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAsistenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoAsistencias("FK_IdEmpresa",tipoasistenciaLogic.getTipoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoAsistencias("FK_IdEmpresa",tipoasistencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoasistenciaLogic.setTipoAsistencias(new ArrayList<TipoAsistencia>());
						tipoasistenciaLogic.getTipoAsistencias().addAll(tipoasistenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoasistencias=new ArrayList<TipoAsistencia>();
							tipoasistencias.addAll(tipoasistenciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoAsistencia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoAsistencia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoasistenciaLogic.getTipoAsistencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoasistencias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoasistenciaLogic.getTipoAsistencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoasistencias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoAsistencia tipoasistencia) {
		Boolean permite=true;
		
		if(this.tipoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoAsistenciaConstantesFunciones.getOrderByListaTipoAsistencia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoAsistenciaConstantesFunciones.getOrderByListaTipoAsistencia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAsistencia tipoasistencia:tipoasistenciaLogic.getTipoAsistencias()) {
				if(tipoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
					tipoasistenciaTotales=tipoasistencia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAsistencia tipoasistencia:this.tipoasistencias) {
				if(tipoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
					tipoasistenciaTotales=tipoasistencia;
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
			this.tipoasistenciaAux=new TipoAsistencia();
			this.tipoasistenciaAux.setsType(Constantes2.S_TOTALES);
			this.tipoasistenciaAux.setIsNew(false);
			this.tipoasistenciaAux.setIsChanged(false);
			this.tipoasistenciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoAsistenciaConstantesFunciones.TotalizarValoresFilaTipoAsistencia(this.tipoasistenciaLogic.getTipoAsistencias(),this.tipoasistenciaAux);
				
				this.tipoasistenciaLogic.getTipoAsistencias().add(this.tipoasistenciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoAsistenciaConstantesFunciones.TotalizarValoresFilaTipoAsistencia(this.tipoasistencias,this.tipoasistenciaAux);
				
				this.tipoasistencias.add(this.tipoasistenciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoasistenciaTotales=new TipoAsistencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoasistenciaLogic.getTipoAsistencias().remove(tipoasistenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoasistencias.remove(tipoasistenciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoasistenciaTotales=new TipoAsistencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAsistencia tipoasistencia:tipoasistenciaLogic.getTipoAsistencias()) {
				if(tipoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
					tipoasistenciaTotales=tipoasistencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAsistenciaConstantesFunciones.TotalizarValoresFilaTipoAsistencia(this.tipoasistenciaLogic.getTipoAsistencias(),tipoasistenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAsistencia tipoasistencia:this.tipoasistencias) {
				if(tipoasistencia.getsType().equals(Constantes2.S_TOTALES)) {
					tipoasistenciaTotales=tipoasistencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAsistenciaConstantesFunciones.TotalizarValoresFilaTipoAsistencia(this.tipoasistencias,tipoasistenciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoAsistenciasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoAsistenciasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoasistenciaLogic.getTipoAsistenciasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoAsistencia() {
		this.isPermisoTodoTipoAsistencia=false;
		this.isPermisoNuevoTipoAsistencia=false;
		this.isPermisoActualizarTipoAsistencia=false;
		this.isPermisoActualizarOriginalTipoAsistencia=false;
		this.isPermisoEliminarTipoAsistencia=false;
		this.isPermisoGuardarCambiosTipoAsistencia=false;
		this.isPermisoConsultaTipoAsistencia=false;
		this.isPermisoBusquedaTipoAsistencia=false;
		this.isPermisoReporteTipoAsistencia=false;		
		this.isPermisoOrdenTipoAsistencia=false;		
		this.isPermisoPaginacionMedioTipoAsistencia=false;		
		this.isPermisoPaginacionAltoTipoAsistencia=false;
		this.isPermisoPaginacionTodoTipoAsistencia=false;
		this.isPermisoCopiarTipoAsistencia=false;		
		this.isPermisoVerFormTipoAsistencia=false;		
		this.isPermisoDuplicarTipoAsistencia=false;		
		this.isPermisoOrdenTipoAsistencia=false;		
	}
	
	public void setPermisosUsuarioTipoAsistencia(Boolean isPermiso) {
		this.isPermisoTodoTipoAsistencia=isPermiso;
		this.isPermisoNuevoTipoAsistencia=isPermiso;
		this.isPermisoActualizarTipoAsistencia=isPermiso;
		this.isPermisoActualizarOriginalTipoAsistencia=isPermiso;
		this.isPermisoEliminarTipoAsistencia=isPermiso;
		this.isPermisoGuardarCambiosTipoAsistencia=isPermiso;
		this.isPermisoConsultaTipoAsistencia=isPermiso;
		this.isPermisoBusquedaTipoAsistencia=isPermiso;
		this.isPermisoReporteTipoAsistencia=isPermiso;
		this.isPermisoOrdenTipoAsistencia=isPermiso;		
		this.isPermisoPaginacionMedioTipoAsistencia=isPermiso;		
		this.isPermisoPaginacionAltoTipoAsistencia=isPermiso;		
		this.isPermisoPaginacionTodoTipoAsistencia=isPermiso;		
		this.isPermisoCopiarTipoAsistencia=isPermiso;		
		this.isPermisoVerFormTipoAsistencia=isPermiso;		
		this.isPermisoDuplicarTipoAsistencia=isPermiso;
		this.isPermisoOrdenTipoAsistencia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoAsistencia(Boolean isPermiso) {
		//this.isPermisoTodoTipoAsistencia=isPermiso;
		this.isPermisoNuevoTipoAsistencia=isPermiso;
		this.isPermisoActualizarTipoAsistencia=isPermiso;
		this.isPermisoActualizarOriginalTipoAsistencia=isPermiso;
		this.isPermisoEliminarTipoAsistencia=isPermiso;
		this.isPermisoGuardarCambiosTipoAsistencia=isPermiso;
		//this.isPermisoConsultaTipoAsistencia=isPermiso;
		//this.isPermisoBusquedaTipoAsistencia=isPermiso;
		//this.isPermisoReporteTipoAsistencia=isPermiso;
		//this.isPermisoOrdenTipoAsistencia=isPermiso;		
		//this.isPermisoPaginacionMedioTipoAsistencia=isPermiso;		
		//this.isPermisoPaginacionAltoTipoAsistencia=isPermiso;		
		//this.isPermisoPaginacionTodoTipoAsistencia=isPermiso;		
		//this.isPermisoCopiarTipoAsistencia=isPermiso;		
		//this.isPermisoDuplicarTipoAsistencia=isPermiso;
		//this.isPermisoOrdenTipoAsistencia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoAsistenciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoAsistencia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoAsistenciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoAsistenciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoAsistenciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoAsistenciaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoAsistencia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoAsistenciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoAsistencia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoAsistencia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoAsistencia=this.isPermisoActualizarTipoAsistencia;
			this.isPermisoEliminarTipoAsistencia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoAsistencia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoAsistencia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoAsistencia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoAsistencia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoAsistencia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAsistencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoAsistencia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoAsistencia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoAsistencia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoAsistencia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoAsistencia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoAsistencia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAsistencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoAsistencia.setToolTipText(this.jTableDatosTipoAsistencia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoAsistencia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoAsistencia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoAsistencia() throws Exception {
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
	public void inicializarCombosForeignKeyTipoAsistenciaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoAsistenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoAsistenciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoAsistenciaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoAsistenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoAsistenciaParameterReturnGeneral tipoasistenciaReturnGeneral=new TipoAsistenciaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoasistenciaConstantesFunciones.cargarid_empresaTipoAsistencia)
					 || (this.esRecargarFks && this.tipoasistenciaConstantesFunciones.cargarid_empresaTipoAsistencia)) {

					if(!this.tipoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoasistenciaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoasistenciaReturnGeneral=tipoasistenciaLogic.cargarCombosLoteForeignKeyTipoAsistencia(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoasistenciaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoAsistencia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoasistenciaSessionBean==null) {
				this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
			}

			if(!this.tipoasistenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoAsistencia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoAsistencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoAsistencia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAsistencia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoAsistencia(TipoAsistencia tipoasistencia)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoAsistencia(TipoAsistencia tipoasistencia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoAsistencia()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAsistencia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoAsistencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoAsistencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoAsistencia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoAsistencia()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoAsistencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoAsistencia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia!=null && this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoAsistenciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoAsistenciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoAsistenciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean(); 
		this.tipoasistenciaConstantesFunciones=new TipoAsistenciaConstantesFunciones(); 
		this.tipoasistenciaBean=new TipoAsistencia();//(this.tipoasistenciaConstantesFunciones); 		
		this.tipoasistenciaReturnGeneral=new TipoAsistenciaParameterReturnGeneral(); 
		
		this.tipoasistenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoasistenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoAsistenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoAsistenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoAsistenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoAsistencia(true);
			
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
			
			this.tipoasistenciaConstantesFunciones=new TipoAsistenciaConstantesFunciones(); 
			this.tipoasistenciaBean=new TipoAsistencia();//this.tipoasistenciaConstantesFunciones); 			
			this.tipoasistenciaReturnGeneral=new TipoAsistenciaParameterReturnGeneral(); 
		
			TipoAsistenciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Asistencia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoasistencia=new TipoAsistencia();
			this.tipoasistencias = new ArrayList<TipoAsistencia>();
			this.tipoasistenciasAux = new ArrayList<TipoAsistencia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic=new TipoAsistenciaLogic();
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoasistenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoasistenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoAsistencia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAsistencia);	
					}
					
					if(this.jInternalFrameImportacionTipoAsistencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAsistencia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoAsistencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoAsistencia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAsistencia);
				this.jInternalFrameDetalleFormTipoAsistencia.setVisible(false);
				this.jInternalFrameDetalleFormTipoAsistencia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAsistencia);
					this.jInternalFrameReporteDinamicoTipoAsistencia.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoAsistencia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoAsistencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoAsistencia);
					this.jInternalFrameImportacionTipoAsistencia.setVisible(false);
					this.jInternalFrameImportacionTipoAsistencia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoAsistencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoAsistencia);
					this.jInternalFrameOrderByTipoAsistencia.setVisible(false);
					this.jInternalFrameOrderByTipoAsistencia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoAsistenciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoAsistenciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoasistenciaReturnGeneral=new TipoAsistenciaParameterReturnGeneral();
			
			this.tipoasistenciaParameterGeneral=new TipoAsistenciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoasistenciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoAsistenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAsistenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoasistenciaSessionBean.getEsGuardarRelacionado(),this.tipoasistenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAsistenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoasistenciaSessionBean.getEsGuardarRelacionado(),this.tipoasistenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoAsistencia=false;
			this.isVisibilidadCeldaDuplicarTipoAsistencia=true;
			this.isVisibilidadCeldaCopiarTipoAsistencia=true;
			this.isVisibilidadCeldaVerFormTipoAsistencia=true;
			this.isVisibilidadCeldaOrdenTipoAsistencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
			this.isVisibilidadCeldaModificarTipoAsistencia=false;
			this.isVisibilidadCeldaActualizarTipoAsistencia=false;
			this.isVisibilidadCeldaEliminarTipoAsistencia=false;
			this.isVisibilidadCeldaCancelarTipoAsistencia=false;
			this.isVisibilidadCeldaGuardarTipoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoAsistencia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoAsistencia(false);
			
			this.setPermisosUsuarioTipoAsistencia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoasistenciaSessionBean.getEsGuardarRelacionado() && this.tipoasistenciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoAsistenciaClasesRelacionadas();
			}
			
			if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoAsistenciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoAsistencia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoAsistencia();
			}
			
			if(!this.isPermisoBusquedaTipoAsistencia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoAsistencia,this.isPermisoPaginacionMedioTipoAsistencia,this.isPermisoPaginacionTodoTipoAsistencia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoAsistenciaConstantesFunciones.getTiposSeleccionarTipoAsistencia());
				
				this.tiposColumnasSelect=TipoAsistenciaConstantesFunciones.getTiposSeleccionarTipoAsistencia(true);
				
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
			//if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoAsistencia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoAsistencia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoAsistencia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAsistencia() ;
			
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
				tipoasistenciaImplementable= (TipoAsistenciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAsistenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoasistenciaImplementableHome= (TipoAsistenciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAsistenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoasistencias= new ArrayList<TipoAsistencia>();
			this.tipoasistenciasEliminados= new ArrayList<TipoAsistencia>();
						
			this.isEsNuevoTipoAsistencia=false;
			this.esParaAccionDesdeFormularioTipoAsistencia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoAsistencia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoAsistencia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoAsistenciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoAsistenciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoAsistencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoAsistencia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoAsistencia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoAsistencia();
			}
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoAsistencia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoAsistencia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoAsistencia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoAsistencia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoAsistencia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoAsistencia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoAsistencia")) {
				iIndex=this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoAsistencia();	
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
	
	public void cargarCombosForeignKeyTipoAsistencia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoAsistencia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoAsistencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoAsistenciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoAsistencia();
		
		this.cargarCombosFrameForeignKeyTipoAsistencia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoAsistencia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoAsistencia();
		}
	}
	
	
	
	public void jButtonNuevoTipoAsistenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
			
			if(jTableDatosTipoAsistencia.getRowCount()>=1) {
				jTableDatosTipoAsistencia.removeRowSelectionInterval(0, jTableDatosTipoAsistencia.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoAsistencia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoAsistencia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoAsistencia(true);			
			//this.tipoasistencia=new TipoAsistencia();
			//this.tipoasistencia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAsistencia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAsistencia() ;
			
			if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAsistencia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoasistencia);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);				
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
			if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoAsistencia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoAsistenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoAsistencia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoAsistencia.getSelectedRows().length;			
			}
			
			tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoAsistencia--;			
				//TipoAsistencia tipoasistenciaAux= new TipoAsistencia();			
				//tipoasistenciaAux.setId(this.iIdNuevoTipoAsistencia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoAsistencia tipoasistenciaOrigen=new TipoAsistencia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoAsistencia tipoasistenciaOrigen : tipoasistenciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoasistenciaOrigen =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoasistenciaOrigen =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoAsistencia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoasistencia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoAsistencia(tipoasistenciaOrigen,this.tipoasistencia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoasistenciaLogic.getTipoAsistencias().add(this.tipoasistenciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoasistencias.add(this.tipoasistenciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoAsistencia(false);
				
				this.jTableDatosTipoAsistencia.setRowSelectionInterval(this.getIndiceNuevoTipoAsistencia(), this.getIndiceNuevoTipoAsistencia());
				
				int iLastRow =  this.jTableDatosTipoAsistencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAsistencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAsistencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAsistencia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();									
		
			TipoAsistencia tipoasistenciaOrigen=new TipoAsistencia();
			TipoAsistencia tipoasistenciaDestino=new TipoAsistencia();
				
			tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoAsistencia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoasistenciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoAsistencia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoasistenciaOrigen =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoasistenciaOrigen =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoasistenciaDestino =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoasistenciaDestino =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoasistenciaOrigen =tipoasistenciasSeleccionados.get(0);
				tipoasistenciaDestino =tipoasistenciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoAsistencia(tipoasistenciaOrigen,tipoasistenciaDestino,true,false);
				
				tipoasistenciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoasistenciaDestino,tipoasistenciaLogic.getTipoAsistencias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoasistenciaDestino,tipoasistencias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoAsistencia(false);
				
				//this.jTableDatosTipoAsistencia.setRowSelectionInterval(this.getIndiceNuevoTipoAsistencia(), this.getIndiceNuevoTipoAsistencia());
				
				int iLastRow =  this.jTableDatosTipoAsistencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAsistencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAsistencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAsistencia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoAsistencia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoAsistencia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoAsistencia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoAsistencia.setVisible(!isVisible);
			this.jPanelPaginacionTipoAsistencia.setVisible(!isVisible);
			this.jPanelAccionesTipoAsistencia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoAsistencia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoAsistencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoAsistencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoAsistencia();
			
			this.abrirFrameOrderByTipoAsistencia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoAsistencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoAsistencia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAsistencia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoAsistencia.isMaximum()) {
					this.jInternalFrameDetalleFormTipoAsistencia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoAsistencia.setSize(this.jInternalFrameDetalleFormTipoAsistencia.iWidthFormulario,this.jInternalFrameDetalleFormTipoAsistencia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoAsistencia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoAsistencia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoAsistencia.isMaximum()) {
						this.jInternalFrameDetalleFormTipoAsistencia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoAsistencia.jContentPaneDetalleTipoAsistencia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoAsistencia.jContentPaneDetalleTipoAsistencia.getWidth(),TipoAsistenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoAsistencia.jContentPaneDetalleTipoAsistencia.getWidth(),TipoAsistenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoAsistencia.jContentPaneDetalleTipoAsistencia.getWidth(),TipoAsistenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoAsistencia.setVisible(true);
	        this.jInternalFrameDetalleFormTipoAsistencia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoAsistencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoAsistencia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoAsistencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAsistencia,false,this);
				} else {
					this.jInternalFrameOrderByTipoAsistencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAsistencia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoAsistencia);
				this.jInternalFrameOrderByTipoAsistencia.setVisible(false);
				this.jInternalFrameOrderByTipoAsistencia.setSelected(false);
				
				this.jInternalFrameOrderByTipoAsistencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAsistencia"));
				
				this.inicializarActualizarBindingTablaOrderByTipoAsistencia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoAsistencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoAsistencia==null) {
				
				this.jInternalFrameImportacionTipoAsistencia=new ImportacionJInternalFrame(TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAsistencia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoAsistencia);
				this.jInternalFrameImportacionTipoAsistencia.setVisible(false);
				this.jInternalFrameImportacionTipoAsistencia.setSelected(false);


				this.jInternalFrameImportacionTipoAsistencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAsistencia"));
				this.jInternalFrameImportacionTipoAsistencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAsistencia"));
				this.jInternalFrameImportacionTipoAsistencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAsistencia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoAsistencia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoAsistencia==null) {
				this.jInternalFrameReporteDinamicoTipoAsistencia=new ReporteDinamicoJInternalFrame(TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAsistencia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAsistencia);
				this.jInternalFrameReporteDinamicoTipoAsistencia.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoAsistencia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoAsistencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAsistencia"));
				this.jInternalFrameReporteDinamicoTipoAsistencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAsistencia"));
				this.jInternalFrameReporteDinamicoTipoAsistencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAsistencia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAsistencia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoAsistencia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAsistencia);
			
	       	this.jInternalFrameDetalleFormTipoAsistencia.setVisible(false);
	        this.jInternalFrameDetalleFormTipoAsistencia.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoAsistencia.dispose();
			//this.jInternalFrameDetalleFormTipoAsistencia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoAsistencia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoAsistencia.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoAsistencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoAsistencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoAsistencia.setVisible(true);
	        this.jInternalFrameImportacionTipoAsistencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoAsistencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoAsistencia.setVisible(true);
	        this.jInternalFrameOrderByTipoAsistencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoAsistencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoAsistencia.setVisible(false);
	        this.jInternalFrameOrderByTipoAsistencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoAsistencia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoAsistencia.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoAsistencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoAsistencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoAsistencia.setVisible(false);
	        this.jInternalFrameImportacionTipoAsistencia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoAsistencia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoAsistencia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoAsistencia(true);
			//this.isEsNuevoTipoAsistencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoAsistencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAsistencia(false) ;
			
			if(tipoasistenciaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAsistencia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAsistencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoAsistenciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoAsistencia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoAsistencia(true);
			//this.isEsNuevoTipoAsistencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoasistencia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoAsistencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoAsistencia(false) ;
			
			if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAsistencia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAsistencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoAsistencia(false);
			
			//if(!this.isEsNuevoTipoAsistencia) {								
				int intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoAsistencia(this.tipoasistencia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
				
			}
			
			if(this.permiteMantenimiento(this.tipoasistencia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoAsistencia=true;
					this.inicializarActualizarBindingTablaTipoAsistencia(false);
					this.isEsNuevoTipoAsistencia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoAsistencia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoAsistencia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAsistencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAsistencia(false);
				
				this.habilitarDeshabilitarControlesTipoAsistencia(false);
			
												
				
				if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoAsistencia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoAsistenciaActionPerformed(evt,tipoasistenciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoAsistencia(this.tipoasistencia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoAsistencia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoasistenciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoasistencia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				this.tipoasistencia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				this.tipoasistencia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoasistencia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoAsistenciaModel) this.jTableDatosTipoAsistencia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoAsistencia=true;
				this.inicializarActualizarBindingTablaTipoAsistencia(false);
				this.isEsNuevoTipoAsistencia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAsistencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAsistencia(false);
				
				this.habilitarDeshabilitarControlesTipoAsistencia(false);
				
				
				
				if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoAsistencia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoAsistencia.getRowCount()>=1) {
				jTableDatosTipoAsistencia.removeRowSelectionInterval(0, jTableDatosTipoAsistencia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoAsistencia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoAsistencia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAsistencia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAsistencia(false) ;
			
			this.isEsNuevoTipoAsistencia=false;
			
			if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoAsistencia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoAsistencia(false);
				
				//SI ES MANUAL
				if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoAsistencia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoAsistencia--;			
			//TipoAsistencia tipoasistenciaAux= new TipoAsistencia();			
			//tipoasistenciaAux.setId(this.iIdNuevoTipoAsistencia);
			
			if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoAsistencia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
			
			this.tipoasistencia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoasistenciaLogic.getTipoAsistencias().add(this.tipoasistenciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoasistencias.add(this.tipoasistenciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoAsistencia(false);
			
			this.jTableDatosTipoAsistencia.setRowSelectionInterval(this.getIndiceNuevoTipoAsistencia(), this.getIndiceNuevoTipoAsistencia());
			
			int iLastRow =  this.jTableDatosTipoAsistencia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoAsistencia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoAsistencia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoAsistencia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoAsistencia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAsistencia(false);
			
			//SI ES MANUAL
			if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAsistencia();
			}
			
			//this.abrirFrameTreeTipoAsistencia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo AsistenciaS ?", "MANTENIMIENTO DE Tipo Asistencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoAsistencia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoAsistencia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoasistenciaReturnGeneral=tipoasistenciaLogic.procesarImportacionTipoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoasistenciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoAsistenciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoAsistencia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoAsistencia.setFileImportacion(this.jInternalFrameImportacionTipoAsistencia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoAsistencia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoAsistencia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoAsistencia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoAsistencia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		

		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoAsistenciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoAsistenciaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoAsistencias("Todos",tipoasistenciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAsistenciaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoAsistencia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoAsistenciaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoAsistenciaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoAsistenciaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoasistencia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoAsistencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoAsistencia tipoasistencia:tipoasistenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoasistencia.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAsistenciaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAsistenciaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoAsistencia tipoasistencia:tipoasistenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoasistencia.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoAsistencia(row);				
			//	iRow++;
			//}				
			
			//for(TipoAsistencia tipoasistenciaAux:tipoasistenciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoAsistencia(tipoasistenciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAsistencia(false);
			
			//SI ES MANUAL
			if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAsistencia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAsistencia(false);
			
			//SI ES MANUAL
			if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAsistencia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAsistencia(false);
			
			//SI ES MANUAL
			if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAsistencia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoAsistencia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoAsistencia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoAsistencia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoAsistencia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoAsistencia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoAsistencia.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoAsistencia.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoAsistencia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoAsistencia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoAsistencia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoAsistencia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoAsistencia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoAsistencia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoAsistencia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAsistencia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoAsistencia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoAsistencia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoAsistencia();
		
		this.inicializarActualizarBindingBotonesManualTipoAsistencia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAsistencia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAsistencia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAsistencia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAsistencia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoAsistencia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoAsistencia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoAsistencia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoAsistencia.jCheckBoxPostAccionNuevoTipoAsistencia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoAsistencia.jCheckBoxPostAccionSinCerrarTipoAsistencia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoAsistencia.jCheckBoxPostAccionSinMensajeTipoAsistencia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoAsistencia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoAsistencia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoAsistencia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
				this.jInternalFrameDetalleFormTipoAsistencia.jCheckBoxPostAccionNuevoTipoAsistencia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoAsistencia.jCheckBoxPostAccionSinCerrarTipoAsistencia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoAsistencia.jCheckBoxPostAccionSinMensajeTipoAsistencia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoAsistencia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoAsistencia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoAsistencia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoAsistencia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoAsistencia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoAsistencia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoAsistencia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoAsistencia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoAsistencia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoAsistencia(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAsistencia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoAsistencia() throws Exception {
		try	{
			if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAsistencia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAsistencia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAsistencia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoAsistencia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoAsistencia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoAsistencia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoAsistencia.addItem(reporte);
			}
			
			
			if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoAsistencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoAsistencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoAsistencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoAsistencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoAsistencia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoAsistencia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoAsistencia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAsistencia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAsistencia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
				this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
				this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAsistencia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAsistencia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoAsistencia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAsistencia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAsistencia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoAsistencia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoAsistencia(Boolean esInicializar) throws Exception {				
		if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAsistencia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoAsistencia() throws Exception {
		this.inicializarActualizarBindingTablaTipoAsistencia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoAsistencia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoAsistenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoAsistenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoAsistenciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAsistenciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoAsistenciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoAsistenciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoAsistencia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoasistenciaLogic.getTipoAsistencias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoasistencias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoAsistencia.setModel(new TipoAsistenciaModel(this.tipoasistenciaLogic.getTipoAsistencias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoAsistencia.setModel(new TipoAsistenciaModel(this.tipoasistencias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoAsistencia!=null && this.jInternalFrameOrderByTipoAsistencia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoAsistencia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAsistencia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoAsistenciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO,tipoasistenciaConstantesFunciones.resaltarSeleccionarTipoAsistencia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO,tipoasistenciaConstantesFunciones.resaltarSeleccionarTipoAsistencia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAsistencia,TipoAsistenciaConstantesFunciones.LABEL_ID));

		if(this.tipoasistenciaConstantesFunciones.mostraridTipoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAsistenciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoasistenciaConstantesFunciones.resaltaridTipoAsistencia,this.tipoasistenciaConstantesFunciones.activaridTipoAsistencia,this,true,"idTipoAsistencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoasistenciaConstantesFunciones.resaltaridTipoAsistencia,this.tipoasistenciaConstantesFunciones.activaridTipoAsistencia,this,true,"idTipoAsistencia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAsistencia,TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoasistenciaConstantesFunciones.mostrarid_empresaTipoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoasistenciaConstantesFunciones.resaltarid_empresaTipoAsistencia,this,this.tipoasistenciaConstantesFunciones.activarid_empresaTipoAsistencia));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoasistenciaConstantesFunciones.resaltarid_empresaTipoAsistencia,this,this.tipoasistenciaConstantesFunciones.activarid_empresaTipoAsistencia,false,"id_empresaTipoAsistencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAsistenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAsistencia,TipoAsistenciaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoasistenciaConstantesFunciones.mostrarnombreTipoAsistencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAsistenciaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoasistenciaConstantesFunciones.resaltarnombreTipoAsistencia,this.tipoasistenciaConstantesFunciones.activarnombreTipoAsistencia,this,true,"nombreTipoAsistencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoasistenciaConstantesFunciones.resaltarnombreTipoAsistencia,this.tipoasistenciaConstantesFunciones.activarnombreTipoAsistencia,this,true,"nombreTipoAsistencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAsistenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoasistenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoasistenciaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAsistencia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoasistenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoasistenciaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAsistencia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoasistenciaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoasistenciaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoAsistencia.addColumn(tableColumn);
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
			
			this.jTableDatosTipoAsistencia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoAsistencia.moveColumn(this.jTableDatosTipoAsistencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoAsistencia.moveColumn(this.jTableDatosTipoAsistencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoAsistencia.moveColumn(this.jTableDatosTipoAsistencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoAsistencia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoAsistencia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoAsistencia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoAsistencia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoAsistencia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoAsistencia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoAsistencia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoAsistencia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoasistenciaLogic.getTipoAsistencias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoasistencias.size()-1;
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
		//this.jTableDatosTipoAsistencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoAsistencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoAsistencia();
			
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
				
				//this.isEsNuevoTipoAsistencia=false;
					
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
				if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoAsistencia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAsistencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAsistencia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoasistencia.getsType().equals("DUPLICADO")
				   || this.tipoasistencia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoAsistencia=true;
				
				} else {
					this.isEsNuevoTipoAsistencia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoasistencia.getId()>=0 && !this.tipoasistencia.getIsNew()) {						
						this.isEsNuevoTipoAsistencia=false;
						
					} else {
						this.isEsNuevoTipoAsistencia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoAsistencia(esRelaciones);						
				
				this.seleccionarTipoAsistencia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoasistencia.getId()<0) {
					this.isEsNuevoTipoAsistencia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoAsistencia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoAsistencia(evt,rowIndex);
				}	
				
				if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoAsistencia: " + this.dDif); 
					}
				}								
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoAsistencia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoasistencia)) {
					if(this.tipoasistencia.getId()>0) {
						this.tipoasistencia.setIsDeleted(true);
						
						this.tipoasistenciasEliminados.add(this.tipoasistencia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoasistenciaLogic.getTipoAsistencias().remove(this.tipoasistencia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoasistencias.remove(this.tipoasistencia);				
					}
					
					
					((TipoAsistenciaModel) this.jTableDatosTipoAsistencia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAsistencia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoAsistencia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoAsistencia) {
			
			if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAsistencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAsistencia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoAsistencia(this.tipoasistencia);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoasistenciaConstantesFunciones.cargarid_empresaTipoAsistencia || this.tipoasistenciaConstantesFunciones.event_dependid_empresaTipoAsistencia) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoasistencia.getid_empresa());
									//this.inicializarActualizarBindingTipoAsistencia(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoasistencia.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoasistencia.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoasistencia.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoAsistencia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoAsistencia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAsistencia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAsistencia(TipoAsistencia tipoasistencia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoAsistencia(tipoasistencia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAsistencia(TipoAsistencia tipoasistencia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoAsistencia(tipoasistencia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoAsistencia(tipoasistencia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoAsistencia(tipoasistencia);
	}
	
	public void setVariablesObjetoActualToFormularioTipoAsistencia(TipoAsistencia tipoasistencia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.setText(tipoasistencia.getId().toString());
			this.jInternalFrameDetalleFormTipoAsistencia.jTextFieldnombreTipoAsistencia.setText(tipoasistencia.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoAsistencia tipoasistenciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoasistenciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoAsistencia tipoasistenciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoasistenciaLocal=this.tipoasistencia;
			} else {
				tipoasistenciaLocal=this.tipoasistenciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoasistenciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoAsistencia(tipoasistenciaLocal,true);
					
					if(tipoasistenciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoasistenciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoasistenciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoAsistencia(TipoAsistencia tipoasistencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAsistencia(tipoasistencia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(tipoasistencia);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAsistencia(TipoAsistencia tipoasistencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAsistencia(tipoasistencia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAsistencia(TipoAsistencia tipoasistencia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.getText()==null || this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.getText()=="" || this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.setText("0");
			}

			if(conColumnasBase) {tipoasistencia.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAsistenciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAsistencia.jLabelIdTipoAsistencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoasistencia.setnombre(this.jInternalFrameDetalleFormTipoAsistencia.jTextFieldnombreTipoAsistencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAsistenciaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAsistencia.jLabelnombreTipoAsistencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAsistencia(TipoAsistencia tipoasistenciaBean,TipoAsistencia tipoasistencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoAsistencia(TipoAsistencia tipoasistenciaOrigen,TipoAsistencia tipoasistencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoasistenciaOrigen.getId()!=null && !tipoasistenciaOrigen.getId().equals(0L))) {tipoasistencia.setId(tipoasistenciaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoasistenciaOrigen.getnombre()!=null && !tipoasistenciaOrigen.getnombre().equals(""))) {tipoasistencia.setnombre(tipoasistenciaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAsistencia(TipoAsistencia tipoasistencia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.setText(tipoasistencia.getId().toString());
			this.jInternalFrameDetalleFormTipoAsistencia.jTextFieldnombreTipoAsistencia.setText(tipoasistencia.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAsistencia(TipoAsistenciaBean tipoasistenciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.setText(tipoasistenciaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoAsistencia.jTextFieldnombreTipoAsistencia.setText(tipoasistenciaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoAsistencia(TipoAsistenciaParameterReturnGeneral tipoasistenciaReturnGeneral,TipoAsistenciaBean tipoasistenciaBean,Boolean conDefault) throws Exception { 
		try {
			TipoAsistencia tipoasistenciaLocal=new TipoAsistencia();
			
			tipoasistenciaLocal=tipoasistenciaReturnGeneral.getTipoAsistencia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoasistenciaLocal.getId()!=null && !tipoasistenciaLocal.getId().equals(0L))) {tipoasistenciaBean.setId(tipoasistenciaLocal.getId());}}
			if(conDefault || (!conDefault && tipoasistenciaLocal.getnombre()!=null && !tipoasistenciaLocal.getnombre().equals(""))) {tipoasistenciaBean.setnombre(tipoasistenciaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoAsistenciaGenerico(Long idTipoAsistenciaSeleccionado,JComboBox jComboBoxTipoAsistencia,List<TipoAsistencia> tipoasistenciasLocal)throws Exception {
		try {
			TipoAsistencia  tipoasistenciaTemp=null;

			for(TipoAsistencia tipoasistenciaAux:tipoasistenciasLocal) {
				if(tipoasistenciaAux.getId()!=null && tipoasistenciaAux.getId().equals(idTipoAsistenciaSeleccionado)) {
					tipoasistenciaTemp=tipoasistenciaAux;
					break;
				}
			}

			jComboBoxTipoAsistencia.setSelectedItem(tipoasistenciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoAsistenciaGenerico(JComboBox jComboBoxTipoAsistencia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAsistencia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoAsistencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAsistencia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoAsistencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoasistencia=(TipoAsistencia) tipoasistenciaLogic.getTipoAsistencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoasistencia =(TipoAsistencia) tipoasistencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoasistencia.getIsNew() && !tipoasistencia.getIsChanged() && !tipoasistencia.getIsDeleted()) {
				sDescripcion=tipoasistencia.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoasistencia.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoAsistencia tipoasistenciaRow=new TipoAsistencia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoasistenciaRow=(TipoAsistencia) tipoasistenciaLogic.getTipoAsistencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoasistenciaRow=(TipoAsistencia) tipoasistencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoAsistencia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoTipoAsistencia && this.isPermisoNuevoTipoAsistencia));			
			this.jButtonDuplicarTipoAsistencia.setVisible((this.isVisibilidadCeldaDuplicarTipoAsistencia && this.isPermisoDuplicarTipoAsistencia));			
			this.jButtonCopiarTipoAsistencia.setVisible((this.isVisibilidadCeldaCopiarTipoAsistencia && this.isPermisoCopiarTipoAsistencia));
			this.jButtonVerFormTipoAsistencia.setVisible((this.isVisibilidadCeldaVerFormTipoAsistencia && this.isPermisoVerFormTipoAsistencia));
			
			this.jButtonAbrirOrderByTipoAsistencia.setVisible((this.isVisibilidadCeldaOrdenTipoAsistencia && this.isPermisoOrdenTipoAsistencia));			
			
			this.jButtonNuevoRelacionesTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia && this.isPermisoNuevoTipoAsistencia));			
			this.jButtonNuevoGuardarCambiosTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoTipoAsistencia && this.isPermisoNuevoTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));
			
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarTipoAsistencia.setVisible((this.isVisibilidadCeldaModificarTipoAsistencia && this.isPermisoActualizarTipoAsistencia));	
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarTipoAsistencia.setVisible((this.isVisibilidadCeldaActualizarTipoAsistencia && this.isPermisoActualizarTipoAsistencia));	
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarTipoAsistencia.setVisible((this.isVisibilidadCeldaEliminarTipoAsistencia && this.isPermisoEliminarTipoAsistencia));
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarTipoAsistencia.setVisible(this.isVisibilidadCeldaCancelarTipoAsistencia);							
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosTipoAsistencia.setVisible((this.isVisibilidadCeldaGuardarTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoAsistencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoTipoAsistencia && this.isPermisoNuevoTipoAsistencia));						
			this.jButtonDuplicarToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaDuplicarTipoAsistencia && this.isPermisoDuplicarTipoAsistencia));						
			this.jButtonCopiarToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaCopiarTipoAsistencia && this.isPermisoCopiarTipoAsistencia));			
			this.jButtonVerFormToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaVerFormTipoAsistencia && this.isPermisoVerFormTipoAsistencia));			
			this.jButtonAbrirOrderByToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaOrdenTipoAsistencia && this.isPermisoOrdenTipoAsistencia));
			this.jButtonNuevoRelacionesToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia && this.isPermisoNuevoTipoAsistencia));			
			this.jButtonNuevoGuardarCambiosToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoTipoAsistencia && this.isPermisoNuevoTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));			
			
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaModificarTipoAsistencia && this.isPermisoActualizarTipoAsistencia));	
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaActualizarTipoAsistencia  && this.isPermisoActualizarTipoAsistencia));	
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaEliminarTipoAsistencia && this.isPermisoEliminarTipoAsistencia));
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarToolBarTipoAsistencia.setVisible(this.isVisibilidadCeldaCancelarTipoAsistencia);				
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaGuardarTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoAsistencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoTipoAsistencia && this.isPermisoNuevoTipoAsistencia));			
			this.jMenuItemDuplicarTipoAsistencia.setVisible((this.isVisibilidadCeldaDuplicarTipoAsistencia && this.isPermisoDuplicarTipoAsistencia));			
			this.jMenuItemCopiarTipoAsistencia.setVisible((this.isVisibilidadCeldaCopiarTipoAsistencia && this.isPermisoCopiarTipoAsistencia));			
			this.jMenuItemVerFormTipoAsistencia.setVisible((this.isVisibilidadCeldaVerFormTipoAsistencia && this.isPermisoVerFormTipoAsistencia));			
			this.jMenuItemAbrirOrderByTipoAsistencia.setVisible((this.isVisibilidadCeldaOrdenTipoAsistencia && this.isPermisoOrdenTipoAsistencia));			
			//this.jMenuItemMostrarOcultarTipoAsistencia.setVisible((this.isVisibilidadCeldaOrdenTipoAsistencia && this.isPermisoOrdenTipoAsistencia));
			this.jMenuItemDetalleAbrirOrderByTipoAsistencia.setVisible((this.isVisibilidadCeldaOrdenTipoAsistencia && this.isPermisoOrdenTipoAsistencia));			
			//this.jMenuItemDetalleMostrarOcultarTipoAsistencia.setVisible((this.isVisibilidadCeldaOrdenTipoAsistencia && this.isPermisoOrdenTipoAsistencia));			
			this.jMenuItemNuevoRelacionesTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia && this.isPermisoNuevoTipoAsistencia));			
			this.jMenuItemNuevoGuardarCambiosTipoAsistencia.setVisible((this.isVisibilidadCeldaNuevoTipoAsistencia && this.isPermisoNuevoTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));									
			
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemModificarTipoAsistencia.setVisible((this.isVisibilidadCeldaModificarTipoAsistencia && this.isPermisoActualizarTipoAsistencia));	
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemActualizarTipoAsistencia.setVisible((this.isVisibilidadCeldaActualizarTipoAsistencia && this.isPermisoActualizarTipoAsistencia));	
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemEliminarTipoAsistencia.setVisible((this.isVisibilidadCeldaEliminarTipoAsistencia && this.isPermisoEliminarTipoAsistencia));
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemCancelarTipoAsistencia.setVisible(this.isVisibilidadCeldaCancelarTipoAsistencia);				
			}
			
			this.jMenuItemGuardarCambiosTipoAsistencia.setVisible((this.isVisibilidadCeldaGuardarTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));						
			this.jMenuItemGuardarCambiosTablaTipoAsistencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoAsistencia=this.jButtonNuevoTipoAsistencia.isVisible();
			this.isVisibilidadCeldaDuplicarTipoAsistencia=this.jButtonDuplicarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaCopiarTipoAsistencia=this.jButtonCopiarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaVerFormTipoAsistencia=this.jButtonVerFormTipoAsistencia.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoAsistencia=this.jButtonAbrirOrderByTipoAsistencia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=this.jButtonNuevoRelacionesTipoAsistencia.isVisible();
			this.isVisibilidadCeldaModificarTipoAsistencia=this.jButtonModificarTipoAsistencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			this.isVisibilidadCeldaActualizarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaEliminarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaCancelarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaGuardarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosTipoAsistencia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=this.jButtonGuardarCambiosTablaTipoAsistencia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoAsistencia=this.jButtonNuevoToolBarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=this.jButtonNuevoRelacionesToolBarTipoAsistencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			this.isVisibilidadCeldaModificarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarToolBarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaActualizarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarToolBarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaEliminarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarToolBarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaCancelarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarToolBarTipoAsistencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAsistencia=this.jButtonGuardarCambiosToolBarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=this.jButtonGuardarCambiosTablaToolBarTipoAsistencia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoAsistencia=this.jMenuItemNuevoTipoAsistencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=this.jMenuItemNuevoRelacionesTipoAsistencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			this.isVisibilidadCeldaModificarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemModificarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaActualizarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemActualizarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaEliminarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemEliminarTipoAsistencia.isVisible();
			this.isVisibilidadCeldaCancelarTipoAsistencia=this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemCancelarTipoAsistencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAsistencia=this.jMenuItemGuardarCambiosTipoAsistencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=this.jMenuItemGuardarCambiosTablaTipoAsistencia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoAsistencia(Boolean esInicializar) {
		if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAsistencia();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoAsistencia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoAsistencia() {
		this.jButtonNuevoTipoAsistencia.setVisible(this.isPermisoNuevoTipoAsistencia);			
		this.jButtonDuplicarTipoAsistencia.setVisible(this.isPermisoDuplicarTipoAsistencia);			
		this.jButtonCopiarTipoAsistencia.setVisible(this.isPermisoCopiarTipoAsistencia);			
		this.jButtonVerFormTipoAsistencia.setVisible(this.isPermisoVerFormTipoAsistencia);			
		
		this.jButtonAbrirOrderByTipoAsistencia.setVisible(this.isPermisoOrdenTipoAsistencia);					
		
		this.jButtonNuevoRelacionesTipoAsistencia.setVisible(this.isPermisoNuevoTipoAsistencia);			
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarTipoAsistencia.setVisible(this.isPermisoActualizarTipoAsistencia);	
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarTipoAsistencia.setVisible(this.isPermisoActualizarTipoAsistencia);	
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarTipoAsistencia.setVisible(this.isPermisoEliminarTipoAsistencia);
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarTipoAsistencia.setVisible(this.isVisibilidadCeldaCancelarTipoAsistencia);						
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosTipoAsistencia.setVisible(this.isPermisoGuardarCambiosTipoAsistencia);							
		}
		
		this.jButtonGuardarCambiosTablaTipoAsistencia.setVisible(this.isPermisoActualizarTipoAsistencia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAsistencia() {
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarTipoAsistencia.setVisible(this.isPermisoActualizarTipoAsistencia);	
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarTipoAsistencia.setVisible(this.isPermisoActualizarTipoAsistencia);	
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarTipoAsistencia.setVisible(this.isPermisoEliminarTipoAsistencia);
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarTipoAsistencia.setVisible(this.isVisibilidadCeldaCancelarTipoAsistencia);							
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosTipoAsistencia.setVisible((this.isVisibilidadCeldaGuardarTipoAsistencia && this.isPermisoGuardarCambiosTipoAsistencia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoAsistencia() {
		if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoAsistencia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoAsistencia() {
	}
	
	public void jTableDatosTipoAsistenciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoAsistencia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAsistencia(this.gettipoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoasistencia==null) {
						this.tipoasistencia = new TipoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualTipoAsistencia(this.tipoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
				}

				if(this.tipoasistencia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoasistencia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoAsistenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoAsistencia(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoAsistencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoAsistencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoAsistencia(this.gettipoasistencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoasistenciaLogic.getConnexion());

				if(this.tipoasistencia.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoasistencia.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoAsistencia=(TitledBorder)this.jScrollPanelDatosTipoAsistencia.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoAsistencia.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAsistencia(this.gettipoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoasistencia==null) {
						this.tipoasistencia = new TipoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualTipoAsistencia(this.tipoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
				}

				if(this.tipoasistencia.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoasistencia.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoAsistenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAsistencia(this.gettipoasistencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoasistencia==null) {
						this.tipoasistencia = new TipoAsistencia();
					}

					this.setVariablesFormularioToObjetoActualTipoAsistencia(this.tipoasistencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);
				}

				if(this.tipoasistencia.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoasistencia.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAsistencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoAsistenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoAsistencia(false,false);

			this.getTipoAsistenciasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoAsistencia(false);

			//if(TipoAsistenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoAsistencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoasistenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoAsistencia() {
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
			this.jInternalFrameDetalleFormTipoAsistencia.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoAsistencia.dispose();
			this.jInternalFrameDetalleFormTipoAsistencia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
			this.jInternalFrameReporteDinamicoTipoAsistencia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoAsistencia.dispose();
			this.jInternalFrameReporteDinamicoTipoAsistencia=null;
		}
		
		if(this.jInternalFrameImportacionTipoAsistencia!=null) {
			this.jInternalFrameImportacionTipoAsistencia.setVisible(false);	    			
			this.jInternalFrameImportacionTipoAsistencia.dispose();
			this.jInternalFrameImportacionTipoAsistencia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoAsistencia();
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoAsistencia")) {
				jButtonNuevoTipoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoAsistencia")) {
				jButtonDuplicarTipoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoAsistencia")) {
				jButtonCopiarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoAsistencia")) {
				jButtonVerFormTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoAsistencia")) {
				jButtonNuevoTipoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoAsistencia")) {
				jButtonDuplicarTipoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoAsistencia")) {
				jButtonNuevoTipoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoAsistencia")) {
				jButtonDuplicarTipoAsistenciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoAsistencia")) {
				jButtonNuevoTipoAsistenciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoAsistencia")) {
				jButtonNuevoTipoAsistenciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoAsistencia")) {
				jButtonNuevoTipoAsistenciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoAsistencia")) {
				jButtonModificarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoAsistencia")) {
				jButtonModificarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoAsistencia")) {
				jButtonModificarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoAsistencia")) {
				jButtonActualizarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoAsistencia")) {
				jButtonActualizarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoAsistencia")) {
				jButtonActualizarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoAsistencia")) {
				jButtonEliminarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoAsistencia")) {
				jButtonEliminarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoAsistencia")) {
				jButtonEliminarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoAsistencia")) {
				jButtonCancelarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoAsistencia")) {
				jButtonCancelarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoAsistencia")) {
				jButtonCancelarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoAsistencia")) {
				jButtonCerrarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoAsistencia")) {
				jButtonCerrarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoAsistencia")) {
				jButtonCerrarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoAsistencia")) {
				jButtonMostrarOcultarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoAsistencia")) {
				jButtonCancelarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoAsistencia")) {
				jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoAsistencia")) {
				jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoAsistencia")) {
				jButtonCopiarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoAsistencia")) {
				jButtonVerFormTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoAsistencia")) {
				jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoAsistencia")) {
				jButtonCopiarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoAsistencia")) {
				jButtonVerFormTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoAsistencia")) {
				jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoAsistencia")) {
				jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoAsistencia")) {
				jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoAsistencia")) {
				jButtonRecargarInformacionTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoAsistencia")) {
				jButtonRecargarInformacionTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoAsistencia")) {
				jButtonRecargarInformacionTipoAsistenciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoAsistencia")) {
				jButtonAnterioresTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoAsistencia")) {
				jButtonAnterioresTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoAsistencia")) {
				jButtonAnterioresTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoAsistencia")) {
				jButtonSiguientesTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoAsistencia")) {
				jButtonSiguientesTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoAsistencia")) {
				jButtonSiguientesTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoAsistencia") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoAsistencia")) {
				jButtonAbrirOrderByTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoAsistencia") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoAsistencia")) {
				jButtonMostrarOcultarTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAsistencia")) {
				jButtonNuevoGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoAsistencia")) {
				jButtonNuevoGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoAsistencia")) {
				jButtonNuevoGuardarCambiosTipoAsistenciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoAsistencia")) {
				jButtonCerrarReporteDinamicoTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoAsistencia")) {
				jButtonGenerarReporteDinamicoTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoAsistencia")) {
				
				jButtonGenerarExcelReporteDinamicoTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoAsistencia")) {
				jButtonCerrarImportacionTipoAsistenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoAsistencia")) {
				
				jButtonGenerarImportacionTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoAsistencia")) {
				
				jButtonAbrirImportacionTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoAsistencia")) {
				jComboBoxTiposAccionesTipoAsistenciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoAsistencia")) {
				jComboBoxTiposRelacionesTipoAsistenciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoAsistencia")) {
				jComboBoxTiposAccionesTipoAsistenciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoAsistencia")) {
				
				jComboBoxTiposSeleccionarTipoAsistenciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoAsistencia")) {
				jTextFieldValorCampoGeneralTipoAsistenciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoAsistencia")) {
				jButtonAbrirOrderByTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoAsistencia")) {
				jButtonAbrirOrderByTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoAsistencia")) {
				jButtonCerrarOrderByTipoAsistenciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAsistenciaBusqueda")) {
				this.jButtonidTipoAsistenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAsistenciaUpdate")) {
				this.jButtonid_empresaTipoAsistenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAsistenciaBusqueda")) {
				this.jButtonid_empresaTipoAsistenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAsistenciaBusqueda")) {
				this.jButtonnombreTipoAsistenciaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoAsistencia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAsistenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				


				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoAsistencia tipoasistenciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoasistenciaLocal=this.tipoasistencia;
			} else {
				tipoasistenciaLocal=this.tipoasistenciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
							
				
				


				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
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
			
			


			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAsistenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
								
						
				


				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
								
				
				


				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAsistenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
							
				
				


				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAsistenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
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
			
			


			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAsistenciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
								
				
				


				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAsistenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAsistenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoAsistencia")) {
					jCheckBoxSeleccionarTodosTipoAsistenciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoAsistencia")) {
					jCheckBoxSeleccionadosTipoAsistenciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoAsistencia")) {
					
				}
				
				


				
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
												
				
				


				
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAsistenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAsistenciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
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
			
			


			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAsistenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoasistencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoasistencia);
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
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
				
				


				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAsistencia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAsistencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAsistenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoasistenciaAnterior =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoAsistencia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoAsistenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoAsistencia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoasistencia =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoasistencia =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoasistencia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoAsistencia")) {
				
				}
				
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoAsistencia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoAsistencia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoAsistencia")) {
			
			}
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoAsistencia();
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoAsistencia")) {
				jButtonNuevoTipoAsistenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoAsistencia")) {
				jButtonDuplicarTipoAsistenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoAsistencia")) {
				jButtonCopiarTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoAsistencia")) {
				jButtonVerFormTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoAsistencia")) {
				jButtonNuevoTipoAsistenciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoAsistencia")) {
				jButtonModificarTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoAsistencia")) {
				jButtonActualizarTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoAsistencia")) {
				jButtonEliminarTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoAsistencia")) {
				jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoAsistencia")) {
				jButtonCancelarTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoAsistencia")) {
				jButtonCerrarTipoAsistenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoAsistencia")) {
				jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAsistencia")) {
				jButtonNuevoGuardarCambiosTipoAsistenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoAsistencia")) {
				jButtonAbrirOrderByTipoAsistenciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoAsistencia")) {
				jButtonRecargarInformacionTipoAsistenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoAsistencia")) {
				jButtonAnterioresTipoAsistenciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoAsistencia")) {
				jButtonSiguientesTipoAsistenciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAsistenciaBusqueda")) {
				this.jButtonidTipoAsistenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAsistenciaUpdate")) {
				this.jButtonid_empresaTipoAsistenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAsistenciaBusqueda")) {
				this.jButtonid_empresaTipoAsistenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAsistenciaBusqueda")) {
				this.jButtonnombreTipoAsistenciaBusquedaActionPerformed(evt);
			}
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoAsistencia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoAsistencia")) {
				closingInternalFrameTipoAsistencia();
				
			} else if(sTipo.equals("jButtonCancelarTipoAsistencia")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoAsistencia = (JInternalFrameBase)evt.getSource();
	            	
	            TipoAsistenciaBeanSwingJInternalFrame jInternalFrameParent=(TipoAsistenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAsistencia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoAsistenciaActionPerformed(null);
			}
			
			TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoasistencia,new Object(),this.tipoasistenciaParameterGeneral,this.tipoasistenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoAsistencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoAsistencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoAsistencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoasistencia)) {
			if(!esControlTabla) {
				if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoAsistencia(this.tipoasistencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);			
				}
				
				if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoAsistencia(this.tipoasistencia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoasistenciaReturnGeneral=tipoasistenciaLogic.procesarEventosTipoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoasistenciaLogic.getTipoAsistencias(),this.tipoasistencia,this.tipoasistenciaParameterGeneral,this.isEsNuevoTipoAsistencia,classes);//this.tipoasistenciaLogic.getTipoAsistencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoAsistencia(this.tipoasistenciaReturnGeneral,this.tipoasistenciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoAsistencia(classes,this.tipoasistenciaReturnGeneral,this.tipoasistenciaBean,false);
					}
						
					if(this.tipoasistenciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoAsistencia(this.tipoasistenciaReturnGeneral.getTipoAsistencia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoAsistencia(this.tipoasistenciaReturnGeneral.getTipoAsistencia());	
					}
						
					if(this.tipoasistenciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoAsistencia(this.tipoasistenciaReturnGeneral.getTipoAsistencia(),classes);//this.tipoasistenciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoAsistencia(this.tipoasistencia,classes);//this.tipoasistenciaBean);									
				}
			
				if(TipoAsistenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoAsistencia(this.tipoasistencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAsistencia(this.tipoasistencia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoasistenciaAnterior!=null) {
						this.tipoasistencia=this.tipoasistenciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoasistenciaReturnGeneral=tipoasistenciaLogic.procesarEventosTipoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoasistenciaLogic.getTipoAsistencias(),this.tipoasistencia,this.tipoasistenciaParameterGeneral,this.isEsNuevoTipoAsistencia,classes);//this.tipoasistenciaLogic.getTipoAsistencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoasistenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoasistenciaReturnGeneral.getTipoAsistencia(),tipoasistenciaLogic.getTipoAsistencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoasistenciaReturnGeneral.getTipoAsistencia(),this.tipoasistencias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoAsistencia.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoAsistencia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoAsistencia();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoAsistencia() throws Exception {
		
		TipoAsistenciaModel tipoasistenciaModel=(TipoAsistenciaModel)this.jTableDatosTipoAsistencia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoasistenciaModel.tipoasistencias=this.tipoasistenciaLogic.getTipoAsistencias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoasistenciaModel.tipoasistencias=this.tipoasistencias;
		}
		
		
		((TipoAsistenciaModel) this.jTableDatosTipoAsistencia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoAsistencia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoasistenciaAnterior(),this.tipoasistenciaLogic.getTipoAsistencias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoasistenciaAnterior(),this.tipoasistencias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoAsistencia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoAsistencia(TipoAsistencia tipoasistencia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
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
										
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoasistencia,new Object(),generalEntityParameterGeneral,this.tipoasistenciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoAsistenciaConstantesFunciones.getClassesRelationshipsOfTipoAsistencia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoAsistenciaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoAsistencia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoAsistencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoAsistenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoasistencia,new Object(),generalEntityParameterGeneral,this.tipoasistenciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoAsistencia(TipoAsistenciaBean tipoasistenciaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoAsistencia(ArrayList<Classe> classes,TipoAsistenciaReturnGeneral tipoasistenciaReturnGeneral,TipoAsistenciaBean tipoasistenciaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoAsistencia(TipoAsistencia tipoasistencia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoasistencia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoAsistencia = new TipoAsistenciaDetalleFormJInternalFrame(jDesktopPane,this.tipoasistenciaSessionBean.getConGuardarRelaciones(),this.tipoasistenciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAsistencia);
		this.jInternalFrameDetalleFormTipoAsistencia.setVisible(false);
		this.jInternalFrameDetalleFormTipoAsistencia.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoAsistencia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoAsistencia.tipoasistenciaLogic=this.tipoasistenciaLogic;
		
		this.cargarCombosFrameForeignKeyTipoAsistencia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAsistencia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAsistencia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoAsistencia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoAsistencia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoAsistencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAsistencia"));
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarTipoAsistencia.addActionListener(new ButtonActionListener(this,"ModificarTipoAsistencia"));

		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarToolBarTipoAsistencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAsistencia"));
					
		this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemModificarTipoAsistencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAsistencia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarTipoAsistencia.addActionListener (new ButtonActionListener(this,"ActualizarTipoAsistencia"));
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarToolBarTipoAsistencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAsistencia"));
						
		this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemActualizarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAsistencia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarTipoAsistencia.addActionListener (new ButtonActionListener(this,"EliminarTipoAsistencia"));
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAsistencia"));
								
		this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemEliminarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAsistencia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarTipoAsistencia.addActionListener (new ButtonActionListener(this,"CancelarTipoAsistencia"));
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAsistencia"));
					
		this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemCancelarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAsistencia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemDetalleCerrarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAsistencia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAsistencia"));
		
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAsistencia"));
		
		
		
		this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAsistencia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonidTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonid_empresaTipoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonid_empresaTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonnombreTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAsistenciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAsistencia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoAsistencia"));
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAsistencia"));
		}
		
		this.jTableDatosTipoAsistencia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoAsistencia"));
		
		this.jTableDatosTipoAsistencia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoAsistencia"));
		
		this.jButtonNuevoTipoAsistencia.addActionListener(new ButtonActionListener(this,"NuevoTipoAsistencia"));
		
		this.jButtonDuplicarTipoAsistencia.addActionListener(new ButtonActionListener(this,"DuplicarTipoAsistencia"));
		
		this.jButtonCopiarTipoAsistencia.addActionListener(new ButtonActionListener(this,"CopiarTipoAsistencia"));
		
		this.jButtonVerFormTipoAsistencia.addActionListener(new ButtonActionListener(this,"VerFormTipoAsistencia"));
		
		
		this.jButtonNuevoToolBarTipoAsistencia.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoAsistencia"));
			
		this.jButtonDuplicarToolBarTipoAsistencia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoAsistencia"));
			
		this.jMenuItemNuevoTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoAsistencia"));
			
		this.jMenuItemDuplicarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoAsistencia"));		
		
		
		this.jButtonNuevoRelacionesTipoAsistencia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoAsistencia"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoAsistencia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoAsistencia"));
			
		this.jMenuItemNuevoRelacionesTipoAsistencia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoAsistencia"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarTipoAsistencia.addActionListener(new ButtonActionListener(this,"ModificarTipoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonModificarToolBarTipoAsistencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAsistencia"));
			
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemModificarTipoAsistencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAsistencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarTipoAsistencia.addActionListener (new ButtonActionListener(this,"ActualizarTipoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonActualizarToolBarTipoAsistencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAsistencia"));
				
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemActualizarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAsistencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarTipoAsistencia.addActionListener (new ButtonActionListener(this,"EliminarTipoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonEliminarToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAsistencia"));
						
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemEliminarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAsistencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarTipoAsistencia.addActionListener (new ButtonActionListener(this,"CancelarTipoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonCancelarToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAsistencia"));
			
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemCancelarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAsistencia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoAsistencia"));		
		
		
		this.jButtonCerrarTipoAsistencia.addActionListener (new ButtonActionListener(this,"CerrarTipoAsistencia"));
		
		
		this.jButtonCerrarToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoAsistencia"));
			
		this.jMenuItemCerrarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoAsistencia"));
			
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jMenuItemDetalleCerrarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAsistencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosTipoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoAsistencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAsistencia"));
		}
		
		this.jButtonCopiarToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoAsistencia"));
			
		this.jButtonVerFormToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoAsistencia"));
		
		this.jMenuItemGuardarCambiosTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoAsistencia"));
			
		this.jMenuItemCopiarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoAsistencia"));		
		
		this.jMenuItemVerFormTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoAsistencia"));		
		
		
		this.jButtonGuardarCambiosTablaTipoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAsistencia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoAsistencia"));
			
		this.jMenuItemGuardarCambiosTablaTipoAsistencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAsistencia"));		
		
		
		
		this.jButtonRecargarInformacionTipoAsistencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoAsistencia"));
					
		this.jButtonRecargarInformacionToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoAsistencia"));
		
		this.jMenuItemRecargarInformacionTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoAsistencia"));		
		
		
		
		this.jButtonAnterioresTipoAsistencia.addActionListener (new ButtonActionListener(this,"AnterioresTipoAsistencia"));
		
		
		this.jButtonAnterioresToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoAsistencia"));
		
		this.jMenuItemAnterioresTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoAsistencia"));		
		
		
		this.jButtonSiguientesTipoAsistencia.addActionListener (new ButtonActionListener(this,"SiguientesTipoAsistencia"));
		
		
		this.jButtonSiguientesToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoAsistencia"));
			
		this.jMenuItemSiguientesTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoAsistencia"));
			
		this.jMenuItemAbrirOrderByTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoAsistencia"));
			
		this.jMenuItemMostrarOcultarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoAsistencia"));
			
		this.jMenuItemDetalleAbrirOrderByTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoAsistencia"));
			
		this.jMenuItemDetalleMostarOcultarTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoAsistencia"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoAsistencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoAsistencia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoAsistencia"));
			
		this.jMenuItemNuevoGuardarCambiosTipoAsistencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoAsistencia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoAsistencia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoAsistencia"));

		this.jCheckBoxSeleccionadosTipoAsistencia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoAsistencia"));
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAsistencia"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoAsistencia.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoAsistencia"));
			
		this.jComboBoxTiposAccionesTipoAsistencia.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoAsistencia"));
					
		this.jComboBoxTiposSeleccionarTipoAsistencia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoAsistencia"));
			
		this.jTextFieldValorCampoGeneralTipoAsistencia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoAsistencia"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonidTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonid_empresaTipoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonid_empresaTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonnombreTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAsistenciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoAsistencia!=null) {
				this.jInternalFrameReporteDinamicoTipoAsistencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAsistencia"));
				this.jInternalFrameReporteDinamicoTipoAsistencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAsistencia"));
				this.jInternalFrameReporteDinamicoTipoAsistencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAsistencia"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoAsistencia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAsistencia"));				
			//this.jButtonGenerarReporteDinamicoTipoAsistencia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAsistencia"));
			//this.jButtonGenerarExcelReporteDinamicoTipoAsistencia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAsistencia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoAsistencia!=null) {
				this.jInternalFrameImportacionTipoAsistencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAsistencia"));
				this.jInternalFrameImportacionTipoAsistencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAsistencia"));
				this.jInternalFrameImportacionTipoAsistencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAsistencia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoAsistencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoAsistencia"));
			
			this.jButtonAbrirOrderByToolBarTipoAsistencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoAsistencia"));			
			
			if(this.jInternalFrameOrderByTipoAsistencia!=null) {
				this.jInternalFrameOrderByTipoAsistencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAsistencia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAsistencia.jTabbedPaneRelacionesTipoAsistencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAsistencia"));
		
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
            		closingInternalFrameTipoAsistencia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoAsistencia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoAsistencia = (JInternalFrameBase)event.getSource();
	            	
	            TipoAsistenciaBeanSwingJInternalFrame jInternalFrameParent=(TipoAsistenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAsistencia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoAsistenciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoAsistencia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoAsistenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoAsistencia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoAsistencia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAsistenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAsistenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAsistenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoAsistencia";
		inputMap = this.jButtonNuevoTipoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAsistenciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAsistenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAsistenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAsistenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoAsistencia";
		inputMap = this.jButtonNuevoRelacionesTipoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAsistenciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoAsistencia";
		inputMap = this.jButtonModificarTipoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoAsistencia";
		inputMap = this.jButtonActualizarTipoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoAsistencia";
		inputMap = this.jButtonEliminarTipoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoAsistencia";
		inputMap = this.jButtonCancelarTipoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoAsistencia";
		inputMap = this.jButtonCerrarTipoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoAsistencia";
		inputMap = this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosTipoAsistencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonGuardarCambiosTipoAsistencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoAsistenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoAsistencia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoAsistenciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoAsistencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoAsistenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoAsistencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoAsistenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoAsistencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoAsistenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonidTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAsistenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonid_empresaTipoAsistenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAsistenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonid_empresaTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAsistenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAsistencia.jButtonnombreTipoAsistenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAsistenciaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoAsistencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoAsistenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoAsistenciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoAsistencia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoAsistencia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
					tipoasistenciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAsistencia tipoasistenciaAux:tipoasistencias) {
					tipoasistenciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoAsistenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAsistencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
						tipoasistenciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAsistencia tipoasistenciaAux:tipoasistencias) {
						tipoasistenciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAsistencia tipoasistenciaAux:tipoasistencias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAsistencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAsistencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAsistencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAsistencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoAsistenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAsistencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoAsistencia.getSelectedRows();
			
			TipoAsistencia tipoasistenciaLocal=new TipoAsistencia();
			
			//this.seleccionarTodosTipoAsistencia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoasistenciaLocal =(TipoAsistencia) this.tipoasistenciaLogic.getTipoAsistencias().toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoasistenciaLocal =(TipoAsistencia) this.tipoasistencias.toArray()[this.jTableDatosTipoAsistencia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoasistenciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
						tipoasistenciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAsistencia tipoasistenciaAux:tipoasistencias) {
						tipoasistenciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoAsistencia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAsistencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAsistencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAsistencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoAsistenciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoAsistenciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoAsistenciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoAsistencia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoAsistencia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAsistencia tipoasistenciaAux:this.tipoasistenciaLogic.getTipoAsistencias()) {
				
						if(sTipoSeleccionar.equals(TipoAsistenciaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoasistenciaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAsistencia tipoasistenciaAux:tipoasistencias) {
					
						if(sTipoSeleccionar.equals(TipoAsistenciaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoasistenciaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAsistencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoAsistenciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoAsistencia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoAsistencia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoAsistencia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoAsistencia) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoAsistencia(conSplash);
				
					this.generarReporteTipoAsistenciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoAsistenciasSeleccionados();
				//this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAsistenciasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAsistenciasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAsistencia();
				
				this.exportarTipoAsistenciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoAsistencias();
				//this.importarTipoAsistencias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAsistencia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoAsistenciasSeleccionados();
				//this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Asistencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoAsistencia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoAsistencia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoAsistencia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoAsistenciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoAsistencia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoAsistencia(conSplash);
					
						//this.actualizarParametrosGeneralTipoAsistencia();
						
						this.generarReporteProcesoAccionTipoAsistenciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoAsistenciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo AsistenciaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Asistencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoAsistencia();
				
						this.actualizarParametrosGeneralTipoAsistencia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoasistenciaReturnGeneral=tipoasistenciaLogic.procesarAccionTipoAsistenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoasistenciaLogic.getTipoAsistencias(),this.tipoasistenciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoAsistenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoAsistencia();
					
					TipoAsistenciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoAsistenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoAsistencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxTiposAccionesFormularioTipoAsistencia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoAsistencia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoAsistenciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoAsistencia();
			
			if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		
			TipoAsistencia tipoasistencia=new TipoAsistencia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoAsistencia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoAsistencia.getSelectedItem();
			
			
			
			
			tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoasistenciasSeleccionados.size()==1) {
				for(TipoAsistencia tipoasistenciaAux:tipoasistenciasSeleccionados) {
					tipoasistencia=tipoasistenciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoAsistencia();
			
      		//this.finishProcessTipoAsistencia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoAsistenciaReturnGeneral() throws Exception {
		if(this.tipoasistenciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoasistenciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoasistenciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoasistenciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoasistenciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoasistenciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoAsistencia(false);
		}
		
		if(this.tipoasistenciaReturnGeneral.getConRetornoLista() || this.tipoasistenciaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoasistenciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoasistenciaLogic.setTipoAsistencias(this.tipoasistenciaReturnGeneral.getTipoAsistencias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoasistenciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoasistenciaLogic.setTipoAsistencia(this.tipoasistenciaReturnGeneral.getTipoAsistencia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoAsistencia(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoAsistencia() throws Exception {
		
		
	}
	
	public ArrayList<TipoAsistencia> getTipoAsistenciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoAsistencia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoAsistencia tipoasistenciaAux:tipoasistenciaLogic.getTipoAsistencias()) {
					if(tipoasistenciaAux.getIsSelected()) {
						tipoasistenciasSeleccionados.add(tipoasistenciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAsistencia tipoasistenciaAux:this.tipoasistencias) {
					if(tipoasistenciaAux.getIsSelected()) {
						tipoasistenciasSeleccionados.add(tipoasistenciaAux);				
					}
				}
			}
			
			if(tipoasistenciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoasistenciasSeleccionados.addAll(this.tipoasistenciaLogic.getTipoAsistencias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoasistenciasSeleccionados.addAll(this.tipoasistencias);				
					}
				}
			}
		} else {
			tipoasistenciasSeleccionados.add(this.tipoasistencia);
		}
		
		return tipoasistenciasSeleccionados;
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
	
	public void generarReporteTipoAsistenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoAsistenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoAsistenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAsistenciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAsistenciasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Asistencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoAsistenciasSeleccionados() throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoAsistencias("Todos",tipoasistenciasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoAsistenciasSeleccionados() throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoAsistencias("Todos",tipoasistenciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoAsistenciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoAsistencias("Todos",tipoasistenciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoAsistenciasSeleccionados() throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoAsistencia();
		
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoAsistencia();
		
		
		//this.generarReporteTipoAsistencias("Todos",tipoasistenciasSeleccionados ,tipoasistenciaImplementable,tipoasistenciaImplementableHome);
	}
	
	public void mostrarImportacionTipoAsistencias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoAsistencia();
		
		this.abrirFrameImportacionTipoAsistencia();		
		
			
		//this.generarReporteTipoAsistencias("Todos",tipoasistenciasSeleccionados ,tipoasistenciaImplementable,tipoasistenciaImplementableHome);
	}
	
	public void importarTipoAsistencias() throws Exception {		
	
	}
	
	public void exportarTipoAsistenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoAsistenciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoAsistenciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoAsistenciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Asistencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoAsistenciasSeleccionados() throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoasistencia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoAsistencia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoAsistencia tipoasistenciaAux:tipoasistenciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoAsistencia(tipoasistenciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoasistenciaAux.setsDetalleGeneralEntityReporte(tipoasistenciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoAsistencia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoAsistenciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAsistenciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAsistenciaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoAsistencia(TipoAsistencia tipoasistencia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoasistencia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoasistencia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoasistencia.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoasistencia.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoAsistenciasSeleccionados() throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoasistencia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoAsistencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoAsistencia(row);				
				iRow++;
			}				
			
			for(TipoAsistencia tipoasistenciaAux:tipoasistenciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoAsistencia(tipoasistenciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoAsistenciasSeleccionados() throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();		
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoasistencia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoasistencias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoasistencia");
			//elementRoot.appendChild(element);
		
			for(TipoAsistencia tipoasistenciaAux:tipoasistenciasSeleccionados) {
				element = document.createElement("tipoasistencia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoAsistencia(tipoasistenciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Asistencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoAsistencia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAsistenciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAsistenciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAsistenciaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoAsistencia(TipoAsistencia tipoasistencia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoasistencia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoasistencia.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoasistencia.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoAsistencia(TipoAsistencia tipoasistencia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoAsistenciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoasistencia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoAsistenciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoasistencia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoAsistenciaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoasistencia.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoAsistenciaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoasistencia.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoAsistenciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoAsistencia> tipoasistenciasSeleccionados=new ArrayList<TipoAsistencia>();
		
		tipoasistenciasSeleccionados=this.getTipoAsistenciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoAsistencia(tipoasistenciasSeleccionados);
		
		this.generarReporteTipoAsistencias("Todos",tipoasistenciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoAsistencia(ArrayList<TipoAsistencia> tipoasistenciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoAsistencia tipoasistenciaAux:tipoasistenciasSeleccionados) {
				tipoasistenciaAux.setsDetalleGeneralEntityReporte(tipoasistenciaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoasistenciaAux.setsDescripcionGeneralEntityReporte1(tipoasistenciaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoAsistenciaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoasistenciaAux.setsDescripcionGeneralEntityReporte1(tipoasistenciaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAsistenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoAsistencia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoAsistencia=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=true;
				this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=true;
			}
			
			this.isVisibilidadCeldaModificarTipoAsistencia=false;
			this.isVisibilidadCeldaActualizarTipoAsistencia=false;
			this.isVisibilidadCeldaEliminarTipoAsistencia=false;
			this.isVisibilidadCeldaCancelarTipoAsistencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAsistencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=false;
			this.isVisibilidadCeldaModificarTipoAsistencia=false;
			this.isVisibilidadCeldaActualizarTipoAsistencia=true;
			this.isVisibilidadCeldaEliminarTipoAsistencia=false;
			this.isVisibilidadCeldaCancelarTipoAsistencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAsistencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=false;
			this.isVisibilidadCeldaModificarTipoAsistencia=false;
			this.isVisibilidadCeldaActualizarTipoAsistencia=true;
			this.isVisibilidadCeldaEliminarTipoAsistencia=true;
			this.isVisibilidadCeldaCancelarTipoAsistencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAsistencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=false;
			this.isVisibilidadCeldaModificarTipoAsistencia=false;
			this.isVisibilidadCeldaActualizarTipoAsistencia=true;
			this.isVisibilidadCeldaEliminarTipoAsistencia=false;
			this.isVisibilidadCeldaCancelarTipoAsistencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoAsistencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=true;
			this.isVisibilidadCeldaModificarTipoAsistencia=false;
			this.isVisibilidadCeldaActualizarTipoAsistencia=false;
			this.isVisibilidadCeldaEliminarTipoAsistencia=false;
			this.isVisibilidadCeldaCancelarTipoAsistencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAsistencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=false;
			this.isVisibilidadCeldaActualizarTipoAsistencia=false;
			this.isVisibilidadCeldaEliminarTipoAsistencia=false;
			this.isVisibilidadCeldaCancelarTipoAsistencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoAsistencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=false;
			this.isVisibilidadCeldaModificarTipoAsistencia=true;
			this.isVisibilidadCeldaActualizarTipoAsistencia=false;
			this.isVisibilidadCeldaEliminarTipoAsistencia=false;
			this.isVisibilidadCeldaCancelarTipoAsistencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAsistencia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoAsistencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=true;
		} else {
			this.actualizarEstadoPanelsTipoAsistencia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoAsistencia=false;
			//this.isVisibilidadCeldaVerFormTipoAsistencia=false;
			this.isVisibilidadCeldaDuplicarTipoAsistencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoasistenciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoAsistencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAsistencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoasistenciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;												
			}
			
			this.jButtonCerrarTipoAsistencia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAsistencia=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoasistencia)) {
			this.isVisibilidadCeldaActualizarTipoAsistencia=false;
			this.isVisibilidadCeldaEliminarTipoAsistencia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAsistencia() {
	}
	
	public void actualizarEstadoPanelsTipoAsistencia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoAsistencia!=null) {
				this.jScrollPanelDatosEdicionTipoAsistencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAsistencia!=null) {
				this.jScrollPanelDatosTipoAsistencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAsistencia!=null) {
				this.jPanelPaginacionTipoAsistencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoAsistencia!=null) {
				this.jScrollPanelDatosEdicionTipoAsistencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoAsistencia!=null) {
				this.jScrollPanelDatosTipoAsistencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAsistencia!=null) {
				this.jPanelPaginacionTipoAsistencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoAsistencia!=null) {
				this.jScrollPanelDatosEdicionTipoAsistencia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAsistencia!=null) {
				this.jScrollPanelDatosTipoAsistencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAsistencia!=null) {
				this.jPanelPaginacionTipoAsistencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoAsistencia!=null) {
				this.jScrollPanelDatosEdicionTipoAsistencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAsistencia!=null) {
				this.jScrollPanelDatosTipoAsistencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAsistencia!=null) {
				this.jPanelPaginacionTipoAsistencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoAsistencia!=null) {
				this.jScrollPanelDatosEdicionTipoAsistencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAsistencia!=null) {
				this.jScrollPanelDatosTipoAsistencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAsistencia!=null) {
				this.jPanelPaginacionTipoAsistencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoAsistencia!=null) {
				this.jScrollPanelDatosEdicionTipoAsistencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAsistencia!=null) {
				this.jScrollPanelDatosTipoAsistencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAsistencia!=null) {
				this.jPanelPaginacionTipoAsistencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoAsistencia!=null) {
				this.jScrollPanelDatosEdicionTipoAsistencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAsistencia!=null) {
				this.jScrollPanelDatosTipoAsistencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAsistencia!=null) {
				this.jPanelPaginacionTipoAsistencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
					this.jTabbedPaneBusquedasTipoAsistencia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAsistencia!=null) {
				this.jTabbedPaneBusquedasTipoAsistencia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoAsistencia!=null) {
				this.jPanelParametrosReportesTipoAsistencia.setVisible(true);
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
		
		//TipoAsistenciaSessionBean tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
		
		if(this.tipoasistenciaSessionBean==null) {
			this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
		}
		
		this.tipoasistenciaSessionBean.setsUltimaBusquedaTipoAsistencia(this.getsAccionBusqueda());
		this.tipoasistenciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoasistenciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoasistenciaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoAsistenciaSessionBean tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
		
		if(this.tipoasistenciaSessionBean==null) {
			this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
		}
		
		if(this.tipoasistenciaSessionBean.getsUltimaBusquedaTipoAsistencia()!=null&&!this.tipoasistenciaSessionBean.getsUltimaBusquedaTipoAsistencia().equals("")) {
			this.setsAccionBusqueda(tipoasistenciaSessionBean.getsUltimaBusquedaTipoAsistencia());
			this.setiNumeroPaginacion(tipoasistenciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoasistenciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoasistenciaSessionBean.getid_empresa());
				tipoasistenciaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoasistenciaSessionBean.setsUltimaBusquedaTipoAsistencia("");
		this.tipoasistenciaSessionBean.setiNumeroPaginacion(TipoAsistenciaConstantesFunciones.INUMEROPAGINACION);
		this.tipoasistenciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoAsistencia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoAsistencia() {
		this.updateBorderResaltarBusquedasFormularioTipoAsistencia();
		this.updateVisibilidadBusquedasFormularioTipoAsistencia();
		this.updateHabilitarBusquedasFormularioTipoAsistencia();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoAsistencia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoAsistencia.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoAsistencia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoAsistencia.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoAsistencia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoAsistencia.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoAsistencia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoAsistencia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoAsistencia() throws Exception {

		if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoAsistencia();
		this.updateVisibilidadResaltarControlesFormularioTipoAsistencia();
		this.updateHabilitarResaltarControlesFormularioTipoAsistencia();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoAsistencia() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoasistenciaConstantesFunciones.resaltaridTipoAsistencia!=null && this.jInternalFrameDetalleFormTipoAsistencia!=null) {this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.setBorder(this.tipoasistenciaConstantesFunciones.resaltaridTipoAsistencia);}
		if(this.tipoasistenciaConstantesFunciones.resaltarid_empresaTipoAsistencia!=null && this.jInternalFrameDetalleFormTipoAsistencia!=null) {this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setBorder(this.tipoasistenciaConstantesFunciones.resaltarid_empresaTipoAsistencia);}
		if(this.tipoasistenciaConstantesFunciones.resaltarnombreTipoAsistencia!=null && this.jInternalFrameDetalleFormTipoAsistencia!=null) {this.jInternalFrameDetalleFormTipoAsistencia.jTextFieldnombreTipoAsistencia.setBorder(this.tipoasistenciaConstantesFunciones.resaltarnombreTipoAsistencia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoAsistencia() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
	
		//this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.setVisible(this.tipoasistenciaConstantesFunciones.mostraridTipoAsistencia);
		this.jInternalFrameDetalleFormTipoAsistencia.jPanelidTipoAsistencia.setVisible(this.tipoasistenciaConstantesFunciones.mostraridTipoAsistencia);
		//this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setVisible(this.tipoasistenciaConstantesFunciones.mostrarid_empresaTipoAsistencia);
		this.jInternalFrameDetalleFormTipoAsistencia.jPanelid_empresaTipoAsistencia.setVisible(this.tipoasistenciaConstantesFunciones.mostrarid_empresaTipoAsistencia);
		//this.jInternalFrameDetalleFormTipoAsistencia.jTextFieldnombreTipoAsistencia.setVisible(this.tipoasistenciaConstantesFunciones.mostrarnombreTipoAsistencia);
		this.jInternalFrameDetalleFormTipoAsistencia.jPanelnombreTipoAsistencia.setVisible(this.tipoasistenciaConstantesFunciones.mostrarnombreTipoAsistencia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoAsistencia() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAsistencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAsistencia!=null) {
	
		this.jInternalFrameDetalleFormTipoAsistencia.jLabelidTipoAsistencia.setEnabled(this.tipoasistenciaConstantesFunciones.activaridTipoAsistencia);
		this.jInternalFrameDetalleFormTipoAsistencia.jComboBoxid_empresaTipoAsistencia.setEnabled(this.tipoasistenciaConstantesFunciones.activarid_empresaTipoAsistencia);
		this.jInternalFrameDetalleFormTipoAsistencia.jTextFieldnombreTipoAsistencia.setEnabled(this.tipoasistenciaConstantesFunciones.activarnombreTipoAsistencia);
		}
	}
	
		
}