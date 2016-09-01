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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoInversionConstantesFunciones;
import com.bydan.erp.cartera.util.TipoInversionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoInversionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoInversionBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class TipoInversionBeanSwingJInternalFrame extends TipoInversionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoInversionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoInversion> tipoinversionValidator = new ClassValidator<TipoInversion>(TipoInversion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoInversion tipoinversion;	
	public TipoInversion tipoinversionAux;
	public TipoInversion tipoinversionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoInversion tipoinversionTotales;
	public Long idTipoInversionActual;
	public Long iIdNuevoTipoInversion=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosAccionista=false;

	public Boolean getIsTienePermisosAccionista() {
		return isTienePermisosAccionista;
	}

	public void setIsTienePermisosAccionista(Boolean isTienePermisosAccionista) {
		this.isTienePermisosAccionista= isTienePermisosAccionista;
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
	
	public Boolean isPermisoTodoTipoInversion;
	public Boolean isPermisoNuevoTipoInversion;
	public Boolean isPermisoActualizarTipoInversion;
	public Boolean isPermisoActualizarOriginalTipoInversion;
	public Boolean isPermisoEliminarTipoInversion;
	public Boolean isPermisoGuardarCambiosTipoInversion;
	public Boolean isPermisoConsultaTipoInversion;
	public Boolean isPermisoBusquedaTipoInversion;
	public Boolean isPermisoReporteTipoInversion;
	public Boolean isPermisoPaginacionMedioTipoInversion;
	public Boolean isPermisoPaginacionAltoTipoInversion;
	public Boolean isPermisoPaginacionTodoTipoInversion;
	public Boolean isPermisoCopiarTipoInversion;
	public Boolean isPermisoVerFormTipoInversion;
	public Boolean isPermisoDuplicarTipoInversion;
	public Boolean isPermisoOrdenTipoInversion;
	
	
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
	
	public TipoInversionParameterReturnGeneral tipoinversionReturnGeneral;
	public TipoInversionParameterReturnGeneral tipoinversionParameterGeneral;
	
	

	public AccionistaLogic accionistaLogic=null;

	public AccionistaLogic getAccionistaLogic() {
		return accionistaLogic;
	}

	public void setAccionistaLogic(AccionistaLogic accionistaLogic) {
		this.accionistaLogic = accionistaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoInversion=false;
	public Boolean esParaAccionDesdeFormularioTipoInversion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoInversionSessionBeanAdditional tipoinversionSessionBeanAdditional=null;
	
	public TipoInversionSessionBeanAdditional getTipoInversionSessionBeanAdditional() {
		return this.tipoinversionSessionBeanAdditional;
	}
	
	public void setTipoInversionSessionBeanAdditional(TipoInversionSessionBeanAdditional tipoinversionSessionBeanAdditional) {
		try {
			this.tipoinversionSessionBeanAdditional=tipoinversionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoInversionBeanSwingJInternalFrameAdditional tipoinversionBeanSwingJInternalFrameAdditional=null;
	//public class TipoInversionBeanSwingJInternalFrame
	
	public TipoInversionBeanSwingJInternalFrameAdditional getTipoInversionBeanSwingJInternalFrameAdditional() {
		return this.tipoinversionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoInversionBeanSwingJInternalFrameAdditional(TipoInversionBeanSwingJInternalFrameAdditional tipoinversionBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoinversionBeanSwingJInternalFrameAdditional=tipoinversionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoInversionLogic tipoinversionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoInversion tipoinversionBean;
	public TipoInversionConstantesFunciones tipoinversionConstantesFunciones;
	//public TipoInversionParameterReturnGeneral tipoinversionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoInversion> tipoinversions;	
	//public List<TipoInversion> tipoinversionsEliminados;
	//public List<TipoInversion> tipoinversionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoInversion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoInversion=true;
	public Boolean isVisibilidadCeldaCopiarTipoInversion=true;
	public Boolean isVisibilidadCeldaVerFormTipoInversion=true;
	public Boolean isVisibilidadCeldaOrdenTipoInversion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
	public Boolean isVisibilidadCeldaModificarTipoInversion=false;
	public Boolean isVisibilidadCeldaActualizarTipoInversion=false;
	public Boolean isVisibilidadCeldaEliminarTipoInversion=false;
	public Boolean isVisibilidadCeldaCancelarTipoInversion=false;
	public Boolean isVisibilidadCeldaGuardarTipoInversion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoInversion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoInversion() {
		return this.iIdNuevoTipoInversion;
	}

	public void setiIdNuevoTipoInversion(Long iIdNuevoTipoInversion) {
		this.iIdNuevoTipoInversion = iIdNuevoTipoInversion;
	}
	
	public Long getidTipoInversionActual() {
		return this.idTipoInversionActual;
	}

	public void setidTipoInversionActual(Long idTipoInversionActual) {
		this.idTipoInversionActual = idTipoInversionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoInversion gettipoinversion() {
		return this.tipoinversion;
	}

	public void settipoinversion(TipoInversion tipoinversion) {
		this.tipoinversion = tipoinversion;
	}
	
	public TipoInversion gettipoinversionAux() {
		return this.tipoinversionAux;
	}

	public void settipoinversionAux(TipoInversion tipoinversionAux) {
		this.tipoinversionAux = tipoinversionAux;
	}				
	
	public TipoInversion gettipoinversionAnterior() {
		return this.tipoinversionAnterior;
	}

	public void settipoinversionAnterior(TipoInversion tipoinversionAnterior) {
		this.tipoinversionAnterior = tipoinversionAnterior;
	}	
	
	public TipoInversion gettipoinversionTotales() {
		return this.tipoinversionTotales;
	}

	public void settipoinversionTotales(TipoInversion tipoinversionTotales) {
		this.tipoinversionTotales = tipoinversionTotales;
	}	
	
	public TipoInversion gettipoinversionBean() {
		return this.tipoinversionBean;
	}

	public void settipoinversionBean(TipoInversion tipoinversionBean) {
		this.tipoinversionBean = tipoinversionBean;
	}	
	
	public TipoInversionParameterReturnGeneral gettipoinversionReturnGeneral() {
		return this.tipoinversionReturnGeneral;
	}

	public void settipoinversionReturnGeneral(TipoInversionParameterReturnGeneral tipoinversionReturnGeneral) {
		this.tipoinversionReturnGeneral = tipoinversionReturnGeneral;
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
	
	
	public TipoInversionLogic getTipoInversionLogic()	{		
		return tipoinversionLogic;
	}

	public void setTipoInversionLogic(TipoInversionLogic tipoinversionLogic) {
		this.tipoinversionLogic = tipoinversionLogic;
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
	
	public Boolean getIsEsNuevoTipoInversion() {
		return isEsNuevoTipoInversion;
	}

	public void setIsEsNuevoTipoInversion(Boolean isEsNuevoTipoInversion) {
		this.isEsNuevoTipoInversion = isEsNuevoTipoInversion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoInversion() {
		return esParaAccionDesdeFormularioTipoInversion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoInversion(Boolean esParaAccionDesdeFormularioTipoInversion) {
		this.esParaAccionDesdeFormularioTipoInversion = esParaAccionDesdeFormularioTipoInversion;
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

			if(this.tipoinversionSessionBean==null) {
				this.tipoinversionSessionBean=new TipoInversionSessionBean();
			}

			if(!this.tipoinversionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoinversionSessionBean.getlidEmpresaActual());
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

					if(this.tipoinversion!=null) {
						this.tipoinversion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoInversion!=null) {
						this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoInversion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoInversion!=null) {
						if(this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoInversionGenerico)throws Exception
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
				jComboBoxid_empresaTipoInversionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoInversionGenerico!=null && jComboBoxid_empresaTipoInversionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoInversionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoInversion tipoinversion,JComboBox jComboBoxid_empresaTipoInversionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoInversionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoInversionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoinversion.setid_empresa(empresaAux.getId());
				tipoinversion.setempresa_descripcion(TipoInversionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoinversion.setEmpresa(empresaAux);			}
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

					if(!TipoInversionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoInversion!=null) { 
							this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoInversion!=null) { 
					}

					if(!TipoInversionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoInversion!=null) {
							this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoInversion!=null) {
							this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoInversion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoInversionConstantesFunciones.refrescarForeignKeysDescripcionesTipoInversion(this.tipoinversionLogic.getTipoInversions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoInversionConstantesFunciones.refrescarForeignKeysDescripcionesTipoInversion(this.tipoinversions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoinversionLogic.setTipoInversions(this.tipoinversions);
			tipoinversionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoInversionParameterReturnGeneral getTipoInversionParameterGeneral() {
		return this.tipoinversionParameterGeneral;
	}
	
	public void setTipoInversionParameterGeneral(TipoInversionParameterReturnGeneral tipoinversionParameterGeneral) {
		this.tipoinversionParameterGeneral = tipoinversionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoInversion() {
		return isPermisoTodoTipoInversion;
	}

	public void setIsPermisoTodoTipoInversion(Boolean isPermisoTodoTipoInversion) {
		this.isPermisoTodoTipoInversion = isPermisoTodoTipoInversion;
	}

	public Boolean getIsPermisoNuevoTipoInversion() {
		return isPermisoNuevoTipoInversion;
	}

	public void setIsPermisoNuevoTipoInversion(Boolean isPermisoNuevoTipoInversion) {
		this.isPermisoNuevoTipoInversion = isPermisoNuevoTipoInversion;
	}

	public Boolean getIsPermisoActualizarTipoInversion() {
		return isPermisoActualizarTipoInversion;
	}

	public void setIsPermisoActualizarTipoInversion(Boolean isPermisoActualizarTipoInversion) {
		this.isPermisoActualizarTipoInversion = isPermisoActualizarTipoInversion;
	}

	public Boolean getIsPermisoEliminarTipoInversion() {
		return isPermisoEliminarTipoInversion;
	}

	public void setIsPermisoEliminarTipoInversion(Boolean isPermisoEliminarTipoInversion) {
		this.isPermisoEliminarTipoInversion = isPermisoEliminarTipoInversion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoInversion() {
		return isPermisoGuardarCambiosTipoInversion;
	}

	public void setIsPermisoGuardarCambiosTipoInversion(Boolean isPermisoGuardarCambiosTipoInversion) {
		this.isPermisoGuardarCambiosTipoInversion = isPermisoGuardarCambiosTipoInversion;
	}
	
	public Boolean getIsPermisoConsultaTipoInversion() {
		return isPermisoConsultaTipoInversion;
	}

	public void setIsPermisoConsultaTipoInversion(Boolean isPermisoConsultaTipoInversion) {
		this.isPermisoConsultaTipoInversion = isPermisoConsultaTipoInversion;
	}

	public Boolean getIsPermisoBusquedaTipoInversion() {
		return isPermisoBusquedaTipoInversion;
	}

	public void setIsPermisoBusquedaTipoInversion(Boolean isPermisoBusquedaTipoInversion) {
		this.isPermisoBusquedaTipoInversion = isPermisoBusquedaTipoInversion;
	}

	public Boolean getIsPermisoReporteTipoInversion() {
		return isPermisoReporteTipoInversion;
	}

	public void setIsPermisoReporteTipoInversion(Boolean isPermisoReporteTipoInversion) {
		this.isPermisoReporteTipoInversion = isPermisoReporteTipoInversion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoInversion() {
		return isPermisoPaginacionMedioTipoInversion;
	}

	public void setIsPermisoPaginacionMedioTipoInversion(Boolean isPermisoPaginacionMedioTipoInversion) {
		this.isPermisoPaginacionMedioTipoInversion = isPermisoPaginacionMedioTipoInversion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoInversion() {
		return isPermisoPaginacionTodoTipoInversion;
	}

	public void setIsPermisoPaginacionTodoTipoInversion(Boolean isPermisoPaginacionTodoTipoInversion) {
		this.isPermisoPaginacionTodoTipoInversion = isPermisoPaginacionTodoTipoInversion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoInversion() {
		return isPermisoPaginacionAltoTipoInversion;
	}

	public void setIsPermisoPaginacionAltoTipoInversion(Boolean isPermisoPaginacionAltoTipoInversion) {
		this.isPermisoPaginacionAltoTipoInversion = isPermisoPaginacionAltoTipoInversion;
	}
	
	public Boolean getIsPermisoCopiarTipoInversion() {
		return isPermisoCopiarTipoInversion;
	}

	public void setIsPermisoCopiarTipoInversion(Boolean isPermisoCopiarTipoInversion) {
		this.isPermisoCopiarTipoInversion = isPermisoCopiarTipoInversion;
	}
	
	public Boolean getIsPermisoVerFormTipoInversion() {
		return isPermisoVerFormTipoInversion;
	}

	public void setIsPermisoVerFormTipoInversion(Boolean isPermisoVerFormTipoInversion) {
		this.isPermisoVerFormTipoInversion = isPermisoVerFormTipoInversion;
	}
	
	public Boolean getIsPermisoDuplicarTipoInversion() {
		return isPermisoDuplicarTipoInversion;
	}

	public void setIsPermisoDuplicarTipoInversion(Boolean isPermisoDuplicarTipoInversion) {
		this.isPermisoDuplicarTipoInversion = isPermisoDuplicarTipoInversion;
	}
	
	public Boolean getIsPermisoOrdenTipoInversion() {
		return isPermisoOrdenTipoInversion;
	}

	public void setIsPermisoOrdenTipoInversion(Boolean isPermisoOrdenTipoInversion) {
		this.isPermisoOrdenTipoInversion = isPermisoOrdenTipoInversion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoInversion() {
		return isVisibilidadCeldaNuevoTipoInversion;
	}

	public void setIsVisibilidadCeldaNuevoTipoInversion(Boolean isVisibilidadCeldaNuevoTipoInversion) {
		this.isVisibilidadCeldaNuevoTipoInversion = isVisibilidadCeldaNuevoTipoInversion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoInversion() {
		return isVisibilidadCeldaDuplicarTipoInversion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoInversion(Boolean isVisibilidadCeldaDuplicarTipoInversion) {
		this.isVisibilidadCeldaDuplicarTipoInversion = isVisibilidadCeldaDuplicarTipoInversion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoInversion() {
		return isVisibilidadCeldaCopiarTipoInversion;
	}

	public void setIsVisibilidadCeldaCopiarTipoInversion(Boolean isVisibilidadCeldaCopiarTipoInversion) {
		this.isVisibilidadCeldaCopiarTipoInversion = isVisibilidadCeldaCopiarTipoInversion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoInversion() {
		return isVisibilidadCeldaVerFormTipoInversion;
	}

	public void setIsVisibilidadCeldaVerFormTipoInversion(Boolean isVisibilidadCeldaVerFormTipoInversion) {
		this.isVisibilidadCeldaVerFormTipoInversion = isVisibilidadCeldaVerFormTipoInversion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoInversion() {
		return isVisibilidadCeldaOrdenTipoInversion;
	}

	public void setIsVisibilidadCeldaOrdenTipoInversion(Boolean isVisibilidadCeldaOrdenTipoInversion) {
		this.isVisibilidadCeldaOrdenTipoInversion = isVisibilidadCeldaOrdenTipoInversion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoInversion() {
		return isVisibilidadCeldaNuevoRelacionesTipoInversion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoInversion(Boolean isVisibilidadCeldaNuevoRelacionesTipoInversion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoInversion = isVisibilidadCeldaNuevoRelacionesTipoInversion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoInversion() {
		return isVisibilidadCeldaModificarTipoInversion;
	}

	public void setIsVisibilidadCeldaModificarTipoInversion(Boolean isVisibilidadCeldaModificarTipoInversion) {
		this.isVisibilidadCeldaModificarTipoInversion = isVisibilidadCeldaModificarTipoInversion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoInversion() {
		return isVisibilidadCeldaActualizarTipoInversion;
	}

	public void setIsVisibilidadCeldaActualizarTipoInversion(Boolean isVisibilidadCeldaActualizarTipoInversion) {
		this.isVisibilidadCeldaActualizarTipoInversion = isVisibilidadCeldaActualizarTipoInversion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoInversion() {
		return isVisibilidadCeldaEliminarTipoInversion;
	}

	public void setIsVisibilidadCeldaEliminarTipoInversion(Boolean isVisibilidadCeldaEliminarTipoInversion) {
		this.isVisibilidadCeldaEliminarTipoInversion = isVisibilidadCeldaEliminarTipoInversion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoInversion() {
		return isVisibilidadCeldaCancelarTipoInversion;
	}

	public void setIsVisibilidadCeldaCancelarTipoInversion(Boolean isVisibilidadCeldaCancelarTipoInversion) {
		this.isVisibilidadCeldaCancelarTipoInversion = isVisibilidadCeldaCancelarTipoInversion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoInversion() {
		return isVisibilidadCeldaGuardarTipoInversion;
	}

	public void setIsVisibilidadCeldaGuardarTipoInversion(Boolean isVisibilidadCeldaGuardarTipoInversion) {
		this.isVisibilidadCeldaGuardarTipoInversion = isVisibilidadCeldaGuardarTipoInversion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoInversion() {
		return isVisibilidadCeldaGuardarCambiosTipoInversion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoInversion(Boolean isVisibilidadCeldaGuardarCambiosTipoInversion) {
		this.isVisibilidadCeldaGuardarCambiosTipoInversion = isVisibilidadCeldaGuardarCambiosTipoInversion;
	}
		
	public TipoInversionSessionBean gettipoinversionSessionBean() {
		return this.tipoinversionSessionBean;
	}
	
	public void settipoinversionSessionBean(TipoInversionSessionBean tipoinversionSessionBean) {
		this.tipoinversionSessionBean=tipoinversionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoInversion(TipoInversion tipoinversion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoinversion,null);
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
	
	public void bugActualizarReferenciaActual(TipoInversion tipoinversion,TipoInversion tipoinversionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoInversion(tipoinversion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoinversionAux.setId(tipoinversion.getId());
		tipoinversionAux.setVersionRow(tipoinversion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoInversion();
		
			int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoinversionValidator.getInvalidValues(this.tipoinversion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoinversionLogic.setDatosCliente(datosCliente);
			tipoinversionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoinversionAux=new  TipoInversion();
				
				tipoinversionAux.setIsNew(true);
				tipoinversionAux.setIsChanged(true);
				
				tipoinversionAux.setTipoInversionOriginal(this.tipoinversion);
				
				tipoinversionAux.setId(this.tipoinversion.getId());	
				tipoinversionAux.setVersionRow(this.tipoinversion.getVersionRow());	
				tipoinversionAux.setid_empresa(this.tipoinversion.getid_empresa());	
				tipoinversionAux.setcodigo(this.tipoinversion.getcodigo());	
				tipoinversionAux.setnombre(this.tipoinversion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoinversionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoinversionAux,tipoinversionLogic.getTipoInversions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinversionAux,tipoinversions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoinversionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinversionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinversionLogic.saveTipoInversions();//WithConnection
						//tipoinversionLogic.getSetVersionRowTipoInversions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoinversion,tipoinversionAux);
					
					this.refrescarForeignKeysDescripcionesTipoInversion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas().addAll(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistas.addAll(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoinversionLogic.saveTipoInversionRelaciones(tipoinversionAux,this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());//WithConnection
								//tipoinversionLogic.getSetVersionRowTipoInversions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoinversion,tipoinversionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(new ArrayList<Accionista>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistas= new ArrayList<Accionista>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoinversionAux.setAccionistas(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoinversionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoinversionAux,tipoinversionLogic.getTipoInversions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoinversionAux,tipoinversions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoinversion,tipoinversionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoinversionAux=new  TipoInversion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoinversionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoinversionSessionBean.getEsGuardarRelacionado() && this.tipoinversion.getId()>=0)) {
						
					tipoinversionAux.setIsNew(false);
				}
				
				tipoinversionAux.setIsDeleted(false);
			
				tipoinversionAux.setId(this.tipoinversion.getId());	
				tipoinversionAux.setVersionRow(this.tipoinversion.getVersionRow());	
				tipoinversionAux.setid_empresa(this.tipoinversion.getid_empresa());	
				tipoinversionAux.setcodigo(this.tipoinversion.getcodigo());	
				tipoinversionAux.setnombre(this.tipoinversion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoinversionAux,tipoinversionLogic.getTipoInversions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinversionAux,tipoinversions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoinversionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinversionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinversionLogic.saveTipoInversions();//WithConnection
						//tipoinversionLogic.getSetVersionRowTipoInversions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoinversion,tipoinversionAux);
					
					this.refrescarForeignKeysDescripcionesTipoInversion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas().addAll(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistas.addAll(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoinversionLogic.saveTipoInversionRelaciones(tipoinversionAux,this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());//WithConnection
								//tipoinversionLogic.getSetVersionRowTipoInversions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoinversion,tipoinversionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(new ArrayList<Accionista>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistas= new ArrayList<Accionista>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoinversionAux.setAccionistas(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoinversionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoinversionAux,tipoinversionLogic.getTipoInversions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoinversionAux,tipoinversions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoinversion,tipoinversionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoinversionAux=new  TipoInversion();
				
				tipoinversionAux.setIsNew(false);
				tipoinversionAux.setIsChanged(false);
				
				tipoinversionAux.setIsDeleted(true);
				
				tipoinversionAux.setId(this.tipoinversion.getId());	
				tipoinversionAux.setVersionRow(this.tipoinversion.getVersionRow());	
				tipoinversionAux.setid_empresa(this.tipoinversion.getid_empresa());	
				tipoinversionAux.setcodigo(this.tipoinversion.getcodigo());	
				tipoinversionAux.setnombre(this.tipoinversion.getnombre());	
				
				if(this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoinversionAux.getId()>=0) {	
						this.tipoinversionsEliminados.add(tipoinversionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoinversionAux,tipoinversionLogic.getTipoInversions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinversionAux,tipoinversions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoinversionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinversionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinversionLogic.saveTipoInversions();//WithConnection
						//tipoinversionLogic.getSetVersionRowTipoInversions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas().addAll(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistas.addAll(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoinversionLogic.saveTipoInversionRelaciones(tipoinversionAux,this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());//WithConnection
								//tipoinversionLogic.getSetVersionRowTipoInversions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(new ArrayList<Accionista>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistas= new ArrayList<Accionista>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoinversionAux.setAccionistas(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoinversionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoinversionAux,tipoinversionLogic.getTipoInversions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoinversionAux,tipoinversions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.getTipoInversions().addAll(this.tipoinversionsEliminados);
					
					tipoinversionLogic.saveTipoInversions();//WithConnection
					//tipoinversionLogic.getSetVersionRowTipoInversions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoInversion();
				
				this.tipoinversionsEliminados= new ArrayList<TipoInversion>();		
			}
			
			if(this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Inversion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoinversion=tipoinversionAux;
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
      		//this.finishProcessTipoInversion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoInversion tipoinversionLocal) throws Exception {
		
		if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoinversionLocal.setAccionistas(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());
			
			} else {
			
				tipoinversionLocal.setAccionistas(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoInversion tipoinversionLocal) throws Exception {	
		if(this.tipoinversionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoinversionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoInversionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoinversionValidator.getInvalidValues(this.tipoinversion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoInversion tipoinversion,List<TipoInversion> tipoinversions) throws Exception {
		try	{		
			TipoInversionConstantesFunciones.actualizarLista(tipoinversion,tipoinversions,this.tipoinversionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoInversion tipoinversion,List<TipoInversion> tipoinversions) throws Exception {
		try	{			
			TipoInversionConstantesFunciones.actualizarSelectedLista(tipoinversion,tipoinversions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoInversion> tipoinversionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoinversionsLocal=this.tipoinversionLogic.getTipoInversions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoinversionsLocal=this.tipoinversions;
			}
			//ARCHITECTURE
		
			for(TipoInversion tipoinversionLocal:tipoinversionsLocal) {
				if(this.permiteMantenimiento(tipoinversionLocal) && tipoinversionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoInversionConstantesFunciones.getTipoInversionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoInversionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInversion.jLabelid_empresaTipoInversion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoInversionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInversion.jLabelcodigoTipoInversion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoInversionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInversion.jLabelnombreTipoInversion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInversion.jLabelid_empresaTipoInversion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInversion.jLabelcodigoTipoInversion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInversion.jLabelnombreTipoInversion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Accionista")) {
			if(this.tipoinversion==null) {
				this.tipoinversion= new TipoInversion();
			}

			if(this.tipoinversionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoInversion
				this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);

				this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.getaccionista().setTipoInversion(this.tipoinversion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoInversion--;	
		
		
		this.tipoinversionAux=new TipoInversion();
		
		this.tipoinversionAux.setId(this.iIdNuevoTipoInversion);
		this.tipoinversionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoinversionLogic.getTipoInversions().add(this.tipoinversionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoinversions.add(this.tipoinversionAux);
		}
		//ARCHITECTURE
		
		this.tipoinversion=this.tipoinversionAux;
		
		if(TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoInversion(this.tipoinversion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInversion(this.tipoinversion);
		}
				
		//this.setDefaultControlesTipoInversion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoInversion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoInversion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInversion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInversion(this.tipoinversionBean,this.tipoinversion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoInversionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
			classes=TipoInversionConstantesFunciones.getClassesRelationshipsOfTipoInversion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoinversionReturnGeneral=tipoinversionLogic.procesarEventosTipoInversionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinversionLogic.getTipoInversions(),this.tipoinversion,this.tipoinversionParameterGeneral,this.isEsNuevoTipoInversion,classes);//this.tipoinversionLogic.getTipoInversion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoInversion(this.tipoinversionReturnGeneral,this.tipoinversionBean,false);
		
		if(this.tipoinversionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInversion(this.tipoinversionReturnGeneral.getTipoInversion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoInversion(this.tipoinversionReturnGeneral.getTipoInversion());
		}
		
		if(this.tipoinversionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoInversion(this.tipoinversionReturnGeneral.getTipoInversion(),classes);//this.tipoinversionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoInversion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoInversion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoInversionBeanSwingJInternalFrameAdditional.RecargarFormTipoInversion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoInversion(false);
						
			if(tipoinversionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaSessionBean.getEsGuardarRelacionado() && AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAccionistaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInversion();
			}
			
			this.actualizarVisualTableDatosTipoInversion();
			
			this.jTableDatosTipoInversion.setRowSelectionInterval(this.getIndiceNuevoTipoInversion(), this.getIndiceNuevoTipoInversion());
			
			this.seleccionarFilaTablaTipoInversionActual();
						
			this.actualizarEstadoCeldasBotonesTipoInversion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoInversion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoInversion.jTextFieldcodigoTipoInversion.setEnabled(isHabilitar && this.tipoinversionConstantesFunciones.activarcodigoTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jTextAreanombreTipoInversion.setEnabled(isHabilitar && this.tipoinversionConstantesFunciones.activarnombreTipoInversion);	
		//
		this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setEnabled(isHabilitar && this.tipoinversionConstantesFunciones.activarid_empresaTipoInversion);
	};
	
	public void setDefaultControlesTipoInversion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoInversion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoinversionSessionBean.setConGuardarRelaciones(true);			
			this.tipoinversionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoinversionSessionBean.setConGuardarRelaciones(false);			
			this.tipoinversionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoInversion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
				if(tipoinversionAux.getId().equals(this.iIdNuevoTipoInversion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInversion tipoinversionAux:this.tipoinversions) {
				if(tipoinversionAux.getId().equals(this.iIdNuevoTipoInversion)) {
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
	
	public int getIndiceActualTipoInversion(TipoInversion tipoinversion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
				if(tipoinversionAux.getId().equals(tipoinversion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInversion tipoinversionAux:this.tipoinversions) {
				if(tipoinversionAux.getId().equals(tipoinversion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoInversion(TipoInversion tipoinversionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
				if(tipoinversionAux.getTipoInversionOriginal().getId().equals(tipoinversionOriginal.getId())) {
					existe=true;
					tipoinversionOriginal.setId(tipoinversionAux.getId());
					tipoinversionOriginal.setVersionRow(tipoinversionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInversion tipoinversionAux:this.tipoinversions) {
				if(tipoinversionAux.getTipoInversionOriginal().getId().equals(tipoinversionOriginal.getId())) {
					existe=true;
					tipoinversionOriginal.setId(tipoinversionAux.getId());
					tipoinversionOriginal.setVersionRow(tipoinversionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoInversion(Boolean esParaCancelar) throws Exception {
		tipoinversionsAux=new ArrayList<TipoInversion>();
		tipoinversionAux=new TipoInversion();
		
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
					if(tipoinversionAux.getId()<0) {
						tipoinversionsAux.add(tipoinversionAux);
					}		
				}
				this.iIdNuevoTipoInversion=0L;
				this.tipoinversionLogic.getTipoInversions().removeAll(tipoinversionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInversion tipoinversionAux:this.tipoinversions) {
					if(tipoinversionAux.getId()<0) {
						tipoinversionsAux.add(tipoinversionAux);
					}		
				}
				this.iIdNuevoTipoInversion=0L;
				this.tipoinversions.removeAll(tipoinversionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoInversion 
					&& this.tipoinversionLogic.getTipoInversions().size()>0
					) {
					tipoinversionAux=this.tipoinversionLogic.getTipoInversions().get(this.tipoinversionLogic.getTipoInversions().size() - 1);
				
					if(tipoinversionAux.getId()<0) {
						this.tipoinversionLogic.getTipoInversions().remove(tipoinversionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoInversion && this.tipoinversions.size()>0) {
					tipoinversionAux=this.tipoinversions.get(this.tipoinversions.size() - 1);
				
					if(tipoinversionAux.getId()<0) {
						this.tipoinversions.remove(tipoinversionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoInversion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoinversion.getId()<0) {
				this.tipoinversionLogic.getTipoInversions().remove(this.tipoinversion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoinversion.getId()<0) {
				this.tipoinversions.remove(this.tipoinversion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoInversion(List<TipoInversion> tipoinversionsAux) throws Exception {
		TipoInversionConstantesFunciones.setEstadosInicialesTipoInversion(tipoinversionsAux);
	}
	
	public void setEstadosInicialesTipoInversion(TipoInversion tipoinversionAux) throws Exception {
		TipoInversionConstantesFunciones.setEstadosInicialesTipoInversion(tipoinversionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoInversionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoInversion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoInversionActual()) {
				if(!this.isEsNuevoTipoInversion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoInversion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoInversion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoInversionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Inversion ?", "MANTENIMIENTO DE Tipo Inversion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoInversion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoInversion tipoinversion) throws Exception {
		TipoInversionConstantesFunciones.seleccionarAsignar(this.tipoinversion,tipoinversion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoInversion=this.isPermisoActualizarOriginalTipoInversion;
			
			
			this.seleccionarAsignar(tipoinversion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoInversionConstantesFunciones.quitarEspaciosTipoInversion(this.tipoinversion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoInversion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoinversionSessionBean.setsFuncionBusquedaRapida(this.tipoinversionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoInversion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoInversion(esParaCancelar);				
				this.cancelarNuevoTipoInversion(esParaCancelar);								
			}
			
			this.tipoinversion=new TipoInversion();
			
			this.inicializarTipoInversion();
			
			this.actualizarEstadoCeldasBotonesTipoInversion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoInversion() throws Exception {
		try {
			TipoInversionConstantesFunciones.inicializarTipoInversion(this.tipoinversion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoinversionLogic.getTipoInversions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoInversions(String sAccionBusqueda,List<TipoInversion> tipoinversionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoInversion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoInversionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoInversionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoInversion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Inversiones");		
		parameters.put("busquedapor", TipoInversionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Accionista.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoInversionLogic tipoinversionLogicAuxiliar=new TipoInversionLogic();
					tipoinversionLogicAuxiliar.setDatosCliente(tipoinversionLogic.getDatosCliente());				
					tipoinversionLogicAuxiliar.setTipoInversions(tipoinversionsParaReportes);
					
					tipoinversionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoInversionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoinversionsParaReportes=tipoinversionLogicAuxiliar.getTipoInversions();
					
					//tipoinversionLogic.getNewConnexionToDeep();
					
					//for (TipoInversion tipoinversion:tipoinversionsParaReportes) {
					//	tipoinversionLogic.deepLoad(tipoinversion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoinversionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoinversionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileAccionista = AuxiliarReportes.class.getResourceAsStream("AccionistaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_accionista", reportFileAccionista);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoInversion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoInversionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoInversionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoInversion=new JRBeanArrayDataSource(TipoInversionJInternalFrame.TraerTipoInversionBeans(tipoinversionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoInversion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoInversionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoInversionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoInversionBean.TraerTipoInversionBeans(tipoinversionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoInversions(sAccionBusqueda,sTipoArchivoReporte,tipoinversionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoInversions(sAccionBusqueda,sTipoArchivoReporte,tipoinversionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoInversionActionPerformed(null);
					//this.generarExcelReporteTipoInversions(sAccionBusqueda,sTipoArchivoReporte,tipoinversionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoInversions(sAccionBusqueda,sTipoArchivoReporte,tipoinversionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoInversions(sAccionBusqueda,sTipoArchivoReporte,tipoinversionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoInversions(sAccionBusqueda,sTipoArchivoReporte,tipoinversionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoInversions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInversion> tipoinversionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinversion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInversions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInversion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoInversion tipoinversion : tipoinversionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoInversionConstantesFunciones.generarExcelReporteDataTipoInversion("NORMAL",row,workbook,tipoinversion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoInversion(String sTipo,Row row,Workbook workbook) {
		
		TipoInversionConstantesFunciones.generarExcelReporteHeaderTipoInversion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoInversions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInversion> tipoinversionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinversion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInversions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoInversion tipoinversion : tipoinversionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoInversionConstantesFunciones.getTipoInversionDescripcion(tipoinversion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInversionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInversionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinversion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInversionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInversionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinversion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInversionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInversionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinversion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoInversions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInversion> tipoinversionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoInversion> tipoinversionsRespaldo=null;
		
		classes=TipoInversionConstantesFunciones.getClassesRelationshipsOfTipoInversion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoinversionLogic.setDatosCliente(this.datosCliente);
		this.tipoinversionLogic.setDatosDeep(this.datosDeep);
		this.tipoinversionLogic.setIsConDeep(true);
		
		tipoinversionsRespaldo=this.tipoinversionLogic.getTipoInversions();
		
		this.tipoinversionLogic.setTipoInversions(tipoinversionsParaReportes);	
		this.tipoinversionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoinversionsParaReportes=this.tipoinversionLogic.getTipoInversions();
		this.tipoinversionLogic.setTipoInversions(tipoinversionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinversion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInversions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInversion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoInversion tipoinversion : tipoinversionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoInversion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoInversionConstantesFunciones.generarExcelReporteDataTipoInversion("NORMAL",row,workbook,tipoinversion,cellStyleDataAux);
		
			
			


				//Accionista
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AccionistaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoinversion.getAccionistas()!=null && tipoinversion.getAccionistas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AccionistaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AccionistaConstantesFunciones.generarExcelReporteHeaderAccionista("RELACIONADO",row,workbook);
				}

				if(tipoinversion.getAccionistas()!=null) {
					i2=0;
					for(Accionista accionista : tipoinversion.getAccionistas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AccionistaConstantesFunciones.generarExcelReporteDataAccionista("RELACIONADO",row,workbook,accionista,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoInversionConstantesFunciones.getTipoInversionDescripcion(tipoinversion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInversion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoInversion() throws Exception {		
		this.startProcessTipoInversion(true);
	}
	
	public void startProcessTipoInversion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoInversion ,this.jPanelParametrosReportesTipoInversion, this.jScrollPanelDatosTipoInversion,this.jPanelPaginacionTipoInversion, this.jScrollPanelDatosEdicionTipoInversion, this.jPanelAccionesTipoInversion,this.jPanelAccionesFormularioTipoInversion,this.jmenuBarTipoInversion,this.jmenuBarDetalleTipoInversion,this.jTtoolBarTipoInversion,this.jTtoolBarDetalleTipoInversion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInversion=this.jTabbedPaneBusquedasTipoInversion; 
		
		final JPanel jPanelParametrosReportesTipoInversion=this.jPanelParametrosReportesTipoInversion;
		//final JScrollPane jScrollPanelDatosTipoInversion=this.jScrollPanelDatosTipoInversion;
		final JTable jTableDatosTipoInversion=this.jTableDatosTipoInversion;		
		final JPanel jPanelPaginacionTipoInversion=this.jPanelPaginacionTipoInversion;
		//final JScrollPane jScrollPanelDatosEdicionTipoInversion=this.jScrollPanelDatosEdicionTipoInversion;
		final JPanel jPanelAccionesTipoInversion=this.jPanelAccionesTipoInversion;
		
		JPanel jPanelCamposAuxiliarTipoInversion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoInversion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			jPanelCamposAuxiliarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jPanelCamposTipoInversion;
			jPanelAccionesFormularioAuxiliarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jPanelAccionesFormularioTipoInversion;
		}
		
		final JPanel jPanelCamposTipoInversion=jPanelCamposAuxiliarTipoInversion;
		final JPanel jPanelAccionesFormularioTipoInversion=jPanelAccionesFormularioAuxiliarTipoInversion;
		
		
		final JMenuBar jmenuBarTipoInversion=this.jmenuBarTipoInversion;
		final JToolBar jTtoolBarTipoInversion=this.jTtoolBarTipoInversion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoInversion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInversion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			jmenuBarDetalleAuxiliarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jmenuBarDetalleTipoInversion;
			jTtoolBarDetalleAuxiliarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jTtoolBarDetalleTipoInversion;
		}
		
		final JMenuBar jmenuBarDetalleTipoInversion=jmenuBarDetalleAuxiliarTipoInversion;
		final JToolBar jTtoolBarDetalleTipoInversion=jTtoolBarDetalleAuxiliarTipoInversion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInversion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInversion;
			processRunnable.jTableDatos=jTableDatosTipoInversion;
			processRunnable.jPanelCampos=jPanelCamposTipoInversion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInversion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInversion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInversion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInversion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInversion;
			processRunnable.jTtoolBar=jTtoolBarTipoInversion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInversion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoInversion ,jPanelParametrosReportesTipoInversion,jTableDatosTipoInversion, /*jScrollPanelDatosTipoInversion,*/jPanelCamposTipoInversion,jPanelPaginacionTipoInversion, /*jScrollPanelDatosEdicionTipoInversion,*/ jPanelAccionesTipoInversion,jPanelAccionesFormularioTipoInversion,jmenuBarTipoInversion,jmenuBarDetalleTipoInversion,jTtoolBarTipoInversion,jTtoolBarDetalleTipoInversion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoInversion ,jPanelParametrosReportesTipoInversion, jScrollPanelDatosTipoInversion,jPanelPaginacionTipoInversion, jScrollPanelDatosEdicionTipoInversion, jPanelAccionesTipoInversion,jPanelAccionesFormularioTipoInversion,jmenuBarTipoInversion,jmenuBarDetalleTipoInversion,jTtoolBarTipoInversion,jTtoolBarDetalleTipoInversion);
						
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
	
	public void finishProcessTipoInversion() {// throws Exception 
		this.finishProcessTipoInversion(true);
	}
	
	public void finishProcessTipoInversion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoInversion ,this.jPanelParametrosReportesTipoInversion, this.jScrollPanelDatosTipoInversion,this.jPanelPaginacionTipoInversion, this.jScrollPanelDatosEdicionTipoInversion, this.jPanelAccionesTipoInversion,this.jPanelAccionesFormularioTipoInversion,this.jmenuBarTipoInversion,this.jmenuBarDetalleTipoInversion,this.jTtoolBarTipoInversion,this.jTtoolBarDetalleTipoInversion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInversion=this.jTabbedPaneBusquedasTipoInversion; 
		
		final JPanel jPanelParametrosReportesTipoInversion=this.jPanelParametrosReportesTipoInversion;
		//final JScrollPane jScrollPanelDatosTipoInversion=this.jScrollPanelDatosTipoInversion;
		final JTable jTableDatosTipoInversion=this.jTableDatosTipoInversion;		
		final JPanel jPanelPaginacionTipoInversion=this.jPanelPaginacionTipoInversion;
		//final JScrollPane jScrollPanelDatosEdicionTipoInversion=this.jScrollPanelDatosEdicionTipoInversion;
		final JPanel jPanelAccionesTipoInversion=this.jPanelAccionesTipoInversion;
		
		JPanel jPanelCamposAuxiliarTipoInversion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoInversion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			jPanelCamposAuxiliarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jPanelCamposTipoInversion;
			jPanelAccionesFormularioAuxiliarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jPanelAccionesFormularioTipoInversion;
		}
		
		final JPanel jPanelCamposTipoInversion=jPanelCamposAuxiliarTipoInversion;
		final JPanel jPanelAccionesFormularioTipoInversion=jPanelAccionesFormularioAuxiliarTipoInversion;
		
		
		final JMenuBar jmenuBarTipoInversion=this.jmenuBarTipoInversion;		
		final JToolBar jTtoolBarTipoInversion=this.jTtoolBarTipoInversion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoInversion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInversion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			jmenuBarDetalleAuxiliarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jmenuBarDetalleTipoInversion;
			jTtoolBarDetalleAuxiliarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jTtoolBarDetalleTipoInversion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoInversion=jmenuBarDetalleAuxiliarTipoInversion;
		final JToolBar jTtoolBarDetalleTipoInversion=jTtoolBarDetalleAuxiliarTipoInversion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInversion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInversion;
			processRunnable.jTableDatos=jTableDatosTipoInversion;
			processRunnable.jPanelCampos=jPanelCamposTipoInversion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInversion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInversion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInversion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInversion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInversion;
			processRunnable.jTtoolBar=jTtoolBarTipoInversion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInversion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoInversion ,jPanelParametrosReportesTipoInversion, jTableDatosTipoInversion,/*jScrollPanelDatosTipoInversion,*/jPanelCamposTipoInversion,jPanelPaginacionTipoInversion, /*jScrollPanelDatosEdicionTipoInversion,*/ jPanelAccionesTipoInversion,jPanelAccionesFormularioTipoInversion,jmenuBarTipoInversion,jmenuBarDetalleTipoInversion,jTtoolBarTipoInversion,jTtoolBarDetalleTipoInversion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoInversion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoInversion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoInversion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoInversion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoInversion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoInversion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoInversion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoInversion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoInversion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoinversionConstantesFunciones.getsFinalQueryTipoInversion();
		String  finalQueryPaginacionTodos=this.tipoinversionConstantesFunciones.getsFinalQueryTipoInversion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoInversionConstantesFunciones.getArrayColumnasGlobalesNoTipoInversion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoInversionConstantesFunciones.getArrayColumnasGlobalesTipoInversion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoInversionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoinversionsEliminados= new ArrayList<TipoInversion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoInversion();
		
				///*TipoInversionSessionBean*/this.tipoinversionSessionBean=new TipoInversionSessionBean();
			
			if(this.tipoinversionSessionBean==null) {
				this.tipoinversionSessionBean=new TipoInversionSessionBean();
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
					this.iNumeroPaginacion=TipoInversionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoInversionConstantesFunciones.getClassesForeignKeysOfTipoInversion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoinversion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoinversionsAux= new ArrayList<TipoInversion>();
			
				
			tipoinversionLogic.setDatosCliente(this.datosCliente);
			tipoinversionLogic.setDatosDeep(this.datosDeep);
			tipoinversionLogic.setIsConDeep(true);
			
			
			tipoinversionLogic.getTipoInversionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoinversionLogic.getTodosTipoInversions(finalQueryGlobal,pagination);
					
					//tipoinversionLogic.getTodosTipoInversionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoinversionLogic.getTipoInversions()==null|| tipoinversionLogic.getTipoInversions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinversionsAux= new ArrayList<TipoInversion>();
							tipoinversionsAux.addAll(tipoinversionLogic.getTipoInversions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinversionsAux= new ArrayList<TipoInversion>();
							tipoinversionsAux.addAll(tipoinversions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinversionLogic.getTodosTipoInversions(finalQueryGlobal+"",this.pagination);												
							
							//tipoinversionLogic.getTodosTipoInversionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoInversions("Todos",tipoinversionLogic.getTipoInversions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinversionLogic.setTipoInversions(new ArrayList<TipoInversion>());					
							tipoinversionLogic.getTipoInversions().addAll(tipoinversionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinversions=new ArrayList<TipoInversion>();
							tipoinversions.addAll(tipoinversionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoInversion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoInversion=this.idActual;
				
				} else if(this.idTipoInversionActual!=null && this.idTipoInversionActual!=0L) {
					idTipoInversion=idTipoInversionActual;
				}
				
					
				this.sDetalleReporte=TipoInversionConstantesFunciones.getDetalleIndicePorId(idTipoInversion);
				
				this.tipoinversions=new ArrayList<TipoInversion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoinversionLogic.getEntity(idTipoInversion);
					
					//tipoinversionLogic.getEntityWithConnection(idTipoInversion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinversionLogic.setTipoInversions(new ArrayList<TipoInversion>());
					tipoinversionLogic.getTipoInversions().add(tipoinversionLogic.getTipoInversion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinversions=new ArrayList<TipoInversion>();
					this.tipoinversions.add(tipoinversion);
				}
				
				if(tipoinversionLogic.getTipoInversion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoInversionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoinversionLogic.getTipoInversionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoInversionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoInversionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoinversionLogic.getTipoInversions()==null||tipoinversionLogic.getTipoInversions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoinversions==null|| tipoinversions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinversionsAux=new ArrayList<TipoInversion>();
						tipoinversionsAux.addAll(tipoinversionLogic.getTipoInversions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinversionsAux=new ArrayList<TipoInversion>();
							tipoinversionsAux.addAll(tipoinversions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoinversionLogic.getTipoInversionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoInversionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoInversionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoInversions("FK_IdEmpresa",tipoinversionLogic.getTipoInversions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoInversions("FK_IdEmpresa",tipoinversions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinversionLogic.setTipoInversions(new ArrayList<TipoInversion>());
						tipoinversionLogic.getTipoInversions().addAll(tipoinversionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinversions=new ArrayList<TipoInversion>();
							tipoinversions.addAll(tipoinversionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoInversion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoInversion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoinversionLogic.getTipoInversions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinversions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoinversionLogic.getTipoInversions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinversions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoInversion tipoinversion) {
		Boolean permite=true;
		
		if(this.tipoinversion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoInversionConstantesFunciones.getOrderByListaTipoInversion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoInversionConstantesFunciones.getOrderByListaTipoInversion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInversion tipoinversion:tipoinversionLogic.getTipoInversions()) {
				if(tipoinversion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinversionTotales=tipoinversion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInversion tipoinversion:this.tipoinversions) {
				if(tipoinversion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinversionTotales=tipoinversion;
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
			this.tipoinversionAux=new TipoInversion();
			this.tipoinversionAux.setsType(Constantes2.S_TOTALES);
			this.tipoinversionAux.setIsNew(false);
			this.tipoinversionAux.setIsChanged(false);
			this.tipoinversionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoInversionConstantesFunciones.TotalizarValoresFilaTipoInversion(this.tipoinversionLogic.getTipoInversions(),this.tipoinversionAux);
				
				this.tipoinversionLogic.getTipoInversions().add(this.tipoinversionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoInversionConstantesFunciones.TotalizarValoresFilaTipoInversion(this.tipoinversions,this.tipoinversionAux);
				
				this.tipoinversions.add(this.tipoinversionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoinversionTotales=new TipoInversion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoinversionLogic.getTipoInversions().remove(tipoinversionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoinversions.remove(tipoinversionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoinversionTotales=new TipoInversion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInversion tipoinversion:tipoinversionLogic.getTipoInversions()) {
				if(tipoinversion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinversionTotales=tipoinversion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInversionConstantesFunciones.TotalizarValoresFilaTipoInversion(this.tipoinversionLogic.getTipoInversions(),tipoinversionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInversion tipoinversion:this.tipoinversions) {
				if(tipoinversion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinversionTotales=tipoinversion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInversionConstantesFunciones.TotalizarValoresFilaTipoInversion(this.tipoinversions,tipoinversionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoInversionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoInversionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinversionLogic.getTipoInversionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoInversion() {
		this.isPermisoTodoTipoInversion=false;
		this.isPermisoNuevoTipoInversion=false;
		this.isPermisoActualizarTipoInversion=false;
		this.isPermisoActualizarOriginalTipoInversion=false;
		this.isPermisoEliminarTipoInversion=false;
		this.isPermisoGuardarCambiosTipoInversion=false;
		this.isPermisoConsultaTipoInversion=false;
		this.isPermisoBusquedaTipoInversion=false;
		this.isPermisoReporteTipoInversion=false;		
		this.isPermisoOrdenTipoInversion=false;		
		this.isPermisoPaginacionMedioTipoInversion=false;		
		this.isPermisoPaginacionAltoTipoInversion=false;
		this.isPermisoPaginacionTodoTipoInversion=false;
		this.isPermisoCopiarTipoInversion=false;		
		this.isPermisoVerFormTipoInversion=false;		
		this.isPermisoDuplicarTipoInversion=false;		
		this.isPermisoOrdenTipoInversion=false;		
	}
	
	public void setPermisosUsuarioTipoInversion(Boolean isPermiso) {
		this.isPermisoTodoTipoInversion=isPermiso;
		this.isPermisoNuevoTipoInversion=isPermiso;
		this.isPermisoActualizarTipoInversion=isPermiso;
		this.isPermisoActualizarOriginalTipoInversion=isPermiso;
		this.isPermisoEliminarTipoInversion=isPermiso;
		this.isPermisoGuardarCambiosTipoInversion=isPermiso;
		this.isPermisoConsultaTipoInversion=isPermiso;
		this.isPermisoBusquedaTipoInversion=isPermiso;
		this.isPermisoReporteTipoInversion=isPermiso;
		this.isPermisoOrdenTipoInversion=isPermiso;		
		this.isPermisoPaginacionMedioTipoInversion=isPermiso;		
		this.isPermisoPaginacionAltoTipoInversion=isPermiso;		
		this.isPermisoPaginacionTodoTipoInversion=isPermiso;		
		this.isPermisoCopiarTipoInversion=isPermiso;		
		this.isPermisoVerFormTipoInversion=isPermiso;		
		this.isPermisoDuplicarTipoInversion=isPermiso;
		this.isPermisoOrdenTipoInversion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoInversion(Boolean isPermiso) {
		//this.isPermisoTodoTipoInversion=isPermiso;
		this.isPermisoNuevoTipoInversion=isPermiso;
		this.isPermisoActualizarTipoInversion=isPermiso;
		this.isPermisoActualizarOriginalTipoInversion=isPermiso;
		this.isPermisoEliminarTipoInversion=isPermiso;
		this.isPermisoGuardarCambiosTipoInversion=isPermiso;
		//this.isPermisoConsultaTipoInversion=isPermiso;
		//this.isPermisoBusquedaTipoInversion=isPermiso;
		//this.isPermisoReporteTipoInversion=isPermiso;
		//this.isPermisoOrdenTipoInversion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoInversion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoInversion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoInversion=isPermiso;		
		//this.isPermisoCopiarTipoInversion=isPermiso;		
		//this.isPermisoDuplicarTipoInversion=isPermiso;
		//this.isPermisoOrdenTipoInversion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoInversionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(AccionistaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoInversionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosAccionista=false;
		this.isTienePermisosAccionista=this.verificarGetPermisosUsuarioOpcionTipoInversionClaseRelacionada(this.opcionsRelacionadas,AccionistaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoInversion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoInversionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosAccionista=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoInversionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoInversionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoInversionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosAccionista && this.jInternalFrameDetalleFormTipoInversion!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.remove(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoInversion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoInversionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoInversionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoInversion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoInversion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoInversion=this.isPermisoActualizarTipoInversion;
			this.isPermisoEliminarTipoInversion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoInversion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoInversion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoInversion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoInversion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoInversion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInversion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoInversion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoInversion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoInversion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoInversion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoInversion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoInversion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInversion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoInversion.setToolTipText(this.jTableDatosTipoInversion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoInversion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoInversion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoInversionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoInversionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoInversion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosAccionista && this.tipoinversionConstantesFunciones.mostrarAccionistaTipoInversion && !TipoInversionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Accionista");
			reporte.setsDescripcion("Accionista");
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
	public void inicializarCombosForeignKeyTipoInversionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoInversionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoInversionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoInversionListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoInversionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoInversionParameterReturnGeneral tipoinversionReturnGeneral=new TipoInversionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoinversionConstantesFunciones.cargarid_empresaTipoInversion)
					 || (this.esRecargarFks && this.tipoinversionConstantesFunciones.cargarid_empresaTipoInversion)) {

					if(!this.tipoinversionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoinversionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoinversionReturnGeneral=tipoinversionLogic.cargarCombosLoteForeignKeyTipoInversion(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoinversionReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoInversion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoinversionSessionBean==null) {
				this.tipoinversionSessionBean=new TipoInversionSessionBean();
			}

			if(!this.tipoinversionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoInversion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoInversion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoInversion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInversion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoInversion(TipoInversion tipoinversion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoInversion(TipoInversion tipoinversion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoInversion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInversion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoInversion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoInversion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoInversion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoInversion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoInversion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoInversion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion!=null && this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoInversionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoInversionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoInversionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoinversionSessionBean=new TipoInversionSessionBean(); 
		this.tipoinversionConstantesFunciones=new TipoInversionConstantesFunciones(); 
		this.tipoinversionBean=new TipoInversion();//(this.tipoinversionConstantesFunciones); 		
		this.tipoinversionReturnGeneral=new TipoInversionParameterReturnGeneral(); 
		
		this.tipoinversionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinversionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoInversionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoInversionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoInversionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoInversion(true);
			
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
			
			this.tipoinversionConstantesFunciones=new TipoInversionConstantesFunciones(); 
			this.tipoinversionBean=new TipoInversion();//this.tipoinversionConstantesFunciones); 			
			this.tipoinversionReturnGeneral=new TipoInversionParameterReturnGeneral(); 
		
			TipoInversionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Inversion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoinversion=new TipoInversion();
			this.tipoinversions = new ArrayList<TipoInversion>();
			this.tipoinversionsAux = new ArrayList<TipoInversion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic=new TipoInversionLogic();
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoinversionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoinversionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoInversion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInversion);	
					}
					
					if(this.jInternalFrameImportacionTipoInversion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInversion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoInversion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoInversion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoInversion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInversion);
				this.jInternalFrameDetalleFormTipoInversion.setVisible(false);
				this.jInternalFrameDetalleFormTipoInversion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInversion);
					this.jInternalFrameReporteDinamicoTipoInversion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoInversion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoInversion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoInversion);
					this.jInternalFrameImportacionTipoInversion.setVisible(false);
					this.jInternalFrameImportacionTipoInversion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoInversion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoInversion);
					this.jInternalFrameOrderByTipoInversion.setVisible(false);
					this.jInternalFrameOrderByTipoInversion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoInversionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoInversionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoinversionReturnGeneral=new TipoInversionParameterReturnGeneral();
			
			this.tipoinversionParameterGeneral=new TipoInversionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoinversionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoInversionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(AccionistaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInversionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoinversionSessionBean.getEsGuardarRelacionado(),this.tipoinversionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInversionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoinversionSessionBean.getEsGuardarRelacionado(),this.tipoinversionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoInversion=false;
			this.isVisibilidadCeldaDuplicarTipoInversion=true;
			this.isVisibilidadCeldaCopiarTipoInversion=true;
			this.isVisibilidadCeldaVerFormTipoInversion=true;
			this.isVisibilidadCeldaOrdenTipoInversion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
			this.isVisibilidadCeldaModificarTipoInversion=false;
			this.isVisibilidadCeldaActualizarTipoInversion=false;
			this.isVisibilidadCeldaEliminarTipoInversion=false;
			this.isVisibilidadCeldaCancelarTipoInversion=false;
			this.isVisibilidadCeldaGuardarTipoInversion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoInversion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoInversion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoInversion(false);
			
			this.setPermisosUsuarioTipoInversion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinversionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoinversionSessionBean.getEsGuardarRelacionado() && this.tipoinversionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoInversionClasesRelacionadas();
			}
			
			if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoInversionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoInversionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoInversion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoInversion();
			}
			
			if(!this.isPermisoBusquedaTipoInversion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoInversion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoInversion,this.isPermisoPaginacionMedioTipoInversion,this.isPermisoPaginacionTodoTipoInversion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoInversionConstantesFunciones.getTiposSeleccionarTipoInversion());
				
				this.tiposColumnasSelect=TipoInversionConstantesFunciones.getTiposSeleccionarTipoInversion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoInversion();				
				//this.tiposRelacionesSelect=TipoInversionConstantesFunciones.getTiposRelacionesTipoInversion(true);
				
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
			//if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoInversion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoInversion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoInversion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInversion() ;
			
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
			
			
			this.accionistaLogic=new AccionistaLogic(); 
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
				tipoinversionImplementable= (TipoInversionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInversionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoinversionImplementableHome= (TipoInversionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInversionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoinversions= new ArrayList<TipoInversion>();
			this.tipoinversionsEliminados= new ArrayList<TipoInversion>();
						
			this.isEsNuevoTipoInversion=false;
			this.esParaAccionDesdeFormularioTipoInversion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoInversion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoInversion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoInversionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoInversionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoInversion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoInversion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoInversion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoInversion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoInversion();
			}
			
			TipoInversionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoInversion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoInversion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoInversion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoInversion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoInversion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoInversion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(AccionistaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AccionistaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoInversion")) {
				iIndex=this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();	
				
				

				if(sTitle.equals("Accionistas")) {
					if(!AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoInversion();

						this.cargarParteTabPanelRelacionadaAccionista(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoInversion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAccionista(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoInversion.cargarSessionConBeanSwingJInternalFrameAccionista(false,true,iIndex);
		this.jButtonAccionistaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAccionista();

		//this.jTabbedPaneRelacionesTipoInversion.updateUI();
		//this.jTabbedPaneRelacionesTipoInversion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoInversion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Accionista")) {
				int row=this.jTableDatosTipoInversion.getSelectedRow();
				jButtonAccionistaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Accionista")) {

					if(this.isTienePermisosAccionista && this.tipoinversionConstantesFunciones.mostrarAccionistaTipoInversion && !TipoInversionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Accionistas"+"("+AccionistaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Accionistas");

						if(tipoinversionConstantesFunciones.resaltarAccionistaTipoInversion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoinversionConstantesFunciones.resaltarAccionistaTipoInversion);
						}

						jmenuItem.setEnabled(this.tipoinversionConstantesFunciones.activarAccionistaTipoInversion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Accionista"));

						

						this.jInternalFrameDetalleFormTipoInversion.jmenuDetalleTipoInversion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoInversion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoInversion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoInversion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoInversionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoInversion();
		
		this.cargarCombosFrameForeignKeyTipoInversion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoInversion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoInversion();
		}
	}
	
	
	
	public void jButtonNuevoTipoInversionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
			
			if(jTableDatosTipoInversion.getRowCount()>=1) {
				jTableDatosTipoInversion.removeRowSelectionInterval(0, jTableDatosTipoInversion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoInversion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoInversion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoInversion(true);			
			//this.tipoinversion=new TipoInversion();
			//this.tipoinversion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInversion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInversion() ;
			
			if(TipoInversionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInversion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoinversion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);				
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
			if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoInversion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoInversionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoInversion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoInversion.getSelectedRows().length;			
			}
			
			tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoInversion--;			
				//TipoInversion tipoinversionAux= new TipoInversion();			
				//tipoinversionAux.setId(this.iIdNuevoTipoInversion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoInversion tipoinversionOrigen=new TipoInversion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoInversion tipoinversionOrigen : tipoinversionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoinversionOrigen =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinversionOrigen =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoInversion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoinversion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoInversion(tipoinversionOrigen,this.tipoinversion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoinversionLogic.getTipoInversions().add(this.tipoinversionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoinversions.add(this.tipoinversionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoInversion(false);
				
				this.jTableDatosTipoInversion.setRowSelectionInterval(this.getIndiceNuevoTipoInversion(), this.getIndiceNuevoTipoInversion());
				
				int iLastRow =  this.jTableDatosTipoInversion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInversion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInversion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInversion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();									
		
			TipoInversion tipoinversionOrigen=new TipoInversion();
			TipoInversion tipoinversionDestino=new TipoInversion();
				
			tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoInversion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoinversionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoInversion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinversionOrigen =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoinversionOrigen =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinversionDestino =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoinversionDestino =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoinversionOrigen =tipoinversionsSeleccionados.get(0);
				tipoinversionDestino =tipoinversionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoInversion(tipoinversionOrigen,tipoinversionDestino,true,false);
				
				tipoinversionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoinversionDestino,tipoinversionLogic.getTipoInversions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinversionDestino,tipoinversions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoInversion(false);
				
				//this.jTableDatosTipoInversion.setRowSelectionInterval(this.getIndiceNuevoTipoInversion(), this.getIndiceNuevoTipoInversion());
				
				int iLastRow =  this.jTableDatosTipoInversion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInversion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInversion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInversion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoInversion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoInversion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoInversion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoInversion.setVisible(!isVisible);
			this.jPanelPaginacionTipoInversion.setVisible(!isVisible);
			this.jPanelAccionesTipoInversion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoInversion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoInversion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoInversion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoInversion();
			
			this.abrirFrameOrderByTipoInversion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoInversion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoInversion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInversion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoInversion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoInversion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoInversion.setSize(this.jInternalFrameDetalleFormTipoInversion.iWidthFormulario,this.jInternalFrameDetalleFormTipoInversion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoInversion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoInversion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoInversion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoInversion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoInversion.jContentPaneDetalleTipoInversion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoInversion.jContentPaneDetalleTipoInversion.getWidth(),TipoInversionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoInversion.jContentPaneDetalleTipoInversion.getWidth(),TipoInversionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoInversion.jContentPaneDetalleTipoInversion.getWidth(),TipoInversionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAccionista();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoInversion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoInversion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoInversion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoInversion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoInversion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInversion,false,this);
				} else {
					this.jInternalFrameOrderByTipoInversion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInversion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoInversion);
				this.jInternalFrameOrderByTipoInversion.setVisible(false);
				this.jInternalFrameOrderByTipoInversion.setSelected(false);
				
				this.jInternalFrameOrderByTipoInversion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInversion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoInversion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoInversion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoInversion==null) {
				
				this.jInternalFrameImportacionTipoInversion=new ImportacionJInternalFrame(TipoInversionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInversion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoInversion);
				this.jInternalFrameImportacionTipoInversion.setVisible(false);
				this.jInternalFrameImportacionTipoInversion.setSelected(false);


				this.jInternalFrameImportacionTipoInversion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInversion"));
				this.jInternalFrameImportacionTipoInversion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInversion"));
				this.jInternalFrameImportacionTipoInversion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInversion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoInversion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoInversion==null) {
				this.jInternalFrameReporteDinamicoTipoInversion=new ReporteDinamicoJInternalFrame(TipoInversionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInversion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInversion);
				this.jInternalFrameReporteDinamicoTipoInversion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoInversion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoInversion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInversion"));
				this.jInternalFrameReporteDinamicoTipoInversion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInversion"));
				this.jInternalFrameReporteDinamicoTipoInversion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInversion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInversion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAccionista() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoInversion.jContentPaneDetalleTipoInversion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoInversion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInversion);
			
	       	this.jInternalFrameDetalleFormTipoInversion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoInversion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoInversion.dispose();
			//this.jInternalFrameDetalleFormTipoInversion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoInversion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoInversion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoInversion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoInversion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoInversion.setVisible(true);
	        this.jInternalFrameImportacionTipoInversion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoInversion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoInversion.setVisible(true);
	        this.jInternalFrameOrderByTipoInversion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoInversion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoInversion.setVisible(false);
	        this.jInternalFrameOrderByTipoInversion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoInversion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoInversion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoInversion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoInversion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoInversion.setVisible(false);
	        this.jInternalFrameImportacionTipoInversion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoInversion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoInversion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoInversion(true);
			//this.isEsNuevoTipoInversion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoInversion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInversion(false) ;
			
			if(tipoinversionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaSessionBean.getEsGuardarRelacionado() && AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAccionistaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoInversionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInversion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInversion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoInversionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoInversion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoInversion(true);
			//this.isEsNuevoTipoInversion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoinversion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoInversion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoInversion(false) ;
			
			if(TipoInversionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInversion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInversion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoInversion(false);
			
			//if(!this.isEsNuevoTipoInversion) {								
				int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
				
			}
			
			if(this.permiteMantenimiento(this.tipoinversion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoInversion=true;
					this.inicializarActualizarBindingTablaTipoInversion(false);
					this.isEsNuevoTipoInversion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoInversion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoInversion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInversion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInversion(false);
				
				this.habilitarDeshabilitarControlesTipoInversion(false);
			
												
				
				if(TipoInversionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoInversion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoInversionActionPerformed(evt,tipoinversionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoInversion(this.tipoinversion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoInversion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoinversionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoinversion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoInversionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				this.tipoinversion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				this.tipoinversion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoinversion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoInversionModel) this.jTableDatosTipoInversion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoInversion=true;
				this.inicializarActualizarBindingTablaTipoInversion(false);
				this.isEsNuevoTipoInversion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInversion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInversion(false);
				
				this.habilitarDeshabilitarControlesTipoInversion(false);
				
				
				
				if(TipoInversionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoInversion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoInversionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoInversion.getRowCount()>=1) {
				jTableDatosTipoInversion.removeRowSelectionInterval(0, jTableDatosTipoInversion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoInversion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoInversion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInversion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInversion(false) ;
			
			this.isEsNuevoTipoInversion=false;
			
			if(TipoInversionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoInversion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoInversionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoInversion(false);
				
				//SI ES MANUAL
				if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoInversion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoInversionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoInversion--;			
			//TipoInversion tipoinversionAux= new TipoInversion();			
			//tipoinversionAux.setId(this.iIdNuevoTipoInversion);
			
			if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoInversion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
			
			this.tipoinversion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoinversionLogic.getTipoInversions().add(this.tipoinversionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoinversions.add(this.tipoinversionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoInversion(false);
			
			this.jTableDatosTipoInversion.setRowSelectionInterval(this.getIndiceNuevoTipoInversion(), this.getIndiceNuevoTipoInversion());
			
			int iLastRow =  this.jTableDatosTipoInversion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoInversion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoInversion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoInversion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoInversionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoInversion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInversion(false);
			
			//SI ES MANUAL
			if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInversion();
			}
			
			//this.abrirFrameTreeTipoInversion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoInversionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo InversionES ?", "MANTENIMIENTO DE Tipo Inversion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoInversion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoInversion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoinversionReturnGeneral=tipoinversionLogic.procesarImportacionTipoInversionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoinversionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoInversionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoInversionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoInversion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoInversion.setFileImportacion(this.jInternalFrameImportacionTipoInversion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoInversion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoInversion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoInversion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoInversion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoInversionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		

		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoInversionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoInversionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoInversions("Todos",tipoinversionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInversionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoInversionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoInversionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoInversion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoInversionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoInversionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoInversionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoInversionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoInversionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoInversionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInversionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoInversionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoInversionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoInversionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinversion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoInversions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoInversionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInversionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoInversion tipoinversion:tipoinversionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinversion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoInversionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInversionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoInversion tipoinversion:tipoinversionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinversion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoInversionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInversionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoInversion tipoinversion:tipoinversionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinversion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoInversion(row);				
			//	iRow++;
			//}				
			
			//for(TipoInversion tipoinversionAux:tipoinversionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoInversion(tipoinversionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInversion(false);
			
			//SI ES MANUAL
			if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInversion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoInversionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInversion(false);
			
			//SI ES MANUAL
			if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInversion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoInversionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInversion(false);
			
			//SI ES MANUAL
			if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInversion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoInversion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoInversion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoInversion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoInversion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoInversion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoInversion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoInversion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoInversion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoInversion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoInversion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoInversion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoInversion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoInversion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoInversion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInversion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoInversion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoInversionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoInversion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoInversion();
		
		this.inicializarActualizarBindingBotonesManualTipoInversion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInversion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInversion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInversion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInversion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoInversion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoInversion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoInversion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoInversion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoInversion.jCheckBoxPostAccionNuevoTipoInversion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoInversion.jCheckBoxPostAccionSinCerrarTipoInversion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoInversion.jCheckBoxPostAccionSinMensajeTipoInversion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoInversion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoInversion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoInversion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoInversion!=null) {
				this.jInternalFrameDetalleFormTipoInversion.jCheckBoxPostAccionNuevoTipoInversion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoInversion.jCheckBoxPostAccionSinCerrarTipoInversion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoInversion.jCheckBoxPostAccionSinMensajeTipoInversion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoInversion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoInversion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoInversion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoInversion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoInversion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoInversion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoInversion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoInversion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoInversion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoInversion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInversion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoInversion() throws Exception {
		try	{
			if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInversion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInversion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInversion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoInversion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoInversion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoInversion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoInversion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoInversion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoInversion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoInversion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoInversion.addItem(reporte);
			}
			
			
			if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoInversion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoInversion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoInversion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoInversion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoInversion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoInversion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoInversion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoInversion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoInversion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInversion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInversion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
				this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
				this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInversion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInversion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoInversion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInversion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInversion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoInversion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoInversion(Boolean esInicializar) throws Exception {				
		if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInversion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoInversion() throws Exception {
		this.inicializarActualizarBindingTablaTipoInversion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoInversion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoInversionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoInversionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoInversionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInversionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoInversionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoInversionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoInversion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoinversionLogic.getTipoInversions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoinversions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoInversion.setModel(new TipoInversionModel(this.tipoinversionLogic.getTipoInversions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoInversion.setModel(new TipoInversionModel(this.tipoinversions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoInversion!=null && this.jInternalFrameOrderByTipoInversion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoInversion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoInversion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInversion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoInversionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoInversionConstantesFunciones.SCLASSWEBTITULO,tipoinversionConstantesFunciones.resaltarSeleccionarTipoInversion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoInversionConstantesFunciones.SCLASSWEBTITULO,tipoinversionConstantesFunciones.resaltarSeleccionarTipoInversion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoInversion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInversion,TipoInversionConstantesFunciones.LABEL_ID));

		if(this.tipoinversionConstantesFunciones.mostraridTipoInversion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInversionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoinversionConstantesFunciones.resaltaridTipoInversion,this.tipoinversionConstantesFunciones.activaridTipoInversion,this,true,"idTipoInversion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinversionConstantesFunciones.resaltaridTipoInversion,this.tipoinversionConstantesFunciones.activaridTipoInversion,this,true,"idTipoInversion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInversion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInversion,TipoInversionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoinversionConstantesFunciones.mostrarid_empresaTipoInversion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInversionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoinversionConstantesFunciones.resaltarid_empresaTipoInversion,this,this.tipoinversionConstantesFunciones.activarid_empresaTipoInversion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoinversionConstantesFunciones.resaltarid_empresaTipoInversion,this,this.tipoinversionConstantesFunciones.activarid_empresaTipoInversion,false,"id_empresaTipoInversion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInversionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInversion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInversion,TipoInversionConstantesFunciones.LABEL_CODIGO));

		if(this.tipoinversionConstantesFunciones.mostrarcodigoTipoInversion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInversionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoinversionConstantesFunciones.resaltarcodigoTipoInversion,this.tipoinversionConstantesFunciones.activarcodigoTipoInversion,this,true,"codigoTipoInversion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinversionConstantesFunciones.resaltarcodigoTipoInversion,this.tipoinversionConstantesFunciones.activarcodigoTipoInversion,this,true,"codigoTipoInversion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInversionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInversion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInversion,TipoInversionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoinversionConstantesFunciones.mostrarnombreTipoInversion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInversionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoinversionConstantesFunciones.resaltarnombreTipoInversion,this.tipoinversionConstantesFunciones.activarnombreTipoInversion,this,true,"nombreTipoInversion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinversionConstantesFunciones.resaltarnombreTipoInversion,this.tipoinversionConstantesFunciones.activarnombreTipoInversion,this,true,"nombreTipoInversion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInversionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosAccionista && this.tipoinversionConstantesFunciones.mostrarAccionistaTipoInversion && !TipoInversionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Accionistas");
				tableColumn.setHeaderValue("Accionistas");
				tableColumn.setCellRenderer(new AccionistaTableCell(tipoinversionConstantesFunciones.resaltarAccionistaTipoInversion,this,this.tipoinversionConstantesFunciones.activarAccionistaTipoInversion));
				tableColumn.setCellEditor(new AccionistaTableCell(tipoinversionConstantesFunciones.resaltarAccionistaTipoInversion,this,this.tipoinversionConstantesFunciones.activarAccionistaTipoInversion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoInversion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoinversionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoinversionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInversion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoinversionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoinversionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInversion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoInversion && this.isPermisoGuardarCambiosTipoInversion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoinversionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoinversionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoInversion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoinversionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoInversion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoInversion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInversion && this.isPermisoGuardarCambiosTipoInversion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoinversionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInversion && this.isPermisoGuardarCambiosTipoInversion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoInversion.moveColumn(this.jTableDatosTipoInversion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoInversion.moveColumn(this.jTableDatosTipoInversion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoinversionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoInversion.moveColumn(this.jTableDatosTipoInversion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoInversion.moveColumn(this.jTableDatosTipoInversion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoInversion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoInversion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoInversion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoInversion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoInversion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoInversion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoInversion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoInversion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoinversionLogic.getTipoInversions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoinversions.size()-1;
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
		//this.jTableDatosTipoInversion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoInversion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoInversion();
			
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
				
				//this.isEsNuevoTipoInversion=false;
					
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
				if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoInversion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInversion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInversion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoinversion.getsType().equals("DUPLICADO")
				   || this.tipoinversion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoInversion=true;
				
				} else {
					this.isEsNuevoTipoInversion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoinversion.getId()>=0 && !this.tipoinversion.getIsNew()) {						
						this.isEsNuevoTipoInversion=false;
						
					} else {
						this.isEsNuevoTipoInversion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoInversion(esRelaciones);						
				
				this.seleccionarTipoInversion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoinversion.getId()<0) {
					this.isEsNuevoTipoInversion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoInversion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoInversion(evt,rowIndex);
				}	
				
				if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoInversion: " + this.dDif); 
					}
				}								
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoInversion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoinversion)) {
					if(this.tipoinversion.getId()>0) {
						this.tipoinversion.setIsDeleted(true);
						
						this.tipoinversionsEliminados.add(this.tipoinversion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoinversionLogic.getTipoInversions().remove(this.tipoinversion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoinversions.remove(this.tipoinversion);				
					}
					
					
					((TipoInversionModel) this.jTableDatosTipoInversion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInversion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoInversion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoInversion) {
			
			if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInversion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInversion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoInversion(this.tipoinversion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoinversionConstantesFunciones.cargarid_empresaTipoInversion || this.tipoinversionConstantesFunciones.event_dependid_empresaTipoInversion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoinversion.getid_empresa());
									//this.inicializarActualizarBindingTipoInversion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoinversion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoinversion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoinversion.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoInversion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoInversion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInversion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInversion(TipoInversion tipoinversion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoInversion(tipoinversion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInversion(TipoInversion tipoinversion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoInversion(tipoinversion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoInversion(tipoinversion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoInversion(tipoinversion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoInversion(TipoInversion tipoinversion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.setText(tipoinversion.getId().toString());
			this.jInternalFrameDetalleFormTipoInversion.jTextFieldcodigoTipoInversion.setText(tipoinversion.getcodigo());
			this.jInternalFrameDetalleFormTipoInversion.jTextAreanombreTipoInversion.setText(tipoinversion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoInversion tipoinversionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoinversionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoInversion tipoinversionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoinversionLocal=this.tipoinversion;
			} else {
				tipoinversionLocal=this.tipoinversionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoinversionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoInversion(tipoinversionLocal,true);
					
					if(tipoinversionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoinversionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoinversionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoInversion(TipoInversion tipoinversion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInversion(tipoinversion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(tipoinversion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInversion(TipoInversion tipoinversion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInversion(tipoinversion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInversion(TipoInversion tipoinversion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.getText()==null || this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.getText()=="" || this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.setText("0");
			}

			if(conColumnasBase) {tipoinversion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInversionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInversion.jLabelIdTipoInversion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoinversion.setcodigo(this.jInternalFrameDetalleFormTipoInversion.jTextFieldcodigoTipoInversion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInversionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInversion.jLabelcodigoTipoInversion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoinversion.setnombre(this.jInternalFrameDetalleFormTipoInversion.jTextAreanombreTipoInversion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInversionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInversion.jLabelnombreTipoInversion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInversion(TipoInversion tipoinversionBean,TipoInversion tipoinversion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoInversion(TipoInversion tipoinversionOrigen,TipoInversion tipoinversion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoinversionOrigen.getId()!=null && !tipoinversionOrigen.getId().equals(0L))) {tipoinversion.setId(tipoinversionOrigen.getId());}}
			if(conDefault || (!conDefault && tipoinversionOrigen.getcodigo()!=null && !tipoinversionOrigen.getcodigo().equals(""))) {tipoinversion.setcodigo(tipoinversionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoinversionOrigen.getnombre()!=null && !tipoinversionOrigen.getnombre().equals(""))) {tipoinversion.setnombre(tipoinversionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInversion(TipoInversion tipoinversion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.setText(tipoinversion.getId().toString());
			this.jInternalFrameDetalleFormTipoInversion.jTextFieldcodigoTipoInversion.setText(tipoinversion.getcodigo());
			this.jInternalFrameDetalleFormTipoInversion.jTextAreanombreTipoInversion.setText(tipoinversion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInversion(TipoInversionBean tipoinversionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.setText(tipoinversionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoInversion.jTextFieldcodigoTipoInversion.setText(tipoinversionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoInversion.jTextAreanombreTipoInversion.setText(tipoinversionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoInversion(TipoInversionParameterReturnGeneral tipoinversionReturnGeneral,TipoInversionBean tipoinversionBean,Boolean conDefault) throws Exception { 
		try {
			TipoInversion tipoinversionLocal=new TipoInversion();
			
			tipoinversionLocal=tipoinversionReturnGeneral.getTipoInversion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoinversionLocal.getId()!=null && !tipoinversionLocal.getId().equals(0L))) {tipoinversionBean.setId(tipoinversionLocal.getId());}}
			if(conDefault || (!conDefault && tipoinversionLocal.getcodigo()!=null && !tipoinversionLocal.getcodigo().equals(""))) {tipoinversionBean.setcodigo(tipoinversionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoinversionLocal.getnombre()!=null && !tipoinversionLocal.getnombre().equals(""))) {tipoinversionBean.setnombre(tipoinversionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoInversionGenerico(Long idTipoInversionSeleccionado,JComboBox jComboBoxTipoInversion,List<TipoInversion> tipoinversionsLocal)throws Exception {
		try {
			TipoInversion  tipoinversionTemp=null;

			for(TipoInversion tipoinversionAux:tipoinversionsLocal) {
				if(tipoinversionAux.getId()!=null && tipoinversionAux.getId().equals(idTipoInversionSeleccionado)) {
					tipoinversionTemp=tipoinversionAux;
					break;
				}
			}

			jComboBoxTipoInversion.setSelectedItem(tipoinversionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoInversionGenerico(JComboBox jComboBoxTipoInversion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoInversion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInversion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoInversion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInversion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInversion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoInversion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInversion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoInversion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoInversion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoInversion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Accionista")) {
			jButtonAccionistaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinversion=(TipoInversion) tipoinversionLogic.getTipoInversions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoinversion =(TipoInversion) tipoinversions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoinversion.getIsNew() && !tipoinversion.getIsChanged() && !tipoinversion.getIsDeleted()) {
				sDescripcion=tipoinversion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoinversion.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoInversion tipoinversionRow=new TipoInversion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinversionRow=(TipoInversion) tipoinversionLogic.getTipoInversions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoinversionRow=(TipoInversion) tipoinversions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonAccionistaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoInversion tipoinversion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoInversion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinversion = (TipoInversion)this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoinversion = (TipoInversion)this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoinversion!=null) {
						this.tipoinversion = tipoinversion;
					} else {
						this.tipoinversion = new TipoInversion();
					}
				}

				if(this.isTienePermisosAccionista && this.permiteMantenimiento(this.tipoinversion)) {
					AccionistaBeanSwingJInternalFrame accionistaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFramePopup=new AccionistaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						accionistaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFramePopup;
					} else {
						accionistaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame;
					}

					List<TipoInversion> tipoinversions=new ArrayList<TipoInversion>();
					tipoinversions.add(this.tipoinversion);
					if(!esRelacionado) {
						//accionistaBeanSwingJInternalFrame.accionistaSessionBean.setConGuardarRelaciones(false);
						//accionistaBeanSwingJInternalFrame.accionistaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					accionistaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoInversion.cargarAccionistaBeanSwingJInternalFrame(tipoinversions,this.tipoinversion,accionistaBeanSwingJInternalFrame,/*conInicializar,*/accionistaBeanSwingJInternalFrame.accionistaSessionBean.getConGuardarRelaciones(),accionistaBeanSwingJInternalFrame.accionistaSessionBean.getEsGuardarRelacionado());
					accionistaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						accionistaBeanSwingJInternalFrame.actualizarEstadoPanelsAccionista("no_relacionado");

						accionistaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AccionistaConstantesFunciones.ITAMANIOFILATABLA + (AccionistaConstantesFunciones.ITAMANIOFILATABLA/2));

						accionistaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoInversion=(TitledBorder)this.jScrollPanelDatosTipoInversion.getBorder();
						TitledBorder titledBorderAccionista=(TitledBorder)accionistaBeanSwingJInternalFrame.jScrollPanelDatosAccionista.getBorder();

						titledBorderAccionista.setTitle(titledBorderTipoInversion.getTitle() + " -> Accionista");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,accionistaBeanSwingJInternalFrame);
						}

						accionistaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(accionistaBeanSwingJInternalFrame);

						accionistaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoinversionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Accionista",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoInversion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoInversion.setVisible((this.isVisibilidadCeldaNuevoTipoInversion && this.isPermisoNuevoTipoInversion));			
			this.jButtonDuplicarTipoInversion.setVisible((this.isVisibilidadCeldaDuplicarTipoInversion && this.isPermisoDuplicarTipoInversion));			
			this.jButtonCopiarTipoInversion.setVisible((this.isVisibilidadCeldaCopiarTipoInversion && this.isPermisoCopiarTipoInversion));
			this.jButtonVerFormTipoInversion.setVisible((this.isVisibilidadCeldaVerFormTipoInversion && this.isPermisoVerFormTipoInversion));
			
			this.jButtonAbrirOrderByTipoInversion.setVisible((this.isVisibilidadCeldaOrdenTipoInversion && this.isPermisoOrdenTipoInversion));			
			
			this.jButtonNuevoRelacionesTipoInversion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInversion && this.isPermisoNuevoTipoInversion));			
			this.jButtonNuevoGuardarCambiosTipoInversion.setVisible((this.isVisibilidadCeldaNuevoTipoInversion && this.isPermisoNuevoTipoInversion && this.isPermisoGuardarCambiosTipoInversion));
			
			if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonModificarTipoInversion.setVisible((this.isVisibilidadCeldaModificarTipoInversion && this.isPermisoActualizarTipoInversion));	
			this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarTipoInversion.setVisible((this.isVisibilidadCeldaActualizarTipoInversion && this.isPermisoActualizarTipoInversion));	
			this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarTipoInversion.setVisible((this.isVisibilidadCeldaEliminarTipoInversion && this.isPermisoEliminarTipoInversion));
			this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarTipoInversion.setVisible(this.isVisibilidadCeldaCancelarTipoInversion);							
			this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosTipoInversion.setVisible((this.isVisibilidadCeldaGuardarTipoInversion && this.isPermisoGuardarCambiosTipoInversion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoInversion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInversion && this.isPermisoGuardarCambiosTipoInversion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoInversion.setVisible((this.isVisibilidadCeldaNuevoTipoInversion && this.isPermisoNuevoTipoInversion));						
			this.jButtonDuplicarToolBarTipoInversion.setVisible((this.isVisibilidadCeldaDuplicarTipoInversion && this.isPermisoDuplicarTipoInversion));						
			this.jButtonCopiarToolBarTipoInversion.setVisible((this.isVisibilidadCeldaCopiarTipoInversion && this.isPermisoCopiarTipoInversion));			
			this.jButtonVerFormToolBarTipoInversion.setVisible((this.isVisibilidadCeldaVerFormTipoInversion && this.isPermisoVerFormTipoInversion));			
			this.jButtonAbrirOrderByToolBarTipoInversion.setVisible((this.isVisibilidadCeldaOrdenTipoInversion && this.isPermisoOrdenTipoInversion));
			this.jButtonNuevoRelacionesToolBarTipoInversion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInversion && this.isPermisoNuevoTipoInversion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoInversion.setVisible((this.isVisibilidadCeldaNuevoTipoInversion && this.isPermisoNuevoTipoInversion && this.isPermisoGuardarCambiosTipoInversion));			
			
			if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonModificarToolBarTipoInversion.setVisible((this.isVisibilidadCeldaModificarTipoInversion && this.isPermisoActualizarTipoInversion));	
			this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarToolBarTipoInversion.setVisible((this.isVisibilidadCeldaActualizarTipoInversion  && this.isPermisoActualizarTipoInversion));	
			this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarToolBarTipoInversion.setVisible((this.isVisibilidadCeldaEliminarTipoInversion && this.isPermisoEliminarTipoInversion));
			this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarToolBarTipoInversion.setVisible(this.isVisibilidadCeldaCancelarTipoInversion);				
			this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosToolBarTipoInversion.setVisible((this.isVisibilidadCeldaGuardarTipoInversion && this.isPermisoGuardarCambiosTipoInversion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoInversion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInversion && this.isPermisoGuardarCambiosTipoInversion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoInversion.setVisible((this.isVisibilidadCeldaNuevoTipoInversion && this.isPermisoNuevoTipoInversion));			
			this.jMenuItemDuplicarTipoInversion.setVisible((this.isVisibilidadCeldaDuplicarTipoInversion && this.isPermisoDuplicarTipoInversion));			
			this.jMenuItemCopiarTipoInversion.setVisible((this.isVisibilidadCeldaCopiarTipoInversion && this.isPermisoCopiarTipoInversion));			
			this.jMenuItemVerFormTipoInversion.setVisible((this.isVisibilidadCeldaVerFormTipoInversion && this.isPermisoVerFormTipoInversion));			
			this.jMenuItemAbrirOrderByTipoInversion.setVisible((this.isVisibilidadCeldaOrdenTipoInversion && this.isPermisoOrdenTipoInversion));			
			//this.jMenuItemMostrarOcultarTipoInversion.setVisible((this.isVisibilidadCeldaOrdenTipoInversion && this.isPermisoOrdenTipoInversion));
			this.jMenuItemDetalleAbrirOrderByTipoInversion.setVisible((this.isVisibilidadCeldaOrdenTipoInversion && this.isPermisoOrdenTipoInversion));			
			//this.jMenuItemDetalleMostrarOcultarTipoInversion.setVisible((this.isVisibilidadCeldaOrdenTipoInversion && this.isPermisoOrdenTipoInversion));			
			this.jMenuItemNuevoRelacionesTipoInversion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInversion && this.isPermisoNuevoTipoInversion));			
			this.jMenuItemNuevoGuardarCambiosTipoInversion.setVisible((this.isVisibilidadCeldaNuevoTipoInversion && this.isPermisoNuevoTipoInversion && this.isPermisoGuardarCambiosTipoInversion));									
			
			if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemModificarTipoInversion.setVisible((this.isVisibilidadCeldaModificarTipoInversion && this.isPermisoActualizarTipoInversion));	
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemActualizarTipoInversion.setVisible((this.isVisibilidadCeldaActualizarTipoInversion && this.isPermisoActualizarTipoInversion));	
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemEliminarTipoInversion.setVisible((this.isVisibilidadCeldaEliminarTipoInversion && this.isPermisoEliminarTipoInversion));
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemCancelarTipoInversion.setVisible(this.isVisibilidadCeldaCancelarTipoInversion);				
			}
			
			this.jMenuItemGuardarCambiosTipoInversion.setVisible((this.isVisibilidadCeldaGuardarTipoInversion && this.isPermisoGuardarCambiosTipoInversion));						
			this.jMenuItemGuardarCambiosTablaTipoInversion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInversion && this.isPermisoGuardarCambiosTipoInversion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoInversion=this.jButtonNuevoTipoInversion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoInversion=this.jButtonDuplicarTipoInversion.isVisible();
			this.isVisibilidadCeldaCopiarTipoInversion=this.jButtonCopiarTipoInversion.isVisible();
			this.isVisibilidadCeldaVerFormTipoInversion=this.jButtonVerFormTipoInversion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoInversion=this.jButtonAbrirOrderByTipoInversion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=this.jButtonNuevoRelacionesTipoInversion.isVisible();
			this.isVisibilidadCeldaModificarTipoInversion=this.jButtonModificarTipoInversion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			this.isVisibilidadCeldaActualizarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarTipoInversion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarTipoInversion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarTipoInversion.isVisible();
			this.isVisibilidadCeldaGuardarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosTipoInversion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=this.jButtonGuardarCambiosTablaTipoInversion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoInversion=this.jButtonNuevoToolBarTipoInversion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=this.jButtonNuevoRelacionesToolBarTipoInversion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			this.isVisibilidadCeldaModificarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jButtonModificarToolBarTipoInversion.isVisible();
			this.isVisibilidadCeldaActualizarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarToolBarTipoInversion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarToolBarTipoInversion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarToolBarTipoInversion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInversion=this.jButtonGuardarCambiosToolBarTipoInversion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=this.jButtonGuardarCambiosTablaToolBarTipoInversion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoInversion=this.jMenuItemNuevoTipoInversion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=this.jMenuItemNuevoRelacionesTipoInversion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			this.isVisibilidadCeldaModificarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jMenuItemModificarTipoInversion.isVisible();
			this.isVisibilidadCeldaActualizarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jMenuItemActualizarTipoInversion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jMenuItemEliminarTipoInversion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInversion=this.jInternalFrameDetalleFormTipoInversion.jMenuItemCancelarTipoInversion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInversion=this.jMenuItemGuardarCambiosTipoInversion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=this.jMenuItemGuardarCambiosTablaTipoInversion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoInversion(Boolean esInicializar) {
		if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInversion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoInversion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoInversion() {
		this.jButtonNuevoTipoInversion.setVisible(this.isPermisoNuevoTipoInversion);			
		this.jButtonDuplicarTipoInversion.setVisible(this.isPermisoDuplicarTipoInversion);			
		this.jButtonCopiarTipoInversion.setVisible(this.isPermisoCopiarTipoInversion);			
		this.jButtonVerFormTipoInversion.setVisible(this.isPermisoVerFormTipoInversion);			
		
		this.jButtonAbrirOrderByTipoInversion.setVisible(this.isPermisoOrdenTipoInversion);					
		
		this.jButtonNuevoRelacionesTipoInversion.setVisible(this.isPermisoNuevoTipoInversion);			
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonModificarTipoInversion.setVisible(this.isPermisoActualizarTipoInversion);	
			this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarTipoInversion.setVisible(this.isPermisoActualizarTipoInversion);	
			this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarTipoInversion.setVisible(this.isPermisoEliminarTipoInversion);
			this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarTipoInversion.setVisible(this.isVisibilidadCeldaCancelarTipoInversion);						
			this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosTipoInversion.setVisible(this.isPermisoGuardarCambiosTipoInversion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoInversion.setVisible(this.isPermisoActualizarTipoInversion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInversion() {
		this.jInternalFrameDetalleFormTipoInversion.jButtonModificarTipoInversion.setVisible(this.isPermisoActualizarTipoInversion);	
		this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarTipoInversion.setVisible(this.isPermisoActualizarTipoInversion);	
		this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarTipoInversion.setVisible(this.isPermisoEliminarTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarTipoInversion.setVisible(this.isVisibilidadCeldaCancelarTipoInversion);							
		this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosTipoInversion.setVisible((this.isVisibilidadCeldaGuardarTipoInversion && this.isPermisoGuardarCambiosTipoInversion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoInversion() {
		if(TipoInversionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoInversion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoInversion() {
	}
	
	public void jTableDatosTipoInversionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoInversion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoInversionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInversion(this.gettipoinversion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinversion==null) {
						this.tipoinversion = new TipoInversion();
					}

					this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
				}

				if(this.tipoinversion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoinversion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInversion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoInversionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoInversion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoInversion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoInversion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoInversion(this.gettipoinversion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoinversionLogic.getConnexion());

				if(this.tipoinversion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoinversion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoInversion=(TitledBorder)this.jScrollPanelDatosTipoInversion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoInversion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoInversionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInversion(this.gettipoinversion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinversion==null) {
						this.tipoinversion = new TipoInversion();
					}

					this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
				}

				if(this.tipoinversion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoinversion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInversion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoInversionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInversion(this.gettipoinversion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinversion==null) {
						this.tipoinversion = new TipoInversion();
					}

					this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
				}

				if(this.tipoinversion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoinversion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInversion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoInversionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInversion(this.gettipoinversion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinversion==null) {
						this.tipoinversion = new TipoInversion();
					}

					this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);
				}

				if(this.tipoinversion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoinversion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInversion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoInversionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoInversion(false,false);

			this.getTipoInversionsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoInversion(false);

			//if(TipoInversionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoInversion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinversionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoInversion() {
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
			this.jInternalFrameDetalleFormTipoInversion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoInversion.dispose();
			this.jInternalFrameDetalleFormTipoInversion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
			this.jInternalFrameReporteDinamicoTipoInversion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoInversion.dispose();
			this.jInternalFrameReporteDinamicoTipoInversion=null;
		}
		
		if(this.jInternalFrameImportacionTipoInversion!=null) {
			this.jInternalFrameImportacionTipoInversion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoInversion.dispose();
			this.jInternalFrameImportacionTipoInversion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoInversion();
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoInversion")) {
				jButtonNuevoTipoInversionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoInversion")) {
				jButtonDuplicarTipoInversionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoInversion")) {
				jButtonCopiarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoInversion")) {
				jButtonVerFormTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoInversion")) {
				jButtonNuevoTipoInversionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoInversion")) {
				jButtonDuplicarTipoInversionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoInversion")) {
				jButtonNuevoTipoInversionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoInversion")) {
				jButtonDuplicarTipoInversionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoInversion")) {
				jButtonNuevoTipoInversionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoInversion")) {
				jButtonNuevoTipoInversionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoInversion")) {
				jButtonNuevoTipoInversionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoInversion")) {
				jButtonModificarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoInversion")) {
				jButtonModificarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoInversion")) {
				jButtonModificarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoInversion")) {
				jButtonActualizarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoInversion")) {
				jButtonActualizarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoInversion")) {
				jButtonActualizarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoInversion")) {
				jButtonEliminarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoInversion")) {
				jButtonEliminarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoInversion")) {
				jButtonEliminarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoInversion")) {
				jButtonCancelarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoInversion")) {
				jButtonCancelarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoInversion")) {
				jButtonCancelarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoInversion")) {
				jButtonCerrarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoInversion")) {
				jButtonCerrarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoInversion")) {
				jButtonCerrarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoInversion")) {
				jButtonMostrarOcultarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoInversion")) {
				jButtonCancelarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoInversion")) {
				jButtonGuardarCambiosTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoInversion")) {
				jButtonGuardarCambiosTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoInversion")) {
				jButtonCopiarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoInversion")) {
				jButtonVerFormTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoInversion")) {
				jButtonGuardarCambiosTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoInversion")) {
				jButtonCopiarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoInversion")) {
				jButtonVerFormTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoInversion")) {
				jButtonGuardarCambiosTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoInversion")) {
				jButtonGuardarCambiosTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoInversion")) {
				jButtonGuardarCambiosTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoInversion")) {
				jButtonRecargarInformacionTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoInversion")) {
				jButtonRecargarInformacionTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoInversion")) {
				jButtonRecargarInformacionTipoInversionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoInversion")) {
				jButtonAnterioresTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoInversion")) {
				jButtonAnterioresTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoInversion")) {
				jButtonAnterioresTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoInversion")) {
				jButtonSiguientesTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoInversion")) {
				jButtonSiguientesTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoInversion")) {
				jButtonSiguientesTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoInversion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoInversion")) {
				jButtonAbrirOrderByTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoInversion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoInversion")) {
				jButtonMostrarOcultarTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInversion")) {
				jButtonNuevoGuardarCambiosTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoInversion")) {
				jButtonNuevoGuardarCambiosTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoInversion")) {
				jButtonNuevoGuardarCambiosTipoInversionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoInversion")) {
				jButtonCerrarReporteDinamicoTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoInversion")) {
				jButtonGenerarReporteDinamicoTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoInversion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoInversion")) {
				jButtonCerrarImportacionTipoInversionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoInversion")) {
				
				jButtonGenerarImportacionTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoInversion")) {
				
				jButtonAbrirImportacionTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoInversion")) {
				jComboBoxTiposAccionesTipoInversionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoInversion")) {
				jComboBoxTiposRelacionesTipoInversionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoInversion")) {
				jComboBoxTiposAccionesTipoInversionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoInversion")) {
				
				jComboBoxTiposSeleccionarTipoInversionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoInversion")) {
				jTextFieldValorCampoGeneralTipoInversionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoInversion")) {
				jButtonAbrirOrderByTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoInversion")) {
				jButtonAbrirOrderByTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoInversion")) {
				jButtonCerrarOrderByTipoInversionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInversionBusqueda")) {
				this.jButtonidTipoInversionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoInversionUpdate")) {
				this.jButtonid_empresaTipoInversionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoInversionBusqueda")) {
				this.jButtonid_empresaTipoInversionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoInversionBusqueda")) {
				this.jButtoncodigoTipoInversionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInversionBusqueda")) {
				this.jButtonnombreTipoInversionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoInversion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInversionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				


				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoInversion tipoinversionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoinversionLocal=this.tipoinversion;
			} else {
				tipoinversionLocal=this.tipoinversionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
							
				
				


				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInversionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
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
			
			


			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInversionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
								
						
				


				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
								
				
				


				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInversionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInversionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInversionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
							
				
				


				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInversionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinversionAnterior =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoinversionAnterior =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
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
			
			


			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInversionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
								
				
				


				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInversionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInversionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInversionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoInversion")) {
					jCheckBoxSeleccionarTodosTipoInversionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoInversion")) {
					jCheckBoxSeleccionadosTipoInversionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoInversion")) {
					
				}
				
				


				
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
												
				
				


				
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInversionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinversionAnterior =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoinversionAnterior =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInversionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
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
			
			


			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInversionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinversion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinversion);
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
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
				
				


				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInversion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInversion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInversionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinversionAnterior =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoInversion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoInversionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoInversion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoinversion =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoinversion =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoinversion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoInversion")) {
				
				}
				
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoInversion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoInversion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoInversion")) {
			
			}
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoInversion();
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoInversion")) {
				jButtonNuevoTipoInversionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoInversion")) {
				jButtonDuplicarTipoInversionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoInversion")) {
				jButtonCopiarTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoInversion")) {
				jButtonVerFormTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoInversion")) {
				jButtonNuevoTipoInversionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoInversion")) {
				jButtonModificarTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoInversion")) {
				jButtonActualizarTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoInversion")) {
				jButtonEliminarTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoInversion")) {
				jButtonGuardarCambiosTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoInversion")) {
				jButtonCancelarTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoInversion")) {
				jButtonCerrarTipoInversionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoInversion")) {
				jButtonGuardarCambiosTipoInversionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInversion")) {
				jButtonNuevoGuardarCambiosTipoInversionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoInversion")) {
				jButtonAbrirOrderByTipoInversionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoInversion")) {
				jButtonRecargarInformacionTipoInversionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoInversion")) {
				jButtonAnterioresTipoInversionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoInversion")) {
				jButtonSiguientesTipoInversionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInversionBusqueda")) {
				this.jButtonidTipoInversionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoInversionUpdate")) {
				this.jButtonid_empresaTipoInversionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoInversionBusqueda")) {
				this.jButtonid_empresaTipoInversionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoInversionBusqueda")) {
				this.jButtoncodigoTipoInversionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInversionBusqueda")) {
				this.jButtonnombreTipoInversionBusquedaActionPerformed(evt);
			}
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoInversion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoInversion")) {
				closingInternalFrameTipoInversion();
				
			} else if(sTipo.equals("jButtonCancelarTipoInversion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoInversion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoInversionBeanSwingJInternalFrame jInternalFrameParent=(TipoInversionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInversion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoInversionActionPerformed(null);
			}
			
			TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoinversion,new Object(),this.tipoinversionParameterGeneral,this.tipoinversionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoInversion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoInversion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoInversion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoinversion)) {
			if(!esControlTabla) {
				if(TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);			
				}
				
				if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoInversion(this.tipoinversion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoinversionReturnGeneral=tipoinversionLogic.procesarEventosTipoInversionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinversionLogic.getTipoInversions(),this.tipoinversion,this.tipoinversionParameterGeneral,this.isEsNuevoTipoInversion,classes);//this.tipoinversionLogic.getTipoInversion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoInversion(this.tipoinversionReturnGeneral,this.tipoinversionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoInversion(classes,this.tipoinversionReturnGeneral,this.tipoinversionBean,false);
					}
						
					if(this.tipoinversionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoInversion(this.tipoinversionReturnGeneral.getTipoInversion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoInversion(this.tipoinversionReturnGeneral.getTipoInversion());	
					}
						
					if(this.tipoinversionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoInversion(this.tipoinversionReturnGeneral.getTipoInversion(),classes);//this.tipoinversionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoInversion(this.tipoinversion,classes);//this.tipoinversionBean);									
				}
			
				if(TipoInversionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoInversion(this.tipoinversion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInversion(this.tipoinversion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoinversionAnterior!=null) {
						this.tipoinversion=this.tipoinversionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoinversionReturnGeneral=tipoinversionLogic.procesarEventosTipoInversionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinversionLogic.getTipoInversions(),this.tipoinversion,this.tipoinversionParameterGeneral,this.isEsNuevoTipoInversion,classes);//this.tipoinversionLogic.getTipoInversion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoinversionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoinversionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoinversionReturnGeneral.getTipoInversion(),tipoinversionLogic.getTipoInversions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoinversionReturnGeneral.getTipoInversion(),this.tipoinversions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoInversion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoInversion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoInversion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoInversion() throws Exception {
		
		TipoInversionModel tipoinversionModel=(TipoInversionModel)this.jTableDatosTipoInversion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinversionModel.tipoinversions=this.tipoinversionLogic.getTipoInversions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoinversionModel.tipoinversions=this.tipoinversions;
		}
		
		
		((TipoInversionModel) this.jTableDatosTipoInversion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoInversion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoinversionAnterior(),this.tipoinversionLogic.getTipoInversions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoinversionAnterior(),this.tipoinversions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoInversion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoInversion(TipoInversion tipoinversion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Accionista.class)) {
					this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(tipoinversion.getAccionistas());
					this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccionista(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
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
										
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinversion,new Object(),generalEntityParameterGeneral,this.tipoinversionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoinversionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoInversionConstantesFunciones.getClassesRelationshipsOfTipoInversion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoInversionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoInversion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoInversion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoInversionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinversion,new Object(),generalEntityParameterGeneral,this.tipoinversionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoInversion(TipoInversionBean tipoinversionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Accionista.class)) {
					this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.setAccionistas(tipoinversion.getAccionistas());
					this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccionista(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoInversion(ArrayList<Classe> classes,TipoInversionReturnGeneral tipoinversionReturnGeneral,TipoInversionBean tipoinversionBean,Boolean conDefault) throws Exception {
		
			this.tipoinversionBean.setAccionistas(tipoinversionReturnGeneral.getTipoInversion().getAccionistas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoInversion(TipoInversion tipoinversion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Accionista.class)) {
					tipoinversion.setAccionistas(this.jInternalFrameDetalleFormTipoInversion.accionistaBeanSwingJInternalFrame.accionistaLogic.getAccionistas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoinversion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoInversion = new TipoInversionDetalleFormJInternalFrame(jDesktopPane,this.tipoinversionSessionBean.getConGuardarRelaciones(),this.tipoinversionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.setVisible(false);
		this.jInternalFrameDetalleFormTipoInversion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoInversion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoInversion.tipoinversionLogic=this.tipoinversionLogic;
		
		this.cargarCombosFrameForeignKeyTipoInversion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInversion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInversion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoInversion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoInversion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoInversion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInversion"));
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonModificarTipoInversion.addActionListener(new ButtonActionListener(this,"ModificarTipoInversion"));

		
		this.jInternalFrameDetalleFormTipoInversion.jButtonModificarToolBarTipoInversion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInversion"));
					
		this.jInternalFrameDetalleFormTipoInversion.jMenuItemModificarTipoInversion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInversion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarTipoInversion.addActionListener (new ButtonActionListener(this,"ActualizarTipoInversion"));
		
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarToolBarTipoInversion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInversion"));
						
		this.jInternalFrameDetalleFormTipoInversion.jMenuItemActualizarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInversion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarTipoInversion.addActionListener (new ButtonActionListener(this,"EliminarTipoInversion"));
		
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInversion"));
								
		this.jInternalFrameDetalleFormTipoInversion.jMenuItemEliminarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInversion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarTipoInversion.addActionListener (new ButtonActionListener(this,"CancelarTipoInversion"));
		
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInversion"));
					
		this.jInternalFrameDetalleFormTipoInversion.jMenuItemCancelarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInversion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoInversion.jMenuItemDetalleCerrarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInversion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInversion"));
		
		
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInversion"));
		
		
		
		this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInversion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonidTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInversionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInversion.jButtonid_empresaTipoInversionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInversionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonid_empresaTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInversionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtoncodigoTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInversionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonnombreTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInversionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInversion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoInversion"));
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInversion"));
		}
		
		this.jTableDatosTipoInversion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoInversion"));
		
		this.jTableDatosTipoInversion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoInversion"));
		
		this.jButtonNuevoTipoInversion.addActionListener(new ButtonActionListener(this,"NuevoTipoInversion"));
		
		this.jButtonDuplicarTipoInversion.addActionListener(new ButtonActionListener(this,"DuplicarTipoInversion"));
		
		this.jButtonCopiarTipoInversion.addActionListener(new ButtonActionListener(this,"CopiarTipoInversion"));
		
		this.jButtonVerFormTipoInversion.addActionListener(new ButtonActionListener(this,"VerFormTipoInversion"));
		
		
		this.jButtonNuevoToolBarTipoInversion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoInversion"));
			
		this.jButtonDuplicarToolBarTipoInversion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoInversion"));
			
		this.jMenuItemNuevoTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoInversion"));
			
		this.jMenuItemDuplicarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoInversion"));		
		
		
		this.jButtonNuevoRelacionesTipoInversion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoInversion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoInversion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoInversion"));
			
		this.jMenuItemNuevoRelacionesTipoInversion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoInversion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonModificarTipoInversion.addActionListener(new ButtonActionListener(this,"ModificarTipoInversion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonModificarToolBarTipoInversion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInversion"));
			
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemModificarTipoInversion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInversion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarTipoInversion.addActionListener (new ButtonActionListener(this,"ActualizarTipoInversion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonActualizarToolBarTipoInversion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInversion"));
				
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemActualizarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInversion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarTipoInversion.addActionListener (new ButtonActionListener(this,"EliminarTipoInversion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonEliminarToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInversion"));
						
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemEliminarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInversion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarTipoInversion.addActionListener (new ButtonActionListener(this,"CancelarTipoInversion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonCancelarToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInversion"));
			
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemCancelarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInversion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoInversion"));		
		
		
		this.jButtonCerrarTipoInversion.addActionListener (new ButtonActionListener(this,"CerrarTipoInversion"));
		
		
		this.jButtonCerrarToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoInversion"));
			
		this.jMenuItemCerrarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoInversion"));
			
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jMenuItemDetalleCerrarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInversion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosTipoInversion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoInversion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInversion"));
		}
		
		this.jButtonCopiarToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoInversion"));
			
		this.jButtonVerFormToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoInversion"));
		
		this.jMenuItemGuardarCambiosTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoInversion"));
			
		this.jMenuItemCopiarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoInversion"));		
		
		this.jMenuItemVerFormTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoInversion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoInversion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInversion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoInversion"));
			
		this.jMenuItemGuardarCambiosTablaTipoInversion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInversion"));		
		
		
		
		this.jButtonRecargarInformacionTipoInversion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoInversion"));
					
		this.jButtonRecargarInformacionToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoInversion"));
		
		this.jMenuItemRecargarInformacionTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoInversion"));		
		
		
		
		this.jButtonAnterioresTipoInversion.addActionListener (new ButtonActionListener(this,"AnterioresTipoInversion"));
		
		
		this.jButtonAnterioresToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoInversion"));
		
		this.jMenuItemAnterioresTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoInversion"));		
		
		
		this.jButtonSiguientesTipoInversion.addActionListener (new ButtonActionListener(this,"SiguientesTipoInversion"));
		
		
		this.jButtonSiguientesToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoInversion"));
			
		this.jMenuItemSiguientesTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoInversion"));
			
		this.jMenuItemAbrirOrderByTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoInversion"));
			
		this.jMenuItemMostrarOcultarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoInversion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoInversion"));
			
		this.jMenuItemDetalleMostarOcultarTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoInversion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoInversion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoInversion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoInversion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoInversion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoInversion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoInversion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoInversion"));

		this.jCheckBoxSeleccionadosTipoInversion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoInversion"));
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInversion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoInversion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoInversion"));
			
		this.jComboBoxTiposAccionesTipoInversion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoInversion"));
					
		this.jComboBoxTiposSeleccionarTipoInversion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoInversion"));
			
		this.jTextFieldValorCampoGeneralTipoInversion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoInversion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonidTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInversionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInversion.jButtonid_empresaTipoInversionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInversionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonid_empresaTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInversionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtoncodigoTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInversionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonnombreTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInversionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoInversion!=null) {
				this.jInternalFrameReporteDinamicoTipoInversion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInversion"));
				this.jInternalFrameReporteDinamicoTipoInversion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInversion"));
				this.jInternalFrameReporteDinamicoTipoInversion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInversion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoInversion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInversion"));				
			//this.jButtonGenerarReporteDinamicoTipoInversion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInversion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoInversion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInversion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoInversion!=null) {
				this.jInternalFrameImportacionTipoInversion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInversion"));
				this.jInternalFrameImportacionTipoInversion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInversion"));
				this.jInternalFrameImportacionTipoInversion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInversion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoInversion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoInversion"));
			
			this.jButtonAbrirOrderByToolBarTipoInversion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoInversion"));			
			
			if(this.jInternalFrameOrderByTipoInversion!=null) {
				this.jInternalFrameOrderByTipoInversion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInversion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoInversion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInversion.jTabbedPaneRelacionesTipoInversion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInversion"));
		
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
            		closingInternalFrameTipoInversion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoInversion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoInversion = (JInternalFrameBase)event.getSource();
	            	
	            TipoInversionBeanSwingJInternalFrame jInternalFrameParent=(TipoInversionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInversion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoInversionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoInversion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoInversionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoInversion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoInversion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInversionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInversionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInversionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoInversion";
		inputMap = this.jButtonNuevoTipoInversion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoInversion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInversionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInversionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInversionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInversionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoInversion";
		inputMap = this.jButtonNuevoRelacionesTipoInversion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoInversion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInversionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoInversion";
		inputMap = this.jButtonModificarTipoInversion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoInversion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoInversionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoInversion";
		inputMap = this.jButtonActualizarTipoInversion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoInversion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoInversionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoInversion";
		inputMap = this.jButtonEliminarTipoInversion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoInversion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoInversionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoInversion";
		inputMap = this.jButtonCancelarTipoInversion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoInversion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoInversionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoInversion";
		inputMap = this.jButtonCerrarTipoInversion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoInversion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoInversionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoInversion";
		inputMap = this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosTipoInversion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoInversion.jButtonGuardarCambiosTipoInversion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoInversionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoInversion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoInversionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoInversion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoInversionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoInversion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoInversionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoInversion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoInversionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonidTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInversionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInversion.jButtonid_empresaTipoInversionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInversionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonid_empresaTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInversionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtoncodigoTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInversionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInversion.jButtonnombreTipoInversionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInversionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoInversion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoInversionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoInversionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoInversion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoInversion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
					tipoinversionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInversion tipoinversionAux:tipoinversions) {
					tipoinversionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoInversionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInversion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
						tipoinversionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInversion tipoinversionAux:tipoinversions) {
						tipoinversionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInversion tipoinversionAux:tipoinversions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInversion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInversion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInversion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInversion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoInversionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInversion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoInversion.getSelectedRows();
			
			TipoInversion tipoinversionLocal=new TipoInversion();
			
			//this.seleccionarTodosTipoInversion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinversionLocal =(TipoInversion) this.tipoinversionLogic.getTipoInversions().toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoinversionLocal =(TipoInversion) this.tipoinversions.toArray()[this.jTableDatosTipoInversion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoinversionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
						tipoinversionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInversion tipoinversionAux:tipoinversions) {
						tipoinversionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoInversion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInversion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInversion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInversion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoInversionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoInversionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoInversionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoInversion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoInversion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInversion tipoinversionAux:this.tipoinversionLogic.getTipoInversions()) {
				
						if(sTipoSeleccionar.equals(TipoInversionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoinversionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInversionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoinversionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInversion tipoinversionAux:tipoinversions) {
					
						if(sTipoSeleccionar.equals(TipoInversionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoinversionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInversionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoinversionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInversion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoInversionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoInversion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoInversion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoInversion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoInversion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoInversion(conSplash);
				
					this.generarReporteTipoInversionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoInversionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInversionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInversionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInversion();
				
				this.exportarTipoInversionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoInversions();
				//this.importarTipoInversions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInversion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoInversionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Inversion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoInversion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoInversion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoInversion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoInversionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoInversion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoInversion(conSplash);
					
						//this.actualizarParametrosGeneralTipoInversion();
						
						this.generarReporteProcesoAccionTipoInversionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoInversionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo InversionES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Inversion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoInversion();
				
						this.actualizarParametrosGeneralTipoInversion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoinversionReturnGeneral=tipoinversionLogic.procesarAccionTipoInversionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoinversionLogic.getTipoInversions(),this.tipoinversionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoInversionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoInversion();
					
					TipoInversionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoInversionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoInversion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoInversion.jComboBoxTiposAccionesFormularioTipoInversion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoInversion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoInversionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoInversion();
			
			if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		
			TipoInversion tipoinversion=new TipoInversion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoInversion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoInversion.getSelectedItem();
			
			
			
			
			tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoinversionsSeleccionados.size()==1) {
				for(TipoInversion tipoinversionAux:tipoinversionsSeleccionados) {
					tipoinversion=tipoinversionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Accionista")) {
					jButtonAccionistaActionPerformed(null,rowIndex,true,false,tipoinversion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoInversion();
			
      		//this.finishProcessTipoInversion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoInversionReturnGeneral() throws Exception {
		if(this.tipoinversionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoinversionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoinversionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoinversionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoinversionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoinversionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoInversion(false);
		}
		
		if(this.tipoinversionReturnGeneral.getConRetornoLista() || this.tipoinversionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoinversionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoinversionLogic.setTipoInversions(this.tipoinversionReturnGeneral.getTipoInversions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoinversionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoinversionLogic.setTipoInversion(this.tipoinversionReturnGeneral.getTipoInversion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoInversion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoInversion() throws Exception {
		
		
	}
	
	public ArrayList<TipoInversion> getTipoInversionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoInversion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoInversion tipoinversionAux:tipoinversionLogic.getTipoInversions()) {
					if(tipoinversionAux.getIsSelected()) {
						tipoinversionsSeleccionados.add(tipoinversionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInversion tipoinversionAux:this.tipoinversions) {
					if(tipoinversionAux.getIsSelected()) {
						tipoinversionsSeleccionados.add(tipoinversionAux);				
					}
				}
			}
			
			if(tipoinversionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoinversionsSeleccionados.addAll(this.tipoinversionLogic.getTipoInversions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoinversionsSeleccionados.addAll(this.tipoinversions);				
					}
				}
			}
		} else {
			tipoinversionsSeleccionados.add(this.tipoinversion);
		}
		
		return tipoinversionsSeleccionados;
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
	
	public void generarReporteTipoInversionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoInversionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoInversionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInversionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInversionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoInversionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Inversion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoInversionsSeleccionados() throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoInversions("Todos",tipoinversionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoInversionsSeleccionados() throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoInversions("Todos",tipoinversionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoInversionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoInversions("Todos",tipoinversionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoInversionsSeleccionados() throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoInversion();
		
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoInversion();
		
		
		//this.generarReporteTipoInversions("Todos",tipoinversionsSeleccionados ,tipoinversionImplementable,tipoinversionImplementableHome);
	}
	
	public void mostrarImportacionTipoInversions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoInversion();
		
		this.abrirFrameImportacionTipoInversion();		
		
			
		//this.generarReporteTipoInversions("Todos",tipoinversionsSeleccionados ,tipoinversionImplementable,tipoinversionImplementableHome);
	}
	
	public void importarTipoInversions() throws Exception {		
	
	}
	
	public void exportarTipoInversionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoInversionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoInversionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoInversionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Inversion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoInversionsSeleccionados() throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinversion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoInversion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoInversion tipoinversionAux:tipoinversionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoInversion(tipoinversionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoinversionAux.setsDetalleGeneralEntityReporte(tipoinversionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoInversion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoInversionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInversionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInversionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInversionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInversionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoInversion(TipoInversion tipoinversion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoinversion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinversion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinversion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinversion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinversion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoInversionsSeleccionados() throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinversion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoInversions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoInversion(row);				
				iRow++;
			}				
			
			for(TipoInversion tipoinversionAux:tipoinversionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoInversion(tipoinversionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoInversionsSeleccionados() throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();		
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinversion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoinversions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoinversion");
			//elementRoot.appendChild(element);
		
			for(TipoInversion tipoinversionAux:tipoinversionsSeleccionados) {
				element = document.createElement("tipoinversion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoInversion(tipoinversionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inversion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoInversion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInversionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInversionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoInversionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInversionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInversionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoInversion(TipoInversion tipoinversion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinversion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinversion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinversion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinversion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoInversion(TipoInversion tipoinversion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoInversionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoinversion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoInversionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoinversion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoInversionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoinversion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoInversionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoinversion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoInversionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoinversion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoInversionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoInversion> tipoinversionsSeleccionados=new ArrayList<TipoInversion>();
		
		tipoinversionsSeleccionados=this.getTipoInversionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoInversion(tipoinversionsSeleccionados);
		
		this.generarReporteTipoInversions("Todos",tipoinversionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoInversion(ArrayList<TipoInversion> tipoinversionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoInversion tipoinversionAux:tipoinversionsSeleccionados) {
				tipoinversionAux.setsDetalleGeneralEntityReporte(tipoinversionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoInversionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoinversionAux.setsDescripcionGeneralEntityReporte1(tipoinversionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoInversionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoinversionAux.setsDescripcionGeneralEntityReporte1(tipoinversionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoInversionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoinversionAux.setsDescripcionGeneralEntityReporte1(tipoinversionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInversionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoInversion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoInversion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoInversion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoInversion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoInversion=false;
			this.isVisibilidadCeldaActualizarTipoInversion=false;
			this.isVisibilidadCeldaEliminarTipoInversion=false;
			this.isVisibilidadCeldaCancelarTipoInversion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInversion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoInversion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=false;
			this.isVisibilidadCeldaModificarTipoInversion=false;
			this.isVisibilidadCeldaActualizarTipoInversion=true;
			this.isVisibilidadCeldaEliminarTipoInversion=false;
			this.isVisibilidadCeldaCancelarTipoInversion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInversion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoInversion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=false;
			this.isVisibilidadCeldaModificarTipoInversion=false;
			this.isVisibilidadCeldaActualizarTipoInversion=true;
			this.isVisibilidadCeldaEliminarTipoInversion=true;
			this.isVisibilidadCeldaCancelarTipoInversion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInversion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoInversion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=false;
			this.isVisibilidadCeldaModificarTipoInversion=false;
			this.isVisibilidadCeldaActualizarTipoInversion=true;
			this.isVisibilidadCeldaEliminarTipoInversion=false;
			this.isVisibilidadCeldaCancelarTipoInversion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoInversion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=true;
			this.isVisibilidadCeldaModificarTipoInversion=false;
			this.isVisibilidadCeldaActualizarTipoInversion=false;
			this.isVisibilidadCeldaEliminarTipoInversion=false;
			this.isVisibilidadCeldaCancelarTipoInversion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInversion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoInversion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=false;
			this.isVisibilidadCeldaActualizarTipoInversion=false;
			this.isVisibilidadCeldaEliminarTipoInversion=false;
			this.isVisibilidadCeldaCancelarTipoInversion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoInversion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=false;
			this.isVisibilidadCeldaModificarTipoInversion=true;
			this.isVisibilidadCeldaActualizarTipoInversion=false;
			this.isVisibilidadCeldaEliminarTipoInversion=false;
			this.isVisibilidadCeldaCancelarTipoInversion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInversion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoInversionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoInversion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=true;
		} else {
			this.actualizarEstadoPanelsTipoInversion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoInversion=false;
			//this.isVisibilidadCeldaVerFormTipoInversion=false;
			this.isVisibilidadCeldaDuplicarTipoInversion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoinversionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoInversion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInversion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoinversionSessionBean.getEsGuardarRelacionado()) {
			if(!tipoinversionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;												
			}
			
			this.jButtonCerrarTipoInversion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInversion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoinversion)) {
			this.isVisibilidadCeldaActualizarTipoInversion=false;
			this.isVisibilidadCeldaEliminarTipoInversion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInversion() {
		this.isVisibilidadCeldaNuevoTipoInversion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoInversion=false;
	}
	
	public void actualizarEstadoPanelsTipoInversion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoInversion!=null) {
				this.jScrollPanelDatosEdicionTipoInversion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInversion!=null) {
				this.jTabbedPaneBusquedasTipoInversion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInversion!=null) {
				this.jScrollPanelDatosTipoInversion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInversion!=null) {
				this.jPanelPaginacionTipoInversion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoInversion!=null) {
				this.jScrollPanelDatosEdicionTipoInversion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInversion!=null) {
				this.jTabbedPaneBusquedasTipoInversion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoInversion!=null) {
				this.jScrollPanelDatosTipoInversion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInversion!=null) {
				this.jPanelPaginacionTipoInversion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoInversion!=null) {
				this.jScrollPanelDatosEdicionTipoInversion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInversion!=null) {
				this.jTabbedPaneBusquedasTipoInversion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInversion!=null) {
				this.jScrollPanelDatosTipoInversion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInversion!=null) {
				this.jPanelPaginacionTipoInversion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoInversion!=null) {
				this.jScrollPanelDatosEdicionTipoInversion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInversion!=null) {
				this.jTabbedPaneBusquedasTipoInversion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInversion!=null) {
				this.jScrollPanelDatosTipoInversion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInversion!=null) {
				this.jPanelPaginacionTipoInversion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoInversion!=null) {
				this.jScrollPanelDatosEdicionTipoInversion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInversion!=null) {
				this.jTabbedPaneBusquedasTipoInversion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInversion!=null) {
				this.jScrollPanelDatosTipoInversion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInversion!=null) {
				this.jPanelPaginacionTipoInversion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoInversion!=null) {
				this.jScrollPanelDatosEdicionTipoInversion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInversion!=null) {
				this.jTabbedPaneBusquedasTipoInversion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInversion!=null) {
				this.jScrollPanelDatosTipoInversion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInversion!=null) {
				this.jPanelPaginacionTipoInversion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoInversion!=null) {
				this.jScrollPanelDatosEdicionTipoInversion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInversion!=null) {
				this.jTabbedPaneBusquedasTipoInversion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInversion!=null) {
				this.jScrollPanelDatosTipoInversion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInversion!=null) {
				this.jPanelPaginacionTipoInversion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoInversion!=null) {
					this.jTabbedPaneBusquedasTipoInversion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoinversionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInversion!=null) {
				this.jTabbedPaneBusquedasTipoInversion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoInversion!=null) {
				this.jPanelParametrosReportesTipoInversion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoInversionParaAccionistas() throws Exception {
		Boolean isPaginaPopupAccionista=false;

		try {

			if(this.tipoinversionSessionBean==null) {
				this.tipoinversionSessionBean=new TipoInversionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean=new AccionistaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean.setsPathNavegacionActual(tipoinversionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AccionistaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAccionista=this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAccionista(false);
			this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAccionista(TipoInversionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean.setisBusquedaDesdeForeignKeySesionTipoInversion(true);
			this.jInternalFrameDetalleFormTipoInversion.accionistaSessionBean.setlidTipoInversionActual(this.idTipoInversionActual);

			tipoinversionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoInversion(true);
			tipoinversionSessionBean.setlIdTipoInversionActualForeignKey(this.idTipoInversionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoInversionSessionBean tipoinversionSessionBean=new TipoInversionSessionBean();
		
		if(this.tipoinversionSessionBean==null) {
			this.tipoinversionSessionBean=new TipoInversionSessionBean();
		}
		
		this.tipoinversionSessionBean.setsUltimaBusquedaTipoInversion(this.getsAccionBusqueda());
		this.tipoinversionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoinversionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoinversionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoInversionSessionBean tipoinversionSessionBean=new TipoInversionSessionBean();
		
		if(this.tipoinversionSessionBean==null) {
			this.tipoinversionSessionBean=new TipoInversionSessionBean();
		}
		
		if(this.tipoinversionSessionBean.getsUltimaBusquedaTipoInversion()!=null&&!this.tipoinversionSessionBean.getsUltimaBusquedaTipoInversion().equals("")) {
			this.setsAccionBusqueda(tipoinversionSessionBean.getsUltimaBusquedaTipoInversion());
			this.setiNumeroPaginacion(tipoinversionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoinversionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoinversionSessionBean.getid_empresa());
				tipoinversionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoinversionSessionBean.setsUltimaBusquedaTipoInversion("");
		this.tipoinversionSessionBean.setiNumeroPaginacion(TipoInversionConstantesFunciones.INUMEROPAGINACION);
		this.tipoinversionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoInversion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoInversion() {
		this.updateBorderResaltarBusquedasFormularioTipoInversion();
		this.updateVisibilidadBusquedasFormularioTipoInversion();
		this.updateHabilitarBusquedasFormularioTipoInversion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoInversion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoInversion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoInversion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoInversion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoInversion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoInversion.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoInversion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoInversion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoInversion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoInversion();
		this.updateVisibilidadResaltarControlesFormularioTipoInversion();
		this.updateHabilitarResaltarControlesFormularioTipoInversion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoInversion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoinversionConstantesFunciones.resaltaridTipoInversion!=null && this.jInternalFrameDetalleFormTipoInversion!=null) {this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.setBorder(this.tipoinversionConstantesFunciones.resaltaridTipoInversion);}
		if(this.tipoinversionConstantesFunciones.resaltarid_empresaTipoInversion!=null && this.jInternalFrameDetalleFormTipoInversion!=null) {this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setBorder(this.tipoinversionConstantesFunciones.resaltarid_empresaTipoInversion);}
		if(this.tipoinversionConstantesFunciones.resaltarcodigoTipoInversion!=null && this.jInternalFrameDetalleFormTipoInversion!=null) {this.jInternalFrameDetalleFormTipoInversion.jTextFieldcodigoTipoInversion.setBorder(this.tipoinversionConstantesFunciones.resaltarcodigoTipoInversion);}
		if(this.tipoinversionConstantesFunciones.resaltarnombreTipoInversion!=null && this.jInternalFrameDetalleFormTipoInversion!=null) {this.jInternalFrameDetalleFormTipoInversion.jTextAreanombreTipoInversion.setBorder(this.tipoinversionConstantesFunciones.resaltarnombreTipoInversion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoInversion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
	
		//this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.setVisible(this.tipoinversionConstantesFunciones.mostraridTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jPanelidTipoInversion.setVisible(this.tipoinversionConstantesFunciones.mostraridTipoInversion);
		//this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setVisible(this.tipoinversionConstantesFunciones.mostrarid_empresaTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jPanelid_empresaTipoInversion.setVisible(this.tipoinversionConstantesFunciones.mostrarid_empresaTipoInversion);
		//this.jInternalFrameDetalleFormTipoInversion.jTextFieldcodigoTipoInversion.setVisible(this.tipoinversionConstantesFunciones.mostrarcodigoTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jPanelcodigoTipoInversion.setVisible(this.tipoinversionConstantesFunciones.mostrarcodigoTipoInversion);
		//this.jInternalFrameDetalleFormTipoInversion.jTextAreanombreTipoInversion.setVisible(this.tipoinversionConstantesFunciones.mostrarnombreTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jPanelnombreTipoInversion.setVisible(this.tipoinversionConstantesFunciones.mostrarnombreTipoInversion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoInversion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInversion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInversion!=null) {
	
		this.jInternalFrameDetalleFormTipoInversion.jLabelidTipoInversion.setEnabled(this.tipoinversionConstantesFunciones.activaridTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jComboBoxid_empresaTipoInversion.setEnabled(this.tipoinversionConstantesFunciones.activarid_empresaTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jTextFieldcodigoTipoInversion.setEnabled(this.tipoinversionConstantesFunciones.activarcodigoTipoInversion);
		this.jInternalFrameDetalleFormTipoInversion.jTextAreanombreTipoInversion.setEnabled(this.tipoinversionConstantesFunciones.activarnombreTipoInversion);
		}
	}
	
		
}