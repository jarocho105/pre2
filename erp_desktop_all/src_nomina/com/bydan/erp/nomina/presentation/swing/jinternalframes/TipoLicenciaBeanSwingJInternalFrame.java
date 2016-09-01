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

import com.bydan.erp.nomina.util.TipoLicenciaConstantesFunciones;
import com.bydan.erp.nomina.util.TipoLicenciaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoLicenciaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoLicenciaBean;
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
public class TipoLicenciaBeanSwingJInternalFrame extends TipoLicenciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoLicenciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoLicencia> tipolicenciaValidator = new ClassValidator<TipoLicencia>(TipoLicencia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoLicencia tipolicencia;	
	public TipoLicencia tipolicenciaAux;
	public TipoLicencia tipolicenciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoLicencia tipolicenciaTotales;
	public Long idTipoLicenciaActual;
	public Long iIdNuevoTipoLicencia=0L;
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
	
	public Boolean isPermisoTodoTipoLicencia;
	public Boolean isPermisoNuevoTipoLicencia;
	public Boolean isPermisoActualizarTipoLicencia;
	public Boolean isPermisoActualizarOriginalTipoLicencia;
	public Boolean isPermisoEliminarTipoLicencia;
	public Boolean isPermisoGuardarCambiosTipoLicencia;
	public Boolean isPermisoConsultaTipoLicencia;
	public Boolean isPermisoBusquedaTipoLicencia;
	public Boolean isPermisoReporteTipoLicencia;
	public Boolean isPermisoPaginacionMedioTipoLicencia;
	public Boolean isPermisoPaginacionAltoTipoLicencia;
	public Boolean isPermisoPaginacionTodoTipoLicencia;
	public Boolean isPermisoCopiarTipoLicencia;
	public Boolean isPermisoVerFormTipoLicencia;
	public Boolean isPermisoDuplicarTipoLicencia;
	public Boolean isPermisoOrdenTipoLicencia;
	
	
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
	
	public TipoLicenciaParameterReturnGeneral tipolicenciaReturnGeneral;
	public TipoLicenciaParameterReturnGeneral tipolicenciaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoLicencia=false;
	public Boolean esParaAccionDesdeFormularioTipoLicencia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoLicenciaSessionBeanAdditional tipolicenciaSessionBeanAdditional=null;
	
	public TipoLicenciaSessionBeanAdditional getTipoLicenciaSessionBeanAdditional() {
		return this.tipolicenciaSessionBeanAdditional;
	}
	
	public void setTipoLicenciaSessionBeanAdditional(TipoLicenciaSessionBeanAdditional tipolicenciaSessionBeanAdditional) {
		try {
			this.tipolicenciaSessionBeanAdditional=tipolicenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoLicenciaBeanSwingJInternalFrameAdditional tipolicenciaBeanSwingJInternalFrameAdditional=null;
	//public class TipoLicenciaBeanSwingJInternalFrame
	
	public TipoLicenciaBeanSwingJInternalFrameAdditional getTipoLicenciaBeanSwingJInternalFrameAdditional() {
		return this.tipolicenciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoLicenciaBeanSwingJInternalFrameAdditional(TipoLicenciaBeanSwingJInternalFrameAdditional tipolicenciaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipolicenciaBeanSwingJInternalFrameAdditional=tipolicenciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoLicenciaLogic tipolicenciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoLicencia tipolicenciaBean;
	public TipoLicenciaConstantesFunciones tipolicenciaConstantesFunciones;
	//public TipoLicenciaParameterReturnGeneral tipolicenciaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoLicencia> tipolicencias;	
	//public List<TipoLicencia> tipolicenciasEliminados;
	//public List<TipoLicencia> tipolicenciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoLicencia=false;
	public Boolean isVisibilidadCeldaDuplicarTipoLicencia=true;
	public Boolean isVisibilidadCeldaCopiarTipoLicencia=true;
	public Boolean isVisibilidadCeldaVerFormTipoLicencia=true;
	public Boolean isVisibilidadCeldaOrdenTipoLicencia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
	public Boolean isVisibilidadCeldaModificarTipoLicencia=false;
	public Boolean isVisibilidadCeldaActualizarTipoLicencia=false;
	public Boolean isVisibilidadCeldaEliminarTipoLicencia=false;
	public Boolean isVisibilidadCeldaCancelarTipoLicencia=false;
	public Boolean isVisibilidadCeldaGuardarTipoLicencia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoLicencia=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoLicencia() {
		return this.iIdNuevoTipoLicencia;
	}

	public void setiIdNuevoTipoLicencia(Long iIdNuevoTipoLicencia) {
		this.iIdNuevoTipoLicencia = iIdNuevoTipoLicencia;
	}
	
	public Long getidTipoLicenciaActual() {
		return this.idTipoLicenciaActual;
	}

	public void setidTipoLicenciaActual(Long idTipoLicenciaActual) {
		this.idTipoLicenciaActual = idTipoLicenciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoLicencia gettipolicencia() {
		return this.tipolicencia;
	}

	public void settipolicencia(TipoLicencia tipolicencia) {
		this.tipolicencia = tipolicencia;
	}
	
	public TipoLicencia gettipolicenciaAux() {
		return this.tipolicenciaAux;
	}

	public void settipolicenciaAux(TipoLicencia tipolicenciaAux) {
		this.tipolicenciaAux = tipolicenciaAux;
	}				
	
	public TipoLicencia gettipolicenciaAnterior() {
		return this.tipolicenciaAnterior;
	}

	public void settipolicenciaAnterior(TipoLicencia tipolicenciaAnterior) {
		this.tipolicenciaAnterior = tipolicenciaAnterior;
	}	
	
	public TipoLicencia gettipolicenciaTotales() {
		return this.tipolicenciaTotales;
	}

	public void settipolicenciaTotales(TipoLicencia tipolicenciaTotales) {
		this.tipolicenciaTotales = tipolicenciaTotales;
	}	
	
	public TipoLicencia gettipolicenciaBean() {
		return this.tipolicenciaBean;
	}

	public void settipolicenciaBean(TipoLicencia tipolicenciaBean) {
		this.tipolicenciaBean = tipolicenciaBean;
	}	
	
	public TipoLicenciaParameterReturnGeneral gettipolicenciaReturnGeneral() {
		return this.tipolicenciaReturnGeneral;
	}

	public void settipolicenciaReturnGeneral(TipoLicenciaParameterReturnGeneral tipolicenciaReturnGeneral) {
		this.tipolicenciaReturnGeneral = tipolicenciaReturnGeneral;
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
	
	
	public TipoLicenciaLogic getTipoLicenciaLogic()	{		
		return tipolicenciaLogic;
	}

	public void setTipoLicenciaLogic(TipoLicenciaLogic tipolicenciaLogic) {
		this.tipolicenciaLogic = tipolicenciaLogic;
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
	
	public Boolean getIsEsNuevoTipoLicencia() {
		return isEsNuevoTipoLicencia;
	}

	public void setIsEsNuevoTipoLicencia(Boolean isEsNuevoTipoLicencia) {
		this.isEsNuevoTipoLicencia = isEsNuevoTipoLicencia;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoLicencia() {
		return esParaAccionDesdeFormularioTipoLicencia;
	}
	
	public void setEsParaAccionDesdeFormularioTipoLicencia(Boolean esParaAccionDesdeFormularioTipoLicencia) {
		this.esParaAccionDesdeFormularioTipoLicencia = esParaAccionDesdeFormularioTipoLicencia;
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

			if(this.tipolicenciaSessionBean==null) {
				this.tipolicenciaSessionBean=new TipoLicenciaSessionBean();
			}

			if(!this.tipolicenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipolicenciaSessionBean.getlidEmpresaActual());
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

					if(this.tipolicencia!=null) {
						this.tipolicencia.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
						this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoLicencia.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
						if(this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoLicenciaGenerico)throws Exception
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
				jComboBoxid_empresaTipoLicenciaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoLicenciaGenerico!=null && jComboBoxid_empresaTipoLicenciaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoLicenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoLicencia tipolicencia,JComboBox jComboBoxid_empresaTipoLicenciaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoLicenciaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoLicenciaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipolicencia.setid_empresa(empresaAux.getId());
				tipolicencia.setempresa_descripcion(TipoLicenciaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipolicencia.setEmpresa(empresaAux);			}
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

					if(!TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoLicencia!=null) { 
							this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoLicencia!=null) { 
					}

					if(!TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
							this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
							this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoLicencia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoLicenciaConstantesFunciones.refrescarForeignKeysDescripcionesTipoLicencia(this.tipolicenciaLogic.getTipoLicencias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoLicenciaConstantesFunciones.refrescarForeignKeysDescripcionesTipoLicencia(this.tipolicencias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipolicenciaLogic.setTipoLicencias(this.tipolicencias);
			tipolicenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoLicenciaParameterReturnGeneral getTipoLicenciaParameterGeneral() {
		return this.tipolicenciaParameterGeneral;
	}
	
	public void setTipoLicenciaParameterGeneral(TipoLicenciaParameterReturnGeneral tipolicenciaParameterGeneral) {
		this.tipolicenciaParameterGeneral = tipolicenciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoLicencia() {
		return isPermisoTodoTipoLicencia;
	}

	public void setIsPermisoTodoTipoLicencia(Boolean isPermisoTodoTipoLicencia) {
		this.isPermisoTodoTipoLicencia = isPermisoTodoTipoLicencia;
	}

	public Boolean getIsPermisoNuevoTipoLicencia() {
		return isPermisoNuevoTipoLicencia;
	}

	public void setIsPermisoNuevoTipoLicencia(Boolean isPermisoNuevoTipoLicencia) {
		this.isPermisoNuevoTipoLicencia = isPermisoNuevoTipoLicencia;
	}

	public Boolean getIsPermisoActualizarTipoLicencia() {
		return isPermisoActualizarTipoLicencia;
	}

	public void setIsPermisoActualizarTipoLicencia(Boolean isPermisoActualizarTipoLicencia) {
		this.isPermisoActualizarTipoLicencia = isPermisoActualizarTipoLicencia;
	}

	public Boolean getIsPermisoEliminarTipoLicencia() {
		return isPermisoEliminarTipoLicencia;
	}

	public void setIsPermisoEliminarTipoLicencia(Boolean isPermisoEliminarTipoLicencia) {
		this.isPermisoEliminarTipoLicencia = isPermisoEliminarTipoLicencia;
	}

	public Boolean getIsPermisoGuardarCambiosTipoLicencia() {
		return isPermisoGuardarCambiosTipoLicencia;
	}

	public void setIsPermisoGuardarCambiosTipoLicencia(Boolean isPermisoGuardarCambiosTipoLicencia) {
		this.isPermisoGuardarCambiosTipoLicencia = isPermisoGuardarCambiosTipoLicencia;
	}
	
	public Boolean getIsPermisoConsultaTipoLicencia() {
		return isPermisoConsultaTipoLicencia;
	}

	public void setIsPermisoConsultaTipoLicencia(Boolean isPermisoConsultaTipoLicencia) {
		this.isPermisoConsultaTipoLicencia = isPermisoConsultaTipoLicencia;
	}

	public Boolean getIsPermisoBusquedaTipoLicencia() {
		return isPermisoBusquedaTipoLicencia;
	}

	public void setIsPermisoBusquedaTipoLicencia(Boolean isPermisoBusquedaTipoLicencia) {
		this.isPermisoBusquedaTipoLicencia = isPermisoBusquedaTipoLicencia;
	}

	public Boolean getIsPermisoReporteTipoLicencia() {
		return isPermisoReporteTipoLicencia;
	}

	public void setIsPermisoReporteTipoLicencia(Boolean isPermisoReporteTipoLicencia) {
		this.isPermisoReporteTipoLicencia = isPermisoReporteTipoLicencia;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoLicencia() {
		return isPermisoPaginacionMedioTipoLicencia;
	}

	public void setIsPermisoPaginacionMedioTipoLicencia(Boolean isPermisoPaginacionMedioTipoLicencia) {
		this.isPermisoPaginacionMedioTipoLicencia = isPermisoPaginacionMedioTipoLicencia;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoLicencia() {
		return isPermisoPaginacionTodoTipoLicencia;
	}

	public void setIsPermisoPaginacionTodoTipoLicencia(Boolean isPermisoPaginacionTodoTipoLicencia) {
		this.isPermisoPaginacionTodoTipoLicencia = isPermisoPaginacionTodoTipoLicencia;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoLicencia() {
		return isPermisoPaginacionAltoTipoLicencia;
	}

	public void setIsPermisoPaginacionAltoTipoLicencia(Boolean isPermisoPaginacionAltoTipoLicencia) {
		this.isPermisoPaginacionAltoTipoLicencia = isPermisoPaginacionAltoTipoLicencia;
	}
	
	public Boolean getIsPermisoCopiarTipoLicencia() {
		return isPermisoCopiarTipoLicencia;
	}

	public void setIsPermisoCopiarTipoLicencia(Boolean isPermisoCopiarTipoLicencia) {
		this.isPermisoCopiarTipoLicencia = isPermisoCopiarTipoLicencia;
	}
	
	public Boolean getIsPermisoVerFormTipoLicencia() {
		return isPermisoVerFormTipoLicencia;
	}

	public void setIsPermisoVerFormTipoLicencia(Boolean isPermisoVerFormTipoLicencia) {
		this.isPermisoVerFormTipoLicencia = isPermisoVerFormTipoLicencia;
	}
	
	public Boolean getIsPermisoDuplicarTipoLicencia() {
		return isPermisoDuplicarTipoLicencia;
	}

	public void setIsPermisoDuplicarTipoLicencia(Boolean isPermisoDuplicarTipoLicencia) {
		this.isPermisoDuplicarTipoLicencia = isPermisoDuplicarTipoLicencia;
	}
	
	public Boolean getIsPermisoOrdenTipoLicencia() {
		return isPermisoOrdenTipoLicencia;
	}

	public void setIsPermisoOrdenTipoLicencia(Boolean isPermisoOrdenTipoLicencia) {
		this.isPermisoOrdenTipoLicencia = isPermisoOrdenTipoLicencia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoLicencia() {
		return isVisibilidadCeldaNuevoTipoLicencia;
	}

	public void setIsVisibilidadCeldaNuevoTipoLicencia(Boolean isVisibilidadCeldaNuevoTipoLicencia) {
		this.isVisibilidadCeldaNuevoTipoLicencia = isVisibilidadCeldaNuevoTipoLicencia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoLicencia() {
		return isVisibilidadCeldaDuplicarTipoLicencia;
	}

	public void setIsVisibilidadCeldaDuplicarTipoLicencia(Boolean isVisibilidadCeldaDuplicarTipoLicencia) {
		this.isVisibilidadCeldaDuplicarTipoLicencia = isVisibilidadCeldaDuplicarTipoLicencia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoLicencia() {
		return isVisibilidadCeldaCopiarTipoLicencia;
	}

	public void setIsVisibilidadCeldaCopiarTipoLicencia(Boolean isVisibilidadCeldaCopiarTipoLicencia) {
		this.isVisibilidadCeldaCopiarTipoLicencia = isVisibilidadCeldaCopiarTipoLicencia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoLicencia() {
		return isVisibilidadCeldaVerFormTipoLicencia;
	}

	public void setIsVisibilidadCeldaVerFormTipoLicencia(Boolean isVisibilidadCeldaVerFormTipoLicencia) {
		this.isVisibilidadCeldaVerFormTipoLicencia = isVisibilidadCeldaVerFormTipoLicencia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoLicencia() {
		return isVisibilidadCeldaOrdenTipoLicencia;
	}

	public void setIsVisibilidadCeldaOrdenTipoLicencia(Boolean isVisibilidadCeldaOrdenTipoLicencia) {
		this.isVisibilidadCeldaOrdenTipoLicencia = isVisibilidadCeldaOrdenTipoLicencia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoLicencia() {
		return isVisibilidadCeldaNuevoRelacionesTipoLicencia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoLicencia(Boolean isVisibilidadCeldaNuevoRelacionesTipoLicencia) {
		this.isVisibilidadCeldaNuevoRelacionesTipoLicencia = isVisibilidadCeldaNuevoRelacionesTipoLicencia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoLicencia() {
		return isVisibilidadCeldaModificarTipoLicencia;
	}

	public void setIsVisibilidadCeldaModificarTipoLicencia(Boolean isVisibilidadCeldaModificarTipoLicencia) {
		this.isVisibilidadCeldaModificarTipoLicencia = isVisibilidadCeldaModificarTipoLicencia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoLicencia() {
		return isVisibilidadCeldaActualizarTipoLicencia;
	}

	public void setIsVisibilidadCeldaActualizarTipoLicencia(Boolean isVisibilidadCeldaActualizarTipoLicencia) {
		this.isVisibilidadCeldaActualizarTipoLicencia = isVisibilidadCeldaActualizarTipoLicencia;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoLicencia() {
		return isVisibilidadCeldaEliminarTipoLicencia;
	}

	public void setIsVisibilidadCeldaEliminarTipoLicencia(Boolean isVisibilidadCeldaEliminarTipoLicencia) {
		this.isVisibilidadCeldaEliminarTipoLicencia = isVisibilidadCeldaEliminarTipoLicencia;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoLicencia() {
		return isVisibilidadCeldaCancelarTipoLicencia;
	}

	public void setIsVisibilidadCeldaCancelarTipoLicencia(Boolean isVisibilidadCeldaCancelarTipoLicencia) {
		this.isVisibilidadCeldaCancelarTipoLicencia = isVisibilidadCeldaCancelarTipoLicencia;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoLicencia() {
		return isVisibilidadCeldaGuardarTipoLicencia;
	}

	public void setIsVisibilidadCeldaGuardarTipoLicencia(Boolean isVisibilidadCeldaGuardarTipoLicencia) {
		this.isVisibilidadCeldaGuardarTipoLicencia = isVisibilidadCeldaGuardarTipoLicencia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoLicencia() {
		return isVisibilidadCeldaGuardarCambiosTipoLicencia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoLicencia(Boolean isVisibilidadCeldaGuardarCambiosTipoLicencia) {
		this.isVisibilidadCeldaGuardarCambiosTipoLicencia = isVisibilidadCeldaGuardarCambiosTipoLicencia;
	}
		
	public TipoLicenciaSessionBean gettipolicenciaSessionBean() {
		return this.tipolicenciaSessionBean;
	}
	
	public void settipolicenciaSessionBean(TipoLicenciaSessionBean tipolicenciaSessionBean) {
		this.tipolicenciaSessionBean=tipolicenciaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(TipoLicencia tipolicencia)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipolicencia,null);
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
	
	public void bugActualizarReferenciaActual(TipoLicencia tipolicencia,TipoLicencia tipolicenciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoLicencia(tipolicencia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipolicenciaAux.setId(tipolicencia.getId());
		tipolicenciaAux.setVersionRow(tipolicencia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoLicencia();
		
			int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipolicenciaValidator.getInvalidValues(this.tipolicencia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipolicenciaLogic.setDatosCliente(datosCliente);
			tipolicenciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipolicenciaAux=new  TipoLicencia();
				
				tipolicenciaAux.setIsNew(true);
				tipolicenciaAux.setIsChanged(true);
				
				tipolicenciaAux.setTipoLicenciaOriginal(this.tipolicencia);
				
				tipolicenciaAux.setId(this.tipolicencia.getId());	
				tipolicenciaAux.setVersionRow(this.tipolicencia.getVersionRow());	
				tipolicenciaAux.setid_empresa(this.tipolicencia.getid_empresa());	
				tipolicenciaAux.setcodigo(this.tipolicencia.getcodigo());	
				tipolicenciaAux.setnombre(this.tipolicencia.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipolicenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipolicenciaAux,tipolicenciaLogic.getTipoLicencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolicenciaAux,tipolicencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolicenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolicenciaLogic.saveTipoLicencias();//WithConnection
						//tipolicenciaLogic.getSetVersionRowTipoLicencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipolicencia,tipolicenciaAux);
					
					this.refrescarForeignKeysDescripcionesTipoLicencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolicenciaLogic.saveTipoLicenciaRelaciones(tipolicenciaAux);//WithConnection
								//tipolicenciaLogic.getSetVersionRowTipoLicencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipolicencia,tipolicenciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipolicenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipolicenciaAux,tipolicenciaLogic.getTipoLicencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipolicenciaAux,tipolicencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipolicencia,tipolicenciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipolicenciaAux=new  TipoLicencia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipolicenciaSessionBean.getEsGuardarRelacionado() && this.tipolicencia.getId()>=0)) {
						
					tipolicenciaAux.setIsNew(false);
				}
				
				tipolicenciaAux.setIsDeleted(false);
			
				tipolicenciaAux.setId(this.tipolicencia.getId());	
				tipolicenciaAux.setVersionRow(this.tipolicencia.getVersionRow());	
				tipolicenciaAux.setid_empresa(this.tipolicencia.getid_empresa());	
				tipolicenciaAux.setcodigo(this.tipolicencia.getcodigo());	
				tipolicenciaAux.setnombre(this.tipolicencia.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipolicenciaAux,tipolicenciaLogic.getTipoLicencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolicenciaAux,tipolicencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolicenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolicenciaLogic.saveTipoLicencias();//WithConnection
						//tipolicenciaLogic.getSetVersionRowTipoLicencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipolicencia,tipolicenciaAux);
					
					this.refrescarForeignKeysDescripcionesTipoLicencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolicenciaLogic.saveTipoLicenciaRelaciones(tipolicenciaAux);//WithConnection
								//tipolicenciaLogic.getSetVersionRowTipoLicencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipolicencia,tipolicenciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipolicenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipolicenciaAux,tipolicenciaLogic.getTipoLicencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipolicenciaAux,tipolicencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipolicencia,tipolicenciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipolicenciaAux=new  TipoLicencia();
				
				tipolicenciaAux.setIsNew(false);
				tipolicenciaAux.setIsChanged(false);
				
				tipolicenciaAux.setIsDeleted(true);
				
				tipolicenciaAux.setId(this.tipolicencia.getId());	
				tipolicenciaAux.setVersionRow(this.tipolicencia.getVersionRow());	
				tipolicenciaAux.setid_empresa(this.tipolicencia.getid_empresa());	
				tipolicenciaAux.setcodigo(this.tipolicencia.getcodigo());	
				tipolicenciaAux.setnombre(this.tipolicencia.getnombre());	
				
				if(this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipolicenciaAux.getId()>=0) {	
						this.tipolicenciasEliminados.add(tipolicenciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipolicenciaAux,tipolicenciaLogic.getTipoLicencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolicenciaAux,tipolicencias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolicenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolicenciaLogic.saveTipoLicencias();//WithConnection
						//tipolicenciaLogic.getSetVersionRowTipoLicencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolicenciaLogic.saveTipoLicenciaRelaciones(tipolicenciaAux);//WithConnection
								//tipolicenciaLogic.getSetVersionRowTipoLicencias();//WithConnection
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
							if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipolicenciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipolicenciaAux,tipolicenciaLogic.getTipoLicencias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipolicenciaAux,tipolicencias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.getTipoLicencias().addAll(this.tipolicenciasEliminados);
					
					tipolicenciaLogic.saveTipoLicencias();//WithConnection
					//tipolicenciaLogic.getSetVersionRowTipoLicencias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoLicencia();
				
				this.tipolicenciasEliminados= new ArrayList<TipoLicencia>();		
			}
			
			if(this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Licencia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipolicencia=tipolicenciaAux;
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
      		//this.finishProcessTipoLicencia();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoLicencia tipolicenciaLocal) throws Exception {
		
		if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoLicencia tipolicenciaLocal) throws Exception {	
		if(this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipolicenciaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoLicenciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipolicenciaValidator.getInvalidValues(this.tipolicencia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoLicencia tipolicencia,List<TipoLicencia> tipolicencias) throws Exception {
		try	{		
			TipoLicenciaConstantesFunciones.actualizarLista(tipolicencia,tipolicencias,this.tipolicenciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoLicencia tipolicencia,List<TipoLicencia> tipolicencias) throws Exception {
		try	{			
			TipoLicenciaConstantesFunciones.actualizarSelectedLista(tipolicencia,tipolicencias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoLicencia> tipolicenciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipolicenciasLocal=this.tipolicenciaLogic.getTipoLicencias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipolicenciasLocal=this.tipolicencias;
			}
			//ARCHITECTURE
		
			for(TipoLicencia tipolicenciaLocal:tipolicenciasLocal) {
				if(this.permiteMantenimiento(tipolicenciaLocal) && tipolicenciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoLicenciaConstantesFunciones.getTipoLicenciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoLicenciaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLicencia.jLabelid_empresaTipoLicencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoLicenciaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLicencia.jLabelcodigoTipoLicencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoLicenciaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLicencia.jLabelnombreTipoLicencia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLicencia.jLabelid_empresaTipoLicencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLicencia.jLabelcodigoTipoLicencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLicencia.jLabelnombreTipoLicencia,"");
		
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
		this.iIdNuevoTipoLicencia--;	
		
		
		this.tipolicenciaAux=new TipoLicencia();
		
		this.tipolicenciaAux.setId(this.iIdNuevoTipoLicencia);
		this.tipolicenciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipolicenciaLogic.getTipoLicencias().add(this.tipolicenciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipolicencias.add(this.tipolicenciaAux);
		}
		//ARCHITECTURE
		
		this.tipolicencia=this.tipolicenciaAux;
		
		if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoLicencia(this.tipolicencia);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoLicencia(this.tipolicencia);
		}
				
		//this.setDefaultControlesTipoLicencia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoLicencia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoLicencia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLicencia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoLicencia(this.tipolicenciaBean,this.tipolicencia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoLicenciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
			classes=TipoLicenciaConstantesFunciones.getClassesRelationshipsOfTipoLicencia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipolicenciaReturnGeneral=tipolicenciaLogic.procesarEventosTipoLicenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolicenciaLogic.getTipoLicencias(),this.tipolicencia,this.tipolicenciaParameterGeneral,this.isEsNuevoTipoLicencia,classes);//this.tipolicenciaLogic.getTipoLicencia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoLicencia(this.tipolicenciaReturnGeneral,this.tipolicenciaBean,false);
		
		if(this.tipolicenciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoLicencia(this.tipolicenciaReturnGeneral.getTipoLicencia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoLicencia(this.tipolicenciaReturnGeneral.getTipoLicencia());
		}
		
		if(this.tipolicenciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoLicencia(this.tipolicenciaReturnGeneral.getTipoLicencia(),classes);//this.tipolicenciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoLicencia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoLicencia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.RecargarFormTipoLicencia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoLicencia(false);
						
			if(tipolicenciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLicencia();
			}
			
			this.actualizarVisualTableDatosTipoLicencia();
			
			this.jTableDatosTipoLicencia.setRowSelectionInterval(this.getIndiceNuevoTipoLicencia(), this.getIndiceNuevoTipoLicencia());
			
			this.seleccionarFilaTablaTipoLicenciaActual();
						
			this.actualizarEstadoCeldasBotonesTipoLicencia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoLicencia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoLicencia.jTextFieldcodigoTipoLicencia.setEnabled(isHabilitar && this.tipolicenciaConstantesFunciones.activarcodigoTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jTextAreanombreTipoLicencia.setEnabled(isHabilitar && this.tipolicenciaConstantesFunciones.activarnombreTipoLicencia);	
		//
		this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setEnabled(isHabilitar && this.tipolicenciaConstantesFunciones.activarid_empresaTipoLicencia);
	};
	
	public void setDefaultControlesTipoLicencia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoLicencia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipolicenciaSessionBean.setConGuardarRelaciones(true);			
			this.tipolicenciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.setVisible(true);
			
					
		} else {
			//this.tipolicenciaSessionBean.setConGuardarRelaciones(false);			
			this.tipolicenciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoLicencia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
				if(tipolicenciaAux.getId().equals(this.iIdNuevoTipoLicencia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLicencia tipolicenciaAux:this.tipolicencias) {
				if(tipolicenciaAux.getId().equals(this.iIdNuevoTipoLicencia)) {
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
	
	public int getIndiceActualTipoLicencia(TipoLicencia tipolicencia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
				if(tipolicenciaAux.getId().equals(tipolicencia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLicencia tipolicenciaAux:this.tipolicencias) {
				if(tipolicenciaAux.getId().equals(tipolicencia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoLicencia(TipoLicencia tipolicenciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
				if(tipolicenciaAux.getTipoLicenciaOriginal().getId().equals(tipolicenciaOriginal.getId())) {
					existe=true;
					tipolicenciaOriginal.setId(tipolicenciaAux.getId());
					tipolicenciaOriginal.setVersionRow(tipolicenciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLicencia tipolicenciaAux:this.tipolicencias) {
				if(tipolicenciaAux.getTipoLicenciaOriginal().getId().equals(tipolicenciaOriginal.getId())) {
					existe=true;
					tipolicenciaOriginal.setId(tipolicenciaAux.getId());
					tipolicenciaOriginal.setVersionRow(tipolicenciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoLicencia(Boolean esParaCancelar) throws Exception {
		tipolicenciasAux=new ArrayList<TipoLicencia>();
		tipolicenciaAux=new TipoLicencia();
		
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
					if(tipolicenciaAux.getId()<0) {
						tipolicenciasAux.add(tipolicenciaAux);
					}		
				}
				this.iIdNuevoTipoLicencia=0L;
				this.tipolicenciaLogic.getTipoLicencias().removeAll(tipolicenciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLicencia tipolicenciaAux:this.tipolicencias) {
					if(tipolicenciaAux.getId()<0) {
						tipolicenciasAux.add(tipolicenciaAux);
					}		
				}
				this.iIdNuevoTipoLicencia=0L;
				this.tipolicencias.removeAll(tipolicenciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoLicencia 
					&& this.tipolicenciaLogic.getTipoLicencias().size()>0
					) {
					tipolicenciaAux=this.tipolicenciaLogic.getTipoLicencias().get(this.tipolicenciaLogic.getTipoLicencias().size() - 1);
				
					if(tipolicenciaAux.getId()<0) {
						this.tipolicenciaLogic.getTipoLicencias().remove(tipolicenciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoLicencia && this.tipolicencias.size()>0) {
					tipolicenciaAux=this.tipolicencias.get(this.tipolicencias.size() - 1);
				
					if(tipolicenciaAux.getId()<0) {
						this.tipolicencias.remove(tipolicenciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoLicencia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipolicencia.getId()<0) {
				this.tipolicenciaLogic.getTipoLicencias().remove(this.tipolicencia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipolicencia.getId()<0) {
				this.tipolicencias.remove(this.tipolicencia);
			}
		}			
	}
	
	public void setEstadosInicialesTipoLicencia(List<TipoLicencia> tipolicenciasAux) throws Exception {
		TipoLicenciaConstantesFunciones.setEstadosInicialesTipoLicencia(tipolicenciasAux);
	}
	
	public void setEstadosInicialesTipoLicencia(TipoLicencia tipolicenciaAux) throws Exception {
		TipoLicenciaConstantesFunciones.setEstadosInicialesTipoLicencia(tipolicenciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoLicenciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoLicencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoLicenciaActual()) {
				if(!this.isEsNuevoTipoLicencia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoLicencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoLicencia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoLicenciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Licencia ?", "MANTENIMIENTO DE Tipo Licencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoLicencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoLicencia tipolicencia) throws Exception {
		TipoLicenciaConstantesFunciones.seleccionarAsignar(this.tipolicencia,tipolicencia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoLicencia=this.isPermisoActualizarOriginalTipoLicencia;
			
			
			this.seleccionarAsignar(tipolicencia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoLicenciaConstantesFunciones.quitarEspaciosTipoLicencia(this.tipolicencia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoLicencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipolicenciaSessionBean.setsFuncionBusquedaRapida(this.tipolicenciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoLicencia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoLicencia(esParaCancelar);				
				this.cancelarNuevoTipoLicencia(esParaCancelar);								
			}
			
			this.tipolicencia=new TipoLicencia();
			
			this.inicializarTipoLicencia();
			
			this.actualizarEstadoCeldasBotonesTipoLicencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoLicencia() throws Exception {
		try {
			TipoLicenciaConstantesFunciones.inicializarTipoLicencia(this.tipolicencia);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipolicenciaLogic.getTipoLicencias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoLicencias(String sAccionBusqueda,List<TipoLicencia> tipolicenciasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoLicencia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoLicenciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoLicenciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoLicencia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Licencias");		
		parameters.put("busquedapor", TipoLicenciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoLicencia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoLicenciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoLicenciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoLicencia=new JRBeanArrayDataSource(TipoLicenciaJInternalFrame.TraerTipoLicenciaBeans(tipolicenciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoLicencia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoLicenciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoLicenciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoLicenciaBean.TraerTipoLicenciaBeans(tipolicenciasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoLicencias(sAccionBusqueda,sTipoArchivoReporte,tipolicenciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoLicencias(sAccionBusqueda,sTipoArchivoReporte,tipolicenciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoLicenciaActionPerformed(null);
					//this.generarExcelReporteTipoLicencias(sAccionBusqueda,sTipoArchivoReporte,tipolicenciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoLicencias(sAccionBusqueda,sTipoArchivoReporte,tipolicenciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoLicencias(sAccionBusqueda,sTipoArchivoReporte,tipolicenciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoLicencias(sAccionBusqueda,sTipoArchivoReporte,tipolicenciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoLicencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLicencia> tipolicenciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolicencia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLicencias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoLicencia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoLicencia tipolicencia : tipolicenciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoLicenciaConstantesFunciones.generarExcelReporteDataTipoLicencia("NORMAL",row,workbook,tipolicencia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoLicencia(String sTipo,Row row,Workbook workbook) {
		
		TipoLicenciaConstantesFunciones.generarExcelReporteHeaderTipoLicencia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoLicencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLicencia> tipolicenciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolicencia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLicencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoLicencia tipolicencia : tipolicenciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoLicenciaConstantesFunciones.getTipoLicenciaDescripcion(tipolicencia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolicencia.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLicenciaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolicencia.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLicenciaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolicencia.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoLicencias(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLicencia> tipolicenciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoLicencia> tipolicenciasRespaldo=null;
		
		classes=TipoLicenciaConstantesFunciones.getClassesRelationshipsOfTipoLicencia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipolicenciaLogic.setDatosCliente(this.datosCliente);
		this.tipolicenciaLogic.setDatosDeep(this.datosDeep);
		this.tipolicenciaLogic.setIsConDeep(true);
		
		tipolicenciasRespaldo=this.tipolicenciaLogic.getTipoLicencias();
		
		this.tipolicenciaLogic.setTipoLicencias(tipolicenciasParaReportes);	
		this.tipolicenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipolicenciasParaReportes=this.tipolicenciaLogic.getTipoLicencias();
		this.tipolicenciaLogic.setTipoLicencias(tipolicenciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolicencia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLicencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoLicencia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoLicencia tipolicencia : tipolicenciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoLicencia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoLicenciaConstantesFunciones.generarExcelReporteDataTipoLicencia("NORMAL",row,workbook,tipolicencia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoLicenciaConstantesFunciones.getTipoLicenciaDescripcion(tipolicencia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLicencia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoLicencia() throws Exception {		
		this.startProcessTipoLicencia(true);
	}
	
	public void startProcessTipoLicencia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoLicencia ,this.jPanelParametrosReportesTipoLicencia, this.jScrollPanelDatosTipoLicencia,this.jPanelPaginacionTipoLicencia, this.jScrollPanelDatosEdicionTipoLicencia, this.jPanelAccionesTipoLicencia,this.jPanelAccionesFormularioTipoLicencia,this.jmenuBarTipoLicencia,this.jmenuBarDetalleTipoLicencia,this.jTtoolBarTipoLicencia,this.jTtoolBarDetalleTipoLicencia);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoLicencia=this.jTabbedPaneBusquedasTipoLicencia; 
		
		final JPanel jPanelParametrosReportesTipoLicencia=this.jPanelParametrosReportesTipoLicencia;
		//final JScrollPane jScrollPanelDatosTipoLicencia=this.jScrollPanelDatosTipoLicencia;
		final JTable jTableDatosTipoLicencia=this.jTableDatosTipoLicencia;		
		final JPanel jPanelPaginacionTipoLicencia=this.jPanelPaginacionTipoLicencia;
		//final JScrollPane jScrollPanelDatosEdicionTipoLicencia=this.jScrollPanelDatosEdicionTipoLicencia;
		final JPanel jPanelAccionesTipoLicencia=this.jPanelAccionesTipoLicencia;
		
		JPanel jPanelCamposAuxiliarTipoLicencia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoLicencia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			jPanelCamposAuxiliarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jPanelCamposTipoLicencia;
			jPanelAccionesFormularioAuxiliarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jPanelAccionesFormularioTipoLicencia;
		}
		
		final JPanel jPanelCamposTipoLicencia=jPanelCamposAuxiliarTipoLicencia;
		final JPanel jPanelAccionesFormularioTipoLicencia=jPanelAccionesFormularioAuxiliarTipoLicencia;
		
		
		final JMenuBar jmenuBarTipoLicencia=this.jmenuBarTipoLicencia;
		final JToolBar jTtoolBarTipoLicencia=this.jTtoolBarTipoLicencia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoLicencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoLicencia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			jmenuBarDetalleAuxiliarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jmenuBarDetalleTipoLicencia;
			jTtoolBarDetalleAuxiliarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jTtoolBarDetalleTipoLicencia;
		}
		
		final JMenuBar jmenuBarDetalleTipoLicencia=jmenuBarDetalleAuxiliarTipoLicencia;
		final JToolBar jTtoolBarDetalleTipoLicencia=jTtoolBarDetalleAuxiliarTipoLicencia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoLicencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoLicencia;
			processRunnable.jTableDatos=jTableDatosTipoLicencia;
			processRunnable.jPanelCampos=jPanelCamposTipoLicencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoLicencia;
			processRunnable.jPanelAcciones=jPanelAccionesTipoLicencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoLicencia;
			
			
			processRunnable.jmenuBar=jmenuBarTipoLicencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoLicencia;
			processRunnable.jTtoolBar=jTtoolBarTipoLicencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoLicencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoLicencia ,jPanelParametrosReportesTipoLicencia,jTableDatosTipoLicencia, /*jScrollPanelDatosTipoLicencia,*/jPanelCamposTipoLicencia,jPanelPaginacionTipoLicencia, /*jScrollPanelDatosEdicionTipoLicencia,*/ jPanelAccionesTipoLicencia,jPanelAccionesFormularioTipoLicencia,jmenuBarTipoLicencia,jmenuBarDetalleTipoLicencia,jTtoolBarTipoLicencia,jTtoolBarDetalleTipoLicencia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoLicencia ,jPanelParametrosReportesTipoLicencia, jScrollPanelDatosTipoLicencia,jPanelPaginacionTipoLicencia, jScrollPanelDatosEdicionTipoLicencia, jPanelAccionesTipoLicencia,jPanelAccionesFormularioTipoLicencia,jmenuBarTipoLicencia,jmenuBarDetalleTipoLicencia,jTtoolBarTipoLicencia,jTtoolBarDetalleTipoLicencia);
						
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
	
	public void finishProcessTipoLicencia() {// throws Exception 
		this.finishProcessTipoLicencia(true);
	}
	
	public void finishProcessTipoLicencia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoLicencia ,this.jPanelParametrosReportesTipoLicencia, this.jScrollPanelDatosTipoLicencia,this.jPanelPaginacionTipoLicencia, this.jScrollPanelDatosEdicionTipoLicencia, this.jPanelAccionesTipoLicencia,this.jPanelAccionesFormularioTipoLicencia,this.jmenuBarTipoLicencia,this.jmenuBarDetalleTipoLicencia,this.jTtoolBarTipoLicencia,this.jTtoolBarDetalleTipoLicencia);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoLicencia=this.jTabbedPaneBusquedasTipoLicencia; 
		
		final JPanel jPanelParametrosReportesTipoLicencia=this.jPanelParametrosReportesTipoLicencia;
		//final JScrollPane jScrollPanelDatosTipoLicencia=this.jScrollPanelDatosTipoLicencia;
		final JTable jTableDatosTipoLicencia=this.jTableDatosTipoLicencia;		
		final JPanel jPanelPaginacionTipoLicencia=this.jPanelPaginacionTipoLicencia;
		//final JScrollPane jScrollPanelDatosEdicionTipoLicencia=this.jScrollPanelDatosEdicionTipoLicencia;
		final JPanel jPanelAccionesTipoLicencia=this.jPanelAccionesTipoLicencia;
		
		JPanel jPanelCamposAuxiliarTipoLicencia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoLicencia=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			jPanelCamposAuxiliarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jPanelCamposTipoLicencia;
			jPanelAccionesFormularioAuxiliarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jPanelAccionesFormularioTipoLicencia;
		}
		
		final JPanel jPanelCamposTipoLicencia=jPanelCamposAuxiliarTipoLicencia;
		final JPanel jPanelAccionesFormularioTipoLicencia=jPanelAccionesFormularioAuxiliarTipoLicencia;
		
		
		final JMenuBar jmenuBarTipoLicencia=this.jmenuBarTipoLicencia;		
		final JToolBar jTtoolBarTipoLicencia=this.jTtoolBarTipoLicencia;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoLicencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoLicencia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			jmenuBarDetalleAuxiliarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jmenuBarDetalleTipoLicencia;
			jTtoolBarDetalleAuxiliarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jTtoolBarDetalleTipoLicencia;		
		}
		
		final JMenuBar jmenuBarDetalleTipoLicencia=jmenuBarDetalleAuxiliarTipoLicencia;
		final JToolBar jTtoolBarDetalleTipoLicencia=jTtoolBarDetalleAuxiliarTipoLicencia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoLicencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoLicencia;
			processRunnable.jTableDatos=jTableDatosTipoLicencia;
			processRunnable.jPanelCampos=jPanelCamposTipoLicencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoLicencia;
			processRunnable.jPanelAcciones=jPanelAccionesTipoLicencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoLicencia;
			
			
			processRunnable.jmenuBar=jmenuBarTipoLicencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoLicencia;
			processRunnable.jTtoolBar=jTtoolBarTipoLicencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoLicencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoLicencia ,jPanelParametrosReportesTipoLicencia, jTableDatosTipoLicencia,/*jScrollPanelDatosTipoLicencia,*/jPanelCamposTipoLicencia,jPanelPaginacionTipoLicencia, /*jScrollPanelDatosEdicionTipoLicencia,*/ jPanelAccionesTipoLicencia,jPanelAccionesFormularioTipoLicencia,jmenuBarTipoLicencia,jmenuBarDetalleTipoLicencia,jTtoolBarTipoLicencia,jTtoolBarDetalleTipoLicencia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoLicencia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoLicencia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoLicencia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoLicencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoLicencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoLicencia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoLicencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoLicencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoLicencia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipolicenciaConstantesFunciones.getsFinalQueryTipoLicencia();
		String  finalQueryPaginacionTodos=this.tipolicenciaConstantesFunciones.getsFinalQueryTipoLicencia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoLicenciaConstantesFunciones.getArrayColumnasGlobalesNoTipoLicencia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoLicenciaConstantesFunciones.getArrayColumnasGlobalesTipoLicencia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoLicenciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipolicenciasEliminados= new ArrayList<TipoLicencia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoLicencia();
		
				///*TipoLicenciaSessionBean*/this.tipolicenciaSessionBean=new TipoLicenciaSessionBean();
			
			if(this.tipolicenciaSessionBean==null) {
				this.tipolicenciaSessionBean=new TipoLicenciaSessionBean();
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
					this.iNumeroPaginacion=TipoLicenciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoLicenciaConstantesFunciones.getClassesForeignKeysOfTipoLicencia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipolicencia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipolicenciasAux= new ArrayList<TipoLicencia>();
			
				
			tipolicenciaLogic.setDatosCliente(this.datosCliente);
			tipolicenciaLogic.setDatosDeep(this.datosDeep);
			tipolicenciaLogic.setIsConDeep(true);
			
			
			tipolicenciaLogic.getTipoLicenciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipolicenciaLogic.getTodosTipoLicencias(finalQueryGlobal,pagination);
					
					//tipolicenciaLogic.getTodosTipoLicenciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipolicenciaLogic.getTipoLicencias()==null|| tipolicenciaLogic.getTipoLicencias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolicenciasAux= new ArrayList<TipoLicencia>();
							tipolicenciasAux.addAll(tipolicenciaLogic.getTipoLicencias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolicenciasAux= new ArrayList<TipoLicencia>();
							tipolicenciasAux.addAll(tipolicencias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolicenciaLogic.getTodosTipoLicencias(finalQueryGlobal+"",this.pagination);												
							
							//tipolicenciaLogic.getTodosTipoLicenciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoLicencias("Todos",tipolicenciaLogic.getTipoLicencias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolicenciaLogic.setTipoLicencias(new ArrayList<TipoLicencia>());					
							tipolicenciaLogic.getTipoLicencias().addAll(tipolicenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolicencias=new ArrayList<TipoLicencia>();
							tipolicencias.addAll(tipolicenciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoLicencia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoLicencia=this.idActual;
				
				} else if(this.idTipoLicenciaActual!=null && this.idTipoLicenciaActual!=0L) {
					idTipoLicencia=idTipoLicenciaActual;
				}
				
					
				this.sDetalleReporte=TipoLicenciaConstantesFunciones.getDetalleIndicePorId(idTipoLicencia);
				
				this.tipolicencias=new ArrayList<TipoLicencia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipolicenciaLogic.getEntity(idTipoLicencia);
					
					//tipolicenciaLogic.getEntityWithConnection(idTipoLicencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolicenciaLogic.setTipoLicencias(new ArrayList<TipoLicencia>());
					tipolicenciaLogic.getTipoLicencias().add(tipolicenciaLogic.getTipoLicencia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolicencias=new ArrayList<TipoLicencia>();
					this.tipolicencias.add(tipolicencia);
				}
				
				if(tipolicenciaLogic.getTipoLicencia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoLicenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipolicenciaLogic.getTipoLicenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLicenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLicenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipolicenciaLogic.getTipoLicencias()==null||tipolicenciaLogic.getTipoLicencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipolicencias==null|| tipolicencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolicenciasAux=new ArrayList<TipoLicencia>();
						tipolicenciasAux.addAll(tipolicenciaLogic.getTipoLicencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolicenciasAux=new ArrayList<TipoLicencia>();
							tipolicenciasAux.addAll(tipolicencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipolicenciaLogic.getTipoLicenciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLicenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLicenciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoLicencias("FK_IdEmpresa",tipolicenciaLogic.getTipoLicencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoLicencias("FK_IdEmpresa",tipolicencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolicenciaLogic.setTipoLicencias(new ArrayList<TipoLicencia>());
						tipolicenciaLogic.getTipoLicencias().addAll(tipolicenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolicencias=new ArrayList<TipoLicencia>();
							tipolicencias.addAll(tipolicenciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoLicencia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoLicencia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipolicenciaLogic.getTipoLicencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolicencias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipolicenciaLogic.getTipoLicencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolicencias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoLicencia tipolicencia) {
		Boolean permite=true;
		
		if(this.tipolicencia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoLicenciaConstantesFunciones.getOrderByListaTipoLicencia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoLicenciaConstantesFunciones.getOrderByListaTipoLicencia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLicencia tipolicencia:tipolicenciaLogic.getTipoLicencias()) {
				if(tipolicencia.getsType().equals(Constantes2.S_TOTALES)) {
					tipolicenciaTotales=tipolicencia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLicencia tipolicencia:this.tipolicencias) {
				if(tipolicencia.getsType().equals(Constantes2.S_TOTALES)) {
					tipolicenciaTotales=tipolicencia;
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
			this.tipolicenciaAux=new TipoLicencia();
			this.tipolicenciaAux.setsType(Constantes2.S_TOTALES);
			this.tipolicenciaAux.setIsNew(false);
			this.tipolicenciaAux.setIsChanged(false);
			this.tipolicenciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoLicenciaConstantesFunciones.TotalizarValoresFilaTipoLicencia(this.tipolicenciaLogic.getTipoLicencias(),this.tipolicenciaAux);
				
				this.tipolicenciaLogic.getTipoLicencias().add(this.tipolicenciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoLicenciaConstantesFunciones.TotalizarValoresFilaTipoLicencia(this.tipolicencias,this.tipolicenciaAux);
				
				this.tipolicencias.add(this.tipolicenciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipolicenciaTotales=new TipoLicencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipolicenciaLogic.getTipoLicencias().remove(tipolicenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipolicencias.remove(tipolicenciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipolicenciaTotales=new TipoLicencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLicencia tipolicencia:tipolicenciaLogic.getTipoLicencias()) {
				if(tipolicencia.getsType().equals(Constantes2.S_TOTALES)) {
					tipolicenciaTotales=tipolicencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoLicenciaConstantesFunciones.TotalizarValoresFilaTipoLicencia(this.tipolicenciaLogic.getTipoLicencias(),tipolicenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLicencia tipolicencia:this.tipolicencias) {
				if(tipolicencia.getsType().equals(Constantes2.S_TOTALES)) {
					tipolicenciaTotales=tipolicencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoLicenciaConstantesFunciones.TotalizarValoresFilaTipoLicencia(this.tipolicencias,tipolicenciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoLicenciasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoLicenciasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolicenciaLogic.getTipoLicenciasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoLicencia() {
		this.isPermisoTodoTipoLicencia=false;
		this.isPermisoNuevoTipoLicencia=false;
		this.isPermisoActualizarTipoLicencia=false;
		this.isPermisoActualizarOriginalTipoLicencia=false;
		this.isPermisoEliminarTipoLicencia=false;
		this.isPermisoGuardarCambiosTipoLicencia=false;
		this.isPermisoConsultaTipoLicencia=false;
		this.isPermisoBusquedaTipoLicencia=false;
		this.isPermisoReporteTipoLicencia=false;		
		this.isPermisoOrdenTipoLicencia=false;		
		this.isPermisoPaginacionMedioTipoLicencia=false;		
		this.isPermisoPaginacionAltoTipoLicencia=false;
		this.isPermisoPaginacionTodoTipoLicencia=false;
		this.isPermisoCopiarTipoLicencia=false;		
		this.isPermisoVerFormTipoLicencia=false;		
		this.isPermisoDuplicarTipoLicencia=false;		
		this.isPermisoOrdenTipoLicencia=false;		
	}
	
	public void setPermisosUsuarioTipoLicencia(Boolean isPermiso) {
		this.isPermisoTodoTipoLicencia=isPermiso;
		this.isPermisoNuevoTipoLicencia=isPermiso;
		this.isPermisoActualizarTipoLicencia=isPermiso;
		this.isPermisoActualizarOriginalTipoLicencia=isPermiso;
		this.isPermisoEliminarTipoLicencia=isPermiso;
		this.isPermisoGuardarCambiosTipoLicencia=isPermiso;
		this.isPermisoConsultaTipoLicencia=isPermiso;
		this.isPermisoBusquedaTipoLicencia=isPermiso;
		this.isPermisoReporteTipoLicencia=isPermiso;
		this.isPermisoOrdenTipoLicencia=isPermiso;		
		this.isPermisoPaginacionMedioTipoLicencia=isPermiso;		
		this.isPermisoPaginacionAltoTipoLicencia=isPermiso;		
		this.isPermisoPaginacionTodoTipoLicencia=isPermiso;		
		this.isPermisoCopiarTipoLicencia=isPermiso;		
		this.isPermisoVerFormTipoLicencia=isPermiso;		
		this.isPermisoDuplicarTipoLicencia=isPermiso;
		this.isPermisoOrdenTipoLicencia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoLicencia(Boolean isPermiso) {
		//this.isPermisoTodoTipoLicencia=isPermiso;
		this.isPermisoNuevoTipoLicencia=isPermiso;
		this.isPermisoActualizarTipoLicencia=isPermiso;
		this.isPermisoActualizarOriginalTipoLicencia=isPermiso;
		this.isPermisoEliminarTipoLicencia=isPermiso;
		this.isPermisoGuardarCambiosTipoLicencia=isPermiso;
		//this.isPermisoConsultaTipoLicencia=isPermiso;
		//this.isPermisoBusquedaTipoLicencia=isPermiso;
		//this.isPermisoReporteTipoLicencia=isPermiso;
		//this.isPermisoOrdenTipoLicencia=isPermiso;		
		//this.isPermisoPaginacionMedioTipoLicencia=isPermiso;		
		//this.isPermisoPaginacionAltoTipoLicencia=isPermiso;		
		//this.isPermisoPaginacionTodoTipoLicencia=isPermiso;		
		//this.isPermisoCopiarTipoLicencia=isPermiso;		
		//this.isPermisoDuplicarTipoLicencia=isPermiso;
		//this.isPermisoOrdenTipoLicencia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoLicenciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoLicenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoLicencia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoLicenciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoLicenciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoLicenciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoLicenciaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoLicencia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoLicenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoLicenciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoLicencia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoLicencia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoLicencia=this.isPermisoActualizarTipoLicencia;
			this.isPermisoEliminarTipoLicencia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoLicencia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoLicencia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoLicencia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoLicencia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoLicencia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoLicencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoLicencia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoLicencia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoLicencia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoLicencia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoLicencia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoLicencia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoLicencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoLicencia.setToolTipText(this.jTableDatosTipoLicencia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoLicencia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoLicencia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoLicenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoLicenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoLicencia() throws Exception {
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
	public void inicializarCombosForeignKeyTipoLicenciaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoLicenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoLicenciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoLicenciaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoLicenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoLicenciaParameterReturnGeneral tipolicenciaReturnGeneral=new TipoLicenciaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipolicenciaConstantesFunciones.cargarid_empresaTipoLicencia)
					 || (this.esRecargarFks && this.tipolicenciaConstantesFunciones.cargarid_empresaTipoLicencia)) {

					if(!this.tipolicenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipolicenciaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipolicenciaReturnGeneral=tipolicenciaLogic.cargarCombosLoteForeignKeyTipoLicencia(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipolicenciaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoLicencia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipolicenciaSessionBean==null) {
				this.tipolicenciaSessionBean=new TipoLicenciaSessionBean();
			}

			if(!this.tipolicenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoLicencia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoLicencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoLicencia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLicencia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoLicencia(TipoLicencia tipolicencia)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoLicencia(TipoLicencia tipolicencia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoLicencia()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLicencia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoLicencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoLicencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoLicencia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoLicencia()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoLicencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoLicencia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia!=null && this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoLicenciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoLicenciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoLicenciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipolicenciaSessionBean=new TipoLicenciaSessionBean(); 
		this.tipolicenciaConstantesFunciones=new TipoLicenciaConstantesFunciones(); 
		this.tipolicenciaBean=new TipoLicencia();//(this.tipolicenciaConstantesFunciones); 		
		this.tipolicenciaReturnGeneral=new TipoLicenciaParameterReturnGeneral(); 
		
		this.tipolicenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolicenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoLicenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoLicenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoLicenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoLicencia(true);
			
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
			
			this.tipolicenciaConstantesFunciones=new TipoLicenciaConstantesFunciones(); 
			this.tipolicenciaBean=new TipoLicencia();//this.tipolicenciaConstantesFunciones); 			
			this.tipolicenciaReturnGeneral=new TipoLicenciaParameterReturnGeneral(); 
		
			TipoLicenciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Licencia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipolicencia=new TipoLicencia();
			this.tipolicencias = new ArrayList<TipoLicencia>();
			this.tipolicenciasAux = new ArrayList<TipoLicencia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic=new TipoLicenciaLogic();
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipolicenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipolicenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoLicencia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoLicencia);	
					}
					
					if(this.jInternalFrameImportacionTipoLicencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoLicencia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoLicencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoLicencia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoLicencia);
				this.jInternalFrameDetalleFormTipoLicencia.setVisible(false);
				this.jInternalFrameDetalleFormTipoLicencia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoLicencia);
					this.jInternalFrameReporteDinamicoTipoLicencia.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoLicencia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoLicencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoLicencia);
					this.jInternalFrameImportacionTipoLicencia.setVisible(false);
					this.jInternalFrameImportacionTipoLicencia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoLicencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoLicencia);
					this.jInternalFrameOrderByTipoLicencia.setVisible(false);
					this.jInternalFrameOrderByTipoLicencia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoLicenciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoLicenciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipolicenciaReturnGeneral=new TipoLicenciaParameterReturnGeneral();
			
			this.tipolicenciaParameterGeneral=new TipoLicenciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipolicenciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoLicenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoLicenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipolicenciaSessionBean.getEsGuardarRelacionado(),this.tipolicenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoLicenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipolicenciaSessionBean.getEsGuardarRelacionado(),this.tipolicenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoLicencia=false;
			this.isVisibilidadCeldaDuplicarTipoLicencia=true;
			this.isVisibilidadCeldaCopiarTipoLicencia=true;
			this.isVisibilidadCeldaVerFormTipoLicencia=true;
			this.isVisibilidadCeldaOrdenTipoLicencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
			this.isVisibilidadCeldaModificarTipoLicencia=false;
			this.isVisibilidadCeldaActualizarTipoLicencia=false;
			this.isVisibilidadCeldaEliminarTipoLicencia=false;
			this.isVisibilidadCeldaCancelarTipoLicencia=false;
			this.isVisibilidadCeldaGuardarTipoLicencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoLicencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoLicencia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoLicencia(false);
			
			this.setPermisosUsuarioTipoLicencia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipolicenciaSessionBean.getEsGuardarRelacionado() && this.tipolicenciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoLicenciaClasesRelacionadas();
			}
			
			if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoLicenciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoLicencia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoLicencia();
			}
			
			if(!this.isPermisoBusquedaTipoLicencia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoLicencia,this.isPermisoPaginacionMedioTipoLicencia,this.isPermisoPaginacionTodoTipoLicencia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoLicenciaConstantesFunciones.getTiposSeleccionarTipoLicencia());
				
				this.tiposColumnasSelect=TipoLicenciaConstantesFunciones.getTiposSeleccionarTipoLicencia(true);
				
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
			//if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoLicencia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoLicencia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoLicencia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLicencia() ;
			
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
				tipolicenciaImplementable= (TipoLicenciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoLicenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipolicenciaImplementableHome= (TipoLicenciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoLicenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipolicencias= new ArrayList<TipoLicencia>();
			this.tipolicenciasEliminados= new ArrayList<TipoLicencia>();
						
			this.isEsNuevoTipoLicencia=false;
			this.esParaAccionDesdeFormularioTipoLicencia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoLicencia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoLicencia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoLicenciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoLicenciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoLicencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoLicencia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoLicencia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoLicencia();
			}
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoLicencia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoLicencia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoLicencia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoLicencia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoLicencia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoLicencia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoLicencia")) {
				iIndex=this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoLicencia();	
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
	
	public void cargarCombosForeignKeyTipoLicencia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoLicencia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoLicencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoLicenciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoLicencia();
		
		this.cargarCombosFrameForeignKeyTipoLicencia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoLicencia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoLicencia();
		}
	}
	
	
	
	public void jButtonNuevoTipoLicenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
			
			if(jTableDatosTipoLicencia.getRowCount()>=1) {
				jTableDatosTipoLicencia.removeRowSelectionInterval(0, jTableDatosTipoLicencia.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoLicencia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoLicencia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoLicencia(true);			
			//this.tipolicencia=new TipoLicencia();
			//this.tipolicencia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLicencia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLicencia() ;
			
			if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLicencia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipolicencia);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);				
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
			if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoLicencia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoLicenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoLicencia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoLicencia.getSelectedRows().length;			
			}
			
			tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoLicencia--;			
				//TipoLicencia tipolicenciaAux= new TipoLicencia();			
				//tipolicenciaAux.setId(this.iIdNuevoTipoLicencia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoLicencia tipolicenciaOrigen=new TipoLicencia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoLicencia tipolicenciaOrigen : tipolicenciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipolicenciaOrigen =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolicenciaOrigen =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoLicencia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipolicencia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoLicencia(tipolicenciaOrigen,this.tipolicencia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipolicenciaLogic.getTipoLicencias().add(this.tipolicenciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipolicencias.add(this.tipolicenciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoLicencia(false);
				
				this.jTableDatosTipoLicencia.setRowSelectionInterval(this.getIndiceNuevoTipoLicencia(), this.getIndiceNuevoTipoLicencia());
				
				int iLastRow =  this.jTableDatosTipoLicencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoLicencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoLicencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLicencia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();									
		
			TipoLicencia tipolicenciaOrigen=new TipoLicencia();
			TipoLicencia tipolicenciaDestino=new TipoLicencia();
				
			tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoLicencia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipolicenciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoLicencia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolicenciaOrigen =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipolicenciaOrigen =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolicenciaDestino =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipolicenciaDestino =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipolicenciaOrigen =tipolicenciasSeleccionados.get(0);
				tipolicenciaDestino =tipolicenciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoLicencia(tipolicenciaOrigen,tipolicenciaDestino,true,false);
				
				tipolicenciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipolicenciaDestino,tipolicenciaLogic.getTipoLicencias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolicenciaDestino,tipolicencias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoLicencia(false);
				
				//this.jTableDatosTipoLicencia.setRowSelectionInterval(this.getIndiceNuevoTipoLicencia(), this.getIndiceNuevoTipoLicencia());
				
				int iLastRow =  this.jTableDatosTipoLicencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoLicencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoLicencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLicencia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoLicencia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoLicencia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoLicencia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoLicencia.setVisible(!isVisible);
			this.jPanelPaginacionTipoLicencia.setVisible(!isVisible);
			this.jPanelAccionesTipoLicencia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoLicencia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoLicencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoLicencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoLicencia();
			
			this.abrirFrameOrderByTipoLicencia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoLicencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoLicencia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoLicencia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoLicencia.isMaximum()) {
					this.jInternalFrameDetalleFormTipoLicencia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoLicencia.setSize(this.jInternalFrameDetalleFormTipoLicencia.iWidthFormulario,this.jInternalFrameDetalleFormTipoLicencia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoLicencia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoLicencia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoLicencia.isMaximum()) {
						this.jInternalFrameDetalleFormTipoLicencia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoLicencia.jContentPaneDetalleTipoLicencia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoLicencia.jContentPaneDetalleTipoLicencia.getWidth(),TipoLicenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoLicencia.jContentPaneDetalleTipoLicencia.getWidth(),TipoLicenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoLicencia.jContentPaneDetalleTipoLicencia.getWidth(),TipoLicenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoLicencia.setVisible(true);
	        this.jInternalFrameDetalleFormTipoLicencia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoLicencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoLicencia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoLicencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLicencia,false,this);
				} else {
					this.jInternalFrameOrderByTipoLicencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLicencia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoLicencia);
				this.jInternalFrameOrderByTipoLicencia.setVisible(false);
				this.jInternalFrameOrderByTipoLicencia.setSelected(false);
				
				this.jInternalFrameOrderByTipoLicencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoLicencia"));
				
				this.inicializarActualizarBindingTablaOrderByTipoLicencia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoLicencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoLicencia==null) {
				
				this.jInternalFrameImportacionTipoLicencia=new ImportacionJInternalFrame(TipoLicenciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoLicencia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoLicencia);
				this.jInternalFrameImportacionTipoLicencia.setVisible(false);
				this.jInternalFrameImportacionTipoLicencia.setSelected(false);


				this.jInternalFrameImportacionTipoLicencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoLicencia"));
				this.jInternalFrameImportacionTipoLicencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoLicencia"));
				this.jInternalFrameImportacionTipoLicencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoLicencia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoLicencia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoLicencia==null) {
				this.jInternalFrameReporteDinamicoTipoLicencia=new ReporteDinamicoJInternalFrame(TipoLicenciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoLicencia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoLicencia);
				this.jInternalFrameReporteDinamicoTipoLicencia.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoLicencia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoLicencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLicencia"));
				this.jInternalFrameReporteDinamicoTipoLicencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLicencia"));
				this.jInternalFrameReporteDinamicoTipoLicencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLicencia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLicencia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoLicencia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoLicencia);
			
	       	this.jInternalFrameDetalleFormTipoLicencia.setVisible(false);
	        this.jInternalFrameDetalleFormTipoLicencia.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoLicencia.dispose();
			//this.jInternalFrameDetalleFormTipoLicencia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoLicencia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoLicencia.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoLicencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoLicencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoLicencia.setVisible(true);
	        this.jInternalFrameImportacionTipoLicencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoLicencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoLicencia.setVisible(true);
	        this.jInternalFrameOrderByTipoLicencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoLicencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoLicencia.setVisible(false);
	        this.jInternalFrameOrderByTipoLicencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoLicencia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoLicencia.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoLicencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoLicencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoLicencia.setVisible(false);
	        this.jInternalFrameImportacionTipoLicencia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoLicencia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoLicencia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoLicencia(true);
			//this.isEsNuevoTipoLicencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoLicencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLicencia(false) ;
			
			if(tipolicenciaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLicencia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLicencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoLicenciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoLicencia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoLicencia(true);
			//this.isEsNuevoTipoLicencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipolicencia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoLicencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoLicencia(false) ;
			
			if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLicencia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLicencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoLicencia(false);
			
			//if(!this.isEsNuevoTipoLicencia) {								
				int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
				
			}
			
			if(this.permiteMantenimiento(this.tipolicencia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoLicencia=true;
					this.inicializarActualizarBindingTablaTipoLicencia(false);
					this.isEsNuevoTipoLicencia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoLicencia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoLicencia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoLicencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLicencia(false);
				
				this.habilitarDeshabilitarControlesTipoLicencia(false);
			
												
				
				if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoLicencia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoLicenciaActionPerformed(evt,tipolicenciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoLicencia(this.tipolicencia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoLicencia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipolicenciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipolicencia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				this.tipolicencia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				this.tipolicencia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipolicencia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoLicenciaModel) this.jTableDatosTipoLicencia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoLicencia=true;
				this.inicializarActualizarBindingTablaTipoLicencia(false);
				this.isEsNuevoTipoLicencia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoLicencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLicencia(false);
				
				this.habilitarDeshabilitarControlesTipoLicencia(false);
				
				
				
				if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoLicencia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoLicencia.getRowCount()>=1) {
				jTableDatosTipoLicencia.removeRowSelectionInterval(0, jTableDatosTipoLicencia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoLicencia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoLicencia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLicencia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLicencia(false) ;
			
			this.isEsNuevoTipoLicencia=false;
			
			if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoLicencia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoLicencia(false);
				
				//SI ES MANUAL
				if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoLicencia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoLicencia--;			
			//TipoLicencia tipolicenciaAux= new TipoLicencia();			
			//tipolicenciaAux.setId(this.iIdNuevoTipoLicencia);
			
			if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoLicencia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
			
			this.tipolicencia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipolicenciaLogic.getTipoLicencias().add(this.tipolicenciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipolicencias.add(this.tipolicenciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoLicencia(false);
			
			this.jTableDatosTipoLicencia.setRowSelectionInterval(this.getIndiceNuevoTipoLicencia(), this.getIndiceNuevoTipoLicencia());
			
			int iLastRow =  this.jTableDatosTipoLicencia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoLicencia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoLicencia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoLicencia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoLicencia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLicencia(false);
			
			//SI ES MANUAL
			if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLicencia();
			}
			
			//this.abrirFrameTreeTipoLicencia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo LicenciaS ?", "MANTENIMIENTO DE Tipo Licencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoLicencia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoLicencia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipolicenciaReturnGeneral=tipolicenciaLogic.procesarImportacionTipoLicenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipolicenciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoLicenciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoLicencia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoLicencia.setFileImportacion(this.jInternalFrameImportacionTipoLicencia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoLicencia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoLicencia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoLicencia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoLicencia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		

		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoLicenciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoLicenciaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoLicencias("Todos",tipolicenciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoLicenciaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoLicenciaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoLicencia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoLicenciaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoLicenciaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoLicenciaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoLicenciaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoLicenciaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoLicenciaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolicencia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoLicencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoLicencia tipolicencia:tipolicenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolicencia.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoLicenciaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoLicencia tipolicencia:tipolicenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolicencia.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoLicenciaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoLicencia tipolicencia:tipolicenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolicencia.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoLicencia(row);				
			//	iRow++;
			//}				
			
			//for(TipoLicencia tipolicenciaAux:tipolicenciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoLicencia(tipolicenciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLicencia(false);
			
			//SI ES MANUAL
			if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLicencia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLicencia(false);
			
			//SI ES MANUAL
			if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoLicencia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLicencia(false);
			
			//SI ES MANUAL
			if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoLicencia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoLicencia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoLicencia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoLicencia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoLicencia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoLicencia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoLicencia.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoLicencia.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoLicencia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoLicencia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoLicencia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoLicencia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoLicencia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoLicencia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoLicencia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLicencia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoLicencia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoLicencia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoLicencia();
		
		this.inicializarActualizarBindingBotonesManualTipoLicencia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoLicencia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLicencia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLicencia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLicencia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoLicencia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoLicencia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoLicencia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoLicencia.jCheckBoxPostAccionNuevoTipoLicencia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoLicencia.jCheckBoxPostAccionSinCerrarTipoLicencia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoLicencia.jCheckBoxPostAccionSinMensajeTipoLicencia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoLicencia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoLicencia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoLicencia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
				this.jInternalFrameDetalleFormTipoLicencia.jCheckBoxPostAccionNuevoTipoLicencia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoLicencia.jCheckBoxPostAccionSinCerrarTipoLicencia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoLicencia.jCheckBoxPostAccionSinMensajeTipoLicencia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoLicencia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoLicencia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoLicencia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoLicencia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoLicencia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoLicencia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoLicencia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoLicencia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoLicencia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoLicencia(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLicencia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoLicencia() throws Exception {
		try	{
			if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoLicencia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoLicencia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoLicencia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoLicencia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoLicencia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoLicencia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoLicencia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoLicencia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoLicencia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoLicencia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoLicencia.addItem(reporte);
			}
			
			
			if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoLicencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoLicencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoLicencia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoLicencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoLicencia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoLicencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoLicencia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoLicencia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoLicencia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLicencia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLicencia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
				this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
				this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoLicencia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoLicencia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoLicencia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoLicencia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoLicencia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoLicencia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoLicencia(Boolean esInicializar) throws Exception {				
		if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoLicencia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoLicencia() throws Exception {
		this.inicializarActualizarBindingTablaTipoLicencia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoLicencia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoLicenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoLicenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoLicenciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLicenciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoLicenciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoLicenciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoLicencia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipolicenciaLogic.getTipoLicencias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipolicencias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoLicencia.setModel(new TipoLicenciaModel(this.tipolicenciaLogic.getTipoLicencias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoLicencia.setModel(new TipoLicenciaModel(this.tipolicencias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoLicencia!=null && this.jInternalFrameOrderByTipoLicencia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoLicencia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoLicencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLicencia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoLicenciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO,tipolicenciaConstantesFunciones.resaltarSeleccionarTipoLicencia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO,tipolicenciaConstantesFunciones.resaltarSeleccionarTipoLicencia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoLicencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLicencia,TipoLicenciaConstantesFunciones.LABEL_ID));

		if(this.tipolicenciaConstantesFunciones.mostraridTipoLicencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLicenciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipolicenciaConstantesFunciones.resaltaridTipoLicencia,this.tipolicenciaConstantesFunciones.activaridTipoLicencia,this,true,"idTipoLicencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolicenciaConstantesFunciones.resaltaridTipoLicencia,this.tipolicenciaConstantesFunciones.activaridTipoLicencia,this,true,"idTipoLicencia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLicencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLicencia,TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipolicenciaConstantesFunciones.mostrarid_empresaTipoLicencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipolicenciaConstantesFunciones.resaltarid_empresaTipoLicencia,this,this.tipolicenciaConstantesFunciones.activarid_empresaTipoLicencia));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipolicenciaConstantesFunciones.resaltarid_empresaTipoLicencia,this,this.tipolicenciaConstantesFunciones.activarid_empresaTipoLicencia,false,"id_empresaTipoLicencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLicenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLicencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLicencia,TipoLicenciaConstantesFunciones.LABEL_CODIGO));

		if(this.tipolicenciaConstantesFunciones.mostrarcodigoTipoLicencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLicenciaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolicenciaConstantesFunciones.resaltarcodigoTipoLicencia,this.tipolicenciaConstantesFunciones.activarcodigoTipoLicencia,this,true,"codigoTipoLicencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolicenciaConstantesFunciones.resaltarcodigoTipoLicencia,this.tipolicenciaConstantesFunciones.activarcodigoTipoLicencia,this,true,"codigoTipoLicencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLicenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLicencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLicencia,TipoLicenciaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipolicenciaConstantesFunciones.mostrarnombreTipoLicencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLicenciaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolicenciaConstantesFunciones.resaltarnombreTipoLicencia,this.tipolicenciaConstantesFunciones.activarnombreTipoLicencia,this,true,"nombreTipoLicencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolicenciaConstantesFunciones.resaltarnombreTipoLicencia,this.tipolicenciaConstantesFunciones.activarnombreTipoLicencia,this,true,"nombreTipoLicencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLicenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipolicenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipolicenciaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoLicencia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipolicenciaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipolicenciaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoLicencia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipolicenciaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipolicenciaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoLicencia.addColumn(tableColumn);
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
			
			this.jTableDatosTipoLicencia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoLicencia.moveColumn(this.jTableDatosTipoLicencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoLicencia.moveColumn(this.jTableDatosTipoLicencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoLicencia.moveColumn(this.jTableDatosTipoLicencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoLicencia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoLicencia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoLicencia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoLicencia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoLicencia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoLicencia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoLicencia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoLicencia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipolicenciaLogic.getTipoLicencias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipolicencias.size()-1;
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
		//this.jTableDatosTipoLicencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoLicencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoLicencia();
			
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
				
				//this.isEsNuevoTipoLicencia=false;
					
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
				if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoLicencia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoLicencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoLicencia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipolicencia.getsType().equals("DUPLICADO")
				   || this.tipolicencia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoLicencia=true;
				
				} else {
					this.isEsNuevoTipoLicencia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipolicencia.getId()>=0 && !this.tipolicencia.getIsNew()) {						
						this.isEsNuevoTipoLicencia=false;
						
					} else {
						this.isEsNuevoTipoLicencia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoLicencia(esRelaciones);						
				
				this.seleccionarTipoLicencia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipolicencia.getId()<0) {
					this.isEsNuevoTipoLicencia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoLicencia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoLicencia(evt,rowIndex);
				}	
				
				if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoLicencia: " + this.dDif); 
					}
				}								
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoLicencia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipolicencia)) {
					if(this.tipolicencia.getId()>0) {
						this.tipolicencia.setIsDeleted(true);
						
						this.tipolicenciasEliminados.add(this.tipolicencia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipolicenciaLogic.getTipoLicencias().remove(this.tipolicencia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipolicencias.remove(this.tipolicencia);				
					}
					
					
					((TipoLicenciaModel) this.jTableDatosTipoLicencia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLicencia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoLicencia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoLicencia) {
			
			if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoLicencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoLicencia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoLicencia(this.tipolicencia);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipolicenciaConstantesFunciones.cargarid_empresaTipoLicencia || this.tipolicenciaConstantesFunciones.event_dependid_empresaTipoLicencia) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipolicencia.getid_empresa());
									//this.inicializarActualizarBindingTipoLicencia(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipolicencia.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipolicencia.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipolicencia.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoLicencia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoLicencia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLicencia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoLicencia(TipoLicencia tipolicencia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoLicencia(tipolicencia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoLicencia(TipoLicencia tipolicencia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoLicencia(tipolicencia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoLicencia(tipolicencia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoLicencia(tipolicencia);
	}
	
	public void setVariablesObjetoActualToFormularioTipoLicencia(TipoLicencia tipolicencia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.setText(tipolicencia.getId().toString());
			this.jInternalFrameDetalleFormTipoLicencia.jTextFieldcodigoTipoLicencia.setText(tipolicencia.getcodigo());
			this.jInternalFrameDetalleFormTipoLicencia.jTextAreanombreTipoLicencia.setText(tipolicencia.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoLicencia tipolicenciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipolicenciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoLicencia tipolicenciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipolicenciaLocal=this.tipolicencia;
			} else {
				tipolicenciaLocal=this.tipolicenciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipolicenciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoLicencia(tipolicenciaLocal,true);
					
					if(tipolicenciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipolicenciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipolicenciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoLicencia(TipoLicencia tipolicencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoLicencia(tipolicencia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(tipolicencia);
	}
	
	public void setVariablesFormularioToObjetoActualTipoLicencia(TipoLicencia tipolicencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoLicencia(tipolicencia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoLicencia(TipoLicencia tipolicencia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.getText()==null || this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.getText()=="" || this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.setText("0");
			}

			if(conColumnasBase) {tipolicencia.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLicenciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLicencia.jLabelIdTipoLicencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolicencia.setcodigo(this.jInternalFrameDetalleFormTipoLicencia.jTextFieldcodigoTipoLicencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLicenciaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLicencia.jLabelcodigoTipoLicencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolicencia.setnombre(this.jInternalFrameDetalleFormTipoLicencia.jTextAreanombreTipoLicencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLicenciaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLicencia.jLabelnombreTipoLicencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoLicencia(TipoLicencia tipolicenciaBean,TipoLicencia tipolicencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoLicencia(TipoLicencia tipolicenciaOrigen,TipoLicencia tipolicencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipolicenciaOrigen.getId()!=null && !tipolicenciaOrigen.getId().equals(0L))) {tipolicencia.setId(tipolicenciaOrigen.getId());}}
			if(conDefault || (!conDefault && tipolicenciaOrigen.getcodigo()!=null && !tipolicenciaOrigen.getcodigo().equals(""))) {tipolicencia.setcodigo(tipolicenciaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipolicenciaOrigen.getnombre()!=null && !tipolicenciaOrigen.getnombre().equals(""))) {tipolicencia.setnombre(tipolicenciaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoLicencia(TipoLicencia tipolicencia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.setText(tipolicencia.getId().toString());
			this.jInternalFrameDetalleFormTipoLicencia.jTextFieldcodigoTipoLicencia.setText(tipolicencia.getcodigo());
			this.jInternalFrameDetalleFormTipoLicencia.jTextAreanombreTipoLicencia.setText(tipolicencia.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoLicencia(TipoLicenciaBean tipolicenciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.setText(tipolicenciaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoLicencia.jTextFieldcodigoTipoLicencia.setText(tipolicenciaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoLicencia.jTextAreanombreTipoLicencia.setText(tipolicenciaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoLicencia(TipoLicenciaParameterReturnGeneral tipolicenciaReturnGeneral,TipoLicenciaBean tipolicenciaBean,Boolean conDefault) throws Exception { 
		try {
			TipoLicencia tipolicenciaLocal=new TipoLicencia();
			
			tipolicenciaLocal=tipolicenciaReturnGeneral.getTipoLicencia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipolicenciaLocal.getId()!=null && !tipolicenciaLocal.getId().equals(0L))) {tipolicenciaBean.setId(tipolicenciaLocal.getId());}}
			if(conDefault || (!conDefault && tipolicenciaLocal.getcodigo()!=null && !tipolicenciaLocal.getcodigo().equals(""))) {tipolicenciaBean.setcodigo(tipolicenciaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipolicenciaLocal.getnombre()!=null && !tipolicenciaLocal.getnombre().equals(""))) {tipolicenciaBean.setnombre(tipolicenciaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoLicenciaGenerico(Long idTipoLicenciaSeleccionado,JComboBox jComboBoxTipoLicencia,List<TipoLicencia> tipolicenciasLocal)throws Exception {
		try {
			TipoLicencia  tipolicenciaTemp=null;

			for(TipoLicencia tipolicenciaAux:tipolicenciasLocal) {
				if(tipolicenciaAux.getId()!=null && tipolicenciaAux.getId().equals(idTipoLicenciaSeleccionado)) {
					tipolicenciaTemp=tipolicenciaAux;
					break;
				}
			}

			jComboBoxTipoLicencia.setSelectedItem(tipolicenciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoLicenciaGenerico(JComboBox jComboBoxTipoLicencia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoLicencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoLicencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoLicencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoLicencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoLicencia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoLicencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoLicencia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoLicencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoLicencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoLicencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolicencia=(TipoLicencia) tipolicenciaLogic.getTipoLicencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipolicencia =(TipoLicencia) tipolicencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipolicencia.getIsNew() && !tipolicencia.getIsChanged() && !tipolicencia.getIsDeleted()) {
				sDescripcion=tipolicencia.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipolicencia.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoLicencia tipolicenciaRow=new TipoLicencia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolicenciaRow=(TipoLicencia) tipolicenciaLogic.getTipoLicencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipolicenciaRow=(TipoLicencia) tipolicencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoLicencia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoTipoLicencia && this.isPermisoNuevoTipoLicencia));			
			this.jButtonDuplicarTipoLicencia.setVisible((this.isVisibilidadCeldaDuplicarTipoLicencia && this.isPermisoDuplicarTipoLicencia));			
			this.jButtonCopiarTipoLicencia.setVisible((this.isVisibilidadCeldaCopiarTipoLicencia && this.isPermisoCopiarTipoLicencia));
			this.jButtonVerFormTipoLicencia.setVisible((this.isVisibilidadCeldaVerFormTipoLicencia && this.isPermisoVerFormTipoLicencia));
			
			this.jButtonAbrirOrderByTipoLicencia.setVisible((this.isVisibilidadCeldaOrdenTipoLicencia && this.isPermisoOrdenTipoLicencia));			
			
			this.jButtonNuevoRelacionesTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLicencia && this.isPermisoNuevoTipoLicencia));			
			this.jButtonNuevoGuardarCambiosTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoTipoLicencia && this.isPermisoNuevoTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));
			
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarTipoLicencia.setVisible((this.isVisibilidadCeldaModificarTipoLicencia && this.isPermisoActualizarTipoLicencia));	
			this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarTipoLicencia.setVisible((this.isVisibilidadCeldaActualizarTipoLicencia && this.isPermisoActualizarTipoLicencia));	
			this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarTipoLicencia.setVisible((this.isVisibilidadCeldaEliminarTipoLicencia && this.isPermisoEliminarTipoLicencia));
			this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarTipoLicencia.setVisible(this.isVisibilidadCeldaCancelarTipoLicencia);							
			this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosTipoLicencia.setVisible((this.isVisibilidadCeldaGuardarTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoLicencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoTipoLicencia && this.isPermisoNuevoTipoLicencia));						
			this.jButtonDuplicarToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaDuplicarTipoLicencia && this.isPermisoDuplicarTipoLicencia));						
			this.jButtonCopiarToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaCopiarTipoLicencia && this.isPermisoCopiarTipoLicencia));			
			this.jButtonVerFormToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaVerFormTipoLicencia && this.isPermisoVerFormTipoLicencia));			
			this.jButtonAbrirOrderByToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaOrdenTipoLicencia && this.isPermisoOrdenTipoLicencia));
			this.jButtonNuevoRelacionesToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLicencia && this.isPermisoNuevoTipoLicencia));			
			this.jButtonNuevoGuardarCambiosToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoTipoLicencia && this.isPermisoNuevoTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));			
			
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaModificarTipoLicencia && this.isPermisoActualizarTipoLicencia));	
			this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaActualizarTipoLicencia  && this.isPermisoActualizarTipoLicencia));	
			this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaEliminarTipoLicencia && this.isPermisoEliminarTipoLicencia));
			this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarToolBarTipoLicencia.setVisible(this.isVisibilidadCeldaCancelarTipoLicencia);				
			this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaGuardarTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoLicencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoTipoLicencia && this.isPermisoNuevoTipoLicencia));			
			this.jMenuItemDuplicarTipoLicencia.setVisible((this.isVisibilidadCeldaDuplicarTipoLicencia && this.isPermisoDuplicarTipoLicencia));			
			this.jMenuItemCopiarTipoLicencia.setVisible((this.isVisibilidadCeldaCopiarTipoLicencia && this.isPermisoCopiarTipoLicencia));			
			this.jMenuItemVerFormTipoLicencia.setVisible((this.isVisibilidadCeldaVerFormTipoLicencia && this.isPermisoVerFormTipoLicencia));			
			this.jMenuItemAbrirOrderByTipoLicencia.setVisible((this.isVisibilidadCeldaOrdenTipoLicencia && this.isPermisoOrdenTipoLicencia));			
			//this.jMenuItemMostrarOcultarTipoLicencia.setVisible((this.isVisibilidadCeldaOrdenTipoLicencia && this.isPermisoOrdenTipoLicencia));
			this.jMenuItemDetalleAbrirOrderByTipoLicencia.setVisible((this.isVisibilidadCeldaOrdenTipoLicencia && this.isPermisoOrdenTipoLicencia));			
			//this.jMenuItemDetalleMostrarOcultarTipoLicencia.setVisible((this.isVisibilidadCeldaOrdenTipoLicencia && this.isPermisoOrdenTipoLicencia));			
			this.jMenuItemNuevoRelacionesTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLicencia && this.isPermisoNuevoTipoLicencia));			
			this.jMenuItemNuevoGuardarCambiosTipoLicencia.setVisible((this.isVisibilidadCeldaNuevoTipoLicencia && this.isPermisoNuevoTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));									
			
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemModificarTipoLicencia.setVisible((this.isVisibilidadCeldaModificarTipoLicencia && this.isPermisoActualizarTipoLicencia));	
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemActualizarTipoLicencia.setVisible((this.isVisibilidadCeldaActualizarTipoLicencia && this.isPermisoActualizarTipoLicencia));	
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemEliminarTipoLicencia.setVisible((this.isVisibilidadCeldaEliminarTipoLicencia && this.isPermisoEliminarTipoLicencia));
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemCancelarTipoLicencia.setVisible(this.isVisibilidadCeldaCancelarTipoLicencia);				
			}
			
			this.jMenuItemGuardarCambiosTipoLicencia.setVisible((this.isVisibilidadCeldaGuardarTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));						
			this.jMenuItemGuardarCambiosTablaTipoLicencia.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoLicencia=this.jButtonNuevoTipoLicencia.isVisible();
			this.isVisibilidadCeldaDuplicarTipoLicencia=this.jButtonDuplicarTipoLicencia.isVisible();
			this.isVisibilidadCeldaCopiarTipoLicencia=this.jButtonCopiarTipoLicencia.isVisible();
			this.isVisibilidadCeldaVerFormTipoLicencia=this.jButtonVerFormTipoLicencia.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoLicencia=this.jButtonAbrirOrderByTipoLicencia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=this.jButtonNuevoRelacionesTipoLicencia.isVisible();
			this.isVisibilidadCeldaModificarTipoLicencia=this.jButtonModificarTipoLicencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			this.isVisibilidadCeldaActualizarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarTipoLicencia.isVisible();
			this.isVisibilidadCeldaEliminarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarTipoLicencia.isVisible();
			this.isVisibilidadCeldaCancelarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarTipoLicencia.isVisible();
			this.isVisibilidadCeldaGuardarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosTipoLicencia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=this.jButtonGuardarCambiosTablaTipoLicencia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoLicencia=this.jButtonNuevoToolBarTipoLicencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=this.jButtonNuevoRelacionesToolBarTipoLicencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			this.isVisibilidadCeldaModificarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarToolBarTipoLicencia.isVisible();
			this.isVisibilidadCeldaActualizarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarToolBarTipoLicencia.isVisible();
			this.isVisibilidadCeldaEliminarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarToolBarTipoLicencia.isVisible();
			this.isVisibilidadCeldaCancelarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarToolBarTipoLicencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoLicencia=this.jButtonGuardarCambiosToolBarTipoLicencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=this.jButtonGuardarCambiosTablaToolBarTipoLicencia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoLicencia=this.jMenuItemNuevoTipoLicencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=this.jMenuItemNuevoRelacionesTipoLicencia.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			this.isVisibilidadCeldaModificarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jMenuItemModificarTipoLicencia.isVisible();
			this.isVisibilidadCeldaActualizarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jMenuItemActualizarTipoLicencia.isVisible();
			this.isVisibilidadCeldaEliminarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jMenuItemEliminarTipoLicencia.isVisible();
			this.isVisibilidadCeldaCancelarTipoLicencia=this.jInternalFrameDetalleFormTipoLicencia.jMenuItemCancelarTipoLicencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoLicencia=this.jMenuItemGuardarCambiosTipoLicencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=this.jMenuItemGuardarCambiosTablaTipoLicencia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoLicencia(Boolean esInicializar) {
		if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoLicencia();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoLicencia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoLicencia() {
		this.jButtonNuevoTipoLicencia.setVisible(this.isPermisoNuevoTipoLicencia);			
		this.jButtonDuplicarTipoLicencia.setVisible(this.isPermisoDuplicarTipoLicencia);			
		this.jButtonCopiarTipoLicencia.setVisible(this.isPermisoCopiarTipoLicencia);			
		this.jButtonVerFormTipoLicencia.setVisible(this.isPermisoVerFormTipoLicencia);			
		
		this.jButtonAbrirOrderByTipoLicencia.setVisible(this.isPermisoOrdenTipoLicencia);					
		
		this.jButtonNuevoRelacionesTipoLicencia.setVisible(this.isPermisoNuevoTipoLicencia);			
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarTipoLicencia.setVisible(this.isPermisoActualizarTipoLicencia);	
			this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarTipoLicencia.setVisible(this.isPermisoActualizarTipoLicencia);	
			this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarTipoLicencia.setVisible(this.isPermisoEliminarTipoLicencia);
			this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarTipoLicencia.setVisible(this.isVisibilidadCeldaCancelarTipoLicencia);						
			this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosTipoLicencia.setVisible(this.isPermisoGuardarCambiosTipoLicencia);							
		}
		
		this.jButtonGuardarCambiosTablaTipoLicencia.setVisible(this.isPermisoActualizarTipoLicencia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoLicencia() {
		this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarTipoLicencia.setVisible(this.isPermisoActualizarTipoLicencia);	
		this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarTipoLicencia.setVisible(this.isPermisoActualizarTipoLicencia);	
		this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarTipoLicencia.setVisible(this.isPermisoEliminarTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarTipoLicencia.setVisible(this.isVisibilidadCeldaCancelarTipoLicencia);							
		this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosTipoLicencia.setVisible((this.isVisibilidadCeldaGuardarTipoLicencia && this.isPermisoGuardarCambiosTipoLicencia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoLicencia() {
		if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoLicencia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoLicencia() {
	}
	
	public void jTableDatosTipoLicenciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoLicencia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoLicenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLicencia(this.gettipolicencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolicencia==null) {
						this.tipolicencia = new TipoLicencia();
					}

					this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
				}

				if(this.tipolicencia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipolicencia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLicencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoLicenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoLicencia(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoLicencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoLicencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoLicencia(this.gettipolicencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipolicenciaLogic.getConnexion());

				if(this.tipolicencia.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipolicencia.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoLicencia=(TitledBorder)this.jScrollPanelDatosTipoLicencia.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoLicencia.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoLicenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLicencia(this.gettipolicencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolicencia==null) {
						this.tipolicencia = new TipoLicencia();
					}

					this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
				}

				if(this.tipolicencia.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipolicencia.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLicencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoLicenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLicencia(this.gettipolicencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolicencia==null) {
						this.tipolicencia = new TipoLicencia();
					}

					this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
				}

				if(this.tipolicencia.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipolicencia.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLicencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoLicenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLicencia(this.gettipolicencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolicencia==null) {
						this.tipolicencia = new TipoLicencia();
					}

					this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);
				}

				if(this.tipolicencia.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipolicencia.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLicencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoLicenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoLicencia(false,false);

			this.getTipoLicenciasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoLicencia(false);

			//if(TipoLicenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoLicencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolicenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoLicencia() {
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
			this.jInternalFrameDetalleFormTipoLicencia.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoLicencia.dispose();
			this.jInternalFrameDetalleFormTipoLicencia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
			this.jInternalFrameReporteDinamicoTipoLicencia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoLicencia.dispose();
			this.jInternalFrameReporteDinamicoTipoLicencia=null;
		}
		
		if(this.jInternalFrameImportacionTipoLicencia!=null) {
			this.jInternalFrameImportacionTipoLicencia.setVisible(false);	    			
			this.jInternalFrameImportacionTipoLicencia.dispose();
			this.jInternalFrameImportacionTipoLicencia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoLicencia();
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoLicencia")) {
				jButtonNuevoTipoLicenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoLicencia")) {
				jButtonDuplicarTipoLicenciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoLicencia")) {
				jButtonCopiarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoLicencia")) {
				jButtonVerFormTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoLicencia")) {
				jButtonNuevoTipoLicenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoLicencia")) {
				jButtonDuplicarTipoLicenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoLicencia")) {
				jButtonNuevoTipoLicenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoLicencia")) {
				jButtonDuplicarTipoLicenciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoLicencia")) {
				jButtonNuevoTipoLicenciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoLicencia")) {
				jButtonNuevoTipoLicenciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoLicencia")) {
				jButtonNuevoTipoLicenciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoLicencia")) {
				jButtonModificarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoLicencia")) {
				jButtonModificarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoLicencia")) {
				jButtonModificarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoLicencia")) {
				jButtonActualizarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoLicencia")) {
				jButtonActualizarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoLicencia")) {
				jButtonActualizarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoLicencia")) {
				jButtonEliminarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoLicencia")) {
				jButtonEliminarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoLicencia")) {
				jButtonEliminarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoLicencia")) {
				jButtonCancelarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoLicencia")) {
				jButtonCancelarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoLicencia")) {
				jButtonCancelarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoLicencia")) {
				jButtonCerrarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoLicencia")) {
				jButtonCerrarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoLicencia")) {
				jButtonCerrarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoLicencia")) {
				jButtonMostrarOcultarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoLicencia")) {
				jButtonCancelarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoLicencia")) {
				jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoLicencia")) {
				jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoLicencia")) {
				jButtonCopiarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoLicencia")) {
				jButtonVerFormTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoLicencia")) {
				jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoLicencia")) {
				jButtonCopiarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoLicencia")) {
				jButtonVerFormTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoLicencia")) {
				jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoLicencia")) {
				jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoLicencia")) {
				jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoLicencia")) {
				jButtonRecargarInformacionTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoLicencia")) {
				jButtonRecargarInformacionTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoLicencia")) {
				jButtonRecargarInformacionTipoLicenciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoLicencia")) {
				jButtonAnterioresTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoLicencia")) {
				jButtonAnterioresTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoLicencia")) {
				jButtonAnterioresTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoLicencia")) {
				jButtonSiguientesTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoLicencia")) {
				jButtonSiguientesTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoLicencia")) {
				jButtonSiguientesTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoLicencia") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoLicencia")) {
				jButtonAbrirOrderByTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoLicencia") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoLicencia")) {
				jButtonMostrarOcultarTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoLicencia")) {
				jButtonNuevoGuardarCambiosTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoLicencia")) {
				jButtonNuevoGuardarCambiosTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoLicencia")) {
				jButtonNuevoGuardarCambiosTipoLicenciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoLicencia")) {
				jButtonCerrarReporteDinamicoTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoLicencia")) {
				jButtonGenerarReporteDinamicoTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoLicencia")) {
				
				jButtonGenerarExcelReporteDinamicoTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoLicencia")) {
				jButtonCerrarImportacionTipoLicenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoLicencia")) {
				
				jButtonGenerarImportacionTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoLicencia")) {
				
				jButtonAbrirImportacionTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoLicencia")) {
				jComboBoxTiposAccionesTipoLicenciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoLicencia")) {
				jComboBoxTiposRelacionesTipoLicenciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoLicencia")) {
				jComboBoxTiposAccionesTipoLicenciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoLicencia")) {
				
				jComboBoxTiposSeleccionarTipoLicenciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoLicencia")) {
				jTextFieldValorCampoGeneralTipoLicenciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoLicencia")) {
				jButtonAbrirOrderByTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoLicencia")) {
				jButtonAbrirOrderByTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoLicencia")) {
				jButtonCerrarOrderByTipoLicenciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoLicenciaBusqueda")) {
				this.jButtonidTipoLicenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoLicenciaUpdate")) {
				this.jButtonid_empresaTipoLicenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoLicenciaBusqueda")) {
				this.jButtonid_empresaTipoLicenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoLicenciaBusqueda")) {
				this.jButtoncodigoTipoLicenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoLicenciaBusqueda")) {
				this.jButtonnombreTipoLicenciaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoLicencia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLicenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				


				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoLicencia tipolicenciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipolicenciaLocal=this.tipolicencia;
			} else {
				tipolicenciaLocal=this.tipolicenciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
							
				
				


				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLicenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
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
			
			


			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLicenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
								
						
				


				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
								
				
				


				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLicenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLicenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLicenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
							
				
				


				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLicenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolicenciaAnterior =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipolicenciaAnterior =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
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
			
			


			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLicenciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
								
				
				


				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLicenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLicenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLicenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoLicencia")) {
					jCheckBoxSeleccionarTodosTipoLicenciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoLicencia")) {
					jCheckBoxSeleccionadosTipoLicenciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoLicencia")) {
					
				}
				
				


				
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
												
				
				


				
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLicenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolicenciaAnterior =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipolicenciaAnterior =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLicenciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
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
			
			


			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLicenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolicencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolicencia);
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
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
				
				


				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLicencia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLicencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLicenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolicenciaAnterior =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoLicencia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoLicenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoLicencia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipolicencia =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipolicencia =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipolicencia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoLicencia")) {
				
				}
				
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoLicencia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoLicencia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoLicencia")) {
			
			}
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoLicencia();
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoLicencia")) {
				jButtonNuevoTipoLicenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoLicencia")) {
				jButtonDuplicarTipoLicenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoLicencia")) {
				jButtonCopiarTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoLicencia")) {
				jButtonVerFormTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoLicencia")) {
				jButtonNuevoTipoLicenciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoLicencia")) {
				jButtonModificarTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoLicencia")) {
				jButtonActualizarTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoLicencia")) {
				jButtonEliminarTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoLicencia")) {
				jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoLicencia")) {
				jButtonCancelarTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoLicencia")) {
				jButtonCerrarTipoLicenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoLicencia")) {
				jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoLicencia")) {
				jButtonNuevoGuardarCambiosTipoLicenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoLicencia")) {
				jButtonAbrirOrderByTipoLicenciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoLicencia")) {
				jButtonRecargarInformacionTipoLicenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoLicencia")) {
				jButtonAnterioresTipoLicenciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoLicencia")) {
				jButtonSiguientesTipoLicenciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoLicenciaBusqueda")) {
				this.jButtonidTipoLicenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoLicenciaUpdate")) {
				this.jButtonid_empresaTipoLicenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoLicenciaBusqueda")) {
				this.jButtonid_empresaTipoLicenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoLicenciaBusqueda")) {
				this.jButtoncodigoTipoLicenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoLicenciaBusqueda")) {
				this.jButtonnombreTipoLicenciaBusquedaActionPerformed(evt);
			}
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoLicencia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoLicencia")) {
				closingInternalFrameTipoLicencia();
				
			} else if(sTipo.equals("jButtonCancelarTipoLicencia")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoLicencia = (JInternalFrameBase)evt.getSource();
	            	
	            TipoLicenciaBeanSwingJInternalFrame jInternalFrameParent=(TipoLicenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoLicencia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoLicenciaActionPerformed(null);
			}
			
			TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipolicencia,new Object(),this.tipolicenciaParameterGeneral,this.tipolicenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoLicencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoLicencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoLicencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipolicencia)) {
			if(!esControlTabla) {
				if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);			
				}
				
				if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoLicencia(this.tipolicencia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipolicenciaReturnGeneral=tipolicenciaLogic.procesarEventosTipoLicenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolicenciaLogic.getTipoLicencias(),this.tipolicencia,this.tipolicenciaParameterGeneral,this.isEsNuevoTipoLicencia,classes);//this.tipolicenciaLogic.getTipoLicencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoLicencia(this.tipolicenciaReturnGeneral,this.tipolicenciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoLicencia(classes,this.tipolicenciaReturnGeneral,this.tipolicenciaBean,false);
					}
						
					if(this.tipolicenciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoLicencia(this.tipolicenciaReturnGeneral.getTipoLicencia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoLicencia(this.tipolicenciaReturnGeneral.getTipoLicencia());	
					}
						
					if(this.tipolicenciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoLicencia(this.tipolicenciaReturnGeneral.getTipoLicencia(),classes);//this.tipolicenciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoLicencia(this.tipolicencia,classes);//this.tipolicenciaBean);									
				}
			
				if(TipoLicenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoLicencia(this.tipolicencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLicencia(this.tipolicencia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipolicenciaAnterior!=null) {
						this.tipolicencia=this.tipolicenciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipolicenciaReturnGeneral=tipolicenciaLogic.procesarEventosTipoLicenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolicenciaLogic.getTipoLicencias(),this.tipolicencia,this.tipolicenciaParameterGeneral,this.isEsNuevoTipoLicencia,classes);//this.tipolicenciaLogic.getTipoLicencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipolicenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipolicenciaReturnGeneral.getTipoLicencia(),tipolicenciaLogic.getTipoLicencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipolicenciaReturnGeneral.getTipoLicencia(),this.tipolicencias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoLicencia.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoLicencia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoLicencia();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoLicencia() throws Exception {
		
		TipoLicenciaModel tipolicenciaModel=(TipoLicenciaModel)this.jTableDatosTipoLicencia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolicenciaModel.tipolicencias=this.tipolicenciaLogic.getTipoLicencias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipolicenciaModel.tipolicencias=this.tipolicencias;
		}
		
		
		((TipoLicenciaModel) this.jTableDatosTipoLicencia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoLicencia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipolicenciaAnterior(),this.tipolicenciaLogic.getTipoLicencias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipolicenciaAnterior(),this.tipolicencias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoLicencia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoLicencia(TipoLicencia tipolicencia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
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
										
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolicencia,new Object(),generalEntityParameterGeneral,this.tipolicenciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoLicenciaConstantesFunciones.getClassesRelationshipsOfTipoLicencia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoLicenciaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoLicencia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoLicencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoLicenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolicencia,new Object(),generalEntityParameterGeneral,this.tipolicenciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoLicencia(TipoLicenciaBean tipolicenciaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoLicencia(ArrayList<Classe> classes,TipoLicenciaReturnGeneral tipolicenciaReturnGeneral,TipoLicenciaBean tipolicenciaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoLicencia(TipoLicencia tipolicencia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipolicencia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoLicencia = new TipoLicenciaDetalleFormJInternalFrame(jDesktopPane,this.tipolicenciaSessionBean.getConGuardarRelaciones(),this.tipolicenciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.setVisible(false);
		this.jInternalFrameDetalleFormTipoLicencia.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoLicencia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoLicencia.tipolicenciaLogic=this.tipolicenciaLogic;
		
		this.cargarCombosFrameForeignKeyTipoLicencia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoLicencia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoLicencia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoLicencia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoLicencia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoLicencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoLicencia"));
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarTipoLicencia.addActionListener(new ButtonActionListener(this,"ModificarTipoLicencia"));

		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarToolBarTipoLicencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoLicencia"));
					
		this.jInternalFrameDetalleFormTipoLicencia.jMenuItemModificarTipoLicencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoLicencia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarTipoLicencia.addActionListener (new ButtonActionListener(this,"ActualizarTipoLicencia"));
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarToolBarTipoLicencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoLicencia"));
						
		this.jInternalFrameDetalleFormTipoLicencia.jMenuItemActualizarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoLicencia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarTipoLicencia.addActionListener (new ButtonActionListener(this,"EliminarTipoLicencia"));
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoLicencia"));
								
		this.jInternalFrameDetalleFormTipoLicencia.jMenuItemEliminarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoLicencia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarTipoLicencia.addActionListener (new ButtonActionListener(this,"CancelarTipoLicencia"));
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoLicencia"));
					
		this.jInternalFrameDetalleFormTipoLicencia.jMenuItemCancelarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoLicencia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jMenuItemDetalleCerrarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoLicencia"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLicencia"));
		
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLicencia"));
		
		
		
		this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoLicencia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonidTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLicenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLicencia.jButtonid_empresaTipoLicenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLicenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonid_empresaTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLicenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtoncodigoTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLicenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonnombreTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLicenciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoLicencia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoLicencia"));
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoLicencia"));
		}
		
		this.jTableDatosTipoLicencia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoLicencia"));
		
		this.jTableDatosTipoLicencia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoLicencia"));
		
		this.jButtonNuevoTipoLicencia.addActionListener(new ButtonActionListener(this,"NuevoTipoLicencia"));
		
		this.jButtonDuplicarTipoLicencia.addActionListener(new ButtonActionListener(this,"DuplicarTipoLicencia"));
		
		this.jButtonCopiarTipoLicencia.addActionListener(new ButtonActionListener(this,"CopiarTipoLicencia"));
		
		this.jButtonVerFormTipoLicencia.addActionListener(new ButtonActionListener(this,"VerFormTipoLicencia"));
		
		
		this.jButtonNuevoToolBarTipoLicencia.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoLicencia"));
			
		this.jButtonDuplicarToolBarTipoLicencia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoLicencia"));
			
		this.jMenuItemNuevoTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoLicencia"));
			
		this.jMenuItemDuplicarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoLicencia"));		
		
		
		this.jButtonNuevoRelacionesTipoLicencia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoLicencia"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoLicencia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoLicencia"));
			
		this.jMenuItemNuevoRelacionesTipoLicencia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoLicencia"));		
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarTipoLicencia.addActionListener(new ButtonActionListener(this,"ModificarTipoLicencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonModificarToolBarTipoLicencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoLicencia"));
			
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemModificarTipoLicencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoLicencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarTipoLicencia.addActionListener (new ButtonActionListener(this,"ActualizarTipoLicencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonActualizarToolBarTipoLicencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoLicencia"));
				
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemActualizarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoLicencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarTipoLicencia.addActionListener (new ButtonActionListener(this,"EliminarTipoLicencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonEliminarToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoLicencia"));
						
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemEliminarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoLicencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarTipoLicencia.addActionListener (new ButtonActionListener(this,"CancelarTipoLicencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonCancelarToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoLicencia"));
			
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemCancelarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoLicencia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoLicencia"));		
		
		
		this.jButtonCerrarTipoLicencia.addActionListener (new ButtonActionListener(this,"CerrarTipoLicencia"));
		
		
		this.jButtonCerrarToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoLicencia"));
			
		this.jMenuItemCerrarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoLicencia"));
			
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jMenuItemDetalleCerrarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoLicencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosTipoLicencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoLicencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLicencia"));
		}
		
		this.jButtonCopiarToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoLicencia"));
			
		this.jButtonVerFormToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoLicencia"));
		
		this.jMenuItemGuardarCambiosTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoLicencia"));
			
		this.jMenuItemCopiarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoLicencia"));		
		
		this.jMenuItemVerFormTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoLicencia"));		
		
		
		this.jButtonGuardarCambiosTablaTipoLicencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoLicencia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoLicencia"));
			
		this.jMenuItemGuardarCambiosTablaTipoLicencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoLicencia"));		
		
		
		
		this.jButtonRecargarInformacionTipoLicencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoLicencia"));
					
		this.jButtonRecargarInformacionToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoLicencia"));
		
		this.jMenuItemRecargarInformacionTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoLicencia"));		
		
		
		
		this.jButtonAnterioresTipoLicencia.addActionListener (new ButtonActionListener(this,"AnterioresTipoLicencia"));
		
		
		this.jButtonAnterioresToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoLicencia"));
		
		this.jMenuItemAnterioresTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoLicencia"));		
		
		
		this.jButtonSiguientesTipoLicencia.addActionListener (new ButtonActionListener(this,"SiguientesTipoLicencia"));
		
		
		this.jButtonSiguientesToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoLicencia"));
			
		this.jMenuItemSiguientesTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoLicencia"));
			
		this.jMenuItemAbrirOrderByTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoLicencia"));
			
		this.jMenuItemMostrarOcultarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoLicencia"));
			
		this.jMenuItemDetalleAbrirOrderByTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoLicencia"));
			
		this.jMenuItemDetalleMostarOcultarTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoLicencia"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoLicencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoLicencia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoLicencia"));
			
		this.jMenuItemNuevoGuardarCambiosTipoLicencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoLicencia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoLicencia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoLicencia"));

		this.jCheckBoxSeleccionadosTipoLicencia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoLicencia"));
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoLicencia"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoLicencia.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoLicencia"));
			
		this.jComboBoxTiposAccionesTipoLicencia.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoLicencia"));
					
		this.jComboBoxTiposSeleccionarTipoLicencia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoLicencia"));
			
		this.jTextFieldValorCampoGeneralTipoLicencia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoLicencia"));		
		
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonidTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLicenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLicencia.jButtonid_empresaTipoLicenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLicenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonid_empresaTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLicenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtoncodigoTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLicenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonnombreTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLicenciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoLicencia!=null) {
				this.jInternalFrameReporteDinamicoTipoLicencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLicencia"));
				this.jInternalFrameReporteDinamicoTipoLicencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLicencia"));
				this.jInternalFrameReporteDinamicoTipoLicencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLicencia"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoLicencia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLicencia"));				
			//this.jButtonGenerarReporteDinamicoTipoLicencia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLicencia"));
			//this.jButtonGenerarExcelReporteDinamicoTipoLicencia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLicencia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoLicencia!=null) {
				this.jInternalFrameImportacionTipoLicencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoLicencia"));
				this.jInternalFrameImportacionTipoLicencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoLicencia"));
				this.jInternalFrameImportacionTipoLicencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoLicencia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoLicencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoLicencia"));
			
			this.jButtonAbrirOrderByToolBarTipoLicencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoLicencia"));			
			
			if(this.jInternalFrameOrderByTipoLicencia!=null) {
				this.jInternalFrameOrderByTipoLicencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoLicencia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLicencia.jTabbedPaneRelacionesTipoLicencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoLicencia"));
		
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
            		closingInternalFrameTipoLicencia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoLicencia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoLicencia = (JInternalFrameBase)event.getSource();
	            	
	            TipoLicenciaBeanSwingJInternalFrame jInternalFrameParent=(TipoLicenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoLicencia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoLicenciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoLicencia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoLicenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoLicencia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoLicencia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLicenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLicenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLicenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoLicencia";
		inputMap = this.jButtonNuevoTipoLicencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoLicencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoLicenciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLicenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLicenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLicenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoLicencia";
		inputMap = this.jButtonNuevoRelacionesTipoLicencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoLicencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoLicenciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoLicencia";
		inputMap = this.jButtonModificarTipoLicencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoLicencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoLicenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoLicencia";
		inputMap = this.jButtonActualizarTipoLicencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoLicencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoLicenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoLicencia";
		inputMap = this.jButtonEliminarTipoLicencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoLicencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoLicenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoLicencia";
		inputMap = this.jButtonCancelarTipoLicencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoLicencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoLicenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoLicencia";
		inputMap = this.jButtonCerrarTipoLicencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoLicencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoLicenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoLicencia";
		inputMap = this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosTipoLicencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoLicencia.jButtonGuardarCambiosTipoLicencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoLicenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoLicencia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoLicenciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoLicencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoLicenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoLicencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoLicenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoLicencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoLicenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonidTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLicenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLicencia.jButtonid_empresaTipoLicenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLicenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonid_empresaTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLicenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtoncodigoTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoLicenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLicencia.jButtonnombreTipoLicenciaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLicenciaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoLicencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoLicenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoLicenciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoLicencia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoLicencia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
					tipolicenciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLicencia tipolicenciaAux:tipolicencias) {
					tipolicenciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoLicenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoLicencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
						tipolicenciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLicencia tipolicenciaAux:tipolicencias) {
						tipolicenciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLicencia tipolicenciaAux:tipolicencias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoLicencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoLicencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoLicencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoLicencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoLicenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoLicencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoLicencia.getSelectedRows();
			
			TipoLicencia tipolicenciaLocal=new TipoLicencia();
			
			//this.seleccionarTodosTipoLicencia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolicenciaLocal =(TipoLicencia) this.tipolicenciaLogic.getTipoLicencias().toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipolicenciaLocal =(TipoLicencia) this.tipolicencias.toArray()[this.jTableDatosTipoLicencia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipolicenciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
						tipolicenciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLicencia tipolicenciaAux:tipolicencias) {
						tipolicenciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoLicencia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoLicencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoLicencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoLicencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoLicenciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoLicenciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoLicenciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoLicencia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoLicencia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoLicencia tipolicenciaAux:this.tipolicenciaLogic.getTipoLicencias()) {
				
						if(sTipoSeleccionar.equals(TipoLicenciaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipolicenciaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoLicenciaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipolicenciaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLicencia tipolicenciaAux:tipolicencias) {
					
						if(sTipoSeleccionar.equals(TipoLicenciaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipolicenciaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoLicenciaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipolicenciaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoLicencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoLicenciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoLicencia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoLicencia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoLicencia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoLicencia) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoLicencia(conSplash);
				
					this.generarReporteTipoLicenciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoLicenciasSeleccionados();
				//this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoLicenciasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoLicenciasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoLicencia();
				
				this.exportarTipoLicenciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoLicencias();
				//this.importarTipoLicencias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoLicencia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoLicenciasSeleccionados();
				//this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Licencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoLicencia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoLicencia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoLicencia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoLicenciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoLicencia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoLicencia(conSplash);
					
						//this.actualizarParametrosGeneralTipoLicencia();
						
						this.generarReporteProcesoAccionTipoLicenciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoLicenciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo LicenciaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Licencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoLicencia();
				
						this.actualizarParametrosGeneralTipoLicencia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipolicenciaReturnGeneral=tipolicenciaLogic.procesarAccionTipoLicenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipolicenciaLogic.getTipoLicencias(),this.tipolicenciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoLicenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoLicencia();
					
					TipoLicenciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoLicenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoLicencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoLicencia.jComboBoxTiposAccionesFormularioTipoLicencia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoLicencia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoLicenciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoLicencia();
			
			if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		
			TipoLicencia tipolicencia=new TipoLicencia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoLicencia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoLicencia.getSelectedItem();
			
			
			
			
			tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipolicenciasSeleccionados.size()==1) {
				for(TipoLicencia tipolicenciaAux:tipolicenciasSeleccionados) {
					tipolicencia=tipolicenciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoLicencia();
			
      		//this.finishProcessTipoLicencia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoLicenciaReturnGeneral() throws Exception {
		if(this.tipolicenciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipolicenciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipolicenciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipolicenciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipolicenciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipolicenciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoLicencia(false);
		}
		
		if(this.tipolicenciaReturnGeneral.getConRetornoLista() || this.tipolicenciaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipolicenciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipolicenciaLogic.setTipoLicencias(this.tipolicenciaReturnGeneral.getTipoLicencias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipolicenciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipolicenciaLogic.setTipoLicencia(this.tipolicenciaReturnGeneral.getTipoLicencia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoLicencia(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoLicencia() throws Exception {
		
		
	}
	
	public ArrayList<TipoLicencia> getTipoLicenciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoLicencia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoLicencia tipolicenciaAux:tipolicenciaLogic.getTipoLicencias()) {
					if(tipolicenciaAux.getIsSelected()) {
						tipolicenciasSeleccionados.add(tipolicenciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLicencia tipolicenciaAux:this.tipolicencias) {
					if(tipolicenciaAux.getIsSelected()) {
						tipolicenciasSeleccionados.add(tipolicenciaAux);				
					}
				}
			}
			
			if(tipolicenciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipolicenciasSeleccionados.addAll(this.tipolicenciaLogic.getTipoLicencias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipolicenciasSeleccionados.addAll(this.tipolicencias);				
					}
				}
			}
		} else {
			tipolicenciasSeleccionados.add(this.tipolicencia);
		}
		
		return tipolicenciasSeleccionados;
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
	
	public void generarReporteTipoLicenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoLicenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoLicenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoLicenciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoLicenciasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Licencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoLicenciasSeleccionados() throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoLicencias("Todos",tipolicenciasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoLicenciasSeleccionados() throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoLicencias("Todos",tipolicenciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoLicenciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoLicencias("Todos",tipolicenciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoLicenciasSeleccionados() throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoLicencia();
		
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoLicencia();
		
		
		//this.generarReporteTipoLicencias("Todos",tipolicenciasSeleccionados ,tipolicenciaImplementable,tipolicenciaImplementableHome);
	}
	
	public void mostrarImportacionTipoLicencias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoLicencia();
		
		this.abrirFrameImportacionTipoLicencia();		
		
			
		//this.generarReporteTipoLicencias("Todos",tipolicenciasSeleccionados ,tipolicenciaImplementable,tipolicenciaImplementableHome);
	}
	
	public void importarTipoLicencias() throws Exception {		
	
	}
	
	public void exportarTipoLicenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoLicenciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoLicenciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoLicenciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Licencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoLicenciasSeleccionados() throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolicencia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoLicencia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoLicencia tipolicenciaAux:tipolicenciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoLicencia(tipolicenciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipolicenciaAux.setsDetalleGeneralEntityReporte(tipolicenciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoLicencia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoLicenciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLicenciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLicenciaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLicenciaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoLicencia(TipoLicencia tipolicencia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipolicencia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolicencia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolicencia.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolicencia.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolicencia.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoLicenciasSeleccionados() throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolicencia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoLicencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoLicencia(row);				
				iRow++;
			}				
			
			for(TipoLicencia tipolicenciaAux:tipolicenciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoLicencia(tipolicenciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoLicenciasSeleccionados() throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();		
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolicencia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipolicencias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipolicencia");
			//elementRoot.appendChild(element);
		
			for(TipoLicencia tipolicenciaAux:tipolicenciasSeleccionados) {
				element = document.createElement("tipolicencia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoLicencia(tipolicenciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Licencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoLicencia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLicenciaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoLicencia(TipoLicencia tipolicencia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipolicencia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolicencia.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolicencia.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolicencia.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoLicencia(TipoLicencia tipolicencia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoLicenciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipolicencia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoLicenciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipolicencia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoLicenciaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipolicencia.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoLicenciaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipolicencia.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoLicenciaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipolicencia.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoLicenciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoLicencia> tipolicenciasSeleccionados=new ArrayList<TipoLicencia>();
		
		tipolicenciasSeleccionados=this.getTipoLicenciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoLicencia(tipolicenciasSeleccionados);
		
		this.generarReporteTipoLicencias("Todos",tipolicenciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoLicencia(ArrayList<TipoLicencia> tipolicenciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoLicencia tipolicenciaAux:tipolicenciasSeleccionados) {
				tipolicenciaAux.setsDetalleGeneralEntityReporte(tipolicenciaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipolicenciaAux.setsDescripcionGeneralEntityReporte1(tipolicenciaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoLicenciaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipolicenciaAux.setsDescripcionGeneralEntityReporte1(tipolicenciaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoLicenciaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipolicenciaAux.setsDescripcionGeneralEntityReporte1(tipolicenciaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLicenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoLicencia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoLicencia=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=true;
				this.isVisibilidadCeldaGuardarCambiosTipoLicencia=true;
			}
			
			this.isVisibilidadCeldaModificarTipoLicencia=false;
			this.isVisibilidadCeldaActualizarTipoLicencia=false;
			this.isVisibilidadCeldaEliminarTipoLicencia=false;
			this.isVisibilidadCeldaCancelarTipoLicencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLicencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoLicencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=false;
			this.isVisibilidadCeldaModificarTipoLicencia=false;
			this.isVisibilidadCeldaActualizarTipoLicencia=true;
			this.isVisibilidadCeldaEliminarTipoLicencia=false;
			this.isVisibilidadCeldaCancelarTipoLicencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLicencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoLicencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=false;
			this.isVisibilidadCeldaModificarTipoLicencia=false;
			this.isVisibilidadCeldaActualizarTipoLicencia=true;
			this.isVisibilidadCeldaEliminarTipoLicencia=true;
			this.isVisibilidadCeldaCancelarTipoLicencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLicencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoLicencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=false;
			this.isVisibilidadCeldaModificarTipoLicencia=false;
			this.isVisibilidadCeldaActualizarTipoLicencia=true;
			this.isVisibilidadCeldaEliminarTipoLicencia=false;
			this.isVisibilidadCeldaCancelarTipoLicencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoLicencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=true;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=true;
			this.isVisibilidadCeldaModificarTipoLicencia=false;
			this.isVisibilidadCeldaActualizarTipoLicencia=false;
			this.isVisibilidadCeldaEliminarTipoLicencia=false;
			this.isVisibilidadCeldaCancelarTipoLicencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLicencia=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoLicencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=false;
			this.isVisibilidadCeldaActualizarTipoLicencia=false;
			this.isVisibilidadCeldaEliminarTipoLicencia=false;
			this.isVisibilidadCeldaCancelarTipoLicencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoLicencia=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=false;
			this.isVisibilidadCeldaModificarTipoLicencia=true;
			this.isVisibilidadCeldaActualizarTipoLicencia=false;
			this.isVisibilidadCeldaEliminarTipoLicencia=false;
			this.isVisibilidadCeldaCancelarTipoLicencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLicencia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoLicencia=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=true;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=true;
		} else {
			this.actualizarEstadoPanelsTipoLicencia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoLicencia=false;
			//this.isVisibilidadCeldaVerFormTipoLicencia=false;
			this.isVisibilidadCeldaDuplicarTipoLicencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipolicenciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoLicencia=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLicencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			if(!tipolicenciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;												
			}
			
			this.jButtonCerrarTipoLicencia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoLicencia=false;
		}
		
		if(!this.permiteMantenimiento(this.tipolicencia)) {
			this.isVisibilidadCeldaActualizarTipoLicencia=false;
			this.isVisibilidadCeldaEliminarTipoLicencia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoLicencia() {
	}
	
	public void actualizarEstadoPanelsTipoLicencia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoLicencia!=null) {
				this.jScrollPanelDatosEdicionTipoLicencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLicencia!=null) {
				this.jScrollPanelDatosTipoLicencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLicencia!=null) {
				this.jPanelPaginacionTipoLicencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoLicencia!=null) {
				this.jScrollPanelDatosEdicionTipoLicencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoLicencia!=null) {
				this.jScrollPanelDatosTipoLicencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLicencia!=null) {
				this.jPanelPaginacionTipoLicencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoLicencia!=null) {
				this.jScrollPanelDatosEdicionTipoLicencia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoLicencia!=null) {
				this.jScrollPanelDatosTipoLicencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLicencia!=null) {
				this.jPanelPaginacionTipoLicencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoLicencia!=null) {
				this.jScrollPanelDatosEdicionTipoLicencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoLicencia!=null) {
				this.jScrollPanelDatosTipoLicencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLicencia!=null) {
				this.jPanelPaginacionTipoLicencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoLicencia!=null) {
				this.jScrollPanelDatosEdicionTipoLicencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLicencia!=null) {
				this.jScrollPanelDatosTipoLicencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLicencia!=null) {
				this.jPanelPaginacionTipoLicencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoLicencia!=null) {
				this.jScrollPanelDatosEdicionTipoLicencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLicencia!=null) {
				this.jScrollPanelDatosTipoLicencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLicencia!=null) {
				this.jPanelPaginacionTipoLicencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoLicencia!=null) {
				this.jScrollPanelDatosEdicionTipoLicencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLicencia!=null) {
				this.jScrollPanelDatosTipoLicencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLicencia!=null) {
				this.jPanelPaginacionTipoLicencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
					this.jTabbedPaneBusquedasTipoLicencia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLicencia!=null) {
				this.jTabbedPaneBusquedasTipoLicencia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoLicencia!=null) {
				this.jPanelParametrosReportesTipoLicencia.setVisible(true);
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
		
		//TipoLicenciaSessionBean tipolicenciaSessionBean=new TipoLicenciaSessionBean();
		
		if(this.tipolicenciaSessionBean==null) {
			this.tipolicenciaSessionBean=new TipoLicenciaSessionBean();
		}
		
		this.tipolicenciaSessionBean.setsUltimaBusquedaTipoLicencia(this.getsAccionBusqueda());
		this.tipolicenciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipolicenciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipolicenciaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoLicenciaSessionBean tipolicenciaSessionBean=new TipoLicenciaSessionBean();
		
		if(this.tipolicenciaSessionBean==null) {
			this.tipolicenciaSessionBean=new TipoLicenciaSessionBean();
		}
		
		if(this.tipolicenciaSessionBean.getsUltimaBusquedaTipoLicencia()!=null&&!this.tipolicenciaSessionBean.getsUltimaBusquedaTipoLicencia().equals("")) {
			this.setsAccionBusqueda(tipolicenciaSessionBean.getsUltimaBusquedaTipoLicencia());
			this.setiNumeroPaginacion(tipolicenciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipolicenciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipolicenciaSessionBean.getid_empresa());
				tipolicenciaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipolicenciaSessionBean.setsUltimaBusquedaTipoLicencia("");
		this.tipolicenciaSessionBean.setiNumeroPaginacion(TipoLicenciaConstantesFunciones.INUMEROPAGINACION);
		this.tipolicenciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoLicencia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoLicencia() {
		this.updateBorderResaltarBusquedasFormularioTipoLicencia();
		this.updateVisibilidadBusquedasFormularioTipoLicencia();
		this.updateHabilitarBusquedasFormularioTipoLicencia();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoLicencia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoLicencia.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoLicencia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoLicencia.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoLicencia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoLicencia.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoLicencia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoLicencia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoLicencia() throws Exception {

		if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoLicencia();
		this.updateVisibilidadResaltarControlesFormularioTipoLicencia();
		this.updateHabilitarResaltarControlesFormularioTipoLicencia();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoLicencia() throws Exception {
		if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipolicenciaConstantesFunciones.resaltaridTipoLicencia!=null && this.jInternalFrameDetalleFormTipoLicencia!=null) {this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.setBorder(this.tipolicenciaConstantesFunciones.resaltaridTipoLicencia);}
		if(this.tipolicenciaConstantesFunciones.resaltarid_empresaTipoLicencia!=null && this.jInternalFrameDetalleFormTipoLicencia!=null) {this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setBorder(this.tipolicenciaConstantesFunciones.resaltarid_empresaTipoLicencia);}
		if(this.tipolicenciaConstantesFunciones.resaltarcodigoTipoLicencia!=null && this.jInternalFrameDetalleFormTipoLicencia!=null) {this.jInternalFrameDetalleFormTipoLicencia.jTextFieldcodigoTipoLicencia.setBorder(this.tipolicenciaConstantesFunciones.resaltarcodigoTipoLicencia);}
		if(this.tipolicenciaConstantesFunciones.resaltarnombreTipoLicencia!=null && this.jInternalFrameDetalleFormTipoLicencia!=null) {this.jInternalFrameDetalleFormTipoLicencia.jTextAreanombreTipoLicencia.setBorder(this.tipolicenciaConstantesFunciones.resaltarnombreTipoLicencia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoLicencia() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
	
		//this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.setVisible(this.tipolicenciaConstantesFunciones.mostraridTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jPanelidTipoLicencia.setVisible(this.tipolicenciaConstantesFunciones.mostraridTipoLicencia);
		//this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setVisible(this.tipolicenciaConstantesFunciones.mostrarid_empresaTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jPanelid_empresaTipoLicencia.setVisible(this.tipolicenciaConstantesFunciones.mostrarid_empresaTipoLicencia);
		//this.jInternalFrameDetalleFormTipoLicencia.jTextFieldcodigoTipoLicencia.setVisible(this.tipolicenciaConstantesFunciones.mostrarcodigoTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jPanelcodigoTipoLicencia.setVisible(this.tipolicenciaConstantesFunciones.mostrarcodigoTipoLicencia);
		//this.jInternalFrameDetalleFormTipoLicencia.jTextAreanombreTipoLicencia.setVisible(this.tipolicenciaConstantesFunciones.mostrarnombreTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jPanelnombreTipoLicencia.setVisible(this.tipolicenciaConstantesFunciones.mostrarnombreTipoLicencia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoLicencia() throws Exception {
		if(this.jInternalFrameDetalleFormTipoLicencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoLicencia!=null) {
	
		this.jInternalFrameDetalleFormTipoLicencia.jLabelidTipoLicencia.setEnabled(this.tipolicenciaConstantesFunciones.activaridTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jComboBoxid_empresaTipoLicencia.setEnabled(this.tipolicenciaConstantesFunciones.activarid_empresaTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jTextFieldcodigoTipoLicencia.setEnabled(this.tipolicenciaConstantesFunciones.activarcodigoTipoLicencia);
		this.jInternalFrameDetalleFormTipoLicencia.jTextAreanombreTipoLicencia.setEnabled(this.tipolicenciaConstantesFunciones.activarnombreTipoLicencia);
		}
	}
	
		
}