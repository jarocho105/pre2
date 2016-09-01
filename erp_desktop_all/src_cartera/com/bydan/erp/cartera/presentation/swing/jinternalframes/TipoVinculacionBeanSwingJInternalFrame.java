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

import com.bydan.erp.cartera.util.TipoVinculacionConstantesFunciones;
import com.bydan.erp.cartera.util.TipoVinculacionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoVinculacionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoVinculacionBean;
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
public class TipoVinculacionBeanSwingJInternalFrame extends TipoVinculacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoVinculacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoVinculacion> tipovinculacionValidator = new ClassValidator<TipoVinculacion>(TipoVinculacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoVinculacion tipovinculacion;	
	public TipoVinculacion tipovinculacionAux;
	public TipoVinculacion tipovinculacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoVinculacion tipovinculacionTotales;
	public Long idTipoVinculacionActual;
	public Long iIdNuevoTipoVinculacion=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosInformacionEconomica=false;

	public Boolean getIsTienePermisosInformacionEconomica() {
		return isTienePermisosInformacionEconomica;
	}

	public void setIsTienePermisosInformacionEconomica(Boolean isTienePermisosInformacionEconomica) {
		this.isTienePermisosInformacionEconomica= isTienePermisosInformacionEconomica;
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
	
	public Boolean isPermisoTodoTipoVinculacion;
	public Boolean isPermisoNuevoTipoVinculacion;
	public Boolean isPermisoActualizarTipoVinculacion;
	public Boolean isPermisoActualizarOriginalTipoVinculacion;
	public Boolean isPermisoEliminarTipoVinculacion;
	public Boolean isPermisoGuardarCambiosTipoVinculacion;
	public Boolean isPermisoConsultaTipoVinculacion;
	public Boolean isPermisoBusquedaTipoVinculacion;
	public Boolean isPermisoReporteTipoVinculacion;
	public Boolean isPermisoPaginacionMedioTipoVinculacion;
	public Boolean isPermisoPaginacionAltoTipoVinculacion;
	public Boolean isPermisoPaginacionTodoTipoVinculacion;
	public Boolean isPermisoCopiarTipoVinculacion;
	public Boolean isPermisoVerFormTipoVinculacion;
	public Boolean isPermisoDuplicarTipoVinculacion;
	public Boolean isPermisoOrdenTipoVinculacion;
	
	
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
	
	public TipoVinculacionParameterReturnGeneral tipovinculacionReturnGeneral;
	public TipoVinculacionParameterReturnGeneral tipovinculacionParameterGeneral;
	
	

	public InformacionEconomicaLogic informacioneconomicaLogic=null;

	public InformacionEconomicaLogic getInformacionEconomicaLogic() {
		return informacioneconomicaLogic;
	}

	public void setInformacionEconomicaLogic(InformacionEconomicaLogic informacioneconomicaLogic) {
		this.informacioneconomicaLogic = informacioneconomicaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoVinculacion=false;
	public Boolean esParaAccionDesdeFormularioTipoVinculacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoVinculacionSessionBeanAdditional tipovinculacionSessionBeanAdditional=null;
	
	public TipoVinculacionSessionBeanAdditional getTipoVinculacionSessionBeanAdditional() {
		return this.tipovinculacionSessionBeanAdditional;
	}
	
	public void setTipoVinculacionSessionBeanAdditional(TipoVinculacionSessionBeanAdditional tipovinculacionSessionBeanAdditional) {
		try {
			this.tipovinculacionSessionBeanAdditional=tipovinculacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoVinculacionBeanSwingJInternalFrameAdditional tipovinculacionBeanSwingJInternalFrameAdditional=null;
	//public class TipoVinculacionBeanSwingJInternalFrame
	
	public TipoVinculacionBeanSwingJInternalFrameAdditional getTipoVinculacionBeanSwingJInternalFrameAdditional() {
		return this.tipovinculacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoVinculacionBeanSwingJInternalFrameAdditional(TipoVinculacionBeanSwingJInternalFrameAdditional tipovinculacionBeanSwingJInternalFrameAdditional) {
		try {
			this.tipovinculacionBeanSwingJInternalFrameAdditional=tipovinculacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoVinculacionLogic tipovinculacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoVinculacion tipovinculacionBean;
	public TipoVinculacionConstantesFunciones tipovinculacionConstantesFunciones;
	//public TipoVinculacionParameterReturnGeneral tipovinculacionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoVinculacion> tipovinculacions;	
	//public List<TipoVinculacion> tipovinculacionsEliminados;
	//public List<TipoVinculacion> tipovinculacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoVinculacion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoVinculacion=true;
	public Boolean isVisibilidadCeldaCopiarTipoVinculacion=true;
	public Boolean isVisibilidadCeldaVerFormTipoVinculacion=true;
	public Boolean isVisibilidadCeldaOrdenTipoVinculacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
	public Boolean isVisibilidadCeldaModificarTipoVinculacion=false;
	public Boolean isVisibilidadCeldaActualizarTipoVinculacion=false;
	public Boolean isVisibilidadCeldaEliminarTipoVinculacion=false;
	public Boolean isVisibilidadCeldaCancelarTipoVinculacion=false;
	public Boolean isVisibilidadCeldaGuardarTipoVinculacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoVinculacion() {
		return this.iIdNuevoTipoVinculacion;
	}

	public void setiIdNuevoTipoVinculacion(Long iIdNuevoTipoVinculacion) {
		this.iIdNuevoTipoVinculacion = iIdNuevoTipoVinculacion;
	}
	
	public Long getidTipoVinculacionActual() {
		return this.idTipoVinculacionActual;
	}

	public void setidTipoVinculacionActual(Long idTipoVinculacionActual) {
		this.idTipoVinculacionActual = idTipoVinculacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoVinculacion gettipovinculacion() {
		return this.tipovinculacion;
	}

	public void settipovinculacion(TipoVinculacion tipovinculacion) {
		this.tipovinculacion = tipovinculacion;
	}
	
	public TipoVinculacion gettipovinculacionAux() {
		return this.tipovinculacionAux;
	}

	public void settipovinculacionAux(TipoVinculacion tipovinculacionAux) {
		this.tipovinculacionAux = tipovinculacionAux;
	}				
	
	public TipoVinculacion gettipovinculacionAnterior() {
		return this.tipovinculacionAnterior;
	}

	public void settipovinculacionAnterior(TipoVinculacion tipovinculacionAnterior) {
		this.tipovinculacionAnterior = tipovinculacionAnterior;
	}	
	
	public TipoVinculacion gettipovinculacionTotales() {
		return this.tipovinculacionTotales;
	}

	public void settipovinculacionTotales(TipoVinculacion tipovinculacionTotales) {
		this.tipovinculacionTotales = tipovinculacionTotales;
	}	
	
	public TipoVinculacion gettipovinculacionBean() {
		return this.tipovinculacionBean;
	}

	public void settipovinculacionBean(TipoVinculacion tipovinculacionBean) {
		this.tipovinculacionBean = tipovinculacionBean;
	}	
	
	public TipoVinculacionParameterReturnGeneral gettipovinculacionReturnGeneral() {
		return this.tipovinculacionReturnGeneral;
	}

	public void settipovinculacionReturnGeneral(TipoVinculacionParameterReturnGeneral tipovinculacionReturnGeneral) {
		this.tipovinculacionReturnGeneral = tipovinculacionReturnGeneral;
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
	
	
	public TipoVinculacionLogic getTipoVinculacionLogic()	{		
		return tipovinculacionLogic;
	}

	public void setTipoVinculacionLogic(TipoVinculacionLogic tipovinculacionLogic) {
		this.tipovinculacionLogic = tipovinculacionLogic;
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
	
	public Boolean getIsEsNuevoTipoVinculacion() {
		return isEsNuevoTipoVinculacion;
	}

	public void setIsEsNuevoTipoVinculacion(Boolean isEsNuevoTipoVinculacion) {
		this.isEsNuevoTipoVinculacion = isEsNuevoTipoVinculacion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoVinculacion() {
		return esParaAccionDesdeFormularioTipoVinculacion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoVinculacion(Boolean esParaAccionDesdeFormularioTipoVinculacion) {
		this.esParaAccionDesdeFormularioTipoVinculacion = esParaAccionDesdeFormularioTipoVinculacion;
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

			if(this.tipovinculacionSessionBean==null) {
				this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
			}

			if(!this.tipovinculacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipovinculacionSessionBean.getlidEmpresaActual());
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

					if(this.tipovinculacion!=null) {
						this.tipovinculacion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
						this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoVinculacion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
						if(this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoVinculacionGenerico)throws Exception
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
				jComboBoxid_empresaTipoVinculacionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoVinculacionGenerico!=null && jComboBoxid_empresaTipoVinculacionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoVinculacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoVinculacion tipovinculacion,JComboBox jComboBoxid_empresaTipoVinculacionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoVinculacionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoVinculacionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipovinculacion.setid_empresa(empresaAux.getId());
				tipovinculacion.setempresa_descripcion(TipoVinculacionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipovinculacion.setEmpresa(empresaAux);			}
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

					if(!TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { 
							this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { 
					}

					if(!TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
							this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
							this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoVinculacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoVinculacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoVinculacion(this.tipovinculacionLogic.getTipoVinculacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoVinculacionConstantesFunciones.refrescarForeignKeysDescripcionesTipoVinculacion(this.tipovinculacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipovinculacionLogic.setTipoVinculacions(this.tipovinculacions);
			tipovinculacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoVinculacionParameterReturnGeneral getTipoVinculacionParameterGeneral() {
		return this.tipovinculacionParameterGeneral;
	}
	
	public void setTipoVinculacionParameterGeneral(TipoVinculacionParameterReturnGeneral tipovinculacionParameterGeneral) {
		this.tipovinculacionParameterGeneral = tipovinculacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoVinculacion() {
		return isPermisoTodoTipoVinculacion;
	}

	public void setIsPermisoTodoTipoVinculacion(Boolean isPermisoTodoTipoVinculacion) {
		this.isPermisoTodoTipoVinculacion = isPermisoTodoTipoVinculacion;
	}

	public Boolean getIsPermisoNuevoTipoVinculacion() {
		return isPermisoNuevoTipoVinculacion;
	}

	public void setIsPermisoNuevoTipoVinculacion(Boolean isPermisoNuevoTipoVinculacion) {
		this.isPermisoNuevoTipoVinculacion = isPermisoNuevoTipoVinculacion;
	}

	public Boolean getIsPermisoActualizarTipoVinculacion() {
		return isPermisoActualizarTipoVinculacion;
	}

	public void setIsPermisoActualizarTipoVinculacion(Boolean isPermisoActualizarTipoVinculacion) {
		this.isPermisoActualizarTipoVinculacion = isPermisoActualizarTipoVinculacion;
	}

	public Boolean getIsPermisoEliminarTipoVinculacion() {
		return isPermisoEliminarTipoVinculacion;
	}

	public void setIsPermisoEliminarTipoVinculacion(Boolean isPermisoEliminarTipoVinculacion) {
		this.isPermisoEliminarTipoVinculacion = isPermisoEliminarTipoVinculacion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoVinculacion() {
		return isPermisoGuardarCambiosTipoVinculacion;
	}

	public void setIsPermisoGuardarCambiosTipoVinculacion(Boolean isPermisoGuardarCambiosTipoVinculacion) {
		this.isPermisoGuardarCambiosTipoVinculacion = isPermisoGuardarCambiosTipoVinculacion;
	}
	
	public Boolean getIsPermisoConsultaTipoVinculacion() {
		return isPermisoConsultaTipoVinculacion;
	}

	public void setIsPermisoConsultaTipoVinculacion(Boolean isPermisoConsultaTipoVinculacion) {
		this.isPermisoConsultaTipoVinculacion = isPermisoConsultaTipoVinculacion;
	}

	public Boolean getIsPermisoBusquedaTipoVinculacion() {
		return isPermisoBusquedaTipoVinculacion;
	}

	public void setIsPermisoBusquedaTipoVinculacion(Boolean isPermisoBusquedaTipoVinculacion) {
		this.isPermisoBusquedaTipoVinculacion = isPermisoBusquedaTipoVinculacion;
	}

	public Boolean getIsPermisoReporteTipoVinculacion() {
		return isPermisoReporteTipoVinculacion;
	}

	public void setIsPermisoReporteTipoVinculacion(Boolean isPermisoReporteTipoVinculacion) {
		this.isPermisoReporteTipoVinculacion = isPermisoReporteTipoVinculacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoVinculacion() {
		return isPermisoPaginacionMedioTipoVinculacion;
	}

	public void setIsPermisoPaginacionMedioTipoVinculacion(Boolean isPermisoPaginacionMedioTipoVinculacion) {
		this.isPermisoPaginacionMedioTipoVinculacion = isPermisoPaginacionMedioTipoVinculacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoVinculacion() {
		return isPermisoPaginacionTodoTipoVinculacion;
	}

	public void setIsPermisoPaginacionTodoTipoVinculacion(Boolean isPermisoPaginacionTodoTipoVinculacion) {
		this.isPermisoPaginacionTodoTipoVinculacion = isPermisoPaginacionTodoTipoVinculacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoVinculacion() {
		return isPermisoPaginacionAltoTipoVinculacion;
	}

	public void setIsPermisoPaginacionAltoTipoVinculacion(Boolean isPermisoPaginacionAltoTipoVinculacion) {
		this.isPermisoPaginacionAltoTipoVinculacion = isPermisoPaginacionAltoTipoVinculacion;
	}
	
	public Boolean getIsPermisoCopiarTipoVinculacion() {
		return isPermisoCopiarTipoVinculacion;
	}

	public void setIsPermisoCopiarTipoVinculacion(Boolean isPermisoCopiarTipoVinculacion) {
		this.isPermisoCopiarTipoVinculacion = isPermisoCopiarTipoVinculacion;
	}
	
	public Boolean getIsPermisoVerFormTipoVinculacion() {
		return isPermisoVerFormTipoVinculacion;
	}

	public void setIsPermisoVerFormTipoVinculacion(Boolean isPermisoVerFormTipoVinculacion) {
		this.isPermisoVerFormTipoVinculacion = isPermisoVerFormTipoVinculacion;
	}
	
	public Boolean getIsPermisoDuplicarTipoVinculacion() {
		return isPermisoDuplicarTipoVinculacion;
	}

	public void setIsPermisoDuplicarTipoVinculacion(Boolean isPermisoDuplicarTipoVinculacion) {
		this.isPermisoDuplicarTipoVinculacion = isPermisoDuplicarTipoVinculacion;
	}
	
	public Boolean getIsPermisoOrdenTipoVinculacion() {
		return isPermisoOrdenTipoVinculacion;
	}

	public void setIsPermisoOrdenTipoVinculacion(Boolean isPermisoOrdenTipoVinculacion) {
		this.isPermisoOrdenTipoVinculacion = isPermisoOrdenTipoVinculacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoVinculacion() {
		return isVisibilidadCeldaNuevoTipoVinculacion;
	}

	public void setIsVisibilidadCeldaNuevoTipoVinculacion(Boolean isVisibilidadCeldaNuevoTipoVinculacion) {
		this.isVisibilidadCeldaNuevoTipoVinculacion = isVisibilidadCeldaNuevoTipoVinculacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoVinculacion() {
		return isVisibilidadCeldaDuplicarTipoVinculacion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoVinculacion(Boolean isVisibilidadCeldaDuplicarTipoVinculacion) {
		this.isVisibilidadCeldaDuplicarTipoVinculacion = isVisibilidadCeldaDuplicarTipoVinculacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoVinculacion() {
		return isVisibilidadCeldaCopiarTipoVinculacion;
	}

	public void setIsVisibilidadCeldaCopiarTipoVinculacion(Boolean isVisibilidadCeldaCopiarTipoVinculacion) {
		this.isVisibilidadCeldaCopiarTipoVinculacion = isVisibilidadCeldaCopiarTipoVinculacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoVinculacion() {
		return isVisibilidadCeldaVerFormTipoVinculacion;
	}

	public void setIsVisibilidadCeldaVerFormTipoVinculacion(Boolean isVisibilidadCeldaVerFormTipoVinculacion) {
		this.isVisibilidadCeldaVerFormTipoVinculacion = isVisibilidadCeldaVerFormTipoVinculacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoVinculacion() {
		return isVisibilidadCeldaOrdenTipoVinculacion;
	}

	public void setIsVisibilidadCeldaOrdenTipoVinculacion(Boolean isVisibilidadCeldaOrdenTipoVinculacion) {
		this.isVisibilidadCeldaOrdenTipoVinculacion = isVisibilidadCeldaOrdenTipoVinculacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoVinculacion() {
		return isVisibilidadCeldaNuevoRelacionesTipoVinculacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoVinculacion(Boolean isVisibilidadCeldaNuevoRelacionesTipoVinculacion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion = isVisibilidadCeldaNuevoRelacionesTipoVinculacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoVinculacion() {
		return isVisibilidadCeldaModificarTipoVinculacion;
	}

	public void setIsVisibilidadCeldaModificarTipoVinculacion(Boolean isVisibilidadCeldaModificarTipoVinculacion) {
		this.isVisibilidadCeldaModificarTipoVinculacion = isVisibilidadCeldaModificarTipoVinculacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoVinculacion() {
		return isVisibilidadCeldaActualizarTipoVinculacion;
	}

	public void setIsVisibilidadCeldaActualizarTipoVinculacion(Boolean isVisibilidadCeldaActualizarTipoVinculacion) {
		this.isVisibilidadCeldaActualizarTipoVinculacion = isVisibilidadCeldaActualizarTipoVinculacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoVinculacion() {
		return isVisibilidadCeldaEliminarTipoVinculacion;
	}

	public void setIsVisibilidadCeldaEliminarTipoVinculacion(Boolean isVisibilidadCeldaEliminarTipoVinculacion) {
		this.isVisibilidadCeldaEliminarTipoVinculacion = isVisibilidadCeldaEliminarTipoVinculacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoVinculacion() {
		return isVisibilidadCeldaCancelarTipoVinculacion;
	}

	public void setIsVisibilidadCeldaCancelarTipoVinculacion(Boolean isVisibilidadCeldaCancelarTipoVinculacion) {
		this.isVisibilidadCeldaCancelarTipoVinculacion = isVisibilidadCeldaCancelarTipoVinculacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoVinculacion() {
		return isVisibilidadCeldaGuardarTipoVinculacion;
	}

	public void setIsVisibilidadCeldaGuardarTipoVinculacion(Boolean isVisibilidadCeldaGuardarTipoVinculacion) {
		this.isVisibilidadCeldaGuardarTipoVinculacion = isVisibilidadCeldaGuardarTipoVinculacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoVinculacion() {
		return isVisibilidadCeldaGuardarCambiosTipoVinculacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoVinculacion(Boolean isVisibilidadCeldaGuardarCambiosTipoVinculacion) {
		this.isVisibilidadCeldaGuardarCambiosTipoVinculacion = isVisibilidadCeldaGuardarCambiosTipoVinculacion;
	}
		
	public TipoVinculacionSessionBean gettipovinculacionSessionBean() {
		return this.tipovinculacionSessionBean;
	}
	
	public void settipovinculacionSessionBean(TipoVinculacionSessionBean tipovinculacionSessionBean) {
		this.tipovinculacionSessionBean=tipovinculacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(TipoVinculacion tipovinculacion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipovinculacion,null);
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
	
	public void bugActualizarReferenciaActual(TipoVinculacion tipovinculacion,TipoVinculacion tipovinculacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoVinculacion(tipovinculacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipovinculacionAux.setId(tipovinculacion.getId());
		tipovinculacionAux.setVersionRow(tipovinculacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoVinculacion();
		
			int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipovinculacionValidator.getInvalidValues(this.tipovinculacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipovinculacionLogic.setDatosCliente(datosCliente);
			tipovinculacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipovinculacionAux=new  TipoVinculacion();
				
				tipovinculacionAux.setIsNew(true);
				tipovinculacionAux.setIsChanged(true);
				
				tipovinculacionAux.setTipoVinculacionOriginal(this.tipovinculacion);
				
				tipovinculacionAux.setId(this.tipovinculacion.getId());	
				tipovinculacionAux.setVersionRow(this.tipovinculacion.getVersionRow());	
				tipovinculacionAux.setid_empresa(this.tipovinculacion.getid_empresa());	
				tipovinculacionAux.setcodigo(this.tipovinculacion.getcodigo());	
				tipovinculacionAux.setnombre(this.tipovinculacion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovinculacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipovinculacionAux,tipovinculacionLogic.getTipoVinculacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovinculacionAux,tipovinculacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovinculacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovinculacionLogic.saveTipoVinculacions();//WithConnection
						//tipovinculacionLogic.getSetVersionRowTipoVinculacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovinculacion,tipovinculacionAux);
					
					this.refrescarForeignKeysDescripcionesTipoVinculacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas().addAll(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicas.addAll(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovinculacionLogic.saveTipoVinculacionRelaciones(tipovinculacionAux,this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas());//WithConnection
								//tipovinculacionLogic.getSetVersionRowTipoVinculacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipovinculacion,tipovinculacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.setInformacionEconomicas(new ArrayList<InformacionEconomica>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicas= new ArrayList<InformacionEconomica>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovinculacionAux.setInformacionEconomicas(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipovinculacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipovinculacionAux,tipovinculacionLogic.getTipoVinculacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipovinculacionAux,tipovinculacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipovinculacion,tipovinculacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipovinculacionAux=new  TipoVinculacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipovinculacionSessionBean.getEsGuardarRelacionado() && this.tipovinculacion.getId()>=0)) {
						
					tipovinculacionAux.setIsNew(false);
				}
				
				tipovinculacionAux.setIsDeleted(false);
			
				tipovinculacionAux.setId(this.tipovinculacion.getId());	
				tipovinculacionAux.setVersionRow(this.tipovinculacion.getVersionRow());	
				tipovinculacionAux.setid_empresa(this.tipovinculacion.getid_empresa());	
				tipovinculacionAux.setcodigo(this.tipovinculacion.getcodigo());	
				tipovinculacionAux.setnombre(this.tipovinculacion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovinculacionAux,tipovinculacionLogic.getTipoVinculacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovinculacionAux,tipovinculacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovinculacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovinculacionLogic.saveTipoVinculacions();//WithConnection
						//tipovinculacionLogic.getSetVersionRowTipoVinculacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovinculacion,tipovinculacionAux);
					
					this.refrescarForeignKeysDescripcionesTipoVinculacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas().addAll(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicas.addAll(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovinculacionLogic.saveTipoVinculacionRelaciones(tipovinculacionAux,this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas());//WithConnection
								//tipovinculacionLogic.getSetVersionRowTipoVinculacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipovinculacion,tipovinculacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.setInformacionEconomicas(new ArrayList<InformacionEconomica>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicas= new ArrayList<InformacionEconomica>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovinculacionAux.setInformacionEconomicas(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipovinculacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipovinculacionAux,tipovinculacionLogic.getTipoVinculacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipovinculacionAux,tipovinculacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipovinculacion,tipovinculacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipovinculacionAux=new  TipoVinculacion();
				
				tipovinculacionAux.setIsNew(false);
				tipovinculacionAux.setIsChanged(false);
				
				tipovinculacionAux.setIsDeleted(true);
				
				tipovinculacionAux.setId(this.tipovinculacion.getId());	
				tipovinculacionAux.setVersionRow(this.tipovinculacion.getVersionRow());	
				tipovinculacionAux.setid_empresa(this.tipovinculacion.getid_empresa());	
				tipovinculacionAux.setcodigo(this.tipovinculacion.getcodigo());	
				tipovinculacionAux.setnombre(this.tipovinculacion.getnombre());	
				
				if(this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipovinculacionAux.getId()>=0) {	
						this.tipovinculacionsEliminados.add(tipovinculacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipovinculacionAux,tipovinculacionLogic.getTipoVinculacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovinculacionAux,tipovinculacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovinculacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovinculacionLogic.saveTipoVinculacions();//WithConnection
						//tipovinculacionLogic.getSetVersionRowTipoVinculacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas().addAll(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicas.addAll(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovinculacionLogic.saveTipoVinculacionRelaciones(tipovinculacionAux,this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas());//WithConnection
								//tipovinculacionLogic.getSetVersionRowTipoVinculacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.setInformacionEconomicas(new ArrayList<InformacionEconomica>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicas= new ArrayList<InformacionEconomica>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovinculacionAux.setInformacionEconomicas(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipovinculacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipovinculacionAux,tipovinculacionLogic.getTipoVinculacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipovinculacionAux,tipovinculacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.getTipoVinculacions().addAll(this.tipovinculacionsEliminados);
					
					tipovinculacionLogic.saveTipoVinculacions();//WithConnection
					//tipovinculacionLogic.getSetVersionRowTipoVinculacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoVinculacion();
				
				this.tipovinculacionsEliminados= new ArrayList<TipoVinculacion>();		
			}
			
			if(this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Vinculacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipovinculacion=tipovinculacionAux;
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
      		//this.finishProcessTipoVinculacion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoVinculacion tipovinculacionLocal) throws Exception {
		
		if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipovinculacionLocal.setInformacionEconomicas(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas());
			
			} else {
			
				tipovinculacionLocal.setInformacionEconomicas(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoVinculacion tipovinculacionLocal) throws Exception {	
		if(this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipovinculacionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoVinculacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipovinculacionValidator.getInvalidValues(this.tipovinculacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoVinculacion tipovinculacion,List<TipoVinculacion> tipovinculacions) throws Exception {
		try	{		
			TipoVinculacionConstantesFunciones.actualizarLista(tipovinculacion,tipovinculacions,this.tipovinculacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoVinculacion tipovinculacion,List<TipoVinculacion> tipovinculacions) throws Exception {
		try	{			
			TipoVinculacionConstantesFunciones.actualizarSelectedLista(tipovinculacion,tipovinculacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoVinculacion> tipovinculacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipovinculacionsLocal=this.tipovinculacionLogic.getTipoVinculacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipovinculacionsLocal=this.tipovinculacions;
			}
			//ARCHITECTURE
		
			for(TipoVinculacion tipovinculacionLocal:tipovinculacionsLocal) {
				if(this.permiteMantenimiento(tipovinculacionLocal) && tipovinculacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoVinculacionConstantesFunciones.getTipoVinculacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoVinculacionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVinculacion.jLabelid_empresaTipoVinculacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoVinculacionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVinculacion.jLabelcodigoTipoVinculacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoVinculacionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVinculacion.jLabelnombreTipoVinculacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVinculacion.jLabelid_empresaTipoVinculacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVinculacion.jLabelcodigoTipoVinculacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVinculacion.jLabelnombreTipoVinculacion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("InformacionEconomica")) {
			if(this.tipovinculacion==null) {
				this.tipovinculacion= new TipoVinculacion();
			}

			if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoVinculacion
				this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);

				this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.getinformacioneconomica().setTipoVinculacion(this.tipovinculacion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoVinculacion--;	
		
		
		this.tipovinculacionAux=new TipoVinculacion();
		
		this.tipovinculacionAux.setId(this.iIdNuevoTipoVinculacion);
		this.tipovinculacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovinculacionLogic.getTipoVinculacions().add(this.tipovinculacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipovinculacions.add(this.tipovinculacionAux);
		}
		//ARCHITECTURE
		
		this.tipovinculacion=this.tipovinculacionAux;
		
		if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoVinculacion(this.tipovinculacion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVinculacion(this.tipovinculacion);
		}
				
		//this.setDefaultControlesTipoVinculacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoVinculacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoVinculacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVinculacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVinculacion(this.tipovinculacionBean,this.tipovinculacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoVinculacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
			classes=TipoVinculacionConstantesFunciones.getClassesRelationshipsOfTipoVinculacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipovinculacionReturnGeneral=tipovinculacionLogic.procesarEventosTipoVinculacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovinculacionLogic.getTipoVinculacions(),this.tipovinculacion,this.tipovinculacionParameterGeneral,this.isEsNuevoTipoVinculacion,classes);//this.tipovinculacionLogic.getTipoVinculacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoVinculacion(this.tipovinculacionReturnGeneral,this.tipovinculacionBean,false);
		
		if(this.tipovinculacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVinculacion(this.tipovinculacionReturnGeneral.getTipoVinculacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoVinculacion(this.tipovinculacionReturnGeneral.getTipoVinculacion());
		}
		
		if(this.tipovinculacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoVinculacion(this.tipovinculacionReturnGeneral.getTipoVinculacion(),classes);//this.tipovinculacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoVinculacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoVinculacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.RecargarFormTipoVinculacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoVinculacion(false);
						
			if(tipovinculacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.getEsGuardarRelacionado() && InformacionEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonInformacionEconomicaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVinculacion();
			}
			
			this.actualizarVisualTableDatosTipoVinculacion();
			
			this.jTableDatosTipoVinculacion.setRowSelectionInterval(this.getIndiceNuevoTipoVinculacion(), this.getIndiceNuevoTipoVinculacion());
			
			this.seleccionarFilaTablaTipoVinculacionActual();
						
			this.actualizarEstadoCeldasBotonesTipoVinculacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoVinculacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoVinculacion.jTextFieldcodigoTipoVinculacion.setEnabled(isHabilitar && this.tipovinculacionConstantesFunciones.activarcodigoTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jTextAreanombreTipoVinculacion.setEnabled(isHabilitar && this.tipovinculacionConstantesFunciones.activarnombreTipoVinculacion);	
		//
		this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setEnabled(isHabilitar && this.tipovinculacionConstantesFunciones.activarid_empresaTipoVinculacion);
	};
	
	public void setDefaultControlesTipoVinculacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoVinculacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipovinculacionSessionBean.setConGuardarRelaciones(true);			
			this.tipovinculacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipovinculacionSessionBean.setConGuardarRelaciones(false);			
			this.tipovinculacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoVinculacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
				if(tipovinculacionAux.getId().equals(this.iIdNuevoTipoVinculacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVinculacion tipovinculacionAux:this.tipovinculacions) {
				if(tipovinculacionAux.getId().equals(this.iIdNuevoTipoVinculacion)) {
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
	
	public int getIndiceActualTipoVinculacion(TipoVinculacion tipovinculacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
				if(tipovinculacionAux.getId().equals(tipovinculacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVinculacion tipovinculacionAux:this.tipovinculacions) {
				if(tipovinculacionAux.getId().equals(tipovinculacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoVinculacion(TipoVinculacion tipovinculacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
				if(tipovinculacionAux.getTipoVinculacionOriginal().getId().equals(tipovinculacionOriginal.getId())) {
					existe=true;
					tipovinculacionOriginal.setId(tipovinculacionAux.getId());
					tipovinculacionOriginal.setVersionRow(tipovinculacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVinculacion tipovinculacionAux:this.tipovinculacions) {
				if(tipovinculacionAux.getTipoVinculacionOriginal().getId().equals(tipovinculacionOriginal.getId())) {
					existe=true;
					tipovinculacionOriginal.setId(tipovinculacionAux.getId());
					tipovinculacionOriginal.setVersionRow(tipovinculacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoVinculacion(Boolean esParaCancelar) throws Exception {
		tipovinculacionsAux=new ArrayList<TipoVinculacion>();
		tipovinculacionAux=new TipoVinculacion();
		
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
					if(tipovinculacionAux.getId()<0) {
						tipovinculacionsAux.add(tipovinculacionAux);
					}		
				}
				this.iIdNuevoTipoVinculacion=0L;
				this.tipovinculacionLogic.getTipoVinculacions().removeAll(tipovinculacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVinculacion tipovinculacionAux:this.tipovinculacions) {
					if(tipovinculacionAux.getId()<0) {
						tipovinculacionsAux.add(tipovinculacionAux);
					}		
				}
				this.iIdNuevoTipoVinculacion=0L;
				this.tipovinculacions.removeAll(tipovinculacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoVinculacion 
					&& this.tipovinculacionLogic.getTipoVinculacions().size()>0
					) {
					tipovinculacionAux=this.tipovinculacionLogic.getTipoVinculacions().get(this.tipovinculacionLogic.getTipoVinculacions().size() - 1);
				
					if(tipovinculacionAux.getId()<0) {
						this.tipovinculacionLogic.getTipoVinculacions().remove(tipovinculacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoVinculacion && this.tipovinculacions.size()>0) {
					tipovinculacionAux=this.tipovinculacions.get(this.tipovinculacions.size() - 1);
				
					if(tipovinculacionAux.getId()<0) {
						this.tipovinculacions.remove(tipovinculacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoVinculacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipovinculacion.getId()<0) {
				this.tipovinculacionLogic.getTipoVinculacions().remove(this.tipovinculacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipovinculacion.getId()<0) {
				this.tipovinculacions.remove(this.tipovinculacion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoVinculacion(List<TipoVinculacion> tipovinculacionsAux) throws Exception {
		TipoVinculacionConstantesFunciones.setEstadosInicialesTipoVinculacion(tipovinculacionsAux);
	}
	
	public void setEstadosInicialesTipoVinculacion(TipoVinculacion tipovinculacionAux) throws Exception {
		TipoVinculacionConstantesFunciones.setEstadosInicialesTipoVinculacion(tipovinculacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoVinculacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoVinculacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoVinculacionActual()) {
				if(!this.isEsNuevoTipoVinculacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoVinculacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoVinculacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoVinculacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Vinculacion ?", "MANTENIMIENTO DE Tipo Vinculacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoVinculacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoVinculacion tipovinculacion) throws Exception {
		TipoVinculacionConstantesFunciones.seleccionarAsignar(this.tipovinculacion,tipovinculacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoVinculacion=this.isPermisoActualizarOriginalTipoVinculacion;
			
			
			this.seleccionarAsignar(tipovinculacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoVinculacionConstantesFunciones.quitarEspaciosTipoVinculacion(this.tipovinculacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoVinculacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipovinculacionSessionBean.setsFuncionBusquedaRapida(this.tipovinculacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoVinculacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoVinculacion(esParaCancelar);				
				this.cancelarNuevoTipoVinculacion(esParaCancelar);								
			}
			
			this.tipovinculacion=new TipoVinculacion();
			
			this.inicializarTipoVinculacion();
			
			this.actualizarEstadoCeldasBotonesTipoVinculacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoVinculacion() throws Exception {
		try {
			TipoVinculacionConstantesFunciones.inicializarTipoVinculacion(this.tipovinculacion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipovinculacionLogic.getTipoVinculacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoVinculacions(String sAccionBusqueda,List<TipoVinculacion> tipovinculacionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoVinculacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoVinculacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoVinculacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoVinculacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Vinculaciones");		
		parameters.put("busquedapor", TipoVinculacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(InformacionEconomica.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoVinculacionLogic tipovinculacionLogicAuxiliar=new TipoVinculacionLogic();
					tipovinculacionLogicAuxiliar.setDatosCliente(tipovinculacionLogic.getDatosCliente());				
					tipovinculacionLogicAuxiliar.setTipoVinculacions(tipovinculacionsParaReportes);
					
					tipovinculacionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoVinculacionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipovinculacionsParaReportes=tipovinculacionLogicAuxiliar.getTipoVinculacions();
					
					//tipovinculacionLogic.getNewConnexionToDeep();
					
					//for (TipoVinculacion tipovinculacion:tipovinculacionsParaReportes) {
					//	tipovinculacionLogic.deepLoad(tipovinculacion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipovinculacionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipovinculacionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileInformacionEconomica = AuxiliarReportes.class.getResourceAsStream("InformacionEconomicaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_informacioneconomica", reportFileInformacionEconomica);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoVinculacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoVinculacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoVinculacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoVinculacion=new JRBeanArrayDataSource(TipoVinculacionJInternalFrame.TraerTipoVinculacionBeans(tipovinculacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoVinculacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoVinculacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoVinculacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoVinculacionBean.TraerTipoVinculacionBeans(tipovinculacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoVinculacions(sAccionBusqueda,sTipoArchivoReporte,tipovinculacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoVinculacions(sAccionBusqueda,sTipoArchivoReporte,tipovinculacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoVinculacionActionPerformed(null);
					//this.generarExcelReporteTipoVinculacions(sAccionBusqueda,sTipoArchivoReporte,tipovinculacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoVinculacions(sAccionBusqueda,sTipoArchivoReporte,tipovinculacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoVinculacions(sAccionBusqueda,sTipoArchivoReporte,tipovinculacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoVinculacions(sAccionBusqueda,sTipoArchivoReporte,tipovinculacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoVinculacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVinculacion> tipovinculacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovinculacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVinculacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVinculacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoVinculacion tipovinculacion : tipovinculacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoVinculacionConstantesFunciones.generarExcelReporteDataTipoVinculacion("NORMAL",row,workbook,tipovinculacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoVinculacion(String sTipo,Row row,Workbook workbook) {
		
		TipoVinculacionConstantesFunciones.generarExcelReporteHeaderTipoVinculacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoVinculacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVinculacion> tipovinculacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovinculacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVinculacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoVinculacion tipovinculacion : tipovinculacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoVinculacionConstantesFunciones.getTipoVinculacionDescripcion(tipovinculacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovinculacion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVinculacionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovinculacion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVinculacionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovinculacion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoVinculacions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVinculacion> tipovinculacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoVinculacion> tipovinculacionsRespaldo=null;
		
		classes=TipoVinculacionConstantesFunciones.getClassesRelationshipsOfTipoVinculacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipovinculacionLogic.setDatosCliente(this.datosCliente);
		this.tipovinculacionLogic.setDatosDeep(this.datosDeep);
		this.tipovinculacionLogic.setIsConDeep(true);
		
		tipovinculacionsRespaldo=this.tipovinculacionLogic.getTipoVinculacions();
		
		this.tipovinculacionLogic.setTipoVinculacions(tipovinculacionsParaReportes);	
		this.tipovinculacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipovinculacionsParaReportes=this.tipovinculacionLogic.getTipoVinculacions();
		this.tipovinculacionLogic.setTipoVinculacions(tipovinculacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovinculacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVinculacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVinculacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoVinculacion tipovinculacion : tipovinculacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoVinculacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoVinculacionConstantesFunciones.generarExcelReporteDataTipoVinculacion("NORMAL",row,workbook,tipovinculacion,cellStyleDataAux);
		
			
			


				//InformacionEconomica
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipovinculacion.getInformacionEconomicas()!=null && tipovinculacion.getInformacionEconomicas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					InformacionEconomicaConstantesFunciones.generarExcelReporteHeaderInformacionEconomica("RELACIONADO",row,workbook);
				}

				if(tipovinculacion.getInformacionEconomicas()!=null) {
					i2=0;
					for(InformacionEconomica informacioneconomica : tipovinculacion.getInformacionEconomicas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						InformacionEconomicaConstantesFunciones.generarExcelReporteDataInformacionEconomica("RELACIONADO",row,workbook,informacioneconomica,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoVinculacionConstantesFunciones.getTipoVinculacionDescripcion(tipovinculacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVinculacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoVinculacion() throws Exception {		
		this.startProcessTipoVinculacion(true);
	}
	
	public void startProcessTipoVinculacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoVinculacion ,this.jPanelParametrosReportesTipoVinculacion, this.jScrollPanelDatosTipoVinculacion,this.jPanelPaginacionTipoVinculacion, this.jScrollPanelDatosEdicionTipoVinculacion, this.jPanelAccionesTipoVinculacion,this.jPanelAccionesFormularioTipoVinculacion,this.jmenuBarTipoVinculacion,this.jmenuBarDetalleTipoVinculacion,this.jTtoolBarTipoVinculacion,this.jTtoolBarDetalleTipoVinculacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVinculacion=this.jTabbedPaneBusquedasTipoVinculacion; 
		
		final JPanel jPanelParametrosReportesTipoVinculacion=this.jPanelParametrosReportesTipoVinculacion;
		//final JScrollPane jScrollPanelDatosTipoVinculacion=this.jScrollPanelDatosTipoVinculacion;
		final JTable jTableDatosTipoVinculacion=this.jTableDatosTipoVinculacion;		
		final JPanel jPanelPaginacionTipoVinculacion=this.jPanelPaginacionTipoVinculacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoVinculacion=this.jScrollPanelDatosEdicionTipoVinculacion;
		final JPanel jPanelAccionesTipoVinculacion=this.jPanelAccionesTipoVinculacion;
		
		JPanel jPanelCamposAuxiliarTipoVinculacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoVinculacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			jPanelCamposAuxiliarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jPanelCamposTipoVinculacion;
			jPanelAccionesFormularioAuxiliarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jPanelAccionesFormularioTipoVinculacion;
		}
		
		final JPanel jPanelCamposTipoVinculacion=jPanelCamposAuxiliarTipoVinculacion;
		final JPanel jPanelAccionesFormularioTipoVinculacion=jPanelAccionesFormularioAuxiliarTipoVinculacion;
		
		
		final JMenuBar jmenuBarTipoVinculacion=this.jmenuBarTipoVinculacion;
		final JToolBar jTtoolBarTipoVinculacion=this.jTtoolBarTipoVinculacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoVinculacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVinculacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			jmenuBarDetalleAuxiliarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jmenuBarDetalleTipoVinculacion;
			jTtoolBarDetalleAuxiliarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jTtoolBarDetalleTipoVinculacion;
		}
		
		final JMenuBar jmenuBarDetalleTipoVinculacion=jmenuBarDetalleAuxiliarTipoVinculacion;
		final JToolBar jTtoolBarDetalleTipoVinculacion=jTtoolBarDetalleAuxiliarTipoVinculacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVinculacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVinculacion;
			processRunnable.jTableDatos=jTableDatosTipoVinculacion;
			processRunnable.jPanelCampos=jPanelCamposTipoVinculacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVinculacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVinculacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVinculacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVinculacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVinculacion;
			processRunnable.jTtoolBar=jTtoolBarTipoVinculacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVinculacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVinculacion ,jPanelParametrosReportesTipoVinculacion,jTableDatosTipoVinculacion, /*jScrollPanelDatosTipoVinculacion,*/jPanelCamposTipoVinculacion,jPanelPaginacionTipoVinculacion, /*jScrollPanelDatosEdicionTipoVinculacion,*/ jPanelAccionesTipoVinculacion,jPanelAccionesFormularioTipoVinculacion,jmenuBarTipoVinculacion,jmenuBarDetalleTipoVinculacion,jTtoolBarTipoVinculacion,jTtoolBarDetalleTipoVinculacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVinculacion ,jPanelParametrosReportesTipoVinculacion, jScrollPanelDatosTipoVinculacion,jPanelPaginacionTipoVinculacion, jScrollPanelDatosEdicionTipoVinculacion, jPanelAccionesTipoVinculacion,jPanelAccionesFormularioTipoVinculacion,jmenuBarTipoVinculacion,jmenuBarDetalleTipoVinculacion,jTtoolBarTipoVinculacion,jTtoolBarDetalleTipoVinculacion);
						
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
	
	public void finishProcessTipoVinculacion() {// throws Exception 
		this.finishProcessTipoVinculacion(true);
	}
	
	public void finishProcessTipoVinculacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoVinculacion ,this.jPanelParametrosReportesTipoVinculacion, this.jScrollPanelDatosTipoVinculacion,this.jPanelPaginacionTipoVinculacion, this.jScrollPanelDatosEdicionTipoVinculacion, this.jPanelAccionesTipoVinculacion,this.jPanelAccionesFormularioTipoVinculacion,this.jmenuBarTipoVinculacion,this.jmenuBarDetalleTipoVinculacion,this.jTtoolBarTipoVinculacion,this.jTtoolBarDetalleTipoVinculacion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVinculacion=this.jTabbedPaneBusquedasTipoVinculacion; 
		
		final JPanel jPanelParametrosReportesTipoVinculacion=this.jPanelParametrosReportesTipoVinculacion;
		//final JScrollPane jScrollPanelDatosTipoVinculacion=this.jScrollPanelDatosTipoVinculacion;
		final JTable jTableDatosTipoVinculacion=this.jTableDatosTipoVinculacion;		
		final JPanel jPanelPaginacionTipoVinculacion=this.jPanelPaginacionTipoVinculacion;
		//final JScrollPane jScrollPanelDatosEdicionTipoVinculacion=this.jScrollPanelDatosEdicionTipoVinculacion;
		final JPanel jPanelAccionesTipoVinculacion=this.jPanelAccionesTipoVinculacion;
		
		JPanel jPanelCamposAuxiliarTipoVinculacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoVinculacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			jPanelCamposAuxiliarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jPanelCamposTipoVinculacion;
			jPanelAccionesFormularioAuxiliarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jPanelAccionesFormularioTipoVinculacion;
		}
		
		final JPanel jPanelCamposTipoVinculacion=jPanelCamposAuxiliarTipoVinculacion;
		final JPanel jPanelAccionesFormularioTipoVinculacion=jPanelAccionesFormularioAuxiliarTipoVinculacion;
		
		
		final JMenuBar jmenuBarTipoVinculacion=this.jmenuBarTipoVinculacion;		
		final JToolBar jTtoolBarTipoVinculacion=this.jTtoolBarTipoVinculacion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoVinculacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVinculacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			jmenuBarDetalleAuxiliarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jmenuBarDetalleTipoVinculacion;
			jTtoolBarDetalleAuxiliarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jTtoolBarDetalleTipoVinculacion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoVinculacion=jmenuBarDetalleAuxiliarTipoVinculacion;
		final JToolBar jTtoolBarDetalleTipoVinculacion=jTtoolBarDetalleAuxiliarTipoVinculacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVinculacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVinculacion;
			processRunnable.jTableDatos=jTableDatosTipoVinculacion;
			processRunnable.jPanelCampos=jPanelCamposTipoVinculacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVinculacion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVinculacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVinculacion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVinculacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVinculacion;
			processRunnable.jTtoolBar=jTtoolBarTipoVinculacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVinculacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoVinculacion ,jPanelParametrosReportesTipoVinculacion, jTableDatosTipoVinculacion,/*jScrollPanelDatosTipoVinculacion,*/jPanelCamposTipoVinculacion,jPanelPaginacionTipoVinculacion, /*jScrollPanelDatosEdicionTipoVinculacion,*/ jPanelAccionesTipoVinculacion,jPanelAccionesFormularioTipoVinculacion,jmenuBarTipoVinculacion,jmenuBarDetalleTipoVinculacion,jTtoolBarTipoVinculacion,jTtoolBarDetalleTipoVinculacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoVinculacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoVinculacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoVinculacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoVinculacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoVinculacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoVinculacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoVinculacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoVinculacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoVinculacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipovinculacionConstantesFunciones.getsFinalQueryTipoVinculacion();
		String  finalQueryPaginacionTodos=this.tipovinculacionConstantesFunciones.getsFinalQueryTipoVinculacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoVinculacionConstantesFunciones.getArrayColumnasGlobalesNoTipoVinculacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoVinculacionConstantesFunciones.getArrayColumnasGlobalesTipoVinculacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoVinculacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipovinculacionsEliminados= new ArrayList<TipoVinculacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoVinculacion();
		
				///*TipoVinculacionSessionBean*/this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
			
			if(this.tipovinculacionSessionBean==null) {
				this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
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
					this.iNumeroPaginacion=TipoVinculacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoVinculacionConstantesFunciones.getClassesForeignKeysOfTipoVinculacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipovinculacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipovinculacionsAux= new ArrayList<TipoVinculacion>();
			
				
			tipovinculacionLogic.setDatosCliente(this.datosCliente);
			tipovinculacionLogic.setDatosDeep(this.datosDeep);
			tipovinculacionLogic.setIsConDeep(true);
			
			
			tipovinculacionLogic.getTipoVinculacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipovinculacionLogic.getTodosTipoVinculacions(finalQueryGlobal,pagination);
					
					//tipovinculacionLogic.getTodosTipoVinculacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipovinculacionLogic.getTipoVinculacions()==null|| tipovinculacionLogic.getTipoVinculacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovinculacionsAux= new ArrayList<TipoVinculacion>();
							tipovinculacionsAux.addAll(tipovinculacionLogic.getTipoVinculacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovinculacionsAux= new ArrayList<TipoVinculacion>();
							tipovinculacionsAux.addAll(tipovinculacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovinculacionLogic.getTodosTipoVinculacions(finalQueryGlobal+"",this.pagination);												
							
							//tipovinculacionLogic.getTodosTipoVinculacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoVinculacions("Todos",tipovinculacionLogic.getTipoVinculacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovinculacionLogic.setTipoVinculacions(new ArrayList<TipoVinculacion>());					
							tipovinculacionLogic.getTipoVinculacions().addAll(tipovinculacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovinculacions=new ArrayList<TipoVinculacion>();
							tipovinculacions.addAll(tipovinculacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoVinculacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoVinculacion=this.idActual;
				
				} else if(this.idTipoVinculacionActual!=null && this.idTipoVinculacionActual!=0L) {
					idTipoVinculacion=idTipoVinculacionActual;
				}
				
					
				this.sDetalleReporte=TipoVinculacionConstantesFunciones.getDetalleIndicePorId(idTipoVinculacion);
				
				this.tipovinculacions=new ArrayList<TipoVinculacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipovinculacionLogic.getEntity(idTipoVinculacion);
					
					//tipovinculacionLogic.getEntityWithConnection(idTipoVinculacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovinculacionLogic.setTipoVinculacions(new ArrayList<TipoVinculacion>());
					tipovinculacionLogic.getTipoVinculacions().add(tipovinculacionLogic.getTipoVinculacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovinculacions=new ArrayList<TipoVinculacion>();
					this.tipovinculacions.add(tipovinculacion);
				}
				
				if(tipovinculacionLogic.getTipoVinculacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoVinculacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipovinculacionLogic.getTipoVinculacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoVinculacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoVinculacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipovinculacionLogic.getTipoVinculacions()==null||tipovinculacionLogic.getTipoVinculacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipovinculacions==null|| tipovinculacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovinculacionsAux=new ArrayList<TipoVinculacion>();
						tipovinculacionsAux.addAll(tipovinculacionLogic.getTipoVinculacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovinculacionsAux=new ArrayList<TipoVinculacion>();
							tipovinculacionsAux.addAll(tipovinculacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipovinculacionLogic.getTipoVinculacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoVinculacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoVinculacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoVinculacions("FK_IdEmpresa",tipovinculacionLogic.getTipoVinculacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoVinculacions("FK_IdEmpresa",tipovinculacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovinculacionLogic.setTipoVinculacions(new ArrayList<TipoVinculacion>());
						tipovinculacionLogic.getTipoVinculacions().addAll(tipovinculacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovinculacions=new ArrayList<TipoVinculacion>();
							tipovinculacions.addAll(tipovinculacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoVinculacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoVinculacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovinculacionLogic.getTipoVinculacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovinculacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovinculacionLogic.getTipoVinculacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovinculacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoVinculacion tipovinculacion) {
		Boolean permite=true;
		
		if(this.tipovinculacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoVinculacionConstantesFunciones.getOrderByListaTipoVinculacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoVinculacionConstantesFunciones.getOrderByListaTipoVinculacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVinculacion tipovinculacion:tipovinculacionLogic.getTipoVinculacions()) {
				if(tipovinculacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipovinculacionTotales=tipovinculacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVinculacion tipovinculacion:this.tipovinculacions) {
				if(tipovinculacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipovinculacionTotales=tipovinculacion;
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
			this.tipovinculacionAux=new TipoVinculacion();
			this.tipovinculacionAux.setsType(Constantes2.S_TOTALES);
			this.tipovinculacionAux.setIsNew(false);
			this.tipovinculacionAux.setIsChanged(false);
			this.tipovinculacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoVinculacionConstantesFunciones.TotalizarValoresFilaTipoVinculacion(this.tipovinculacionLogic.getTipoVinculacions(),this.tipovinculacionAux);
				
				this.tipovinculacionLogic.getTipoVinculacions().add(this.tipovinculacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoVinculacionConstantesFunciones.TotalizarValoresFilaTipoVinculacion(this.tipovinculacions,this.tipovinculacionAux);
				
				this.tipovinculacions.add(this.tipovinculacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipovinculacionTotales=new TipoVinculacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovinculacionLogic.getTipoVinculacions().remove(tipovinculacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovinculacions.remove(tipovinculacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipovinculacionTotales=new TipoVinculacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVinculacion tipovinculacion:tipovinculacionLogic.getTipoVinculacions()) {
				if(tipovinculacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipovinculacionTotales=tipovinculacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoVinculacionConstantesFunciones.TotalizarValoresFilaTipoVinculacion(this.tipovinculacionLogic.getTipoVinculacions(),tipovinculacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVinculacion tipovinculacion:this.tipovinculacions) {
				if(tipovinculacion.getsType().equals(Constantes2.S_TOTALES)) {
					tipovinculacionTotales=tipovinculacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoVinculacionConstantesFunciones.TotalizarValoresFilaTipoVinculacion(this.tipovinculacions,tipovinculacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoVinculacionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoVinculacionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovinculacionLogic.getTipoVinculacionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoVinculacion() {
		this.isPermisoTodoTipoVinculacion=false;
		this.isPermisoNuevoTipoVinculacion=false;
		this.isPermisoActualizarTipoVinculacion=false;
		this.isPermisoActualizarOriginalTipoVinculacion=false;
		this.isPermisoEliminarTipoVinculacion=false;
		this.isPermisoGuardarCambiosTipoVinculacion=false;
		this.isPermisoConsultaTipoVinculacion=false;
		this.isPermisoBusquedaTipoVinculacion=false;
		this.isPermisoReporteTipoVinculacion=false;		
		this.isPermisoOrdenTipoVinculacion=false;		
		this.isPermisoPaginacionMedioTipoVinculacion=false;		
		this.isPermisoPaginacionAltoTipoVinculacion=false;
		this.isPermisoPaginacionTodoTipoVinculacion=false;
		this.isPermisoCopiarTipoVinculacion=false;		
		this.isPermisoVerFormTipoVinculacion=false;		
		this.isPermisoDuplicarTipoVinculacion=false;		
		this.isPermisoOrdenTipoVinculacion=false;		
	}
	
	public void setPermisosUsuarioTipoVinculacion(Boolean isPermiso) {
		this.isPermisoTodoTipoVinculacion=isPermiso;
		this.isPermisoNuevoTipoVinculacion=isPermiso;
		this.isPermisoActualizarTipoVinculacion=isPermiso;
		this.isPermisoActualizarOriginalTipoVinculacion=isPermiso;
		this.isPermisoEliminarTipoVinculacion=isPermiso;
		this.isPermisoGuardarCambiosTipoVinculacion=isPermiso;
		this.isPermisoConsultaTipoVinculacion=isPermiso;
		this.isPermisoBusquedaTipoVinculacion=isPermiso;
		this.isPermisoReporteTipoVinculacion=isPermiso;
		this.isPermisoOrdenTipoVinculacion=isPermiso;		
		this.isPermisoPaginacionMedioTipoVinculacion=isPermiso;		
		this.isPermisoPaginacionAltoTipoVinculacion=isPermiso;		
		this.isPermisoPaginacionTodoTipoVinculacion=isPermiso;		
		this.isPermisoCopiarTipoVinculacion=isPermiso;		
		this.isPermisoVerFormTipoVinculacion=isPermiso;		
		this.isPermisoDuplicarTipoVinculacion=isPermiso;
		this.isPermisoOrdenTipoVinculacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoVinculacion(Boolean isPermiso) {
		//this.isPermisoTodoTipoVinculacion=isPermiso;
		this.isPermisoNuevoTipoVinculacion=isPermiso;
		this.isPermisoActualizarTipoVinculacion=isPermiso;
		this.isPermisoActualizarOriginalTipoVinculacion=isPermiso;
		this.isPermisoEliminarTipoVinculacion=isPermiso;
		this.isPermisoGuardarCambiosTipoVinculacion=isPermiso;
		//this.isPermisoConsultaTipoVinculacion=isPermiso;
		//this.isPermisoBusquedaTipoVinculacion=isPermiso;
		//this.isPermisoReporteTipoVinculacion=isPermiso;
		//this.isPermisoOrdenTipoVinculacion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoVinculacion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoVinculacion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoVinculacion=isPermiso;		
		//this.isPermisoCopiarTipoVinculacion=isPermiso;		
		//this.isPermisoDuplicarTipoVinculacion=isPermiso;
		//this.isPermisoOrdenTipoVinculacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoVinculacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(InformacionEconomicaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoVinculacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosInformacionEconomica=false;
		this.isTienePermisosInformacionEconomica=this.verificarGetPermisosUsuarioOpcionTipoVinculacionClaseRelacionada(this.opcionsRelacionadas,InformacionEconomicaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoVinculacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoVinculacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosInformacionEconomica=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoVinculacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoVinculacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoVinculacionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosInformacionEconomica && this.jInternalFrameDetalleFormTipoVinculacion!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.remove(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoVinculacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoVinculacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoVinculacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoVinculacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoVinculacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoVinculacion=this.isPermisoActualizarTipoVinculacion;
			this.isPermisoEliminarTipoVinculacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoVinculacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoVinculacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoVinculacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoVinculacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoVinculacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVinculacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoVinculacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoVinculacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoVinculacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoVinculacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoVinculacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoVinculacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVinculacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoVinculacion.setToolTipText(this.jTableDatosTipoVinculacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoVinculacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoVinculacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoVinculacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoVinculacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoVinculacion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosInformacionEconomica && this.tipovinculacionConstantesFunciones.mostrarInformacionEconomicaTipoVinculacion && !TipoVinculacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Informacion Economica");
			reporte.setsDescripcion("Informacion Economica");
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
	public void inicializarCombosForeignKeyTipoVinculacionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoVinculacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoVinculacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoVinculacionListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoVinculacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoVinculacionParameterReturnGeneral tipovinculacionReturnGeneral=new TipoVinculacionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipovinculacionConstantesFunciones.cargarid_empresaTipoVinculacion)
					 || (this.esRecargarFks && this.tipovinculacionConstantesFunciones.cargarid_empresaTipoVinculacion)) {

					if(!this.tipovinculacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipovinculacionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipovinculacionReturnGeneral=tipovinculacionLogic.cargarCombosLoteForeignKeyTipoVinculacion(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipovinculacionReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoVinculacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipovinculacionSessionBean==null) {
				this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
			}

			if(!this.tipovinculacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoVinculacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoVinculacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoVinculacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVinculacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoVinculacion(TipoVinculacion tipovinculacion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoVinculacion(TipoVinculacion tipovinculacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoVinculacion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVinculacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoVinculacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoVinculacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoVinculacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoVinculacion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoVinculacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoVinculacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion!=null && this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoVinculacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoVinculacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoVinculacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipovinculacionSessionBean=new TipoVinculacionSessionBean(); 
		this.tipovinculacionConstantesFunciones=new TipoVinculacionConstantesFunciones(); 
		this.tipovinculacionBean=new TipoVinculacion();//(this.tipovinculacionConstantesFunciones); 		
		this.tipovinculacionReturnGeneral=new TipoVinculacionParameterReturnGeneral(); 
		
		this.tipovinculacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovinculacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoVinculacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoVinculacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoVinculacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoVinculacion(true);
			
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
			
			this.tipovinculacionConstantesFunciones=new TipoVinculacionConstantesFunciones(); 
			this.tipovinculacionBean=new TipoVinculacion();//this.tipovinculacionConstantesFunciones); 			
			this.tipovinculacionReturnGeneral=new TipoVinculacionParameterReturnGeneral(); 
		
			TipoVinculacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Vinculacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipovinculacion=new TipoVinculacion();
			this.tipovinculacions = new ArrayList<TipoVinculacion>();
			this.tipovinculacionsAux = new ArrayList<TipoVinculacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic=new TipoVinculacionLogic();
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipovinculacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipovinculacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoVinculacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVinculacion);	
					}
					
					if(this.jInternalFrameImportacionTipoVinculacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVinculacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoVinculacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoVinculacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVinculacion);
				this.jInternalFrameDetalleFormTipoVinculacion.setVisible(false);
				this.jInternalFrameDetalleFormTipoVinculacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVinculacion);
					this.jInternalFrameReporteDinamicoTipoVinculacion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoVinculacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoVinculacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoVinculacion);
					this.jInternalFrameImportacionTipoVinculacion.setVisible(false);
					this.jInternalFrameImportacionTipoVinculacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoVinculacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoVinculacion);
					this.jInternalFrameOrderByTipoVinculacion.setVisible(false);
					this.jInternalFrameOrderByTipoVinculacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoVinculacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoVinculacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipovinculacionReturnGeneral=new TipoVinculacionParameterReturnGeneral();
			
			this.tipovinculacionParameterGeneral=new TipoVinculacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipovinculacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoVinculacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(InformacionEconomicaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoVinculacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovinculacionSessionBean.getEsGuardarRelacionado(),this.tipovinculacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoVinculacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovinculacionSessionBean.getEsGuardarRelacionado(),this.tipovinculacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoVinculacion=false;
			this.isVisibilidadCeldaDuplicarTipoVinculacion=true;
			this.isVisibilidadCeldaCopiarTipoVinculacion=true;
			this.isVisibilidadCeldaVerFormTipoVinculacion=true;
			this.isVisibilidadCeldaOrdenTipoVinculacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
			this.isVisibilidadCeldaModificarTipoVinculacion=false;
			this.isVisibilidadCeldaActualizarTipoVinculacion=false;
			this.isVisibilidadCeldaEliminarTipoVinculacion=false;
			this.isVisibilidadCeldaCancelarTipoVinculacion=false;
			this.isVisibilidadCeldaGuardarTipoVinculacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoVinculacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoVinculacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoVinculacion(false);
			
			this.setPermisosUsuarioTipoVinculacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipovinculacionSessionBean.getEsGuardarRelacionado() && this.tipovinculacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoVinculacionClasesRelacionadas();
			}
			
			if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoVinculacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoVinculacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoVinculacion();
			}
			
			if(!this.isPermisoBusquedaTipoVinculacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoVinculacion,this.isPermisoPaginacionMedioTipoVinculacion,this.isPermisoPaginacionTodoTipoVinculacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoVinculacionConstantesFunciones.getTiposSeleccionarTipoVinculacion());
				
				this.tiposColumnasSelect=TipoVinculacionConstantesFunciones.getTiposSeleccionarTipoVinculacion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoVinculacion();				
				//this.tiposRelacionesSelect=TipoVinculacionConstantesFunciones.getTiposRelacionesTipoVinculacion(true);
				
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
			//if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoVinculacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoVinculacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoVinculacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVinculacion() ;
			
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
			
			
			this.informacioneconomicaLogic=new InformacionEconomicaLogic(); 
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
				tipovinculacionImplementable= (TipoVinculacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoVinculacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipovinculacionImplementableHome= (TipoVinculacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoVinculacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipovinculacions= new ArrayList<TipoVinculacion>();
			this.tipovinculacionsEliminados= new ArrayList<TipoVinculacion>();
						
			this.isEsNuevoTipoVinculacion=false;
			this.esParaAccionDesdeFormularioTipoVinculacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoVinculacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoVinculacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoVinculacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoVinculacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoVinculacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoVinculacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoVinculacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoVinculacion();
			}
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoVinculacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoVinculacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoVinculacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoVinculacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoVinculacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoVinculacion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoVinculacion")) {
				iIndex=this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();	
				
				

				if(sTitle.equals("Informacion Economicas")) {
					if(!InformacionEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoVinculacion();

						this.cargarParteTabPanelRelacionadaInformacionEconomica(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoVinculacion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaInformacionEconomica(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoVinculacion.cargarSessionConBeanSwingJInternalFrameInformacionEconomica(false,true,iIndex);
		this.jButtonInformacionEconomicaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaInformacionEconomica();

		//this.jTabbedPaneRelacionesTipoVinculacion.updateUI();
		//this.jTabbedPaneRelacionesTipoVinculacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoVinculacion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("InformacionEconomica")) {
				int row=this.jTableDatosTipoVinculacion.getSelectedRow();
				jButtonInformacionEconomicaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Informacion Economica")) {

					if(this.isTienePermisosInformacionEconomica && this.tipovinculacionConstantesFunciones.mostrarInformacionEconomicaTipoVinculacion && !TipoVinculacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Informacion Economicas"+"("+InformacionEconomicaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Informacion Economicas");

						if(tipovinculacionConstantesFunciones.resaltarInformacionEconomicaTipoVinculacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipovinculacionConstantesFunciones.resaltarInformacionEconomicaTipoVinculacion);
						}

						jmenuItem.setEnabled(this.tipovinculacionConstantesFunciones.activarInformacionEconomicaTipoVinculacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"InformacionEconomica"));

						

						this.jInternalFrameDetalleFormTipoVinculacion.jmenuDetalleTipoVinculacion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoVinculacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoVinculacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoVinculacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoVinculacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoVinculacion();
		
		this.cargarCombosFrameForeignKeyTipoVinculacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoVinculacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoVinculacion();
		}
	}
	
	
	
	public void jButtonNuevoTipoVinculacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
			
			if(jTableDatosTipoVinculacion.getRowCount()>=1) {
				jTableDatosTipoVinculacion.removeRowSelectionInterval(0, jTableDatosTipoVinculacion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoVinculacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoVinculacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoVinculacion(true);			
			//this.tipovinculacion=new TipoVinculacion();
			//this.tipovinculacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVinculacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVinculacion() ;
			
			if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVinculacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipovinculacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);				
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
			if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoVinculacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoVinculacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoVinculacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoVinculacion.getSelectedRows().length;			
			}
			
			tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoVinculacion--;			
				//TipoVinculacion tipovinculacionAux= new TipoVinculacion();			
				//tipovinculacionAux.setId(this.iIdNuevoTipoVinculacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoVinculacion tipovinculacionOrigen=new TipoVinculacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoVinculacion tipovinculacionOrigen : tipovinculacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipovinculacionOrigen =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovinculacionOrigen =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoVinculacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipovinculacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoVinculacion(tipovinculacionOrigen,this.tipovinculacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovinculacionLogic.getTipoVinculacions().add(this.tipovinculacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovinculacions.add(this.tipovinculacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoVinculacion(false);
				
				this.jTableDatosTipoVinculacion.setRowSelectionInterval(this.getIndiceNuevoTipoVinculacion(), this.getIndiceNuevoTipoVinculacion());
				
				int iLastRow =  this.jTableDatosTipoVinculacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVinculacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVinculacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVinculacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();									
		
			TipoVinculacion tipovinculacionOrigen=new TipoVinculacion();
			TipoVinculacion tipovinculacionDestino=new TipoVinculacion();
				
			tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoVinculacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipovinculacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoVinculacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovinculacionOrigen =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovinculacionOrigen =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovinculacionDestino =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovinculacionDestino =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipovinculacionOrigen =tipovinculacionsSeleccionados.get(0);
				tipovinculacionDestino =tipovinculacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoVinculacion(tipovinculacionOrigen,tipovinculacionDestino,true,false);
				
				tipovinculacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovinculacionDestino,tipovinculacionLogic.getTipoVinculacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovinculacionDestino,tipovinculacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoVinculacion(false);
				
				//this.jTableDatosTipoVinculacion.setRowSelectionInterval(this.getIndiceNuevoTipoVinculacion(), this.getIndiceNuevoTipoVinculacion());
				
				int iLastRow =  this.jTableDatosTipoVinculacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVinculacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVinculacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVinculacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoVinculacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoVinculacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoVinculacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoVinculacion.setVisible(!isVisible);
			this.jPanelPaginacionTipoVinculacion.setVisible(!isVisible);
			this.jPanelAccionesTipoVinculacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoVinculacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoVinculacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoVinculacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoVinculacion();
			
			this.abrirFrameOrderByTipoVinculacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoVinculacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoVinculacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVinculacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoVinculacion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoVinculacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoVinculacion.setSize(this.jInternalFrameDetalleFormTipoVinculacion.iWidthFormulario,this.jInternalFrameDetalleFormTipoVinculacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoVinculacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoVinculacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoVinculacion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoVinculacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoVinculacion.jContentPaneDetalleTipoVinculacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoVinculacion.jContentPaneDetalleTipoVinculacion.getWidth(),TipoVinculacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoVinculacion.jContentPaneDetalleTipoVinculacion.getWidth(),TipoVinculacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoVinculacion.jContentPaneDetalleTipoVinculacion.getWidth(),TipoVinculacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(InformacionEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaInformacionEconomica();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoVinculacion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoVinculacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoVinculacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoVinculacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoVinculacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVinculacion,false,this);
				} else {
					this.jInternalFrameOrderByTipoVinculacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVinculacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoVinculacion);
				this.jInternalFrameOrderByTipoVinculacion.setVisible(false);
				this.jInternalFrameOrderByTipoVinculacion.setSelected(false);
				
				this.jInternalFrameOrderByTipoVinculacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVinculacion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoVinculacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoVinculacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoVinculacion==null) {
				
				this.jInternalFrameImportacionTipoVinculacion=new ImportacionJInternalFrame(TipoVinculacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVinculacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoVinculacion);
				this.jInternalFrameImportacionTipoVinculacion.setVisible(false);
				this.jInternalFrameImportacionTipoVinculacion.setSelected(false);


				this.jInternalFrameImportacionTipoVinculacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVinculacion"));
				this.jInternalFrameImportacionTipoVinculacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVinculacion"));
				this.jInternalFrameImportacionTipoVinculacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVinculacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoVinculacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoVinculacion==null) {
				this.jInternalFrameReporteDinamicoTipoVinculacion=new ReporteDinamicoJInternalFrame(TipoVinculacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVinculacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVinculacion);
				this.jInternalFrameReporteDinamicoTipoVinculacion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoVinculacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoVinculacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVinculacion"));
				this.jInternalFrameReporteDinamicoTipoVinculacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVinculacion"));
				this.jInternalFrameReporteDinamicoTipoVinculacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVinculacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVinculacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaInformacionEconomica() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.jScrollPanelDatosInformacionEconomica.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoVinculacion.jContentPaneDetalleTipoVinculacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.jScrollPanelDatosInformacionEconomica.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.jScrollPanelDatosInformacionEconomica.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.jScrollPanelDatosInformacionEconomica.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoVinculacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVinculacion);
			
	       	this.jInternalFrameDetalleFormTipoVinculacion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoVinculacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoVinculacion.dispose();
			//this.jInternalFrameDetalleFormTipoVinculacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoVinculacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoVinculacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoVinculacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoVinculacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoVinculacion.setVisible(true);
	        this.jInternalFrameImportacionTipoVinculacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoVinculacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoVinculacion.setVisible(true);
	        this.jInternalFrameOrderByTipoVinculacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoVinculacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoVinculacion.setVisible(false);
	        this.jInternalFrameOrderByTipoVinculacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoVinculacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoVinculacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoVinculacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoVinculacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoVinculacion.setVisible(false);
	        this.jInternalFrameImportacionTipoVinculacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoVinculacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoVinculacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoVinculacion(true);
			//this.isEsNuevoTipoVinculacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoVinculacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVinculacion(false) ;
			
			if(tipovinculacionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.getEsGuardarRelacionado() && InformacionEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonInformacionEconomicaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVinculacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVinculacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoVinculacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoVinculacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoVinculacion(true);
			//this.isEsNuevoTipoVinculacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipovinculacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoVinculacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoVinculacion(false) ;
			
			if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVinculacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVinculacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoVinculacion(false);
			
			//if(!this.isEsNuevoTipoVinculacion) {								
				int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
				
			}
			
			if(this.permiteMantenimiento(this.tipovinculacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoVinculacion=true;
					this.inicializarActualizarBindingTablaTipoVinculacion(false);
					this.isEsNuevoTipoVinculacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoVinculacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoVinculacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVinculacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVinculacion(false);
				
				this.habilitarDeshabilitarControlesTipoVinculacion(false);
			
												
				
				if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoVinculacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoVinculacionActionPerformed(evt,tipovinculacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoVinculacion(this.tipovinculacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoVinculacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipovinculacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipovinculacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				this.tipovinculacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				this.tipovinculacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipovinculacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoVinculacionModel) this.jTableDatosTipoVinculacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoVinculacion=true;
				this.inicializarActualizarBindingTablaTipoVinculacion(false);
				this.isEsNuevoTipoVinculacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVinculacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVinculacion(false);
				
				this.habilitarDeshabilitarControlesTipoVinculacion(false);
				
				
				
				if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoVinculacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoVinculacion.getRowCount()>=1) {
				jTableDatosTipoVinculacion.removeRowSelectionInterval(0, jTableDatosTipoVinculacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoVinculacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoVinculacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVinculacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVinculacion(false) ;
			
			this.isEsNuevoTipoVinculacion=false;
			
			if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoVinculacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoVinculacion(false);
				
				//SI ES MANUAL
				if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoVinculacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoVinculacion--;			
			//TipoVinculacion tipovinculacionAux= new TipoVinculacion();			
			//tipovinculacionAux.setId(this.iIdNuevoTipoVinculacion);
			
			if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoVinculacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
			
			this.tipovinculacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipovinculacionLogic.getTipoVinculacions().add(this.tipovinculacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipovinculacions.add(this.tipovinculacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoVinculacion(false);
			
			this.jTableDatosTipoVinculacion.setRowSelectionInterval(this.getIndiceNuevoTipoVinculacion(), this.getIndiceNuevoTipoVinculacion());
			
			int iLastRow =  this.jTableDatosTipoVinculacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoVinculacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoVinculacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoVinculacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoVinculacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVinculacion(false);
			
			//SI ES MANUAL
			if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVinculacion();
			}
			
			//this.abrirFrameTreeTipoVinculacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo VinculacionES ?", "MANTENIMIENTO DE Tipo Vinculacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoVinculacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoVinculacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipovinculacionReturnGeneral=tipovinculacionLogic.procesarImportacionTipoVinculacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipovinculacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoVinculacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoVinculacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoVinculacion.setFileImportacion(this.jInternalFrameImportacionTipoVinculacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoVinculacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoVinculacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoVinculacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoVinculacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		

		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoVinculacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoVinculacionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoVinculacions("Todos",tipovinculacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoVinculacionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoVinculacionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoVinculacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoVinculacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoVinculacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoVinculacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoVinculacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoVinculacionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoVinculacionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovinculacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoVinculacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoVinculacion tipovinculacion:tipovinculacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovinculacion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoVinculacionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoVinculacion tipovinculacion:tipovinculacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovinculacion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoVinculacionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoVinculacion tipovinculacion:tipovinculacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovinculacion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoVinculacion(row);				
			//	iRow++;
			//}				
			
			//for(TipoVinculacion tipovinculacionAux:tipovinculacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoVinculacion(tipovinculacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVinculacion(false);
			
			//SI ES MANUAL
			if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVinculacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVinculacion(false);
			
			//SI ES MANUAL
			if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVinculacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVinculacion(false);
			
			//SI ES MANUAL
			if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVinculacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoVinculacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoVinculacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoVinculacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoVinculacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoVinculacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoVinculacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoVinculacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoVinculacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoVinculacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoVinculacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoVinculacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoVinculacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoVinculacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoVinculacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVinculacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoVinculacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoVinculacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoVinculacion();
		
		this.inicializarActualizarBindingBotonesManualTipoVinculacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVinculacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVinculacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVinculacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVinculacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoVinculacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoVinculacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoVinculacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoVinculacion.jCheckBoxPostAccionNuevoTipoVinculacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoVinculacion.jCheckBoxPostAccionSinCerrarTipoVinculacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoVinculacion.jCheckBoxPostAccionSinMensajeTipoVinculacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoVinculacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoVinculacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoVinculacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
				this.jInternalFrameDetalleFormTipoVinculacion.jCheckBoxPostAccionNuevoTipoVinculacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoVinculacion.jCheckBoxPostAccionSinCerrarTipoVinculacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoVinculacion.jCheckBoxPostAccionSinMensajeTipoVinculacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoVinculacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoVinculacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoVinculacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoVinculacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoVinculacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoVinculacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoVinculacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoVinculacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoVinculacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoVinculacion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVinculacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoVinculacion() throws Exception {
		try	{
			if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVinculacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVinculacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVinculacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoVinculacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoVinculacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoVinculacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoVinculacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoVinculacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoVinculacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoVinculacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoVinculacion.addItem(reporte);
			}
			
			
			if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoVinculacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoVinculacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoVinculacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoVinculacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoVinculacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoVinculacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoVinculacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoVinculacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoVinculacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVinculacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVinculacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
				this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
				this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVinculacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVinculacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoVinculacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVinculacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVinculacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoVinculacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoVinculacion(Boolean esInicializar) throws Exception {				
		if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVinculacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoVinculacion() throws Exception {
		this.inicializarActualizarBindingTablaTipoVinculacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoVinculacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoVinculacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoVinculacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoVinculacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVinculacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoVinculacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoVinculacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoVinculacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipovinculacionLogic.getTipoVinculacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipovinculacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoVinculacion.setModel(new TipoVinculacionModel(this.tipovinculacionLogic.getTipoVinculacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoVinculacion.setModel(new TipoVinculacionModel(this.tipovinculacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoVinculacion!=null && this.jInternalFrameOrderByTipoVinculacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoVinculacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoVinculacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVinculacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoVinculacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO,tipovinculacionConstantesFunciones.resaltarSeleccionarTipoVinculacion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoVinculacionConstantesFunciones.SCLASSWEBTITULO,tipovinculacionConstantesFunciones.resaltarSeleccionarTipoVinculacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoVinculacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVinculacion,TipoVinculacionConstantesFunciones.LABEL_ID));

		if(this.tipovinculacionConstantesFunciones.mostraridTipoVinculacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVinculacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipovinculacionConstantesFunciones.resaltaridTipoVinculacion,this.tipovinculacionConstantesFunciones.activaridTipoVinculacion,this,true,"idTipoVinculacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovinculacionConstantesFunciones.resaltaridTipoVinculacion,this.tipovinculacionConstantesFunciones.activaridTipoVinculacion,this,true,"idTipoVinculacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVinculacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVinculacion,TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipovinculacionConstantesFunciones.mostrarid_empresaTipoVinculacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipovinculacionConstantesFunciones.resaltarid_empresaTipoVinculacion,this,this.tipovinculacionConstantesFunciones.activarid_empresaTipoVinculacion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipovinculacionConstantesFunciones.resaltarid_empresaTipoVinculacion,this,this.tipovinculacionConstantesFunciones.activarid_empresaTipoVinculacion,false,"id_empresaTipoVinculacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVinculacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVinculacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVinculacion,TipoVinculacionConstantesFunciones.LABEL_CODIGO));

		if(this.tipovinculacionConstantesFunciones.mostrarcodigoTipoVinculacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVinculacionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovinculacionConstantesFunciones.resaltarcodigoTipoVinculacion,this.tipovinculacionConstantesFunciones.activarcodigoTipoVinculacion,this,true,"codigoTipoVinculacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovinculacionConstantesFunciones.resaltarcodigoTipoVinculacion,this.tipovinculacionConstantesFunciones.activarcodigoTipoVinculacion,this,true,"codigoTipoVinculacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVinculacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVinculacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVinculacion,TipoVinculacionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipovinculacionConstantesFunciones.mostrarnombreTipoVinculacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVinculacionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovinculacionConstantesFunciones.resaltarnombreTipoVinculacion,this.tipovinculacionConstantesFunciones.activarnombreTipoVinculacion,this,true,"nombreTipoVinculacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovinculacionConstantesFunciones.resaltarnombreTipoVinculacion,this.tipovinculacionConstantesFunciones.activarnombreTipoVinculacion,this,true,"nombreTipoVinculacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVinculacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosInformacionEconomica && this.tipovinculacionConstantesFunciones.mostrarInformacionEconomicaTipoVinculacion && !TipoVinculacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Informacion Economicas");
				tableColumn.setHeaderValue("Informacion Economicas");
				tableColumn.setCellRenderer(new InformacionEconomicaTableCell(tipovinculacionConstantesFunciones.resaltarInformacionEconomicaTipoVinculacion,this,this.tipovinculacionConstantesFunciones.activarInformacionEconomicaTipoVinculacion));
				tableColumn.setCellEditor(new InformacionEconomicaTableCell(tipovinculacionConstantesFunciones.resaltarInformacionEconomicaTipoVinculacion,this,this.tipovinculacionConstantesFunciones.activarInformacionEconomicaTipoVinculacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoVinculacion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovinculacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovinculacionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVinculacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovinculacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovinculacionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVinculacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipovinculacionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipovinculacionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoVinculacion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoVinculacion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoVinculacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipovinculacionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoVinculacion.moveColumn(this.jTableDatosTipoVinculacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoVinculacion.moveColumn(this.jTableDatosTipoVinculacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipovinculacionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoVinculacion.moveColumn(this.jTableDatosTipoVinculacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoVinculacion.moveColumn(this.jTableDatosTipoVinculacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoVinculacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoVinculacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoVinculacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoVinculacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoVinculacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoVinculacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoVinculacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoVinculacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipovinculacionLogic.getTipoVinculacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipovinculacions.size()-1;
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
		//this.jTableDatosTipoVinculacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoVinculacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoVinculacion();
			
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
				
				//this.isEsNuevoTipoVinculacion=false;
					
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
				if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoVinculacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVinculacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVinculacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipovinculacion.getsType().equals("DUPLICADO")
				   || this.tipovinculacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoVinculacion=true;
				
				} else {
					this.isEsNuevoTipoVinculacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipovinculacion.getId()>=0 && !this.tipovinculacion.getIsNew()) {						
						this.isEsNuevoTipoVinculacion=false;
						
					} else {
						this.isEsNuevoTipoVinculacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoVinculacion(esRelaciones);						
				
				this.seleccionarTipoVinculacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipovinculacion.getId()<0) {
					this.isEsNuevoTipoVinculacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoVinculacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoVinculacion(evt,rowIndex);
				}	
				
				if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoVinculacion: " + this.dDif); 
					}
				}								
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoVinculacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipovinculacion)) {
					if(this.tipovinculacion.getId()>0) {
						this.tipovinculacion.setIsDeleted(true);
						
						this.tipovinculacionsEliminados.add(this.tipovinculacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovinculacionLogic.getTipoVinculacions().remove(this.tipovinculacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovinculacions.remove(this.tipovinculacion);				
					}
					
					
					((TipoVinculacionModel) this.jTableDatosTipoVinculacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVinculacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoVinculacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoVinculacion) {
			
			if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVinculacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVinculacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoVinculacion(this.tipovinculacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipovinculacionConstantesFunciones.cargarid_empresaTipoVinculacion || this.tipovinculacionConstantesFunciones.event_dependid_empresaTipoVinculacion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipovinculacion.getid_empresa());
									//this.inicializarActualizarBindingTipoVinculacion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipovinculacion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipovinculacion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipovinculacion.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoVinculacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoVinculacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVinculacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVinculacion(TipoVinculacion tipovinculacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoVinculacion(tipovinculacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVinculacion(TipoVinculacion tipovinculacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoVinculacion(tipovinculacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoVinculacion(tipovinculacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoVinculacion(tipovinculacion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoVinculacion(TipoVinculacion tipovinculacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.setText(tipovinculacion.getId().toString());
			this.jInternalFrameDetalleFormTipoVinculacion.jTextFieldcodigoTipoVinculacion.setText(tipovinculacion.getcodigo());
			this.jInternalFrameDetalleFormTipoVinculacion.jTextAreanombreTipoVinculacion.setText(tipovinculacion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoVinculacion tipovinculacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipovinculacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoVinculacion tipovinculacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipovinculacionLocal=this.tipovinculacion;
			} else {
				tipovinculacionLocal=this.tipovinculacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipovinculacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoVinculacion(tipovinculacionLocal,true);
					
					if(tipovinculacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipovinculacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipovinculacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoVinculacion(TipoVinculacion tipovinculacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVinculacion(tipovinculacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(tipovinculacion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVinculacion(TipoVinculacion tipovinculacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVinculacion(tipovinculacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVinculacion(TipoVinculacion tipovinculacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.getText()==null || this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.getText()=="" || this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.setText("0");
			}

			if(conColumnasBase) {tipovinculacion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVinculacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVinculacion.jLabelIdTipoVinculacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovinculacion.setcodigo(this.jInternalFrameDetalleFormTipoVinculacion.jTextFieldcodigoTipoVinculacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVinculacionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVinculacion.jLabelcodigoTipoVinculacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovinculacion.setnombre(this.jInternalFrameDetalleFormTipoVinculacion.jTextAreanombreTipoVinculacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVinculacionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVinculacion.jLabelnombreTipoVinculacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVinculacion(TipoVinculacion tipovinculacionBean,TipoVinculacion tipovinculacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoVinculacion(TipoVinculacion tipovinculacionOrigen,TipoVinculacion tipovinculacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovinculacionOrigen.getId()!=null && !tipovinculacionOrigen.getId().equals(0L))) {tipovinculacion.setId(tipovinculacionOrigen.getId());}}
			if(conDefault || (!conDefault && tipovinculacionOrigen.getcodigo()!=null && !tipovinculacionOrigen.getcodigo().equals(""))) {tipovinculacion.setcodigo(tipovinculacionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipovinculacionOrigen.getnombre()!=null && !tipovinculacionOrigen.getnombre().equals(""))) {tipovinculacion.setnombre(tipovinculacionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVinculacion(TipoVinculacion tipovinculacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.setText(tipovinculacion.getId().toString());
			this.jInternalFrameDetalleFormTipoVinculacion.jTextFieldcodigoTipoVinculacion.setText(tipovinculacion.getcodigo());
			this.jInternalFrameDetalleFormTipoVinculacion.jTextAreanombreTipoVinculacion.setText(tipovinculacion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVinculacion(TipoVinculacionBean tipovinculacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.setText(tipovinculacionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoVinculacion.jTextFieldcodigoTipoVinculacion.setText(tipovinculacionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoVinculacion.jTextAreanombreTipoVinculacion.setText(tipovinculacionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoVinculacion(TipoVinculacionParameterReturnGeneral tipovinculacionReturnGeneral,TipoVinculacionBean tipovinculacionBean,Boolean conDefault) throws Exception { 
		try {
			TipoVinculacion tipovinculacionLocal=new TipoVinculacion();
			
			tipovinculacionLocal=tipovinculacionReturnGeneral.getTipoVinculacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovinculacionLocal.getId()!=null && !tipovinculacionLocal.getId().equals(0L))) {tipovinculacionBean.setId(tipovinculacionLocal.getId());}}
			if(conDefault || (!conDefault && tipovinculacionLocal.getcodigo()!=null && !tipovinculacionLocal.getcodigo().equals(""))) {tipovinculacionBean.setcodigo(tipovinculacionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipovinculacionLocal.getnombre()!=null && !tipovinculacionLocal.getnombre().equals(""))) {tipovinculacionBean.setnombre(tipovinculacionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoVinculacionGenerico(Long idTipoVinculacionSeleccionado,JComboBox jComboBoxTipoVinculacion,List<TipoVinculacion> tipovinculacionsLocal)throws Exception {
		try {
			TipoVinculacion  tipovinculacionTemp=null;

			for(TipoVinculacion tipovinculacionAux:tipovinculacionsLocal) {
				if(tipovinculacionAux.getId()!=null && tipovinculacionAux.getId().equals(idTipoVinculacionSeleccionado)) {
					tipovinculacionTemp=tipovinculacionAux;
					break;
				}
			}

			jComboBoxTipoVinculacion.setSelectedItem(tipovinculacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoVinculacionGenerico(JComboBox jComboBoxTipoVinculacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoVinculacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVinculacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoVinculacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVinculacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVinculacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoVinculacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVinculacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoVinculacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoVinculacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoVinculacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("InformacionEconomica")) {
			jButtonInformacionEconomicaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovinculacion=(TipoVinculacion) tipovinculacionLogic.getTipoVinculacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovinculacion =(TipoVinculacion) tipovinculacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipovinculacion.getIsNew() && !tipovinculacion.getIsChanged() && !tipovinculacion.getIsDeleted()) {
				sDescripcion=tipovinculacion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipovinculacion.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoVinculacion tipovinculacionRow=new TipoVinculacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovinculacionRow=(TipoVinculacion) tipovinculacionLogic.getTipoVinculacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovinculacionRow=(TipoVinculacion) tipovinculacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonInformacionEconomicaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoVinculacion tipovinculacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoVinculacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovinculacion = (TipoVinculacion)this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipovinculacion = (TipoVinculacion)this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipovinculacion!=null) {
						this.tipovinculacion = tipovinculacion;
					} else {
						this.tipovinculacion = new TipoVinculacion();
					}
				}

				if(this.isTienePermisosInformacionEconomica && this.permiteMantenimiento(this.tipovinculacion)) {
					InformacionEconomicaBeanSwingJInternalFrame informacioneconomicaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFramePopup=new InformacionEconomicaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						informacioneconomicaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFramePopup;
					} else {
						informacioneconomicaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame;
					}

					List<TipoVinculacion> tipovinculacions=new ArrayList<TipoVinculacion>();
					tipovinculacions.add(this.tipovinculacion);
					if(!esRelacionado) {
						//informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.setConGuardarRelaciones(false);
						//informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					informacioneconomicaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoVinculacion.cargarInformacionEconomicaBeanSwingJInternalFrame(tipovinculacions,this.tipovinculacion,informacioneconomicaBeanSwingJInternalFrame,/*conInicializar,*/informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.getConGuardarRelaciones(),informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.getEsGuardarRelacionado());
					informacioneconomicaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						informacioneconomicaBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionEconomica("no_relacionado");

						informacioneconomicaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(InformacionEconomicaConstantesFunciones.ITAMANIOFILATABLA + (InformacionEconomicaConstantesFunciones.ITAMANIOFILATABLA/2));

						informacioneconomicaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoVinculacion=(TitledBorder)this.jScrollPanelDatosTipoVinculacion.getBorder();
						TitledBorder titledBorderInformacionEconomica=(TitledBorder)informacioneconomicaBeanSwingJInternalFrame.jScrollPanelDatosInformacionEconomica.getBorder();

						titledBorderInformacionEconomica.setTitle(titledBorderTipoVinculacion.getTitle() + " -> Informacion Economica");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,informacioneconomicaBeanSwingJInternalFrame);
						}

						informacioneconomicaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(informacioneconomicaBeanSwingJInternalFrame);

						informacioneconomicaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Informacion Economica",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoVinculacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoTipoVinculacion && this.isPermisoNuevoTipoVinculacion));			
			this.jButtonDuplicarTipoVinculacion.setVisible((this.isVisibilidadCeldaDuplicarTipoVinculacion && this.isPermisoDuplicarTipoVinculacion));			
			this.jButtonCopiarTipoVinculacion.setVisible((this.isVisibilidadCeldaCopiarTipoVinculacion && this.isPermisoCopiarTipoVinculacion));
			this.jButtonVerFormTipoVinculacion.setVisible((this.isVisibilidadCeldaVerFormTipoVinculacion && this.isPermisoVerFormTipoVinculacion));
			
			this.jButtonAbrirOrderByTipoVinculacion.setVisible((this.isVisibilidadCeldaOrdenTipoVinculacion && this.isPermisoOrdenTipoVinculacion));			
			
			this.jButtonNuevoRelacionesTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion && this.isPermisoNuevoTipoVinculacion));			
			this.jButtonNuevoGuardarCambiosTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoTipoVinculacion && this.isPermisoNuevoTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));
			
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarTipoVinculacion.setVisible((this.isVisibilidadCeldaModificarTipoVinculacion && this.isPermisoActualizarTipoVinculacion));	
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarTipoVinculacion.setVisible((this.isVisibilidadCeldaActualizarTipoVinculacion && this.isPermisoActualizarTipoVinculacion));	
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarTipoVinculacion.setVisible((this.isVisibilidadCeldaEliminarTipoVinculacion && this.isPermisoEliminarTipoVinculacion));
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarTipoVinculacion.setVisible(this.isVisibilidadCeldaCancelarTipoVinculacion);							
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosTipoVinculacion.setVisible((this.isVisibilidadCeldaGuardarTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoVinculacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoTipoVinculacion && this.isPermisoNuevoTipoVinculacion));						
			this.jButtonDuplicarToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaDuplicarTipoVinculacion && this.isPermisoDuplicarTipoVinculacion));						
			this.jButtonCopiarToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaCopiarTipoVinculacion && this.isPermisoCopiarTipoVinculacion));			
			this.jButtonVerFormToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaVerFormTipoVinculacion && this.isPermisoVerFormTipoVinculacion));			
			this.jButtonAbrirOrderByToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaOrdenTipoVinculacion && this.isPermisoOrdenTipoVinculacion));
			this.jButtonNuevoRelacionesToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion && this.isPermisoNuevoTipoVinculacion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoTipoVinculacion && this.isPermisoNuevoTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));			
			
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaModificarTipoVinculacion && this.isPermisoActualizarTipoVinculacion));	
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaActualizarTipoVinculacion  && this.isPermisoActualizarTipoVinculacion));	
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaEliminarTipoVinculacion && this.isPermisoEliminarTipoVinculacion));
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarToolBarTipoVinculacion.setVisible(this.isVisibilidadCeldaCancelarTipoVinculacion);				
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaGuardarTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoVinculacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoTipoVinculacion && this.isPermisoNuevoTipoVinculacion));			
			this.jMenuItemDuplicarTipoVinculacion.setVisible((this.isVisibilidadCeldaDuplicarTipoVinculacion && this.isPermisoDuplicarTipoVinculacion));			
			this.jMenuItemCopiarTipoVinculacion.setVisible((this.isVisibilidadCeldaCopiarTipoVinculacion && this.isPermisoCopiarTipoVinculacion));			
			this.jMenuItemVerFormTipoVinculacion.setVisible((this.isVisibilidadCeldaVerFormTipoVinculacion && this.isPermisoVerFormTipoVinculacion));			
			this.jMenuItemAbrirOrderByTipoVinculacion.setVisible((this.isVisibilidadCeldaOrdenTipoVinculacion && this.isPermisoOrdenTipoVinculacion));			
			//this.jMenuItemMostrarOcultarTipoVinculacion.setVisible((this.isVisibilidadCeldaOrdenTipoVinculacion && this.isPermisoOrdenTipoVinculacion));
			this.jMenuItemDetalleAbrirOrderByTipoVinculacion.setVisible((this.isVisibilidadCeldaOrdenTipoVinculacion && this.isPermisoOrdenTipoVinculacion));			
			//this.jMenuItemDetalleMostrarOcultarTipoVinculacion.setVisible((this.isVisibilidadCeldaOrdenTipoVinculacion && this.isPermisoOrdenTipoVinculacion));			
			this.jMenuItemNuevoRelacionesTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion && this.isPermisoNuevoTipoVinculacion));			
			this.jMenuItemNuevoGuardarCambiosTipoVinculacion.setVisible((this.isVisibilidadCeldaNuevoTipoVinculacion && this.isPermisoNuevoTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));									
			
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemModificarTipoVinculacion.setVisible((this.isVisibilidadCeldaModificarTipoVinculacion && this.isPermisoActualizarTipoVinculacion));	
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemActualizarTipoVinculacion.setVisible((this.isVisibilidadCeldaActualizarTipoVinculacion && this.isPermisoActualizarTipoVinculacion));	
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemEliminarTipoVinculacion.setVisible((this.isVisibilidadCeldaEliminarTipoVinculacion && this.isPermisoEliminarTipoVinculacion));
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemCancelarTipoVinculacion.setVisible(this.isVisibilidadCeldaCancelarTipoVinculacion);				
			}
			
			this.jMenuItemGuardarCambiosTipoVinculacion.setVisible((this.isVisibilidadCeldaGuardarTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));						
			this.jMenuItemGuardarCambiosTablaTipoVinculacion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoVinculacion=this.jButtonNuevoTipoVinculacion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoVinculacion=this.jButtonDuplicarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaCopiarTipoVinculacion=this.jButtonCopiarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaVerFormTipoVinculacion=this.jButtonVerFormTipoVinculacion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoVinculacion=this.jButtonAbrirOrderByTipoVinculacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=this.jButtonNuevoRelacionesTipoVinculacion.isVisible();
			this.isVisibilidadCeldaModificarTipoVinculacion=this.jButtonModificarTipoVinculacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			this.isVisibilidadCeldaActualizarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaGuardarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosTipoVinculacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=this.jButtonGuardarCambiosTablaTipoVinculacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoVinculacion=this.jButtonNuevoToolBarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=this.jButtonNuevoRelacionesToolBarTipoVinculacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			this.isVisibilidadCeldaModificarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarToolBarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarToolBarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarToolBarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarToolBarTipoVinculacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVinculacion=this.jButtonGuardarCambiosToolBarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=this.jButtonGuardarCambiosTablaToolBarTipoVinculacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoVinculacion=this.jMenuItemNuevoTipoVinculacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=this.jMenuItemNuevoRelacionesTipoVinculacion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			this.isVisibilidadCeldaModificarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemModificarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaActualizarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemActualizarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaEliminarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemEliminarTipoVinculacion.isVisible();
			this.isVisibilidadCeldaCancelarTipoVinculacion=this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemCancelarTipoVinculacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVinculacion=this.jMenuItemGuardarCambiosTipoVinculacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=this.jMenuItemGuardarCambiosTablaTipoVinculacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoVinculacion(Boolean esInicializar) {
		if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVinculacion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoVinculacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoVinculacion() {
		this.jButtonNuevoTipoVinculacion.setVisible(this.isPermisoNuevoTipoVinculacion);			
		this.jButtonDuplicarTipoVinculacion.setVisible(this.isPermisoDuplicarTipoVinculacion);			
		this.jButtonCopiarTipoVinculacion.setVisible(this.isPermisoCopiarTipoVinculacion);			
		this.jButtonVerFormTipoVinculacion.setVisible(this.isPermisoVerFormTipoVinculacion);			
		
		this.jButtonAbrirOrderByTipoVinculacion.setVisible(this.isPermisoOrdenTipoVinculacion);					
		
		this.jButtonNuevoRelacionesTipoVinculacion.setVisible(this.isPermisoNuevoTipoVinculacion);			
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarTipoVinculacion.setVisible(this.isPermisoActualizarTipoVinculacion);	
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarTipoVinculacion.setVisible(this.isPermisoActualizarTipoVinculacion);	
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarTipoVinculacion.setVisible(this.isPermisoEliminarTipoVinculacion);
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarTipoVinculacion.setVisible(this.isVisibilidadCeldaCancelarTipoVinculacion);						
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosTipoVinculacion.setVisible(this.isPermisoGuardarCambiosTipoVinculacion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoVinculacion.setVisible(this.isPermisoActualizarTipoVinculacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVinculacion() {
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarTipoVinculacion.setVisible(this.isPermisoActualizarTipoVinculacion);	
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarTipoVinculacion.setVisible(this.isPermisoActualizarTipoVinculacion);	
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarTipoVinculacion.setVisible(this.isPermisoEliminarTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarTipoVinculacion.setVisible(this.isVisibilidadCeldaCancelarTipoVinculacion);							
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosTipoVinculacion.setVisible((this.isVisibilidadCeldaGuardarTipoVinculacion && this.isPermisoGuardarCambiosTipoVinculacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoVinculacion() {
		if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoVinculacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoVinculacion() {
	}
	
	public void jTableDatosTipoVinculacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoVinculacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoVinculacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.gettipovinculacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovinculacion==null) {
						this.tipovinculacion = new TipoVinculacion();
					}

					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
				}

				if(this.tipovinculacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipovinculacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVinculacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoVinculacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoVinculacion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoVinculacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoVinculacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoVinculacion(this.gettipovinculacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipovinculacionLogic.getConnexion());

				if(this.tipovinculacion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipovinculacion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoVinculacion=(TitledBorder)this.jScrollPanelDatosTipoVinculacion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoVinculacion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoVinculacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.gettipovinculacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovinculacion==null) {
						this.tipovinculacion = new TipoVinculacion();
					}

					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
				}

				if(this.tipovinculacion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipovinculacion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVinculacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoVinculacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.gettipovinculacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovinculacion==null) {
						this.tipovinculacion = new TipoVinculacion();
					}

					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
				}

				if(this.tipovinculacion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipovinculacion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVinculacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoVinculacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.gettipovinculacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovinculacion==null) {
						this.tipovinculacion = new TipoVinculacion();
					}

					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);
				}

				if(this.tipovinculacion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipovinculacion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVinculacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoVinculacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoVinculacion(false,false);

			this.getTipoVinculacionsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoVinculacion(false);

			//if(TipoVinculacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoVinculacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovinculacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoVinculacion() {
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
			this.jInternalFrameDetalleFormTipoVinculacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoVinculacion.dispose();
			this.jInternalFrameDetalleFormTipoVinculacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
			this.jInternalFrameReporteDinamicoTipoVinculacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoVinculacion.dispose();
			this.jInternalFrameReporteDinamicoTipoVinculacion=null;
		}
		
		if(this.jInternalFrameImportacionTipoVinculacion!=null) {
			this.jInternalFrameImportacionTipoVinculacion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoVinculacion.dispose();
			this.jInternalFrameImportacionTipoVinculacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoVinculacion();
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoVinculacion")) {
				jButtonNuevoTipoVinculacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoVinculacion")) {
				jButtonDuplicarTipoVinculacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoVinculacion")) {
				jButtonCopiarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoVinculacion")) {
				jButtonVerFormTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoVinculacion")) {
				jButtonNuevoTipoVinculacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoVinculacion")) {
				jButtonDuplicarTipoVinculacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoVinculacion")) {
				jButtonNuevoTipoVinculacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoVinculacion")) {
				jButtonDuplicarTipoVinculacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoVinculacion")) {
				jButtonNuevoTipoVinculacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoVinculacion")) {
				jButtonNuevoTipoVinculacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoVinculacion")) {
				jButtonNuevoTipoVinculacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoVinculacion")) {
				jButtonModificarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoVinculacion")) {
				jButtonModificarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoVinculacion")) {
				jButtonModificarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoVinculacion")) {
				jButtonActualizarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoVinculacion")) {
				jButtonActualizarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoVinculacion")) {
				jButtonActualizarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoVinculacion")) {
				jButtonEliminarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoVinculacion")) {
				jButtonEliminarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoVinculacion")) {
				jButtonEliminarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoVinculacion")) {
				jButtonCancelarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoVinculacion")) {
				jButtonCancelarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoVinculacion")) {
				jButtonCancelarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoVinculacion")) {
				jButtonCerrarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoVinculacion")) {
				jButtonCerrarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoVinculacion")) {
				jButtonCerrarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoVinculacion")) {
				jButtonMostrarOcultarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoVinculacion")) {
				jButtonCancelarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoVinculacion")) {
				jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoVinculacion")) {
				jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoVinculacion")) {
				jButtonCopiarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoVinculacion")) {
				jButtonVerFormTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoVinculacion")) {
				jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoVinculacion")) {
				jButtonCopiarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoVinculacion")) {
				jButtonVerFormTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoVinculacion")) {
				jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoVinculacion")) {
				jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoVinculacion")) {
				jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoVinculacion")) {
				jButtonRecargarInformacionTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoVinculacion")) {
				jButtonRecargarInformacionTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoVinculacion")) {
				jButtonRecargarInformacionTipoVinculacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoVinculacion")) {
				jButtonAnterioresTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoVinculacion")) {
				jButtonAnterioresTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoVinculacion")) {
				jButtonAnterioresTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoVinculacion")) {
				jButtonSiguientesTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoVinculacion")) {
				jButtonSiguientesTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoVinculacion")) {
				jButtonSiguientesTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoVinculacion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoVinculacion")) {
				jButtonAbrirOrderByTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoVinculacion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoVinculacion")) {
				jButtonMostrarOcultarTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVinculacion")) {
				jButtonNuevoGuardarCambiosTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoVinculacion")) {
				jButtonNuevoGuardarCambiosTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoVinculacion")) {
				jButtonNuevoGuardarCambiosTipoVinculacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoVinculacion")) {
				jButtonCerrarReporteDinamicoTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoVinculacion")) {
				jButtonGenerarReporteDinamicoTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoVinculacion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoVinculacion")) {
				jButtonCerrarImportacionTipoVinculacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoVinculacion")) {
				
				jButtonGenerarImportacionTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoVinculacion")) {
				
				jButtonAbrirImportacionTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoVinculacion")) {
				jComboBoxTiposAccionesTipoVinculacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoVinculacion")) {
				jComboBoxTiposRelacionesTipoVinculacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoVinculacion")) {
				jComboBoxTiposAccionesTipoVinculacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoVinculacion")) {
				
				jComboBoxTiposSeleccionarTipoVinculacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoVinculacion")) {
				jTextFieldValorCampoGeneralTipoVinculacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoVinculacion")) {
				jButtonAbrirOrderByTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoVinculacion")) {
				jButtonAbrirOrderByTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoVinculacion")) {
				jButtonCerrarOrderByTipoVinculacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoVinculacionBusqueda")) {
				this.jButtonidTipoVinculacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoVinculacionUpdate")) {
				this.jButtonid_empresaTipoVinculacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoVinculacionBusqueda")) {
				this.jButtonid_empresaTipoVinculacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoVinculacionBusqueda")) {
				this.jButtoncodigoTipoVinculacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoVinculacionBusqueda")) {
				this.jButtonnombreTipoVinculacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoVinculacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVinculacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				


				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoVinculacion tipovinculacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipovinculacionLocal=this.tipovinculacion;
			} else {
				tipovinculacionLocal=this.tipovinculacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
							
				
				


				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVinculacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
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
			
			


			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVinculacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
								
						
				


				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
								
				
				


				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVinculacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVinculacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVinculacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
							
				
				


				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVinculacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
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
			
			


			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVinculacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
								
				
				


				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVinculacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVinculacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVinculacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoVinculacion")) {
					jCheckBoxSeleccionarTodosTipoVinculacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoVinculacion")) {
					jCheckBoxSeleccionadosTipoVinculacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoVinculacion")) {
					
				}
				
				


				
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
												
				
				


				
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVinculacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVinculacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
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
			
			


			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVinculacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovinculacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovinculacion);
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
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
				
				


				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVinculacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVinculacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVinculacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovinculacionAnterior =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoVinculacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoVinculacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoVinculacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipovinculacion =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipovinculacion =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipovinculacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoVinculacion")) {
				
				}
				
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoVinculacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoVinculacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoVinculacion")) {
			
			}
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoVinculacion();
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoVinculacion")) {
				jButtonNuevoTipoVinculacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoVinculacion")) {
				jButtonDuplicarTipoVinculacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoVinculacion")) {
				jButtonCopiarTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoVinculacion")) {
				jButtonVerFormTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoVinculacion")) {
				jButtonNuevoTipoVinculacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoVinculacion")) {
				jButtonModificarTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoVinculacion")) {
				jButtonActualizarTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoVinculacion")) {
				jButtonEliminarTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoVinculacion")) {
				jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoVinculacion")) {
				jButtonCancelarTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoVinculacion")) {
				jButtonCerrarTipoVinculacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoVinculacion")) {
				jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVinculacion")) {
				jButtonNuevoGuardarCambiosTipoVinculacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoVinculacion")) {
				jButtonAbrirOrderByTipoVinculacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoVinculacion")) {
				jButtonRecargarInformacionTipoVinculacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoVinculacion")) {
				jButtonAnterioresTipoVinculacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoVinculacion")) {
				jButtonSiguientesTipoVinculacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoVinculacionBusqueda")) {
				this.jButtonidTipoVinculacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoVinculacionUpdate")) {
				this.jButtonid_empresaTipoVinculacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoVinculacionBusqueda")) {
				this.jButtonid_empresaTipoVinculacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoVinculacionBusqueda")) {
				this.jButtoncodigoTipoVinculacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoVinculacionBusqueda")) {
				this.jButtonnombreTipoVinculacionBusquedaActionPerformed(evt);
			}
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoVinculacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoVinculacion")) {
				closingInternalFrameTipoVinculacion();
				
			} else if(sTipo.equals("jButtonCancelarTipoVinculacion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoVinculacion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoVinculacionBeanSwingJInternalFrame jInternalFrameParent=(TipoVinculacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVinculacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoVinculacionActionPerformed(null);
			}
			
			TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovinculacion,new Object(),this.tipovinculacionParameterGeneral,this.tipovinculacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoVinculacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoVinculacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoVinculacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipovinculacion)) {
			if(!esControlTabla) {
				if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);			
				}
				
				if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoVinculacion(this.tipovinculacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovinculacionReturnGeneral=tipovinculacionLogic.procesarEventosTipoVinculacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovinculacionLogic.getTipoVinculacions(),this.tipovinculacion,this.tipovinculacionParameterGeneral,this.isEsNuevoTipoVinculacion,classes);//this.tipovinculacionLogic.getTipoVinculacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoVinculacion(this.tipovinculacionReturnGeneral,this.tipovinculacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoVinculacion(classes,this.tipovinculacionReturnGeneral,this.tipovinculacionBean,false);
					}
						
					if(this.tipovinculacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoVinculacion(this.tipovinculacionReturnGeneral.getTipoVinculacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoVinculacion(this.tipovinculacionReturnGeneral.getTipoVinculacion());	
					}
						
					if(this.tipovinculacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoVinculacion(this.tipovinculacionReturnGeneral.getTipoVinculacion(),classes);//this.tipovinculacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoVinculacion(this.tipovinculacion,classes);//this.tipovinculacionBean);									
				}
			
				if(TipoVinculacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoVinculacion(this.tipovinculacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVinculacion(this.tipovinculacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipovinculacionAnterior!=null) {
						this.tipovinculacion=this.tipovinculacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovinculacionReturnGeneral=tipovinculacionLogic.procesarEventosTipoVinculacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovinculacionLogic.getTipoVinculacions(),this.tipovinculacion,this.tipovinculacionParameterGeneral,this.isEsNuevoTipoVinculacion,classes);//this.tipovinculacionLogic.getTipoVinculacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovinculacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovinculacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipovinculacionReturnGeneral.getTipoVinculacion(),tipovinculacionLogic.getTipoVinculacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipovinculacionReturnGeneral.getTipoVinculacion(),this.tipovinculacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoVinculacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoVinculacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoVinculacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoVinculacion() throws Exception {
		
		TipoVinculacionModel tipovinculacionModel=(TipoVinculacionModel)this.jTableDatosTipoVinculacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovinculacionModel.tipovinculacions=this.tipovinculacionLogic.getTipoVinculacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipovinculacionModel.tipovinculacions=this.tipovinculacions;
		}
		
		
		((TipoVinculacionModel) this.jTableDatosTipoVinculacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoVinculacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipovinculacionAnterior(),this.tipovinculacionLogic.getTipoVinculacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipovinculacionAnterior(),this.tipovinculacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoVinculacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoVinculacion(TipoVinculacion tipovinculacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionEconomica.class)) {
					this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.setInformacionEconomicas(tipovinculacion.getInformacionEconomicas());
					this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionEconomica(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
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
										
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovinculacion,new Object(),generalEntityParameterGeneral,this.tipovinculacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipovinculacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoVinculacionConstantesFunciones.getClassesRelationshipsOfTipoVinculacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoVinculacionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoVinculacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoVinculacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoVinculacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovinculacion,new Object(),generalEntityParameterGeneral,this.tipovinculacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoVinculacion(TipoVinculacionBean tipovinculacionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionEconomica.class)) {
					this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.setInformacionEconomicas(tipovinculacion.getInformacionEconomicas());
					this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionEconomica(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoVinculacion(ArrayList<Classe> classes,TipoVinculacionReturnGeneral tipovinculacionReturnGeneral,TipoVinculacionBean tipovinculacionBean,Boolean conDefault) throws Exception {
		
			this.tipovinculacionBean.setInformacionEconomicas(tipovinculacionReturnGeneral.getTipoVinculacion().getInformacionEconomicas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoVinculacion(TipoVinculacion tipovinculacion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionEconomica.class)) {
					tipovinculacion.setInformacionEconomicas(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaLogic.getInformacionEconomicas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipovinculacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoVinculacion = new TipoVinculacionDetalleFormJInternalFrame(jDesktopPane,this.tipovinculacionSessionBean.getConGuardarRelaciones(),this.tipovinculacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.setVisible(false);
		this.jInternalFrameDetalleFormTipoVinculacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoVinculacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoVinculacion.tipovinculacionLogic=this.tipovinculacionLogic;
		
		this.cargarCombosFrameForeignKeyTipoVinculacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVinculacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVinculacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoVinculacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoVinculacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoVinculacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVinculacion"));
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarTipoVinculacion.addActionListener(new ButtonActionListener(this,"ModificarTipoVinculacion"));

		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarToolBarTipoVinculacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVinculacion"));
					
		this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemModificarTipoVinculacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVinculacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarTipoVinculacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoVinculacion"));
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarToolBarTipoVinculacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVinculacion"));
						
		this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemActualizarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVinculacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarTipoVinculacion.addActionListener (new ButtonActionListener(this,"EliminarTipoVinculacion"));
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVinculacion"));
								
		this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemEliminarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVinculacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarTipoVinculacion.addActionListener (new ButtonActionListener(this,"CancelarTipoVinculacion"));
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVinculacion"));
					
		this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemCancelarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVinculacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemDetalleCerrarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVinculacion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVinculacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVinculacion"));
		
		
		
		this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVinculacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonidTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVinculacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonid_empresaTipoVinculacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoVinculacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonid_empresaTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoVinculacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtoncodigoTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVinculacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonnombreTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVinculacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVinculacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoVinculacion"));
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVinculacion"));
		}
		
		this.jTableDatosTipoVinculacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoVinculacion"));
		
		this.jTableDatosTipoVinculacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoVinculacion"));
		
		this.jButtonNuevoTipoVinculacion.addActionListener(new ButtonActionListener(this,"NuevoTipoVinculacion"));
		
		this.jButtonDuplicarTipoVinculacion.addActionListener(new ButtonActionListener(this,"DuplicarTipoVinculacion"));
		
		this.jButtonCopiarTipoVinculacion.addActionListener(new ButtonActionListener(this,"CopiarTipoVinculacion"));
		
		this.jButtonVerFormTipoVinculacion.addActionListener(new ButtonActionListener(this,"VerFormTipoVinculacion"));
		
		
		this.jButtonNuevoToolBarTipoVinculacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoVinculacion"));
			
		this.jButtonDuplicarToolBarTipoVinculacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoVinculacion"));
			
		this.jMenuItemNuevoTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoVinculacion"));
			
		this.jMenuItemDuplicarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoVinculacion"));		
		
		
		this.jButtonNuevoRelacionesTipoVinculacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoVinculacion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoVinculacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoVinculacion"));
			
		this.jMenuItemNuevoRelacionesTipoVinculacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoVinculacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarTipoVinculacion.addActionListener(new ButtonActionListener(this,"ModificarTipoVinculacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonModificarToolBarTipoVinculacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVinculacion"));
			
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemModificarTipoVinculacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVinculacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarTipoVinculacion.addActionListener (new ButtonActionListener(this,"ActualizarTipoVinculacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonActualizarToolBarTipoVinculacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVinculacion"));
				
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemActualizarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVinculacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarTipoVinculacion.addActionListener (new ButtonActionListener(this,"EliminarTipoVinculacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonEliminarToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVinculacion"));
						
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemEliminarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVinculacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarTipoVinculacion.addActionListener (new ButtonActionListener(this,"CancelarTipoVinculacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonCancelarToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVinculacion"));
			
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemCancelarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVinculacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoVinculacion"));		
		
		
		this.jButtonCerrarTipoVinculacion.addActionListener (new ButtonActionListener(this,"CerrarTipoVinculacion"));
		
		
		this.jButtonCerrarToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoVinculacion"));
			
		this.jMenuItemCerrarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoVinculacion"));
			
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jMenuItemDetalleCerrarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVinculacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosTipoVinculacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoVinculacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVinculacion"));
		}
		
		this.jButtonCopiarToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoVinculacion"));
			
		this.jButtonVerFormToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoVinculacion"));
		
		this.jMenuItemGuardarCambiosTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoVinculacion"));
			
		this.jMenuItemCopiarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoVinculacion"));		
		
		this.jMenuItemVerFormTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoVinculacion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoVinculacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVinculacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoVinculacion"));
			
		this.jMenuItemGuardarCambiosTablaTipoVinculacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVinculacion"));		
		
		
		
		this.jButtonRecargarInformacionTipoVinculacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoVinculacion"));
					
		this.jButtonRecargarInformacionToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoVinculacion"));
		
		this.jMenuItemRecargarInformacionTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoVinculacion"));		
		
		
		
		this.jButtonAnterioresTipoVinculacion.addActionListener (new ButtonActionListener(this,"AnterioresTipoVinculacion"));
		
		
		this.jButtonAnterioresToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoVinculacion"));
		
		this.jMenuItemAnterioresTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoVinculacion"));		
		
		
		this.jButtonSiguientesTipoVinculacion.addActionListener (new ButtonActionListener(this,"SiguientesTipoVinculacion"));
		
		
		this.jButtonSiguientesToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoVinculacion"));
			
		this.jMenuItemSiguientesTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoVinculacion"));
			
		this.jMenuItemAbrirOrderByTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoVinculacion"));
			
		this.jMenuItemMostrarOcultarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoVinculacion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoVinculacion"));
			
		this.jMenuItemDetalleMostarOcultarTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoVinculacion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoVinculacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoVinculacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoVinculacion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoVinculacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoVinculacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoVinculacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoVinculacion"));

		this.jCheckBoxSeleccionadosTipoVinculacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoVinculacion"));
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVinculacion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoVinculacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoVinculacion"));
			
		this.jComboBoxTiposAccionesTipoVinculacion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoVinculacion"));
					
		this.jComboBoxTiposSeleccionarTipoVinculacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoVinculacion"));
			
		this.jTextFieldValorCampoGeneralTipoVinculacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoVinculacion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonidTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVinculacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonid_empresaTipoVinculacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoVinculacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonid_empresaTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoVinculacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtoncodigoTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVinculacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonnombreTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVinculacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoVinculacion!=null) {
				this.jInternalFrameReporteDinamicoTipoVinculacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVinculacion"));
				this.jInternalFrameReporteDinamicoTipoVinculacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVinculacion"));
				this.jInternalFrameReporteDinamicoTipoVinculacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVinculacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoVinculacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVinculacion"));				
			//this.jButtonGenerarReporteDinamicoTipoVinculacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVinculacion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoVinculacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVinculacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoVinculacion!=null) {
				this.jInternalFrameImportacionTipoVinculacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVinculacion"));
				this.jInternalFrameImportacionTipoVinculacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVinculacion"));
				this.jInternalFrameImportacionTipoVinculacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVinculacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoVinculacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoVinculacion"));
			
			this.jButtonAbrirOrderByToolBarTipoVinculacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoVinculacion"));			
			
			if(this.jInternalFrameOrderByTipoVinculacion!=null) {
				this.jInternalFrameOrderByTipoVinculacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVinculacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVinculacion.jTabbedPaneRelacionesTipoVinculacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVinculacion"));
		
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
            		closingInternalFrameTipoVinculacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoVinculacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoVinculacion = (JInternalFrameBase)event.getSource();
	            	
	            TipoVinculacionBeanSwingJInternalFrame jInternalFrameParent=(TipoVinculacionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVinculacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoVinculacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoVinculacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoVinculacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoVinculacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoVinculacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVinculacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVinculacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVinculacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoVinculacion";
		inputMap = this.jButtonNuevoTipoVinculacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoVinculacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoVinculacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVinculacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVinculacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVinculacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoVinculacion";
		inputMap = this.jButtonNuevoRelacionesTipoVinculacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoVinculacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoVinculacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoVinculacion";
		inputMap = this.jButtonModificarTipoVinculacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoVinculacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoVinculacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoVinculacion";
		inputMap = this.jButtonActualizarTipoVinculacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoVinculacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoVinculacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoVinculacion";
		inputMap = this.jButtonEliminarTipoVinculacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoVinculacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoVinculacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoVinculacion";
		inputMap = this.jButtonCancelarTipoVinculacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoVinculacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoVinculacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoVinculacion";
		inputMap = this.jButtonCerrarTipoVinculacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoVinculacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoVinculacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoVinculacion";
		inputMap = this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosTipoVinculacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonGuardarCambiosTipoVinculacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoVinculacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoVinculacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoVinculacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoVinculacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoVinculacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoVinculacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoVinculacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoVinculacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoVinculacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonidTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVinculacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonid_empresaTipoVinculacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoVinculacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonid_empresaTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoVinculacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtoncodigoTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVinculacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVinculacion.jButtonnombreTipoVinculacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVinculacionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoVinculacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoVinculacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoVinculacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoVinculacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoVinculacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
					tipovinculacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVinculacion tipovinculacionAux:tipovinculacions) {
					tipovinculacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoVinculacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVinculacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
						tipovinculacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVinculacion tipovinculacionAux:tipovinculacions) {
						tipovinculacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVinculacion tipovinculacionAux:tipovinculacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVinculacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVinculacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVinculacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVinculacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoVinculacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVinculacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoVinculacion.getSelectedRows();
			
			TipoVinculacion tipovinculacionLocal=new TipoVinculacion();
			
			//this.seleccionarTodosTipoVinculacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovinculacionLocal =(TipoVinculacion) this.tipovinculacionLogic.getTipoVinculacions().toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipovinculacionLocal =(TipoVinculacion) this.tipovinculacions.toArray()[this.jTableDatosTipoVinculacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipovinculacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
						tipovinculacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVinculacion tipovinculacionAux:tipovinculacions) {
						tipovinculacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoVinculacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVinculacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVinculacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVinculacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoVinculacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoVinculacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoVinculacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoVinculacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoVinculacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVinculacion tipovinculacionAux:this.tipovinculacionLogic.getTipoVinculacions()) {
				
						if(sTipoSeleccionar.equals(TipoVinculacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovinculacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoVinculacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovinculacionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVinculacion tipovinculacionAux:tipovinculacions) {
					
						if(sTipoSeleccionar.equals(TipoVinculacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovinculacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoVinculacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovinculacionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVinculacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoVinculacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoVinculacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoVinculacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoVinculacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoVinculacion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoVinculacion(conSplash);
				
					this.generarReporteTipoVinculacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoVinculacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoVinculacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoVinculacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVinculacion();
				
				this.exportarTipoVinculacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoVinculacions();
				//this.importarTipoVinculacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVinculacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoVinculacionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Vinculacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoVinculacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoVinculacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoVinculacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoVinculacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoVinculacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoVinculacion(conSplash);
					
						//this.actualizarParametrosGeneralTipoVinculacion();
						
						this.generarReporteProcesoAccionTipoVinculacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoVinculacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo VinculacionES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Vinculacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoVinculacion();
				
						this.actualizarParametrosGeneralTipoVinculacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipovinculacionReturnGeneral=tipovinculacionLogic.procesarAccionTipoVinculacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipovinculacionLogic.getTipoVinculacions(),this.tipovinculacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoVinculacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoVinculacion();
					
					TipoVinculacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoVinculacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoVinculacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxTiposAccionesFormularioTipoVinculacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoVinculacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoVinculacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoVinculacion();
			
			if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		
			TipoVinculacion tipovinculacion=new TipoVinculacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoVinculacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoVinculacion.getSelectedItem();
			
			
			
			
			tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipovinculacionsSeleccionados.size()==1) {
				for(TipoVinculacion tipovinculacionAux:tipovinculacionsSeleccionados) {
					tipovinculacion=tipovinculacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Informacion Economica")) {
					jButtonInformacionEconomicaActionPerformed(null,rowIndex,true,false,tipovinculacion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoVinculacion();
			
      		//this.finishProcessTipoVinculacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoVinculacionReturnGeneral() throws Exception {
		if(this.tipovinculacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipovinculacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipovinculacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipovinculacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipovinculacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipovinculacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoVinculacion(false);
		}
		
		if(this.tipovinculacionReturnGeneral.getConRetornoLista() || this.tipovinculacionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipovinculacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovinculacionLogic.setTipoVinculacions(this.tipovinculacionReturnGeneral.getTipoVinculacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipovinculacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovinculacionLogic.setTipoVinculacion(this.tipovinculacionReturnGeneral.getTipoVinculacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoVinculacion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoVinculacion() throws Exception {
		
		
	}
	
	public ArrayList<TipoVinculacion> getTipoVinculacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoVinculacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoVinculacion tipovinculacionAux:tipovinculacionLogic.getTipoVinculacions()) {
					if(tipovinculacionAux.getIsSelected()) {
						tipovinculacionsSeleccionados.add(tipovinculacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVinculacion tipovinculacionAux:this.tipovinculacions) {
					if(tipovinculacionAux.getIsSelected()) {
						tipovinculacionsSeleccionados.add(tipovinculacionAux);				
					}
				}
			}
			
			if(tipovinculacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipovinculacionsSeleccionados.addAll(this.tipovinculacionLogic.getTipoVinculacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipovinculacionsSeleccionados.addAll(this.tipovinculacions);				
					}
				}
			}
		} else {
			tipovinculacionsSeleccionados.add(this.tipovinculacion);
		}
		
		return tipovinculacionsSeleccionados;
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
	
	public void generarReporteTipoVinculacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoVinculacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoVinculacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoVinculacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoVinculacionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoVinculacionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Vinculacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoVinculacionsSeleccionados() throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoVinculacions("Todos",tipovinculacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoVinculacionsSeleccionados() throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoVinculacions("Todos",tipovinculacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoVinculacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoVinculacions("Todos",tipovinculacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoVinculacionsSeleccionados() throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoVinculacion();
		
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoVinculacion();
		
		
		//this.generarReporteTipoVinculacions("Todos",tipovinculacionsSeleccionados ,tipovinculacionImplementable,tipovinculacionImplementableHome);
	}
	
	public void mostrarImportacionTipoVinculacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoVinculacion();
		
		this.abrirFrameImportacionTipoVinculacion();		
		
			
		//this.generarReporteTipoVinculacions("Todos",tipovinculacionsSeleccionados ,tipovinculacionImplementable,tipovinculacionImplementableHome);
	}
	
	public void importarTipoVinculacions() throws Exception {		
	
	}
	
	public void exportarTipoVinculacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoVinculacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoVinculacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoVinculacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Vinculacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoVinculacionsSeleccionados() throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovinculacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoVinculacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoVinculacion tipovinculacionAux:tipovinculacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoVinculacion(tipovinculacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipovinculacionAux.setsDetalleGeneralEntityReporte(tipovinculacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoVinculacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoVinculacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVinculacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVinculacionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVinculacionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoVinculacion(TipoVinculacion tipovinculacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipovinculacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovinculacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovinculacion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovinculacion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovinculacion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoVinculacionsSeleccionados() throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovinculacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoVinculacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoVinculacion(row);				
				iRow++;
			}				
			
			for(TipoVinculacion tipovinculacionAux:tipovinculacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoVinculacion(tipovinculacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoVinculacionsSeleccionados() throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();		
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovinculacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipovinculacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipovinculacion");
			//elementRoot.appendChild(element);
		
			for(TipoVinculacion tipovinculacionAux:tipovinculacionsSeleccionados) {
				element = document.createElement("tipovinculacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoVinculacion(tipovinculacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vinculacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoVinculacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVinculacionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoVinculacion(TipoVinculacion tipovinculacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipovinculacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovinculacion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovinculacion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovinculacion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoVinculacion(TipoVinculacion tipovinculacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoVinculacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipovinculacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoVinculacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipovinculacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoVinculacionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipovinculacion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoVinculacionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipovinculacion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoVinculacionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipovinculacion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoVinculacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoVinculacion> tipovinculacionsSeleccionados=new ArrayList<TipoVinculacion>();
		
		tipovinculacionsSeleccionados=this.getTipoVinculacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoVinculacion(tipovinculacionsSeleccionados);
		
		this.generarReporteTipoVinculacions("Todos",tipovinculacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoVinculacion(ArrayList<TipoVinculacion> tipovinculacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoVinculacion tipovinculacionAux:tipovinculacionsSeleccionados) {
				tipovinculacionAux.setsDetalleGeneralEntityReporte(tipovinculacionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoVinculacionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipovinculacionAux.setsDescripcionGeneralEntityReporte1(tipovinculacionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoVinculacionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipovinculacionAux.setsDescripcionGeneralEntityReporte1(tipovinculacionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoVinculacionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipovinculacionAux.setsDescripcionGeneralEntityReporte1(tipovinculacionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVinculacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoVinculacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoVinculacion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoVinculacion=false;
			this.isVisibilidadCeldaActualizarTipoVinculacion=false;
			this.isVisibilidadCeldaEliminarTipoVinculacion=false;
			this.isVisibilidadCeldaCancelarTipoVinculacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVinculacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoVinculacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;
			this.isVisibilidadCeldaModificarTipoVinculacion=false;
			this.isVisibilidadCeldaActualizarTipoVinculacion=true;
			this.isVisibilidadCeldaEliminarTipoVinculacion=false;
			this.isVisibilidadCeldaCancelarTipoVinculacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVinculacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoVinculacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;
			this.isVisibilidadCeldaModificarTipoVinculacion=false;
			this.isVisibilidadCeldaActualizarTipoVinculacion=true;
			this.isVisibilidadCeldaEliminarTipoVinculacion=true;
			this.isVisibilidadCeldaCancelarTipoVinculacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVinculacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoVinculacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;
			this.isVisibilidadCeldaModificarTipoVinculacion=false;
			this.isVisibilidadCeldaActualizarTipoVinculacion=true;
			this.isVisibilidadCeldaEliminarTipoVinculacion=false;
			this.isVisibilidadCeldaCancelarTipoVinculacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoVinculacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=true;
			this.isVisibilidadCeldaModificarTipoVinculacion=false;
			this.isVisibilidadCeldaActualizarTipoVinculacion=false;
			this.isVisibilidadCeldaEliminarTipoVinculacion=false;
			this.isVisibilidadCeldaCancelarTipoVinculacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVinculacion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoVinculacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;
			this.isVisibilidadCeldaActualizarTipoVinculacion=false;
			this.isVisibilidadCeldaEliminarTipoVinculacion=false;
			this.isVisibilidadCeldaCancelarTipoVinculacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoVinculacion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;
			this.isVisibilidadCeldaModificarTipoVinculacion=true;
			this.isVisibilidadCeldaActualizarTipoVinculacion=false;
			this.isVisibilidadCeldaEliminarTipoVinculacion=false;
			this.isVisibilidadCeldaCancelarTipoVinculacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVinculacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoVinculacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoVinculacion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=true;
		} else {
			this.actualizarEstadoPanelsTipoVinculacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoVinculacion=false;
			//this.isVisibilidadCeldaVerFormTipoVinculacion=false;
			this.isVisibilidadCeldaDuplicarTipoVinculacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipovinculacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoVinculacion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			if(!tipovinculacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;												
			}
			
			this.jButtonCerrarTipoVinculacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVinculacion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipovinculacion)) {
			this.isVisibilidadCeldaActualizarTipoVinculacion=false;
			this.isVisibilidadCeldaEliminarTipoVinculacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVinculacion() {
		this.isVisibilidadCeldaNuevoTipoVinculacion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoVinculacion=false;
	}
	
	public void actualizarEstadoPanelsTipoVinculacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoVinculacion!=null) {
				this.jScrollPanelDatosEdicionTipoVinculacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVinculacion!=null) {
				this.jScrollPanelDatosTipoVinculacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVinculacion!=null) {
				this.jPanelPaginacionTipoVinculacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoVinculacion!=null) {
				this.jScrollPanelDatosEdicionTipoVinculacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoVinculacion!=null) {
				this.jScrollPanelDatosTipoVinculacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVinculacion!=null) {
				this.jPanelPaginacionTipoVinculacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoVinculacion!=null) {
				this.jScrollPanelDatosEdicionTipoVinculacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVinculacion!=null) {
				this.jScrollPanelDatosTipoVinculacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVinculacion!=null) {
				this.jPanelPaginacionTipoVinculacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoVinculacion!=null) {
				this.jScrollPanelDatosEdicionTipoVinculacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVinculacion!=null) {
				this.jScrollPanelDatosTipoVinculacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVinculacion!=null) {
				this.jPanelPaginacionTipoVinculacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoVinculacion!=null) {
				this.jScrollPanelDatosEdicionTipoVinculacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVinculacion!=null) {
				this.jScrollPanelDatosTipoVinculacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVinculacion!=null) {
				this.jPanelPaginacionTipoVinculacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoVinculacion!=null) {
				this.jScrollPanelDatosEdicionTipoVinculacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVinculacion!=null) {
				this.jScrollPanelDatosTipoVinculacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVinculacion!=null) {
				this.jPanelPaginacionTipoVinculacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoVinculacion!=null) {
				this.jScrollPanelDatosEdicionTipoVinculacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVinculacion!=null) {
				this.jScrollPanelDatosTipoVinculacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVinculacion!=null) {
				this.jPanelPaginacionTipoVinculacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
					this.jTabbedPaneBusquedasTipoVinculacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipovinculacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVinculacion!=null) {
				this.jTabbedPaneBusquedasTipoVinculacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoVinculacion!=null) {
				this.jPanelParametrosReportesTipoVinculacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoVinculacionParaInformacionEconomicas() throws Exception {
		Boolean isPaginaPopupInformacionEconomica=false;

		try {

			if(this.tipovinculacionSessionBean==null) {
				this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean.setsPathNavegacionActual(tipovinculacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupInformacionEconomica=this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeInformacionEconomica(false);
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionEconomica(TipoVinculacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean.setisBusquedaDesdeForeignKeySesionTipoVinculacion(true);
			this.jInternalFrameDetalleFormTipoVinculacion.informacioneconomicaSessionBean.setlidTipoVinculacionActual(this.idTipoVinculacionActual);

			tipovinculacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoVinculacion(true);
			tipovinculacionSessionBean.setlIdTipoVinculacionActualForeignKey(this.idTipoVinculacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoVinculacionSessionBean tipovinculacionSessionBean=new TipoVinculacionSessionBean();
		
		if(this.tipovinculacionSessionBean==null) {
			this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
		}
		
		this.tipovinculacionSessionBean.setsUltimaBusquedaTipoVinculacion(this.getsAccionBusqueda());
		this.tipovinculacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipovinculacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipovinculacionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoVinculacionSessionBean tipovinculacionSessionBean=new TipoVinculacionSessionBean();
		
		if(this.tipovinculacionSessionBean==null) {
			this.tipovinculacionSessionBean=new TipoVinculacionSessionBean();
		}
		
		if(this.tipovinculacionSessionBean.getsUltimaBusquedaTipoVinculacion()!=null&&!this.tipovinculacionSessionBean.getsUltimaBusquedaTipoVinculacion().equals("")) {
			this.setsAccionBusqueda(tipovinculacionSessionBean.getsUltimaBusquedaTipoVinculacion());
			this.setiNumeroPaginacion(tipovinculacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipovinculacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipovinculacionSessionBean.getid_empresa());
				tipovinculacionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipovinculacionSessionBean.setsUltimaBusquedaTipoVinculacion("");
		this.tipovinculacionSessionBean.setiNumeroPaginacion(TipoVinculacionConstantesFunciones.INUMEROPAGINACION);
		this.tipovinculacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoVinculacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoVinculacion() {
		this.updateBorderResaltarBusquedasFormularioTipoVinculacion();
		this.updateVisibilidadBusquedasFormularioTipoVinculacion();
		this.updateHabilitarBusquedasFormularioTipoVinculacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoVinculacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoVinculacion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoVinculacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoVinculacion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoVinculacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoVinculacion.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoVinculacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoVinculacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoVinculacion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoVinculacion();
		this.updateVisibilidadResaltarControlesFormularioTipoVinculacion();
		this.updateHabilitarResaltarControlesFormularioTipoVinculacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoVinculacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipovinculacionConstantesFunciones.resaltaridTipoVinculacion!=null && this.jInternalFrameDetalleFormTipoVinculacion!=null) {this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.setBorder(this.tipovinculacionConstantesFunciones.resaltaridTipoVinculacion);}
		if(this.tipovinculacionConstantesFunciones.resaltarid_empresaTipoVinculacion!=null && this.jInternalFrameDetalleFormTipoVinculacion!=null) {this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setBorder(this.tipovinculacionConstantesFunciones.resaltarid_empresaTipoVinculacion);}
		if(this.tipovinculacionConstantesFunciones.resaltarcodigoTipoVinculacion!=null && this.jInternalFrameDetalleFormTipoVinculacion!=null) {this.jInternalFrameDetalleFormTipoVinculacion.jTextFieldcodigoTipoVinculacion.setBorder(this.tipovinculacionConstantesFunciones.resaltarcodigoTipoVinculacion);}
		if(this.tipovinculacionConstantesFunciones.resaltarnombreTipoVinculacion!=null && this.jInternalFrameDetalleFormTipoVinculacion!=null) {this.jInternalFrameDetalleFormTipoVinculacion.jTextAreanombreTipoVinculacion.setBorder(this.tipovinculacionConstantesFunciones.resaltarnombreTipoVinculacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoVinculacion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
	
		//this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.setVisible(this.tipovinculacionConstantesFunciones.mostraridTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jPanelidTipoVinculacion.setVisible(this.tipovinculacionConstantesFunciones.mostraridTipoVinculacion);
		//this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setVisible(this.tipovinculacionConstantesFunciones.mostrarid_empresaTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jPanelid_empresaTipoVinculacion.setVisible(this.tipovinculacionConstantesFunciones.mostrarid_empresaTipoVinculacion);
		//this.jInternalFrameDetalleFormTipoVinculacion.jTextFieldcodigoTipoVinculacion.setVisible(this.tipovinculacionConstantesFunciones.mostrarcodigoTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jPanelcodigoTipoVinculacion.setVisible(this.tipovinculacionConstantesFunciones.mostrarcodigoTipoVinculacion);
		//this.jInternalFrameDetalleFormTipoVinculacion.jTextAreanombreTipoVinculacion.setVisible(this.tipovinculacionConstantesFunciones.mostrarnombreTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jPanelnombreTipoVinculacion.setVisible(this.tipovinculacionConstantesFunciones.mostrarnombreTipoVinculacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoVinculacion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVinculacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVinculacion!=null) {
	
		this.jInternalFrameDetalleFormTipoVinculacion.jLabelidTipoVinculacion.setEnabled(this.tipovinculacionConstantesFunciones.activaridTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jComboBoxid_empresaTipoVinculacion.setEnabled(this.tipovinculacionConstantesFunciones.activarid_empresaTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jTextFieldcodigoTipoVinculacion.setEnabled(this.tipovinculacionConstantesFunciones.activarcodigoTipoVinculacion);
		this.jInternalFrameDetalleFormTipoVinculacion.jTextAreanombreTipoVinculacion.setEnabled(this.tipovinculacionConstantesFunciones.activarnombreTipoVinculacion);
		}
	}
	
		
}